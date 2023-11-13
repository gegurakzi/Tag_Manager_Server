package io.malachai.web.tagmanager.member.application.service;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import io.malachai.web.tagmanager.common.constant.Api;
import io.malachai.web.tagmanager.common.dto.MemberDto;
import io.malachai.web.tagmanager.common.dto.ProjectDto;
import io.malachai.web.tagmanager.member.application.response.ProjectListResponse;
import io.malachai.web.tagmanager.member.domain.MemberDtoMapping;
import io.malachai.web.tagmanager.member.domain.MemberRepository;
import io.malachai.web.tagmanager.member.presentation.controller.v1.MemberController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberController {

    private final MemberDtoMapping memberDtoMapping;
    private final MemberRepository memberRepository;

    private final RestTemplate rest;
    private final EurekaClient eureka;

    @Override
    public ResponseEntity<MemberDto> getMember(Long memberId) {
        return new ResponseEntity<>(
                memberDtoMapping.from(memberRepository.findById(memberId).orElseThrow()),
                HttpStatus.OK
        );
    }

    @Override
    public ResponseEntity<List<ProjectDto>> getProjects(Long memberId) {
        InstanceInfo gatewayInstance = eureka.getNextServerFromEureka("PROJECT", false);
        ProjectListResponse response = rest.getForObject(
                gatewayInstance
                        .getHomePageUrl() + "api/%s/project"
                        .formatted(Api.API_VERSION_V1),
                ProjectListResponse.class
        );
        if(response == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(response.projectList(), HttpStatus.OK);
    }

}

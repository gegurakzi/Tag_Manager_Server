package io.malachai.web.tagmanager.browser.application.orchestration;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import io.malachai.web.tagmanager.browser.application.request.MemberLoginRequest;
import io.malachai.web.tagmanager.browser.application.request.MemberRegisterRequest;
import io.malachai.web.tagmanager.browser.application.request.MemberUpdateRequest;
import io.malachai.web.tagmanager.browser.presentation.bff.MemberBff;
import io.malachai.web.tagmanager.common.constant.Api;
import io.malachai.web.tagmanager.common.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class MemberOrchestrator implements MemberBff {

    private static final Logger LOG = Logger.getLogger(MemberOrchestrator.class.getName());
    private static final String API_VERSION = "v1";

    private final RestTemplate rest;
    private final EurekaClient eureka;


    @Override
    public ResponseEntity<MemberDto> memberInfo(Long memberId) {
        InstanceInfo memberInstance = eureka.getNextServerFromEureka("MEMBER", false);
        MemberDto member = rest.getForObject(
                memberInstance.getHomePageUrl()+"api/"+ Api.API_VERSION_V1+"/member/"+memberId,
                MemberDto.class
        );
        return new ResponseEntity<>(member, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<MemberDto> memberDetail(Long memberId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> signUp(MemberRegisterRequest memberRegister) {
        return null;
    }

    @Override
    public ResponseEntity<Void> update(Long memberId, MemberUpdateRequest memberUpdate) {
        return null;
    }

    @Override
    public ResponseEntity<Void> signIn(MemberLoginRequest memberLogin) {
        return null;
    }
}

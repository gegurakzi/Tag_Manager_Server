package io.malachai.web.tagmanager.member.presentation.controller.v1;

import io.malachai.web.tagmanager.common.dto.MemberDto;
import io.malachai.web.tagmanager.common.dto.ProjectDto;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface MemberController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/member/{memberId}")
    ResponseEntity<MemberDto> getMember(@PathVariable Long memberId);

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/member/{memberId}/projects")
    ResponseEntity<List<ProjectDto>> getProjects(@PathVariable Long memberId);

}

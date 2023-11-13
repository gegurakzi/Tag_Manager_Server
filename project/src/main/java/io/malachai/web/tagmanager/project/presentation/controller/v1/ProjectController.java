package io.malachai.web.tagmanager.project.presentation.controller.v1;

import io.malachai.web.tagmanager.common.constant.Api;
import io.malachai.web.tagmanager.common.dto.ProjectDto;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public interface ProjectController {

    @RequestMapping(method = RequestMethod.GET, value = "/api/"+Api.API_VERSION_V1+"/project")
    ResponseEntity<List<ProjectDto>> getProjectsWithMemberId(@RequestParam("member") Long memberId);
    @RequestMapping(method = RequestMethod.GET, value = "/api/"+Api.API_VERSION_V1+"/project/{projectId}/manifest")
    ResponseEntity<String> getManifest(@PathVariable Long projectId);

    @RequestMapping(method = RequestMethod.POST, value = "/api/"+Api.API_VERSION_V1+"/project/{projectId}/manifest")
    ResponseEntity<Void> setManifest(@PathVariable Long projectId, @RequestBody JSONObject manifest);

}

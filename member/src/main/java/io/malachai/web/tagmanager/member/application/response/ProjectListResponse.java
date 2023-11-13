package io.malachai.web.tagmanager.member.application.response;

import io.malachai.web.tagmanager.common.dto.ProjectDto;

import java.util.List;

public record ProjectListResponse(
        List<ProjectDto> projectList
) {

}

package io.malachai.web.tagmanager.project.application.mapper;

import io.malachai.web.tagmanager.common.dto.ProjectDto;
import io.malachai.web.tagmanager.project.domain.Project;
import io.malachai.web.tagmanager.project.domain.ProjectDtoMapping;

public class SimpleProjectDtoMapping implements ProjectDtoMapping {

    @Override
    public ProjectDto from(Project project) {
        return new ProjectDto(
                project.getName(),
                project.getMemberId(),
                project.getManifest()
        );
    }
}

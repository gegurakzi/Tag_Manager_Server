package io.malachai.web.tagmanager.project.domain;

import io.malachai.web.tagmanager.common.dto.ProjectDto;
import org.springframework.stereotype.Component;

@Component
public interface ProjectDtoMapping {

    ProjectDto from(Project project);

}

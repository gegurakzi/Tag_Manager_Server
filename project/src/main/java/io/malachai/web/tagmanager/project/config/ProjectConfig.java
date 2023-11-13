package io.malachai.web.tagmanager.project.config;

import io.malachai.web.tagmanager.project.application.mapper.SimpleProjectDtoMapping;
import io.malachai.web.tagmanager.project.domain.ProjectDtoMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public ProjectDtoMapping getProjectDtoMapping() {
        return new SimpleProjectDtoMapping();
    }

}

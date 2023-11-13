package io.malachai.web.tagmanager.project.domain;

import io.malachai.web.tagmanager.project.presentation.controller.v1.ProjectController;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {

    void save(Project project);
    List<Project> findAll();
    Optional<Project> findProjectById(Long id);
    List<Project> findAllByMemberId(Long memberId);
}

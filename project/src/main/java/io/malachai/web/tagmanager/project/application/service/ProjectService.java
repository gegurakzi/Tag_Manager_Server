package io.malachai.web.tagmanager.project.application.service;

import io.malachai.web.tagmanager.common.dto.ProjectDto;
import io.malachai.web.tagmanager.project.domain.Project;
import io.malachai.web.tagmanager.project.domain.ProjectDtoMapping;
import io.malachai.web.tagmanager.project.domain.ProjectRepository;
import io.malachai.web.tagmanager.project.presentation.controller.v1.ProjectController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectService implements ProjectController {

    private final ProjectRepository projectRepository;
    private final ProjectDtoMapping projectDtoMapper;

    @Override
    public ResponseEntity<List<ProjectDto>> getProjectsWithMemberId(Long memberId) {
        List<Project> found = projectRepository.findAllByMemberId(memberId);
        List<ProjectDto> projectList = found.stream()
                .map(projectDtoMapper::from)
                .toList();
        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> getManifest(Long projectId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> setManifest(Long projectId, JSONObject manifest) {
        return null;
    }
}

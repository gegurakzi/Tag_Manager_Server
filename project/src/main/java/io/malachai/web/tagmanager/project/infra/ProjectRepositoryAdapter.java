package io.malachai.web.tagmanager.project.infra;

import io.malachai.web.tagmanager.project.domain.Project;
import io.malachai.web.tagmanager.project.domain.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProjectRepositoryAdapter implements ProjectRepository {

    private final ProjectJpaRepository jpa;

    @Override
    public void save(Project project) {
        jpa.save(project);
    }

    @Override
    public List<Project> findAll() {
        return jpa.findAll();
    }

    @Override
    public Optional<Project> findProjectById(Long id) {
        return jpa.findProjectById(id);
    }

    @Override
    public List<Project> findAllByMemberId(Long memberId) {
        return jpa.findAllByMemberId(memberId);
    }

}

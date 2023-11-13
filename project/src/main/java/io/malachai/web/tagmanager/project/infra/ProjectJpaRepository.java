package io.malachai.web.tagmanager.project.infra;

import io.malachai.web.tagmanager.project.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectJpaRepository extends JpaRepository<Project, Long> {

    Optional<Project> findProjectById(Long id);

    List<Project> findAllByMemberId(Long memberId);

}

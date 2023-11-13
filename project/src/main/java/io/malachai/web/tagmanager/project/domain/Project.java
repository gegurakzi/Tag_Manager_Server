package io.malachai.web.tagmanager.project.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Project {

    @Id
    Long id;
    String name;
    Long memberId;
    String manifest;

}

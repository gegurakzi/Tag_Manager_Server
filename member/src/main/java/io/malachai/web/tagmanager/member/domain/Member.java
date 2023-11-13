package io.malachai.web.tagmanager.member.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member {

    @Id
    private Long id;
    private String name;
    private String email;

    @Builder
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

}

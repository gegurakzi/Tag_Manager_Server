package io.malachai.web.tagmanager.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByEmail(String email);

}

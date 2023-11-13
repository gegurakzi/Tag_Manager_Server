package io.malachai.web.tagmanager.member.infra;

import io.malachai.web.tagmanager.member.domain.Member;
import io.malachai.web.tagmanager.member.domain.MemberRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberJpaRepository extends JpaRepository<Member, Long> {

    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByEmail(String email);

}

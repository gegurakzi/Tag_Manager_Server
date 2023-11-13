package io.malachai.web.tagmanager.member.infra;

import io.malachai.web.tagmanager.member.domain.Member;
import io.malachai.web.tagmanager.member.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryAdapter implements MemberRepository {

    private final MemberJpaRepository jpa;

    @Override
    public Member save(Member member) {
        return jpa.save(member);
    }

    @Override
    public Optional<Member> findById(Long id) {
        return jpa.findById(id);
    }

    @Override
    public Optional<Member> findByName(String name) {
        return jpa.findByName(name);
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return Optional.empty();
    }
}

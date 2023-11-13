package io.malachai.web.tagmanager.member.application.mapper;

import io.malachai.web.tagmanager.common.dto.MemberDto;
import io.malachai.web.tagmanager.member.domain.Member;
import io.malachai.web.tagmanager.member.domain.MemberDtoMapping;
import org.springframework.stereotype.Component;

public class SimpleMemberDtoMapping implements MemberDtoMapping {


    @Override
    public MemberDto from(Member member) {
        return new MemberDto(
                member.getName(),
                member.getEmail()
        );
    }
}

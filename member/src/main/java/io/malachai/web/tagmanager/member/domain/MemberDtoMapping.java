package io.malachai.web.tagmanager.member.domain;

import io.malachai.web.tagmanager.common.dto.MemberDto;
import io.malachai.web.tagmanager.member.domain.Member;
import org.springframework.stereotype.Component;

@Component
public interface MemberDtoMapping {

    MemberDto from(Member member);

}

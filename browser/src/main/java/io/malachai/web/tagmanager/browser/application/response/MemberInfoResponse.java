package io.malachai.web.tagmanager.browser.application.response;

import io.malachai.web.tagmanager.common.dto.MemberDto;

public record MemberInfoResponse(
    String name,
    String email
) {
    public MemberInfoResponse of(MemberDto member) {
        return new MemberInfoResponse(
                member.name(),
                member.email()
        );
    }
}

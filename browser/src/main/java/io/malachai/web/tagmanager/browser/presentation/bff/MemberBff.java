package io.malachai.web.tagmanager.browser.presentation.bff;

import io.malachai.web.tagmanager.browser.application.request.MemberLoginRequest;
import io.malachai.web.tagmanager.browser.application.request.MemberRegisterRequest;
import io.malachai.web.tagmanager.browser.application.request.MemberUpdateRequest;
import io.malachai.web.tagmanager.common.dto.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public interface MemberBff {

    @RequestMapping(method = RequestMethod.GET, value = "/api/member/{memberId}")
    ResponseEntity<MemberDto> memberInfo(@PathVariable Long memberId);

    @RequestMapping(method = RequestMethod.GET, value = "/api/member/{memberId}/detail")
    ResponseEntity<MemberDto> memberDetail(@PathVariable Long memberId);

    @RequestMapping(method = RequestMethod.POST, value = "/api/member/signup")
    ResponseEntity<Void> signUp(@RequestBody MemberRegisterRequest memberRegister);

    @RequestMapping(method = RequestMethod.PUT, value = "/api/member/{memberId}")
    ResponseEntity<Void> update(@PathVariable Long memberId, @RequestBody MemberUpdateRequest memberUpdate);

    @RequestMapping(method = RequestMethod.POST, value = "/api/member/signin")
    ResponseEntity<Void> signIn(@RequestBody MemberLoginRequest memberLogin);

}

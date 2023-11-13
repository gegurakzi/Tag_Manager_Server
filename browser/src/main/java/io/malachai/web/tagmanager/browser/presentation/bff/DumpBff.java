package io.malachai.web.tagmanager.browser.presentation.bff;

import org.springframework.web.bind.annotation.*;

@RestController
public interface DumpBff {
    @RequestMapping(method = RequestMethod.POST, value = "/api/dump")
    @CrossOrigin(origins = "*")
    void dump(@RequestBody String rawDump);
}

package io.malachai.web.tagmanager.dump.controller.v1;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONTokener;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public interface DumpController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/dump")
    ResponseEntity<?> dump(@RequestBody String rawDump) throws JSONException;

}

package io.malachai.web.tagmanager.browser.controller.v1;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONTokener;
import org.springframework.web.bind.annotation.*;

@RestController
public class DumpController {

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/dump")
    @CrossOrigin(origins = "*")
    public void dump(@RequestBody String rawDump) throws JSONException {
        System.out.println(rawDump);
        JSONTokener tokener = new JSONTokener(rawDump);
        JSONObject dump = new JSONObject(tokener);

    }

}

package io.malachai.web.tagmanager.dump.repository;

import io.malachai.web.tagmanager.dump.controller.v1.DumpController;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.boot.configurationprocessor.json.JSONTokener;
import org.springframework.data.cassandra.core.cql.CqlTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
@RequiredArgsConstructor
public class DumpRepository implements DumpController {
    private static final Logger LOG = Logger.getLogger(DumpRepository.class.getName());

    private final CqlTemplate cqlTemplate;

    @Override
    public ResponseEntity<?> dump(String rawDump) throws JSONException {
        System.out.println(rawDump);
        JSONTokener tokener = new JSONTokener(rawDump);
        JSONObject dump = new JSONObject(tokener);

        //cqlTemplate.execute("");

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}

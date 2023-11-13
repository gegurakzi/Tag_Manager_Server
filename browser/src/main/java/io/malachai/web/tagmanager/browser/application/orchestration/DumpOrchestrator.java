package io.malachai.web.tagmanager.browser.application.orchestration;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import io.malachai.web.tagmanager.browser.presentation.bff.DumpBff;
import io.malachai.web.tagmanager.common.constant.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@Service
@RequiredArgsConstructor
public class DumpOrchestrator implements DumpBff {

    private static final Logger LOG = Logger.getLogger(DumpOrchestrator.class.getName());
    private static final String API_VERSION = "v1";

    private final RestTemplate rest;
    private final EurekaClient eureka;

    @Override
    public void dump(String rawDump){
        try {
            InstanceInfo gatewayInstance = eureka.getNextServerFromEureka("DUMP", false);
            ResponseEntity<Void> response = rest.postForEntity(gatewayInstance.getHomePageUrl() + "api/%s/dump".formatted(Api.API_VERSION_V1), rawDump, Void.class);
            LOG.info(response.getStatusCode().toString());
        } catch (RestClientException e) {
            LOG.warning(e.getMessage());
        }
    }
}

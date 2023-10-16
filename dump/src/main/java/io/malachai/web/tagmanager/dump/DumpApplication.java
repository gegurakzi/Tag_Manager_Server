package io.malachai.web.tagmanager.dump;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DumpApplication {
    public static void main(String[] args) {
        SpringApplication.run(DumpApplication.class, args);
    }
}

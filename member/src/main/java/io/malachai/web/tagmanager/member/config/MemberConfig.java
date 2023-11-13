package io.malachai.web.tagmanager.member.config;

import io.malachai.web.tagmanager.member.application.mapper.SimpleMemberDtoMapping;
import io.malachai.web.tagmanager.member.domain.MemberDtoMapping;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MemberConfig {

    @Bean
    RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    MemberDtoMapping getMemberDtoMapping() {
        return new SimpleMemberDtoMapping();
    }
}

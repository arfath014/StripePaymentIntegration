
package com.example.stripepaymentintegration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class SahmkConfig {

    @Value("${sahmk.base-url}")
    private String baseUrl;

    @Value("${sahmk.api-key}")
    private String apiKey;

    @Bean
    public RestClient sahmkRestClient() {
        return RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeader("X-API-Key", apiKey)
                .build();
    }
}


package com.example.stripepaymentintegration.service;

import com.example.stripepaymentintegration.dto.SahmkQuoteResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class SahmkService {

    private final RestClient sahmkRestClient;

    public SahmkService(RestClient sahmkRestClient) {
        this.sahmkRestClient = sahmkRestClient;
    }

    public SahmkQuoteResponse getQuote(String symbol) {

        return sahmkRestClient.get()
                .uri("/quote/{symbol}/", symbol)
                .retrieve()
                .body(SahmkQuoteResponse.class);
    }
}

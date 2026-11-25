
package com.example.stripepaymentintegration.controller;

import com.example.stripepaymentintegration.dto.SahmkQuoteResponse;
import com.example.stripepaymentintegration.service.SahmkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sahmk")
public class SahmkController {

    private final SahmkService sahmkService;

    public SahmkController(SahmkService sahmkService) {
        this.sahmkService = sahmkService;
    }

    @GetMapping("/quote/{symbol}")
    public ResponseEntity<SahmkQuoteResponse> getQuote(
            @PathVariable String symbol) {

        SahmkQuoteResponse response = sahmkService.getQuote(symbol);

        return ResponseEntity.ok(response);
    }
}

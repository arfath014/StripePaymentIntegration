
package com.example.stripepaymentintegration.dto;

import java.time.OffsetDateTime;

public record SahmkQuoteResponse(
        String symbol,
        String name_en,
        Double price,
        Double change_percent,
        Long volume,
        OffsetDateTime updated_at,
        Boolean is_delayed
) {
}

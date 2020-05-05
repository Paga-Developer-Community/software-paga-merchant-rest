package com.paga.merchant.rest.client.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetForeignExchangeRequest {

    private String baseCurrency;

    private String foreignCurrency;
}

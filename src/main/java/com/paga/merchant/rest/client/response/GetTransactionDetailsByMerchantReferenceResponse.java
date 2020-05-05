package com.paga.merchant.rest.client.response;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetTransactionDetailsByMerchantReferenceResponse implements Serializable {

    private Double amount;

    private String dateTimeUTC;

    private String errorMessage;

    private String channel;

    private Double foreignCurrencyAmount;

    private String transactionId;

    private String responseCode;

    private String byAgent;

    private String transactionType;

    private String referenceNumber;

    private Double exchangeRate;

    private String invoiceNumber;

    private String currency;

    private String merchantReference;

    private String status;

}

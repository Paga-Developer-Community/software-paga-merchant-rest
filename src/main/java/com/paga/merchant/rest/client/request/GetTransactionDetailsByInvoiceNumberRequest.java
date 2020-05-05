package com.paga.merchant.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetTransactionDetailsByInvoiceNumberRequest {

    private String invoiceNumber;
}

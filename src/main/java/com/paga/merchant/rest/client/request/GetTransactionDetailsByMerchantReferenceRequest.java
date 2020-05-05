package com.paga.merchant.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class GetTransactionDetailsByMerchantReferenceRequest implements Serializable {

    private String merchantReference;
}

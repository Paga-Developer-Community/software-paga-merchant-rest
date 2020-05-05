package com.paga.merchant.rest.client.request;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RefundPaymentRequest  {
	
    private String referenceNumber;
   
    private boolean fullRefund;
    
    private Boolean includesCustomerFee;
    
    private Double refundAmount;
    
    private String currency;
    
    private String reason;
	
    private Boolean refundToAgent;
    
    private String customerPhoneNumber;
    


}

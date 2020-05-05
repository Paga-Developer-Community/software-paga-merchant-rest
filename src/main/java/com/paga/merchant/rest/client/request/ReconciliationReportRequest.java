package com.paga.merchant.rest.client.request;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class ReconciliationReportRequest  {

    private Date periodStartDateTimeUTC;
    
    private Date periodEndDateTimeUTC;


	

}

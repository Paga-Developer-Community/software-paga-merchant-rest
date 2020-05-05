package com.paga.merchant.rest.client.response;

import java.util.Date;

public class GetProcessDetailsResponse {

    private String processCode;

    private String status;

    private String customerAccount;

    private String dateTimeUTC;

    private String processType;

    private Double amount;

    private int responseCode;

    private String errorMessage;

    public GetProcessDetailsResponse() {
    }

    public GetProcessDetailsResponse(String processCode, String status, String customerAccount, String dateTimeUTC,
                                     String processType, Double amount, int responseCode, String errorMessage) {
        this.processCode = processCode;
        this.status = status;
        this.customerAccount = customerAccount;
        this.dateTimeUTC = dateTimeUTC;
        this.processType = processType;
        this.amount = amount;
        this.responseCode = responseCode;
        this.errorMessage = errorMessage;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(String customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getDateTimeUTC() {
        return dateTimeUTC;
    }

    public void setDateTimeUTC(String dateTimeUTC) {
        this.dateTimeUTC = dateTimeUTC;
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "GetProcessDetailsResponse{" +
                "processCode='" + processCode + '\'' +
                ", status='" + status + '\'' +
                ", customerAccount='" + customerAccount + '\'' +
                ", dateTimeUTC='" + dateTimeUTC + '\'' +
                ", processType='" + processType + '\'' +
                ", amount=" + amount +
                ", responseCode=" + responseCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}

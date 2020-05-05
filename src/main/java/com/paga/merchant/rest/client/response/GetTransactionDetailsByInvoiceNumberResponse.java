package com.paga.merchant.rest.client.response;

import java.util.Date;

public class GetTransactionDetailsByInvoiceNumberResponse {

    private String invoiceNumber;

    private String referenceNumber;

    private String status;

    private String merchantReference;

    private String dateTimeUTC;

    private String transactionType;

    private Double amount;

    private String transactionId;

    private String channel;

    private Boolean byAgent;

    private String currency;

    private Double exchangeRate;

    private String errorMessage;

    private int responseCode;

    private Double foreignCurrencyAmount;

    public GetTransactionDetailsByInvoiceNumberResponse() {
    }

    public GetTransactionDetailsByInvoiceNumberResponse(String invoiceNumber, String referenceNumber, String status,
                                                        String merchantReference, String dateTimeUTC, String transactionType,
                                                        Double amount, String transactionId, String channel, Boolean byAgent,
                                                        String currency, Double exchangeRate, String errorMessage,
                                                        int responseCode, Double foreignCurrencyAmount) {
        this.invoiceNumber = invoiceNumber;
        this.referenceNumber = referenceNumber;
        this.status = status;
        this.merchantReference = merchantReference;
        this.dateTimeUTC = dateTimeUTC;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionId = transactionId;
        this.channel = channel;
        this.byAgent = byAgent;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.errorMessage = errorMessage;
        this.responseCode = responseCode;
        this.foreignCurrencyAmount = foreignCurrencyAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMerchantReference() {
        return merchantReference;
    }

    public void setMerchantReference(String merchantReference) {
        this.merchantReference = merchantReference;
    }

    public String getDateTimeUTC() {
        return dateTimeUTC;
    }

    public void setDateTimeUTC(String dateTimeUTC) {
        this.dateTimeUTC = dateTimeUTC;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Boolean getByAgent() {
        return byAgent;
    }

    public void setByAgent(Boolean byAgent) {
        this.byAgent = byAgent;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public Double getForeignCurrencyAmount() {
        return foreignCurrencyAmount;
    }

    public void setForeignCurrencyAmount(Double foreignCurrencyAmount) {
        this.foreignCurrencyAmount = foreignCurrencyAmount;
    }


    @Override
    public String toString() {
        return "GetTransactionDetailsByInvoiceNumberResponse{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", status='" + status + '\'' +
                ", merchantReference='" + merchantReference + '\'' +
                ", dateTimeUTC='" + dateTimeUTC + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                ", channel='" + channel + '\'' +
                ", byAgent=" + byAgent +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", errorMessage='" + errorMessage + '\'' +
                ", responseCode=" + responseCode +
                ", foreignCurrencyAmount=" + foreignCurrencyAmount +
                '}';
    }
}

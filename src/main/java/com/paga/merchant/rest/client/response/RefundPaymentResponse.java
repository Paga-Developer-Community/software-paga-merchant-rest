package com.paga.merchant.rest.client.response;

public class RefundPaymentResponse {

    private String originalReferenceNumber;
    private String refundTransactionId;
    private double refundAmount;
    private String currency;
    private Double exchangeRate;
    private String errorMessage;
    private int responseCode;

    public RefundPaymentResponse() {
    }

    public RefundPaymentResponse(String originalReferenceNumber, String refundTransactionId, double refundAmount,
                                 String currency, Double exchangeRate, String errorMessage, int responseCode) {
        this.originalReferenceNumber = originalReferenceNumber;
        this.refundTransactionId = refundTransactionId;
        this.refundAmount = refundAmount;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.errorMessage = errorMessage;
        this.responseCode = responseCode;
    }

    public String getOriginalReferenceNumber() {
        return originalReferenceNumber;
    }

    public void setOriginalReferenceNumber(String originalReferenceNumber) {
        this.originalReferenceNumber = originalReferenceNumber;
    }

    public String getRefundTransactionId() {
        return refundTransactionId;
    }

    public void setRefundTransactionId(String refundTransactionId) {
        this.refundTransactionId = refundTransactionId;
    }

    public double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(double refundAmount) {
        this.refundAmount = refundAmount;
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

    public void setRespponeCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String toString() {
        return "RefundPaymentResponse{" +
                "originalReferenceNumber='" + originalReferenceNumber + '\'' +
                ", refundTransactionId='" + refundTransactionId + '\'' +
                ", refundAmount=" + refundAmount +
                ", currency='" + currency + '\'' +
                ", exchangeRate=" + exchangeRate +
                ", errorMessage='" + errorMessage + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }
}

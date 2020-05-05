package com.paga.merchant.rest.client.response;

public class GetForeignExchangeRateResponse {

    private String errorMessage;

    private int responseCode;

    private String baseCurrency;

    private String foreignCurrency;

    private double buyRate;

    private double sellRate;

    public GetForeignExchangeRateResponse() {
    }

    public GetForeignExchangeRateResponse(String errorMessage, int responseCode, String baseCurrency,
                                          String foreignCurrency, double buyRate, double sellRate) {
        this.errorMessage = errorMessage;
        this.responseCode = responseCode;
        this.baseCurrency = baseCurrency;
        this.foreignCurrency = foreignCurrency;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
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

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getForeignCurrency() {
        return foreignCurrency;
    }

    public void setForeignCurrency(String foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }

    public double getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(double buyRate) {
        this.buyRate = buyRate;
    }

    public double getSellRate() {
        return sellRate;
    }

    public void setSellRate(double sellRate) {
        this.sellRate = sellRate;
    }

    @Override
    public String toString() {
        return "GetForeignExchangeRateResponse{" +
                "errorMessage='" + errorMessage + '\'' +
                ", responseCode=" + responseCode +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", foreignCurrency='" + foreignCurrency + '\'' +
                ", buyRate=" + buyRate +
                ", sellRate=" + sellRate +
                '}';
    }
}

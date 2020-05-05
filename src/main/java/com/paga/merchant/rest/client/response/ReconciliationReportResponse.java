package com.paga.merchant.rest.client.response;

import java.util.ArrayList;
import java.util.List;

public class ReconciliationReportResponse {

    private List<ReconciliationItem> reconciliationItems = new ArrayList<ReconciliationItem>();

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

    private String errorMessage;

    private int responseCode;

    public ReconciliationReportResponse() {
    }

    public ReconciliationReportResponse(List<ReconciliationItem> reconciliationItems, String errorMessage, int responseCode) {
        this.reconciliationItems = reconciliationItems;
        this.errorMessage = errorMessage;
        this.responseCode = responseCode;
    }

    public List<ReconciliationItem> getReconciliationItems() {
        return reconciliationItems;
    }

    public void setReconciliationItems(List<ReconciliationItem> reconciliationItems) {
        this.reconciliationItems = reconciliationItems;
    }

    @Override
    public String toString() {
        return "ReconciliationReportResponse{" +
                "reconciliationItems=" + reconciliationItems +
                ", errorMessage='" + errorMessage + '\'' +
                ", responseCode=" + responseCode +
                '}';
    }
}

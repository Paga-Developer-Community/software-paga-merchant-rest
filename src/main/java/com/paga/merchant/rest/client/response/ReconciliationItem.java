package com.paga.merchant.rest.client.response;

import java.util.Date;

public class ReconciliationItem {

    private String status;
    private String severity;
    private Date transactionDatetimeUTC;
    private double amount;
    private String pagaProcessCode;
    private String referenceNumber;
    private String description;

    public ReconciliationItem() {
    }

    public ReconciliationItem(String status, String severity, Date transactionDatetimeUTC, double amount,
                              String pagaProcessCode, String referenceNumber, String description) {
        this.status = status;
        this.severity = severity;
        this.transactionDatetimeUTC = transactionDatetimeUTC;
        this.amount = amount;
        this.pagaProcessCode = pagaProcessCode;
        this.referenceNumber = referenceNumber;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Date getTransactionDatetimeUTC() {
        return transactionDatetimeUTC;
    }

    public void setTransactionDatetimeUTC(Date transactionDatetimeUTC) {
        this.transactionDatetimeUTC = transactionDatetimeUTC;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPagaProcessCode() {
        return pagaProcessCode;
    }

    public void setPagaProcessCode(String pagaProcessCode) {
        this.pagaProcessCode = pagaProcessCode;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ReconciliationItem{" +
                "status='" + status + '\'' +
                ", severity='" + severity + '\'' +
                ", transactionDatetimeUTC=" + transactionDatetimeUTC +
                ", amount=" + amount +
                ", pagaProcessCode='" + pagaProcessCode + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

package com.paga.merchant.rest.client.constant;


public class Definitions {

    public Definitions() {

    }

    private final static String TEST_BASE_API_ENDPOINT = "https://beta.mypaga.com/paga-webservices/merchant-rest";
    private final static String LIVE_BASE_API_ENDPOINT = "https://www.mypaga.com/paga-webservices/merchant-rest";

    public static final String GET_TRANSACTION_DETAILS = "/secured/getTransactionDetails";
    public static final String GET_TRANSACTION_DETAILS_BY_INVOICE_NUMBER = "/secured/getTransactionDetailsByInvoiceNumber";
    public static final String GET_PROCESS_DETAILS = "/secured/getProcessDetails";
    public static final String GET_FOREIGN_EXCHANGE_RATE = "/secured/getForeignExchangeRate";
    public static final String GET_RECONCILIATION_REPORT = "/secured/reconciliationReport";
    public static final String REFUND_BILL_PAYMENT = "/secured/refundBillPay";
    public static final String GET_TRANSACTION_DETAILS_BY_MERCHANT_REFERENCE = "/secured/getTransactionDetailsByMerchantReference";




    public static String getBaseUrl(boolean test){
       if(test){
           return TEST_BASE_API_ENDPOINT;
       }else{
           return LIVE_BASE_API_ENDPOINT;
       }
    }




}

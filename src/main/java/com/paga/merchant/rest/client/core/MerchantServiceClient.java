package com.paga.merchant.rest.client.core;


import com.google.gson.Gson;
import com.paga.merchant.rest.client.constant.Definitions;
import com.paga.merchant.rest.client.request.*;
import com.paga.merchant.rest.client.response.*;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;



public class MerchantServiceClient {


    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private ApiConnection apiConnection;

    private String principal;
    private String apiKey;
    private String credential; // Merchant password
    private boolean test;

    public MerchantServiceClient(String principal, String apiKey, String credential, boolean test) {
        this.principal = principal;
        this.apiKey = apiKey;
        this.credential = credential;
        this.test = test;
    }

    public static class Builder{
        private String principal;
        private String apiKey;
        private Boolean test;
        private String credential;


        public Builder(){}

        public Builder setCredential(String credential) {
            this.credential = credential;
            return this;
        }

        public Builder setPrincipal(String principal) {
            this.principal = principal;
            return this;
        }

        public Builder setTest(Boolean test) {
            this.test = test;
            return this;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }


        public MerchantServiceClient build(){
            return new MerchantServiceClient(principal,apiKey,credential,test);
        }
    }


    /**
     * This service allows the merchant to verify the status and details of an executed process or
     * to determine if a transaction was indeed executed on the system using the pre-shared transaction reference number.
     * The transaction reference number used is unique across the platform,
     * so merchant aggregators checking for transaction status across multiple users should use this method.
     *
     * @param getTransactionDetailsRequest
     *
     * @return GetTransactionDetailResponse
     */
    public GetTransactionDetailResponse getTransactionDetails(GetTransactionDetailsRequest getTransactionDetailsRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();
        try {
            obj.put("referenceNumber", getTransactionDetailsRequest.getReferenceNumber());
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getTransactionDetailsRequest.getReferenceNumber());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder, Definitions.getBaseUrl(test)+Definitions.GET_TRANSACTION_DETAILS);

        return gson.fromJson(String.valueOf(response), GetTransactionDetailResponse.class);
    }

    /**
     * This service allows the merchant to verify the status and details of an executed process or
     * to determine if a transaction was indeed executed on the system using the pre-shared transaction invoice number.
     * The invoice number used is unique across the platform,
     * so merchant aggregators checking for transactions status across multiple users should use this method.
     *
     * @param getTransactionDetailsByInvoiceNumberRequest
     *
     * @return GetTransactionDetailsByInvoiceNumberResponse
     */
    public GetTransactionDetailsByInvoiceNumberResponse getTransactionDetailsByInvoiceNumber(GetTransactionDetailsByInvoiceNumberRequest
                                                                                                     getTransactionDetailsByInvoiceNumberRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();
        try {
            obj.put("invoiceNumber", getTransactionDetailsByInvoiceNumberRequest.getInvoiceNumber());
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getTransactionDetailsByInvoiceNumberRequest.getInvoiceNumber());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test)+Definitions.GET_TRANSACTION_DETAILS_BY_INVOICE_NUMBER);

        return gson.fromJson(String.valueOf(response), GetTransactionDetailsByInvoiceNumberResponse.class);
    }


    /**
     * \This service allows the merchant to verify the status and details of an executed process or
     * to determine if a process was indeed executed on the system using the pre-shared process code.
     * The process code used is unique per merchant ,
     * so merchant aggregators checking for transactions status across multiple users should use the getTransactionDetails method.
     * @param getProcessDetailsRequest
     * @return GetProcessDetailsResponse
     */
    public GetProcessDetailsResponse getProcessDetails(GetProcessDetailsRequest getProcessDetailsRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();
        try {
            obj.put("processCode", getProcessDetailsRequest.getProcessCode());
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getProcessDetailsRequest.getProcessCode());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test)+Definitions.GET_PROCESS_DETAILS);

        return gson.fromJson(String.valueOf(response), GetProcessDetailsResponse.class);
    }

    /**
     * This service provides the mechanism to determine the exchange rate , of the majority of currencies.
     * an exchange rate, of the majority of currencies
     * @param getForeignExchangeRequest
     * @return GetForeignExchangeRateResponse
     */
    public GetForeignExchangeRateResponse getForeignExchange(GetForeignExchangeRequest getForeignExchangeRequest) {

        Gson gson = new Gson();

        JSONObject obj = new JSONObject();
        try {
            obj.put("baseCurrency", getForeignExchangeRequest.getBaseCurrency());
            obj.put("foreignCurrency", getForeignExchangeRequest.getForeignCurrency());
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getForeignExchangeRequest.getBaseCurrency());
        sBuilder.append(getForeignExchangeRequest.getForeignCurrency());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test)+Definitions.GET_FOREIGN_EXCHANGE_RATE);

        return gson.fromJson(String.valueOf(response), GetForeignExchangeRateResponse.class);
    }

    /**
     * This service provides the mechanism for Merchant to retrieve reconciled reports,
     * on the date range provided containing list of processes and transactions.
     * @param reconciliationReportRequest
     * @return ReconciliationReportResponse
     */
    public ReconciliationReportResponse getReconcilationReport(ReconciliationReportRequest reconciliationReportRequest) {
        Gson gson = new Gson();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String startDate = simpleDateFormat.format(reconciliationReportRequest.getPeriodStartDateTimeUTC());
        String endDate = simpleDateFormat.format(reconciliationReportRequest.getPeriodEndDateTimeUTC());

        System.out.println("end date ::"+endDate);

        JSONObject obj = new JSONObject();
        try {
            obj.put("periodStartDateTimeUTC", startDate);
            obj.put("periodEndDateTimeUTC", endDate);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(endDate);
        sBuilder.append(startDate);
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test)+Definitions.GET_RECONCILIATION_REPORT);

        return gson.fromJson(String.valueOf(response), ReconciliationReportResponse.class);
    }


    /**
     * This service allows merchants to fully or partially refund bill payment previously made to them by a customer.
     * The refund specified may be in full or a partial amount. Full refunds may include or exclude customer fee.
     * @param refundPaymentRequest
     * @return RefundPaymentResponse
     */
    public RefundPaymentResponse refundBillPay(RefundPaymentRequest refundPaymentRequest) {

        Gson gson =  new Gson();
        JSONObject obj = new JSONObject();

        try {
            obj.put("referenceNumber", refundPaymentRequest.getReferenceNumber());
            obj.put("includesCustomerFee", refundPaymentRequest.getIncludesCustomerFee());
            obj.put("fullRefund", refundPaymentRequest.isFullRefund());
            obj.put("refundAmount", String.valueOf(refundPaymentRequest.getRefundAmount()));
            obj.put("currencyCode", refundPaymentRequest.getCurrency());
            obj.put("reason", refundPaymentRequest.getReason());
            obj.put("customerPhoneNumber", refundPaymentRequest.getCustomerPhoneNumber());

        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(refundPaymentRequest.getReferenceNumber()); //base currency
        sBuilder.append(refundPaymentRequest.getRefundAmount()); //foriign currecncy
        sBuilder.append(refundPaymentRequest.getCustomerPhoneNumber()); //phone number
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test)+Definitions.REFUND_BILL_PAYMENT);

        return gson.fromJson(String.valueOf(response), RefundPaymentResponse.class);

    }

    public GetTransactionDetailsByMerchantReferenceResponse
    getTransactionDetailByMerchantReference(GetTransactionDetailsByMerchantReferenceRequest getTransactionDetailsByMerchantReferenceRequest){
        Gson gson = new Gson();

        JSONObject obj = new JSONObject();
        try {
            obj.put("merchantReference", getTransactionDetailsByMerchantReferenceRequest.getMerchantReference());
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(getTransactionDetailsByMerchantReferenceRequest.getMerchantReference());
        sBuilder.append(this.apiKey);

        RequestBody body = RequestBody.create(JSON, obj.toString());

        JSONObject response = getApiResponse(body, sBuilder,
                Definitions.getBaseUrl(test)+Definitions.GET_TRANSACTION_DETAILS_BY_MERCHANT_REFERENCE);

        return gson.fromJson(String.valueOf(response),GetTransactionDetailsByMerchantReferenceResponse.class);
    }

    private JSONObject getApiResponse(RequestBody body, StringBuilder sBuilder, String requestPath) {
        System.out.println(requestPath);
        this.apiConnection = new ApiConnection();
        return this.apiConnection.connectAndPost(body, sBuilder, requestPath, this.principal, this.credential);
    }




}

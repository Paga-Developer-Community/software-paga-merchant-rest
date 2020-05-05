package com.paga.merchant.rest.client.core;

import com.paga.merchant.rest.client.util.UtilService;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONObject;




public class ApiConnection {

    public JSONObject connectAndPost(RequestBody requestBody, StringBuilder pattern, String requestPath,
                                     String principal, String credentials) {
        UtilService utilService = new UtilService();
        String respString = "";
        JSONObject jsonObject = null;
        String hash = utilService.hashComputeHash(pattern);
        Request request = buildRequest(requestPath, hash, requestBody, principal, credentials);
        OkHttpClient client = new OkHttpClient();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            respString = response.body().string().trim();

            jsonObject = new JSONObject(respString);

            System.out.println(respString);

            return jsonObject;
        } catch (Exception e) {
            jsonObject = new JSONObject();
            assert response != null;
            jsonObject.put("response", response.message());
            jsonObject.put("responseCode", response.code());
        } finally {
            return jsonObject;
        }

    }

    private Request buildRequest(String requestPath, String hash, RequestBody body, String principal, String credentials) {

        return new Request.Builder()
                .url(requestPath)
                .header("Content-Type", "application/json")
                .header("principal", principal)
                .header("credentials", credentials)
                .header("Accept", "application/json")
                .header("hash", hash)
                .post(body)
                .build();

    }


}

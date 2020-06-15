package com.huaweicloud.sdk.core.impl;

import com.huaweicloud.sdk.core.Constants;
import com.huaweicloud.sdk.core.HttpListener;
import com.huaweicloud.sdk.core.http.HttpConfig;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class DefaultHttpListener implements Interceptor {
    private List<HttpListener> httpListeners;

    public DefaultHttpListener(HttpConfig httpConfig) {
        this.httpListeners = httpConfig.getHttpListeners();
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (Objects.nonNull(httpListeners)) {
            printRequestRawLog(request);
        }
        Response response = chain.proceed(request);

        if (Objects.nonNull(httpListeners)) {
            return printResponseRawLog(response);
        }

        return response;
    }

    public void printRequestRawLog(Request request) throws IOException {

        String reqBody = null;
        if (Objects.nonNull(request.body()) && Objects.nonNull(request.body().contentType())
                && (request.body().contentType().toString().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)
                || request.body().contentType().toString().startsWith(Constants.MEDIATYPE.TEXT))) {
            Buffer buffer = new Buffer();
            request.body().writeTo(buffer);
            reqBody = buffer.readUtf8();
        } else if (Objects.nonNull(request.body()) && Objects.nonNull(request.body().contentType())) {
            reqBody = request.body().contentLength() > 0 ? "******" : null;
        } else {
            reqBody = null;
        }

        String finalReqBody = reqBody;
        HttpListener.RequestListener requestListener = new HttpListener.RequestListener() {

            @Override
            public String httpMethod() {
                return request.method();
            }

            @Override
            public String uri() {
                return request.url().toString();
            }

            @Override
            public Map<String, List<String>> headers() {
                return DefaultHttpUtils.headersToMap(request.headers());
            }

            @Override
            public Optional<String> body() {
                return Objects.isNull(finalReqBody) ? Optional.empty() : Optional.of(finalReqBody);
            }
        };
        this.httpListeners.forEach(httpListener -> httpListener.preRequest(requestListener));

    }

    public Response printResponseRawLog(Response response) throws IOException {

        Request request = response.request();
        Response.Builder responseBuilder = response.newBuilder();
        String respBody = null;
        if (Objects.nonNull(response.body()) && Objects.nonNull(response.body().contentType())
                && response.body().contentType().toString().startsWith(Constants.MEDIATYPE.APPLICATION_JSON)) {
            respBody = response.body().string();
            responseBuilder.body(ResponseBody.create(response.body().contentType(), respBody));
        } else if (Objects.nonNull(response.body()) && Objects.nonNull(response.body().contentType())
                && response.body().contentType().toString().equals(Constants.MEDIATYPE.APPLICATION_OCTET_STREAM)) {
            respBody = response.body().contentLength() > 0 ? "******" : null;
        } else {
            respBody = null;
        }

        String finalRespBody = respBody;
        HttpListener.ResponseListener responseListener = new HttpListener.ResponseListener() {
            @Override
            public String httpMethod() {
                return request.method();
            }

            @Override
            public String uri() {
                return request.url().toString();
            }

            @Override
            public Map<String, List<String>> headers() {
                return DefaultHttpUtils.headersToMap(response.headers());
            }

            @Override
            public Optional<String> body() {
                return Objects.isNull(finalRespBody) ? Optional.empty() : Optional.of(finalRespBody);
            }

            @Override
            public int statusCode() {
                return response.code();
            }
        };
        this.httpListeners.forEach(httpListener -> httpListener.postResponse(responseListener));
        return responseBuilder.build();
    }
}

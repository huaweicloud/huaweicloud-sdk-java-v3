package com.huaweicloud.sdk.core;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

public interface HttpListener {

    interface RequestListener {
        String httpMethod();

        String uri();

        Map<String, List<String>> headers();

        Optional<String> body();
    }

    interface ResponseListener {
        String httpMethod();

        String uri();

        Map<String, List<String>> headers();

        Optional<String> body();

        int statusCode();
    }

    default void preRequest(RequestListener requestListener) {
    }

    default void postResponse(ResponseListener responseListener) {
    }

    static HttpListener forRequestListener(Consumer<RequestListener> func) {
        return new HttpListener() {
            @Override
            public void preRequest(RequestListener requestListener) {
                func.accept(requestListener);
            }
        };
    }

    static HttpListener forResponseListener(Consumer<ResponseListener> func) {
        return new HttpListener() {
            @Override
            public void postResponse(ResponseListener requestListener) {
                func.accept(requestListener);
            }
        };
    }
}

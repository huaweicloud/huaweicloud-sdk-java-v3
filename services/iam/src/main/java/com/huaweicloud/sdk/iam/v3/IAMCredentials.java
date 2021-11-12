package com.huaweicloud.sdk.iam.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class IAMCredentials implements ICredential {
    private static final String X_AUTH_TOKEN = "X-Auth-Token";
    private String authToken;

    public String getXAuthToken() {
        return this.authToken;
    }

    public IAMCredentials withXAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }

    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String regionId) {
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.supplyAsync(() -> {
            HttpRequest.HttpRequestBuilder builder = httpRequest.builder();

            if (Objects.nonNull(getXAuthToken())) {
                builder.addHeader(X_AUTH_TOKEN, authToken);
            }

            return builder.build();
        });
    }


    @Override
    public IAMCredentials deepClone() {
        return new IAMCredentials().withXAuthToken(authToken);
    }
}



package com.huaweicloud.sdk.identitycenterportalapi.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.auth.ICredential;
import com.huaweicloud.sdk.core.http.HttpClient;
import com.huaweicloud.sdk.core.http.HttpRequest;

import java.util.concurrent.CompletableFuture;

/**
 * @since 2024/9/9
 */
public class IdentityCenterPortalAPICredentials implements ICredential {
    @Override
    public CompletableFuture<ICredential> processAuthParams(HcClient hcClient, String s) {
        return CompletableFuture.completedFuture(this);
    }

    @Override
    public CompletableFuture<HttpRequest> processAuthRequest(HttpRequest httpRequest, HttpClient httpClient) {
        return CompletableFuture.completedFuture(httpRequest);
    }

    @Override
    public ICredential deepClone() {
        return new IdentityCenterPortalAPICredentials();
    }
}

package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class ApmAsyncClient {

    protected HcClient hcClient;

    public ApmAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApmAsyncClient> newBuilder() {
        return new ClientBuilder<>(ApmAsyncClient::new);
    }

    /** @param ListBusinessRequest 请求对象
     * @return CompletableFuture<ListBusinessResponse> */
    public CompletableFuture<ListBusinessResponse> listBusinessAsync(ListBusinessRequest request) {
        return hcClient.asyncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /** @param ListBusinessRequest 请求对象
     * @return AsyncInvoker<ListBusinessRequest, ListBusinessResponse> */
    public AsyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessAsyncInvoker(
        ListBusinessRequest request) {
        return new AsyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, ApmMeta.listBusiness, hcClient);
    }

}

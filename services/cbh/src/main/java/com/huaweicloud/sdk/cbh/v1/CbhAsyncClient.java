package com.huaweicloud.sdk.cbh.v1;

import com.huaweicloud.sdk.cbh.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CbhAsyncClient {

    protected HcClient hcClient;

    public CbhAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CbhAsyncClient> newBuilder() {
        return new ClientBuilder<>(CbhAsyncClient::new);
    }

    /** 获取CBH实例列表 获取CBH实例列表
     *
     * @param ListCbhInstanceRequest 请求对象
     * @return CompletableFuture<ListCbhInstanceResponse> */
    public CompletableFuture<ListCbhInstanceResponse> listCbhInstanceAsync(ListCbhInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, CbhMeta.listCbhInstance);
    }

    /** 获取CBH实例列表 获取CBH实例列表
     *
     * @param ListCbhInstanceRequest 请求对象
     * @return AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> */
    public AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse> listCbhInstanceAsyncInvoker(
        ListCbhInstanceRequest request) {
        return new AsyncInvoker<ListCbhInstanceRequest, ListCbhInstanceResponse>(request, CbhMeta.listCbhInstance,
            hcClient);
    }

}

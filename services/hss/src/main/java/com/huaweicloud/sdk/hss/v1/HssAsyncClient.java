package com.huaweicloud.sdk.hss.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hss.v1.model.*;

public class HssAsyncClient {
    protected HcClient hcClient;

    public HssAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HssAsyncClient> newBuilder() {
        return new ClientBuilder<>(HssAsyncClient::new);
    }


    /**
     * 查询弹性云服务器状态列表
     * 查询弹性云服务器状态列表
     *
     * @param ListHostsRequest 请求对象
     * @return CompletableFuture<ListHostsResponse>
     */
    public CompletableFuture<ListHostsResponse> listHostsAsync(ListHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, HssMeta.listHosts);
    }

    /**
     * 查询弹性云服务器状态列表
     * 查询弹性云服务器状态列表
     *
     * @param ListHostsRequest 请求对象
     * @return AsyncInvoker<ListHostsRequest, ListHostsResponse>
     */
    public AsyncInvoker<ListHostsRequest, ListHostsResponse> listHostsAsyncInvoker(ListHostsRequest request) {
        return new AsyncInvoker<ListHostsRequest, ListHostsResponse>(request, HssMeta.listHosts, hcClient);
    }

}
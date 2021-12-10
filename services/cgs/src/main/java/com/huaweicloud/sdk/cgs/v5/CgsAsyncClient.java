package com.huaweicloud.sdk.cgs.v5;

import com.huaweicloud.sdk.cgs.v5.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CgsAsyncClient {

    protected HcClient hcClient;

    public CgsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CgsAsyncClient> newBuilder() {
        return new ClientBuilder<>(CgsAsyncClient::new);
    }

    /** 查询容器节点列表 查询容器节点列表
     *
     * @param ListContainerNodesRequest 请求对象
     * @return CompletableFuture<ListContainerNodesResponse> */
    public CompletableFuture<ListContainerNodesResponse> listContainerNodesAsync(ListContainerNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, CgsMeta.listContainerNodes);
    }

    /** 查询容器节点列表 查询容器节点列表
     *
     * @param ListContainerNodesRequest 请求对象
     * @return AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse> */
    public AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodesAsyncInvoker(
        ListContainerNodesRequest request) {
        return new AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse>(request,
            CgsMeta.listContainerNodes, hcClient);
    }

}

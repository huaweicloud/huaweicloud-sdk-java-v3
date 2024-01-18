package com.huaweicloud.sdk.cgs.v5;

import com.huaweicloud.sdk.cgs.v5.model.ListContainerNodesRequest;
import com.huaweicloud.sdk.cgs.v5.model.ListContainerNodesResponse;
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
        ClientBuilder<CgsAsyncClient> clientBuilder = new ClientBuilder<>(CgsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表（仅新版本容器安全支持，即将上线，敬请期待！）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNodesRequest 请求对象
     * @return CompletableFuture<ListContainerNodesResponse>
     */
    public CompletableFuture<ListContainerNodesResponse> listContainerNodesAsync(ListContainerNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, CgsMeta.listContainerNodes);
    }

    /**
     * 查询容器节点列表
     *
     * 查询容器节点列表（仅新版本容器安全支持，即将上线，敬请期待！）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListContainerNodesRequest 请求对象
     * @return AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse>
     */
    public AsyncInvoker<ListContainerNodesRequest, ListContainerNodesResponse> listContainerNodesAsyncInvoker(
        ListContainerNodesRequest request) {
        return new AsyncInvoker<>(request, CgsMeta.listContainerNodes, hcClient);
    }

}

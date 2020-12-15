package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dws.v2.model.*;

public class DwsAsyncClient {
    protected HcClient hcClient;

    public DwsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DwsAsyncClient::new);
    }


    /**
     * 创建集群
     * 该接口用于创建集群
     *
     * @param CreateClusterRequest 请求对象
     * @return CompletableFuture<CreateClusterResponse>
     */
    public CompletableFuture<CreateClusterResponse> createClusterAsync(CreateClusterRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.createCluster);
    }

    /**
     * 查询集群列表
     * 该接口用于查询并显示集群列表
     *
     * @param ListClustersRequest 请求对象
     * @return CompletableFuture<ListClustersResponse>
     */
    public CompletableFuture<ListClustersResponse> listClustersAsync(ListClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DwsMeta.listClusters);
    }

}
package com.huaweicloud.sdk.dws.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.dws.v2.model.*;

public class DwsClient {
    protected HcClient hcClient;

    public DwsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DwsClient> newBuilder() {
        return new ClientBuilder<>(DwsClient::new);
    }


    /**
     * 创建集群
     * 该接口用于创建集群
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.createCluster);
    }

    /**
     * 查询集群列表
     * 该接口用于查询并显示集群列表
     *
     * @param ListClustersRequest 请求对象
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DwsMeta.listClusters);
    }

}
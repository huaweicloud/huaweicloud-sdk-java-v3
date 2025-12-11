package com.huaweicloud.sdk.dcc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dcc.v1.model.ShowResourceClustersRequest;
import com.huaweicloud.sdk.dcc.v1.model.ShowResourceClustersResponse;

import java.util.concurrent.CompletableFuture;

public class DccAsyncClient {

    protected HcClient hcClient;

    public DccAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DccAsyncClient> newBuilder() {
        ClientBuilder<DccAsyncClient> clientBuilder = new ClientBuilder<>(DccAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 获取专属计算集群资源
     *
     * 获取专属计算集群资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceClustersRequest 请求对象
     * @return CompletableFuture<ShowResourceClustersResponse>
     */
    public CompletableFuture<ShowResourceClustersResponse> showResourceClustersAsync(
        ShowResourceClustersRequest request) {
        return hcClient.asyncInvokeHttp(request, DccMeta.showResourceClusters);
    }

    /**
     * 获取专属计算集群资源
     *
     * 获取专属计算集群资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceClustersRequest 请求对象
     * @return AsyncInvoker<ShowResourceClustersRequest, ShowResourceClustersResponse>
     */
    public AsyncInvoker<ShowResourceClustersRequest, ShowResourceClustersResponse> showResourceClustersAsyncInvoker(
        ShowResourceClustersRequest request) {
        return new AsyncInvoker<>(request, DccMeta.showResourceClusters, hcClient);
    }

}

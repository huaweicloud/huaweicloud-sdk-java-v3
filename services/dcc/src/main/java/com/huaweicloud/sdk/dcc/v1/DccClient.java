package com.huaweicloud.sdk.dcc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dcc.v1.model.ShowResourceClustersRequest;
import com.huaweicloud.sdk.dcc.v1.model.ShowResourceClustersResponse;

public class DccClient {

    protected HcClient hcClient;

    public DccClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DccClient> newBuilder() {
        ClientBuilder<DccClient> clientBuilder = new ClientBuilder<>(DccClient::new);
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
     * @return ShowResourceClustersResponse
     */
    public ShowResourceClustersResponse showResourceClusters(ShowResourceClustersRequest request) {
        return hcClient.syncInvokeHttp(request, DccMeta.showResourceClusters);
    }

    /**
     * 获取专属计算集群资源
     *
     * 获取专属计算集群资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceClustersRequest 请求对象
     * @return SyncInvoker<ShowResourceClustersRequest, ShowResourceClustersResponse>
     */
    public SyncInvoker<ShowResourceClustersRequest, ShowResourceClustersResponse> showResourceClustersInvoker(
        ShowResourceClustersRequest request) {
        return new SyncInvoker<>(request, DccMeta.showResourceClusters, hcClient);
    }

}

package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;

public class IdentityCenterClient {

    protected HcClient hcClient;

    public IdentityCenterClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterClient> newBuilder() {
        ClientBuilder<IdentityCenterClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterMeta.listInstances);
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, IdentityCenterMeta.listInstances, hcClient);
    }

}

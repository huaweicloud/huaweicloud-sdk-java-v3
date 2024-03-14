package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterMeta.listInstances);
    }

    /**
     * 列出实例
     *
     * 查询IAM身份中心的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterMeta.listInstances, hcClient);
    }

}

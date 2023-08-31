package com.huaweicloud.sdk.ces.v3;

import com.huaweicloud.sdk.ces.v3.model.BatchCreateAgentInvocationsRequest;
import com.huaweicloud.sdk.ces.v3.model.BatchCreateAgentInvocationsResponse;
import com.huaweicloud.sdk.ces.v3.model.ListAgentInvocationsRequest;
import com.huaweicloud.sdk.ces.v3.model.ListAgentInvocationsResponse;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusRequest;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        ClientBuilder<CesAsyncClient> clientBuilder = new ClientBuilder<>(CesAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 插件状态查询
     *
     * 插件状态查询，包括uniagent状态以及插件状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentStatusRequest 请求对象
     * @return CompletableFuture<ListAgentStatusResponse>
     */
    public CompletableFuture<ListAgentStatusResponse> listAgentStatusAsync(ListAgentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAgentStatus);
    }

    /**
     * 插件状态查询
     *
     * 插件状态查询，包括uniagent状态以及插件状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentStatusRequest 请求对象
     * @return AsyncInvoker<ListAgentStatusRequest, ListAgentStatusResponse>
     */
    public AsyncInvoker<ListAgentStatusRequest, ListAgentStatusResponse> listAgentStatusAsyncInvoker(
        ListAgentStatusRequest request) {
        return new AsyncInvoker<ListAgentStatusRequest, ListAgentStatusResponse>(request, CesMeta.listAgentStatus,
            hcClient);
    }

    /**
     * 批量创建Agent任务
     *
     * 批量创建Agent任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateAgentInvocationsRequest 请求对象
     * @return CompletableFuture<BatchCreateAgentInvocationsResponse>
     */
    public CompletableFuture<BatchCreateAgentInvocationsResponse> batchCreateAgentInvocationsAsync(
        BatchCreateAgentInvocationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchCreateAgentInvocations);
    }

    /**
     * 批量创建Agent任务
     *
     * 批量创建Agent任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateAgentInvocationsRequest 请求对象
     * @return AsyncInvoker<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse>
     */
    public AsyncInvoker<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse> batchCreateAgentInvocationsAsyncInvoker(
        BatchCreateAgentInvocationsRequest request) {
        return new AsyncInvoker<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse>(request,
            CesMeta.batchCreateAgentInvocations, hcClient);
    }

    /**
     * 查询Agent任务列表
     *
     * 查询Agent任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentInvocationsRequest 请求对象
     * @return CompletableFuture<ListAgentInvocationsResponse>
     */
    public CompletableFuture<ListAgentInvocationsResponse> listAgentInvocationsAsync(
        ListAgentInvocationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAgentInvocations);
    }

    /**
     * 查询Agent任务列表
     *
     * 查询Agent任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAgentInvocationsRequest 请求对象
     * @return AsyncInvoker<ListAgentInvocationsRequest, ListAgentInvocationsResponse>
     */
    public AsyncInvoker<ListAgentInvocationsRequest, ListAgentInvocationsResponse> listAgentInvocationsAsyncInvoker(
        ListAgentInvocationsRequest request) {
        return new AsyncInvoker<ListAgentInvocationsRequest, ListAgentInvocationsResponse>(request,
            CesMeta.listAgentInvocations, hcClient);
    }

}

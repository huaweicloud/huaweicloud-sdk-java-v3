package com.huaweicloud.sdk.ces.v3;

import com.huaweicloud.sdk.ces.v3.model.BatchCreateAgentInvocationsRequest;
import com.huaweicloud.sdk.ces.v3.model.BatchCreateAgentInvocationsResponse;
import com.huaweicloud.sdk.ces.v3.model.ListAgentInvocationsRequest;
import com.huaweicloud.sdk.ces.v3.model.ListAgentInvocationsResponse;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusRequest;
import com.huaweicloud.sdk.ces.v3.model.ListAgentStatusResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        ClientBuilder<CesClient> clientBuilder = new ClientBuilder<>(CesClient::new);
        return clientBuilder;
    }

    /**
     * 插件状态查询
     *
     * 插件状态查询，包括uniagent状态以及插件状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentStatusRequest 请求对象
     * @return ListAgentStatusResponse
     */
    public ListAgentStatusResponse listAgentStatus(ListAgentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAgentStatus);
    }

    /**
     * 插件状态查询
     *
     * 插件状态查询，包括uniagent状态以及插件状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentStatusRequest 请求对象
     * @return SyncInvoker<ListAgentStatusRequest, ListAgentStatusResponse>
     */
    public SyncInvoker<ListAgentStatusRequest, ListAgentStatusResponse> listAgentStatusInvoker(
        ListAgentStatusRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAgentStatus, hcClient);
    }

    /**
     * 批量创建Agent任务
     *
     * 批量创建Agent任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAgentInvocationsRequest 请求对象
     * @return BatchCreateAgentInvocationsResponse
     */
    public BatchCreateAgentInvocationsResponse batchCreateAgentInvocations(BatchCreateAgentInvocationsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchCreateAgentInvocations);
    }

    /**
     * 批量创建Agent任务
     *
     * 批量创建Agent任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateAgentInvocationsRequest 请求对象
     * @return SyncInvoker<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse>
     */
    public SyncInvoker<BatchCreateAgentInvocationsRequest, BatchCreateAgentInvocationsResponse> batchCreateAgentInvocationsInvoker(
        BatchCreateAgentInvocationsRequest request) {
        return new SyncInvoker<>(request, CesMeta.batchCreateAgentInvocations, hcClient);
    }

    /**
     * 查询Agent任务列表
     *
     * 查询Agent任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentInvocationsRequest 请求对象
     * @return ListAgentInvocationsResponse
     */
    public ListAgentInvocationsResponse listAgentInvocations(ListAgentInvocationsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAgentInvocations);
    }

    /**
     * 查询Agent任务列表
     *
     * 查询Agent任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgentInvocationsRequest 请求对象
     * @return SyncInvoker<ListAgentInvocationsRequest, ListAgentInvocationsResponse>
     */
    public SyncInvoker<ListAgentInvocationsRequest, ListAgentInvocationsResponse> listAgentInvocationsInvoker(
        ListAgentInvocationsRequest request) {
        return new SyncInvoker<>(request, CesMeta.listAgentInvocations, hcClient);
    }

}

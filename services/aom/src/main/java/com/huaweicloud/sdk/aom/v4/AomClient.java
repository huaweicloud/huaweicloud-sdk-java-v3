package com.huaweicloud.sdk.aom.v4;

import com.huaweicloud.sdk.aom.v4.model.BatchImportAgentRequest;
import com.huaweicloud.sdk.aom.v4.model.BatchImportAgentResponse;
import com.huaweicloud.sdk.aom.v4.model.BatchUpdateAgentRequest;
import com.huaweicloud.sdk.aom.v4.model.BatchUpdateAgentResponse;
import com.huaweicloud.sdk.aom.v4.model.ShowAgentInfosRequest;
import com.huaweicloud.sdk.aom.v4.model.ShowAgentInfosResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AomClient {

    protected HcClient hcClient;

    public AomClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomClient> newBuilder() {
        ClientBuilder<AomClient> clientBuilder = new ClientBuilder<>(AomClient::new);
        return clientBuilder;
    }

    /**
     * 下发批量安装UniAgent任务
     *
     * 该接口用于下发批量安装UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAgentRequest 请求对象
     * @return BatchImportAgentResponse
     */
    public BatchImportAgentResponse batchImportAgent(BatchImportAgentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.batchImportAgent);
    }

    /**
     * 下发批量安装UniAgent任务
     *
     * 该接口用于下发批量安装UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAgentRequest 请求对象
     * @return SyncInvoker<BatchImportAgentRequest, BatchImportAgentResponse>
     */
    public SyncInvoker<BatchImportAgentRequest, BatchImportAgentResponse> batchImportAgentInvoker(
        BatchImportAgentRequest request) {
        return new SyncInvoker<>(request, AomMeta.batchImportAgent, hcClient);
    }

    /**
     * 下发批量升级UniAgent任务
     *
     * 该接口用于下发批量升级UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAgentRequest 请求对象
     * @return BatchUpdateAgentResponse
     */
    public BatchUpdateAgentResponse batchUpdateAgent(BatchUpdateAgentRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.batchUpdateAgent);
    }

    /**
     * 下发批量升级UniAgent任务
     *
     * 该接口用于下发批量升级UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAgentRequest 请求对象
     * @return SyncInvoker<BatchUpdateAgentRequest, BatchUpdateAgentResponse>
     */
    public SyncInvoker<BatchUpdateAgentRequest, BatchUpdateAgentResponse> batchUpdateAgentInvoker(
        BatchUpdateAgentRequest request) {
        return new SyncInvoker<>(request, AomMeta.batchUpdateAgent, hcClient);
    }

    /**
     * 查询UniAgent主机列表信息
     *
     * 该接口用于查询执行过安装UniAgent任务的主机列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentInfosRequest 请求对象
     * @return ShowAgentInfosResponse
     */
    public ShowAgentInfosResponse showAgentInfos(ShowAgentInfosRequest request) {
        return hcClient.syncInvokeHttp(request, AomMeta.showAgentInfos);
    }

    /**
     * 查询UniAgent主机列表信息
     *
     * 该接口用于查询执行过安装UniAgent任务的主机列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentInfosRequest 请求对象
     * @return SyncInvoker<ShowAgentInfosRequest, ShowAgentInfosResponse>
     */
    public SyncInvoker<ShowAgentInfosRequest, ShowAgentInfosResponse> showAgentInfosInvoker(
        ShowAgentInfosRequest request) {
        return new SyncInvoker<>(request, AomMeta.showAgentInfos, hcClient);
    }

}

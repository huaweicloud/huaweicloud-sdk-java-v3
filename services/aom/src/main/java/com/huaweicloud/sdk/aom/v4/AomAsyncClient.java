package com.huaweicloud.sdk.aom.v4;

import com.huaweicloud.sdk.aom.v4.model.BatchImportAgentRequest;
import com.huaweicloud.sdk.aom.v4.model.BatchImportAgentResponse;
import com.huaweicloud.sdk.aom.v4.model.BatchUpdateAgentRequest;
import com.huaweicloud.sdk.aom.v4.model.BatchUpdateAgentResponse;
import com.huaweicloud.sdk.aom.v4.model.ShowAgentInfosRequest;
import com.huaweicloud.sdk.aom.v4.model.ShowAgentInfosResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AomAsyncClient {

    protected HcClient hcClient;

    public AomAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AomAsyncClient> newBuilder() {
        ClientBuilder<AomAsyncClient> clientBuilder = new ClientBuilder<>(AomAsyncClient::new);
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
     * @return CompletableFuture<BatchImportAgentResponse>
     */
    public CompletableFuture<BatchImportAgentResponse> batchImportAgentAsync(BatchImportAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.batchImportAgent);
    }

    /**
     * 下发批量安装UniAgent任务
     *
     * 该接口用于下发批量安装UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchImportAgentRequest 请求对象
     * @return AsyncInvoker<BatchImportAgentRequest, BatchImportAgentResponse>
     */
    public AsyncInvoker<BatchImportAgentRequest, BatchImportAgentResponse> batchImportAgentAsyncInvoker(
        BatchImportAgentRequest request) {
        return new AsyncInvoker<>(request, AomMeta.batchImportAgent, hcClient);
    }

    /**
     * 下发批量升级UniAgent任务
     *
     * 该接口用于下发批量升级UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAgentRequest 请求对象
     * @return CompletableFuture<BatchUpdateAgentResponse>
     */
    public CompletableFuture<BatchUpdateAgentResponse> batchUpdateAgentAsync(BatchUpdateAgentRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.batchUpdateAgent);
    }

    /**
     * 下发批量升级UniAgent任务
     *
     * 该接口用于下发批量升级UniAgent任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAgentRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAgentRequest, BatchUpdateAgentResponse>
     */
    public AsyncInvoker<BatchUpdateAgentRequest, BatchUpdateAgentResponse> batchUpdateAgentAsyncInvoker(
        BatchUpdateAgentRequest request) {
        return new AsyncInvoker<>(request, AomMeta.batchUpdateAgent, hcClient);
    }

    /**
     * 查询UniAgent主机列表信息
     *
     * 该接口用于查询执行过安装UniAgent任务的主机列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentInfosRequest 请求对象
     * @return CompletableFuture<ShowAgentInfosResponse>
     */
    public CompletableFuture<ShowAgentInfosResponse> showAgentInfosAsync(ShowAgentInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, AomMeta.showAgentInfos);
    }

    /**
     * 查询UniAgent主机列表信息
     *
     * 该接口用于查询执行过安装UniAgent任务的主机列表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAgentInfosRequest 请求对象
     * @return AsyncInvoker<ShowAgentInfosRequest, ShowAgentInfosResponse>
     */
    public AsyncInvoker<ShowAgentInfosRequest, ShowAgentInfosResponse> showAgentInfosAsyncInvoker(
        ShowAgentInfosRequest request) {
        return new AsyncInvoker<>(request, AomMeta.showAgentInfos, hcClient);
    }

}

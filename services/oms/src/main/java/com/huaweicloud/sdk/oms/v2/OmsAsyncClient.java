package com.huaweicloud.sdk.oms.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.oms.v2.model.*;

public class OmsAsyncClient {
    protected HcClient hcClient;

    public OmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(OmsAsyncClient::new);
    }


    public CompletableFuture<CreateTaskResponse> createTaskAsync(CreateTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.createTask);
    }

    public CompletableFuture<DeleteTaskResponse> deleteTaskAsync(DeleteTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.deleteTask);
    }

    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listTasks);
    }

    public CompletableFuture<ShowTaskResponse> showTaskAsync(ShowTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showTask);
    }

    public CompletableFuture<StartTaskResponse> startTaskAsync(StartTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.startTask);
    }

    public CompletableFuture<StopTaskResponse> stopTaskAsync(StopTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.stopTask);
    }

    public CompletableFuture<UpdateBandwidthPolicyResponse> updateBandwidthPolicyAsync(UpdateBandwidthPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.updateBandwidthPolicy);
    }

    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.listApiVersions);
    }

    public CompletableFuture<ShowApiInfoResponse> showApiInfoAsync(ShowApiInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OmsMeta.showApiInfo);
    }

}
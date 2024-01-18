package com.huaweicloud.sdk.koophone.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.koophone.v1.model.AsyncInvokeInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.AsyncInvokeInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.BatchResetInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.BatchResetInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.BatchShowInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.BatchShowInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.koophone.v1.model.SetVideoRequest;
import com.huaweicloud.sdk.koophone.v1.model.SetVideoResponse;
import com.huaweicloud.sdk.koophone.v1.model.SyncInvokeInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.SyncInvokeInstanceResponse;

import java.util.concurrent.CompletableFuture;

public class KooPhoneAsyncClient {

    protected HcClient hcClient;

    public KooPhoneAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooPhoneAsyncClient> newBuilder() {
        ClientBuilder<KooPhoneAsyncClient> clientBuilder = new ClientBuilder<>(KooPhoneAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 实例执行异步命令
     *
     * 实例执行异步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AsyncInvokeInstanceRequest 请求对象
     * @return CompletableFuture<AsyncInvokeInstanceResponse>
     */
    public CompletableFuture<AsyncInvokeInstanceResponse> asyncInvokeInstanceAsync(AsyncInvokeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.asyncInvokeInstance);
    }

    /**
     * 实例执行异步命令
     *
     * 实例执行异步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AsyncInvokeInstanceRequest 请求对象
     * @return AsyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse>
     */
    public AsyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> asyncInvokeInstanceAsyncInvoker(
        AsyncInvokeInstanceRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.asyncInvokeInstance, hcClient);
    }

    /**
     * 实例批量重置
     *
     * 实例批量重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetInstanceRequest 请求对象
     * @return CompletableFuture<BatchResetInstanceResponse>
     */
    public CompletableFuture<BatchResetInstanceResponse> batchResetInstanceAsync(BatchResetInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.batchResetInstance);
    }

    /**
     * 实例批量重置
     *
     * 实例批量重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchResetInstanceRequest 请求对象
     * @return AsyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse>
     */
    public AsyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse> batchResetInstanceAsyncInvoker(
        BatchResetInstanceRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.batchResetInstance, hcClient);
    }

    /**
     * 实例状态批量查询
     *
     * 实例状态批量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowInstanceRequest 请求对象
     * @return CompletableFuture<BatchShowInstanceResponse>
     */
    public CompletableFuture<BatchShowInstanceResponse> batchShowInstanceAsync(BatchShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.batchShowInstance);
    }

    /**
     * 实例状态批量查询
     *
     * 实例状态批量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowInstanceRequest 请求对象
     * @return AsyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse>
     */
    public AsyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse> batchShowInstanceAsyncInvoker(
        BatchShowInstanceRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.batchShowInstance, hcClient);
    }

    /**
     * 实例执行任务查询
     *
     * 实例执行任务查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return CompletableFuture<ExecuteJobResponse>
     */
    public CompletableFuture<ExecuteJobResponse> executeJobAsync(ExecuteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.executeJob);
    }

    /**
     * 实例执行任务查询
     *
     * 实例执行任务查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteJobRequest 请求对象
     * @return AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public AsyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobAsyncInvoker(ExecuteJobRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.executeJob, hcClient);
    }

    /**
     * 实例视频设置
     *
     * 实例视频设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetVideoRequest 请求对象
     * @return CompletableFuture<SetVideoResponse>
     */
    public CompletableFuture<SetVideoResponse> setVideoAsync(SetVideoRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.setVideo);
    }

    /**
     * 实例视频设置
     *
     * 实例视频设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetVideoRequest 请求对象
     * @return AsyncInvoker<SetVideoRequest, SetVideoResponse>
     */
    public AsyncInvoker<SetVideoRequest, SetVideoResponse> setVideoAsyncInvoker(SetVideoRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.setVideo, hcClient);
    }

    /**
     * 实例执行同步命令
     *
     * 实例执行同步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncInvokeInstanceRequest 请求对象
     * @return CompletableFuture<SyncInvokeInstanceResponse>
     */
    public CompletableFuture<SyncInvokeInstanceResponse> syncInvokeInstanceAsync(SyncInvokeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.syncInvokeInstance);
    }

    /**
     * 实例执行同步命令
     *
     * 实例执行同步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncInvokeInstanceRequest 请求对象
     * @return AsyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse>
     */
    public AsyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> syncInvokeInstanceAsyncInvoker(
        SyncInvokeInstanceRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.syncInvokeInstance, hcClient);
    }

}

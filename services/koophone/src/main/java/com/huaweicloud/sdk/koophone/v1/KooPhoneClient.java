package com.huaweicloud.sdk.koophone.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class KooPhoneClient {

    protected HcClient hcClient;

    public KooPhoneClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KooPhoneClient> newBuilder() {
        ClientBuilder<KooPhoneClient> clientBuilder = new ClientBuilder<>(KooPhoneClient::new);
        return clientBuilder;
    }

    /**
     * 实例执行异步命令
     *
     * 实例执行异步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeInstanceRequest 请求对象
     * @return AsyncInvokeInstanceResponse
     */
    public AsyncInvokeInstanceResponse asyncInvokeInstance(AsyncInvokeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.asyncInvokeInstance);
    }

    /**
     * 实例执行异步命令
     *
     * 实例执行异步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AsyncInvokeInstanceRequest 请求对象
     * @return SyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse>
     */
    public SyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> asyncInvokeInstanceInvoker(
        AsyncInvokeInstanceRequest request) {
        return new SyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse>(request,
            KooPhoneMeta.asyncInvokeInstance, hcClient);
    }

    /**
     * 实例批量重置
     *
     * 实例批量重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchResetInstanceRequest 请求对象
     * @return BatchResetInstanceResponse
     */
    public BatchResetInstanceResponse batchResetInstance(BatchResetInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.batchResetInstance);
    }

    /**
     * 实例批量重置
     *
     * 实例批量重置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchResetInstanceRequest 请求对象
     * @return SyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse>
     */
    public SyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse> batchResetInstanceInvoker(
        BatchResetInstanceRequest request) {
        return new SyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse>(request,
            KooPhoneMeta.batchResetInstance, hcClient);
    }

    /**
     * 实例状态批量查询
     *
     * 实例状态批量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowInstanceRequest 请求对象
     * @return BatchShowInstanceResponse
     */
    public BatchShowInstanceResponse batchShowInstance(BatchShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.batchShowInstance);
    }

    /**
     * 实例状态批量查询
     *
     * 实例状态批量查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchShowInstanceRequest 请求对象
     * @return SyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse>
     */
    public SyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse> batchShowInstanceInvoker(
        BatchShowInstanceRequest request) {
        return new SyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse>(request,
            KooPhoneMeta.batchShowInstance, hcClient);
    }

    /**
     * 实例执行任务查询
     *
     * 实例执行任务查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobRequest 请求对象
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJob(ExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.executeJob);
    }

    /**
     * 实例执行任务查询
     *
     * 实例执行任务查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExecuteJobRequest 请求对象
     * @return SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public SyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobInvoker(ExecuteJobRequest request) {
        return new SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>(request, KooPhoneMeta.executeJob, hcClient);
    }

    /**
     * 实例视频设置
     *
     * 实例视频设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetVideoRequest 请求对象
     * @return SetVideoResponse
     */
    public SetVideoResponse setVideo(SetVideoRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.setVideo);
    }

    /**
     * 实例视频设置
     *
     * 实例视频设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetVideoRequest 请求对象
     * @return SyncInvoker<SetVideoRequest, SetVideoResponse>
     */
    public SyncInvoker<SetVideoRequest, SetVideoResponse> setVideoInvoker(SetVideoRequest request) {
        return new SyncInvoker<SetVideoRequest, SetVideoResponse>(request, KooPhoneMeta.setVideo, hcClient);
    }

    /**
     * 实例执行同步命令
     *
     * 实例执行同步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncInvokeInstanceRequest 请求对象
     * @return SyncInvokeInstanceResponse
     */
    public SyncInvokeInstanceResponse syncInvokeInstance(SyncInvokeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.syncInvokeInstance);
    }

    /**
     * 实例执行同步命令
     *
     * 实例执行同步命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SyncInvokeInstanceRequest 请求对象
     * @return SyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse>
     */
    public SyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> syncInvokeInstanceInvoker(
        SyncInvokeInstanceRequest request) {
        return new SyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse>(request,
            KooPhoneMeta.syncInvokeInstance, hcClient);
    }

}

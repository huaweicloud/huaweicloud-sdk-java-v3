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
import com.huaweicloud.sdk.koophone.v1.model.ExecuteInstanceAuthTokenRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteInstanceAuthTokenResponse;
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
     * 实例执行异步命令接口。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 可以通过调用该接口实现对自己的koophone云手机实例进行异步adb指令操作。
     * 调用完该接口后携带该接口返回的task_id去调用实例执行任务查询接口。
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
     * 实例执行异步命令接口。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 可以通过调用该接口实现对自己的koophone云手机实例进行异步adb指令操作。
     * 调用完该接口后携带该接口返回的task_id去调用实例执行任务查询接口。
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
     * 实例批量重置，
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 调用该接口后，当前实例会被初始化。
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
     * 实例批量重置，
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 调用该接口后，当前实例会被初始化。
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
     * 实例状态批量查询。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 接口返回实例当前的状态：云机状态，0：未知，1： 已停止，2：运行中，3：下线中，4：启动中， 5：已关机。
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
     * 实例状态批量查询。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 接口返回实例当前的状态：云机状态，0：未知，1： 已停止，2：运行中，3：下线中，4：启动中， 5：已关机。
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
     * 租户实例串流前获取设备的device_token
     *
     * 租户实例串流前获取设备的device_token，
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 调用该接口获取云机实例的device_token后作为鉴权信息，并携带云机实例的device_id去调用反参中的信令地址（signaling_url）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceAuthTokenRequest 请求对象
     * @return CompletableFuture<ExecuteInstanceAuthTokenResponse>
     */
    public CompletableFuture<ExecuteInstanceAuthTokenResponse> executeInstanceAuthTokenAsync(
        ExecuteInstanceAuthTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, KooPhoneMeta.executeInstanceAuthToken);
    }

    /**
     * 租户实例串流前获取设备的device_token
     *
     * 租户实例串流前获取设备的device_token，
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 调用该接口获取云机实例的device_token后作为鉴权信息，并携带云机实例的device_id去调用反参中的信令地址（signaling_url）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceAuthTokenRequest 请求对象
     * @return AsyncInvoker<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse>
     */
    public AsyncInvoker<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse> executeInstanceAuthTokenAsyncInvoker(
        ExecuteInstanceAuthTokenRequest request) {
        return new AsyncInvoker<>(request, KooPhoneMeta.executeInstanceAuthToken, hcClient);
    }

    /**
     * 实例执行任务查询
     *
     * 实例执行任务批量查询。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 该接口需要和实例执行异步命令接口一起使用，使用实例执行异步命令接口返回的task_id作为路径上的参数以此获取异步命令执行的结果。
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
     * 实例执行任务批量查询。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 该接口需要和实例执行异步命令接口一起使用，使用实例执行异步命令接口返回的task_id作为路径上的参数以此获取异步命令执行的结果。
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
     * 实例视频设置。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 使用该接口可以设置实例每一个清晰度对应的码率和出流的帧率。
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
     * 实例视频设置。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 使用该接口可以设置实例每一个清晰度对应的码率和出流的帧率。
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
     * 实例执行同步命令接口。调用此api的前提条件是租户需要先购买koophone云手机实例。可以通过调用该接口实现对自己的koophone云手机实例进行adb指令操作。
     * 该接口是同步操作接口，如果有耗时adb操作建议使用实例执行异步命令接口。
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
     * 实例执行同步命令接口。调用此api的前提条件是租户需要先购买koophone云手机实例。可以通过调用该接口实现对自己的koophone云手机实例进行adb指令操作。
     * 该接口是同步操作接口，如果有耗时adb操作建议使用实例执行异步命令接口。
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

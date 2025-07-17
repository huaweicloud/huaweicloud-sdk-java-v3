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
import com.huaweicloud.sdk.koophone.v1.model.BatchShowSkuRequest;
import com.huaweicloud.sdk.koophone.v1.model.BatchShowSkuResponse;
import com.huaweicloud.sdk.koophone.v1.model.CancelInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.CancelInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.CreateInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.CreateInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteInstanceAuthTokenRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteInstanceAuthTokenResponse;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobRequest;
import com.huaweicloud.sdk.koophone.v1.model.ExecuteJobResponse;
import com.huaweicloud.sdk.koophone.v1.model.ProvisionInstanceRequest;
import com.huaweicloud.sdk.koophone.v1.model.ProvisionInstanceResponse;
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
     * 实例执行异步命令接口。
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 可以通过调用该接口实现对自己的koophone云手机实例进行异步adb指令操作。
     * 调用完该接口后携带该接口返回的task_id去调用实例执行任务查询接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AsyncInvokeInstanceRequest 请求对象
     * @return AsyncInvokeInstanceResponse
     */
    public AsyncInvokeInstanceResponse asyncInvokeInstance(AsyncInvokeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.asyncInvokeInstance);
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
     * @return SyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse>
     */
    public SyncInvoker<AsyncInvokeInstanceRequest, AsyncInvokeInstanceResponse> asyncInvokeInstanceInvoker(
        AsyncInvokeInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.asyncInvokeInstance, hcClient);
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
     * @return BatchResetInstanceResponse
     */
    public BatchResetInstanceResponse batchResetInstance(BatchResetInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.batchResetInstance);
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
     * @return SyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse>
     */
    public SyncInvoker<BatchResetInstanceRequest, BatchResetInstanceResponse> batchResetInstanceInvoker(
        BatchResetInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.batchResetInstance, hcClient);
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
     * @return BatchShowInstanceResponse
     */
    public BatchShowInstanceResponse batchShowInstance(BatchShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.batchShowInstance);
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
     * @return SyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse>
     */
    public SyncInvoker<BatchShowInstanceRequest, BatchShowInstanceResponse> batchShowInstanceInvoker(
        BatchShowInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.batchShowInstance, hcClient);
    }

    /**
     * 可售实例sku批量查询
     *
     * 实例sku批量查询。
     * 接口返回租户下所有可售实例的规格信息。
     * 根据query参数去查询具体的商品的sku信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowSkuRequest 请求对象
     * @return BatchShowSkuResponse
     */
    public BatchShowSkuResponse batchShowSku(BatchShowSkuRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.batchShowSku);
    }

    /**
     * 可售实例sku批量查询
     *
     * 实例sku批量查询。
     * 接口返回租户下所有可售实例的规格信息。
     * 根据query参数去查询具体的商品的sku信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowSkuRequest 请求对象
     * @return SyncInvoker<BatchShowSkuRequest, BatchShowSkuResponse>
     */
    public SyncInvoker<BatchShowSkuRequest, BatchShowSkuResponse> batchShowSkuInvoker(BatchShowSkuRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.batchShowSku, hcClient);
    }

    /**
     * 实例取消分配
     *
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 将云机取消分配给租户指定的用户，调用后会清除用户云机使用数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInstanceRequest 请求对象
     * @return CancelInstanceResponse
     */
    public CancelInstanceResponse cancelInstance(CancelInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.cancelInstance);
    }

    /**
     * 实例取消分配
     *
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 将云机取消分配给租户指定的用户，调用后会清除用户云机使用数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInstanceRequest 请求对象
     * @return SyncInvoker<CancelInstanceRequest, CancelInstanceResponse>
     */
    public SyncInvoker<CancelInstanceRequest, CancelInstanceResponse> cancelInstanceInvoker(
        CancelInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.cancelInstance, hcClient);
    }

    /**
     * 实例开通接口
     *
     * 租户可以通过调用该接口生成实例。
     * 该接口需要结合BatchShowSku接口一起使用，在BatchShowSku接口中获取全量的可售的sku。租户根据自己需要去选择相应规格进行订购。
     * 调用该接口时如果想要直接购买成功，请您先在账户上充值并在订购参数中选择isAutoPay为自动付费。
     * 如果没有选择自动付费，在调完接口后请拿对应的订单号去您账号的待支付订单中选择手动付费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.createInstance);
    }

    /**
     * 实例开通接口
     *
     * 租户可以通过调用该接口生成实例。
     * 该接口需要结合BatchShowSku接口一起使用，在BatchShowSku接口中获取全量的可售的sku。租户根据自己需要去选择相应规格进行订购。
     * 调用该接口时如果想要直接购买成功，请您先在账户上充值并在订购参数中选择isAutoPay为自动付费。
     * 如果没有选择自动付费，在调完接口后请拿对应的订单号去您账号的待支付订单中选择手动付费。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.createInstance, hcClient);
    }

    /**
     * 实例删除
     *
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 租户可以调用该openapi退订已经订购的包周期实例，不可以退订按需的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.deleteInstance);
    }

    /**
     * 实例删除
     *
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 租户可以调用该openapi退订已经订购的包周期实例，不可以退订按需的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.deleteInstance, hcClient);
    }

    /**
     * 租户实例串流前获取设备的device_token
     *
     * 租户实例串流前获取设备的device_token，
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 调用该接口获取云机实例的device_token后作为鉴权信息，并携带云机实例的device_id去调用返参中的信令地址（signaling_url）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceAuthTokenRequest 请求对象
     * @return ExecuteInstanceAuthTokenResponse
     */
    public ExecuteInstanceAuthTokenResponse executeInstanceAuthToken(ExecuteInstanceAuthTokenRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.executeInstanceAuthToken);
    }

    /**
     * 租户实例串流前获取设备的device_token
     *
     * 租户实例串流前获取设备的device_token，
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 调用该接口获取云机实例的device_token后作为鉴权信息，并携带云机实例的device_id去调用返参中的信令地址（signaling_url）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteInstanceAuthTokenRequest 请求对象
     * @return SyncInvoker<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse>
     */
    public SyncInvoker<ExecuteInstanceAuthTokenRequest, ExecuteInstanceAuthTokenResponse> executeInstanceAuthTokenInvoker(
        ExecuteInstanceAuthTokenRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.executeInstanceAuthToken, hcClient);
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
     * @return ExecuteJobResponse
     */
    public ExecuteJobResponse executeJob(ExecuteJobRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.executeJob);
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
     * @return SyncInvoker<ExecuteJobRequest, ExecuteJobResponse>
     */
    public SyncInvoker<ExecuteJobRequest, ExecuteJobResponse> executeJobInvoker(ExecuteJobRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.executeJob, hcClient);
    }

    /**
     * 实例分配
     *
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 将云机分配给租户指定的用户，需要指定用户userId。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProvisionInstanceRequest 请求对象
     * @return ProvisionInstanceResponse
     */
    public ProvisionInstanceResponse provisionInstance(ProvisionInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.provisionInstance);
    }

    /**
     * 实例分配
     *
     * 调用此api的前提条件是租户需要先购买koophone云手机实例。
     * 将云机分配给租户指定的用户，需要指定用户userId。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ProvisionInstanceRequest 请求对象
     * @return SyncInvoker<ProvisionInstanceRequest, ProvisionInstanceResponse>
     */
    public SyncInvoker<ProvisionInstanceRequest, ProvisionInstanceResponse> provisionInstanceInvoker(
        ProvisionInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.provisionInstance, hcClient);
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
     * @return SetVideoResponse
     */
    public SetVideoResponse setVideo(SetVideoRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.setVideo);
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
     * @return SyncInvoker<SetVideoRequest, SetVideoResponse>
     */
    public SyncInvoker<SetVideoRequest, SetVideoResponse> setVideoInvoker(SetVideoRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.setVideo, hcClient);
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
     * @return SyncInvokeInstanceResponse
     */
    public SyncInvokeInstanceResponse syncInvokeInstance(SyncInvokeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, KooPhoneMeta.syncInvokeInstance);
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
     * @return SyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse>
     */
    public SyncInvoker<SyncInvokeInstanceRequest, SyncInvokeInstanceResponse> syncInvokeInstanceInvoker(
        SyncInvokeInstanceRequest request) {
        return new SyncInvoker<>(request, KooPhoneMeta.syncInvokeInstance, hcClient);
    }

}

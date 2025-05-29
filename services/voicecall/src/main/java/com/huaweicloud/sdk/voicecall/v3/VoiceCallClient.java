package com.huaweicloud.sdk.voicecall.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallBackRequest;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallBackResponse;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallNotifyRequest;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallNotifyResponse;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallVerifyRequest;
import com.huaweicloud.sdk.voicecall.v3.model.CreateCallVerifyResponse;
import com.huaweicloud.sdk.voicecall.v3.model.ShowVoiceRecordRequest;
import com.huaweicloud.sdk.voicecall.v3.model.ShowVoiceRecordResponse;
import com.huaweicloud.sdk.voicecall.v3.model.StopCallBackRequest;
import com.huaweicloud.sdk.voicecall.v3.model.StopCallBackResponse;

public class VoiceCallClient {

    protected HcClient hcClient;

    public VoiceCallClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VoiceCallClient> newBuilder() {
        ClientBuilder<VoiceCallClient> clientBuilder = new ClientBuilder<>(VoiceCallClient::new);
        return clientBuilder;
    }

    /**
     * 语音回呼
     *
     * 语音回呼
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallBackRequest 请求对象
     * @return CreateCallBackResponse
     */
    public CreateCallBackResponse createCallBack(CreateCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, VoiceCallMeta.createCallBack);
    }

    /**
     * 语音回呼
     *
     * 语音回呼
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallBackRequest 请求对象
     * @return SyncInvoker<CreateCallBackRequest, CreateCallBackResponse>
     */
    public SyncInvoker<CreateCallBackRequest, CreateCallBackResponse> createCallBackInvoker(
        CreateCallBackRequest request) {
        return new SyncInvoker<>(request, VoiceCallMeta.createCallBack, hcClient);
    }

    /**
     * 获取录音文件URL
     *
     * 获取录音文件URL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceRecordRequest 请求对象
     * @return ShowVoiceRecordResponse
     */
    public ShowVoiceRecordResponse showVoiceRecord(ShowVoiceRecordRequest request) {
        return hcClient.syncInvokeHttp(request, VoiceCallMeta.showVoiceRecord);
    }

    /**
     * 获取录音文件URL
     *
     * 获取录音文件URL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceRecordRequest 请求对象
     * @return SyncInvoker<ShowVoiceRecordRequest, ShowVoiceRecordResponse>
     */
    public SyncInvoker<ShowVoiceRecordRequest, ShowVoiceRecordResponse> showVoiceRecordInvoker(
        ShowVoiceRecordRequest request) {
        return new SyncInvoker<>(request, VoiceCallMeta.showVoiceRecord, hcClient);
    }

    /**
     * 终止呼叫
     *
     * 终止呼叫
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCallBackRequest 请求对象
     * @return StopCallBackResponse
     */
    public StopCallBackResponse stopCallBack(StopCallBackRequest request) {
        return hcClient.syncInvokeHttp(request, VoiceCallMeta.stopCallBack);
    }

    /**
     * 终止呼叫
     *
     * 终止呼叫
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCallBackRequest 请求对象
     * @return SyncInvoker<StopCallBackRequest, StopCallBackResponse>
     */
    public SyncInvoker<StopCallBackRequest, StopCallBackResponse> stopCallBackInvoker(StopCallBackRequest request) {
        return new SyncInvoker<>(request, VoiceCallMeta.stopCallBack, hcClient);
    }

    /**
     * 语音通知
     *
     * 语音通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallNotifyRequest 请求对象
     * @return CreateCallNotifyResponse
     */
    public CreateCallNotifyResponse createCallNotify(CreateCallNotifyRequest request) {
        return hcClient.syncInvokeHttp(request, VoiceCallMeta.createCallNotify);
    }

    /**
     * 语音通知
     *
     * 语音通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallNotifyRequest 请求对象
     * @return SyncInvoker<CreateCallNotifyRequest, CreateCallNotifyResponse>
     */
    public SyncInvoker<CreateCallNotifyRequest, CreateCallNotifyResponse> createCallNotifyInvoker(
        CreateCallNotifyRequest request) {
        return new SyncInvoker<>(request, VoiceCallMeta.createCallNotify, hcClient);
    }

    /**
     * 语音验证码
     *
     * 语音验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallVerifyRequest 请求对象
     * @return CreateCallVerifyResponse
     */
    public CreateCallVerifyResponse createCallVerify(CreateCallVerifyRequest request) {
        return hcClient.syncInvokeHttp(request, VoiceCallMeta.createCallVerify);
    }

    /**
     * 语音验证码
     *
     * 语音验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallVerifyRequest 请求对象
     * @return SyncInvoker<CreateCallVerifyRequest, CreateCallVerifyResponse>
     */
    public SyncInvoker<CreateCallVerifyRequest, CreateCallVerifyResponse> createCallVerifyInvoker(
        CreateCallVerifyRequest request) {
        return new SyncInvoker<>(request, VoiceCallMeta.createCallVerify, hcClient);
    }

}

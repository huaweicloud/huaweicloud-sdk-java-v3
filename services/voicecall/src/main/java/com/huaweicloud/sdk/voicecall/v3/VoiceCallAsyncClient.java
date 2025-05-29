package com.huaweicloud.sdk.voicecall.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class VoiceCallAsyncClient {

    protected HcClient hcClient;

    public VoiceCallAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<VoiceCallAsyncClient> newBuilder() {
        ClientBuilder<VoiceCallAsyncClient> clientBuilder = new ClientBuilder<>(VoiceCallAsyncClient::new);
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
     * @return CompletableFuture<CreateCallBackResponse>
     */
    public CompletableFuture<CreateCallBackResponse> createCallBackAsync(CreateCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, VoiceCallMeta.createCallBack);
    }

    /**
     * 语音回呼
     *
     * 语音回呼
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallBackRequest 请求对象
     * @return AsyncInvoker<CreateCallBackRequest, CreateCallBackResponse>
     */
    public AsyncInvoker<CreateCallBackRequest, CreateCallBackResponse> createCallBackAsyncInvoker(
        CreateCallBackRequest request) {
        return new AsyncInvoker<>(request, VoiceCallMeta.createCallBack, hcClient);
    }

    /**
     * 获取录音文件URL
     *
     * 获取录音文件URL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceRecordRequest 请求对象
     * @return CompletableFuture<ShowVoiceRecordResponse>
     */
    public CompletableFuture<ShowVoiceRecordResponse> showVoiceRecordAsync(ShowVoiceRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, VoiceCallMeta.showVoiceRecord);
    }

    /**
     * 获取录音文件URL
     *
     * 获取录音文件URL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVoiceRecordRequest 请求对象
     * @return AsyncInvoker<ShowVoiceRecordRequest, ShowVoiceRecordResponse>
     */
    public AsyncInvoker<ShowVoiceRecordRequest, ShowVoiceRecordResponse> showVoiceRecordAsyncInvoker(
        ShowVoiceRecordRequest request) {
        return new AsyncInvoker<>(request, VoiceCallMeta.showVoiceRecord, hcClient);
    }

    /**
     * 终止呼叫
     *
     * 终止呼叫
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCallBackRequest 请求对象
     * @return CompletableFuture<StopCallBackResponse>
     */
    public CompletableFuture<StopCallBackResponse> stopCallBackAsync(StopCallBackRequest request) {
        return hcClient.asyncInvokeHttp(request, VoiceCallMeta.stopCallBack);
    }

    /**
     * 终止呼叫
     *
     * 终止呼叫
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopCallBackRequest 请求对象
     * @return AsyncInvoker<StopCallBackRequest, StopCallBackResponse>
     */
    public AsyncInvoker<StopCallBackRequest, StopCallBackResponse> stopCallBackAsyncInvoker(
        StopCallBackRequest request) {
        return new AsyncInvoker<>(request, VoiceCallMeta.stopCallBack, hcClient);
    }

    /**
     * 语音通知
     *
     * 语音通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallNotifyRequest 请求对象
     * @return CompletableFuture<CreateCallNotifyResponse>
     */
    public CompletableFuture<CreateCallNotifyResponse> createCallNotifyAsync(CreateCallNotifyRequest request) {
        return hcClient.asyncInvokeHttp(request, VoiceCallMeta.createCallNotify);
    }

    /**
     * 语音通知
     *
     * 语音通知
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallNotifyRequest 请求对象
     * @return AsyncInvoker<CreateCallNotifyRequest, CreateCallNotifyResponse>
     */
    public AsyncInvoker<CreateCallNotifyRequest, CreateCallNotifyResponse> createCallNotifyAsyncInvoker(
        CreateCallNotifyRequest request) {
        return new AsyncInvoker<>(request, VoiceCallMeta.createCallNotify, hcClient);
    }

    /**
     * 语音验证码
     *
     * 语音验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallVerifyRequest 请求对象
     * @return CompletableFuture<CreateCallVerifyResponse>
     */
    public CompletableFuture<CreateCallVerifyResponse> createCallVerifyAsync(CreateCallVerifyRequest request) {
        return hcClient.asyncInvokeHttp(request, VoiceCallMeta.createCallVerify);
    }

    /**
     * 语音验证码
     *
     * 语音验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCallVerifyRequest 请求对象
     * @return AsyncInvoker<CreateCallVerifyRequest, CreateCallVerifyResponse>
     */
    public AsyncInvoker<CreateCallVerifyRequest, CreateCallVerifyResponse> createCallVerifyAsyncInvoker(
        CreateCallVerifyRequest request) {
        return new AsyncInvoker<>(request, VoiceCallMeta.createCallVerify, hcClient);
    }

}

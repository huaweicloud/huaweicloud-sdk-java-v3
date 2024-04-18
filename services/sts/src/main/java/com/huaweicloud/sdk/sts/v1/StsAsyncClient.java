package com.huaweicloud.sdk.sts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageRequest;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageResponse;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityRequest;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityResponse;

import java.util.concurrent.CompletableFuture;

public class StsAsyncClient {

    protected HcClient hcClient;

    public StsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<StsAsyncClient> newBuilder() {
        ClientBuilder<StsAsyncClient> clientBuilder = new ClientBuilder<>(StsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 解密鉴权失败的原因
     *
     * 解密鉴权失败的原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecodeAuthorizationMessageRequest 请求对象
     * @return CompletableFuture<DecodeAuthorizationMessageResponse>
     */
    public CompletableFuture<DecodeAuthorizationMessageResponse> decodeAuthorizationMessageAsync(
        DecodeAuthorizationMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.decodeAuthorizationMessage);
    }

    /**
     * 解密鉴权失败的原因
     *
     * 解密鉴权失败的原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecodeAuthorizationMessageRequest 请求对象
     * @return AsyncInvoker<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse>
     */
    public AsyncInvoker<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse> decodeAuthorizationMessageAsyncInvoker(
        DecodeAuthorizationMessageRequest request) {
        return new AsyncInvoker<>(request, StsMeta.decodeAuthorizationMessage, hcClient);
    }

    /**
     * 获取调用者身份信息
     *
     * 获取调用者（华为云用户，代理等）身份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCallerIdentityRequest 请求对象
     * @return CompletableFuture<GetCallerIdentityResponse>
     */
    public CompletableFuture<GetCallerIdentityResponse> getCallerIdentityAsync(GetCallerIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.getCallerIdentity);
    }

    /**
     * 获取调用者身份信息
     *
     * 获取调用者（华为云用户，代理等）身份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCallerIdentityRequest 请求对象
     * @return AsyncInvoker<GetCallerIdentityRequest, GetCallerIdentityResponse>
     */
    public AsyncInvoker<GetCallerIdentityRequest, GetCallerIdentityResponse> getCallerIdentityAsyncInvoker(
        GetCallerIdentityRequest request) {
        return new AsyncInvoker<>(request, StsMeta.getCallerIdentity, hcClient);
    }

}

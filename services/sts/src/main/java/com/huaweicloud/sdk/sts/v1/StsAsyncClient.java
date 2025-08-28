package com.huaweicloud.sdk.sts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyRequest;
import com.huaweicloud.sdk.sts.v1.model.AssumeAgencyResponse;
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
     * 通过委托或者信任委托获取临时安全凭证
     *
     * 通过委托或者信任委托获取临时安全凭证，临时安全凭证可用于对云资源发起访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyRequest 请求对象
     * @return CompletableFuture<AssumeAgencyResponse>
     */
    public CompletableFuture<AssumeAgencyResponse> assumeAgencyAsync(AssumeAgencyRequest request) {
        return hcClient.asyncInvokeHttp(request, StsMeta.assumeAgency);
    }

    /**
     * 通过委托或者信任委托获取临时安全凭证
     *
     * 通过委托或者信任委托获取临时安全凭证，临时安全凭证可用于对云资源发起访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssumeAgencyRequest 请求对象
     * @return AsyncInvoker<AssumeAgencyRequest, AssumeAgencyResponse>
     */
    public AsyncInvoker<AssumeAgencyRequest, AssumeAgencyResponse> assumeAgencyAsyncInvoker(
        AssumeAgencyRequest request) {
        return new AsyncInvoker<>(request, StsMeta.assumeAgency, hcClient);
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
     * 获取调用者（用户，委托等）身份信息。
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
     * 获取调用者（用户，委托等）身份信息。
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

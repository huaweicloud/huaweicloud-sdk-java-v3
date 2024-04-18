package com.huaweicloud.sdk.sts.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageRequest;
import com.huaweicloud.sdk.sts.v1.model.DecodeAuthorizationMessageResponse;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityRequest;
import com.huaweicloud.sdk.sts.v1.model.GetCallerIdentityResponse;

public class StsClient {

    protected HcClient hcClient;

    public StsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<StsClient> newBuilder() {
        ClientBuilder<StsClient> clientBuilder = new ClientBuilder<>(StsClient::new);
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
     * @return DecodeAuthorizationMessageResponse
     */
    public DecodeAuthorizationMessageResponse decodeAuthorizationMessage(DecodeAuthorizationMessageRequest request) {
        return hcClient.syncInvokeHttp(request, StsMeta.decodeAuthorizationMessage);
    }

    /**
     * 解密鉴权失败的原因
     *
     * 解密鉴权失败的原因。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DecodeAuthorizationMessageRequest 请求对象
     * @return SyncInvoker<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse>
     */
    public SyncInvoker<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResponse> decodeAuthorizationMessageInvoker(
        DecodeAuthorizationMessageRequest request) {
        return new SyncInvoker<>(request, StsMeta.decodeAuthorizationMessage, hcClient);
    }

    /**
     * 获取调用者身份信息
     *
     * 获取调用者（华为云用户，代理等）身份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCallerIdentityRequest 请求对象
     * @return GetCallerIdentityResponse
     */
    public GetCallerIdentityResponse getCallerIdentity(GetCallerIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, StsMeta.getCallerIdentity);
    }

    /**
     * 获取调用者身份信息
     *
     * 获取调用者（华为云用户，代理等）身份信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetCallerIdentityRequest 请求对象
     * @return SyncInvoker<GetCallerIdentityRequest, GetCallerIdentityResponse>
     */
    public SyncInvoker<GetCallerIdentityRequest, GetCallerIdentityResponse> getCallerIdentityInvoker(
        GetCallerIdentityRequest request) {
        return new SyncInvoker<>(request, StsMeta.getCallerIdentity, hcClient);
    }

}

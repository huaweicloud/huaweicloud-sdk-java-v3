package com.huaweicloud.sdk.orgid.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenRequest;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenResponse;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2UserInfoRequest;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2UserInfoResponse;
import com.huaweicloud.sdk.orgid.v1.model.ValidateServiceRequest;
import com.huaweicloud.sdk.orgid.v1.model.ValidateServiceResponse;

import java.util.concurrent.CompletableFuture;

public class OrgIDAsyncClient {

    protected HcClient hcClient;

    public OrgIDAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OrgIDAsyncClient> newBuilder() {
        ClientBuilder<OrgIDAsyncClient> clientBuilder = new ClientBuilder<>(OrgIDAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 验证票据接口
     *
     * CAS 3.0验证票据接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateServiceRequest 请求对象
     * @return CompletableFuture<ValidateServiceResponse>
     */
    public CompletableFuture<ValidateServiceResponse> validateServiceAsync(ValidateServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, OrgIDMeta.validateService);
    }

    /**
     * 验证票据接口
     *
     * CAS 3.0验证票据接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateServiceRequest 请求对象
     * @return AsyncInvoker<ValidateServiceRequest, ValidateServiceResponse>
     */
    public AsyncInvoker<ValidateServiceRequest, ValidateServiceResponse> validateServiceAsyncInvoker(
        ValidateServiceRequest request) {
        return new AsyncInvoker<>(request, OrgIDMeta.validateService, hcClient);
    }

    /**
     * 用户级Token获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2TokenRequest 请求对象
     * @return CompletableFuture<ShowOauth2TokenResponse>
     */
    public CompletableFuture<ShowOauth2TokenResponse> showOauth2TokenAsync(ShowOauth2TokenRequest request) {
        return hcClient.asyncInvokeHttp(request, OrgIDMeta.showOauth2Token);
    }

    /**
     * 用户级Token获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2TokenRequest 请求对象
     * @return AsyncInvoker<ShowOauth2TokenRequest, ShowOauth2TokenResponse>
     */
    public AsyncInvoker<ShowOauth2TokenRequest, ShowOauth2TokenResponse> showOauth2TokenAsyncInvoker(
        ShowOauth2TokenRequest request) {
        return new AsyncInvoker<>(request, OrgIDMeta.showOauth2Token, hcClient);
    }

    /**
     * 用户信息获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2UserInfoRequest 请求对象
     * @return CompletableFuture<ShowOauth2UserInfoResponse>
     */
    public CompletableFuture<ShowOauth2UserInfoResponse> showOauth2UserInfoAsync(ShowOauth2UserInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, OrgIDMeta.showOauth2UserInfo);
    }

    /**
     * 用户信息获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2UserInfoRequest 请求对象
     * @return AsyncInvoker<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse>
     */
    public AsyncInvoker<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse> showOauth2UserInfoAsyncInvoker(
        ShowOauth2UserInfoRequest request) {
        return new AsyncInvoker<>(request, OrgIDMeta.showOauth2UserInfo, hcClient);
    }

}

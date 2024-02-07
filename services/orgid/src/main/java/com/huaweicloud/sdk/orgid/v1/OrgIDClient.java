package com.huaweicloud.sdk.orgid.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenRequest;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2TokenResponse;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2UserInfoRequest;
import com.huaweicloud.sdk.orgid.v1.model.ShowOauth2UserInfoResponse;
import com.huaweicloud.sdk.orgid.v1.model.ValidateServiceRequest;
import com.huaweicloud.sdk.orgid.v1.model.ValidateServiceResponse;

public class OrgIDClient {

    protected HcClient hcClient;

    public OrgIDClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<OrgIDClient> newBuilder() {
        ClientBuilder<OrgIDClient> clientBuilder = new ClientBuilder<>(OrgIDClient::new, "GlobalCredentials");
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
     * @return ValidateServiceResponse
     */
    public ValidateServiceResponse validateService(ValidateServiceRequest request) {
        return hcClient.syncInvokeHttp(request, OrgIDMeta.validateService);
    }

    /**
     * 验证票据接口
     *
     * CAS 3.0验证票据接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateServiceRequest 请求对象
     * @return SyncInvoker<ValidateServiceRequest, ValidateServiceResponse>
     */
    public SyncInvoker<ValidateServiceRequest, ValidateServiceResponse> validateServiceInvoker(
        ValidateServiceRequest request) {
        return new SyncInvoker<>(request, OrgIDMeta.validateService, hcClient);
    }

    /**
     * 用户级Token获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2TokenRequest 请求对象
     * @return ShowOauth2TokenResponse
     */
    public ShowOauth2TokenResponse showOauth2Token(ShowOauth2TokenRequest request) {
        return hcClient.syncInvokeHttp(request, OrgIDMeta.showOauth2Token);
    }

    /**
     * 用户级Token获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2TokenRequest 请求对象
     * @return SyncInvoker<ShowOauth2TokenRequest, ShowOauth2TokenResponse>
     */
    public SyncInvoker<ShowOauth2TokenRequest, ShowOauth2TokenResponse> showOauth2TokenInvoker(
        ShowOauth2TokenRequest request) {
        return new SyncInvoker<>(request, OrgIDMeta.showOauth2Token, hcClient);
    }

    /**
     * 用户信息获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2UserInfoRequest 请求对象
     * @return ShowOauth2UserInfoResponse
     */
    public ShowOauth2UserInfoResponse showOauth2UserInfo(ShowOauth2UserInfoRequest request) {
        return hcClient.syncInvokeHttp(request, OrgIDMeta.showOauth2UserInfo);
    }

    /**
     * 用户信息获取
     *
     * 用户级Token获取
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOauth2UserInfoRequest 请求对象
     * @return SyncInvoker<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse>
     */
    public SyncInvoker<ShowOauth2UserInfoRequest, ShowOauth2UserInfoResponse> showOauth2UserInfoInvoker(
        ShowOauth2UserInfoRequest request) {
        return new SyncInvoker<>(request, OrgIDMeta.showOauth2UserInfo, hcClient);
    }

}

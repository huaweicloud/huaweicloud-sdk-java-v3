package com.huaweicloud.sdk.identitycenteroidc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenResponse;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientResponse;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationResponse;

public class IdentityCenterOIDCClient {

    protected HcClient hcClient;

    public IdentityCenterOIDCClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterOIDCClient> newBuilder() {
        ClientBuilder<IdentityCenterOIDCClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterOIDCClient::new, "IdentityCenterOIDCCredentials");
        return clientBuilder;
    }

    /**
     * 注册客户端
     *
     * 向IAM身份中心注册客户端，这允许客户端启动设备授权，输出应该持久化以便于身份验证请求重用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClientRequest 请求对象
     * @return RegisterClientResponse
     */
    public RegisterClientResponse registerClient(RegisterClientRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterOIDCMeta.registerClient);
    }

    /**
     * 注册客户端
     *
     * 向IAM身份中心注册客户端，这允许客户端启动设备授权，输出应该持久化以便于身份验证请求重用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClientRequest 请求对象
     * @return SyncInvoker<RegisterClientRequest, RegisterClientResponse>
     */
    public SyncInvoker<RegisterClientRequest, RegisterClientResponse> registerClientInvoker(
        RegisterClientRequest request) {
        return new SyncInvoker<>(request, IdentityCenterOIDCMeta.registerClient, hcClient);
    }

    /**
     * 请求设备授权
     *
     * 发起设备授权请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeviceAuthorizationRequest 请求对象
     * @return StartDeviceAuthorizationResponse
     */
    public StartDeviceAuthorizationResponse startDeviceAuthorization(StartDeviceAuthorizationRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterOIDCMeta.startDeviceAuthorization);
    }

    /**
     * 请求设备授权
     *
     * 发起设备授权请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeviceAuthorizationRequest 请求对象
     * @return SyncInvoker<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse>
     */
    public SyncInvoker<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse> startDeviceAuthorizationInvoker(
        StartDeviceAuthorizationRequest request) {
        return new SyncInvoker<>(request, IdentityCenterOIDCMeta.startDeviceAuthorization, hcClient);
    }

    /**
     * 创建令牌
     *
     * 获取访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenRequest 请求对象
     * @return CreateTokenResponse
     */
    public CreateTokenResponse createToken(CreateTokenRequest request) {
        return hcClient.syncInvokeHttp(request, IdentityCenterOIDCMeta.createToken);
    }

    /**
     * 创建令牌
     *
     * 获取访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenRequest 请求对象
     * @return SyncInvoker<CreateTokenRequest, CreateTokenResponse>
     */
    public SyncInvoker<CreateTokenRequest, CreateTokenResponse> createTokenInvoker(CreateTokenRequest request) {
        return new SyncInvoker<>(request, IdentityCenterOIDCMeta.createToken, hcClient);
    }

}

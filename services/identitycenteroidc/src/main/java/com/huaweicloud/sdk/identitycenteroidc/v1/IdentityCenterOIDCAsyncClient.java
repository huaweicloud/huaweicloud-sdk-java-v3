package com.huaweicloud.sdk.identitycenteroidc.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.CreateTokenResponse;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.RegisterClientResponse;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationRequest;
import com.huaweicloud.sdk.identitycenteroidc.v1.model.StartDeviceAuthorizationResponse;

import java.util.concurrent.CompletableFuture;

public class IdentityCenterOIDCAsyncClient {

    protected HcClient hcClient;

    public IdentityCenterOIDCAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdentityCenterOIDCAsyncClient> newBuilder() {
        ClientBuilder<IdentityCenterOIDCAsyncClient> clientBuilder =
            new ClientBuilder<>(IdentityCenterOIDCAsyncClient::new, "IdentityCenterOIDCCredentials");
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
     * @return CompletableFuture<RegisterClientResponse>
     */
    public CompletableFuture<RegisterClientResponse> registerClientAsync(RegisterClientRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterOIDCMeta.registerClient);
    }

    /**
     * 注册客户端
     *
     * 向IAM身份中心注册客户端，这允许客户端启动设备授权，输出应该持久化以便于身份验证请求重用
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterClientRequest 请求对象
     * @return AsyncInvoker<RegisterClientRequest, RegisterClientResponse>
     */
    public AsyncInvoker<RegisterClientRequest, RegisterClientResponse> registerClientAsyncInvoker(
        RegisterClientRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterOIDCMeta.registerClient, hcClient);
    }

    /**
     * 请求设备授权
     *
     * 发起设备授权请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeviceAuthorizationRequest 请求对象
     * @return CompletableFuture<StartDeviceAuthorizationResponse>
     */
    public CompletableFuture<StartDeviceAuthorizationResponse> startDeviceAuthorizationAsync(
        StartDeviceAuthorizationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterOIDCMeta.startDeviceAuthorization);
    }

    /**
     * 请求设备授权
     *
     * 发起设备授权请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDeviceAuthorizationRequest 请求对象
     * @return AsyncInvoker<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse>
     */
    public AsyncInvoker<StartDeviceAuthorizationRequest, StartDeviceAuthorizationResponse> startDeviceAuthorizationAsyncInvoker(
        StartDeviceAuthorizationRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterOIDCMeta.startDeviceAuthorization, hcClient);
    }

    /**
     * 创建令牌
     *
     * 获取访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenRequest 请求对象
     * @return CompletableFuture<CreateTokenResponse>
     */
    public CompletableFuture<CreateTokenResponse> createTokenAsync(CreateTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, IdentityCenterOIDCMeta.createToken);
    }

    /**
     * 创建令牌
     *
     * 获取访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTokenRequest 请求对象
     * @return AsyncInvoker<CreateTokenRequest, CreateTokenResponse>
     */
    public AsyncInvoker<CreateTokenRequest, CreateTokenResponse> createTokenAsyncInvoker(CreateTokenRequest request) {
        return new AsyncInvoker<>(request, IdentityCenterOIDCMeta.createToken, hcClient);
    }

}

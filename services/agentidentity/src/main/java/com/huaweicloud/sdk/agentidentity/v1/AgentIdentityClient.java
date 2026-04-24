package com.huaweicloud.sdk.agentidentity.v1;

import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForJwtRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForJwtResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForUserIdRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForUserIdResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadIdentityResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteWorkloadIdentityResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceApiKeyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceApiKeyResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceOauth2TokenRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceOauth2TokenResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceStsTokenRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceStsTokenResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetTokenVaultRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetTokenVaultResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetWorkloadIdentityAuthorizerConfigurationRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetWorkloadIdentityAuthorizerConfigurationResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetWorkloadIdentityResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListApiKeyCredentialProvidersRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListApiKeyCredentialProvidersResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListOauth2CredentialProvidersRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListOauth2CredentialProvidersResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListStsCredentialProvidersRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListStsCredentialProvidersResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListWorkloadIdentitiesRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListWorkloadIdentitiesResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.Oauth2AuthorizeRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.Oauth2AuthorizeResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.Oauth2CallbackRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.Oauth2CallbackResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class AgentIdentityClient {

    protected HcClient hcClient;

    public AgentIdentityClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AgentIdentityClient> newBuilder() {
        ClientBuilder<AgentIdentityClient> clientBuilder = new ClientBuilder<>(AgentIdentityClient::new);
        return clientBuilder;
    }

    /**
     * 创建API密钥凭证提供者
     *
     * Creates a new API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiKeyCredentialProviderRequest 请求对象
     * @return CreateApiKeyCredentialProviderResponse
     */
    public CreateApiKeyCredentialProviderResponse createApiKeyCredentialProvider(
        CreateApiKeyCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createApiKeyCredentialProvider);
    }

    /**
     * 创建API密钥凭证提供者
     *
     * Creates a new API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiKeyCredentialProviderRequest 请求对象
     * @return SyncInvoker<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse>
     */
    public SyncInvoker<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse> createApiKeyCredentialProviderInvoker(
        CreateApiKeyCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createApiKeyCredentialProvider, hcClient);
    }

    /**
     * 删除API密钥凭证提供者
     *
     * Deletes an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiKeyCredentialProviderRequest 请求对象
     * @return DeleteApiKeyCredentialProviderResponse
     */
    public DeleteApiKeyCredentialProviderResponse deleteApiKeyCredentialProvider(
        DeleteApiKeyCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.deleteApiKeyCredentialProvider);
    }

    /**
     * 删除API密钥凭证提供者
     *
     * Deletes an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiKeyCredentialProviderRequest 请求对象
     * @return SyncInvoker<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse>
     */
    public SyncInvoker<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse> deleteApiKeyCredentialProviderInvoker(
        DeleteApiKeyCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.deleteApiKeyCredentialProvider, hcClient);
    }

    /**
     * 查询API密钥凭证提供者详情
     *
     * Gets details of an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApiKeyCredentialProviderRequest 请求对象
     * @return GetApiKeyCredentialProviderResponse
     */
    public GetApiKeyCredentialProviderResponse getApiKeyCredentialProvider(GetApiKeyCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getApiKeyCredentialProvider);
    }

    /**
     * 查询API密钥凭证提供者详情
     *
     * Gets details of an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApiKeyCredentialProviderRequest 请求对象
     * @return SyncInvoker<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse>
     */
    public SyncInvoker<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse> getApiKeyCredentialProviderInvoker(
        GetApiKeyCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getApiKeyCredentialProvider, hcClient);
    }

    /**
     * 查询API密钥凭证提供者列表
     *
     * Lists API key credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiKeyCredentialProvidersRequest 请求对象
     * @return ListApiKeyCredentialProvidersResponse
     */
    public ListApiKeyCredentialProvidersResponse listApiKeyCredentialProviders(
        ListApiKeyCredentialProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.listApiKeyCredentialProviders);
    }

    /**
     * 查询API密钥凭证提供者列表
     *
     * Lists API key credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiKeyCredentialProvidersRequest 请求对象
     * @return SyncInvoker<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse>
     */
    public SyncInvoker<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse> listApiKeyCredentialProvidersInvoker(
        ListApiKeyCredentialProvidersRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.listApiKeyCredentialProviders, hcClient);
    }

    /**
     * 更新API密钥凭证提供者
     *
     * Updates the API key of an existing API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiKeyCredentialProviderRequest 请求对象
     * @return UpdateApiKeyCredentialProviderResponse
     */
    public UpdateApiKeyCredentialProviderResponse updateApiKeyCredentialProvider(
        UpdateApiKeyCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.updateApiKeyCredentialProvider);
    }

    /**
     * 更新API密钥凭证提供者
     *
     * Updates the API key of an existing API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiKeyCredentialProviderRequest 请求对象
     * @return SyncInvoker<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse>
     */
    public SyncInvoker<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse> updateApiKeyCredentialProviderInvoker(
        UpdateApiKeyCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.updateApiKeyCredentialProvider, hcClient);
    }

    /**
     * Confirm user authentication session for OAuth2.0 tokens
     *
     * Confirms the user authentication session to obtain OAuth2.0 tokens for a resource
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompleteResourceTokenAuthRequest 请求对象
     * @return CompleteResourceTokenAuthResponse
     */
    public CompleteResourceTokenAuthResponse completeResourceTokenAuth(CompleteResourceTokenAuthRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.completeResourceTokenAuth);
    }

    /**
     * Confirm user authentication session for OAuth2.0 tokens
     *
     * Confirms the user authentication session to obtain OAuth2.0 tokens for a resource
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompleteResourceTokenAuthRequest 请求对象
     * @return SyncInvoker<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse>
     */
    public SyncInvoker<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse> completeResourceTokenAuthInvoker(
        CompleteResourceTokenAuthRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.completeResourceTokenAuth, hcClient);
    }

    /**
     * Retrieve API key from resource credential provider
     *
     * Retrieves the API key associated with a specified resource credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceApiKeyRequest 请求对象
     * @return GetResourceApiKeyResponse
     */
    public GetResourceApiKeyResponse getResourceApiKey(GetResourceApiKeyRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getResourceApiKey);
    }

    /**
     * Retrieve API key from resource credential provider
     *
     * Retrieves the API key associated with a specified resource credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceApiKeyRequest 请求对象
     * @return SyncInvoker<GetResourceApiKeyRequest, GetResourceApiKeyResponse>
     */
    public SyncInvoker<GetResourceApiKeyRequest, GetResourceApiKeyResponse> getResourceApiKeyInvoker(
        GetResourceApiKeyRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getResourceApiKey, hcClient);
    }

    /**
     * Retrieve OAuth2.0 token from resource credential provider
     *
     * Returns the OAuth2.0 token for the specified resource using the configured flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceOauth2TokenRequest 请求对象
     * @return GetResourceOauth2TokenResponse
     */
    public GetResourceOauth2TokenResponse getResourceOauth2Token(GetResourceOauth2TokenRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getResourceOauth2Token);
    }

    /**
     * Retrieve OAuth2.0 token from resource credential provider
     *
     * Returns the OAuth2.0 token for the specified resource using the configured flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceOauth2TokenRequest 请求对象
     * @return SyncInvoker<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse>
     */
    public SyncInvoker<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse> getResourceOauth2TokenInvoker(
        GetResourceOauth2TokenRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getResourceOauth2Token, hcClient);
    }

    /**
     * Retrieve STS credentials from STS credential provider
     *
     * Retrieves temporary STS credentials from a specified STS credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceStsTokenRequest 请求对象
     * @return GetResourceStsTokenResponse
     */
    public GetResourceStsTokenResponse getResourceStsToken(GetResourceStsTokenRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getResourceStsToken);
    }

    /**
     * Retrieve STS credentials from STS credential provider
     *
     * Retrieves temporary STS credentials from a specified STS credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceStsTokenRequest 请求对象
     * @return SyncInvoker<GetResourceStsTokenRequest, GetResourceStsTokenResponse>
     */
    public SyncInvoker<GetResourceStsTokenRequest, GetResourceStsTokenResponse> getResourceStsTokenInvoker(
        GetResourceStsTokenRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getResourceStsToken, hcClient);
    }

    /**
     * OAuth2.0 Pushed Authorization Request (PAR) standard authorize API
     *
     * Core OAuth2 authorization endpoint following RFC 9126 PAR spec, only accepts authorization request via request_uri parameter to trigger user authorization flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2AuthorizeRequest 请求对象
     * @return Oauth2AuthorizeResponse
     */
    public Oauth2AuthorizeResponse oauth2Authorize(Oauth2AuthorizeRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.oauth2Authorize);
    }

    /**
     * OAuth2.0 Pushed Authorization Request (PAR) standard authorize API
     *
     * Core OAuth2 authorization endpoint following RFC 9126 PAR spec, only accepts authorization request via request_uri parameter to trigger user authorization flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2AuthorizeRequest 请求对象
     * @return SyncInvoker<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse>
     */
    public SyncInvoker<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse> oauth2AuthorizeInvoker(
        Oauth2AuthorizeRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.oauth2Authorize, hcClient);
    }

    /**
     * OAuth2.0 Standard Authorization Callback API
     *
     * OAuth2 redirect callback endpoint to receive authorization result after user consent/denial
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2CallbackRequest 请求对象
     * @return Oauth2CallbackResponse
     */
    public Oauth2CallbackResponse oauth2Callback(Oauth2CallbackRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.oauth2Callback);
    }

    /**
     * OAuth2.0 Standard Authorization Callback API
     *
     * OAuth2 redirect callback endpoint to receive authorization result after user consent/denial
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2CallbackRequest 请求对象
     * @return SyncInvoker<Oauth2CallbackRequest, Oauth2CallbackResponse>
     */
    public SyncInvoker<Oauth2CallbackRequest, Oauth2CallbackResponse> oauth2CallbackInvoker(
        Oauth2CallbackRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.oauth2Callback, hcClient);
    }

    /**
     * 创建OAuth2凭证提供者
     *
     * Creates a new OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOauth2CredentialProviderRequest 请求对象
     * @return CreateOauth2CredentialProviderResponse
     */
    public CreateOauth2CredentialProviderResponse createOauth2CredentialProvider(
        CreateOauth2CredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createOauth2CredentialProvider);
    }

    /**
     * 创建OAuth2凭证提供者
     *
     * Creates a new OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOauth2CredentialProviderRequest 请求对象
     * @return SyncInvoker<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse>
     */
    public SyncInvoker<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse> createOauth2CredentialProviderInvoker(
        CreateOauth2CredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createOauth2CredentialProvider, hcClient);
    }

    /**
     * 删除OAuth2凭证提供者
     *
     * Deletes an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOauth2CredentialProviderRequest 请求对象
     * @return DeleteOauth2CredentialProviderResponse
     */
    public DeleteOauth2CredentialProviderResponse deleteOauth2CredentialProvider(
        DeleteOauth2CredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.deleteOauth2CredentialProvider);
    }

    /**
     * 删除OAuth2凭证提供者
     *
     * Deletes an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOauth2CredentialProviderRequest 请求对象
     * @return SyncInvoker<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse>
     */
    public SyncInvoker<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse> deleteOauth2CredentialProviderInvoker(
        DeleteOauth2CredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.deleteOauth2CredentialProvider, hcClient);
    }

    /**
     * 查询OAuth2凭证提供者详情
     *
     * Gets details of an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetOauth2CredentialProviderRequest 请求对象
     * @return GetOauth2CredentialProviderResponse
     */
    public GetOauth2CredentialProviderResponse getOauth2CredentialProvider(GetOauth2CredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getOauth2CredentialProvider);
    }

    /**
     * 查询OAuth2凭证提供者详情
     *
     * Gets details of an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetOauth2CredentialProviderRequest 请求对象
     * @return SyncInvoker<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse>
     */
    public SyncInvoker<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse> getOauth2CredentialProviderInvoker(
        GetOauth2CredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getOauth2CredentialProvider, hcClient);
    }

    /**
     * 查询OAuth2凭证提供者列表
     *
     * Lists OAuth2 credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOauth2CredentialProvidersRequest 请求对象
     * @return ListOauth2CredentialProvidersResponse
     */
    public ListOauth2CredentialProvidersResponse listOauth2CredentialProviders(
        ListOauth2CredentialProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.listOauth2CredentialProviders);
    }

    /**
     * 查询OAuth2凭证提供者列表
     *
     * Lists OAuth2 credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOauth2CredentialProvidersRequest 请求对象
     * @return SyncInvoker<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse>
     */
    public SyncInvoker<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse> listOauth2CredentialProvidersInvoker(
        ListOauth2CredentialProvidersRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.listOauth2CredentialProviders, hcClient);
    }

    /**
     * 更新OAuth2凭证提供者
     *
     * Updates an existing OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOauth2CredentialProviderRequest 请求对象
     * @return UpdateOauth2CredentialProviderResponse
     */
    public UpdateOauth2CredentialProviderResponse updateOauth2CredentialProvider(
        UpdateOauth2CredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.updateOauth2CredentialProvider);
    }

    /**
     * 更新OAuth2凭证提供者
     *
     * Updates an existing OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOauth2CredentialProviderRequest 请求对象
     * @return SyncInvoker<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse>
     */
    public SyncInvoker<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse> updateOauth2CredentialProviderInvoker(
        UpdateOauth2CredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.updateOauth2CredentialProvider, hcClient);
    }

    /**
     * 创建STS凭证提供者
     *
     * Creates a new STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStsCredentialProviderRequest 请求对象
     * @return CreateStsCredentialProviderResponse
     */
    public CreateStsCredentialProviderResponse createStsCredentialProvider(CreateStsCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createStsCredentialProvider);
    }

    /**
     * 创建STS凭证提供者
     *
     * Creates a new STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStsCredentialProviderRequest 请求对象
     * @return SyncInvoker<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse>
     */
    public SyncInvoker<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse> createStsCredentialProviderInvoker(
        CreateStsCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createStsCredentialProvider, hcClient);
    }

    /**
     * 删除STS凭证提供者
     *
     * Deletes an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStsCredentialProviderRequest 请求对象
     * @return DeleteStsCredentialProviderResponse
     */
    public DeleteStsCredentialProviderResponse deleteStsCredentialProvider(DeleteStsCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.deleteStsCredentialProvider);
    }

    /**
     * 删除STS凭证提供者
     *
     * Deletes an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStsCredentialProviderRequest 请求对象
     * @return SyncInvoker<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse>
     */
    public SyncInvoker<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse> deleteStsCredentialProviderInvoker(
        DeleteStsCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.deleteStsCredentialProvider, hcClient);
    }

    /**
     * 查询STS凭证提供者详情
     *
     * Gets details of an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStsCredentialProviderRequest 请求对象
     * @return GetStsCredentialProviderResponse
     */
    public GetStsCredentialProviderResponse getStsCredentialProvider(GetStsCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getStsCredentialProvider);
    }

    /**
     * 查询STS凭证提供者详情
     *
     * Gets details of an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStsCredentialProviderRequest 请求对象
     * @return SyncInvoker<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse>
     */
    public SyncInvoker<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse> getStsCredentialProviderInvoker(
        GetStsCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getStsCredentialProvider, hcClient);
    }

    /**
     * 查询STS凭证提供者列表
     *
     * Lists STS credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStsCredentialProvidersRequest 请求对象
     * @return ListStsCredentialProvidersResponse
     */
    public ListStsCredentialProvidersResponse listStsCredentialProviders(ListStsCredentialProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.listStsCredentialProviders);
    }

    /**
     * 查询STS凭证提供者列表
     *
     * Lists STS credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStsCredentialProvidersRequest 请求对象
     * @return SyncInvoker<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse>
     */
    public SyncInvoker<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse> listStsCredentialProvidersInvoker(
        ListStsCredentialProvidersRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.listStsCredentialProviders, hcClient);
    }

    /**
     * 更新STS凭证提供者
     *
     * Updates an existing STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStsCredentialProviderRequest 请求对象
     * @return UpdateStsCredentialProviderResponse
     */
    public UpdateStsCredentialProviderResponse updateStsCredentialProvider(UpdateStsCredentialProviderRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.updateStsCredentialProvider);
    }

    /**
     * 更新STS凭证提供者
     *
     * Updates an existing STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStsCredentialProviderRequest 请求对象
     * @return SyncInvoker<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse>
     */
    public SyncInvoker<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse> updateStsCredentialProviderInvoker(
        UpdateStsCredentialProviderRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.updateStsCredentialProvider, hcClient);
    }

    /**
     * 查询令牌保管库详情
     *
     * Gets details of a token vault.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTokenVaultRequest 请求对象
     * @return GetTokenVaultResponse
     */
    public GetTokenVaultResponse getTokenVault(GetTokenVaultRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getTokenVault);
    }

    /**
     * 查询令牌保管库详情
     *
     * Gets details of a token vault.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTokenVaultRequest 请求对象
     * @return SyncInvoker<GetTokenVaultRequest, GetTokenVaultResponse>
     */
    public SyncInvoker<GetTokenVaultRequest, GetTokenVaultResponse> getTokenVaultInvoker(GetTokenVaultRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getTokenVault, hcClient);
    }

    /**
     * Create workload access token (not acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads that do not act on behalf of a user
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenRequest 请求对象
     * @return CreateWorkloadAccessTokenResponse
     */
    public CreateWorkloadAccessTokenResponse createWorkloadAccessToken(CreateWorkloadAccessTokenRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createWorkloadAccessToken);
    }

    /**
     * Create workload access token (not acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads that do not act on behalf of a user
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenRequest 请求对象
     * @return SyncInvoker<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse>
     */
    public SyncInvoker<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse> createWorkloadAccessTokenInvoker(
        CreateWorkloadAccessTokenRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createWorkloadAccessToken, hcClient);
    }

    /**
     * Create workload access token using JWT (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using a JWT token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForJwtRequest 请求对象
     * @return CreateWorkloadAccessTokenForJwtResponse
     */
    public CreateWorkloadAccessTokenForJwtResponse createWorkloadAccessTokenForJwt(
        CreateWorkloadAccessTokenForJwtRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createWorkloadAccessTokenForJwt);
    }

    /**
     * Create workload access token using JWT (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using a JWT token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForJwtRequest 请求对象
     * @return SyncInvoker<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse>
     */
    public SyncInvoker<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse> createWorkloadAccessTokenForJwtInvoker(
        CreateWorkloadAccessTokenForJwtRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createWorkloadAccessTokenForJwt, hcClient);
    }

    /**
     * Create workload access token using user ID (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using the user&#39;s ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForUserIdRequest 请求对象
     * @return CreateWorkloadAccessTokenForUserIdResponse
     */
    public CreateWorkloadAccessTokenForUserIdResponse createWorkloadAccessTokenForUserId(
        CreateWorkloadAccessTokenForUserIdRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createWorkloadAccessTokenForUserId);
    }

    /**
     * Create workload access token using user ID (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using the user&#39;s ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForUserIdRequest 请求对象
     * @return SyncInvoker<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse>
     */
    public SyncInvoker<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse> createWorkloadAccessTokenForUserIdInvoker(
        CreateWorkloadAccessTokenForUserIdRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createWorkloadAccessTokenForUserId, hcClient);
    }

    /**
     * 创建工作负载身份
     *
     * Creates a new workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadIdentityRequest 请求对象
     * @return CreateWorkloadIdentityResponse
     */
    public CreateWorkloadIdentityResponse createWorkloadIdentity(CreateWorkloadIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.createWorkloadIdentity);
    }

    /**
     * 创建工作负载身份
     *
     * Creates a new workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadIdentityRequest 请求对象
     * @return SyncInvoker<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse>
     */
    public SyncInvoker<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse> createWorkloadIdentityInvoker(
        CreateWorkloadIdentityRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.createWorkloadIdentity, hcClient);
    }

    /**
     * 删除工作负载身份
     *
     * Deletes a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadIdentityRequest 请求对象
     * @return DeleteWorkloadIdentityResponse
     */
    public DeleteWorkloadIdentityResponse deleteWorkloadIdentity(DeleteWorkloadIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.deleteWorkloadIdentity);
    }

    /**
     * 删除工作负载身份
     *
     * Deletes a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadIdentityRequest 请求对象
     * @return SyncInvoker<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse>
     */
    public SyncInvoker<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse> deleteWorkloadIdentityInvoker(
        DeleteWorkloadIdentityRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.deleteWorkloadIdentity, hcClient);
    }

    /**
     * 查询工作负载身份详情
     *
     * Gets details of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityRequest 请求对象
     * @return GetWorkloadIdentityResponse
     */
    public GetWorkloadIdentityResponse getWorkloadIdentity(GetWorkloadIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getWorkloadIdentity);
    }

    /**
     * 查询工作负载身份详情
     *
     * Gets details of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityRequest 请求对象
     * @return SyncInvoker<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse>
     */
    public SyncInvoker<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse> getWorkloadIdentityInvoker(
        GetWorkloadIdentityRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getWorkloadIdentity, hcClient);
    }

    /**
     * 查询工作负载身份的授权配置
     *
     * Gets the authorizer configuration of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityAuthorizerConfigurationRequest 请求对象
     * @return GetWorkloadIdentityAuthorizerConfigurationResponse
     */
    public GetWorkloadIdentityAuthorizerConfigurationResponse getWorkloadIdentityAuthorizerConfiguration(
        GetWorkloadIdentityAuthorizerConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.getWorkloadIdentityAuthorizerConfiguration);
    }

    /**
     * 查询工作负载身份的授权配置
     *
     * Gets the authorizer configuration of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityAuthorizerConfigurationRequest 请求对象
     * @return SyncInvoker<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse>
     */
    public SyncInvoker<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse> getWorkloadIdentityAuthorizerConfigurationInvoker(
        GetWorkloadIdentityAuthorizerConfigurationRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.getWorkloadIdentityAuthorizerConfiguration, hcClient);
    }

    /**
     * 查询工作负载身份列表
     *
     * Lists workload identities.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadIdentitiesRequest 请求对象
     * @return ListWorkloadIdentitiesResponse
     */
    public ListWorkloadIdentitiesResponse listWorkloadIdentities(ListWorkloadIdentitiesRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.listWorkloadIdentities);
    }

    /**
     * 查询工作负载身份列表
     *
     * Lists workload identities.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadIdentitiesRequest 请求对象
     * @return SyncInvoker<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse>
     */
    public SyncInvoker<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse> listWorkloadIdentitiesInvoker(
        ListWorkloadIdentitiesRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.listWorkloadIdentities, hcClient);
    }

    /**
     * 更新工作负载身份
     *
     * Updates an existing workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadIdentityRequest 请求对象
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentity(UpdateWorkloadIdentityRequest request) {
        return hcClient.syncInvokeHttp(request, AgentIdentityMeta.updateWorkloadIdentity);
    }

    /**
     * 更新工作负载身份
     *
     * Updates an existing workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadIdentityRequest 请求对象
     * @return SyncInvoker<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse>
     */
    public SyncInvoker<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse> updateWorkloadIdentityInvoker(
        UpdateWorkloadIdentityRequest request) {
        return new SyncInvoker<>(request, AgentIdentityMeta.updateWorkloadIdentity, hcClient);
    }

}

package com.huaweicloud.sdk.agentidentity.v1;

import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyEngineRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyEngineResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyResponse;
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
import com.huaweicloud.sdk.agentidentity.v1.model.DeletePolicyEngineRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeletePolicyEngineResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeletePolicyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeletePolicyResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.DeleteWorkloadIdentityResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetPolicyEngineRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetPolicyEngineResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetPolicyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetPolicyResponse;
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
import com.huaweicloud.sdk.agentidentity.v1.model.ListIdentityProvidersRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListIdentityProvidersResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListOauth2CredentialProvidersRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListOauth2CredentialProvidersResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListPoliciesRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListPoliciesResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListPolicyEngineAttachmentsRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListPolicyEngineAttachmentsResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.ListPolicyEnginesRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.ListPolicyEnginesResponse;
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
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyEngineRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyEngineResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateTokenVaultRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateTokenVaultResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class AgentIdentityAsyncClient {

    protected HcClient hcClient;

    public AgentIdentityAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<AgentIdentityAsyncClient> newBuilder() {
        ClientBuilder<AgentIdentityAsyncClient> clientBuilder = new ClientBuilder<>(AgentIdentityAsyncClient::new);
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
     * @return CompletableFuture<CreateApiKeyCredentialProviderResponse>
     */
    public CompletableFuture<CreateApiKeyCredentialProviderResponse> createApiKeyCredentialProviderAsync(
        CreateApiKeyCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createApiKeyCredentialProvider);
    }

    /**
     * 创建API密钥凭证提供者
     *
     * Creates a new API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateApiKeyCredentialProviderRequest 请求对象
     * @return AsyncInvoker<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse>
     */
    public AsyncInvoker<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse> createApiKeyCredentialProviderAsyncInvoker(
        CreateApiKeyCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createApiKeyCredentialProvider, hcClient);
    }

    /**
     * 删除API密钥凭证提供者
     *
     * Deletes an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiKeyCredentialProviderRequest 请求对象
     * @return CompletableFuture<DeleteApiKeyCredentialProviderResponse>
     */
    public CompletableFuture<DeleteApiKeyCredentialProviderResponse> deleteApiKeyCredentialProviderAsync(
        DeleteApiKeyCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.deleteApiKeyCredentialProvider);
    }

    /**
     * 删除API密钥凭证提供者
     *
     * Deletes an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteApiKeyCredentialProviderRequest 请求对象
     * @return AsyncInvoker<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse>
     */
    public AsyncInvoker<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse> deleteApiKeyCredentialProviderAsyncInvoker(
        DeleteApiKeyCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.deleteApiKeyCredentialProvider, hcClient);
    }

    /**
     * 查询API密钥凭证提供者详情
     *
     * Gets details of an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApiKeyCredentialProviderRequest 请求对象
     * @return CompletableFuture<GetApiKeyCredentialProviderResponse>
     */
    public CompletableFuture<GetApiKeyCredentialProviderResponse> getApiKeyCredentialProviderAsync(
        GetApiKeyCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getApiKeyCredentialProvider);
    }

    /**
     * 查询API密钥凭证提供者详情
     *
     * Gets details of an API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetApiKeyCredentialProviderRequest 请求对象
     * @return AsyncInvoker<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse>
     */
    public AsyncInvoker<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse> getApiKeyCredentialProviderAsyncInvoker(
        GetApiKeyCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getApiKeyCredentialProvider, hcClient);
    }

    /**
     * 查询API密钥凭证提供者列表
     *
     * Lists API key credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiKeyCredentialProvidersRequest 请求对象
     * @return CompletableFuture<ListApiKeyCredentialProvidersResponse>
     */
    public CompletableFuture<ListApiKeyCredentialProvidersResponse> listApiKeyCredentialProvidersAsync(
        ListApiKeyCredentialProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listApiKeyCredentialProviders);
    }

    /**
     * 查询API密钥凭证提供者列表
     *
     * Lists API key credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiKeyCredentialProvidersRequest 请求对象
     * @return AsyncInvoker<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse>
     */
    public AsyncInvoker<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse> listApiKeyCredentialProvidersAsyncInvoker(
        ListApiKeyCredentialProvidersRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listApiKeyCredentialProviders, hcClient);
    }

    /**
     * 更新API密钥凭证提供者
     *
     * Updates the API key of an existing API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiKeyCredentialProviderRequest 请求对象
     * @return CompletableFuture<UpdateApiKeyCredentialProviderResponse>
     */
    public CompletableFuture<UpdateApiKeyCredentialProviderResponse> updateApiKeyCredentialProviderAsync(
        UpdateApiKeyCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updateApiKeyCredentialProvider);
    }

    /**
     * 更新API密钥凭证提供者
     *
     * Updates the API key of an existing API key credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateApiKeyCredentialProviderRequest 请求对象
     * @return AsyncInvoker<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse>
     */
    public AsyncInvoker<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse> updateApiKeyCredentialProviderAsyncInvoker(
        UpdateApiKeyCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updateApiKeyCredentialProvider, hcClient);
    }

    /**
     * Confirm user authentication session for OAuth2.0 tokens
     *
     * Confirms the user authentication session to obtain OAuth2.0 tokens for a resource
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompleteResourceTokenAuthRequest 请求对象
     * @return CompletableFuture<CompleteResourceTokenAuthResponse>
     */
    public CompletableFuture<CompleteResourceTokenAuthResponse> completeResourceTokenAuthAsync(
        CompleteResourceTokenAuthRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.completeResourceTokenAuth);
    }

    /**
     * Confirm user authentication session for OAuth2.0 tokens
     *
     * Confirms the user authentication session to obtain OAuth2.0 tokens for a resource
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompleteResourceTokenAuthRequest 请求对象
     * @return AsyncInvoker<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse>
     */
    public AsyncInvoker<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse> completeResourceTokenAuthAsyncInvoker(
        CompleteResourceTokenAuthRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.completeResourceTokenAuth, hcClient);
    }

    /**
     * Retrieve API key from resource credential provider
     *
     * Retrieves the API key associated with a specified resource credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceApiKeyRequest 请求对象
     * @return CompletableFuture<GetResourceApiKeyResponse>
     */
    public CompletableFuture<GetResourceApiKeyResponse> getResourceApiKeyAsync(GetResourceApiKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getResourceApiKey);
    }

    /**
     * Retrieve API key from resource credential provider
     *
     * Retrieves the API key associated with a specified resource credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceApiKeyRequest 请求对象
     * @return AsyncInvoker<GetResourceApiKeyRequest, GetResourceApiKeyResponse>
     */
    public AsyncInvoker<GetResourceApiKeyRequest, GetResourceApiKeyResponse> getResourceApiKeyAsyncInvoker(
        GetResourceApiKeyRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getResourceApiKey, hcClient);
    }

    /**
     * Retrieve OAuth2.0 token from resource credential provider
     *
     * Returns the OAuth2.0 token for the specified resource using the configured flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceOauth2TokenRequest 请求对象
     * @return CompletableFuture<GetResourceOauth2TokenResponse>
     */
    public CompletableFuture<GetResourceOauth2TokenResponse> getResourceOauth2TokenAsync(
        GetResourceOauth2TokenRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getResourceOauth2Token);
    }

    /**
     * Retrieve OAuth2.0 token from resource credential provider
     *
     * Returns the OAuth2.0 token for the specified resource using the configured flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceOauth2TokenRequest 请求对象
     * @return AsyncInvoker<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse>
     */
    public AsyncInvoker<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse> getResourceOauth2TokenAsyncInvoker(
        GetResourceOauth2TokenRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getResourceOauth2Token, hcClient);
    }

    /**
     * Retrieve STS credentials from STS credential provider
     *
     * Retrieves temporary STS credentials from a specified STS credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceStsTokenRequest 请求对象
     * @return CompletableFuture<GetResourceStsTokenResponse>
     */
    public CompletableFuture<GetResourceStsTokenResponse> getResourceStsTokenAsync(GetResourceStsTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getResourceStsToken);
    }

    /**
     * Retrieve STS credentials from STS credential provider
     *
     * Retrieves temporary STS credentials from a specified STS credential provider
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetResourceStsTokenRequest 请求对象
     * @return AsyncInvoker<GetResourceStsTokenRequest, GetResourceStsTokenResponse>
     */
    public AsyncInvoker<GetResourceStsTokenRequest, GetResourceStsTokenResponse> getResourceStsTokenAsyncInvoker(
        GetResourceStsTokenRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getResourceStsToken, hcClient);
    }

    /**
     * 查询身份提供商
     *
     * Lists identity providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIdentityProvidersRequest 请求对象
     * @return CompletableFuture<ListIdentityProvidersResponse>
     */
    public CompletableFuture<ListIdentityProvidersResponse> listIdentityProvidersAsync(
        ListIdentityProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listIdentityProviders);
    }

    /**
     * 查询身份提供商
     *
     * Lists identity providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIdentityProvidersRequest 请求对象
     * @return AsyncInvoker<ListIdentityProvidersRequest, ListIdentityProvidersResponse>
     */
    public AsyncInvoker<ListIdentityProvidersRequest, ListIdentityProvidersResponse> listIdentityProvidersAsyncInvoker(
        ListIdentityProvidersRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listIdentityProviders, hcClient);
    }

    /**
     * OAuth2.0 Pushed Authorization Request (PAR) standard authorize API
     *
     * Core OAuth2 authorization endpoint following RFC 9126 PAR spec, only accepts authorization request via request_uri parameter to trigger user authorization flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2AuthorizeRequest 请求对象
     * @return CompletableFuture<Oauth2AuthorizeResponse>
     */
    public CompletableFuture<Oauth2AuthorizeResponse> oauth2AuthorizeAsync(Oauth2AuthorizeRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.oauth2Authorize);
    }

    /**
     * OAuth2.0 Pushed Authorization Request (PAR) standard authorize API
     *
     * Core OAuth2 authorization endpoint following RFC 9126 PAR spec, only accepts authorization request via request_uri parameter to trigger user authorization flow
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2AuthorizeRequest 请求对象
     * @return AsyncInvoker<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse>
     */
    public AsyncInvoker<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse> oauth2AuthorizeAsyncInvoker(
        Oauth2AuthorizeRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.oauth2Authorize, hcClient);
    }

    /**
     * OAuth2.0 Standard Authorization Callback API
     *
     * OAuth2 redirect callback endpoint to receive authorization result after user consent/denial
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2CallbackRequest 请求对象
     * @return CompletableFuture<Oauth2CallbackResponse>
     */
    public CompletableFuture<Oauth2CallbackResponse> oauth2CallbackAsync(Oauth2CallbackRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.oauth2Callback);
    }

    /**
     * OAuth2.0 Standard Authorization Callback API
     *
     * OAuth2 redirect callback endpoint to receive authorization result after user consent/denial
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request Oauth2CallbackRequest 请求对象
     * @return AsyncInvoker<Oauth2CallbackRequest, Oauth2CallbackResponse>
     */
    public AsyncInvoker<Oauth2CallbackRequest, Oauth2CallbackResponse> oauth2CallbackAsyncInvoker(
        Oauth2CallbackRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.oauth2Callback, hcClient);
    }

    /**
     * 创建OAuth2凭证提供者
     *
     * Creates a new OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOauth2CredentialProviderRequest 请求对象
     * @return CompletableFuture<CreateOauth2CredentialProviderResponse>
     */
    public CompletableFuture<CreateOauth2CredentialProviderResponse> createOauth2CredentialProviderAsync(
        CreateOauth2CredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createOauth2CredentialProvider);
    }

    /**
     * 创建OAuth2凭证提供者
     *
     * Creates a new OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOauth2CredentialProviderRequest 请求对象
     * @return AsyncInvoker<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse>
     */
    public AsyncInvoker<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse> createOauth2CredentialProviderAsyncInvoker(
        CreateOauth2CredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createOauth2CredentialProvider, hcClient);
    }

    /**
     * 删除OAuth2凭证提供者
     *
     * Deletes an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOauth2CredentialProviderRequest 请求对象
     * @return CompletableFuture<DeleteOauth2CredentialProviderResponse>
     */
    public CompletableFuture<DeleteOauth2CredentialProviderResponse> deleteOauth2CredentialProviderAsync(
        DeleteOauth2CredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.deleteOauth2CredentialProvider);
    }

    /**
     * 删除OAuth2凭证提供者
     *
     * Deletes an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOauth2CredentialProviderRequest 请求对象
     * @return AsyncInvoker<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse>
     */
    public AsyncInvoker<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse> deleteOauth2CredentialProviderAsyncInvoker(
        DeleteOauth2CredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.deleteOauth2CredentialProvider, hcClient);
    }

    /**
     * 查询OAuth2凭证提供者详情
     *
     * Gets details of an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetOauth2CredentialProviderRequest 请求对象
     * @return CompletableFuture<GetOauth2CredentialProviderResponse>
     */
    public CompletableFuture<GetOauth2CredentialProviderResponse> getOauth2CredentialProviderAsync(
        GetOauth2CredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getOauth2CredentialProvider);
    }

    /**
     * 查询OAuth2凭证提供者详情
     *
     * Gets details of an OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetOauth2CredentialProviderRequest 请求对象
     * @return AsyncInvoker<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse>
     */
    public AsyncInvoker<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse> getOauth2CredentialProviderAsyncInvoker(
        GetOauth2CredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getOauth2CredentialProvider, hcClient);
    }

    /**
     * 查询OAuth2凭证提供者列表
     *
     * Lists OAuth2 credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOauth2CredentialProvidersRequest 请求对象
     * @return CompletableFuture<ListOauth2CredentialProvidersResponse>
     */
    public CompletableFuture<ListOauth2CredentialProvidersResponse> listOauth2CredentialProvidersAsync(
        ListOauth2CredentialProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listOauth2CredentialProviders);
    }

    /**
     * 查询OAuth2凭证提供者列表
     *
     * Lists OAuth2 credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOauth2CredentialProvidersRequest 请求对象
     * @return AsyncInvoker<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse>
     */
    public AsyncInvoker<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse> listOauth2CredentialProvidersAsyncInvoker(
        ListOauth2CredentialProvidersRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listOauth2CredentialProviders, hcClient);
    }

    /**
     * 更新OAuth2凭证提供者
     *
     * Updates an existing OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOauth2CredentialProviderRequest 请求对象
     * @return CompletableFuture<UpdateOauth2CredentialProviderResponse>
     */
    public CompletableFuture<UpdateOauth2CredentialProviderResponse> updateOauth2CredentialProviderAsync(
        UpdateOauth2CredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updateOauth2CredentialProvider);
    }

    /**
     * 更新OAuth2凭证提供者
     *
     * Updates an existing OAuth2 credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOauth2CredentialProviderRequest 请求对象
     * @return AsyncInvoker<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse>
     */
    public AsyncInvoker<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse> updateOauth2CredentialProviderAsyncInvoker(
        UpdateOauth2CredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updateOauth2CredentialProvider, hcClient);
    }

    /**
     * 在指定策略集中创建策略
     *
     * Creates a new policy in the specified policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return CompletableFuture<CreatePolicyResponse>
     */
    public CompletableFuture<CreatePolicyResponse> createPolicyAsync(CreatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createPolicy);
    }

    /**
     * 在指定策略集中创建策略
     *
     * Creates a new policy in the specified policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyRequest 请求对象
     * @return AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse>
     */
    public AsyncInvoker<CreatePolicyRequest, CreatePolicyResponse> createPolicyAsyncInvoker(
        CreatePolicyRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createPolicy, hcClient);
    }

    /**
     * 删除策略
     *
     * Deletes a policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return CompletableFuture<DeletePolicyResponse>
     */
    public CompletableFuture<DeletePolicyResponse> deletePolicyAsync(DeletePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.deletePolicy);
    }

    /**
     * 删除策略
     *
     * Deletes a policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyRequest 请求对象
     * @return AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse>
     */
    public AsyncInvoker<DeletePolicyRequest, DeletePolicyResponse> deletePolicyAsyncInvoker(
        DeletePolicyRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.deletePolicy, hcClient);
    }

    /**
     * 查询策略详情
     *
     * Gets details of a specific policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyRequest 请求对象
     * @return CompletableFuture<GetPolicyResponse>
     */
    public CompletableFuture<GetPolicyResponse> getPolicyAsync(GetPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getPolicy);
    }

    /**
     * 查询策略详情
     *
     * Gets details of a specific policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyRequest 请求对象
     * @return AsyncInvoker<GetPolicyRequest, GetPolicyResponse>
     */
    public AsyncInvoker<GetPolicyRequest, GetPolicyResponse> getPolicyAsyncInvoker(GetPolicyRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getPolicy, hcClient);
    }

    /**
     * 查询策略列表
     *
     * Lists policies in the specified policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return CompletableFuture<ListPoliciesResponse>
     */
    public CompletableFuture<ListPoliciesResponse> listPoliciesAsync(ListPoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listPolicies);
    }

    /**
     * 查询策略列表
     *
     * Lists policies in the specified policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPoliciesRequest 请求对象
     * @return AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse>
     */
    public AsyncInvoker<ListPoliciesRequest, ListPoliciesResponse> listPoliciesAsyncInvoker(
        ListPoliciesRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listPolicies, hcClient);
    }

    /**
     * 更新策略
     *
     * Updates an existing policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return CompletableFuture<UpdatePolicyResponse>
     */
    public CompletableFuture<UpdatePolicyResponse> updatePolicyAsync(UpdatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updatePolicy);
    }

    /**
     * 更新策略
     *
     * Updates an existing policy.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse>
     */
    public AsyncInvoker<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicyAsyncInvoker(
        UpdatePolicyRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updatePolicy, hcClient);
    }

    /**
     * 创建策略集
     *
     * Creates a new policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyEngineRequest 请求对象
     * @return CompletableFuture<CreatePolicyEngineResponse>
     */
    public CompletableFuture<CreatePolicyEngineResponse> createPolicyEngineAsync(CreatePolicyEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createPolicyEngine);
    }

    /**
     * 创建策略集
     *
     * Creates a new policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePolicyEngineRequest 请求对象
     * @return AsyncInvoker<CreatePolicyEngineRequest, CreatePolicyEngineResponse>
     */
    public AsyncInvoker<CreatePolicyEngineRequest, CreatePolicyEngineResponse> createPolicyEngineAsyncInvoker(
        CreatePolicyEngineRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createPolicyEngine, hcClient);
    }

    /**
     * 删除策略集
     *
     * Deletes a policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyEngineRequest 请求对象
     * @return CompletableFuture<DeletePolicyEngineResponse>
     */
    public CompletableFuture<DeletePolicyEngineResponse> deletePolicyEngineAsync(DeletePolicyEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.deletePolicyEngine);
    }

    /**
     * 删除策略集
     *
     * Deletes a policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePolicyEngineRequest 请求对象
     * @return AsyncInvoker<DeletePolicyEngineRequest, DeletePolicyEngineResponse>
     */
    public AsyncInvoker<DeletePolicyEngineRequest, DeletePolicyEngineResponse> deletePolicyEngineAsyncInvoker(
        DeletePolicyEngineRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.deletePolicyEngine, hcClient);
    }

    /**
     * 查询策略集详情
     *
     * Gets details of a policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyEngineRequest 请求对象
     * @return CompletableFuture<GetPolicyEngineResponse>
     */
    public CompletableFuture<GetPolicyEngineResponse> getPolicyEngineAsync(GetPolicyEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getPolicyEngine);
    }

    /**
     * 查询策略集详情
     *
     * Gets details of a policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetPolicyEngineRequest 请求对象
     * @return AsyncInvoker<GetPolicyEngineRequest, GetPolicyEngineResponse>
     */
    public AsyncInvoker<GetPolicyEngineRequest, GetPolicyEngineResponse> getPolicyEngineAsyncInvoker(
        GetPolicyEngineRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getPolicyEngine, hcClient);
    }

    /**
     * 查询策略集关联的实体列表
     *
     * Lists the entities (gateways and token vaults) attached to the specified policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyEngineAttachmentsRequest 请求对象
     * @return CompletableFuture<ListPolicyEngineAttachmentsResponse>
     */
    public CompletableFuture<ListPolicyEngineAttachmentsResponse> listPolicyEngineAttachmentsAsync(
        ListPolicyEngineAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listPolicyEngineAttachments);
    }

    /**
     * 查询策略集关联的实体列表
     *
     * Lists the entities (gateways and token vaults) attached to the specified policy engine.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyEngineAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListPolicyEngineAttachmentsRequest, ListPolicyEngineAttachmentsResponse>
     */
    public AsyncInvoker<ListPolicyEngineAttachmentsRequest, ListPolicyEngineAttachmentsResponse> listPolicyEngineAttachmentsAsyncInvoker(
        ListPolicyEngineAttachmentsRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listPolicyEngineAttachments, hcClient);
    }

    /**
     * 查询策略集列表
     *
     * Lists policy engines.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyEnginesRequest 请求对象
     * @return CompletableFuture<ListPolicyEnginesResponse>
     */
    public CompletableFuture<ListPolicyEnginesResponse> listPolicyEnginesAsync(ListPolicyEnginesRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listPolicyEngines);
    }

    /**
     * 查询策略集列表
     *
     * Lists policy engines.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPolicyEnginesRequest 请求对象
     * @return AsyncInvoker<ListPolicyEnginesRequest, ListPolicyEnginesResponse>
     */
    public AsyncInvoker<ListPolicyEnginesRequest, ListPolicyEnginesResponse> listPolicyEnginesAsyncInvoker(
        ListPolicyEnginesRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listPolicyEngines, hcClient);
    }

    /**
     * 更新策略集
     *
     * Updates a policy engine (description only).
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyEngineRequest 请求对象
     * @return CompletableFuture<UpdatePolicyEngineResponse>
     */
    public CompletableFuture<UpdatePolicyEngineResponse> updatePolicyEngineAsync(UpdatePolicyEngineRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updatePolicyEngine);
    }

    /**
     * 更新策略集
     *
     * Updates a policy engine (description only).
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePolicyEngineRequest 请求对象
     * @return AsyncInvoker<UpdatePolicyEngineRequest, UpdatePolicyEngineResponse>
     */
    public AsyncInvoker<UpdatePolicyEngineRequest, UpdatePolicyEngineResponse> updatePolicyEngineAsyncInvoker(
        UpdatePolicyEngineRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updatePolicyEngine, hcClient);
    }

    /**
     * 创建STS凭证提供者
     *
     * Creates a new STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStsCredentialProviderRequest 请求对象
     * @return CompletableFuture<CreateStsCredentialProviderResponse>
     */
    public CompletableFuture<CreateStsCredentialProviderResponse> createStsCredentialProviderAsync(
        CreateStsCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createStsCredentialProvider);
    }

    /**
     * 创建STS凭证提供者
     *
     * Creates a new STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStsCredentialProviderRequest 请求对象
     * @return AsyncInvoker<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse>
     */
    public AsyncInvoker<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse> createStsCredentialProviderAsyncInvoker(
        CreateStsCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createStsCredentialProvider, hcClient);
    }

    /**
     * 删除STS凭证提供者
     *
     * Deletes an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStsCredentialProviderRequest 请求对象
     * @return CompletableFuture<DeleteStsCredentialProviderResponse>
     */
    public CompletableFuture<DeleteStsCredentialProviderResponse> deleteStsCredentialProviderAsync(
        DeleteStsCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.deleteStsCredentialProvider);
    }

    /**
     * 删除STS凭证提供者
     *
     * Deletes an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStsCredentialProviderRequest 请求对象
     * @return AsyncInvoker<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse>
     */
    public AsyncInvoker<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse> deleteStsCredentialProviderAsyncInvoker(
        DeleteStsCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.deleteStsCredentialProvider, hcClient);
    }

    /**
     * 查询STS凭证提供者详情
     *
     * Gets details of an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStsCredentialProviderRequest 请求对象
     * @return CompletableFuture<GetStsCredentialProviderResponse>
     */
    public CompletableFuture<GetStsCredentialProviderResponse> getStsCredentialProviderAsync(
        GetStsCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getStsCredentialProvider);
    }

    /**
     * 查询STS凭证提供者详情
     *
     * Gets details of an STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetStsCredentialProviderRequest 请求对象
     * @return AsyncInvoker<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse>
     */
    public AsyncInvoker<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse> getStsCredentialProviderAsyncInvoker(
        GetStsCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getStsCredentialProvider, hcClient);
    }

    /**
     * 查询STS凭证提供者列表
     *
     * Lists STS credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStsCredentialProvidersRequest 请求对象
     * @return CompletableFuture<ListStsCredentialProvidersResponse>
     */
    public CompletableFuture<ListStsCredentialProvidersResponse> listStsCredentialProvidersAsync(
        ListStsCredentialProvidersRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listStsCredentialProviders);
    }

    /**
     * 查询STS凭证提供者列表
     *
     * Lists STS credential providers.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStsCredentialProvidersRequest 请求对象
     * @return AsyncInvoker<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse>
     */
    public AsyncInvoker<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse> listStsCredentialProvidersAsyncInvoker(
        ListStsCredentialProvidersRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listStsCredentialProviders, hcClient);
    }

    /**
     * 更新STS凭证提供者
     *
     * Updates an existing STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStsCredentialProviderRequest 请求对象
     * @return CompletableFuture<UpdateStsCredentialProviderResponse>
     */
    public CompletableFuture<UpdateStsCredentialProviderResponse> updateStsCredentialProviderAsync(
        UpdateStsCredentialProviderRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updateStsCredentialProvider);
    }

    /**
     * 更新STS凭证提供者
     *
     * Updates an existing STS credential provider.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStsCredentialProviderRequest 请求对象
     * @return AsyncInvoker<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse>
     */
    public AsyncInvoker<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse> updateStsCredentialProviderAsyncInvoker(
        UpdateStsCredentialProviderRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updateStsCredentialProvider, hcClient);
    }

    /**
     * 查询令牌保管库详情
     *
     * Gets details of a token vault.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTokenVaultRequest 请求对象
     * @return CompletableFuture<GetTokenVaultResponse>
     */
    public CompletableFuture<GetTokenVaultResponse> getTokenVaultAsync(GetTokenVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getTokenVault);
    }

    /**
     * 查询令牌保管库详情
     *
     * Gets details of a token vault.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetTokenVaultRequest 请求对象
     * @return AsyncInvoker<GetTokenVaultRequest, GetTokenVaultResponse>
     */
    public AsyncInvoker<GetTokenVaultRequest, GetTokenVaultResponse> getTokenVaultAsyncInvoker(
        GetTokenVaultRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getTokenVault, hcClient);
    }

    /**
     * 更新令牌保管库配置
     *
     * Updates the token vault configuration including KMS and policy engine settings.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenVaultRequest 请求对象
     * @return CompletableFuture<UpdateTokenVaultResponse>
     */
    public CompletableFuture<UpdateTokenVaultResponse> updateTokenVaultAsync(UpdateTokenVaultRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updateTokenVault);
    }

    /**
     * 更新令牌保管库配置
     *
     * Updates the token vault configuration including KMS and policy engine settings.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTokenVaultRequest 请求对象
     * @return AsyncInvoker<UpdateTokenVaultRequest, UpdateTokenVaultResponse>
     */
    public AsyncInvoker<UpdateTokenVaultRequest, UpdateTokenVaultResponse> updateTokenVaultAsyncInvoker(
        UpdateTokenVaultRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updateTokenVault, hcClient);
    }

    /**
     * Create workload access token (not acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads that do not act on behalf of a user
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenRequest 请求对象
     * @return CompletableFuture<CreateWorkloadAccessTokenResponse>
     */
    public CompletableFuture<CreateWorkloadAccessTokenResponse> createWorkloadAccessTokenAsync(
        CreateWorkloadAccessTokenRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createWorkloadAccessToken);
    }

    /**
     * Create workload access token (not acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads that do not act on behalf of a user
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenRequest 请求对象
     * @return AsyncInvoker<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse>
     */
    public AsyncInvoker<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse> createWorkloadAccessTokenAsyncInvoker(
        CreateWorkloadAccessTokenRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createWorkloadAccessToken, hcClient);
    }

    /**
     * Create workload access token using JWT (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using a JWT token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForJwtRequest 请求对象
     * @return CompletableFuture<CreateWorkloadAccessTokenForJwtResponse>
     */
    public CompletableFuture<CreateWorkloadAccessTokenForJwtResponse> createWorkloadAccessTokenForJwtAsync(
        CreateWorkloadAccessTokenForJwtRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createWorkloadAccessTokenForJwt);
    }

    /**
     * Create workload access token using JWT (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using a JWT token
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForJwtRequest 请求对象
     * @return AsyncInvoker<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse>
     */
    public AsyncInvoker<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse> createWorkloadAccessTokenForJwtAsyncInvoker(
        CreateWorkloadAccessTokenForJwtRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createWorkloadAccessTokenForJwt, hcClient);
    }

    /**
     * Create workload access token using user ID (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using the user&#39;s ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForUserIdRequest 请求对象
     * @return CompletableFuture<CreateWorkloadAccessTokenForUserIdResponse>
     */
    public CompletableFuture<CreateWorkloadAccessTokenForUserIdResponse> createWorkloadAccessTokenForUserIdAsync(
        CreateWorkloadAccessTokenForUserIdRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createWorkloadAccessTokenForUserId);
    }

    /**
     * Create workload access token using user ID (acting on behalf of a user)
     *
     * Retrieves a workload access token for agentic workloads acting on behalf of a user, using the user&#39;s ID
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadAccessTokenForUserIdRequest 请求对象
     * @return AsyncInvoker<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse>
     */
    public AsyncInvoker<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse> createWorkloadAccessTokenForUserIdAsyncInvoker(
        CreateWorkloadAccessTokenForUserIdRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createWorkloadAccessTokenForUserId, hcClient);
    }

    /**
     * 创建工作负载身份
     *
     * Creates a new workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadIdentityRequest 请求对象
     * @return CompletableFuture<CreateWorkloadIdentityResponse>
     */
    public CompletableFuture<CreateWorkloadIdentityResponse> createWorkloadIdentityAsync(
        CreateWorkloadIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.createWorkloadIdentity);
    }

    /**
     * 创建工作负载身份
     *
     * Creates a new workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWorkloadIdentityRequest 请求对象
     * @return AsyncInvoker<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse>
     */
    public AsyncInvoker<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse> createWorkloadIdentityAsyncInvoker(
        CreateWorkloadIdentityRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.createWorkloadIdentity, hcClient);
    }

    /**
     * 删除工作负载身份
     *
     * Deletes a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadIdentityRequest 请求对象
     * @return CompletableFuture<DeleteWorkloadIdentityResponse>
     */
    public CompletableFuture<DeleteWorkloadIdentityResponse> deleteWorkloadIdentityAsync(
        DeleteWorkloadIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.deleteWorkloadIdentity);
    }

    /**
     * 删除工作负载身份
     *
     * Deletes a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteWorkloadIdentityRequest 请求对象
     * @return AsyncInvoker<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse>
     */
    public AsyncInvoker<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse> deleteWorkloadIdentityAsyncInvoker(
        DeleteWorkloadIdentityRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.deleteWorkloadIdentity, hcClient);
    }

    /**
     * 查询工作负载身份详情
     *
     * Gets details of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityRequest 请求对象
     * @return CompletableFuture<GetWorkloadIdentityResponse>
     */
    public CompletableFuture<GetWorkloadIdentityResponse> getWorkloadIdentityAsync(GetWorkloadIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getWorkloadIdentity);
    }

    /**
     * 查询工作负载身份详情
     *
     * Gets details of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityRequest 请求对象
     * @return AsyncInvoker<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse>
     */
    public AsyncInvoker<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse> getWorkloadIdentityAsyncInvoker(
        GetWorkloadIdentityRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getWorkloadIdentity, hcClient);
    }

    /**
     * 查询工作负载身份的授权配置
     *
     * Gets the authorizer configuration of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityAuthorizerConfigurationRequest 请求对象
     * @return CompletableFuture<GetWorkloadIdentityAuthorizerConfigurationResponse>
     */
    public CompletableFuture<GetWorkloadIdentityAuthorizerConfigurationResponse> getWorkloadIdentityAuthorizerConfigurationAsync(
        GetWorkloadIdentityAuthorizerConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.getWorkloadIdentityAuthorizerConfiguration);
    }

    /**
     * 查询工作负载身份的授权配置
     *
     * Gets the authorizer configuration of a workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GetWorkloadIdentityAuthorizerConfigurationRequest 请求对象
     * @return AsyncInvoker<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse>
     */
    public AsyncInvoker<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse> getWorkloadIdentityAuthorizerConfigurationAsyncInvoker(
        GetWorkloadIdentityAuthorizerConfigurationRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.getWorkloadIdentityAuthorizerConfiguration, hcClient);
    }

    /**
     * 查询工作负载身份列表
     *
     * Lists workload identities.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadIdentitiesRequest 请求对象
     * @return CompletableFuture<ListWorkloadIdentitiesResponse>
     */
    public CompletableFuture<ListWorkloadIdentitiesResponse> listWorkloadIdentitiesAsync(
        ListWorkloadIdentitiesRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.listWorkloadIdentities);
    }

    /**
     * 查询工作负载身份列表
     *
     * Lists workload identities.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWorkloadIdentitiesRequest 请求对象
     * @return AsyncInvoker<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse>
     */
    public AsyncInvoker<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse> listWorkloadIdentitiesAsyncInvoker(
        ListWorkloadIdentitiesRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.listWorkloadIdentities, hcClient);
    }

    /**
     * 更新工作负载身份
     *
     * Updates an existing workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadIdentityRequest 请求对象
     * @return CompletableFuture<UpdateWorkloadIdentityResponse>
     */
    public CompletableFuture<UpdateWorkloadIdentityResponse> updateWorkloadIdentityAsync(
        UpdateWorkloadIdentityRequest request) {
        return hcClient.asyncInvokeHttp(request, AgentIdentityMeta.updateWorkloadIdentity);
    }

    /**
     * 更新工作负载身份
     *
     * Updates an existing workload identity.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateWorkloadIdentityRequest 请求对象
     * @return AsyncInvoker<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse>
     */
    public AsyncInvoker<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse> updateWorkloadIdentityAsyncInvoker(
        UpdateWorkloadIdentityRequest request) {
        return new AsyncInvoker<>(request, AgentIdentityMeta.updateWorkloadIdentity, hcClient);
    }

}

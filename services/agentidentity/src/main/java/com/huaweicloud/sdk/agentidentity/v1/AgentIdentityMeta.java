package com.huaweicloud.sdk.agentidentity.v1;

import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthRequestBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CompleteResourceTokenAuthResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyEngineReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyEngineRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyEngineResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreatePolicyResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateStsCredentialProviderReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForJwtRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForJwtRequestBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForJwtResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForUserIdRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForUserIdRequestBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenForUserIdResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenRequestBody;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadAccessTokenResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.CreateWorkloadIdentityReqBody;
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
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceApiKeyRequestBody;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceApiKeyResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceOauth2TokenRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceOauth2TokenRequestBody;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceOauth2TokenResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceStsTokenRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.GetResourceStsTokenRequestBody;
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
import com.huaweicloud.sdk.agentidentity.v1.model.PolicyEngineType;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateApiKeyCredentialProviderReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateApiKeyCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateApiKeyCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateOauth2CredentialProviderReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateOauth2CredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateOauth2CredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyEngineReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyEngineRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyEngineResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdatePolicyResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateStsCredentialProviderResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateTokenVaultReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateTokenVaultRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateTokenVaultResponse;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityReqBody;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityRequest;
import com.huaweicloud.sdk.agentidentity.v1.model.UpdateWorkloadIdentityResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.UUID;

@SuppressWarnings("unchecked")
public class AgentIdentityMeta {

    public static final HttpRequestDef<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse> createApiKeyCredentialProvider =
        genForCreateApiKeyCredentialProvider();

    private static HttpRequestDef<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse> genForCreateApiKeyCredentialProvider() {
        // basic
        HttpRequestDef.Builder<CreateApiKeyCredentialProviderRequest, CreateApiKeyCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApiKeyCredentialProviderRequest.class,
                    CreateApiKeyCredentialProviderResponse.class)
                .withName("CreateApiKeyCredentialProvider")
                .withUri("/v1/api-key-credential-providers")
                .withContentType("application/json");

        // requests
        builder.<CreateApiKeyCredentialProviderReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApiKeyCredentialProviderReqBody.class),
            f -> f.withMarshaller(CreateApiKeyCredentialProviderRequest::getBody,
                CreateApiKeyCredentialProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse> deleteApiKeyCredentialProvider =
        genForDeleteApiKeyCredentialProvider();

    private static HttpRequestDef<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse> genForDeleteApiKeyCredentialProvider() {
        // basic
        HttpRequestDef.Builder<DeleteApiKeyCredentialProviderRequest, DeleteApiKeyCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteApiKeyCredentialProviderRequest.class,
                    DeleteApiKeyCredentialProviderResponse.class)
                .withName("DeleteApiKeyCredentialProvider")
                .withUri("/v1/api-key-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiKeyCredentialProviderRequest::getCredentialProviderName,
                DeleteApiKeyCredentialProviderRequest::setCredentialProviderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse> getApiKeyCredentialProvider =
        genForGetApiKeyCredentialProvider();

    private static HttpRequestDef<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse> genForGetApiKeyCredentialProvider() {
        // basic
        HttpRequestDef.Builder<GetApiKeyCredentialProviderRequest, GetApiKeyCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetApiKeyCredentialProviderRequest.class,
                    GetApiKeyCredentialProviderResponse.class)
                .withName("GetApiKeyCredentialProvider")
                .withUri("/v1/api-key-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApiKeyCredentialProviderRequest::getCredentialProviderName,
                GetApiKeyCredentialProviderRequest::setCredentialProviderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse> listApiKeyCredentialProviders =
        genForListApiKeyCredentialProviders();

    private static HttpRequestDef<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse> genForListApiKeyCredentialProviders() {
        // basic
        HttpRequestDef.Builder<ListApiKeyCredentialProvidersRequest, ListApiKeyCredentialProvidersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApiKeyCredentialProvidersRequest.class,
                    ListApiKeyCredentialProvidersResponse.class)
                .withName("ListApiKeyCredentialProviders")
                .withUri("/v1/api-key-credential-providers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiKeyCredentialProvidersRequest::getLimit,
                ListApiKeyCredentialProvidersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiKeyCredentialProvidersRequest::getMarker,
                ListApiKeyCredentialProvidersRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse> updateApiKeyCredentialProvider =
        genForUpdateApiKeyCredentialProvider();

    private static HttpRequestDef<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse> genForUpdateApiKeyCredentialProvider() {
        // basic
        HttpRequestDef.Builder<UpdateApiKeyCredentialProviderRequest, UpdateApiKeyCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApiKeyCredentialProviderRequest.class,
                    UpdateApiKeyCredentialProviderResponse.class)
                .withName("UpdateApiKeyCredentialProvider")
                .withUri("/v1/api-key-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiKeyCredentialProviderRequest::getCredentialProviderName,
                UpdateApiKeyCredentialProviderRequest::setCredentialProviderName));
        builder.<UpdateApiKeyCredentialProviderReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApiKeyCredentialProviderReqBody.class),
            f -> f.withMarshaller(UpdateApiKeyCredentialProviderRequest::getBody,
                UpdateApiKeyCredentialProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse> completeResourceTokenAuth =
        genForCompleteResourceTokenAuth();

    private static HttpRequestDef<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse> genForCompleteResourceTokenAuth() {
        // basic
        HttpRequestDef.Builder<CompleteResourceTokenAuthRequest, CompleteResourceTokenAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CompleteResourceTokenAuthRequest.class,
                    CompleteResourceTokenAuthResponse.class)
                .withName("CompleteResourceTokenAuth")
                .withUri("/v1/resource-token-auth/complete")
                .withContentType("application/json");

        // requests
        builder.<CompleteResourceTokenAuthRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CompleteResourceTokenAuthRequestBody.class),
            f -> f.withMarshaller(CompleteResourceTokenAuthRequest::getBody,
                CompleteResourceTokenAuthRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetResourceApiKeyRequest, GetResourceApiKeyResponse> getResourceApiKey =
        genForGetResourceApiKey();

    private static HttpRequestDef<GetResourceApiKeyRequest, GetResourceApiKeyResponse> genForGetResourceApiKey() {
        // basic
        HttpRequestDef.Builder<GetResourceApiKeyRequest, GetResourceApiKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GetResourceApiKeyRequest.class, GetResourceApiKeyResponse.class)
                .withName("GetResourceApiKey")
                .withUri("/v1/api-key")
                .withContentType("application/json");

        // requests
        builder.<GetResourceApiKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetResourceApiKeyRequestBody.class),
            f -> f.withMarshaller(GetResourceApiKeyRequest::getBody, GetResourceApiKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse> getResourceOauth2Token =
        genForGetResourceOauth2Token();

    private static HttpRequestDef<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse> genForGetResourceOauth2Token() {
        // basic
        HttpRequestDef.Builder<GetResourceOauth2TokenRequest, GetResourceOauth2TokenResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GetResourceOauth2TokenRequest.class, GetResourceOauth2TokenResponse.class)
            .withName("GetResourceOauth2Token")
            .withUri("/v1/oauth2/token")
            .withContentType("application/json");

        // requests
        builder.<GetResourceOauth2TokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetResourceOauth2TokenRequestBody.class),
            f -> f.withMarshaller(GetResourceOauth2TokenRequest::getBody, GetResourceOauth2TokenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetResourceStsTokenRequest, GetResourceStsTokenResponse> getResourceStsToken =
        genForGetResourceStsToken();

    private static HttpRequestDef<GetResourceStsTokenRequest, GetResourceStsTokenResponse> genForGetResourceStsToken() {
        // basic
        HttpRequestDef.Builder<GetResourceStsTokenRequest, GetResourceStsTokenResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GetResourceStsTokenRequest.class, GetResourceStsTokenResponse.class)
                .withName("GetResourceStsToken")
                .withUri("/v1/sts/token")
                .withContentType("application/json");

        // requests
        builder.<GetResourceStsTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetResourceStsTokenRequestBody.class),
            f -> f.withMarshaller(GetResourceStsTokenRequest::getBody, GetResourceStsTokenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIdentityProvidersRequest, ListIdentityProvidersResponse> listIdentityProviders =
        genForListIdentityProviders();

    private static HttpRequestDef<ListIdentityProvidersRequest, ListIdentityProvidersResponse> genForListIdentityProviders() {
        // basic
        HttpRequestDef.Builder<ListIdentityProvidersRequest, ListIdentityProvidersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListIdentityProvidersRequest.class, ListIdentityProvidersResponse.class)
            .withName("ListIdentityProviders")
            .withUri("/v1/identity-providers")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse> oauth2Authorize =
        genForOauth2Authorize();

    private static HttpRequestDef<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse> genForOauth2Authorize() {
        // basic
        HttpRequestDef.Builder<Oauth2AuthorizeRequest, Oauth2AuthorizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, Oauth2AuthorizeRequest.class, Oauth2AuthorizeResponse.class)
                .withName("Oauth2Authorize")
                .withUri("/v1/oauth2/authorize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("request_uri",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Oauth2AuthorizeRequest::getRequestUri, Oauth2AuthorizeRequest::setRequestUri));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<Oauth2CallbackRequest, Oauth2CallbackResponse> oauth2Callback =
        genForOauth2Callback();

    private static HttpRequestDef<Oauth2CallbackRequest, Oauth2CallbackResponse> genForOauth2Callback() {
        // basic
        HttpRequestDef.Builder<Oauth2CallbackRequest, Oauth2CallbackResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, Oauth2CallbackRequest.class, Oauth2CallbackResponse.class)
                .withName("Oauth2Callback")
                .withUri("/v1/oauth2/callback/{credential_provider_id}")
                .withContentType("application/json");

        // requests
        builder.<UUID>withRequestField("credential_provider_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UUID.class),
            f -> f.withMarshaller(Oauth2CallbackRequest::getCredentialProviderId,
                Oauth2CallbackRequest::setCredentialProviderId));
        builder.<String>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Oauth2CallbackRequest::getCode, Oauth2CallbackRequest::setCode));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Oauth2CallbackRequest::getState, Oauth2CallbackRequest::setState));
        builder.<String>withRequestField("error",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Oauth2CallbackRequest::getError, Oauth2CallbackRequest::setError));
        builder.<String>withRequestField("error_description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(Oauth2CallbackRequest::getErrorDescription,
                Oauth2CallbackRequest::setErrorDescription));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse> createOauth2CredentialProvider =
        genForCreateOauth2CredentialProvider();

    private static HttpRequestDef<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse> genForCreateOauth2CredentialProvider() {
        // basic
        HttpRequestDef.Builder<CreateOauth2CredentialProviderRequest, CreateOauth2CredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOauth2CredentialProviderRequest.class,
                    CreateOauth2CredentialProviderResponse.class)
                .withName("CreateOauth2CredentialProvider")
                .withUri("/v1/oauth2-credential-providers")
                .withContentType("application/json");

        // requests
        builder.<CreateOauth2CredentialProviderReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOauth2CredentialProviderReqBody.class),
            f -> f.withMarshaller(CreateOauth2CredentialProviderRequest::getBody,
                CreateOauth2CredentialProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse> deleteOauth2CredentialProvider =
        genForDeleteOauth2CredentialProvider();

    private static HttpRequestDef<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse> genForDeleteOauth2CredentialProvider() {
        // basic
        HttpRequestDef.Builder<DeleteOauth2CredentialProviderRequest, DeleteOauth2CredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteOauth2CredentialProviderRequest.class,
                    DeleteOauth2CredentialProviderResponse.class)
                .withName("DeleteOauth2CredentialProvider")
                .withUri("/v1/oauth2-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteOauth2CredentialProviderRequest::getCredentialProviderName,
                DeleteOauth2CredentialProviderRequest::setCredentialProviderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse> getOauth2CredentialProvider =
        genForGetOauth2CredentialProvider();

    private static HttpRequestDef<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse> genForGetOauth2CredentialProvider() {
        // basic
        HttpRequestDef.Builder<GetOauth2CredentialProviderRequest, GetOauth2CredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetOauth2CredentialProviderRequest.class,
                    GetOauth2CredentialProviderResponse.class)
                .withName("GetOauth2CredentialProvider")
                .withUri("/v1/oauth2-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetOauth2CredentialProviderRequest::getCredentialProviderName,
                GetOauth2CredentialProviderRequest::setCredentialProviderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse> listOauth2CredentialProviders =
        genForListOauth2CredentialProviders();

    private static HttpRequestDef<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse> genForListOauth2CredentialProviders() {
        // basic
        HttpRequestDef.Builder<ListOauth2CredentialProvidersRequest, ListOauth2CredentialProvidersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListOauth2CredentialProvidersRequest.class,
                    ListOauth2CredentialProvidersResponse.class)
                .withName("ListOauth2CredentialProviders")
                .withUri("/v1/oauth2-credential-providers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOauth2CredentialProvidersRequest::getLimit,
                ListOauth2CredentialProvidersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOauth2CredentialProvidersRequest::getMarker,
                ListOauth2CredentialProvidersRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse> updateOauth2CredentialProvider =
        genForUpdateOauth2CredentialProvider();

    private static HttpRequestDef<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse> genForUpdateOauth2CredentialProvider() {
        // basic
        HttpRequestDef.Builder<UpdateOauth2CredentialProviderRequest, UpdateOauth2CredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateOauth2CredentialProviderRequest.class,
                    UpdateOauth2CredentialProviderResponse.class)
                .withName("UpdateOauth2CredentialProvider")
                .withUri("/v1/oauth2-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOauth2CredentialProviderRequest::getCredentialProviderName,
                UpdateOauth2CredentialProviderRequest::setCredentialProviderName));
        builder.<UpdateOauth2CredentialProviderReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateOauth2CredentialProviderReqBody.class),
            f -> f.withMarshaller(UpdateOauth2CredentialProviderRequest::getBody,
                UpdateOauth2CredentialProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> createPolicy = genForCreatePolicy();

    private static HttpRequestDef<CreatePolicyRequest, CreatePolicyResponse> genForCreatePolicy() {
        // basic
        HttpRequestDef.Builder<CreatePolicyRequest, CreatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyRequest.class, CreatePolicyResponse.class)
                .withName("CreatePolicy")
                .withUri("/v1/policy-engines/{policy_engine_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyRequest::getPolicyEngineId, CreatePolicyRequest::setPolicyEngineId));
        builder.<CreatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyReqBody.class),
            f -> f.withMarshaller(CreatePolicyRequest::getBody, CreatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> deletePolicy = genForDeletePolicy();

    private static HttpRequestDef<DeletePolicyRequest, DeletePolicyResponse> genForDeletePolicy() {
        // basic
        HttpRequestDef.Builder<DeletePolicyRequest, DeletePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyRequest.class, DeletePolicyResponse.class)
                .withName("DeletePolicy")
                .withUri("/v1/policy-engines/{policy_engine_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyEngineId, DeletePolicyRequest::setPolicyEngineId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyRequest::getPolicyId, DeletePolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPolicyRequest, GetPolicyResponse> getPolicy = genForGetPolicy();

    private static HttpRequestDef<GetPolicyRequest, GetPolicyResponse> genForGetPolicy() {
        // basic
        HttpRequestDef.Builder<GetPolicyRequest, GetPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetPolicyRequest.class, GetPolicyResponse.class)
                .withName("GetPolicy")
                .withUri("/v1/policy-engines/{policy_engine_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPolicyRequest::getPolicyEngineId, GetPolicyRequest::setPolicyEngineId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPolicyRequest::getPolicyId, GetPolicyRequest::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> listPolicies = genForListPolicies();

    private static HttpRequestDef<ListPoliciesRequest, ListPoliciesResponse> genForListPolicies() {
        // basic
        HttpRequestDef.Builder<ListPoliciesRequest, ListPoliciesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesRequest.class, ListPoliciesResponse.class)
                .withName("ListPolicies")
                .withUri("/v1/policy-engines/{policy_engine_id}/policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getPolicyEngineId, ListPoliciesRequest::setPolicyEngineId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoliciesRequest::getLimit, ListPoliciesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesRequest::getMarker, ListPoliciesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> updatePolicy = genForUpdatePolicy();

    private static HttpRequestDef<UpdatePolicyRequest, UpdatePolicyResponse> genForUpdatePolicy() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyRequest, UpdatePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyRequest.class, UpdatePolicyResponse.class)
                .withName("UpdatePolicy")
                .withUri("/v1/policy-engines/{policy_engine_id}/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyEngineId, UpdatePolicyRequest::setPolicyEngineId));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getPolicyId, UpdatePolicyRequest::setPolicyId));
        builder.<UpdatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyReqBody.class),
            f -> f.withMarshaller(UpdatePolicyRequest::getBody, UpdatePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyEngineRequest, CreatePolicyEngineResponse> createPolicyEngine =
        genForCreatePolicyEngine();

    private static HttpRequestDef<CreatePolicyEngineRequest, CreatePolicyEngineResponse> genForCreatePolicyEngine() {
        // basic
        HttpRequestDef.Builder<CreatePolicyEngineRequest, CreatePolicyEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyEngineRequest.class, CreatePolicyEngineResponse.class)
                .withName("CreatePolicyEngine")
                .withUri("/v1/policy-engines")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyEngineReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyEngineReqBody.class),
            f -> f.withMarshaller(CreatePolicyEngineRequest::getBody, CreatePolicyEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyEngineRequest, DeletePolicyEngineResponse> deletePolicyEngine =
        genForDeletePolicyEngine();

    private static HttpRequestDef<DeletePolicyEngineRequest, DeletePolicyEngineResponse> genForDeletePolicyEngine() {
        // basic
        HttpRequestDef.Builder<DeletePolicyEngineRequest, DeletePolicyEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyEngineRequest.class, DeletePolicyEngineResponse.class)
                .withName("DeletePolicyEngine")
                .withUri("/v1/policy-engines/{policy_engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyEngineRequest::getPolicyEngineId,
                DeletePolicyEngineRequest::setPolicyEngineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPolicyEngineRequest, GetPolicyEngineResponse> getPolicyEngine =
        genForGetPolicyEngine();

    private static HttpRequestDef<GetPolicyEngineRequest, GetPolicyEngineResponse> genForGetPolicyEngine() {
        // basic
        HttpRequestDef.Builder<GetPolicyEngineRequest, GetPolicyEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetPolicyEngineRequest.class, GetPolicyEngineResponse.class)
                .withName("GetPolicyEngine")
                .withUri("/v1/policy-engines/{policy_engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPolicyEngineRequest::getPolicyEngineId,
                GetPolicyEngineRequest::setPolicyEngineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyEngineAttachmentsRequest, ListPolicyEngineAttachmentsResponse> listPolicyEngineAttachments =
        genForListPolicyEngineAttachments();

    private static HttpRequestDef<ListPolicyEngineAttachmentsRequest, ListPolicyEngineAttachmentsResponse> genForListPolicyEngineAttachments() {
        // basic
        HttpRequestDef.Builder<ListPolicyEngineAttachmentsRequest, ListPolicyEngineAttachmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPolicyEngineAttachmentsRequest.class,
                    ListPolicyEngineAttachmentsResponse.class)
                .withName("ListPolicyEngineAttachments")
                .withUri("/v1/policy-engines/{policy_engine_id}/attachments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyEngineAttachmentsRequest::getPolicyEngineId,
                ListPolicyEngineAttachmentsRequest::setPolicyEngineId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyEngineAttachmentsRequest::getLimit,
                ListPolicyEngineAttachmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyEngineAttachmentsRequest::getMarker,
                ListPolicyEngineAttachmentsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyEnginesRequest, ListPolicyEnginesResponse> listPolicyEngines =
        genForListPolicyEngines();

    private static HttpRequestDef<ListPolicyEnginesRequest, ListPolicyEnginesResponse> genForListPolicyEngines() {
        // basic
        HttpRequestDef.Builder<ListPolicyEnginesRequest, ListPolicyEnginesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyEnginesRequest.class, ListPolicyEnginesResponse.class)
                .withName("ListPolicyEngines")
                .withUri("/v1/policy-engines")
                .withContentType("application/json");

        // requests
        builder.<PolicyEngineType>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PolicyEngineType.class),
            f -> f.withMarshaller(ListPolicyEnginesRequest::getType, ListPolicyEnginesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyEnginesRequest::getLimit, ListPolicyEnginesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyEnginesRequest::getMarker, ListPolicyEnginesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyEngineRequest, UpdatePolicyEngineResponse> updatePolicyEngine =
        genForUpdatePolicyEngine();

    private static HttpRequestDef<UpdatePolicyEngineRequest, UpdatePolicyEngineResponse> genForUpdatePolicyEngine() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyEngineRequest, UpdatePolicyEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePolicyEngineRequest.class, UpdatePolicyEngineResponse.class)
                .withName("UpdatePolicyEngine")
                .withUri("/v1/policy-engines/{policy_engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyEngineRequest::getPolicyEngineId,
                UpdatePolicyEngineRequest::setPolicyEngineId));
        builder.<UpdatePolicyEngineReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePolicyEngineReqBody.class),
            f -> f.withMarshaller(UpdatePolicyEngineRequest::getBody, UpdatePolicyEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse> createStsCredentialProvider =
        genForCreateStsCredentialProvider();

    private static HttpRequestDef<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse> genForCreateStsCredentialProvider() {
        // basic
        HttpRequestDef.Builder<CreateStsCredentialProviderRequest, CreateStsCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateStsCredentialProviderRequest.class,
                    CreateStsCredentialProviderResponse.class)
                .withName("CreateStsCredentialProvider")
                .withUri("/v1/sts-credential-providers")
                .withContentType("application/json");

        // requests
        builder.<CreateStsCredentialProviderReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStsCredentialProviderReqBody.class),
            f -> f.withMarshaller(CreateStsCredentialProviderRequest::getBody,
                CreateStsCredentialProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse> deleteStsCredentialProvider =
        genForDeleteStsCredentialProvider();

    private static HttpRequestDef<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse> genForDeleteStsCredentialProvider() {
        // basic
        HttpRequestDef.Builder<DeleteStsCredentialProviderRequest, DeleteStsCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteStsCredentialProviderRequest.class,
                    DeleteStsCredentialProviderResponse.class)
                .withName("DeleteStsCredentialProvider")
                .withUri("/v1/sts-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStsCredentialProviderRequest::getCredentialProviderName,
                DeleteStsCredentialProviderRequest::setCredentialProviderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse> getStsCredentialProvider =
        genForGetStsCredentialProvider();

    private static HttpRequestDef<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse> genForGetStsCredentialProvider() {
        // basic
        HttpRequestDef.Builder<GetStsCredentialProviderRequest, GetStsCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, GetStsCredentialProviderRequest.class, GetStsCredentialProviderResponse.class)
                .withName("GetStsCredentialProvider")
                .withUri("/v1/sts-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetStsCredentialProviderRequest::getCredentialProviderName,
                GetStsCredentialProviderRequest::setCredentialProviderName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse> listStsCredentialProviders =
        genForListStsCredentialProviders();

    private static HttpRequestDef<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse> genForListStsCredentialProviders() {
        // basic
        HttpRequestDef.Builder<ListStsCredentialProvidersRequest, ListStsCredentialProvidersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStsCredentialProvidersRequest.class,
                    ListStsCredentialProvidersResponse.class)
                .withName("ListStsCredentialProviders")
                .withUri("/v1/sts-credential-providers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListStsCredentialProvidersRequest::getLimit,
                ListStsCredentialProvidersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStsCredentialProvidersRequest::getMarker,
                ListStsCredentialProvidersRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse> updateStsCredentialProvider =
        genForUpdateStsCredentialProvider();

    private static HttpRequestDef<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse> genForUpdateStsCredentialProvider() {
        // basic
        HttpRequestDef.Builder<UpdateStsCredentialProviderRequest, UpdateStsCredentialProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateStsCredentialProviderRequest.class,
                    UpdateStsCredentialProviderResponse.class)
                .withName("UpdateStsCredentialProvider")
                .withUri("/v1/sts-credential-providers/{credential_provider_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("credential_provider_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStsCredentialProviderRequest::getCredentialProviderName,
                UpdateStsCredentialProviderRequest::setCredentialProviderName));
        builder.<UpdateStsCredentialProviderReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateStsCredentialProviderReqBody.class),
            f -> f.withMarshaller(UpdateStsCredentialProviderRequest::getBody,
                UpdateStsCredentialProviderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetTokenVaultRequest, GetTokenVaultResponse> getTokenVault =
        genForGetTokenVault();

    private static HttpRequestDef<GetTokenVaultRequest, GetTokenVaultResponse> genForGetTokenVault() {
        // basic
        HttpRequestDef.Builder<GetTokenVaultRequest, GetTokenVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetTokenVaultRequest.class, GetTokenVaultResponse.class)
                .withName("GetTokenVault")
                .withUri("/v1/token-vaults/{token_vault_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("token_vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetTokenVaultRequest::getTokenVaultId, GetTokenVaultRequest::setTokenVaultId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTokenVaultRequest, UpdateTokenVaultResponse> updateTokenVault =
        genForUpdateTokenVault();

    private static HttpRequestDef<UpdateTokenVaultRequest, UpdateTokenVaultResponse> genForUpdateTokenVault() {
        // basic
        HttpRequestDef.Builder<UpdateTokenVaultRequest, UpdateTokenVaultResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTokenVaultRequest.class, UpdateTokenVaultResponse.class)
                .withName("UpdateTokenVault")
                .withUri("/v1/token-vaults/{token_vault_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("token_vault_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTokenVaultRequest::getTokenVaultId, UpdateTokenVaultRequest::setTokenVaultId));
        builder.<UpdateTokenVaultReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTokenVaultReqBody.class),
            f -> f.withMarshaller(UpdateTokenVaultRequest::getBody, UpdateTokenVaultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse> createWorkloadAccessToken =
        genForCreateWorkloadAccessToken();

    private static HttpRequestDef<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse> genForCreateWorkloadAccessToken() {
        // basic
        HttpRequestDef.Builder<CreateWorkloadAccessTokenRequest, CreateWorkloadAccessTokenResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkloadAccessTokenRequest.class,
                    CreateWorkloadAccessTokenResponse.class)
                .withName("CreateWorkloadAccessToken")
                .withUri("/v1/workload-access-token")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkloadAccessTokenRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkloadAccessTokenRequestBody.class),
            f -> f.withMarshaller(CreateWorkloadAccessTokenRequest::getBody,
                CreateWorkloadAccessTokenRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse> createWorkloadAccessTokenForJwt =
        genForCreateWorkloadAccessTokenForJwt();

    private static HttpRequestDef<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse> genForCreateWorkloadAccessTokenForJwt() {
        // basic
        HttpRequestDef.Builder<CreateWorkloadAccessTokenForJwtRequest, CreateWorkloadAccessTokenForJwtResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkloadAccessTokenForJwtRequest.class,
                    CreateWorkloadAccessTokenForJwtResponse.class)
                .withName("CreateWorkloadAccessTokenForJwt")
                .withUri("/v1/workload-access-token-for-jwt")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkloadAccessTokenForJwtRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkloadAccessTokenForJwtRequestBody.class),
            f -> f.withMarshaller(CreateWorkloadAccessTokenForJwtRequest::getBody,
                CreateWorkloadAccessTokenForJwtRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse> createWorkloadAccessTokenForUserId =
        genForCreateWorkloadAccessTokenForUserId();

    private static HttpRequestDef<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse> genForCreateWorkloadAccessTokenForUserId() {
        // basic
        HttpRequestDef.Builder<CreateWorkloadAccessTokenForUserIdRequest, CreateWorkloadAccessTokenForUserIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateWorkloadAccessTokenForUserIdRequest.class,
                    CreateWorkloadAccessTokenForUserIdResponse.class)
                .withName("CreateWorkloadAccessTokenForUserId")
                .withUri("/v1/workload-access-token-for-user-id")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkloadAccessTokenForUserIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkloadAccessTokenForUserIdRequestBody.class),
            f -> f.withMarshaller(CreateWorkloadAccessTokenForUserIdRequest::getBody,
                CreateWorkloadAccessTokenForUserIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse> createWorkloadIdentity =
        genForCreateWorkloadIdentity();

    private static HttpRequestDef<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse> genForCreateWorkloadIdentity() {
        // basic
        HttpRequestDef.Builder<CreateWorkloadIdentityRequest, CreateWorkloadIdentityResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateWorkloadIdentityRequest.class, CreateWorkloadIdentityResponse.class)
            .withName("CreateWorkloadIdentity")
            .withUri("/v1/workload-identities")
            .withContentType("application/json");

        // requests
        builder.<CreateWorkloadIdentityReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkloadIdentityReqBody.class),
            f -> f.withMarshaller(CreateWorkloadIdentityRequest::getBody, CreateWorkloadIdentityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse> deleteWorkloadIdentity =
        genForDeleteWorkloadIdentity();

    private static HttpRequestDef<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse> genForDeleteWorkloadIdentity() {
        // basic
        HttpRequestDef.Builder<DeleteWorkloadIdentityRequest, DeleteWorkloadIdentityResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteWorkloadIdentityRequest.class, DeleteWorkloadIdentityResponse.class)
            .withName("DeleteWorkloadIdentity")
            .withUri("/v1/workload-identities/{workload_identity_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workload_identity_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWorkloadIdentityRequest::getWorkloadIdentityName,
                DeleteWorkloadIdentityRequest::setWorkloadIdentityName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse> getWorkloadIdentity =
        genForGetWorkloadIdentity();

    private static HttpRequestDef<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse> genForGetWorkloadIdentity() {
        // basic
        HttpRequestDef.Builder<GetWorkloadIdentityRequest, GetWorkloadIdentityResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetWorkloadIdentityRequest.class, GetWorkloadIdentityResponse.class)
                .withName("GetWorkloadIdentity")
                .withUri("/v1/workload-identities/{workload_identity_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workload_identity_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetWorkloadIdentityRequest::getWorkloadIdentityName,
                GetWorkloadIdentityRequest::setWorkloadIdentityName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse> getWorkloadIdentityAuthorizerConfiguration =
        genForGetWorkloadIdentityAuthorizerConfiguration();

    private static HttpRequestDef<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse> genForGetWorkloadIdentityAuthorizerConfiguration() {
        // basic
        HttpRequestDef.Builder<GetWorkloadIdentityAuthorizerConfigurationRequest, GetWorkloadIdentityAuthorizerConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetWorkloadIdentityAuthorizerConfigurationRequest.class,
                    GetWorkloadIdentityAuthorizerConfigurationResponse.class)
                .withName("GetWorkloadIdentityAuthorizerConfiguration")
                .withUri("/v1/workload-identities/{workload_identity_name}/authorizer-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workload_identity_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetWorkloadIdentityAuthorizerConfigurationRequest::getWorkloadIdentityName,
                GetWorkloadIdentityAuthorizerConfigurationRequest::setWorkloadIdentityName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse> listWorkloadIdentities =
        genForListWorkloadIdentities();

    private static HttpRequestDef<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse> genForListWorkloadIdentities() {
        // basic
        HttpRequestDef.Builder<ListWorkloadIdentitiesRequest, ListWorkloadIdentitiesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListWorkloadIdentitiesRequest.class, ListWorkloadIdentitiesResponse.class)
            .withName("ListWorkloadIdentities")
            .withUri("/v1/workload-identities")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkloadIdentitiesRequest::getLimit, ListWorkloadIdentitiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkloadIdentitiesRequest::getMarker, ListWorkloadIdentitiesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse> updateWorkloadIdentity =
        genForUpdateWorkloadIdentity();

    private static HttpRequestDef<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse> genForUpdateWorkloadIdentity() {
        // basic
        HttpRequestDef.Builder<UpdateWorkloadIdentityRequest, UpdateWorkloadIdentityResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateWorkloadIdentityRequest.class, UpdateWorkloadIdentityResponse.class)
            .withName("UpdateWorkloadIdentity")
            .withUri("/v1/workload-identities/{workload_identity_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workload_identity_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWorkloadIdentityRequest::getWorkloadIdentityName,
                UpdateWorkloadIdentityRequest::setWorkloadIdentityName));
        builder.<UpdateWorkloadIdentityReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWorkloadIdentityReqBody.class),
            f -> f.withMarshaller(UpdateWorkloadIdentityRequest::getBody, UpdateWorkloadIdentityRequest::setBody));

        // response

        return builder.build();
    }

}

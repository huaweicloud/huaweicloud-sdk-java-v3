package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateManualImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateSecretResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerRequestBody;
import com.huaweicloud.sdk.swr.v2.model.CreateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.CreateUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.DeleteImageSyncRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoTagRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRepoTagResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.DeleteUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.DeleteUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListImageAutoSyncReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListImageAutoSyncReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListNamespacesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListNamespacesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListQuotasRequest;
import com.huaweicloud.sdk.swr.v2.model.ListQuotasResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRepositoryTagsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionHistoriesRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionHistoriesResponse;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListRetentionsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListSharedReposDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListSharedReposDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsRequest;
import com.huaweicloud.sdk.swr.v2.model.ListTriggersDetailsResponse;
import com.huaweicloud.sdk.swr.v2.model.ReportData;
import com.huaweicloud.sdk.swr.v2.model.Retention;
import com.huaweicloud.sdk.swr.v2.model.ShowAccessDomainRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowAccessDomainResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainOverviewRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainOverviewResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainResourceReportsRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowDomainResourceReportsResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowNamespaceResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowReposResp;
import com.huaweicloud.sdk.swr.v2.model.ShowReposTagResp;
import com.huaweicloud.sdk.swr.v2.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowShareFeatureGatesRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowShareFeatureGatesResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowSyncJobRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowSyncJobResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.ShowUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.ShowUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.SyncJob;
import com.huaweicloud.sdk.swr.v2.model.SyncRepo;
import com.huaweicloud.sdk.swr.v2.model.Trigger;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateNamespaceAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoDomainsResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRepoResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateRetentionResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerRequestBody;
import com.huaweicloud.sdk.swr.v2.model.UpdateTriggerResponse;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthRequest;
import com.huaweicloud.sdk.swr.v2.model.UpdateUserRepositoryAuthResponse;
import com.huaweicloud.sdk.swr.v2.model.UserAuth;

import java.util.List;

@SuppressWarnings("unchecked")
public class SwrMeta {

    public static final HttpRequestDef<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepo =
        genForCreateImageSyncRepo();

    private static HttpRequestDef<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> genForCreateImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageSyncRepoRequest.class, CreateImageSyncRepoResponse.class)
                .withName("CreateImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getNamespace, CreateImageSyncRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getRepository,
                CreateImageSyncRepoRequest::setRepository));
        builder.<CreateImageSyncRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateImageSyncRepoRequestBody.class),
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getBody, CreateImageSyncRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepo =
        genForCreateManualImageSyncRepo();

    private static HttpRequestDef<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> genForCreateManualImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateManualImageSyncRepoRequest.class,
                    CreateManualImageSyncRepoResponse.class)
                .withName("CreateManualImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_images")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getNamespace,
                CreateManualImageSyncRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getRepository,
                CreateManualImageSyncRepoRequest::setRepository));
        builder.<CreateManualImageSyncRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualImageSyncRepoRequestBody.class),
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getBody,
                CreateManualImageSyncRepoRequest::setBody));

        // response
        builder.<List<String>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(CreateManualImageSyncRepoResponse::getBody, CreateManualImageSyncRepoResponse::setBody)
                .withInnerContainerType(String.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateNamespaceRequest, CreateNamespaceResponse> createNamespace =
        genForCreateNamespace();

    private static HttpRequestDef<CreateNamespaceRequest, CreateNamespaceResponse> genForCreateNamespace() {
        // basic
        HttpRequestDef.Builder<CreateNamespaceRequest, CreateNamespaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNamespaceRequest.class, CreateNamespaceResponse.class)
                .withName("CreateNamespace")
                .withUri("/v2/manage/namespaces")
                .withContentType("application/json");

        // requests
        builder.<CreateNamespaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNamespaceRequestBody.class),
            f -> f.withMarshaller(CreateNamespaceRequest::getBody, CreateNamespaceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuth =
        genForCreateNamespaceAuth();

    private static HttpRequestDef<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> genForCreateNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNamespaceAuthRequest.class, CreateNamespaceAuthResponse.class)
                .withName("CreateNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNamespaceAuthRequest::getNamespace, CreateNamespaceAuthRequest::setNamespace));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateNamespaceAuthRequest::getBody, CreateNamespaceAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoRequest, CreateRepoResponse> createRepo = genForCreateRepo();

    private static HttpRequestDef<CreateRepoRequest, CreateRepoResponse> genForCreateRepo() {
        // basic
        HttpRequestDef.Builder<CreateRepoRequest, CreateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoRequest.class, CreateRepoResponse.class)
                .withName("CreateRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoRequest::getNamespace, CreateRepoRequest::setNamespace));
        builder.<CreateRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoRequestBody.class),
            f -> f.withMarshaller(CreateRepoRequest::getBody, CreateRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomains =
        genForCreateRepoDomains();

    private static HttpRequestDef<CreateRepoDomainsRequest, CreateRepoDomainsResponse> genForCreateRepoDomains() {
        // basic
        HttpRequestDef.Builder<CreateRepoDomainsRequest, CreateRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoDomainsRequest.class, CreateRepoDomainsResponse.class)
                .withName("CreateRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoDomainsRequest::getNamespace, CreateRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoDomainsRequest::getRepository, CreateRepoDomainsRequest::setRepository));
        builder.<CreateRepoDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoDomainsRequestBody.class),
            f -> f.withMarshaller(CreateRepoDomainsRequest::getBody, CreateRepoDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoTagRequest, CreateRepoTagResponse> createRepoTag =
        genForCreateRepoTag();

    private static HttpRequestDef<CreateRepoTagRequest, CreateRepoTagResponse> genForCreateRepoTag() {
        // basic
        HttpRequestDef.Builder<CreateRepoTagRequest, CreateRepoTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoTagRequest.class, CreateRepoTagResponse.class)
                .withName("CreateRepoTag")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoTagRequest::getNamespace, CreateRepoTagRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRepoTagRequest::getRepository, CreateRepoTagRequest::setRepository));
        builder.<CreateRepoTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoTagRequestBody.class),
            f -> f.withMarshaller(CreateRepoTagRequest::getBody, CreateRepoTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetentionRequest, CreateRetentionResponse> createRetention =
        genForCreateRetention();

    private static HttpRequestDef<CreateRetentionRequest, CreateRetentionResponse> genForCreateRetention() {
        // basic
        HttpRequestDef.Builder<CreateRetentionRequest, CreateRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRetentionRequest.class, CreateRetentionResponse.class)
                .withName("CreateRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetentionRequest::getNamespace, CreateRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetentionRequest::getRepository, CreateRetentionRequest::setRepository));
        builder.<CreateRetentionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetentionRequestBody.class),
            f -> f.withMarshaller(CreateRetentionRequest::getBody, CreateRetentionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForCreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForCreateSecret() {
        // basic
        HttpRequestDef.Builder<CreateSecretRequest, CreateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretRequest.class, CreateSecretResponse.class)
                .withName("CreateSecret")
                .withUri("/v2/manage/utils/secret")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("projectname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretRequest::getProjectname, CreateSecretRequest::setProjectname));

        // response

        builder.<String>withResponseField("X-Swr-Dockerlogin",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSecretResponse::getXSwrDockerlogin, CreateSecretResponse::setXSwrDockerlogin));
        return builder.build();
    }

    public static final HttpRequestDef<CreateTriggerRequest, CreateTriggerResponse> createTrigger =
        genForCreateTrigger();

    private static HttpRequestDef<CreateTriggerRequest, CreateTriggerResponse> genForCreateTrigger() {
        // basic
        HttpRequestDef.Builder<CreateTriggerRequest, CreateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTriggerRequest.class, CreateTriggerResponse.class)
                .withName("CreateTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTriggerRequest::getNamespace, CreateTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTriggerRequest::getRepository, CreateTriggerRequest::setRepository));
        builder.<CreateTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTriggerRequestBody.class),
            f -> f.withMarshaller(CreateTriggerRequest::getBody, CreateTriggerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuth =
        genForCreateUserRepositoryAuth();

    private static HttpRequestDef<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> genForCreateUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateUserRepositoryAuthRequest.class, CreateUserRepositoryAuthResponse.class)
                .withName("CreateUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getNamespace,
                CreateUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getRepository,
                CreateUserRepositoryAuthRequest::setRepository));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getBody, CreateUserRepositoryAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepo =
        genForDeleteImageSyncRepo();

    private static HttpRequestDef<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> genForDeleteImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteImageSyncRepoRequest.class, DeleteImageSyncRepoResponse.class)
            .withName("DeleteImageSyncRepo")
            .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getNamespace, DeleteImageSyncRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getRepository,
                DeleteImageSyncRepoRequest::setRepository));
        builder.<DeleteImageSyncRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteImageSyncRepoRequestBody.class),
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getBody, DeleteImageSyncRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuth =
        genForDeleteNamespaceAuth();

    private static HttpRequestDef<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> genForDeleteNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNamespaceAuthRequest.class, DeleteNamespaceAuthResponse.class)
            .withName("DeleteNamespaceAuth")
            .withUri("/v2/manage/namespaces/{namespace}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNamespaceAuthRequest::getNamespace, DeleteNamespaceAuthRequest::setNamespace));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteNamespaceAuthRequest::getBody, DeleteNamespaceAuthRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespaces =
        genForDeleteNamespaces();

    private static HttpRequestDef<DeleteNamespacesRequest, DeleteNamespacesResponse> genForDeleteNamespaces() {
        // basic
        HttpRequestDef.Builder<DeleteNamespacesRequest, DeleteNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNamespacesRequest.class, DeleteNamespacesResponse.class)
                .withName("DeleteNamespaces")
                .withUri("/v2/manage/namespaces/{namespace}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNamespacesRequest::getNamespace, DeleteNamespacesRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> deleteRepo = genForDeleteRepo();

    private static HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> genForDeleteRepo() {
        // basic
        HttpRequestDef.Builder<DeleteRepoRequest, DeleteRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoRequest.class, DeleteRepoResponse.class)
                .withName("DeleteRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoRequest::getNamespace, DeleteRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoRequest::getRepository, DeleteRepoRequest::setRepository));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomains =
        genForDeleteRepoDomains();

    private static HttpRequestDef<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> genForDeleteRepoDomains() {
        // basic
        HttpRequestDef.Builder<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoDomainsRequest.class, DeleteRepoDomainsResponse.class)
                .withName("DeleteRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getNamespace, DeleteRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getRepository, DeleteRepoDomainsRequest::setRepository));
        builder.<String>withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getAccessDomain,
                DeleteRepoDomainsRequest::setAccessDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTag =
        genForDeleteRepoTag();

    private static HttpRequestDef<DeleteRepoTagRequest, DeleteRepoTagResponse> genForDeleteRepoTag() {
        // basic
        HttpRequestDef.Builder<DeleteRepoTagRequest, DeleteRepoTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoTagRequest.class, DeleteRepoTagResponse.class)
                .withName("DeleteRepoTag")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoTagRequest::getNamespace, DeleteRepoTagRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoTagRequest::getRepository, DeleteRepoTagRequest::setRepository));
        builder.<String>withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoTagRequest::getTag, DeleteRepoTagRequest::setTag));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetention =
        genForDeleteRetention();

    private static HttpRequestDef<DeleteRetentionRequest, DeleteRetentionResponse> genForDeleteRetention() {
        // basic
        HttpRequestDef.Builder<DeleteRetentionRequest, DeleteRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRetentionRequest.class, DeleteRetentionResponse.class)
                .withName("DeleteRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRetentionRequest::getNamespace, DeleteRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRetentionRequest::getRepository, DeleteRetentionRequest::setRepository));
        builder.<Integer>withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(DeleteRetentionRequest::getRetentionId, DeleteRetentionRequest::setRetentionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTriggerRequest, DeleteTriggerResponse> deleteTrigger =
        genForDeleteTrigger();

    private static HttpRequestDef<DeleteTriggerRequest, DeleteTriggerResponse> genForDeleteTrigger() {
        // basic
        HttpRequestDef.Builder<DeleteTriggerRequest, DeleteTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTriggerRequest.class, DeleteTriggerResponse.class)
                .withName("DeleteTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTriggerRequest::getNamespace, DeleteTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTriggerRequest::getRepository, DeleteTriggerRequest::setRepository));
        builder.<String>withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTriggerRequest::getTrigger, DeleteTriggerRequest::setTrigger));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuth =
        genForDeleteUserRepositoryAuth();

    private static HttpRequestDef<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> genForDeleteUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteUserRepositoryAuthRequest.class,
                    DeleteUserRepositoryAuthResponse.class)
                .withName("DeleteUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getNamespace,
                DeleteUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getRepository,
                DeleteUserRepositoryAuthRequest::setRepository));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getBody, DeleteUserRepositoryAuthRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetails =
        genForListImageAutoSyncReposDetails();

    private static HttpRequestDef<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> genForListImageAutoSyncReposDetails() {
        // basic
        HttpRequestDef.Builder<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListImageAutoSyncReposDetailsRequest.class,
                    ListImageAutoSyncReposDetailsResponse.class)
                .withName("ListImageAutoSyncReposDetails")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsRequest::getNamespace,
                ListImageAutoSyncReposDetailsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsRequest::getRepository,
                ListImageAutoSyncReposDetailsRequest::setRepository));

        // response
        builder.<List<SyncRepo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListImageAutoSyncReposDetailsResponse::getBody,
                    ListImageAutoSyncReposDetailsResponse::setBody)
                .withInnerContainerType(SyncRepo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> listNamespaces =
        genForListNamespaces();

    private static HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> genForListNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNamespacesRequest, ListNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespacesRequest.class, ListNamespacesResponse.class)
                .withName("ListNamespaces")
                .withUri("/v2/manage/namespaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getNamespace, ListNamespacesRequest::setNamespace));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getFilter, ListNamespacesRequest::setFilter));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListQuotasRequest, ListQuotasResponse> listQuotas = genForListQuotas();

    private static HttpRequestDef<ListQuotasRequest, ListQuotasResponse> genForListQuotas() {
        // basic
        HttpRequestDef.Builder<ListQuotasRequest, ListQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQuotasRequest.class, ListQuotasResponse.class)
                .withName("ListQuotas")
                .withUri("/v2/manage/projects/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomains =
        genForListRepoDomains();

    private static HttpRequestDef<ListRepoDomainsRequest, ListRepoDomainsResponse> genForListRepoDomains() {
        // basic
        HttpRequestDef.Builder<ListRepoDomainsRequest, ListRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoDomainsRequest.class, ListRepoDomainsResponse.class)
                .withName("ListRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDomainsRequest::getNamespace, ListRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepoDomainsRequest::getRepository, ListRepoDomainsRequest::setRepository));

        // response
        builder.<List<ShowRepoDomainsResponse>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepoDomainsResponse::getBody, ListRepoDomainsResponse::setBody)
                .withInnerContainerType(ShowRepoDomainsResponse.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetails =
        genForListReposDetails();

    private static HttpRequestDef<ListReposDetailsRequest, ListReposDetailsResponse> genForListReposDetails() {
        // basic
        HttpRequestDef.Builder<ListReposDetailsRequest, ListReposDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReposDetailsRequest.class, ListReposDetailsResponse.class)
                .withName("ListReposDetails")
                .withUri("/v2/manage/repos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getNamespace, ListReposDetailsRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getName, ListReposDetailsRequest::setName));
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getCategory, ListReposDetailsRequest::setCategory));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getLimit, ListReposDetailsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getOffset, ListReposDetailsRequest::setOffset));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getOrderColumn, ListReposDetailsRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getOrderType, ListReposDetailsRequest::setOrderType));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposDetailsRequest::getFilter, ListReposDetailsRequest::setFilter));

        // response
        builder.<List<ShowReposResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListReposDetailsResponse::getBody, ListReposDetailsResponse::setBody)
                .withInnerContainerType(ShowReposResp.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReposDetailsResponse::getContentRange,
                ListReposDetailsResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTags =
        genForListRepositoryTags();

    private static HttpRequestDef<ListRepositoryTagsRequest, ListRepositoryTagsResponse> genForListRepositoryTags() {
        // basic
        HttpRequestDef.Builder<ListRepositoryTagsRequest, ListRepositoryTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryTagsRequest.class, ListRepositoryTagsResponse.class)
                .withName("ListRepositoryTags")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getNamespace, ListRepositoryTagsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getRepository, ListRepositoryTagsRequest::setRepository));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getLimit, ListRepositoryTagsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOffset, ListRepositoryTagsRequest::setOffset));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOrderColumn,
                ListRepositoryTagsRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOrderType, ListRepositoryTagsRequest::setOrderType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getTag, ListRepositoryTagsRequest::setTag));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRepositoryTagsRequest::getFilter, ListRepositoryTagsRequest::setFilter));

        // response
        builder.<List<ShowReposTagResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRepositoryTagsResponse::getBody, ListRepositoryTagsResponse::setBody)
                .withInnerContainerType(ShowReposTagResp.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsResponse::getContentRange,
                ListRepositoryTagsResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistories =
        genForListRetentionHistories();

    private static HttpRequestDef<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> genForListRetentionHistories() {
        // basic
        HttpRequestDef.Builder<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRetentionHistoriesRequest.class, ListRetentionHistoriesResponse.class)
            .withName("ListRetentionHistories")
            .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getNamespace,
                ListRetentionHistoriesRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getRepository,
                ListRetentionHistoriesRequest::setRepository));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getFilter, ListRetentionHistoriesRequest::setFilter));

        // response

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRetentionHistoriesResponse::getContentRange,
                ListRetentionHistoriesResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListRetentionsRequest, ListRetentionsResponse> listRetentions =
        genForListRetentions();

    private static HttpRequestDef<ListRetentionsRequest, ListRetentionsResponse> genForListRetentions() {
        // basic
        HttpRequestDef.Builder<ListRetentionsRequest, ListRetentionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRetentionsRequest.class, ListRetentionsResponse.class)
                .withName("ListRetentions")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionsRequest::getNamespace, ListRetentionsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetentionsRequest::getRepository, ListRetentionsRequest::setRepository));

        // response
        builder.<List<Retention>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRetentionsResponse::getBody, ListRetentionsResponse::setBody)
                .withInnerContainerType(Retention.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetails =
        genForListSharedReposDetails();

    private static HttpRequestDef<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> genForListSharedReposDetails() {
        // basic
        HttpRequestDef.Builder<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSharedReposDetailsRequest.class, ListSharedReposDetailsResponse.class)
            .withName("ListSharedReposDetails")
            .withUri("/v2/manage/shared-repositories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getNamespace,
                ListSharedReposDetailsRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getName, ListSharedReposDetailsRequest::setName));
        builder.<String>withRequestField("center",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getCenter, ListSharedReposDetailsRequest::setCenter));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getLimit, ListSharedReposDetailsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getOffset, ListSharedReposDetailsRequest::setOffset));
        builder.<String>withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getOrderColumn,
                ListSharedReposDetailsRequest::setOrderColumn));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getOrderType,
                ListSharedReposDetailsRequest::setOrderType));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getFilter, ListSharedReposDetailsRequest::setFilter));

        // response
        builder.<List<ShowReposResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSharedReposDetailsResponse::getBody, ListSharedReposDetailsResponse::setBody)
                .withInnerContainerType(ShowReposResp.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSharedReposDetailsResponse::getContentRange,
                ListSharedReposDetailsResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetails =
        genForListTriggersDetails();

    private static HttpRequestDef<ListTriggersDetailsRequest, ListTriggersDetailsResponse> genForListTriggersDetails() {
        // basic
        HttpRequestDef.Builder<ListTriggersDetailsRequest, ListTriggersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTriggersDetailsRequest.class, ListTriggersDetailsResponse.class)
                .withName("ListTriggersDetails")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersDetailsRequest::getNamespace, ListTriggersDetailsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTriggersDetailsRequest::getRepository,
                ListTriggersDetailsRequest::setRepository));

        // response
        builder.<List<Trigger>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTriggersDetailsResponse::getBody, ListTriggersDetailsResponse::setBody)
                .withInnerContainerType(Trigger.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomain =
        genForShowAccessDomain();

    private static HttpRequestDef<ShowAccessDomainRequest, ShowAccessDomainResponse> genForShowAccessDomain() {
        // basic
        HttpRequestDef.Builder<ShowAccessDomainRequest, ShowAccessDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessDomainRequest.class, ShowAccessDomainResponse.class)
                .withName("ShowAccessDomain")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessDomainRequest::getNamespace, ShowAccessDomainRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessDomainRequest::getRepository, ShowAccessDomainRequest::setRepository));
        builder.<String>withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessDomainRequest::getAccessDomain, ShowAccessDomainRequest::setAccessDomain));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainOverviewRequest, ShowDomainOverviewResponse> showDomainOverview =
        genForShowDomainOverview();

    private static HttpRequestDef<ShowDomainOverviewRequest, ShowDomainOverviewResponse> genForShowDomainOverview() {
        // basic
        HttpRequestDef.Builder<ShowDomainOverviewRequest, ShowDomainOverviewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainOverviewRequest.class, ShowDomainOverviewResponse.class)
                .withName("ShowDomainOverview")
                .withUri("/v2/manage/overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> showDomainResourceReports =
        genForShowDomainResourceReports();

    private static HttpRequestDef<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> genForShowDomainResourceReports() {
        // basic
        HttpRequestDef.Builder<ShowDomainResourceReportsRequest, ShowDomainResourceReportsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDomainResourceReportsRequest.class,
                    ShowDomainResourceReportsResponse.class)
                .withName("ShowDomainResourceReports")
                .withUri("/v2/manage/reports/{resource_type}/{frequency}")
                .withContentType("application/json");

        // requests
        builder.<ShowDomainResourceReportsRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDomainResourceReportsRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ShowDomainResourceReportsRequest::getResourceType,
                ShowDomainResourceReportsRequest::setResourceType));
        builder.<ShowDomainResourceReportsRequest.FrequencyEnum>withRequestField("frequency",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDomainResourceReportsRequest.FrequencyEnum.class),
            f -> f.withMarshaller(ShowDomainResourceReportsRequest::getFrequency,
                ShowDomainResourceReportsRequest::setFrequency));

        // response
        builder.<List<ReportData>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowDomainResourceReportsResponse::getBody, ShowDomainResourceReportsResponse::setBody)
                .withInnerContainerType(ReportData.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowNamespaceRequest, ShowNamespaceResponse> showNamespace =
        genForShowNamespace();

    private static HttpRequestDef<ShowNamespaceRequest, ShowNamespaceResponse> genForShowNamespace() {
        // basic
        HttpRequestDef.Builder<ShowNamespaceRequest, ShowNamespaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNamespaceRequest.class, ShowNamespaceResponse.class)
                .withName("ShowNamespace")
                .withUri("/v2/manage/namespaces/{namespace}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNamespaceRequest::getNamespace, ShowNamespaceRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuth =
        genForShowNamespaceAuth();

    private static HttpRequestDef<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> genForShowNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNamespaceAuthRequest.class, ShowNamespaceAuthResponse.class)
                .withName("ShowNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNamespaceAuthRequest::getNamespace, ShowNamespaceAuthRequest::setNamespace));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> showRepository =
        genForShowRepository();

    private static HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> genForShowRepository() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryRequest, ShowRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryRequest.class, ShowRepositoryResponse.class)
                .withName("ShowRepository")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getNamespace, ShowRepositoryRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRepositoryRequest::getRepository, ShowRepositoryRequest::setRepository));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRetentionRequest, ShowRetentionResponse> showRetention =
        genForShowRetention();

    private static HttpRequestDef<ShowRetentionRequest, ShowRetentionResponse> genForShowRetention() {
        // basic
        HttpRequestDef.Builder<ShowRetentionRequest, ShowRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRetentionRequest.class, ShowRetentionResponse.class)
                .withName("ShowRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetentionRequest::getNamespace, ShowRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetentionRequest::getRepository, ShowRetentionRequest::setRepository));
        builder.<Integer>withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRetentionRequest::getRetentionId, ShowRetentionRequest::setRetentionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> showShareFeatureGates =
        genForShowShareFeatureGates();

    private static HttpRequestDef<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> genForShowShareFeatureGates() {
        // basic
        HttpRequestDef.Builder<ShowShareFeatureGatesRequest, ShowShareFeatureGatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowShareFeatureGatesRequest.class, ShowShareFeatureGatesResponse.class)
            .withName("ShowShareFeatureGates")
            .withUri("/v2/manage/projects/{project_id}/feature-gates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJob = genForShowSyncJob();

    private static HttpRequestDef<ShowSyncJobRequest, ShowSyncJobResponse> genForShowSyncJob() {
        // basic
        HttpRequestDef.Builder<ShowSyncJobRequest, ShowSyncJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSyncJobRequest.class, ShowSyncJobResponse.class)
                .withName("ShowSyncJob")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncJobRequest::getNamespace, ShowSyncJobRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncJobRequest::getRepository, ShowSyncJobRequest::setRepository));
        builder.<String>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSyncJobRequest::getFilter, ShowSyncJobRequest::setFilter));

        // response
        builder.<List<SyncJob>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowSyncJobResponse::getBody, ShowSyncJobResponse::setBody)
                .withInnerContainerType(SyncJob.class));

        builder.<String>withResponseField("Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowSyncJobResponse::getContentRange, ShowSyncJobResponse::setContentRange));
        return builder.build();
    }

    public static final HttpRequestDef<ShowTriggerRequest, ShowTriggerResponse> showTrigger = genForShowTrigger();

    private static HttpRequestDef<ShowTriggerRequest, ShowTriggerResponse> genForShowTrigger() {
        // basic
        HttpRequestDef.Builder<ShowTriggerRequest, ShowTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTriggerRequest.class, ShowTriggerResponse.class)
                .withName("ShowTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTriggerRequest::getNamespace, ShowTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTriggerRequest::getRepository, ShowTriggerRequest::setRepository));
        builder.<String>withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTriggerRequest::getTrigger, ShowTriggerRequest::setTrigger));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuth =
        genForShowUserRepositoryAuth();

    private static HttpRequestDef<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> genForShowUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowUserRepositoryAuthRequest.class, ShowUserRepositoryAuthResponse.class)
            .withName("ShowUserRepositoryAuth")
            .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRepositoryAuthRequest::getNamespace,
                ShowUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserRepositoryAuthRequest::getRepository,
                ShowUserRepositoryAuthRequest::setRepository));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuth =
        genForUpdateNamespaceAuth();

    private static HttpRequestDef<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> genForUpdateNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PATCH, UpdateNamespaceAuthRequest.class, UpdateNamespaceAuthResponse.class)
            .withName("UpdateNamespaceAuth")
            .withUri("/v2/manage/namespaces/{namespace}/access")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNamespaceAuthRequest::getNamespace, UpdateNamespaceAuthRequest::setNamespace));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateNamespaceAuthRequest::getBody, UpdateNamespaceAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> updateRepo = genForUpdateRepo();

    private static HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> genForUpdateRepo() {
        // basic
        HttpRequestDef.Builder<UpdateRepoRequest, UpdateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRepoRequest.class, UpdateRepoResponse.class)
                .withName("UpdateRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoRequest::getNamespace, UpdateRepoRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoRequest::getRepository, UpdateRepoRequest::setRepository));
        builder.<UpdateRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRepoRequestBody.class),
            f -> f.withMarshaller(UpdateRepoRequest::getBody, UpdateRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomains =
        genForUpdateRepoDomains();

    private static HttpRequestDef<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> genForUpdateRepoDomains() {
        // basic
        HttpRequestDef.Builder<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRepoDomainsRequest.class, UpdateRepoDomainsResponse.class)
                .withName("UpdateRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getNamespace, UpdateRepoDomainsRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getRepository, UpdateRepoDomainsRequest::setRepository));
        builder.<String>withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getAccessDomain,
                UpdateRepoDomainsRequest::setAccessDomain));
        builder.<UpdateRepoDomainsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRepoDomainsRequestBody.class),
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getBody, UpdateRepoDomainsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRetentionRequest, UpdateRetentionResponse> updateRetention =
        genForUpdateRetention();

    private static HttpRequestDef<UpdateRetentionRequest, UpdateRetentionResponse> genForUpdateRetention() {
        // basic
        HttpRequestDef.Builder<UpdateRetentionRequest, UpdateRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRetentionRequest.class, UpdateRetentionResponse.class)
                .withName("UpdateRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getNamespace, UpdateRetentionRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getRepository, UpdateRetentionRequest::setRepository));
        builder.<Integer>withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getRetentionId, UpdateRetentionRequest::setRetentionId));
        builder.<UpdateRetentionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRetentionRequestBody.class),
            f -> f.withMarshaller(UpdateRetentionRequest::getBody, UpdateRetentionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> updateTrigger =
        genForUpdateTrigger();

    private static HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> genForUpdateTrigger() {
        // basic
        HttpRequestDef.Builder<UpdateTriggerRequest, UpdateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateTriggerRequest.class, UpdateTriggerResponse.class)
                .withName("UpdateTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getNamespace, UpdateTriggerRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getRepository, UpdateTriggerRequest::setRepository));
        builder.<String>withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getTrigger, UpdateTriggerRequest::setTrigger));
        builder.<UpdateTriggerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTriggerRequestBody.class),
            f -> f.withMarshaller(UpdateTriggerRequest::getBody, UpdateTriggerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuth =
        genForUpdateUserRepositoryAuth();

    private static HttpRequestDef<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> genForUpdateUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    UpdateUserRepositoryAuthRequest.class,
                    UpdateUserRepositoryAuthResponse.class)
                .withName("UpdateUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getNamespace,
                UpdateUserRepositoryAuthRequest::setNamespace));
        builder.<String>withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getRepository,
                UpdateUserRepositoryAuthRequest::setRepository));
        builder.<List<UserAuth>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getBody, UpdateUserRepositoryAuthRequest::setBody)
                .withInnerContainerType(UserAuth.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, ShowApiVersionRequest::setApiVersion));

        // response

        return builder.build();
    }

}

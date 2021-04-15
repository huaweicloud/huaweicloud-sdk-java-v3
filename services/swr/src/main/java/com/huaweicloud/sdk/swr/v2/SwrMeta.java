package com.huaweicloud.sdk.swr.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.swr.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class SwrMeta {

    public static final HttpRequestDef<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> createImageSyncRepo = genForcreateImageSyncRepo();

    private static HttpRequestDef<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> genForcreateImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<CreateImageSyncRepoRequest, CreateImageSyncRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateImageSyncRepoRequest.class, CreateImageSyncRepoResponse.class)
                .withName("CreateImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateImageSyncRepoRequestBody.class,
            f -> f.withMarshaller(CreateImageSyncRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> createManualImageSyncRepo = genForcreateManualImageSyncRepo();

    private static HttpRequestDef<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> genForcreateManualImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<CreateManualImageSyncRepoRequest, CreateManualImageSyncRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateManualImageSyncRepoRequest.class, CreateManualImageSyncRepoResponse.class)
                .withName("CreateManualImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_images")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateManualImageSyncRepoRequestBody.class,
            f -> f.withMarshaller(CreateManualImageSyncRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(CreateManualImageSyncRepoResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(String.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<CreateNamespaceRequest, CreateNamespaceResponse> createNamespace = genForcreateNamespace();

    private static HttpRequestDef<CreateNamespaceRequest, CreateNamespaceResponse> genForcreateNamespace() {
        // basic
        HttpRequestDef.Builder<CreateNamespaceRequest, CreateNamespaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNamespaceRequest.class, CreateNamespaceResponse.class)
                .withName("CreateNamespace")
                .withUri("/v2/manage/namespaces")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateNamespaceRequestBody.class,
            f -> f.withMarshaller(CreateNamespaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> createNamespaceAuth = genForcreateNamespaceAuth();

    private static HttpRequestDef<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> genForcreateNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<CreateNamespaceAuthRequest, CreateNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNamespaceAuthRequest.class, CreateNamespaceAuthResponse.class)
                .withName("CreateNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateNamespaceAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(CreateNamespaceAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UserAuth.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoRequest, CreateRepoResponse> createRepo = genForcreateRepo();

    private static HttpRequestDef<CreateRepoRequest, CreateRepoResponse> genForcreateRepo() {
        // basic
        HttpRequestDef.Builder<CreateRepoRequest, CreateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoRequest.class, CreateRepoResponse.class)
                .withName("CreateRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRepoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRepoRequestBody.class,
            f -> f.withMarshaller(CreateRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoDomainsRequest, CreateRepoDomainsResponse> createRepoDomains = genForcreateRepoDomains();

    private static HttpRequestDef<CreateRepoDomainsRequest, CreateRepoDomainsResponse> genForcreateRepoDomains() {
        // basic
        HttpRequestDef.Builder<CreateRepoDomainsRequest, CreateRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoDomainsRequest.class, CreateRepoDomainsResponse.class)
                .withName("CreateRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRepoDomainsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRepoDomainsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRepoDomainsRequestBody.class,
            f -> f.withMarshaller(CreateRepoDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateRetentionRequest, CreateRetentionResponse> createRetention = genForcreateRetention();

    private static HttpRequestDef<CreateRetentionRequest, CreateRetentionResponse> genForcreateRetention() {
        // basic
        HttpRequestDef.Builder<CreateRetentionRequest, CreateRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRetentionRequest.class, CreateRetentionResponse.class)
                .withName("CreateRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRetentionRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRetentionRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateRetentionRequestBody.class,
            f -> f.withMarshaller(CreateRetentionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForcreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForcreateSecret() {
        // basic
        HttpRequestDef.Builder<CreateSecretRequest, CreateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretRequest.class, CreateSecretResponse.class)
                .withName("CreateSecret")
                .withUri("/v2/manage/utils/secret")
                .withContentType("application/json");

        // requests
        builder.withRequestField("projectname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateSecretRequest::getProjectname, (req, v) -> {
                req.setProjectname(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateTriggerRequest, CreateTriggerResponse> createTrigger = genForcreateTrigger();

    private static HttpRequestDef<CreateTriggerRequest, CreateTriggerResponse> genForcreateTrigger() {
        // basic
        HttpRequestDef.Builder<CreateTriggerRequest, CreateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTriggerRequest.class, CreateTriggerResponse.class)
                .withName("CreateTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateTriggerRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateTriggerRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateTriggerRequestBody.class,
            f -> f.withMarshaller(CreateTriggerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> createUserRepositoryAuth = genForcreateUserRepositoryAuth();

    private static HttpRequestDef<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> genForcreateUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<CreateUserRepositoryAuthRequest, CreateUserRepositoryAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserRepositoryAuthRequest.class, CreateUserRepositoryAuthResponse.class)
                .withName("CreateUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(CreateUserRepositoryAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UserAuth.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> deleteImageSyncRepo = genFordeleteImageSyncRepo();

    private static HttpRequestDef<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> genFordeleteImageSyncRepo() {
        // basic
        HttpRequestDef.Builder<DeleteImageSyncRepoRequest, DeleteImageSyncRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteImageSyncRepoRequest.class, DeleteImageSyncRepoResponse.class)
                .withName("DeleteImageSyncRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DeleteImageSyncRepoRequestBody.class,
            f -> f.withMarshaller(DeleteImageSyncRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> deleteNamespaceAuth = genFordeleteNamespaceAuth();

    private static HttpRequestDef<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> genFordeleteNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<DeleteNamespaceAuthRequest, DeleteNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNamespaceAuthRequest.class, DeleteNamespaceAuthResponse.class)
                .withName("DeleteNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteNamespaceAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteNamespaceAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteNamespacesRequest, DeleteNamespacesResponse> deleteNamespaces = genFordeleteNamespaces();

    private static HttpRequestDef<DeleteNamespacesRequest, DeleteNamespacesResponse> genFordeleteNamespaces() {
        // basic
        HttpRequestDef.Builder<DeleteNamespacesRequest, DeleteNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNamespacesRequest.class, DeleteNamespacesResponse.class)
                .withName("DeleteNamespaces")
                .withUri("/v2/manage/namespaces/{namespace}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteNamespacesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> deleteRepo = genFordeleteRepo();

    private static HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> genFordeleteRepo() {
        // basic
        HttpRequestDef.Builder<DeleteRepoRequest, DeleteRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoRequest.class, DeleteRepoResponse.class)
                .withName("DeleteRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> deleteRepoDomains = genFordeleteRepoDomains();

    private static HttpRequestDef<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> genFordeleteRepoDomains() {
        // basic
        HttpRequestDef.Builder<DeleteRepoDomainsRequest, DeleteRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoDomainsRequest.class, DeleteRepoDomainsResponse.class)
                .withName("DeleteRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoDomainsRequest::getAccessDomain, (req, v) -> {
                req.setAccessDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoTagRequest, DeleteRepoTagResponse> deleteRepoTag = genFordeleteRepoTag();

    private static HttpRequestDef<DeleteRepoTagRequest, DeleteRepoTagResponse> genFordeleteRepoTag() {
        // basic
        HttpRequestDef.Builder<DeleteRepoTagRequest, DeleteRepoTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoTagRequest.class, DeleteRepoTagResponse.class)
                .withName("DeleteRepoTag")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags/{tag}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoTagRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoTagRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("tag",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRepoTagRequest::getTag, (req, v) -> {
                req.setTag(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteRetentionRequest, DeleteRetentionResponse> deleteRetention = genFordeleteRetention();

    private static HttpRequestDef<DeleteRetentionRequest, DeleteRetentionResponse> genFordeleteRetention() {
        // basic
        HttpRequestDef.Builder<DeleteRetentionRequest, DeleteRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRetentionRequest.class, DeleteRetentionResponse.class)
                .withName("DeleteRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRetentionRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteRetentionRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(DeleteRetentionRequest::getRetentionId, (req, v) -> {
                req.setRetentionId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteTriggerRequest, DeleteTriggerResponse> deleteTrigger = genFordeleteTrigger();

    private static HttpRequestDef<DeleteTriggerRequest, DeleteTriggerResponse> genFordeleteTrigger() {
        // basic
        HttpRequestDef.Builder<DeleteTriggerRequest, DeleteTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTriggerRequest.class, DeleteTriggerResponse.class)
                .withName("DeleteTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTriggerRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTriggerRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTriggerRequest::getTrigger, (req, v) -> {
                req.setTrigger(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> deleteUserRepositoryAuth = genFordeleteUserRepositoryAuth();

    private static HttpRequestDef<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> genFordeleteUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<DeleteUserRepositoryAuthRequest, DeleteUserRepositoryAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserRepositoryAuthRequest.class, DeleteUserRepositoryAuthResponse.class)
                .withName("DeleteUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(DeleteUserRepositoryAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> listImageAutoSyncReposDetails = genForlistImageAutoSyncReposDetails();

    private static HttpRequestDef<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> genForlistImageAutoSyncReposDetails() {
        // basic
        HttpRequestDef.Builder<ListImageAutoSyncReposDetailsRequest, ListImageAutoSyncReposDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImageAutoSyncReposDetailsRequest.class, ListImageAutoSyncReposDetailsResponse.class)
                .withName("ListImageAutoSyncReposDetails")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_repo")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListImageAutoSyncReposDetailsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(SyncRepo.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> listNamespaces = genForlistNamespaces();

    private static HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> genForlistNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNamespacesRequest, ListNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespacesRequest.class, ListNamespacesResponse.class)
                .withName("ListNamespaces")
                .withUri("/v2/manage/namespaces")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListNamespacesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListRepoDomainsRequest, ListRepoDomainsResponse> listRepoDomains = genForlistRepoDomains();

    private static HttpRequestDef<ListRepoDomainsRequest, ListRepoDomainsResponse> genForlistRepoDomains() {
        // basic
        HttpRequestDef.Builder<ListRepoDomainsRequest, ListRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepoDomainsRequest.class, ListRepoDomainsResponse.class)
                .withName("ListRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRepoDomainsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRepoDomainsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListRepoDomainsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ShowRepoDomainsResponse.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListReposDetailsRequest, ListReposDetailsResponse> listReposDetails = genForlistReposDetails();

    private static HttpRequestDef<ListReposDetailsRequest, ListReposDetailsResponse> genForlistReposDetails() {
        // basic
        HttpRequestDef.Builder<ListReposDetailsRequest, ListReposDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReposDetailsRequest.class, ListReposDetailsResponse.class)
                .withName("ListReposDetails")
                .withUri("/v2/manage/repos")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReposDetailsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReposDetailsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReposDetailsRequest::getCategory, (req, v) -> {
                req.setCategory(v);
            })
        );
        builder.withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListReposDetailsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListReposDetailsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ShowReposResp.class)
        );


        builder.withResponseField(
            "Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListReposDetailsResponse::getContentRange,
                ListReposDetailsResponse::setContentRange)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListRepositoryTagsRequest, ListRepositoryTagsResponse> listRepositoryTags = genForlistRepositoryTags();

    private static HttpRequestDef<ListRepositoryTagsRequest, ListRepositoryTagsResponse> genForlistRepositoryTags() {
        // basic
        HttpRequestDef.Builder<ListRepositoryTagsRequest, ListRepositoryTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRepositoryTagsRequest.class, ListRepositoryTagsResponse.class)
                .withName("ListRepositoryTags")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/tags")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("order_column",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOrderColumn, (req, v) -> {
                req.setOrderColumn(v);
            })
        );
        builder.withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListRepositoryTagsRequest.OrderTypeEnum.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getOrderType, (req, v) -> {
                req.setOrderType(v);
            })
        );
        builder.withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRepositoryTagsRequest::getTag, (req, v) -> {
                req.setTag(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListRepositoryTagsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ShowReposTagResp.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> listRetentionHistories = genForlistRetentionHistories();

    private static HttpRequestDef<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> genForlistRetentionHistories() {
        // basic
        HttpRequestDef.Builder<ListRetentionHistoriesRequest, ListRetentionHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRetentionHistoriesRequest.class, ListRetentionHistoriesResponse.class)
                .withName("ListRetentionHistories")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/histories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRetentionHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        


        builder.withResponseField(
            "Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListRetentionHistoriesResponse::getContentRange,
                ListRetentionHistoriesResponse::setContentRange)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListRetentionsRequest, ListRetentionsResponse> listRetentions = genForlistRetentions();

    private static HttpRequestDef<ListRetentionsRequest, ListRetentionsResponse> genForlistRetentions() {
        // basic
        HttpRequestDef.Builder<ListRetentionsRequest, ListRetentionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRetentionsRequest.class, ListRetentionsResponse.class)
                .withName("ListRetentions")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRetentionsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRetentionsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListRetentionsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(Retention.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> listSharedReposDetails = genForlistSharedReposDetails();

    private static HttpRequestDef<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> genForlistSharedReposDetails() {
        // basic
        HttpRequestDef.Builder<ListSharedReposDetailsRequest, ListSharedReposDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSharedReposDetailsRequest.class, ListSharedReposDetailsResponse.class)
                .withName("ListSharedReposDetails")
                .withUri("/v2/manage/shared-repositories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("filter",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSharedReposDetailsRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListSharedReposDetailsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(ShowReposResp.class)
        );


        builder.withResponseField(
            "Content-Range",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListSharedReposDetailsResponse::getContentRange,
                ListSharedReposDetailsResponse::setContentRange)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListTriggersDetailsRequest, ListTriggersDetailsResponse> listTriggersDetails = genForlistTriggersDetails();

    private static HttpRequestDef<ListTriggersDetailsRequest, ListTriggersDetailsResponse> genForlistTriggersDetails() {
        // basic
        HttpRequestDef.Builder<ListTriggersDetailsRequest, ListTriggersDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTriggersDetailsRequest.class, ListTriggersDetailsResponse.class)
                .withName("ListTriggersDetails")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTriggersDetailsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListTriggersDetailsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListTriggersDetailsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(Trigger.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessDomainRequest, ShowAccessDomainResponse> showAccessDomain = genForshowAccessDomain();

    private static HttpRequestDef<ShowAccessDomainRequest, ShowAccessDomainResponse> genForshowAccessDomain() {
        // basic
        HttpRequestDef.Builder<ShowAccessDomainRequest, ShowAccessDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccessDomainRequest.class, ShowAccessDomainResponse.class)
                .withName("ShowAccessDomain")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAccessDomainRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAccessDomainRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAccessDomainRequest::getAccessDomain, (req, v) -> {
                req.setAccessDomain(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowNamespaceRequest, ShowNamespaceResponse> showNamespace = genForshowNamespace();

    private static HttpRequestDef<ShowNamespaceRequest, ShowNamespaceResponse> genForshowNamespace() {
        // basic
        HttpRequestDef.Builder<ShowNamespaceRequest, ShowNamespaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNamespaceRequest.class, ShowNamespaceResponse.class)
                .withName("ShowNamespace")
                .withUri("/v2/manage/namespaces/{namespace}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNamespaceRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> showNamespaceAuth = genForshowNamespaceAuth();

    private static HttpRequestDef<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> genForshowNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<ShowNamespaceAuthRequest, ShowNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNamespaceAuthRequest.class, ShowNamespaceAuthResponse.class)
                .withName("ShowNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowNamespaceAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> showRepository = genForshowRepository();

    private static HttpRequestDef<ShowRepositoryRequest, ShowRepositoryResponse> genForshowRepository() {
        // basic
        HttpRequestDef.Builder<ShowRepositoryRequest, ShowRepositoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRepositoryRequest.class, ShowRepositoryResponse.class)
                .withName("ShowRepository")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepositoryRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRepositoryRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowRetentionRequest, ShowRetentionResponse> showRetention = genForshowRetention();

    private static HttpRequestDef<ShowRetentionRequest, ShowRetentionResponse> genForshowRetention() {
        // basic
        HttpRequestDef.Builder<ShowRetentionRequest, ShowRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRetentionRequest.class, ShowRetentionResponse.class)
                .withName("ShowRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRetentionRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowRetentionRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowRetentionRequest::getRetentionId, (req, v) -> {
                req.setRetentionId(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowSyncJobRequest, ShowSyncJobResponse> showSyncJob = genForshowSyncJob();

    private static HttpRequestDef<ShowSyncJobRequest, ShowSyncJobResponse> genForshowSyncJob() {
        // basic
        HttpRequestDef.Builder<ShowSyncJobRequest, ShowSyncJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSyncJobRequest.class, ShowSyncJobResponse.class)
                .withName("ShowSyncJob")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/sync_job")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSyncJobRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSyncJobRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowSyncJobRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            })
        );

        // response
        
        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowSyncJobResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(SyncJob.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<ShowTriggerRequest, ShowTriggerResponse> showTrigger = genForshowTrigger();

    private static HttpRequestDef<ShowTriggerRequest, ShowTriggerResponse> genForshowTrigger() {
        // basic
        HttpRequestDef.Builder<ShowTriggerRequest, ShowTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTriggerRequest.class, ShowTriggerResponse.class)
                .withName("ShowTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTriggerRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTriggerRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowTriggerRequest::getTrigger, (req, v) -> {
                req.setTrigger(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> showUserRepositoryAuth = genForshowUserRepositoryAuth();

    private static HttpRequestDef<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> genForshowUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<ShowUserRepositoryAuthRequest, ShowUserRepositoryAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserRepositoryAuthRequest.class, ShowUserRepositoryAuthResponse.class)
                .withName("ShowUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserRepositoryAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserRepositoryAuthRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> updateNamespaceAuth = genForupdateNamespaceAuth();

    private static HttpRequestDef<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> genForupdateNamespaceAuth() {
        // basic
        HttpRequestDef.Builder<UpdateNamespaceAuthRequest, UpdateNamespaceAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateNamespaceAuthRequest.class, UpdateNamespaceAuthResponse.class)
                .withName("UpdateNamespaceAuth")
                .withUri("/v2/manage/namespaces/{namespace}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateNamespaceAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(UpdateNamespaceAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UserAuth.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> updateRepo = genForupdateRepo();

    private static HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> genForupdateRepo() {
        // basic
        HttpRequestDef.Builder<UpdateRepoRequest, UpdateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRepoRequest.class, UpdateRepoResponse.class)
                .withName("UpdateRepo")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRepoRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRepoRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateRepoRequestBody.class,
            f -> f.withMarshaller(UpdateRepoRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> updateRepoDomains = genForupdateRepoDomains();

    private static HttpRequestDef<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> genForupdateRepoDomains() {
        // basic
        HttpRequestDef.Builder<UpdateRepoDomainsRequest, UpdateRepoDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRepoDomainsRequest.class, UpdateRepoDomainsResponse.class)
                .withName("UpdateRepoDomains")
                .withUri("/v2/manage/namespaces/{namespace}/repositories/{repository}/access-domains/{access_domain}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("access_domain",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getAccessDomain, (req, v) -> {
                req.setAccessDomain(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateRepoDomainsRequestBody.class,
            f -> f.withMarshaller(UpdateRepoDomainsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateRetentionRequest, UpdateRetentionResponse> updateRetention = genForupdateRetention();

    private static HttpRequestDef<UpdateRetentionRequest, UpdateRetentionResponse> genForupdateRetention() {
        // basic
        HttpRequestDef.Builder<UpdateRetentionRequest, UpdateRetentionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateRetentionRequest.class, UpdateRetentionResponse.class)
                .withName("UpdateRetention")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/retentions/{retention_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRetentionRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateRetentionRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("retention_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(UpdateRetentionRequest::getRetentionId, (req, v) -> {
                req.setRetentionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateRetentionRequestBody.class,
            f -> f.withMarshaller(UpdateRetentionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> updateTrigger = genForupdateTrigger();

    private static HttpRequestDef<UpdateTriggerRequest, UpdateTriggerResponse> genForupdateTrigger() {
        // basic
        HttpRequestDef.Builder<UpdateTriggerRequest, UpdateTriggerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateTriggerRequest.class, UpdateTriggerResponse.class)
                .withName("UpdateTrigger")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/triggers/{trigger}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTriggerRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTriggerRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("trigger",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateTriggerRequest::getTrigger, (req, v) -> {
                req.setTrigger(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateTriggerRequestBody.class,
            f -> f.withMarshaller(UpdateTriggerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> updateUserRepositoryAuth = genForupdateUserRepositoryAuth();

    private static HttpRequestDef<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> genForupdateUserRepositoryAuth() {
        // basic
        HttpRequestDef.Builder<UpdateUserRepositoryAuthRequest, UpdateUserRepositoryAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdateUserRepositoryAuthRequest.class, UpdateUserRepositoryAuthResponse.class)
                .withName("UpdateUserRepositoryAuth")
                .withUri("/v2/manage/namespaces/{namespace}/repos/{repository}/access")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("repository",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getRepository, (req, v) -> {
                req.setRepository(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(UpdateUserRepositoryAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(UserAuth.class)
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions = genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
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

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion = genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/{api_version}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("api_version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowApiVersionRequest::getApiVersion, (req, v) -> {
                req.setApiVersion(v);
            })
        );

        // response
        


        return builder.build();
    }

}

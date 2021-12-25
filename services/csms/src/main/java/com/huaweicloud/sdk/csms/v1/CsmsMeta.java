package com.huaweicloud.sdk.csms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.csms.v1.model.*;

@SuppressWarnings("unchecked")
public class CsmsMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTags =
        genForbatchCreateOrDeleteTags();

    private static HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> genForbatchCreateOrDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateOrDeleteTagsRequest.class, BatchCreateOrDeleteTagsResponse.class)
            .withName("BatchCreateOrDeleteTags")
            .withUri("/v1/{project_id}/csms/{secret_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<BatchCreateOrDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForcreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForcreateSecret() {
        // basic
        HttpRequestDef.Builder<CreateSecretRequest, CreateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretRequest.class, CreateSecretResponse.class)
                .withName("CreateSecret")
                .withUri("/v1/{project_id}/secrets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecretRequestBody.class),
            f -> f.withMarshaller(CreateSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretTagRequest, CreateSecretTagResponse> createSecretTag =
        genForcreateSecretTag();

    private static HttpRequestDef<CreateSecretTagRequest, CreateSecretTagResponse> genForcreateSecretTag() {
        // basic
        HttpRequestDef.Builder<CreateSecretTagRequest, CreateSecretTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretTagRequest.class, CreateSecretTagResponse.class)
                .withName("CreateSecretTag")
                .withUri("/v1/{project_id}/csms/{secret_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretTagRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<CreateSecretTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecretTagRequestBody.class),
            f -> f.withMarshaller(CreateSecretTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersion =
        genForcreateSecretVersion();

    private static HttpRequestDef<CreateSecretVersionRequest, CreateSecretVersionResponse> genForcreateSecretVersion() {
        // basic
        HttpRequestDef.Builder<CreateSecretVersionRequest, CreateSecretVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretVersionRequest.class, CreateSecretVersionResponse.class)
                .withName("CreateSecretVersion")
                .withUri("/v1/{project_id}/secrets/{secret_name}/versions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretVersionRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<CreateSecretVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecretVersionRequestBody.class),
            f -> f.withMarshaller(CreateSecretVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> deleteSecret = genFordeleteSecret();

    private static HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> genFordeleteSecret() {
        // basic
        HttpRequestDef.Builder<DeleteSecretRequest, DeleteSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecretRequest.class, DeleteSecretResponse.class)
                .withName("DeleteSecret")
                .withUri("/v1/{project_id}/secrets/{secret_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForSchedule =
        genFordeleteSecretForSchedule();

    private static HttpRequestDef<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> genFordeleteSecretForSchedule() {
        // basic
        HttpRequestDef.Builder<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteSecretForScheduleRequest.class, DeleteSecretForScheduleResponse.class)
            .withName("DeleteSecretForSchedule")
            .withUri("/v1/{project_id}/secrets/{secret_name}/scheduled-deleted-tasks/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretForScheduleRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<DeleteSecretForScheduleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSecretForScheduleRequestBody.class),
            f -> f.withMarshaller(DeleteSecretForScheduleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStage =
        genFordeleteSecretStage();

    private static HttpRequestDef<DeleteSecretStageRequest, DeleteSecretStageResponse> genFordeleteSecretStage() {
        // basic
        HttpRequestDef.Builder<DeleteSecretStageRequest, DeleteSecretStageResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecretStageRequest.class, DeleteSecretStageResponse.class)
                .withName("DeleteSecretStage")
                .withUri("/v1/{project_id}/secrets/{secret_name}/stages/{stage_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretStageRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<String>withRequestField("stage_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretStageRequest::getStageName, (req, v) -> {
                req.setStageName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretTagRequest, DeleteSecretTagResponse> deleteSecretTag =
        genFordeleteSecretTag();

    private static HttpRequestDef<DeleteSecretTagRequest, DeleteSecretTagResponse> genFordeleteSecretTag() {
        // basic
        HttpRequestDef.Builder<DeleteSecretTagRequest, DeleteSecretTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecretTagRequest.class, DeleteSecretTagResponse.class)
                .withName("DeleteSecretTag")
                .withUri("/v1/{project_id}/csms/{secret_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretTagRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> listProjectSecretsTags =
        genForlistProjectSecretsTags();

    private static HttpRequestDef<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> genForlistProjectSecretsTags() {
        // basic
        HttpRequestDef.Builder<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectSecretsTagsRequest.class, ListProjectSecretsTagsResponse.class)
            .withName("ListProjectSecretsTags")
            .withUri("/v1/{project_id}/csms/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> listResourceInstances =
        genForlistResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForlistResourceInstances() {
        // basic
        HttpRequestDef.Builder<ListResourceInstancesRequest, ListResourceInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListResourceInstancesRequest.class, ListResourceInstancesResponse.class)
            .withName("ListResourceInstances")
            .withUri("/v1/{project_id}/csms/{resource_instances}/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_instances",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceInstances, (req, v) -> {
                req.setResourceInstances(v);
            }));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretStageRequest, ListSecretStageResponse> listSecretStage =
        genForlistSecretStage();

    private static HttpRequestDef<ListSecretStageRequest, ListSecretStageResponse> genForlistSecretStage() {
        // basic
        HttpRequestDef.Builder<ListSecretStageRequest, ListSecretStageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretStageRequest.class, ListSecretStageResponse.class)
                .withName("ListSecretStage")
                .withUri("/v1/{project_id}/secrets/{secret_name}/stages/{stage_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretStageRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<String>withRequestField("stage_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretStageRequest::getStageName, (req, v) -> {
                req.setStageName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretTagsRequest, ListSecretTagsResponse> listSecretTags =
        genForlistSecretTags();

    private static HttpRequestDef<ListSecretTagsRequest, ListSecretTagsResponse> genForlistSecretTags() {
        // basic
        HttpRequestDef.Builder<ListSecretTagsRequest, ListSecretTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretTagsRequest.class, ListSecretTagsResponse.class)
                .withName("ListSecretTags")
                .withUri("/v1/{project_id}/csms/{secret_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretTagsRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersions =
        genForlistSecretVersions();

    private static HttpRequestDef<ListSecretVersionsRequest, ListSecretVersionsResponse> genForlistSecretVersions() {
        // basic
        HttpRequestDef.Builder<ListSecretVersionsRequest, ListSecretVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretVersionsRequest.class, ListSecretVersionsResponse.class)
                .withName("ListSecretVersions")
                .withUri("/v1/{project_id}/secrets/{secret_name}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretVersionsRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretsRequest, ListSecretsResponse> listSecrets = genForlistSecrets();

    private static HttpRequestDef<ListSecretsRequest, ListSecretsResponse> genForlistSecrets() {
        // basic
        HttpRequestDef.Builder<ListSecretsRequest, ListSecretsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretsRequest.class, ListSecretsResponse.class)
                .withName("ListSecrets")
                .withUri("/v1/{project_id}/secrets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreSecretRequest, RestoreSecretResponse> restoreSecret =
        genForrestoreSecret();

    private static HttpRequestDef<RestoreSecretRequest, RestoreSecretResponse> genForrestoreSecret() {
        // basic
        HttpRequestDef.Builder<RestoreSecretRequest, RestoreSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreSecretRequest.class, RestoreSecretResponse.class)
                .withName("RestoreSecret")
                .withUri("/v1/{project_id}/secrets/{secret_name}/scheduled-deleted-tasks/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreSecretRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretRequest, ShowSecretResponse> showSecret = genForshowSecret();

    private static HttpRequestDef<ShowSecretRequest, ShowSecretResponse> genForshowSecret() {
        // basic
        HttpRequestDef.Builder<ShowSecretRequest, ShowSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecretRequest.class, ShowSecretResponse.class)
                .withName("ShowSecret")
                .withUri("/v1/{project_id}/secrets/{secret_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersion =
        genForshowSecretVersion();

    private static HttpRequestDef<ShowSecretVersionRequest, ShowSecretVersionResponse> genForshowSecretVersion() {
        // basic
        HttpRequestDef.Builder<ShowSecretVersionRequest, ShowSecretVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecretVersionRequest.class, ShowSecretVersionResponse.class)
                .withName("ShowSecretVersion")
                .withUri("/v1/{project_id}/secrets/{secret_name}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretVersionRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> updateSecret = genForupdateSecret();

    private static HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> genForupdateSecret() {
        // basic
        HttpRequestDef.Builder<UpdateSecretRequest, UpdateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecretRequest.class, UpdateSecretResponse.class)
                .withName("UpdateSecret")
                .withUri("/v1/{project_id}/secrets/{secret_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<UpdateSecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecretRequestBody.class),
            f -> f.withMarshaller(UpdateSecretRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStage =
        genForupdateSecretStage();

    private static HttpRequestDef<UpdateSecretStageRequest, UpdateSecretStageResponse> genForupdateSecretStage() {
        // basic
        HttpRequestDef.Builder<UpdateSecretStageRequest, UpdateSecretStageResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecretStageRequest.class, UpdateSecretStageResponse.class)
                .withName("UpdateSecretStage")
                .withUri("/v1/{project_id}/secrets/{secret_name}/stages/{stage_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretStageRequest::getSecretName, (req, v) -> {
                req.setSecretName(v);
            }));
        builder.<String>withRequestField("stage_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretStageRequest::getStageName, (req, v) -> {
                req.setStageName(v);
            }));
        builder.<UpdateSecretStageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecretStageRequestBody.class),
            f -> f.withMarshaller(UpdateSecretStageRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

package com.huaweicloud.sdk.csms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsRequestBody;
import com.huaweicloud.sdk.csms.v1.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.BatchImportSecretsRequest;
import com.huaweicloud.sdk.csms.v1.model.BatchImportSecretsResponse;
import com.huaweicloud.sdk.csms.v1.model.ChangeUsersPassword;
import com.huaweicloud.sdk.csms.v1.model.CreateAgencyRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateAgencyRequestBody;
import com.huaweicloud.sdk.csms.v1.model.CreateAgencyResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateGrantsRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateGrantsResponse;
import com.huaweicloud.sdk.csms.v1.model.CreatePasswordRequestBody;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventRequestBody;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretRequestBody;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagRequestBody;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretTagResponse;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionRequestBody;
import com.huaweicloud.sdk.csms.v1.model.CreateSecretVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteGrantRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteGrantResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleRequestBody;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretForScheduleResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretTagRequest;
import com.huaweicloud.sdk.csms.v1.model.DeleteSecretTagResponse;
import com.huaweicloud.sdk.csms.v1.model.DownloadSecretBlobRequest;
import com.huaweicloud.sdk.csms.v1.model.DownloadSecretBlobResponse;
import com.huaweicloud.sdk.csms.v1.model.GenerateRandomPasswordRequest;
import com.huaweicloud.sdk.csms.v1.model.GenerateRandomPasswordResponse;
import com.huaweicloud.sdk.csms.v1.model.GrantSecretReqBody;
import com.huaweicloud.sdk.csms.v1.model.ImportSecretsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListGrantsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListGrantsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListNotificationRecordsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListNotificationRecordsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListProjectSecretsTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListProjectSecretsTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesRequest;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesRequestBody;
import com.huaweicloud.sdk.csms.v1.model.ListResourceInstancesResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretEventsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretEventsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTagsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTagsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTaskRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretTaskResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretVersionsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretVersionsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListSecretsRequest;
import com.huaweicloud.sdk.csms.v1.model.ListSecretsResponse;
import com.huaweicloud.sdk.csms.v1.model.ListUsersRequest;
import com.huaweicloud.sdk.csms.v1.model.ListUsersResponse;
import com.huaweicloud.sdk.csms.v1.model.RestoreSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.RestoreSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.RotateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.RotateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowAgencyRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowAgencyResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretFunctionTemplatesRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretFunctionTemplatesResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowSecretVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.ShowUserDetailRequest;
import com.huaweicloud.sdk.csms.v1.model.ShowUserDetailResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateGrantRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateGrantResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventRequestBody;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretEventResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretRequestBody;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageRequestBody;
import com.huaweicloud.sdk.csms.v1.model.UpdateSecretStageResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateUserPasswordRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateUserPasswordResponse;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionRequest;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionRequestBody;
import com.huaweicloud.sdk.csms.v1.model.UpdateVersionResponse;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobRequest;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobRequestBody;
import com.huaweicloud.sdk.csms.v1.model.UploadSecretBlobResponse;

@SuppressWarnings("unchecked")
public class CsmsMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTags =
        genForBatchCreateOrDeleteTags();

    private static HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> genForBatchCreateOrDeleteTags() {
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
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getSecretId,
                BatchCreateOrDeleteTagsRequest::setSecretId));
        builder.<BatchCreateOrDeleteTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateOrDeleteTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getBody, BatchCreateOrDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchImportSecretsRequest, BatchImportSecretsResponse> batchImportSecrets =
        genForBatchImportSecrets();

    private static HttpRequestDef<BatchImportSecretsRequest, BatchImportSecretsResponse> genForBatchImportSecrets() {
        // basic
        HttpRequestDef.Builder<BatchImportSecretsRequest, BatchImportSecretsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchImportSecretsRequest.class, BatchImportSecretsResponse.class)
                .withName("BatchImportSecrets")
                .withUri("/v1/{project_id}/secrets/batch-import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImportSecretsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportSecretsRequest.class),
            f -> f.withMarshaller(BatchImportSecretsRequest::getBody, BatchImportSecretsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> createAgency = genForCreateAgency();

    private static HttpRequestDef<CreateAgencyRequest, CreateAgencyResponse> genForCreateAgency() {
        // basic
        HttpRequestDef.Builder<CreateAgencyRequest, CreateAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyRequest.class, CreateAgencyResponse.class)
                .withName("CreateAgency")
                .withUri("/v1/csms/agencies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateAgencyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAgencyRequestBody.class),
            f -> f.withMarshaller(CreateAgencyRequest::getBody, CreateAgencyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGrantsRequest, CreateGrantsResponse> createGrants = genForCreateGrants();

    private static HttpRequestDef<CreateGrantsRequest, CreateGrantsResponse> genForCreateGrants() {
        // basic
        HttpRequestDef.Builder<CreateGrantsRequest, CreateGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGrantsRequest.class, CreateGrantsResponse.class)
                .withName("CreateGrants")
                .withUri("/v1/{project_id}/csms/grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GrantSecretReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantSecretReqBody.class),
            f -> f.withMarshaller(CreateGrantsRequest::getBody, CreateGrantsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretRequest, CreateSecretResponse> createSecret = genForCreateSecret();

    private static HttpRequestDef<CreateSecretRequest, CreateSecretResponse> genForCreateSecret() {
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
            f -> f.withMarshaller(CreateSecretRequest::getBody, CreateSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretEventRequest, CreateSecretEventResponse> createSecretEvent =
        genForCreateSecretEvent();

    private static HttpRequestDef<CreateSecretEventRequest, CreateSecretEventResponse> genForCreateSecretEvent() {
        // basic
        HttpRequestDef.Builder<CreateSecretEventRequest, CreateSecretEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretEventRequest.class, CreateSecretEventResponse.class)
                .withName("CreateSecretEvent")
                .withUri("/v1/{project_id}/csms/events")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateSecretEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecretEventRequestBody.class),
            f -> f.withMarshaller(CreateSecretEventRequest::getBody, CreateSecretEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretTagRequest, CreateSecretTagResponse> createSecretTag =
        genForCreateSecretTag();

    private static HttpRequestDef<CreateSecretTagRequest, CreateSecretTagResponse> genForCreateSecretTag() {
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
            f -> f.withMarshaller(CreateSecretTagRequest::getSecretId, CreateSecretTagRequest::setSecretId));
        builder.<CreateSecretTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecretTagRequestBody.class),
            f -> f.withMarshaller(CreateSecretTagRequest::getBody, CreateSecretTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersion =
        genForCreateSecretVersion();

    private static HttpRequestDef<CreateSecretVersionRequest, CreateSecretVersionResponse> genForCreateSecretVersion() {
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
            f -> f.withMarshaller(CreateSecretVersionRequest::getSecretName,
                CreateSecretVersionRequest::setSecretName));
        builder.<CreateSecretVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSecretVersionRequestBody.class),
            f -> f.withMarshaller(CreateSecretVersionRequest::getBody, CreateSecretVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGrantRequest, DeleteGrantResponse> deleteGrant = genForDeleteGrant();

    private static HttpRequestDef<DeleteGrantRequest, DeleteGrantResponse> genForDeleteGrant() {
        // basic
        HttpRequestDef.Builder<DeleteGrantRequest, DeleteGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGrantRequest.class, DeleteGrantResponse.class)
                .withName("DeleteGrant")
                .withUri("/v1/{project_id}/csms/grants")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("grantee_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGrantRequest::getGranteeUser, DeleteGrantRequest::setGranteeUser));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGrantRequest::getResourceId, DeleteGrantRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> deleteSecret = genForDeleteSecret();

    private static HttpRequestDef<DeleteSecretRequest, DeleteSecretResponse> genForDeleteSecret() {
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
            f -> f.withMarshaller(DeleteSecretRequest::getSecretName, DeleteSecretRequest::setSecretName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretEventRequest, DeleteSecretEventResponse> deleteSecretEvent =
        genForDeleteSecretEvent();

    private static HttpRequestDef<DeleteSecretEventRequest, DeleteSecretEventResponse> genForDeleteSecretEvent() {
        // basic
        HttpRequestDef.Builder<DeleteSecretEventRequest, DeleteSecretEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSecretEventRequest.class, DeleteSecretEventResponse.class)
                .withName("DeleteSecretEvent")
                .withUri("/v1/{project_id}/csms/events/{event_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretEventRequest::getEventName, DeleteSecretEventRequest::setEventName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> deleteSecretForSchedule =
        genForDeleteSecretForSchedule();

    private static HttpRequestDef<DeleteSecretForScheduleRequest, DeleteSecretForScheduleResponse> genForDeleteSecretForSchedule() {
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
            f -> f.withMarshaller(DeleteSecretForScheduleRequest::getSecretName,
                DeleteSecretForScheduleRequest::setSecretName));
        builder.<DeleteSecretForScheduleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSecretForScheduleRequestBody.class),
            f -> f.withMarshaller(DeleteSecretForScheduleRequest::getBody, DeleteSecretForScheduleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretStageRequest, DeleteSecretStageResponse> deleteSecretStage =
        genForDeleteSecretStage();

    private static HttpRequestDef<DeleteSecretStageRequest, DeleteSecretStageResponse> genForDeleteSecretStage() {
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
            f -> f.withMarshaller(DeleteSecretStageRequest::getSecretName, DeleteSecretStageRequest::setSecretName));
        builder.<String>withRequestField("stage_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretStageRequest::getStageName, DeleteSecretStageRequest::setStageName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSecretTagRequest, DeleteSecretTagResponse> deleteSecretTag =
        genForDeleteSecretTag();

    private static HttpRequestDef<DeleteSecretTagRequest, DeleteSecretTagResponse> genForDeleteSecretTag() {
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
            f -> f.withMarshaller(DeleteSecretTagRequest::getSecretId, DeleteSecretTagRequest::setSecretId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretTagRequest::getKey, DeleteSecretTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadSecretBlobRequest, DownloadSecretBlobResponse> downloadSecretBlob =
        genForDownloadSecretBlob();

    private static HttpRequestDef<DownloadSecretBlobRequest, DownloadSecretBlobResponse> genForDownloadSecretBlob() {
        // basic
        HttpRequestDef.Builder<DownloadSecretBlobRequest, DownloadSecretBlobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadSecretBlobRequest.class, DownloadSecretBlobResponse.class)
                .withName("DownloadSecretBlob")
                .withUri("/v1/{project_id}/secrets/{secret_name}/backup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadSecretBlobRequest::getSecretName, DownloadSecretBlobRequest::setSecretName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateRandomPasswordRequest, GenerateRandomPasswordResponse> generateRandomPassword =
        genForGenerateRandomPassword();

    private static HttpRequestDef<GenerateRandomPasswordRequest, GenerateRandomPasswordResponse> genForGenerateRandomPassword() {
        // basic
        HttpRequestDef.Builder<GenerateRandomPasswordRequest, GenerateRandomPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, GenerateRandomPasswordRequest.class, GenerateRandomPasswordResponse.class)
            .withName("GenerateRandomPassword")
            .withUri("/v1/{project_id}/csms/generate-password")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreatePasswordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePasswordRequestBody.class),
            f -> f.withMarshaller(GenerateRandomPasswordRequest::getBody, GenerateRandomPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGrantsRequest, ListGrantsResponse> listGrants = genForListGrants();

    private static HttpRequestDef<ListGrantsRequest, ListGrantsResponse> genForListGrants() {
        // basic
        HttpRequestDef.Builder<ListGrantsRequest, ListGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGrantsRequest.class, ListGrantsResponse.class)
                .withName("ListGrants")
                .withUri("/v1/{project_id}/csms/grants")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGrantsRequest::getResourceId, ListGrantsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotificationRecordsRequest, ListNotificationRecordsResponse> listNotificationRecords =
        genForListNotificationRecords();

    private static HttpRequestDef<ListNotificationRecordsRequest, ListNotificationRecordsResponse> genForListNotificationRecords() {
        // basic
        HttpRequestDef.Builder<ListNotificationRecordsRequest, ListNotificationRecordsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNotificationRecordsRequest.class, ListNotificationRecordsResponse.class)
            .withName("ListNotificationRecords")
            .withUri("/v1/{project_id}/csms/notification-records")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> listProjectSecretsTags =
        genForListProjectSecretsTags();

    private static HttpRequestDef<ListProjectSecretsTagsRequest, ListProjectSecretsTagsResponse> genForListProjectSecretsTags() {
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
        genForListResourceInstances();

    private static HttpRequestDef<ListResourceInstancesRequest, ListResourceInstancesResponse> genForListResourceInstances() {
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
            f -> f.withMarshaller(ListResourceInstancesRequest::getResourceInstances,
                ListResourceInstancesRequest::setResourceInstances));
        builder.<ListResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListResourceInstancesRequest::getBody, ListResourceInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretEventsRequest, ListSecretEventsResponse> listSecretEvents =
        genForListSecretEvents();

    private static HttpRequestDef<ListSecretEventsRequest, ListSecretEventsResponse> genForListSecretEvents() {
        // basic
        HttpRequestDef.Builder<ListSecretEventsRequest, ListSecretEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretEventsRequest.class, ListSecretEventsResponse.class)
                .withName("ListSecretEvents")
                .withUri("/v1/{project_id}/csms/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretEventsRequest::getLimit, ListSecretEventsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretEventsRequest::getMarker, ListSecretEventsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretTagsRequest, ListSecretTagsResponse> listSecretTags =
        genForListSecretTags();

    private static HttpRequestDef<ListSecretTagsRequest, ListSecretTagsResponse> genForListSecretTags() {
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
            f -> f.withMarshaller(ListSecretTagsRequest::getSecretId, ListSecretTagsRequest::setSecretId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretTaskRequest, ListSecretTaskResponse> listSecretTask =
        genForListSecretTask();

    private static HttpRequestDef<ListSecretTaskRequest, ListSecretTaskResponse> genForListSecretTask() {
        // basic
        HttpRequestDef.Builder<ListSecretTaskRequest, ListSecretTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretTaskRequest.class, ListSecretTaskResponse.class)
                .withName("ListSecretTask")
                .withUri("/v1/{project_id}/csms/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretTaskRequest::getSecretName, ListSecretTaskRequest::setSecretName));
        builder.<ListSecretTaskRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSecretTaskRequest.StatusEnum.class),
            f -> f.withMarshaller(ListSecretTaskRequest::getStatus, ListSecretTaskRequest::setStatus));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretTaskRequest::getTaskId, ListSecretTaskRequest::setTaskId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecretTaskRequest::getLimit, ListSecretTaskRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretTaskRequest::getMarker, ListSecretTaskRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersions =
        genForListSecretVersions();

    private static HttpRequestDef<ListSecretVersionsRequest, ListSecretVersionsResponse> genForListSecretVersions() {
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
            f -> f.withMarshaller(ListSecretVersionsRequest::getSecretName, ListSecretVersionsRequest::setSecretName));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretVersionsRequest::getMarker, ListSecretVersionsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSecretVersionsRequest::getLimit, ListSecretVersionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSecretsRequest, ListSecretsResponse> listSecrets = genForListSecrets();

    private static HttpRequestDef<ListSecretsRequest, ListSecretsResponse> genForListSecrets() {
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
            f -> f.withMarshaller(ListSecretsRequest::getLimit, ListSecretsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getMarker, ListSecretsRequest::setMarker));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretsRequest::getEventName, ListSecretsRequest::setEventName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersRequest, ListUsersResponse> listUsers = genForListUsers();

    private static HttpRequestDef<ListUsersRequest, ListUsersResponse> genForListUsers() {
        // basic
        HttpRequestDef.Builder<ListUsersRequest, ListUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersRequest.class, ListUsersResponse.class)
                .withName("ListUsers")
                .withUri("/v1/csms/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("org_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getOrgId, ListUsersRequest::setOrgId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getOffset, ListUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersRequest::getLimit, ListUsersRequest::setLimit));
        builder.<String>withRequestField("user_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersRequest::getUserInfo, ListUsersRequest::setUserInfo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreSecretRequest, RestoreSecretResponse> restoreSecret =
        genForRestoreSecret();

    private static HttpRequestDef<RestoreSecretRequest, RestoreSecretResponse> genForRestoreSecret() {
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
            f -> f.withMarshaller(RestoreSecretRequest::getSecretName, RestoreSecretRequest::setSecretName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RotateSecretRequest, RotateSecretResponse> rotateSecret = genForRotateSecret();

    private static HttpRequestDef<RotateSecretRequest, RotateSecretResponse> genForRotateSecret() {
        // basic
        HttpRequestDef.Builder<RotateSecretRequest, RotateSecretResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RotateSecretRequest.class, RotateSecretResponse.class)
                .withName("RotateSecret")
                .withUri("/v1/{project_id}/secrets/{secret_name}/rotate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RotateSecretRequest::getSecretName, RotateSecretRequest::setSecretName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> showAgency = genForShowAgency();

    private static HttpRequestDef<ShowAgencyRequest, ShowAgencyResponse> genForShowAgency() {
        // basic
        HttpRequestDef.Builder<ShowAgencyRequest, ShowAgencyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAgencyRequest.class, ShowAgencyResponse.class)
                .withName("ShowAgency")
                .withUri("/v1/csms/agencies")
                .withContentType("application/json");

        // requests
        builder.<ShowAgencyRequest.SecretTypeEnum>withRequestField("secret_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowAgencyRequest.SecretTypeEnum.class),
            f -> f.withMarshaller(ShowAgencyRequest::getSecretType, ShowAgencyRequest::setSecretType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretRequest, ShowSecretResponse> showSecret = genForShowSecret();

    private static HttpRequestDef<ShowSecretRequest, ShowSecretResponse> genForShowSecret() {
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
            f -> f.withMarshaller(ShowSecretRequest::getSecretName, ShowSecretRequest::setSecretName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretEventRequest, ShowSecretEventResponse> showSecretEvent =
        genForShowSecretEvent();

    private static HttpRequestDef<ShowSecretEventRequest, ShowSecretEventResponse> genForShowSecretEvent() {
        // basic
        HttpRequestDef.Builder<ShowSecretEventRequest, ShowSecretEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecretEventRequest.class, ShowSecretEventResponse.class)
                .withName("ShowSecretEvent")
                .withUri("/v1/{project_id}/csms/events/{event_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretEventRequest::getEventName, ShowSecretEventRequest::setEventName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretFunctionTemplatesRequest, ShowSecretFunctionTemplatesResponse> showSecretFunctionTemplates =
        genForShowSecretFunctionTemplates();

    private static HttpRequestDef<ShowSecretFunctionTemplatesRequest, ShowSecretFunctionTemplatesResponse> genForShowSecretFunctionTemplates() {
        // basic
        HttpRequestDef.Builder<ShowSecretFunctionTemplatesRequest, ShowSecretFunctionTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecretFunctionTemplatesRequest.class,
                    ShowSecretFunctionTemplatesResponse.class)
                .withName("ShowSecretFunctionTemplates")
                .withUri("/v1/csms/function-templates")
                .withContentType("application/json");

        // requests
        builder.<ShowSecretFunctionTemplatesRequest.SecretTypeEnum>withRequestField("secret_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSecretFunctionTemplatesRequest.SecretTypeEnum.class),
            f -> f.withMarshaller(ShowSecretFunctionTemplatesRequest::getSecretType,
                ShowSecretFunctionTemplatesRequest::setSecretType));
        builder.<ShowSecretFunctionTemplatesRequest.SecretSubTypeEnum>withRequestField("secret_sub_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSecretFunctionTemplatesRequest.SecretSubTypeEnum.class),
            f -> f.withMarshaller(ShowSecretFunctionTemplatesRequest::getSecretSubType,
                ShowSecretFunctionTemplatesRequest::setSecretSubType));
        builder.<ShowSecretFunctionTemplatesRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSecretFunctionTemplatesRequest.EngineEnum.class),
            f -> f.withMarshaller(ShowSecretFunctionTemplatesRequest::getEngine,
                ShowSecretFunctionTemplatesRequest::setEngine));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretStageRequest, ShowSecretStageResponse> showSecretStage =
        genForShowSecretStage();

    private static HttpRequestDef<ShowSecretStageRequest, ShowSecretStageResponse> genForShowSecretStage() {
        // basic
        HttpRequestDef.Builder<ShowSecretStageRequest, ShowSecretStageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSecretStageRequest.class, ShowSecretStageResponse.class)
                .withName("ShowSecretStage")
                .withUri("/v1/{project_id}/secrets/{secret_name}/stages/{stage_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretStageRequest::getSecretName, ShowSecretStageRequest::setSecretName));
        builder.<String>withRequestField("stage_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretStageRequest::getStageName, ShowSecretStageRequest::setStageName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecretVersionRequest, ShowSecretVersionResponse> showSecretVersion =
        genForShowSecretVersion();

    private static HttpRequestDef<ShowSecretVersionRequest, ShowSecretVersionResponse> genForShowSecretVersion() {
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
            f -> f.withMarshaller(ShowSecretVersionRequest::getSecretName, ShowSecretVersionRequest::setSecretName));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretVersionRequest::getVersionId, ShowSecretVersionRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> showUserDetail =
        genForShowUserDetail();

    private static HttpRequestDef<ShowUserDetailRequest, ShowUserDetailResponse> genForShowUserDetail() {
        // basic
        HttpRequestDef.Builder<ShowUserDetailRequest, ShowUserDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserDetailRequest.class, ShowUserDetailResponse.class)
                .withName("ShowUserDetail")
                .withUri("/v1/csms/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserDetailRequest::getUserId, ShowUserDetailRequest::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGrantRequest, UpdateGrantResponse> updateGrant = genForUpdateGrant();

    private static HttpRequestDef<UpdateGrantRequest, UpdateGrantResponse> genForUpdateGrant() {
        // basic
        HttpRequestDef.Builder<UpdateGrantRequest, UpdateGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGrantRequest.class, UpdateGrantResponse.class)
                .withName("UpdateGrant")
                .withUri("/v1/{project_id}/csms/grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGrantRequest::getResourceId, UpdateGrantRequest::setResourceId));
        builder.<GrantSecretReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantSecretReqBody.class),
            f -> f.withMarshaller(UpdateGrantRequest::getBody, UpdateGrantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> updateSecret = genForUpdateSecret();

    private static HttpRequestDef<UpdateSecretRequest, UpdateSecretResponse> genForUpdateSecret() {
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
            f -> f.withMarshaller(UpdateSecretRequest::getSecretName, UpdateSecretRequest::setSecretName));
        builder.<UpdateSecretRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecretRequestBody.class),
            f -> f.withMarshaller(UpdateSecretRequest::getBody, UpdateSecretRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretEventRequest, UpdateSecretEventResponse> updateSecretEvent =
        genForUpdateSecretEvent();

    private static HttpRequestDef<UpdateSecretEventRequest, UpdateSecretEventResponse> genForUpdateSecretEvent() {
        // basic
        HttpRequestDef.Builder<UpdateSecretEventRequest, UpdateSecretEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSecretEventRequest.class, UpdateSecretEventResponse.class)
                .withName("UpdateSecretEvent")
                .withUri("/v1/{project_id}/csms/events/{event_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("event_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretEventRequest::getEventName, UpdateSecretEventRequest::setEventName));
        builder.<UpdateSecretEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecretEventRequestBody.class),
            f -> f.withMarshaller(UpdateSecretEventRequest::getBody, UpdateSecretEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSecretStageRequest, UpdateSecretStageResponse> updateSecretStage =
        genForUpdateSecretStage();

    private static HttpRequestDef<UpdateSecretStageRequest, UpdateSecretStageResponse> genForUpdateSecretStage() {
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
            f -> f.withMarshaller(UpdateSecretStageRequest::getSecretName, UpdateSecretStageRequest::setSecretName));
        builder.<String>withRequestField("stage_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretStageRequest::getStageName, UpdateSecretStageRequest::setStageName));
        builder.<UpdateSecretStageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSecretStageRequestBody.class),
            f -> f.withMarshaller(UpdateSecretStageRequest::getBody, UpdateSecretStageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserPasswordRequest, UpdateUserPasswordResponse> updateUserPassword =
        genForUpdateUserPassword();

    private static HttpRequestDef<UpdateUserPasswordRequest, UpdateUserPasswordResponse> genForUpdateUserPassword() {
        // basic
        HttpRequestDef.Builder<UpdateUserPasswordRequest, UpdateUserPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateUserPasswordRequest.class, UpdateUserPasswordResponse.class)
                .withName("UpdateUserPassword")
                .withUri("/v1/csms/users/change-password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeUsersPassword>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeUsersPassword.class),
            f -> f.withMarshaller(UpdateUserPasswordRequest::getBody, UpdateUserPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVersionRequest, UpdateVersionResponse> updateVersion =
        genForUpdateVersion();

    private static HttpRequestDef<UpdateVersionRequest, UpdateVersionResponse> genForUpdateVersion() {
        // basic
        HttpRequestDef.Builder<UpdateVersionRequest, UpdateVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVersionRequest.class, UpdateVersionResponse.class)
                .withName("UpdateVersion")
                .withUri("/v1/{project_id}/secrets/{secret_name}/versions/{version_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVersionRequest::getSecretName, UpdateVersionRequest::setSecretName));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVersionRequest::getVersionId, UpdateVersionRequest::setVersionId));
        builder.<UpdateVersionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateVersionRequestBody.class),
            f -> f.withMarshaller(UpdateVersionRequest::getBody, UpdateVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadSecretBlobRequest, UploadSecretBlobResponse> uploadSecretBlob =
        genForUploadSecretBlob();

    private static HttpRequestDef<UploadSecretBlobRequest, UploadSecretBlobResponse> genForUploadSecretBlob() {
        // basic
        HttpRequestDef.Builder<UploadSecretBlobRequest, UploadSecretBlobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadSecretBlobRequest.class, UploadSecretBlobResponse.class)
                .withName("UploadSecretBlob")
                .withUri("/v1/{project_id}/secrets/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UploadSecretBlobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadSecretBlobRequestBody.class),
            f -> f.withMarshaller(UploadSecretBlobRequest::getBody, UploadSecretBlobRequest::setBody));

        // response

        return builder.build();
    }

}

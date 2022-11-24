package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kms.v1.model.*;

@SuppressWarnings("unchecked")
public class KmsMeta {

    public static final HttpRequestDef<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTags =
        genForbatchCreateKmsTags();

    private static HttpRequestDef<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> genForbatchCreateKmsTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateKmsTagsRequest.class, BatchCreateKmsTagsResponse.class)
                .withName("BatchCreateKmsTags")
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<BatchCreateKmsTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateKmsTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelGrantRequest, CancelGrantResponse> cancelGrant = genForcancelGrant();

    private static HttpRequestDef<CancelGrantRequest, CancelGrantResponse> genForcancelGrant() {
        // basic
        HttpRequestDef.Builder<CancelGrantRequest, CancelGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelGrantRequest.class, CancelGrantResponse.class)
                .withName("CancelGrant")
                .withUri("/{version_id}/{project_id}/kms/revoke-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGrantRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<RevokeGrantRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeGrantRequestBody.class),
            f -> f.withMarshaller(CancelGrantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletion =
        genForcancelKeyDeletion();

    private static HttpRequestDef<CancelKeyDeletionRequest, CancelKeyDeletionResponse> genForcancelKeyDeletion() {
        // basic
        HttpRequestDef.Builder<CancelKeyDeletionRequest, CancelKeyDeletionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelKeyDeletionRequest.class, CancelKeyDeletionResponse.class)
                .withName("CancelKeyDeletion")
                .withUri("/{version_id}/{project_id}/kms/cancel-key-deletion")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelKeyDeletionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(CancelKeyDeletionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrant =
        genForcancelSelfGrant();

    private static HttpRequestDef<CancelSelfGrantRequest, CancelSelfGrantResponse> genForcancelSelfGrant() {
        // basic
        HttpRequestDef.Builder<CancelSelfGrantRequest, CancelSelfGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSelfGrantRequest.class, CancelSelfGrantResponse.class)
                .withName("CancelSelfGrant")
                .withUri("/{version_id}/{project_id}/kms/retire-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSelfGrantRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<RevokeGrantRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeGrantRequestBody.class),
            f -> f.withMarshaller(CancelSelfGrantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatakeyRequest, CreateDatakeyResponse> createDatakey =
        genForcreateDatakey();

    private static HttpRequestDef<CreateDatakeyRequest, CreateDatakeyResponse> genForcreateDatakey() {
        // basic
        HttpRequestDef.Builder<CreateDatakeyRequest, CreateDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatakeyRequest.class, CreateDatakeyResponse.class)
                .withName("CreateDatakey")
                .withUri("/{version_id}/{project_id}/kms/create-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatakeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<CreateDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatakeyRequestBody.class),
            f -> f.withMarshaller(CreateDatakeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintext =
        genForcreateDatakeyWithoutPlaintext();

    private static HttpRequestDef<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> genForcreateDatakeyWithoutPlaintext() {
        // basic
        HttpRequestDef.Builder<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDatakeyWithoutPlaintextRequest.class,
                    CreateDatakeyWithoutPlaintextResponse.class)
                .withName("CreateDatakeyWithoutPlaintext")
                .withUri("/{version_id}/{project_id}/kms/create-datakey-without-plaintext")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatakeyWithoutPlaintextRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<CreateDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatakeyRequestBody.class),
            f -> f.withMarshaller(CreateDatakeyWithoutPlaintextRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGrantRequest, CreateGrantResponse> createGrant = genForcreateGrant();

    private static HttpRequestDef<CreateGrantRequest, CreateGrantResponse> genForcreateGrant() {
        // basic
        HttpRequestDef.Builder<CreateGrantRequest, CreateGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGrantRequest.class, CreateGrantResponse.class)
                .withName("CreateGrant")
                .withUri("/{version_id}/{project_id}/kms/create-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGrantRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<CreateGrantRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGrantRequestBody.class),
            f -> f.withMarshaller(CreateGrantRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeyRequest, CreateKeyResponse> createKey = genForcreateKey();

    private static HttpRequestDef<CreateKeyRequest, CreateKeyResponse> genForcreateKey() {
        // basic
        HttpRequestDef.Builder<CreateKeyRequest, CreateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeyRequest.class, CreateKeyResponse.class)
                .withName("CreateKey")
                .withUri("/{version_id}/{project_id}/kms/create-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<CreateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeyRequestBody.class),
            f -> f.withMarshaller(CreateKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTag = genForcreateKmsTag();

    private static HttpRequestDef<CreateKmsTagRequest, CreateKmsTagResponse> genForcreateKmsTag() {
        // basic
        HttpRequestDef.Builder<CreateKmsTagRequest, CreateKmsTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKmsTagRequest.class, CreateKmsTagResponse.class)
                .withName("CreateKmsTag")
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKmsTagRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKmsTagRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            }));
        builder.<CreateKmsTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKmsTagRequestBody.class),
            f -> f.withMarshaller(CreateKmsTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImport =
        genForcreateParametersForImport();

    private static HttpRequestDef<CreateParametersForImportRequest, CreateParametersForImportResponse> genForcreateParametersForImport() {
        // basic
        HttpRequestDef.Builder<CreateParametersForImportRequest, CreateParametersForImportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateParametersForImportRequest.class,
                    CreateParametersForImportResponse.class)
                .withName("CreateParametersForImport")
                .withUri("/{version_id}/{project_id}/kms/get-parameters-for-import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateParametersForImportRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<GetParametersForImportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetParametersForImportRequestBody.class),
            f -> f.withMarshaller(CreateParametersForImportRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRandomRequest, CreateRandomResponse> createRandom = genForcreateRandom();

    private static HttpRequestDef<CreateRandomRequest, CreateRandomResponse> genForcreateRandom() {
        // basic
        HttpRequestDef.Builder<CreateRandomRequest, CreateRandomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRandomRequest.class, CreateRandomResponse.class)
                .withName("CreateRandom")
                .withUri("/{version_id}/{project_id}/kms/gen-random")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRandomRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<GenRandomRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenRandomRequestBody.class),
            f -> f.withMarshaller(CreateRandomRequest::getBody, (req, v) -> {
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

    public static final HttpRequestDef<CreateSecretVersionRequest, CreateSecretVersionResponse> createSecretVersion =
        genForcreateSecretVersion();

    private static HttpRequestDef<CreateSecretVersionRequest, CreateSecretVersionResponse> genForcreateSecretVersion() {
        // basic
        HttpRequestDef.Builder<CreateSecretVersionRequest, CreateSecretVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSecretVersionRequest.class, CreateSecretVersionResponse.class)
                .withName("CreateSecretVersion")
                .withUri("/v1/{project_id}/secrets/{secret_id}/versions")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSecretVersionRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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

    public static final HttpRequestDef<DecryptDataRequest, DecryptDataResponse> decryptData = genFordecryptData();

    private static HttpRequestDef<DecryptDataRequest, DecryptDataResponse> genFordecryptData() {
        // basic
        HttpRequestDef.Builder<DecryptDataRequest, DecryptDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DecryptDataRequest.class, DecryptDataResponse.class)
                .withName("DecryptData")
                .withUri("/{version_id}/{project_id}/kms/decrypt-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DecryptDataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<DecryptDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DecryptDataRequestBody.class),
            f -> f.withMarshaller(DecryptDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakey =
        genFordecryptDatakey();

    private static HttpRequestDef<DecryptDatakeyRequest, DecryptDatakeyResponse> genFordecryptDatakey() {
        // basic
        HttpRequestDef.Builder<DecryptDatakeyRequest, DecryptDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DecryptDatakeyRequest.class, DecryptDatakeyResponse.class)
                .withName("DecryptDatakey")
                .withUri("/{version_id}/{project_id}/kms/decrypt-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DecryptDatakeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<DecryptDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DecryptDatakeyRequestBody.class),
            f -> f.withMarshaller(DecryptDatakeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterial =
        genFordeleteImportedKeyMaterial();

    private static HttpRequestDef<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> genFordeleteImportedKeyMaterial() {
        // basic
        HttpRequestDef.Builder<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteImportedKeyMaterialRequest.class,
                    DeleteImportedKeyMaterialResponse.class)
                .withName("DeleteImportedKeyMaterial")
                .withUri("/{version_id}/{project_id}/kms/delete-imported-key-material")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteImportedKeyMaterialRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(DeleteImportedKeyMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeyRequest, DeleteKeyResponse> deleteKey = genFordeleteKey();

    private static HttpRequestDef<DeleteKeyRequest, DeleteKeyResponse> genFordeleteKey() {
        // basic
        HttpRequestDef.Builder<DeleteKeyRequest, DeleteKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteKeyRequest.class, DeleteKeyResponse.class)
                .withName("DeleteKey")
                .withUri("/{version_id}/{project_id}/kms/schedule-key-deletion")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ScheduleKeyDeletionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScheduleKeyDeletionRequestBody.class),
            f -> f.withMarshaller(DeleteKeyRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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
            .withUri("/v1/{project_id}/secrets/{secret_id}/scheduled-deleted-tasks/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretForScheduleRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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
                .withUri("/v1/{project_id}/secrets/{secret_id}/stages/{stage_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSecretStageRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyRequest, DisableKeyResponse> disableKey = genFordisableKey();

    private static HttpRequestDef<DisableKeyRequest, DisableKeyResponse> genFordisableKey() {
        // basic
        HttpRequestDef.Builder<DisableKeyRequest, DisableKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyRequest.class, DisableKeyResponse.class)
                .withName("DisableKey")
                .withUri("/{version_id}/{project_id}/kms/disable-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(DisableKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotation =
        genFordisableKeyRotation();

    private static HttpRequestDef<DisableKeyRotationRequest, DisableKeyRotationResponse> genFordisableKeyRotation() {
        // basic
        HttpRequestDef.Builder<DisableKeyRotationRequest, DisableKeyRotationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyRotationRequest.class, DisableKeyRotationResponse.class)
                .withName("DisableKeyRotation")
                .withUri("/{version_id}/{project_id}/kms/disable-key-rotation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableKeyRotationRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(DisableKeyRotationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyRequest, EnableKeyResponse> enableKey = genForenableKey();

    private static HttpRequestDef<EnableKeyRequest, EnableKeyResponse> genForenableKey() {
        // basic
        HttpRequestDef.Builder<EnableKeyRequest, EnableKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyRequest.class, EnableKeyResponse.class)
                .withName("EnableKey")
                .withUri("/{version_id}/{project_id}/kms/enable-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(EnableKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotation =
        genForenableKeyRotation();

    private static HttpRequestDef<EnableKeyRotationRequest, EnableKeyRotationResponse> genForenableKeyRotation() {
        // basic
        HttpRequestDef.Builder<EnableKeyRotationRequest, EnableKeyRotationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyRotationRequest.class, EnableKeyRotationResponse.class)
                .withName("EnableKeyRotation")
                .withUri("/{version_id}/{project_id}/kms/enable-key-rotation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableKeyRotationRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(EnableKeyRotationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptDataRequest, EncryptDataResponse> encryptData = genForencryptData();

    private static HttpRequestDef<EncryptDataRequest, EncryptDataResponse> genForencryptData() {
        // basic
        HttpRequestDef.Builder<EncryptDataRequest, EncryptDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptDataRequest.class, EncryptDataResponse.class)
                .withName("EncryptData")
                .withUri("/{version_id}/{project_id}/kms/encrypt-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EncryptDataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<EncryptDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataRequestBody.class),
            f -> f.withMarshaller(EncryptDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakey =
        genForencryptDatakey();

    private static HttpRequestDef<EncryptDatakeyRequest, EncryptDatakeyResponse> genForencryptDatakey() {
        // basic
        HttpRequestDef.Builder<EncryptDatakeyRequest, EncryptDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptDatakeyRequest.class, EncryptDatakeyResponse.class)
                .withName("EncryptDatakey")
                .withUri("/{version_id}/{project_id}/kms/encrypt-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EncryptDatakeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<EncryptDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDatakeyRequestBody.class),
            f -> f.withMarshaller(EncryptDatakeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterial =
        genForimportKeyMaterial();

    private static HttpRequestDef<ImportKeyMaterialRequest, ImportKeyMaterialResponse> genForimportKeyMaterial() {
        // basic
        HttpRequestDef.Builder<ImportKeyMaterialRequest, ImportKeyMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportKeyMaterialRequest.class, ImportKeyMaterialResponse.class)
                .withName("ImportKeyMaterial")
                .withUri("/{version_id}/{project_id}/kms/import-key-material")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportKeyMaterialRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ImportKeyMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportKeyMaterialRequestBody.class),
            f -> f.withMarshaller(ImportKeyMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGrantsRequest, ListGrantsResponse> listGrants = genForlistGrants();

    private static HttpRequestDef<ListGrantsRequest, ListGrantsResponse> genForlistGrants() {
        // basic
        HttpRequestDef.Builder<ListGrantsRequest, ListGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListGrantsRequest.class, ListGrantsResponse.class)
                .withName("ListGrants")
                .withUri("/{version_id}/{project_id}/kms/list-grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGrantsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ListGrantsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListGrantsRequestBody.class),
            f -> f.withMarshaller(ListGrantsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetail =
        genForlistKeyDetail();

    private static HttpRequestDef<ListKeyDetailRequest, ListKeyDetailResponse> genForlistKeyDetail() {
        // basic
        HttpRequestDef.Builder<ListKeyDetailRequest, ListKeyDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKeyDetailRequest.class, ListKeyDetailResponse.class)
                .withName("ListKeyDetail")
                .withUri("/{version_id}/{project_id}/kms/describe-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeyDetailRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(ListKeyDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeysRequest, ListKeysResponse> listKeys = genForlistKeys();

    private static HttpRequestDef<ListKeysRequest, ListKeysResponse> genForlistKeys() {
        // basic
        HttpRequestDef.Builder<ListKeysRequest, ListKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKeysRequest.class, ListKeysResponse.class)
                .withName("ListKeys")
                .withUri("/{version_id}/{project_id}/kms/list-keys")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKeysRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ListKeysRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListKeysRequestBody.class),
            f -> f.withMarshaller(ListKeysRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTags =
        genForlistKmsByTags();

    private static HttpRequestDef<ListKmsByTagsRequest, ListKmsByTagsResponse> genForlistKmsByTags() {
        // basic
        HttpRequestDef.Builder<ListKmsByTagsRequest, ListKmsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKmsByTagsRequest.class, ListKmsByTagsResponse.class)
                .withName("ListKmsByTags")
                .withUri("/{version_id}/{project_id}/kms/{resource_instances}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_instances",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKmsByTagsRequest::getResourceInstances, (req, v) -> {
                req.setResourceInstances(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKmsByTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ListKmsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListKmsByTagsRequestBody.class),
            f -> f.withMarshaller(ListKmsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTags = genForlistKmsTags();

    private static HttpRequestDef<ListKmsTagsRequest, ListKmsTagsResponse> genForlistKmsTags() {
        // basic
        HttpRequestDef.Builder<ListKmsTagsRequest, ListKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKmsTagsRequest.class, ListKmsTagsResponse.class)
                .withName("ListKmsTags")
                .withUri("/{version_id}/{project_id}/kms/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKmsTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrants =
        genForlistRetirableGrants();

    private static HttpRequestDef<ListRetirableGrantsRequest, ListRetirableGrantsResponse> genForlistRetirableGrants() {
        // basic
        HttpRequestDef.Builder<ListRetirableGrantsRequest, ListRetirableGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRetirableGrantsRequest.class, ListRetirableGrantsResponse.class)
                .withName("ListRetirableGrants")
                .withUri("/{version_id}/{project_id}/kms/list-retirable-grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRetirableGrantsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ListRetirableGrantsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRetirableGrantsRequestBody.class),
            f -> f.withMarshaller(ListRetirableGrantsRequest::getBody, (req, v) -> {
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
                .withUri("/v1/{project_id}/secrets/{secret_id}/stages/{stage_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretStageRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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

    public static final HttpRequestDef<ListSecretVersionsRequest, ListSecretVersionsResponse> listSecretVersions =
        genForlistSecretVersions();

    private static HttpRequestDef<ListSecretVersionsRequest, ListSecretVersionsResponse> genForlistSecretVersions() {
        // basic
        HttpRequestDef.Builder<ListSecretVersionsRequest, ListSecretVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSecretVersionsRequest.class, ListSecretVersionsResponse.class)
                .withName("ListSecretVersions")
                .withUri("/v1/{project_id}/secrets/{secret_id}/versions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSecretVersionsRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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
                .withUri("/v1/{project_id}/secrets/{secret_id}/scheduled-deleted-tasks/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatus =
        genForshowKeyRotationStatus();

    private static HttpRequestDef<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> genForshowKeyRotationStatus() {
        // basic
        HttpRequestDef.Builder<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowKeyRotationStatusRequest.class, ShowKeyRotationStatusResponse.class)
            .withName("ShowKeyRotationStatus")
            .withUri("/{version_id}/{project_id}/kms/get-key-rotation-status")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeyRotationStatusRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(ShowKeyRotationStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTags = genForshowKmsTags();

    private static HttpRequestDef<ShowKmsTagsRequest, ShowKmsTagsResponse> genForshowKmsTags() {
        // basic
        HttpRequestDef.Builder<ShowKmsTagsRequest, ShowKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKmsTagsRequest.class, ShowKmsTagsResponse.class)
                .withName("ShowKmsTags")
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKmsTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKmsTagsRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKey =
        genForshowPublicKey();

    private static HttpRequestDef<ShowPublicKeyRequest, ShowPublicKeyResponse> genForshowPublicKey() {
        // basic
        HttpRequestDef.Builder<ShowPublicKeyRequest, ShowPublicKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPublicKeyRequest.class, ShowPublicKeyResponse.class)
                .withName("ShowPublicKey")
                .withUri("/{version_id}/{project_id}/kms/get-publickey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(ShowPublicKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/{project_id}/secrets/{secret_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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
                .withUri("/v1/{project_id}/secrets/{secret_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecretVersionRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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

    public static final HttpRequestDef<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstances =
        genForshowUserInstances();

    private static HttpRequestDef<ShowUserInstancesRequest, ShowUserInstancesResponse> genForshowUserInstances() {
        // basic
        HttpRequestDef.Builder<ShowUserInstancesRequest, ShowUserInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserInstancesRequest.class, ShowUserInstancesResponse.class)
                .withName("ShowUserInstances")
                .withUri("/{version_id}/{project_id}/kms/user-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserInstancesRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotas =
        genForshowUserQuotas();

    private static HttpRequestDef<ShowUserQuotasRequest, ShowUserQuotasResponse> genForshowUserQuotas() {
        // basic
        HttpRequestDef.Builder<ShowUserQuotasRequest, ShowUserQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserQuotasRequest.class, ShowUserQuotasResponse.class)
                .withName("ShowUserQuotas")
                .withUri("/{version_id}/{project_id}/kms/user-quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserQuotasRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SignRequest, SignResponse> sign = genForsign();

    private static HttpRequestDef<SignRequest, SignResponse> genForsign() {
        // basic
        HttpRequestDef.Builder<SignRequest, SignResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SignRequest.class, SignResponse.class)
                .withName("Sign")
                .withUri("/{version_id}/{project_id}/kms/sign")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SignRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<SignRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SignRequestBody.class),
            f -> f.withMarshaller(SignRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAlias =
        genForupdateKeyAlias();

    private static HttpRequestDef<UpdateKeyAliasRequest, UpdateKeyAliasResponse> genForupdateKeyAlias() {
        // basic
        HttpRequestDef.Builder<UpdateKeyAliasRequest, UpdateKeyAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKeyAliasRequest.class, UpdateKeyAliasResponse.class)
                .withName("UpdateKeyAlias")
                .withUri("/{version_id}/{project_id}/kms/update-key-alias")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKeyAliasRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<UpdateKeyAliasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeyAliasRequestBody.class),
            f -> f.withMarshaller(UpdateKeyAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescription =
        genForupdateKeyDescription();

    private static HttpRequestDef<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> genForupdateKeyDescription() {
        // basic
        HttpRequestDef.Builder<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateKeyDescriptionRequest.class, UpdateKeyDescriptionResponse.class)
            .withName("UpdateKeyDescription")
            .withUri("/{version_id}/{project_id}/kms/update-key-description")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKeyDescriptionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<UpdateKeyDescriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeyDescriptionRequestBody.class),
            f -> f.withMarshaller(UpdateKeyDescriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationInterval =
        genForupdateKeyRotationInterval();

    private static HttpRequestDef<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> genForupdateKeyRotationInterval() {
        // basic
        HttpRequestDef.Builder<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateKeyRotationIntervalRequest.class,
                    UpdateKeyRotationIntervalResponse.class)
                .withName("UpdateKeyRotationInterval")
                .withUri("/{version_id}/{project_id}/kms/update-key-rotation-interval")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateKeyRotationIntervalRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<UpdateKeyRotationIntervalRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeyRotationIntervalRequestBody.class),
            f -> f.withMarshaller(UpdateKeyRotationIntervalRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v1/{project_id}/secrets/{secret_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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
                .withUri("/v1/{project_id}/secrets/{secret_id}/stages/{stage_name}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("secret_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSecretStageRequest::getSecretId, (req, v) -> {
                req.setSecretId(v);
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

    public static final HttpRequestDef<ValidateSignatureRequest, ValidateSignatureResponse> validateSignature =
        genForvalidateSignature();

    private static HttpRequestDef<ValidateSignatureRequest, ValidateSignatureResponse> genForvalidateSignature() {
        // basic
        HttpRequestDef.Builder<ValidateSignatureRequest, ValidateSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateSignatureRequest.class, ValidateSignatureResponse.class)
                .withName("ValidateSignature")
                .withUri("/{version_id}/{project_id}/kms/verify")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateSignatureRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<VerifyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyRequestBody.class),
            f -> f.withMarshaller(ValidateSignatureRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForshowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForshowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withName("ShowVersion")
                .withUri("/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> showVersions = genForshowVersions();

    private static HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> genForshowVersions() {
        // basic
        HttpRequestDef.Builder<ShowVersionsRequest, ShowVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionsRequest.class, ShowVersionsResponse.class)
                .withName("ShowVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}

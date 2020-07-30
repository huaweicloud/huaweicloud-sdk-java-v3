package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kms.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class KmsMeta {

    public static final HttpRequestDef<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTags = genForbatchCreateKmsTags();

    private static HttpRequestDef<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> genForbatchCreateKmsTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateKmsTagsRequest.class, BatchCreateKmsTagsResponse.class)
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            })
        );
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchCreateKmsTagsReq.class,
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelGrantRequest, CancelGrantResponse> cancelGrant = genForcancelGrant();

    private static HttpRequestDef<CancelGrantRequest, CancelGrantResponse> genForcancelGrant() {
        // basic
        HttpRequestDef.Builder<CancelGrantRequest, CancelGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelGrantRequest.class, CancelGrantResponse.class)
                .withUri("/{version_id}/{project_id}/kms/revoke-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelGrantRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RevokeGrantReq.class,
            f -> f.withMarshaller(CancelGrantRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletion = genForcancelKeyDeletion();

    private static HttpRequestDef<CancelKeyDeletionRequest, CancelKeyDeletionResponse> genForcancelKeyDeletion() {
        // basic
        HttpRequestDef.Builder<CancelKeyDeletionRequest, CancelKeyDeletionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelKeyDeletionRequest.class, CancelKeyDeletionResponse.class)
                .withUri("/{version_id}/{project_id}/kms/cancel-key-deletion")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelKeyDeletionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(CancelKeyDeletionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrant = genForcancelSelfGrant();

    private static HttpRequestDef<CancelSelfGrantRequest, CancelSelfGrantResponse> genForcancelSelfGrant() {
        // basic
        HttpRequestDef.Builder<CancelSelfGrantRequest, CancelSelfGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSelfGrantRequest.class, CancelSelfGrantResponse.class)
                .withUri("/{version_id}/{project_id}/kms/retire-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CancelSelfGrantRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            RevokeGrantReq.class,
            f -> f.withMarshaller(CancelSelfGrantRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatakeyRequest, CreateDatakeyResponse> createDatakey = genForcreateDatakey();

    private static HttpRequestDef<CreateDatakeyRequest, CreateDatakeyResponse> genForcreateDatakey() {
        // basic
        HttpRequestDef.Builder<CreateDatakeyRequest, CreateDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatakeyRequest.class, CreateDatakeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/create-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDatakeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDatakeyReq.class,
            f -> f.withMarshaller(CreateDatakeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintext = genForcreateDatakeyWithoutPlaintext();

    private static HttpRequestDef<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> genForcreateDatakeyWithoutPlaintext() {
        // basic
        HttpRequestDef.Builder<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatakeyWithoutPlaintextRequest.class, CreateDatakeyWithoutPlaintextResponse.class)
                .withUri("/{version_id}/{project_id}/kms/create-datakey-without-plaintext")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateDatakeyWithoutPlaintextRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateDatakeyReq.class,
            f -> f.withMarshaller(CreateDatakeyWithoutPlaintextRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGrantRequest, CreateGrantResponse> createGrant = genForcreateGrant();

    private static HttpRequestDef<CreateGrantRequest, CreateGrantResponse> genForcreateGrant() {
        // basic
        HttpRequestDef.Builder<CreateGrantRequest, CreateGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGrantRequest.class, CreateGrantResponse.class)
                .withUri("/{version_id}/{project_id}/kms/create-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateGrantRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateGrantReq.class,
            f -> f.withMarshaller(CreateGrantRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeyRequest, CreateKeyResponse> createKey = genForcreateKey();

    private static HttpRequestDef<CreateKeyRequest, CreateKeyResponse> genForcreateKey() {
        // basic
        HttpRequestDef.Builder<CreateKeyRequest, CreateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeyRequest.class, CreateKeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/create-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateKeyReq.class,
            f -> f.withMarshaller(CreateKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTag = genForcreateKmsTag();

    private static HttpRequestDef<CreateKmsTagRequest, CreateKmsTagResponse> genForcreateKmsTag() {
        // basic
        HttpRequestDef.Builder<CreateKmsTagRequest, CreateKmsTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKmsTagRequest.class, CreateKmsTagResponse.class)
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateKmsTagRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateKmsTagRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateKmsTagReq.class,
            f -> f.withMarshaller(CreateKmsTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImport = genForcreateParametersForImport();

    private static HttpRequestDef<CreateParametersForImportRequest, CreateParametersForImportResponse> genForcreateParametersForImport() {
        // basic
        HttpRequestDef.Builder<CreateParametersForImportRequest, CreateParametersForImportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateParametersForImportRequest.class, CreateParametersForImportResponse.class)
                .withUri("/{version_id}/{project_id}/kms/get-parameters-for-import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateParametersForImportRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            GetParametersForImportReq.class,
            f -> f.withMarshaller(CreateParametersForImportRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRandomRequest, CreateRandomResponse> createRandom = genForcreateRandom();

    private static HttpRequestDef<CreateRandomRequest, CreateRandomResponse> genForcreateRandom() {
        // basic
        HttpRequestDef.Builder<CreateRandomRequest, CreateRandomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRandomRequest.class, CreateRandomResponse.class)
                .withUri("/{version_id}/{project_id}/kms/gen-random")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateRandomRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            GenRandomReq.class,
            f -> f.withMarshaller(CreateRandomRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakey = genFordecryptDatakey();

    private static HttpRequestDef<DecryptDatakeyRequest, DecryptDatakeyResponse> genFordecryptDatakey() {
        // basic
        HttpRequestDef.Builder<DecryptDatakeyRequest, DecryptDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DecryptDatakeyRequest.class, DecryptDatakeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/decrypt-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DecryptDatakeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DecryptDatakeyReq.class,
            f -> f.withMarshaller(DecryptDatakeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterial = genFordeleteImportedKeyMaterial();

    private static HttpRequestDef<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> genFordeleteImportedKeyMaterial() {
        // basic
        HttpRequestDef.Builder<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteImportedKeyMaterialRequest.class, DeleteImportedKeyMaterialResponse.class)
                .withUri("/{version_id}/{project_id}/kms/delete-imported-key-material")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteImportedKeyMaterialRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(DeleteImportedKeyMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeyRequest, DeleteKeyResponse> deleteKey = genFordeleteKey();

    private static HttpRequestDef<DeleteKeyRequest, DeleteKeyResponse> genFordeleteKey() {
        // basic
        HttpRequestDef.Builder<DeleteKeyRequest, DeleteKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteKeyRequest.class, DeleteKeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/schedule-key-deletion")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ScheduleKeyDeletionReq.class,
            f -> f.withMarshaller(DeleteKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags/{key}");

        // requests
        builder.withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTagRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            })
        );
        builder.withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteTagRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyRequest, DisableKeyResponse> disableKey = genFordisableKey();

    private static HttpRequestDef<DisableKeyRequest, DisableKeyResponse> genFordisableKey() {
        // basic
        HttpRequestDef.Builder<DisableKeyRequest, DisableKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyRequest.class, DisableKeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/disable-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisableKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(DisableKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotation = genFordisableKeyRotation();

    private static HttpRequestDef<DisableKeyRotationRequest, DisableKeyRotationResponse> genFordisableKeyRotation() {
        // basic
        HttpRequestDef.Builder<DisableKeyRotationRequest, DisableKeyRotationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyRotationRequest.class, DisableKeyRotationResponse.class)
                .withUri("/{version_id}/{project_id}/kms/disable-key-rotation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DisableKeyRotationRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(DisableKeyRotationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyRequest, EnableKeyResponse> enableKey = genForenableKey();

    private static HttpRequestDef<EnableKeyRequest, EnableKeyResponse> genForenableKey() {
        // basic
        HttpRequestDef.Builder<EnableKeyRequest, EnableKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyRequest.class, EnableKeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/enable-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EnableKeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(EnableKeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotation = genForenableKeyRotation();

    private static HttpRequestDef<EnableKeyRotationRequest, EnableKeyRotationResponse> genForenableKeyRotation() {
        // basic
        HttpRequestDef.Builder<EnableKeyRotationRequest, EnableKeyRotationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyRotationRequest.class, EnableKeyRotationResponse.class)
                .withUri("/{version_id}/{project_id}/kms/enable-key-rotation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EnableKeyRotationRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(EnableKeyRotationRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakey = genForencryptDatakey();

    private static HttpRequestDef<EncryptDatakeyRequest, EncryptDatakeyResponse> genForencryptDatakey() {
        // basic
        HttpRequestDef.Builder<EncryptDatakeyRequest, EncryptDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptDatakeyRequest.class, EncryptDatakeyResponse.class)
                .withUri("/{version_id}/{project_id}/kms/encrypt-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EncryptDatakeyRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EncryptDatakeyReq.class,
            f -> f.withMarshaller(EncryptDatakeyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterial = genForimportKeyMaterial();

    private static HttpRequestDef<ImportKeyMaterialRequest, ImportKeyMaterialResponse> genForimportKeyMaterial() {
        // basic
        HttpRequestDef.Builder<ImportKeyMaterialRequest, ImportKeyMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportKeyMaterialRequest.class, ImportKeyMaterialResponse.class)
                .withUri("/{version_id}/{project_id}/kms/import-key-material")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ImportKeyMaterialRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ImportKeyMaterialReq.class,
            f -> f.withMarshaller(ImportKeyMaterialRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGrantsRequest, ListGrantsResponse> listGrants = genForlistGrants();

    private static HttpRequestDef<ListGrantsRequest, ListGrantsResponse> genForlistGrants() {
        // basic
        HttpRequestDef.Builder<ListGrantsRequest, ListGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListGrantsRequest.class, ListGrantsResponse.class)
                .withUri("/{version_id}/{project_id}/kms/list-grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListGrantsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListGrantsReq.class,
            f -> f.withMarshaller(ListGrantsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetail = genForlistKeyDetail();

    private static HttpRequestDef<ListKeyDetailRequest, ListKeyDetailResponse> genForlistKeyDetail() {
        // basic
        HttpRequestDef.Builder<ListKeyDetailRequest, ListKeyDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKeyDetailRequest.class, ListKeyDetailResponse.class)
                .withUri("/{version_id}/{project_id}/kms/describe-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKeyDetailRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(ListKeyDetailRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeysRequest, ListKeysResponse> listKeys = genForlistKeys();

    private static HttpRequestDef<ListKeysRequest, ListKeysResponse> genForlistKeys() {
        // basic
        HttpRequestDef.Builder<ListKeysRequest, ListKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKeysRequest.class, ListKeysResponse.class)
                .withUri("/{version_id}/{project_id}/kms/list-keys")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKeysRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListKeysReq.class,
            f -> f.withMarshaller(ListKeysRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTags = genForlistKmsByTags();

    private static HttpRequestDef<ListKmsByTagsRequest, ListKmsByTagsResponse> genForlistKmsByTags() {
        // basic
        HttpRequestDef.Builder<ListKmsByTagsRequest, ListKmsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKmsByTagsRequest.class, ListKmsByTagsResponse.class)
                .withUri("/{version_id}/{project_id}/kms/{resource_instances}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("resource_instances",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKmsByTagsRequest::getResourceInstances, (req, v) -> {
                req.setResourceInstances(v);
            })
        );
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKmsByTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListKmsByTagsReq.class,
            f -> f.withMarshaller(ListKmsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTags = genForlistKmsTags();

    private static HttpRequestDef<ListKmsTagsRequest, ListKmsTagsResponse> genForlistKmsTags() {
        // basic
        HttpRequestDef.Builder<ListKmsTagsRequest, ListKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKmsTagsRequest.class, ListKmsTagsResponse.class)
                .withUri("/{version_id}/{project_id}/kms/tags");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListKmsTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrants = genForlistRetirableGrants();

    private static HttpRequestDef<ListRetirableGrantsRequest, ListRetirableGrantsResponse> genForlistRetirableGrants() {
        // basic
        HttpRequestDef.Builder<ListRetirableGrantsRequest, ListRetirableGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRetirableGrantsRequest.class, ListRetirableGrantsResponse.class)
                .withUri("/{version_id}/{project_id}/kms/list-retirable-grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListRetirableGrantsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListRetirableGrantsReq.class,
            f -> f.withMarshaller(ListRetirableGrantsRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatus = genForshowKeyRotationStatus();

    private static HttpRequestDef<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> genForshowKeyRotationStatus() {
        // basic
        HttpRequestDef.Builder<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowKeyRotationStatusRequest.class, ShowKeyRotationStatusResponse.class)
                .withUri("/{version_id}/{project_id}/kms/get-key-rotation-status")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowKeyRotationStatusRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            OperateKeyReq.class,
            f -> f.withMarshaller(ShowKeyRotationStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTags = genForshowKmsTags();

    private static HttpRequestDef<ShowKmsTagsRequest, ShowKmsTagsResponse> genForshowKmsTags() {
        // basic
        HttpRequestDef.Builder<ShowKmsTagsRequest, ShowKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKmsTagsRequest.class, ShowKmsTagsResponse.class)
                .withUri("/{version_id}/{project_id}/kms/{key_id}/tags");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowKmsTagsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowKmsTagsRequest::getKeyId, (req, v) -> {
                req.setKeyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstances = genForshowUserInstances();

    private static HttpRequestDef<ShowUserInstancesRequest, ShowUserInstancesResponse> genForshowUserInstances() {
        // basic
        HttpRequestDef.Builder<ShowUserInstancesRequest, ShowUserInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserInstancesRequest.class, ShowUserInstancesResponse.class)
                .withUri("/{version_id}/{project_id}/kms/user-instances");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserInstancesRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotas = genForshowUserQuotas();

    private static HttpRequestDef<ShowUserQuotasRequest, ShowUserQuotasResponse> genForshowUserQuotas() {
        // basic
        HttpRequestDef.Builder<ShowUserQuotasRequest, ShowUserQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserQuotasRequest.class, ShowUserQuotasResponse.class)
                .withUri("/{version_id}/{project_id}/kms/user-quotas");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowUserQuotasRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForshowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForshowVersion() {
        // basic
        HttpRequestDef.Builder<ShowVersionRequest, ShowVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionRequest.class, ShowVersionResponse.class)
                .withUri("/{version_id}");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> showVersions = genForshowVersions();

    private static HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> genForshowVersions() {
        // basic
        HttpRequestDef.Builder<ShowVersionsRequest, ShowVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowVersionsRequest.class, ShowVersionsResponse.class)
                .withUri("/");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationInterval = genForupdateKeyRotationInterval();

    private static HttpRequestDef<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> genForupdateKeyRotationInterval() {
        // basic
        HttpRequestDef.Builder<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKeyRotationIntervalRequest.class, UpdateKeyRotationIntervalResponse.class)
                .withUri("/{version_id}/{project_id}/kms/update-key-rotation-interval")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateKeyRotationIntervalRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateKeyRotationIntervalReq.class,
            f -> f.withMarshaller(UpdateKeyRotationIntervalRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DecryptDataRequest, DecryptDataResponse> decryptData = genFordecryptData();

    private static HttpRequestDef<DecryptDataRequest, DecryptDataResponse> genFordecryptData() {
        // basic
        HttpRequestDef.Builder<DecryptDataRequest, DecryptDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DecryptDataRequest.class, DecryptDataResponse.class)
                .withUri("/{version_id}/{project_id}/kms/decrypt-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DecryptDataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            DecryptDataReq.class,
            f -> f.withMarshaller(DecryptDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptDataRequest, EncryptDataResponse> encryptData = genForencryptData();

    private static HttpRequestDef<EncryptDataRequest, EncryptDataResponse> genForencryptData() {
        // basic
        HttpRequestDef.Builder<EncryptDataRequest, EncryptDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptDataRequest.class, EncryptDataResponse.class)
                .withUri("/{version_id}/{project_id}/kms/encrypt-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(EncryptDataRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            EncryptDataReq.class,
            f -> f.withMarshaller(EncryptDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAlias = genForupdateKeyAlias();

    private static HttpRequestDef<UpdateKeyAliasRequest, UpdateKeyAliasResponse> genForupdateKeyAlias() {
        // basic
        HttpRequestDef.Builder<UpdateKeyAliasRequest, UpdateKeyAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKeyAliasRequest.class, UpdateKeyAliasResponse.class)
                .withUri("/{version_id}/{project_id}/kms/update-key-alias")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateKeyAliasRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateKeyAliasReq.class,
            f -> f.withMarshaller(UpdateKeyAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescription = genForupdateKeyDescription();

    private static HttpRequestDef<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> genForupdateKeyDescription() {
        // basic
        HttpRequestDef.Builder<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKeyDescriptionRequest.class, UpdateKeyDescriptionResponse.class)
                .withUri("/{version_id}/{project_id}/kms/update-key-description")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateKeyDescriptionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateKeyDescriptionReq.class,
            f -> f.withMarshaller(UpdateKeyDescriptionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}

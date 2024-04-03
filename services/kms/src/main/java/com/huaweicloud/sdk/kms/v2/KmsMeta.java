package com.huaweicloud.sdk.kms.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.kms.v2.model.BatchCreateKmsTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.BatchCreateKmsTagsRequestBody;
import com.huaweicloud.sdk.kms.v2.model.BatchCreateKmsTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.CancelGrantRequest;
import com.huaweicloud.sdk.kms.v2.model.CancelGrantResponse;
import com.huaweicloud.sdk.kms.v2.model.CancelKeyDeletionRequest;
import com.huaweicloud.sdk.kms.v2.model.CancelKeyDeletionResponse;
import com.huaweicloud.sdk.kms.v2.model.CancelSelfGrantRequest;
import com.huaweicloud.sdk.kms.v2.model.CancelSelfGrantResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyRequestBody;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyWithoutPlaintextRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateDatakeyWithoutPlaintextResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateGrantRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateGrantRequestBody;
import com.huaweicloud.sdk.kms.v2.model.CreateGrantResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyRequestBody;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyStoreRequestBody;
import com.huaweicloud.sdk.kms.v2.model.CreateKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateKmsTagRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateKmsTagRequestBody;
import com.huaweicloud.sdk.kms.v2.model.CreateKmsTagResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateParametersForImportRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateParametersForImportResponse;
import com.huaweicloud.sdk.kms.v2.model.CreateRandomRequest;
import com.huaweicloud.sdk.kms.v2.model.CreateRandomResponse;
import com.huaweicloud.sdk.kms.v2.model.DecryptDataRequest;
import com.huaweicloud.sdk.kms.v2.model.DecryptDataRequestBody;
import com.huaweicloud.sdk.kms.v2.model.DecryptDataResponse;
import com.huaweicloud.sdk.kms.v2.model.DecryptDatakeyRequest;
import com.huaweicloud.sdk.kms.v2.model.DecryptDatakeyRequestBody;
import com.huaweicloud.sdk.kms.v2.model.DecryptDatakeyResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteImportedKeyMaterialRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteImportedKeyMaterialResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.kms.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyRotationRequest;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyRotationResponse;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.DisableKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyRotationRequest;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyRotationResponse;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.EnableKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.EncryptDataRequest;
import com.huaweicloud.sdk.kms.v2.model.EncryptDataRequestBody;
import com.huaweicloud.sdk.kms.v2.model.EncryptDataResponse;
import com.huaweicloud.sdk.kms.v2.model.EncryptDatakeyRequest;
import com.huaweicloud.sdk.kms.v2.model.EncryptDatakeyRequestBody;
import com.huaweicloud.sdk.kms.v2.model.EncryptDatakeyResponse;
import com.huaweicloud.sdk.kms.v2.model.GenRandomRequestBody;
import com.huaweicloud.sdk.kms.v2.model.GenerateMacRequest;
import com.huaweicloud.sdk.kms.v2.model.GenerateMacRequestBody;
import com.huaweicloud.sdk.kms.v2.model.GenerateMacResponse;
import com.huaweicloud.sdk.kms.v2.model.GetParametersForImportRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ImportKeyMaterialRequest;
import com.huaweicloud.sdk.kms.v2.model.ImportKeyMaterialRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ImportKeyMaterialResponse;
import com.huaweicloud.sdk.kms.v2.model.ListGrantsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListGrantsRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ListGrantsResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKeyDetailRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKeyDetailResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKeyStoresRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKeyStoresResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKeysRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKeysRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ListKeysResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKmsByTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKmsByTagsRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ListKmsByTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.ListKmsTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListKmsTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.ListRetirableGrantsRequest;
import com.huaweicloud.sdk.kms.v2.model.ListRetirableGrantsRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ListRetirableGrantsResponse;
import com.huaweicloud.sdk.kms.v2.model.OperateKeyRequestBody;
import com.huaweicloud.sdk.kms.v2.model.RevokeGrantRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ScheduleKeyDeletionRequestBody;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyRotationStatusRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyRotationStatusResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyStoreRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowKeyStoreResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowKmsTagsRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowKmsTagsResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowPublicKeyRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowPublicKeyResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowUserInstancesRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowUserInstancesResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowUserQuotasRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowUserQuotasResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionResponse;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionsRequest;
import com.huaweicloud.sdk.kms.v2.model.ShowVersionsResponse;
import com.huaweicloud.sdk.kms.v2.model.SignRequest;
import com.huaweicloud.sdk.kms.v2.model.SignRequestBody;
import com.huaweicloud.sdk.kms.v2.model.SignResponse;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyAliasRequest;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyAliasRequestBody;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyAliasResponse;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyDescriptionRequest;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyDescriptionRequestBody;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyDescriptionResponse;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyRotationIntervalRequest;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyRotationIntervalRequestBody;
import com.huaweicloud.sdk.kms.v2.model.UpdateKeyRotationIntervalResponse;
import com.huaweicloud.sdk.kms.v2.model.ValidateSignatureRequest;
import com.huaweicloud.sdk.kms.v2.model.ValidateSignatureResponse;
import com.huaweicloud.sdk.kms.v2.model.VerifyMacRequest;
import com.huaweicloud.sdk.kms.v2.model.VerifyMacRequestBody;
import com.huaweicloud.sdk.kms.v2.model.VerifyMacResponse;
import com.huaweicloud.sdk.kms.v2.model.VerifyRequestBody;

@SuppressWarnings("unchecked")
public class KmsMeta {

    public static final HttpRequestDef<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> batchCreateKmsTags =
        genForBatchCreateKmsTags();

    private static HttpRequestDef<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> genForBatchCreateKmsTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateKmsTagsRequest, BatchCreateKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateKmsTagsRequest.class, BatchCreateKmsTagsResponse.class)
                .withName("BatchCreateKmsTags")
                .withUri("/v1.0/{project_id}/kms/{key_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getKeyId, BatchCreateKmsTagsRequest::setKeyId));
        builder.<BatchCreateKmsTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateKmsTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateKmsTagsRequest::getBody, BatchCreateKmsTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelGrantRequest, CancelGrantResponse> cancelGrant = genForCancelGrant();

    private static HttpRequestDef<CancelGrantRequest, CancelGrantResponse> genForCancelGrant() {
        // basic
        HttpRequestDef.Builder<CancelGrantRequest, CancelGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelGrantRequest.class, CancelGrantResponse.class)
                .withName("CancelGrant")
                .withUri("/v1.0/{project_id}/kms/revoke-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RevokeGrantRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeGrantRequestBody.class),
            f -> f.withMarshaller(CancelGrantRequest::getBody, CancelGrantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelKeyDeletionRequest, CancelKeyDeletionResponse> cancelKeyDeletion =
        genForCancelKeyDeletion();

    private static HttpRequestDef<CancelKeyDeletionRequest, CancelKeyDeletionResponse> genForCancelKeyDeletion() {
        // basic
        HttpRequestDef.Builder<CancelKeyDeletionRequest, CancelKeyDeletionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelKeyDeletionRequest.class, CancelKeyDeletionResponse.class)
                .withName("CancelKeyDeletion")
                .withUri("/v1.0/{project_id}/kms/cancel-key-deletion")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(CancelKeyDeletionRequest::getBody, CancelKeyDeletionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSelfGrantRequest, CancelSelfGrantResponse> cancelSelfGrant =
        genForCancelSelfGrant();

    private static HttpRequestDef<CancelSelfGrantRequest, CancelSelfGrantResponse> genForCancelSelfGrant() {
        // basic
        HttpRequestDef.Builder<CancelSelfGrantRequest, CancelSelfGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSelfGrantRequest.class, CancelSelfGrantResponse.class)
                .withName("CancelSelfGrant")
                .withUri("/v1.0/{project_id}/kms/retire-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<RevokeGrantRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeGrantRequestBody.class),
            f -> f.withMarshaller(CancelSelfGrantRequest::getBody, CancelSelfGrantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatakeyRequest, CreateDatakeyResponse> createDatakey =
        genForCreateDatakey();

    private static HttpRequestDef<CreateDatakeyRequest, CreateDatakeyResponse> genForCreateDatakey() {
        // basic
        HttpRequestDef.Builder<CreateDatakeyRequest, CreateDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatakeyRequest.class, CreateDatakeyResponse.class)
                .withName("CreateDatakey")
                .withUri("/v1.0/{project_id}/kms/create-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatakeyRequestBody.class),
            f -> f.withMarshaller(CreateDatakeyRequest::getBody, CreateDatakeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintext =
        genForCreateDatakeyWithoutPlaintext();

    private static HttpRequestDef<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> genForCreateDatakeyWithoutPlaintext() {
        // basic
        HttpRequestDef.Builder<CreateDatakeyWithoutPlaintextRequest, CreateDatakeyWithoutPlaintextResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDatakeyWithoutPlaintextRequest.class,
                    CreateDatakeyWithoutPlaintextResponse.class)
                .withName("CreateDatakeyWithoutPlaintext")
                .withUri("/v1.0/{project_id}/kms/create-datakey-without-plaintext")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatakeyRequestBody.class),
            f -> f.withMarshaller(CreateDatakeyWithoutPlaintextRequest::getBody,
                CreateDatakeyWithoutPlaintextRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGrantRequest, CreateGrantResponse> createGrant = genForCreateGrant();

    private static HttpRequestDef<CreateGrantRequest, CreateGrantResponse> genForCreateGrant() {
        // basic
        HttpRequestDef.Builder<CreateGrantRequest, CreateGrantResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGrantRequest.class, CreateGrantResponse.class)
                .withName("CreateGrant")
                .withUri("/v1.0/{project_id}/kms/create-grant")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateGrantRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGrantRequestBody.class),
            f -> f.withMarshaller(CreateGrantRequest::getBody, CreateGrantRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeyRequest, CreateKeyResponse> createKey = genForCreateKey();

    private static HttpRequestDef<CreateKeyRequest, CreateKeyResponse> genForCreateKey() {
        // basic
        HttpRequestDef.Builder<CreateKeyRequest, CreateKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeyRequest.class, CreateKeyResponse.class)
                .withName("CreateKey")
                .withUri("/v1.0/{project_id}/kms/create-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeyRequestBody.class),
            f -> f.withMarshaller(CreateKeyRequest::getBody, CreateKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKeyStoreRequest, CreateKeyStoreResponse> createKeyStore =
        genForCreateKeyStore();

    private static HttpRequestDef<CreateKeyStoreRequest, CreateKeyStoreResponse> genForCreateKeyStore() {
        // basic
        HttpRequestDef.Builder<CreateKeyStoreRequest, CreateKeyStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKeyStoreRequest.class, CreateKeyStoreResponse.class)
                .withName("CreateKeyStore")
                .withUri("/v1.0/{project_id}/keystores")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateKeyStoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKeyStoreRequestBody.class),
            f -> f.withMarshaller(CreateKeyStoreRequest::getBody, CreateKeyStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateKmsTagRequest, CreateKmsTagResponse> createKmsTag = genForCreateKmsTag();

    private static HttpRequestDef<CreateKmsTagRequest, CreateKmsTagResponse> genForCreateKmsTag() {
        // basic
        HttpRequestDef.Builder<CreateKmsTagRequest, CreateKmsTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateKmsTagRequest.class, CreateKmsTagResponse.class)
                .withName("CreateKmsTag")
                .withUri("/v1.0/{project_id}/kms/{key_id}/tags")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateKmsTagRequest::getKeyId, CreateKmsTagRequest::setKeyId));
        builder.<CreateKmsTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateKmsTagRequestBody.class),
            f -> f.withMarshaller(CreateKmsTagRequest::getBody, CreateKmsTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateParametersForImportRequest, CreateParametersForImportResponse> createParametersForImport =
        genForCreateParametersForImport();

    private static HttpRequestDef<CreateParametersForImportRequest, CreateParametersForImportResponse> genForCreateParametersForImport() {
        // basic
        HttpRequestDef.Builder<CreateParametersForImportRequest, CreateParametersForImportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateParametersForImportRequest.class,
                    CreateParametersForImportResponse.class)
                .withName("CreateParametersForImport")
                .withUri("/v1.0/{project_id}/kms/get-parameters-for-import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GetParametersForImportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetParametersForImportRequestBody.class),
            f -> f.withMarshaller(CreateParametersForImportRequest::getBody,
                CreateParametersForImportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRandomRequest, CreateRandomResponse> createRandom = genForCreateRandom();

    private static HttpRequestDef<CreateRandomRequest, CreateRandomResponse> genForCreateRandom() {
        // basic
        HttpRequestDef.Builder<CreateRandomRequest, CreateRandomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRandomRequest.class, CreateRandomResponse.class)
                .withName("CreateRandom")
                .withUri("/v1.0/{project_id}/kms/gen-random")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GenRandomRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenRandomRequestBody.class),
            f -> f.withMarshaller(CreateRandomRequest::getBody, CreateRandomRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DecryptDataRequest, DecryptDataResponse> decryptData = genForDecryptData();

    private static HttpRequestDef<DecryptDataRequest, DecryptDataResponse> genForDecryptData() {
        // basic
        HttpRequestDef.Builder<DecryptDataRequest, DecryptDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DecryptDataRequest.class, DecryptDataResponse.class)
                .withName("DecryptData")
                .withUri("/v1.0/{project_id}/kms/decrypt-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DecryptDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DecryptDataRequestBody.class),
            f -> f.withMarshaller(DecryptDataRequest::getBody, DecryptDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DecryptDatakeyRequest, DecryptDatakeyResponse> decryptDatakey =
        genForDecryptDatakey();

    private static HttpRequestDef<DecryptDatakeyRequest, DecryptDatakeyResponse> genForDecryptDatakey() {
        // basic
        HttpRequestDef.Builder<DecryptDatakeyRequest, DecryptDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DecryptDatakeyRequest.class, DecryptDatakeyResponse.class)
                .withName("DecryptDatakey")
                .withUri("/v1.0/{project_id}/kms/decrypt-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DecryptDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DecryptDatakeyRequestBody.class),
            f -> f.withMarshaller(DecryptDatakeyRequest::getBody, DecryptDatakeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterial =
        genForDeleteImportedKeyMaterial();

    private static HttpRequestDef<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> genForDeleteImportedKeyMaterial() {
        // basic
        HttpRequestDef.Builder<DeleteImportedKeyMaterialRequest, DeleteImportedKeyMaterialResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteImportedKeyMaterialRequest.class,
                    DeleteImportedKeyMaterialResponse.class)
                .withName("DeleteImportedKeyMaterial")
                .withUri("/v1.0/{project_id}/kms/delete-imported-key-material")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(DeleteImportedKeyMaterialRequest::getBody,
                DeleteImportedKeyMaterialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeyRequest, DeleteKeyResponse> deleteKey = genForDeleteKey();

    private static HttpRequestDef<DeleteKeyRequest, DeleteKeyResponse> genForDeleteKey() {
        // basic
        HttpRequestDef.Builder<DeleteKeyRequest, DeleteKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteKeyRequest.class, DeleteKeyResponse.class)
                .withName("DeleteKey")
                .withUri("/v1.0/{project_id}/kms/schedule-key-deletion")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ScheduleKeyDeletionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScheduleKeyDeletionRequestBody.class),
            f -> f.withMarshaller(DeleteKeyRequest::getBody, DeleteKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteKeyStoreRequest, DeleteKeyStoreResponse> deleteKeyStore =
        genForDeleteKeyStore();

    private static HttpRequestDef<DeleteKeyStoreRequest, DeleteKeyStoreResponse> genForDeleteKeyStore() {
        // basic
        HttpRequestDef.Builder<DeleteKeyStoreRequest, DeleteKeyStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteKeyStoreRequest.class, DeleteKeyStoreResponse.class)
                .withName("DeleteKeyStore")
                .withUri("/v1.0/{project_id}/keystores/{keystore_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteKeyStoreRequest::getKeystoreId, DeleteKeyStoreRequest::setKeystoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v1.0/{project_id}/kms/{key_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKeyId, DeleteTagRequest::setKeyId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, DeleteTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyRequest, DisableKeyResponse> disableKey = genForDisableKey();

    private static HttpRequestDef<DisableKeyRequest, DisableKeyResponse> genForDisableKey() {
        // basic
        HttpRequestDef.Builder<DisableKeyRequest, DisableKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyRequest.class, DisableKeyResponse.class)
                .withName("DisableKey")
                .withUri("/v1.0/{project_id}/kms/disable-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(DisableKeyRequest::getBody, DisableKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyRotationRequest, DisableKeyRotationResponse> disableKeyRotation =
        genForDisableKeyRotation();

    private static HttpRequestDef<DisableKeyRotationRequest, DisableKeyRotationResponse> genForDisableKeyRotation() {
        // basic
        HttpRequestDef.Builder<DisableKeyRotationRequest, DisableKeyRotationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyRotationRequest.class, DisableKeyRotationResponse.class)
                .withName("DisableKeyRotation")
                .withUri("/v1.0/{project_id}/kms/disable-key-rotation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(DisableKeyRotationRequest::getBody, DisableKeyRotationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableKeyStoreRequest, DisableKeyStoreResponse> disableKeyStore =
        genForDisableKeyStore();

    private static HttpRequestDef<DisableKeyStoreRequest, DisableKeyStoreResponse> genForDisableKeyStore() {
        // basic
        HttpRequestDef.Builder<DisableKeyStoreRequest, DisableKeyStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableKeyStoreRequest.class, DisableKeyStoreResponse.class)
                .withName("DisableKeyStore")
                .withUri("/v1.0/{project_id}/keystores/{keystore_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableKeyStoreRequest::getKeystoreId, DisableKeyStoreRequest::setKeystoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyRequest, EnableKeyResponse> enableKey = genForEnableKey();

    private static HttpRequestDef<EnableKeyRequest, EnableKeyResponse> genForEnableKey() {
        // basic
        HttpRequestDef.Builder<EnableKeyRequest, EnableKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyRequest.class, EnableKeyResponse.class)
                .withName("EnableKey")
                .withUri("/v1.0/{project_id}/kms/enable-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(EnableKeyRequest::getBody, EnableKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyRotationRequest, EnableKeyRotationResponse> enableKeyRotation =
        genForEnableKeyRotation();

    private static HttpRequestDef<EnableKeyRotationRequest, EnableKeyRotationResponse> genForEnableKeyRotation() {
        // basic
        HttpRequestDef.Builder<EnableKeyRotationRequest, EnableKeyRotationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyRotationRequest.class, EnableKeyRotationResponse.class)
                .withName("EnableKeyRotation")
                .withUri("/v1.0/{project_id}/kms/enable-key-rotation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(EnableKeyRotationRequest::getBody, EnableKeyRotationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableKeyStoreRequest, EnableKeyStoreResponse> enableKeyStore =
        genForEnableKeyStore();

    private static HttpRequestDef<EnableKeyStoreRequest, EnableKeyStoreResponse> genForEnableKeyStore() {
        // basic
        HttpRequestDef.Builder<EnableKeyStoreRequest, EnableKeyStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableKeyStoreRequest.class, EnableKeyStoreResponse.class)
                .withName("EnableKeyStore")
                .withUri("/v1.0/{project_id}/keystores/{keystore_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableKeyStoreRequest::getKeystoreId, EnableKeyStoreRequest::setKeystoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptDataRequest, EncryptDataResponse> encryptData = genForEncryptData();

    private static HttpRequestDef<EncryptDataRequest, EncryptDataResponse> genForEncryptData() {
        // basic
        HttpRequestDef.Builder<EncryptDataRequest, EncryptDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptDataRequest.class, EncryptDataResponse.class)
                .withName("EncryptData")
                .withUri("/v1.0/{project_id}/kms/encrypt-data")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<EncryptDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDataRequestBody.class),
            f -> f.withMarshaller(EncryptDataRequest::getBody, EncryptDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EncryptDatakeyRequest, EncryptDatakeyResponse> encryptDatakey =
        genForEncryptDatakey();

    private static HttpRequestDef<EncryptDatakeyRequest, EncryptDatakeyResponse> genForEncryptDatakey() {
        // basic
        HttpRequestDef.Builder<EncryptDatakeyRequest, EncryptDatakeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EncryptDatakeyRequest.class, EncryptDatakeyResponse.class)
                .withName("EncryptDatakey")
                .withUri("/v1.0/{project_id}/kms/encrypt-datakey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<EncryptDatakeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EncryptDatakeyRequestBody.class),
            f -> f.withMarshaller(EncryptDatakeyRequest::getBody, EncryptDatakeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GenerateMacRequest, GenerateMacResponse> generateMac = genForGenerateMac();

    private static HttpRequestDef<GenerateMacRequest, GenerateMacResponse> genForGenerateMac() {
        // basic
        HttpRequestDef.Builder<GenerateMacRequest, GenerateMacResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, GenerateMacRequest.class, GenerateMacResponse.class)
                .withName("GenerateMac")
                .withUri("/v1.0/{project_id}/kms/generate-mac")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<GenerateMacRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateMacRequestBody.class),
            f -> f.withMarshaller(GenerateMacRequest::getBody, GenerateMacRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportKeyMaterialRequest, ImportKeyMaterialResponse> importKeyMaterial =
        genForImportKeyMaterial();

    private static HttpRequestDef<ImportKeyMaterialRequest, ImportKeyMaterialResponse> genForImportKeyMaterial() {
        // basic
        HttpRequestDef.Builder<ImportKeyMaterialRequest, ImportKeyMaterialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportKeyMaterialRequest.class, ImportKeyMaterialResponse.class)
                .withName("ImportKeyMaterial")
                .withUri("/v1.0/{project_id}/kms/import-key-material")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ImportKeyMaterialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportKeyMaterialRequestBody.class),
            f -> f.withMarshaller(ImportKeyMaterialRequest::getBody, ImportKeyMaterialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGrantsRequest, ListGrantsResponse> listGrants = genForListGrants();

    private static HttpRequestDef<ListGrantsRequest, ListGrantsResponse> genForListGrants() {
        // basic
        HttpRequestDef.Builder<ListGrantsRequest, ListGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListGrantsRequest.class, ListGrantsResponse.class)
                .withName("ListGrants")
                .withUri("/v1.0/{project_id}/kms/list-grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListGrantsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListGrantsRequestBody.class),
            f -> f.withMarshaller(ListGrantsRequest::getBody, ListGrantsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeyDetailRequest, ListKeyDetailResponse> listKeyDetail =
        genForListKeyDetail();

    private static HttpRequestDef<ListKeyDetailRequest, ListKeyDetailResponse> genForListKeyDetail() {
        // basic
        HttpRequestDef.Builder<ListKeyDetailRequest, ListKeyDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKeyDetailRequest.class, ListKeyDetailResponse.class)
                .withName("ListKeyDetail")
                .withUri("/v1.0/{project_id}/kms/describe-key")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(ListKeyDetailRequest::getBody, ListKeyDetailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeyStoresRequest, ListKeyStoresResponse> listKeyStores =
        genForListKeyStores();

    private static HttpRequestDef<ListKeyStoresRequest, ListKeyStoresResponse> genForListKeyStores() {
        // basic
        HttpRequestDef.Builder<ListKeyStoresRequest, ListKeyStoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKeyStoresRequest.class, ListKeyStoresResponse.class)
                .withName("ListKeyStores")
                .withUri("/v1.0/{project_id}/keystores")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeyStoresRequest::getLimit, ListKeyStoresRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListKeyStoresRequest::getOffset, ListKeyStoresRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKeysRequest, ListKeysResponse> listKeys = genForListKeys();

    private static HttpRequestDef<ListKeysRequest, ListKeysResponse> genForListKeys() {
        // basic
        HttpRequestDef.Builder<ListKeysRequest, ListKeysResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKeysRequest.class, ListKeysResponse.class)
                .withName("ListKeys")
                .withUri("/v1.0/{project_id}/kms/list-keys")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListKeysRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListKeysRequestBody.class),
            f -> f.withMarshaller(ListKeysRequest::getBody, ListKeysRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKmsByTagsRequest, ListKmsByTagsResponse> listKmsByTags =
        genForListKmsByTags();

    private static HttpRequestDef<ListKmsByTagsRequest, ListKmsByTagsResponse> genForListKmsByTags() {
        // basic
        HttpRequestDef.Builder<ListKmsByTagsRequest, ListKmsByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListKmsByTagsRequest.class, ListKmsByTagsResponse.class)
                .withName("ListKmsByTags")
                .withUri("/v1.0/{project_id}/kms/{resource_instances}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("resource_instances",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListKmsByTagsRequest::getResourceInstances,
                ListKmsByTagsRequest::setResourceInstances));
        builder.<ListKmsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListKmsByTagsRequestBody.class),
            f -> f.withMarshaller(ListKmsByTagsRequest::getBody, ListKmsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListKmsTagsRequest, ListKmsTagsResponse> listKmsTags = genForListKmsTags();

    private static HttpRequestDef<ListKmsTagsRequest, ListKmsTagsResponse> genForListKmsTags() {
        // basic
        HttpRequestDef.Builder<ListKmsTagsRequest, ListKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListKmsTagsRequest.class, ListKmsTagsResponse.class)
                .withName("ListKmsTags")
                .withUri("/v1.0/{project_id}/kms/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRetirableGrantsRequest, ListRetirableGrantsResponse> listRetirableGrants =
        genForListRetirableGrants();

    private static HttpRequestDef<ListRetirableGrantsRequest, ListRetirableGrantsResponse> genForListRetirableGrants() {
        // basic
        HttpRequestDef.Builder<ListRetirableGrantsRequest, ListRetirableGrantsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListRetirableGrantsRequest.class, ListRetirableGrantsResponse.class)
                .withName("ListRetirableGrants")
                .withUri("/v1.0/{project_id}/kms/list-retirable-grants")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListRetirableGrantsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRetirableGrantsRequestBody.class),
            f -> f.withMarshaller(ListRetirableGrantsRequest::getBody, ListRetirableGrantsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> showKeyRotationStatus =
        genForShowKeyRotationStatus();

    private static HttpRequestDef<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> genForShowKeyRotationStatus() {
        // basic
        HttpRequestDef.Builder<ShowKeyRotationStatusRequest, ShowKeyRotationStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowKeyRotationStatusRequest.class, ShowKeyRotationStatusResponse.class)
            .withName("ShowKeyRotationStatus")
            .withUri("/v1.0/{project_id}/kms/get-key-rotation-status")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(ShowKeyRotationStatusRequest::getBody, ShowKeyRotationStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKeyStoreRequest, ShowKeyStoreResponse> showKeyStore = genForShowKeyStore();

    private static HttpRequestDef<ShowKeyStoreRequest, ShowKeyStoreResponse> genForShowKeyStore() {
        // basic
        HttpRequestDef.Builder<ShowKeyStoreRequest, ShowKeyStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKeyStoreRequest.class, ShowKeyStoreResponse.class)
                .withName("ShowKeyStore")
                .withUri("/v1.0/{project_id}/keystores/{keystore_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("keystore_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKeyStoreRequest::getKeystoreId, ShowKeyStoreRequest::setKeystoreId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKmsTagsRequest, ShowKmsTagsResponse> showKmsTags = genForShowKmsTags();

    private static HttpRequestDef<ShowKmsTagsRequest, ShowKmsTagsResponse> genForShowKmsTags() {
        // basic
        HttpRequestDef.Builder<ShowKmsTagsRequest, ShowKmsTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKmsTagsRequest.class, ShowKmsTagsResponse.class)
                .withName("ShowKmsTags")
                .withUri("/v1.0/{project_id}/kms/{key_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKmsTagsRequest::getKeyId, ShowKmsTagsRequest::setKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicKeyRequest, ShowPublicKeyResponse> showPublicKey =
        genForShowPublicKey();

    private static HttpRequestDef<ShowPublicKeyRequest, ShowPublicKeyResponse> genForShowPublicKey() {
        // basic
        HttpRequestDef.Builder<ShowPublicKeyRequest, ShowPublicKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowPublicKeyRequest.class, ShowPublicKeyResponse.class)
                .withName("ShowPublicKey")
                .withUri("/v1.0/{project_id}/kms/get-publickey")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<OperateKeyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateKeyRequestBody.class),
            f -> f.withMarshaller(ShowPublicKeyRequest::getBody, ShowPublicKeyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserInstancesRequest, ShowUserInstancesResponse> showUserInstances =
        genForShowUserInstances();

    private static HttpRequestDef<ShowUserInstancesRequest, ShowUserInstancesResponse> genForShowUserInstances() {
        // basic
        HttpRequestDef.Builder<ShowUserInstancesRequest, ShowUserInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserInstancesRequest.class, ShowUserInstancesResponse.class)
                .withName("ShowUserInstances")
                .withUri("/v1.0/{project_id}/kms/user-instances")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserQuotasRequest, ShowUserQuotasResponse> showUserQuotas =
        genForShowUserQuotas();

    private static HttpRequestDef<ShowUserQuotasRequest, ShowUserQuotasResponse> genForShowUserQuotas() {
        // basic
        HttpRequestDef.Builder<ShowUserQuotasRequest, ShowUserQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserQuotasRequest.class, ShowUserQuotasResponse.class)
                .withName("ShowUserQuotas")
                .withUri("/v1.0/{project_id}/kms/user-quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SignRequest, SignResponse> sign = genForSign();

    private static HttpRequestDef<SignRequest, SignResponse> genForSign() {
        // basic
        HttpRequestDef.Builder<SignRequest, SignResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SignRequest.class, SignResponse.class)
                .withName("Sign")
                .withUri("/v1.0/{project_id}/kms/sign")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SignRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SignRequestBody.class),
            f -> f.withMarshaller(SignRequest::getBody, SignRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyAliasRequest, UpdateKeyAliasResponse> updateKeyAlias =
        genForUpdateKeyAlias();

    private static HttpRequestDef<UpdateKeyAliasRequest, UpdateKeyAliasResponse> genForUpdateKeyAlias() {
        // basic
        HttpRequestDef.Builder<UpdateKeyAliasRequest, UpdateKeyAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateKeyAliasRequest.class, UpdateKeyAliasResponse.class)
                .withName("UpdateKeyAlias")
                .withUri("/v1.0/{project_id}/kms/update-key-alias")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateKeyAliasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeyAliasRequestBody.class),
            f -> f.withMarshaller(UpdateKeyAliasRequest::getBody, UpdateKeyAliasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> updateKeyDescription =
        genForUpdateKeyDescription();

    private static HttpRequestDef<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> genForUpdateKeyDescription() {
        // basic
        HttpRequestDef.Builder<UpdateKeyDescriptionRequest, UpdateKeyDescriptionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateKeyDescriptionRequest.class, UpdateKeyDescriptionResponse.class)
            .withName("UpdateKeyDescription")
            .withUri("/v1.0/{project_id}/kms/update-key-description")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateKeyDescriptionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeyDescriptionRequestBody.class),
            f -> f.withMarshaller(UpdateKeyDescriptionRequest::getBody, UpdateKeyDescriptionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> updateKeyRotationInterval =
        genForUpdateKeyRotationInterval();

    private static HttpRequestDef<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> genForUpdateKeyRotationInterval() {
        // basic
        HttpRequestDef.Builder<UpdateKeyRotationIntervalRequest, UpdateKeyRotationIntervalResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateKeyRotationIntervalRequest.class,
                    UpdateKeyRotationIntervalResponse.class)
                .withName("UpdateKeyRotationInterval")
                .withUri("/v1.0/{project_id}/kms/update-key-rotation-interval")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UpdateKeyRotationIntervalRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateKeyRotationIntervalRequestBody.class),
            f -> f.withMarshaller(UpdateKeyRotationIntervalRequest::getBody,
                UpdateKeyRotationIntervalRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateSignatureRequest, ValidateSignatureResponse> validateSignature =
        genForValidateSignature();

    private static HttpRequestDef<ValidateSignatureRequest, ValidateSignatureResponse> genForValidateSignature() {
        // basic
        HttpRequestDef.Builder<ValidateSignatureRequest, ValidateSignatureResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ValidateSignatureRequest.class, ValidateSignatureResponse.class)
                .withName("ValidateSignature")
                .withUri("/v1.0/{project_id}/kms/verify")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VerifyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyRequestBody.class),
            f -> f.withMarshaller(ValidateSignatureRequest::getBody, ValidateSignatureRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<VerifyMacRequest, VerifyMacResponse> verifyMac = genForVerifyMac();

    private static HttpRequestDef<VerifyMacRequest, VerifyMacResponse> genForVerifyMac() {
        // basic
        HttpRequestDef.Builder<VerifyMacRequest, VerifyMacResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, VerifyMacRequest.class, VerifyMacResponse.class)
                .withName("VerifyMac")
                .withUri("/v1.0/{project_id}/kms/verify-mac")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<VerifyMacRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyMacRequestBody.class),
            f -> f.withMarshaller(VerifyMacRequest::getBody, VerifyMacRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionRequest, ShowVersionResponse> showVersion = genForShowVersion();

    private static HttpRequestDef<ShowVersionRequest, ShowVersionResponse> genForShowVersion() {
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
            f -> f.withMarshaller(ShowVersionRequest::getVersionId, ShowVersionRequest::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> showVersions = genForShowVersions();

    private static HttpRequestDef<ShowVersionsRequest, ShowVersionsResponse> genForShowVersions() {
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

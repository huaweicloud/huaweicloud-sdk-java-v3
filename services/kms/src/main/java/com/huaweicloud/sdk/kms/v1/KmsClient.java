package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.kms.v1.model.*;

public class KmsClient {
    protected HcClient hcClient;

    public KmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsClient> newBuilder() {
        return new ClientBuilder<>(KmsClient::new);
    }

    public BatchCreateKmsTagsResponse batchCreateKmsTags(BatchCreateKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    public CancelGrantResponse cancelGrant(CancelGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    public CancelKeyDeletionResponse cancelKeyDeletion(CancelKeyDeletionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    public CancelSelfGrantResponse cancelSelfGrant(CancelSelfGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    public CreateDatakeyResponse createDatakey(CreateDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakey);
    }

    public CreateDatakeyWithoutPlaintextResponse createDatakeyWithoutPlaintext(CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    public CreateGrantResponse createGrant(CreateGrantRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createGrant);
    }

    public CreateKeyResponse createKey(CreateKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKey);
    }

    public CreateKmsTagResponse createKmsTag(CreateKmsTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    public CreateParametersForImportResponse createParametersForImport(CreateParametersForImportRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    public CreateRandomResponse createRandom(CreateRandomRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.createRandom);
    }

    public DecryptDatakeyResponse decryptDatakey(DecryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    public DeleteImportedKeyMaterialResponse deleteImportedKeyMaterial(DeleteImportedKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    public DeleteKeyResponse deleteKey(DeleteKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteKey);
    }

    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.deleteTag);
    }

    public DisableKeyResponse disableKey(DisableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKey);
    }

    public DisableKeyRotationResponse disableKeyRotation(DisableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    public EnableKeyResponse enableKey(EnableKeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKey);
    }

    public EnableKeyRotationResponse enableKeyRotation(EnableKeyRotationRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    public EncryptDatakeyResponse encryptDatakey(EncryptDatakeyRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    public ImportKeyMaterialResponse importKeyMaterial(ImportKeyMaterialRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    public ListGrantsResponse listGrants(ListGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listGrants);
    }

    public ListKeyDetailResponse listKeyDetail(ListKeyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    public ListKeysResponse listKeys(ListKeysRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKeys);
    }

    public ListKmsByTagsResponse listKmsByTags(ListKmsByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    public ListKmsTagsResponse listKmsTags(ListKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    public ListRetirableGrantsResponse listRetirableGrants(ListRetirableGrantsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    public ShowKeyRotationStatusResponse showKeyRotationStatus(ShowKeyRotationStatusRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    public ShowKmsTagsResponse showKmsTags(ShowKmsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    public ShowUserInstancesResponse showUserInstances(ShowUserInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    public ShowUserQuotasResponse showUserQuotas(ShowUserQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    public ShowVersionResponse showVersion(ShowVersionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersion);
    }

    public ShowVersionsResponse showVersions(ShowVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.showVersions);
    }

    public UpdateKeyRotationIntervalResponse updateKeyRotationInterval(UpdateKeyRotationIntervalRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    public DecryptDataResponse decryptData(DecryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.decryptData);
    }

    public EncryptDataResponse encryptData(EncryptDataRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.encryptData);
    }

    public UpdateKeyAliasResponse updateKeyAlias(UpdateKeyAliasRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    public UpdateKeyDescriptionResponse updateKeyDescription(UpdateKeyDescriptionRequest request) {
        return hcClient.syncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

}
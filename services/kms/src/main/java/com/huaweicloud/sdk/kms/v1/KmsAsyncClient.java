package com.huaweicloud.sdk.kms.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.kms.v1.model.*;

public class KmsAsyncClient {
    protected HcClient hcClient;

    public KmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<KmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(KmsAsyncClient::new);
    }


    public CompletableFuture<BatchCreateKmsTagsResponse> batchCreateKmsTagsAsync(BatchCreateKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.batchCreateKmsTags);
    }

    public CompletableFuture<CancelGrantResponse> cancelGrantAsync(CancelGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelGrant);
    }

    public CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletionAsync(CancelKeyDeletionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelKeyDeletion);
    }

    public CompletableFuture<CancelSelfGrantResponse> cancelSelfGrantAsync(CancelSelfGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.cancelSelfGrant);
    }

    public CompletableFuture<CreateDatakeyResponse> createDatakeyAsync(CreateDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakey);
    }

    public CompletableFuture<CreateDatakeyWithoutPlaintextResponse> createDatakeyWithoutPlaintextAsync(CreateDatakeyWithoutPlaintextRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createDatakeyWithoutPlaintext);
    }

    public CompletableFuture<CreateGrantResponse> createGrantAsync(CreateGrantRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createGrant);
    }

    public CompletableFuture<CreateKeyResponse> createKeyAsync(CreateKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKey);
    }

    public CompletableFuture<CreateKmsTagResponse> createKmsTagAsync(CreateKmsTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createKmsTag);
    }

    public CompletableFuture<CreateParametersForImportResponse> createParametersForImportAsync(CreateParametersForImportRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createParametersForImport);
    }

    public CompletableFuture<CreateRandomResponse> createRandomAsync(CreateRandomRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.createRandom);
    }

    public CompletableFuture<DecryptDatakeyResponse> decryptDatakeyAsync(DecryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptDatakey);
    }

    public CompletableFuture<DeleteImportedKeyMaterialResponse> deleteImportedKeyMaterialAsync(DeleteImportedKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteImportedKeyMaterial);
    }

    public CompletableFuture<DeleteKeyResponse> deleteKeyAsync(DeleteKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteKey);
    }

    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.deleteTag);
    }

    public CompletableFuture<DisableKeyResponse> disableKeyAsync(DisableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKey);
    }

    public CompletableFuture<DisableKeyRotationResponse> disableKeyRotationAsync(DisableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.disableKeyRotation);
    }

    public CompletableFuture<EnableKeyResponse> enableKeyAsync(EnableKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKey);
    }

    public CompletableFuture<EnableKeyRotationResponse> enableKeyRotationAsync(EnableKeyRotationRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.enableKeyRotation);
    }

    public CompletableFuture<EncryptDatakeyResponse> encryptDatakeyAsync(EncryptDatakeyRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptDatakey);
    }

    public CompletableFuture<ImportKeyMaterialResponse> importKeyMaterialAsync(ImportKeyMaterialRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.importKeyMaterial);
    }

    public CompletableFuture<ListGrantsResponse> listGrantsAsync(ListGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listGrants);
    }

    public CompletableFuture<ListKeyDetailResponse> listKeyDetailAsync(ListKeyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeyDetail);
    }

    public CompletableFuture<ListKeysResponse> listKeysAsync(ListKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKeys);
    }

    public CompletableFuture<ListKmsByTagsResponse> listKmsByTagsAsync(ListKmsByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsByTags);
    }

    public CompletableFuture<ListKmsTagsResponse> listKmsTagsAsync(ListKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listKmsTags);
    }

    public CompletableFuture<ListRetirableGrantsResponse> listRetirableGrantsAsync(ListRetirableGrantsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.listRetirableGrants);
    }

    public CompletableFuture<ShowKeyRotationStatusResponse> showKeyRotationStatusAsync(ShowKeyRotationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKeyRotationStatus);
    }

    public CompletableFuture<ShowKmsTagsResponse> showKmsTagsAsync(ShowKmsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showKmsTags);
    }

    public CompletableFuture<ShowUserInstancesResponse> showUserInstancesAsync(ShowUserInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserInstances);
    }

    public CompletableFuture<ShowUserQuotasResponse> showUserQuotasAsync(ShowUserQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showUserQuotas);
    }

    public CompletableFuture<ShowVersionResponse> showVersionAsync(ShowVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersion);
    }

    public CompletableFuture<ShowVersionsResponse> showVersionsAsync(ShowVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.showVersions);
    }

    public CompletableFuture<UpdateKeyRotationIntervalResponse> updateKeyRotationIntervalAsync(UpdateKeyRotationIntervalRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyRotationInterval);
    }

    public CompletableFuture<DecryptDataResponse> decryptDataAsync(DecryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.decryptData);
    }

    public CompletableFuture<EncryptDataResponse> encryptDataAsync(EncryptDataRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.encryptData);
    }

    public CompletableFuture<UpdateKeyAliasResponse> updateKeyAliasAsync(UpdateKeyAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyAlias);
    }

    public CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescriptionAsync(UpdateKeyDescriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, KmsMeta.updateKeyDescription);
    }

}
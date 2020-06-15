package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dds.v3.model.*;

public class DdsAsyncClient {
    protected HcClient hcClient;

    public DdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DdsAsyncClient::new);
    }


    public CompletableFuture<AddShardingNodeResponse> addShardingNodeAsync(AddShardingNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    public CompletableFuture<BatchCreateInstanceTagsResponse> batchCreateInstanceTagsAsync(BatchCreateInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchCreateInstanceTags);
    }

    public CompletableFuture<BatchDeleteInstanceTagsResponse> batchDeleteInstanceTagsAsync(BatchDeleteInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchDeleteInstanceTags);
    }

    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createInstance);
    }

    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listBackups);
    }

    public CompletableFuture<ListDatastoreVersionsResponse> listDatastoreVersionsAsync(ListDatastoreVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavors);
    }

    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstances);
    }

    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restartInstance);
    }

    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

}
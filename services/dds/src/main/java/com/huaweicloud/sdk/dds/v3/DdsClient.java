package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.function.Function;

import com.huaweicloud.sdk.dds.v3.model.*;

public class DdsClient {
    protected HcClient hcClient;

    public DdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsClient> newBuilder() {
        return new ClientBuilder<>(DdsClient::new);
    }

    public AddShardingNodeResponse addShardingNode(AddShardingNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    public BatchCreateInstanceTagsResponse batchCreateInstanceTags(BatchCreateInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.batchCreateInstanceTags);
    }

    public BatchDeleteInstanceTagsResponse batchDeleteInstanceTags(BatchDeleteInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.batchDeleteInstanceTags);
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createInstance);
    }

    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listBackups);
    }

    public ListDatastoreVersionsResponse listDatastoreVersions(ListDatastoreVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listFlavors);
    }

    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstances);
    }

    public ListInstancesByTagsResponse listInstancesByTags(ListInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    public ResizeInstanceVolumeResponse resizeInstanceVolume(ResizeInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.restartInstance);
    }

    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

}
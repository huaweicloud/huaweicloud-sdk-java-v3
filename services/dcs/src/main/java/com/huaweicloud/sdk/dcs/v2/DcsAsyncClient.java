package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dcs.v2.model.*;

public class DcsAsyncClient {
    protected HcClient hcClient;

    public DcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DcsAsyncClient::new);
    }


    public CompletableFuture<BatchCreateOrDeleteDcsTagsResponse> batchCreateOrDeleteDcsTagsAsync(BatchCreateOrDeleteDcsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchCreateOrDeleteDcsTags);
    }

    public CompletableFuture<BatchDeleteDCSInstancesResponse> batchDeleteDCSInstancesAsync(BatchDeleteDCSInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchDeleteDCSInstances);
    }

    public CompletableFuture<CopyInstanceResponse> copyInstanceAsync(CopyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.copyInstance);
    }

    public CompletableFuture<CreateDCSInstanceResponse> createDCSInstanceAsync(CreateDCSInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createDCSInstance);
    }

    public CompletableFuture<CreateMigrationTaskResponse> createMigrationTaskAsync(CreateMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    public CompletableFuture<CreateReplicationResponse> createReplicationAsync(CreateReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createReplication);
    }

    public CompletableFuture<DeleteBackupFileResponse> deleteBackupFileAsync(DeleteBackupFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    public CompletableFuture<DeleteIpFromDomainNameResponse> deleteIpFromDomainNameAsync(DeleteIpFromDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    public CompletableFuture<DeleteMigrationTaskResponse> deleteMigrationTaskAsync(DeleteMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    public CompletableFuture<DeleteReplicationResponse> deleteReplicationAsync(DeleteReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteReplication);
    }

    public CompletableFuture<DeleteSingleDCSInstanceResponse> deleteSingleDCSInstanceAsync(DeleteSingleDCSInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteSingleDCSInstance);
    }

    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    public CompletableFuture<ListBackupFileLinksResponse> listBackupFileLinksAsync(ListBackupFileLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    public CompletableFuture<ListBackupRecordsResponse> listBackupRecordsAsync(ListBackupRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    public CompletableFuture<ListCESMonitoredObjectsResponse> listCESMonitoredObjectsAsync(ListCESMonitoredObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listCESMonitoredObjects);
    }

    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    public CompletableFuture<ListDcsTagsOfTenantResponse> listDcsTagsOfTenantAsync(ListDcsTagsOfTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listDcsTagsOfTenant);
    }

    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listFlavors);
    }

    public CompletableFuture<ListGroupReplicationInfoResponse> listGroupReplicationInfoAsync(ListGroupReplicationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    public CompletableFuture<ListMaintenanceWindowsResponse> listMaintenanceWindowsAsync(ListMaintenanceWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    public CompletableFuture<ListMigrationTaskResponse> listMigrationTaskAsync(ListMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    public CompletableFuture<ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceAsync(ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
    }

    public CompletableFuture<ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusAsync(ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    public CompletableFuture<ListRestoreRecordsResponse> listRestoreRecordsAsync(ListRestoreRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    public CompletableFuture<ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesAsync(ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    public CompletableFuture<RestartOrFlushDCSInstancesResponse> restartOrFlushDCSInstancesAsync(RestartOrFlushDCSInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.restartOrFlushDCSInstances);
    }

    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.restoreInstance);
    }

    public CompletableFuture<ShowDcsTagsResponse> showDcsTagsAsync(ShowDcsTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showDcsTags);
    }

    public CompletableFuture<ShowMigrationTaskResponse> showMigrationTaskAsync(ShowMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    public CompletableFuture<ShowQuotaOfTenantResponse> showQuotaOfTenantAsync(ShowQuotaOfTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    public CompletableFuture<StopMigrationTaskResponse> stopMigrationTaskAsync(StopMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    public CompletableFuture<UpdateConfigurationsResponse> updateConfigurationsAsync(UpdateConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    public CompletableFuture<UpdateDCSInstanceResponse> updateDCSInstanceAsync(UpdateDCSInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateDCSInstance);
    }

    public CompletableFuture<UpdatePasswordResponse> updatePasswordAsync(UpdatePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updatePassword);
    }

    public CompletableFuture<UpdateSlavePriorityResponse> updateSlavePriorityAsync(UpdateSlavePriorityRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    public CompletableFuture<ShowIpWhitelistResponse> showIpWhitelistAsync(ShowIpWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    public CompletableFuture<UpdateIpWhitelistResponse> updateIpWhitelistAsync(UpdateIpWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

}
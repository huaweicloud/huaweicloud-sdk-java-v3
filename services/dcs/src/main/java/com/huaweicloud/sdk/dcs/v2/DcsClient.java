package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.dcs.v2.model.*;

public class DcsClient {
    protected HcClient hcClient;

    public DcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsClient> newBuilder() {
        return new ClientBuilder<>(DcsClient::new);
    }

    public BatchCreateOrDeleteDcsTagsResponse batchCreateOrDeleteDcsTags(BatchCreateOrDeleteDcsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchCreateOrDeleteDcsTags);
    }

    public BatchDeleteDCSInstancesResponse batchDeleteDCSInstances(BatchDeleteDCSInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchDeleteDCSInstances);
    }

    public CopyInstanceResponse copyInstance(CopyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.copyInstance);
    }

    public CreateDCSInstanceResponse createDCSInstance(CreateDCSInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createDCSInstance);
    }

    public CreateMigrationTaskResponse createMigrationTask(CreateMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    public CreateReplicationResponse createReplication(CreateReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createReplication);
    }

    public DeleteBackupFileResponse deleteBackupFile(DeleteBackupFileRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    public DeleteIpFromDomainNameResponse deleteIpFromDomainName(DeleteIpFromDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    public DeleteMigrationTaskResponse deleteMigrationTask(DeleteMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    public DeleteReplicationResponse deleteReplication(DeleteReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteReplication);
    }

    public DeleteSingleDCSInstanceResponse deleteSingleDCSInstance(DeleteSingleDCSInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteSingleDCSInstance);
    }

    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    public ListBackupFileLinksResponse listBackupFileLinks(ListBackupFileLinksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    public ListBackupRecordsResponse listBackupRecords(ListBackupRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    public ListCESMonitoredObjectsResponse listCESMonitoredObjects(ListCESMonitoredObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listCESMonitoredObjects);
    }

    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    public ListDcsTagsOfTenantResponse listDcsTagsOfTenant(ListDcsTagsOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listDcsTagsOfTenant);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listFlavors);
    }

    public ListGroupReplicationInfoResponse listGroupReplicationInfo(ListGroupReplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    public ListMaintenanceWindowsResponse listMaintenanceWindows(ListMaintenanceWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    public ListMigrationTaskResponse listMigrationTask(ListMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    public ListMonitoredObjectsOfInstanceResponse listMonitoredObjectsOfInstance(ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
    }

    public ListNumberOfInstancesInDifferentStatusResponse listNumberOfInstancesInDifferentStatus(ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    public ListRestoreRecordsResponse listRestoreRecords(ListRestoreRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    public ListStatisticsOfRunningInstancesResponse listStatisticsOfRunningInstances(ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    public RestartOrFlushDCSInstancesResponse restartOrFlushDCSInstances(RestartOrFlushDCSInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restartOrFlushDCSInstances);
    }

    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restoreInstance);
    }

    public ShowDcsTagsResponse showDcsTags(ShowDcsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showDcsTags);
    }

    public ShowMigrationTaskResponse showMigrationTask(ShowMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    public ShowQuotaOfTenantResponse showQuotaOfTenant(ShowQuotaOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    public StopMigrationTaskResponse stopMigrationTask(StopMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    public UpdateConfigurationsResponse updateConfigurations(UpdateConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    public UpdateDCSInstanceResponse updateDCSInstance(UpdateDCSInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateDCSInstance);
    }

    public UpdatePasswordResponse updatePassword(UpdatePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updatePassword);
    }

    public UpdateSlavePriorityResponse updateSlavePriority(UpdateSlavePriorityRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    public ShowIpWhitelistResponse showIpWhitelist(ShowIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    public UpdateIpWhitelistResponse updateIpWhitelist(UpdateIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

}
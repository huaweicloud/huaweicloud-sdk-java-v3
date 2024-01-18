package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyAsyncRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyAsyncResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyResponse;
import com.huaweicloud.sdk.dcs.v2.model.CopyInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.CopyInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateAutoExpireScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateAutoExpireScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateBigkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateBigkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateHotkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateHotkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogDownloadLinkRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogDownloadLinkResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateResizeOrderRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateResizeOrderResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackgroundTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackgroundTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackupFileRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBackupFileResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBigkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteBigkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteCenterTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteCenterTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteDiagnosisTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteDiagnosisTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteHotkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteHotkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteSingleInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteSingleInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.DownloadSslCertRequest;
import com.huaweicloud.sdk.dcs.v2.model.DownloadSslCertResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExchangeInstanceIpRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExchangeInstanceIpResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteClusterSwitchoverRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteClusterSwitchoverResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteCommandMobilizationRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteCommandMobilizationResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExportExcelJobRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExportExcelJobResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExportInstancesTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExportInstancesTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListAclAccountsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListAclAccountsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListAvailableZonesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListAvailableZonesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBackgroundTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBackgroundTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupFileLinksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupFileLinksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupRecordsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBackupRecordsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListBigkeyScanTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListBigkeyScanTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListCenterTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListCenterTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigHistoriesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigHistoriesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigTemplatesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigTemplatesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListDiagnosisTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListDiagnosisTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListFlavorsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListFlavorsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListGroupReplicationInfoRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListGroupReplicationInfoResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListHotKeyScanTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListHotKeyScanTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListInstanceOperationsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListInstanceOperationsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMaintenanceWindowsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMaintenanceWindowsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMigrationTaskLogsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMigrationTaskLogsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsOfInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsOfInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListMonitoredObjectsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListNumberOfInstancesInDifferentStatusRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListNumberOfInstancesInDifferentStatusResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListRedislogRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListRedislogResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListRestoreRecordsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListRestoreRecordsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListSlowlogRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListSlowlogResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListStatisticsOfRunningInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListStatisticsOfRunningInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ListTagsOfTenantRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListTagsOfTenantResponse;
import com.huaweicloud.sdk.dcs.v2.model.LoginWebCliRequest;
import com.huaweicloud.sdk.dcs.v2.model.LoginWebCliResponse;
import com.huaweicloud.sdk.dcs.v2.model.LogoffWebCliRequest;
import com.huaweicloud.sdk.dcs.v2.model.LogoffWebCliResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResetAclAccountPassWordRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResetAclAccountPassWordResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.RestartOrFlushInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.RestartOrFlushInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ScanExpireKeyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ScanExpireKeyResponse;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBackgroundTaskProgressRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBackgroundTaskProgressResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyScanTaskDetailsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBigkeyScanTaskDetailsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowConfigHistoryDetailRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowConfigHistoryDetailResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowDiagnosisTaskDetailsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowDiagnosisTaskDetailsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowExpireAutoScanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowExpireAutoScanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowExpireKeyScanInfoRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowExpireKeyScanInfoResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyTaskDetailsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowHotkeyTaskDetailsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceSslDetailRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceSslDetailResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowIpWhitelistRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowIpWhitelistResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowJobInfoRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowJobInfoResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskStatsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowMigrationTaskStatsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowNodesInformationRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowNodesInformationResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowQuotaOfTenantRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowQuotaOfTenantResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowReplicationStatesRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowReplicationStatesResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowTagsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowTagsResponse;
import com.huaweicloud.sdk.dcs.v2.model.StartInstanceResizeCheckJobRequest;
import com.huaweicloud.sdk.dcs.v2.model.StartInstanceResizeCheckJobResponse;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskSyncRequest;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskSyncResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountPassWordRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountPassWordResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBigkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBigkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateClientIpTransparentTransmissionRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateClientIpTransparentTransmissionResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigurationsRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigurationsResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateExpireAutoScanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateExpireAutoScanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateHotkeyAutoScanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateHotkeyAutoScanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceBandwidthRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceBandwidthResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateIpWhitelistRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateIpWhitelistResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdatePasswordRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdatePasswordResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSslSwitchRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSslSwitchResponse;
import com.huaweicloud.sdk.dcs.v2.model.ValidateDeletableReplicaRequest;
import com.huaweicloud.sdk.dcs.v2.model.ValidateDeletableReplicaResponse;

public class DcsClient {

    protected HcClient hcClient;

    public DcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsClient> newBuilder() {
        ClientBuilder<DcsClient> clientBuilder = new ClientBuilder<>(DcsClient::new);
        return clientBuilder;
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定实例批量添加标签，或批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return BatchCreateOrDeleteTagsResponse
     */
    public BatchCreateOrDeleteTagsResponse batchCreateOrDeleteTags(BatchCreateOrDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定实例批量添加标签，或批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public SyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除多个缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return BatchDeleteInstancesResponse
     */
    public BatchDeleteInstancesResponse batchDeleteInstances(BatchDeleteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除多个缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public SyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesInvoker(
        BatchDeleteInstancesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量查询实例节点信息
     *
     * 批量查询指定项目所有实例的节点信息、有效实例个数及节点个数。
     * 创建中实例不返回节点信息。
     * 仅支持Redis4.0和Redis5.0实例查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowNodesInformationRequest 请求对象
     * @return BatchShowNodesInformationResponse
     */
    public BatchShowNodesInformationResponse batchShowNodesInformation(BatchShowNodesInformationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchShowNodesInformation);
    }

    /**
     * 批量查询实例节点信息
     *
     * 批量查询指定项目所有实例的节点信息、有效实例个数及节点个数。
     * 创建中实例不返回节点信息。
     * 仅支持Redis4.0和Redis5.0实例查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowNodesInformationRequest 请求对象
     * @return SyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse>
     */
    public SyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> batchShowNodesInformationInvoker(
        BatchShowNodesInformationRequest request) {
        return new SyncInvoker<>(request, DcsMeta.batchShowNodesInformation, hcClient);
    }

    /**
     * 批量停止数据迁移任务
     *
     * 批量停止数据迁移任务，接口响应成功，仅表示下发任务成功。查询到迁移任务状态为TERMINATED时，即停止成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopMigrationTasksRequest 请求对象
     * @return BatchStopMigrationTasksResponse
     */
    public BatchStopMigrationTasksResponse batchStopMigrationTasks(BatchStopMigrationTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchStopMigrationTasks);
    }

    /**
     * 批量停止数据迁移任务
     *
     * 批量停止数据迁移任务，接口响应成功，仅表示下发任务成功。查询到迁移任务状态为TERMINATED时，即停止成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopMigrationTasksRequest 请求对象
     * @return SyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse>
     */
    public SyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> batchStopMigrationTasksInvoker(
        BatchStopMigrationTasksRequest request) {
        return new SyncInvoker<>(request, DcsMeta.batchStopMigrationTasks, hcClient);
    }

    /**
     * 主备切换
     *
     * 切换实例主备节点，只有主备实例支持该操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyRequest 请求对象
     * @return ChangeMasterStandbyResponse
     */
    public ChangeMasterStandbyResponse changeMasterStandby(ChangeMasterStandbyRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.changeMasterStandby);
    }

    /**
     * 主备切换
     *
     * 切换实例主备节点，只有主备实例支持该操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyRequest 请求对象
     * @return SyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse>
     */
    public SyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandbyInvoker(
        ChangeMasterStandbyRequest request) {
        return new SyncInvoker<>(request, DcsMeta.changeMasterStandby, hcClient);
    }

    /**
     * 异步交换实例主备节点
     *
     * 异步交换实例主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyAsyncRequest 请求对象
     * @return ChangeMasterStandbyAsyncResponse
     */
    public ChangeMasterStandbyAsyncResponse changeMasterStandbyAsync(ChangeMasterStandbyAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.changeMasterStandbyAsync);
    }

    /**
     * 异步交换实例主备节点
     *
     * 异步交换实例主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyAsyncRequest 请求对象
     * @return SyncInvoker<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse>
     */
    public SyncInvoker<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse> changeMasterStandbyAsyncInvoker(
        ChangeMasterStandbyAsyncRequest request) {
        return new SyncInvoker<>(request, DcsMeta.changeMasterStandbyAsync, hcClient);
    }

    /**
     * 备份指定实例
     *
     * 备份指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyInstanceRequest 请求对象
     * @return CopyInstanceResponse
     */
    public CopyInstanceResponse copyInstance(CopyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.copyInstance);
    }

    /**
     * 备份指定实例
     *
     * 备份指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyInstanceRequest 请求对象
     * @return SyncInvoker<CopyInstanceRequest, CopyInstanceResponse>
     */
    public SyncInvoker<CopyInstanceRequest, CopyInstanceResponse> copyInstanceInvoker(CopyInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.copyInstance, hcClient);
    }

    /**
     * 创建ACL账号
     *
     * \&quot;为redis4.0/5.0实例（Cluster集群实例除外）创建权限访问账号，包含读写和只读权限。
     * 如果实例默认账号已开启免密访问，您创建的普通账号不能使用，如需使用普通账号请先关闭默认账号的免密访问。
     * 单机、主备实例默认账号的密码不能带有冒号(:)，否则无法创建普通账号。\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclAccountRequest 请求对象
     * @return CreateAclAccountResponse
     */
    public CreateAclAccountResponse createAclAccount(CreateAclAccountRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createAclAccount);
    }

    /**
     * 创建ACL账号
     *
     * \&quot;为redis4.0/5.0实例（Cluster集群实例除外）创建权限访问账号，包含读写和只读权限。
     * 如果实例默认账号已开启免密访问，您创建的普通账号不能使用，如需使用普通账号请先关闭默认账号的免密访问。
     * 单机、主备实例默认账号的密码不能带有冒号(:)，否则无法创建普通账号。\&quot;
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAclAccountRequest 请求对象
     * @return SyncInvoker<CreateAclAccountRequest, CreateAclAccountResponse>
     */
    public SyncInvoker<CreateAclAccountRequest, CreateAclAccountResponse> createAclAccountInvoker(
        CreateAclAccountRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createAclAccount, hcClient);
    }

    /**
     * 创建过期key扫描任务
     *
     * 创建过期key扫描任务（Redis 3.0 不支持过期key扫描）。
     * 过期key扫描会对键空间进行Redis的scan扫描，释放内存中已过期但是由于惰性删除机制而没有释放的内存空间。
     * 过期key扫描在主节点上执行，会对实例性能有一定的影响，建议不要在业务高峰期进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoExpireScanTaskRequest 请求对象
     * @return CreateAutoExpireScanTaskResponse
     */
    public CreateAutoExpireScanTaskResponse createAutoExpireScanTask(CreateAutoExpireScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createAutoExpireScanTask);
    }

    /**
     * 创建过期key扫描任务
     *
     * 创建过期key扫描任务（Redis 3.0 不支持过期key扫描）。
     * 过期key扫描会对键空间进行Redis的scan扫描，释放内存中已过期但是由于惰性删除机制而没有释放的内存空间。
     * 过期key扫描在主节点上执行，会对实例性能有一定的影响，建议不要在业务高峰期进行。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAutoExpireScanTaskRequest 请求对象
     * @return SyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse>
     */
    public SyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> createAutoExpireScanTaskInvoker(
        CreateAutoExpireScanTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createAutoExpireScanTask, hcClient);
    }

    /**
     * 创建大key分析任务
     *
     * 为Redis实例创建大key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBigkeyScanTaskRequest 请求对象
     * @return CreateBigkeyScanTaskResponse
     */
    public CreateBigkeyScanTaskResponse createBigkeyScanTask(CreateBigkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createBigkeyScanTask);
    }

    /**
     * 创建大key分析任务
     *
     * 为Redis实例创建大key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBigkeyScanTaskRequest 请求对象
     * @return SyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse>
     */
    public SyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTaskInvoker(
        CreateBigkeyScanTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createBigkeyScanTask, hcClient);
    }

    /**
     * 创建自定义模板
     *
     * 创建自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomTemplateRequest 请求对象
     * @return CreateCustomTemplateResponse
     */
    public CreateCustomTemplateResponse createCustomTemplate(CreateCustomTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createCustomTemplate);
    }

    /**
     * 创建自定义模板
     *
     * 创建自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomTemplateRequest 请求对象
     * @return SyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse>
     */
    public SyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse> createCustomTemplateInvoker(
        CreateCustomTemplateRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createCustomTemplate, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 诊断指定的缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CreateDiagnosisTaskResponse
     */
    public CreateDiagnosisTaskResponse createDiagnosisTask(CreateDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createDiagnosisTask);
    }

    /**
     * 创建实例诊断任务
     *
     * 诊断指定的缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public SyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskInvoker(
        CreateDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createDiagnosisTask, hcClient);
    }

    /**
     * 创建热key分析任务
     *
     * 创建热key分析任务，Redis 3.0 不支持热key分析。
     * 
     * 热key分析需要将缓存实例配置参数maxmemory-policy设置为allkeys-lfu或volatile-lfu。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotkeyScanTaskRequest 请求对象
     * @return CreateHotkeyScanTaskResponse
     */
    public CreateHotkeyScanTaskResponse createHotkeyScanTask(CreateHotkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createHotkeyScanTask);
    }

    /**
     * 创建热key分析任务
     *
     * 创建热key分析任务，Redis 3.0 不支持热key分析。
     * 
     * 热key分析需要将缓存实例配置参数maxmemory-policy设置为allkeys-lfu或volatile-lfu。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHotkeyScanTaskRequest 请求对象
     * @return SyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse>
     */
    public SyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTaskInvoker(
        CreateHotkeyScanTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createHotkeyScanTask, hcClient);
    }

    /**
     * 创建缓存实例
     *
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createInstance);
    }

    /**
     * 创建缓存实例
     *
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createInstance, hcClient);
    }

    /**
     * 创建数据迁移任务
     *
     * 创建数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMigrationTaskRequest 请求对象
     * @return CreateMigrationTaskResponse
     */
    public CreateMigrationTaskResponse createMigrationTask(CreateMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    /**
     * 创建数据迁移任务
     *
     * 创建数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMigrationTaskRequest 请求对象
     * @return SyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse>
     */
    public SyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTaskInvoker(
        CreateMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createMigrationTask, hcClient);
    }

    /**
     * 创建在线数据迁移任务
     *
     * 创建在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOnlineMigrationTaskRequest 请求对象
     * @return CreateOnlineMigrationTaskResponse
     */
    public CreateOnlineMigrationTaskResponse createOnlineMigrationTask(CreateOnlineMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createOnlineMigrationTask);
    }

    /**
     * 创建在线数据迁移任务
     *
     * 创建在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOnlineMigrationTaskRequest 请求对象
     * @return SyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse>
     */
    public SyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> createOnlineMigrationTaskInvoker(
        CreateOnlineMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createOnlineMigrationTask, hcClient);
    }

    /**
     * 采集Redis运行日志
     *
     * 采集Redis运行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogRequest 请求对象
     * @return CreateRedislogResponse
     */
    public CreateRedislogResponse createRedislog(CreateRedislogRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createRedislog);
    }

    /**
     * 采集Redis运行日志
     *
     * 采集Redis运行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogRequest 请求对象
     * @return SyncInvoker<CreateRedislogRequest, CreateRedislogResponse>
     */
    public SyncInvoker<CreateRedislogRequest, CreateRedislogResponse> createRedislogInvoker(
        CreateRedislogRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createRedislog, hcClient);
    }

    /**
     * 获取日志下载链接
     *
     * 获取日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogDownloadLinkRequest 请求对象
     * @return CreateRedislogDownloadLinkResponse
     */
    public CreateRedislogDownloadLinkResponse createRedislogDownloadLink(CreateRedislogDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createRedislogDownloadLink);
    }

    /**
     * 获取日志下载链接
     *
     * 获取日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogDownloadLinkRequest 请求对象
     * @return SyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse>
     */
    public SyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> createRedislogDownloadLinkInvoker(
        CreateRedislogDownloadLinkRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createRedislogDownloadLink, hcClient);
    }

    /**
     * 包周期实例变更规格
     *
     * 包周期实例变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResizeOrderRequest 请求对象
     * @return CreateResizeOrderResponse
     */
    public CreateResizeOrderResponse createResizeOrder(CreateResizeOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createResizeOrder);
    }

    /**
     * 包周期实例变更规格
     *
     * 包周期实例变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResizeOrderRequest 请求对象
     * @return SyncInvoker<CreateResizeOrderRequest, CreateResizeOrderResponse>
     */
    public SyncInvoker<CreateResizeOrderRequest, CreateResizeOrderResponse> createResizeOrderInvoker(
        CreateResizeOrderRequest request) {
        return new SyncInvoker<>(request, DcsMeta.createResizeOrder, hcClient);
    }

    /**
     * 删除ACL账号
     *
     * 删除所创建的ACL普通账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclAccountRequest 请求对象
     * @return DeleteAclAccountResponse
     */
    public DeleteAclAccountResponse deleteAclAccount(DeleteAclAccountRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteAclAccount);
    }

    /**
     * 删除ACL账号
     *
     * 删除所创建的ACL普通账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclAccountRequest 请求对象
     * @return SyncInvoker<DeleteAclAccountRequest, DeleteAclAccountResponse>
     */
    public SyncInvoker<DeleteAclAccountRequest, DeleteAclAccountResponse> deleteAclAccountInvoker(
        DeleteAclAccountRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteAclAccount, hcClient);
    }

    /**
     * 删除后台任务
     *
     * 删除后台任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return DeleteBackgroundTaskResponse
     */
    public DeleteBackgroundTaskResponse deleteBackgroundTask(DeleteBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务
     *
     * 删除后台任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public SyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskInvoker(
        DeleteBackgroundTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除备份文件
     *
     * 删除缓存实例已备份的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupFileRequest 请求对象
     * @return DeleteBackupFileResponse
     */
    public DeleteBackupFileResponse deleteBackupFile(DeleteBackupFileRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    /**
     * 删除备份文件
     *
     * 删除缓存实例已备份的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupFileRequest 请求对象
     * @return SyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse>
     */
    public SyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFileInvoker(
        DeleteBackupFileRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteBackupFile, hcClient);
    }

    /**
     * 删除大key分析记录
     *
     * 删除大key分析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBigkeyScanTaskRequest 请求对象
     * @return DeleteBigkeyScanTaskResponse
     */
    public DeleteBigkeyScanTaskResponse deleteBigkeyScanTask(DeleteBigkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBigkeyScanTask);
    }

    /**
     * 删除大key分析记录
     *
     * 删除大key分析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBigkeyScanTaskRequest 请求对象
     * @return SyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse>
     */
    public SyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTaskInvoker(
        DeleteBigkeyScanTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteBigkeyScanTask, hcClient);
    }

    /**
     * 删除任务中心任务
     *
     * 删除任务中心任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCenterTaskRequest 请求对象
     * @return DeleteCenterTaskResponse
     */
    public DeleteCenterTaskResponse deleteCenterTask(DeleteCenterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteCenterTask);
    }

    /**
     * 删除任务中心任务
     *
     * 删除任务中心任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCenterTaskRequest 请求对象
     * @return SyncInvoker<DeleteCenterTaskRequest, DeleteCenterTaskResponse>
     */
    public SyncInvoker<DeleteCenterTaskRequest, DeleteCenterTaskResponse> deleteCenterTaskInvoker(
        DeleteCenterTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteCenterTask, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigTemplateRequest 请求对象
     * @return DeleteConfigTemplateResponse
     */
    public DeleteConfigTemplateResponse deleteConfigTemplate(DeleteConfigTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteConfigTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigTemplateRequest 请求对象
     * @return SyncInvoker<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse>
     */
    public SyncInvoker<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> deleteConfigTemplateInvoker(
        DeleteConfigTemplateRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteConfigTemplate, hcClient);
    }

    /**
     * 删除诊断记录
     *
     * 删除诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDiagnosisTaskRequest 请求对象
     * @return DeleteDiagnosisTaskResponse
     */
    public DeleteDiagnosisTaskResponse deleteDiagnosisTask(DeleteDiagnosisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteDiagnosisTask);
    }

    /**
     * 删除诊断记录
     *
     * 删除诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDiagnosisTaskRequest 请求对象
     * @return SyncInvoker<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse>
     */
    public SyncInvoker<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse> deleteDiagnosisTaskInvoker(
        DeleteDiagnosisTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteDiagnosisTask, hcClient);
    }

    /**
     * 删除热key分析任务
     *
     * 删除热key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotkeyScanTaskRequest 请求对象
     * @return DeleteHotkeyScanTaskResponse
     */
    public DeleteHotkeyScanTaskResponse deleteHotkeyScanTask(DeleteHotkeyScanTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteHotkeyScanTask);
    }

    /**
     * 删除热key分析任务
     *
     * 删除热key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotkeyScanTaskRequest 请求对象
     * @return SyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse>
     */
    public SyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTaskInvoker(
        DeleteHotkeyScanTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteHotkeyScanTask, hcClient);
    }

    /**
     * 域名摘除IP
     *
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpFromDomainNameRequest 请求对象
     * @return DeleteIpFromDomainNameResponse
     */
    public DeleteIpFromDomainNameResponse deleteIpFromDomainName(DeleteIpFromDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    /**
     * 域名摘除IP
     *
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpFromDomainNameRequest 请求对象
     * @return SyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse>
     */
    public SyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainNameInvoker(
        DeleteIpFromDomainNameRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteIpFromDomainName, hcClient);
    }

    /**
     * 删除数据迁移任务
     *
     * 删除数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMigrationTaskRequest 请求对象
     * @return DeleteMigrationTaskResponse
     */
    public DeleteMigrationTaskResponse deleteMigrationTask(DeleteMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    /**
     * 删除数据迁移任务
     *
     * 删除数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMigrationTaskRequest 请求对象
     * @return SyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse>
     */
    public SyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTaskInvoker(
        DeleteMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteMigrationTask, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除指定的缓存实例，释放该实例的所有资源。
     * 
     * &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSingleInstanceRequest 请求对象
     * @return DeleteSingleInstanceResponse
     */
    public DeleteSingleInstanceResponse deleteSingleInstance(DeleteSingleInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteSingleInstance);
    }

    /**
     * 删除实例
     *
     * 删除指定的缓存实例，释放该实例的所有资源。
     * 
     * &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSingleInstanceRequest 请求对象
     * @return SyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse>
     */
    public SyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstanceInvoker(
        DeleteSingleInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.deleteSingleInstance, hcClient);
    }

    /**
     * 下载实例SSL证书
     *
     * 下载实例SSL证书。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSslCertRequest 请求对象
     * @return DownloadSslCertResponse
     */
    public DownloadSslCertResponse downloadSslCert(DownloadSslCertRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.downloadSslCert);
    }

    /**
     * 下载实例SSL证书
     *
     * 下载实例SSL证书。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSslCertRequest 请求对象
     * @return SyncInvoker<DownloadSslCertRequest, DownloadSslCertResponse>
     */
    public SyncInvoker<DownloadSslCertRequest, DownloadSslCertResponse> downloadSslCertInvoker(
        DownloadSslCertRequest request) {
        return new SyncInvoker<>(request, DcsMeta.downloadSslCert, hcClient);
    }

    /**
     * 进行IP交换
     *
     * 进行IP交换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExchangeInstanceIpRequest 请求对象
     * @return ExchangeInstanceIpResponse
     */
    public ExchangeInstanceIpResponse exchangeInstanceIp(ExchangeInstanceIpRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.exchangeInstanceIp);
    }

    /**
     * 进行IP交换
     *
     * 进行IP交换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExchangeInstanceIpRequest 请求对象
     * @return SyncInvoker<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse>
     */
    public SyncInvoker<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse> exchangeInstanceIpInvoker(
        ExchangeInstanceIpRequest request) {
        return new SyncInvoker<>(request, DcsMeta.exchangeInstanceIp, hcClient);
    }

    /**
     * 集群分片倒换
     *
     * 集群分片倒换，适用于proxy和cluster实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterSwitchoverRequest 请求对象
     * @return ExecuteClusterSwitchoverResponse
     */
    public ExecuteClusterSwitchoverResponse executeClusterSwitchover(ExecuteClusterSwitchoverRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.executeClusterSwitchover);
    }

    /**
     * 集群分片倒换
     *
     * 集群分片倒换，适用于proxy和cluster实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterSwitchoverRequest 请求对象
     * @return SyncInvoker<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse>
     */
    public SyncInvoker<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> executeClusterSwitchoverInvoker(
        ExecuteClusterSwitchoverRequest request) {
        return new SyncInvoker<>(request, DcsMeta.executeClusterSwitchover, hcClient);
    }

    /**
     * 执行web-cli命令V2接口
     *
     * 登入web-cli，执行redis命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCommandMobilizationRequest 请求对象
     * @return ExecuteCommandMobilizationResponse
     */
    public ExecuteCommandMobilizationResponse executeCommandMobilization(ExecuteCommandMobilizationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.executeCommandMobilization);
    }

    /**
     * 执行web-cli命令V2接口
     *
     * 登入web-cli，执行redis命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCommandMobilizationRequest 请求对象
     * @return SyncInvoker<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse>
     */
    public SyncInvoker<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse> executeCommandMobilizationInvoker(
        ExecuteCommandMobilizationRequest request) {
        return new SyncInvoker<>(request, DcsMeta.executeCommandMobilization, hcClient);
    }

    /**
     * 查询实例列表导出任务详情
     *
     * 查询实例列表导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportExcelJobRequest 请求对象
     * @return ExportExcelJobResponse
     */
    public ExportExcelJobResponse exportExcelJob(ExportExcelJobRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.exportExcelJob);
    }

    /**
     * 查询实例列表导出任务详情
     *
     * 查询实例列表导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportExcelJobRequest 请求对象
     * @return SyncInvoker<ExportExcelJobRequest, ExportExcelJobResponse>
     */
    public SyncInvoker<ExportExcelJobRequest, ExportExcelJobResponse> exportExcelJobInvoker(
        ExportExcelJobRequest request) {
        return new SyncInvoker<>(request, DcsMeta.exportExcelJob, hcClient);
    }

    /**
     * 异步导出实例资源
     *
     * 异步导出实例资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstancesTaskRequest 请求对象
     * @return ExportInstancesTaskResponse
     */
    public ExportInstancesTaskResponse exportInstancesTask(ExportInstancesTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.exportInstancesTask);
    }

    /**
     * 异步导出实例资源
     *
     * 异步导出实例资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstancesTaskRequest 请求对象
     * @return SyncInvoker<ExportInstancesTaskRequest, ExportInstancesTaskResponse>
     */
    public SyncInvoker<ExportInstancesTaskRequest, ExportInstancesTaskResponse> exportInstancesTaskInvoker(
        ExportInstancesTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.exportInstancesTask, hcClient);
    }

    /**
     * 查询ACL账户列表
     *
     * 查询ACL账户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclAccountsRequest 请求对象
     * @return ListAclAccountsResponse
     */
    public ListAclAccountsResponse listAclAccounts(ListAclAccountsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listAclAccounts);
    }

    /**
     * 查询ACL账户列表
     *
     * 查询ACL账户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclAccountsRequest 请求对象
     * @return SyncInvoker<ListAclAccountsRequest, ListAclAccountsResponse>
     */
    public SyncInvoker<ListAclAccountsRequest, ListAclAccountsResponse> listAclAccountsInvoker(
        ListAclAccountsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listAclAccounts, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询所在局点的可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
     */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 查询所在局点的可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public SyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesInvoker(
        ListAvailableZonesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询后台任务列表
     *
     * 查询后台任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTaskRequest 请求对象
     * @return ListBackgroundTaskResponse
     */
    public ListBackgroundTaskResponse listBackgroundTask(ListBackgroundTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackgroundTask);
    }

    /**
     * 查询后台任务列表
     *
     * 查询后台任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTaskRequest 请求对象
     * @return SyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse>
     */
    public SyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTaskInvoker(
        ListBackgroundTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listBackgroundTask, hcClient);
    }

    /**
     * 获取备份文件下载链接
     *
     * 获取指定实例的备份文件下载链接，下载备份文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupFileLinksRequest 请求对象
     * @return ListBackupFileLinksResponse
     */
    public ListBackupFileLinksResponse listBackupFileLinks(ListBackupFileLinksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    /**
     * 获取备份文件下载链接
     *
     * 获取指定实例的备份文件下载链接，下载备份文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupFileLinksRequest 请求对象
     * @return SyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse>
     */
    public SyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinksInvoker(
        ListBackupFileLinksRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listBackupFileLinks, hcClient);
    }

    /**
     * 查询实例备份信息
     *
     * 查询指定缓存实例的备份信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupRecordsRequest 请求对象
     * @return ListBackupRecordsResponse
     */
    public ListBackupRecordsResponse listBackupRecords(ListBackupRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    /**
     * 查询实例备份信息
     *
     * 查询指定缓存实例的备份信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupRecordsRequest 请求对象
     * @return SyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse>
     */
    public SyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecordsInvoker(
        ListBackupRecordsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listBackupRecords, hcClient);
    }

    /**
     * 查询大key分析任务列表
     *
     * 查询大key分析任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBigkeyScanTasksRequest 请求对象
     * @return ListBigkeyScanTasksResponse
     */
    public ListBigkeyScanTasksResponse listBigkeyScanTasks(ListBigkeyScanTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBigkeyScanTasks);
    }

    /**
     * 查询大key分析任务列表
     *
     * 查询大key分析任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBigkeyScanTasksRequest 请求对象
     * @return SyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse>
     */
    public SyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasksInvoker(
        ListBigkeyScanTasksRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listBigkeyScanTasks, hcClient);
    }

    /**
     * 查询任务中心任务列表
     *
     * 查询任务中心任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCenterTaskRequest 请求对象
     * @return ListCenterTaskResponse
     */
    public ListCenterTaskResponse listCenterTask(ListCenterTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listCenterTask);
    }

    /**
     * 查询任务中心任务列表
     *
     * 查询任务中心任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCenterTaskRequest 请求对象
     * @return SyncInvoker<ListCenterTaskRequest, ListCenterTaskResponse>
     */
    public SyncInvoker<ListCenterTaskRequest, ListCenterTaskResponse> listCenterTaskInvoker(
        ListCenterTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listCenterTask, hcClient);
    }

    /**
     * 查询实例参数修改记录列表
     *
     * 查询实例的参数修改记录列表，支持按照关键字查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigHistoriesRequest 请求对象
     * @return ListConfigHistoriesResponse
     */
    public ListConfigHistoriesResponse listConfigHistories(ListConfigHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listConfigHistories);
    }

    /**
     * 查询实例参数修改记录列表
     *
     * 查询实例的参数修改记录列表，支持按照关键字查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigHistoriesRequest 请求对象
     * @return SyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse>
     */
    public SyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse> listConfigHistoriesInvoker(
        ListConfigHistoriesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listConfigHistories, hcClient);
    }

    /**
     * 查询参数模板列表
     *
     * 查询租户的参数模板列表，支持按照条件查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigTemplatesRequest 请求对象
     * @return ListConfigTemplatesResponse
     */
    public ListConfigTemplatesResponse listConfigTemplates(ListConfigTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listConfigTemplates);
    }

    /**
     * 查询参数模板列表
     *
     * 查询租户的参数模板列表，支持按照条件查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigTemplatesRequest 请求对象
     * @return SyncInvoker<ListConfigTemplatesRequest, ListConfigTemplatesResponse>
     */
    public SyncInvoker<ListConfigTemplatesRequest, ListConfigTemplatesResponse> listConfigTemplatesInvoker(
        ListConfigTemplatesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listConfigTemplates, hcClient);
    }

    /**
     * 查询实例配置参数
     *
     * 查询指定实例的配置参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    /**
     * 查询实例配置参数
     *
     * 查询指定实例的配置参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询实例诊断任务列表
     *
     * 查询指定缓存实例诊断任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return ListDiagnosisTasksResponse
     */
    public ListDiagnosisTasksResponse listDiagnosisTasks(ListDiagnosisTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listDiagnosisTasks);
    }

    /**
     * 查询实例诊断任务列表
     *
     * 查询指定缓存实例诊断任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return SyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse>
     */
    public SyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasksInvoker(
        ListDiagnosisTasksRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listDiagnosisTasks, hcClient);
    }

    /**
     * 查询产品规格
     *
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listFlavors);
    }

    /**
     * 查询产品规格
     *
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询分片信息
     *
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupReplicationInfoRequest 请求对象
     * @return ListGroupReplicationInfoResponse
     */
    public ListGroupReplicationInfoResponse listGroupReplicationInfo(ListGroupReplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    /**
     * 查询分片信息
     *
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupReplicationInfoRequest 请求对象
     * @return SyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse>
     */
    public SyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfoInvoker(
        ListGroupReplicationInfoRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listGroupReplicationInfo, hcClient);
    }

    /**
     * 查询热key分析任务列表
     *
     * 查询热key分析历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotKeyScanTasksRequest 请求对象
     * @return ListHotKeyScanTasksResponse
     */
    public ListHotKeyScanTasksResponse listHotKeyScanTasks(ListHotKeyScanTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listHotKeyScanTasks);
    }

    /**
     * 查询热key分析任务列表
     *
     * 查询热key分析历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotKeyScanTasksRequest 请求对象
     * @return SyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse>
     */
    public SyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasksInvoker(
        ListHotKeyScanTasksRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listHotKeyScanTasks, hcClient);
    }

    /**
     * 查询实例是否可以扩容
     *
     * 查询实例是否可以扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceOperationsRequest 请求对象
     * @return ListInstanceOperationsResponse
     */
    public ListInstanceOperationsResponse listInstanceOperations(ListInstanceOperationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listInstanceOperations);
    }

    /**
     * 查询实例是否可以扩容
     *
     * 查询实例是否可以扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceOperationsRequest 请求对象
     * @return SyncInvoker<ListInstanceOperationsRequest, ListInstanceOperationsResponse>
     */
    public SyncInvoker<ListInstanceOperationsRequest, ListInstanceOperationsResponse> listInstanceOperationsInvoker(
        ListInstanceOperationsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listInstanceOperations, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的缓存实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的缓存实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listInstances, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMaintenanceWindowsRequest 请求对象
     * @return ListMaintenanceWindowsResponse
     */
    public ListMaintenanceWindowsResponse listMaintenanceWindows(ListMaintenanceWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMaintenanceWindowsRequest 请求对象
     * @return SyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
     */
    public SyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindowsInvoker(
        ListMaintenanceWindowsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listMaintenanceWindows, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskRequest 请求对象
     * @return ListMigrationTaskResponse
     */
    public ListMigrationTaskResponse listMigrationTask(ListMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskRequest 请求对象
     * @return SyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse>
     */
    public SyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTaskInvoker(
        ListMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listMigrationTask, hcClient);
    }

    /**
     * 查询迁移日志列表
     *
     * 查询迁移日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskLogsRequest 请求对象
     * @return ListMigrationTaskLogsResponse
     */
    public ListMigrationTaskLogsResponse listMigrationTaskLogs(ListMigrationTaskLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMigrationTaskLogs);
    }

    /**
     * 查询迁移日志列表
     *
     * 查询迁移日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskLogsRequest 请求对象
     * @return SyncInvoker<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse>
     */
    public SyncInvoker<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse> listMigrationTaskLogsInvoker(
        ListMigrationTaskLogsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listMigrationTaskLogs, hcClient);
    }

    /**
     * 查询主维度信息列表
     *
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitoredObjectsRequest 请求对象
     * @return ListMonitoredObjectsResponse
     */
    public ListMonitoredObjectsResponse listMonitoredObjects(ListMonitoredObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMonitoredObjects);
    }

    /**
     * 查询主维度信息列表
     *
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitoredObjectsRequest 请求对象
     * @return SyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse>
     */
    public SyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjectsInvoker(
        ListMonitoredObjectsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listMonitoredObjects, hcClient);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     *
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return ListMonitoredObjectsOfInstanceResponse
     */
    public ListMonitoredObjectsOfInstanceResponse listMonitoredObjectsOfInstance(
        ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     *
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id
     * &gt; 该接口当前仅在中国华南区开放。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return SyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse>
     */
    public SyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceInvoker(
        ListMonitoredObjectsOfInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listMonitoredObjectsOfInstance, hcClient);
    }

    /**
     * 查询实例状态
     *
     * 查询该租户在当前区域下不同状态的实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return ListNumberOfInstancesInDifferentStatusResponse
     */
    public ListNumberOfInstancesInDifferentStatusResponse listNumberOfInstancesInDifferentStatus(
        ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    /**
     * 查询实例状态
     *
     * 查询该租户在当前区域下不同状态的实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return SyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse>
     */
    public SyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusInvoker(
        ListNumberOfInstancesInDifferentStatusRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listNumberOfInstancesInDifferentStatus, hcClient);
    }

    /**
     * 查询Redis运行日志列表
     *
     * 查询Redis运行日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedislogRequest 请求对象
     * @return ListRedislogResponse
     */
    public ListRedislogResponse listRedislog(ListRedislogRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listRedislog);
    }

    /**
     * 查询Redis运行日志列表
     *
     * 查询Redis运行日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedislogRequest 请求对象
     * @return SyncInvoker<ListRedislogRequest, ListRedislogResponse>
     */
    public SyncInvoker<ListRedislogRequest, ListRedislogResponse> listRedislogInvoker(ListRedislogRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listRedislog, hcClient);
    }

    /**
     * 查询实例恢复记录
     *
     * 查询指定缓存实例的恢复记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreRecordsRequest 请求对象
     * @return ListRestoreRecordsResponse
     */
    public ListRestoreRecordsResponse listRestoreRecords(ListRestoreRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    /**
     * 查询实例恢复记录
     *
     * 查询指定缓存实例的恢复记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreRecordsRequest 请求对象
     * @return SyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse>
     */
    public SyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecordsInvoker(
        ListRestoreRecordsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listRestoreRecords, hcClient);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogRequest 请求对象
     * @return ListSlowlogResponse
     */
    public ListSlowlogResponse listSlowlog(ListSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listSlowlog);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogRequest 请求对象
     * @return SyncInvoker<ListSlowlogRequest, ListSlowlogResponse>
     */
    public SyncInvoker<ListSlowlogRequest, ListSlowlogResponse> listSlowlogInvoker(ListSlowlogRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listSlowlog, hcClient);
    }

    /**
     * 查询运行中实例的统计信息
     *
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsOfRunningInstancesRequest 请求对象
     * @return ListStatisticsOfRunningInstancesResponse
     */
    public ListStatisticsOfRunningInstancesResponse listStatisticsOfRunningInstances(
        ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    /**
     * 查询运行中实例的统计信息
     *
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsOfRunningInstancesRequest 请求对象
     * @return SyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse>
     */
    public SyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesInvoker(
        ListStatisticsOfRunningInstancesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listStatisticsOfRunningInstances, hcClient);
    }

    /**
     * 查询租户所有标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsOfTenantRequest 请求对象
     * @return ListTagsOfTenantResponse
     */
    public ListTagsOfTenantResponse listTagsOfTenant(ListTagsOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listTagsOfTenant);
    }

    /**
     * 查询租户所有标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsOfTenantRequest 请求对象
     * @return SyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse>
     */
    public SyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenantInvoker(
        ListTagsOfTenantRequest request) {
        return new SyncInvoker<>(request, DcsMeta.listTagsOfTenant, hcClient);
    }

    /**
     * 登录webCli
     *
     * 登录webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginWebCliRequest 请求对象
     * @return LoginWebCliResponse
     */
    public LoginWebCliResponse loginWebCli(LoginWebCliRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.loginWebCli);
    }

    /**
     * 登录webCli
     *
     * 登录webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginWebCliRequest 请求对象
     * @return SyncInvoker<LoginWebCliRequest, LoginWebCliResponse>
     */
    public SyncInvoker<LoginWebCliRequest, LoginWebCliResponse> loginWebCliInvoker(LoginWebCliRequest request) {
        return new SyncInvoker<>(request, DcsMeta.loginWebCli, hcClient);
    }

    /**
     * 登出webCli
     *
     * 登出webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffWebCliRequest 请求对象
     * @return LogoffWebCliResponse
     */
    public LogoffWebCliResponse logoffWebCli(LogoffWebCliRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.logoffWebCli);
    }

    /**
     * 登出webCli
     *
     * 登出webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffWebCliRequest 请求对象
     * @return SyncInvoker<LogoffWebCliRequest, LogoffWebCliResponse>
     */
    public SyncInvoker<LogoffWebCliRequest, LogoffWebCliResponse> logoffWebCliInvoker(LogoffWebCliRequest request) {
        return new SyncInvoker<>(request, DcsMeta.logoffWebCli, hcClient);
    }

    /**
     * 重置ACL账号密码
     *
     * 重置ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAclAccountPassWordRequest 请求对象
     * @return ResetAclAccountPassWordResponse
     */
    public ResetAclAccountPassWordResponse resetAclAccountPassWord(ResetAclAccountPassWordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.resetAclAccountPassWord);
    }

    /**
     * 重置ACL账号密码
     *
     * 重置ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAclAccountPassWordRequest 请求对象
     * @return SyncInvoker<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse>
     */
    public SyncInvoker<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> resetAclAccountPassWordInvoker(
        ResetAclAccountPassWordRequest request) {
        return new SyncInvoker<>(request, DcsMeta.resetAclAccountPassWord, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, DcsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 用户可以为状态为“运行中”的DCS缓存实例进行规格变更，当前仅能支持按需实例的同副本或分片数量的实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 用户可以为状态为“运行中”的DCS缓存实例进行规格变更，当前仅能支持按需实例的同副本或分片数量的实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.resizeInstance, hcClient);
    }

    /**
     * 重启实例或清空数据
     *
     * 重启运行中的DCS缓存实例。
     * 
     * 清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartOrFlushInstancesRequest 请求对象
     * @return RestartOrFlushInstancesResponse
     */
    public RestartOrFlushInstancesResponse restartOrFlushInstances(RestartOrFlushInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restartOrFlushInstances);
    }

    /**
     * 重启实例或清空数据
     *
     * 重启运行中的DCS缓存实例。
     * 
     * 清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartOrFlushInstancesRequest 请求对象
     * @return SyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse>
     */
    public SyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstancesInvoker(
        RestartOrFlushInstancesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.restartOrFlushInstances, hcClient);
    }

    /**
     * 恢复指定实例
     *
     * 恢复指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restoreInstance);
    }

    /**
     * 恢复指定实例
     *
     * 恢复指定的缓存实例。
     * &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceInvoker(
        RestoreInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.restoreInstance, hcClient);
    }

    /**
     * 立刻扫描过期Key
     *
     * 立刻扫描过期Key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanExpireKeyRequest 请求对象
     * @return ScanExpireKeyResponse
     */
    public ScanExpireKeyResponse scanExpireKey(ScanExpireKeyRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.scanExpireKey);
    }

    /**
     * 立刻扫描过期Key
     *
     * 立刻扫描过期Key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanExpireKeyRequest 请求对象
     * @return SyncInvoker<ScanExpireKeyRequest, ScanExpireKeyResponse>
     */
    public SyncInvoker<ScanExpireKeyRequest, ScanExpireKeyResponse> scanExpireKeyInvoker(ScanExpireKeyRequest request) {
        return new SyncInvoker<>(request, DcsMeta.scanExpireKey, hcClient);
    }

    /**
     * 配置在线数据迁移任务
     *
     * 配置在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetOnlineMigrationTaskRequest 请求对象
     * @return SetOnlineMigrationTaskResponse
     */
    public SetOnlineMigrationTaskResponse setOnlineMigrationTask(SetOnlineMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.setOnlineMigrationTask);
    }

    /**
     * 配置在线数据迁移任务
     *
     * 配置在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetOnlineMigrationTaskRequest 请求对象
     * @return SyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse>
     */
    public SyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> setOnlineMigrationTaskInvoker(
        SetOnlineMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.setOnlineMigrationTask, hcClient);
    }

    /**
     * 查询后台任务详细信息
     *
     * 查询后台任务详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return ShowBackgroundTaskProgressResponse
     */
    public ShowBackgroundTaskProgressResponse showBackgroundTaskProgress(ShowBackgroundTaskProgressRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showBackgroundTaskProgress);
    }

    /**
     * 查询后台任务详细信息
     *
     * 查询后台任务详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return SyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse>
     */
    public SyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressInvoker(
        ShowBackgroundTaskProgressRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showBackgroundTaskProgress, hcClient);
    }

    /**
     * 查询大key自动分析配置
     *
     * 查询大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyAutoscanConfigRequest 请求对象
     * @return ShowBigkeyAutoscanConfigResponse
     */
    public ShowBigkeyAutoscanConfigResponse showBigkeyAutoscanConfig(ShowBigkeyAutoscanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showBigkeyAutoscanConfig);
    }

    /**
     * 查询大key自动分析配置
     *
     * 查询大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyAutoscanConfigRequest 请求对象
     * @return SyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse>
     */
    public SyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfigInvoker(
        ShowBigkeyAutoscanConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询大key分析详情
     *
     * 查询大key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return ShowBigkeyScanTaskDetailsResponse
     */
    public ShowBigkeyScanTaskDetailsResponse showBigkeyScanTaskDetails(ShowBigkeyScanTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showBigkeyScanTaskDetails);
    }

    /**
     * 查询大key分析详情
     *
     * 查询大key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse>
     */
    public SyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetailsInvoker(
        ShowBigkeyScanTaskDetailsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showBigkeyScanTaskDetails, hcClient);
    }

    /**
     * 查询实例参数修改记录详情
     *
     * 查询实例参数修改记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigHistoryDetailRequest 请求对象
     * @return ShowConfigHistoryDetailResponse
     */
    public ShowConfigHistoryDetailResponse showConfigHistoryDetail(ShowConfigHistoryDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showConfigHistoryDetail);
    }

    /**
     * 查询实例参数修改记录详情
     *
     * 查询实例参数修改记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigHistoryDetailRequest 请求对象
     * @return SyncInvoker<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse>
     */
    public SyncInvoker<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse> showConfigHistoryDetailInvoker(
        ShowConfigHistoryDetailRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showConfigHistoryDetail, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 查询参数模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigTemplateRequest 请求对象
     * @return ShowConfigTemplateResponse
     */
    public ShowConfigTemplateResponse showConfigTemplate(ShowConfigTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showConfigTemplate);
    }

    /**
     * 查询参数模板详情
     *
     * 查询参数模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigTemplateRequest 请求对象
     * @return SyncInvoker<ShowConfigTemplateRequest, ShowConfigTemplateResponse>
     */
    public SyncInvoker<ShowConfigTemplateRequest, ShowConfigTemplateResponse> showConfigTemplateInvoker(
        ShowConfigTemplateRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showConfigTemplate, hcClient);
    }

    /**
     * 查询指定诊断报告
     *
     * 通过报告ID查询诊断报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskDetailsRequest 请求对象
     * @return ShowDiagnosisTaskDetailsResponse
     */
    public ShowDiagnosisTaskDetailsResponse showDiagnosisTaskDetails(ShowDiagnosisTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showDiagnosisTaskDetails);
    }

    /**
     * 查询指定诊断报告
     *
     * 通过报告ID查询诊断报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse>
     */
    public SyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetailsInvoker(
        ShowDiagnosisTaskDetailsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showDiagnosisTaskDetails, hcClient);
    }

    /**
     * 查询自动扫描配置
     *
     * 查询自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireAutoScanConfigRequest 请求对象
     * @return ShowExpireAutoScanConfigResponse
     */
    public ShowExpireAutoScanConfigResponse showExpireAutoScanConfig(ShowExpireAutoScanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showExpireAutoScanConfig);
    }

    /**
     * 查询自动扫描配置
     *
     * 查询自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireAutoScanConfigRequest 请求对象
     * @return SyncInvoker<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse>
     */
    public SyncInvoker<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse> showExpireAutoScanConfigInvoker(
        ShowExpireAutoScanConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showExpireAutoScanConfig, hcClient);
    }

    /**
     * 查询过期Key扫描记录
     *
     * 查询过期Key扫描记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireKeyScanInfoRequest 请求对象
     * @return ShowExpireKeyScanInfoResponse
     */
    public ShowExpireKeyScanInfoResponse showExpireKeyScanInfo(ShowExpireKeyScanInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showExpireKeyScanInfo);
    }

    /**
     * 查询过期Key扫描记录
     *
     * 查询过期Key扫描记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireKeyScanInfoRequest 请求对象
     * @return SyncInvoker<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse>
     */
    public SyncInvoker<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse> showExpireKeyScanInfoInvoker(
        ShowExpireKeyScanInfoRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showExpireKeyScanInfo, hcClient);
    }

    /**
     * 查询热key自动分析配置
     *
     * 查询热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyAutoscanConfigRequest 请求对象
     * @return ShowHotkeyAutoscanConfigResponse
     */
    public ShowHotkeyAutoscanConfigResponse showHotkeyAutoscanConfig(ShowHotkeyAutoscanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showHotkeyAutoscanConfig);
    }

    /**
     * 查询热key自动分析配置
     *
     * 查询热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyAutoscanConfigRequest 请求对象
     * @return SyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse>
     */
    public SyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfigInvoker(
        ShowHotkeyAutoscanConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showHotkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询热key分析详情
     *
     * 查询热key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyTaskDetailsRequest 请求对象
     * @return ShowHotkeyTaskDetailsResponse
     */
    public ShowHotkeyTaskDetailsResponse showHotkeyTaskDetails(ShowHotkeyTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showHotkeyTaskDetails);
    }

    /**
     * 查询热key分析详情
     *
     * 查询热key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse>
     */
    public SyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetailsInvoker(
        ShowHotkeyTaskDetailsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showHotkeyTaskDetails, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 通过实例ID查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 通过实例ID查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showInstance, hcClient);
    }

    /**
     * 查询实例SSL信息
     *
     * 查询实例SSL信息。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSslDetailRequest 请求对象
     * @return ShowInstanceSslDetailResponse
     */
    public ShowInstanceSslDetailResponse showInstanceSslDetail(ShowInstanceSslDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showInstanceSslDetail);
    }

    /**
     * 查询实例SSL信息
     *
     * 查询实例SSL信息。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSslDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse>
     */
    public SyncInvoker<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse> showInstanceSslDetailInvoker(
        ShowInstanceSslDetailRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showInstanceSslDetail, hcClient);
    }

    /**
     * 查询租户Job执行结果
     *
     * 查询租户Job执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return ShowJobInfoResponse
     */
    public ShowJobInfoResponse showJobInfo(ShowJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showJobInfo);
    }

    /**
     * 查询租户Job执行结果
     *
     * 查询租户Job执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return SyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>
     */
    public SyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfoInvoker(ShowJobInfoRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showJobInfo, hcClient);
    }

    /**
     * 查询迁移任务详情
     *
     * 查询迁移任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskRequest 请求对象
     * @return ShowMigrationTaskResponse
     */
    public ShowMigrationTaskResponse showMigrationTask(ShowMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    /**
     * 查询迁移任务详情
     *
     * 查询迁移任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskRequest 请求对象
     * @return SyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse>
     */
    public SyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTaskInvoker(
        ShowMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showMigrationTask, hcClient);
    }

    /**
     * 查询在线迁移进度明细
     *
     * 查询在线迁移进度明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskStatsRequest 请求对象
     * @return ShowMigrationTaskStatsResponse
     */
    public ShowMigrationTaskStatsResponse showMigrationTaskStats(ShowMigrationTaskStatsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showMigrationTaskStats);
    }

    /**
     * 查询在线迁移进度明细
     *
     * 查询在线迁移进度明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskStatsRequest 请求对象
     * @return SyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse>
     */
    public SyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStatsInvoker(
        ShowMigrationTaskStatsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showMigrationTaskStats, hcClient);
    }

    /**
     * 查询实例节点信息
     *
     * 查询指定实例的节点信息。
     * 仅支持Redis4.0和Redis5.0实例查询。
     * 创建中实例不返回节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodesInformationRequest 请求对象
     * @return ShowNodesInformationResponse
     */
    public ShowNodesInformationResponse showNodesInformation(ShowNodesInformationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showNodesInformation);
    }

    /**
     * 查询实例节点信息
     *
     * 查询指定实例的节点信息。
     * 仅支持Redis4.0和Redis5.0实例查询。
     * 创建中实例不返回节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNodesInformationRequest 请求对象
     * @return SyncInvoker<ShowNodesInformationRequest, ShowNodesInformationResponse>
     */
    public SyncInvoker<ShowNodesInformationRequest, ShowNodesInformationResponse> showNodesInformationInvoker(
        ShowNodesInformationRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showNodesInformation, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaOfTenantRequest 请求对象
     * @return ShowQuotaOfTenantResponse
     */
    public ShowQuotaOfTenantResponse showQuotaOfTenant(ShowQuotaOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    /**
     * 查询租户配额
     *
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaOfTenantRequest 请求对象
     * @return SyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse>
     */
    public SyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenantInvoker(
        ShowQuotaOfTenantRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showQuotaOfTenant, hcClient);
    }

    /**
     * 获取副本状态
     *
     * 获取副本状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationStatesRequest 请求对象
     * @return ShowReplicationStatesResponse
     */
    public ShowReplicationStatesResponse showReplicationStates(ShowReplicationStatesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showReplicationStates);
    }

    /**
     * 获取副本状态
     *
     * 获取副本状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationStatesRequest 请求对象
     * @return SyncInvoker<ShowReplicationStatesRequest, ShowReplicationStatesResponse>
     */
    public SyncInvoker<ShowReplicationStatesRequest, ShowReplicationStatesResponse> showReplicationStatesInvoker(
        ShowReplicationStatesRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showReplicationStates, hcClient);
    }

    /**
     * 查询单个实例标签
     *
     * 通过实例ID查询标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return ShowTagsResponse
     */
    public ShowTagsResponse showTags(ShowTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showTags);
    }

    /**
     * 查询单个实例标签
     *
     * 通过实例ID查询标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return SyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public SyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsInvoker(ShowTagsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showTags, hcClient);
    }

    /**
     * 提交前置检查任务
     *
     * 提交前置检查任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceResizeCheckJobRequest 请求对象
     * @return StartInstanceResizeCheckJobResponse
     */
    public StartInstanceResizeCheckJobResponse startInstanceResizeCheckJob(StartInstanceResizeCheckJobRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.startInstanceResizeCheckJob);
    }

    /**
     * 提交前置检查任务
     *
     * 提交前置检查任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceResizeCheckJobRequest 请求对象
     * @return SyncInvoker<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse>
     */
    public SyncInvoker<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse> startInstanceResizeCheckJobInvoker(
        StartInstanceResizeCheckJobRequest request) {
        return new SyncInvoker<>(request, DcsMeta.startInstanceResizeCheckJob, hcClient);
    }

    /**
     * 停止数据迁移任务
     *
     * 停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskRequest 请求对象
     * @return StopMigrationTaskResponse
     */
    public StopMigrationTaskResponse stopMigrationTask(StopMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    /**
     * 停止数据迁移任务
     *
     * 停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskRequest 请求对象
     * @return SyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse>
     */
    public SyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTaskInvoker(
        StopMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.stopMigrationTask, hcClient);
    }

    /**
     * 同步停止数据迁移任务
     *
     * 同步停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskSyncRequest 请求对象
     * @return StopMigrationTaskSyncResponse
     */
    public StopMigrationTaskSyncResponse stopMigrationTaskSync(StopMigrationTaskSyncRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.stopMigrationTaskSync);
    }

    /**
     * 同步停止数据迁移任务
     *
     * 同步停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskSyncRequest 请求对象
     * @return SyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse>
     */
    public SyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> stopMigrationTaskSyncInvoker(
        StopMigrationTaskSyncRequest request) {
        return new SyncInvoker<>(request, DcsMeta.stopMigrationTaskSync, hcClient);
    }

    /**
     * 修改ACL角色
     *
     * 修改用户的类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRequest 请求对象
     * @return UpdateAclAccountResponse
     */
    public UpdateAclAccountResponse updateAclAccount(UpdateAclAccountRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateAclAccount);
    }

    /**
     * 修改ACL角色
     *
     * 修改用户的类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRequest 请求对象
     * @return SyncInvoker<UpdateAclAccountRequest, UpdateAclAccountResponse>
     */
    public SyncInvoker<UpdateAclAccountRequest, UpdateAclAccountResponse> updateAclAccountInvoker(
        UpdateAclAccountRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateAclAccount, hcClient);
    }

    /**
     * 修改ACL账号密码
     *
     * 修改ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountPassWordRequest 请求对象
     * @return UpdateAclAccountPassWordResponse
     */
    public UpdateAclAccountPassWordResponse updateAclAccountPassWord(UpdateAclAccountPassWordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateAclAccountPassWord);
    }

    /**
     * 修改ACL账号密码
     *
     * 修改ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountPassWordRequest 请求对象
     * @return SyncInvoker<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse>
     */
    public SyncInvoker<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> updateAclAccountPassWordInvoker(
        UpdateAclAccountPassWordRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateAclAccountPassWord, hcClient);
    }

    /**
     * ACL账号修改备注
     *
     * ACL账号修改备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRemarkRequest 请求对象
     * @return UpdateAclAccountRemarkResponse
     */
    public UpdateAclAccountRemarkResponse updateAclAccountRemark(UpdateAclAccountRemarkRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateAclAccountRemark);
    }

    /**
     * ACL账号修改备注
     *
     * ACL账号修改备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRemarkRequest 请求对象
     * @return SyncInvoker<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse>
     */
    public SyncInvoker<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> updateAclAccountRemarkInvoker(
        UpdateAclAccountRemarkRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateAclAccountRemark, hcClient);
    }

    /**
     * 设置大key自动分析配置
     *
     * 设置大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return UpdateBigkeyAutoscanConfigResponse
     */
    public UpdateBigkeyAutoscanConfigResponse updateBigkeyAutoscanConfig(UpdateBigkeyAutoscanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateBigkeyAutoscanConfig);
    }

    /**
     * 设置大key自动分析配置
     *
     * 设置大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return SyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse>
     */
    public SyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfigInvoker(
        UpdateBigkeyAutoscanConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 开启或关闭客户端ip透传
     *
     * 开启或关闭客户端ip透传
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientIpTransparentTransmissionRequest 请求对象
     * @return UpdateClientIpTransparentTransmissionResponse
     */
    public UpdateClientIpTransparentTransmissionResponse updateClientIpTransparentTransmission(
        UpdateClientIpTransparentTransmissionRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateClientIpTransparentTransmission);
    }

    /**
     * 开启或关闭客户端ip透传
     *
     * 开启或关闭客户端ip透传
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientIpTransparentTransmissionRequest 请求对象
     * @return SyncInvoker<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse>
     */
    public SyncInvoker<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse> updateClientIpTransparentTransmissionInvoker(
        UpdateClientIpTransparentTransmissionRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateClientIpTransparentTransmission, hcClient);
    }

    /**
     * 修改自定义模板
     *
     * 修改自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigTemplateRequest 请求对象
     * @return UpdateConfigTemplateResponse
     */
    public UpdateConfigTemplateResponse updateConfigTemplate(UpdateConfigTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateConfigTemplate);
    }

    /**
     * 修改自定义模板
     *
     * 修改自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigTemplateRequest 请求对象
     * @return SyncInvoker<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse>
     */
    public SyncInvoker<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> updateConfigTemplateInvoker(
        UpdateConfigTemplateRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateConfigTemplate, hcClient);
    }

    /**
     * 修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationsRequest 请求对象
     * @return UpdateConfigurationsResponse
     */
    public UpdateConfigurationsResponse updateConfigurations(UpdateConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    /**
     * 修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationsRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse>
     */
    public SyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurationsInvoker(
        UpdateConfigurationsRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateConfigurations, hcClient);
    }

    /**
     * 修改自动扫描配置
     *
     * 修改自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpireAutoScanConfigRequest 请求对象
     * @return UpdateExpireAutoScanConfigResponse
     */
    public UpdateExpireAutoScanConfigResponse updateExpireAutoScanConfig(UpdateExpireAutoScanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateExpireAutoScanConfig);
    }

    /**
     * 修改自动扫描配置
     *
     * 修改自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpireAutoScanConfigRequest 请求对象
     * @return SyncInvoker<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse>
     */
    public SyncInvoker<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse> updateExpireAutoScanConfigInvoker(
        UpdateExpireAutoScanConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateExpireAutoScanConfig, hcClient);
    }

    /**
     * 设置热key自动分析配置
     *
     * 设置热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return UpdateHotkeyAutoScanConfigResponse
     */
    public UpdateHotkeyAutoScanConfigResponse updateHotkeyAutoScanConfig(UpdateHotkeyAutoScanConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateHotkeyAutoScanConfig);
    }

    /**
     * 设置热key自动分析配置
     *
     * 设置热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return SyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse>
     */
    public SyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfigInvoker(
        UpdateHotkeyAutoScanConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateHotkeyAutoScanConfig, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateInstance, hcClient);
    }

    /**
     * 变更指定实例的带宽
     *
     * 变更指定实例的带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceBandwidthRequest 请求对象
     * @return UpdateInstanceBandwidthResponse
     */
    public UpdateInstanceBandwidthResponse updateInstanceBandwidth(UpdateInstanceBandwidthRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateInstanceBandwidth);
    }

    /**
     * 变更指定实例的带宽
     *
     * 变更指定实例的带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceBandwidthRequest 请求对象
     * @return SyncInvoker<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse>
     */
    public SyncInvoker<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> updateInstanceBandwidthInvoker(
        UpdateInstanceBandwidthRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateInstanceBandwidth, hcClient);
    }

    /**
     * 异步修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return UpdateInstanceConfigResponse
     */
    public UpdateInstanceConfigResponse updateInstanceConfig(UpdateInstanceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateInstanceConfig);
    }

    /**
     * 异步修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse>
     */
    public SyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> updateInstanceConfigInvoker(
        UpdateInstanceConfigRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateInstanceConfig, hcClient);
    }

    /**
     * 设置迁移任务自动重连
     *
     * 设置迁移任务自动重连
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMigrationTaskRequest 请求对象
     * @return UpdateMigrationTaskResponse
     */
    public UpdateMigrationTaskResponse updateMigrationTask(UpdateMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateMigrationTask);
    }

    /**
     * 设置迁移任务自动重连
     *
     * 设置迁移任务自动重连
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMigrationTaskRequest 请求对象
     * @return SyncInvoker<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse>
     */
    public SyncInvoker<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse> updateMigrationTaskInvoker(
        UpdateMigrationTaskRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateMigrationTask, hcClient);
    }

    /**
     * 修改密码
     *
     * 修改缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordRequest 请求对象
     * @return UpdatePasswordResponse
     */
    public UpdatePasswordResponse updatePassword(UpdatePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updatePassword);
    }

    /**
     * 修改密码
     *
     * 修改缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordRequest 请求对象
     * @return SyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>
     */
    public SyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse> updatePasswordInvoker(
        UpdatePasswordRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updatePassword, hcClient);
    }

    /**
     * 设置备节点优先级
     *
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlavePriorityRequest 请求对象
     * @return UpdateSlavePriorityResponse
     */
    public UpdateSlavePriorityResponse updateSlavePriority(UpdateSlavePriorityRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    /**
     * 设置备节点优先级
     *
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlavePriorityRequest 请求对象
     * @return SyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse>
     */
    public SyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriorityInvoker(
        UpdateSlavePriorityRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateSlavePriority, hcClient);
    }

    /**
     * 开启/关闭SSL
     *
     * 开启/关闭SSL。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSslSwitchRequest 请求对象
     * @return UpdateSslSwitchResponse
     */
    public UpdateSslSwitchResponse updateSslSwitch(UpdateSslSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateSslSwitch);
    }

    /**
     * 开启/关闭SSL
     *
     * 开启/关闭SSL。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSslSwitchRequest 请求对象
     * @return SyncInvoker<UpdateSslSwitchRequest, UpdateSslSwitchResponse>
     */
    public SyncInvoker<UpdateSslSwitchRequest, UpdateSslSwitchResponse> updateSslSwitchInvoker(
        UpdateSslSwitchRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateSslSwitch, hcClient);
    }

    /**
     * 校验集群副本是否支持删除
     *
     * 校验集群副本是否支持删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDeletableReplicaRequest 请求对象
     * @return ValidateDeletableReplicaResponse
     */
    public ValidateDeletableReplicaResponse validateDeletableReplica(ValidateDeletableReplicaRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.validateDeletableReplica);
    }

    /**
     * 校验集群副本是否支持删除
     *
     * 校验集群副本是否支持删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDeletableReplicaRequest 请求对象
     * @return SyncInvoker<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse>
     */
    public SyncInvoker<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse> validateDeletableReplicaInvoker(
        ValidateDeletableReplicaRequest request) {
        return new SyncInvoker<>(request, DcsMeta.validateDeletableReplica, hcClient);
    }

    /**
     * 查询指定实例的IP白名单
     *
     * 查询指定实例的IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpWhitelistRequest 请求对象
     * @return ShowIpWhitelistResponse
     */
    public ShowIpWhitelistResponse showIpWhitelist(ShowIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    /**
     * 查询指定实例的IP白名单
     *
     * 查询指定实例的IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpWhitelistRequest 请求对象
     * @return SyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse>
     */
    public SyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelistInvoker(
        ShowIpWhitelistRequest request) {
        return new SyncInvoker<>(request, DcsMeta.showIpWhitelist, hcClient);
    }

    /**
     * 设置IP白名单分组
     *
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpWhitelistRequest 请求对象
     * @return UpdateIpWhitelistResponse
     */
    public UpdateIpWhitelistResponse updateIpWhitelist(UpdateIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

    /**
     * 设置IP白名单分组
     *
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpWhitelistRequest 请求对象
     * @return SyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse>
     */
    public SyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelistInvoker(
        UpdateIpWhitelistRequest request) {
        return new SyncInvoker<>(request, DcsMeta.updateIpWhitelist, hcClient);
    }

}

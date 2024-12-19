package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchRestartOnlineMigrationTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchRestartOnlineMigrationTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyAsyncRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyAsyncResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeNodesStartStopStatusRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeNodesStartStopStatusResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.DeleteInstanceBandwidthAutoScalingPolicyRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteInstanceBandwidthAutoScalingPolicyResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeletePublicIpRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeletePublicIpResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.HangUpClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.HangUpClientsResponse;
import com.huaweicloud.sdk.dcs.v2.model.HangUpKillAllClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.HangUpKillAllClientsResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.ListClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ListClientsResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.ScanClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ScanClientsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ScanExpireKeyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ScanExpireKeyResponse;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBackgroundTaskProgressRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBackgroundTaskProgressResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowBandwidthsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowBandwidthsResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceBandwidthAutoScalingPolicyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceBandwidthAutoScalingPolicyResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceSslDetailRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceSslDetailResponse;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceVersionRequest;
import com.huaweicloud.sdk.dcs.v2.model.ShowInstanceVersionResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.UpdateBandwidthRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBandwidthResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceBandwidthAutoScalingPolicyRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateInstanceBandwidthAutoScalingPolicyResponse;
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
import com.huaweicloud.sdk.dcs.v2.model.UpdatePublicIpRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdatePublicIpResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSslSwitchRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSslSwitchResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpgradeInstanceMinorVersionRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpgradeInstanceMinorVersionResponse;
import com.huaweicloud.sdk.dcs.v2.model.ValidateDeletableReplicaRequest;
import com.huaweicloud.sdk.dcs.v2.model.ValidateDeletableReplicaResponse;

import java.util.concurrent.CompletableFuture;

public class DcsAsyncClient {

    protected HcClient hcClient;

    public DcsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsAsyncClient> newBuilder() {
        ClientBuilder<DcsAsyncClient> clientBuilder = new ClientBuilder<>(DcsAsyncClient::new);
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
     * @return CompletableFuture<BatchCreateOrDeleteTagsResponse>
     */
    public CompletableFuture<BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsync(
        BatchCreateOrDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchCreateOrDeleteTags);
    }

    /**
     * 批量添加或删除标签
     *
     * 为指定实例批量添加标签，或批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateOrDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse>
     */
    public AsyncInvoker<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTagsAsyncInvoker(
        BatchCreateOrDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.batchCreateOrDeleteTags, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 批量删除多个缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstancesResponse>
     */
    public CompletableFuture<BatchDeleteInstancesResponse> batchDeleteInstancesAsync(
        BatchDeleteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchDeleteInstances);
    }

    /**
     * 批量删除实例
     *
     * 批量删除多个缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstancesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse>
     */
    public AsyncInvoker<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstancesAsyncInvoker(
        BatchDeleteInstancesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.batchDeleteInstances, hcClient);
    }

    /**
     * 批量重启在线迁移任务
     *
     * 批量重启在线迁移任务，接口响应成功，返回重启在线迁移任务下发结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestartOnlineMigrationTasksRequest 请求对象
     * @return CompletableFuture<BatchRestartOnlineMigrationTasksResponse>
     */
    public CompletableFuture<BatchRestartOnlineMigrationTasksResponse> batchRestartOnlineMigrationTasksAsync(
        BatchRestartOnlineMigrationTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchRestartOnlineMigrationTasks);
    }

    /**
     * 批量重启在线迁移任务
     *
     * 批量重启在线迁移任务，接口响应成功，返回重启在线迁移任务下发结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestartOnlineMigrationTasksRequest 请求对象
     * @return AsyncInvoker<BatchRestartOnlineMigrationTasksRequest, BatchRestartOnlineMigrationTasksResponse>
     */
    public AsyncInvoker<BatchRestartOnlineMigrationTasksRequest, BatchRestartOnlineMigrationTasksResponse> batchRestartOnlineMigrationTasksAsyncInvoker(
        BatchRestartOnlineMigrationTasksRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.batchRestartOnlineMigrationTasks, hcClient);
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
     * @return CompletableFuture<BatchShowNodesInformationResponse>
     */
    public CompletableFuture<BatchShowNodesInformationResponse> batchShowNodesInformationAsync(
        BatchShowNodesInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchShowNodesInformation);
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
     * @return AsyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse>
     */
    public AsyncInvoker<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> batchShowNodesInformationAsyncInvoker(
        BatchShowNodesInformationRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.batchShowNodesInformation, hcClient);
    }

    /**
     * 批量停止数据迁移任务
     *
     * 批量停止数据迁移任务，接口响应成功，仅表示下发任务成功。查询到迁移任务状态为TERMINATED时，即停止成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopMigrationTasksRequest 请求对象
     * @return CompletableFuture<BatchStopMigrationTasksResponse>
     */
    public CompletableFuture<BatchStopMigrationTasksResponse> batchStopMigrationTasksAsync(
        BatchStopMigrationTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.batchStopMigrationTasks);
    }

    /**
     * 批量停止数据迁移任务
     *
     * 批量停止数据迁移任务，接口响应成功，仅表示下发任务成功。查询到迁移任务状态为TERMINATED时，即停止成功。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchStopMigrationTasksRequest 请求对象
     * @return AsyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse>
     */
    public AsyncInvoker<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> batchStopMigrationTasksAsyncInvoker(
        BatchStopMigrationTasksRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.batchStopMigrationTasks, hcClient);
    }

    /**
     * 主备切换
     *
     * 切换实例主备节点，只有主备实例支持该操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyRequest 请求对象
     * @return CompletableFuture<ChangeMasterStandbyResponse>
     */
    public CompletableFuture<ChangeMasterStandbyResponse> changeMasterStandbyAsync(ChangeMasterStandbyRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.changeMasterStandby);
    }

    /**
     * 主备切换
     *
     * 切换实例主备节点，只有主备实例支持该操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyRequest 请求对象
     * @return AsyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse>
     */
    public AsyncInvoker<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandbyAsyncInvoker(
        ChangeMasterStandbyRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.changeMasterStandby, hcClient);
    }

    /**
     * 异步交换实例主备节点
     *
     * 异步交换实例主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyAsyncRequest 请求对象
     * @return CompletableFuture<ChangeMasterStandbyAsyncResponse>
     */
    public CompletableFuture<ChangeMasterStandbyAsyncResponse> changeMasterStandbyAsyncAsync(
        ChangeMasterStandbyAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.changeMasterStandbyAsync);
    }

    /**
     * 异步交换实例主备节点
     *
     * 异步交换实例主备节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeMasterStandbyAsyncRequest 请求对象
     * @return AsyncInvoker<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse>
     */
    public AsyncInvoker<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse> changeMasterStandbyAsyncAsyncInvoker(
        ChangeMasterStandbyAsyncRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.changeMasterStandbyAsync, hcClient);
    }

    /**
     * 指定实例节点启停开关
     *
     * 实例节点启停。执行节点关机操作前的24小时内，需要对实例（单机实例除外）进行数据备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeNodesStartStopStatusRequest 请求对象
     * @return CompletableFuture<ChangeNodesStartStopStatusResponse>
     */
    public CompletableFuture<ChangeNodesStartStopStatusResponse> changeNodesStartStopStatusAsync(
        ChangeNodesStartStopStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.changeNodesStartStopStatus);
    }

    /**
     * 指定实例节点启停开关
     *
     * 实例节点启停。执行节点关机操作前的24小时内，需要对实例（单机实例除外）进行数据备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeNodesStartStopStatusRequest 请求对象
     * @return AsyncInvoker<ChangeNodesStartStopStatusRequest, ChangeNodesStartStopStatusResponse>
     */
    public AsyncInvoker<ChangeNodesStartStopStatusRequest, ChangeNodesStartStopStatusResponse> changeNodesStartStopStatusAsyncInvoker(
        ChangeNodesStartStopStatusRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.changeNodesStartStopStatus, hcClient);
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
     * @return CompletableFuture<CopyInstanceResponse>
     */
    public CompletableFuture<CopyInstanceResponse> copyInstanceAsync(CopyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.copyInstance);
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
     * @return AsyncInvoker<CopyInstanceRequest, CopyInstanceResponse>
     */
    public AsyncInvoker<CopyInstanceRequest, CopyInstanceResponse> copyInstanceAsyncInvoker(
        CopyInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.copyInstance, hcClient);
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
     * @return CompletableFuture<CreateAclAccountResponse>
     */
    public CompletableFuture<CreateAclAccountResponse> createAclAccountAsync(CreateAclAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createAclAccount);
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
     * @return AsyncInvoker<CreateAclAccountRequest, CreateAclAccountResponse>
     */
    public AsyncInvoker<CreateAclAccountRequest, CreateAclAccountResponse> createAclAccountAsyncInvoker(
        CreateAclAccountRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createAclAccount, hcClient);
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
     * @return CompletableFuture<CreateAutoExpireScanTaskResponse>
     */
    public CompletableFuture<CreateAutoExpireScanTaskResponse> createAutoExpireScanTaskAsync(
        CreateAutoExpireScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createAutoExpireScanTask);
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
     * @return AsyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse>
     */
    public AsyncInvoker<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> createAutoExpireScanTaskAsyncInvoker(
        CreateAutoExpireScanTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createAutoExpireScanTask, hcClient);
    }

    /**
     * 创建大key分析任务
     *
     * 为Redis实例创建大key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBigkeyScanTaskRequest 请求对象
     * @return CompletableFuture<CreateBigkeyScanTaskResponse>
     */
    public CompletableFuture<CreateBigkeyScanTaskResponse> createBigkeyScanTaskAsync(
        CreateBigkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createBigkeyScanTask);
    }

    /**
     * 创建大key分析任务
     *
     * 为Redis实例创建大key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBigkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse>
     */
    public AsyncInvoker<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTaskAsyncInvoker(
        CreateBigkeyScanTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createBigkeyScanTask, hcClient);
    }

    /**
     * 创建自定义模板
     *
     * 创建自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomTemplateRequest 请求对象
     * @return CompletableFuture<CreateCustomTemplateResponse>
     */
    public CompletableFuture<CreateCustomTemplateResponse> createCustomTemplateAsync(
        CreateCustomTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createCustomTemplate);
    }

    /**
     * 创建自定义模板
     *
     * 创建自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomTemplateRequest 请求对象
     * @return AsyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse>
     */
    public AsyncInvoker<CreateCustomTemplateRequest, CreateCustomTemplateResponse> createCustomTemplateAsyncInvoker(
        CreateCustomTemplateRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createCustomTemplate, hcClient);
    }

    /**
     * 创建实例诊断任务
     *
     * 诊断指定的缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<CreateDiagnosisTaskResponse>
     */
    public CompletableFuture<CreateDiagnosisTaskResponse> createDiagnosisTaskAsync(CreateDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createDiagnosisTask);
    }

    /**
     * 创建实例诊断任务
     *
     * 诊断指定的缓存实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse>
     */
    public AsyncInvoker<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTaskAsyncInvoker(
        CreateDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createDiagnosisTask, hcClient);
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
     * @return CompletableFuture<CreateHotkeyScanTaskResponse>
     */
    public CompletableFuture<CreateHotkeyScanTaskResponse> createHotkeyScanTaskAsync(
        CreateHotkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createHotkeyScanTask);
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
     * @return AsyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse>
     */
    public AsyncInvoker<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTaskAsyncInvoker(
        CreateHotkeyScanTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createHotkeyScanTask, hcClient);
    }

    /**
     * 创建缓存实例
     *
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createInstance);
    }

    /**
     * 创建缓存实例
     *
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createInstance, hcClient);
    }

    /**
     * 创建数据迁移任务
     *
     * 创建数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMigrationTaskRequest 请求对象
     * @return CompletableFuture<CreateMigrationTaskResponse>
     */
    public CompletableFuture<CreateMigrationTaskResponse> createMigrationTaskAsync(CreateMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    /**
     * 创建数据迁移任务
     *
     * 创建数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMigrationTaskRequest 请求对象
     * @return AsyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse>
     */
    public AsyncInvoker<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTaskAsyncInvoker(
        CreateMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createMigrationTask, hcClient);
    }

    /**
     * 创建在线数据迁移任务
     *
     * 创建在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOnlineMigrationTaskRequest 请求对象
     * @return CompletableFuture<CreateOnlineMigrationTaskResponse>
     */
    public CompletableFuture<CreateOnlineMigrationTaskResponse> createOnlineMigrationTaskAsync(
        CreateOnlineMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createOnlineMigrationTask);
    }

    /**
     * 创建在线数据迁移任务
     *
     * 创建在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOnlineMigrationTaskRequest 请求对象
     * @return AsyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse>
     */
    public AsyncInvoker<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> createOnlineMigrationTaskAsyncInvoker(
        CreateOnlineMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createOnlineMigrationTask, hcClient);
    }

    /**
     * 采集Redis运行日志
     *
     * 采集Redis运行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogRequest 请求对象
     * @return CompletableFuture<CreateRedislogResponse>
     */
    public CompletableFuture<CreateRedislogResponse> createRedislogAsync(CreateRedislogRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createRedislog);
    }

    /**
     * 采集Redis运行日志
     *
     * 采集Redis运行日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogRequest 请求对象
     * @return AsyncInvoker<CreateRedislogRequest, CreateRedislogResponse>
     */
    public AsyncInvoker<CreateRedislogRequest, CreateRedislogResponse> createRedislogAsyncInvoker(
        CreateRedislogRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createRedislog, hcClient);
    }

    /**
     * 获取日志下载链接
     *
     * 获取日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogDownloadLinkRequest 请求对象
     * @return CompletableFuture<CreateRedislogDownloadLinkResponse>
     */
    public CompletableFuture<CreateRedislogDownloadLinkResponse> createRedislogDownloadLinkAsync(
        CreateRedislogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createRedislogDownloadLink);
    }

    /**
     * 获取日志下载链接
     *
     * 获取日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRedislogDownloadLinkRequest 请求对象
     * @return AsyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse>
     */
    public AsyncInvoker<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> createRedislogDownloadLinkAsyncInvoker(
        CreateRedislogDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createRedislogDownloadLink, hcClient);
    }

    /**
     * 包周期实例变更规格
     *
     * 包周期实例变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResizeOrderRequest 请求对象
     * @return CompletableFuture<CreateResizeOrderResponse>
     */
    public CompletableFuture<CreateResizeOrderResponse> createResizeOrderAsync(CreateResizeOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.createResizeOrder);
    }

    /**
     * 包周期实例变更规格
     *
     * 包周期实例变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResizeOrderRequest 请求对象
     * @return AsyncInvoker<CreateResizeOrderRequest, CreateResizeOrderResponse>
     */
    public AsyncInvoker<CreateResizeOrderRequest, CreateResizeOrderResponse> createResizeOrderAsyncInvoker(
        CreateResizeOrderRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.createResizeOrder, hcClient);
    }

    /**
     * 删除ACL账号
     *
     * 删除所创建的ACL普通账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclAccountRequest 请求对象
     * @return CompletableFuture<DeleteAclAccountResponse>
     */
    public CompletableFuture<DeleteAclAccountResponse> deleteAclAccountAsync(DeleteAclAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteAclAccount);
    }

    /**
     * 删除ACL账号
     *
     * 删除所创建的ACL普通账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAclAccountRequest 请求对象
     * @return AsyncInvoker<DeleteAclAccountRequest, DeleteAclAccountResponse>
     */
    public AsyncInvoker<DeleteAclAccountRequest, DeleteAclAccountResponse> deleteAclAccountAsyncInvoker(
        DeleteAclAccountRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteAclAccount, hcClient);
    }

    /**
     * 删除后台任务
     *
     * 删除后台任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return CompletableFuture<DeleteBackgroundTaskResponse>
     */
    public CompletableFuture<DeleteBackgroundTaskResponse> deleteBackgroundTaskAsync(
        DeleteBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBackgroundTask);
    }

    /**
     * 删除后台任务
     *
     * 删除后台任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse>
     */
    public AsyncInvoker<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTaskAsyncInvoker(
        DeleteBackgroundTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteBackgroundTask, hcClient);
    }

    /**
     * 删除备份文件
     *
     * 删除缓存实例已备份的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupFileRequest 请求对象
     * @return CompletableFuture<DeleteBackupFileResponse>
     */
    public CompletableFuture<DeleteBackupFileResponse> deleteBackupFileAsync(DeleteBackupFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    /**
     * 删除备份文件
     *
     * 删除缓存实例已备份的文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupFileRequest 请求对象
     * @return AsyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse>
     */
    public AsyncInvoker<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFileAsyncInvoker(
        DeleteBackupFileRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteBackupFile, hcClient);
    }

    /**
     * 删除大key分析记录
     *
     * 删除大key分析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBigkeyScanTaskRequest 请求对象
     * @return CompletableFuture<DeleteBigkeyScanTaskResponse>
     */
    public CompletableFuture<DeleteBigkeyScanTaskResponse> deleteBigkeyScanTaskAsync(
        DeleteBigkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteBigkeyScanTask);
    }

    /**
     * 删除大key分析记录
     *
     * 删除大key分析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBigkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse>
     */
    public AsyncInvoker<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTaskAsyncInvoker(
        DeleteBigkeyScanTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteBigkeyScanTask, hcClient);
    }

    /**
     * 删除任务中心任务
     *
     * 删除任务中心任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCenterTaskRequest 请求对象
     * @return CompletableFuture<DeleteCenterTaskResponse>
     */
    public CompletableFuture<DeleteCenterTaskResponse> deleteCenterTaskAsync(DeleteCenterTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteCenterTask);
    }

    /**
     * 删除任务中心任务
     *
     * 删除任务中心任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCenterTaskRequest 请求对象
     * @return AsyncInvoker<DeleteCenterTaskRequest, DeleteCenterTaskResponse>
     */
    public AsyncInvoker<DeleteCenterTaskRequest, DeleteCenterTaskResponse> deleteCenterTaskAsyncInvoker(
        DeleteCenterTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteCenterTask, hcClient);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigTemplateRequest 请求对象
     * @return CompletableFuture<DeleteConfigTemplateResponse>
     */
    public CompletableFuture<DeleteConfigTemplateResponse> deleteConfigTemplateAsync(
        DeleteConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteConfigTemplate);
    }

    /**
     * 删除自定义模板
     *
     * 删除自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse>
     */
    public AsyncInvoker<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> deleteConfigTemplateAsyncInvoker(
        DeleteConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteConfigTemplate, hcClient);
    }

    /**
     * 删除诊断记录
     *
     * 删除诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDiagnosisTaskRequest 请求对象
     * @return CompletableFuture<DeleteDiagnosisTaskResponse>
     */
    public CompletableFuture<DeleteDiagnosisTaskResponse> deleteDiagnosisTaskAsync(DeleteDiagnosisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteDiagnosisTask);
    }

    /**
     * 删除诊断记录
     *
     * 删除诊断记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDiagnosisTaskRequest 请求对象
     * @return AsyncInvoker<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse>
     */
    public AsyncInvoker<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse> deleteDiagnosisTaskAsyncInvoker(
        DeleteDiagnosisTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteDiagnosisTask, hcClient);
    }

    /**
     * 删除热key分析任务
     *
     * 删除热key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotkeyScanTaskRequest 请求对象
     * @return CompletableFuture<DeleteHotkeyScanTaskResponse>
     */
    public CompletableFuture<DeleteHotkeyScanTaskResponse> deleteHotkeyScanTaskAsync(
        DeleteHotkeyScanTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteHotkeyScanTask);
    }

    /**
     * 删除热key分析任务
     *
     * 删除热key分析任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHotkeyScanTaskRequest 请求对象
     * @return AsyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse>
     */
    public AsyncInvoker<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTaskAsyncInvoker(
        DeleteHotkeyScanTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteHotkeyScanTask, hcClient);
    }

    /**
     * 删除实例带宽弹性伸缩策略
     *
     * 删除实例带宽弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceBandwidthAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<DeleteInstanceBandwidthAutoScalingPolicyResponse>
     */
    public CompletableFuture<DeleteInstanceBandwidthAutoScalingPolicyResponse> deleteInstanceBandwidthAutoScalingPolicyAsync(
        DeleteInstanceBandwidthAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteInstanceBandwidthAutoScalingPolicy);
    }

    /**
     * 删除实例带宽弹性伸缩策略
     *
     * 删除实例带宽弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceBandwidthAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceBandwidthAutoScalingPolicyRequest, DeleteInstanceBandwidthAutoScalingPolicyResponse>
     */
    public AsyncInvoker<DeleteInstanceBandwidthAutoScalingPolicyRequest, DeleteInstanceBandwidthAutoScalingPolicyResponse> deleteInstanceBandwidthAutoScalingPolicyAsyncInvoker(
        DeleteInstanceBandwidthAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteInstanceBandwidthAutoScalingPolicy, hcClient);
    }

    /**
     * 域名摘除IP
     *
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpFromDomainNameRequest 请求对象
     * @return CompletableFuture<DeleteIpFromDomainNameResponse>
     */
    public CompletableFuture<DeleteIpFromDomainNameResponse> deleteIpFromDomainNameAsync(
        DeleteIpFromDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    /**
     * 域名摘除IP
     *
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteIpFromDomainNameRequest 请求对象
     * @return AsyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse>
     */
    public AsyncInvoker<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainNameAsyncInvoker(
        DeleteIpFromDomainNameRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteIpFromDomainName, hcClient);
    }

    /**
     * 删除数据迁移任务
     *
     * 删除数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMigrationTaskRequest 请求对象
     * @return CompletableFuture<DeleteMigrationTaskResponse>
     */
    public CompletableFuture<DeleteMigrationTaskResponse> deleteMigrationTaskAsync(DeleteMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    /**
     * 删除数据迁移任务
     *
     * 删除数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMigrationTaskRequest 请求对象
     * @return AsyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse>
     */
    public AsyncInvoker<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTaskAsyncInvoker(
        DeleteMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteMigrationTask, hcClient);
    }

    /**
     * 关闭实例公网访问
     *
     * 关闭实例公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicIpRequest 请求对象
     * @return CompletableFuture<DeletePublicIpResponse>
     */
    public CompletableFuture<DeletePublicIpResponse> deletePublicIpAsync(DeletePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deletePublicIp);
    }

    /**
     * 关闭实例公网访问
     *
     * 关闭实例公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicIpRequest 请求对象
     * @return AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse>
     */
    public AsyncInvoker<DeletePublicIpRequest, DeletePublicIpResponse> deletePublicIpAsyncInvoker(
        DeletePublicIpRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deletePublicIp, hcClient);
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
     * @return CompletableFuture<DeleteSingleInstanceResponse>
     */
    public CompletableFuture<DeleteSingleInstanceResponse> deleteSingleInstanceAsync(
        DeleteSingleInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.deleteSingleInstance);
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
     * @return AsyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse>
     */
    public AsyncInvoker<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstanceAsyncInvoker(
        DeleteSingleInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.deleteSingleInstance, hcClient);
    }

    /**
     * 下载实例SSL证书
     *
     * 下载实例SSL证书。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSslCertRequest 请求对象
     * @return CompletableFuture<DownloadSslCertResponse>
     */
    public CompletableFuture<DownloadSslCertResponse> downloadSslCertAsync(DownloadSslCertRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.downloadSslCert);
    }

    /**
     * 下载实例SSL证书
     *
     * 下载实例SSL证书。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSslCertRequest 请求对象
     * @return AsyncInvoker<DownloadSslCertRequest, DownloadSslCertResponse>
     */
    public AsyncInvoker<DownloadSslCertRequest, DownloadSslCertResponse> downloadSslCertAsyncInvoker(
        DownloadSslCertRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.downloadSslCert, hcClient);
    }

    /**
     * 进行IP交换
     *
     * 进行IP交换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExchangeInstanceIpRequest 请求对象
     * @return CompletableFuture<ExchangeInstanceIpResponse>
     */
    public CompletableFuture<ExchangeInstanceIpResponse> exchangeInstanceIpAsync(ExchangeInstanceIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.exchangeInstanceIp);
    }

    /**
     * 进行IP交换
     *
     * 进行IP交换
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExchangeInstanceIpRequest 请求对象
     * @return AsyncInvoker<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse>
     */
    public AsyncInvoker<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse> exchangeInstanceIpAsyncInvoker(
        ExchangeInstanceIpRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.exchangeInstanceIp, hcClient);
    }

    /**
     * 集群分片倒换
     *
     * 集群分片倒换，适用于proxy和cluster实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterSwitchoverRequest 请求对象
     * @return CompletableFuture<ExecuteClusterSwitchoverResponse>
     */
    public CompletableFuture<ExecuteClusterSwitchoverResponse> executeClusterSwitchoverAsync(
        ExecuteClusterSwitchoverRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.executeClusterSwitchover);
    }

    /**
     * 集群分片倒换
     *
     * 集群分片倒换，适用于proxy和cluster实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteClusterSwitchoverRequest 请求对象
     * @return AsyncInvoker<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse>
     */
    public AsyncInvoker<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> executeClusterSwitchoverAsyncInvoker(
        ExecuteClusterSwitchoverRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.executeClusterSwitchover, hcClient);
    }

    /**
     * 执行web-cli命令V2接口
     *
     * 登入web-cli，执行redis命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCommandMobilizationRequest 请求对象
     * @return CompletableFuture<ExecuteCommandMobilizationResponse>
     */
    public CompletableFuture<ExecuteCommandMobilizationResponse> executeCommandMobilizationAsync(
        ExecuteCommandMobilizationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.executeCommandMobilization);
    }

    /**
     * 执行web-cli命令V2接口
     *
     * 登入web-cli，执行redis命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCommandMobilizationRequest 请求对象
     * @return AsyncInvoker<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse>
     */
    public AsyncInvoker<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse> executeCommandMobilizationAsyncInvoker(
        ExecuteCommandMobilizationRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.executeCommandMobilization, hcClient);
    }

    /**
     * 查询实例列表导出任务详情
     *
     * 查询实例列表导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportExcelJobRequest 请求对象
     * @return CompletableFuture<ExportExcelJobResponse>
     */
    public CompletableFuture<ExportExcelJobResponse> exportExcelJobAsync(ExportExcelJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.exportExcelJob);
    }

    /**
     * 查询实例列表导出任务详情
     *
     * 查询实例列表导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportExcelJobRequest 请求对象
     * @return AsyncInvoker<ExportExcelJobRequest, ExportExcelJobResponse>
     */
    public AsyncInvoker<ExportExcelJobRequest, ExportExcelJobResponse> exportExcelJobAsyncInvoker(
        ExportExcelJobRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.exportExcelJob, hcClient);
    }

    /**
     * 异步导出实例资源
     *
     * 异步导出实例资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstancesTaskRequest 请求对象
     * @return CompletableFuture<ExportInstancesTaskResponse>
     */
    public CompletableFuture<ExportInstancesTaskResponse> exportInstancesTaskAsync(ExportInstancesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.exportInstancesTask);
    }

    /**
     * 异步导出实例资源
     *
     * 异步导出实例资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstancesTaskRequest 请求对象
     * @return AsyncInvoker<ExportInstancesTaskRequest, ExportInstancesTaskResponse>
     */
    public AsyncInvoker<ExportInstancesTaskRequest, ExportInstancesTaskResponse> exportInstancesTaskAsyncInvoker(
        ExportInstancesTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.exportInstancesTask, hcClient);
    }

    /**
     * kill指定的会话
     *
     * kill指定的会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpClientsRequest 请求对象
     * @return CompletableFuture<HangUpClientsResponse>
     */
    public CompletableFuture<HangUpClientsResponse> hangUpClientsAsync(HangUpClientsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.hangUpClients);
    }

    /**
     * kill指定的会话
     *
     * kill指定的会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpClientsRequest 请求对象
     * @return AsyncInvoker<HangUpClientsRequest, HangUpClientsResponse>
     */
    public AsyncInvoker<HangUpClientsRequest, HangUpClientsResponse> hangUpClientsAsyncInvoker(
        HangUpClientsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.hangUpClients, hcClient);
    }

    /**
     * 下发kill指定节点或实例的全部会话任务
     *
     * 下发kill指定节点或实例的全部会话任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpKillAllClientsRequest 请求对象
     * @return CompletableFuture<HangUpKillAllClientsResponse>
     */
    public CompletableFuture<HangUpKillAllClientsResponse> hangUpKillAllClientsAsync(
        HangUpKillAllClientsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.hangUpKillAllClients);
    }

    /**
     * 下发kill指定节点或实例的全部会话任务
     *
     * 下发kill指定节点或实例的全部会话任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request HangUpKillAllClientsRequest 请求对象
     * @return AsyncInvoker<HangUpKillAllClientsRequest, HangUpKillAllClientsResponse>
     */
    public AsyncInvoker<HangUpKillAllClientsRequest, HangUpKillAllClientsResponse> hangUpKillAllClientsAsyncInvoker(
        HangUpKillAllClientsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.hangUpKillAllClients, hcClient);
    }

    /**
     * 查询ACL账户列表
     *
     * 查询ACL账户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclAccountsRequest 请求对象
     * @return CompletableFuture<ListAclAccountsResponse>
     */
    public CompletableFuture<ListAclAccountsResponse> listAclAccountsAsync(ListAclAccountsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listAclAccounts);
    }

    /**
     * 查询ACL账户列表
     *
     * 查询ACL账户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAclAccountsRequest 请求对象
     * @return AsyncInvoker<ListAclAccountsRequest, ListAclAccountsResponse>
     */
    public AsyncInvoker<ListAclAccountsRequest, ListAclAccountsResponse> listAclAccountsAsyncInvoker(
        ListAclAccountsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listAclAccounts, hcClient);
    }

    /**
     * 查询可用区信息
     *
     * 查询所在局点的可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return CompletableFuture<ListAvailableZonesResponse>
     */
    public CompletableFuture<ListAvailableZonesResponse> listAvailableZonesAsync(ListAvailableZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    /**
     * 查询可用区信息
     *
     * 查询所在局点的可用区信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse>
     */
    public AsyncInvoker<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZonesAsyncInvoker(
        ListAvailableZonesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listAvailableZones, hcClient);
    }

    /**
     * 查询后台任务列表
     *
     * 查询后台任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTaskRequest 请求对象
     * @return CompletableFuture<ListBackgroundTaskResponse>
     */
    public CompletableFuture<ListBackgroundTaskResponse> listBackgroundTaskAsync(ListBackgroundTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackgroundTask);
    }

    /**
     * 查询后台任务列表
     *
     * 查询后台任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackgroundTaskRequest 请求对象
     * @return AsyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse>
     */
    public AsyncInvoker<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTaskAsyncInvoker(
        ListBackgroundTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listBackgroundTask, hcClient);
    }

    /**
     * 获取备份文件下载链接
     *
     * 获取指定实例的备份文件下载链接，下载备份文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupFileLinksRequest 请求对象
     * @return CompletableFuture<ListBackupFileLinksResponse>
     */
    public CompletableFuture<ListBackupFileLinksResponse> listBackupFileLinksAsync(ListBackupFileLinksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    /**
     * 获取备份文件下载链接
     *
     * 获取指定实例的备份文件下载链接，下载备份文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupFileLinksRequest 请求对象
     * @return AsyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse>
     */
    public AsyncInvoker<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinksAsyncInvoker(
        ListBackupFileLinksRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listBackupFileLinks, hcClient);
    }

    /**
     * 查询实例备份信息
     *
     * 查询指定缓存实例的备份信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupRecordsRequest 请求对象
     * @return CompletableFuture<ListBackupRecordsResponse>
     */
    public CompletableFuture<ListBackupRecordsResponse> listBackupRecordsAsync(ListBackupRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    /**
     * 查询实例备份信息
     *
     * 查询指定缓存实例的备份信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupRecordsRequest 请求对象
     * @return AsyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse>
     */
    public AsyncInvoker<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecordsAsyncInvoker(
        ListBackupRecordsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listBackupRecords, hcClient);
    }

    /**
     * 查询大key分析任务列表
     *
     * 查询大key分析任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBigkeyScanTasksRequest 请求对象
     * @return CompletableFuture<ListBigkeyScanTasksResponse>
     */
    public CompletableFuture<ListBigkeyScanTasksResponse> listBigkeyScanTasksAsync(ListBigkeyScanTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listBigkeyScanTasks);
    }

    /**
     * 查询大key分析任务列表
     *
     * 查询大key分析任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBigkeyScanTasksRequest 请求对象
     * @return AsyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse>
     */
    public AsyncInvoker<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasksAsyncInvoker(
        ListBigkeyScanTasksRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listBigkeyScanTasks, hcClient);
    }

    /**
     * 查询任务中心任务列表
     *
     * 查询任务中心任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCenterTaskRequest 请求对象
     * @return CompletableFuture<ListCenterTaskResponse>
     */
    public CompletableFuture<ListCenterTaskResponse> listCenterTaskAsync(ListCenterTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listCenterTask);
    }

    /**
     * 查询任务中心任务列表
     *
     * 查询任务中心任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCenterTaskRequest 请求对象
     * @return AsyncInvoker<ListCenterTaskRequest, ListCenterTaskResponse>
     */
    public AsyncInvoker<ListCenterTaskRequest, ListCenterTaskResponse> listCenterTaskAsyncInvoker(
        ListCenterTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listCenterTask, hcClient);
    }

    /**
     * 获取会话列表
     *
     * 获取会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClientsRequest 请求对象
     * @return CompletableFuture<ListClientsResponse>
     */
    public CompletableFuture<ListClientsResponse> listClientsAsync(ListClientsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listClients);
    }

    /**
     * 获取会话列表
     *
     * 获取会话列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClientsRequest 请求对象
     * @return AsyncInvoker<ListClientsRequest, ListClientsResponse>
     */
    public AsyncInvoker<ListClientsRequest, ListClientsResponse> listClientsAsyncInvoker(ListClientsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listClients, hcClient);
    }

    /**
     * 查询实例参数修改记录列表
     *
     * 查询实例的参数修改记录列表，支持按照关键字查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigHistoriesRequest 请求对象
     * @return CompletableFuture<ListConfigHistoriesResponse>
     */
    public CompletableFuture<ListConfigHistoriesResponse> listConfigHistoriesAsync(ListConfigHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listConfigHistories);
    }

    /**
     * 查询实例参数修改记录列表
     *
     * 查询实例的参数修改记录列表，支持按照关键字查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigHistoriesRequest 请求对象
     * @return AsyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse>
     */
    public AsyncInvoker<ListConfigHistoriesRequest, ListConfigHistoriesResponse> listConfigHistoriesAsyncInvoker(
        ListConfigHistoriesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listConfigHistories, hcClient);
    }

    /**
     * 查询参数模板列表
     *
     * 查询租户的参数模板列表，支持按照条件查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigTemplatesRequest 请求对象
     * @return CompletableFuture<ListConfigTemplatesResponse>
     */
    public CompletableFuture<ListConfigTemplatesResponse> listConfigTemplatesAsync(ListConfigTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listConfigTemplates);
    }

    /**
     * 查询参数模板列表
     *
     * 查询租户的参数模板列表，支持按照条件查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigTemplatesRequest 请求对象
     * @return AsyncInvoker<ListConfigTemplatesRequest, ListConfigTemplatesResponse>
     */
    public AsyncInvoker<ListConfigTemplatesRequest, ListConfigTemplatesResponse> listConfigTemplatesAsyncInvoker(
        ListConfigTemplatesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listConfigTemplates, hcClient);
    }

    /**
     * 查询实例配置参数
     *
     * 查询指定实例的配置参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    /**
     * 查询实例配置参数
     *
     * 查询指定实例的配置参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询实例诊断任务列表
     *
     * 查询指定缓存实例诊断任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return CompletableFuture<ListDiagnosisTasksResponse>
     */
    public CompletableFuture<ListDiagnosisTasksResponse> listDiagnosisTasksAsync(ListDiagnosisTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listDiagnosisTasks);
    }

    /**
     * 查询实例诊断任务列表
     *
     * 查询指定缓存实例诊断任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiagnosisTasksRequest 请求对象
     * @return AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse>
     */
    public AsyncInvoker<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasksAsyncInvoker(
        ListDiagnosisTasksRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listDiagnosisTasks, hcClient);
    }

    /**
     * 查询产品规格
     *
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listFlavors);
    }

    /**
     * 查询产品规格
     *
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listFlavors, hcClient);
    }

    /**
     * 查询分片信息
     *
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupReplicationInfoRequest 请求对象
     * @return CompletableFuture<ListGroupReplicationInfoResponse>
     */
    public CompletableFuture<ListGroupReplicationInfoResponse> listGroupReplicationInfoAsync(
        ListGroupReplicationInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    /**
     * 查询分片信息
     *
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupReplicationInfoRequest 请求对象
     * @return AsyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse>
     */
    public AsyncInvoker<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfoAsyncInvoker(
        ListGroupReplicationInfoRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listGroupReplicationInfo, hcClient);
    }

    /**
     * 查询热key分析任务列表
     *
     * 查询热key分析历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotKeyScanTasksRequest 请求对象
     * @return CompletableFuture<ListHotKeyScanTasksResponse>
     */
    public CompletableFuture<ListHotKeyScanTasksResponse> listHotKeyScanTasksAsync(ListHotKeyScanTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listHotKeyScanTasks);
    }

    /**
     * 查询热key分析任务列表
     *
     * 查询热key分析历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHotKeyScanTasksRequest 请求对象
     * @return AsyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse>
     */
    public AsyncInvoker<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasksAsyncInvoker(
        ListHotKeyScanTasksRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listHotKeyScanTasks, hcClient);
    }

    /**
     * 查询实例是否可以扩容
     *
     * 查询实例是否可以扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceOperationsRequest 请求对象
     * @return CompletableFuture<ListInstanceOperationsResponse>
     */
    public CompletableFuture<ListInstanceOperationsResponse> listInstanceOperationsAsync(
        ListInstanceOperationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listInstanceOperations);
    }

    /**
     * 查询实例是否可以扩容
     *
     * 查询实例是否可以扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceOperationsRequest 请求对象
     * @return AsyncInvoker<ListInstanceOperationsRequest, ListInstanceOperationsResponse>
     */
    public AsyncInvoker<ListInstanceOperationsRequest, ListInstanceOperationsResponse> listInstanceOperationsAsyncInvoker(
        ListInstanceOperationsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listInstanceOperations, hcClient);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的缓存实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listInstances);
    }

    /**
     * 查询所有实例列表
     *
     * 查询租户的缓存实例列表，支持按照条件查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listInstances, hcClient);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMaintenanceWindowsRequest 请求对象
     * @return CompletableFuture<ListMaintenanceWindowsResponse>
     */
    public CompletableFuture<ListMaintenanceWindowsResponse> listMaintenanceWindowsAsync(
        ListMaintenanceWindowsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    /**
     * 查询维护时间窗时间段
     *
     * 查询维护时间窗开始时间和结束时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMaintenanceWindowsRequest 请求对象
     * @return AsyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
     */
    public AsyncInvoker<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindowsAsyncInvoker(
        ListMaintenanceWindowsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listMaintenanceWindows, hcClient);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskRequest 请求对象
     * @return CompletableFuture<ListMigrationTaskResponse>
     */
    public CompletableFuture<ListMigrationTaskResponse> listMigrationTaskAsync(ListMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    /**
     * 查询迁移任务列表
     *
     * 查询迁移任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskRequest 请求对象
     * @return AsyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse>
     */
    public AsyncInvoker<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTaskAsyncInvoker(
        ListMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listMigrationTask, hcClient);
    }

    /**
     * 查询迁移日志列表
     *
     * 查询迁移日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskLogsRequest 请求对象
     * @return CompletableFuture<ListMigrationTaskLogsResponse>
     */
    public CompletableFuture<ListMigrationTaskLogsResponse> listMigrationTaskLogsAsync(
        ListMigrationTaskLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMigrationTaskLogs);
    }

    /**
     * 查询迁移日志列表
     *
     * 查询迁移日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMigrationTaskLogsRequest 请求对象
     * @return AsyncInvoker<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse>
     */
    public AsyncInvoker<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse> listMigrationTaskLogsAsyncInvoker(
        ListMigrationTaskLogsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listMigrationTaskLogs, hcClient);
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
     * @return CompletableFuture<ListMonitoredObjectsResponse>
     */
    public CompletableFuture<ListMonitoredObjectsResponse> listMonitoredObjectsAsync(
        ListMonitoredObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMonitoredObjects);
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
     * @return AsyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse>
     */
    public AsyncInvoker<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjectsAsyncInvoker(
        ListMonitoredObjectsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listMonitoredObjects, hcClient);
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
     * @return CompletableFuture<ListMonitoredObjectsOfInstanceResponse>
     */
    public CompletableFuture<ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceAsync(
        ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
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
     * @return AsyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse>
     */
    public AsyncInvoker<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstanceAsyncInvoker(
        ListMonitoredObjectsOfInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listMonitoredObjectsOfInstance, hcClient);
    }

    /**
     * 查询实例状态
     *
     * 查询该租户在当前区域下不同状态的实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return CompletableFuture<ListNumberOfInstancesInDifferentStatusResponse>
     */
    public CompletableFuture<ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusAsync(
        ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    /**
     * 查询实例状态
     *
     * 查询该租户在当前区域下不同状态的实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return AsyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse>
     */
    public AsyncInvoker<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatusAsyncInvoker(
        ListNumberOfInstancesInDifferentStatusRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listNumberOfInstancesInDifferentStatus, hcClient);
    }

    /**
     * 查询Redis运行日志列表
     *
     * 查询Redis运行日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedislogRequest 请求对象
     * @return CompletableFuture<ListRedislogResponse>
     */
    public CompletableFuture<ListRedislogResponse> listRedislogAsync(ListRedislogRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listRedislog);
    }

    /**
     * 查询Redis运行日志列表
     *
     * 查询Redis运行日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedislogRequest 请求对象
     * @return AsyncInvoker<ListRedislogRequest, ListRedislogResponse>
     */
    public AsyncInvoker<ListRedislogRequest, ListRedislogResponse> listRedislogAsyncInvoker(
        ListRedislogRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listRedislog, hcClient);
    }

    /**
     * 查询实例恢复记录
     *
     * 查询指定缓存实例的恢复记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreRecordsRequest 请求对象
     * @return CompletableFuture<ListRestoreRecordsResponse>
     */
    public CompletableFuture<ListRestoreRecordsResponse> listRestoreRecordsAsync(ListRestoreRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    /**
     * 查询实例恢复记录
     *
     * 查询指定缓存实例的恢复记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreRecordsRequest 请求对象
     * @return AsyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse>
     */
    public AsyncInvoker<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecordsAsyncInvoker(
        ListRestoreRecordsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listRestoreRecords, hcClient);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogRequest 请求对象
     * @return CompletableFuture<ListSlowlogResponse>
     */
    public CompletableFuture<ListSlowlogResponse> listSlowlogAsync(ListSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listSlowlog);
    }

    /**
     * 查询慢日志
     *
     * 查询慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogRequest 请求对象
     * @return AsyncInvoker<ListSlowlogRequest, ListSlowlogResponse>
     */
    public AsyncInvoker<ListSlowlogRequest, ListSlowlogResponse> listSlowlogAsyncInvoker(ListSlowlogRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listSlowlog, hcClient);
    }

    /**
     * 查询运行中实例的统计信息
     *
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsOfRunningInstancesRequest 请求对象
     * @return CompletableFuture<ListStatisticsOfRunningInstancesResponse>
     */
    public CompletableFuture<ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesAsync(
        ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    /**
     * 查询运行中实例的统计信息
     *
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStatisticsOfRunningInstancesRequest 请求对象
     * @return AsyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse>
     */
    public AsyncInvoker<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstancesAsyncInvoker(
        ListStatisticsOfRunningInstancesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listStatisticsOfRunningInstances, hcClient);
    }

    /**
     * 查询租户所有标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsOfTenantRequest 请求对象
     * @return CompletableFuture<ListTagsOfTenantResponse>
     */
    public CompletableFuture<ListTagsOfTenantResponse> listTagsOfTenantAsync(ListTagsOfTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.listTagsOfTenant);
    }

    /**
     * 查询租户所有标签
     *
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsOfTenantRequest 请求对象
     * @return AsyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse>
     */
    public AsyncInvoker<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenantAsyncInvoker(
        ListTagsOfTenantRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.listTagsOfTenant, hcClient);
    }

    /**
     * 登录webCli
     *
     * 登录webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginWebCliRequest 请求对象
     * @return CompletableFuture<LoginWebCliResponse>
     */
    public CompletableFuture<LoginWebCliResponse> loginWebCliAsync(LoginWebCliRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.loginWebCli);
    }

    /**
     * 登录webCli
     *
     * 登录webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginWebCliRequest 请求对象
     * @return AsyncInvoker<LoginWebCliRequest, LoginWebCliResponse>
     */
    public AsyncInvoker<LoginWebCliRequest, LoginWebCliResponse> loginWebCliAsyncInvoker(LoginWebCliRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.loginWebCli, hcClient);
    }

    /**
     * 登出webCli
     *
     * 登出webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffWebCliRequest 请求对象
     * @return CompletableFuture<LogoffWebCliResponse>
     */
    public CompletableFuture<LogoffWebCliResponse> logoffWebCliAsync(LogoffWebCliRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.logoffWebCli);
    }

    /**
     * 登出webCli
     *
     * 登出webCli
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffWebCliRequest 请求对象
     * @return AsyncInvoker<LogoffWebCliRequest, LogoffWebCliResponse>
     */
    public AsyncInvoker<LogoffWebCliRequest, LogoffWebCliResponse> logoffWebCliAsyncInvoker(
        LogoffWebCliRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.logoffWebCli, hcClient);
    }

    /**
     * 重置ACL账号密码
     *
     * 重置ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAclAccountPassWordRequest 请求对象
     * @return CompletableFuture<ResetAclAccountPassWordResponse>
     */
    public CompletableFuture<ResetAclAccountPassWordResponse> resetAclAccountPassWordAsync(
        ResetAclAccountPassWordRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.resetAclAccountPassWord);
    }

    /**
     * 重置ACL账号密码
     *
     * 重置ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetAclAccountPassWordRequest 请求对象
     * @return AsyncInvoker<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse>
     */
    public AsyncInvoker<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> resetAclAccountPassWordAsyncInvoker(
        ResetAclAccountPassWordRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.resetAclAccountPassWord, hcClient);
    }

    /**
     * 重置密码
     *
     * 重置缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.resetPassword);
    }

    /**
     * 重置密码
     *
     * 重置缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.resetPassword, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 用户可以为状态为“运行中”的DCS缓存实例进行规格变更，当前仅能支持按需实例的同副本或分片数量的实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 用户可以为状态为“运行中”的DCS缓存实例进行规格变更，当前仅能支持按需实例的同副本或分片数量的实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.resizeInstance, hcClient);
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
     * @return CompletableFuture<RestartOrFlushInstancesResponse>
     */
    public CompletableFuture<RestartOrFlushInstancesResponse> restartOrFlushInstancesAsync(
        RestartOrFlushInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.restartOrFlushInstances);
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
     * @return AsyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse>
     */
    public AsyncInvoker<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstancesAsyncInvoker(
        RestartOrFlushInstancesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.restartOrFlushInstances, hcClient);
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
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.restoreInstance);
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
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(
        RestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.restoreInstance, hcClient);
    }

    /**
     * 下发查询会话列表任务
     *
     * 下发查询会话列表任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanClientsRequest 请求对象
     * @return CompletableFuture<ScanClientsResponse>
     */
    public CompletableFuture<ScanClientsResponse> scanClientsAsync(ScanClientsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.scanClients);
    }

    /**
     * 下发查询会话列表任务
     *
     * 下发查询会话列表任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanClientsRequest 请求对象
     * @return AsyncInvoker<ScanClientsRequest, ScanClientsResponse>
     */
    public AsyncInvoker<ScanClientsRequest, ScanClientsResponse> scanClientsAsyncInvoker(ScanClientsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.scanClients, hcClient);
    }

    /**
     * 立刻扫描过期Key
     *
     * 立刻扫描过期Key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanExpireKeyRequest 请求对象
     * @return CompletableFuture<ScanExpireKeyResponse>
     */
    public CompletableFuture<ScanExpireKeyResponse> scanExpireKeyAsync(ScanExpireKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.scanExpireKey);
    }

    /**
     * 立刻扫描过期Key
     *
     * 立刻扫描过期Key
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ScanExpireKeyRequest 请求对象
     * @return AsyncInvoker<ScanExpireKeyRequest, ScanExpireKeyResponse>
     */
    public AsyncInvoker<ScanExpireKeyRequest, ScanExpireKeyResponse> scanExpireKeyAsyncInvoker(
        ScanExpireKeyRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.scanExpireKey, hcClient);
    }

    /**
     * 配置在线数据迁移任务
     *
     * 配置在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetOnlineMigrationTaskRequest 请求对象
     * @return CompletableFuture<SetOnlineMigrationTaskResponse>
     */
    public CompletableFuture<SetOnlineMigrationTaskResponse> setOnlineMigrationTaskAsync(
        SetOnlineMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.setOnlineMigrationTask);
    }

    /**
     * 配置在线数据迁移任务
     *
     * 配置在线数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetOnlineMigrationTaskRequest 请求对象
     * @return AsyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse>
     */
    public AsyncInvoker<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> setOnlineMigrationTaskAsyncInvoker(
        SetOnlineMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.setOnlineMigrationTask, hcClient);
    }

    /**
     * 查询后台任务详细信息
     *
     * 查询后台任务详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return CompletableFuture<ShowBackgroundTaskProgressResponse>
     */
    public CompletableFuture<ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressAsync(
        ShowBackgroundTaskProgressRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showBackgroundTaskProgress);
    }

    /**
     * 查询后台任务详细信息
     *
     * 查询后台任务详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackgroundTaskProgressRequest 请求对象
     * @return AsyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse>
     */
    public AsyncInvoker<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgressAsyncInvoker(
        ShowBackgroundTaskProgressRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showBackgroundTaskProgress, hcClient);
    }

    /**
     * 获取实例分片带宽
     *
     * 获取实例各个分片带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthsRequest 请求对象
     * @return CompletableFuture<ShowBandwidthsResponse>
     */
    public CompletableFuture<ShowBandwidthsResponse> showBandwidthsAsync(ShowBandwidthsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showBandwidths);
    }

    /**
     * 获取实例分片带宽
     *
     * 获取实例各个分片带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthsRequest 请求对象
     * @return AsyncInvoker<ShowBandwidthsRequest, ShowBandwidthsResponse>
     */
    public AsyncInvoker<ShowBandwidthsRequest, ShowBandwidthsResponse> showBandwidthsAsyncInvoker(
        ShowBandwidthsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showBandwidths, hcClient);
    }

    /**
     * 查询大key自动分析配置
     *
     * 查询大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyAutoscanConfigRequest 请求对象
     * @return CompletableFuture<ShowBigkeyAutoscanConfigResponse>
     */
    public CompletableFuture<ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfigAsync(
        ShowBigkeyAutoscanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showBigkeyAutoscanConfig);
    }

    /**
     * 查询大key自动分析配置
     *
     * 查询大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyAutoscanConfigRequest 请求对象
     * @return AsyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse>
     */
    public AsyncInvoker<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfigAsyncInvoker(
        ShowBigkeyAutoscanConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询大key分析详情
     *
     * 查询大key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowBigkeyScanTaskDetailsResponse>
     */
    public CompletableFuture<ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetailsAsync(
        ShowBigkeyScanTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showBigkeyScanTaskDetails);
    }

    /**
     * 查询大key分析详情
     *
     * 查询大key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBigkeyScanTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse>
     */
    public AsyncInvoker<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetailsAsyncInvoker(
        ShowBigkeyScanTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showBigkeyScanTaskDetails, hcClient);
    }

    /**
     * 查询实例参数修改记录详情
     *
     * 查询实例参数修改记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigHistoryDetailRequest 请求对象
     * @return CompletableFuture<ShowConfigHistoryDetailResponse>
     */
    public CompletableFuture<ShowConfigHistoryDetailResponse> showConfigHistoryDetailAsync(
        ShowConfigHistoryDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showConfigHistoryDetail);
    }

    /**
     * 查询实例参数修改记录详情
     *
     * 查询实例参数修改记录详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigHistoryDetailRequest 请求对象
     * @return AsyncInvoker<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse>
     */
    public AsyncInvoker<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse> showConfigHistoryDetailAsyncInvoker(
        ShowConfigHistoryDetailRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showConfigHistoryDetail, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 查询参数模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigTemplateRequest 请求对象
     * @return CompletableFuture<ShowConfigTemplateResponse>
     */
    public CompletableFuture<ShowConfigTemplateResponse> showConfigTemplateAsync(ShowConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showConfigTemplate);
    }

    /**
     * 查询参数模板详情
     *
     * 查询参数模板详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigTemplateRequest 请求对象
     * @return AsyncInvoker<ShowConfigTemplateRequest, ShowConfigTemplateResponse>
     */
    public AsyncInvoker<ShowConfigTemplateRequest, ShowConfigTemplateResponse> showConfigTemplateAsyncInvoker(
        ShowConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showConfigTemplate, hcClient);
    }

    /**
     * 查询指定诊断报告
     *
     * 通过报告ID查询诊断报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowDiagnosisTaskDetailsResponse>
     */
    public CompletableFuture<ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetailsAsync(
        ShowDiagnosisTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showDiagnosisTaskDetails);
    }

    /**
     * 查询指定诊断报告
     *
     * 通过报告ID查询诊断报告的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiagnosisTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse>
     */
    public AsyncInvoker<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetailsAsyncInvoker(
        ShowDiagnosisTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showDiagnosisTaskDetails, hcClient);
    }

    /**
     * 查询自动扫描配置
     *
     * 查询自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireAutoScanConfigRequest 请求对象
     * @return CompletableFuture<ShowExpireAutoScanConfigResponse>
     */
    public CompletableFuture<ShowExpireAutoScanConfigResponse> showExpireAutoScanConfigAsync(
        ShowExpireAutoScanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showExpireAutoScanConfig);
    }

    /**
     * 查询自动扫描配置
     *
     * 查询自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireAutoScanConfigRequest 请求对象
     * @return AsyncInvoker<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse>
     */
    public AsyncInvoker<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse> showExpireAutoScanConfigAsyncInvoker(
        ShowExpireAutoScanConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showExpireAutoScanConfig, hcClient);
    }

    /**
     * 查询过期Key扫描记录
     *
     * 查询过期Key扫描记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireKeyScanInfoRequest 请求对象
     * @return CompletableFuture<ShowExpireKeyScanInfoResponse>
     */
    public CompletableFuture<ShowExpireKeyScanInfoResponse> showExpireKeyScanInfoAsync(
        ShowExpireKeyScanInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showExpireKeyScanInfo);
    }

    /**
     * 查询过期Key扫描记录
     *
     * 查询过期Key扫描记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpireKeyScanInfoRequest 请求对象
     * @return AsyncInvoker<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse>
     */
    public AsyncInvoker<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse> showExpireKeyScanInfoAsyncInvoker(
        ShowExpireKeyScanInfoRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showExpireKeyScanInfo, hcClient);
    }

    /**
     * 查询热key自动分析配置
     *
     * 查询热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyAutoscanConfigRequest 请求对象
     * @return CompletableFuture<ShowHotkeyAutoscanConfigResponse>
     */
    public CompletableFuture<ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfigAsync(
        ShowHotkeyAutoscanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showHotkeyAutoscanConfig);
    }

    /**
     * 查询热key自动分析配置
     *
     * 查询热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyAutoscanConfigRequest 请求对象
     * @return AsyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse>
     */
    public AsyncInvoker<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfigAsyncInvoker(
        ShowHotkeyAutoscanConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showHotkeyAutoscanConfig, hcClient);
    }

    /**
     * 查询热key分析详情
     *
     * 查询热key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowHotkeyTaskDetailsResponse>
     */
    public CompletableFuture<ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetailsAsync(
        ShowHotkeyTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showHotkeyTaskDetails);
    }

    /**
     * 查询热key分析详情
     *
     * 查询热key分析详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHotkeyTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse>
     */
    public AsyncInvoker<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetailsAsyncInvoker(
        ShowHotkeyTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showHotkeyTaskDetails, hcClient);
    }

    /**
     * 查询指定实例
     *
     * 通过实例ID查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showInstance);
    }

    /**
     * 查询指定实例
     *
     * 通过实例ID查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showInstance, hcClient);
    }

    /**
     * 查询实例带宽弹性伸缩策略
     *
     * 查询实例带宽弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceBandwidthAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<ShowInstanceBandwidthAutoScalingPolicyResponse>
     */
    public CompletableFuture<ShowInstanceBandwidthAutoScalingPolicyResponse> showInstanceBandwidthAutoScalingPolicyAsync(
        ShowInstanceBandwidthAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showInstanceBandwidthAutoScalingPolicy);
    }

    /**
     * 查询实例带宽弹性伸缩策略
     *
     * 查询实例带宽弹性伸缩策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceBandwidthAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ShowInstanceBandwidthAutoScalingPolicyRequest, ShowInstanceBandwidthAutoScalingPolicyResponse>
     */
    public AsyncInvoker<ShowInstanceBandwidthAutoScalingPolicyRequest, ShowInstanceBandwidthAutoScalingPolicyResponse> showInstanceBandwidthAutoScalingPolicyAsyncInvoker(
        ShowInstanceBandwidthAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showInstanceBandwidthAutoScalingPolicy, hcClient);
    }

    /**
     * 查询实例SSL信息
     *
     * 查询实例SSL信息。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSslDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceSslDetailResponse>
     */
    public CompletableFuture<ShowInstanceSslDetailResponse> showInstanceSslDetailAsync(
        ShowInstanceSslDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showInstanceSslDetail);
    }

    /**
     * 查询实例SSL信息
     *
     * 查询实例SSL信息。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSslDetailRequest 请求对象
     * @return AsyncInvoker<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse>
     */
    public AsyncInvoker<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse> showInstanceSslDetailAsyncInvoker(
        ShowInstanceSslDetailRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showInstanceSslDetail, hcClient);
    }

    /**
     * 根据实例ID获取实例内核版本信息
     *
     * 获取对应实例内核版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceVersionRequest 请求对象
     * @return CompletableFuture<ShowInstanceVersionResponse>
     */
    public CompletableFuture<ShowInstanceVersionResponse> showInstanceVersionAsync(ShowInstanceVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showInstanceVersion);
    }

    /**
     * 根据实例ID获取实例内核版本信息
     *
     * 获取对应实例内核版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceVersionRequest 请求对象
     * @return AsyncInvoker<ShowInstanceVersionRequest, ShowInstanceVersionResponse>
     */
    public AsyncInvoker<ShowInstanceVersionRequest, ShowInstanceVersionResponse> showInstanceVersionAsyncInvoker(
        ShowInstanceVersionRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showInstanceVersion, hcClient);
    }

    /**
     * 查询租户Job执行结果
     *
     * 查询租户Job执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return CompletableFuture<ShowJobInfoResponse>
     */
    public CompletableFuture<ShowJobInfoResponse> showJobInfoAsync(ShowJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showJobInfo);
    }

    /**
     * 查询租户Job执行结果
     *
     * 查询租户Job执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse>
     */
    public AsyncInvoker<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfoAsyncInvoker(ShowJobInfoRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showJobInfo, hcClient);
    }

    /**
     * 查询迁移任务详情
     *
     * 查询迁移任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskRequest 请求对象
     * @return CompletableFuture<ShowMigrationTaskResponse>
     */
    public CompletableFuture<ShowMigrationTaskResponse> showMigrationTaskAsync(ShowMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    /**
     * 查询迁移任务详情
     *
     * 查询迁移任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskRequest 请求对象
     * @return AsyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse>
     */
    public AsyncInvoker<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTaskAsyncInvoker(
        ShowMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showMigrationTask, hcClient);
    }

    /**
     * 查询在线迁移进度明细
     *
     * 查询在线迁移进度明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskStatsRequest 请求对象
     * @return CompletableFuture<ShowMigrationTaskStatsResponse>
     */
    public CompletableFuture<ShowMigrationTaskStatsResponse> showMigrationTaskStatsAsync(
        ShowMigrationTaskStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showMigrationTaskStats);
    }

    /**
     * 查询在线迁移进度明细
     *
     * 查询在线迁移进度明细。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMigrationTaskStatsRequest 请求对象
     * @return AsyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse>
     */
    public AsyncInvoker<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStatsAsyncInvoker(
        ShowMigrationTaskStatsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showMigrationTaskStats, hcClient);
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
     * @return CompletableFuture<ShowNodesInformationResponse>
     */
    public CompletableFuture<ShowNodesInformationResponse> showNodesInformationAsync(
        ShowNodesInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showNodesInformation);
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
     * @return AsyncInvoker<ShowNodesInformationRequest, ShowNodesInformationResponse>
     */
    public AsyncInvoker<ShowNodesInformationRequest, ShowNodesInformationResponse> showNodesInformationAsyncInvoker(
        ShowNodesInformationRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showNodesInformation, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaOfTenantRequest 请求对象
     * @return CompletableFuture<ShowQuotaOfTenantResponse>
     */
    public CompletableFuture<ShowQuotaOfTenantResponse> showQuotaOfTenantAsync(ShowQuotaOfTenantRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    /**
     * 查询租户配额
     *
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaOfTenantRequest 请求对象
     * @return AsyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse>
     */
    public AsyncInvoker<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenantAsyncInvoker(
        ShowQuotaOfTenantRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showQuotaOfTenant, hcClient);
    }

    /**
     * 获取副本状态
     *
     * 获取副本状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationStatesRequest 请求对象
     * @return CompletableFuture<ShowReplicationStatesResponse>
     */
    public CompletableFuture<ShowReplicationStatesResponse> showReplicationStatesAsync(
        ShowReplicationStatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showReplicationStates);
    }

    /**
     * 获取副本状态
     *
     * 获取副本状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationStatesRequest 请求对象
     * @return AsyncInvoker<ShowReplicationStatesRequest, ShowReplicationStatesResponse>
     */
    public AsyncInvoker<ShowReplicationStatesRequest, ShowReplicationStatesResponse> showReplicationStatesAsyncInvoker(
        ShowReplicationStatesRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showReplicationStates, hcClient);
    }

    /**
     * 查询单个实例标签
     *
     * 通过实例ID查询标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return CompletableFuture<ShowTagsResponse>
     */
    public CompletableFuture<ShowTagsResponse> showTagsAsync(ShowTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showTags);
    }

    /**
     * 查询单个实例标签
     *
     * 通过实例ID查询标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return AsyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public AsyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsAsyncInvoker(ShowTagsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showTags, hcClient);
    }

    /**
     * 提交前置检查任务
     *
     * 提交前置检查任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceResizeCheckJobRequest 请求对象
     * @return CompletableFuture<StartInstanceResizeCheckJobResponse>
     */
    public CompletableFuture<StartInstanceResizeCheckJobResponse> startInstanceResizeCheckJobAsync(
        StartInstanceResizeCheckJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.startInstanceResizeCheckJob);
    }

    /**
     * 提交前置检查任务
     *
     * 提交前置检查任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceResizeCheckJobRequest 请求对象
     * @return AsyncInvoker<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse>
     */
    public AsyncInvoker<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse> startInstanceResizeCheckJobAsyncInvoker(
        StartInstanceResizeCheckJobRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.startInstanceResizeCheckJob, hcClient);
    }

    /**
     * 停止数据迁移任务
     *
     * 停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskRequest 请求对象
     * @return CompletableFuture<StopMigrationTaskResponse>
     */
    public CompletableFuture<StopMigrationTaskResponse> stopMigrationTaskAsync(StopMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    /**
     * 停止数据迁移任务
     *
     * 停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskRequest 请求对象
     * @return AsyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse>
     */
    public AsyncInvoker<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTaskAsyncInvoker(
        StopMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.stopMigrationTask, hcClient);
    }

    /**
     * 同步停止数据迁移任务
     *
     * 同步停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskSyncRequest 请求对象
     * @return CompletableFuture<StopMigrationTaskSyncResponse>
     */
    public CompletableFuture<StopMigrationTaskSyncResponse> stopMigrationTaskSyncAsync(
        StopMigrationTaskSyncRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.stopMigrationTaskSync);
    }

    /**
     * 同步停止数据迁移任务
     *
     * 同步停止数据迁移任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopMigrationTaskSyncRequest 请求对象
     * @return AsyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse>
     */
    public AsyncInvoker<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> stopMigrationTaskSyncAsyncInvoker(
        StopMigrationTaskSyncRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.stopMigrationTaskSync, hcClient);
    }

    /**
     * 修改ACL角色
     *
     * 修改用户的类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRequest 请求对象
     * @return CompletableFuture<UpdateAclAccountResponse>
     */
    public CompletableFuture<UpdateAclAccountResponse> updateAclAccountAsync(UpdateAclAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateAclAccount);
    }

    /**
     * 修改ACL角色
     *
     * 修改用户的类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRequest 请求对象
     * @return AsyncInvoker<UpdateAclAccountRequest, UpdateAclAccountResponse>
     */
    public AsyncInvoker<UpdateAclAccountRequest, UpdateAclAccountResponse> updateAclAccountAsyncInvoker(
        UpdateAclAccountRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateAclAccount, hcClient);
    }

    /**
     * 修改ACL账号密码
     *
     * 修改ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountPassWordRequest 请求对象
     * @return CompletableFuture<UpdateAclAccountPassWordResponse>
     */
    public CompletableFuture<UpdateAclAccountPassWordResponse> updateAclAccountPassWordAsync(
        UpdateAclAccountPassWordRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateAclAccountPassWord);
    }

    /**
     * 修改ACL账号密码
     *
     * 修改ACL账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountPassWordRequest 请求对象
     * @return AsyncInvoker<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse>
     */
    public AsyncInvoker<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> updateAclAccountPassWordAsyncInvoker(
        UpdateAclAccountPassWordRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateAclAccountPassWord, hcClient);
    }

    /**
     * ACL账号修改备注
     *
     * ACL账号修改备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRemarkRequest 请求对象
     * @return CompletableFuture<UpdateAclAccountRemarkResponse>
     */
    public CompletableFuture<UpdateAclAccountRemarkResponse> updateAclAccountRemarkAsync(
        UpdateAclAccountRemarkRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateAclAccountRemark);
    }

    /**
     * ACL账号修改备注
     *
     * ACL账号修改备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAclAccountRemarkRequest 请求对象
     * @return AsyncInvoker<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse>
     */
    public AsyncInvoker<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> updateAclAccountRemarkAsyncInvoker(
        UpdateAclAccountRemarkRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateAclAccountRemark, hcClient);
    }

    /**
     * 修改实例分片带宽
     *
     * 修改实例分片带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateBandwidthResponse>
     */
    public CompletableFuture<UpdateBandwidthResponse> updateBandwidthAsync(UpdateBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateBandwidth);
    }

    /**
     * 修改实例分片带宽
     *
     * 修改实例分片带宽。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse>
     */
    public AsyncInvoker<UpdateBandwidthRequest, UpdateBandwidthResponse> updateBandwidthAsyncInvoker(
        UpdateBandwidthRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateBandwidth, hcClient);
    }

    /**
     * 设置大key自动分析配置
     *
     * 设置大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return CompletableFuture<UpdateBigkeyAutoscanConfigResponse>
     */
    public CompletableFuture<UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfigAsync(
        UpdateBigkeyAutoscanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateBigkeyAutoscanConfig);
    }

    /**
     * 设置大key自动分析配置
     *
     * 设置大key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBigkeyAutoscanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse>
     */
    public AsyncInvoker<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfigAsyncInvoker(
        UpdateBigkeyAutoscanConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateBigkeyAutoscanConfig, hcClient);
    }

    /**
     * 开启或关闭客户端ip透传
     *
     * 开启或关闭客户端ip透传
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientIpTransparentTransmissionRequest 请求对象
     * @return CompletableFuture<UpdateClientIpTransparentTransmissionResponse>
     */
    public CompletableFuture<UpdateClientIpTransparentTransmissionResponse> updateClientIpTransparentTransmissionAsync(
        UpdateClientIpTransparentTransmissionRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateClientIpTransparentTransmission);
    }

    /**
     * 开启或关闭客户端ip透传
     *
     * 开启或关闭客户端ip透传
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientIpTransparentTransmissionRequest 请求对象
     * @return AsyncInvoker<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse>
     */
    public AsyncInvoker<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse> updateClientIpTransparentTransmissionAsyncInvoker(
        UpdateClientIpTransparentTransmissionRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateClientIpTransparentTransmission, hcClient);
    }

    /**
     * 修改自定义模板
     *
     * 修改自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigTemplateRequest 请求对象
     * @return CompletableFuture<UpdateConfigTemplateResponse>
     */
    public CompletableFuture<UpdateConfigTemplateResponse> updateConfigTemplateAsync(
        UpdateConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateConfigTemplate);
    }

    /**
     * 修改自定义模板
     *
     * 修改自定义模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse>
     */
    public AsyncInvoker<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> updateConfigTemplateAsyncInvoker(
        UpdateConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateConfigTemplate, hcClient);
    }

    /**
     * 修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationsRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationsResponse>
     */
    public CompletableFuture<UpdateConfigurationsResponse> updateConfigurationsAsync(
        UpdateConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    /**
     * 修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationsRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse>
     */
    public AsyncInvoker<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurationsAsyncInvoker(
        UpdateConfigurationsRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateConfigurations, hcClient);
    }

    /**
     * 修改自动扫描配置
     *
     * 修改自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpireAutoScanConfigRequest 请求对象
     * @return CompletableFuture<UpdateExpireAutoScanConfigResponse>
     */
    public CompletableFuture<UpdateExpireAutoScanConfigResponse> updateExpireAutoScanConfigAsync(
        UpdateExpireAutoScanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateExpireAutoScanConfig);
    }

    /**
     * 修改自动扫描配置
     *
     * 修改自动扫描配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpireAutoScanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse>
     */
    public AsyncInvoker<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse> updateExpireAutoScanConfigAsyncInvoker(
        UpdateExpireAutoScanConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateExpireAutoScanConfig, hcClient);
    }

    /**
     * 设置热key自动分析配置
     *
     * 设置热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return CompletableFuture<UpdateHotkeyAutoScanConfigResponse>
     */
    public CompletableFuture<UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfigAsync(
        UpdateHotkeyAutoScanConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateHotkeyAutoScanConfig);
    }

    /**
     * 设置热key自动分析配置
     *
     * 设置热key自动分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHotkeyAutoScanConfigRequest 请求对象
     * @return AsyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse>
     */
    public AsyncInvoker<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfigAsyncInvoker(
        UpdateHotkeyAutoScanConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateHotkeyAutoScanConfig, hcClient);
    }

    /**
     * 修改实例信息
     *
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateInstance);
    }

    /**
     * 修改实例信息
     *
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateInstance, hcClient);
    }

    /**
     * 变更指定实例的带宽
     *
     * 变更指定实例的带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceBandwidthRequest 请求对象
     * @return CompletableFuture<UpdateInstanceBandwidthResponse>
     */
    public CompletableFuture<UpdateInstanceBandwidthResponse> updateInstanceBandwidthAsync(
        UpdateInstanceBandwidthRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateInstanceBandwidth);
    }

    /**
     * 变更指定实例的带宽
     *
     * 变更指定实例的带宽
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceBandwidthRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse>
     */
    public AsyncInvoker<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> updateInstanceBandwidthAsyncInvoker(
        UpdateInstanceBandwidthRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateInstanceBandwidth, hcClient);
    }

    /**
     * 更新实例带宽弹性伸缩策略
     *
     * 更新实例带宽弹性伸缩策略。暂不支持实例带宽自动回缩。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceBandwidthAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<UpdateInstanceBandwidthAutoScalingPolicyResponse>
     */
    public CompletableFuture<UpdateInstanceBandwidthAutoScalingPolicyResponse> updateInstanceBandwidthAutoScalingPolicyAsync(
        UpdateInstanceBandwidthAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateInstanceBandwidthAutoScalingPolicy);
    }

    /**
     * 更新实例带宽弹性伸缩策略
     *
     * 更新实例带宽弹性伸缩策略。暂不支持实例带宽自动回缩。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceBandwidthAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceBandwidthAutoScalingPolicyRequest, UpdateInstanceBandwidthAutoScalingPolicyResponse>
     */
    public AsyncInvoker<UpdateInstanceBandwidthAutoScalingPolicyRequest, UpdateInstanceBandwidthAutoScalingPolicyResponse> updateInstanceBandwidthAutoScalingPolicyAsyncInvoker(
        UpdateInstanceBandwidthAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateInstanceBandwidthAutoScalingPolicy, hcClient);
    }

    /**
     * 异步修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigResponse>
     */
    public CompletableFuture<UpdateInstanceConfigResponse> updateInstanceConfigAsync(
        UpdateInstanceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateInstanceConfig);
    }

    /**
     * 异步修改实例配置参数
     *
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> updateInstanceConfigAsyncInvoker(
        UpdateInstanceConfigRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateInstanceConfig, hcClient);
    }

    /**
     * 设置迁移任务自动重连
     *
     * 设置迁移任务自动重连
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMigrationTaskRequest 请求对象
     * @return CompletableFuture<UpdateMigrationTaskResponse>
     */
    public CompletableFuture<UpdateMigrationTaskResponse> updateMigrationTaskAsync(UpdateMigrationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateMigrationTask);
    }

    /**
     * 设置迁移任务自动重连
     *
     * 设置迁移任务自动重连
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMigrationTaskRequest 请求对象
     * @return AsyncInvoker<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse>
     */
    public AsyncInvoker<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse> updateMigrationTaskAsyncInvoker(
        UpdateMigrationTaskRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateMigrationTask, hcClient);
    }

    /**
     * 修改密码
     *
     * 修改缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordRequest 请求对象
     * @return CompletableFuture<UpdatePasswordResponse>
     */
    public CompletableFuture<UpdatePasswordResponse> updatePasswordAsync(UpdatePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updatePassword);
    }

    /**
     * 修改密码
     *
     * 修改缓存实例的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordRequest 请求对象
     * @return AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse>
     */
    public AsyncInvoker<UpdatePasswordRequest, UpdatePasswordResponse> updatePasswordAsyncInvoker(
        UpdatePasswordRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updatePassword, hcClient);
    }

    /**
     * 开启/修改实例公网访问
     *
     * 开启/修改实例公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicIpRequest 请求对象
     * @return CompletableFuture<UpdatePublicIpResponse>
     */
    public CompletableFuture<UpdatePublicIpResponse> updatePublicIpAsync(UpdatePublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updatePublicIp);
    }

    /**
     * 开启/修改实例公网访问
     *
     * 开启/修改实例公网访问。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicIpRequest 请求对象
     * @return AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse>
     */
    public AsyncInvoker<UpdatePublicIpRequest, UpdatePublicIpResponse> updatePublicIpAsyncInvoker(
        UpdatePublicIpRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updatePublicIp, hcClient);
    }

    /**
     * 设置备节点优先级
     *
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlavePriorityRequest 请求对象
     * @return CompletableFuture<UpdateSlavePriorityResponse>
     */
    public CompletableFuture<UpdateSlavePriorityResponse> updateSlavePriorityAsync(UpdateSlavePriorityRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    /**
     * 设置备节点优先级
     *
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlavePriorityRequest 请求对象
     * @return AsyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse>
     */
    public AsyncInvoker<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriorityAsyncInvoker(
        UpdateSlavePriorityRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateSlavePriority, hcClient);
    }

    /**
     * 开启/关闭SSL
     *
     * 开启/关闭SSL。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSslSwitchRequest 请求对象
     * @return CompletableFuture<UpdateSslSwitchResponse>
     */
    public CompletableFuture<UpdateSslSwitchResponse> updateSslSwitchAsync(UpdateSslSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateSslSwitch);
    }

    /**
     * 开启/关闭SSL
     *
     * 开启/关闭SSL。该接口目前仅针对Redis 6.0[基础版](tag:hws,hws_hk)版本实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSslSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateSslSwitchRequest, UpdateSslSwitchResponse>
     */
    public AsyncInvoker<UpdateSslSwitchRequest, UpdateSslSwitchResponse> updateSslSwitchAsyncInvoker(
        UpdateSslSwitchRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateSslSwitch, hcClient);
    }

    /**
     * 升级实例小版本
     *
     * 升级实例小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceMinorVersionRequest 请求对象
     * @return CompletableFuture<UpgradeInstanceMinorVersionResponse>
     */
    public CompletableFuture<UpgradeInstanceMinorVersionResponse> upgradeInstanceMinorVersionAsync(
        UpgradeInstanceMinorVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.upgradeInstanceMinorVersion);
    }

    /**
     * 升级实例小版本
     *
     * 升级实例小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceMinorVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeInstanceMinorVersionRequest, UpgradeInstanceMinorVersionResponse>
     */
    public AsyncInvoker<UpgradeInstanceMinorVersionRequest, UpgradeInstanceMinorVersionResponse> upgradeInstanceMinorVersionAsyncInvoker(
        UpgradeInstanceMinorVersionRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.upgradeInstanceMinorVersion, hcClient);
    }

    /**
     * 校验集群副本是否支持删除
     *
     * 校验集群副本是否支持删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDeletableReplicaRequest 请求对象
     * @return CompletableFuture<ValidateDeletableReplicaResponse>
     */
    public CompletableFuture<ValidateDeletableReplicaResponse> validateDeletableReplicaAsync(
        ValidateDeletableReplicaRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.validateDeletableReplica);
    }

    /**
     * 校验集群副本是否支持删除
     *
     * 校验集群副本是否支持删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateDeletableReplicaRequest 请求对象
     * @return AsyncInvoker<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse>
     */
    public AsyncInvoker<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse> validateDeletableReplicaAsyncInvoker(
        ValidateDeletableReplicaRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.validateDeletableReplica, hcClient);
    }

    /**
     * 查询指定实例的IP白名单
     *
     * 查询指定实例的IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpWhitelistRequest 请求对象
     * @return CompletableFuture<ShowIpWhitelistResponse>
     */
    public CompletableFuture<ShowIpWhitelistResponse> showIpWhitelistAsync(ShowIpWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    /**
     * 查询指定实例的IP白名单
     *
     * 查询指定实例的IP白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpWhitelistRequest 请求对象
     * @return AsyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse>
     */
    public AsyncInvoker<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelistAsyncInvoker(
        ShowIpWhitelistRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.showIpWhitelist, hcClient);
    }

    /**
     * 设置IP白名单分组
     *
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpWhitelistRequest 请求对象
     * @return CompletableFuture<UpdateIpWhitelistResponse>
     */
    public CompletableFuture<UpdateIpWhitelistResponse> updateIpWhitelistAsync(UpdateIpWhitelistRequest request) {
        return hcClient.asyncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

    /**
     * 设置IP白名单分组
     *
     * 为指定实例设置IP白名单分组，包含创建、停用、编辑、删除白名单四个功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpWhitelistRequest 请求对象
     * @return AsyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse>
     */
    public AsyncInvoker<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelistAsyncInvoker(
        UpdateIpWhitelistRequest request) {
        return new AsyncInvoker<>(request, DcsMeta.updateIpWhitelist, hcClient);
    }

}

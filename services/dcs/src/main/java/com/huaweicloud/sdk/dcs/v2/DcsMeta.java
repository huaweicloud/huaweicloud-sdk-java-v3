package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dcs.v2.model.AclAccountModifyPasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.AclAccountResetPasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.AclAccountRoleModifyBody;
import com.huaweicloud.sdk.dcs.v2.model.AutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.BackupInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchCreateOrDeleteTagsResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchDeleteInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchRestartOnlineMigrationTasksBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchRestartOnlineMigrationTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchRestartOnlineMigrationTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchShowNodesInformationResponse;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksBody;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksRequest;
import com.huaweicloud.sdk.dcs.v2.model.BatchStopMigrationTasksResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeInstanceStatusBody;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyAsyncRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyAsyncResponse;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ChangeMasterStandbyResponse;
import com.huaweicloud.sdk.dcs.v2.model.CopyInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.CopyInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateAutoExpireScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateAutoExpireScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateBigkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateBigkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateCustomTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateDiagnosisTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateHotkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateHotkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateOnlineMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateOrDeleteInstanceTags;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogDownloadLinkRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogDownloadLinkResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateRedislogResponse;
import com.huaweicloud.sdk.dcs.v2.model.CreateResizeOrderRequest;
import com.huaweicloud.sdk.dcs.v2.model.CreateResizeOrderRequestBody;
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
import com.huaweicloud.sdk.dcs.v2.model.DeleteCenterTaskRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.DeleteCenterTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteDiagnosisReportRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteDiagnosisTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteDiagnosisTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteHotkeyScanTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteHotkeyScanTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteIpFromDomainNameResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrateTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.DeleteSingleInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.DeleteSingleInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.DownloadBackupFilesReq;
import com.huaweicloud.sdk.dcs.v2.model.DownloadSslCertRequest;
import com.huaweicloud.sdk.dcs.v2.model.DownloadSslCertResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExchangeInstanceIpRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExchangeInstanceIpResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteClusterSwitchoverRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteClusterSwitchoverResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteCommandMobilizationRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteCommandMobilizationResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExecuteCommandRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.ExportExcelJobRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExportExcelJobResponse;
import com.huaweicloud.sdk.dcs.v2.model.ExportInstancesTaskBody;
import com.huaweicloud.sdk.dcs.v2.model.ExportInstancesTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.ExportInstancesTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.HangUpClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.HangUpClientsRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.HangUpClientsResponse;
import com.huaweicloud.sdk.dcs.v2.model.HangUpKillAllClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.HangUpKillAllClientsRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.HangUpKillAllClientsResponse;
import com.huaweicloud.sdk.dcs.v2.model.InstanceReplicationListInfo;
import com.huaweicloud.sdk.dcs.v2.model.IpExchangeRequest;
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
import com.huaweicloud.sdk.dcs.v2.model.LoginWebCliBody;
import com.huaweicloud.sdk.dcs.v2.model.LoginWebCliRequest;
import com.huaweicloud.sdk.dcs.v2.model.LoginWebCliResponse;
import com.huaweicloud.sdk.dcs.v2.model.LogoffWebCliRequest;
import com.huaweicloud.sdk.dcs.v2.model.LogoffWebCliResponse;
import com.huaweicloud.sdk.dcs.v2.model.LogoutWebCliBody;
import com.huaweicloud.sdk.dcs.v2.model.MigrationUpdateRequestEntity;
import com.huaweicloud.sdk.dcs.v2.model.ModifyInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.ModifyInstancePasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.ModifyIpWhitelistBody;
import com.huaweicloud.sdk.dcs.v2.model.ModifyRedisConfigBody;
import com.huaweicloud.sdk.dcs.v2.model.PriorityBody;
import com.huaweicloud.sdk.dcs.v2.model.ResetAclAccountPassWordRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResetAclAccountPassWordResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResetInstancePasswordBody;
import com.huaweicloud.sdk.dcs.v2.model.ResetPasswordRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResetPasswordResponse;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.RestartOrFlushInstancesRequest;
import com.huaweicloud.sdk.dcs.v2.model.RestartOrFlushInstancesResponse;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceBody;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.dcs.v2.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.dcs.v2.model.ScanClientsRequest;
import com.huaweicloud.sdk.dcs.v2.model.ScanClientsRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.ScanClientsResponse;
import com.huaweicloud.sdk.dcs.v2.model.ScanExpireKeyRequest;
import com.huaweicloud.sdk.dcs.v2.model.ScanExpireKeyResponse;
import com.huaweicloud.sdk.dcs.v2.model.SetOnlineMigrationTaskBody;
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
import com.huaweicloud.sdk.dcs.v2.model.StartInstanceResizeCheckJobRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.StartInstanceResizeCheckJobResponse;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskRequest;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskResponse;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskSyncRequest;
import com.huaweicloud.sdk.dcs.v2.model.StopMigrationTaskSyncResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountPassWordRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountPassWordResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRemarkResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAclAccountResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateAutoScanConfigRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBigkeyAutoscanConfigRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateBigkeyAutoscanConfigResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateClientIpTransparentTransmissionRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateClientIpTransparentTransmissionRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.UpdateClientIpTransparentTransmissionResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigTemplateRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigTemplateResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigurationsRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateConfigurationsResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateCustomTemplateBody;
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
import com.huaweicloud.sdk.dcs.v2.model.UpdateSSLSwitchRequestBody;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSlavePriorityResponse;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSslSwitchRequest;
import com.huaweicloud.sdk.dcs.v2.model.UpdateSslSwitchResponse;
import com.huaweicloud.sdk.dcs.v2.model.ValidateDeletableReplicaRequest;
import com.huaweicloud.sdk.dcs.v2.model.ValidateDeletableReplicaResponse;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unchecked")
public class DcsMeta {

    public static final HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> batchCreateOrDeleteTags =
        genForBatchCreateOrDeleteTags();

    private static HttpRequestDef<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> genForBatchCreateOrDeleteTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateOrDeleteTagsRequest, BatchCreateOrDeleteTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateOrDeleteTagsRequest.class, BatchCreateOrDeleteTagsResponse.class)
            .withName("BatchCreateOrDeleteTags")
            .withUri("/v2/{project_id}/dcs/{instance_id}/tags/action")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getInstanceId,
                BatchCreateOrDeleteTagsRequest::setInstanceId));
        builder.<CreateOrDeleteInstanceTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrDeleteInstanceTags.class),
            f -> f.withMarshaller(BatchCreateOrDeleteTagsRequest::getBody, BatchCreateOrDeleteTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> batchDeleteInstances =
        genForBatchDeleteInstances();

    private static HttpRequestDef<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> genForBatchDeleteInstances() {
        // basic
        HttpRequestDef.Builder<BatchDeleteInstancesRequest, BatchDeleteInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteInstancesRequest.class, BatchDeleteInstancesResponse.class)
            .withName("BatchDeleteInstances")
            .withUri("/v2/{project_id}/instances")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<Boolean>withRequestField("all_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getAllFailure,
                BatchDeleteInstancesRequest::setAllFailure));
        builder.<BatchDeleteBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchDeleteBody.class),
            f -> f.withMarshaller(BatchDeleteInstancesRequest::getBody, BatchDeleteInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestartOnlineMigrationTasksRequest, BatchRestartOnlineMigrationTasksResponse> batchRestartOnlineMigrationTasks =
        genForBatchRestartOnlineMigrationTasks();

    private static HttpRequestDef<BatchRestartOnlineMigrationTasksRequest, BatchRestartOnlineMigrationTasksResponse> genForBatchRestartOnlineMigrationTasks() {
        // basic
        HttpRequestDef.Builder<BatchRestartOnlineMigrationTasksRequest, BatchRestartOnlineMigrationTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRestartOnlineMigrationTasksRequest.class,
                    BatchRestartOnlineMigrationTasksResponse.class)
                .withName("BatchRestartOnlineMigrationTasks")
                .withUri("/v2/{project_id}/migration-tasks/batch-restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchRestartOnlineMigrationTasksBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchRestartOnlineMigrationTasksBody.class),
            f -> f.withMarshaller(BatchRestartOnlineMigrationTasksRequest::getBody,
                BatchRestartOnlineMigrationTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> batchShowNodesInformation =
        genForBatchShowNodesInformation();

    private static HttpRequestDef<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> genForBatchShowNodesInformation() {
        // basic
        HttpRequestDef.Builder<BatchShowNodesInformationRequest, BatchShowNodesInformationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    BatchShowNodesInformationRequest.class,
                    BatchShowNodesInformationResponse.class)
                .withName("BatchShowNodesInformation")
                .withUri("/v2/{project_id}/instances-logical-nodes")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowNodesInformationRequest::getOffset,
                BatchShowNodesInformationRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(BatchShowNodesInformationRequest::getLimit,
                BatchShowNodesInformationRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> batchStopMigrationTasks =
        genForBatchStopMigrationTasks();

    private static HttpRequestDef<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> genForBatchStopMigrationTasks() {
        // basic
        HttpRequestDef.Builder<BatchStopMigrationTasksRequest, BatchStopMigrationTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchStopMigrationTasksRequest.class, BatchStopMigrationTasksResponse.class)
            .withName("BatchStopMigrationTasks")
            .withUri("/v2/{project_id}/migration-task/batch-stop")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchStopMigrationTasksBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchStopMigrationTasksBody.class),
            f -> f.withMarshaller(BatchStopMigrationTasksRequest::getBody, BatchStopMigrationTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> changeMasterStandby =
        genForChangeMasterStandby();

    private static HttpRequestDef<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> genForChangeMasterStandby() {
        // basic
        HttpRequestDef.Builder<ChangeMasterStandbyRequest, ChangeMasterStandbyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeMasterStandbyRequest.class, ChangeMasterStandbyResponse.class)
                .withName("ChangeMasterStandby")
                .withUri("/v2/{project_id}/instances/{instance_id}/swap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeMasterStandbyRequest::getInstanceId,
                ChangeMasterStandbyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse> changeMasterStandbyAsync =
        genForChangeMasterStandbyAsync();

    private static HttpRequestDef<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse> genForChangeMasterStandbyAsync() {
        // basic
        HttpRequestDef.Builder<ChangeMasterStandbyAsyncRequest, ChangeMasterStandbyAsyncResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, ChangeMasterStandbyAsyncRequest.class, ChangeMasterStandbyAsyncResponse.class)
                .withName("ChangeMasterStandbyAsync")
                .withUri("/v2/{project_id}/instances/{instance_id}/async-swap")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeMasterStandbyAsyncRequest::getInstanceId,
                ChangeMasterStandbyAsyncRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyInstanceRequest, CopyInstanceResponse> copyInstance = genForCopyInstance();

    private static HttpRequestDef<CopyInstanceRequest, CopyInstanceResponse> genForCopyInstance() {
        // basic
        HttpRequestDef.Builder<CopyInstanceRequest, CopyInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyInstanceRequest.class, CopyInstanceResponse.class)
                .withName("CopyInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceRequest::getInstanceId, CopyInstanceRequest::setInstanceId));
        builder.<BackupInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BackupInstanceBody.class),
            f -> f.withMarshaller(CopyInstanceRequest::getBody, CopyInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAclAccountRequest, CreateAclAccountResponse> createAclAccount =
        genForCreateAclAccount();

    private static HttpRequestDef<CreateAclAccountRequest, CreateAclAccountResponse> genForCreateAclAccount() {
        // basic
        HttpRequestDef.Builder<CreateAclAccountRequest, CreateAclAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAclAccountRequest.class, CreateAclAccountResponse.class)
                .withName("CreateAclAccount")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAclAccountRequest::getInstanceId, CreateAclAccountRequest::setInstanceId));
        builder.<CreateAclAccountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAclAccountRequestBody.class),
            f -> f.withMarshaller(CreateAclAccountRequest::getBody, CreateAclAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> createAutoExpireScanTask =
        genForCreateAutoExpireScanTask();

    private static HttpRequestDef<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> genForCreateAutoExpireScanTask() {
        // basic
        HttpRequestDef.Builder<CreateAutoExpireScanTaskRequest, CreateAutoExpireScanTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAutoExpireScanTaskRequest.class, CreateAutoExpireScanTaskResponse.class)
                .withName("CreateAutoExpireScanTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/scan-expire-keys-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAutoExpireScanTaskRequest::getInstanceId,
                CreateAutoExpireScanTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> createBigkeyScanTask =
        genForCreateBigkeyScanTask();

    private static HttpRequestDef<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> genForCreateBigkeyScanTask() {
        // basic
        HttpRequestDef.Builder<CreateBigkeyScanTaskRequest, CreateBigkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBigkeyScanTaskRequest.class, CreateBigkeyScanTaskResponse.class)
            .withName("CreateBigkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBigkeyScanTaskRequest::getInstanceId,
                CreateBigkeyScanTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomTemplateRequest, CreateCustomTemplateResponse> createCustomTemplate =
        genForCreateCustomTemplate();

    private static HttpRequestDef<CreateCustomTemplateRequest, CreateCustomTemplateResponse> genForCreateCustomTemplate() {
        // basic
        HttpRequestDef.Builder<CreateCustomTemplateRequest, CreateCustomTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateCustomTemplateRequest.class, CreateCustomTemplateResponse.class)
            .withName("CreateCustomTemplate")
            .withUri("/v2/{project_id}/config-templates")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateCustomTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomTemplateBody.class),
            f -> f.withMarshaller(CreateCustomTemplateRequest::getBody, CreateCustomTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> createDiagnosisTask =
        genForCreateDiagnosisTask();

    private static HttpRequestDef<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> genForCreateDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<CreateDiagnosisTaskRequest, CreateDiagnosisTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDiagnosisTaskRequest.class, CreateDiagnosisTaskResponse.class)
                .withName("CreateDiagnosisTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getInstanceId,
                CreateDiagnosisTaskRequest::setInstanceId));
        builder.<CreateDiagnosisTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDiagnosisTaskBody.class),
            f -> f.withMarshaller(CreateDiagnosisTaskRequest::getBody, CreateDiagnosisTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> createHotkeyScanTask =
        genForCreateHotkeyScanTask();

    private static HttpRequestDef<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> genForCreateHotkeyScanTask() {
        // basic
        HttpRequestDef.Builder<CreateHotkeyScanTaskRequest, CreateHotkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateHotkeyScanTaskRequest.class, CreateHotkeyScanTaskResponse.class)
            .withName("CreateHotkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHotkeyScanTaskRequest::getInstanceId,
                CreateHotkeyScanTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForCreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForCreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceBody.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMigrationTaskRequest, CreateMigrationTaskResponse> createMigrationTask =
        genForCreateMigrationTask();

    private static HttpRequestDef<CreateMigrationTaskRequest, CreateMigrationTaskResponse> genForCreateMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateMigrationTaskRequest, CreateMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMigrationTaskRequest.class, CreateMigrationTaskResponse.class)
                .withName("CreateMigrationTask")
                .withUri("/v2/{project_id}/migration-task")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateMigrationTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMigrationTaskBody.class),
            f -> f.withMarshaller(CreateMigrationTaskRequest::getBody, CreateMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> createOnlineMigrationTask =
        genForCreateOnlineMigrationTask();

    private static HttpRequestDef<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> genForCreateOnlineMigrationTask() {
        // basic
        HttpRequestDef.Builder<CreateOnlineMigrationTaskRequest, CreateOnlineMigrationTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOnlineMigrationTaskRequest.class,
                    CreateOnlineMigrationTaskResponse.class)
                .withName("CreateOnlineMigrationTask")
                .withUri("/v2/{project_id}/migration/instance")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateOnlineMigrationTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOnlineMigrationTaskBody.class),
            f -> f.withMarshaller(CreateOnlineMigrationTaskRequest::getBody,
                CreateOnlineMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRedislogRequest, CreateRedislogResponse> createRedislog =
        genForCreateRedislog();

    private static HttpRequestDef<CreateRedislogRequest, CreateRedislogResponse> genForCreateRedislog() {
        // basic
        HttpRequestDef.Builder<CreateRedislogRequest, CreateRedislogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRedislogRequest.class, CreateRedislogResponse.class)
                .withName("CreateRedislog")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogRequest::getInstanceId, CreateRedislogRequest::setInstanceId));
        builder.<CreateRedislogRequest.QueryTimeEnum>withRequestField("query_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRedislogRequest.QueryTimeEnum.class),
            f -> f.withMarshaller(CreateRedislogRequest::getQueryTime, CreateRedislogRequest::setQueryTime));
        builder.<String>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogRequest::getLogType, CreateRedislogRequest::setLogType));
        builder.<String>withRequestField("replication_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogRequest::getReplicationId, CreateRedislogRequest::setReplicationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> createRedislogDownloadLink =
        genForCreateRedislogDownloadLink();

    private static HttpRequestDef<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> genForCreateRedislogDownloadLink() {
        // basic
        HttpRequestDef.Builder<CreateRedislogDownloadLinkRequest, CreateRedislogDownloadLinkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRedislogDownloadLinkRequest.class,
                    CreateRedislogDownloadLinkResponse.class)
                .withName("CreateRedislogDownloadLink")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog/{id}/links")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogDownloadLinkRequest::getInstanceId,
                CreateRedislogDownloadLinkRequest::setInstanceId));
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRedislogDownloadLinkRequest::getId, CreateRedislogDownloadLinkRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResizeOrderRequest, CreateResizeOrderResponse> createResizeOrder =
        genForCreateResizeOrder();

    private static HttpRequestDef<CreateResizeOrderRequest, CreateResizeOrderResponse> genForCreateResizeOrder() {
        // basic
        HttpRequestDef.Builder<CreateResizeOrderRequest, CreateResizeOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResizeOrderRequest.class, CreateResizeOrderResponse.class)
                .withName("CreateResizeOrder")
                .withUri("/v2/{project_id}/orders/instances/{instance_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateResizeOrderRequest::getInstanceId, CreateResizeOrderRequest::setInstanceId));
        builder.<CreateResizeOrderRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateResizeOrderRequestBody.class),
            f -> f.withMarshaller(CreateResizeOrderRequest::getBody, CreateResizeOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclAccountRequest, DeleteAclAccountResponse> deleteAclAccount =
        genForDeleteAclAccount();

    private static HttpRequestDef<DeleteAclAccountRequest, DeleteAclAccountResponse> genForDeleteAclAccount() {
        // basic
        HttpRequestDef.Builder<DeleteAclAccountRequest, DeleteAclAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclAccountRequest.class, DeleteAclAccountResponse.class)
                .withName("DeleteAclAccount")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclAccountRequest::getInstanceId, DeleteAclAccountRequest::setInstanceId));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclAccountRequest::getAccountId, DeleteAclAccountRequest::setAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> deleteBackgroundTask =
        genForDeleteBackgroundTask();

    private static HttpRequestDef<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> genForDeleteBackgroundTask() {
        // basic
        HttpRequestDef.Builder<DeleteBackgroundTaskRequest, DeleteBackgroundTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackgroundTaskRequest.class, DeleteBackgroundTaskResponse.class)
            .withName("DeleteBackgroundTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getInstanceId,
                DeleteBackgroundTaskRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackgroundTaskRequest::getTaskId, DeleteBackgroundTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackupFileRequest, DeleteBackupFileResponse> deleteBackupFile =
        genForDeleteBackupFile();

    private static HttpRequestDef<DeleteBackupFileRequest, DeleteBackupFileResponse> genForDeleteBackupFile() {
        // basic
        HttpRequestDef.Builder<DeleteBackupFileRequest, DeleteBackupFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteBackupFileRequest.class, DeleteBackupFileResponse.class)
                .withName("DeleteBackupFile")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupFileRequest::getBackupId, DeleteBackupFileRequest::setBackupId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackupFileRequest::getInstanceId, DeleteBackupFileRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> deleteBigkeyScanTask =
        genForDeleteBigkeyScanTask();

    private static HttpRequestDef<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> genForDeleteBigkeyScanTask() {
        // basic
        HttpRequestDef.Builder<DeleteBigkeyScanTaskRequest, DeleteBigkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBigkeyScanTaskRequest.class, DeleteBigkeyScanTaskResponse.class)
            .withName("DeleteBigkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task/{bigkey_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBigkeyScanTaskRequest::getInstanceId,
                DeleteBigkeyScanTaskRequest::setInstanceId));
        builder.<String>withRequestField("bigkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBigkeyScanTaskRequest::getBigkeyId, DeleteBigkeyScanTaskRequest::setBigkeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCenterTaskRequest, DeleteCenterTaskResponse> deleteCenterTask =
        genForDeleteCenterTask();

    private static HttpRequestDef<DeleteCenterTaskRequest, DeleteCenterTaskResponse> genForDeleteCenterTask() {
        // basic
        HttpRequestDef.Builder<DeleteCenterTaskRequest, DeleteCenterTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCenterTaskRequest.class, DeleteCenterTaskResponse.class)
                .withName("DeleteCenterTask")
                .withUri("/v2/{project_id}/tasks/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCenterTaskRequest::getTaskId, DeleteCenterTaskRequest::setTaskId));
        builder.<DeleteCenterTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteCenterTaskRequestBody.class),
            f -> f.withMarshaller(DeleteCenterTaskRequest::getBody, DeleteCenterTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> deleteConfigTemplate =
        genForDeleteConfigTemplate();

    private static HttpRequestDef<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> genForDeleteConfigTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteConfigTemplateRequest, DeleteConfigTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConfigTemplateRequest.class, DeleteConfigTemplateResponse.class)
            .withName("DeleteConfigTemplate")
            .withUri("/v2/{project_id}/config-templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigTemplateRequest::getTemplateId,
                DeleteConfigTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse> deleteDiagnosisTask =
        genForDeleteDiagnosisTask();

    private static HttpRequestDef<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse> genForDeleteDiagnosisTask() {
        // basic
        HttpRequestDef.Builder<DeleteDiagnosisTaskRequest, DeleteDiagnosisTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDiagnosisTaskRequest.class, DeleteDiagnosisTaskResponse.class)
            .withName("DeleteDiagnosisTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDiagnosisTaskRequest::getInstanceId,
                DeleteDiagnosisTaskRequest::setInstanceId));
        builder.<DeleteDiagnosisReportRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDiagnosisReportRequest.class),
            f -> f.withMarshaller(DeleteDiagnosisTaskRequest::getBody, DeleteDiagnosisTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> deleteHotkeyScanTask =
        genForDeleteHotkeyScanTask();

    private static HttpRequestDef<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> genForDeleteHotkeyScanTask() {
        // basic
        HttpRequestDef.Builder<DeleteHotkeyScanTaskRequest, DeleteHotkeyScanTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHotkeyScanTaskRequest.class, DeleteHotkeyScanTaskResponse.class)
            .withName("DeleteHotkeyScanTask")
            .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task/{hotkey_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotkeyScanTaskRequest::getInstanceId,
                DeleteHotkeyScanTaskRequest::setInstanceId));
        builder.<String>withRequestField("hotkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHotkeyScanTaskRequest::getHotkeyId, DeleteHotkeyScanTaskRequest::setHotkeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> deleteIpFromDomainName =
        genForDeleteIpFromDomainName();

    private static HttpRequestDef<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> genForDeleteIpFromDomainName() {
        // basic
        HttpRequestDef.Builder<DeleteIpFromDomainNameRequest, DeleteIpFromDomainNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteIpFromDomainNameRequest.class, DeleteIpFromDomainNameResponse.class)
            .withName("DeleteIpFromDomainName")
            .withUri("/v2/{project_id}/instances/{instance_id}/groups/{group_id}/replications/{node_id}/remove-ip")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getInstanceId,
                DeleteIpFromDomainNameRequest::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getGroupId,
                DeleteIpFromDomainNameRequest::setGroupId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIpFromDomainNameRequest::getNodeId, DeleteIpFromDomainNameRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> deleteMigrationTask =
        genForDeleteMigrationTask();

    private static HttpRequestDef<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> genForDeleteMigrationTask() {
        // basic
        HttpRequestDef.Builder<DeleteMigrationTaskRequest, DeleteMigrationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMigrationTaskRequest.class, DeleteMigrationTaskResponse.class)
            .withName("DeleteMigrationTask")
            .withUri("/v2/{project_id}/migration-tasks/delete")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<DeleteMigrateTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteMigrateTaskRequest.class),
            f -> f.withMarshaller(DeleteMigrationTaskRequest::getBody, DeleteMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> deleteSingleInstance =
        genForDeleteSingleInstance();

    private static HttpRequestDef<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> genForDeleteSingleInstance() {
        // basic
        HttpRequestDef.Builder<DeleteSingleInstanceRequest, DeleteSingleInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSingleInstanceRequest.class, DeleteSingleInstanceResponse.class)
            .withName("DeleteSingleInstance")
            .withUri("/v2/{project_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSingleInstanceRequest::getInstanceId,
                DeleteSingleInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadSslCertRequest, DownloadSslCertResponse> downloadSslCert =
        genForDownloadSslCert();

    private static HttpRequestDef<DownloadSslCertRequest, DownloadSslCertResponse> genForDownloadSslCert() {
        // basic
        HttpRequestDef.Builder<DownloadSslCertRequest, DownloadSslCertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadSslCertRequest.class, DownloadSslCertResponse.class)
                .withName("DownloadSslCert")
                .withUri("/v2/{project_id}/instances/{instance_id}/ssl-certs/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadSslCertRequest::getInstanceId, DownloadSslCertRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse> exchangeInstanceIp =
        genForExchangeInstanceIp();

    private static HttpRequestDef<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse> genForExchangeInstanceIp() {
        // basic
        HttpRequestDef.Builder<ExchangeInstanceIpRequest, ExchangeInstanceIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExchangeInstanceIpRequest.class, ExchangeInstanceIpResponse.class)
                .withName("ExchangeInstanceIp")
                .withUri("/v2/{project_id}/migration-task/{task_id}/exchange-ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExchangeInstanceIpRequest::getTaskId, ExchangeInstanceIpRequest::setTaskId));
        builder.<IpExchangeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(IpExchangeRequest.class),
            f -> f.withMarshaller(ExchangeInstanceIpRequest::getBody, ExchangeInstanceIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> executeClusterSwitchover =
        genForExecuteClusterSwitchover();

    private static HttpRequestDef<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> genForExecuteClusterSwitchover() {
        // basic
        HttpRequestDef.Builder<ExecuteClusterSwitchoverRequest, ExecuteClusterSwitchoverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteClusterSwitchoverRequest.class, ExecuteClusterSwitchoverResponse.class)
                .withName("ExecuteClusterSwitchover")
                .withUri(
                    "/v2/{project_id}/instance/{instance_id}/groups/{group_id}/replications/{node_id}/async-switchover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterSwitchoverRequest::getInstanceId,
                ExecuteClusterSwitchoverRequest::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterSwitchoverRequest::getGroupId,
                ExecuteClusterSwitchoverRequest::setGroupId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteClusterSwitchoverRequest::getNodeId,
                ExecuteClusterSwitchoverRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse> executeCommandMobilization =
        genForExecuteCommandMobilization();

    private static HttpRequestDef<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse> genForExecuteCommandMobilization() {
        // basic
        HttpRequestDef.Builder<ExecuteCommandMobilizationRequest, ExecuteCommandMobilizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteCommandMobilizationRequest.class,
                    ExecuteCommandMobilizationResponse.class)
                .withName("ExecuteCommandMobilization")
                .withUri("/v2/{project_id}/instances/{instance_id}/webcli/command")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteCommandMobilizationRequest::getInstanceId,
                ExecuteCommandMobilizationRequest::setInstanceId));
        builder.<ExecuteCommandRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExecuteCommandRequestBody.class),
            f -> f.withMarshaller(ExecuteCommandMobilizationRequest::getBody,
                ExecuteCommandMobilizationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportExcelJobRequest, ExportExcelJobResponse> exportExcelJob =
        genForExportExcelJob();

    private static HttpRequestDef<ExportExcelJobRequest, ExportExcelJobResponse> genForExportExcelJob() {
        // basic
        HttpRequestDef.Builder<ExportExcelJobRequest, ExportExcelJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportExcelJobRequest.class, ExportExcelJobResponse.class)
                .withName("ExportExcelJob")
                .withUri("/v2/{project_id}/instances/export-job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportExcelJobRequest::getJobId, ExportExcelJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportInstancesTaskRequest, ExportInstancesTaskResponse> exportInstancesTask =
        genForExportInstancesTask();

    private static HttpRequestDef<ExportInstancesTaskRequest, ExportInstancesTaskResponse> genForExportInstancesTask() {
        // basic
        HttpRequestDef.Builder<ExportInstancesTaskRequest, ExportInstancesTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExportInstancesTaskRequest.class, ExportInstancesTaskResponse.class)
                .withName("ExportInstancesTask")
                .withUri("/v2/{project_id}/instances/export")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ExportInstancesTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportInstancesTaskBody.class),
            f -> f.withMarshaller(ExportInstancesTaskRequest::getBody, ExportInstancesTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HangUpClientsRequest, HangUpClientsResponse> hangUpClients =
        genForHangUpClients();

    private static HttpRequestDef<HangUpClientsRequest, HangUpClientsResponse> genForHangUpClients() {
        // basic
        HttpRequestDef.Builder<HangUpClientsRequest, HangUpClientsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HangUpClientsRequest.class, HangUpClientsResponse.class)
                .withName("HangUpClients")
                .withUri("/v2/{project_id}/instances/{instance_id}/clients/kill")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HangUpClientsRequest::getInstanceId, HangUpClientsRequest::setInstanceId));
        builder.<HangUpClientsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HangUpClientsRequestBody.class),
            f -> f.withMarshaller(HangUpClientsRequest::getBody, HangUpClientsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HangUpKillAllClientsRequest, HangUpKillAllClientsResponse> hangUpKillAllClients =
        genForHangUpKillAllClients();

    private static HttpRequestDef<HangUpKillAllClientsRequest, HangUpKillAllClientsResponse> genForHangUpKillAllClients() {
        // basic
        HttpRequestDef.Builder<HangUpKillAllClientsRequest, HangUpKillAllClientsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, HangUpKillAllClientsRequest.class, HangUpKillAllClientsResponse.class)
            .withName("HangUpKillAllClients")
            .withUri("/v2/{project_id}/instances/{instance_id}/clients/kill-all")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(HangUpKillAllClientsRequest::getInstanceId,
                HangUpKillAllClientsRequest::setInstanceId));
        builder.<HangUpKillAllClientsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HangUpKillAllClientsRequestBody.class),
            f -> f.withMarshaller(HangUpKillAllClientsRequest::getBody, HangUpKillAllClientsRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(HangUpKillAllClientsResponse::getBody, HangUpKillAllClientsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAclAccountsRequest, ListAclAccountsResponse> listAclAccounts =
        genForListAclAccounts();

    private static HttpRequestDef<ListAclAccountsRequest, ListAclAccountsResponse> genForListAclAccounts() {
        // basic
        HttpRequestDef.Builder<ListAclAccountsRequest, ListAclAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclAccountsRequest.class, ListAclAccountsResponse.class)
                .withName("ListAclAccounts")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclAccountsRequest::getInstanceId, ListAclAccountsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> listAvailableZones =
        genForListAvailableZones();

    private static HttpRequestDef<ListAvailableZonesRequest, ListAvailableZonesResponse> genForListAvailableZones() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesRequest, ListAvailableZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAvailableZonesRequest.class, ListAvailableZonesResponse.class)
                .withName("ListAvailableZones")
                .withUri("/v2/available-zones")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackgroundTaskRequest, ListBackgroundTaskResponse> listBackgroundTask =
        genForListBackgroundTask();

    private static HttpRequestDef<ListBackgroundTaskRequest, ListBackgroundTaskResponse> genForListBackgroundTask() {
        // basic
        HttpRequestDef.Builder<ListBackgroundTaskRequest, ListBackgroundTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackgroundTaskRequest.class, ListBackgroundTaskResponse.class)
                .withName("ListBackgroundTask")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getInstanceId, ListBackgroundTaskRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getOffset, ListBackgroundTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getLimit, ListBackgroundTaskRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getStartTime, ListBackgroundTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackgroundTaskRequest::getEndTime, ListBackgroundTaskRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupFileLinksRequest, ListBackupFileLinksResponse> listBackupFileLinks =
        genForListBackupFileLinks();

    private static HttpRequestDef<ListBackupFileLinksRequest, ListBackupFileLinksResponse> genForListBackupFileLinks() {
        // basic
        HttpRequestDef.Builder<ListBackupFileLinksRequest, ListBackupFileLinksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBackupFileLinksRequest.class, ListBackupFileLinksResponse.class)
                .withName("ListBackupFileLinks")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups/{backup_id}/links")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupFileLinksRequest::getInstanceId,
                ListBackupFileLinksRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupFileLinksRequest::getBackupId, ListBackupFileLinksRequest::setBackupId));
        builder.<DownloadBackupFilesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadBackupFilesReq.class),
            f -> f.withMarshaller(ListBackupFileLinksRequest::getBody, ListBackupFileLinksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupRecordsRequest, ListBackupRecordsResponse> listBackupRecords =
        genForListBackupRecords();

    private static HttpRequestDef<ListBackupRecordsRequest, ListBackupRecordsResponse> genForListBackupRecords() {
        // basic
        HttpRequestDef.Builder<ListBackupRecordsRequest, ListBackupRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupRecordsRequest.class, ListBackupRecordsResponse.class)
                .withName("ListBackupRecords")
                .withUri("/v2/{project_id}/instances/{instance_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getInstanceId, ListBackupRecordsRequest::setInstanceId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getBeginTime, ListBackupRecordsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getEndTime, ListBackupRecordsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getLimit, ListBackupRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupRecordsRequest::getOffset, ListBackupRecordsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> listBigkeyScanTasks =
        genForListBigkeyScanTasks();

    private static HttpRequestDef<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> genForListBigkeyScanTasks() {
        // basic
        HttpRequestDef.Builder<ListBigkeyScanTasksRequest, ListBigkeyScanTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBigkeyScanTasksRequest.class, ListBigkeyScanTasksResponse.class)
                .withName("ListBigkeyScanTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getInstanceId,
                ListBigkeyScanTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getOffset, ListBigkeyScanTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getLimit, ListBigkeyScanTasksRequest::setLimit));
        builder.<ListBigkeyScanTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBigkeyScanTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListBigkeyScanTasksRequest::getStatus, ListBigkeyScanTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCenterTaskRequest, ListCenterTaskResponse> listCenterTask =
        genForListCenterTask();

    private static HttpRequestDef<ListCenterTaskRequest, ListCenterTaskResponse> genForListCenterTask() {
        // basic
        HttpRequestDef.Builder<ListCenterTaskRequest, ListCenterTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCenterTaskRequest.class, ListCenterTaskResponse.class)
                .withName("ListCenterTask")
                .withUri("/v2/{project_id}/tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCenterTaskRequest::getOffset, ListCenterTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCenterTaskRequest::getLimit, ListCenterTaskRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCenterTaskRequest::getStartTime, ListCenterTaskRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCenterTaskRequest::getEndTime, ListCenterTaskRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClientsRequest, ListClientsResponse> listClients = genForListClients();

    private static HttpRequestDef<ListClientsRequest, ListClientsResponse> genForListClients() {
        // basic
        HttpRequestDef.Builder<ListClientsRequest, ListClientsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClientsRequest.class, ListClientsResponse.class)
                .withName("ListClients")
                .withUri("/v2/{project_id}/instances/{instance_id}/clients")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClientsRequest::getInstanceId, ListClientsRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClientsRequest::getNodeId, ListClientsRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClientsRequest::getOffset, ListClientsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClientsRequest::getLimit, ListClientsRequest::setLimit));
        builder.<String>withRequestField("addr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClientsRequest::getAddr, ListClientsRequest::setAddr));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClientsRequest::getSort, ListClientsRequest::setSort));
        builder.<ListClientsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListClientsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListClientsRequest::getOrder, ListClientsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigHistoriesRequest, ListConfigHistoriesResponse> listConfigHistories =
        genForListConfigHistories();

    private static HttpRequestDef<ListConfigHistoriesRequest, ListConfigHistoriesResponse> genForListConfigHistories() {
        // basic
        HttpRequestDef.Builder<ListConfigHistoriesRequest, ListConfigHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigHistoriesRequest.class, ListConfigHistoriesResponse.class)
                .withName("ListConfigHistories")
                .withUri("/v2/{project_id}/instances/{instance_id}/config-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigHistoriesRequest::getInstanceId,
                ListConfigHistoriesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigHistoriesRequest::getOffset, ListConfigHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigHistoriesRequest::getLimit, ListConfigHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigTemplatesRequest, ListConfigTemplatesResponse> listConfigTemplates =
        genForListConfigTemplates();

    private static HttpRequestDef<ListConfigTemplatesRequest, ListConfigTemplatesResponse> genForListConfigTemplates() {
        // basic
        HttpRequestDef.Builder<ListConfigTemplatesRequest, ListConfigTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigTemplatesRequest.class, ListConfigTemplatesResponse.class)
                .withName("ListConfigTemplates")
                .withUri("/v2/{project_id}/config-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getName, ListConfigTemplatesRequest::setName));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getTemplateId,
                ListConfigTemplatesRequest::setTemplateId));
        builder.<ListConfigTemplatesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConfigTemplatesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getType, ListConfigTemplatesRequest::setType));
        builder.<String>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getEngine, ListConfigTemplatesRequest::setEngine));
        builder.<String>withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getEngineVersion,
                ListConfigTemplatesRequest::setEngineVersion));
        builder.<String>withRequestField("cache_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getCacheMode, ListConfigTemplatesRequest::setCacheMode));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getDescription,
                ListConfigTemplatesRequest::setDescription));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getOffset, ListConfigTemplatesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigTemplatesRequest::getLimit, ListConfigTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForListConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForListConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v2/{project_id}/instances/{instance_id}/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getInstanceId, ListConfigurationsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> listDiagnosisTasks =
        genForListDiagnosisTasks();

    private static HttpRequestDef<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> genForListDiagnosisTasks() {
        // basic
        HttpRequestDef.Builder<ListDiagnosisTasksRequest, ListDiagnosisTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDiagnosisTasksRequest.class, ListDiagnosisTasksResponse.class)
                .withName("ListDiagnosisTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/diagnosis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getInstanceId, ListDiagnosisTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getLimit, ListDiagnosisTasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDiagnosisTasksRequest::getOffset, ListDiagnosisTasksRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getInstanceId, ListFlavorsRequest::setInstanceId));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, ListFlavorsRequest::setSpecCode));
        builder.<String>withRequestField("cache_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCacheMode, ListFlavorsRequest::setCacheMode));
        builder.<String>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngine, ListFlavorsRequest::setEngine));
        builder.<String>withRequestField("engine_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getEngineVersion, ListFlavorsRequest::setEngineVersion));
        builder.<ListFlavorsRequest.CpuTypeEnum>withRequestField("cpu_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.CpuTypeEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCpuType, ListFlavorsRequest::setCpuType));
        builder.<String>withRequestField("capacity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getCapacity, ListFlavorsRequest::setCapacity));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> listGroupReplicationInfo =
        genForListGroupReplicationInfo();

    private static HttpRequestDef<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> genForListGroupReplicationInfo() {
        // basic
        HttpRequestDef.Builder<ListGroupReplicationInfoRequest, ListGroupReplicationInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListGroupReplicationInfoRequest.class, ListGroupReplicationInfoResponse.class)
                .withName("ListGroupReplicationInfo")
                .withUri("/v2/{project_id}/instance/{instance_id}/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupReplicationInfoRequest::getInstanceId,
                ListGroupReplicationInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> listHotKeyScanTasks =
        genForListHotKeyScanTasks();

    private static HttpRequestDef<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> genForListHotKeyScanTasks() {
        // basic
        HttpRequestDef.Builder<ListHotKeyScanTasksRequest, ListHotKeyScanTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHotKeyScanTasksRequest.class, ListHotKeyScanTasksResponse.class)
                .withName("ListHotKeyScanTasks")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getInstanceId,
                ListHotKeyScanTasksRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getOffset, ListHotKeyScanTasksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getLimit, ListHotKeyScanTasksRequest::setLimit));
        builder.<ListHotKeyScanTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHotKeyScanTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ListHotKeyScanTasksRequest::getStatus, ListHotKeyScanTasksRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceOperationsRequest, ListInstanceOperationsResponse> listInstanceOperations =
        genForListInstanceOperations();

    private static HttpRequestDef<ListInstanceOperationsRequest, ListInstanceOperationsResponse> genForListInstanceOperations() {
        // basic
        HttpRequestDef.Builder<ListInstanceOperationsRequest, ListInstanceOperationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceOperationsRequest.class, ListInstanceOperationsResponse.class)
            .withName("ListInstanceOperations")
            .withUri("/v2/{project_id}/instances/{instance_id}/operations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceOperationsRequest::getInstanceId,
                ListInstanceOperationsRequest::setInstanceId));
        builder.<ListInstanceOperationsRequest.OperationEnum>withRequestField("operation",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceOperationsRequest.OperationEnum.class),
            f -> f.withMarshaller(ListInstanceOperationsRequest::getOperation,
                ListInstanceOperationsRequest::setOperation));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getInstanceId, ListInstancesRequest::setInstanceId));
        builder.<String>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeFailure, ListInstancesRequest::setIncludeFailure));
        builder.<String>withRequestField("include_delete",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getIncludeDelete, ListInstancesRequest::setIncludeDelete));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, ListInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getStatus, ListInstancesRequest::setStatus));
        builder.<String>withRequestField("name_equal",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getNameEqual, ListInstancesRequest::setNameEqual));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, ListInstancesRequest::setTags));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getIp, ListInstancesRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> listMaintenanceWindows =
        genForListMaintenanceWindows();

    private static HttpRequestDef<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> genForListMaintenanceWindows() {
        // basic
        HttpRequestDef.Builder<ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMaintenanceWindowsRequest.class, ListMaintenanceWindowsResponse.class)
            .withName("ListMaintenanceWindows")
            .withUri("/v2/instances/maintain-windows")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigrationTaskRequest, ListMigrationTaskResponse> listMigrationTask =
        genForListMigrationTask();

    private static HttpRequestDef<ListMigrationTaskRequest, ListMigrationTaskResponse> genForListMigrationTask() {
        // basic
        HttpRequestDef.Builder<ListMigrationTaskRequest, ListMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMigrationTaskRequest.class, ListMigrationTaskResponse.class)
                .withName("ListMigrationTask")
                .withUri("/v2/{project_id}/migration-tasks")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationTaskRequest::getOffset, ListMigrationTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationTaskRequest::getLimit, ListMigrationTaskRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationTaskRequest::getName, ListMigrationTaskRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse> listMigrationTaskLogs =
        genForListMigrationTaskLogs();

    private static HttpRequestDef<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse> genForListMigrationTaskLogs() {
        // basic
        HttpRequestDef.Builder<ListMigrationTaskLogsRequest, ListMigrationTaskLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMigrationTaskLogsRequest.class, ListMigrationTaskLogsResponse.class)
            .withName("ListMigrationTaskLogs")
            .withUri("/v2/{project_id}/migration-task/{task_id}/logs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationTaskLogsRequest::getTaskId, ListMigrationTaskLogsRequest::setTaskId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationTaskLogsRequest::getOffset, ListMigrationTaskLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMigrationTaskLogsRequest::getLimit, ListMigrationTaskLogsRequest::setLimit));
        builder.<String>withRequestField("log_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMigrationTaskLogsRequest::getLogLevel,
                ListMigrationTaskLogsRequest::setLogLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> listMonitoredObjects =
        genForListMonitoredObjects();

    private static HttpRequestDef<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> genForListMonitoredObjects() {
        // basic
        HttpRequestDef.Builder<ListMonitoredObjectsRequest, ListMonitoredObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMonitoredObjectsRequest.class, ListMonitoredObjectsResponse.class)
            .withName("ListMonitoredObjects")
            .withUri("/v2/{project_id}/dims/monitored-objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getDimName, ListMonitoredObjectsRequest::setDimName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getOffset, ListMonitoredObjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMonitoredObjectsRequest::getLimit, ListMonitoredObjectsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> listMonitoredObjectsOfInstance =
        genForListMonitoredObjectsOfInstance();

    private static HttpRequestDef<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> genForListMonitoredObjectsOfInstance() {
        // basic
        HttpRequestDef.Builder<ListMonitoredObjectsOfInstanceRequest, ListMonitoredObjectsOfInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMonitoredObjectsOfInstanceRequest.class,
                    ListMonitoredObjectsOfInstanceResponse.class)
                .withName("ListMonitoredObjectsOfInstance")
                .withUri("/v2/{project_id}/dims/monitored-objects/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitoredObjectsOfInstanceRequest::getInstanceId,
                ListMonitoredObjectsOfInstanceRequest::setInstanceId));
        builder.<String>withRequestField("dim_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMonitoredObjectsOfInstanceRequest::getDimName,
                ListMonitoredObjectsOfInstanceRequest::setDimName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> listNumberOfInstancesInDifferentStatus =
        genForListNumberOfInstancesInDifferentStatus();

    private static HttpRequestDef<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> genForListNumberOfInstancesInDifferentStatus() {
        // basic
        HttpRequestDef.Builder<ListNumberOfInstancesInDifferentStatusRequest, ListNumberOfInstancesInDifferentStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNumberOfInstancesInDifferentStatusRequest.class,
                    ListNumberOfInstancesInDifferentStatusResponse.class)
                .withName("ListNumberOfInstancesInDifferentStatus")
                .withUri("/v2/{project_id}/instances/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("include_failure",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNumberOfInstancesInDifferentStatusRequest::getIncludeFailure,
                ListNumberOfInstancesInDifferentStatusRequest::setIncludeFailure));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRedislogRequest, ListRedislogResponse> listRedislog = genForListRedislog();

    private static HttpRequestDef<ListRedislogRequest, ListRedislogResponse> genForListRedislog() {
        // basic
        HttpRequestDef.Builder<ListRedislogRequest, ListRedislogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRedislogRequest.class, ListRedislogResponse.class)
                .withName("ListRedislog")
                .withUri("/v2/{project_id}/instances/{instance_id}/redislog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedislogRequest::getInstanceId, ListRedislogRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRedislogRequest::getOffset, ListRedislogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRedislogRequest::getLimit, ListRedislogRequest::setLimit));
        builder.<String>withRequestField("log_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRedislogRequest::getLogType, ListRedislogRequest::setLogType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreRecordsRequest, ListRestoreRecordsResponse> listRestoreRecords =
        genForListRestoreRecords();

    private static HttpRequestDef<ListRestoreRecordsRequest, ListRestoreRecordsResponse> genForListRestoreRecords() {
        // basic
        HttpRequestDef.Builder<ListRestoreRecordsRequest, ListRestoreRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreRecordsRequest.class, ListRestoreRecordsResponse.class)
                .withName("ListRestoreRecords")
                .withUri("/v2/{project_id}/instances/{instance_id}/restores")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getInstanceId, ListRestoreRecordsRequest::setInstanceId));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getBeginTime, ListRestoreRecordsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getEndTime, ListRestoreRecordsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getLimit, ListRestoreRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRestoreRecordsRequest::getOffset, ListRestoreRecordsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogRequest, ListSlowlogResponse> listSlowlog = genForListSlowlog();

    private static HttpRequestDef<ListSlowlogRequest, ListSlowlogResponse> genForListSlowlog() {
        // basic
        HttpRequestDef.Builder<ListSlowlogRequest, ListSlowlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowlogRequest.class, ListSlowlogResponse.class)
                .withName("ListSlowlog")
                .withUri("/v2/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogRequest::getInstanceId, ListSlowlogRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogRequest::getOffset, ListSlowlogRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogRequest::getLimit, ListSlowlogRequest::setLimit));
        builder.<ListSlowlogRequest.SortKeyEnum>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogRequest.SortKeyEnum.class),
            f -> f.withMarshaller(ListSlowlogRequest::getSortKey, ListSlowlogRequest::setSortKey));
        builder.<ListSlowlogRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListSlowlogRequest::getSortDir, ListSlowlogRequest::setSortDir));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogRequest::getStartTime, ListSlowlogRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogRequest::getEndTime, ListSlowlogRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> listStatisticsOfRunningInstances =
        genForListStatisticsOfRunningInstances();

    private static HttpRequestDef<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> genForListStatisticsOfRunningInstances() {
        // basic
        HttpRequestDef.Builder<ListStatisticsOfRunningInstancesRequest, ListStatisticsOfRunningInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStatisticsOfRunningInstancesRequest.class,
                    ListStatisticsOfRunningInstancesResponse.class)
                .withName("ListStatisticsOfRunningInstances")
                .withUri("/v2/{project_id}/instances/statistic")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsOfTenantRequest, ListTagsOfTenantResponse> listTagsOfTenant =
        genForListTagsOfTenant();

    private static HttpRequestDef<ListTagsOfTenantRequest, ListTagsOfTenantResponse> genForListTagsOfTenant() {
        // basic
        HttpRequestDef.Builder<ListTagsOfTenantRequest, ListTagsOfTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsOfTenantRequest.class, ListTagsOfTenantResponse.class)
                .withName("ListTagsOfTenant")
                .withUri("/v2/{project_id}/dcs/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LoginWebCliRequest, LoginWebCliResponse> loginWebCli = genForLoginWebCli();

    private static HttpRequestDef<LoginWebCliRequest, LoginWebCliResponse> genForLoginWebCli() {
        // basic
        HttpRequestDef.Builder<LoginWebCliRequest, LoginWebCliResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LoginWebCliRequest.class, LoginWebCliResponse.class)
                .withName("LoginWebCli")
                .withUri("/v2/{project_id}/instances/{instance_id}/webcli/auth")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LoginWebCliRequest::getInstanceId, LoginWebCliRequest::setInstanceId));
        builder.<LoginWebCliBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoginWebCliBody.class),
            f -> f.withMarshaller(LoginWebCliRequest::getBody, LoginWebCliRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LogoffWebCliRequest, LogoffWebCliResponse> logoffWebCli = genForLogoffWebCli();

    private static HttpRequestDef<LogoffWebCliRequest, LogoffWebCliResponse> genForLogoffWebCli() {
        // basic
        HttpRequestDef.Builder<LogoffWebCliRequest, LogoffWebCliResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LogoffWebCliRequest.class, LogoffWebCliResponse.class)
                .withName("LogoffWebCli")
                .withUri("/v2/{project_id}/instances/{instance_id}/webcli/logout")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LogoffWebCliRequest::getInstanceId, LogoffWebCliRequest::setInstanceId));
        builder.<LogoutWebCliBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogoutWebCliBody.class),
            f -> f.withMarshaller(LogoffWebCliRequest::getBody, LogoffWebCliRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> resetAclAccountPassWord =
        genForResetAclAccountPassWord();

    private static HttpRequestDef<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> genForResetAclAccountPassWord() {
        // basic
        HttpRequestDef.Builder<ResetAclAccountPassWordRequest, ResetAclAccountPassWordResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResetAclAccountPassWordRequest.class, ResetAclAccountPassWordResponse.class)
            .withName("ResetAclAccountPassWord")
            .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}/password/reset")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAclAccountPassWordRequest::getInstanceId,
                ResetAclAccountPassWordRequest::setInstanceId));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetAclAccountPassWordRequest::getAccountId,
                ResetAclAccountPassWordRequest::setAccountId));
        builder.<AclAccountResetPasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclAccountResetPasswordBody.class),
            f -> f.withMarshaller(ResetAclAccountPassWordRequest::getBody, ResetAclAccountPassWordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> resetPassword =
        genForResetPassword();

    private static HttpRequestDef<ResetPasswordRequest, ResetPasswordResponse> genForResetPassword() {
        // basic
        HttpRequestDef.Builder<ResetPasswordRequest, ResetPasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPasswordRequest.class, ResetPasswordResponse.class)
                .withName("ResetPassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password/reset")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPasswordRequest::getInstanceId, ResetPasswordRequest::setInstanceId));
        builder.<ResetInstancePasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetInstancePasswordBody.class),
            f -> f.withMarshaller(ResetPasswordRequest::getBody, ResetPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstance =
        genForResizeInstance();

    private static HttpRequestDef<ResizeInstanceRequest, ResizeInstanceResponse> genForResizeInstance() {
        // basic
        HttpRequestDef.Builder<ResizeInstanceRequest, ResizeInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResizeInstanceRequest.class, ResizeInstanceResponse.class)
                .withName("ResizeInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/resize")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getInstanceId, ResizeInstanceRequest::setInstanceId));
        builder.<ResizeInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeInstanceBody.class),
            f -> f.withMarshaller(ResizeInstanceRequest::getBody, ResizeInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> restartOrFlushInstances =
        genForRestartOrFlushInstances();

    private static HttpRequestDef<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> genForRestartOrFlushInstances() {
        // basic
        HttpRequestDef.Builder<RestartOrFlushInstancesRequest, RestartOrFlushInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RestartOrFlushInstancesRequest.class, RestartOrFlushInstancesResponse.class)
            .withName("RestartOrFlushInstances")
            .withUri("/v2/{project_id}/instances/status")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ChangeInstanceStatusBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeInstanceStatusBody.class),
            f -> f.withMarshaller(RestartOrFlushInstancesRequest::getBody, RestartOrFlushInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstance =
        genForRestoreInstance();

    private static HttpRequestDef<RestoreInstanceRequest, RestoreInstanceResponse> genForRestoreInstance() {
        // basic
        HttpRequestDef.Builder<RestoreInstanceRequest, RestoreInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreInstanceRequest.class, RestoreInstanceResponse.class)
                .withName("RestoreInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}/restores")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getInstanceId, RestoreInstanceRequest::setInstanceId));
        builder.<RestoreInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestoreInstanceBody.class),
            f -> f.withMarshaller(RestoreInstanceRequest::getBody, RestoreInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ScanClientsRequest, ScanClientsResponse> scanClients = genForScanClients();

    private static HttpRequestDef<ScanClientsRequest, ScanClientsResponse> genForScanClients() {
        // basic
        HttpRequestDef.Builder<ScanClientsRequest, ScanClientsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ScanClientsRequest.class, ScanClientsResponse.class)
                .withName("ScanClients")
                .withUri("/v2/{project_id}/instances/{instance_id}/clients")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ScanClientsRequest::getInstanceId, ScanClientsRequest::setInstanceId));
        builder.<ScanClientsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScanClientsRequestBody.class),
            f -> f.withMarshaller(ScanClientsRequest::getBody, ScanClientsRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ScanClientsResponse::getBody, ScanClientsResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ScanExpireKeyRequest, ScanExpireKeyResponse> scanExpireKey =
        genForScanExpireKey();

    private static HttpRequestDef<ScanExpireKeyRequest, ScanExpireKeyResponse> genForScanExpireKey() {
        // basic
        HttpRequestDef.Builder<ScanExpireKeyRequest, ScanExpireKeyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ScanExpireKeyRequest.class, ScanExpireKeyResponse.class)
                .withName("ScanExpireKey")
                .withUri("/v2/{project_id}/instances/{instance_id}/auto-expire/scan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ScanExpireKeyRequest::getInstanceId, ScanExpireKeyRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> setOnlineMigrationTask =
        genForSetOnlineMigrationTask();

    private static HttpRequestDef<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> genForSetOnlineMigrationTask() {
        // basic
        HttpRequestDef.Builder<SetOnlineMigrationTaskRequest, SetOnlineMigrationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetOnlineMigrationTaskRequest.class, SetOnlineMigrationTaskResponse.class)
            .withName("SetOnlineMigrationTask")
            .withUri("/v2/{project_id}/migration/{task_id}/task")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetOnlineMigrationTaskRequest::getTaskId, SetOnlineMigrationTaskRequest::setTaskId));
        builder.<SetOnlineMigrationTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetOnlineMigrationTaskBody.class),
            f -> f.withMarshaller(SetOnlineMigrationTaskRequest::getBody, SetOnlineMigrationTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> showBackgroundTaskProgress =
        genForShowBackgroundTaskProgress();

    private static HttpRequestDef<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> genForShowBackgroundTaskProgress() {
        // basic
        HttpRequestDef.Builder<ShowBackgroundTaskProgressRequest, ShowBackgroundTaskProgressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBackgroundTaskProgressRequest.class,
                    ShowBackgroundTaskProgressResponse.class)
                .withName("ShowBackgroundTaskProgress")
                .withUri("/v2/{project_id}/instances/{instance_id}/tasks/{task_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskProgressRequest::getInstanceId,
                ShowBackgroundTaskProgressRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackgroundTaskProgressRequest::getTaskId,
                ShowBackgroundTaskProgressRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> showBigkeyAutoscanConfig =
        genForShowBigkeyAutoscanConfig();

    private static HttpRequestDef<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> genForShowBigkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<ShowBigkeyAutoscanConfigRequest, ShowBigkeyAutoscanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowBigkeyAutoscanConfigRequest.class, ShowBigkeyAutoscanConfigResponse.class)
                .withName("ShowBigkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey/autoscan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBigkeyAutoscanConfigRequest::getInstanceId,
                ShowBigkeyAutoscanConfigRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> showBigkeyScanTaskDetails =
        genForShowBigkeyScanTaskDetails();

    private static HttpRequestDef<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> genForShowBigkeyScanTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowBigkeyScanTaskDetailsRequest, ShowBigkeyScanTaskDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBigkeyScanTaskDetailsRequest.class,
                    ShowBigkeyScanTaskDetailsResponse.class)
                .withName("ShowBigkeyScanTaskDetails")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey-task/{bigkey_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBigkeyScanTaskDetailsRequest::getInstanceId,
                ShowBigkeyScanTaskDetailsRequest::setInstanceId));
        builder.<String>withRequestField("bigkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBigkeyScanTaskDetailsRequest::getBigkeyId,
                ShowBigkeyScanTaskDetailsRequest::setBigkeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse> showConfigHistoryDetail =
        genForShowConfigHistoryDetail();

    private static HttpRequestDef<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse> genForShowConfigHistoryDetail() {
        // basic
        HttpRequestDef.Builder<ShowConfigHistoryDetailRequest, ShowConfigHistoryDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowConfigHistoryDetailRequest.class, ShowConfigHistoryDetailResponse.class)
            .withName("ShowConfigHistoryDetail")
            .withUri("/v2/{project_id}/instances/{instance_id}/config-histories/{history_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigHistoryDetailRequest::getInstanceId,
                ShowConfigHistoryDetailRequest::setInstanceId));
        builder.<String>withRequestField("history_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigHistoryDetailRequest::getHistoryId,
                ShowConfigHistoryDetailRequest::setHistoryId));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(ShowConfigHistoryDetailResponse::getBody, ShowConfigHistoryDetailResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigTemplateRequest, ShowConfigTemplateResponse> showConfigTemplate =
        genForShowConfigTemplate();

    private static HttpRequestDef<ShowConfigTemplateRequest, ShowConfigTemplateResponse> genForShowConfigTemplate() {
        // basic
        HttpRequestDef.Builder<ShowConfigTemplateRequest, ShowConfigTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigTemplateRequest.class, ShowConfigTemplateResponse.class)
                .withName("ShowConfigTemplate")
                .withUri("/v2/{project_id}/config-templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigTemplateRequest::getTemplateId, ShowConfigTemplateRequest::setTemplateId));
        builder.<ShowConfigTemplateRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowConfigTemplateRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowConfigTemplateRequest::getType, ShowConfigTemplateRequest::setType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> showDiagnosisTaskDetails =
        genForShowDiagnosisTaskDetails();

    private static HttpRequestDef<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> genForShowDiagnosisTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowDiagnosisTaskDetailsRequest, ShowDiagnosisTaskDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDiagnosisTaskDetailsRequest.class, ShowDiagnosisTaskDetailsResponse.class)
                .withName("ShowDiagnosisTaskDetails")
                .withUri("/v2/{project_id}/diagnosis/{report_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("report_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDiagnosisTaskDetailsRequest::getReportId,
                ShowDiagnosisTaskDetailsRequest::setReportId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse> showExpireAutoScanConfig =
        genForShowExpireAutoScanConfig();

    private static HttpRequestDef<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse> genForShowExpireAutoScanConfig() {
        // basic
        HttpRequestDef.Builder<ShowExpireAutoScanConfigRequest, ShowExpireAutoScanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowExpireAutoScanConfigRequest.class, ShowExpireAutoScanConfigResponse.class)
                .withName("ShowExpireAutoScanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/scan-expire-keys/autoscan-config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExpireAutoScanConfigRequest::getInstanceId,
                ShowExpireAutoScanConfigRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse> showExpireKeyScanInfo =
        genForShowExpireKeyScanInfo();

    private static HttpRequestDef<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse> genForShowExpireKeyScanInfo() {
        // basic
        HttpRequestDef.Builder<ShowExpireKeyScanInfoRequest, ShowExpireKeyScanInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowExpireKeyScanInfoRequest.class, ShowExpireKeyScanInfoResponse.class)
            .withName("ShowExpireKeyScanInfo")
            .withUri("/v2/{project_id}/instances/{instance_id}/auto-expire/histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExpireKeyScanInfoRequest::getInstanceId,
                ShowExpireKeyScanInfoRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowExpireKeyScanInfoRequest::getOffset, ShowExpireKeyScanInfoRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowExpireKeyScanInfoRequest::getLimit, ShowExpireKeyScanInfoRequest::setLimit));
        builder.<ShowExpireKeyScanInfoRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowExpireKeyScanInfoRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowExpireKeyScanInfoRequest::getStatus, ShowExpireKeyScanInfoRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> showHotkeyAutoscanConfig =
        genForShowHotkeyAutoscanConfig();

    private static HttpRequestDef<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> genForShowHotkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<ShowHotkeyAutoscanConfigRequest, ShowHotkeyAutoscanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHotkeyAutoscanConfigRequest.class, ShowHotkeyAutoscanConfigResponse.class)
                .withName("ShowHotkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey/autoscan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotkeyAutoscanConfigRequest::getInstanceId,
                ShowHotkeyAutoscanConfigRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> showHotkeyTaskDetails =
        genForShowHotkeyTaskDetails();

    private static HttpRequestDef<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> genForShowHotkeyTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowHotkeyTaskDetailsRequest, ShowHotkeyTaskDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHotkeyTaskDetailsRequest.class, ShowHotkeyTaskDetailsResponse.class)
            .withName("ShowHotkeyTaskDetails")
            .withUri("/v2/{project_id}/instances/{instance_id}/hotkey-task/{hotkey_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotkeyTaskDetailsRequest::getInstanceId,
                ShowHotkeyTaskDetailsRequest::setInstanceId));
        builder.<String>withRequestField("hotkey_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHotkeyTaskDetailsRequest::getHotkeyId,
                ShowHotkeyTaskDetailsRequest::setHotkeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForShowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForShowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, ShowInstanceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse> showInstanceSslDetail =
        genForShowInstanceSslDetail();

    private static HttpRequestDef<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse> genForShowInstanceSslDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceSslDetailRequest, ShowInstanceSslDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceSslDetailRequest.class, ShowInstanceSslDetailResponse.class)
            .withName("ShowInstanceSslDetail")
            .withUri("/v2/{project_id}/instances/{instance_id}/ssl")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceSslDetailRequest::getInstanceId,
                ShowInstanceSslDetailRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> showJobInfo = genForShowJobInfo();

    private static HttpRequestDef<ShowJobInfoRequest, ShowJobInfoResponse> genForShowJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowJobInfoRequest, ShowJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobInfoRequest.class, ShowJobInfoResponse.class)
                .withName("ShowJobInfo")
                .withUri("/v2/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobInfoRequest::getJobId, ShowJobInfoRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationTaskRequest, ShowMigrationTaskResponse> showMigrationTask =
        genForShowMigrationTask();

    private static HttpRequestDef<ShowMigrationTaskRequest, ShowMigrationTaskResponse> genForShowMigrationTask() {
        // basic
        HttpRequestDef.Builder<ShowMigrationTaskRequest, ShowMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMigrationTaskRequest.class, ShowMigrationTaskResponse.class)
                .withName("ShowMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigrationTaskRequest::getTaskId, ShowMigrationTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> showMigrationTaskStats =
        genForShowMigrationTaskStats();

    private static HttpRequestDef<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> genForShowMigrationTaskStats() {
        // basic
        HttpRequestDef.Builder<ShowMigrationTaskStatsRequest, ShowMigrationTaskStatsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMigrationTaskStatsRequest.class, ShowMigrationTaskStatsResponse.class)
            .withName("ShowMigrationTaskStats")
            .withUri("/v2/{project_id}/migration-task/{task_id}/stats")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMigrationTaskStatsRequest::getTaskId, ShowMigrationTaskStatsRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNodesInformationRequest, ShowNodesInformationResponse> showNodesInformation =
        genForShowNodesInformation();

    private static HttpRequestDef<ShowNodesInformationRequest, ShowNodesInformationResponse> genForShowNodesInformation() {
        // basic
        HttpRequestDef.Builder<ShowNodesInformationRequest, ShowNodesInformationResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNodesInformationRequest.class, ShowNodesInformationResponse.class)
            .withName("ShowNodesInformation")
            .withUri("/v2/{project_id}/instances/{instance_id}/logical-nodes")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNodesInformationRequest::getInstanceId,
                ShowNodesInformationRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> showQuotaOfTenant =
        genForShowQuotaOfTenant();

    private static HttpRequestDef<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> genForShowQuotaOfTenant() {
        // basic
        HttpRequestDef.Builder<ShowQuotaOfTenantRequest, ShowQuotaOfTenantResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaOfTenantRequest.class, ShowQuotaOfTenantResponse.class)
                .withName("ShowQuotaOfTenant")
                .withUri("/v2/{project_id}/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationStatesRequest, ShowReplicationStatesResponse> showReplicationStates =
        genForShowReplicationStates();

    private static HttpRequestDef<ShowReplicationStatesRequest, ShowReplicationStatesResponse> genForShowReplicationStates() {
        // basic
        HttpRequestDef.Builder<ShowReplicationStatesRequest, ShowReplicationStatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReplicationStatesRequest.class, ShowReplicationStatesResponse.class)
            .withName("ShowReplicationStates")
            .withUri("/v2/{project_id}/instance/{instance_id}/groups/{group_id}/group-nodes-state")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatesRequest::getInstanceId,
                ShowReplicationStatesRequest::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatesRequest::getGroupId, ShowReplicationStatesRequest::setGroupId));

        // response
        builder.<List<InstanceReplicationListInfo>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowReplicationStatesResponse::getBody, ShowReplicationStatesResponse::setBody)
                .withInnerContainerType(InstanceReplicationListInfo.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowTagsRequest, ShowTagsResponse> showTags = genForShowTags();

    private static HttpRequestDef<ShowTagsRequest, ShowTagsResponse> genForShowTags() {
        // basic
        HttpRequestDef.Builder<ShowTagsRequest, ShowTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTagsRequest.class, ShowTagsResponse.class)
                .withName("ShowTags")
                .withUri("/v2/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTagsRequest::getInstanceId, ShowTagsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse> startInstanceResizeCheckJob =
        genForStartInstanceResizeCheckJob();

    private static HttpRequestDef<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse> genForStartInstanceResizeCheckJob() {
        // basic
        HttpRequestDef.Builder<StartInstanceResizeCheckJobRequest, StartInstanceResizeCheckJobResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartInstanceResizeCheckJobRequest.class,
                    StartInstanceResizeCheckJobResponse.class)
                .withName("StartInstanceResizeCheckJob")
                .withUri("/v2/{project_id}/instances/{instance_id}/resize/check-job")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceResizeCheckJobRequest::getInstanceId,
                StartInstanceResizeCheckJobRequest::setInstanceId));
        builder.<StartInstanceResizeCheckJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceResizeCheckJobRequestBody.class),
            f -> f.withMarshaller(StartInstanceResizeCheckJobRequest::getBody,
                StartInstanceResizeCheckJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopMigrationTaskRequest, StopMigrationTaskResponse> stopMigrationTask =
        genForStopMigrationTask();

    private static HttpRequestDef<StopMigrationTaskRequest, StopMigrationTaskResponse> genForStopMigrationTask() {
        // basic
        HttpRequestDef.Builder<StopMigrationTaskRequest, StopMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopMigrationTaskRequest.class, StopMigrationTaskResponse.class)
                .withName("StopMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMigrationTaskRequest::getTaskId, StopMigrationTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> stopMigrationTaskSync =
        genForStopMigrationTaskSync();

    private static HttpRequestDef<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> genForStopMigrationTaskSync() {
        // basic
        HttpRequestDef.Builder<StopMigrationTaskSyncRequest, StopMigrationTaskSyncResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StopMigrationTaskSyncRequest.class, StopMigrationTaskSyncResponse.class)
            .withName("StopMigrationTaskSync")
            .withUri("/v2/{project_id}/migration-task/{task_id}/sync-stop")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopMigrationTaskSyncRequest::getTaskId, StopMigrationTaskSyncRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclAccountRequest, UpdateAclAccountResponse> updateAclAccount =
        genForUpdateAclAccount();

    private static HttpRequestDef<UpdateAclAccountRequest, UpdateAclAccountResponse> genForUpdateAclAccount() {
        // basic
        HttpRequestDef.Builder<UpdateAclAccountRequest, UpdateAclAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAclAccountRequest.class, UpdateAclAccountResponse.class)
                .withName("UpdateAclAccount")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}/role")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRequest::getInstanceId, UpdateAclAccountRequest::setInstanceId));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRequest::getAccountId, UpdateAclAccountRequest::setAccountId));
        builder.<AclAccountRoleModifyBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclAccountRoleModifyBody.class),
            f -> f.withMarshaller(UpdateAclAccountRequest::getBody, UpdateAclAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> updateAclAccountPassWord =
        genForUpdateAclAccountPassWord();

    private static HttpRequestDef<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> genForUpdateAclAccountPassWord() {
        // basic
        HttpRequestDef.Builder<UpdateAclAccountPassWordRequest, UpdateAclAccountPassWordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateAclAccountPassWordRequest.class, UpdateAclAccountPassWordResponse.class)
                .withName("UpdateAclAccountPassWord")
                .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}/password/modify")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountPassWordRequest::getInstanceId,
                UpdateAclAccountPassWordRequest::setInstanceId));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountPassWordRequest::getAccountId,
                UpdateAclAccountPassWordRequest::setAccountId));
        builder.<AclAccountModifyPasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclAccountModifyPasswordBody.class),
            f -> f.withMarshaller(UpdateAclAccountPassWordRequest::getBody, UpdateAclAccountPassWordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> updateAclAccountRemark =
        genForUpdateAclAccountRemark();

    private static HttpRequestDef<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> genForUpdateAclAccountRemark() {
        // basic
        HttpRequestDef.Builder<UpdateAclAccountRemarkRequest, UpdateAclAccountRemarkResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAclAccountRemarkRequest.class, UpdateAclAccountRemarkResponse.class)
            .withName("UpdateAclAccountRemark")
            .withUri("/v2/{project_id}/instances/{instance_id}/accounts/{account_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRemarkRequest::getInstanceId,
                UpdateAclAccountRemarkRequest::setInstanceId));
        builder.<String>withRequestField("account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclAccountRemarkRequest::getAccountId,
                UpdateAclAccountRemarkRequest::setAccountId));
        builder.<UpdateAclAccountRemarkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAclAccountRemarkRequestBody.class),
            f -> f.withMarshaller(UpdateAclAccountRemarkRequest::getBody, UpdateAclAccountRemarkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> updateBigkeyAutoscanConfig =
        genForUpdateBigkeyAutoscanConfig();

    private static HttpRequestDef<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> genForUpdateBigkeyAutoscanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateBigkeyAutoscanConfigRequest, UpdateBigkeyAutoscanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBigkeyAutoscanConfigRequest.class,
                    UpdateBigkeyAutoscanConfigResponse.class)
                .withName("UpdateBigkeyAutoscanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/bigkey/autoscan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBigkeyAutoscanConfigRequest::getInstanceId,
                UpdateBigkeyAutoscanConfigRequest::setInstanceId));
        builder.<AutoscanConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoscanConfigRequest.class),
            f -> f.withMarshaller(UpdateBigkeyAutoscanConfigRequest::getBody,
                UpdateBigkeyAutoscanConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse> updateClientIpTransparentTransmission =
        genForUpdateClientIpTransparentTransmission();

    private static HttpRequestDef<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse> genForUpdateClientIpTransparentTransmission() {
        // basic
        HttpRequestDef.Builder<UpdateClientIpTransparentTransmissionRequest, UpdateClientIpTransparentTransmissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateClientIpTransparentTransmissionRequest.class,
                    UpdateClientIpTransparentTransmissionResponse.class)
                .withName("UpdateClientIpTransparentTransmission")
                .withUri("/v2/{project_id}/{instance_id}/client-ip-transparent-transmission")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClientIpTransparentTransmissionRequest::getInstanceId,
                UpdateClientIpTransparentTransmissionRequest::setInstanceId));
        builder.<UpdateClientIpTransparentTransmissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClientIpTransparentTransmissionRequestBody.class),
            f -> f.withMarshaller(UpdateClientIpTransparentTransmissionRequest::getBody,
                UpdateClientIpTransparentTransmissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> updateConfigTemplate =
        genForUpdateConfigTemplate();

    private static HttpRequestDef<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> genForUpdateConfigTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateConfigTemplateRequest, UpdateConfigTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateConfigTemplateRequest.class, UpdateConfigTemplateResponse.class)
            .withName("UpdateConfigTemplate")
            .withUri("/v2/{project_id}/config-templates/{template_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigTemplateRequest::getTemplateId,
                UpdateConfigTemplateRequest::setTemplateId));
        builder.<UpdateCustomTemplateBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCustomTemplateBody.class),
            f -> f.withMarshaller(UpdateConfigTemplateRequest::getBody, UpdateConfigTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationsRequest, UpdateConfigurationsResponse> updateConfigurations =
        genForUpdateConfigurations();

    private static HttpRequestDef<UpdateConfigurationsRequest, UpdateConfigurationsResponse> genForUpdateConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationsRequest, UpdateConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateConfigurationsRequest.class, UpdateConfigurationsResponse.class)
            .withName("UpdateConfigurations")
            .withUri("/v2/{project_id}/instances/{instance_id}/configs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationsRequest::getInstanceId,
                UpdateConfigurationsRequest::setInstanceId));
        builder.<ModifyRedisConfigBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRedisConfigBody.class),
            f -> f.withMarshaller(UpdateConfigurationsRequest::getBody, UpdateConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse> updateExpireAutoScanConfig =
        genForUpdateExpireAutoScanConfig();

    private static HttpRequestDef<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse> genForUpdateExpireAutoScanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateExpireAutoScanConfigRequest, UpdateExpireAutoScanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateExpireAutoScanConfigRequest.class,
                    UpdateExpireAutoScanConfigResponse.class)
                .withName("UpdateExpireAutoScanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/scan-expire-keys/autoscan-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateExpireAutoScanConfigRequest::getInstanceId,
                UpdateExpireAutoScanConfigRequest::setInstanceId));
        builder.<UpdateAutoScanConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAutoScanConfigRequestBody.class),
            f -> f.withMarshaller(UpdateExpireAutoScanConfigRequest::getBody,
                UpdateExpireAutoScanConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> updateHotkeyAutoScanConfig =
        genForUpdateHotkeyAutoScanConfig();

    private static HttpRequestDef<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> genForUpdateHotkeyAutoScanConfig() {
        // basic
        HttpRequestDef.Builder<UpdateHotkeyAutoScanConfigRequest, UpdateHotkeyAutoScanConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateHotkeyAutoScanConfigRequest.class,
                    UpdateHotkeyAutoScanConfigResponse.class)
                .withName("UpdateHotkeyAutoScanConfig")
                .withUri("/v2/{project_id}/instances/{instance_id}/hotkey/autoscan")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHotkeyAutoScanConfigRequest::getInstanceId,
                UpdateHotkeyAutoScanConfigRequest::setInstanceId));
        builder.<AutoscanConfigRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AutoscanConfigRequest.class),
            f -> f.withMarshaller(UpdateHotkeyAutoScanConfigRequest::getBody,
                UpdateHotkeyAutoScanConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForUpdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForUpdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/{project_id}/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, UpdateInstanceRequest::setInstanceId));
        builder.<ModifyInstanceBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyInstanceBody.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, UpdateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> updateInstanceBandwidth =
        genForUpdateInstanceBandwidth();

    private static HttpRequestDef<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> genForUpdateInstanceBandwidth() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceBandwidthRequest, UpdateInstanceBandwidthResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceBandwidthRequest.class, UpdateInstanceBandwidthResponse.class)
            .withName("UpdateInstanceBandwidth")
            .withUri("/v2/{project_id}/instances/{instance_id}/bandwidth")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceBandwidthRequest::getInstanceId,
                UpdateInstanceBandwidthRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> updateInstanceConfig =
        genForUpdateInstanceConfig();

    private static HttpRequestDef<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> genForUpdateInstanceConfig() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceConfigRequest.class, UpdateInstanceConfigResponse.class)
            .withName("UpdateInstanceConfig")
            .withUri("/v2/{project_id}/instances/{instance_id}/async-configs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<UUID>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UUID.class),
            f -> f.withMarshaller(UpdateInstanceConfigRequest::getInstanceId,
                UpdateInstanceConfigRequest::setInstanceId));
        builder.<ModifyRedisConfigBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRedisConfigBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigRequest::getBody, UpdateInstanceConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse> updateMigrationTask =
        genForUpdateMigrationTask();

    private static HttpRequestDef<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse> genForUpdateMigrationTask() {
        // basic
        HttpRequestDef.Builder<UpdateMigrationTaskRequest, UpdateMigrationTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMigrationTaskRequest.class, UpdateMigrationTaskResponse.class)
                .withName("UpdateMigrationTask")
                .withUri("/v2/{project_id}/migration-task/{task_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMigrationTaskRequest::getTaskId, UpdateMigrationTaskRequest::setTaskId));
        builder.<MigrationUpdateRequestEntity>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MigrationUpdateRequestEntity.class),
            f -> f.withMarshaller(UpdateMigrationTaskRequest::getBody, UpdateMigrationTaskRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateMigrationTaskResponse::getBody, UpdateMigrationTaskResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePasswordRequest, UpdatePasswordResponse> updatePassword =
        genForUpdatePassword();

    private static HttpRequestDef<UpdatePasswordRequest, UpdatePasswordResponse> genForUpdatePassword() {
        // basic
        HttpRequestDef.Builder<UpdatePasswordRequest, UpdatePasswordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePasswordRequest.class, UpdatePasswordResponse.class)
                .withName("UpdatePassword")
                .withUri("/v2/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePasswordRequest::getInstanceId, UpdatePasswordRequest::setInstanceId));
        builder.<ModifyInstancePasswordBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyInstancePasswordBody.class),
            f -> f.withMarshaller(UpdatePasswordRequest::getBody, UpdatePasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> updateSlavePriority =
        genForUpdateSlavePriority();

    private static HttpRequestDef<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> genForUpdateSlavePriority() {
        // basic
        HttpRequestDef.Builder<UpdateSlavePriorityRequest, UpdateSlavePriorityResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSlavePriorityRequest.class, UpdateSlavePriorityResponse.class)
                .withName("UpdateSlavePriority")
                .withUri(
                    "/v2/{project_id}/instances/{instance_id}/groups/{group_id}/replications/{node_id}/slave-priority")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getInstanceId,
                UpdateSlavePriorityRequest::setInstanceId));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getGroupId, UpdateSlavePriorityRequest::setGroupId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getNodeId, UpdateSlavePriorityRequest::setNodeId));
        builder.<PriorityBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PriorityBody.class),
            f -> f.withMarshaller(UpdateSlavePriorityRequest::getBody, UpdateSlavePriorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSslSwitchRequest, UpdateSslSwitchResponse> updateSslSwitch =
        genForUpdateSslSwitch();

    private static HttpRequestDef<UpdateSslSwitchRequest, UpdateSslSwitchResponse> genForUpdateSslSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateSslSwitchRequest, UpdateSslSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSslSwitchRequest.class, UpdateSslSwitchResponse.class)
                .withName("UpdateSslSwitch")
                .withUri("/v2/{project_id}/instances/{instance_id}/ssl")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSslSwitchRequest::getInstanceId, UpdateSslSwitchRequest::setInstanceId));
        builder.<UpdateSSLSwitchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSSLSwitchRequestBody.class),
            f -> f.withMarshaller(UpdateSslSwitchRequest::getBody, UpdateSslSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse> validateDeletableReplica =
        genForValidateDeletableReplica();

    private static HttpRequestDef<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse> genForValidateDeletableReplica() {
        // basic
        HttpRequestDef.Builder<ValidateDeletableReplicaRequest, ValidateDeletableReplicaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ValidateDeletableReplicaRequest.class, ValidateDeletableReplicaResponse.class)
                .withName("ValidateDeletableReplica")
                .withUri("/v2/{project_id}/instances/{instance_id}/deletable-replication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ValidateDeletableReplicaRequest::getInstanceId,
                ValidateDeletableReplicaRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpWhitelistRequest, ShowIpWhitelistResponse> showIpWhitelist =
        genForShowIpWhitelist();

    private static HttpRequestDef<ShowIpWhitelistRequest, ShowIpWhitelistResponse> genForShowIpWhitelist() {
        // basic
        HttpRequestDef.Builder<ShowIpWhitelistRequest, ShowIpWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpWhitelistRequest.class, ShowIpWhitelistResponse.class)
                .withName("ShowIpWhitelist")
                .withUri("/v2/{project_id}/instance/{instance_id}/whitelist")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpWhitelistRequest::getInstanceId, ShowIpWhitelistRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> updateIpWhitelist =
        genForUpdateIpWhitelist();

    private static HttpRequestDef<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> genForUpdateIpWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateIpWhitelistRequest, UpdateIpWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIpWhitelistRequest.class, UpdateIpWhitelistResponse.class)
                .withName("UpdateIpWhitelist")
                .withUri("/v2/{project_id}/instance/{instance_id}/whitelist")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIpWhitelistRequest::getInstanceId, UpdateIpWhitelistRequest::setInstanceId));
        builder.<ModifyIpWhitelistBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyIpWhitelistBody.class),
            f -> f.withMarshaller(UpdateIpWhitelistRequest::getBody, UpdateIpWhitelistRequest::setBody));

        // response

        return builder.build();
    }

}

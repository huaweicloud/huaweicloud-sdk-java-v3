package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfirmRestoredDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ConfirmRestoredDataResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateConfigurationTemplateResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateCrossCloudConstructDisasterRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateCrossCloudConstructDisasterResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbRoleRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbRoleResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateGaussDbInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateGaussDbInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceTagRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteInstanceTagResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteJobRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteJobResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DownloadBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheEndRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheEndResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheStartRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterDataCacheStartResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterEndSimulationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterEndSimulationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRecoveryFailoverRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRecoveryFailoverResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRestoreRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterRestoreResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterStartSimulationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterStartSimulationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterSwitchoverRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudDisasterSwitchoverResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudReleaseDisasterRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExecuteCrossCloudReleaseDisasterResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAvailableFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAvailableFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBindedEipsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListBindedEipsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListCnInfosBeforeReduceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListCnInfosBeforeReduceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListComponentInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListComponentInfosResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsDiffRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsDiffResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseRolesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseRolesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbBackupsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbBackupsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDisasterRecoveryRecordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDisasterRecoveryRecordResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFeaturesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceEngineDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceEngineDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKernelPluginsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParameterGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParameterGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestorableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SearchAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetKernelPluginLicenseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetNewBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterRelationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterRelationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowParameterGroupDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowParameterGroupDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSourceInstanceDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSourceInstanceDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SyncLimitDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SyncLimitDataResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstanceVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesVersionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpgradeInstancesVersionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateParaGroupNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ValidateWeakPasswordResponse;

import java.util.concurrent.CompletableFuture;

public class GaussDBforopenGaussAsyncClient {

    protected HcClient hcClient;

    public GaussDBforopenGaussAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforopenGaussAsyncClient> newBuilder() {
        ClientBuilder<GaussDBforopenGaussAsyncClient> clientBuilder =
            new ClientBuilder<>(GaussDBforopenGaussAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return CompletableFuture<AddInstanceTagsResponse>
     */
    public CompletableFuture<AddInstanceTagsResponse> addInstanceTagsAsync(AddInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.addInstanceTags);
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return AsyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse>
     */
    public AsyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse> addInstanceTagsAsyncInvoker(
        AddInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.addInstanceTags, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return CompletableFuture<AllowDbPrivilegesResponse>
     */
    public CompletableFuture<AllowDbPrivilegesResponse> allowDbPrivilegesAsync(AllowDbPrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.allowDbPrivileges);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return AsyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse>
     */
    public AsyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> allowDbPrivilegesAsyncInvoker(
        AllowDbPrivilegesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.allowDbPrivileges, hcClient);
    }

    /**
     * 授权数据库角色
     *
     * 在数据库中设置角色的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbRolePrivilegesRequest 请求对象
     * @return CompletableFuture<AllowDbRolePrivilegesResponse>
     */
    public CompletableFuture<AllowDbRolePrivilegesResponse> allowDbRolePrivilegesAsync(
        AllowDbRolePrivilegesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.allowDbRolePrivileges);
    }

    /**
     * 授权数据库角色
     *
     * 在数据库中设置角色的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbRolePrivilegesRequest 请求对象
     * @return AsyncInvoker<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse>
     */
    public AsyncInvoker<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse> allowDbRolePrivilegesAsyncInvoker(
        AllowDbRolePrivilegesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.allowDbRolePrivileges, hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.attachEip);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.attachEip, hcClient);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUpgradeCandidateVersionsRequest 请求对象
     * @return CompletableFuture<BatchShowUpgradeCandidateVersionsResponse>
     */
    public CompletableFuture<BatchShowUpgradeCandidateVersionsResponse> batchShowUpgradeCandidateVersionsAsync(
        BatchShowUpgradeCandidateVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.batchShowUpgradeCandidateVersions);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUpgradeCandidateVersionsRequest 请求对象
     * @return AsyncInvoker<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse>
     */
    public AsyncInvoker<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse> batchShowUpgradeCandidateVersionsAsyncInvoker(
        BatchShowUpgradeCandidateVersionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.batchShowUpgradeCandidateVersions, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScheduleTaskRequest 请求对象
     * @return CompletableFuture<CancelScheduleTaskResponse>
     */
    public CompletableFuture<CancelScheduleTaskResponse> cancelScheduleTaskAsync(CancelScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.cancelScheduleTask);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScheduleTaskRequest 请求对象
     * @return AsyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse>
     */
    public AsyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTaskAsyncInvoker(
        CancelScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.cancelScheduleTask, hcClient);
    }

    /**
     * 备份恢复到目标实例数据后执行数据确认
     *
     * 确认备份恢复到目标实例的数据正常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmRestoredDataRequest 请求对象
     * @return CompletableFuture<ConfirmRestoredDataResponse>
     */
    public CompletableFuture<ConfirmRestoredDataResponse> confirmRestoredDataAsync(ConfirmRestoredDataRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.confirmRestoredData);
    }

    /**
     * 备份恢复到目标实例数据后执行数据确认
     *
     * 确认备份恢复到目标实例的数据正常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmRestoredDataRequest 请求对象
     * @return AsyncInvoker<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse>
     */
    public AsyncInvoker<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse> confirmRestoredDataAsyncInvoker(
        ConfirmRestoredDataRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.confirmRestoredData, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return CompletableFuture<CreateConfigurationTemplateResponse>
     */
    public CompletableFuture<CreateConfigurationTemplateResponse> createConfigurationTemplateAsync(
        CreateConfigurationTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createConfigurationTemplate);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse>
     */
    public AsyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> createConfigurationTemplateAsyncInvoker(
        CreateConfigurationTemplateRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createConfigurationTemplate, hcClient);
    }

    /**
     * 搭建容灾关系
     *
     * 搭建容灾关系（从主实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCrossCloudConstructDisasterRequest 请求对象
     * @return CompletableFuture<CreateCrossCloudConstructDisasterResponse>
     */
    public CompletableFuture<CreateCrossCloudConstructDisasterResponse> createCrossCloudConstructDisasterAsync(
        CreateCrossCloudConstructDisasterRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createCrossCloudConstructDisaster);
    }

    /**
     * 搭建容灾关系
     *
     * 搭建容灾关系（从主实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCrossCloudConstructDisasterRequest 请求对象
     * @return AsyncInvoker<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse>
     */
    public AsyncInvoker<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse> createCrossCloudConstructDisasterAsyncInvoker(
        CreateCrossCloudConstructDisasterRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createCrossCloudConstructDisaster, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseInstanceRequest 请求对象
     * @return CompletableFuture<CreateDatabaseInstanceResponse>
     */
    public CompletableFuture<CreateDatabaseInstanceResponse> createDatabaseInstanceAsync(
        CreateDatabaseInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabaseInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseInstanceRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse>
     */
    public AsyncInvoker<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse> createDatabaseInstanceAsyncInvoker(
        CreateDatabaseInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabaseInstance, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<CreateDatabaseSchemasResponse>
     */
    public CompletableFuture<CreateDatabaseSchemasResponse> createDatabaseSchemasAsync(
        CreateDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabaseSchemas);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse>
     */
    public AsyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> createDatabaseSchemasAsyncInvoker(
        CreateDatabaseSchemasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabaseSchemas, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return CompletableFuture<CreateDbInstanceResponse>
     */
    public CompletableFuture<CreateDbInstanceResponse> createDbInstanceAsync(CreateDbInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return AsyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse>
     */
    public AsyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse> createDbInstanceAsyncInvoker(
        CreateDbInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDbInstance, hcClient);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbRoleRequest 请求对象
     * @return CompletableFuture<CreateDbRoleResponse>
     */
    public CompletableFuture<CreateDbRoleResponse> createDbRoleAsync(CreateDbRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDbRole);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbRoleRequest 请求对象
     * @return AsyncInvoker<CreateDbRoleRequest, CreateDbRoleResponse>
     */
    public AsyncInvoker<CreateDbRoleRequest, CreateDbRoleResponse> createDbRoleAsyncInvoker(
        CreateDbRoleRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDbRole, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createDbUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例，仅支持IAM5的新平面认证方式（AK/SK认证方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussDbInstanceRequest 请求对象
     * @return CompletableFuture<CreateGaussDbInstanceResponse>
     */
    public CompletableFuture<CreateGaussDbInstanceResponse> createGaussDbInstanceAsync(
        CreateGaussDbInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createGaussDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例，仅支持IAM5的新平面认证方式（AK/SK认证方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussDbInstanceRequest 请求对象
     * @return AsyncInvoker<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse>
     */
    public AsyncInvoker<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse> createGaussDbInstanceAsyncInvoker(
        CreateGaussDbInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createGaussDbInstance, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createInstance, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(
        CreateManualBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createManualBackup, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return CompletableFuture<CreateRestoreInstanceResponse>
     */
    public CompletableFuture<CreateRestoreInstanceResponse> createRestoreInstanceAsync(
        CreateRestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceAsyncInvoker(
        CreateRestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createRestoreInstance, hcClient);
    }

    /**
     * 批量实例内核版本定时升级
     *
     * 批量实例内核版本定时升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return CompletableFuture<CreateScheduleTaskResponse>
     */
    public CompletableFuture<CreateScheduleTaskResponse> createScheduleTaskAsync(CreateScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createScheduleTask);
    }

    /**
     * 批量实例内核版本定时升级
     *
     * 批量实例内核版本定时升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return AsyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse>
     */
    public AsyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse> createScheduleTaskAsyncInvoker(
        CreateScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createScheduleTask, hcClient);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return CompletableFuture<CreateSlowLogDownloadResponse>
     */
    public CompletableFuture<CreateSlowLogDownloadResponse> createSlowLogDownloadAsync(
        CreateSlowLogDownloadRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createSlowLogDownload);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return AsyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse>
     */
    public AsyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> createSlowLogDownloadAsyncInvoker(
        CreateSlowLogDownloadRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createSlowLogDownload, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除数据库SCHEMA
     *
     * 删除数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseSchemaRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseSchemaResponse>
     */
    public CompletableFuture<DeleteDatabaseSchemaResponse> deleteDatabaseSchemaAsync(
        DeleteDatabaseSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDatabaseSchema);
    }

    /**
     * 删除数据库SCHEMA
     *
     * 删除数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseSchemaRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse>
     */
    public AsyncInvoker<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse> deleteDatabaseSchemaAsyncInvoker(
        DeleteDatabaseSchemaRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDatabaseSchema, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstance, hcClient);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return CompletableFuture<DeleteInstanceTagResponse>
     */
    public CompletableFuture<DeleteInstanceTagResponse> deleteInstanceTagAsync(DeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstanceTag);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse>
     */
    public AsyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTagAsyncInvoker(
        DeleteInstanceTagRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstanceTag, hcClient);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteJob);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteJob, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(
        DeleteManualBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteManualBackup, hcClient);
    }

    /**
     * 删除定时任务信息
     *
     * 删除定时任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return CompletableFuture<DeleteScheduleTaskResponse>
     */
    public CompletableFuture<DeleteScheduleTaskResponse> deleteScheduleTaskAsync(DeleteScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteScheduleTask);
    }

    /**
     * 删除定时任务信息
     *
     * 删除定时任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return AsyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse>
     */
    public AsyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> deleteScheduleTaskAsyncInvoker(
        DeleteScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteScheduleTask, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return CompletableFuture<DownloadBackupResponse>
     */
    public CompletableFuture<DownloadBackupResponse> downloadBackupAsync(DownloadBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.downloadBackup);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return AsyncInvoker<DownloadBackupRequest, DownloadBackupResponse>
     */
    public AsyncInvoker<DownloadBackupRequest, DownloadBackupResponse> downloadBackupAsyncInvoker(
        DownloadBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.downloadBackup, hcClient);
    }

    /**
     * 主实例结束容灾日志保持
     *
     * 结束stream流式容灾的日志保持功能，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheEndRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterDataCacheEndResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterDataCacheEndResponse> executeCrossCloudDisasterDataCacheEndAsync(
        ExecuteCrossCloudDisasterDataCacheEndRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheEnd);
    }

    /**
     * 主实例结束容灾日志保持
     *
     * 结束stream流式容灾的日志保持功能，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheEndRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse> executeCrossCloudDisasterDataCacheEndAsyncInvoker(
        ExecuteCrossCloudDisasterDataCacheEndRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheEnd, hcClient);
    }

    /**
     * 开始日志保持
     *
     * 主实例开始容灾日志保持，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheStartRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterDataCacheStartResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterDataCacheStartResponse> executeCrossCloudDisasterDataCacheStartAsync(
        ExecuteCrossCloudDisasterDataCacheStartRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheStart);
    }

    /**
     * 开始日志保持
     *
     * 主实例开始容灾日志保持，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheStartRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse> executeCrossCloudDisasterDataCacheStartAsyncInvoker(
        ExecuteCrossCloudDisasterDataCacheStartRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheStart, hcClient);
    }

    /**
     * 结束容灾演练
     *
     * 灾备实例结束容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterEndSimulationRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterEndSimulationResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterEndSimulationResponse> executeCrossCloudDisasterEndSimulationAsync(
        ExecuteCrossCloudDisasterEndSimulationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterEndSimulation);
    }

    /**
     * 结束容灾演练
     *
     * 灾备实例结束容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterEndSimulationRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse> executeCrossCloudDisasterEndSimulationAsyncInvoker(
        ExecuteCrossCloudDisasterEndSimulationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterEndSimulation, hcClient);
    }

    /**
     * 备实例容灾升主
     *
     * 容灾升主failover（灾备实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRecoveryFailoverRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterRecoveryFailoverResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterRecoveryFailoverResponse> executeCrossCloudDisasterRecoveryFailoverAsync(
        ExecuteCrossCloudDisasterRecoveryFailoverRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRecoveryFailover);
    }

    /**
     * 备实例容灾升主
     *
     * 容灾升主failover（灾备实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRecoveryFailoverRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse> executeCrossCloudDisasterRecoveryFailoverAsyncInvoker(
        ExecuteCrossCloudDisasterRecoveryFailoverRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRecoveryFailover, hcClient);
    }

    /**
     * 重建容灾关系
     *
     * 流容灾备升主选择支持容灾回切，实现容灾关系的重建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRestoreRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterRestoreResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterRestoreResponse> executeCrossCloudDisasterRestoreAsync(
        ExecuteCrossCloudDisasterRestoreRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRestore);
    }

    /**
     * 重建容灾关系
     *
     * 流容灾备升主选择支持容灾回切，实现容灾关系的重建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRestoreRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse> executeCrossCloudDisasterRestoreAsyncInvoker(
        ExecuteCrossCloudDisasterRestoreRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRestore, hcClient);
    }

    /**
     * 开始容灾演练
     *
     * 开始容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterStartSimulationRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterStartSimulationResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterStartSimulationResponse> executeCrossCloudDisasterStartSimulationAsync(
        ExecuteCrossCloudDisasterStartSimulationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterStartSimulation);
    }

    /**
     * 开始容灾演练
     *
     * 开始容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterStartSimulationRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse> executeCrossCloudDisasterStartSimulationAsyncInvoker(
        ExecuteCrossCloudDisasterStartSimulationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterStartSimulation, hcClient);
    }

    /**
     * 灾备实例主从切换
     *
     * 容灾switchover（可在主备任一一端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterSwitchoverRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudDisasterSwitchoverResponse>
     */
    public CompletableFuture<ExecuteCrossCloudDisasterSwitchoverResponse> executeCrossCloudDisasterSwitchoverAsync(
        ExecuteCrossCloudDisasterSwitchoverRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterSwitchover);
    }

    /**
     * 灾备实例主从切换
     *
     * 容灾switchover（可在主备任一一端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterSwitchoverRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse> executeCrossCloudDisasterSwitchoverAsyncInvoker(
        ExecuteCrossCloudDisasterSwitchoverRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterSwitchover, hcClient);
    }

    /**
     * 解除容灾关系
     *
     * 解除容灾（从容灾主集群下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudReleaseDisasterRequest 请求对象
     * @return CompletableFuture<ExecuteCrossCloudReleaseDisasterResponse>
     */
    public CompletableFuture<ExecuteCrossCloudReleaseDisasterResponse> executeCrossCloudReleaseDisasterAsync(
        ExecuteCrossCloudReleaseDisasterRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudReleaseDisaster);
    }

    /**
     * 解除容灾关系
     *
     * 解除容灾（从容灾主集群下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudReleaseDisasterRequest 请求对象
     * @return AsyncInvoker<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse>
     */
    public AsyncInvoker<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse> executeCrossCloudReleaseDisasterAsyncInvoker(
        ExecuteCrossCloudReleaseDisasterRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudReleaseDisaster, hcClient);
    }

    /**
     * 安装插件
     *
     * 安装插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallKernelPluginRequest 请求对象
     * @return CompletableFuture<InstallKernelPluginResponse>
     */
    public CompletableFuture<InstallKernelPluginResponse> installKernelPluginAsync(InstallKernelPluginRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.installKernelPlugin);
    }

    /**
     * 安装插件
     *
     * 安装插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallKernelPluginRequest 请求对象
     * @return AsyncInvoker<InstallKernelPluginRequest, InstallKernelPluginResponse>
     */
    public AsyncInvoker<InstallKernelPluginRequest, InstallKernelPluginResponse> installKernelPluginAsyncInvoker(
        InstallKernelPluginRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.installKernelPlugin, hcClient);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return CompletableFuture<ListApplicableInstancesResponse>
     */
    public CompletableFuture<ListApplicableInstancesResponse> listApplicableInstancesAsync(
        ListApplicableInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listApplicableInstances);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return AsyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse>
     */
    public AsyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse> listApplicableInstancesAsyncInvoker(
        ListApplicableInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return CompletableFuture<ListAppliedHistoriesResponse>
     */
    public CompletableFuture<ListAppliedHistoriesResponse> listAppliedHistoriesAsync(
        ListAppliedHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listAppliedHistories);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return AsyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse>
     */
    public AsyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> listAppliedHistoriesAsyncInvoker(
        ListAppliedHistoriesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listAppliedHistories, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return CompletableFuture<ListAvailableFlavorsResponse>
     */
    public CompletableFuture<ListAvailableFlavorsResponse> listAvailableFlavorsAsync(
        ListAvailableFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listAvailableFlavors);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return AsyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse>
     */
    public AsyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> listAvailableFlavorsAsyncInvoker(
        ListAvailableFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listAvailableFlavors, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listBackups, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsDetailsRequest 请求对象
     * @return CompletableFuture<ListBackupsDetailsResponse>
     */
    public CompletableFuture<ListBackupsDetailsResponse> listBackupsDetailsAsync(ListBackupsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listBackupsDetails);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsDetailsRequest 请求对象
     * @return AsyncInvoker<ListBackupsDetailsRequest, ListBackupsDetailsResponse>
     */
    public AsyncInvoker<ListBackupsDetailsRequest, ListBackupsDetailsResponse> listBackupsDetailsAsyncInvoker(
        ListBackupsDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listBackupsDetails, hcClient);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return CompletableFuture<ListBindedEipsResponse>
     */
    public CompletableFuture<ListBindedEipsResponse> listBindedEipsAsync(ListBindedEipsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listBindedEips);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return AsyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse>
     */
    public AsyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse> listBindedEipsAsyncInvoker(
        ListBindedEipsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listBindedEips, hcClient);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return CompletableFuture<ListCnInfosBeforeReduceResponse>
     */
    public CompletableFuture<ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduceAsync(
        ListCnInfosBeforeReduceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return AsyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse>
     */
    public AsyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduceAsyncInvoker(
        ListCnInfosBeforeReduceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce, hcClient);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return CompletableFuture<ListComponentInfosResponse>
     */
    public CompletableFuture<ListComponentInfosResponse> listComponentInfosAsync(ListComponentInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listComponentInfos);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return AsyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse>
     */
    public AsyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse> listComponentInfosAsyncInvoker(
        ListComponentInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listComponentInfos, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurations, hcClient);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return CompletableFuture<ListConfigurationsDiffResponse>
     */
    public CompletableFuture<ListConfigurationsDiffResponse> listConfigurationsDiffAsync(
        ListConfigurationsDiffRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurationsDiff);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse>
     */
    public AsyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> listConfigurationsDiffAsyncInvoker(
        ListConfigurationsDiffRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurationsDiff, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseInstancesRequest 请求对象
     * @return CompletableFuture<ListDatabaseInstancesResponse>
     */
    public CompletableFuture<ListDatabaseInstancesResponse> listDatabaseInstancesAsync(
        ListDatabaseInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseInstancesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse>
     */
    public AsyncInvoker<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse> listDatabaseInstancesAsyncInvoker(
        ListDatabaseInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseInstances, hcClient);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return CompletableFuture<ListDatabaseRolesResponse>
     */
    public CompletableFuture<ListDatabaseRolesResponse> listDatabaseRolesAsync(ListDatabaseRolesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseRoles);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public AsyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesAsyncInvoker(
        ListDatabaseRolesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseRoles, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<ListDatabaseSchemasResponse>
     */
    public CompletableFuture<ListDatabaseSchemasResponse> listDatabaseSchemasAsync(ListDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse>
     */
    public AsyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> listDatabaseSchemasAsyncInvoker(
        ListDatabaseSchemasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatastores, hcClient);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresDetailsRequest 请求对象
     * @return CompletableFuture<ListDatastoresDetailsResponse>
     */
    public CompletableFuture<ListDatastoresDetailsResponse> listDatastoresDetailsAsync(
        ListDatastoresDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatastoresDetails);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresDetailsRequest 请求对象
     * @return AsyncInvoker<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse>
     */
    public AsyncInvoker<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse> listDatastoresDetailsAsyncInvoker(
        ListDatastoresDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatastoresDetails, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return CompletableFuture<ListDbBackupsResponse>
     */
    public CompletableFuture<ListDbBackupsResponse> listDbBackupsAsync(ListDbBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDbBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return AsyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse>
     */
    public AsyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse> listDbBackupsAsyncInvoker(
        ListDbBackupsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDbBackups, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return CompletableFuture<ListDbFlavorsResponse>
     */
    public CompletableFuture<ListDbFlavorsResponse> listDbFlavorsAsync(ListDbFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDbFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return AsyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse>
     */
    public AsyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse> listDbFlavorsAsyncInvoker(
        ListDbFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDbFlavors, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDbUsers, hcClient);
    }

    /**
     * 查询操作记录
     *
     * 查询容灾操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoveryRecordRequest 请求对象
     * @return CompletableFuture<ListDisasterRecoveryRecordResponse>
     */
    public CompletableFuture<ListDisasterRecoveryRecordResponse> listDisasterRecoveryRecordAsync(
        ListDisasterRecoveryRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDisasterRecoveryRecord);
    }

    /**
     * 查询操作记录
     *
     * 查询容灾操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoveryRecordRequest 请求对象
     * @return AsyncInvoker<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse>
     */
    public AsyncInvoker<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse> listDisasterRecoveryRecordAsyncInvoker(
        ListDisasterRecoveryRecordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDisasterRecoveryRecord, hcClient);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return CompletableFuture<ListEpsQuotasResponse>
     */
    public CompletableFuture<ListEpsQuotasResponse> listEpsQuotasAsync(ListEpsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasAsyncInvoker(
        ListEpsQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listEpsQuotas, hcClient);
    }

    /**
     * 查询实例特性列表
     *
     * 查询当前实例高级特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return CompletableFuture<ListFeaturesResponse>
     */
    public CompletableFuture<ListFeaturesResponse> listFeaturesAsync(ListFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listFeatures);
    }

    /**
     * 查询实例特性列表
     *
     * 查询当前实例高级特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public AsyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesAsyncInvoker(
        ListFeaturesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listFeatures, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listFlavors, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsDetailsRequest 请求对象
     * @return CompletableFuture<ListFlavorsDetailsResponse>
     */
    public CompletableFuture<ListFlavorsDetailsResponse> listFlavorsDetailsAsync(ListFlavorsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listFlavorsDetails);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsDetailsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse>
     */
    public AsyncInvoker<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse> listFlavorsDetailsAsyncInvoker(
        ListFlavorsDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listFlavorsDetails, hcClient);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return CompletableFuture<ListGaussDbDatastoresResponse>
     */
    public CompletableFuture<ListGaussDbDatastoresResponse> listGaussDbDatastoresAsync(
        ListGaussDbDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listGaussDbDatastores);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return AsyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse>
     */
    public AsyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> listGaussDbDatastoresAsyncInvoker(
        ListGaussDbDatastoresRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listGaussDbDatastores, hcClient);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return CompletableFuture<ListHistoryOperationsResponse>
     */
    public CompletableFuture<ListHistoryOperationsResponse> listHistoryOperationsAsync(
        ListHistoryOperationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listHistoryOperations);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return AsyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse>
     */
    public AsyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse> listHistoryOperationsAsyncInvoker(
        ListHistoryOperationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listHistoryOperations, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDetailsRequest 请求对象
     * @return CompletableFuture<ListInstanceDetailsResponse>
     */
    public CompletableFuture<ListInstanceDetailsResponse> listInstanceDetailsAsync(ListInstanceDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDetailsRequest 请求对象
     * @return AsyncInvoker<ListInstanceDetailsRequest, ListInstanceDetailsResponse>
     */
    public AsyncInvoker<ListInstanceDetailsRequest, ListInstanceDetailsResponse> listInstanceDetailsAsyncInvoker(
        ListInstanceDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceDetails, hcClient);
    }

    /**
     * 查看实例引擎版本分布
     *
     * 查看实例引擎版本分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceEngineDetailRequest 请求对象
     * @return CompletableFuture<ListInstanceEngineDetailResponse>
     */
    public CompletableFuture<ListInstanceEngineDetailResponse> listInstanceEngineDetailAsync(
        ListInstanceEngineDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceEngineDetail);
    }

    /**
     * 查看实例引擎版本分布
     *
     * 查看实例引擎版本分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceEngineDetailRequest 请求对象
     * @return AsyncInvoker<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse>
     */
    public AsyncInvoker<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse> listInstanceEngineDetailAsyncInvoker(
        ListInstanceEngineDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceEngineDetail, hcClient);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return CompletableFuture<ListInstanceErrorLogsResponse>
     */
    public CompletableFuture<ListInstanceErrorLogsResponse> listInstanceErrorLogsAsync(
        ListInstanceErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceErrorLogs);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse>
     */
    public AsyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> listInstanceErrorLogsAsyncInvoker(
        ListInstanceErrorLogsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceErrorLogs, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceTags);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstances, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListInstancesDetailsResponse>
     */
    public CompletableFuture<ListInstancesDetailsResponse> listInstancesDetailsAsync(
        ListInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listInstancesDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public AsyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsAsyncInvoker(
        ListInstancesDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listInstancesDetails, hcClient);
    }

    /**
     * 查询实例已安装的插件列表
     *
     * 查询实例已安装的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelPluginsRequest 请求对象
     * @return CompletableFuture<ListKernelPluginsResponse>
     */
    public CompletableFuture<ListKernelPluginsResponse> listKernelPluginsAsync(ListKernelPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listKernelPlugins);
    }

    /**
     * 查询实例已安装的插件列表
     *
     * 查询实例已安装的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelPluginsRequest 请求对象
     * @return AsyncInvoker<ListKernelPluginsRequest, ListKernelPluginsResponse>
     */
    public AsyncInvoker<ListKernelPluginsRequest, ListKernelPluginsResponse> listKernelPluginsAsyncInvoker(
        ListKernelPluginsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listKernelPlugins, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return CompletableFuture<ListParamGroupTemplatesResponse>
     */
    public CompletableFuture<ListParamGroupTemplatesResponse> listParamGroupTemplatesAsync(
        ListParamGroupTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listParamGroupTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return AsyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse>
     */
    public AsyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> listParamGroupTemplatesAsyncInvoker(
        ListParamGroupTemplatesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listParamGroupTemplates, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParameterGroupTemplatesRequest 请求对象
     * @return CompletableFuture<ListParameterGroupTemplatesResponse>
     */
    public CompletableFuture<ListParameterGroupTemplatesResponse> listParameterGroupTemplatesAsync(
        ListParameterGroupTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listParameterGroupTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParameterGroupTemplatesRequest 请求对象
     * @return AsyncInvoker<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse>
     */
    public AsyncInvoker<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse> listParameterGroupTemplatesAsyncInvoker(
        ListParameterGroupTemplatesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listParameterGroupTemplates, hcClient);
    }

    /**
     * 查询实例插件拓展信息
     *
     * 查询实例插件拓展信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginExtensionsRequest 请求对象
     * @return CompletableFuture<ListPluginExtensionsResponse>
     */
    public CompletableFuture<ListPluginExtensionsResponse> listPluginExtensionsAsync(
        ListPluginExtensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listPluginExtensions);
    }

    /**
     * 查询实例插件拓展信息
     *
     * 查询实例插件拓展信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginExtensionsRequest 请求对象
     * @return AsyncInvoker<ListPluginExtensionsRequest, ListPluginExtensionsResponse>
     */
    public AsyncInvoker<ListPluginExtensionsRequest, ListPluginExtensionsResponse> listPluginExtensionsAsyncInvoker(
        ListPluginExtensionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listPluginExtensions, hcClient);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return CompletableFuture<ListPredefinedTagsResponse>
     */
    public CompletableFuture<ListPredefinedTagsResponse> listPredefinedTagsAsync(ListPredefinedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listPredefinedTags);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return AsyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse>
     */
    public AsyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse> listPredefinedTagsAsyncInvoker(
        ListPredefinedTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listPredefinedTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRecycleInstances);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesDetailsResponse>
     */
    public CompletableFuture<ListRecycleInstancesDetailsResponse> listRecycleInstancesDetailsAsync(
        ListRecycleInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRecycleInstancesDetails);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesDetailsRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse>
     */
    public AsyncInvoker<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse> listRecycleInstancesDetailsAsyncInvoker(
        ListRecycleInstancesDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRecycleInstancesDetails, hcClient);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return CompletableFuture<ListRestorableInstancesResponse>
     */
    public CompletableFuture<ListRestorableInstancesResponse> listRestorableInstancesAsync(
        ListRestorableInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRestorableInstances);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return AsyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse>
     */
    public AsyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse> listRestorableInstancesAsyncInvoker(
        ListRestorableInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRestorableInstances, hcClient);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesDetailsRequest 请求对象
     * @return CompletableFuture<ListRestorableInstancesDetailsResponse>
     */
    public CompletableFuture<ListRestorableInstancesDetailsResponse> listRestorableInstancesDetailsAsync(
        ListRestorableInstancesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRestorableInstancesDetails);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesDetailsRequest 请求对象
     * @return AsyncInvoker<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse>
     */
    public AsyncInvoker<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse> listRestorableInstancesDetailsAsyncInvoker(
        ListRestorableInstancesDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRestorableInstancesDetails, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(
        ListRestoreTimesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查看定时任务列表
     *
     * 查看定时任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTaskRequest 请求对象
     * @return CompletableFuture<ListScheduleTaskResponse>
     */
    public CompletableFuture<ListScheduleTaskResponse> listScheduleTaskAsync(ListScheduleTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listScheduleTask);
    }

    /**
     * 查看定时任务列表
     *
     * 查看定时任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTaskRequest 请求对象
     * @return AsyncInvoker<ListScheduleTaskRequest, ListScheduleTaskResponse>
     */
    public AsyncInvoker<ListScheduleTaskRequest, ListScheduleTaskResponse> listScheduleTaskAsyncInvoker(
        ListScheduleTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listScheduleTask, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(
        ListStorageTypesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listStorageTypes, hcClient);
    }

    /**
     * 查询支持的插件列表
     *
     * 查询支持的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportKernelPluginsRequest 请求对象
     * @return CompletableFuture<ListSupportKernelPluginsResponse>
     */
    public CompletableFuture<ListSupportKernelPluginsResponse> listSupportKernelPluginsAsync(
        ListSupportKernelPluginsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSupportKernelPlugins);
    }

    /**
     * 查询支持的插件列表
     *
     * 查询支持的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportKernelPluginsRequest 请求对象
     * @return AsyncInvoker<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse>
     */
    public AsyncInvoker<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse> listSupportKernelPluginsAsyncInvoker(
        ListSupportKernelPluginsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSupportKernelPlugins, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return CompletableFuture<ListTasksResponse>
     */
    public CompletableFuture<ListTasksResponse> listTasksAsync(ListTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return AsyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public AsyncInvoker<ListTasksRequest, ListTasksResponse> listTasksAsyncInvoker(ListTasksRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTasks, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return CompletableFuture<ModifyEpsQuotaResponse>
     */
    public CompletableFuture<ModifyEpsQuotaResponse> modifyEpsQuotaAsync(ModifyEpsQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.modifyEpsQuota);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return AsyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse>
     */
    public AsyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> modifyEpsQuotaAsyncInvoker(
        ModifyEpsQuotaRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.modifyEpsQuota, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return CompletableFuture<ResetConfigurationResponse>
     */
    public CompletableFuture<ResetConfigurationResponse> resetConfigurationAsync(ResetConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public AsyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationAsyncInvoker(
        ResetConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resetConfiguration, hcClient);
    }

    /**
     * 重置容灾配置
     *
     * 重置容灾网络等配置。1.将自动“创建委托”以授权DBS云服务访问VPC资源信息、查询IAAS接口。2.重置实例容灾网络等配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDrConfigRequest 请求对象
     * @return CompletableFuture<ResetDrConfigResponse>
     */
    public CompletableFuture<ResetDrConfigResponse> resetDrConfigAsync(ResetDrConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resetDrConfig);
    }

    /**
     * 重置容灾配置
     *
     * 重置容灾网络等配置。1.将自动“创建委托”以授权DBS云服务访问VPC资源信息、查询IAAS接口。2.重置实例容灾网络等配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDrConfigRequest 请求对象
     * @return AsyncInvoker<ResetDrConfigRequest, ResetDrConfigResponse>
     */
    public AsyncInvoker<ResetDrConfigRequest, ResetDrConfigResponse> resetDrConfigAsyncInvoker(
        ResetDrConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resetDrConfig, hcClient);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resetPwd);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resetPwd, hcClient);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return CompletableFuture<ResizeInstanceFlavorResponse>
     */
    public CompletableFuture<ResizeInstanceFlavorResponse> resizeInstanceFlavorAsync(
        ResizeInstanceFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resizeInstanceFlavor);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse>
     */
    public AsyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> resizeInstanceFlavorAsyncInvoker(
        ResizeInstanceFlavorRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resizeInstanceFlavor, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.restartInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.restartInstance, hcClient);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return CompletableFuture<RestoreInstanceResponse>
     */
    public CompletableFuture<RestoreInstanceResponse> restoreInstanceAsync(RestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.restoreInstance);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public AsyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceAsyncInvoker(
        RestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.restoreInstance, hcClient);
    }

    /**
     * 配置插件拓展能力
     *
     * 配置插件拓展能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumePluginExtensionsRequest 请求对象
     * @return CompletableFuture<ResumePluginExtensionsResponse>
     */
    public CompletableFuture<ResumePluginExtensionsResponse> resumePluginExtensionsAsync(
        ResumePluginExtensionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resumePluginExtensions);
    }

    /**
     * 配置插件拓展能力
     *
     * 配置插件拓展能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumePluginExtensionsRequest 请求对象
     * @return AsyncInvoker<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse>
     */
    public AsyncInvoker<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse> resumePluginExtensionsAsyncInvoker(
        ResumePluginExtensionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resumePluginExtensions, hcClient);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return CompletableFuture<RunInstanceActionResponse>
     */
    public CompletableFuture<RunInstanceActionResponse> runInstanceActionAsync(RunInstanceActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.runInstanceAction);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return AsyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse>
     */
    public AsyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceActionAsyncInvoker(
        RunInstanceActionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.runInstanceAction, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<SearchAutoEnlargePolicyResponse>
     */
    public CompletableFuture<SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicyAsync(
        SearchAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicyAsyncInvoker(
        SearchAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setBackupPolicy, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetDbUserPwdResponse>
     */
    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdAsyncInvoker(
        SetDbUserPwdRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setDbUserPwd, hcClient);
    }

    /**
     * 配置插件license
     *
     * 配置插件license
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKernelPluginLicenseRequest 请求对象
     * @return CompletableFuture<SetKernelPluginLicenseResponse>
     */
    public CompletableFuture<SetKernelPluginLicenseResponse> setKernelPluginLicenseAsync(
        SetKernelPluginLicenseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setKernelPluginLicense);
    }

    /**
     * 配置插件license
     *
     * 配置插件license
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKernelPluginLicenseRequest 请求对象
     * @return AsyncInvoker<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse>
     */
    public AsyncInvoker<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse> setKernelPluginLicenseAsyncInvoker(
        SetKernelPluginLicenseRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setKernelPluginLicense, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNewBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetNewBackupPolicyResponse>
     */
    public CompletableFuture<SetNewBackupPolicyResponse> setNewBackupPolicyAsync(SetNewBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setNewBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNewBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse>
     */
    public AsyncInvoker<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse> setNewBackupPolicyAsyncInvoker(
        SetNewBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setNewBackupPolicy, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.setRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showBackupPolicy, hcClient);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return CompletableFuture<ShowBalanceStatusResponse>
     */
    public CompletableFuture<ShowBalanceStatusResponse> showBalanceStatusAsync(ShowBalanceStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showBalanceStatus);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return AsyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse>
     */
    public AsyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse> showBalanceStatusAsyncInvoker(
        ShowBalanceStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showBalanceStatus, hcClient);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpgradeCandidateVersionsRequest 请求对象
     * @return CompletableFuture<ShowBatchUpgradeCandidateVersionsResponse>
     */
    public CompletableFuture<ShowBatchUpgradeCandidateVersionsResponse> showBatchUpgradeCandidateVersionsAsync(
        ShowBatchUpgradeCandidateVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showBatchUpgradeCandidateVersions);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpgradeCandidateVersionsRequest 请求对象
     * @return AsyncInvoker<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse>
     */
    public AsyncInvoker<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse> showBatchUpgradeCandidateVersionsAsyncInvoker(
        ShowBatchUpgradeCandidateVersionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showBatchUpgradeCandidateVersions, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return CompletableFuture<ShowConfigurationDetailResponse>
     */
    public CompletableFuture<ShowConfigurationDetailResponse> showConfigurationDetailAsync(
        ShowConfigurationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showConfigurationDetail);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailAsyncInvoker(
        ShowConfigurationDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询实例容灾监控实时状态
     *
     * 查询实例容灾监控实时状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterInstanceMonitorRequest 请求对象
     * @return CompletableFuture<ShowCrossCloudDisasterInstanceMonitorResponse>
     */
    public CompletableFuture<ShowCrossCloudDisasterInstanceMonitorResponse> showCrossCloudDisasterInstanceMonitorAsync(
        ShowCrossCloudDisasterInstanceMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showCrossCloudDisasterInstanceMonitor);
    }

    /**
     * 查询实例容灾监控实时状态
     *
     * 查询实例容灾监控实时状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterInstanceMonitorRequest 请求对象
     * @return AsyncInvoker<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse>
     */
    public AsyncInvoker<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse> showCrossCloudDisasterInstanceMonitorAsyncInvoker(
        ShowCrossCloudDisasterInstanceMonitorRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showCrossCloudDisasterInstanceMonitor, hcClient);
    }

    /**
     * 查询容灾关系列表
     *
     * 查询容灾关系列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterRelationsRequest 请求对象
     * @return CompletableFuture<ShowCrossCloudDisasterRelationsResponse>
     */
    public CompletableFuture<ShowCrossCloudDisasterRelationsResponse> showCrossCloudDisasterRelationsAsync(
        ShowCrossCloudDisasterRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showCrossCloudDisasterRelations);
    }

    /**
     * 查询容灾关系列表
     *
     * 查询容灾关系列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterRelationsRequest 请求对象
     * @return AsyncInvoker<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse>
     */
    public AsyncInvoker<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse> showCrossCloudDisasterRelationsAsyncInvoker(
        ShowCrossCloudDisasterRelationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showCrossCloudDisasterRelations, hcClient);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return CompletableFuture<ShowDeploymentFormResponse>
     */
    public CompletableFuture<ShowDeploymentFormResponse> showDeploymentFormAsync(ShowDeploymentFormRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showDeploymentForm);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return AsyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse>
     */
    public AsyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse> showDeploymentFormAsyncInvoker(
        ShowDeploymentFormRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showDeploymentForm, hcClient);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowErrorLogSwitchStatusResponse>
     */
    public CompletableFuture<ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatusAsync(
        ShowErrorLogSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse>
     */
    public AsyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatusAsyncInvoker(
        ShowErrorLogSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return CompletableFuture<ShowInstanceDiskResponse>
     */
    public CompletableFuture<ShowInstanceDiskResponse> showInstanceDiskAsync(ShowInstanceDiskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceDisk);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return AsyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse>
     */
    public AsyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse> showInstanceDiskAsyncInvoker(
        ShowInstanceDiskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceDisk, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return CompletableFuture<ShowInstanceParamGroupResponse>
     */
    public CompletableFuture<ShowInstanceParamGroupResponse> showInstanceParamGroupAsync(
        ShowInstanceParamGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceParamGroup);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return AsyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse>
     */
    public AsyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> showInstanceParamGroupAsyncInvoker(
        ShowInstanceParamGroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceParamGroup, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowInstanceParamGroupDetailResponse>
     */
    public CompletableFuture<ShowInstanceParamGroupDetailResponse> showInstanceParamGroupDetailAsync(
        ShowInstanceParamGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceParamGroupDetail);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse>
     */
    public AsyncInvoker<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse> showInstanceParamGroupDetailAsyncInvoker(
        ShowInstanceParamGroupDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceParamGroupDetail, hcClient);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return CompletableFuture<ShowInstanceSnapshotResponse>
     */
    public CompletableFuture<ShowInstanceSnapshotResponse> showInstanceSnapshotAsync(
        ShowInstanceSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceSnapshot);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse>
     */
    public AsyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> showInstanceSnapshotAsyncInvoker(
        ShowInstanceSnapshotRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceSnapshot, hcClient);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return CompletableFuture<ShowJobDetailResponse>
     */
    public CompletableFuture<ShowJobDetailResponse> showJobDetailAsync(ShowJobDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showJobDetail);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public AsyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailAsyncInvoker(
        ShowJobDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showJobDetail, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowParameterGroupDetailRequest 请求对象
     * @return CompletableFuture<ShowParameterGroupDetailResponse>
     */
    public CompletableFuture<ShowParameterGroupDetailResponse> showParameterGroupDetailAsync(
        ShowParameterGroupDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showParameterGroupDetail);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowParameterGroupDetailRequest 请求对象
     * @return AsyncInvoker<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse>
     */
    public AsyncInvoker<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse> showParameterGroupDetailAsyncInvoker(
        ShowParameterGroupDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showParameterGroupDetail, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return CompletableFuture<ShowProjectQuotasResponse>
     */
    public CompletableFuture<ShowProjectQuotasResponse> showProjectQuotasAsync(ShowProjectQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return AsyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse>
     */
    public AsyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse> showProjectQuotasAsyncInvoker(
        ShowProjectQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showProjectQuotas, hcClient);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showRecyclePolicy);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return CompletableFuture<ShowSlowLogDownloadResponse>
     */
    public CompletableFuture<ShowSlowLogDownloadResponse> showSlowLogDownloadAsync(ShowSlowLogDownloadRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowLogDownload);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return AsyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse>
     */
    public AsyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> showSlowLogDownloadAsyncInvoker(
        ShowSlowLogDownloadRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowLogDownload, hcClient);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceInstanceDetailRequest 请求对象
     * @return CompletableFuture<ShowSourceInstanceDetailResponse>
     */
    public CompletableFuture<ShowSourceInstanceDetailResponse> showSourceInstanceDetailAsync(
        ShowSourceInstanceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSourceInstanceDetail);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceInstanceDetailRequest 请求对象
     * @return AsyncInvoker<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse>
     */
    public AsyncInvoker<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse> showSourceInstanceDetailAsyncInvoker(
        ShowSourceInstanceDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSourceInstanceDetail, hcClient);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowSslCertDownloadLinkResponse>
     */
    public CompletableFuture<ShowSslCertDownloadLinkResponse> showSslCertDownloadLinkAsync(
        ShowSslCertDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSslCertDownloadLink);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse>
     */
    public AsyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> showSslCertDownloadLinkAsyncInvoker(
        ShowSslCertDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSslCertDownloadLink, hcClient);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return CompletableFuture<ShowUpgradeCandidateVersionsResponse>
     */
    public CompletableFuture<ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersionsAsync(
        ShowUpgradeCandidateVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse>
     */
    public AsyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersionsAsyncInvoker(
        ShowUpgradeCandidateVersionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions, hcClient);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsDetailsRequest 请求对象
     * @return CompletableFuture<ShowUpgradeCandidateVersionsDetailsResponse>
     */
    public CompletableFuture<ShowUpgradeCandidateVersionsDetailsResponse> showUpgradeCandidateVersionsDetailsAsync(
        ShowUpgradeCandidateVersionsDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersionsDetails);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsDetailsRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse>
     */
    public AsyncInvoker<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse> showUpgradeCandidateVersionsDetailsAsyncInvoker(
        ShowUpgradeCandidateVersionsDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersionsDetails, hcClient);
    }

    /**
     * 启动数据库
     *
     * 启动数据库，同时支持节点级别的启动操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return CompletableFuture<StartInstanceResponse>
     */
    public CompletableFuture<StartInstanceResponse> startInstanceAsync(StartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.startInstance);
    }

    /**
     * 启动数据库
     *
     * 启动数据库，同时支持节点级别的启动操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return AsyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public AsyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceAsyncInvoker(
        StartInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.startInstance, hcClient);
    }

    /**
     * 开启M兼容端口服务
     *
     * 开启指定实例的M兼容端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMysqlCompatibilityRequest 请求对象
     * @return CompletableFuture<StartMysqlCompatibilityResponse>
     */
    public CompletableFuture<StartMysqlCompatibilityResponse> startMysqlCompatibilityAsync(
        StartMysqlCompatibilityRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.startMysqlCompatibility);
    }

    /**
     * 开启M兼容端口服务
     *
     * 开启指定实例的M兼容端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMysqlCompatibilityRequest 请求对象
     * @return AsyncInvoker<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse>
     */
    public AsyncInvoker<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse> startMysqlCompatibilityAsyncInvoker(
        StartMysqlCompatibilityRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.startMysqlCompatibility, hcClient);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return CompletableFuture<StopBackupResponse>
     */
    public CompletableFuture<StopBackupResponse> stopBackupAsync(StopBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return AsyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public AsyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupAsyncInvoker(StopBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopBackup, hcClient);
    }

    /**
     * 停止数据库
     *
     * 停止数据库,同时支持节点级别的停止操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopInstance);
    }

    /**
     * 停止数据库
     *
     * 停止数据库,同时支持节点级别的停止操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return AsyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopInstance, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return CompletableFuture<SwitchConfigurationResponse>
     */
    public CompletableFuture<SwitchConfigurationResponse> switchConfigurationAsync(SwitchConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public AsyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationAsyncInvoker(
        SwitchConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchConfiguration, hcClient);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return CompletableFuture<SwitchShardResponse>
     */
    public CompletableFuture<SwitchShardResponse> switchShardAsync(SwitchShardRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchShard);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return AsyncInvoker<SwitchShardRequest, SwitchShardResponse>
     */
    public AsyncInvoker<SwitchShardRequest, SwitchShardResponse> switchShardAsyncInvoker(SwitchShardRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchShard, hcClient);
    }

    /**
     * 开启特性
     *
     * 打开高级特性开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFeaturesRequest 请求对象
     * @return CompletableFuture<UpdateFeaturesResponse>
     */
    public CompletableFuture<UpdateFeaturesResponse> updateFeaturesAsync(UpdateFeaturesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateFeatures);
    }

    /**
     * 开启特性
     *
     * 打开高级特性开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFeaturesRequest 请求对象
     * @return AsyncInvoker<UpdateFeaturesRequest, UpdateFeaturesResponse>
     */
    public AsyncInvoker<UpdateFeaturesRequest, UpdateFeaturesResponse> updateFeaturesAsyncInvoker(
        UpdateFeaturesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateFeatures, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceName, hcClient);
    }

    /**
     * 更新/关闭M兼容端口服务
     *
     * 更新指定实例的M兼容端口服务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMysqlCompatibilityRequest 请求对象
     * @return CompletableFuture<UpdateMysqlCompatibilityResponse>
     */
    public CompletableFuture<UpdateMysqlCompatibilityResponse> updateMysqlCompatibilityAsync(
        UpdateMysqlCompatibilityRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateMysqlCompatibility);
    }

    /**
     * 更新/关闭M兼容端口服务
     *
     * 更新指定实例的M兼容端口服务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMysqlCompatibilityRequest 请求对象
     * @return AsyncInvoker<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse>
     */
    public AsyncInvoker<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse> updateMysqlCompatibilityAsyncInvoker(
        UpdateMysqlCompatibilityRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateMysqlCompatibility, hcClient);
    }

    /**
     * 实例内核版本升级
     *
     * GaussDB(for openGauss)实例版本升级。包括灰度升级，就地升级，热补丁升级等三种升级方式。 
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 灰度升级： 
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。 
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 热补丁升级： 
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。 
     * 升级回退：热补丁回退，无业务中断时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceVersionRequest 请求对象
     * @return CompletableFuture<UpgradeInstanceVersionResponse>
     */
    public CompletableFuture<UpgradeInstanceVersionResponse> upgradeInstanceVersionAsync(
        UpgradeInstanceVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstanceVersion);
    }

    /**
     * 实例内核版本升级
     *
     * GaussDB(for openGauss)实例版本升级。包括灰度升级，就地升级，热补丁升级等三种升级方式。 
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 灰度升级： 
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。 
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 热补丁升级： 
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。 
     * 升级回退：热补丁回退，无业务中断时间
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstanceVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse>
     */
    public AsyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> upgradeInstanceVersionAsyncInvoker(
        UpgradeInstanceVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstanceVersion, hcClient);
    }

    /**
     * 批量实例内核版本升级
     *
     * GaussDB批量实例版本升级。包括灰度升级，就地升级、热补丁升级三种升级方式。
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。
     * 灰度升级：
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。
     * 热补丁升级：
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 批量实例可升级版本大于当前所有实例的引擎版本，且选择的所有实例，其升级方式和操作方式要保持一致。
     * 若批量实例升级方式是灰度升级，默认升级所有az和分片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstancesVersionRequest 请求对象
     * @return CompletableFuture<UpgradeInstancesVersionResponse>
     */
    public CompletableFuture<UpgradeInstancesVersionResponse> upgradeInstancesVersionAsync(
        UpgradeInstancesVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstancesVersion);
    }

    /**
     * 批量实例内核版本升级
     *
     * GaussDB批量实例版本升级。包括灰度升级，就地升级、热补丁升级三种升级方式。
     * 就地升级：
     * 就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。
     * 灰度升级：
     * 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。
     * 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。升级阶段可以根据部署方式细分为按分片或者按az的滚动升级，提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级，或者升级回退。每个主dn或者cn组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。 分布式实例：根据分片数滚动升级，每次滚动升级可以根据选择的分片数进行指定分片数量的节点进行升级。 主备版实例：根据AZ数进行滚动升级，每次滚动升级可以根据选择的AZ进行1个分区或者多个分区进行升级。
     * 热补丁升级：
     * 升级自动提交：热补丁自动升级并提交，中间无业务中断，仅修复产品bug。
     * 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 批量实例可升级版本大于当前所有实例的引擎版本，且选择的所有实例，其升级方式和操作方式要保持一致。
     * 若批量实例升级方式是灰度升级，默认升级所有az和分片。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeInstancesVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse>
     */
    public AsyncInvoker<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse> upgradeInstancesVersionAsyncInvoker(
        UpgradeInstancesVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstancesVersion, hcClient);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return CompletableFuture<ValidateParaGroupNameResponse>
     */
    public CompletableFuture<ValidateParaGroupNameResponse> validateParaGroupNameAsync(
        ValidateParaGroupNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.validateParaGroupName);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return AsyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse>
     */
    public AsyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> validateParaGroupNameAsyncInvoker(
        ValidateParaGroupNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.validateParaGroupName, hcClient);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return CompletableFuture<ValidateWeakPasswordResponse>
     */
    public CompletableFuture<ValidateWeakPasswordResponse> validateWeakPasswordAsync(
        ValidateWeakPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.validateWeakPassword);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>
     */
    public AsyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPasswordAsyncInvoker(
        ValidateWeakPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.validateWeakPassword, hcClient);
    }

    /**
     * 创建限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLimitTaskRequest 请求对象
     * @return CompletableFuture<CreateLimitTaskResponse>
     */
    public CompletableFuture<CreateLimitTaskResponse> createLimitTaskAsync(CreateLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createLimitTask);
    }

    /**
     * 创建限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLimitTaskRequest 请求对象
     * @return AsyncInvoker<CreateLimitTaskRequest, CreateLimitTaskResponse>
     */
    public AsyncInvoker<CreateLimitTaskRequest, CreateLimitTaskResponse> createLimitTaskAsyncInvoker(
        CreateLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createLimitTask, hcClient);
    }

    /**
     * 删除限流任务
     *
     * 根据task_id进行限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLimitTaskRequest 请求对象
     * @return CompletableFuture<DeleteLimitTaskResponse>
     */
    public CompletableFuture<DeleteLimitTaskResponse> deleteLimitTaskAsync(DeleteLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteLimitTask);
    }

    /**
     * 删除限流任务
     *
     * 根据task_id进行限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLimitTaskRequest 请求对象
     * @return AsyncInvoker<DeleteLimitTaskRequest, DeleteLimitTaskResponse>
     */
    public AsyncInvoker<DeleteLimitTaskRequest, DeleteLimitTaskResponse> deleteLimitTaskAsyncInvoker(
        DeleteLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteLimitTask, hcClient);
    }

    /**
     * 根据指定条件查询限流任务列表
     *
     * 根据指定条件查询限流任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLimitTaskRequest 请求对象
     * @return CompletableFuture<ListLimitTaskResponse>
     */
    public CompletableFuture<ListLimitTaskResponse> listLimitTaskAsync(ListLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listLimitTask);
    }

    /**
     * 根据指定条件查询限流任务列表
     *
     * 根据指定条件查询限流任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLimitTaskRequest 请求对象
     * @return AsyncInvoker<ListLimitTaskRequest, ListLimitTaskResponse>
     */
    public AsyncInvoker<ListLimitTaskRequest, ListLimitTaskResponse> listLimitTaskAsyncInvoker(
        ListLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listLimitTask, hcClient);
    }

    /**
     * 查询节点的sql模板列表
     *
     * 查询节点的sql模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLimitSqlModelRequest 请求对象
     * @return CompletableFuture<ListNodeLimitSqlModelResponse>
     */
    public CompletableFuture<ListNodeLimitSqlModelResponse> listNodeLimitSqlModelAsync(
        ListNodeLimitSqlModelRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listNodeLimitSqlModel);
    }

    /**
     * 查询节点的sql模板列表
     *
     * 查询节点的sql模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLimitSqlModelRequest 请求对象
     * @return AsyncInvoker<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse>
     */
    public AsyncInvoker<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse> listNodeLimitSqlModelAsyncInvoker(
        ListNodeLimitSqlModelRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listNodeLimitSqlModel, hcClient);
    }

    /**
     * 查询限流任务详情
     *
     * 查询限流任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLimitTaskRequest 请求对象
     * @return CompletableFuture<ShowLimitTaskResponse>
     */
    public CompletableFuture<ShowLimitTaskResponse> showLimitTaskAsync(ShowLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showLimitTask);
    }

    /**
     * 查询限流任务详情
     *
     * 查询限流任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLimitTaskRequest 请求对象
     * @return AsyncInvoker<ShowLimitTaskRequest, ShowLimitTaskResponse>
     */
    public AsyncInvoker<ShowLimitTaskRequest, ShowLimitTaskResponse> showLimitTaskAsyncInvoker(
        ShowLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showLimitTask, hcClient);
    }

    /**
     * 同步内核侧sql限流数据至管控侧
     *
     * 同步内核侧sql限流数据至管控侧
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncLimitDataRequest 请求对象
     * @return CompletableFuture<SyncLimitDataResponse>
     */
    public CompletableFuture<SyncLimitDataResponse> syncLimitDataAsync(SyncLimitDataRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.syncLimitData);
    }

    /**
     * 同步内核侧sql限流数据至管控侧
     *
     * 同步内核侧sql限流数据至管控侧
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncLimitDataRequest 请求对象
     * @return AsyncInvoker<SyncLimitDataRequest, SyncLimitDataResponse>
     */
    public AsyncInvoker<SyncLimitDataRequest, SyncLimitDataResponse> syncLimitDataAsyncInvoker(
        SyncLimitDataRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.syncLimitData, hcClient);
    }

    /**
     * 修改限流任务
     *
     * 根据新的条件进行限流任务的更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLimitTaskRequest 请求对象
     * @return CompletableFuture<UpdateLimitTaskResponse>
     */
    public CompletableFuture<UpdateLimitTaskResponse> updateLimitTaskAsync(UpdateLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateLimitTask);
    }

    /**
     * 修改限流任务
     *
     * 根据新的条件进行限流任务的更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLimitTaskRequest 请求对象
     * @return AsyncInvoker<UpdateLimitTaskRequest, UpdateLimitTaskResponse>
     */
    public AsyncInvoker<UpdateLimitTaskRequest, UpdateLimitTaskResponse> updateLimitTaskAsyncInvoker(
        UpdateLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateLimitTask, hcClient);
    }

}

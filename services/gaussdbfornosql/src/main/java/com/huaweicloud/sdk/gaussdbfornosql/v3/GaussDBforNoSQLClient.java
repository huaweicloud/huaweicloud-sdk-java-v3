package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationToInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ApplyConfigurationToInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchDeleteManualBackupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchDeleteManualBackupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchUpgradeDatabaseVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.BatchUpgradeDatabaseVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CancelInstanceScheduleWindowRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CancelInstanceScheduleWindowResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckDisasterRecoveryOperationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckDisasterRecoveryOperationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CheckWeekPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ClearInstanceSessionsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ClearInstanceSessionsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CompareConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateBackRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateBackResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateColdVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheMappingRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheMappingResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheRuleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbCacheRuleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDisasterRecoveryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateDisasterRecoveryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateGeminiDbDualActiveRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateGeminiDbDualActiveResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteBackupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteBackupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheMappingRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheMappingResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheRuleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbCacheRuleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteEnlargeFailNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteGeminiDbDualActiveRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteGeminiDbDualActiveResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteInstancesSessionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteRedisDisabledCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.DeleteRedisDisabledCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ExpandInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListAvailableFlavorInfosRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListAvailableFlavorInfosResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListCassandraSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationDatastoresRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationDatastoresResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationTemplatesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationTemplatesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheMappingsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheMappingsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheRulesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbCacheRulesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDedicatedResourcesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListDedicatedResourcesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorInfosRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorInfosResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInfluxdbSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInfluxdbSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceMaintenanceWindowRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceMaintenanceWindowResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceSessionsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceSessionsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByResourceTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByResourceTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesByTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionStatisticsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListInstancesSessionStatisticsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListJobsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListJobsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbErrorLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbErrorLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListMongodbSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListNosqlTaskListRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListNosqlTaskListResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisPitrRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisPitrRestoreTimeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRedisSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListRestoreTimeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyAutoNodeExpansionPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyAutoNodeExpansionPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyDbUserPrivilegeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyDbUserPrivilegeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyInstanceMaintenanceWindowRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyInstanceMaintenanceWindowResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPortResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyPublicIpResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ModifyVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.OfflineNodesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PauseResumeDataSynchronizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.PauseResumeDataSynchronizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetDbUserPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetDbUserPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetParamGroupTemplateRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetParamGroupTemplateResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResetPasswordResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeColdVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ResizeInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreExistingInstanceRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreExistingInstanceResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreRedisDataRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreRedisDataResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreRedisPitrRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.RestoreRedisPitrResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveRedisDisabledCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SaveRedisDisabledCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetDisasterRecoverySettingsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetDisasterRecoverySettingsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetInstanceDataDumpRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetInstanceDataDumpResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetRedisPitrPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SetRedisPitrPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsNewRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsNewResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAllInstancesBackupsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplicableInstancesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplicableInstancesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplyHistoryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowApplyHistoryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAutoNodeExpansionPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowAutoNodeExpansionPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPoliciesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPoliciesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowConfigurationDetailRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowConfigurationDetailResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowDisasterRecoverySettingsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowDisasterRecoverySettingsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowElbIpGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowElbIpGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowErrorLogRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowErrorLogResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowHighRiskCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowHighRiskCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceBiactiveRegionsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceBiactiveRegionsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceRoleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowInstanceRoleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowIpNumRequirementRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowIpNumRequirementResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowModifyHistoryRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowModifyHistoryResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPasswordlessConfigRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPasswordlessConfigResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPauseResumeStutusRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowPauseResumeStutusResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisBigKeysRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisBigKeysResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisDisabledCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisDisabledCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisHotKeysRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisHotKeysResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisPitrInfoRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisPitrInfoResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisPitrPolicyRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRedisPitrPolicyResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRestorableListRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowRestorableListResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSecondLevelMonitoringStatusRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSecondLevelMonitoringStatusResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSlowLogDesensitizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShowSlowLogDesensitizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.ShrinkInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchIpGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchOverRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchOverResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSecondLevelMonitoringRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSecondLevelMonitoringResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSlowlogDesensitizationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToMasterResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToSlaveRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.SwitchToSlaveResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateClientNetworkResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDatabasesResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDbCacheRuleRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateDbCacheRuleResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateHighRiskCommandsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateHighRiskCommandsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdatePasswordlessConfigRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdatePasswordlessConfigResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpdateSecurityGroupResponse;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpgradeDbVersionRequest;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.UpgradeDbVersionResponse;

public class GaussDBforNoSQLClient {

    protected HcClient hcClient;

    public GaussDBforNoSQLClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforNoSQLClient> newBuilder() {
        ClientBuilder<GaussDBforNoSQLClient> clientBuilder = new ClientBuilder<>(GaussDBforNoSQLClient::new);
        return clientBuilder;
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationRequest 请求对象
     * @return ApplyConfigurationResponse
     */
    public ApplyConfigurationResponse applyConfiguration(ApplyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationRequest 请求对象
     * @return SyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>
     */
    public SyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfigurationInvoker(
        ApplyConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.applyConfiguration, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationToInstancesRequest 请求对象
     * @return ApplyConfigurationToInstancesResponse
     */
    public ApplyConfigurationToInstancesResponse applyConfigurationToInstances(
        ApplyConfigurationToInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfigurationToInstances);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationToInstancesRequest 请求对象
     * @return SyncInvoker<ApplyConfigurationToInstancesRequest, ApplyConfigurationToInstancesResponse>
     */
    public SyncInvoker<ApplyConfigurationToInstancesRequest, ApplyConfigurationToInstancesResponse> applyConfigurationToInstancesInvoker(
        ApplyConfigurationToInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.applyConfigurationToInstances, hcClient);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteManualBackupRequest 请求对象
     * @return BatchDeleteManualBackupResponse
     */
    public BatchDeleteManualBackupResponse batchDeleteManualBackup(BatchDeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.batchDeleteManualBackup);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除数据库实例的手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteManualBackupRequest 请求对象
     * @return SyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse>
     */
    public SyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> batchDeleteManualBackupInvoker(
        BatchDeleteManualBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.batchDeleteManualBackup, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(
        BatchTagActionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.batchTagAction, hcClient);
    }

    /**
     * 批量数据库补丁升级
     *
     * 批量升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeDatabaseVersionRequest 请求对象
     * @return BatchUpgradeDatabaseVersionResponse
     */
    public BatchUpgradeDatabaseVersionResponse batchUpgradeDatabaseVersion(BatchUpgradeDatabaseVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.batchUpgradeDatabaseVersion);
    }

    /**
     * 批量数据库补丁升级
     *
     * 批量升级数据库补丁版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpgradeDatabaseVersionRequest 请求对象
     * @return SyncInvoker<BatchUpgradeDatabaseVersionRequest, BatchUpgradeDatabaseVersionResponse>
     */
    public SyncInvoker<BatchUpgradeDatabaseVersionRequest, BatchUpgradeDatabaseVersionResponse> batchUpgradeDatabaseVersionInvoker(
        BatchUpgradeDatabaseVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.batchUpgradeDatabaseVersion, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInstanceScheduleWindowRequest 请求对象
     * @return CancelInstanceScheduleWindowResponse
     */
    public CancelInstanceScheduleWindowResponse cancelInstanceScheduleWindow(
        CancelInstanceScheduleWindowRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.cancelInstanceScheduleWindow);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelInstanceScheduleWindowRequest 请求对象
     * @return SyncInvoker<CancelInstanceScheduleWindowRequest, CancelInstanceScheduleWindowResponse>
     */
    public SyncInvoker<CancelInstanceScheduleWindowRequest, CancelInstanceScheduleWindowResponse> cancelInstanceScheduleWindowInvoker(
        CancelInstanceScheduleWindowRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.cancelInstanceScheduleWindow, hcClient);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterRecoveryOperationRequest 请求对象
     * @return CheckDisasterRecoveryOperationResponse
     */
    public CheckDisasterRecoveryOperationResponse checkDisasterRecoveryOperation(
        CheckDisasterRecoveryOperationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.checkDisasterRecoveryOperation);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDisasterRecoveryOperationRequest 请求对象
     * @return SyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse>
     */
    public SyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperationInvoker(
        CheckDisasterRecoveryOperationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.checkDisasterRecoveryOperation, hcClient);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeekPasswordRequest 请求对象
     * @return CheckWeekPasswordResponse
     */
    public CheckWeekPasswordResponse checkWeekPassword(CheckWeekPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.checkWeekPassword);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckWeekPasswordRequest 请求对象
     * @return SyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse>
     */
    public SyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse> checkWeekPasswordInvoker(
        CheckWeekPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.checkWeekPassword, hcClient);
    }

    /**
     * 关闭实例所有节点会话
     *
     * 关闭实例所有节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearInstanceSessionsRequest 请求对象
     * @return ClearInstanceSessionsResponse
     */
    public ClearInstanceSessionsResponse clearInstanceSessions(ClearInstanceSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.clearInstanceSessions);
    }

    /**
     * 关闭实例所有节点会话
     *
     * 关闭实例所有节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearInstanceSessionsRequest 请求对象
     * @return SyncInvoker<ClearInstanceSessionsRequest, ClearInstanceSessionsResponse>
     */
    public SyncInvoker<ClearInstanceSessionsRequest, ClearInstanceSessionsResponse> clearInstanceSessionsInvoker(
        ClearInstanceSessionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.clearInstanceSessions, hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return CompareConfigurationResponse
     */
    public CompareConfigurationResponse compareConfiguration(CompareConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareConfigurationRequest 请求对象
     * @return SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public SyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationInvoker(
        CompareConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackRequest 请求对象
     * @return CreateBackResponse
     */
    public CreateBackResponse createBack(CreateBackRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createBack);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBackRequest 请求对象
     * @return SyncInvoker<CreateBackRequest, CreateBackResponse>
     */
    public SyncInvoker<CreateBackRequest, CreateBackResponse> createBackInvoker(CreateBackRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createBack, hcClient);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateColdVolumeRequest 请求对象
     * @return CreateColdVolumeResponse
     */
    public CreateColdVolumeResponse createColdVolume(CreateColdVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createColdVolume);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateColdVolumeRequest 请求对象
     * @return SyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse>
     */
    public SyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse> createColdVolumeInvoker(
        CreateColdVolumeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createColdVolume, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return CreateConfigurationResponse
     */
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createConfiguration, hcClient);
    }

    /**
     * 创建内存加速映射
     *
     * 创建内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheMappingRequest 请求对象
     * @return CreateDbCacheMappingResponse
     */
    public CreateDbCacheMappingResponse createDbCacheMapping(CreateDbCacheMappingRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createDbCacheMapping);
    }

    /**
     * 创建内存加速映射
     *
     * 创建内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheMappingRequest 请求对象
     * @return SyncInvoker<CreateDbCacheMappingRequest, CreateDbCacheMappingResponse>
     */
    public SyncInvoker<CreateDbCacheMappingRequest, CreateDbCacheMappingResponse> createDbCacheMappingInvoker(
        CreateDbCacheMappingRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createDbCacheMapping, hcClient);
    }

    /**
     * 创建内存加速规则
     *
     * 创建内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheRuleRequest 请求对象
     * @return CreateDbCacheRuleResponse
     */
    public CreateDbCacheRuleResponse createDbCacheRule(CreateDbCacheRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createDbCacheRule);
    }

    /**
     * 创建内存加速规则
     *
     * 创建内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbCacheRuleRequest 请求对象
     * @return SyncInvoker<CreateDbCacheRuleRequest, CreateDbCacheRuleResponse>
     */
    public SyncInvoker<CreateDbCacheRuleRequest, CreateDbCacheRuleResponse> createDbCacheRuleInvoker(
        CreateDbCacheRuleRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createDbCacheRule, hcClient);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse
     */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createDbUser);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createDbUser, hcClient);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryRequest 请求对象
     * @return CreateDisasterRecoveryResponse
     */
    public CreateDisasterRecoveryResponse createDisasterRecovery(CreateDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createDisasterRecovery);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public SyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryInvoker(
        CreateDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 搭建双活
     *
     * 为了实现跨区域实例数据同步，GeminiDB提供了异地双活功能，即创建异地双活实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGeminiDbDualActiveRequest 请求对象
     * @return CreateGeminiDbDualActiveResponse
     */
    public CreateGeminiDbDualActiveResponse createGeminiDbDualActive(CreateGeminiDbDualActiveRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createGeminiDbDualActive);
    }

    /**
     * 搭建双活
     *
     * 为了实现跨区域实例数据同步，GeminiDB提供了异地双活功能，即创建异地双活实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGeminiDbDualActiveRequest 请求对象
     * @return SyncInvoker<CreateGeminiDbDualActiveRequest, CreateGeminiDbDualActiveResponse>
     */
    public SyncInvoker<CreateGeminiDbDualActiveRequest, CreateGeminiDbDualActiveResponse> createGeminiDbDualActiveInvoker(
        CreateGeminiDbDualActiveRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createGeminiDbDualActive, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.createInstance, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBackupRequest 请求对象
     * @return SyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public SyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupInvoker(DeleteBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteBackup, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteConfiguration, hcClient);
    }

    /**
     * 解除内存加速映射
     *
     * 解除指定内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheMappingRequest 请求对象
     * @return DeleteDbCacheMappingResponse
     */
    public DeleteDbCacheMappingResponse deleteDbCacheMapping(DeleteDbCacheMappingRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbCacheMapping);
    }

    /**
     * 解除内存加速映射
     *
     * 解除指定内存加速映射。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheMappingRequest 请求对象
     * @return SyncInvoker<DeleteDbCacheMappingRequest, DeleteDbCacheMappingResponse>
     */
    public SyncInvoker<DeleteDbCacheMappingRequest, DeleteDbCacheMappingResponse> deleteDbCacheMappingInvoker(
        DeleteDbCacheMappingRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDbCacheMapping, hcClient);
    }

    /**
     * 删除内存加速规则
     *
     * 删除内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheRuleRequest 请求对象
     * @return DeleteDbCacheRuleResponse
     */
    public DeleteDbCacheRuleResponse deleteDbCacheRule(DeleteDbCacheRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbCacheRule);
    }

    /**
     * 删除内存加速规则
     *
     * 删除内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbCacheRuleRequest 请求对象
     * @return SyncInvoker<DeleteDbCacheRuleRequest, DeleteDbCacheRuleResponse>
     */
    public SyncInvoker<DeleteDbCacheRuleRequest, DeleteDbCacheRuleResponse> deleteDbCacheRuleInvoker(
        DeleteDbCacheRuleRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDbCacheRule, hcClient);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbUser);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDbUser, hcClient);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecoveryRequest 请求对象
     * @return DeleteDisasterRecoveryResponse
     */
    public DeleteDisasterRecoveryResponse deleteDisasterRecovery(DeleteDisasterRecoveryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDisasterRecovery);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecoveryRequest 请求对象
     * @return SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public SyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnlargeFailNodeRequest 请求对象
     * @return DeleteEnlargeFailNodeResponse
     */
    public DeleteEnlargeFailNodeResponse deleteEnlargeFailNode(DeleteEnlargeFailNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteEnlargeFailNode);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEnlargeFailNodeRequest 请求对象
     * @return SyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse>
     */
    public SyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> deleteEnlargeFailNodeInvoker(
        DeleteEnlargeFailNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteEnlargeFailNode, hcClient);
    }

    /**
     * 解除双活
     *
     * 解除跨区域双活。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeminiDbDualActiveRequest 请求对象
     * @return DeleteGeminiDbDualActiveResponse
     */
    public DeleteGeminiDbDualActiveResponse deleteGeminiDbDualActive(DeleteGeminiDbDualActiveRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteGeminiDbDualActive);
    }

    /**
     * 解除双活
     *
     * 解除跨区域双活。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGeminiDbDualActiveRequest 请求对象
     * @return SyncInvoker<DeleteGeminiDbDualActiveRequest, DeleteGeminiDbDualActiveResponse>
     */
    public SyncInvoker<DeleteGeminiDbDualActiveRequest, DeleteGeminiDbDualActiveResponse> deleteGeminiDbDualActiveInvoker(
        DeleteGeminiDbDualActiveRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteGeminiDbDualActive, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteInstance, hcClient);
    }

    /**
     * 关闭实例节点会话
     *
     * 关闭实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesSessionRequest 请求对象
     * @return DeleteInstancesSessionResponse
     */
    public DeleteInstancesSessionResponse deleteInstancesSession(DeleteInstancesSessionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstancesSession);
    }

    /**
     * 关闭实例节点会话
     *
     * 关闭实例节点会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstancesSessionRequest 请求对象
     * @return SyncInvoker<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse>
     */
    public SyncInvoker<DeleteInstancesSessionRequest, DeleteInstancesSessionResponse> deleteInstancesSessionInvoker(
        DeleteInstancesSessionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteInstancesSession, hcClient);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigsRequest 请求对象
     * @return DeleteLtsConfigsResponse
     */
    public DeleteLtsConfigsResponse deleteLtsConfigs(DeleteLtsConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteLtsConfigs);
    }

    /**
     * 解除关联LTS日志流
     *
     * 将实例日志与LTS日志流解除关联，后台将取消上传实例日志到的LTS日志流里。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigsRequest 请求对象
     * @return SyncInvoker<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse>
     */
    public SyncInvoker<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> deleteLtsConfigsInvoker(
        DeleteLtsConfigsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteLtsConfigs, hcClient);
    }

    /**
     * 删除Redis禁用命令
     *
     * 删除Redis禁用命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRedisDisabledCommandsRequest 请求对象
     * @return DeleteRedisDisabledCommandsResponse
     */
    public DeleteRedisDisabledCommandsResponse deleteRedisDisabledCommands(DeleteRedisDisabledCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.deleteRedisDisabledCommands);
    }

    /**
     * 删除Redis禁用命令
     *
     * 删除Redis禁用命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRedisDisabledCommandsRequest 请求对象
     * @return SyncInvoker<DeleteRedisDisabledCommandsRequest, DeleteRedisDisabledCommandsResponse>
     */
    public SyncInvoker<DeleteRedisDisabledCommandsRequest, DeleteRedisDisabledCommandsResponse> deleteRedisDisabledCommandsInvoker(
        DeleteRedisDisabledCommandsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.deleteRedisDisabledCommands, hcClient);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceNodeRequest 请求对象
     * @return ExpandInstanceNodeResponse
     */
    public ExpandInstanceNodeResponse expandInstanceNode(ExpandInstanceNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.expandInstanceNode);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandInstanceNodeRequest 请求对象
     * @return SyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>
     */
    public SyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNodeInvoker(
        ExpandInstanceNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.expandInstanceNode, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorInfosRequest 请求对象
     * @return ListAvailableFlavorInfosResponse
     */
    public ListAvailableFlavorInfosResponse listAvailableFlavorInfos(ListAvailableFlavorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listAvailableFlavorInfos);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorInfosRequest 请求对象
     * @return SyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse>
     */
    public SyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> listAvailableFlavorInfosInvoker(
        ListAvailableFlavorInfosRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listAvailableFlavorInfos, hcClient);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listBackups);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listBackups, hcClient);
    }

    /**
     * 查询GeminiDB(for Cassandra)数据库慢日志
     *
     * 查询GeminiDB(for Cassandra)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCassandraSlowLogsRequest 请求对象
     * @return ListCassandraSlowLogsResponse
     */
    public ListCassandraSlowLogsResponse listCassandraSlowLogs(ListCassandraSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listCassandraSlowLogs);
    }

    /**
     * 查询GeminiDB(for Cassandra)数据库慢日志
     *
     * 查询GeminiDB(for Cassandra)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCassandraSlowLogsRequest 请求对象
     * @return SyncInvoker<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse>
     */
    public SyncInvoker<ListCassandraSlowLogsRequest, ListCassandraSlowLogsResponse> listCassandraSlowLogsInvoker(
        ListCassandraSlowLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listCassandraSlowLogs, hcClient);
    }

    /**
     * 查询支持参数模板的接口信息
     *
     * 查询支持参数模板的接口信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDatastoresRequest 请求对象
     * @return ListConfigurationDatastoresResponse
     */
    public ListConfigurationDatastoresResponse listConfigurationDatastores(ListConfigurationDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationDatastores);
    }

    /**
     * 查询支持参数模板的接口信息
     *
     * 查询支持参数模板的接口信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationDatastoresRequest 请求对象
     * @return SyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse>
     */
    public SyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> listConfigurationDatastoresInvoker(
        ListConfigurationDatastoresRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listConfigurationDatastores, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationTemplatesRequest 请求对象
     * @return ListConfigurationTemplatesResponse
     */
    public ListConfigurationTemplatesResponse listConfigurationTemplates(ListConfigurationTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationTemplatesRequest 请求对象
     * @return SyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>
     */
    public SyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplatesInvoker(
        ListConfigurationTemplatesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listConfigurationTemplates, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listConfigurations, hcClient);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse
     */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDatastores);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listDatastores, hcClient);
    }

    /**
     * 查询内存加速映射列表和详情
     *
     * 根据指定条件查询内存加速映射关系列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheMappingsRequest 请求对象
     * @return ListDbCacheMappingsResponse
     */
    public ListDbCacheMappingsResponse listDbCacheMappings(ListDbCacheMappingsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDbCacheMappings);
    }

    /**
     * 查询内存加速映射列表和详情
     *
     * 根据指定条件查询内存加速映射关系列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheMappingsRequest 请求对象
     * @return SyncInvoker<ListDbCacheMappingsRequest, ListDbCacheMappingsResponse>
     */
    public SyncInvoker<ListDbCacheMappingsRequest, ListDbCacheMappingsResponse> listDbCacheMappingsInvoker(
        ListDbCacheMappingsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listDbCacheMappings, hcClient);
    }

    /**
     * 查询内存加速规则列表和详情
     *
     * 查询内存加速规则列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheRulesRequest 请求对象
     * @return ListDbCacheRulesResponse
     */
    public ListDbCacheRulesResponse listDbCacheRules(ListDbCacheRulesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDbCacheRules);
    }

    /**
     * 查询内存加速规则列表和详情
     *
     * 查询内存加速规则列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbCacheRulesRequest 请求对象
     * @return SyncInvoker<ListDbCacheRulesRequest, ListDbCacheRulesResponse>
     */
    public SyncInvoker<ListDbCacheRulesRequest, ListDbCacheRulesResponse> listDbCacheRulesInvoker(
        ListDbCacheRulesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listDbCacheRules, hcClient);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDbUsers);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listDbUsers, hcClient);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDedicatedResourcesRequest 请求对象
     * @return ListDedicatedResourcesResponse
     */
    public ListDedicatedResourcesResponse listDedicatedResources(ListDedicatedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listDedicatedResources);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDedicatedResourcesRequest 请求对象
     * @return SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>
     */
    public SyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesInvoker(
        ListDedicatedResourcesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listDedicatedResources, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return ListEpsQuotasResponse
     */
    public ListEpsQuotasResponse listEpsQuotas(ListEpsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasInvoker(ListEpsQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listEpsQuotas, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return ListFlavorInfosResponse
     */
    public ListFlavorInfosResponse listFlavorInfos(ListFlavorInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorInfosRequest 请求对象
     * @return SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public SyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosInvoker(
        ListFlavorInfosRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listFlavorInfos, hcClient);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavors);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listFlavors, hcClient);
    }

    /**
     * 查询GeminiDB(for influxdb)数据库慢日志
     *
     * 查询GeminiDB(for influxdb)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInfluxdbSlowLogsRequest 请求对象
     * @return ListInfluxdbSlowLogsResponse
     */
    public ListInfluxdbSlowLogsResponse listInfluxdbSlowLogs(ListInfluxdbSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInfluxdbSlowLogs);
    }

    /**
     * 查询GeminiDB(for influxdb)数据库慢日志
     *
     * 查询GeminiDB(for influxdb)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInfluxdbSlowLogsRequest 请求对象
     * @return SyncInvoker<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse>
     */
    public SyncInvoker<ListInfluxdbSlowLogsRequest, ListInfluxdbSlowLogsResponse> listInfluxdbSlowLogsInvoker(
        ListInfluxdbSlowLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInfluxdbSlowLogs, hcClient);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDatabasesRequest 请求对象
     * @return ListInstanceDatabasesResponse
     */
    public ListInstanceDatabasesResponse listInstanceDatabases(ListInstanceDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceDatabases);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDatabasesRequest 请求对象
     * @return SyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse>
     */
    public SyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> listInstanceDatabasesInvoker(
        ListInstanceDatabasesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceDatabases, hcClient);
    }

    /**
     * 查询实例可维护时间段
     *
     * 查询实例可维护时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMaintenanceWindowRequest 请求对象
     * @return ListInstanceMaintenanceWindowResponse
     */
    public ListInstanceMaintenanceWindowResponse listInstanceMaintenanceWindow(
        ListInstanceMaintenanceWindowRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceMaintenanceWindow);
    }

    /**
     * 查询实例可维护时间段
     *
     * 查询实例可维护时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMaintenanceWindowRequest 请求对象
     * @return SyncInvoker<ListInstanceMaintenanceWindowRequest, ListInstanceMaintenanceWindowResponse>
     */
    public SyncInvoker<ListInstanceMaintenanceWindowRequest, ListInstanceMaintenanceWindowResponse> listInstanceMaintenanceWindowInvoker(
        ListInstanceMaintenanceWindowRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceMaintenanceWindow, hcClient);
    }

    /**
     * 获取实例的会话
     *
     * 获取实例的会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSessionsRequest 请求对象
     * @return ListInstanceSessionsResponse
     */
    public ListInstanceSessionsResponse listInstanceSessions(ListInstanceSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceSessions);
    }

    /**
     * 获取实例的会话
     *
     * 获取实例的会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceSessionsRequest 请求对象
     * @return SyncInvoker<ListInstanceSessionsRequest, ListInstanceSessionsResponse>
     */
    public SyncInvoker<ListInstanceSessionsRequest, ListInstanceSessionsResponse> listInstanceSessionsInvoker(
        ListInstanceSessionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceSessions, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstances, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByResourceTagsRequest 请求对象
     * @return ListInstancesByResourceTagsResponse
     */
    public ListInstancesByResourceTagsResponse listInstancesByResourceTags(ListInstancesByResourceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByResourceTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByResourceTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>
     */
    public SyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTagsInvoker(
        ListInstancesByResourceTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesByResourceTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return ListInstancesByTagsResponse
     */
    public ListInstancesByTagsResponse listInstancesByTags(ListInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesByTagsRequest 请求对象
     * @return SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public SyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsInvoker(
        ListInstancesByTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesByTags, hcClient);
    }

    /**
     * 获取节点会话列表
     *
     * 获取节点会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionRequest 请求对象
     * @return ListInstancesSessionResponse
     */
    public ListInstancesSessionResponse listInstancesSession(ListInstancesSessionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesSession);
    }

    /**
     * 获取节点会话列表
     *
     * 获取节点会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionRequest 请求对象
     * @return SyncInvoker<ListInstancesSessionRequest, ListInstancesSessionResponse>
     */
    public SyncInvoker<ListInstancesSessionRequest, ListInstancesSessionResponse> listInstancesSessionInvoker(
        ListInstancesSessionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesSession, hcClient);
    }

    /**
     * 查询实例节点会话统计信息
     *
     * 查询实例节点会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionStatisticsRequest 请求对象
     * @return ListInstancesSessionStatisticsResponse
     */
    public ListInstancesSessionStatisticsResponse listInstancesSessionStatistics(
        ListInstancesSessionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesSessionStatistics);
    }

    /**
     * 查询实例节点会话统计信息
     *
     * 查询实例节点会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSessionStatisticsRequest 请求对象
     * @return SyncInvoker<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse>
     */
    public SyncInvoker<ListInstancesSessionStatisticsRequest, ListInstancesSessionStatisticsResponse> listInstancesSessionStatisticsInvoker(
        ListInstancesSessionStatisticsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listInstancesSessionStatistics, hcClient);
    }

    /**
     * 查询任务列表和详情
     *
     * 查询任务列表和详情，默认查询任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listJobs);
    }

    /**
     * 查询任务列表和详情
     *
     * 查询任务列表和详情，默认查询任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobsRequest 请求对象
     * @return SyncInvoker<ListJobsRequest, ListJobsResponse>
     */
    public SyncInvoker<ListJobsRequest, ListJobsResponse> listJobsInvoker(ListJobsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listJobs, hcClient);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 分页查询实例关联的LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return ListLtsConfigsResponse
     */
    public ListLtsConfigsResponse listLtsConfigs(ListLtsConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listLtsConfigs);
    }

    /**
     * 查询LTS日志配置信息
     *
     * 分页查询实例关联的LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return SyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse>
     */
    public SyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigsInvoker(
        ListLtsConfigsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listLtsConfigs, hcClient);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库错误日志
     *
     * 查询GeminiDB(for Mongo)数据库错误日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbErrorLogsRequest 请求对象
     * @return ListMongodbErrorLogsResponse
     */
    public ListMongodbErrorLogsResponse listMongodbErrorLogs(ListMongodbErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listMongodbErrorLogs);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库错误日志
     *
     * 查询GeminiDB(for Mongo)数据库错误日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbErrorLogsRequest 请求对象
     * @return SyncInvoker<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse>
     */
    public SyncInvoker<ListMongodbErrorLogsRequest, ListMongodbErrorLogsResponse> listMongodbErrorLogsInvoker(
        ListMongodbErrorLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listMongodbErrorLogs, hcClient);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库慢日志
     *
     * 查询GeminiDB(for Mongo)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbSlowLogsRequest 请求对象
     * @return ListMongodbSlowLogsResponse
     */
    public ListMongodbSlowLogsResponse listMongodbSlowLogs(ListMongodbSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listMongodbSlowLogs);
    }

    /**
     * 查询GeminiDB(for Mongo)数据库慢日志
     *
     * 查询GeminiDB(for Mongo)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMongodbSlowLogsRequest 请求对象
     * @return SyncInvoker<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse>
     */
    public SyncInvoker<ListMongodbSlowLogsRequest, ListMongodbSlowLogsResponse> listMongodbSlowLogsInvoker(
        ListMongodbSlowLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listMongodbSlowLogs, hcClient);
    }

    /**
     * 查询定时任务列表
     *
     * 根据指定条件查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNosqlTaskListRequest 请求对象
     * @return ListNosqlTaskListResponse
     */
    public ListNosqlTaskListResponse listNosqlTaskList(ListNosqlTaskListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listNosqlTaskList);
    }

    /**
     * 查询定时任务列表
     *
     * 根据指定条件查询定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNosqlTaskListRequest 请求对象
     * @return SyncInvoker<ListNosqlTaskListRequest, ListNosqlTaskListResponse>
     */
    public SyncInvoker<ListNosqlTaskListRequest, ListNosqlTaskListResponse> listNosqlTaskListInvoker(
        ListNosqlTaskListRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listNosqlTaskList, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return ListRecycleInstancesResponse
     */
    public ListRecycleInstancesResponse listRecycleInstances(ListRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询Redis可恢复时间点
     *
     * 查询Redis可恢复时间点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedisPitrRestoreTimeRequest 请求对象
     * @return ListRedisPitrRestoreTimeResponse
     */
    public ListRedisPitrRestoreTimeResponse listRedisPitrRestoreTime(ListRedisPitrRestoreTimeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRedisPitrRestoreTime);
    }

    /**
     * 查询Redis可恢复时间点
     *
     * 查询Redis可恢复时间点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedisPitrRestoreTimeRequest 请求对象
     * @return SyncInvoker<ListRedisPitrRestoreTimeRequest, ListRedisPitrRestoreTimeResponse>
     */
    public SyncInvoker<ListRedisPitrRestoreTimeRequest, ListRedisPitrRestoreTimeResponse> listRedisPitrRestoreTimeInvoker(
        ListRedisPitrRestoreTimeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listRedisPitrRestoreTime, hcClient);
    }

    /**
     * 查询GeminiDB(for Redis)数据库慢日志
     *
     * 查询GeminiDB(for Redis)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedisSlowLogsRequest 请求对象
     * @return ListRedisSlowLogsResponse
     */
    public ListRedisSlowLogsResponse listRedisSlowLogs(ListRedisSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRedisSlowLogs);
    }

    /**
     * 查询GeminiDB(for Redis)数据库慢日志
     *
     * 查询GeminiDB(for Redis)数据库慢日志信息，支持日志关键字搜索。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRedisSlowLogsRequest 请求对象
     * @return SyncInvoker<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse>
     */
    public SyncInvoker<ListRedisSlowLogsRequest, ListRedisSlowLogsResponse> listRedisSlowLogsInvoker(
        ListRedisSlowLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listRedisSlowLogs, hcClient);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return ListRestoreDatabasesResponse
     */
    public ListRestoreDatabasesResponse listRestoreDatabases(ListRestoreDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreDatabases);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的数据库信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreDatabasesRequest 请求对象
     * @return SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse>
     */
    public SyncInvoker<ListRestoreDatabasesRequest, ListRestoreDatabasesResponse> listRestoreDatabasesInvoker(
        ListRestoreDatabasesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listRestoreDatabases, hcClient);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTablesRequest 请求对象
     * @return ListRestoreTablesResponse
     */
    public ListRestoreTablesResponse listRestoreTables(ListRestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreTables);
    }

    /**
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息
     *
     * 获取GeminiDB(for Cassandra)实例表级恢复的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTablesRequest 请求对象
     * @return SyncInvoker<ListRestoreTablesRequest, ListRestoreTablesResponse>
     */
    public SyncInvoker<ListRestoreTablesRequest, ListRestoreTablesResponse> listRestoreTablesInvoker(
        ListRestoreTablesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listRestoreTables, hcClient);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimeRequest 请求对象
     * @return ListRestoreTimeResponse
     */
    public ListRestoreTimeResponse listRestoreTime(ListRestoreTimeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreTime);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestoreTimeRequest 请求对象
     * @return SyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse>
     */
    public SyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTimeInvoker(
        ListRestoreTimeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listRestoreTime, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse
     */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listSlowLogs, hcClient);
    }

    /**
     * 设置节点自动扩容策略
     *
     * 设置节点自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAutoNodeExpansionPolicyRequest 请求对象
     * @return ModifyAutoNodeExpansionPolicyResponse
     */
    public ModifyAutoNodeExpansionPolicyResponse modifyAutoNodeExpansionPolicy(
        ModifyAutoNodeExpansionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyAutoNodeExpansionPolicy);
    }

    /**
     * 设置节点自动扩容策略
     *
     * 设置节点自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAutoNodeExpansionPolicyRequest 请求对象
     * @return SyncInvoker<ModifyAutoNodeExpansionPolicyRequest, ModifyAutoNodeExpansionPolicyResponse>
     */
    public SyncInvoker<ModifyAutoNodeExpansionPolicyRequest, ModifyAutoNodeExpansionPolicyResponse> modifyAutoNodeExpansionPolicyInvoker(
        ModifyAutoNodeExpansionPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyAutoNodeExpansionPolicy, hcClient);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDbUserPrivilegeRequest 请求对象
     * @return ModifyDbUserPrivilegeResponse
     */
    public ModifyDbUserPrivilegeResponse modifyDbUserPrivilege(ModifyDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyDbUserPrivilege);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse>
     */
    public SyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> modifyDbUserPrivilegeInvoker(
        ModifyDbUserPrivilegeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyDbUserPrivilege, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotasRequest 请求对象
     * @return ModifyEpsQuotasResponse
     */
    public ModifyEpsQuotasResponse modifyEpsQuotas(ModifyEpsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyEpsQuotas);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotasRequest 请求对象
     * @return SyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse>
     */
    public SyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> modifyEpsQuotasInvoker(
        ModifyEpsQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyEpsQuotas, hcClient);
    }

    /**
     * 设置实例可维护时间段
     *
     * 设置指定实例可维护时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceMaintenanceWindowRequest 请求对象
     * @return ModifyInstanceMaintenanceWindowResponse
     */
    public ModifyInstanceMaintenanceWindowResponse modifyInstanceMaintenanceWindow(
        ModifyInstanceMaintenanceWindowRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyInstanceMaintenanceWindow);
    }

    /**
     * 设置实例可维护时间段
     *
     * 设置指定实例可维护时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstanceMaintenanceWindowRequest 请求对象
     * @return SyncInvoker<ModifyInstanceMaintenanceWindowRequest, ModifyInstanceMaintenanceWindowResponse>
     */
    public SyncInvoker<ModifyInstanceMaintenanceWindowRequest, ModifyInstanceMaintenanceWindowResponse> modifyInstanceMaintenanceWindowInvoker(
        ModifyInstanceMaintenanceWindowRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyInstanceMaintenanceWindow, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPortRequest 请求对象
     * @return ModifyPortResponse
     */
    public ModifyPortResponse modifyPort(ModifyPortRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPortRequest 请求对象
     * @return SyncInvoker<ModifyPortRequest, ModifyPortResponse>
     */
    public SyncInvoker<ModifyPortRequest, ModifyPortResponse> modifyPortInvoker(ModifyPortRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyPort, hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPublicIpRequest 请求对象
     * @return ModifyPublicIpResponse
     */
    public ModifyPublicIpResponse modifyPublicIp(ModifyPublicIpRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPublicIp);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPublicIpRequest 请求对象
     * @return SyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse>
     */
    public SyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse> modifyPublicIpInvoker(
        ModifyPublicIpRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyPublicIp, hcClient);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeRequest 请求对象
     * @return ModifyVolumeResponse
     */
    public ModifyVolumeResponse modifyVolume(ModifyVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.modifyVolume);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyVolumeRequest 请求对象
     * @return SyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse>
     */
    public SyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse> modifyVolumeInvoker(ModifyVolumeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.modifyVolume, hcClient);
    }

    /**
     * 支持节点的开关机
     *
     * 当底层故障导致节点无法正常工作时，可以对该节点执行关机操作，关机后会由其他节点接管业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OfflineNodesRequest 请求对象
     * @return OfflineNodesResponse
     */
    public OfflineNodesResponse offlineNodes(OfflineNodesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.offlineNodes);
    }

    /**
     * 支持节点的开关机
     *
     * 当底层故障导致节点无法正常工作时，可以对该节点执行关机操作，关机后会由其他节点接管业务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request OfflineNodesRequest 请求对象
     * @return SyncInvoker<OfflineNodesRequest, OfflineNodesResponse>
     */
    public SyncInvoker<OfflineNodesRequest, OfflineNodesResponse> offlineNodesInvoker(OfflineNodesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.offlineNodes, hcClient);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseResumeDataSynchronizationRequest 请求对象
     * @return PauseResumeDataSynchronizationResponse
     */
    public PauseResumeDataSynchronizationResponse pauseResumeDataSynchronization(
        PauseResumeDataSynchronizationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.pauseResumeDataSynchronization);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseResumeDataSynchronizationRequest 请求对象
     * @return SyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse>
     */
    public SyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronizationInvoker(
        PauseResumeDataSynchronizationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.pauseResumeDataSynchronization, hcClient);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbUserPasswordRequest 请求对象
     * @return ResetDbUserPasswordResponse
     */
    public ResetDbUserPasswordResponse resetDbUserPassword(ResetDbUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resetDbUserPassword);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDbUserPasswordRequest 请求对象
     * @return SyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse>
     */
    public SyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> resetDbUserPasswordInvoker(
        ResetDbUserPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.resetDbUserPassword, hcClient);
    }

    /**
     * 重置自定义参数模板
     *
     * 重置自定义参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetParamGroupTemplateRequest 请求对象
     * @return ResetParamGroupTemplateResponse
     */
    public ResetParamGroupTemplateResponse resetParamGroupTemplate(ResetParamGroupTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resetParamGroupTemplate);
    }

    /**
     * 重置自定义参数模板
     *
     * 重置自定义参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetParamGroupTemplateRequest 请求对象
     * @return SyncInvoker<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse>
     */
    public SyncInvoker<ResetParamGroupTemplateRequest, ResetParamGroupTemplateResponse> resetParamGroupTemplateInvoker(
        ResetParamGroupTemplateRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.resetParamGroupTemplate, hcClient);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resetPassword);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPasswordRequest 请求对象
     * @return SyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public SyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordInvoker(ResetPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.resetPassword, hcClient);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeColdVolumeRequest 请求对象
     * @return ResizeColdVolumeResponse
     */
    public ResizeColdVolumeResponse resizeColdVolume(ResizeColdVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resizeColdVolume);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeColdVolumeRequest 请求对象
     * @return SyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse>
     */
    public SyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse> resizeColdVolumeInvoker(
        ResizeColdVolumeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.resizeColdVolume, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceRequest 请求对象
     * @return SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public SyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceInvoker(
        ResizeInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return ResizeInstanceVolumeResponse
     */
    public ResizeInstanceVolumeResponse resizeInstanceVolume(ResizeInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public SyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeInvoker(
        ResizeInstanceVolumeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例或节点
     *
     * 重启实例或节点的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.restartInstance);
    }

    /**
     * 重启实例或节点
     *
     * 重启实例或节点的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreExistingInstanceRequest 请求对象
     * @return RestoreExistingInstanceResponse
     */
    public RestoreExistingInstanceResponse restoreExistingInstance(RestoreExistingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.restoreExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreExistingInstanceRequest 请求对象
     * @return SyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse>
     */
    public SyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstanceInvoker(
        RestoreExistingInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.restoreExistingInstance, hcClient);
    }

    /**
     * 数据文件导入已有实例
     *
     * 数据导入已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedisDataRequest 请求对象
     * @return RestoreRedisDataResponse
     */
    public RestoreRedisDataResponse restoreRedisData(RestoreRedisDataRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.restoreRedisData);
    }

    /**
     * 数据文件导入已有实例
     *
     * 数据导入已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedisDataRequest 请求对象
     * @return SyncInvoker<RestoreRedisDataRequest, RestoreRedisDataResponse>
     */
    public SyncInvoker<RestoreRedisDataRequest, RestoreRedisDataResponse> restoreRedisDataInvoker(
        RestoreRedisDataRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.restoreRedisData, hcClient);
    }

    /**
     * 恢复当前Redis实例到指定时间点
     *
     * 恢复当前Redis实例到指定时间点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedisPitrRequest 请求对象
     * @return RestoreRedisPitrResponse
     */
    public RestoreRedisPitrResponse restoreRedisPitr(RestoreRedisPitrRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.restoreRedisPitr);
    }

    /**
     * 恢复当前Redis实例到指定时间点
     *
     * 恢复当前Redis实例到指定时间点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreRedisPitrRequest 请求对象
     * @return SyncInvoker<RestoreRedisPitrRequest, RestoreRedisPitrResponse>
     */
    public SyncInvoker<RestoreRedisPitrRequest, RestoreRedisPitrResponse> restoreRedisPitrInvoker(
        RestoreRedisPitrRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.restoreRedisPitr, hcClient);
    }

    /**
     * 关联LTS日志流
     *
     * - 将实例日志与LTS日志流关联，后台将自动上传实例日志到关联的LTS日志流里。
     * - 关联成功后，会产生一定费用，具体计费可参考云日志服务（LTS）的定价详情。
     * - 系统会为当前选择的日志流创建对应日志类型的结构化配置，若该日志流已存在其他日志类型的结构化配置，系统会进行覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLtsConfigsRequest 请求对象
     * @return SaveLtsConfigsResponse
     */
    public SaveLtsConfigsResponse saveLtsConfigs(SaveLtsConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.saveLtsConfigs);
    }

    /**
     * 关联LTS日志流
     *
     * - 将实例日志与LTS日志流关联，后台将自动上传实例日志到关联的LTS日志流里。
     * - 关联成功后，会产生一定费用，具体计费可参考云日志服务（LTS）的定价详情。
     * - 系统会为当前选择的日志流创建对应日志类型的结构化配置，若该日志流已存在其他日志类型的结构化配置，系统会进行覆盖。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveLtsConfigsRequest 请求对象
     * @return SyncInvoker<SaveLtsConfigsRequest, SaveLtsConfigsResponse>
     */
    public SyncInvoker<SaveLtsConfigsRequest, SaveLtsConfigsResponse> saveLtsConfigsInvoker(
        SaveLtsConfigsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.saveLtsConfigs, hcClient);
    }

    /**
     * 设置Redis禁用命令
     *
     * 设置Redis禁用命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveRedisDisabledCommandsRequest 请求对象
     * @return SaveRedisDisabledCommandsResponse
     */
    public SaveRedisDisabledCommandsResponse saveRedisDisabledCommands(SaveRedisDisabledCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.saveRedisDisabledCommands);
    }

    /**
     * 设置Redis禁用命令
     *
     * 设置Redis禁用命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveRedisDisabledCommandsRequest 请求对象
     * @return SyncInvoker<SaveRedisDisabledCommandsRequest, SaveRedisDisabledCommandsResponse>
     */
    public SyncInvoker<SaveRedisDisabledCommandsRequest, SaveRedisDisabledCommandsResponse> saveRedisDisabledCommandsInvoker(
        SaveRedisDisabledCommandsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.saveRedisDisabledCommands, hcClient);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePolicyRequest 请求对象
     * @return SetAutoEnlargePolicyResponse
     */
    public SetAutoEnlargePolicyResponse setAutoEnlargePolicy(SetAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setAutoEnlargePolicy);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>
     */
    public SyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicyInvoker(
        SetAutoEnlargePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.setAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置实例容灾切换的故障节点比例
     *
     * 设置实例容灾切换的故障节点比例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDisasterRecoverySettingsRequest 请求对象
     * @return SetDisasterRecoverySettingsResponse
     */
    public SetDisasterRecoverySettingsResponse setDisasterRecoverySettings(SetDisasterRecoverySettingsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setDisasterRecoverySettings);
    }

    /**
     * 设置实例容灾切换的故障节点比例
     *
     * 设置实例容灾切换的故障节点比例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDisasterRecoverySettingsRequest 请求对象
     * @return SyncInvoker<SetDisasterRecoverySettingsRequest, SetDisasterRecoverySettingsResponse>
     */
    public SyncInvoker<SetDisasterRecoverySettingsRequest, SetDisasterRecoverySettingsResponse> setDisasterRecoverySettingsInvoker(
        SetDisasterRecoverySettingsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.setDisasterRecoverySettings, hcClient);
    }

    /**
     * 开启/关闭实例数据导出
     *
     * 开启/关闭实例数据导出。
     * 当前支持将InfluxDB数据转为parquet格式文件然后上传到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstanceDataDumpRequest 请求对象
     * @return SetInstanceDataDumpResponse
     */
    public SetInstanceDataDumpResponse setInstanceDataDump(SetInstanceDataDumpRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setInstanceDataDump);
    }

    /**
     * 开启/关闭实例数据导出
     *
     * 开启/关闭实例数据导出。
     * 当前支持将InfluxDB数据转为parquet格式文件然后上传到指定的OBS桶中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstanceDataDumpRequest 请求对象
     * @return SyncInvoker<SetInstanceDataDumpRequest, SetInstanceDataDumpResponse>
     */
    public SyncInvoker<SetInstanceDataDumpRequest, SetInstanceDataDumpResponse> setInstanceDataDumpInvoker(
        SetInstanceDataDumpRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.setInstanceDataDump, hcClient);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SetRecyclePolicyResponse
     */
    public SetRecyclePolicyResponse setRecyclePolicy(SetRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setRecyclePolicy);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyInvoker(
        SetRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 设置Redis恢复到指定时间点策略
     *
     * 设置Redis恢复到指定时间点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRedisPitrPolicyRequest 请求对象
     * @return SetRedisPitrPolicyResponse
     */
    public SetRedisPitrPolicyResponse setRedisPitrPolicy(SetRedisPitrPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.setRedisPitrPolicy);
    }

    /**
     * 设置Redis恢复到指定时间点策略
     *
     * 设置Redis恢复到指定时间点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRedisPitrPolicyRequest 请求对象
     * @return SyncInvoker<SetRedisPitrPolicyRequest, SetRedisPitrPolicyResponse>
     */
    public SyncInvoker<SetRedisPitrPolicyRequest, SetRedisPitrPolicyResponse> setRedisPitrPolicyInvoker(
        SetRedisPitrPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.setRedisPitrPolicy, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsRequest 请求对象
     * @return ShowAllInstancesBackupsResponse
     */
    public ShowAllInstancesBackupsResponse showAllInstancesBackups(ShowAllInstancesBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsRequest 请求对象
     * @return SyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse>
     */
    public SyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> showAllInstancesBackupsInvoker(
        ShowAllInstancesBackupsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showAllInstancesBackups, hcClient);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsNewRequest 请求对象
     * @return ShowAllInstancesBackupsNewResponse
     */
    public ShowAllInstancesBackupsNewResponse showAllInstancesBackupsNew(ShowAllInstancesBackupsNewRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackupsNew);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAllInstancesBackupsNewRequest 请求对象
     * @return SyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse>
     */
    public SyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNewInvoker(
        ShowAllInstancesBackupsNewRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showAllInstancesBackupsNew, hcClient);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicableInstancesRequest 请求对象
     * @return ShowApplicableInstancesResponse
     */
    public ShowApplicableInstancesResponse showApplicableInstances(ShowApplicableInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showApplicableInstances);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplicableInstancesRequest 请求对象
     * @return SyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse>
     */
    public SyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> showApplicableInstancesInvoker(
        ShowApplicableInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplyHistoryRequest 请求对象
     * @return ShowApplyHistoryResponse
     */
    public ShowApplyHistoryResponse showApplyHistory(ShowApplyHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showApplyHistory);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApplyHistoryRequest 请求对象
     * @return SyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse>
     */
    public SyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse> showApplyHistoryInvoker(
        ShowApplyHistoryRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showApplyHistory, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return ShowAutoEnlargePolicyResponse
     */
    public ShowAutoEnlargePolicyResponse showAutoEnlargePolicy(ShowAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public SyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 查询节点自动扩容策略
     *
     * 查询节点自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoNodeExpansionPolicyRequest 请求对象
     * @return ShowAutoNodeExpansionPolicyResponse
     */
    public ShowAutoNodeExpansionPolicyResponse showAutoNodeExpansionPolicy(ShowAutoNodeExpansionPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showAutoNodeExpansionPolicy);
    }

    /**
     * 查询节点自动扩容策略
     *
     * 查询节点自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoNodeExpansionPolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoNodeExpansionPolicyRequest, ShowAutoNodeExpansionPolicyResponse>
     */
    public SyncInvoker<ShowAutoNodeExpansionPolicyRequest, ShowAutoNodeExpansionPolicyResponse> showAutoNodeExpansionPolicyInvoker(
        ShowAutoNodeExpansionPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showAutoNodeExpansionPolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPoliciesRequest 请求对象
     * @return ShowBackupPoliciesResponse
     */
    public ShowBackupPoliciesResponse showBackupPolicies(ShowBackupPoliciesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicies);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPoliciesRequest 请求对象
     * @return SyncInvoker<ShowBackupPoliciesRequest, ShowBackupPoliciesResponse>
     */
    public SyncInvoker<ShowBackupPoliciesRequest, ShowBackupPoliciesResponse> showBackupPoliciesInvoker(
        ShowBackupPoliciesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showBackupPolicies, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return ShowConfigurationDetailResponse
     */
    public ShowConfigurationDetailResponse showConfigurationDetail(ShowConfigurationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showConfigurationDetail);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailInvoker(
        ShowConfigurationDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询实例容灾切换的故障节点比例
     *
     * 查询实例容灾切换的故障节点比例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterRecoverySettingsRequest 请求对象
     * @return ShowDisasterRecoverySettingsResponse
     */
    public ShowDisasterRecoverySettingsResponse showDisasterRecoverySettings(
        ShowDisasterRecoverySettingsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showDisasterRecoverySettings);
    }

    /**
     * 查询实例容灾切换的故障节点比例
     *
     * 查询实例容灾切换的故障节点比例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDisasterRecoverySettingsRequest 请求对象
     * @return SyncInvoker<ShowDisasterRecoverySettingsRequest, ShowDisasterRecoverySettingsResponse>
     */
    public SyncInvoker<ShowDisasterRecoverySettingsRequest, ShowDisasterRecoverySettingsResponse> showDisasterRecoverySettingsInvoker(
        ShowDisasterRecoverySettingsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showDisasterRecoverySettings, hcClient);
    }

    /**
     * 查询实例负载均衡的IP访问黑白名单
     *
     * 查询实例负载均衡的IP访问黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbIpGroupRequest 请求对象
     * @return ShowElbIpGroupResponse
     */
    public ShowElbIpGroupResponse showElbIpGroup(ShowElbIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showElbIpGroup);
    }

    /**
     * 查询实例负载均衡的IP访问黑白名单
     *
     * 查询实例负载均衡的IP访问黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowElbIpGroupRequest 请求对象
     * @return SyncInvoker<ShowElbIpGroupRequest, ShowElbIpGroupResponse>
     */
    public SyncInvoker<ShowElbIpGroupRequest, ShowElbIpGroupResponse> showElbIpGroupInvoker(
        ShowElbIpGroupRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showElbIpGroup, hcClient);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogRequest 请求对象
     * @return ShowErrorLogResponse
     */
    public ShowErrorLogResponse showErrorLog(ShowErrorLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showErrorLog);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogRequest 请求对象
     * @return SyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse>
     */
    public SyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse> showErrorLogInvoker(ShowErrorLogRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showErrorLog, hcClient);
    }

    /**
     * 查询高危命令
     *
     * 查询Redis的高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHighRiskCommandsRequest 请求对象
     * @return ShowHighRiskCommandsResponse
     */
    public ShowHighRiskCommandsResponse showHighRiskCommands(ShowHighRiskCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showHighRiskCommands);
    }

    /**
     * 查询高危命令
     *
     * 查询Redis的高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHighRiskCommandsRequest 请求对象
     * @return SyncInvoker<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse>
     */
    public SyncInvoker<ShowHighRiskCommandsRequest, ShowHighRiskCommandsResponse> showHighRiskCommandsInvoker(
        ShowHighRiskCommandsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showHighRiskCommands, hcClient);
    }

    /**
     * 查询实例可搭建双活关系的Region
     *
     * 查询实例可搭建双活关系的Region。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceBiactiveRegionsRequest 请求对象
     * @return ShowInstanceBiactiveRegionsResponse
     */
    public ShowInstanceBiactiveRegionsResponse showInstanceBiactiveRegions(ShowInstanceBiactiveRegionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceBiactiveRegions);
    }

    /**
     * 查询实例可搭建双活关系的Region
     *
     * 查询实例可搭建双活关系的Region。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceBiactiveRegionsRequest 请求对象
     * @return SyncInvoker<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse>
     */
    public SyncInvoker<ShowInstanceBiactiveRegionsRequest, ShowInstanceBiactiveRegionsResponse> showInstanceBiactiveRegionsInvoker(
        ShowInstanceBiactiveRegionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showInstanceBiactiveRegions, hcClient);
    }

    /**
     * 查询实例参数配置
     *
     * 查询实例参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceConfiguration);
    }

    /**
     * 查询实例参数配置
     *
     * 查询实例参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRoleRequest 请求对象
     * @return ShowInstanceRoleResponse
     */
    public ShowInstanceRoleResponse showInstanceRole(ShowInstanceRoleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceRole);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRoleRequest 请求对象
     * @return SyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse>
     */
    public SyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRoleInvoker(
        ShowInstanceRoleRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showInstanceRole, hcClient);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpNumRequirementRequest 请求对象
     * @return ShowIpNumRequirementResponse
     */
    public ShowIpNumRequirementResponse showIpNumRequirement(ShowIpNumRequirementRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showIpNumRequirement);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpNumRequirementRequest 请求对象
     * @return SyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse>
     */
    public SyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> showIpNumRequirementInvoker(
        ShowIpNumRequirementRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showIpNumRequirement, hcClient);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModifyHistoryRequest 请求对象
     * @return ShowModifyHistoryResponse
     */
    public ShowModifyHistoryResponse showModifyHistory(ShowModifyHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showModifyHistory);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowModifyHistoryRequest 请求对象
     * @return SyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse>
     */
    public SyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse> showModifyHistoryInvoker(
        ShowModifyHistoryRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showModifyHistory, hcClient);
    }

    /**
     * 获取GeminiDB Redis的免密配置
     *
     * 获取GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordlessConfigRequest 请求对象
     * @return ShowPasswordlessConfigResponse
     */
    public ShowPasswordlessConfigResponse showPasswordlessConfig(ShowPasswordlessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showPasswordlessConfig);
    }

    /**
     * 获取GeminiDB Redis的免密配置
     *
     * 获取GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPasswordlessConfigRequest 请求对象
     * @return SyncInvoker<ShowPasswordlessConfigRequest, ShowPasswordlessConfigResponse>
     */
    public SyncInvoker<ShowPasswordlessConfigRequest, ShowPasswordlessConfigResponse> showPasswordlessConfigInvoker(
        ShowPasswordlessConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showPasswordlessConfig, hcClient);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPauseResumeStutusRequest 请求对象
     * @return ShowPauseResumeStutusResponse
     */
    public ShowPauseResumeStutusResponse showPauseResumeStutus(ShowPauseResumeStutusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showPauseResumeStutus);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPauseResumeStutusRequest 请求对象
     * @return SyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse>
     */
    public SyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> showPauseResumeStutusInvoker(
        ShowPauseResumeStutusRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showPauseResumeStutus, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GeminiDB服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GeminiDB服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showQuotas, hcClient);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRecyclePolicy);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询Redis实例的大key
     *
     * 支持查询Redis实例的大key。value长度大于bigkeys-string-threshold参数的string类型的key或者元素数大于bigkeys-composite-threshold参数的hash/list/zset/set/stream类型key，会被判断为大key。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisBigKeysRequest 请求对象
     * @return ShowRedisBigKeysResponse
     */
    public ShowRedisBigKeysResponse showRedisBigKeys(ShowRedisBigKeysRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRedisBigKeys);
    }

    /**
     * 查询Redis实例的大key
     *
     * 支持查询Redis实例的大key。value长度大于bigkeys-string-threshold参数的string类型的key或者元素数大于bigkeys-composite-threshold参数的hash/list/zset/set/stream类型key，会被判断为大key。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisBigKeysRequest 请求对象
     * @return SyncInvoker<ShowRedisBigKeysRequest, ShowRedisBigKeysResponse>
     */
    public SyncInvoker<ShowRedisBigKeysRequest, ShowRedisBigKeysResponse> showRedisBigKeysInvoker(
        ShowRedisBigKeysRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRedisBigKeys, hcClient);
    }

    /**
     * 查询Redis禁用命令
     *
     * 查询Redis禁用命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisDisabledCommandsRequest 请求对象
     * @return ShowRedisDisabledCommandsResponse
     */
    public ShowRedisDisabledCommandsResponse showRedisDisabledCommands(ShowRedisDisabledCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRedisDisabledCommands);
    }

    /**
     * 查询Redis禁用命令
     *
     * 查询Redis禁用命令。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisDisabledCommandsRequest 请求对象
     * @return SyncInvoker<ShowRedisDisabledCommandsRequest, ShowRedisDisabledCommandsResponse>
     */
    public SyncInvoker<ShowRedisDisabledCommandsRequest, ShowRedisDisabledCommandsResponse> showRedisDisabledCommandsInvoker(
        ShowRedisDisabledCommandsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRedisDisabledCommands, hcClient);
    }

    /**
     * 查询Redis实例的热key
     *
     * 支持查询Redis实例的热key。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisHotKeysRequest 请求对象
     * @return ShowRedisHotKeysResponse
     */
    public ShowRedisHotKeysResponse showRedisHotKeys(ShowRedisHotKeysRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRedisHotKeys);
    }

    /**
     * 查询Redis实例的热key
     *
     * 支持查询Redis实例的热key。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisHotKeysRequest 请求对象
     * @return SyncInvoker<ShowRedisHotKeysRequest, ShowRedisHotKeysResponse>
     */
    public SyncInvoker<ShowRedisHotKeysRequest, ShowRedisHotKeysResponse> showRedisHotKeysInvoker(
        ShowRedisHotKeysRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRedisHotKeys, hcClient);
    }

    /**
     * 查询Redis实例指定时间点恢复所占用的存储空间
     *
     * 查询Redis实例指定时间点恢复所占用的存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisPitrInfoRequest 请求对象
     * @return ShowRedisPitrInfoResponse
     */
    public ShowRedisPitrInfoResponse showRedisPitrInfo(ShowRedisPitrInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRedisPitrInfo);
    }

    /**
     * 查询Redis实例指定时间点恢复所占用的存储空间
     *
     * 查询Redis实例指定时间点恢复所占用的存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisPitrInfoRequest 请求对象
     * @return SyncInvoker<ShowRedisPitrInfoRequest, ShowRedisPitrInfoResponse>
     */
    public SyncInvoker<ShowRedisPitrInfoRequest, ShowRedisPitrInfoResponse> showRedisPitrInfoInvoker(
        ShowRedisPitrInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRedisPitrInfo, hcClient);
    }

    /**
     * 查询Redis恢复到指定时间点策略
     *
     * 查询Redis恢复到指定时间点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisPitrPolicyRequest 请求对象
     * @return ShowRedisPitrPolicyResponse
     */
    public ShowRedisPitrPolicyResponse showRedisPitrPolicy(ShowRedisPitrPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRedisPitrPolicy);
    }

    /**
     * 查询Redis恢复到指定时间点策略
     *
     * 查询Redis恢复到指定时间点策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedisPitrPolicyRequest 请求对象
     * @return SyncInvoker<ShowRedisPitrPolicyRequest, ShowRedisPitrPolicyResponse>
     */
    public SyncInvoker<ShowRedisPitrPolicyRequest, ShowRedisPitrPolicyResponse> showRedisPitrPolicyInvoker(
        ShowRedisPitrPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRedisPitrPolicy, hcClient);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestorableListRequest 请求对象
     * @return ShowRestorableListResponse
     */
    public ShowRestorableListResponse showRestorableList(ShowRestorableListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showRestorableList);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestorableListRequest 请求对象
     * @return SyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse>
     */
    public SyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableListInvoker(
        ShowRestorableListRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showRestorableList, hcClient);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return ShowSecondLevelMonitoringStatusResponse
     */
    public ShowSecondLevelMonitoringStatusResponse showSecondLevelMonitoringStatus(
        ShowSecondLevelMonitoringStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showSecondLevelMonitoringStatus);
    }

    /**
     * 查询秒级监控配置
     *
     * 查询秒级监控配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringStatusRequest 请求对象
     * @return SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse>
     */
    public SyncInvoker<ShowSecondLevelMonitoringStatusRequest, ShowSecondLevelMonitoringStatusResponse> showSecondLevelMonitoringStatusInvoker(
        ShowSecondLevelMonitoringStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showSecondLevelMonitoringStatus, hcClient);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDesensitizationRequest 请求对象
     * @return ShowSlowLogDesensitizationResponse
     */
    public ShowSlowLogDesensitizationResponse showSlowLogDesensitization(ShowSlowLogDesensitizationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showSlowLogDesensitization);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDesensitizationRequest 请求对象
     * @return SyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse>
     */
    public SyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> showSlowLogDesensitizationInvoker(
        ShowSlowLogDesensitizationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showSlowLogDesensitization, hcClient);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodeRequest 请求对象
     * @return ShrinkInstanceNodeResponse
     */
    public ShrinkInstanceNodeResponse shrinkInstanceNode(ShrinkInstanceNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.shrinkInstanceNode);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkInstanceNodeRequest 请求对象
     * @return SyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>
     */
    public SyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNodeInvoker(
        ShrinkInstanceNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.shrinkInstanceNode, hcClient);
    }

    /**
     * 停止备份
     *
     * 支持紧急情况下停止备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return StopBackupResponse
     */
    public StopBackupResponse stopBackup(StopBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 支持紧急情况下停止备份功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return SyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public SyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupInvoker(StopBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.stopBackup, hcClient);
    }

    /**
     * 设置实例负载均衡的IP访问黑白名单
     *
     * 设置实例负载均衡的IP访问黑白名单，黑名单、白名单只能选一种，每次调用此接口覆盖之前的设置。关闭后不限制连接的源IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchIpGroupRequest 请求对象
     * @return SwitchIpGroupResponse
     */
    public SwitchIpGroupResponse switchIpGroup(SwitchIpGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchIpGroup);
    }

    /**
     * 设置实例负载均衡的IP访问黑白名单
     *
     * 设置实例负载均衡的IP访问黑白名单，黑名单、白名单只能选一种，每次调用此接口覆盖之前的设置。关闭后不限制连接的源IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchIpGroupRequest 请求对象
     * @return SyncInvoker<SwitchIpGroupRequest, SwitchIpGroupResponse>
     */
    public SyncInvoker<SwitchIpGroupRequest, SwitchIpGroupResponse> switchIpGroupInvoker(SwitchIpGroupRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchIpGroup, hcClient);
    }

    /**
     * Redis主备切换
     *
     * 切换实例的主备节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchOverRequest 请求对象
     * @return SwitchOverResponse
     */
    public SwitchOverResponse switchOver(SwitchOverRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchOver);
    }

    /**
     * Redis主备切换
     *
     * 切换实例的主备节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchOverRequest 请求对象
     * @return SyncInvoker<SwitchOverRequest, SwitchOverResponse>
     */
    public SyncInvoker<SwitchOverRequest, SwitchOverResponse> switchOverInvoker(SwitchOverRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchOver, hcClient);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的5秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return SwitchSecondLevelMonitoringResponse
     */
    public SwitchSecondLevelMonitoringResponse switchSecondLevelMonitoring(SwitchSecondLevelMonitoringRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchSecondLevelMonitoring);
    }

    /**
     * 开启/关闭秒级监控
     *
     * 开启或关闭指定实例的5秒级监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSecondLevelMonitoringRequest 请求对象
     * @return SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse>
     */
    public SyncInvoker<SwitchSecondLevelMonitoringRequest, SwitchSecondLevelMonitoringResponse> switchSecondLevelMonitoringInvoker(
        SwitchSecondLevelMonitoringRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchSecondLevelMonitoring, hcClient);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return SwitchSlowlogDesensitizationResponse
     */
    public SwitchSlowlogDesensitizationResponse switchSlowlogDesensitization(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSlowlogDesensitizationRequest 请求对象
     * @return SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public SyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return SwitchSslResponse
     */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchSsl);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchSsl, hcClient);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToMasterRequest 请求对象
     * @return SwitchToMasterResponse
     */
    public SwitchToMasterResponse switchToMaster(SwitchToMasterRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchToMaster);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToMasterRequest 请求对象
     * @return SyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse>
     */
    public SyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse> switchToMasterInvoker(
        SwitchToMasterRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchToMaster, hcClient);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToSlaveRequest 请求对象
     * @return SwitchToSlaveResponse
     */
    public SwitchToSlaveResponse switchToSlave(SwitchToSlaveRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.switchToSlave);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchToSlaveRequest 请求对象
     * @return SyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse>
     */
    public SyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlaveInvoker(SwitchToSlaveRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.switchToSlave, hcClient);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return UpdateClientNetworkResponse
     */
    public UpdateClientNetworkResponse updateClientNetwork(UpdateClientNetworkRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateClientNetwork);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClientNetworkRequest 请求对象
     * @return SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public SyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkInvoker(
        UpdateClientNetworkRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return UpdateConfigurationResponse
     */
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateConfiguration, hcClient);
    }

    /**
     * 操作GeminDB实例数据库
     *
     * 操作GeminDB实例数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabasesRequest 请求对象
     * @return UpdateDatabasesResponse
     */
    public UpdateDatabasesResponse updateDatabases(UpdateDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateDatabases);
    }

    /**
     * 操作GeminDB实例数据库
     *
     * 操作GeminDB实例数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabasesRequest 请求对象
     * @return SyncInvoker<UpdateDatabasesRequest, UpdateDatabasesResponse>
     */
    public SyncInvoker<UpdateDatabasesRequest, UpdateDatabasesResponse> updateDatabasesInvoker(
        UpdateDatabasesRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateDatabases, hcClient);
    }

    /**
     * 修改内存加速规则
     *
     * 修改指定内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbCacheRuleRequest 请求对象
     * @return UpdateDbCacheRuleResponse
     */
    public UpdateDbCacheRuleResponse updateDbCacheRule(UpdateDbCacheRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateDbCacheRule);
    }

    /**
     * 修改内存加速规则
     *
     * 修改指定内存加速规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbCacheRuleRequest 请求对象
     * @return SyncInvoker<UpdateDbCacheRuleRequest, UpdateDbCacheRuleResponse>
     */
    public SyncInvoker<UpdateDbCacheRuleRequest, UpdateDbCacheRuleResponse> updateDbCacheRuleInvoker(
        UpdateDbCacheRuleRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateDbCacheRule, hcClient);
    }

    /**
     * 修改高危命令
     *
     * 批量修改高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHighRiskCommandsRequest 请求对象
     * @return UpdateHighRiskCommandsResponse
     */
    public UpdateHighRiskCommandsResponse updateHighRiskCommands(UpdateHighRiskCommandsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateHighRiskCommands);
    }

    /**
     * 修改高危命令
     *
     * 批量修改高危命令
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHighRiskCommandsRequest 请求对象
     * @return SyncInvoker<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse>
     */
    public SyncInvoker<UpdateHighRiskCommandsRequest, UpdateHighRiskCommandsResponse> updateHighRiskCommandsInvoker(
        UpdateHighRiskCommandsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateHighRiskCommands, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse
     */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationsRequest 请求对象
     * @return UpdateInstanceConfigurationsResponse
     */
    public UpdateInstanceConfigurationsResponse updateInstanceConfigurations(
        UpdateInstanceConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfigurations);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationsRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> updateInstanceConfigurationsInvoker(
        UpdateInstanceConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateInstanceConfigurations, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateInstanceName, hcClient);
    }

    /**
     * 支持修改GeminiDB Redis的免密配置
     *
     * 支持修改GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordlessConfigRequest 请求对象
     * @return UpdatePasswordlessConfigResponse
     */
    public UpdatePasswordlessConfigResponse updatePasswordlessConfig(UpdatePasswordlessConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updatePasswordlessConfig);
    }

    /**
     * 支持修改GeminiDB Redis的免密配置
     *
     * 支持修改GeminiDB Redis的免密配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePasswordlessConfigRequest 请求对象
     * @return SyncInvoker<UpdatePasswordlessConfigRequest, UpdatePasswordlessConfigResponse>
     */
    public SyncInvoker<UpdatePasswordlessConfigRequest, UpdatePasswordlessConfigResponse> updatePasswordlessConfigInvoker(
        UpdatePasswordlessConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updatePasswordlessConfig, hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return UpdateSecurityGroupResponse
     */
    public UpdateSecurityGroupResponse updateSecurityGroup(UpdateSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public SyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupInvoker(
        UpdateSecurityGroupRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionRequest 请求对象
     * @return UpgradeDbVersionResponse
     */
    public UpgradeDbVersionResponse upgradeDbVersion(UpgradeDbVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.upgradeDbVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionInvoker(
        UpgradeDbVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.upgradeDbVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse
     */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforNoSQLMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforNoSQLMeta.showApiVersion, hcClient);
    }

}

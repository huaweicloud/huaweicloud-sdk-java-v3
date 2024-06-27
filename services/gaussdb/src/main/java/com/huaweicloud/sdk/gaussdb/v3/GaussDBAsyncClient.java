package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckClickHouseDataBaseConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckClickHouseDataBaseConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckClickHouseTableConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckClickHouseTableConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckDataBaseConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckDataBaseConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckStarRocksResourceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckStarRocksResourceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckTableConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckTableConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateClickHouseDataBaseReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateClickHouseDataBaseReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateClickHouseDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateClickHouseDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateClickHouseInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateClickHouseInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlReadonlyNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarrocksInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseDataBaseConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseDataBaseConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseDataBaseReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseDataBaseReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseLtsConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteClickHouseLtsConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlReadonlyNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarRocksDataReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarRocksDataReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarRocksDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarRocksDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarrocksInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteTaskRecordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteTaskRecordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DescribeBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DescribeBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListAuditLogDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListAuditLogDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseParameterRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseParameterResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseReplicationConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseReplicationConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseDataBaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListClickHouseInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListEnterpriseProjectsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListEnterpriseProjectsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseCharsetsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseCharsetsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDedicatedResourcesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDedicatedResourcesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoUnifyStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstanceDetailInfoUnifyStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesUnifyStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlInstancesUnifyStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapDataStoreRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapDataStoreResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapFlavorRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapFlavorResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapInstanceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapInstanceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapStorageTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListHtapStorageTypeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListImmediateJobsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListImmediateJobsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsErrorLogDetailsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsErrorLogDetailsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsSlowlogDetailsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListLtsSlowlogDetailsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListModifyHistoryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListModifyHistoryResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListParamsTemplateApplyHistoryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListParamsTemplateApplyHistoryResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListScheduleJobsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListScheduleJobsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDataBasesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDataBasesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDataReplicationConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDataReplicationConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDataReplicationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDataReplicationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDbParametersRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarRocksDbParametersResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarrocksInstanceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListStarrocksInstanceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyNodePriorityRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyNodePriorityResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.PauseStarRocksDataReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.PauseStarRocksDataReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RebootClickHouseInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RebootClickHouseInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RenameInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RenameInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResizeClickHouseFlavorRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResizeClickHouseFlavorResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResizeClickHouseInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResizeClickHouseInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartProxyInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartProxyInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResumeStarRocksDataReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResumeStarRocksDataReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingHistoryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingHistoryResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseLtsConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseLtsConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseSlowLogDetailRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseSlowLogDetailResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseSlowLogSensitiveStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowClickHouseSlowLogSensitiveStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowDedicatedResourceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowDedicatedResourceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlEngineVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlEngineVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlFlavorsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlFlavorsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlIncrementalBackupListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlIncrementalBackupListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoUnifyStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlInstanceInfoUnifyStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlJobInfoRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlJobInfoResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyFlavorsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyFlavorsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyListRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlProxyListResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceDatabaseVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceDatabaseVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisInstanceInfosPerMetricRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisInstanceInfosPerMetricResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyIpgroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyIpgroupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSlowlogSensitiveStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSlowlogSensitiveStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowStarRocksDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowStarRocksDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlProxySslRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlProxySslResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseDataBaseConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseDataBaseConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseDatabaseUserPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseDatabaseUserPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseDatabaseUserPermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseDatabaseUserPermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseLtsConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseLtsConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseSlowLogSensitiveStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateClickHouseSlowLogSensitiveStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseCommentResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseUserCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlDatabaseUserCommentResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceAliasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceAliasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceInternalIpRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceInternalIpResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceNameResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceOpsWindowRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceOpsWindowResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstancePortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstancePortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceSecurityGroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlInstanceSecurityGroupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateNewNodeAutoAddSwitchRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateNewNodeAutoAddSwitchResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNameResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateServerlessPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateServerlessPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSlowlogSensitiveSwitchRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSlowlogSensitiveSwitchResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeProxyVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeProxyVersionResponse;

import java.util.concurrent.CompletableFuture;

public class GaussDBAsyncClient {

    protected HcClient hcClient;

    public GaussDBAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBAsyncClient> newBuilder() {
        ClientBuilder<GaussDBAsyncClient> clientBuilder = new ClientBuilder<>(GaussDBAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDatabasePermissionRequest 请求对象
     * @return CompletableFuture<AddDatabasePermissionResponse>
     */
    public CompletableFuture<AddDatabasePermissionResponse> addDatabasePermissionAsync(
        AddDatabasePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.addDatabasePermission);
    }

    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDatabasePermissionRequest 请求对象
     * @return AsyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse>
     */
    public AsyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermissionAsyncInvoker(
        AddDatabasePermissionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.addDatabasePermission, hcClient);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.batchTagAction);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.batchTagAction, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelGaussMySqlInstanceEipRequest 请求对象
     * @return CompletableFuture<CancelGaussMySqlInstanceEipResponse>
     */
    public CompletableFuture<CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEipAsync(
        CancelGaussMySqlInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.cancelGaussMySqlInstanceEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelGaussMySqlInstanceEipRequest 请求对象
     * @return AsyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse>
     */
    public AsyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEipAsyncInvoker(
        CancelGaussMySqlInstanceEipRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.cancelGaussMySqlInstanceEip, hcClient);
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
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.cancelScheduleTask);
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
        return new AsyncInvoker<>(request, GaussDBMeta.cancelScheduleTask, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return CompletableFuture<ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public CompletableFuture<ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationAsync(
        ChangeGaussMySqlInstanceSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.changeGaussMySqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationAsyncInvoker(
        ChangeGaussMySqlInstanceSpecificationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.changeGaussMySqlInstanceSpecification, hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return CompletableFuture<ChangeGaussMySqlProxySpecificationResponse>
     */
    public CompletableFuture<ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecificationAsync(
        ChangeGaussMySqlProxySpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.changeGaussMySqlProxySpecification);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return AsyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse>
     */
    public AsyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecificationAsyncInvoker(
        ChangeGaussMySqlProxySpecificationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.changeGaussMySqlProxySpecification, hcClient);
    }

    /**
     * 资源预校验
     *
     * 资源预校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckResourceRequest 请求对象
     * @return CompletableFuture<CheckResourceResponse>
     */
    public CompletableFuture<CheckResourceResponse> checkResourceAsync(CheckResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.checkResource);
    }

    /**
     * 资源预校验
     *
     * 资源预校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckResourceRequest 请求对象
     * @return AsyncInvoker<CheckResourceRequest, CheckResourceResponse>
     */
    public AsyncInvoker<CheckResourceRequest, CheckResourceResponse> checkResourceAsyncInvoker(
        CheckResourceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.checkResource, hcClient);
    }

    /**
     * 复制参数组
     *
     * 复制参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationsRequest 请求对象
     * @return CompletableFuture<CopyConfigurationsResponse>
     */
    public CompletableFuture<CopyConfigurationsResponse> copyConfigurationsAsync(CopyConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.copyConfigurations);
    }

    /**
     * 复制参数组
     *
     * 复制参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationsRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationsRequest, CopyConfigurationsResponse>
     */
    public AsyncInvoker<CopyConfigurationsRequest, CopyConfigurationsResponse> copyConfigurationsAsyncInvoker(
        CopyConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.copyConfigurations, hcClient);
    }

    /**
     * 复制实例参数组
     *
     * 复制实例参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyInstanceConfigurationsRequest 请求对象
     * @return CompletableFuture<CopyInstanceConfigurationsResponse>
     */
    public CompletableFuture<CopyInstanceConfigurationsResponse> copyInstanceConfigurationsAsync(
        CopyInstanceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.copyInstanceConfigurations);
    }

    /**
     * 复制实例参数组
     *
     * 复制实例参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyInstanceConfigurationsRequest 请求对象
     * @return AsyncInvoker<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse>
     */
    public AsyncInvoker<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> copyInstanceConfigurationsAsyncInvoker(
        CopyInstanceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.copyInstanceConfigurations, hcClient);
    }

    /**
     * 设置访问控制规则
     *
     * 设置访问控制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessControlRequest 请求对象
     * @return CompletableFuture<CreateAccessControlResponse>
     */
    public CompletableFuture<CreateAccessControlResponse> createAccessControlAsync(CreateAccessControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createAccessControl);
    }

    /**
     * 设置访问控制规则
     *
     * 设置访问控制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessControlRequest 请求对象
     * @return AsyncInvoker<CreateAccessControlRequest, CreateAccessControlResponse>
     */
    public AsyncInvoker<CreateAccessControlRequest, CreateAccessControlResponse> createAccessControlAsyncInvoker(
        CreateAccessControlRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createAccessControl, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlBackupRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlBackupResponse>
     */
    public CompletableFuture<CreateGaussMySqlBackupResponse> createGaussMySqlBackupAsync(
        CreateGaussMySqlBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlBackupRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>
     */
    public AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackupAsyncInvoker(
        CreateGaussMySqlBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlBackup, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<CreateGaussMySqlConfigurationResponse> createGaussMySqlConfigurationAsync(
        CreateGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfigurationAsyncInvoker(
        CreateGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlConfiguration, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlDatabaseResponse>
     */
    public CompletableFuture<CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabaseAsync(
        CreateGaussMySqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse>
     */
    public AsyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabaseAsyncInvoker(
        CreateGaussMySqlDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlDatabaseUserResponse>
     */
    public CompletableFuture<CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUserAsync(
        CreateGaussMySqlDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse>
     */
    public AsyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUserAsyncInvoker(
        CreateGaussMySqlDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlInstanceResponse>
     */
    public CompletableFuture<CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceAsync(
        CreateGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceAsyncInvoker(
        CreateGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlProxyResponse>
     */
    public CompletableFuture<CreateGaussMySqlProxyResponse> createGaussMySqlProxyAsync(
        CreateGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlProxy);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>
     */
    public AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxyAsyncInvoker(
        CreateGaussMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlReadonlyNodeResponse>
     */
    public CompletableFuture<CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeAsync(
        CreateGaussMySqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlReadonlyNode);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>
     */
    public AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeAsyncInvoker(
        CreateGaussMySqlReadonlyNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 申请内网域名
     *
     * 申请内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMysqlDnsRequest 请求对象
     * @return CompletableFuture<CreateGaussMysqlDnsResponse>
     */
    public CompletableFuture<CreateGaussMysqlDnsResponse> createGaussMysqlDnsAsync(CreateGaussMysqlDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMysqlDns);
    }

    /**
     * 申请内网域名
     *
     * 申请内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMysqlDnsRequest 请求对象
     * @return AsyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse>
     */
    public AsyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> createGaussMysqlDnsAsyncInvoker(
        CreateGaussMysqlDnsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createGaussMysqlDns, hcClient);
    }

    /**
     * 批量创建LTS日志配置
     *
     * 批量创建LTS日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLtsConfigsRequest 请求对象
     * @return CompletableFuture<CreateLtsConfigsResponse>
     */
    public CompletableFuture<CreateLtsConfigsResponse> createLtsConfigsAsync(CreateLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createLtsConfigs);
    }

    /**
     * 批量创建LTS日志配置
     *
     * 批量创建LTS日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLtsConfigsRequest 请求对象
     * @return AsyncInvoker<CreateLtsConfigsRequest, CreateLtsConfigsResponse>
     */
    public AsyncInvoker<CreateLtsConfigsRequest, CreateLtsConfigsResponse> createLtsConfigsAsyncInvoker(
        CreateLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createLtsConfigs, hcClient);
    }

    /**
     * 表级时间点恢复
     *
     * 表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreTablesRequest 请求对象
     * @return CompletableFuture<CreateRestoreTablesResponse>
     */
    public CompletableFuture<CreateRestoreTablesResponse> createRestoreTablesAsync(CreateRestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createRestoreTables);
    }

    /**
     * 表级时间点恢复
     *
     * 表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreTablesRequest 请求对象
     * @return AsyncInvoker<CreateRestoreTablesRequest, CreateRestoreTablesResponse>
     */
    public AsyncInvoker<CreateRestoreTablesRequest, CreateRestoreTablesResponse> createRestoreTablesAsyncInvoker(
        CreateRestoreTablesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createRestoreTables, hcClient);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabasePermissionRequest 请求对象
     * @return CompletableFuture<DeleteDatabasePermissionResponse>
     */
    public CompletableFuture<DeleteDatabasePermissionResponse> deleteDatabasePermissionAsync(
        DeleteDatabasePermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteDatabasePermission);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabasePermissionRequest 请求对象
     * @return AsyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse>
     */
    public AsyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermissionAsyncInvoker(
        DeleteDatabasePermissionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteDatabasePermission, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlBackupRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlBackupResponse>
     */
    public CompletableFuture<DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackupAsync(
        DeleteGaussMySqlBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlBackupRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackupAsyncInvoker(
        DeleteGaussMySqlBackupRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlBackup, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfigurationAsync(
        DeleteGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfigurationAsyncInvoker(
        DeleteGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlDatabaseResponse>
     */
    public CompletableFuture<DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabaseAsync(
        DeleteGaussMySqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabaseAsyncInvoker(
        DeleteGaussMySqlDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlDatabaseUserResponse>
     */
    public CompletableFuture<DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUserAsync(
        DeleteGaussMySqlDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUserAsyncInvoker(
        DeleteGaussMySqlDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 删除/退订数据库实例
     *
     * 删除/退订数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlInstanceResponse>
     */
    public CompletableFuture<DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceAsync(
        DeleteGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlInstance);
    }

    /**
     * 删除/退订数据库实例
     *
     * 删除/退订数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceAsyncInvoker(
        DeleteGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlProxyResponse>
     */
    public CompletableFuture<DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyAsync(
        DeleteGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyAsyncInvoker(
        DeleteGaussMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlProxy, hcClient);
    }

    /**
     * 删除/退订只读节点
     *
     * 删除/退订实例的只读节点。多可用区模式删除/退订只读节点时，要保证删除/退订后，剩余的只读节点和主节点在不同的可用区中，否则无法删除/退订该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlReadonlyNodeResponse>
     */
    public CompletableFuture<DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeAsync(
        DeleteGaussMySqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlReadonlyNode);
    }

    /**
     * 删除/退订只读节点
     *
     * 删除/退订实例的只读节点。多可用区模式删除/退订只读节点时，要保证删除/退订后，剩余的只读节点和主节点在不同的可用区中，否则无法删除/退订该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeAsyncInvoker(
        DeleteGaussMySqlReadonlyNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 批量删除LTS日志配置
     *
     * 批量删除LTS日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigsRequest 请求对象
     * @return CompletableFuture<DeleteLtsConfigsResponse>
     */
    public CompletableFuture<DeleteLtsConfigsResponse> deleteLtsConfigsAsync(DeleteLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteLtsConfigs);
    }

    /**
     * 批量删除LTS日志配置
     *
     * 批量删除LTS日志配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLtsConfigsRequest 请求对象
     * @return AsyncInvoker<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse>
     */
    public AsyncInvoker<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> deleteLtsConfigsAsyncInvoker(
        DeleteLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteLtsConfigs, hcClient);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTasKRequest 请求对象
     * @return CompletableFuture<DeleteScheduleTasKResponse>
     */
    public CompletableFuture<DeleteScheduleTasKResponse> deleteScheduleTasKAsync(DeleteScheduleTasKRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteScheduleTasK);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTasKRequest 请求对象
     * @return AsyncInvoker<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse>
     */
    public AsyncInvoker<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> deleteScheduleTasKAsyncInvoker(
        DeleteScheduleTasKRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteScheduleTasK, hcClient);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRecordRequest 请求对象
     * @return CompletableFuture<DeleteTaskRecordResponse>
     */
    public CompletableFuture<DeleteTaskRecordResponse> deleteTaskRecordAsync(DeleteTaskRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteTaskRecord);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRecordRequest 请求对象
     * @return AsyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse>
     */
    public AsyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecordAsyncInvoker(
        DeleteTaskRecordRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteTaskRecord, hcClient);
    }

    /**
     * 查询实例是否开启备份加密功能
     *
     * 查询实例是否开启备份加密功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeBackupEncryptStatusRequest 请求对象
     * @return CompletableFuture<DescribeBackupEncryptStatusResponse>
     */
    public CompletableFuture<DescribeBackupEncryptStatusResponse> describeBackupEncryptStatusAsync(
        DescribeBackupEncryptStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.describeBackupEncryptStatus);
    }

    /**
     * 查询实例是否开启备份加密功能
     *
     * 查询实例是否开启备份加密功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeBackupEncryptStatusRequest 请求对象
     * @return AsyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse>
     */
    public AsyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> describeBackupEncryptStatusAsyncInvoker(
        DescribeBackupEncryptStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.describeBackupEncryptStatus, hcClient);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ExpandGaussMySqlInstanceVolumeResponse>
     */
    public CompletableFuture<ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeAsync(
        ExpandGaussMySqlInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandGaussMySqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>
     */
    public AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeAsyncInvoker(
        ExpandGaussMySqlInstanceVolumeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.expandGaussMySqlInstanceVolume, hcClient);
    }

    /**
     * 扩容数据库代理节点的数量
     *
     * 扩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<ExpandGaussMySqlProxyResponse>
     */
    public CompletableFuture<ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyAsync(
        ExpandGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandGaussMySqlProxy);
    }

    /**
     * 扩容数据库代理节点的数量
     *
     * 扩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>
     */
    public AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyAsyncInvoker(
        ExpandGaussMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.expandGaussMySqlProxy, hcClient);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return CompletableFuture<InvokeGaussMySqlInstanceSwitchOverResponse>
     */
    public CompletableFuture<InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOverAsync(
        InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return AsyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse>
     */
    public AsyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOverAsyncInvoker(
        InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver, hcClient);
    }

    /**
     * 获取全量SQL的临时下载链接
     *
     * 获取全量SQL的临时下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogDownloadLinkRequest 请求对象
     * @return CompletableFuture<ListAuditLogDownloadLinkResponse>
     */
    public CompletableFuture<ListAuditLogDownloadLinkResponse> listAuditLogDownloadLinkAsync(
        ListAuditLogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listAuditLogDownloadLink);
    }

    /**
     * 获取全量SQL的临时下载链接
     *
     * 获取全量SQL的临时下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse>
     */
    public AsyncInvoker<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> listAuditLogDownloadLinkAsyncInvoker(
        ListAuditLogDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listAuditLogDownloadLink, hcClient);
    }

    /**
     * 对比参数模板
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDifferencesRequest 请求对象
     * @return CompletableFuture<ListConfigurationsDifferencesResponse>
     */
    public CompletableFuture<ListConfigurationsDifferencesResponse> listConfigurationsDifferencesAsync(
        ListConfigurationsDifferencesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listConfigurationsDifferences);
    }

    /**
     * 对比参数模板
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDifferencesRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse>
     */
    public AsyncInvoker<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> listConfigurationsDifferencesAsyncInvoker(
        ListConfigurationsDifferencesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listConfigurationsDifferences, hcClient);
    }

    /**
     * 查询可应用的实例列表
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsInstancesRequest 请求对象
     * @return CompletableFuture<ListConfigurationsInstancesResponse>
     */
    public CompletableFuture<ListConfigurationsInstancesResponse> listConfigurationsInstancesAsync(
        ListConfigurationsInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listConfigurationsInstances);
    }

    /**
     * 查询可应用的实例列表
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsInstancesRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse>
     */
    public AsyncInvoker<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> listConfigurationsInstancesAsyncInvoker(
        ListConfigurationsInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listConfigurationsInstances, hcClient);
    }

    /**
     * 查询企业项目
     *
     * 查询企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectsResponse>
     */
    public CompletableFuture<ListEnterpriseProjectsResponse> listEnterpriseProjectsAsync(
        ListEnterpriseProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listEnterpriseProjects);
    }

    /**
     * 查询企业项目
     *
     * 查询企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> listEnterpriseProjectsAsyncInvoker(
        ListEnterpriseProjectsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listEnterpriseProjects, hcClient);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlConfigurationsRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlConfigurationsResponse>
     */
    public CompletableFuture<ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsAsync(
        ListGaussMySqlConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlConfigurations);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>
     */
    public AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsAsyncInvoker(
        ListGaussMySqlConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlConfigurations, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDatabaseResponse>
     */
    public CompletableFuture<ListGaussMySqlDatabaseResponse> listGaussMySqlDatabaseAsync(
        ListGaussMySqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabase);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse>
     */
    public AsyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabaseAsyncInvoker(
        ListGaussMySqlDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlDatabase, hcClient);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDatabaseCharsetsResponse>
     */
    public CompletableFuture<ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsetsAsync(
        ListGaussMySqlDatabaseCharsetsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseCharsets);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse>
     */
    public AsyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsetsAsyncInvoker(
        ListGaussMySqlDatabaseCharsetsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlDatabaseCharsets, hcClient);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseUserRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDatabaseUserResponse>
     */
    public CompletableFuture<ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUserAsync(
        ListGaussMySqlDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseUser);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseUserRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse>
     */
    public AsyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUserAsyncInvoker(
        ListGaussMySqlDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDedicatedResourcesResponse>
     */
    public CompletableFuture<ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesAsync(
        ListGaussMySqlDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>
     */
    public AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesAsyncInvoker(
        ListGaussMySqlDedicatedResourcesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlDedicatedResources, hcClient);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstanceDetailInfoResponse>
     */
    public CompletableFuture<ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfoAsync(
        ListGaussMySqlInstanceDetailInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfoAsyncInvoker(
        ListGaussMySqlInstanceDetailInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo, hcClient);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoUnifyStatusRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstanceDetailInfoUnifyStatusResponse>
     */
    public CompletableFuture<ListGaussMySqlInstanceDetailInfoUnifyStatusResponse> listGaussMySqlInstanceDetailInfoUnifyStatusAsync(
        ListGaussMySqlInstanceDetailInfoUnifyStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstanceDetailInfoUnifyStatus);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoUnifyStatusRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse> listGaussMySqlInstanceDetailInfoUnifyStatusAsyncInvoker(
        ListGaussMySqlInstanceDetailInfoUnifyStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstanceDetailInfoUnifyStatus, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstancesResponse>
     */
    public CompletableFuture<ListGaussMySqlInstancesResponse> listGaussMySqlInstancesAsync(
        ListGaussMySqlInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstances);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstancesAsyncInvoker(
        ListGaussMySqlInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstances, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesUnifyStatusRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstancesUnifyStatusResponse>
     */
    public CompletableFuture<ListGaussMySqlInstancesUnifyStatusResponse> listGaussMySqlInstancesUnifyStatusAsync(
        ListGaussMySqlInstancesUnifyStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstancesUnifyStatus);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesUnifyStatusRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse> listGaussMySqlInstancesUnifyStatusAsyncInvoker(
        ListGaussMySqlInstancesUnifyStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstancesUnifyStatus, hcClient);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmediateJobsRequest 请求对象
     * @return CompletableFuture<ListImmediateJobsResponse>
     */
    public CompletableFuture<ListImmediateJobsResponse> listImmediateJobsAsync(ListImmediateJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listImmediateJobs);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmediateJobsRequest 请求对象
     * @return AsyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse>
     */
    public AsyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobsAsyncInvoker(
        ListImmediateJobsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listImmediateJobs, hcClient);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigurationsRequest 请求对象
     * @return CompletableFuture<ListInstanceConfigurationsResponse>
     */
    public CompletableFuture<ListInstanceConfigurationsResponse> listInstanceConfigurationsAsync(
        ListInstanceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listInstanceConfigurations);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>
     */
    public AsyncInvoker<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> listInstanceConfigurationsAsyncInvoker(
        ListInstanceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listInstanceConfigurations, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listInstanceTags, hcClient);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogDetailsRequest 请求对象
     * @return CompletableFuture<ListLtsErrorLogDetailsResponse>
     */
    public CompletableFuture<ListLtsErrorLogDetailsResponse> listLtsErrorLogDetailsAsync(
        ListLtsErrorLogDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listLtsErrorLogDetails);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogDetailsRequest 请求对象
     * @return AsyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse>
     */
    public AsyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetailsAsyncInvoker(
        ListLtsErrorLogDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listLtsErrorLogDetails, hcClient);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowlogDetailsRequest 请求对象
     * @return CompletableFuture<ListLtsSlowlogDetailsResponse>
     */
    public CompletableFuture<ListLtsSlowlogDetailsResponse> listLtsSlowlogDetailsAsync(
        ListLtsSlowlogDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listLtsSlowlogDetails);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowlogDetailsRequest 请求对象
     * @return AsyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse>
     */
    public AsyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetailsAsyncInvoker(
        ListLtsSlowlogDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listLtsSlowlogDetails, hcClient);
    }

    /**
     * 查询参数修改历史
     *
     * 查询参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModifyHistoryRequest 请求对象
     * @return CompletableFuture<ListModifyHistoryResponse>
     */
    public CompletableFuture<ListModifyHistoryResponse> listModifyHistoryAsync(ListModifyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listModifyHistory);
    }

    /**
     * 查询参数修改历史
     *
     * 查询参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModifyHistoryRequest 请求对象
     * @return AsyncInvoker<ListModifyHistoryRequest, ListModifyHistoryResponse>
     */
    public AsyncInvoker<ListModifyHistoryRequest, ListModifyHistoryResponse> listModifyHistoryAsyncInvoker(
        ListModifyHistoryRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listModifyHistory, hcClient);
    }

    /**
     * 查询参数模板应用记录。
     *
     * 查询参数模板应用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamsTemplateApplyHistoryRequest 请求对象
     * @return CompletableFuture<ListParamsTemplateApplyHistoryResponse>
     */
    public CompletableFuture<ListParamsTemplateApplyHistoryResponse> listParamsTemplateApplyHistoryAsync(
        ListParamsTemplateApplyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listParamsTemplateApplyHistory);
    }

    /**
     * 查询参数模板应用记录。
     *
     * 查询参数模板应用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamsTemplateApplyHistoryRequest 请求对象
     * @return AsyncInvoker<ListParamsTemplateApplyHistoryRequest, ListParamsTemplateApplyHistoryResponse>
     */
    public AsyncInvoker<ListParamsTemplateApplyHistoryRequest, ListParamsTemplateApplyHistoryResponse> listParamsTemplateApplyHistoryAsyncInvoker(
        ListParamsTemplateApplyHistoryRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listParamsTemplateApplyHistory, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例信息
     *
     * 查询回收站实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例信息
     *
     * 查询回收站实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listRecycleInstances, hcClient);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleJobsRequest 请求对象
     * @return CompletableFuture<ListScheduleJobsResponse>
     */
    public CompletableFuture<ListScheduleJobsResponse> listScheduleJobsAsync(ListScheduleJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listScheduleJobs);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleJobsRequest 请求对象
     * @return AsyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse>
     */
    public AsyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobsAsyncInvoker(
        ListScheduleJobsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listScheduleJobs, hcClient);
    }

    /**
     * 打开或关闭备份加密
     *
     * 打开或关闭备份加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyBackupEncryptStatusRequest 请求对象
     * @return CompletableFuture<ModifyBackupEncryptStatusResponse>
     */
    public CompletableFuture<ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatusAsync(
        ModifyBackupEncryptStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyBackupEncryptStatus);
    }

    /**
     * 打开或关闭备份加密
     *
     * 打开或关闭备份加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyBackupEncryptStatusRequest 请求对象
     * @return AsyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse>
     */
    public AsyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatusAsyncInvoker(
        ModifyBackupEncryptStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.modifyBackupEncryptStatus, hcClient);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMySqlProxyRouteModeRequest 请求对象
     * @return CompletableFuture<ModifyGaussMySqlProxyRouteModeResponse>
     */
    public CompletableFuture<ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteModeAsync(
        ModifyGaussMySqlProxyRouteModeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyGaussMySqlProxyRouteMode);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMySqlProxyRouteModeRequest 请求对象
     * @return AsyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse>
     */
    public AsyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteModeAsyncInvoker(
        ModifyGaussMySqlProxyRouteModeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.modifyGaussMySqlProxyRouteMode, hcClient);
    }

    /**
     * 修改内网域名
     *
     * 修改内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMysqlDnsRequest 请求对象
     * @return CompletableFuture<ModifyGaussMysqlDnsResponse>
     */
    public CompletableFuture<ModifyGaussMysqlDnsResponse> modifyGaussMysqlDnsAsync(ModifyGaussMysqlDnsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyGaussMysqlDns);
    }

    /**
     * 修改内网域名
     *
     * 修改内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMysqlDnsRequest 请求对象
     * @return AsyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse>
     */
    public AsyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> modifyGaussMysqlDnsAsyncInvoker(
        ModifyGaussMysqlDnsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.modifyGaussMysqlDns, hcClient);
    }

    /**
     * 修改节点故障倒换优先级。
     *
     * 修改节点故障倒换优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyNodePriorityRequest 请求对象
     * @return CompletableFuture<ModifyNodePriorityResponse>
     */
    public CompletableFuture<ModifyNodePriorityResponse> modifyNodePriorityAsync(ModifyNodePriorityRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.modifyNodePriority);
    }

    /**
     * 修改节点故障倒换优先级。
     *
     * 修改节点故障倒换优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyNodePriorityRequest 请求对象
     * @return AsyncInvoker<ModifyNodePriorityRequest, ModifyNodePriorityResponse>
     */
    public AsyncInvoker<ModifyNodePriorityRequest, ModifyNodePriorityResponse> modifyNodePriorityAsyncInvoker(
        ModifyNodePriorityRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.modifyNodePriority, hcClient);
    }

    /**
     * 批量修改节点名称.
     *
     * 批量修改节点名称.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameInstanceNodeRequest 请求对象
     * @return CompletableFuture<RenameInstanceNodeResponse>
     */
    public CompletableFuture<RenameInstanceNodeResponse> renameInstanceNodeAsync(RenameInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.renameInstanceNode);
    }

    /**
     * 批量修改节点名称.
     *
     * 批量修改节点名称.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameInstanceNodeRequest 请求对象
     * @return AsyncInvoker<RenameInstanceNodeRequest, RenameInstanceNodeResponse>
     */
    public AsyncInvoker<RenameInstanceNodeRequest, RenameInstanceNodeResponse> renameInstanceNodeAsyncInvoker(
        RenameInstanceNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.renameInstanceNode, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return CompletableFuture<ResetGaussMySqlDatabasePasswordResponse>
     */
    public CompletableFuture<ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePasswordAsync(
        ResetGaussMySqlDatabasePasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resetGaussMySqlDatabasePassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return AsyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse>
     */
    public AsyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePasswordAsyncInvoker(
        ResetGaussMySqlDatabasePasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.resetGaussMySqlDatabasePassword, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlPasswordRequest 请求对象
     * @return CompletableFuture<ResetGaussMySqlPasswordResponse>
     */
    public CompletableFuture<ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordAsync(
        ResetGaussMySqlPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resetGaussMySqlPassword);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlPasswordRequest 请求对象
     * @return AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>
     */
    public AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordAsyncInvoker(
        ResetGaussMySqlPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.resetGaussMySqlPassword, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<RestartGaussMySqlInstanceResponse>
     */
    public CompletableFuture<RestartGaussMySqlInstanceResponse> restartGaussMySqlInstanceAsync(
        RestartGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartGaussMySqlInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstanceAsyncInvoker(
        RestartGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.restartGaussMySqlInstance, hcClient);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlNodeRequest 请求对象
     * @return CompletableFuture<RestartGaussMySqlNodeResponse>
     */
    public CompletableFuture<RestartGaussMySqlNodeResponse> restartGaussMySqlNodeAsync(
        RestartGaussMySqlNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartGaussMySqlNode);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlNodeRequest 请求对象
     * @return AsyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse>
     */
    public AsyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNodeAsyncInvoker(
        RestartGaussMySqlNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.restartGaussMySqlNode, hcClient);
    }

    /**
     * 重启数据库代理.
     *
     * 重启数据库代理.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartProxyInstanceRequest 请求对象
     * @return CompletableFuture<RestartProxyInstanceResponse>
     */
    public CompletableFuture<RestartProxyInstanceResponse> restartProxyInstanceAsync(
        RestartProxyInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartProxyInstance);
    }

    /**
     * 重启数据库代理.
     *
     * 重启数据库代理.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartProxyInstanceRequest 请求对象
     * @return AsyncInvoker<RestartProxyInstanceRequest, RestartProxyInstanceResponse>
     */
    public AsyncInvoker<RestartProxyInstanceRequest, RestartProxyInstanceResponse> restartProxyInstanceAsyncInvoker(
        RestartProxyInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.restartProxyInstance, hcClient);
    }

    /**
     * 备份恢复到当前实例或已有实例
     *
     * 备份恢复到当前实例或已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreOldInstanceRequest 请求对象
     * @return CompletableFuture<RestoreOldInstanceResponse>
     */
    public CompletableFuture<RestoreOldInstanceResponse> restoreOldInstanceAsync(RestoreOldInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restoreOldInstance);
    }

    /**
     * 备份恢复到当前实例或已有实例
     *
     * 备份恢复到当前实例或已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreOldInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse>
     */
    public AsyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse> restoreOldInstanceAsyncInvoker(
        RestoreOldInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.restoreOldInstance, hcClient);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlProxyWeightRequest 请求对象
     * @return CompletableFuture<SetGaussMySqlProxyWeightResponse>
     */
    public CompletableFuture<SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeightAsync(
        SetGaussMySqlProxyWeightRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setGaussMySqlProxyWeight);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlProxyWeightRequest 请求对象
     * @return AsyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse>
     */
    public AsyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeightAsyncInvoker(
        SetGaussMySqlProxyWeightRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.setGaussMySqlProxyWeight, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<SetGaussMySqlQuotasResponse>
     */
    public CompletableFuture<SetGaussMySqlQuotasResponse> setGaussMySqlQuotasAsync(SetGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setGaussMySqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotasAsyncInvoker(
        SetGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.setGaussMySqlQuotas, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return CompletableFuture<ShowAuditLogResponse>
     */
    public CompletableFuture<ShowAuditLogResponse> showAuditLogAsync(ShowAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showAuditLog);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogAsyncInvoker(
        ShowAuditLogRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showAuditLog, hcClient);
    }

    /**
     * 查询自动变配历史记录.
     *
     * 查询自动变配历史记录.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingHistoryRequest 请求对象
     * @return CompletableFuture<ShowAutoScalingHistoryResponse>
     */
    public CompletableFuture<ShowAutoScalingHistoryResponse> showAutoScalingHistoryAsync(
        ShowAutoScalingHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showAutoScalingHistory);
    }

    /**
     * 查询自动变配历史记录.
     *
     * 查询自动变配历史记录.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingHistoryRequest 请求对象
     * @return AsyncInvoker<ShowAutoScalingHistoryRequest, ShowAutoScalingHistoryResponse>
     */
    public AsyncInvoker<ShowAutoScalingHistoryRequest, ShowAutoScalingHistoryResponse> showAutoScalingHistoryAsyncInvoker(
        ShowAutoScalingHistoryRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showAutoScalingHistory, hcClient);
    }

    /**
     * 查询自动变配
     *
     * 查询自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoScalingPolicyResponse>
     */
    public CompletableFuture<ShowAutoScalingPolicyResponse> showAutoScalingPolicyAsync(
        ShowAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showAutoScalingPolicy);
    }

    /**
     * 查询自动变配
     *
     * 查询自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse>
     */
    public AsyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicyAsyncInvoker(
        ShowAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showAutoScalingPolicy, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRestoreTimeRequest 请求对象
     * @return CompletableFuture<ShowBackupRestoreTimeResponse>
     */
    public CompletableFuture<ShowBackupRestoreTimeResponse> showBackupRestoreTimeAsync(
        ShowBackupRestoreTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showBackupRestoreTime);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRestoreTimeRequest 请求对象
     * @return AsyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse>
     */
    public AsyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> showBackupRestoreTimeAsyncInvoker(
        ShowBackupRestoreTimeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showBackupRestoreTime, hcClient);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDedicatedResourceInfoRequest 请求对象
     * @return CompletableFuture<ShowDedicatedResourceInfoResponse>
     */
    public CompletableFuture<ShowDedicatedResourceInfoResponse> showDedicatedResourceInfoAsync(
        ShowDedicatedResourceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showDedicatedResourceInfo);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDedicatedResourceInfoRequest 请求对象
     * @return AsyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse>
     */
    public AsyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfoAsyncInvoker(
        ShowDedicatedResourceInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showDedicatedResourceInfo, hcClient);
    }

    /**
     * 查询全量备份列表
     *
     * 查询全量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlBackupListResponse>
     */
    public CompletableFuture<ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListAsync(
        ShowGaussMySqlBackupListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupList);
    }

    /**
     * 查询全量备份列表
     *
     * 查询全量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListAsyncInvoker(
        ShowGaussMySqlBackupListRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlBackupPolicyResponse>
     */
    public CompletableFuture<ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyAsync(
        ShowGaussMySqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>
     */
    public AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyAsyncInvoker(
        ShowGaussMySqlBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<ShowGaussMySqlConfigurationResponse> showGaussMySqlConfigurationAsync(
        ShowGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlConfiguration);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfigurationAsyncInvoker(
        ShowGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlConfiguration, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlEngineVersionRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlEngineVersionResponse>
     */
    public CompletableFuture<ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionAsync(
        ShowGaussMySqlEngineVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlEngineVersionRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>
     */
    public AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionAsyncInvoker(
        ShowGaussMySqlEngineVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlFlavorsRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlFlavorsResponse>
     */
    public CompletableFuture<ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsAsync(
        ShowGaussMySqlFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>
     */
    public AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsAsyncInvoker(
        ShowGaussMySqlFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlFlavors, hcClient);
    }

    /**
     * 查询增量备份列表
     *
     * 查询增量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlIncrementalBackupListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlIncrementalBackupListResponse>
     */
    public CompletableFuture<ShowGaussMySqlIncrementalBackupListResponse> showGaussMySqlIncrementalBackupListAsync(
        ShowGaussMySqlIncrementalBackupListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlIncrementalBackupList);
    }

    /**
     * 查询增量备份列表
     *
     * 查询增量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlIncrementalBackupListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> showGaussMySqlIncrementalBackupListAsyncInvoker(
        ShowGaussMySqlIncrementalBackupListRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlIncrementalBackupList, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlInstanceInfoResponse>
     */
    public CompletableFuture<ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoAsync(
        ShowGaussMySqlInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>
     */
    public AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoAsyncInvoker(
        ShowGaussMySqlInstanceInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlInstanceInfo, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoUnifyStatusRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlInstanceInfoUnifyStatusResponse>
     */
    public CompletableFuture<ShowGaussMySqlInstanceInfoUnifyStatusResponse> showGaussMySqlInstanceInfoUnifyStatusAsync(
        ShowGaussMySqlInstanceInfoUnifyStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfoUnifyStatus);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoUnifyStatusRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse>
     */
    public AsyncInvoker<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse> showGaussMySqlInstanceInfoUnifyStatusAsyncInvoker(
        ShowGaussMySqlInstanceInfoUnifyStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlInstanceInfoUnifyStatus, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlJobInfoRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlJobInfoResponse>
     */
    public CompletableFuture<ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoAsync(
        ShowGaussMySqlJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>
     */
    public AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoAsyncInvoker(
        ShowGaussMySqlJobInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProjectQuotasResponse>
     */
    public CompletableFuture<ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasAsync(
        ShowGaussMySqlProjectQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasAsyncInvoker(
        ShowGaussMySqlProjectQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyFlavorsResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsAsync(
        ShowGaussMySqlProxyFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsAsyncInvoker(
        ShowGaussMySqlProxyFlavorsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlProxyFlavors, hcClient);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyListResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListAsync(
        ShowGaussMySqlProxyListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyList);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListAsyncInvoker(
        ShowGaussMySqlProxyListRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlProxyList, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlQuotasResponse>
     */
    public CompletableFuture<ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasAsync(
        ShowGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasAsyncInvoker(
        ShowGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询内核版本信息
     *
     * 查询内核版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDatabaseVersionRequest 请求对象
     * @return CompletableFuture<ShowInstanceDatabaseVersionResponse>
     */
    public CompletableFuture<ShowInstanceDatabaseVersionResponse> showInstanceDatabaseVersionAsync(
        ShowInstanceDatabaseVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showInstanceDatabaseVersion);
    }

    /**
     * 查询内核版本信息
     *
     * 查询内核版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDatabaseVersionRequest 请求对象
     * @return AsyncInvoker<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse>
     */
    public AsyncInvoker<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> showInstanceDatabaseVersionAsyncInvoker(
        ShowInstanceDatabaseVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showInstanceDatabaseVersion, hcClient);
    }

    /**
     * 查询弹性公网IP。
     *
     * 查询弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceEipRequest 请求对象
     * @return CompletableFuture<ShowInstanceEipResponse>
     */
    public CompletableFuture<ShowInstanceEipResponse> showInstanceEipAsync(ShowInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showInstanceEip);
    }

    /**
     * 查询弹性公网IP。
     *
     * 查询弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceEipRequest 请求对象
     * @return AsyncInvoker<ShowInstanceEipRequest, ShowInstanceEipResponse>
     */
    public AsyncInvoker<ShowInstanceEipRequest, ShowInstanceEipResponse> showInstanceEipAsyncInvoker(
        ShowInstanceEipRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showInstanceEip, hcClient);
    }

    /**
     * 查询实例秒级监控
     *
     * 查询实例秒级监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorExtendRequest 请求对象
     * @return CompletableFuture<ShowInstanceMonitorExtendResponse>
     */
    public CompletableFuture<ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendAsync(
        ShowInstanceMonitorExtendRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showInstanceMonitorExtend);
    }

    /**
     * 查询实例秒级监控
     *
     * 查询实例秒级监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorExtendRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>
     */
    public AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendAsyncInvoker(
        ShowInstanceMonitorExtendRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showInstanceMonitorExtend, hcClient);
    }

    /**
     * 获取各指标的异常实例数
     *
     * 获取各指标的异常实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest 请求对象
     * @return CompletableFuture<ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse>
     */
    public CompletableFuture<ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> showIntelligentDiagnosisAbnormalCountOfInstancesAsync(
        ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showIntelligentDiagnosisAbnormalCountOfInstances);
    }

    /**
     * 获取各指标的异常实例数
     *
     * 获取各指标的异常实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest 请求对象
     * @return AsyncInvoker<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse>
     */
    public AsyncInvoker<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> showIntelligentDiagnosisAbnormalCountOfInstancesAsyncInvoker(
        ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showIntelligentDiagnosisAbnormalCountOfInstances, hcClient);
    }

    /**
     * 获取某个指标的异常实例信息
     *
     * 获取某个指标的异常实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisInstanceInfosPerMetricRequest 请求对象
     * @return CompletableFuture<ShowIntelligentDiagnosisInstanceInfosPerMetricResponse>
     */
    public CompletableFuture<ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> showIntelligentDiagnosisInstanceInfosPerMetricAsync(
        ShowIntelligentDiagnosisInstanceInfosPerMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showIntelligentDiagnosisInstanceInfosPerMetric);
    }

    /**
     * 获取某个指标的异常实例信息
     *
     * 获取某个指标的异常实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisInstanceInfosPerMetricRequest 请求对象
     * @return AsyncInvoker<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse>
     */
    public AsyncInvoker<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> showIntelligentDiagnosisInstanceInfosPerMetricAsyncInvoker(
        ShowIntelligentDiagnosisInstanceInfosPerMetricRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showIntelligentDiagnosisInstanceInfosPerMetric, hcClient);
    }

    /**
     * 查询实例LTS日志配置列表
     *
     * 查询实例LTS日志配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsConfigsRequest 请求对象
     * @return CompletableFuture<ShowLtsConfigsResponse>
     */
    public CompletableFuture<ShowLtsConfigsResponse> showLtsConfigsAsync(ShowLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showLtsConfigs);
    }

    /**
     * 查询实例LTS日志配置列表
     *
     * 查询实例LTS日志配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLtsConfigsRequest 请求对象
     * @return AsyncInvoker<ShowLtsConfigsRequest, ShowLtsConfigsResponse>
     */
    public AsyncInvoker<ShowLtsConfigsRequest, ShowLtsConfigsResponse> showLtsConfigsAsyncInvoker(
        ShowLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showLtsConfigs, hcClient);
    }

    /**
     * 查询数据库代理内核参数。
     *
     * 查询数据库代理内核参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyConfigurationsRequest 请求对象
     * @return CompletableFuture<ShowProxyConfigurationsResponse>
     */
    public CompletableFuture<ShowProxyConfigurationsResponse> showProxyConfigurationsAsync(
        ShowProxyConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showProxyConfigurations);
    }

    /**
     * 查询数据库代理内核参数。
     *
     * 查询数据库代理内核参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyConfigurationsRequest 请求对象
     * @return AsyncInvoker<ShowProxyConfigurationsRequest, ShowProxyConfigurationsResponse>
     */
    public AsyncInvoker<ShowProxyConfigurationsRequest, ShowProxyConfigurationsResponse> showProxyConfigurationsAsyncInvoker(
        ShowProxyConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showProxyConfigurations, hcClient);
    }

    /**
     * 查询代理实例访问控制
     *
     * 查询代理实例访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyIpgroupRequest 请求对象
     * @return CompletableFuture<ShowProxyIpgroupResponse>
     */
    public CompletableFuture<ShowProxyIpgroupResponse> showProxyIpgroupAsync(ShowProxyIpgroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showProxyIpgroup);
    }

    /**
     * 查询代理实例访问控制
     *
     * 查询代理实例访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyIpgroupRequest 请求对象
     * @return AsyncInvoker<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse>
     */
    public AsyncInvoker<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse> showProxyIpgroupAsyncInvoker(
        ShowProxyIpgroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showProxyIpgroup, hcClient);
    }

    /**
     * 查询代理实例小版本
     *
     * 查询代理实例小版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyVersionRequest 请求对象
     * @return CompletableFuture<ShowProxyVersionResponse>
     */
    public CompletableFuture<ShowProxyVersionResponse> showProxyVersionAsync(ShowProxyVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showProxyVersion);
    }

    /**
     * 查询代理实例小版本
     *
     * 查询代理实例小版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyVersionRequest 请求对象
     * @return AsyncInvoker<ShowProxyVersionRequest, ShowProxyVersionResponse>
     */
    public AsyncInvoker<ShowProxyVersionRequest, ShowProxyVersionResponse> showProxyVersionAsyncInvoker(
        ShowProxyVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showProxyVersion, hcClient);
    }

    /**
     * 查询回收站策略
     *
     * 查询回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showRecyclePolicy);
    }

    /**
     * 查询回收站策略
     *
     * 查询回收站策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询表级时间点恢复可选表
     *
     * 查询表级时间点恢复可选表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestoreTablesRequest 请求对象
     * @return CompletableFuture<ShowRestoreTablesResponse>
     */
    public CompletableFuture<ShowRestoreTablesResponse> showRestoreTablesAsync(ShowRestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showRestoreTables);
    }

    /**
     * 查询表级时间点恢复可选表
     *
     * 查询表级时间点恢复可选表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestoreTablesRequest 请求对象
     * @return AsyncInvoker<ShowRestoreTablesRequest, ShowRestoreTablesResponse>
     */
    public AsyncInvoker<ShowRestoreTablesRequest, ShowRestoreTablesResponse> showRestoreTablesAsyncInvoker(
        ShowRestoreTablesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showRestoreTables, hcClient);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowlogSensitiveStatusRequest 请求对象
     * @return CompletableFuture<ShowSlowlogSensitiveStatusResponse>
     */
    public CompletableFuture<ShowSlowlogSensitiveStatusResponse> showSlowlogSensitiveStatusAsync(
        ShowSlowlogSensitiveStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showSlowlogSensitiveStatus);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowlogSensitiveStatusRequest 请求对象
     * @return AsyncInvoker<ShowSlowlogSensitiveStatusRequest, ShowSlowlogSensitiveStatusResponse>
     */
    public AsyncInvoker<ShowSlowlogSensitiveStatusRequest, ShowSlowlogSensitiveStatusResponse> showSlowlogSensitiveStatusAsyncInvoker(
        ShowSlowlogSensitiveStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showSlowlogSensitiveStatus, hcClient);
    }

    /**
     * 减少数据库代理节点的数量
     *
     * 缩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<ShrinkGaussMySqlProxyResponse>
     */
    public CompletableFuture<ShrinkGaussMySqlProxyResponse> shrinkGaussMySqlProxyAsync(
        ShrinkGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.shrinkGaussMySqlProxy);
    }

    /**
     * 减少数据库代理节点的数量
     *
     * 缩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse>
     */
    public AsyncInvoker<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> shrinkGaussMySqlProxyAsyncInvoker(
        ShrinkGaussMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.shrinkGaussMySqlProxy, hcClient);
    }

    /**
     * 开启或关闭访问控制
     *
     * 开启或关闭访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAccessControlRequest 请求对象
     * @return CompletableFuture<SwitchAccessControlResponse>
     */
    public CompletableFuture<SwitchAccessControlResponse> switchAccessControlAsync(SwitchAccessControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.switchAccessControl);
    }

    /**
     * 开启或关闭访问控制
     *
     * 开启或关闭访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAccessControlRequest 请求对象
     * @return AsyncInvoker<SwitchAccessControlRequest, SwitchAccessControlResponse>
     */
    public AsyncInvoker<SwitchAccessControlRequest, SwitchAccessControlResponse> switchAccessControlAsyncInvoker(
        SwitchAccessControlRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.switchAccessControl, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<SwitchGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfigurationAsync(
        SwitchGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.switchGaussMySqlConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfigurationAsyncInvoker(
        SwitchGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.switchGaussMySqlConfiguration, hcClient);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return CompletableFuture<SwitchGaussMySqlInstanceSslResponse>
     */
    public CompletableFuture<SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSslAsync(
        SwitchGaussMySqlInstanceSslRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.switchGaussMySqlInstanceSsl);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return AsyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse>
     */
    public AsyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSslAsyncInvoker(
        SwitchGaussMySqlInstanceSslRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.switchGaussMySqlInstanceSsl, hcClient);
    }

    /**
     * 开关数据库代理SSL
     *
     * 为数据库代理设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlProxySslRequest 请求对象
     * @return CompletableFuture<SwitchGaussMySqlProxySslResponse>
     */
    public CompletableFuture<SwitchGaussMySqlProxySslResponse> switchGaussMySqlProxySslAsync(
        SwitchGaussMySqlProxySslRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.switchGaussMySqlProxySsl);
    }

    /**
     * 开关数据库代理SSL
     *
     * 为数据库代理设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlProxySslRequest 请求对象
     * @return AsyncInvoker<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse>
     */
    public AsyncInvoker<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse> switchGaussMySqlProxySslAsyncInvoker(
        SwitchGaussMySqlProxySslRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.switchGaussMySqlProxySsl, hcClient);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditLogRequest 请求对象
     * @return CompletableFuture<UpdateAuditLogResponse>
     */
    public CompletableFuture<UpdateAuditLogResponse> updateAuditLogAsync(UpdateAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateAuditLog);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditLogRequest 请求对象
     * @return AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>
     */
    public AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLogAsyncInvoker(
        UpdateAuditLogRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateAuditLog, hcClient);
    }

    /**
     * 设置自动变配
     *
     * 设置自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAutoScalingPolicyResponse>
     */
    public CompletableFuture<UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyAsync(
        UpdateAutoScalingPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateAutoScalingPolicy);
    }

    /**
     * 设置自动变配
     *
     * 设置自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse>
     */
    public AsyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyAsyncInvoker(
        UpdateAutoScalingPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateAutoScalingPolicy, hcClient);
    }

    /**
     * 设置跨区备份策略
     *
     * 设置跨区备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupOffsitePolicyRequest 请求对象
     * @return CompletableFuture<UpdateBackupOffsitePolicyResponse>
     */
    public CompletableFuture<UpdateBackupOffsitePolicyResponse> updateBackupOffsitePolicyAsync(
        UpdateBackupOffsitePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateBackupOffsitePolicy);
    }

    /**
     * 设置跨区备份策略
     *
     * 设置跨区备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupOffsitePolicyRequest 请求对象
     * @return AsyncInvoker<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse>
     */
    public AsyncInvoker<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> updateBackupOffsitePolicyAsyncInvoker(
        UpdateBackupOffsitePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateBackupOffsitePolicy, hcClient);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlBackupPolicyResponse>
     */
    public CompletableFuture<UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyAsync(
        UpdateGaussMySqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlBackupPolicy);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyAsyncInvoker(
        UpdateGaussMySqlBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlConfigurationResponse>
     */
    public CompletableFuture<UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfigurationAsync(
        UpdateGaussMySqlConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlConfiguration);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfigurationAsyncInvoker(
        UpdateGaussMySqlConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlConfiguration, hcClient);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlDatabaseCommentResponse>
     */
    public CompletableFuture<UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseCommentAsync(
        UpdateGaussMySqlDatabaseCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseComment);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseCommentAsyncInvoker(
        UpdateGaussMySqlDatabaseCommentRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlDatabaseComment, hcClient);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlDatabaseUserCommentResponse>
     */
    public CompletableFuture<UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserCommentAsync(
        UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserCommentAsyncInvoker(
        UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceAliasResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAliasAsync(
        UpdateGaussMySqlInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceAlias);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAliasAsyncInvoker(
        UpdateGaussMySqlInstanceAliasRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceAlias, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceEipResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEipAsync(
        UpdateGaussMySqlInstanceEipRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEipAsyncInvoker(
        UpdateGaussMySqlInstanceEipRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceInternalIpResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIpAsync(
        UpdateGaussMySqlInstanceInternalIpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIpAsyncInvoker(
        UpdateGaussMySqlInstanceInternalIpRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceNameResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameAsync(
        UpdateGaussMySqlInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameAsyncInvoker(
        UpdateGaussMySqlInstanceNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceName, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceOpsWindowResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindowAsync(
        UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindowAsyncInvoker(
        UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow, hcClient);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstancePortRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstancePortResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePortAsync(
        UpdateGaussMySqlInstancePortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstancePort);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstancePortRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePortAsyncInvoker(
        UpdateGaussMySqlInstancePortRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstancePort, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceSecurityGroupResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroupAsync(
        UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroupAsyncInvoker(
        UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlQuotasResponse>
     */
    public CompletableFuture<UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasAsync(
        UpdateGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasAsyncInvoker(
        UpdateGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateGaussMySqlQuotas, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationsRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationsResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationsResponse> updateInstanceConfigurationsAsync(
        UpdateInstanceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateInstanceConfigurations);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationsRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> updateInstanceConfigurationsAsyncInvoker(
        UpdateInstanceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateInstanceConfigurations, hcClient);
    }

    /**
     * 设置实例秒级监控
     *
     * 设置实例秒级监控，包括1秒监控和5秒监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceMonitorRequest 请求对象
     * @return CompletableFuture<UpdateInstanceMonitorResponse>
     */
    public CompletableFuture<UpdateInstanceMonitorResponse> updateInstanceMonitorAsync(
        UpdateInstanceMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateInstanceMonitor);
    }

    /**
     * 设置实例秒级监控
     *
     * 设置实例秒级监控，包括1秒监控和5秒监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceMonitorRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>
     */
    public AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitorAsyncInvoker(
        UpdateInstanceMonitorRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateInstanceMonitor, hcClient);
    }

    /**
     * 开启或关闭新增节点自动加入该Proxy
     *
     * 开启或关闭新增节点自动加入该Proxy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewNodeAutoAddSwitchRequest 请求对象
     * @return CompletableFuture<UpdateNewNodeAutoAddSwitchResponse>
     */
    public CompletableFuture<UpdateNewNodeAutoAddSwitchResponse> updateNewNodeAutoAddSwitchAsync(
        UpdateNewNodeAutoAddSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateNewNodeAutoAddSwitch);
    }

    /**
     * 开启或关闭新增节点自动加入该Proxy
     *
     * 开启或关闭新增节点自动加入该Proxy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewNodeAutoAddSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse>
     */
    public AsyncInvoker<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse> updateNewNodeAutoAddSwitchAsyncInvoker(
        UpdateNewNodeAutoAddSwitchRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateNewNodeAutoAddSwitch, hcClient);
    }

    /**
     * 更改数据库代理连接池类型
     *
     * 更改数据库代理连接池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyConnectionPoolTypeRequest 请求对象
     * @return CompletableFuture<UpdateProxyConnectionPoolTypeResponse>
     */
    public CompletableFuture<UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolTypeAsync(
        UpdateProxyConnectionPoolTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxyConnectionPoolType);
    }

    /**
     * 更改数据库代理连接池类型
     *
     * 更改数据库代理连接池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyConnectionPoolTypeRequest 请求对象
     * @return AsyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse>
     */
    public AsyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolTypeAsyncInvoker(
        UpdateProxyConnectionPoolTypeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateProxyConnectionPoolType, hcClient);
    }

    /**
     * 修改代理实例名称
     *
     * 修改代理实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNameRequest 请求对象
     * @return CompletableFuture<UpdateProxyNameResponse>
     */
    public CompletableFuture<UpdateProxyNameResponse> updateProxyNameAsync(UpdateProxyNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxyName);
    }

    /**
     * 修改代理实例名称
     *
     * 修改代理实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNameRequest 请求对象
     * @return AsyncInvoker<UpdateProxyNameRequest, UpdateProxyNameResponse>
     */
    public AsyncInvoker<UpdateProxyNameRequest, UpdateProxyNameResponse> updateProxyNameAsyncInvoker(
        UpdateProxyNameRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateProxyName, hcClient);
    }

    /**
     * 修改代理实例参数
     *
     * 修改数据库代理参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNewConfigurationsRequest 请求对象
     * @return CompletableFuture<UpdateProxyNewConfigurationsResponse>
     */
    public CompletableFuture<UpdateProxyNewConfigurationsResponse> updateProxyNewConfigurationsAsync(
        UpdateProxyNewConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxyNewConfigurations);
    }

    /**
     * 修改代理实例参数
     *
     * 修改数据库代理参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNewConfigurationsRequest 请求对象
     * @return AsyncInvoker<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse>
     */
    public AsyncInvoker<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> updateProxyNewConfigurationsAsyncInvoker(
        UpdateProxyNewConfigurationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateProxyNewConfigurations, hcClient);
    }

    /**
     * 修改读写分离端口号
     *
     * 修改读写分离端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyPortRequest 请求对象
     * @return CompletableFuture<UpdateProxyPortResponse>
     */
    public CompletableFuture<UpdateProxyPortResponse> updateProxyPortAsync(UpdateProxyPortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxyPort);
    }

    /**
     * 修改读写分离端口号
     *
     * 修改读写分离端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyPortRequest 请求对象
     * @return AsyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse>
     */
    public AsyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse> updateProxyPortAsyncInvoker(
        UpdateProxyPortRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateProxyPort, hcClient);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxySessionConsistenceRequest 请求对象
     * @return CompletableFuture<UpdateProxySessionConsistenceResponse>
     */
    public CompletableFuture<UpdateProxySessionConsistenceResponse> updateProxySessionConsistenceAsync(
        UpdateProxySessionConsistenceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateProxySessionConsistence);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxySessionConsistenceRequest 请求对象
     * @return AsyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse>
     */
    public AsyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistenceAsyncInvoker(
        UpdateProxySessionConsistenceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateProxySessionConsistence, hcClient);
    }

    /**
     * 设置Serverless配置策略
     *
     * 设置Serverless配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerlessPolicyRequest 请求对象
     * @return CompletableFuture<UpdateServerlessPolicyResponse>
     */
    public CompletableFuture<UpdateServerlessPolicyResponse> updateServerlessPolicyAsync(
        UpdateServerlessPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateServerlessPolicy);
    }

    /**
     * 设置Serverless配置策略
     *
     * 设置Serverless配置策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServerlessPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateServerlessPolicyRequest, UpdateServerlessPolicyResponse>
     */
    public AsyncInvoker<UpdateServerlessPolicyRequest, UpdateServerlessPolicyResponse> updateServerlessPolicyAsyncInvoker(
        UpdateServerlessPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateServerlessPolicy, hcClient);
    }

    /**
     * 开启或关闭慢日志脱敏状态
     *
     * 开启或关闭慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlowlogSensitiveSwitchRequest 请求对象
     * @return CompletableFuture<UpdateSlowlogSensitiveSwitchResponse>
     */
    public CompletableFuture<UpdateSlowlogSensitiveSwitchResponse> updateSlowlogSensitiveSwitchAsync(
        UpdateSlowlogSensitiveSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateSlowlogSensitiveSwitch);
    }

    /**
     * 开启或关闭慢日志脱敏状态
     *
     * 开启或关闭慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSlowlogSensitiveSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateSlowlogSensitiveSwitchRequest, UpdateSlowlogSensitiveSwitchResponse>
     */
    public AsyncInvoker<UpdateSlowlogSensitiveSwitchRequest, UpdateSlowlogSensitiveSwitchResponse> updateSlowlogSensitiveSwitchAsyncInvoker(
        UpdateSlowlogSensitiveSwitchRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateSlowlogSensitiveSwitch, hcClient);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransactionSplitStatusRequest 请求对象
     * @return CompletableFuture<UpdateTransactionSplitStatusResponse>
     */
    public CompletableFuture<UpdateTransactionSplitStatusResponse> updateTransactionSplitStatusAsync(
        UpdateTransactionSplitStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateTransactionSplitStatus);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransactionSplitStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse>
     */
    public AsyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatusAsyncInvoker(
        UpdateTransactionSplitStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateTransactionSplitStatus, hcClient);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return CompletableFuture<UpgradeGaussMySqlInstanceDatabaseResponse>
     */
    public CompletableFuture<UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabaseAsync(
        UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return AsyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse>
     */
    public AsyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabaseAsyncInvoker(
        UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase, hcClient);
    }

    /**
     * 升级数据库代理实例内核版本
     *
     * 升级数据库代理实例内核版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeProxyVersionRequest 请求对象
     * @return CompletableFuture<UpgradeProxyVersionResponse>
     */
    public CompletableFuture<UpgradeProxyVersionResponse> upgradeProxyVersionAsync(UpgradeProxyVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.upgradeProxyVersion);
    }

    /**
     * 升级数据库代理实例内核版本
     *
     * 升级数据库代理实例内核版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeProxyVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse>
     */
    public AsyncInvoker<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse> upgradeProxyVersionAsyncInvoker(
        UpgradeProxyVersionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.upgradeProxyVersion, hcClient);
    }

    /**
     * 数据同步库配置校验
     *
     * 数据同步库配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClickHouseDataBaseConfigRequest 请求对象
     * @return CompletableFuture<CheckClickHouseDataBaseConfigResponse>
     */
    public CompletableFuture<CheckClickHouseDataBaseConfigResponse> checkClickHouseDataBaseConfigAsync(
        CheckClickHouseDataBaseConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.checkClickHouseDataBaseConfig);
    }

    /**
     * 数据同步库配置校验
     *
     * 数据同步库配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClickHouseDataBaseConfigRequest 请求对象
     * @return AsyncInvoker<CheckClickHouseDataBaseConfigRequest, CheckClickHouseDataBaseConfigResponse>
     */
    public AsyncInvoker<CheckClickHouseDataBaseConfigRequest, CheckClickHouseDataBaseConfigResponse> checkClickHouseDataBaseConfigAsyncInvoker(
        CheckClickHouseDataBaseConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.checkClickHouseDataBaseConfig, hcClient);
    }

    /**
     * 数据同步表配置校验
     *
     * 数据同步表配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClickHouseTableConfigRequest 请求对象
     * @return CompletableFuture<CheckClickHouseTableConfigResponse>
     */
    public CompletableFuture<CheckClickHouseTableConfigResponse> checkClickHouseTableConfigAsync(
        CheckClickHouseTableConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.checkClickHouseTableConfig);
    }

    /**
     * 数据同步表配置校验
     *
     * 数据同步表配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckClickHouseTableConfigRequest 请求对象
     * @return AsyncInvoker<CheckClickHouseTableConfigRequest, CheckClickHouseTableConfigResponse>
     */
    public AsyncInvoker<CheckClickHouseTableConfigRequest, CheckClickHouseTableConfigResponse> checkClickHouseTableConfigAsyncInvoker(
        CheckClickHouseTableConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.checkClickHouseTableConfig, hcClient);
    }

    /**
     * HTAP数据同步库配置校验
     *
     * HTAP数据同步库配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataBaseConfigRequest 请求对象
     * @return CompletableFuture<CheckDataBaseConfigResponse>
     */
    public CompletableFuture<CheckDataBaseConfigResponse> checkDataBaseConfigAsync(CheckDataBaseConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.checkDataBaseConfig);
    }

    /**
     * HTAP数据同步库配置校验
     *
     * HTAP数据同步库配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataBaseConfigRequest 请求对象
     * @return AsyncInvoker<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse>
     */
    public AsyncInvoker<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse> checkDataBaseConfigAsyncInvoker(
        CheckDataBaseConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.checkDataBaseConfig, hcClient);
    }

    /**
     * StarRocks资源检查
     *
     * StarRocks资源检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckStarRocksResourceRequest 请求对象
     * @return CompletableFuture<CheckStarRocksResourceResponse>
     */
    public CompletableFuture<CheckStarRocksResourceResponse> checkStarRocksResourceAsync(
        CheckStarRocksResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.checkStarRocksResource);
    }

    /**
     * StarRocks资源检查
     *
     * StarRocks资源检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckStarRocksResourceRequest 请求对象
     * @return AsyncInvoker<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse>
     */
    public AsyncInvoker<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse> checkStarRocksResourceAsyncInvoker(
        CheckStarRocksResourceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.checkStarRocksResource, hcClient);
    }

    /**
     * HTAP数据同步表配置校验
     *
     * HTAP数据同步表配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableConfigRequest 请求对象
     * @return CompletableFuture<CheckTableConfigResponse>
     */
    public CompletableFuture<CheckTableConfigResponse> checkTableConfigAsync(CheckTableConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.checkTableConfig);
    }

    /**
     * HTAP数据同步表配置校验
     *
     * HTAP数据同步表配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableConfigRequest 请求对象
     * @return AsyncInvoker<CheckTableConfigRequest, CheckTableConfigResponse>
     */
    public AsyncInvoker<CheckTableConfigRequest, CheckTableConfigResponse> checkTableConfigAsyncInvoker(
        CheckTableConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.checkTableConfig, hcClient);
    }

    /**
     * 创建数据同步
     *
     * 创建数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClickHouseDataBaseReplicationRequest 请求对象
     * @return CompletableFuture<CreateClickHouseDataBaseReplicationResponse>
     */
    public CompletableFuture<CreateClickHouseDataBaseReplicationResponse> createClickHouseDataBaseReplicationAsync(
        CreateClickHouseDataBaseReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createClickHouseDataBaseReplication);
    }

    /**
     * 创建数据同步
     *
     * 创建数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClickHouseDataBaseReplicationRequest 请求对象
     * @return AsyncInvoker<CreateClickHouseDataBaseReplicationRequest, CreateClickHouseDataBaseReplicationResponse>
     */
    public AsyncInvoker<CreateClickHouseDataBaseReplicationRequest, CreateClickHouseDataBaseReplicationResponse> createClickHouseDataBaseReplicationAsyncInvoker(
        CreateClickHouseDataBaseReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createClickHouseDataBaseReplication, hcClient);
    }

    /**
     * 创建数据库账号
     *
     * 创建数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClickHouseDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateClickHouseDatabaseUserResponse>
     */
    public CompletableFuture<CreateClickHouseDatabaseUserResponse> createClickHouseDatabaseUserAsync(
        CreateClickHouseDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createClickHouseDatabaseUser);
    }

    /**
     * 创建数据库账号
     *
     * 创建数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClickHouseDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateClickHouseDatabaseUserRequest, CreateClickHouseDatabaseUserResponse>
     */
    public AsyncInvoker<CreateClickHouseDatabaseUserRequest, CreateClickHouseDatabaseUserResponse> createClickHouseDatabaseUserAsyncInvoker(
        CreateClickHouseDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createClickHouseDatabaseUser, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClickHouseInstanceRequest 请求对象
     * @return CompletableFuture<CreateClickHouseInstanceResponse>
     */
    public CompletableFuture<CreateClickHouseInstanceResponse> createClickHouseInstanceAsync(
        CreateClickHouseInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createClickHouseInstance);
    }

    /**
     * 创建实例
     *
     * 创建实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateClickHouseInstanceRequest 请求对象
     * @return AsyncInvoker<CreateClickHouseInstanceRequest, CreateClickHouseInstanceResponse>
     */
    public AsyncInvoker<CreateClickHouseInstanceRequest, CreateClickHouseInstanceResponse> createClickHouseInstanceAsyncInvoker(
        CreateClickHouseInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createClickHouseInstance, hcClient);
    }

    /**
     * 创建StarRocks数据同步
     *
     * 创建StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDataReplicationRequest 请求对象
     * @return CompletableFuture<CreateStarRocksDataReplicationResponse>
     */
    public CompletableFuture<CreateStarRocksDataReplicationResponse> createStarRocksDataReplicationAsync(
        CreateStarRocksDataReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createStarRocksDataReplication);
    }

    /**
     * 创建StarRocks数据同步
     *
     * 创建StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDataReplicationRequest 请求对象
     * @return AsyncInvoker<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse>
     */
    public AsyncInvoker<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse> createStarRocksDataReplicationAsyncInvoker(
        CreateStarRocksDataReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createStarRocksDataReplication, hcClient);
    }

    /**
     * 创建数据库账号
     *
     * 创建StarRocks数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDatabaseUserRequest 请求对象
     * @return CompletableFuture<CreateStarRocksDatabaseUserResponse>
     */
    public CompletableFuture<CreateStarRocksDatabaseUserResponse> createStarRocksDatabaseUserAsync(
        CreateStarRocksDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createStarRocksDatabaseUser);
    }

    /**
     * 创建数据库账号
     *
     * 创建StarRocks数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDatabaseUserRequest 请求对象
     * @return AsyncInvoker<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse>
     */
    public AsyncInvoker<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse> createStarRocksDatabaseUserAsyncInvoker(
        CreateStarRocksDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createStarRocksDatabaseUser, hcClient);
    }

    /**
     * 创建StarRocks实例
     *
     * 创建StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarrocksInstanceRequest 请求对象
     * @return CompletableFuture<CreateStarrocksInstanceResponse>
     */
    public CompletableFuture<CreateStarrocksInstanceResponse> createStarrocksInstanceAsync(
        CreateStarrocksInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createStarrocksInstance);
    }

    /**
     * 创建StarRocks实例
     *
     * 创建StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarrocksInstanceRequest 请求对象
     * @return AsyncInvoker<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse>
     */
    public AsyncInvoker<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse> createStarrocksInstanceAsyncInvoker(
        CreateStarrocksInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.createStarrocksInstance, hcClient);
    }

    /**
     * 停止修改数据同步
     *
     * 停止修改数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseDataBaseConfigRequest 请求对象
     * @return CompletableFuture<DeleteClickHouseDataBaseConfigResponse>
     */
    public CompletableFuture<DeleteClickHouseDataBaseConfigResponse> deleteClickHouseDataBaseConfigAsync(
        DeleteClickHouseDataBaseConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteClickHouseDataBaseConfig);
    }

    /**
     * 停止修改数据同步
     *
     * 停止修改数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseDataBaseConfigRequest 请求对象
     * @return AsyncInvoker<DeleteClickHouseDataBaseConfigRequest, DeleteClickHouseDataBaseConfigResponse>
     */
    public AsyncInvoker<DeleteClickHouseDataBaseConfigRequest, DeleteClickHouseDataBaseConfigResponse> deleteClickHouseDataBaseConfigAsyncInvoker(
        DeleteClickHouseDataBaseConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteClickHouseDataBaseConfig, hcClient);
    }

    /**
     * 删除数据同步
     *
     * 删除数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseDataBaseReplicationRequest 请求对象
     * @return CompletableFuture<DeleteClickHouseDataBaseReplicationResponse>
     */
    public CompletableFuture<DeleteClickHouseDataBaseReplicationResponse> deleteClickHouseDataBaseReplicationAsync(
        DeleteClickHouseDataBaseReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteClickHouseDataBaseReplication);
    }

    /**
     * 删除数据同步
     *
     * 删除数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseDataBaseReplicationRequest 请求对象
     * @return AsyncInvoker<DeleteClickHouseDataBaseReplicationRequest, DeleteClickHouseDataBaseReplicationResponse>
     */
    public AsyncInvoker<DeleteClickHouseDataBaseReplicationRequest, DeleteClickHouseDataBaseReplicationResponse> deleteClickHouseDataBaseReplicationAsyncInvoker(
        DeleteClickHouseDataBaseReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteClickHouseDataBaseReplication, hcClient);
    }

    /**
     * 删除数据库账户
     *
     * 删除数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseDatabaseUserRequest 请求对象
     * @return CompletableFuture<DeleteClickHouseDatabaseUserResponse>
     */
    public CompletableFuture<DeleteClickHouseDatabaseUserResponse> deleteClickHouseDatabaseUserAsync(
        DeleteClickHouseDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteClickHouseDatabaseUser);
    }

    /**
     * 删除数据库账户
     *
     * 删除数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseDatabaseUserRequest 请求对象
     * @return AsyncInvoker<DeleteClickHouseDatabaseUserRequest, DeleteClickHouseDatabaseUserResponse>
     */
    public AsyncInvoker<DeleteClickHouseDatabaseUserRequest, DeleteClickHouseDatabaseUserResponse> deleteClickHouseDatabaseUserAsyncInvoker(
        DeleteClickHouseDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteClickHouseDatabaseUser, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseInstanceRequest 请求对象
     * @return CompletableFuture<DeleteClickHouseInstanceResponse>
     */
    public CompletableFuture<DeleteClickHouseInstanceResponse> deleteClickHouseInstanceAsync(
        DeleteClickHouseInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteClickHouseInstance);
    }

    /**
     * 删除实例
     *
     * 删除实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteClickHouseInstanceRequest, DeleteClickHouseInstanceResponse>
     */
    public AsyncInvoker<DeleteClickHouseInstanceRequest, DeleteClickHouseInstanceResponse> deleteClickHouseInstanceAsyncInvoker(
        DeleteClickHouseInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteClickHouseInstance, hcClient);
    }

    /**
     * 批量解除LTS日志配置
     *
     * 批量解除LTS日志配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseLtsConfigRequest 请求对象
     * @return CompletableFuture<DeleteClickHouseLtsConfigResponse>
     */
    public CompletableFuture<DeleteClickHouseLtsConfigResponse> deleteClickHouseLtsConfigAsync(
        DeleteClickHouseLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteClickHouseLtsConfig);
    }

    /**
     * 批量解除LTS日志配置
     *
     * 批量解除LTS日志配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteClickHouseLtsConfigRequest 请求对象
     * @return AsyncInvoker<DeleteClickHouseLtsConfigRequest, DeleteClickHouseLtsConfigResponse>
     */
    public AsyncInvoker<DeleteClickHouseLtsConfigRequest, DeleteClickHouseLtsConfigResponse> deleteClickHouseLtsConfigAsyncInvoker(
        DeleteClickHouseLtsConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteClickHouseLtsConfig, hcClient);
    }

    /**
     * 删除StarRocks数据同步
     *
     * 删除StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDataReplicationRequest 请求对象
     * @return CompletableFuture<DeleteStarRocksDataReplicationResponse>
     */
    public CompletableFuture<DeleteStarRocksDataReplicationResponse> deleteStarRocksDataReplicationAsync(
        DeleteStarRocksDataReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteStarRocksDataReplication);
    }

    /**
     * 删除StarRocks数据同步
     *
     * 删除StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDataReplicationRequest 请求对象
     * @return AsyncInvoker<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse>
     */
    public AsyncInvoker<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse> deleteStarRocksDataReplicationAsyncInvoker(
        DeleteStarRocksDataReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteStarRocksDataReplication, hcClient);
    }

    /**
     * 删除数据库账户
     *
     * 删除StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDatabaseUserRequest 请求对象
     * @return CompletableFuture<DeleteStarRocksDatabaseUserResponse>
     */
    public CompletableFuture<DeleteStarRocksDatabaseUserResponse> deleteStarRocksDatabaseUserAsync(
        DeleteStarRocksDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteStarRocksDatabaseUser);
    }

    /**
     * 删除数据库账户
     *
     * 删除StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDatabaseUserRequest 请求对象
     * @return AsyncInvoker<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse>
     */
    public AsyncInvoker<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse> deleteStarRocksDatabaseUserAsyncInvoker(
        DeleteStarRocksDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteStarRocksDatabaseUser, hcClient);
    }

    /**
     * 删除StarRocks实例
     *
     * 删除StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarrocksInstanceRequest 请求对象
     * @return CompletableFuture<DeleteStarrocksInstanceResponse>
     */
    public CompletableFuture<DeleteStarrocksInstanceResponse> deleteStarrocksInstanceAsync(
        DeleteStarrocksInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteStarrocksInstance);
    }

    /**
     * 删除StarRocks实例
     *
     * 删除StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarrocksInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse>
     */
    public AsyncInvoker<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse> deleteStarrocksInstanceAsyncInvoker(
        DeleteStarrocksInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteStarrocksInstance, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseRequest 请求对象
     * @return CompletableFuture<ListClickHouseDataBaseResponse>
     */
    public CompletableFuture<ListClickHouseDataBaseResponse> listClickHouseDataBaseAsync(
        ListClickHouseDataBaseRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listClickHouseDataBase);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseRequest 请求对象
     * @return AsyncInvoker<ListClickHouseDataBaseRequest, ListClickHouseDataBaseResponse>
     */
    public AsyncInvoker<ListClickHouseDataBaseRequest, ListClickHouseDataBaseResponse> listClickHouseDataBaseAsyncInvoker(
        ListClickHouseDataBaseRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listClickHouseDataBase, hcClient);
    }

    /**
     * 查询数据同步的库参数配置
     *
     * 查询数据同步的库参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseParameterRequest 请求对象
     * @return CompletableFuture<ListClickHouseDataBaseParameterResponse>
     */
    public CompletableFuture<ListClickHouseDataBaseParameterResponse> listClickHouseDataBaseParameterAsync(
        ListClickHouseDataBaseParameterRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listClickHouseDataBaseParameter);
    }

    /**
     * 查询数据同步的库参数配置
     *
     * 查询数据同步的库参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseParameterRequest 请求对象
     * @return AsyncInvoker<ListClickHouseDataBaseParameterRequest, ListClickHouseDataBaseParameterResponse>
     */
    public AsyncInvoker<ListClickHouseDataBaseParameterRequest, ListClickHouseDataBaseParameterResponse> listClickHouseDataBaseParameterAsyncInvoker(
        ListClickHouseDataBaseParameterRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listClickHouseDataBaseParameter, hcClient);
    }

    /**
     * 查询数据同步信息
     *
     * 查询数据同步信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseReplicationRequest 请求对象
     * @return CompletableFuture<ListClickHouseDataBaseReplicationResponse>
     */
    public CompletableFuture<ListClickHouseDataBaseReplicationResponse> listClickHouseDataBaseReplicationAsync(
        ListClickHouseDataBaseReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listClickHouseDataBaseReplication);
    }

    /**
     * 查询数据同步信息
     *
     * 查询数据同步信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseReplicationRequest 请求对象
     * @return AsyncInvoker<ListClickHouseDataBaseReplicationRequest, ListClickHouseDataBaseReplicationResponse>
     */
    public AsyncInvoker<ListClickHouseDataBaseReplicationRequest, ListClickHouseDataBaseReplicationResponse> listClickHouseDataBaseReplicationAsyncInvoker(
        ListClickHouseDataBaseReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listClickHouseDataBaseReplication, hcClient);
    }

    /**
     * 查看数据同步配置
     *
     * 查看数据同步配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseReplicationConfigRequest 请求对象
     * @return CompletableFuture<ListClickHouseDataBaseReplicationConfigResponse>
     */
    public CompletableFuture<ListClickHouseDataBaseReplicationConfigResponse> listClickHouseDataBaseReplicationConfigAsync(
        ListClickHouseDataBaseReplicationConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listClickHouseDataBaseReplicationConfig);
    }

    /**
     * 查看数据同步配置
     *
     * 查看数据同步配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseDataBaseReplicationConfigRequest 请求对象
     * @return AsyncInvoker<ListClickHouseDataBaseReplicationConfigRequest, ListClickHouseDataBaseReplicationConfigResponse>
     */
    public AsyncInvoker<ListClickHouseDataBaseReplicationConfigRequest, ListClickHouseDataBaseReplicationConfigResponse> listClickHouseDataBaseReplicationConfigAsyncInvoker(
        ListClickHouseDataBaseReplicationConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listClickHouseDataBaseReplicationConfig, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseInstanceRequest 请求对象
     * @return CompletableFuture<ListClickHouseInstanceResponse>
     */
    public CompletableFuture<ListClickHouseInstanceResponse> listClickHouseInstanceAsync(
        ListClickHouseInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listClickHouseInstance);
    }

    /**
     * 查询实例详情
     *
     * 查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseInstanceRequest 请求对象
     * @return AsyncInvoker<ListClickHouseInstanceRequest, ListClickHouseInstanceResponse>
     */
    public AsyncInvoker<ListClickHouseInstanceRequest, ListClickHouseInstanceResponse> listClickHouseInstanceAsyncInvoker(
        ListClickHouseInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listClickHouseInstance, hcClient);
    }

    /**
     * 查询错误日志、慢日志节点信息
     *
     * 查询错误日志、慢日志节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseInstanceNodeRequest 请求对象
     * @return CompletableFuture<ListClickHouseInstanceNodeResponse>
     */
    public CompletableFuture<ListClickHouseInstanceNodeResponse> listClickHouseInstanceNodeAsync(
        ListClickHouseInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listClickHouseInstanceNode);
    }

    /**
     * 查询错误日志、慢日志节点信息
     *
     * 查询错误日志、慢日志节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListClickHouseInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ListClickHouseInstanceNodeRequest, ListClickHouseInstanceNodeResponse>
     */
    public AsyncInvoker<ListClickHouseInstanceNodeRequest, ListClickHouseInstanceNodeResponse> listClickHouseInstanceNodeAsyncInvoker(
        ListClickHouseInstanceNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listClickHouseInstanceNode, hcClient);
    }

    /**
     * HTAP引擎资源查询
     *
     * HTAP引擎资源查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapDataStoreRequest 请求对象
     * @return CompletableFuture<ListHtapDataStoreResponse>
     */
    public CompletableFuture<ListHtapDataStoreResponse> listHtapDataStoreAsync(ListHtapDataStoreRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listHtapDataStore);
    }

    /**
     * HTAP引擎资源查询
     *
     * HTAP引擎资源查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapDataStoreRequest 请求对象
     * @return AsyncInvoker<ListHtapDataStoreRequest, ListHtapDataStoreResponse>
     */
    public AsyncInvoker<ListHtapDataStoreRequest, ListHtapDataStoreResponse> listHtapDataStoreAsyncInvoker(
        ListHtapDataStoreRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listHtapDataStore, hcClient);
    }

    /**
     * HTAP查询规格信息
     *
     * HTAP查询规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapFlavorRequest 请求对象
     * @return CompletableFuture<ListHtapFlavorResponse>
     */
    public CompletableFuture<ListHtapFlavorResponse> listHtapFlavorAsync(ListHtapFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listHtapFlavor);
    }

    /**
     * HTAP查询规格信息
     *
     * HTAP查询规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapFlavorRequest 请求对象
     * @return AsyncInvoker<ListHtapFlavorRequest, ListHtapFlavorResponse>
     */
    public AsyncInvoker<ListHtapFlavorRequest, ListHtapFlavorResponse> listHtapFlavorAsyncInvoker(
        ListHtapFlavorRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listHtapFlavor, hcClient);
    }

    /**
     * 查询HTAP实例列表
     *
     * 查询HTAP实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapInstanceInfoRequest 请求对象
     * @return CompletableFuture<ListHtapInstanceInfoResponse>
     */
    public CompletableFuture<ListHtapInstanceInfoResponse> listHtapInstanceInfoAsync(
        ListHtapInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listHtapInstanceInfo);
    }

    /**
     * 查询HTAP实例列表
     *
     * 查询HTAP实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse>
     */
    public AsyncInvoker<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse> listHtapInstanceInfoAsyncInvoker(
        ListHtapInstanceInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listHtapInstanceInfo, hcClient);
    }

    /**
     * 获取HTAP实例存储类型
     *
     * 获取HTAP实例存储类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapStorageTypeRequest 请求对象
     * @return CompletableFuture<ListHtapStorageTypeResponse>
     */
    public CompletableFuture<ListHtapStorageTypeResponse> listHtapStorageTypeAsync(ListHtapStorageTypeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listHtapStorageType);
    }

    /**
     * 获取HTAP实例存储类型
     *
     * 获取HTAP实例存储类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapStorageTypeRequest 请求对象
     * @return AsyncInvoker<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse>
     */
    public AsyncInvoker<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse> listHtapStorageTypeAsyncInvoker(
        ListHtapStorageTypeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listHtapStorageType, hcClient);
    }

    /**
     * 查询StarRocks数据库
     *
     * 查询StarRocks数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataBasesRequest 请求对象
     * @return CompletableFuture<ListStarRocksDataBasesResponse>
     */
    public CompletableFuture<ListStarRocksDataBasesResponse> listStarRocksDataBasesAsync(
        ListStarRocksDataBasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listStarRocksDataBases);
    }

    /**
     * 查询StarRocks数据库
     *
     * 查询StarRocks数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataBasesRequest 请求对象
     * @return AsyncInvoker<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse>
     */
    public AsyncInvoker<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse> listStarRocksDataBasesAsyncInvoker(
        ListStarRocksDataBasesRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listStarRocksDataBases, hcClient);
    }

    /**
     * 查询StarRocks数据同步配置信息
     *
     * 查询StarRocks数据同步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationConfigRequest 请求对象
     * @return CompletableFuture<ListStarRocksDataReplicationConfigResponse>
     */
    public CompletableFuture<ListStarRocksDataReplicationConfigResponse> listStarRocksDataReplicationConfigAsync(
        ListStarRocksDataReplicationConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listStarRocksDataReplicationConfig);
    }

    /**
     * 查询StarRocks数据同步配置信息
     *
     * 查询StarRocks数据同步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationConfigRequest 请求对象
     * @return AsyncInvoker<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse>
     */
    public AsyncInvoker<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse> listStarRocksDataReplicationConfigAsyncInvoker(
        ListStarRocksDataReplicationConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listStarRocksDataReplicationConfig, hcClient);
    }

    /**
     * 查询StarRocks数据同步状态信息
     *
     * 查询StarRocks数据同步状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationsRequest 请求对象
     * @return CompletableFuture<ListStarRocksDataReplicationsResponse>
     */
    public CompletableFuture<ListStarRocksDataReplicationsResponse> listStarRocksDataReplicationsAsync(
        ListStarRocksDataReplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listStarRocksDataReplications);
    }

    /**
     * 查询StarRocks数据同步状态信息
     *
     * 查询StarRocks数据同步状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationsRequest 请求对象
     * @return AsyncInvoker<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse>
     */
    public AsyncInvoker<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse> listStarRocksDataReplicationsAsyncInvoker(
        ListStarRocksDataReplicationsRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listStarRocksDataReplications, hcClient);
    }

    /**
     * 查询StarRocks数据同步的库参数配置
     *
     * 查询StarRocks数据同步的库参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDbParametersRequest 请求对象
     * @return CompletableFuture<ListStarRocksDbParametersResponse>
     */
    public CompletableFuture<ListStarRocksDbParametersResponse> listStarRocksDbParametersAsync(
        ListStarRocksDbParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listStarRocksDbParameters);
    }

    /**
     * 查询StarRocks数据同步的库参数配置
     *
     * 查询StarRocks数据同步的库参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDbParametersRequest 请求对象
     * @return AsyncInvoker<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse>
     */
    public AsyncInvoker<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse> listStarRocksDbParametersAsyncInvoker(
        ListStarRocksDbParametersRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listStarRocksDbParameters, hcClient);
    }

    /**
     * 查询StarRocks实例
     *
     * 查询StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarrocksInstanceInfoRequest 请求对象
     * @return CompletableFuture<ListStarrocksInstanceInfoResponse>
     */
    public CompletableFuture<ListStarrocksInstanceInfoResponse> listStarrocksInstanceInfoAsync(
        ListStarrocksInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listStarrocksInstanceInfo);
    }

    /**
     * 查询StarRocks实例
     *
     * 查询StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarrocksInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse>
     */
    public AsyncInvoker<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse> listStarrocksInstanceInfoAsyncInvoker(
        ListStarrocksInstanceInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.listStarrocksInstanceInfo, hcClient);
    }

    /**
     * 暂停StarRocks数据同步
     *
     * 暂停StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseStarRocksDataReplicationRequest 请求对象
     * @return CompletableFuture<PauseStarRocksDataReplicationResponse>
     */
    public CompletableFuture<PauseStarRocksDataReplicationResponse> pauseStarRocksDataReplicationAsync(
        PauseStarRocksDataReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.pauseStarRocksDataReplication);
    }

    /**
     * 暂停StarRocks数据同步
     *
     * 暂停StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request PauseStarRocksDataReplicationRequest 请求对象
     * @return AsyncInvoker<PauseStarRocksDataReplicationRequest, PauseStarRocksDataReplicationResponse>
     */
    public AsyncInvoker<PauseStarRocksDataReplicationRequest, PauseStarRocksDataReplicationResponse> pauseStarRocksDataReplicationAsyncInvoker(
        PauseStarRocksDataReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.pauseStarRocksDataReplication, hcClient);
    }

    /**
     * 重启实例
     *
     * 重启实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootClickHouseInstanceRequest 请求对象
     * @return CompletableFuture<RebootClickHouseInstanceResponse>
     */
    public CompletableFuture<RebootClickHouseInstanceResponse> rebootClickHouseInstanceAsync(
        RebootClickHouseInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.rebootClickHouseInstance);
    }

    /**
     * 重启实例
     *
     * 重启实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebootClickHouseInstanceRequest 请求对象
     * @return AsyncInvoker<RebootClickHouseInstanceRequest, RebootClickHouseInstanceResponse>
     */
    public AsyncInvoker<RebootClickHouseInstanceRequest, RebootClickHouseInstanceResponse> rebootClickHouseInstanceAsyncInvoker(
        RebootClickHouseInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.rebootClickHouseInstance, hcClient);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClickHouseFlavorRequest 请求对象
     * @return CompletableFuture<ResizeClickHouseFlavorResponse>
     */
    public CompletableFuture<ResizeClickHouseFlavorResponse> resizeClickHouseFlavorAsync(
        ResizeClickHouseFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resizeClickHouseFlavor);
    }

    /**
     * 实例规格变更
     *
     * 实例规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClickHouseFlavorRequest 请求对象
     * @return AsyncInvoker<ResizeClickHouseFlavorRequest, ResizeClickHouseFlavorResponse>
     */
    public AsyncInvoker<ResizeClickHouseFlavorRequest, ResizeClickHouseFlavorResponse> resizeClickHouseFlavorAsyncInvoker(
        ResizeClickHouseFlavorRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.resizeClickHouseFlavor, hcClient);
    }

    /**
     * 实例磁盘扩容
     *
     * 实例磁盘扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClickHouseInstanceRequest 请求对象
     * @return CompletableFuture<ResizeClickHouseInstanceResponse>
     */
    public CompletableFuture<ResizeClickHouseInstanceResponse> resizeClickHouseInstanceAsync(
        ResizeClickHouseInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resizeClickHouseInstance);
    }

    /**
     * 实例磁盘扩容
     *
     * 实例磁盘扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeClickHouseInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeClickHouseInstanceRequest, ResizeClickHouseInstanceResponse>
     */
    public AsyncInvoker<ResizeClickHouseInstanceRequest, ResizeClickHouseInstanceResponse> resizeClickHouseInstanceAsyncInvoker(
        ResizeClickHouseInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.resizeClickHouseInstance, hcClient);
    }

    /**
     * 重启StarRocks实例
     *
     * 重启StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksInstanceRequest 请求对象
     * @return CompletableFuture<RestartStarrocksInstanceResponse>
     */
    public CompletableFuture<RestartStarrocksInstanceResponse> restartStarrocksInstanceAsync(
        RestartStarrocksInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartStarrocksInstance);
    }

    /**
     * 重启StarRocks实例
     *
     * 重启StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksInstanceRequest 请求对象
     * @return AsyncInvoker<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse>
     */
    public AsyncInvoker<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse> restartStarrocksInstanceAsyncInvoker(
        RestartStarrocksInstanceRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.restartStarrocksInstance, hcClient);
    }

    /**
     * 重启StarRocks节点
     *
     * 重启StarRocks节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksNodeRequest 请求对象
     * @return CompletableFuture<RestartStarrocksNodeResponse>
     */
    public CompletableFuture<RestartStarrocksNodeResponse> restartStarrocksNodeAsync(
        RestartStarrocksNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.restartStarrocksNode);
    }

    /**
     * 重启StarRocks节点
     *
     * 重启StarRocks节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksNodeRequest 请求对象
     * @return AsyncInvoker<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse>
     */
    public AsyncInvoker<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse> restartStarrocksNodeAsyncInvoker(
        RestartStarrocksNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.restartStarrocksNode, hcClient);
    }

    /**
     * 恢复StarRocks数据同步
     *
     * 恢复StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeStarRocksDataReplicationRequest 请求对象
     * @return CompletableFuture<ResumeStarRocksDataReplicationResponse>
     */
    public CompletableFuture<ResumeStarRocksDataReplicationResponse> resumeStarRocksDataReplicationAsync(
        ResumeStarRocksDataReplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resumeStarRocksDataReplication);
    }

    /**
     * 恢复StarRocks数据同步
     *
     * 恢复StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumeStarRocksDataReplicationRequest 请求对象
     * @return AsyncInvoker<ResumeStarRocksDataReplicationRequest, ResumeStarRocksDataReplicationResponse>
     */
    public AsyncInvoker<ResumeStarRocksDataReplicationRequest, ResumeStarRocksDataReplicationResponse> resumeStarRocksDataReplicationAsyncInvoker(
        ResumeStarRocksDataReplicationRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.resumeStarRocksDataReplication, hcClient);
    }

    /**
     * 查询数据库账户
     *
     * 查询数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseDatabaseUserRequest 请求对象
     * @return CompletableFuture<ShowClickHouseDatabaseUserResponse>
     */
    public CompletableFuture<ShowClickHouseDatabaseUserResponse> showClickHouseDatabaseUserAsync(
        ShowClickHouseDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showClickHouseDatabaseUser);
    }

    /**
     * 查询数据库账户
     *
     * 查询数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseDatabaseUserRequest 请求对象
     * @return AsyncInvoker<ShowClickHouseDatabaseUserRequest, ShowClickHouseDatabaseUserResponse>
     */
    public AsyncInvoker<ShowClickHouseDatabaseUserRequest, ShowClickHouseDatabaseUserResponse> showClickHouseDatabaseUserAsyncInvoker(
        ShowClickHouseDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showClickHouseDatabaseUser, hcClient);
    }

    /**
     * 查询实例LTS日志配置列表
     *
     * 查询实例LTS日志配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseLtsConfigRequest 请求对象
     * @return CompletableFuture<ShowClickHouseLtsConfigResponse>
     */
    public CompletableFuture<ShowClickHouseLtsConfigResponse> showClickHouseLtsConfigAsync(
        ShowClickHouseLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showClickHouseLtsConfig);
    }

    /**
     * 查询实例LTS日志配置列表
     *
     * 查询实例LTS日志配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseLtsConfigRequest 请求对象
     * @return AsyncInvoker<ShowClickHouseLtsConfigRequest, ShowClickHouseLtsConfigResponse>
     */
    public AsyncInvoker<ShowClickHouseLtsConfigRequest, ShowClickHouseLtsConfigResponse> showClickHouseLtsConfigAsyncInvoker(
        ShowClickHouseLtsConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showClickHouseLtsConfig, hcClient);
    }

    /**
     * 查询慢日志
     *
     * 获取内核慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseSlowLogDetailRequest 请求对象
     * @return CompletableFuture<ShowClickHouseSlowLogDetailResponse>
     */
    public CompletableFuture<ShowClickHouseSlowLogDetailResponse> showClickHouseSlowLogDetailAsync(
        ShowClickHouseSlowLogDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showClickHouseSlowLogDetail);
    }

    /**
     * 查询慢日志
     *
     * 获取内核慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseSlowLogDetailRequest 请求对象
     * @return AsyncInvoker<ShowClickHouseSlowLogDetailRequest, ShowClickHouseSlowLogDetailResponse>
     */
    public AsyncInvoker<ShowClickHouseSlowLogDetailRequest, ShowClickHouseSlowLogDetailResponse> showClickHouseSlowLogDetailAsyncInvoker(
        ShowClickHouseSlowLogDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showClickHouseSlowLogDetail, hcClient);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseSlowLogSensitiveStatusRequest 请求对象
     * @return CompletableFuture<ShowClickHouseSlowLogSensitiveStatusResponse>
     */
    public CompletableFuture<ShowClickHouseSlowLogSensitiveStatusResponse> showClickHouseSlowLogSensitiveStatusAsync(
        ShowClickHouseSlowLogSensitiveStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showClickHouseSlowLogSensitiveStatus);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClickHouseSlowLogSensitiveStatusRequest 请求对象
     * @return AsyncInvoker<ShowClickHouseSlowLogSensitiveStatusRequest, ShowClickHouseSlowLogSensitiveStatusResponse>
     */
    public AsyncInvoker<ShowClickHouseSlowLogSensitiveStatusRequest, ShowClickHouseSlowLogSensitiveStatusResponse> showClickHouseSlowLogSensitiveStatusAsyncInvoker(
        ShowClickHouseSlowLogSensitiveStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showClickHouseSlowLogSensitiveStatus, hcClient);
    }

    /**
     * 查询数据库账户
     *
     * 查询StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStarRocksDatabaseUserRequest 请求对象
     * @return CompletableFuture<ShowStarRocksDatabaseUserResponse>
     */
    public CompletableFuture<ShowStarRocksDatabaseUserResponse> showStarRocksDatabaseUserAsync(
        ShowStarRocksDatabaseUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showStarRocksDatabaseUser);
    }

    /**
     * 查询数据库账户
     *
     * 查询StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStarRocksDatabaseUserRequest 请求对象
     * @return AsyncInvoker<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse>
     */
    public AsyncInvoker<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse> showStarRocksDatabaseUserAsyncInvoker(
        ShowStarRocksDatabaseUserRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showStarRocksDatabaseUser, hcClient);
    }

    /**
     * 修改数据同步
     *
     * 修改数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseDataBaseConfigRequest 请求对象
     * @return CompletableFuture<UpdateClickHouseDataBaseConfigResponse>
     */
    public CompletableFuture<UpdateClickHouseDataBaseConfigResponse> updateClickHouseDataBaseConfigAsync(
        UpdateClickHouseDataBaseConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateClickHouseDataBaseConfig);
    }

    /**
     * 修改数据同步
     *
     * 修改数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseDataBaseConfigRequest 请求对象
     * @return AsyncInvoker<UpdateClickHouseDataBaseConfigRequest, UpdateClickHouseDataBaseConfigResponse>
     */
    public AsyncInvoker<UpdateClickHouseDataBaseConfigRequest, UpdateClickHouseDataBaseConfigResponse> updateClickHouseDataBaseConfigAsyncInvoker(
        UpdateClickHouseDataBaseConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateClickHouseDataBaseConfig, hcClient);
    }

    /**
     * 修改数据库账号密码
     *
     * 修改数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseDatabaseUserPasswordRequest 请求对象
     * @return CompletableFuture<UpdateClickHouseDatabaseUserPasswordResponse>
     */
    public CompletableFuture<UpdateClickHouseDatabaseUserPasswordResponse> updateClickHouseDatabaseUserPasswordAsync(
        UpdateClickHouseDatabaseUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateClickHouseDatabaseUserPassword);
    }

    /**
     * 修改数据库账号密码
     *
     * 修改数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseDatabaseUserPasswordRequest 请求对象
     * @return AsyncInvoker<UpdateClickHouseDatabaseUserPasswordRequest, UpdateClickHouseDatabaseUserPasswordResponse>
     */
    public AsyncInvoker<UpdateClickHouseDatabaseUserPasswordRequest, UpdateClickHouseDatabaseUserPasswordResponse> updateClickHouseDatabaseUserPasswordAsyncInvoker(
        UpdateClickHouseDatabaseUserPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateClickHouseDatabaseUserPassword, hcClient);
    }

    /**
     * 修改数据库账号权限
     *
     * 修改数据库账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseDatabaseUserPermissionRequest 请求对象
     * @return CompletableFuture<UpdateClickHouseDatabaseUserPermissionResponse>
     */
    public CompletableFuture<UpdateClickHouseDatabaseUserPermissionResponse> updateClickHouseDatabaseUserPermissionAsync(
        UpdateClickHouseDatabaseUserPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateClickHouseDatabaseUserPermission);
    }

    /**
     * 修改数据库账号权限
     *
     * 修改数据库账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseDatabaseUserPermissionRequest 请求对象
     * @return AsyncInvoker<UpdateClickHouseDatabaseUserPermissionRequest, UpdateClickHouseDatabaseUserPermissionResponse>
     */
    public AsyncInvoker<UpdateClickHouseDatabaseUserPermissionRequest, UpdateClickHouseDatabaseUserPermissionResponse> updateClickHouseDatabaseUserPermissionAsyncInvoker(
        UpdateClickHouseDatabaseUserPermissionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateClickHouseDatabaseUserPermission, hcClient);
    }

    /**
     * 批量创建LTS日志配置
     *
     * 批量创建LTS日志配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseLtsConfigRequest 请求对象
     * @return CompletableFuture<UpdateClickHouseLtsConfigResponse>
     */
    public CompletableFuture<UpdateClickHouseLtsConfigResponse> updateClickHouseLtsConfigAsync(
        UpdateClickHouseLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateClickHouseLtsConfig);
    }

    /**
     * 批量创建LTS日志配置
     *
     * 批量创建LTS日志配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseLtsConfigRequest 请求对象
     * @return AsyncInvoker<UpdateClickHouseLtsConfigRequest, UpdateClickHouseLtsConfigResponse>
     */
    public AsyncInvoker<UpdateClickHouseLtsConfigRequest, UpdateClickHouseLtsConfigResponse> updateClickHouseLtsConfigAsyncInvoker(
        UpdateClickHouseLtsConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateClickHouseLtsConfig, hcClient);
    }

    /**
     * 修改慢日志脱敏状态
     *
     * 修改慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseSlowLogSensitiveStatusRequest 请求对象
     * @return CompletableFuture<UpdateClickHouseSlowLogSensitiveStatusResponse>
     */
    public CompletableFuture<UpdateClickHouseSlowLogSensitiveStatusResponse> updateClickHouseSlowLogSensitiveStatusAsync(
        UpdateClickHouseSlowLogSensitiveStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateClickHouseSlowLogSensitiveStatus);
    }

    /**
     * 修改慢日志脱敏状态
     *
     * 修改慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateClickHouseSlowLogSensitiveStatusRequest 请求对象
     * @return AsyncInvoker<UpdateClickHouseSlowLogSensitiveStatusRequest, UpdateClickHouseSlowLogSensitiveStatusResponse>
     */
    public AsyncInvoker<UpdateClickHouseSlowLogSensitiveStatusRequest, UpdateClickHouseSlowLogSensitiveStatusResponse> updateClickHouseSlowLogSensitiveStatusAsyncInvoker(
        UpdateClickHouseSlowLogSensitiveStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateClickHouseSlowLogSensitiveStatus, hcClient);
    }

    /**
     * 修改数据库账号密码
     *
     * 修改StarRocks数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPasswordRequest 请求对象
     * @return CompletableFuture<UpdateStarRocksDatabaseUserPasswordResponse>
     */
    public CompletableFuture<UpdateStarRocksDatabaseUserPasswordResponse> updateStarRocksDatabaseUserPasswordAsync(
        UpdateStarRocksDatabaseUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateStarRocksDatabaseUserPassword);
    }

    /**
     * 修改数据库账号密码
     *
     * 修改StarRocks数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPasswordRequest 请求对象
     * @return AsyncInvoker<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse>
     */
    public AsyncInvoker<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse> updateStarRocksDatabaseUserPasswordAsyncInvoker(
        UpdateStarRocksDatabaseUserPasswordRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateStarRocksDatabaseUserPassword, hcClient);
    }

    /**
     * 修改数据库账号权限
     *
     * 修改StarRocks数据库账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPermissionRequest 请求对象
     * @return CompletableFuture<UpdateStarRocksDatabaseUserPermissionResponse>
     */
    public CompletableFuture<UpdateStarRocksDatabaseUserPermissionResponse> updateStarRocksDatabaseUserPermissionAsync(
        UpdateStarRocksDatabaseUserPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateStarRocksDatabaseUserPermission);
    }

    /**
     * 修改数据库账号权限
     *
     * 修改StarRocks数据库账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPermissionRequest 请求对象
     * @return AsyncInvoker<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse>
     */
    public AsyncInvoker<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse> updateStarRocksDatabaseUserPermissionAsyncInvoker(
        UpdateStarRocksDatabaseUserPermissionRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateStarRocksDatabaseUserPermission, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlFilterRuleRequest 请求对象
     * @return CompletableFuture<DeleteSqlFilterRuleResponse>
     */
    public CompletableFuture<DeleteSqlFilterRuleResponse> deleteSqlFilterRuleAsync(DeleteSqlFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteSqlFilterRule);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlFilterRuleRequest 请求对象
     * @return AsyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse>
     */
    public AsyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRuleAsyncInvoker(
        DeleteSqlFilterRuleRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.deleteSqlFilterRule, hcClient);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlFilterRuleRequest 请求对象
     * @return CompletableFuture<SetSqlFilterRuleResponse>
     */
    public CompletableFuture<SetSqlFilterRuleResponse> setSqlFilterRuleAsync(SetSqlFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setSqlFilterRule);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlFilterRuleRequest 请求对象
     * @return AsyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse>
     */
    public AsyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRuleAsyncInvoker(
        SetSqlFilterRuleRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.setSqlFilterRule, hcClient);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterControlRequest 请求对象
     * @return CompletableFuture<ShowSqlFilterControlResponse>
     */
    public CompletableFuture<ShowSqlFilterControlResponse> showSqlFilterControlAsync(
        ShowSqlFilterControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showSqlFilterControl);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterControlRequest 请求对象
     * @return AsyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse>
     */
    public AsyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControlAsyncInvoker(
        ShowSqlFilterControlRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showSqlFilterControl, hcClient);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterRuleRequest 请求对象
     * @return CompletableFuture<ShowSqlFilterRuleResponse>
     */
    public CompletableFuture<ShowSqlFilterRuleResponse> showSqlFilterRuleAsync(ShowSqlFilterRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showSqlFilterRule);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterRuleRequest 请求对象
     * @return AsyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse>
     */
    public AsyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRuleAsyncInvoker(
        ShowSqlFilterRuleRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.showSqlFilterRule, hcClient);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlFilterControlRequest 请求对象
     * @return CompletableFuture<UpdateSqlFilterControlResponse>
     */
    public CompletableFuture<UpdateSqlFilterControlResponse> updateSqlFilterControlAsync(
        UpdateSqlFilterControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateSqlFilterControl);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlFilterControlRequest 请求对象
     * @return AsyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse>
     */
    public AsyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControlAsyncInvoker(
        UpdateSqlFilterControlRequest request) {
        return new AsyncInvoker<>(request, GaussDBMeta.updateSqlFilterControl, hcClient);
    }

}

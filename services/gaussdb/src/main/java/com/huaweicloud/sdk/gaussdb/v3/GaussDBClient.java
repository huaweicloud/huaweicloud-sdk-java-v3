package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarrocksInstanceResponse;
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
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListProjectTagsResponse;
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
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowAutoScalingPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowBackupRestoreTimeResponse;
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
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowInstanceMonitorExtendResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisInstanceInfosPerMetricRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowIntelligentDiagnosisInstanceInfosPerMetricResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyIpgroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyIpgroupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowProxyVersionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ShowRestoreTablesResponse;
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

public class GaussDBClient {

    protected HcClient hcClient;

    public GaussDBClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBClient> newBuilder() {
        ClientBuilder<GaussDBClient> clientBuilder = new ClientBuilder<>(GaussDBClient::new);
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
     * @return AddDatabasePermissionResponse
     */
    public AddDatabasePermissionResponse addDatabasePermission(AddDatabasePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.addDatabasePermission);
    }

    /**
     * 授予数据库用户数据库权限
     *
     * 授予云数据库 GaussDB(for MySQL)实例数据库用户数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddDatabasePermissionRequest 请求对象
     * @return SyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse>
     */
    public SyncInvoker<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermissionInvoker(
        AddDatabasePermissionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.addDatabasePermission, hcClient);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.batchTagAction);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(
        BatchTagActionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.batchTagAction, hcClient);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelGaussMySqlInstanceEipRequest 请求对象
     * @return CancelGaussMySqlInstanceEipResponse
     */
    public CancelGaussMySqlInstanceEipResponse cancelGaussMySqlInstanceEip(CancelGaussMySqlInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.cancelGaussMySqlInstanceEip);
    }

    /**
     * 解绑弹性公网IP
     *
     * 实例解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelGaussMySqlInstanceEipRequest 请求对象
     * @return SyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse>
     */
    public SyncInvoker<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEipInvoker(
        CancelGaussMySqlInstanceEipRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.cancelGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScheduleTaskRequest 请求对象
     * @return CancelScheduleTaskResponse
     */
    public CancelScheduleTaskResponse cancelScheduleTask(CancelScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.cancelScheduleTask);
    }

    /**
     * 取消定时任务
     *
     * 取消定时任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelScheduleTaskRequest 请求对象
     * @return SyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse>
     */
    public SyncInvoker<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTaskInvoker(
        CancelScheduleTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.cancelScheduleTask, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return ChangeGaussMySqlInstanceSpecificationResponse
     */
    public ChangeGaussMySqlInstanceSpecificationResponse changeGaussMySqlInstanceSpecification(
        ChangeGaussMySqlInstanceSpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.changeGaussMySqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public SyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationInvoker(
        ChangeGaussMySqlInstanceSpecificationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.changeGaussMySqlInstanceSpecification, hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return ChangeGaussMySqlProxySpecificationResponse
     */
    public ChangeGaussMySqlProxySpecificationResponse changeGaussMySqlProxySpecification(
        ChangeGaussMySqlProxySpecificationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.changeGaussMySqlProxySpecification);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理规格变更。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeGaussMySqlProxySpecificationRequest 请求对象
     * @return SyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse>
     */
    public SyncInvoker<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecificationInvoker(
        ChangeGaussMySqlProxySpecificationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.changeGaussMySqlProxySpecification, hcClient);
    }

    /**
     * 资源预校验
     *
     * 资源预校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckResourceRequest 请求对象
     * @return CheckResourceResponse
     */
    public CheckResourceResponse checkResource(CheckResourceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.checkResource);
    }

    /**
     * 资源预校验
     *
     * 资源预校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckResourceRequest 请求对象
     * @return SyncInvoker<CheckResourceRequest, CheckResourceResponse>
     */
    public SyncInvoker<CheckResourceRequest, CheckResourceResponse> checkResourceInvoker(CheckResourceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.checkResource, hcClient);
    }

    /**
     * 复制参数组
     *
     * 复制参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationsRequest 请求对象
     * @return CopyConfigurationsResponse
     */
    public CopyConfigurationsResponse copyConfigurations(CopyConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.copyConfigurations);
    }

    /**
     * 复制参数组
     *
     * 复制参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationsRequest 请求对象
     * @return SyncInvoker<CopyConfigurationsRequest, CopyConfigurationsResponse>
     */
    public SyncInvoker<CopyConfigurationsRequest, CopyConfigurationsResponse> copyConfigurationsInvoker(
        CopyConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.copyConfigurations, hcClient);
    }

    /**
     * 复制实例参数组
     *
     * 复制实例参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyInstanceConfigurationsRequest 请求对象
     * @return CopyInstanceConfigurationsResponse
     */
    public CopyInstanceConfigurationsResponse copyInstanceConfigurations(CopyInstanceConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.copyInstanceConfigurations);
    }

    /**
     * 复制实例参数组
     *
     * 复制实例参数组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyInstanceConfigurationsRequest 请求对象
     * @return SyncInvoker<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse>
     */
    public SyncInvoker<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> copyInstanceConfigurationsInvoker(
        CopyInstanceConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.copyInstanceConfigurations, hcClient);
    }

    /**
     * 设置访问控制规则
     *
     * 设置访问控制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessControlRequest 请求对象
     * @return CreateAccessControlResponse
     */
    public CreateAccessControlResponse createAccessControl(CreateAccessControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createAccessControl);
    }

    /**
     * 设置访问控制规则
     *
     * 设置访问控制规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessControlRequest 请求对象
     * @return SyncInvoker<CreateAccessControlRequest, CreateAccessControlResponse>
     */
    public SyncInvoker<CreateAccessControlRequest, CreateAccessControlResponse> createAccessControlInvoker(
        CreateAccessControlRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createAccessControl, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlBackupRequest 请求对象
     * @return CreateGaussMySqlBackupResponse
     */
    public CreateGaussMySqlBackupResponse createGaussMySqlBackup(CreateGaussMySqlBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlBackupRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>
     */
    public SyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackupInvoker(
        CreateGaussMySqlBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlBackup, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlConfigurationRequest 请求对象
     * @return CreateGaussMySqlConfigurationResponse
     */
    public CreateGaussMySqlConfigurationResponse createGaussMySqlConfiguration(
        CreateGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板信息，包含参数模板名称、描述、数据库版本信息、参数值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfigurationInvoker(
        CreateGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlConfiguration, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseRequest 请求对象
     * @return CreateGaussMySqlDatabaseResponse
     */
    public CreateGaussMySqlDatabaseResponse createGaussMySqlDatabase(CreateGaussMySqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse>
     */
    public SyncInvoker<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabaseInvoker(
        CreateGaussMySqlDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return CreateGaussMySqlDatabaseUserResponse
     */
    public CreateGaussMySqlDatabaseUserResponse createGaussMySqlDatabaseUser(
        CreateGaussMySqlDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlDatabaseUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建云数据库GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlDatabaseUserRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse>
     */
    public SyncInvoker<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUserInvoker(
        CreateGaussMySqlDatabaseUserRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlInstanceRequest 请求对象
     * @return CreateGaussMySqlInstanceResponse
     */
    public CreateGaussMySqlInstanceResponse createGaussMySqlInstance(CreateGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库GaussDB(for MySQL)实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>
     */
    public SyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceInvoker(
        CreateGaussMySqlInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlProxyRequest 请求对象
     * @return CreateGaussMySqlProxyResponse
     */
    public CreateGaussMySqlProxyResponse createGaussMySqlProxy(CreateGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlProxy);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>
     */
    public SyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxyInvoker(
        CreateGaussMySqlProxyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return CreateGaussMySqlReadonlyNodeResponse
     */
    public CreateGaussMySqlReadonlyNodeResponse createGaussMySqlReadonlyNode(
        CreateGaussMySqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMySqlReadonlyNode);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>
     */
    public SyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeInvoker(
        CreateGaussMySqlReadonlyNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 申请内网域名
     *
     * 申请内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMysqlDnsRequest 请求对象
     * @return CreateGaussMysqlDnsResponse
     */
    public CreateGaussMysqlDnsResponse createGaussMysqlDns(CreateGaussMysqlDnsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createGaussMysqlDns);
    }

    /**
     * 申请内网域名
     *
     * 申请内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussMysqlDnsRequest 请求对象
     * @return SyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse>
     */
    public SyncInvoker<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> createGaussMysqlDnsInvoker(
        CreateGaussMysqlDnsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createGaussMysqlDns, hcClient);
    }

    /**
     * 表级时间点恢复
     *
     * 表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreTablesRequest 请求对象
     * @return CreateRestoreTablesResponse
     */
    public CreateRestoreTablesResponse createRestoreTables(CreateRestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createRestoreTables);
    }

    /**
     * 表级时间点恢复
     *
     * 表级时间点恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreTablesRequest 请求对象
     * @return SyncInvoker<CreateRestoreTablesRequest, CreateRestoreTablesResponse>
     */
    public SyncInvoker<CreateRestoreTablesRequest, CreateRestoreTablesResponse> createRestoreTablesInvoker(
        CreateRestoreTablesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createRestoreTables, hcClient);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabasePermissionRequest 请求对象
     * @return DeleteDatabasePermissionResponse
     */
    public DeleteDatabasePermissionResponse deleteDatabasePermission(DeleteDatabasePermissionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteDatabasePermission);
    }

    /**
     * 删除数据库用户的数据库权限
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户的数据库权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabasePermissionRequest 请求对象
     * @return SyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse>
     */
    public SyncInvoker<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermissionInvoker(
        DeleteDatabasePermissionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteDatabasePermission, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlBackupRequest 请求对象
     * @return DeleteGaussMySqlBackupResponse
     */
    public DeleteGaussMySqlBackupResponse deleteGaussMySqlBackup(DeleteGaussMySqlBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlBackupRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse>
     */
    public SyncInvoker<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackupInvoker(
        DeleteGaussMySqlBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlBackup, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlConfigurationRequest 请求对象
     * @return DeleteGaussMySqlConfigurationResponse
     */
    public DeleteGaussMySqlConfigurationResponse deleteGaussMySqlConfiguration(
        DeleteGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfigurationInvoker(
        DeleteGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseRequest 请求对象
     * @return DeleteGaussMySqlDatabaseResponse
     */
    public DeleteGaussMySqlDatabaseResponse deleteGaussMySqlDatabase(DeleteGaussMySqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse>
     */
    public SyncInvoker<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabaseInvoker(
        DeleteGaussMySqlDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return DeleteGaussMySqlDatabaseUserResponse
     */
    public DeleteGaussMySqlDatabaseUserResponse deleteGaussMySqlDatabaseUser(
        DeleteGaussMySqlDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlDatabaseUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlDatabaseUserRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse>
     */
    public SyncInvoker<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUserInvoker(
        DeleteGaussMySqlDatabaseUserRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 删除/退订数据库实例
     *
     * 删除/退订数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlInstanceRequest 请求对象
     * @return DeleteGaussMySqlInstanceResponse
     */
    public DeleteGaussMySqlInstanceResponse deleteGaussMySqlInstance(DeleteGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlInstance);
    }

    /**
     * 删除/退订数据库实例
     *
     * 删除/退订数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>
     */
    public SyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceInvoker(
        DeleteGaussMySqlInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlProxyRequest 请求对象
     * @return DeleteGaussMySqlProxyResponse
     */
    public DeleteGaussMySqlProxyResponse deleteGaussMySqlProxy(DeleteGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlProxyRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>
     */
    public SyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyInvoker(
        DeleteGaussMySqlProxyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlProxy, hcClient);
    }

    /**
     * 删除/退订只读节点
     *
     * 删除/退订实例的只读节点。多可用区模式删除/退订只读节点时，要保证删除/退订后，剩余的只读节点和主节点在不同的可用区中，否则无法删除/退订该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return DeleteGaussMySqlReadonlyNodeResponse
     */
    public DeleteGaussMySqlReadonlyNodeResponse deleteGaussMySqlReadonlyNode(
        DeleteGaussMySqlReadonlyNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlReadonlyNode);
    }

    /**
     * 删除/退订只读节点
     *
     * 删除/退订实例的只读节点。多可用区模式删除/退订只读节点时，要保证删除/退订后，剩余的只读节点和主节点在不同的可用区中，否则无法删除/退订该只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>
     */
    public SyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeInvoker(
        DeleteGaussMySqlReadonlyNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTasKRequest 请求对象
     * @return DeleteScheduleTasKResponse
     */
    public DeleteScheduleTasKResponse deleteScheduleTasK(DeleteScheduleTasKRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteScheduleTasK);
    }

    /**
     * 删除定时任务
     *
     * 删除定时任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTasKRequest 请求对象
     * @return SyncInvoker<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse>
     */
    public SyncInvoker<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> deleteScheduleTasKInvoker(
        DeleteScheduleTasKRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteScheduleTasK, hcClient);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRecordRequest 请求对象
     * @return DeleteTaskRecordResponse
     */
    public DeleteTaskRecordResponse deleteTaskRecord(DeleteTaskRecordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteTaskRecord);
    }

    /**
     * 删除指定任务记录
     *
     * 删除指定任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTaskRecordRequest 请求对象
     * @return SyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse>
     */
    public SyncInvoker<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecordInvoker(
        DeleteTaskRecordRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteTaskRecord, hcClient);
    }

    /**
     * 查询实例是否开启备份加密功能
     *
     * 查询实例是否开启备份加密功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeBackupEncryptStatusRequest 请求对象
     * @return DescribeBackupEncryptStatusResponse
     */
    public DescribeBackupEncryptStatusResponse describeBackupEncryptStatus(DescribeBackupEncryptStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.describeBackupEncryptStatus);
    }

    /**
     * 查询实例是否开启备份加密功能
     *
     * 查询实例是否开启备份加密功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DescribeBackupEncryptStatusRequest 请求对象
     * @return SyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse>
     */
    public SyncInvoker<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> describeBackupEncryptStatusInvoker(
        DescribeBackupEncryptStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.describeBackupEncryptStatus, hcClient);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return ExpandGaussMySqlInstanceVolumeResponse
     */
    public ExpandGaussMySqlInstanceVolumeResponse expandGaussMySqlInstanceVolume(
        ExpandGaussMySqlInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandGaussMySqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>
     */
    public SyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeInvoker(
        ExpandGaussMySqlInstanceVolumeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.expandGaussMySqlInstanceVolume, hcClient);
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
     * @return ExpandGaussMySqlProxyResponse
     */
    public ExpandGaussMySqlProxyResponse expandGaussMySqlProxy(ExpandGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.expandGaussMySqlProxy);
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
     * @return SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>
     */
    public SyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyInvoker(
        ExpandGaussMySqlProxyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.expandGaussMySqlProxy, hcClient);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return InvokeGaussMySqlInstanceSwitchOverResponse
     */
    public InvokeGaussMySqlInstanceSwitchOverResponse invokeGaussMySqlInstanceSwitchOver(
        InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver);
    }

    /**
     * 手动主备倒换
     *
     * 用户手动进行主备倒换。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeGaussMySqlInstanceSwitchOverRequest 请求对象
     * @return SyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse>
     */
    public SyncInvoker<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOverInvoker(
        InvokeGaussMySqlInstanceSwitchOverRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.invokeGaussMySqlInstanceSwitchOver, hcClient);
    }

    /**
     * 获取全量SQL的临时下载链接
     *
     * 获取全量SQL的临时下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogDownloadLinkRequest 请求对象
     * @return ListAuditLogDownloadLinkResponse
     */
    public ListAuditLogDownloadLinkResponse listAuditLogDownloadLink(ListAuditLogDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listAuditLogDownloadLink);
    }

    /**
     * 获取全量SQL的临时下载链接
     *
     * 获取全量SQL的临时下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditLogDownloadLinkRequest 请求对象
     * @return SyncInvoker<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse>
     */
    public SyncInvoker<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> listAuditLogDownloadLinkInvoker(
        ListAuditLogDownloadLinkRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listAuditLogDownloadLink, hcClient);
    }

    /**
     * 对比参数模板
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDifferencesRequest 请求对象
     * @return ListConfigurationsDifferencesResponse
     */
    public ListConfigurationsDifferencesResponse listConfigurationsDifferences(
        ListConfigurationsDifferencesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listConfigurationsDifferences);
    }

    /**
     * 对比参数模板
     *
     * 比较两个参数模板之间的差异。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDifferencesRequest 请求对象
     * @return SyncInvoker<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse>
     */
    public SyncInvoker<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> listConfigurationsDifferencesInvoker(
        ListConfigurationsDifferencesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listConfigurationsDifferences, hcClient);
    }

    /**
     * 查询可应用的实例列表
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsInstancesRequest 请求对象
     * @return ListConfigurationsInstancesResponse
     */
    public ListConfigurationsInstancesResponse listConfigurationsInstances(ListConfigurationsInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listConfigurationsInstances);
    }

    /**
     * 查询可应用的实例列表
     *
     * 查询指定参数模板可被应用的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsInstancesRequest 请求对象
     * @return SyncInvoker<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse>
     */
    public SyncInvoker<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> listConfigurationsInstancesInvoker(
        ListConfigurationsInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listConfigurationsInstances, hcClient);
    }

    /**
     * 查询企业项目
     *
     * 查询企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return ListEnterpriseProjectsResponse
     */
    public ListEnterpriseProjectsResponse listEnterpriseProjects(ListEnterpriseProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listEnterpriseProjects);
    }

    /**
     * 查询企业项目
     *
     * 查询企业项目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return SyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse>
     */
    public SyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> listEnterpriseProjectsInvoker(
        ListEnterpriseProjectsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listEnterpriseProjects, hcClient);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlConfigurationsRequest 请求对象
     * @return ListGaussMySqlConfigurationsResponse
     */
    public ListGaussMySqlConfigurationsResponse listGaussMySqlConfigurations(
        ListGaussMySqlConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlConfigurations);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlConfigurationsRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>
     */
    public SyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsInvoker(
        ListGaussMySqlConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlConfigurations, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseRequest 请求对象
     * @return ListGaussMySqlDatabaseResponse
     */
    public ListGaussMySqlDatabaseResponse listGaussMySqlDatabase(ListGaussMySqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabase);
    }

    /**
     * 查询数据库列表
     *
     * 查询 GaussDB(for MySQL)实例数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse>
     */
    public SyncInvoker<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabaseInvoker(
        ListGaussMySqlDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlDatabase, hcClient);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return ListGaussMySqlDatabaseCharsetsResponse
     */
    public ListGaussMySqlDatabaseCharsetsResponse listGaussMySqlDatabaseCharsets(
        ListGaussMySqlDatabaseCharsetsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseCharsets);
    }

    /**
     * 查询数据库可用字符集
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库可用字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseCharsetsRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse>
     */
    public SyncInvoker<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsetsInvoker(
        ListGaussMySqlDatabaseCharsetsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlDatabaseCharsets, hcClient);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseUserRequest 请求对象
     * @return ListGaussMySqlDatabaseUserResponse
     */
    public ListGaussMySqlDatabaseUserResponse listGaussMySqlDatabaseUser(ListGaussMySqlDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDatabaseUser);
    }

    /**
     * 查询数据库用户
     *
     * 查询云数据库 GaussDB(for MySQL)实例数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDatabaseUserRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse>
     */
    public SyncInvoker<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUserInvoker(
        ListGaussMySqlDatabaseUserRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlDatabaseUser, hcClient);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return ListGaussMySqlDedicatedResourcesResponse
     */
    public ListGaussMySqlDedicatedResourcesResponse listGaussMySqlDedicatedResources(
        ListGaussMySqlDedicatedResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>
     */
    public SyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesInvoker(
        ListGaussMySqlDedicatedResourcesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlDedicatedResources, hcClient);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return ListGaussMySqlInstanceDetailInfoResponse
     */
    public ListGaussMySqlInstanceDetailInfoResponse listGaussMySqlInstanceDetailInfo(
        ListGaussMySqlInstanceDetailInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse>
     */
    public SyncInvoker<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfoInvoker(
        ListGaussMySqlInstanceDetailInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstanceDetailInfo, hcClient);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoUnifyStatusRequest 请求对象
     * @return ListGaussMySqlInstanceDetailInfoUnifyStatusResponse
     */
    public ListGaussMySqlInstanceDetailInfoUnifyStatusResponse listGaussMySqlInstanceDetailInfoUnifyStatus(
        ListGaussMySqlInstanceDetailInfoUnifyStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstanceDetailInfoUnifyStatus);
    }

    /**
     * 批量查询实例详情
     *
     * 批量查询实例详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstanceDetailInfoUnifyStatusRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse>
     */
    public SyncInvoker<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse> listGaussMySqlInstanceDetailInfoUnifyStatusInvoker(
        ListGaussMySqlInstanceDetailInfoUnifyStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstanceDetailInfoUnifyStatus, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesRequest 请求对象
     * @return ListGaussMySqlInstancesResponse
     */
    public ListGaussMySqlInstancesResponse listGaussMySqlInstances(ListGaussMySqlInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstances);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>
     */
    public SyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstancesInvoker(
        ListGaussMySqlInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstances, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesUnifyStatusRequest 请求对象
     * @return ListGaussMySqlInstancesUnifyStatusResponse
     */
    public ListGaussMySqlInstancesUnifyStatusResponse listGaussMySqlInstancesUnifyStatus(
        ListGaussMySqlInstancesUnifyStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstancesUnifyStatus);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussMySqlInstancesUnifyStatusRequest 请求对象
     * @return SyncInvoker<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse>
     */
    public SyncInvoker<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse> listGaussMySqlInstancesUnifyStatusInvoker(
        ListGaussMySqlInstancesUnifyStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listGaussMySqlInstancesUnifyStatus, hcClient);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmediateJobsRequest 请求对象
     * @return ListImmediateJobsResponse
     */
    public ListImmediateJobsResponse listImmediateJobs(ListImmediateJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listImmediateJobs);
    }

    /**
     * 获取即时任务列表
     *
     * 获取即时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImmediateJobsRequest 请求对象
     * @return SyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse>
     */
    public SyncInvoker<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobsInvoker(
        ListImmediateJobsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listImmediateJobs, hcClient);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigurationsRequest 请求对象
     * @return ListInstanceConfigurationsResponse
     */
    public ListInstanceConfigurationsResponse listInstanceConfigurations(ListInstanceConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listInstanceConfigurations);
    }

    /**
     * 获取指定实例的参数信息
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceConfigurationsRequest 请求对象
     * @return SyncInvoker<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>
     */
    public SyncInvoker<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> listInstanceConfigurationsInvoker(
        ListInstanceConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listInstanceConfigurations, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listInstanceTags);
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
        return new SyncInvoker<>(request, GaussDBMeta.listInstanceTags, hcClient);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogDetailsRequest 请求对象
     * @return ListLtsErrorLogDetailsResponse
     */
    public ListLtsErrorLogDetailsResponse listLtsErrorLogDetails(ListLtsErrorLogDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listLtsErrorLogDetails);
    }

    /**
     * 获取错误日志详情列表
     *
     * 获取指定实例的错误日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsErrorLogDetailsRequest 请求对象
     * @return SyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse>
     */
    public SyncInvoker<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetailsInvoker(
        ListLtsErrorLogDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listLtsErrorLogDetails, hcClient);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowlogDetailsRequest 请求对象
     * @return ListLtsSlowlogDetailsResponse
     */
    public ListLtsSlowlogDetailsResponse listLtsSlowlogDetails(ListLtsSlowlogDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listLtsSlowlogDetails);
    }

    /**
     * 获取慢日志详情列表
     *
     * 获取指定实例的慢日志详情列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsSlowlogDetailsRequest 请求对象
     * @return SyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse>
     */
    public SyncInvoker<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetailsInvoker(
        ListLtsSlowlogDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listLtsSlowlogDetails, hcClient);
    }

    /**
     * 查询参数修改历史
     *
     * 查询参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModifyHistoryRequest 请求对象
     * @return ListModifyHistoryResponse
     */
    public ListModifyHistoryResponse listModifyHistory(ListModifyHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listModifyHistory);
    }

    /**
     * 查询参数修改历史
     *
     * 查询参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListModifyHistoryRequest 请求对象
     * @return SyncInvoker<ListModifyHistoryRequest, ListModifyHistoryResponse>
     */
    public SyncInvoker<ListModifyHistoryRequest, ListModifyHistoryResponse> listModifyHistoryInvoker(
        ListModifyHistoryRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listModifyHistory, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listProjectTags, hcClient);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleJobsRequest 请求对象
     * @return ListScheduleJobsResponse
     */
    public ListScheduleJobsResponse listScheduleJobs(ListScheduleJobsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listScheduleJobs);
    }

    /**
     * 获取定时任务列表
     *
     * 获取定时任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleJobsRequest 请求对象
     * @return SyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse>
     */
    public SyncInvoker<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobsInvoker(
        ListScheduleJobsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listScheduleJobs, hcClient);
    }

    /**
     * 打开或关闭备份加密
     *
     * 打开或关闭备份加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyBackupEncryptStatusRequest 请求对象
     * @return ModifyBackupEncryptStatusResponse
     */
    public ModifyBackupEncryptStatusResponse modifyBackupEncryptStatus(ModifyBackupEncryptStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.modifyBackupEncryptStatus);
    }

    /**
     * 打开或关闭备份加密
     *
     * 打开或关闭备份加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyBackupEncryptStatusRequest 请求对象
     * @return SyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse>
     */
    public SyncInvoker<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatusInvoker(
        ModifyBackupEncryptStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.modifyBackupEncryptStatus, hcClient);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMySqlProxyRouteModeRequest 请求对象
     * @return ModifyGaussMySqlProxyRouteModeResponse
     */
    public ModifyGaussMySqlProxyRouteModeResponse modifyGaussMySqlProxyRouteMode(
        ModifyGaussMySqlProxyRouteModeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.modifyGaussMySqlProxyRouteMode);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMySqlProxyRouteModeRequest 请求对象
     * @return SyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse>
     */
    public SyncInvoker<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteModeInvoker(
        ModifyGaussMySqlProxyRouteModeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.modifyGaussMySqlProxyRouteMode, hcClient);
    }

    /**
     * 修改内网域名
     *
     * 修改内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMysqlDnsRequest 请求对象
     * @return ModifyGaussMysqlDnsResponse
     */
    public ModifyGaussMysqlDnsResponse modifyGaussMysqlDns(ModifyGaussMysqlDnsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.modifyGaussMysqlDns);
    }

    /**
     * 修改内网域名
     *
     * 修改内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyGaussMysqlDnsRequest 请求对象
     * @return SyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse>
     */
    public SyncInvoker<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> modifyGaussMysqlDnsInvoker(
        ModifyGaussMysqlDnsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.modifyGaussMysqlDns, hcClient);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return ResetGaussMySqlDatabasePasswordResponse
     */
    public ResetGaussMySqlDatabasePasswordResponse resetGaussMySqlDatabasePassword(
        ResetGaussMySqlDatabasePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.resetGaussMySqlDatabasePassword);
    }

    /**
     * 修改数据库用户密码
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlDatabasePasswordRequest 请求对象
     * @return SyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse>
     */
    public SyncInvoker<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePasswordInvoker(
        ResetGaussMySqlDatabasePasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.resetGaussMySqlDatabasePassword, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlPasswordRequest 请求对象
     * @return ResetGaussMySqlPasswordResponse
     */
    public ResetGaussMySqlPasswordResponse resetGaussMySqlPassword(ResetGaussMySqlPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.resetGaussMySqlPassword);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetGaussMySqlPasswordRequest 请求对象
     * @return SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>
     */
    public SyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordInvoker(
        ResetGaussMySqlPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.resetGaussMySqlPassword, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlInstanceRequest 请求对象
     * @return RestartGaussMySqlInstanceResponse
     */
    public RestartGaussMySqlInstanceResponse restartGaussMySqlInstance(RestartGaussMySqlInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restartGaussMySqlInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlInstanceRequest 请求对象
     * @return SyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse>
     */
    public SyncInvoker<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstanceInvoker(
        RestartGaussMySqlInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.restartGaussMySqlInstance, hcClient);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlNodeRequest 请求对象
     * @return RestartGaussMySqlNodeResponse
     */
    public RestartGaussMySqlNodeResponse restartGaussMySqlNode(RestartGaussMySqlNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restartGaussMySqlNode);
    }

    /**
     * 节点重启
     *
     * 节点重启。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartGaussMySqlNodeRequest 请求对象
     * @return SyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse>
     */
    public SyncInvoker<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNodeInvoker(
        RestartGaussMySqlNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.restartGaussMySqlNode, hcClient);
    }

    /**
     * 备份恢复到当前实例或已有实例
     *
     * 备份恢复到当前实例或已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreOldInstanceRequest 请求对象
     * @return RestoreOldInstanceResponse
     */
    public RestoreOldInstanceResponse restoreOldInstance(RestoreOldInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restoreOldInstance);
    }

    /**
     * 备份恢复到当前实例或已有实例
     *
     * 备份恢复到当前实例或已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreOldInstanceRequest 请求对象
     * @return SyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse>
     */
    public SyncInvoker<RestoreOldInstanceRequest, RestoreOldInstanceResponse> restoreOldInstanceInvoker(
        RestoreOldInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.restoreOldInstance, hcClient);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlProxyWeightRequest 请求对象
     * @return SetGaussMySqlProxyWeightResponse
     */
    public SetGaussMySqlProxyWeightResponse setGaussMySqlProxyWeight(SetGaussMySqlProxyWeightRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setGaussMySqlProxyWeight);
    }

    /**
     * 设置读写分离权重
     *
     * 设置读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlProxyWeightRequest 请求对象
     * @return SyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse>
     */
    public SyncInvoker<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeightInvoker(
        SetGaussMySqlProxyWeightRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.setGaussMySqlProxyWeight, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlQuotasRequest 请求对象
     * @return SetGaussMySqlQuotasResponse
     */
    public SetGaussMySqlQuotasResponse setGaussMySqlQuotas(SetGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setGaussMySqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>
     */
    public SyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotasInvoker(
        SetGaussMySqlQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.setGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return ShowAuditLogResponse
     */
    public ShowAuditLogResponse showAuditLog(ShowAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showAuditLog);
    }

    /**
     * 查询全量SQL开关状态
     *
     * 查询全量SQL开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogInvoker(ShowAuditLogRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showAuditLog, hcClient);
    }

    /**
     * 查询自动变配
     *
     * 查询自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyRequest 请求对象
     * @return ShowAutoScalingPolicyResponse
     */
    public ShowAutoScalingPolicyResponse showAutoScalingPolicy(ShowAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showAutoScalingPolicy);
    }

    /**
     * 查询自动变配
     *
     * 查询自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse>
     */
    public SyncInvoker<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicyInvoker(
        ShowAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showAutoScalingPolicy, hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRestoreTimeRequest 请求对象
     * @return ShowBackupRestoreTimeResponse
     */
    public ShowBackupRestoreTimeResponse showBackupRestoreTime(ShowBackupRestoreTimeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showBackupRestoreTime);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询实例的可恢复时间段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupRestoreTimeRequest 请求对象
     * @return SyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse>
     */
    public SyncInvoker<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> showBackupRestoreTimeInvoker(
        ShowBackupRestoreTimeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showBackupRestoreTime, hcClient);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDedicatedResourceInfoRequest 请求对象
     * @return ShowDedicatedResourceInfoResponse
     */
    public ShowDedicatedResourceInfoResponse showDedicatedResourceInfo(ShowDedicatedResourceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showDedicatedResourceInfo);
    }

    /**
     * 查询专属资源信息详情
     *
     * 查询专属资源信息详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDedicatedResourceInfoRequest 请求对象
     * @return SyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse>
     */
    public SyncInvoker<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfoInvoker(
        ShowDedicatedResourceInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showDedicatedResourceInfo, hcClient);
    }

    /**
     * 查询全量备份列表
     *
     * 查询全量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupListRequest 请求对象
     * @return ShowGaussMySqlBackupListResponse
     */
    public ShowGaussMySqlBackupListResponse showGaussMySqlBackupList(ShowGaussMySqlBackupListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupList);
    }

    /**
     * 查询全量备份列表
     *
     * 查询全量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupListRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>
     */
    public SyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListInvoker(
        ShowGaussMySqlBackupListRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return ShowGaussMySqlBackupPolicyResponse
     */
    public ShowGaussMySqlBackupPolicyResponse showGaussMySqlBackupPolicy(ShowGaussMySqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>
     */
    public SyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyInvoker(
        ShowGaussMySqlBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlConfigurationRequest 请求对象
     * @return ShowGaussMySqlConfigurationResponse
     */
    public ShowGaussMySqlConfigurationResponse showGaussMySqlConfiguration(ShowGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlConfiguration);
    }

    /**
     * 获取参数模板详情
     *
     * 获取指定参数模板的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfigurationInvoker(
        ShowGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlConfiguration, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlEngineVersionRequest 请求对象
     * @return ShowGaussMySqlEngineVersionResponse
     */
    public ShowGaussMySqlEngineVersionResponse showGaussMySqlEngineVersion(ShowGaussMySqlEngineVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlEngineVersionRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>
     */
    public SyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionInvoker(
        ShowGaussMySqlEngineVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlFlavorsRequest 请求对象
     * @return ShowGaussMySqlFlavorsResponse
     */
    public ShowGaussMySqlFlavorsResponse showGaussMySqlFlavors(ShowGaussMySqlFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlFlavorsRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>
     */
    public SyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsInvoker(
        ShowGaussMySqlFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlFlavors, hcClient);
    }

    /**
     * 查询增量备份列表
     *
     * 查询增量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlIncrementalBackupListRequest 请求对象
     * @return ShowGaussMySqlIncrementalBackupListResponse
     */
    public ShowGaussMySqlIncrementalBackupListResponse showGaussMySqlIncrementalBackupList(
        ShowGaussMySqlIncrementalBackupListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlIncrementalBackupList);
    }

    /**
     * 查询增量备份列表
     *
     * 查询增量备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlIncrementalBackupListRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse>
     */
    public SyncInvoker<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> showGaussMySqlIncrementalBackupListInvoker(
        ShowGaussMySqlIncrementalBackupListRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlIncrementalBackupList, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return ShowGaussMySqlInstanceInfoResponse
     */
    public ShowGaussMySqlInstanceInfoResponse showGaussMySqlInstanceInfo(ShowGaussMySqlInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>
     */
    public SyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoInvoker(
        ShowGaussMySqlInstanceInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlInstanceInfo, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoUnifyStatusRequest 请求对象
     * @return ShowGaussMySqlInstanceInfoUnifyStatusResponse
     */
    public ShowGaussMySqlInstanceInfoUnifyStatusResponse showGaussMySqlInstanceInfoUnifyStatus(
        ShowGaussMySqlInstanceInfoUnifyStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfoUnifyStatus);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlInstanceInfoUnifyStatusRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse>
     */
    public SyncInvoker<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse> showGaussMySqlInstanceInfoUnifyStatusInvoker(
        ShowGaussMySqlInstanceInfoUnifyStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlInstanceInfoUnifyStatus, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlJobInfoRequest 请求对象
     * @return ShowGaussMySqlJobInfoResponse
     */
    public ShowGaussMySqlJobInfoResponse showGaussMySqlJobInfo(ShowGaussMySqlJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取GaussDB(for MySQL)任务中心指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlJobInfoRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>
     */
    public SyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoInvoker(
        ShowGaussMySqlJobInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return ShowGaussMySqlProjectQuotasResponse
     */
    public ShowGaussMySqlProjectQuotasResponse showGaussMySqlProjectQuotas(ShowGaussMySqlProjectQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>
     */
    public SyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasInvoker(
        ShowGaussMySqlProjectQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return ShowGaussMySqlProxyFlavorsResponse
     */
    public ShowGaussMySqlProxyFlavorsResponse showGaussMySqlProxyFlavors(ShowGaussMySqlProxyFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>
     */
    public SyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsInvoker(
        ShowGaussMySqlProxyFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlProxyFlavors, hcClient);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyListRequest 请求对象
     * @return ShowGaussMySqlProxyListResponse
     */
    public ShowGaussMySqlProxyListResponse showGaussMySqlProxyList(ShowGaussMySqlProxyListRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyList);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlProxyListRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>
     */
    public SyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListInvoker(
        ShowGaussMySqlProxyListRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlProxyList, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlQuotasRequest 请求对象
     * @return ShowGaussMySqlQuotasResponse
     */
    public ShowGaussMySqlQuotasResponse showGaussMySqlQuotas(ShowGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showGaussMySqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>
     */
    public SyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasInvoker(
        ShowGaussMySqlQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询内核版本信息
     *
     * 查询内核版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDatabaseVersionRequest 请求对象
     * @return ShowInstanceDatabaseVersionResponse
     */
    public ShowInstanceDatabaseVersionResponse showInstanceDatabaseVersion(ShowInstanceDatabaseVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showInstanceDatabaseVersion);
    }

    /**
     * 查询内核版本信息
     *
     * 查询内核版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDatabaseVersionRequest 请求对象
     * @return SyncInvoker<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse>
     */
    public SyncInvoker<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> showInstanceDatabaseVersionInvoker(
        ShowInstanceDatabaseVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showInstanceDatabaseVersion, hcClient);
    }

    /**
     * 查询实例秒级监控
     *
     * 查询实例秒级监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorExtendRequest 请求对象
     * @return ShowInstanceMonitorExtendResponse
     */
    public ShowInstanceMonitorExtendResponse showInstanceMonitorExtend(ShowInstanceMonitorExtendRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showInstanceMonitorExtend);
    }

    /**
     * 查询实例秒级监控
     *
     * 查询实例秒级监控信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMonitorExtendRequest 请求对象
     * @return SyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>
     */
    public SyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendInvoker(
        ShowInstanceMonitorExtendRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showInstanceMonitorExtend, hcClient);
    }

    /**
     * 获取各指标的异常实例数
     *
     * 获取各指标的异常实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest 请求对象
     * @return ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse
     */
    public ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse showIntelligentDiagnosisAbnormalCountOfInstances(
        ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showIntelligentDiagnosisAbnormalCountOfInstances);
    }

    /**
     * 获取各指标的异常实例数
     *
     * 获取各指标的异常实例数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest 请求对象
     * @return SyncInvoker<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse>
     */
    public SyncInvoker<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> showIntelligentDiagnosisAbnormalCountOfInstancesInvoker(
        ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showIntelligentDiagnosisAbnormalCountOfInstances, hcClient);
    }

    /**
     * 获取某个指标的异常实例信息
     *
     * 获取某个指标的异常实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisInstanceInfosPerMetricRequest 请求对象
     * @return ShowIntelligentDiagnosisInstanceInfosPerMetricResponse
     */
    public ShowIntelligentDiagnosisInstanceInfosPerMetricResponse showIntelligentDiagnosisInstanceInfosPerMetric(
        ShowIntelligentDiagnosisInstanceInfosPerMetricRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showIntelligentDiagnosisInstanceInfosPerMetric);
    }

    /**
     * 获取某个指标的异常实例信息
     *
     * 获取某个指标的异常实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIntelligentDiagnosisInstanceInfosPerMetricRequest 请求对象
     * @return SyncInvoker<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse>
     */
    public SyncInvoker<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> showIntelligentDiagnosisInstanceInfosPerMetricInvoker(
        ShowIntelligentDiagnosisInstanceInfosPerMetricRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showIntelligentDiagnosisInstanceInfosPerMetric, hcClient);
    }

    /**
     * 查询代理实例访问控制
     *
     * 查询代理实例访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyIpgroupRequest 请求对象
     * @return ShowProxyIpgroupResponse
     */
    public ShowProxyIpgroupResponse showProxyIpgroup(ShowProxyIpgroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showProxyIpgroup);
    }

    /**
     * 查询代理实例访问控制
     *
     * 查询代理实例访问控制
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyIpgroupRequest 请求对象
     * @return SyncInvoker<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse>
     */
    public SyncInvoker<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse> showProxyIpgroupInvoker(
        ShowProxyIpgroupRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showProxyIpgroup, hcClient);
    }

    /**
     * 查询代理实例小版本
     *
     * 查询代理实例小版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyVersionRequest 请求对象
     * @return ShowProxyVersionResponse
     */
    public ShowProxyVersionResponse showProxyVersion(ShowProxyVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showProxyVersion);
    }

    /**
     * 查询代理实例小版本
     *
     * 查询代理实例小版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProxyVersionRequest 请求对象
     * @return SyncInvoker<ShowProxyVersionRequest, ShowProxyVersionResponse>
     */
    public SyncInvoker<ShowProxyVersionRequest, ShowProxyVersionResponse> showProxyVersionInvoker(
        ShowProxyVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showProxyVersion, hcClient);
    }

    /**
     * 查询表级时间点恢复可选表
     *
     * 查询表级时间点恢复可选表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestoreTablesRequest 请求对象
     * @return ShowRestoreTablesResponse
     */
    public ShowRestoreTablesResponse showRestoreTables(ShowRestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showRestoreTables);
    }

    /**
     * 查询表级时间点恢复可选表
     *
     * 查询表级时间点恢复可选表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRestoreTablesRequest 请求对象
     * @return SyncInvoker<ShowRestoreTablesRequest, ShowRestoreTablesResponse>
     */
    public SyncInvoker<ShowRestoreTablesRequest, ShowRestoreTablesResponse> showRestoreTablesInvoker(
        ShowRestoreTablesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showRestoreTables, hcClient);
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
     * @return ShrinkGaussMySqlProxyResponse
     */
    public ShrinkGaussMySqlProxyResponse shrinkGaussMySqlProxy(ShrinkGaussMySqlProxyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.shrinkGaussMySqlProxy);
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
     * @return SyncInvoker<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse>
     */
    public SyncInvoker<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> shrinkGaussMySqlProxyInvoker(
        ShrinkGaussMySqlProxyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.shrinkGaussMySqlProxy, hcClient);
    }

    /**
     * 开启或关闭访问控制
     *
     * 开启或关闭访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAccessControlRequest 请求对象
     * @return SwitchAccessControlResponse
     */
    public SwitchAccessControlResponse switchAccessControl(SwitchAccessControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.switchAccessControl);
    }

    /**
     * 开启或关闭访问控制
     *
     * 开启或关闭访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAccessControlRequest 请求对象
     * @return SyncInvoker<SwitchAccessControlRequest, SwitchAccessControlResponse>
     */
    public SyncInvoker<SwitchAccessControlRequest, SwitchAccessControlResponse> switchAccessControlInvoker(
        SwitchAccessControlRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.switchAccessControl, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlConfigurationRequest 请求对象
     * @return SwitchGaussMySqlConfigurationResponse
     */
    public SwitchGaussMySqlConfigurationResponse switchGaussMySqlConfiguration(
        SwitchGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.switchGaussMySqlConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfigurationInvoker(
        SwitchGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.switchGaussMySqlConfiguration, hcClient);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return SwitchGaussMySqlInstanceSslResponse
     */
    public SwitchGaussMySqlInstanceSslResponse switchGaussMySqlInstanceSsl(SwitchGaussMySqlInstanceSslRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.switchGaussMySqlInstanceSsl);
    }

    /**
     * 开关SSL
     *
     * 为实例设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlInstanceSslRequest 请求对象
     * @return SyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse>
     */
    public SyncInvoker<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSslInvoker(
        SwitchGaussMySqlInstanceSslRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.switchGaussMySqlInstanceSsl, hcClient);
    }

    /**
     * 开关数据库代理SSL
     *
     * 为数据库代理设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlProxySslRequest 请求对象
     * @return SwitchGaussMySqlProxySslResponse
     */
    public SwitchGaussMySqlProxySslResponse switchGaussMySqlProxySsl(SwitchGaussMySqlProxySslRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.switchGaussMySqlProxySsl);
    }

    /**
     * 开关数据库代理SSL
     *
     * 为数据库代理设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchGaussMySqlProxySslRequest 请求对象
     * @return SyncInvoker<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse>
     */
    public SyncInvoker<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse> switchGaussMySqlProxySslInvoker(
        SwitchGaussMySqlProxySslRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.switchGaussMySqlProxySsl, hcClient);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditLogRequest 请求对象
     * @return UpdateAuditLogResponse
     */
    public UpdateAuditLogResponse updateAuditLog(UpdateAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateAuditLog);
    }

    /**
     * 开启或者关闭全量SQL
     *
     * 开启或者关闭全量SQL。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAuditLogRequest 请求对象
     * @return SyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>
     */
    public SyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLogInvoker(
        UpdateAuditLogRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateAuditLog, hcClient);
    }

    /**
     * 设置自动变配
     *
     * 设置自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return UpdateAutoScalingPolicyResponse
     */
    public UpdateAutoScalingPolicyResponse updateAutoScalingPolicy(UpdateAutoScalingPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateAutoScalingPolicy);
    }

    /**
     * 设置自动变配
     *
     * 设置自动变配。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAutoScalingPolicyRequest 请求对象
     * @return SyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse>
     */
    public SyncInvoker<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicyInvoker(
        UpdateAutoScalingPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateAutoScalingPolicy, hcClient);
    }

    /**
     * 设置跨区备份策略
     *
     * 设置跨区备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupOffsitePolicyRequest 请求对象
     * @return UpdateBackupOffsitePolicyResponse
     */
    public UpdateBackupOffsitePolicyResponse updateBackupOffsitePolicy(UpdateBackupOffsitePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateBackupOffsitePolicy);
    }

    /**
     * 设置跨区备份策略
     *
     * 设置跨区备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBackupOffsitePolicyRequest 请求对象
     * @return SyncInvoker<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse>
     */
    public SyncInvoker<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> updateBackupOffsitePolicyInvoker(
        UpdateBackupOffsitePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateBackupOffsitePolicy, hcClient);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return UpdateGaussMySqlBackupPolicyResponse
     */
    public UpdateGaussMySqlBackupPolicyResponse updateGaussMySqlBackupPolicy(
        UpdateGaussMySqlBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlBackupPolicy);
    }

    /**
     * 设置备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>
     */
    public SyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyInvoker(
        UpdateGaussMySqlBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlConfigurationRequest 请求对象
     * @return UpdateGaussMySqlConfigurationResponse
     */
    public UpdateGaussMySqlConfigurationResponse updateGaussMySqlConfiguration(
        UpdateGaussMySqlConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlConfiguration);
    }

    /**
     * 修改参数模板
     *
     * 修改指定参数模板的参数信息，包括名称、描述、指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse>
     */
    public SyncInvoker<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfigurationInvoker(
        UpdateGaussMySqlConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlConfiguration, hcClient);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return UpdateGaussMySqlDatabaseCommentResponse
     */
    public UpdateGaussMySqlDatabaseCommentResponse updateGaussMySqlDatabaseComment(
        UpdateGaussMySqlDatabaseCommentRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseComment);
    }

    /**
     * 修改数据库备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseCommentRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse>
     */
    public SyncInvoker<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseCommentInvoker(
        UpdateGaussMySqlDatabaseCommentRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlDatabaseComment, hcClient);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return UpdateGaussMySqlDatabaseUserCommentResponse
     */
    public UpdateGaussMySqlDatabaseUserCommentResponse updateGaussMySqlDatabaseUserComment(
        UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment);
    }

    /**
     * 修改数据库用户备注
     *
     * 修改云数据库 GaussDB(for MySQL)实例数据库用户备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlDatabaseUserCommentRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse>
     */
    public SyncInvoker<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserCommentInvoker(
        UpdateGaussMySqlDatabaseUserCommentRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlDatabaseUserComment, hcClient);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return UpdateGaussMySqlInstanceAliasResponse
     */
    public UpdateGaussMySqlInstanceAliasResponse updateGaussMySqlInstanceAlias(
        UpdateGaussMySqlInstanceAliasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceAlias);
    }

    /**
     * 修改实例备注
     *
     * 修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceAliasRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAliasInvoker(
        UpdateGaussMySqlInstanceAliasRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceAlias, hcClient);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return UpdateGaussMySqlInstanceEipResponse
     */
    public UpdateGaussMySqlInstanceEipResponse updateGaussMySqlInstanceEip(UpdateGaussMySqlInstanceEipRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceEip);
    }

    /**
     * 绑定弹性公网IP
     *
     * 实例绑定弹性公网IP，供外网连接使用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceEipRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEipInvoker(
        UpdateGaussMySqlInstanceEipRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceEip, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return UpdateGaussMySqlInstanceInternalIpResponse
     */
    public UpdateGaussMySqlInstanceInternalIpResponse updateGaussMySqlInstanceInternalIp(
        UpdateGaussMySqlInstanceInternalIpRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp);
    }

    /**
     * 修改内网地址
     *
     * 修改实例内网地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceInternalIpRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIpInvoker(
        UpdateGaussMySqlInstanceInternalIpRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceInternalIp, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return UpdateGaussMySqlInstanceNameResponse
     */
    public UpdateGaussMySqlInstanceNameResponse updateGaussMySqlInstanceName(
        UpdateGaussMySqlInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameInvoker(
        UpdateGaussMySqlInstanceNameRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceName, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return UpdateGaussMySqlInstanceOpsWindowResponse
     */
    public UpdateGaussMySqlInstanceOpsWindowResponse updateGaussMySqlInstanceOpsWindow(
        UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段。建议将可维护时间段设置在业务低峰期，避免业务在维护过程中异常中断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceOpsWindowRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindowInvoker(
        UpdateGaussMySqlInstanceOpsWindowRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceOpsWindow, hcClient);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstancePortRequest 请求对象
     * @return UpdateGaussMySqlInstancePortResponse
     */
    public UpdateGaussMySqlInstancePortResponse updateGaussMySqlInstancePort(
        UpdateGaussMySqlInstancePortRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstancePort);
    }

    /**
     * 修改实例端口
     *
     * 修改实例数据库端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstancePortRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePortInvoker(
        UpdateGaussMySqlInstancePortRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstancePort, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return UpdateGaussMySqlInstanceSecurityGroupResponse
     */
    public UpdateGaussMySqlInstanceSecurityGroupResponse updateGaussMySqlInstanceSecurityGroup(
        UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改指定实例安全组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlInstanceSecurityGroupRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse>
     */
    public SyncInvoker<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroupInvoker(
        UpdateGaussMySqlInstanceSecurityGroupRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlInstanceSecurityGroup, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlQuotasRequest 请求对象
     * @return UpdateGaussMySqlQuotasResponse
     */
    public UpdateGaussMySqlQuotasResponse updateGaussMySqlQuotas(UpdateGaussMySqlQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateGaussMySqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGaussMySqlQuotasRequest 请求对象
     * @return SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>
     */
    public SyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasInvoker(
        UpdateGaussMySqlQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateGaussMySqlQuotas, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateInstanceConfigurations);
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
        return new SyncInvoker<>(request, GaussDBMeta.updateInstanceConfigurations, hcClient);
    }

    /**
     * 设置实例秒级监控
     *
     * 设置实例秒级监控，包括1秒监控和5秒监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceMonitorRequest 请求对象
     * @return UpdateInstanceMonitorResponse
     */
    public UpdateInstanceMonitorResponse updateInstanceMonitor(UpdateInstanceMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateInstanceMonitor);
    }

    /**
     * 设置实例秒级监控
     *
     * 设置实例秒级监控，包括1秒监控和5秒监控。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceMonitorRequest 请求对象
     * @return SyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>
     */
    public SyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitorInvoker(
        UpdateInstanceMonitorRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateInstanceMonitor, hcClient);
    }

    /**
     * 开启或关闭新增节点自动加入该Proxy
     *
     * 开启或关闭新增节点自动加入该Proxy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewNodeAutoAddSwitchRequest 请求对象
     * @return UpdateNewNodeAutoAddSwitchResponse
     */
    public UpdateNewNodeAutoAddSwitchResponse updateNewNodeAutoAddSwitch(UpdateNewNodeAutoAddSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateNewNodeAutoAddSwitch);
    }

    /**
     * 开启或关闭新增节点自动加入该Proxy
     *
     * 开启或关闭新增节点自动加入该Proxy。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNewNodeAutoAddSwitchRequest 请求对象
     * @return SyncInvoker<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse>
     */
    public SyncInvoker<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse> updateNewNodeAutoAddSwitchInvoker(
        UpdateNewNodeAutoAddSwitchRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateNewNodeAutoAddSwitch, hcClient);
    }

    /**
     * 更改数据库代理连接池类型
     *
     * 更改数据库代理连接池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyConnectionPoolTypeRequest 请求对象
     * @return UpdateProxyConnectionPoolTypeResponse
     */
    public UpdateProxyConnectionPoolTypeResponse updateProxyConnectionPoolType(
        UpdateProxyConnectionPoolTypeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateProxyConnectionPoolType);
    }

    /**
     * 更改数据库代理连接池类型
     *
     * 更改数据库代理连接池类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyConnectionPoolTypeRequest 请求对象
     * @return SyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse>
     */
    public SyncInvoker<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolTypeInvoker(
        UpdateProxyConnectionPoolTypeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateProxyConnectionPoolType, hcClient);
    }

    /**
     * 修改代理实例名称
     *
     * 修改代理实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNameRequest 请求对象
     * @return UpdateProxyNameResponse
     */
    public UpdateProxyNameResponse updateProxyName(UpdateProxyNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateProxyName);
    }

    /**
     * 修改代理实例名称
     *
     * 修改代理实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNameRequest 请求对象
     * @return SyncInvoker<UpdateProxyNameRequest, UpdateProxyNameResponse>
     */
    public SyncInvoker<UpdateProxyNameRequest, UpdateProxyNameResponse> updateProxyNameInvoker(
        UpdateProxyNameRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateProxyName, hcClient);
    }

    /**
     * 修改代理实例参数
     *
     * 修改数据库代理参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNewConfigurationsRequest 请求对象
     * @return UpdateProxyNewConfigurationsResponse
     */
    public UpdateProxyNewConfigurationsResponse updateProxyNewConfigurations(
        UpdateProxyNewConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateProxyNewConfigurations);
    }

    /**
     * 修改代理实例参数
     *
     * 修改数据库代理参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyNewConfigurationsRequest 请求对象
     * @return SyncInvoker<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse>
     */
    public SyncInvoker<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> updateProxyNewConfigurationsInvoker(
        UpdateProxyNewConfigurationsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateProxyNewConfigurations, hcClient);
    }

    /**
     * 修改读写分离端口号
     *
     * 修改读写分离端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyPortRequest 请求对象
     * @return UpdateProxyPortResponse
     */
    public UpdateProxyPortResponse updateProxyPort(UpdateProxyPortRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateProxyPort);
    }

    /**
     * 修改读写分离端口号
     *
     * 修改读写分离端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxyPortRequest 请求对象
     * @return SyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse>
     */
    public SyncInvoker<UpdateProxyPortRequest, UpdateProxyPortResponse> updateProxyPortInvoker(
        UpdateProxyPortRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateProxyPort, hcClient);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxySessionConsistenceRequest 请求对象
     * @return UpdateProxySessionConsistenceResponse
     */
    public UpdateProxySessionConsistenceResponse updateProxySessionConsistence(
        UpdateProxySessionConsistenceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateProxySessionConsistence);
    }

    /**
     * 修改代理会话一致性
     *
     * 修改代理会话一致性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProxySessionConsistenceRequest 请求对象
     * @return SyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse>
     */
    public SyncInvoker<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistenceInvoker(
        UpdateProxySessionConsistenceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateProxySessionConsistence, hcClient);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransactionSplitStatusRequest 请求对象
     * @return UpdateTransactionSplitStatusResponse
     */
    public UpdateTransactionSplitStatusResponse updateTransactionSplitStatus(
        UpdateTransactionSplitStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateTransactionSplitStatus);
    }

    /**
     * 设置proxy事务拆分
     *
     * 设置proxy事务拆分。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTransactionSplitStatusRequest 请求对象
     * @return SyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse>
     */
    public SyncInvoker<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatusInvoker(
        UpdateTransactionSplitStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateTransactionSplitStatus, hcClient);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return UpgradeGaussMySqlInstanceDatabaseResponse
     */
    public UpgradeGaussMySqlInstanceDatabaseResponse upgradeGaussMySqlInstanceDatabase(
        UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase);
    }

    /**
     * 内核版本升级
     *
     * 内核版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeGaussMySqlInstanceDatabaseRequest 请求对象
     * @return SyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse>
     */
    public SyncInvoker<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabaseInvoker(
        UpgradeGaussMySqlInstanceDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.upgradeGaussMySqlInstanceDatabase, hcClient);
    }

    /**
     * 升级数据库代理实例内核版本
     *
     * 升级数据库代理实例内核版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeProxyVersionRequest 请求对象
     * @return UpgradeProxyVersionResponse
     */
    public UpgradeProxyVersionResponse upgradeProxyVersion(UpgradeProxyVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.upgradeProxyVersion);
    }

    /**
     * 升级数据库代理实例内核版本
     *
     * 升级数据库代理实例内核版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeProxyVersionRequest 请求对象
     * @return SyncInvoker<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse>
     */
    public SyncInvoker<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse> upgradeProxyVersionInvoker(
        UpgradeProxyVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.upgradeProxyVersion, hcClient);
    }

    /**
     * HTAP数据同步库配置校验
     *
     * HTAP数据同步库配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataBaseConfigRequest 请求对象
     * @return CheckDataBaseConfigResponse
     */
    public CheckDataBaseConfigResponse checkDataBaseConfig(CheckDataBaseConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.checkDataBaseConfig);
    }

    /**
     * HTAP数据同步库配置校验
     *
     * HTAP数据同步库配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDataBaseConfigRequest 请求对象
     * @return SyncInvoker<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse>
     */
    public SyncInvoker<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse> checkDataBaseConfigInvoker(
        CheckDataBaseConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.checkDataBaseConfig, hcClient);
    }

    /**
     * StarRocks资源检查
     *
     * StarRocks资源检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckStarRocksResourceRequest 请求对象
     * @return CheckStarRocksResourceResponse
     */
    public CheckStarRocksResourceResponse checkStarRocksResource(CheckStarRocksResourceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.checkStarRocksResource);
    }

    /**
     * StarRocks资源检查
     *
     * StarRocks资源检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckStarRocksResourceRequest 请求对象
     * @return SyncInvoker<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse>
     */
    public SyncInvoker<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse> checkStarRocksResourceInvoker(
        CheckStarRocksResourceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.checkStarRocksResource, hcClient);
    }

    /**
     * HTAP数据同步表配置校验
     *
     * HTAP数据同步表配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableConfigRequest 请求对象
     * @return CheckTableConfigResponse
     */
    public CheckTableConfigResponse checkTableConfig(CheckTableConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.checkTableConfig);
    }

    /**
     * HTAP数据同步表配置校验
     *
     * HTAP数据同步表配置校验。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckTableConfigRequest 请求对象
     * @return SyncInvoker<CheckTableConfigRequest, CheckTableConfigResponse>
     */
    public SyncInvoker<CheckTableConfigRequest, CheckTableConfigResponse> checkTableConfigInvoker(
        CheckTableConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.checkTableConfig, hcClient);
    }

    /**
     * 创建StarRocks数据同步
     *
     * 创建StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDataReplicationRequest 请求对象
     * @return CreateStarRocksDataReplicationResponse
     */
    public CreateStarRocksDataReplicationResponse createStarRocksDataReplication(
        CreateStarRocksDataReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createStarRocksDataReplication);
    }

    /**
     * 创建StarRocks数据同步
     *
     * 创建StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDataReplicationRequest 请求对象
     * @return SyncInvoker<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse>
     */
    public SyncInvoker<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse> createStarRocksDataReplicationInvoker(
        CreateStarRocksDataReplicationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createStarRocksDataReplication, hcClient);
    }

    /**
     * 创建数据库账号
     *
     * 创建StarRocks数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDatabaseUserRequest 请求对象
     * @return CreateStarRocksDatabaseUserResponse
     */
    public CreateStarRocksDatabaseUserResponse createStarRocksDatabaseUser(CreateStarRocksDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createStarRocksDatabaseUser);
    }

    /**
     * 创建数据库账号
     *
     * 创建StarRocks数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarRocksDatabaseUserRequest 请求对象
     * @return SyncInvoker<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse>
     */
    public SyncInvoker<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse> createStarRocksDatabaseUserInvoker(
        CreateStarRocksDatabaseUserRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createStarRocksDatabaseUser, hcClient);
    }

    /**
     * 创建StarRocks实例
     *
     * 创建StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarrocksInstanceRequest 请求对象
     * @return CreateStarrocksInstanceResponse
     */
    public CreateStarrocksInstanceResponse createStarrocksInstance(CreateStarrocksInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.createStarrocksInstance);
    }

    /**
     * 创建StarRocks实例
     *
     * 创建StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStarrocksInstanceRequest 请求对象
     * @return SyncInvoker<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse>
     */
    public SyncInvoker<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse> createStarrocksInstanceInvoker(
        CreateStarrocksInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.createStarrocksInstance, hcClient);
    }

    /**
     * 删除StarRocks数据同步
     *
     * 删除StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDataReplicationRequest 请求对象
     * @return DeleteStarRocksDataReplicationResponse
     */
    public DeleteStarRocksDataReplicationResponse deleteStarRocksDataReplication(
        DeleteStarRocksDataReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteStarRocksDataReplication);
    }

    /**
     * 删除StarRocks数据同步
     *
     * 删除StarRocks数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDataReplicationRequest 请求对象
     * @return SyncInvoker<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse>
     */
    public SyncInvoker<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse> deleteStarRocksDataReplicationInvoker(
        DeleteStarRocksDataReplicationRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteStarRocksDataReplication, hcClient);
    }

    /**
     * 删除数据库账户
     *
     * 删除StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDatabaseUserRequest 请求对象
     * @return DeleteStarRocksDatabaseUserResponse
     */
    public DeleteStarRocksDatabaseUserResponse deleteStarRocksDatabaseUser(DeleteStarRocksDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteStarRocksDatabaseUser);
    }

    /**
     * 删除数据库账户
     *
     * 删除StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarRocksDatabaseUserRequest 请求对象
     * @return SyncInvoker<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse>
     */
    public SyncInvoker<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse> deleteStarRocksDatabaseUserInvoker(
        DeleteStarRocksDatabaseUserRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteStarRocksDatabaseUser, hcClient);
    }

    /**
     * 删除StarRocks实例
     *
     * 删除StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarrocksInstanceRequest 请求对象
     * @return DeleteStarrocksInstanceResponse
     */
    public DeleteStarrocksInstanceResponse deleteStarrocksInstance(DeleteStarrocksInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteStarrocksInstance);
    }

    /**
     * 删除StarRocks实例
     *
     * 删除StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStarrocksInstanceRequest 请求对象
     * @return SyncInvoker<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse>
     */
    public SyncInvoker<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse> deleteStarrocksInstanceInvoker(
        DeleteStarrocksInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteStarrocksInstance, hcClient);
    }

    /**
     * HTAP引擎资源查询
     *
     * HTAP引擎资源查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapDataStoreRequest 请求对象
     * @return ListHtapDataStoreResponse
     */
    public ListHtapDataStoreResponse listHtapDataStore(ListHtapDataStoreRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listHtapDataStore);
    }

    /**
     * HTAP引擎资源查询
     *
     * HTAP引擎资源查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapDataStoreRequest 请求对象
     * @return SyncInvoker<ListHtapDataStoreRequest, ListHtapDataStoreResponse>
     */
    public SyncInvoker<ListHtapDataStoreRequest, ListHtapDataStoreResponse> listHtapDataStoreInvoker(
        ListHtapDataStoreRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listHtapDataStore, hcClient);
    }

    /**
     * HTAP查询规格信息
     *
     * HTAP查询规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapFlavorRequest 请求对象
     * @return ListHtapFlavorResponse
     */
    public ListHtapFlavorResponse listHtapFlavor(ListHtapFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listHtapFlavor);
    }

    /**
     * HTAP查询规格信息
     *
     * HTAP查询规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapFlavorRequest 请求对象
     * @return SyncInvoker<ListHtapFlavorRequest, ListHtapFlavorResponse>
     */
    public SyncInvoker<ListHtapFlavorRequest, ListHtapFlavorResponse> listHtapFlavorInvoker(
        ListHtapFlavorRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listHtapFlavor, hcClient);
    }

    /**
     * 查询HTAP实例列表
     *
     * 查询HTAP实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapInstanceInfoRequest 请求对象
     * @return ListHtapInstanceInfoResponse
     */
    public ListHtapInstanceInfoResponse listHtapInstanceInfo(ListHtapInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listHtapInstanceInfo);
    }

    /**
     * 查询HTAP实例列表
     *
     * 查询HTAP实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapInstanceInfoRequest 请求对象
     * @return SyncInvoker<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse>
     */
    public SyncInvoker<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse> listHtapInstanceInfoInvoker(
        ListHtapInstanceInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listHtapInstanceInfo, hcClient);
    }

    /**
     * 获取HTAP实例存储类型
     *
     * 获取HTAP实例存储类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapStorageTypeRequest 请求对象
     * @return ListHtapStorageTypeResponse
     */
    public ListHtapStorageTypeResponse listHtapStorageType(ListHtapStorageTypeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listHtapStorageType);
    }

    /**
     * 获取HTAP实例存储类型
     *
     * 获取HTAP实例存储类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHtapStorageTypeRequest 请求对象
     * @return SyncInvoker<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse>
     */
    public SyncInvoker<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse> listHtapStorageTypeInvoker(
        ListHtapStorageTypeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listHtapStorageType, hcClient);
    }

    /**
     * 查询StarRocks数据库
     *
     * 查询StarRocks数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataBasesRequest 请求对象
     * @return ListStarRocksDataBasesResponse
     */
    public ListStarRocksDataBasesResponse listStarRocksDataBases(ListStarRocksDataBasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listStarRocksDataBases);
    }

    /**
     * 查询StarRocks数据库
     *
     * 查询StarRocks数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataBasesRequest 请求对象
     * @return SyncInvoker<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse>
     */
    public SyncInvoker<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse> listStarRocksDataBasesInvoker(
        ListStarRocksDataBasesRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listStarRocksDataBases, hcClient);
    }

    /**
     * 查询StarRocks数据同步配置信息
     *
     * 查询StarRocks数据同步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationConfigRequest 请求对象
     * @return ListStarRocksDataReplicationConfigResponse
     */
    public ListStarRocksDataReplicationConfigResponse listStarRocksDataReplicationConfig(
        ListStarRocksDataReplicationConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listStarRocksDataReplicationConfig);
    }

    /**
     * 查询StarRocks数据同步配置信息
     *
     * 查询StarRocks数据同步配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationConfigRequest 请求对象
     * @return SyncInvoker<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse>
     */
    public SyncInvoker<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse> listStarRocksDataReplicationConfigInvoker(
        ListStarRocksDataReplicationConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listStarRocksDataReplicationConfig, hcClient);
    }

    /**
     * 查询StarRocks数据同步状态信息
     *
     * 查询StarRocks数据同步状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationsRequest 请求对象
     * @return ListStarRocksDataReplicationsResponse
     */
    public ListStarRocksDataReplicationsResponse listStarRocksDataReplications(
        ListStarRocksDataReplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listStarRocksDataReplications);
    }

    /**
     * 查询StarRocks数据同步状态信息
     *
     * 查询StarRocks数据同步状态信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDataReplicationsRequest 请求对象
     * @return SyncInvoker<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse>
     */
    public SyncInvoker<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse> listStarRocksDataReplicationsInvoker(
        ListStarRocksDataReplicationsRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listStarRocksDataReplications, hcClient);
    }

    /**
     * 查询StarRocks数据同步的库参数配置
     *
     * 查询StarRocks数据同步的库参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDbParametersRequest 请求对象
     * @return ListStarRocksDbParametersResponse
     */
    public ListStarRocksDbParametersResponse listStarRocksDbParameters(ListStarRocksDbParametersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listStarRocksDbParameters);
    }

    /**
     * 查询StarRocks数据同步的库参数配置
     *
     * 查询StarRocks数据同步的库参数配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarRocksDbParametersRequest 请求对象
     * @return SyncInvoker<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse>
     */
    public SyncInvoker<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse> listStarRocksDbParametersInvoker(
        ListStarRocksDbParametersRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listStarRocksDbParameters, hcClient);
    }

    /**
     * 查询StarRocks实例
     *
     * 查询StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarrocksInstanceInfoRequest 请求对象
     * @return ListStarrocksInstanceInfoResponse
     */
    public ListStarrocksInstanceInfoResponse listStarrocksInstanceInfo(ListStarrocksInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.listStarrocksInstanceInfo);
    }

    /**
     * 查询StarRocks实例
     *
     * 查询StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStarrocksInstanceInfoRequest 请求对象
     * @return SyncInvoker<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse>
     */
    public SyncInvoker<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse> listStarrocksInstanceInfoInvoker(
        ListStarrocksInstanceInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.listStarrocksInstanceInfo, hcClient);
    }

    /**
     * 重启StarRocks实例
     *
     * 重启StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksInstanceRequest 请求对象
     * @return RestartStarrocksInstanceResponse
     */
    public RestartStarrocksInstanceResponse restartStarrocksInstance(RestartStarrocksInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restartStarrocksInstance);
    }

    /**
     * 重启StarRocks实例
     *
     * 重启StarRocks实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksInstanceRequest 请求对象
     * @return SyncInvoker<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse>
     */
    public SyncInvoker<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse> restartStarrocksInstanceInvoker(
        RestartStarrocksInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.restartStarrocksInstance, hcClient);
    }

    /**
     * 重启StarRocks节点
     *
     * 重启StarRocks节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksNodeRequest 请求对象
     * @return RestartStarrocksNodeResponse
     */
    public RestartStarrocksNodeResponse restartStarrocksNode(RestartStarrocksNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.restartStarrocksNode);
    }

    /**
     * 重启StarRocks节点
     *
     * 重启StarRocks节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartStarrocksNodeRequest 请求对象
     * @return SyncInvoker<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse>
     */
    public SyncInvoker<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse> restartStarrocksNodeInvoker(
        RestartStarrocksNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.restartStarrocksNode, hcClient);
    }

    /**
     * 查询数据库账户
     *
     * 查询StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStarRocksDatabaseUserRequest 请求对象
     * @return ShowStarRocksDatabaseUserResponse
     */
    public ShowStarRocksDatabaseUserResponse showStarRocksDatabaseUser(ShowStarRocksDatabaseUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showStarRocksDatabaseUser);
    }

    /**
     * 查询数据库账户
     *
     * 查询StarRocks数据库账户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStarRocksDatabaseUserRequest 请求对象
     * @return SyncInvoker<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse>
     */
    public SyncInvoker<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse> showStarRocksDatabaseUserInvoker(
        ShowStarRocksDatabaseUserRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showStarRocksDatabaseUser, hcClient);
    }

    /**
     * 修改数据库账号密码
     *
     * 修改StarRocks数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPasswordRequest 请求对象
     * @return UpdateStarRocksDatabaseUserPasswordResponse
     */
    public UpdateStarRocksDatabaseUserPasswordResponse updateStarRocksDatabaseUserPassword(
        UpdateStarRocksDatabaseUserPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateStarRocksDatabaseUserPassword);
    }

    /**
     * 修改数据库账号密码
     *
     * 修改StarRocks数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPasswordRequest 请求对象
     * @return SyncInvoker<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse>
     */
    public SyncInvoker<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse> updateStarRocksDatabaseUserPasswordInvoker(
        UpdateStarRocksDatabaseUserPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateStarRocksDatabaseUserPassword, hcClient);
    }

    /**
     * 修改数据库账号权限
     *
     * 修改StarRocks数据库账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPermissionRequest 请求对象
     * @return UpdateStarRocksDatabaseUserPermissionResponse
     */
    public UpdateStarRocksDatabaseUserPermissionResponse updateStarRocksDatabaseUserPermission(
        UpdateStarRocksDatabaseUserPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateStarRocksDatabaseUserPermission);
    }

    /**
     * 修改数据库账号权限
     *
     * 修改StarRocks数据库账号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStarRocksDatabaseUserPermissionRequest 请求对象
     * @return SyncInvoker<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse>
     */
    public SyncInvoker<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse> updateStarRocksDatabaseUserPermissionInvoker(
        UpdateStarRocksDatabaseUserPermissionRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateStarRocksDatabaseUserPermission, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlFilterRuleRequest 请求对象
     * @return DeleteSqlFilterRuleResponse
     */
    public DeleteSqlFilterRuleResponse deleteSqlFilterRule(DeleteSqlFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.deleteSqlFilterRule);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlFilterRuleRequest 请求对象
     * @return SyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse>
     */
    public SyncInvoker<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRuleInvoker(
        DeleteSqlFilterRuleRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.deleteSqlFilterRule, hcClient);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlFilterRuleRequest 请求对象
     * @return SetSqlFilterRuleResponse
     */
    public SetSqlFilterRuleResponse setSqlFilterRule(SetSqlFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.setSqlFilterRule);
    }

    /**
     * 设置SQL限流规则
     *
     * 设置SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlFilterRuleRequest 请求对象
     * @return SyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse>
     */
    public SyncInvoker<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRuleInvoker(
        SetSqlFilterRuleRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.setSqlFilterRule, hcClient);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterControlRequest 请求对象
     * @return ShowSqlFilterControlResponse
     */
    public ShowSqlFilterControlResponse showSqlFilterControl(ShowSqlFilterControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showSqlFilterControl);
    }

    /**
     * 查询SQL限流开关状态
     *
     * 查询SQL限流开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterControlRequest 请求对象
     * @return SyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse>
     */
    public SyncInvoker<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControlInvoker(
        ShowSqlFilterControlRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showSqlFilterControl, hcClient);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterRuleRequest 请求对象
     * @return ShowSqlFilterRuleResponse
     */
    public ShowSqlFilterRuleResponse showSqlFilterRule(ShowSqlFilterRuleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.showSqlFilterRule);
    }

    /**
     * 查询SQL限流规则
     *
     * 查询SQL限流规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlFilterRuleRequest 请求对象
     * @return SyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse>
     */
    public SyncInvoker<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRuleInvoker(
        ShowSqlFilterRuleRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.showSqlFilterRule, hcClient);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlFilterControlRequest 请求对象
     * @return UpdateSqlFilterControlResponse
     */
    public UpdateSqlFilterControlResponse updateSqlFilterControl(UpdateSqlFilterControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBMeta.updateSqlFilterControl);
    }

    /**
     * 开启或者关闭SQL限流
     *
     * 开启或者关闭SQL限流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlFilterControlRequest 请求对象
     * @return SyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse>
     */
    public SyncInvoker<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControlInvoker(
        UpdateSqlFilterControlRequest request) {
        return new SyncInvoker<>(request, GaussDBMeta.updateSqlFilterControl, hcClient);
    }

}

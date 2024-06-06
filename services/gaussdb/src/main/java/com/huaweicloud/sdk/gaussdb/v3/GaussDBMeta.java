package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.AddDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ApplyConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.BackupEncryptRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchOperateInstanceTagRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.BatchTagActionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelGaussMySqlInstanceEipResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTask;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlInstanceSpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ChangeGaussMySqlProxySpecificationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckDataBaseConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckDataBaseConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckResourceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckStarRocksResourceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckStarRocksResourceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckTableConfigRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CheckTableConfigResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CloseMysqlProxyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CopyInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateAccessControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateConfigurationRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateDnsNameReq;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateGaussMySqlDatabaseRequestBody;
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
import com.huaweicloud.sdk.gaussdb.v3.model.CreateLtsConfigs;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateRestoreTablesResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplication;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplicationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDataReplicationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarRocksDatabaseUserResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateStarrocksInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DbConfigCheckRequestV3;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabaseUserRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlBackupResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteGaussMySqlDatabaseRequestBody;
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
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteLtsConfigsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteScheduleTasKResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleReq;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteSqlFilterRuleResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteStarRocksDataReplication;
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
import com.huaweicloud.sdk.gaussdb.v3.model.EnlargeProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlInstanceVolumeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ExpandGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.GrantDatabasePermissionRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.InvokeGaussMySqlInstanceSwitchOverResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListAuditLogDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListAuditLogDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ListConfigurationsDifferencesRequestBody;
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
import com.huaweicloud.sdk.gaussdb.v3.model.LtsLogErrorQueryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.LtsLogSlowQueryRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyAliasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBackupEncryptStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyBindEipRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyDnsNameReq;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMySqlProxyRouteModeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyGaussMysqlDnsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyInternalIpRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyNodePriorityRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyNodePriorityRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyNodePriorityResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyOpsWindow;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyPortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifyProxyConsistRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ModifySecurityGroupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlChangeSpecificationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlCreateBackupRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlCreateReadonlyNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlExtendInstanceVolumeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlResetPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlUpdateBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlUpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.OpenMysqlProxyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.OperateAuditLogRequestV3Body;
import com.huaweicloud.sdk.gaussdb.v3.model.OperateSqlFilterControlReq;
import com.huaweicloud.sdk.gaussdb.v3.model.OperateSqlFilterRuleReq;
import com.huaweicloud.sdk.gaussdb.v3.model.ProxyTransactionSplitRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ProxyUpdateProxyConnectionPoolTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ProxyUpdateProxyNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ProxyUpgradeProxyVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RenameInstanceNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RenameInstanceNodeRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.RenameInstanceNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlDatabasePasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetGaussMySqlPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.ResourceCheck;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartGaussMySqlNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartProxyInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartProxyInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksNodeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestartStarrocksNodeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreOldInstanceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.RestoreRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlProxyWeightResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetGaussMySqlQuotasResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SetQuotasRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.SetRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SetRecyclePolicyRequestBody;
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
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.ShrinkGaussMySqlProxyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.StarRocksCreateRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.StarRocksDatabaseUserInfo;
import com.huaweicloud.sdk.gaussdb.v3.model.StarRocksDatabaseUserPSinfo;
import com.huaweicloud.sdk.gaussdb.v3.model.StarRocksDatabaseUserPWinfo;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchAccessControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlConfigurationResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlInstanceSslResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlProxySslRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchGaussMySqlProxySslResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchProxySSLRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.SwitchSSLRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TableConfigCheckRequestV3;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusModifyInstanceMonitorRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusModifyProxyWeightRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusProxyScaleRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusRestartInstanceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.TaurusSwitchoverRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAuditLogResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateAutoScalingPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateBackupOffsitePolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateConfigurationParameterRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateDatabaseCommentRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateDatabaseUserCommentRequest;
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
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateNewNodeAutoAddSwitchRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateNewNodeAutoAddSwitchRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateNewNodeAutoAddSwitchResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyConnectionPoolTypeResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNameRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNameResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigurationsRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyNewConfigurationsResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxyPortResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateProxySessionConsistenceResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateServerlessPolicy;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateServerlessPolicyRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateServerlessPolicyResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSlowlogSensitiveSwitchRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSlowlogSensitiveSwitchRequestBody;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSlowlogSensitiveSwitchResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateSqlFilterControlResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPasswordRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPasswordResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPermissionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateStarRocksDatabaseUserPermissionResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpdateTransactionSplitStatusResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeGaussMySqlInstanceDatabaseResponse;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeProxyVersionRequest;
import com.huaweicloud.sdk.gaussdb.v3.model.UpgradeProxyVersionResponse;

@SuppressWarnings("unchecked")
public class GaussDBMeta {

    public static final HttpRequestDef<AddDatabasePermissionRequest, AddDatabasePermissionResponse> addDatabasePermission =
        genForAddDatabasePermission();

    private static HttpRequestDef<AddDatabasePermissionRequest, AddDatabasePermissionResponse> genForAddDatabasePermission() {
        // basic
        HttpRequestDef.Builder<AddDatabasePermissionRequest, AddDatabasePermissionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddDatabasePermissionRequest.class, AddDatabasePermissionResponse.class)
            .withName("AddDatabasePermission")
            .withUri("/v3/{project_id}/instances/{instance_id}/db-users/privilege")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getInstanceId,
                AddDatabasePermissionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getXLanguage,
                AddDatabasePermissionRequest::setXLanguage));
        builder.<GrantDatabasePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantDatabasePermissionRequestBody.class),
            f -> f.withMarshaller(AddDatabasePermissionRequest::getBody, AddDatabasePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> batchTagAction =
        genForBatchTagAction();

    private static HttpRequestDef<BatchTagActionRequest, BatchTagActionResponse> genForBatchTagAction() {
        // basic
        HttpRequestDef.Builder<BatchTagActionRequest, BatchTagActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagActionRequest.class, BatchTagActionResponse.class)
                .withName("BatchTagAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getInstanceId, BatchTagActionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagActionRequest::getXLanguage, BatchTagActionRequest::setXLanguage));
        builder.<BatchOperateInstanceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateInstanceTagRequestBody.class),
            f -> f.withMarshaller(BatchTagActionRequest::getBody, BatchTagActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> cancelGaussMySqlInstanceEip =
        genForCancelGaussMySqlInstanceEip();

    private static HttpRequestDef<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> genForCancelGaussMySqlInstanceEip() {
        // basic
        HttpRequestDef.Builder<CancelGaussMySqlInstanceEipRequest, CancelGaussMySqlInstanceEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CancelGaussMySqlInstanceEipRequest.class,
                    CancelGaussMySqlInstanceEipResponse.class)
                .withName("CancelGaussMySqlInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips/unbind")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGaussMySqlInstanceEipRequest::getInstanceId,
                CancelGaussMySqlInstanceEipRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelGaussMySqlInstanceEipRequest::getXLanguage,
                CancelGaussMySqlInstanceEipRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> cancelScheduleTask =
        genForCancelScheduleTask();

    private static HttpRequestDef<CancelScheduleTaskRequest, CancelScheduleTaskResponse> genForCancelScheduleTask() {
        // basic
        HttpRequestDef.Builder<CancelScheduleTaskRequest, CancelScheduleTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CancelScheduleTaskRequest.class, CancelScheduleTaskResponse.class)
                .withName("CancelScheduleTask")
                .withUri("/v3/{project_id}/scheduled-jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getXLanguage, CancelScheduleTaskRequest::setXLanguage));
        builder.<CancelScheduleTask>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelScheduleTask.class),
            f -> f.withMarshaller(CancelScheduleTaskRequest::getBody, CancelScheduleTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecification =
        genForChangeGaussMySqlInstanceSpecification();

    private static HttpRequestDef<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> genForChangeGaussMySqlInstanceSpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeGaussMySqlInstanceSpecificationRequest.class,
                    ChangeGaussMySqlInstanceSpecificationResponse.class)
                .withName("ChangeGaussMySqlInstanceSpecification")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getInstanceId,
                ChangeGaussMySqlInstanceSpecificationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getXLanguage,
                ChangeGaussMySqlInstanceSpecificationRequest::setXLanguage));
        builder.<MysqlChangeSpecificationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlChangeSpecificationRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlInstanceSpecificationRequest::getBody,
                ChangeGaussMySqlInstanceSpecificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> changeGaussMySqlProxySpecification =
        genForChangeGaussMySqlProxySpecification();

    private static HttpRequestDef<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> genForChangeGaussMySqlProxySpecification() {
        // basic
        HttpRequestDef.Builder<ChangeGaussMySqlProxySpecificationRequest, ChangeGaussMySqlProxySpecificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeGaussMySqlProxySpecificationRequest.class,
                    ChangeGaussMySqlProxySpecificationResponse.class)
                .withName("ChangeGaussMySqlProxySpecification")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/flavor")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getInstanceId,
                ChangeGaussMySqlProxySpecificationRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getProxyId,
                ChangeGaussMySqlProxySpecificationRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getXLanguage,
                ChangeGaussMySqlProxySpecificationRequest::setXLanguage));
        builder.<TaurusProxyScaleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusProxyScaleRequest.class),
            f -> f.withMarshaller(ChangeGaussMySqlProxySpecificationRequest::getBody,
                ChangeGaussMySqlProxySpecificationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckResourceRequest, CheckResourceResponse> checkResource =
        genForCheckResource();

    private static HttpRequestDef<CheckResourceRequest, CheckResourceResponse> genForCheckResource() {
        // basic
        HttpRequestDef.Builder<CheckResourceRequest, CheckResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckResourceRequest.class, CheckResourceResponse.class)
                .withName("CheckResource")
                .withUri("/v3/{project_id}/resource-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckResourceRequest::getXLanguage, CheckResourceRequest::setXLanguage));
        builder.<CheckResourceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckResourceRequestBody.class),
            f -> f.withMarshaller(CheckResourceRequest::getBody, CheckResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationsRequest, CopyConfigurationsResponse> copyConfigurations =
        genForCopyConfigurations();

    private static HttpRequestDef<CopyConfigurationsRequest, CopyConfigurationsResponse> genForCopyConfigurations() {
        // basic
        HttpRequestDef.Builder<CopyConfigurationsRequest, CopyConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyConfigurationsRequest.class, CopyConfigurationsResponse.class)
                .withName("CopyConfigurations")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationsRequest::getConfigurationId,
                CopyConfigurationsRequest::setConfigurationId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationsRequest::getXLanguage, CopyConfigurationsRequest::setXLanguage));
        builder.<CopyConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyConfigurationsRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationsRequest::getBody, CopyConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> copyInstanceConfigurations =
        genForCopyInstanceConfigurations();

    private static HttpRequestDef<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> genForCopyInstanceConfigurations() {
        // basic
        HttpRequestDef.Builder<CopyInstanceConfigurationsRequest, CopyInstanceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CopyInstanceConfigurationsRequest.class,
                    CopyInstanceConfigurationsResponse.class)
                .withName("CopyInstanceConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations/{configuration_id}/copy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getInstanceId,
                CopyInstanceConfigurationsRequest::setInstanceId));
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getConfigurationId,
                CopyInstanceConfigurationsRequest::setConfigurationId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getXLanguage,
                CopyInstanceConfigurationsRequest::setXLanguage));
        builder.<CopyInstanceConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyInstanceConfigurationsRequestBody.class),
            f -> f.withMarshaller(CopyInstanceConfigurationsRequest::getBody,
                CopyInstanceConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessControlRequest, CreateAccessControlResponse> createAccessControl =
        genForCreateAccessControl();

    private static HttpRequestDef<CreateAccessControlRequest, CreateAccessControlResponse> genForCreateAccessControl() {
        // basic
        HttpRequestDef.Builder<CreateAccessControlRequest, CreateAccessControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessControlRequest.class, CreateAccessControlResponse.class)
                .withName("CreateAccessControl")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/access-control")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getInstanceId,
                CreateAccessControlRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getProxyId, CreateAccessControlRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getXLanguage, CreateAccessControlRequest::setXLanguage));
        builder.<CreateAccessControlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccessControlRequestBody.class),
            f -> f.withMarshaller(CreateAccessControlRequest::getBody, CreateAccessControlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackup =
        genForCreateGaussMySqlBackup();

    private static HttpRequestDef<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> genForCreateGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussMySqlBackupRequest.class, CreateGaussMySqlBackupResponse.class)
            .withName("CreateGaussMySqlBackup")
            .withUri("/v3/{project_id}/backups/create")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getXLanguage,
                CreateGaussMySqlBackupRequest::setXLanguage));
        builder.<MysqlCreateBackupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateBackupRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlBackupRequest::getBody, CreateGaussMySqlBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> createGaussMySqlConfiguration =
        genForCreateGaussMySqlConfiguration();

    private static HttpRequestDef<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> genForCreateGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlConfigurationRequest, CreateGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlConfigurationRequest.class,
                    CreateGaussMySqlConfigurationResponse.class)
                .withName("CreateGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlConfigurationRequest::getXLanguage,
                CreateGaussMySqlConfigurationRequest::setXLanguage));
        builder.<CreateConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigurationRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlConfigurationRequest::getBody,
                CreateGaussMySqlConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> createGaussMySqlDatabase =
        genForCreateGaussMySqlDatabase();

    private static HttpRequestDef<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> genForCreateGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlDatabaseRequest, CreateGaussMySqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGaussMySqlDatabaseRequest.class, CreateGaussMySqlDatabaseResponse.class)
                .withName("CreateGaussMySqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getInstanceId,
                CreateGaussMySqlDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getXLanguage,
                CreateGaussMySqlDatabaseRequest::setXLanguage));
        builder.<CreateGaussMySqlDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGaussMySqlDatabaseRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseRequest::getBody, CreateGaussMySqlDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> createGaussMySqlDatabaseUser =
        genForCreateGaussMySqlDatabaseUser();

    private static HttpRequestDef<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> genForCreateGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlDatabaseUserRequest, CreateGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlDatabaseUserRequest.class,
                    CreateGaussMySqlDatabaseUserResponse.class)
                .withName("CreateGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getInstanceId,
                CreateGaussMySqlDatabaseUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getXLanguage,
                CreateGaussMySqlDatabaseUserRequest::setXLanguage));
        builder.<CreateDatabaseUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDatabaseUserRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlDatabaseUserRequest::getBody,
                CreateGaussMySqlDatabaseUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstance =
        genForCreateGaussMySqlInstance();

    private static HttpRequestDef<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> genForCreateGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateGaussMySqlInstanceRequest.class, CreateGaussMySqlInstanceResponse.class)
                .withName("CreateGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getXLanguage,
                CreateGaussMySqlInstanceRequest::setXLanguage));
        builder.<MysqlInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlInstanceRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlInstanceRequest::getBody, CreateGaussMySqlInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxy =
        genForCreateGaussMySqlProxy();

    private static HttpRequestDef<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> genForCreateGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGaussMySqlProxyRequest.class, CreateGaussMySqlProxyResponse.class)
            .withName("CreateGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getInstanceId,
                CreateGaussMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getXLanguage,
                CreateGaussMySqlProxyRequest::setXLanguage));
        builder.<OpenMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OpenMysqlProxyRequestBody.class),
            f -> f.withMarshaller(CreateGaussMySqlProxyRequest::getBody, CreateGaussMySqlProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNode =
        genForCreateGaussMySqlReadonlyNode();

    private static HttpRequestDef<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> genForCreateGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateGaussMySqlReadonlyNodeRequest.class,
                    CreateGaussMySqlReadonlyNodeResponse.class)
                .withName("CreateGaussMySqlReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/enlarge")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getInstanceId,
                CreateGaussMySqlReadonlyNodeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getXLanguage,
                CreateGaussMySqlReadonlyNodeRequest::setXLanguage));
        builder.<MysqlCreateReadonlyNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlCreateReadonlyNodeRequest.class),
            f -> f.withMarshaller(CreateGaussMySqlReadonlyNodeRequest::getBody,
                CreateGaussMySqlReadonlyNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> createGaussMysqlDns =
        genForCreateGaussMysqlDns();

    private static HttpRequestDef<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> genForCreateGaussMysqlDns() {
        // basic
        HttpRequestDef.Builder<CreateGaussMysqlDnsRequest, CreateGaussMysqlDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGaussMysqlDnsRequest.class, CreateGaussMysqlDnsResponse.class)
                .withName("CreateGaussMysqlDns")
                .withUri("/v3/{project_id}/instances/{instance_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMysqlDnsRequest::getInstanceId,
                CreateGaussMysqlDnsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGaussMysqlDnsRequest::getXLanguage, CreateGaussMysqlDnsRequest::setXLanguage));
        builder.<CreateDnsNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDnsNameReq.class),
            f -> f.withMarshaller(CreateGaussMysqlDnsRequest::getBody, CreateGaussMysqlDnsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLtsConfigsRequest, CreateLtsConfigsResponse> createLtsConfigs =
        genForCreateLtsConfigs();

    private static HttpRequestDef<CreateLtsConfigsRequest, CreateLtsConfigsResponse> genForCreateLtsConfigs() {
        // basic
        HttpRequestDef.Builder<CreateLtsConfigsRequest, CreateLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLtsConfigsRequest.class, CreateLtsConfigsResponse.class)
                .withName("CreateLtsConfigs")
                .withUri("/v3/{project_id}/logs/lts-configs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLtsConfigsRequest::getXLanguage, CreateLtsConfigsRequest::setXLanguage));
        builder.<CreateLtsConfigs>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLtsConfigs.class),
            f -> f.withMarshaller(CreateLtsConfigsRequest::getBody, CreateLtsConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRestoreTablesRequest, CreateRestoreTablesResponse> createRestoreTables =
        genForCreateRestoreTables();

    private static HttpRequestDef<CreateRestoreTablesRequest, CreateRestoreTablesResponse> genForCreateRestoreTables() {
        // basic
        HttpRequestDef.Builder<CreateRestoreTablesRequest, CreateRestoreTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRestoreTablesRequest.class, CreateRestoreTablesResponse.class)
                .withName("CreateRestoreTables")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restore/tables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRestoreTablesRequest::getInstanceId,
                CreateRestoreTablesRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRestoreTablesRequest::getXLanguage, CreateRestoreTablesRequest::setXLanguage));
        builder.<CreateRestoreTablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRestoreTablesRequestBody.class),
            f -> f.withMarshaller(CreateRestoreTablesRequest::getBody, CreateRestoreTablesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> deleteDatabasePermission =
        genForDeleteDatabasePermission();

    private static HttpRequestDef<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> genForDeleteDatabasePermission() {
        // basic
        HttpRequestDef.Builder<DeleteDatabasePermissionRequest, DeleteDatabasePermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDatabasePermissionRequest.class,
                    DeleteDatabasePermissionResponse.class)
                .withName("DeleteDatabasePermission")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/privilege")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getInstanceId,
                DeleteDatabasePermissionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getXLanguage,
                DeleteDatabasePermissionRequest::setXLanguage));
        builder.<DeleteDatabasePermissionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabasePermissionRequestBody.class),
            f -> f.withMarshaller(DeleteDatabasePermissionRequest::getBody, DeleteDatabasePermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> deleteGaussMySqlBackup =
        genForDeleteGaussMySqlBackup();

    private static HttpRequestDef<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> genForDeleteGaussMySqlBackup() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlBackupRequest, DeleteGaussMySqlBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGaussMySqlBackupRequest.class, DeleteGaussMySqlBackupResponse.class)
            .withName("DeleteGaussMySqlBackup")
            .withUri("/v3/{project_id}/backups/{backup_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlBackupRequest::getBackupId,
                DeleteGaussMySqlBackupRequest::setBackupId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlBackupRequest::getXLanguage,
                DeleteGaussMySqlBackupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> deleteGaussMySqlConfiguration =
        genForDeleteGaussMySqlConfiguration();

    private static HttpRequestDef<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> genForDeleteGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlConfigurationRequest, DeleteGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlConfigurationRequest.class,
                    DeleteGaussMySqlConfigurationResponse.class)
                .withName("DeleteGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlConfigurationRequest::getConfigurationId,
                DeleteGaussMySqlConfigurationRequest::setConfigurationId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlConfigurationRequest::getXLanguage,
                DeleteGaussMySqlConfigurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> deleteGaussMySqlDatabase =
        genForDeleteGaussMySqlDatabase();

    private static HttpRequestDef<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> genForDeleteGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlDatabaseRequest, DeleteGaussMySqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlDatabaseRequest.class,
                    DeleteGaussMySqlDatabaseResponse.class)
                .withName("DeleteGaussMySqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getInstanceId,
                DeleteGaussMySqlDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getXLanguage,
                DeleteGaussMySqlDatabaseRequest::setXLanguage));
        builder.<DeleteGaussMySqlDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteGaussMySqlDatabaseRequestBody.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseRequest::getBody, DeleteGaussMySqlDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> deleteGaussMySqlDatabaseUser =
        genForDeleteGaussMySqlDatabaseUser();

    private static HttpRequestDef<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> genForDeleteGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlDatabaseUserRequest, DeleteGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlDatabaseUserRequest.class,
                    DeleteGaussMySqlDatabaseUserResponse.class)
                .withName("DeleteGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getInstanceId,
                DeleteGaussMySqlDatabaseUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getXLanguage,
                DeleteGaussMySqlDatabaseUserRequest::setXLanguage));
        builder.<DeleteDatabaseUserRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDatabaseUserRequest.class),
            f -> f.withMarshaller(DeleteGaussMySqlDatabaseUserRequest::getBody,
                DeleteGaussMySqlDatabaseUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstance =
        genForDeleteGaussMySqlInstance();

    private static HttpRequestDef<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> genForDeleteGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlInstanceRequest.class,
                    DeleteGaussMySqlInstanceResponse.class)
                .withName("DeleteGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getInstanceId,
                DeleteGaussMySqlInstanceRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlInstanceRequest::getXLanguage,
                DeleteGaussMySqlInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxy =
        genForDeleteGaussMySqlProxy();

    private static HttpRequestDef<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> genForDeleteGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGaussMySqlProxyRequest.class, DeleteGaussMySqlProxyResponse.class)
            .withName("DeleteGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getInstanceId,
                DeleteGaussMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getXLanguage,
                DeleteGaussMySqlProxyRequest::setXLanguage));
        builder.<CloseMysqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CloseMysqlProxyRequestBody.class),
            f -> f.withMarshaller(DeleteGaussMySqlProxyRequest::getBody, DeleteGaussMySqlProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNode =
        genForDeleteGaussMySqlReadonlyNode();

    private static HttpRequestDef<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> genForDeleteGaussMySqlReadonlyNode() {
        // basic
        HttpRequestDef.Builder<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGaussMySqlReadonlyNodeRequest.class,
                    DeleteGaussMySqlReadonlyNodeResponse.class)
                .withName("DeleteGaussMySqlReadonlyNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getInstanceId,
                DeleteGaussMySqlReadonlyNodeRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getNodeId,
                DeleteGaussMySqlReadonlyNodeRequest::setNodeId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGaussMySqlReadonlyNodeRequest::getXLanguage,
                DeleteGaussMySqlReadonlyNodeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> deleteLtsConfigs =
        genForDeleteLtsConfigs();

    private static HttpRequestDef<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> genForDeleteLtsConfigs() {
        // basic
        HttpRequestDef.Builder<DeleteLtsConfigsRequest, DeleteLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLtsConfigsRequest.class, DeleteLtsConfigsResponse.class)
                .withName("DeleteLtsConfigs")
                .withUri("/v3/{project_id}/logs/lts-configs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLtsConfigsRequest::getXLanguage, DeleteLtsConfigsRequest::setXLanguage));
        builder.<DeleteLtsConfigsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLtsConfigsRequestBody.class),
            f -> f.withMarshaller(DeleteLtsConfigsRequest::getBody, DeleteLtsConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> deleteScheduleTasK =
        genForDeleteScheduleTasK();

    private static HttpRequestDef<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> genForDeleteScheduleTasK() {
        // basic
        HttpRequestDef.Builder<DeleteScheduleTasKRequest, DeleteScheduleTasKResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScheduleTasKRequest.class, DeleteScheduleTasKResponse.class)
                .withName("DeleteScheduleTasK")
                .withUri("/v3/{project_id}/instance/{instance_id}/scheduled-jobs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleTasKRequest::getInstanceId, DeleteScheduleTasKRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScheduleTasKRequest::getXLanguage, DeleteScheduleTasKRequest::setXLanguage));
        builder.<DeleteScheduleTasKRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteScheduleTasKRequestBody.class),
            f -> f.withMarshaller(DeleteScheduleTasKRequest::getBody, DeleteScheduleTasKRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTaskRecordRequest, DeleteTaskRecordResponse> deleteTaskRecord =
        genForDeleteTaskRecord();

    private static HttpRequestDef<DeleteTaskRecordRequest, DeleteTaskRecordResponse> genForDeleteTaskRecord() {
        // basic
        HttpRequestDef.Builder<DeleteTaskRecordRequest, DeleteTaskRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTaskRecordRequest.class, DeleteTaskRecordResponse.class)
                .withName("DeleteTaskRecord")
                .withUri("/v3/{project_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRecordRequest::getJobId, DeleteTaskRecordRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTaskRecordRequest::getXLanguage, DeleteTaskRecordRequest::setXLanguage));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTaskRecordResponse::getBody, DeleteTaskRecordResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> describeBackupEncryptStatus =
        genForDescribeBackupEncryptStatus();

    private static HttpRequestDef<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> genForDescribeBackupEncryptStatus() {
        // basic
        HttpRequestDef.Builder<DescribeBackupEncryptStatusRequest, DescribeBackupEncryptStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeBackupEncryptStatusRequest.class,
                    DescribeBackupEncryptStatusResponse.class)
                .withName("DescribeBackupEncryptStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/encryption")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeBackupEncryptStatusRequest::getInstanceId,
                DescribeBackupEncryptStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeBackupEncryptStatusRequest::getXLanguage,
                DescribeBackupEncryptStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolume =
        genForExpandGaussMySqlInstanceVolume();

    private static HttpRequestDef<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> genForExpandGaussMySqlInstanceVolume() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExpandGaussMySqlInstanceVolumeRequest.class,
                    ExpandGaussMySqlInstanceVolumeResponse.class)
                .withName("ExpandGaussMySqlInstanceVolume")
                .withUri("/v3/{project_id}/instances/{instance_id}/volume/extend")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getInstanceId,
                ExpandGaussMySqlInstanceVolumeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getXLanguage,
                ExpandGaussMySqlInstanceVolumeRequest::setXLanguage));
        builder.<MysqlExtendInstanceVolumeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlExtendInstanceVolumeRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlInstanceVolumeRequest::getBody,
                ExpandGaussMySqlInstanceVolumeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxy =
        genForExpandGaussMySqlProxy();

    private static HttpRequestDef<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> genForExpandGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExpandGaussMySqlProxyRequest.class, ExpandGaussMySqlProxyResponse.class)
            .withName("ExpandGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/enlarge")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getInstanceId,
                ExpandGaussMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getXLanguage,
                ExpandGaussMySqlProxyRequest::setXLanguage));
        builder.<EnlargeProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeProxyRequest.class),
            f -> f.withMarshaller(ExpandGaussMySqlProxyRequest::getBody, ExpandGaussMySqlProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> invokeGaussMySqlInstanceSwitchOver =
        genForInvokeGaussMySqlInstanceSwitchOver();

    private static HttpRequestDef<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> genForInvokeGaussMySqlInstanceSwitchOver() {
        // basic
        HttpRequestDef.Builder<InvokeGaussMySqlInstanceSwitchOverRequest, InvokeGaussMySqlInstanceSwitchOverResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    InvokeGaussMySqlInstanceSwitchOverRequest.class,
                    InvokeGaussMySqlInstanceSwitchOverResponse.class)
                .withName("InvokeGaussMySqlInstanceSwitchOver")
                .withUri("/v3/{project_id}/instances/{instance_id}/switchover")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getInstanceId,
                InvokeGaussMySqlInstanceSwitchOverRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getXLanguage,
                InvokeGaussMySqlInstanceSwitchOverRequest::setXLanguage));
        builder.<TaurusSwitchoverRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusSwitchoverRequest.class),
            f -> f.withMarshaller(InvokeGaussMySqlInstanceSwitchOverRequest::getBody,
                InvokeGaussMySqlInstanceSwitchOverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> listAuditLogDownloadLink =
        genForListAuditLogDownloadLink();

    private static HttpRequestDef<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> genForListAuditLogDownloadLink() {
        // basic
        HttpRequestDef.Builder<ListAuditLogDownloadLinkRequest, ListAuditLogDownloadLinkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAuditLogDownloadLinkRequest.class, ListAuditLogDownloadLinkResponse.class)
                .withName("ListAuditLogDownloadLink")
                .withUri("/v3/{project_id}/instance/{instance_id}/auditlog/download-link")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getInstanceId,
                ListAuditLogDownloadLinkRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getNodeId,
                ListAuditLogDownloadLinkRequest::setNodeId));
        builder.<String>withRequestField("last_file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getLastFileName,
                ListAuditLogDownloadLinkRequest::setLastFileName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getLimit,
                ListAuditLogDownloadLinkRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getStartTime,
                ListAuditLogDownloadLinkRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getEndTime,
                ListAuditLogDownloadLinkRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditLogDownloadLinkRequest::getXLanguage,
                ListAuditLogDownloadLinkRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> listConfigurationsDifferences =
        genForListConfigurationsDifferences();

    private static HttpRequestDef<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> genForListConfigurationsDifferences() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsDifferencesRequest, ListConfigurationsDifferencesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListConfigurationsDifferencesRequest.class,
                    ListConfigurationsDifferencesResponse.class)
                .withName("ListConfigurationsDifferences")
                .withUri("/v3/{project_id}/configurations/comparison")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsDifferencesRequest::getXLanguage,
                ListConfigurationsDifferencesRequest::setXLanguage));
        builder.<ListConfigurationsDifferencesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListConfigurationsDifferencesRequestBody.class),
            f -> f.withMarshaller(ListConfigurationsDifferencesRequest::getBody,
                ListConfigurationsDifferencesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> listConfigurationsInstances =
        genForListConfigurationsInstances();

    private static HttpRequestDef<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> genForListConfigurationsInstances() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsInstancesRequest, ListConfigurationsInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigurationsInstancesRequest.class,
                    ListConfigurationsInstancesResponse.class)
                .withName("ListConfigurationsInstances")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/applicable-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getConfigurationId,
                ListConfigurationsInstancesRequest::setConfigurationId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getOffset,
                ListConfigurationsInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getLimit,
                ListConfigurationsInstancesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigurationsInstancesRequest::getXLanguage,
                ListConfigurationsInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> listEnterpriseProjects =
        genForListEnterpriseProjects();

    private static HttpRequestDef<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> genForListEnterpriseProjects() {
        // basic
        HttpRequestDef.Builder<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEnterpriseProjectsRequest.class, ListEnterpriseProjectsResponse.class)
            .withName("ListEnterpriseProjects")
            .withUri("/v3/{project_id}/enterprise-projects")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectsRequest::getOffset, ListEnterpriseProjectsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnterpriseProjectsRequest::getLimit, ListEnterpriseProjectsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnterpriseProjectsRequest::getXLanguage,
                ListEnterpriseProjectsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurations =
        genForListGaussMySqlConfigurations();

    private static HttpRequestDef<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> genForListGaussMySqlConfigurations() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlConfigurationsRequest.class,
                    ListGaussMySqlConfigurationsResponse.class)
                .withName("ListGaussMySqlConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getOffset,
                ListGaussMySqlConfigurationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getLimit,
                ListGaussMySqlConfigurationsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlConfigurationsRequest::getXLanguage,
                ListGaussMySqlConfigurationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> listGaussMySqlDatabase =
        genForListGaussMySqlDatabase();

    private static HttpRequestDef<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> genForListGaussMySqlDatabase() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseRequest, ListGaussMySqlDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussMySqlDatabaseRequest.class, ListGaussMySqlDatabaseResponse.class)
            .withName("ListGaussMySqlDatabase")
            .withUri("/v3/{project_id}/instances/{instance_id}/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getInstanceId,
                ListGaussMySqlDatabaseRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getOffset, ListGaussMySqlDatabaseRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getLimit, ListGaussMySqlDatabaseRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getName, ListGaussMySqlDatabaseRequest::setName));
        builder.<String>withRequestField("charset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getCharset,
                ListGaussMySqlDatabaseRequest::setCharset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseRequest::getXLanguage,
                ListGaussMySqlDatabaseRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> listGaussMySqlDatabaseCharsets =
        genForListGaussMySqlDatabaseCharsets();

    private static HttpRequestDef<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> genForListGaussMySqlDatabaseCharsets() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseCharsetsRequest, ListGaussMySqlDatabaseCharsetsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDatabaseCharsetsRequest.class,
                    ListGaussMySqlDatabaseCharsetsResponse.class)
                .withName("ListGaussMySqlDatabaseCharsets")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/charsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseCharsetsRequest::getInstanceId,
                ListGaussMySqlDatabaseCharsetsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseCharsetsRequest::getXLanguage,
                ListGaussMySqlDatabaseCharsetsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> listGaussMySqlDatabaseUser =
        genForListGaussMySqlDatabaseUser();

    private static HttpRequestDef<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> genForListGaussMySqlDatabaseUser() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDatabaseUserRequest, ListGaussMySqlDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDatabaseUserRequest.class,
                    ListGaussMySqlDatabaseUserResponse.class)
                .withName("ListGaussMySqlDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getInstanceId,
                ListGaussMySqlDatabaseUserRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getOffset,
                ListGaussMySqlDatabaseUserRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getLimit,
                ListGaussMySqlDatabaseUserRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDatabaseUserRequest::getXLanguage,
                ListGaussMySqlDatabaseUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResources =
        genForListGaussMySqlDedicatedResources();

    private static HttpRequestDef<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> genForListGaussMySqlDedicatedResources() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlDedicatedResourcesRequest.class,
                    ListGaussMySqlDedicatedResourcesResponse.class)
                .withName("ListGaussMySqlDedicatedResources")
                .withUri("/v3/{project_id}/dedicated-resources")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getOffset,
                ListGaussMySqlDedicatedResourcesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getLimit,
                ListGaussMySqlDedicatedResourcesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlDedicatedResourcesRequest::getXLanguage,
                ListGaussMySqlDedicatedResourcesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> listGaussMySqlInstanceDetailInfo =
        genForListGaussMySqlInstanceDetailInfo();

    private static HttpRequestDef<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> genForListGaussMySqlInstanceDetailInfo() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstanceDetailInfoRequest, ListGaussMySqlInstanceDetailInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlInstanceDetailInfoRequest.class,
                    ListGaussMySqlInstanceDetailInfoResponse.class)
                .withName("ListGaussMySqlInstanceDetailInfo")
                .withUri("/v3/{project_id}/instances/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoRequest::getInstanceIds,
                ListGaussMySqlInstanceDetailInfoRequest::setInstanceIds));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoRequest::getXLanguage,
                ListGaussMySqlInstanceDetailInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse> listGaussMySqlInstanceDetailInfoUnifyStatus =
        genForListGaussMySqlInstanceDetailInfoUnifyStatus();

    private static HttpRequestDef<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse> genForListGaussMySqlInstanceDetailInfoUnifyStatus() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstanceDetailInfoUnifyStatusRequest, ListGaussMySqlInstanceDetailInfoUnifyStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlInstanceDetailInfoUnifyStatusRequest.class,
                    ListGaussMySqlInstanceDetailInfoUnifyStatusResponse.class)
                .withName("ListGaussMySqlInstanceDetailInfoUnifyStatus")
                .withUri("/v3.1/{project_id}/instances/details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoUnifyStatusRequest::getInstanceIds,
                ListGaussMySqlInstanceDetailInfoUnifyStatusRequest::setInstanceIds));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstanceDetailInfoUnifyStatusRequest::getXLanguage,
                ListGaussMySqlInstanceDetailInfoUnifyStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstances =
        genForListGaussMySqlInstances();

    private static HttpRequestDef<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> genForListGaussMySqlInstances() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGaussMySqlInstancesRequest.class, ListGaussMySqlInstancesResponse.class)
            .withName("ListGaussMySqlInstances")
            .withUri("/v3/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getId, ListGaussMySqlInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getName, ListGaussMySqlInstancesRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getType, ListGaussMySqlInstancesRequest::setType));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getDatastoreType,
                ListGaussMySqlInstancesRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getVpcId, ListGaussMySqlInstancesRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getSubnetId,
                ListGaussMySqlInstancesRequest::setSubnetId));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getPrivateIp,
                ListGaussMySqlInstancesRequest::setPrivateIp));
        builder.<String>withRequestField("readonly_private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getReadonlyPrivateIp,
                ListGaussMySqlInstancesRequest::setReadonlyPrivateIp));
        builder.<String>withRequestField("proxy_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getProxyIp,
                ListGaussMySqlInstancesRequest::setProxyIp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getOffset,
                ListGaussMySqlInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getLimit, ListGaussMySqlInstancesRequest::setLimit));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getTags, ListGaussMySqlInstancesRequest::setTags));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesRequest::getXLanguage,
                ListGaussMySqlInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse> listGaussMySqlInstancesUnifyStatus =
        genForListGaussMySqlInstancesUnifyStatus();

    private static HttpRequestDef<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse> genForListGaussMySqlInstancesUnifyStatus() {
        // basic
        HttpRequestDef.Builder<ListGaussMySqlInstancesUnifyStatusRequest, ListGaussMySqlInstancesUnifyStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGaussMySqlInstancesUnifyStatusRequest.class,
                    ListGaussMySqlInstancesUnifyStatusResponse.class)
                .withName("ListGaussMySqlInstancesUnifyStatus")
                .withUri("/v3.1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getId,
                ListGaussMySqlInstancesUnifyStatusRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getName,
                ListGaussMySqlInstancesUnifyStatusRequest::setName));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getType,
                ListGaussMySqlInstancesUnifyStatusRequest::setType));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getDatastoreType,
                ListGaussMySqlInstancesUnifyStatusRequest::setDatastoreType));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getVpcId,
                ListGaussMySqlInstancesUnifyStatusRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getSubnetId,
                ListGaussMySqlInstancesUnifyStatusRequest::setSubnetId));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getPrivateIp,
                ListGaussMySqlInstancesUnifyStatusRequest::setPrivateIp));
        builder.<String>withRequestField("readonly_private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getReadonlyPrivateIp,
                ListGaussMySqlInstancesUnifyStatusRequest::setReadonlyPrivateIp));
        builder.<String>withRequestField("proxy_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getProxyIp,
                ListGaussMySqlInstancesUnifyStatusRequest::setProxyIp));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getOffset,
                ListGaussMySqlInstancesUnifyStatusRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getLimit,
                ListGaussMySqlInstancesUnifyStatusRequest::setLimit));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getTags,
                ListGaussMySqlInstancesUnifyStatusRequest::setTags));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGaussMySqlInstancesUnifyStatusRequest::getXLanguage,
                ListGaussMySqlInstancesUnifyStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListImmediateJobsRequest, ListImmediateJobsResponse> listImmediateJobs =
        genForListImmediateJobs();

    private static HttpRequestDef<ListImmediateJobsRequest, ListImmediateJobsResponse> genForListImmediateJobs() {
        // basic
        HttpRequestDef.Builder<ListImmediateJobsRequest, ListImmediateJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListImmediateJobsRequest.class, ListImmediateJobsResponse.class)
                .withName("ListImmediateJobs")
                .withUri("/v3/{project_id}/immediate-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getStatus, ListImmediateJobsRequest::setStatus));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getJobName, ListImmediateJobsRequest::setJobName));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getJobId, ListImmediateJobsRequest::setJobId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getOffset, ListImmediateJobsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getLimit, ListImmediateJobsRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getStartTime, ListImmediateJobsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getEndTime, ListImmediateJobsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListImmediateJobsRequest::getXLanguage, ListImmediateJobsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> listInstanceConfigurations =
        genForListInstanceConfigurations();

    private static HttpRequestDef<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> genForListInstanceConfigurations() {
        // basic
        HttpRequestDef.Builder<ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceConfigurationsRequest.class,
                    ListInstanceConfigurationsResponse.class)
                .withName("ListInstanceConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getInstanceId,
                ListInstanceConfigurationsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getOffset,
                ListInstanceConfigurationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getLimit,
                ListInstanceConfigurationsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceConfigurationsRequest::getXLanguage,
                ListInstanceConfigurationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForListInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForListInstanceTags() {
        // basic
        HttpRequestDef.Builder<ListInstanceTagsRequest, ListInstanceTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceTagsRequest.class, ListInstanceTagsResponse.class)
                .withName("ListInstanceTags")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, ListInstanceTagsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getOffset, ListInstanceTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getLimit, ListInstanceTagsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, ListInstanceTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> listLtsErrorLogDetails =
        genForListLtsErrorLogDetails();

    private static HttpRequestDef<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> genForListLtsErrorLogDetails() {
        // basic
        HttpRequestDef.Builder<ListLtsErrorLogDetailsRequest, ListLtsErrorLogDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLtsErrorLogDetailsRequest.class, ListLtsErrorLogDetailsResponse.class)
            .withName("ListLtsErrorLogDetails")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/error-logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getInstanceId,
                ListLtsErrorLogDetailsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getXLanguage,
                ListLtsErrorLogDetailsRequest::setXLanguage));
        builder.<LtsLogErrorQueryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsLogErrorQueryRequest.class),
            f -> f.withMarshaller(ListLtsErrorLogDetailsRequest::getBody, ListLtsErrorLogDetailsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> listLtsSlowlogDetails =
        genForListLtsSlowlogDetails();

    private static HttpRequestDef<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> genForListLtsSlowlogDetails() {
        // basic
        HttpRequestDef.Builder<ListLtsSlowlogDetailsRequest, ListLtsSlowlogDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLtsSlowlogDetailsRequest.class, ListLtsSlowlogDetailsResponse.class)
            .withName("ListLtsSlowlogDetails")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/slow-logs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getInstanceId,
                ListLtsSlowlogDetailsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getXLanguage,
                ListLtsSlowlogDetailsRequest::setXLanguage));
        builder.<LtsLogSlowQueryRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LtsLogSlowQueryRequest.class),
            f -> f.withMarshaller(ListLtsSlowlogDetailsRequest::getBody, ListLtsSlowlogDetailsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListModifyHistoryRequest, ListModifyHistoryResponse> listModifyHistory =
        genForListModifyHistory();

    private static HttpRequestDef<ListModifyHistoryRequest, ListModifyHistoryResponse> genForListModifyHistory() {
        // basic
        HttpRequestDef.Builder<ListModifyHistoryRequest, ListModifyHistoryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListModifyHistoryRequest.class, ListModifyHistoryResponse.class)
                .withName("ListModifyHistory")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/modify-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getConfigurationId,
                ListModifyHistoryRequest::setConfigurationId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getOffset, ListModifyHistoryRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getLimit, ListModifyHistoryRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListModifyHistoryRequest::getXLanguage, ListModifyHistoryRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListParamsTemplateApplyHistoryRequest, ListParamsTemplateApplyHistoryResponse> listParamsTemplateApplyHistory =
        genForListParamsTemplateApplyHistory();

    private static HttpRequestDef<ListParamsTemplateApplyHistoryRequest, ListParamsTemplateApplyHistoryResponse> genForListParamsTemplateApplyHistory() {
        // basic
        HttpRequestDef.Builder<ListParamsTemplateApplyHistoryRequest, ListParamsTemplateApplyHistoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListParamsTemplateApplyHistoryRequest.class,
                    ListParamsTemplateApplyHistoryResponse.class)
                .withName("ListParamsTemplateApplyHistory")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply-history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListParamsTemplateApplyHistoryRequest::getConfigId,
                ListParamsTemplateApplyHistoryRequest::setConfigId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParamsTemplateApplyHistoryRequest::getLimit,
                ListParamsTemplateApplyHistoryRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListParamsTemplateApplyHistoryRequest::getOffset,
                ListParamsTemplateApplyHistoryRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForListProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForListProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getOffset, ListProjectTagsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getLimit, ListProjectTagsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, ListProjectTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstances =
        genForListRecycleInstances();

    private static HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> genForListRecycleInstances() {
        // basic
        HttpRequestDef.Builder<ListRecycleInstancesRequest, ListRecycleInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecycleInstancesRequest.class, ListRecycleInstancesResponse.class)
            .withName("ListRecycleInstances")
            .withUri("/v3/{project_id}/instances/recycle-info")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, ListRecycleInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, ListRecycleInstancesRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage,
                ListRecycleInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScheduleJobsRequest, ListScheduleJobsResponse> listScheduleJobs =
        genForListScheduleJobs();

    private static HttpRequestDef<ListScheduleJobsRequest, ListScheduleJobsResponse> genForListScheduleJobs() {
        // basic
        HttpRequestDef.Builder<ListScheduleJobsRequest, ListScheduleJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScheduleJobsRequest.class, ListScheduleJobsResponse.class)
                .withName("ListScheduleJobs")
                .withUri("/v3/{project_id}/scheduled-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getOffset, ListScheduleJobsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getLimit, ListScheduleJobsRequest::setLimit));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getStatus, ListScheduleJobsRequest::setStatus));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getStartTime, ListScheduleJobsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getEndTime, ListScheduleJobsRequest::setEndTime));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getJobId, ListScheduleJobsRequest::setJobId));
        builder.<String>withRequestField("job_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getJobName, ListScheduleJobsRequest::setJobName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScheduleJobsRequest::getXLanguage, ListScheduleJobsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> modifyBackupEncryptStatus =
        genForModifyBackupEncryptStatus();

    private static HttpRequestDef<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> genForModifyBackupEncryptStatus() {
        // basic
        HttpRequestDef.Builder<ModifyBackupEncryptStatusRequest, ModifyBackupEncryptStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ModifyBackupEncryptStatusRequest.class,
                    ModifyBackupEncryptStatusResponse.class)
                .withName("ModifyBackupEncryptStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/encryption")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyBackupEncryptStatusRequest::getInstanceId,
                ModifyBackupEncryptStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyBackupEncryptStatusRequest::getXLanguage,
                ModifyBackupEncryptStatusRequest::setXLanguage));
        builder.<BackupEncryptRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BackupEncryptRequest.class),
            f -> f.withMarshaller(ModifyBackupEncryptStatusRequest::getBody,
                ModifyBackupEncryptStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> modifyGaussMySqlProxyRouteMode =
        genForModifyGaussMySqlProxyRouteMode();

    private static HttpRequestDef<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> genForModifyGaussMySqlProxyRouteMode() {
        // basic
        HttpRequestDef.Builder<ModifyGaussMySqlProxyRouteModeRequest, ModifyGaussMySqlProxyRouteModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ModifyGaussMySqlProxyRouteModeRequest.class,
                    ModifyGaussMySqlProxyRouteModeResponse.class)
                .withName("ModifyGaussMySqlProxyRouteMode")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/route-mode")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getInstanceId,
                ModifyGaussMySqlProxyRouteModeRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getProxyId,
                ModifyGaussMySqlProxyRouteModeRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getXLanguage,
                ModifyGaussMySqlProxyRouteModeRequest::setXLanguage));
        builder.<ModifyGaussMySqlProxyRouteModeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyGaussMySqlProxyRouteModeRequestBody.class),
            f -> f.withMarshaller(ModifyGaussMySqlProxyRouteModeRequest::getBody,
                ModifyGaussMySqlProxyRouteModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> modifyGaussMysqlDns =
        genForModifyGaussMysqlDns();

    private static HttpRequestDef<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> genForModifyGaussMysqlDns() {
        // basic
        HttpRequestDef.Builder<ModifyGaussMysqlDnsRequest, ModifyGaussMysqlDnsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyGaussMysqlDnsRequest.class, ModifyGaussMysqlDnsResponse.class)
                .withName("ModifyGaussMysqlDns")
                .withUri("/v3/{project_id}/instances/{instance_id}/dns")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMysqlDnsRequest::getInstanceId,
                ModifyGaussMysqlDnsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyGaussMysqlDnsRequest::getXLanguage, ModifyGaussMysqlDnsRequest::setXLanguage));
        builder.<ModifyDnsNameReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDnsNameReq.class),
            f -> f.withMarshaller(ModifyGaussMysqlDnsRequest::getBody, ModifyGaussMysqlDnsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyNodePriorityRequest, ModifyNodePriorityResponse> modifyNodePriority =
        genForModifyNodePriority();

    private static HttpRequestDef<ModifyNodePriorityRequest, ModifyNodePriorityResponse> genForModifyNodePriority() {
        // basic
        HttpRequestDef.Builder<ModifyNodePriorityRequest, ModifyNodePriorityResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyNodePriorityRequest.class, ModifyNodePriorityResponse.class)
                .withName("ModifyNodePriority")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/priority")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyNodePriorityRequest::getInstanceId, ModifyNodePriorityRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyNodePriorityRequest::getNodeId, ModifyNodePriorityRequest::setNodeId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyNodePriorityRequest::getXLanguage, ModifyNodePriorityRequest::setXLanguage));
        builder.<ModifyNodePriorityRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyNodePriorityRequestBody.class),
            f -> f.withMarshaller(ModifyNodePriorityRequest::getBody, ModifyNodePriorityRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RenameInstanceNodeRequest, RenameInstanceNodeResponse> renameInstanceNode =
        genForRenameInstanceNode();

    private static HttpRequestDef<RenameInstanceNodeRequest, RenameInstanceNodeResponse> genForRenameInstanceNode() {
        // basic
        HttpRequestDef.Builder<RenameInstanceNodeRequest, RenameInstanceNodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RenameInstanceNodeRequest.class, RenameInstanceNodeResponse.class)
                .withName("RenameInstanceNode")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceNodeRequest::getInstanceId, RenameInstanceNodeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RenameInstanceNodeRequest::getXLanguage, RenameInstanceNodeRequest::setXLanguage));
        builder.<RenameInstanceNodeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RenameInstanceNodeRequestBody.class),
            f -> f.withMarshaller(RenameInstanceNodeRequest::getBody, RenameInstanceNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> resetGaussMySqlDatabasePassword =
        genForResetGaussMySqlDatabasePassword();

    private static HttpRequestDef<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> genForResetGaussMySqlDatabasePassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlDatabasePasswordRequest, ResetGaussMySqlDatabasePasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ResetGaussMySqlDatabasePasswordRequest.class,
                    ResetGaussMySqlDatabasePasswordResponse.class)
                .withName("ResetGaussMySqlDatabasePassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getInstanceId,
                ResetGaussMySqlDatabasePasswordRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getXLanguage,
                ResetGaussMySqlDatabasePasswordRequest::setXLanguage));
        builder.<ResetDatabasePasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResetDatabasePasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlDatabasePasswordRequest::getBody,
                ResetGaussMySqlDatabasePasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPassword =
        genForResetGaussMySqlPassword();

    private static HttpRequestDef<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> genForResetGaussMySqlPassword() {
        // basic
        HttpRequestDef.Builder<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ResetGaussMySqlPasswordRequest.class, ResetGaussMySqlPasswordResponse.class)
            .withName("ResetGaussMySqlPassword")
            .withUri("/v3/{project_id}/instances/{instance_id}/password")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getInstanceId,
                ResetGaussMySqlPasswordRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getXLanguage,
                ResetGaussMySqlPasswordRequest::setXLanguage));
        builder.<MysqlResetPasswordRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlResetPasswordRequest.class),
            f -> f.withMarshaller(ResetGaussMySqlPasswordRequest::getBody, ResetGaussMySqlPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> restartGaussMySqlInstance =
        genForRestartGaussMySqlInstance();

    private static HttpRequestDef<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> genForRestartGaussMySqlInstance() {
        // basic
        HttpRequestDef.Builder<RestartGaussMySqlInstanceRequest, RestartGaussMySqlInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestartGaussMySqlInstanceRequest.class,
                    RestartGaussMySqlInstanceResponse.class)
                .withName("RestartGaussMySqlInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/restart")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getInstanceId,
                RestartGaussMySqlInstanceRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getXLanguage,
                RestartGaussMySqlInstanceRequest::setXLanguage));
        builder.<TaurusRestartInstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusRestartInstanceRequest.class),
            f -> f.withMarshaller(RestartGaussMySqlInstanceRequest::getBody,
                RestartGaussMySqlInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> restartGaussMySqlNode =
        genForRestartGaussMySqlNode();

    private static HttpRequestDef<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> genForRestartGaussMySqlNode() {
        // basic
        HttpRequestDef.Builder<RestartGaussMySqlNodeRequest, RestartGaussMySqlNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartGaussMySqlNodeRequest.class, RestartGaussMySqlNodeResponse.class)
            .withName("RestartGaussMySqlNode")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/restart")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getInstanceId,
                RestartGaussMySqlNodeRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getNodeId, RestartGaussMySqlNodeRequest::setNodeId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getXLanguage,
                RestartGaussMySqlNodeRequest::setXLanguage));
        builder.<RestartNodeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestartNodeRequest.class),
            f -> f.withMarshaller(RestartGaussMySqlNodeRequest::getBody, RestartGaussMySqlNodeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartProxyInstanceRequest, RestartProxyInstanceResponse> restartProxyInstance =
        genForRestartProxyInstance();

    private static HttpRequestDef<RestartProxyInstanceRequest, RestartProxyInstanceResponse> genForRestartProxyInstance() {
        // basic
        HttpRequestDef.Builder<RestartProxyInstanceRequest, RestartProxyInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartProxyInstanceRequest.class, RestartProxyInstanceResponse.class)
            .withName("RestartProxyInstance")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/restart")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartProxyInstanceRequest::getInstanceId,
                RestartProxyInstanceRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartProxyInstanceRequest::getProxyId, RestartProxyInstanceRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartProxyInstanceRequest::getXLanguage,
                RestartProxyInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreOldInstanceRequest, RestoreOldInstanceResponse> restoreOldInstance =
        genForRestoreOldInstance();

    private static HttpRequestDef<RestoreOldInstanceRequest, RestoreOldInstanceResponse> genForRestoreOldInstance() {
        // basic
        HttpRequestDef.Builder<RestoreOldInstanceRequest, RestoreOldInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreOldInstanceRequest.class, RestoreOldInstanceResponse.class)
                .withName("RestoreOldInstance")
                .withUri("/v3/{project_id}/instances/restore")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreOldInstanceRequest::getXLanguage, RestoreOldInstanceRequest::setXLanguage));
        builder.<RestoreRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestoreRequest.class),
            f -> f.withMarshaller(RestoreOldInstanceRequest::getBody, RestoreOldInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> setGaussMySqlProxyWeight =
        genForSetGaussMySqlProxyWeight();

    private static HttpRequestDef<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> genForSetGaussMySqlProxyWeight() {
        // basic
        HttpRequestDef.Builder<SetGaussMySqlProxyWeightRequest, SetGaussMySqlProxyWeightResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, SetGaussMySqlProxyWeightRequest.class, SetGaussMySqlProxyWeightResponse.class)
                .withName("SetGaussMySqlProxyWeight")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/weight")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getInstanceId,
                SetGaussMySqlProxyWeightRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getProxyId,
                SetGaussMySqlProxyWeightRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getXLanguage,
                SetGaussMySqlProxyWeightRequest::setXLanguage));
        builder.<TaurusModifyProxyWeightRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyProxyWeightRequest.class),
            f -> f.withMarshaller(SetGaussMySqlProxyWeightRequest::getBody, SetGaussMySqlProxyWeightRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotas =
        genForSetGaussMySqlQuotas();

    private static HttpRequestDef<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> genForSetGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetGaussMySqlQuotasRequest.class, SetGaussMySqlQuotasResponse.class)
                .withName("SetGaussMySqlQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getXLanguage, SetGaussMySqlQuotasRequest::setXLanguage));
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(SetGaussMySqlQuotasRequest::getBody, SetGaussMySqlQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicy =
        genForSetRecyclePolicy();

    private static HttpRequestDef<SetRecyclePolicyRequest, SetRecyclePolicyResponse> genForSetRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<SetRecyclePolicyRequest, SetRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRecyclePolicyRequest.class, SetRecyclePolicyResponse.class)
                .withName("SetRecyclePolicy")
                .withUri("/v3/{project_id}/instances/recycle-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRecyclePolicyRequest::getXLanguage, SetRecyclePolicyRequest::setXLanguage));
        builder.<SetRecyclePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetRecyclePolicyRequestBody.class),
            f -> f.withMarshaller(SetRecyclePolicyRequest::getBody, SetRecyclePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLog = genForShowAuditLog();

    private static HttpRequestDef<ShowAuditLogRequest, ShowAuditLogResponse> genForShowAuditLog() {
        // basic
        HttpRequestDef.Builder<ShowAuditLogRequest, ShowAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditLogRequest.class, ShowAuditLogResponse.class)
                .withName("ShowAuditLog")
                .withUri("/v3/{project_id}/instance/{instance_id}/audit-log/switch-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getInstanceId, ShowAuditLogRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditLogRequest::getXLanguage, ShowAuditLogRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoScalingHistoryRequest, ShowAutoScalingHistoryResponse> showAutoScalingHistory =
        genForShowAutoScalingHistory();

    private static HttpRequestDef<ShowAutoScalingHistoryRequest, ShowAutoScalingHistoryResponse> genForShowAutoScalingHistory() {
        // basic
        HttpRequestDef.Builder<ShowAutoScalingHistoryRequest, ShowAutoScalingHistoryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoScalingHistoryRequest.class, ShowAutoScalingHistoryResponse.class)
            .withName("ShowAutoScalingHistory")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-scaling/history")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingHistoryRequest::getInstanceId,
                ShowAutoScalingHistoryRequest::setInstanceId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingHistoryRequest::getLimit, ShowAutoScalingHistoryRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingHistoryRequest::getOffset, ShowAutoScalingHistoryRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingHistoryRequest::getXLanguage,
                ShowAutoScalingHistoryRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> showAutoScalingPolicy =
        genForShowAutoScalingPolicy();

    private static HttpRequestDef<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> genForShowAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoScalingPolicyRequest, ShowAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoScalingPolicyRequest.class, ShowAutoScalingPolicyResponse.class)
            .withName("ShowAutoScalingPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-scaling/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyRequest::getInstanceId,
                ShowAutoScalingPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoScalingPolicyRequest::getXLanguage,
                ShowAutoScalingPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> showBackupRestoreTime =
        genForShowBackupRestoreTime();

    private static HttpRequestDef<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> genForShowBackupRestoreTime() {
        // basic
        HttpRequestDef.Builder<ShowBackupRestoreTimeRequest, ShowBackupRestoreTimeResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupRestoreTimeRequest.class, ShowBackupRestoreTimeResponse.class)
            .withName("ShowBackupRestoreTime")
            .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getInstanceId,
                ShowBackupRestoreTimeRequest::setInstanceId));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getDate, ShowBackupRestoreTimeRequest::setDate));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupRestoreTimeRequest::getXLanguage,
                ShowBackupRestoreTimeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> showDedicatedResourceInfo =
        genForShowDedicatedResourceInfo();

    private static HttpRequestDef<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> genForShowDedicatedResourceInfo() {
        // basic
        HttpRequestDef.Builder<ShowDedicatedResourceInfoRequest, ShowDedicatedResourceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDedicatedResourceInfoRequest.class,
                    ShowDedicatedResourceInfoResponse.class)
                .withName("ShowDedicatedResourceInfo")
                .withUri("/v3/{project_id}/dedicated-resource/{dedicated_resource_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dedicated_resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedResourceInfoRequest::getDedicatedResourceId,
                ShowDedicatedResourceInfoRequest::setDedicatedResourceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDedicatedResourceInfoRequest::getXLanguage,
                ShowDedicatedResourceInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupList =
        genForShowGaussMySqlBackupList();

    private static HttpRequestDef<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> genForShowGaussMySqlBackupList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowGaussMySqlBackupListRequest.class, ShowGaussMySqlBackupListResponse.class)
                .withName("ShowGaussMySqlBackupList")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getInstanceId,
                ShowGaussMySqlBackupListRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupId,
                ShowGaussMySqlBackupListRequest::setBackupId));
        builder.<String>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBackupType,
                ShowGaussMySqlBackupListRequest::setBackupType));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getOffset,
                ShowGaussMySqlBackupListRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getLimit,
                ShowGaussMySqlBackupListRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getBeginTime,
                ShowGaussMySqlBackupListRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getEndTime,
                ShowGaussMySqlBackupListRequest::setEndTime));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getName, ShowGaussMySqlBackupListRequest::setName));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getInstanceName,
                ShowGaussMySqlBackupListRequest::setInstanceName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupListRequest::getXLanguage,
                ShowGaussMySqlBackupListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicy =
        genForShowGaussMySqlBackupPolicy();

    private static HttpRequestDef<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> genForShowGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlBackupPolicyRequest.class,
                    ShowGaussMySqlBackupPolicyResponse.class)
                .withName("ShowGaussMySqlBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getInstanceId,
                ShowGaussMySqlBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlBackupPolicyRequest::getXLanguage,
                ShowGaussMySqlBackupPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> showGaussMySqlConfiguration =
        genForShowGaussMySqlConfiguration();

    private static HttpRequestDef<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> genForShowGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlConfigurationRequest, ShowGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlConfigurationRequest.class,
                    ShowGaussMySqlConfigurationResponse.class)
                .withName("ShowGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlConfigurationRequest::getConfigurationId,
                ShowGaussMySqlConfigurationRequest::setConfigurationId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlConfigurationRequest::getXLanguage,
                ShowGaussMySqlConfigurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersion =
        genForShowGaussMySqlEngineVersion();

    private static HttpRequestDef<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> genForShowGaussMySqlEngineVersion() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlEngineVersionRequest.class,
                    ShowGaussMySqlEngineVersionResponse.class)
                .withName("ShowGaussMySqlEngineVersion")
                .withUri("/v3/{project_id}/datastores/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getDatabaseName,
                ShowGaussMySqlEngineVersionRequest::setDatabaseName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlEngineVersionRequest::getXLanguage,
                ShowGaussMySqlEngineVersionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavors =
        genForShowGaussMySqlFlavors();

    private static HttpRequestDef<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> genForShowGaussMySqlFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlFlavorsRequest.class, ShowGaussMySqlFlavorsResponse.class)
            .withName("ShowGaussMySqlFlavors")
            .withUri("/v3/{project_id}/flavors/{database_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getDatabaseName,
                ShowGaussMySqlFlavorsRequest::setDatabaseName));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getVersionName,
                ShowGaussMySqlFlavorsRequest::setVersionName));
        builder.<String>withRequestField("availability_zone_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getAvailabilityZoneMode,
                ShowGaussMySqlFlavorsRequest::setAvailabilityZoneMode));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getSpecCode,
                ShowGaussMySqlFlavorsRequest::setSpecCode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlFlavorsRequest::getXLanguage,
                ShowGaussMySqlFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> showGaussMySqlIncrementalBackupList =
        genForShowGaussMySqlIncrementalBackupList();

    private static HttpRequestDef<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> genForShowGaussMySqlIncrementalBackupList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlIncrementalBackupListRequest, ShowGaussMySqlIncrementalBackupListResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlIncrementalBackupListRequest.class,
                    ShowGaussMySqlIncrementalBackupListResponse.class)
                .withName("ShowGaussMySqlIncrementalBackupList")
                .withUri("/v3/{project_id}/instances/{instance_id}/incremental-backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getInstanceId,
                ShowGaussMySqlIncrementalBackupListRequest::setInstanceId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getOffset,
                ShowGaussMySqlIncrementalBackupListRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getLimit,
                ShowGaussMySqlIncrementalBackupListRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getBeginTime,
                ShowGaussMySqlIncrementalBackupListRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getEndTime,
                ShowGaussMySqlIncrementalBackupListRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlIncrementalBackupListRequest::getXLanguage,
                ShowGaussMySqlIncrementalBackupListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfo =
        genForShowGaussMySqlInstanceInfo();

    private static HttpRequestDef<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> genForShowGaussMySqlInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlInstanceInfoRequest.class,
                    ShowGaussMySqlInstanceInfoResponse.class)
                .withName("ShowGaussMySqlInstanceInfo")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getInstanceId,
                ShowGaussMySqlInstanceInfoRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoRequest::getXLanguage,
                ShowGaussMySqlInstanceInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse> showGaussMySqlInstanceInfoUnifyStatus =
        genForShowGaussMySqlInstanceInfoUnifyStatus();

    private static HttpRequestDef<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse> genForShowGaussMySqlInstanceInfoUnifyStatus() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlInstanceInfoUnifyStatusRequest, ShowGaussMySqlInstanceInfoUnifyStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlInstanceInfoUnifyStatusRequest.class,
                    ShowGaussMySqlInstanceInfoUnifyStatusResponse.class)
                .withName("ShowGaussMySqlInstanceInfoUnifyStatus")
                .withUri("/v3.1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoUnifyStatusRequest::getInstanceId,
                ShowGaussMySqlInstanceInfoUnifyStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlInstanceInfoUnifyStatusRequest::getXLanguage,
                ShowGaussMySqlInstanceInfoUnifyStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfo =
        genForShowGaussMySqlJobInfo();

    private static HttpRequestDef<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> genForShowGaussMySqlJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlJobInfoRequest.class, ShowGaussMySqlJobInfoResponse.class)
            .withName("ShowGaussMySqlJobInfo")
            .withUri("/v3/{project_id}/jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getId, ShowGaussMySqlJobInfoRequest::setId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlJobInfoRequest::getXLanguage,
                ShowGaussMySqlJobInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotas =
        genForShowGaussMySqlProjectQuotas();

    private static HttpRequestDef<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> genForShowGaussMySqlProjectQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlProjectQuotasRequest.class,
                    ShowGaussMySqlProjectQuotasResponse.class)
                .withName("ShowGaussMySqlProjectQuotas")
                .withUri("/v3/{project_id}/project-quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowGaussMySqlProjectQuotasRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowGaussMySqlProjectQuotasRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getType,
                ShowGaussMySqlProjectQuotasRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProjectQuotasRequest::getXLanguage,
                ShowGaussMySqlProjectQuotasRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavors =
        genForShowGaussMySqlProxyFlavors();

    private static HttpRequestDef<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> genForShowGaussMySqlProxyFlavors() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowGaussMySqlProxyFlavorsRequest.class,
                    ShowGaussMySqlProxyFlavorsResponse.class)
                .withName("ShowGaussMySqlProxyFlavors")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getInstanceId,
                ShowGaussMySqlProxyFlavorsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyFlavorsRequest::getXLanguage,
                ShowGaussMySqlProxyFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyList =
        genForShowGaussMySqlProxyList();

    private static HttpRequestDef<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> genForShowGaussMySqlProxyList() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlProxyListRequest.class, ShowGaussMySqlProxyListResponse.class)
            .withName("ShowGaussMySqlProxyList")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxies")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getInstanceId,
                ShowGaussMySqlProxyListRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getOffset,
                ShowGaussMySqlProxyListRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getLimit, ShowGaussMySqlProxyListRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlProxyListRequest::getXLanguage,
                ShowGaussMySqlProxyListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotas =
        genForShowGaussMySqlQuotas();

    private static HttpRequestDef<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> genForShowGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGaussMySqlQuotasRequest.class, ShowGaussMySqlQuotasResponse.class)
            .withName("ShowGaussMySqlQuotas")
            .withUri("/v3/{project_id}/quotas")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getOffset, ShowGaussMySqlQuotasRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getLimit, ShowGaussMySqlQuotasRequest::setLimit));
        builder.<String>withRequestField("enterprise_project_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getEnterpriseProjectName,
                ShowGaussMySqlQuotasRequest::setEnterpriseProjectName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGaussMySqlQuotasRequest::getXLanguage,
                ShowGaussMySqlQuotasRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> showInstanceDatabaseVersion =
        genForShowInstanceDatabaseVersion();

    private static HttpRequestDef<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> genForShowInstanceDatabaseVersion() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDatabaseVersionRequest, ShowInstanceDatabaseVersionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceDatabaseVersionRequest.class,
                    ShowInstanceDatabaseVersionResponse.class)
                .withName("ShowInstanceDatabaseVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/database-version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDatabaseVersionRequest::getInstanceId,
                ShowInstanceDatabaseVersionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDatabaseVersionRequest::getXLanguage,
                ShowInstanceDatabaseVersionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceEipRequest, ShowInstanceEipResponse> showInstanceEip =
        genForShowInstanceEip();

    private static HttpRequestDef<ShowInstanceEipRequest, ShowInstanceEipResponse> genForShowInstanceEip() {
        // basic
        HttpRequestDef.Builder<ShowInstanceEipRequest, ShowInstanceEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceEipRequest.class, ShowInstanceEipResponse.class)
                .withName("ShowInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceEipRequest::getInstanceId, ShowInstanceEipRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceEipRequest::getXLanguage, ShowInstanceEipRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtend =
        genForShowInstanceMonitorExtend();

    private static HttpRequestDef<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> genForShowInstanceMonitorExtend() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceMonitorExtendRequest.class,
                    ShowInstanceMonitorExtendResponse.class)
                .withName("ShowInstanceMonitorExtend")
                .withUri("/v3/{project_id}/instances/{instance_id}/monitor-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getInstanceId,
                ShowInstanceMonitorExtendRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceMonitorExtendRequest::getXLanguage,
                ShowInstanceMonitorExtendRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> showIntelligentDiagnosisAbnormalCountOfInstances =
        genForShowIntelligentDiagnosisAbnormalCountOfInstances();

    private static HttpRequestDef<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> genForShowIntelligentDiagnosisAbnormalCountOfInstances() {
        // basic
        HttpRequestDef.Builder<ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest, ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest.class,
                    ShowIntelligentDiagnosisAbnormalCountOfInstancesResponse.class)
                .withName("ShowIntelligentDiagnosisAbnormalCountOfInstances")
                .withUri("/v3/{project_id}/instances/diagnosis-instance-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest::getXLanguage,
                ShowIntelligentDiagnosisAbnormalCountOfInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> showIntelligentDiagnosisInstanceInfosPerMetric =
        genForShowIntelligentDiagnosisInstanceInfosPerMetric();

    private static HttpRequestDef<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> genForShowIntelligentDiagnosisInstanceInfosPerMetric() {
        // basic
        HttpRequestDef.Builder<ShowIntelligentDiagnosisInstanceInfosPerMetricRequest, ShowIntelligentDiagnosisInstanceInfosPerMetricResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowIntelligentDiagnosisInstanceInfosPerMetricRequest.class,
                    ShowIntelligentDiagnosisInstanceInfosPerMetricResponse.class)
                .withName("ShowIntelligentDiagnosisInstanceInfosPerMetric")
                .withUri("/v3/{project_id}/instances/diagnosis-instance-infos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getMetricName,
                ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::setMetricName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getOffset,
                ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getLimit,
                ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::getXLanguage,
                ShowIntelligentDiagnosisInstanceInfosPerMetricRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLtsConfigsRequest, ShowLtsConfigsResponse> showLtsConfigs =
        genForShowLtsConfigs();

    private static HttpRequestDef<ShowLtsConfigsRequest, ShowLtsConfigsResponse> genForShowLtsConfigs() {
        // basic
        HttpRequestDef.Builder<ShowLtsConfigsRequest, ShowLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLtsConfigsRequest.class, ShowLtsConfigsResponse.class)
                .withName("ShowLtsConfigs")
                .withUri("/v3/{project_id}/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsConfigsRequest::getEnterpriseProjectId,
                ShowLtsConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsConfigsRequest::getInstanceId, ShowLtsConfigsRequest::setInstanceId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsConfigsRequest::getInstanceName, ShowLtsConfigsRequest::setInstanceName));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsConfigsRequest::getLimit, ShowLtsConfigsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsConfigsRequest::getOffset, ShowLtsConfigsRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLtsConfigsRequest::getXLanguage, ShowLtsConfigsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProxyConfigurationsRequest, ShowProxyConfigurationsResponse> showProxyConfigurations =
        genForShowProxyConfigurations();

    private static HttpRequestDef<ShowProxyConfigurationsRequest, ShowProxyConfigurationsResponse> genForShowProxyConfigurations() {
        // basic
        HttpRequestDef.Builder<ShowProxyConfigurationsRequest, ShowProxyConfigurationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProxyConfigurationsRequest.class, ShowProxyConfigurationsResponse.class)
            .withName("ShowProxyConfigurations")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/configurations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyConfigurationsRequest::getInstanceId,
                ShowProxyConfigurationsRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyConfigurationsRequest::getProxyId,
                ShowProxyConfigurationsRequest::setProxyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProxyConfigurationsRequest::getLimit, ShowProxyConfigurationsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowProxyConfigurationsRequest::getOffset,
                ShowProxyConfigurationsRequest::setOffset));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyConfigurationsRequest::getName, ShowProxyConfigurationsRequest::setName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyConfigurationsRequest::getXLanguage,
                ShowProxyConfigurationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse> showProxyIpgroup =
        genForShowProxyIpgroup();

    private static HttpRequestDef<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse> genForShowProxyIpgroup() {
        // basic
        HttpRequestDef.Builder<ShowProxyIpgroupRequest, ShowProxyIpgroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProxyIpgroupRequest.class, ShowProxyIpgroupResponse.class)
                .withName("ShowProxyIpgroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/ipgroup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyIpgroupRequest::getInstanceId, ShowProxyIpgroupRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyIpgroupRequest::getProxyId, ShowProxyIpgroupRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyIpgroupRequest::getXLanguage, ShowProxyIpgroupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProxyVersionRequest, ShowProxyVersionResponse> showProxyVersion =
        genForShowProxyVersion();

    private static HttpRequestDef<ShowProxyVersionRequest, ShowProxyVersionResponse> genForShowProxyVersion() {
        // basic
        HttpRequestDef.Builder<ShowProxyVersionRequest, ShowProxyVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProxyVersionRequest.class, ShowProxyVersionResponse.class)
                .withName("ShowProxyVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/{engine_name}/proxy-version")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyVersionRequest::getInstanceId, ShowProxyVersionRequest::setInstanceId));
        builder.<String>withRequestField("engine_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyVersionRequest::getEngineName, ShowProxyVersionRequest::setEngineName));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyVersionRequest::getProxyId, ShowProxyVersionRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyVersionRequest::getXLanguage, ShowProxyVersionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy =
        genForShowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForShowRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecyclePolicyRequest.class, ShowRecyclePolicyResponse.class)
                .withName("ShowRecyclePolicy")
                .withUri("/v3/{project_id}/instances/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecyclePolicyRequest::getXLanguage, ShowRecyclePolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRestoreTablesRequest, ShowRestoreTablesResponse> showRestoreTables =
        genForShowRestoreTables();

    private static HttpRequestDef<ShowRestoreTablesRequest, ShowRestoreTablesResponse> genForShowRestoreTables() {
        // basic
        HttpRequestDef.Builder<ShowRestoreTablesRequest, ShowRestoreTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRestoreTablesRequest.class, ShowRestoreTablesResponse.class)
                .withName("ShowRestoreTables")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/restore/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestoreTablesRequest::getInstanceId, ShowRestoreTablesRequest::setInstanceId));
        builder.<String>withRequestField("restore_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestoreTablesRequest::getRestoreTime, ShowRestoreTablesRequest::setRestoreTime));
        builder.<String>withRequestField("last_table_info",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestoreTablesRequest::getLastTableInfo,
                ShowRestoreTablesRequest::setLastTableInfo));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestoreTablesRequest::getDatabaseName,
                ShowRestoreTablesRequest::setDatabaseName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestoreTablesRequest::getTableName, ShowRestoreTablesRequest::setTableName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRestoreTablesRequest::getXLanguage, ShowRestoreTablesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSlowlogSensitiveStatusRequest, ShowSlowlogSensitiveStatusResponse> showSlowlogSensitiveStatus =
        genForShowSlowlogSensitiveStatus();

    private static HttpRequestDef<ShowSlowlogSensitiveStatusRequest, ShowSlowlogSensitiveStatusResponse> genForShowSlowlogSensitiveStatus() {
        // basic
        HttpRequestDef.Builder<ShowSlowlogSensitiveStatusRequest, ShowSlowlogSensitiveStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSlowlogSensitiveStatusRequest.class,
                    ShowSlowlogSensitiveStatusResponse.class)
                .withName("ShowSlowlogSensitiveStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog/query")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowlogSensitiveStatusRequest::getInstanceId,
                ShowSlowlogSensitiveStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowlogSensitiveStatusRequest::getXLanguage,
                ShowSlowlogSensitiveStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> shrinkGaussMySqlProxy =
        genForShrinkGaussMySqlProxy();

    private static HttpRequestDef<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> genForShrinkGaussMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ShrinkGaussMySqlProxyRequest, ShrinkGaussMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ShrinkGaussMySqlProxyRequest.class, ShrinkGaussMySqlProxyResponse.class)
            .withName("ShrinkGaussMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/reduce")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getInstanceId,
                ShrinkGaussMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getProxyId, ShrinkGaussMySqlProxyRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getXLanguage,
                ShrinkGaussMySqlProxyRequest::setXLanguage));
        builder.<ShrinkGaussMySqlProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShrinkGaussMySqlProxyRequestBody.class),
            f -> f.withMarshaller(ShrinkGaussMySqlProxyRequest::getBody, ShrinkGaussMySqlProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchAccessControlRequest, SwitchAccessControlResponse> switchAccessControl =
        genForSwitchAccessControl();

    private static HttpRequestDef<SwitchAccessControlRequest, SwitchAccessControlResponse> genForSwitchAccessControl() {
        // basic
        HttpRequestDef.Builder<SwitchAccessControlRequest, SwitchAccessControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SwitchAccessControlRequest.class, SwitchAccessControlResponse.class)
                .withName("SwitchAccessControl")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/access-control-switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getInstanceId,
                SwitchAccessControlRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getProxyId, SwitchAccessControlRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getXLanguage, SwitchAccessControlRequest::setXLanguage));
        builder.<SwitchAccessControlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchAccessControlRequestBody.class),
            f -> f.withMarshaller(SwitchAccessControlRequest::getBody, SwitchAccessControlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> switchGaussMySqlConfiguration =
        genForSwitchGaussMySqlConfiguration();

    private static HttpRequestDef<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> genForSwitchGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlConfigurationRequest, SwitchGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchGaussMySqlConfigurationRequest.class,
                    SwitchGaussMySqlConfigurationResponse.class)
                .withName("SwitchGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}/apply")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getConfigurationId,
                SwitchGaussMySqlConfigurationRequest::setConfigurationId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getXLanguage,
                SwitchGaussMySqlConfigurationRequest::setXLanguage));
        builder.<ApplyConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequestBody.class),
            f -> f.withMarshaller(SwitchGaussMySqlConfigurationRequest::getBody,
                SwitchGaussMySqlConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> switchGaussMySqlInstanceSsl =
        genForSwitchGaussMySqlInstanceSsl();

    private static HttpRequestDef<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> genForSwitchGaussMySqlInstanceSsl() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlInstanceSslRequest, SwitchGaussMySqlInstanceSslResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SwitchGaussMySqlInstanceSslRequest.class,
                    SwitchGaussMySqlInstanceSslResponse.class)
                .withName("SwitchGaussMySqlInstanceSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl-option")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getInstanceId,
                SwitchGaussMySqlInstanceSslRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getXLanguage,
                SwitchGaussMySqlInstanceSslRequest::setXLanguage));
        builder.<SwitchSSLRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSSLRequest.class),
            f -> f.withMarshaller(SwitchGaussMySqlInstanceSslRequest::getBody,
                SwitchGaussMySqlInstanceSslRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse> switchGaussMySqlProxySsl =
        genForSwitchGaussMySqlProxySsl();

    private static HttpRequestDef<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse> genForSwitchGaussMySqlProxySsl() {
        // basic
        HttpRequestDef.Builder<SwitchGaussMySqlProxySslRequest, SwitchGaussMySqlProxySslResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, SwitchGaussMySqlProxySslRequest.class, SwitchGaussMySqlProxySslResponse.class)
                .withName("SwitchGaussMySqlProxySsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/ssl")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlProxySslRequest::getInstanceId,
                SwitchGaussMySqlProxySslRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlProxySslRequest::getProxyId,
                SwitchGaussMySqlProxySslRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchGaussMySqlProxySslRequest::getXLanguage,
                SwitchGaussMySqlProxySslRequest::setXLanguage));
        builder.<SwitchProxySSLRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchProxySSLRequest.class),
            f -> f.withMarshaller(SwitchGaussMySqlProxySslRequest::getBody, SwitchGaussMySqlProxySslRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLog =
        genForUpdateAuditLog();

    private static HttpRequestDef<UpdateAuditLogRequest, UpdateAuditLogResponse> genForUpdateAuditLog() {
        // basic
        HttpRequestDef.Builder<UpdateAuditLogRequest, UpdateAuditLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateAuditLogRequest.class, UpdateAuditLogResponse.class)
                .withName("UpdateAuditLog")
                .withUri("/v3/{project_id}/instance/{instance_id}/audit-log/switch")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getInstanceId, UpdateAuditLogRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getXLanguage, UpdateAuditLogRequest::setXLanguage));
        builder.<OperateAuditLogRequestV3Body>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateAuditLogRequestV3Body.class),
            f -> f.withMarshaller(UpdateAuditLogRequest::getBody, UpdateAuditLogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> updateAutoScalingPolicy =
        genForUpdateAutoScalingPolicy();

    private static HttpRequestDef<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> genForUpdateAutoScalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateAutoScalingPolicyRequest, UpdateAutoScalingPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateAutoScalingPolicyRequest.class, UpdateAutoScalingPolicyResponse.class)
            .withName("UpdateAutoScalingPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-scaling/policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getInstanceId,
                UpdateAutoScalingPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getXLanguage,
                UpdateAutoScalingPolicyRequest::setXLanguage));
        builder.<UpdateAutoScalingPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAutoScalingPolicyRequestBody.class),
            f -> f.withMarshaller(UpdateAutoScalingPolicyRequest::getBody, UpdateAutoScalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> updateBackupOffsitePolicy =
        genForUpdateBackupOffsitePolicy();

    private static HttpRequestDef<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> genForUpdateBackupOffsitePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateBackupOffsitePolicyRequest, UpdateBackupOffsitePolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateBackupOffsitePolicyRequest.class,
                    UpdateBackupOffsitePolicyResponse.class)
                .withName("UpdateBackupOffsitePolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/offsite-policy")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupOffsitePolicyRequest::getInstanceId,
                UpdateBackupOffsitePolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackupOffsitePolicyRequest::getXLanguage,
                UpdateBackupOffsitePolicyRequest::setXLanguage));
        builder.<UpdateBackupOffsitePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateBackupOffsitePolicyRequestBody.class),
            f -> f.withMarshaller(UpdateBackupOffsitePolicyRequest::getBody,
                UpdateBackupOffsitePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicy =
        genForUpdateGaussMySqlBackupPolicy();

    private static HttpRequestDef<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> genForUpdateGaussMySqlBackupPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlBackupPolicyRequest.class,
                    UpdateGaussMySqlBackupPolicyResponse.class)
                .withName("UpdateGaussMySqlBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy/update")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getInstanceId,
                UpdateGaussMySqlBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getXLanguage,
                UpdateGaussMySqlBackupPolicyRequest::setXLanguage));
        builder.<MysqlUpdateBackupPolicyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateBackupPolicyRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlBackupPolicyRequest::getBody,
                UpdateGaussMySqlBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> updateGaussMySqlConfiguration =
        genForUpdateGaussMySqlConfiguration();

    private static HttpRequestDef<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> genForUpdateGaussMySqlConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlConfigurationRequest, UpdateGaussMySqlConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlConfigurationRequest.class,
                    UpdateGaussMySqlConfigurationResponse.class)
                .withName("UpdateGaussMySqlConfiguration")
                .withUri("/v3/{project_id}/configurations/{configuration_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("configuration_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getConfigurationId,
                UpdateGaussMySqlConfigurationRequest::setConfigurationId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getXLanguage,
                UpdateGaussMySqlConfigurationRequest::setXLanguage));
        builder.<UpdateConfigurationParameterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateConfigurationParameterRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlConfigurationRequest::getBody,
                UpdateGaussMySqlConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> updateGaussMySqlDatabaseComment =
        genForUpdateGaussMySqlDatabaseComment();

    private static HttpRequestDef<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> genForUpdateGaussMySqlDatabaseComment() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlDatabaseCommentRequest, UpdateGaussMySqlDatabaseCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlDatabaseCommentRequest.class,
                    UpdateGaussMySqlDatabaseCommentResponse.class)
                .withName("UpdateGaussMySqlDatabaseComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/comment")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getInstanceId,
                UpdateGaussMySqlDatabaseCommentRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getXLanguage,
                UpdateGaussMySqlDatabaseCommentRequest::setXLanguage));
        builder.<UpdateDatabaseCommentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseCommentRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseCommentRequest::getBody,
                UpdateGaussMySqlDatabaseCommentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> updateGaussMySqlDatabaseUserComment =
        genForUpdateGaussMySqlDatabaseUserComment();

    private static HttpRequestDef<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> genForUpdateGaussMySqlDatabaseUserComment() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlDatabaseUserCommentRequest, UpdateGaussMySqlDatabaseUserCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlDatabaseUserCommentRequest.class,
                    UpdateGaussMySqlDatabaseUserCommentResponse.class)
                .withName("UpdateGaussMySqlDatabaseUserComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/comment")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getInstanceId,
                UpdateGaussMySqlDatabaseUserCommentRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getXLanguage,
                UpdateGaussMySqlDatabaseUserCommentRequest::setXLanguage));
        builder.<UpdateDatabaseUserCommentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseUserCommentRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlDatabaseUserCommentRequest::getBody,
                UpdateGaussMySqlDatabaseUserCommentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> updateGaussMySqlInstanceAlias =
        genForUpdateGaussMySqlInstanceAlias();

    private static HttpRequestDef<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> genForUpdateGaussMySqlInstanceAlias() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceAliasRequest, UpdateGaussMySqlInstanceAliasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceAliasRequest.class,
                    UpdateGaussMySqlInstanceAliasResponse.class)
                .withName("UpdateGaussMySqlInstanceAlias")
                .withUri("/v3/{project_id}/instances/{instance_id}/alias")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getInstanceId,
                UpdateGaussMySqlInstanceAliasRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getXLanguage,
                UpdateGaussMySqlInstanceAliasRequest::setXLanguage));
        builder.<ModifyAliasRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyAliasRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasRequest::getBody,
                UpdateGaussMySqlInstanceAliasRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGaussMySqlInstanceAliasResponse::getBody,
                UpdateGaussMySqlInstanceAliasResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> updateGaussMySqlInstanceEip =
        genForUpdateGaussMySqlInstanceEip();

    private static HttpRequestDef<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> genForUpdateGaussMySqlInstanceEip() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceEipRequest, UpdateGaussMySqlInstanceEipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceEipRequest.class,
                    UpdateGaussMySqlInstanceEipResponse.class)
                .withName("UpdateGaussMySqlInstanceEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ips/bind")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getInstanceId,
                UpdateGaussMySqlInstanceEipRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getXLanguage,
                UpdateGaussMySqlInstanceEipRequest::setXLanguage));
        builder.<ModifyBindEipRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyBindEipRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceEipRequest::getBody,
                UpdateGaussMySqlInstanceEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> updateGaussMySqlInstanceInternalIp =
        genForUpdateGaussMySqlInstanceInternalIp();

    private static HttpRequestDef<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> genForUpdateGaussMySqlInstanceInternalIp() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceInternalIpRequest, UpdateGaussMySqlInstanceInternalIpResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceInternalIpRequest.class,
                    UpdateGaussMySqlInstanceInternalIpResponse.class)
                .withName("UpdateGaussMySqlInstanceInternalIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/internal-ip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getInstanceId,
                UpdateGaussMySqlInstanceInternalIpRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getXLanguage,
                UpdateGaussMySqlInstanceInternalIpRequest::setXLanguage));
        builder.<ModifyInternalIpRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyInternalIpRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceInternalIpRequest::getBody,
                UpdateGaussMySqlInstanceInternalIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceName =
        genForUpdateGaussMySqlInstanceName();

    private static HttpRequestDef<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> genForUpdateGaussMySqlInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceNameRequest.class,
                    UpdateGaussMySqlInstanceNameResponse.class)
                .withName("UpdateGaussMySqlInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getInstanceId,
                UpdateGaussMySqlInstanceNameRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getXLanguage,
                UpdateGaussMySqlInstanceNameRequest::setXLanguage));
        builder.<MysqlUpdateInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlUpdateInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceNameRequest::getBody,
                UpdateGaussMySqlInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> updateGaussMySqlInstanceOpsWindow =
        genForUpdateGaussMySqlInstanceOpsWindow();

    private static HttpRequestDef<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> genForUpdateGaussMySqlInstanceOpsWindow() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceOpsWindowRequest, UpdateGaussMySqlInstanceOpsWindowResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceOpsWindowRequest.class,
                    UpdateGaussMySqlInstanceOpsWindowResponse.class)
                .withName("UpdateGaussMySqlInstanceOpsWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/ops-window")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getInstanceId,
                UpdateGaussMySqlInstanceOpsWindowRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getXLanguage,
                UpdateGaussMySqlInstanceOpsWindowRequest::setXLanguage));
        builder.<ModifyOpsWindow>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyOpsWindow.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowRequest::getBody,
                UpdateGaussMySqlInstanceOpsWindowRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateGaussMySqlInstanceOpsWindowResponse::getBody,
                UpdateGaussMySqlInstanceOpsWindowResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> updateGaussMySqlInstancePort =
        genForUpdateGaussMySqlInstancePort();

    private static HttpRequestDef<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> genForUpdateGaussMySqlInstancePort() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstancePortRequest, UpdateGaussMySqlInstancePortResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstancePortRequest.class,
                    UpdateGaussMySqlInstancePortResponse.class)
                .withName("UpdateGaussMySqlInstancePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getInstanceId,
                UpdateGaussMySqlInstancePortRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getXLanguage,
                UpdateGaussMySqlInstancePortRequest::setXLanguage));
        builder.<ModifyPortRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyPortRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstancePortRequest::getBody,
                UpdateGaussMySqlInstancePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> updateGaussMySqlInstanceSecurityGroup =
        genForUpdateGaussMySqlInstanceSecurityGroup();

    private static HttpRequestDef<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> genForUpdateGaussMySqlInstanceSecurityGroup() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlInstanceSecurityGroupRequest, UpdateGaussMySqlInstanceSecurityGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGaussMySqlInstanceSecurityGroupRequest.class,
                    UpdateGaussMySqlInstanceSecurityGroupResponse.class)
                .withName("UpdateGaussMySqlInstanceSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getInstanceId,
                UpdateGaussMySqlInstanceSecurityGroupRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getXLanguage,
                UpdateGaussMySqlInstanceSecurityGroupRequest::setXLanguage));
        builder.<ModifySecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifySecurityGroupRequest.class),
            f -> f.withMarshaller(UpdateGaussMySqlInstanceSecurityGroupRequest::getBody,
                UpdateGaussMySqlInstanceSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotas =
        genForUpdateGaussMySqlQuotas();

    private static HttpRequestDef<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> genForUpdateGaussMySqlQuotas() {
        // basic
        HttpRequestDef.Builder<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGaussMySqlQuotasRequest.class, UpdateGaussMySqlQuotasResponse.class)
            .withName("UpdateGaussMySqlQuotas")
            .withUri("/v3/{project_id}/quotas")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getXLanguage,
                UpdateGaussMySqlQuotasRequest::setXLanguage));
        builder.<SetQuotasRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetQuotasRequestBody.class),
            f -> f.withMarshaller(UpdateGaussMySqlQuotasRequest::getBody, UpdateGaussMySqlQuotasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> updateInstanceConfigurations =
        genForUpdateInstanceConfigurations();

    private static HttpRequestDef<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> genForUpdateInstanceConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationsRequest, UpdateInstanceConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationsRequest.class,
                    UpdateInstanceConfigurationsResponse.class)
                .withName("UpdateInstanceConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationsRequest::getInstanceId,
                UpdateInstanceConfigurationsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationsRequest::getXLanguage,
                UpdateInstanceConfigurationsRequest::setXLanguage));
        builder.<UpdateInstanceConfigurationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationsRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationsRequest::getBody,
                UpdateInstanceConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitor =
        genForUpdateInstanceMonitor();

    private static HttpRequestDef<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> genForUpdateInstanceMonitor() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceMonitorRequest.class, UpdateInstanceMonitorResponse.class)
            .withName("UpdateInstanceMonitor")
            .withUri("/v3/{project_id}/instances/{instance_id}/monitor-policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getInstanceId,
                UpdateInstanceMonitorRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getXLanguage,
                UpdateInstanceMonitorRequest::setXLanguage));
        builder.<TaurusModifyInstanceMonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TaurusModifyInstanceMonitorRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceMonitorRequest::getBody, UpdateInstanceMonitorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse> updateNewNodeAutoAddSwitch =
        genForUpdateNewNodeAutoAddSwitch();

    private static HttpRequestDef<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse> genForUpdateNewNodeAutoAddSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateNewNodeAutoAddSwitchRequest, UpdateNewNodeAutoAddSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateNewNodeAutoAddSwitchRequest.class,
                    UpdateNewNodeAutoAddSwitchResponse.class)
                .withName("UpdateNewNodeAutoAddSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/new-node-auto-add")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewNodeAutoAddSwitchRequest::getInstanceId,
                UpdateNewNodeAutoAddSwitchRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewNodeAutoAddSwitchRequest::getProxyId,
                UpdateNewNodeAutoAddSwitchRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNewNodeAutoAddSwitchRequest::getXLanguage,
                UpdateNewNodeAutoAddSwitchRequest::setXLanguage));
        builder.<UpdateNewNodeAutoAddSwitchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNewNodeAutoAddSwitchRequestBody.class),
            f -> f.withMarshaller(UpdateNewNodeAutoAddSwitchRequest::getBody,
                UpdateNewNodeAutoAddSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> updateProxyConnectionPoolType =
        genForUpdateProxyConnectionPoolType();

    private static HttpRequestDef<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> genForUpdateProxyConnectionPoolType() {
        // basic
        HttpRequestDef.Builder<UpdateProxyConnectionPoolTypeRequest, UpdateProxyConnectionPoolTypeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxyConnectionPoolTypeRequest.class,
                    UpdateProxyConnectionPoolTypeResponse.class)
                .withName("UpdateProxyConnectionPoolType")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/connection-pool-type")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getInstanceId,
                UpdateProxyConnectionPoolTypeRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getProxyId,
                UpdateProxyConnectionPoolTypeRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getXLanguage,
                UpdateProxyConnectionPoolTypeRequest::setXLanguage));
        builder.<ProxyUpdateProxyConnectionPoolTypeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyUpdateProxyConnectionPoolTypeRequest.class),
            f -> f.withMarshaller(UpdateProxyConnectionPoolTypeRequest::getBody,
                UpdateProxyConnectionPoolTypeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyNameRequest, UpdateProxyNameResponse> updateProxyName =
        genForUpdateProxyName();

    private static HttpRequestDef<UpdateProxyNameRequest, UpdateProxyNameResponse> genForUpdateProxyName() {
        // basic
        HttpRequestDef.Builder<UpdateProxyNameRequest, UpdateProxyNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProxyNameRequest.class, UpdateProxyNameResponse.class)
                .withName("UpdateProxyName")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/rename")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNameRequest::getInstanceId, UpdateProxyNameRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNameRequest::getProxyId, UpdateProxyNameRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNameRequest::getXLanguage, UpdateProxyNameRequest::setXLanguage));
        builder.<ProxyUpdateProxyNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyUpdateProxyNameRequest.class),
            f -> f.withMarshaller(UpdateProxyNameRequest::getBody, UpdateProxyNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> updateProxyNewConfigurations =
        genForUpdateProxyNewConfigurations();

    private static HttpRequestDef<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> genForUpdateProxyNewConfigurations() {
        // basic
        HttpRequestDef.Builder<UpdateProxyNewConfigurationsRequest, UpdateProxyNewConfigurationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxyNewConfigurationsRequest.class,
                    UpdateProxyNewConfigurationsResponse.class)
                .withName("UpdateProxyNewConfigurations")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/configurations")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getInstanceId,
                UpdateProxyNewConfigurationsRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getProxyId,
                UpdateProxyNewConfigurationsRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getXLanguage,
                UpdateProxyNewConfigurationsRequest::setXLanguage));
        builder.<UpdateProxyNewConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProxyNewConfigRequestBody.class),
            f -> f.withMarshaller(UpdateProxyNewConfigurationsRequest::getBody,
                UpdateProxyNewConfigurationsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyPortRequest, UpdateProxyPortResponse> updateProxyPort =
        genForUpdateProxyPort();

    private static HttpRequestDef<UpdateProxyPortRequest, UpdateProxyPortResponse> genForUpdateProxyPort() {
        // basic
        HttpRequestDef.Builder<UpdateProxyPortRequest, UpdateProxyPortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateProxyPortRequest.class, UpdateProxyPortResponse.class)
                .withName("UpdateProxyPort")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/port")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getInstanceId, UpdateProxyPortRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getProxyId, UpdateProxyPortRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getXLanguage, UpdateProxyPortRequest::setXLanguage));
        builder.<UpdateProxyPortRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateProxyPortRequestBody.class),
            f -> f.withMarshaller(UpdateProxyPortRequest::getBody, UpdateProxyPortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> updateProxySessionConsistence =
        genForUpdateProxySessionConsistence();

    private static HttpRequestDef<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> genForUpdateProxySessionConsistence() {
        // basic
        HttpRequestDef.Builder<UpdateProxySessionConsistenceRequest, UpdateProxySessionConsistenceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxySessionConsistenceRequest.class,
                    UpdateProxySessionConsistenceResponse.class)
                .withName("UpdateProxySessionConsistence")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/session-consistence")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getInstanceId,
                UpdateProxySessionConsistenceRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getProxyId,
                UpdateProxySessionConsistenceRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getXLanguage,
                UpdateProxySessionConsistenceRequest::setXLanguage));
        builder.<ModifyProxyConsistRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyProxyConsistRequest.class),
            f -> f.withMarshaller(UpdateProxySessionConsistenceRequest::getBody,
                UpdateProxySessionConsistenceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateServerlessPolicyRequest, UpdateServerlessPolicyResponse> updateServerlessPolicy =
        genForUpdateServerlessPolicy();

    private static HttpRequestDef<UpdateServerlessPolicyRequest, UpdateServerlessPolicyResponse> genForUpdateServerlessPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateServerlessPolicyRequest, UpdateServerlessPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateServerlessPolicyRequest.class, UpdateServerlessPolicyResponse.class)
            .withName("UpdateServerlessPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/serverless/policy")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerlessPolicyRequest::getInstanceId,
                UpdateServerlessPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateServerlessPolicyRequest::getXLanguage,
                UpdateServerlessPolicyRequest::setXLanguage));
        builder.<UpdateServerlessPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateServerlessPolicy.class),
            f -> f.withMarshaller(UpdateServerlessPolicyRequest::getBody, UpdateServerlessPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSlowlogSensitiveSwitchRequest, UpdateSlowlogSensitiveSwitchResponse> updateSlowlogSensitiveSwitch =
        genForUpdateSlowlogSensitiveSwitch();

    private static HttpRequestDef<UpdateSlowlogSensitiveSwitchRequest, UpdateSlowlogSensitiveSwitchResponse> genForUpdateSlowlogSensitiveSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateSlowlogSensitiveSwitchRequest, UpdateSlowlogSensitiveSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateSlowlogSensitiveSwitchRequest.class,
                    UpdateSlowlogSensitiveSwitchResponse.class)
                .withName("UpdateSlowlogSensitiveSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog/modify")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlowlogSensitiveSwitchRequest::getInstanceId,
                UpdateSlowlogSensitiveSwitchRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSlowlogSensitiveSwitchRequest::getXLanguage,
                UpdateSlowlogSensitiveSwitchRequest::setXLanguage));
        builder.<UpdateSlowlogSensitiveSwitchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSlowlogSensitiveSwitchRequestBody.class),
            f -> f.withMarshaller(UpdateSlowlogSensitiveSwitchRequest::getBody,
                UpdateSlowlogSensitiveSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> updateTransactionSplitStatus =
        genForUpdateTransactionSplitStatus();

    private static HttpRequestDef<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> genForUpdateTransactionSplitStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTransactionSplitStatusRequest, UpdateTransactionSplitStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateTransactionSplitStatusRequest.class,
                    UpdateTransactionSplitStatusResponse.class)
                .withName("UpdateTransactionSplitStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/transaction-split")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getInstanceId,
                UpdateTransactionSplitStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getXLanguage,
                UpdateTransactionSplitStatusRequest::setXLanguage));
        builder.<ProxyTransactionSplitRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyTransactionSplitRequest.class),
            f -> f.withMarshaller(UpdateTransactionSplitStatusRequest::getBody,
                UpdateTransactionSplitStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> upgradeGaussMySqlInstanceDatabase =
        genForUpgradeGaussMySqlInstanceDatabase();

    private static HttpRequestDef<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> genForUpgradeGaussMySqlInstanceDatabase() {
        // basic
        HttpRequestDef.Builder<UpgradeGaussMySqlInstanceDatabaseRequest, UpgradeGaussMySqlInstanceDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpgradeGaussMySqlInstanceDatabaseRequest.class,
                    UpgradeGaussMySqlInstanceDatabaseResponse.class)
                .withName("UpgradeGaussMySqlInstanceDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getInstanceId,
                UpgradeGaussMySqlInstanceDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getXLanguage,
                UpgradeGaussMySqlInstanceDatabaseRequest::setXLanguage));
        builder.<UpgradeDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradeDatabaseRequest.class),
            f -> f.withMarshaller(UpgradeGaussMySqlInstanceDatabaseRequest::getBody,
                UpgradeGaussMySqlInstanceDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse> upgradeProxyVersion =
        genForUpgradeProxyVersion();

    private static HttpRequestDef<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse> genForUpgradeProxyVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeProxyVersionRequest, UpgradeProxyVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeProxyVersionRequest.class, UpgradeProxyVersionResponse.class)
                .withName("UpgradeProxyVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/upgrade-version")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeProxyVersionRequest::getInstanceId,
                UpgradeProxyVersionRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeProxyVersionRequest::getProxyId, UpgradeProxyVersionRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeProxyVersionRequest::getXLanguage, UpgradeProxyVersionRequest::setXLanguage));
        builder.<ProxyUpgradeProxyVersionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProxyUpgradeProxyVersionRequest.class),
            f -> f.withMarshaller(UpgradeProxyVersionRequest::getBody, UpgradeProxyVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse> checkDataBaseConfig =
        genForCheckDataBaseConfig();

    private static HttpRequestDef<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse> genForCheckDataBaseConfig() {
        // basic
        HttpRequestDef.Builder<CheckDataBaseConfigRequest, CheckDataBaseConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckDataBaseConfigRequest.class, CheckDataBaseConfigResponse.class)
                .withName("CheckDataBaseConfig")
                .withUri(
                    "/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication/database-config-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDataBaseConfigRequest::getInstanceId,
                CheckDataBaseConfigRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckDataBaseConfigRequest::getXLanguage, CheckDataBaseConfigRequest::setXLanguage));
        builder.<DbConfigCheckRequestV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbConfigCheckRequestV3.class),
            f -> f.withMarshaller(CheckDataBaseConfigRequest::getBody, CheckDataBaseConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse> checkStarRocksResource =
        genForCheckStarRocksResource();

    private static HttpRequestDef<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse> genForCheckStarRocksResource() {
        // basic
        HttpRequestDef.Builder<CheckStarRocksResourceRequest, CheckStarRocksResourceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CheckStarRocksResourceRequest.class, CheckStarRocksResourceResponse.class)
            .withName("CheckStarRocksResource")
            .withUri("/v3/{project_id}/starrocks/resource-check")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckStarRocksResourceRequest::getXLanguage,
                CheckStarRocksResourceRequest::setXLanguage));
        builder.<ResourceCheck>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceCheck.class),
            f -> f.withMarshaller(CheckStarRocksResourceRequest::getBody, CheckStarRocksResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckTableConfigRequest, CheckTableConfigResponse> checkTableConfig =
        genForCheckTableConfig();

    private static HttpRequestDef<CheckTableConfigRequest, CheckTableConfigResponse> genForCheckTableConfig() {
        // basic
        HttpRequestDef.Builder<CheckTableConfigRequest, CheckTableConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckTableConfigRequest.class, CheckTableConfigResponse.class)
                .withName("CheckTableConfig")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication/table-config-check")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTableConfigRequest::getInstanceId, CheckTableConfigRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckTableConfigRequest::getXLanguage, CheckTableConfigRequest::setXLanguage));
        builder.<TableConfigCheckRequestV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TableConfigCheckRequestV3.class),
            f -> f.withMarshaller(CheckTableConfigRequest::getBody, CheckTableConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse> createStarRocksDataReplication =
        genForCreateStarRocksDataReplication();

    private static HttpRequestDef<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse> genForCreateStarRocksDataReplication() {
        // basic
        HttpRequestDef.Builder<CreateStarRocksDataReplicationRequest, CreateStarRocksDataReplicationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateStarRocksDataReplicationRequest.class,
                    CreateStarRocksDataReplicationResponse.class)
                .withName("CreateStarRocksDataReplication")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStarRocksDataReplicationRequest::getInstanceId,
                CreateStarRocksDataReplicationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStarRocksDataReplicationRequest::getXLanguage,
                CreateStarRocksDataReplicationRequest::setXLanguage));
        builder.<CreateStarRocksDataReplication>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateStarRocksDataReplication.class),
            f -> f.withMarshaller(CreateStarRocksDataReplicationRequest::getBody,
                CreateStarRocksDataReplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse> createStarRocksDatabaseUser =
        genForCreateStarRocksDatabaseUser();

    private static HttpRequestDef<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse> genForCreateStarRocksDatabaseUser() {
        // basic
        HttpRequestDef.Builder<CreateStarRocksDatabaseUserRequest, CreateStarRocksDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateStarRocksDatabaseUserRequest.class,
                    CreateStarRocksDatabaseUserResponse.class)
                .withName("CreateStarRocksDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/users")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStarRocksDatabaseUserRequest::getInstanceId,
                CreateStarRocksDatabaseUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStarRocksDatabaseUserRequest::getXLanguage,
                CreateStarRocksDatabaseUserRequest::setXLanguage));
        builder.<StarRocksDatabaseUserInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StarRocksDatabaseUserInfo.class),
            f -> f.withMarshaller(CreateStarRocksDatabaseUserRequest::getBody,
                CreateStarRocksDatabaseUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse> createStarrocksInstance =
        genForCreateStarrocksInstance();

    private static HttpRequestDef<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse> genForCreateStarrocksInstance() {
        // basic
        HttpRequestDef.Builder<CreateStarrocksInstanceRequest, CreateStarrocksInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateStarrocksInstanceRequest.class, CreateStarrocksInstanceResponse.class)
            .withName("CreateStarrocksInstance")
            .withUri("/v3/{project_id}/instances/{instance_id}/starrocks")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStarrocksInstanceRequest::getInstanceId,
                CreateStarrocksInstanceRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateStarrocksInstanceRequest::getXLanguage,
                CreateStarrocksInstanceRequest::setXLanguage));
        builder.<StarRocksCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StarRocksCreateRequest.class),
            f -> f.withMarshaller(CreateStarrocksInstanceRequest::getBody, CreateStarrocksInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse> deleteStarRocksDataReplication =
        genForDeleteStarRocksDataReplication();

    private static HttpRequestDef<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse> genForDeleteStarRocksDataReplication() {
        // basic
        HttpRequestDef.Builder<DeleteStarRocksDataReplicationRequest, DeleteStarRocksDataReplicationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteStarRocksDataReplicationRequest.class,
                    DeleteStarRocksDataReplicationResponse.class)
                .withName("DeleteStarRocksDataReplication")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRocksDataReplicationRequest::getInstanceId,
                DeleteStarRocksDataReplicationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRocksDataReplicationRequest::getXLanguage,
                DeleteStarRocksDataReplicationRequest::setXLanguage));
        builder.<DeleteStarRocksDataReplication>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteStarRocksDataReplication.class),
            f -> f.withMarshaller(DeleteStarRocksDataReplicationRequest::getBody,
                DeleteStarRocksDataReplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse> deleteStarRocksDatabaseUser =
        genForDeleteStarRocksDatabaseUser();

    private static HttpRequestDef<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse> genForDeleteStarRocksDatabaseUser() {
        // basic
        HttpRequestDef.Builder<DeleteStarRocksDatabaseUserRequest, DeleteStarRocksDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteStarRocksDatabaseUserRequest.class,
                    DeleteStarRocksDatabaseUserResponse.class)
                .withName("DeleteStarRocksDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRocksDatabaseUserRequest::getInstanceId,
                DeleteStarRocksDatabaseUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRocksDatabaseUserRequest::getUserName,
                DeleteStarRocksDatabaseUserRequest::setUserName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarRocksDatabaseUserRequest::getXLanguage,
                DeleteStarRocksDatabaseUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse> deleteStarrocksInstance =
        genForDeleteStarrocksInstance();

    private static HttpRequestDef<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse> genForDeleteStarrocksInstance() {
        // basic
        HttpRequestDef.Builder<DeleteStarrocksInstanceRequest, DeleteStarrocksInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteStarrocksInstanceRequest.class, DeleteStarrocksInstanceResponse.class)
            .withName("DeleteStarrocksInstance")
            .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/{starrocks_instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarrocksInstanceRequest::getInstanceId,
                DeleteStarrocksInstanceRequest::setInstanceId));
        builder.<String>withRequestField("starrocks_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarrocksInstanceRequest::getStarrocksInstanceId,
                DeleteStarrocksInstanceRequest::setStarrocksInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteStarrocksInstanceRequest::getXLanguage,
                DeleteStarrocksInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHtapDataStoreRequest, ListHtapDataStoreResponse> listHtapDataStore =
        genForListHtapDataStore();

    private static HttpRequestDef<ListHtapDataStoreRequest, ListHtapDataStoreResponse> genForListHtapDataStore() {
        // basic
        HttpRequestDef.Builder<ListHtapDataStoreRequest, ListHtapDataStoreResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHtapDataStoreRequest.class, ListHtapDataStoreResponse.class)
                .withName("ListHtapDataStore")
                .withUri("/v3/{project_id}/htap/datastores/{engine_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapDataStoreRequest::getEngineName, ListHtapDataStoreRequest::setEngineName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapDataStoreRequest::getXLanguage, ListHtapDataStoreRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHtapFlavorRequest, ListHtapFlavorResponse> listHtapFlavor =
        genForListHtapFlavor();

    private static HttpRequestDef<ListHtapFlavorRequest, ListHtapFlavorResponse> genForListHtapFlavor() {
        // basic
        HttpRequestDef.Builder<ListHtapFlavorRequest, ListHtapFlavorResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHtapFlavorRequest.class, ListHtapFlavorResponse.class)
                .withName("ListHtapFlavor")
                .withUri("/v3/{project_id}/htap/flavors/{engine_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapFlavorRequest::getEngineName, ListHtapFlavorRequest::setEngineName));
        builder.<String>withRequestField("availability_zone_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapFlavorRequest::getAvailabilityZoneMode,
                ListHtapFlavorRequest::setAvailabilityZoneMode));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapFlavorRequest::getSpecCode, ListHtapFlavorRequest::setSpecCode));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapFlavorRequest::getVersionName, ListHtapFlavorRequest::setVersionName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapFlavorRequest::getXLanguage, ListHtapFlavorRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse> listHtapInstanceInfo =
        genForListHtapInstanceInfo();

    private static HttpRequestDef<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse> genForListHtapInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ListHtapInstanceInfoRequest, ListHtapInstanceInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHtapInstanceInfoRequest.class, ListHtapInstanceInfoResponse.class)
            .withName("ListHtapInstanceInfo")
            .withUri("/v3/{project_id}/instances/{instance_id}/htap")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapInstanceInfoRequest::getInstanceId,
                ListHtapInstanceInfoRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapInstanceInfoRequest::getXLanguage,
                ListHtapInstanceInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse> listHtapStorageType =
        genForListHtapStorageType();

    private static HttpRequestDef<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse> genForListHtapStorageType() {
        // basic
        HttpRequestDef.Builder<ListHtapStorageTypeRequest, ListHtapStorageTypeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHtapStorageTypeRequest.class, ListHtapStorageTypeResponse.class)
                .withName("ListHtapStorageType")
                .withUri("/v3/{project_id}/htap/storage-type/{database}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapStorageTypeRequest::getDatabase, ListHtapStorageTypeRequest::setDatabase));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapStorageTypeRequest::getVersionName,
                ListHtapStorageTypeRequest::setVersionName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHtapStorageTypeRequest::getXLanguage, ListHtapStorageTypeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse> listStarRocksDataBases =
        genForListStarRocksDataBases();

    private static HttpRequestDef<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse> genForListStarRocksDataBases() {
        // basic
        HttpRequestDef.Builder<ListStarRocksDataBasesRequest, ListStarRocksDataBasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListStarRocksDataBasesRequest.class, ListStarRocksDataBasesResponse.class)
            .withName("ListStarRocksDataBases")
            .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataBasesRequest::getInstanceId,
                ListStarRocksDataBasesRequest::setInstanceId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataBasesRequest::getLimit, ListStarRocksDataBasesRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataBasesRequest::getOffset, ListStarRocksDataBasesRequest::setOffset));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataBasesRequest::getDatabaseName,
                ListStarRocksDataBasesRequest::setDatabaseName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataBasesRequest::getXLanguage,
                ListStarRocksDataBasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse> listStarRocksDataReplicationConfig =
        genForListStarRocksDataReplicationConfig();

    private static HttpRequestDef<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse> genForListStarRocksDataReplicationConfig() {
        // basic
        HttpRequestDef.Builder<ListStarRocksDataReplicationConfigRequest, ListStarRocksDataReplicationConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStarRocksDataReplicationConfigRequest.class,
                    ListStarRocksDataReplicationConfigResponse.class)
                .withName("ListStarRocksDataReplicationConfig")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationConfigRequest::getInstanceId,
                ListStarRocksDataReplicationConfigRequest::setInstanceId));
        builder.<String>withRequestField("task_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationConfigRequest::getTaskName,
                ListStarRocksDataReplicationConfigRequest::setTaskName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationConfigRequest::getXLanguage,
                ListStarRocksDataReplicationConfigRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse> listStarRocksDataReplications =
        genForListStarRocksDataReplications();

    private static HttpRequestDef<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse> genForListStarRocksDataReplications() {
        // basic
        HttpRequestDef.Builder<ListStarRocksDataReplicationsRequest, ListStarRocksDataReplicationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStarRocksDataReplicationsRequest.class,
                    ListStarRocksDataReplicationsResponse.class)
                .withName("ListStarRocksDataReplications")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationsRequest::getInstanceId,
                ListStarRocksDataReplicationsRequest::setInstanceId));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationsRequest::getLimit,
                ListStarRocksDataReplicationsRequest::setLimit));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationsRequest::getOffset,
                ListStarRocksDataReplicationsRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDataReplicationsRequest::getXLanguage,
                ListStarRocksDataReplicationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse> listStarRocksDbParameters =
        genForListStarRocksDbParameters();

    private static HttpRequestDef<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse> genForListStarRocksDbParameters() {
        // basic
        HttpRequestDef.Builder<ListStarRocksDbParametersRequest, ListStarRocksDbParametersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStarRocksDbParametersRequest.class,
                    ListStarRocksDbParametersResponse.class)
                .withName("ListStarRocksDbParameters")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/databases/replication/database-parameters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDbParametersRequest::getInstanceId,
                ListStarRocksDbParametersRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarRocksDbParametersRequest::getXLanguage,
                ListStarRocksDbParametersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse> listStarrocksInstanceInfo =
        genForListStarrocksInstanceInfo();

    private static HttpRequestDef<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse> genForListStarrocksInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ListStarrocksInstanceInfoRequest, ListStarrocksInstanceInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListStarrocksInstanceInfoRequest.class,
                    ListStarrocksInstanceInfoResponse.class)
                .withName("ListStarrocksInstanceInfo")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/{starrocks_instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarrocksInstanceInfoRequest::getInstanceId,
                ListStarrocksInstanceInfoRequest::setInstanceId));
        builder.<String>withRequestField("starrocks_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarrocksInstanceInfoRequest::getStarrocksInstanceId,
                ListStarrocksInstanceInfoRequest::setStarrocksInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStarrocksInstanceInfoRequest::getXLanguage,
                ListStarrocksInstanceInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse> restartStarrocksInstance =
        genForRestartStarrocksInstance();

    private static HttpRequestDef<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse> genForRestartStarrocksInstance() {
        // basic
        HttpRequestDef.Builder<RestartStarrocksInstanceRequest, RestartStarrocksInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, RestartStarrocksInstanceRequest.class, RestartStarrocksInstanceResponse.class)
                .withName("RestartStarrocksInstance")
                .withUri("/v3/{project_id}/instances/{starrocks_instance_id}/starrocks/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("starrocks_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartStarrocksInstanceRequest::getStarrocksInstanceId,
                RestartStarrocksInstanceRequest::setStarrocksInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartStarrocksInstanceRequest::getXLanguage,
                RestartStarrocksInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse> restartStarrocksNode =
        genForRestartStarrocksNode();

    private static HttpRequestDef<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse> genForRestartStarrocksNode() {
        // basic
        HttpRequestDef.Builder<RestartStarrocksNodeRequest, RestartStarrocksNodeResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RestartStarrocksNodeRequest.class, RestartStarrocksNodeResponse.class)
            .withName("RestartStarrocksNode")
            .withUri("/v3/{project_id}/instances/{starrocks_instance_id}/starrocks/{starrocks_node_id}/restart")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("starrocks_node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartStarrocksNodeRequest::getStarrocksNodeId,
                RestartStarrocksNodeRequest::setStarrocksNodeId));
        builder.<String>withRequestField("starrocks_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartStarrocksNodeRequest::getStarrocksInstanceId,
                RestartStarrocksNodeRequest::setStarrocksInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartStarrocksNodeRequest::getXLanguage,
                RestartStarrocksNodeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse> showStarRocksDatabaseUser =
        genForShowStarRocksDatabaseUser();

    private static HttpRequestDef<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse> genForShowStarRocksDatabaseUser() {
        // basic
        HttpRequestDef.Builder<ShowStarRocksDatabaseUserRequest, ShowStarRocksDatabaseUserResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowStarRocksDatabaseUserRequest.class,
                    ShowStarRocksDatabaseUserResponse.class)
                .withName("ShowStarRocksDatabaseUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStarRocksDatabaseUserRequest::getInstanceId,
                ShowStarRocksDatabaseUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStarRocksDatabaseUserRequest::getUserName,
                ShowStarRocksDatabaseUserRequest::setUserName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStarRocksDatabaseUserRequest::getLimit,
                ShowStarRocksDatabaseUserRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowStarRocksDatabaseUserRequest::getOffset,
                ShowStarRocksDatabaseUserRequest::setOffset));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStarRocksDatabaseUserRequest::getXLanguage,
                ShowStarRocksDatabaseUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse> updateStarRocksDatabaseUserPassword =
        genForUpdateStarRocksDatabaseUserPassword();

    private static HttpRequestDef<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse> genForUpdateStarRocksDatabaseUserPassword() {
        // basic
        HttpRequestDef.Builder<UpdateStarRocksDatabaseUserPasswordRequest, UpdateStarRocksDatabaseUserPasswordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateStarRocksDatabaseUserPasswordRequest.class,
                    UpdateStarRocksDatabaseUserPasswordResponse.class)
                .withName("UpdateStarRocksDatabaseUserPassword")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/users/password")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStarRocksDatabaseUserPasswordRequest::getInstanceId,
                UpdateStarRocksDatabaseUserPasswordRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStarRocksDatabaseUserPasswordRequest::getXLanguage,
                UpdateStarRocksDatabaseUserPasswordRequest::setXLanguage));
        builder.<StarRocksDatabaseUserPWinfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StarRocksDatabaseUserPWinfo.class),
            f -> f.withMarshaller(UpdateStarRocksDatabaseUserPasswordRequest::getBody,
                UpdateStarRocksDatabaseUserPasswordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse> updateStarRocksDatabaseUserPermission =
        genForUpdateStarRocksDatabaseUserPermission();

    private static HttpRequestDef<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse> genForUpdateStarRocksDatabaseUserPermission() {
        // basic
        HttpRequestDef.Builder<UpdateStarRocksDatabaseUserPermissionRequest, UpdateStarRocksDatabaseUserPermissionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateStarRocksDatabaseUserPermissionRequest.class,
                    UpdateStarRocksDatabaseUserPermissionResponse.class)
                .withName("UpdateStarRocksDatabaseUserPermission")
                .withUri("/v3/{project_id}/instances/{instance_id}/starrocks/users/permission")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStarRocksDatabaseUserPermissionRequest::getInstanceId,
                UpdateStarRocksDatabaseUserPermissionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateStarRocksDatabaseUserPermissionRequest::getXLanguage,
                UpdateStarRocksDatabaseUserPermissionRequest::setXLanguage));
        builder.<StarRocksDatabaseUserPSinfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StarRocksDatabaseUserPSinfo.class),
            f -> f.withMarshaller(UpdateStarRocksDatabaseUserPermissionRequest::getBody,
                UpdateStarRocksDatabaseUserPermissionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> deleteSqlFilterRule =
        genForDeleteSqlFilterRule();

    private static HttpRequestDef<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> genForDeleteSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<DeleteSqlFilterRuleRequest, DeleteSqlFilterRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSqlFilterRuleRequest.class, DeleteSqlFilterRuleResponse.class)
            .withName("DeleteSqlFilterRule")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getInstanceId,
                DeleteSqlFilterRuleRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getXLanguage, DeleteSqlFilterRuleRequest::setXLanguage));
        builder.<DeleteSqlFilterRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlFilterRuleReq.class),
            f -> f.withMarshaller(DeleteSqlFilterRuleRequest::getBody, DeleteSqlFilterRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> setSqlFilterRule =
        genForSetSqlFilterRule();

    private static HttpRequestDef<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> genForSetSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<SetSqlFilterRuleRequest, SetSqlFilterRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetSqlFilterRuleRequest.class, SetSqlFilterRuleResponse.class)
                .withName("SetSqlFilterRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getInstanceId, SetSqlFilterRuleRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getXLanguage, SetSqlFilterRuleRequest::setXLanguage));
        builder.<OperateSqlFilterRuleReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateSqlFilterRuleReq.class),
            f -> f.withMarshaller(SetSqlFilterRuleRequest::getBody, SetSqlFilterRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> showSqlFilterControl =
        genForShowSqlFilterControl();

    private static HttpRequestDef<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> genForShowSqlFilterControl() {
        // basic
        HttpRequestDef.Builder<ShowSqlFilterControlRequest, ShowSqlFilterControlResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlFilterControlRequest.class, ShowSqlFilterControlResponse.class)
            .withName("ShowSqlFilterControl")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterControlRequest::getInstanceId,
                ShowSqlFilterControlRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterControlRequest::getXLanguage,
                ShowSqlFilterControlRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> showSqlFilterRule =
        genForShowSqlFilterRule();

    private static HttpRequestDef<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> genForShowSqlFilterRule() {
        // basic
        HttpRequestDef.Builder<ShowSqlFilterRuleRequest, ShowSqlFilterRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlFilterRuleRequest.class, ShowSqlFilterRuleResponse.class)
                .withName("ShowSqlFilterRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getInstanceId, ShowSqlFilterRuleRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getNodeId, ShowSqlFilterRuleRequest::setNodeId));
        builder.<String>withRequestField("sql_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getSqlType, ShowSqlFilterRuleRequest::setSqlType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlFilterRuleRequest::getXLanguage, ShowSqlFilterRuleRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> updateSqlFilterControl =
        genForUpdateSqlFilterControl();

    private static HttpRequestDef<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> genForUpdateSqlFilterControl() {
        // basic
        HttpRequestDef.Builder<UpdateSqlFilterControlRequest, UpdateSqlFilterControlResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSqlFilterControlRequest.class, UpdateSqlFilterControlResponse.class)
            .withName("UpdateSqlFilterControl")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-filter/switch")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getInstanceId,
                UpdateSqlFilterControlRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getXLanguage,
                UpdateSqlFilterControlRequest::setXLanguage));
        builder.<OperateSqlFilterControlReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperateSqlFilterControlReq.class),
            f -> f.withMarshaller(UpdateSqlFilterControlRequest::getBody, UpdateSqlFilterControlRequest::setBody));

        // response

        return builder.build();
    }

}

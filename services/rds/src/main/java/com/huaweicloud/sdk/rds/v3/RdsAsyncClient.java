package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rds.v3.model.AddPostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.AddPostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.AllowDbPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.AllowDbPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.AllowDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.AllowDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.AllowSqlserverDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.AllowSqlserverDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.ApplyConfigurationAsyncRequest;
import com.huaweicloud.sdk.rds.v3.model.ApplyConfigurationAsyncResponse;
import com.huaweicloud.sdk.rds.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.rds.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchAddMsdtcsRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchAddMsdtcsResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchRestoreDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchRestoreDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchRestorePostgreSqlTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchRestorePostgreSqlTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchTagAddActionRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchTagAddActionResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchTagDelActionRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchTagDelActionResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverModeRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverModeResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverStrategyRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeFailoverStrategyResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeOpsWindowRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeOpsWindowResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeProxyScaleRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeProxyScaleResponse;
import com.huaweicloud.sdk.rds.v3.model.ChangeTheDelayThresholdRequest;
import com.huaweicloud.sdk.rds.v3.model.ChangeTheDelayThresholdResponse;
import com.huaweicloud.sdk.rds.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateRdSforMySqlProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateRdSforMySqlProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteJobRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteJobResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteLogLtsConfigsRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteLogLtsConfigsResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.DeletePostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteRdSforMySqlProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteRdSforMySqlProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogRequest;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogResponse;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.ExecutePrivilegeDatabaseUserRoleRequest;
import com.huaweicloud.sdk.rds.v3.model.ExecutePrivilegeDatabaseUserRoleResponse;
import com.huaweicloud.sdk.rds.v3.model.ExecuteRevokeDatabaseUserRoleRequest;
import com.huaweicloud.sdk.rds.v3.model.ExecuteRevokeDatabaseUserRoleResponse;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionNewRequest;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionNewResponse;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.ListApiVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuditlogsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuditlogsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedSqlserverDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListAuthorizedSqlserverDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListBackupsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListBackupsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListCollationsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListCollationsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListConfigurationsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListConfigurationsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDatabaseUserRoleRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDatabaseUserRoleResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDatastoresRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDatastoresResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListDrRelationsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListDrRelationsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListEngineFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListEngineFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsNewRequest;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsNewResponse;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListErrorLogsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListErrorlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListErrorlogForLtsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListHistoryDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.ListHistoryDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInspectionHistoriesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInspectionHistoriesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceDiagnosisRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceDiagnosisResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceParamHistoriesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceParamHistoriesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceTagsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstanceTagsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesInfoDiagnosisRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesInfoDiagnosisResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesSupportFastRestoreRequest;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesSupportFastRestoreResponse;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoDetailRequest;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoDetailResponse;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoRequest;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoResponse;
import com.huaweicloud.sdk.rds.v3.model.ListLogLtsConfigsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListLogLtsConfigsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListMsdtcHostsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListMsdtcHostsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteBackupsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteBackupsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteRestoreTimesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListOffSiteRestoreTimesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabaseSchemasRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabaseSchemasResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDbUserPaginatedRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlDbUserPaginatedResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoHistoryRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoHistoryResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlHbaInfoResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlListHistoryTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPostgresqlListHistoryTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListPredefinedTagRequest;
import com.huaweicloud.sdk.rds.v3.model.ListPredefinedTagResponse;
import com.huaweicloud.sdk.rds.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListRdSforMySqlProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.ListRdSforMySqlProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.ListRdSforMysqlProxyFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListRdSforMysqlProxyFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListRecycleInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListRecycleInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListRestoreTimesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListRestoreTimesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSimplifiedInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSimplifiedInstancesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogFileRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogFileResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogStatisticsForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogStatisticsForLtsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsNewRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsNewResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowLogsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogForLtsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogStatisticsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSlowlogStatisticsResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDatabasesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDatabasesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDbUsersRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSqlserverDbUsersResponse;
import com.huaweicloud.sdk.rds.v3.model.ListSslCertDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.ListSslCertDownloadLinkResponse;
import com.huaweicloud.sdk.rds.v3.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListUpgradeHistoriesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListUpgradeHistoriesResponse;
import com.huaweicloud.sdk.rds.v3.model.ListXellogFilesRequest;
import com.huaweicloud.sdk.rds.v3.model.ListXellogFilesResponse;
import com.huaweicloud.sdk.rds.v3.model.MigrateFollowerRequest;
import com.huaweicloud.sdk.rds.v3.model.MigrateFollowerResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyRdSforMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyRdSforMySqlProxyRouteModeResponse;
import com.huaweicloud.sdk.rds.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokeResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetBinlogClearPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetBinlogClearPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesDbShrinkRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesDbShrinkResponse;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesNewDbShrinkRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesNewDbShrinkResponse;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesProxyRestartRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesProxyRestartResponse;
import com.huaweicloud.sdk.rds.v3.model.SetLogLtsConfigsRequest;
import com.huaweicloud.sdk.rds.v3.model.SetLogLtsConfigsResponse;
import com.huaweicloud.sdk.rds.v3.model.SetOffSiteBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetOffSiteBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetPostgresqlDbUserPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.SetPostgresqlDbUserPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.SetReadOnlySwitchRequest;
import com.huaweicloud.sdk.rds.v3.model.SetReadOnlySwitchResponse;
import com.huaweicloud.sdk.rds.v3.model.SetSecondLevelMonitorRequest;
import com.huaweicloud.sdk.rds.v3.model.SetSecondLevelMonitorResponse;
import com.huaweicloud.sdk.rds.v3.model.SetSecurityGroupRequest;
import com.huaweicloud.sdk.rds.v3.model.SetSecurityGroupResponse;
import com.huaweicloud.sdk.rds.v3.model.SetSensitiveSlowLogRequest;
import com.huaweicloud.sdk.rds.v3.model.SetSensitiveSlowLogResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogDownloadLinkResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAuditlogPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowAvailableVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowAvailableVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupDownloadLinkResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowBinlogClearPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowBinlogClearPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowDomainNameRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowDomainNameResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowDrReplicaStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowDrReplicaStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowIncreBackupPolicy1Request;
import com.huaweicloud.sdk.rds.v3.model.ShowIncreBackupPolicy1Response;
import com.huaweicloud.sdk.rds.v3.model.ShowInformationAboutDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowInformationAboutDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowOffSiteBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowOffSiteBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowPostgresqlParamValueRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowPostgresqlParamValueResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowReplicationStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowReplicationStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowSecondLevelMonitoringRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowSecondLevelMonitoringResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowStorageUsedSpaceRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowStorageUsedSpaceResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowUpgradeDbMajorVersionStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowUpgradeDbMajorVersionStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.StartDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.StartDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.StartFailoverRequest;
import com.huaweicloud.sdk.rds.v3.model.StartFailoverResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceReduceVolumeActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceReduceVolumeActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceRestartActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceRestartActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceSingleToHaActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceSingleToHaActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartRecyclePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.StartRecyclePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.StartResizeFlavorActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartResizeFlavorActionResponse;
import com.huaweicloud.sdk.rds.v3.model.StartupInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.StartupInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.StopDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.StopDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.SwitchSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseOwnerRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseOwnerResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserCommentRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserCommentResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateHostPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateHostPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateIncreBackupPolicy1Request;
import com.huaweicloud.sdk.rds.v3.model.UpdateIncreBackupPolicy1Response;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePortRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePortResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDbUserCommentRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDbUserCommentResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionPreCheckRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionPreCheckResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionNewRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionNewResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionResponse;

import java.util.concurrent.CompletableFuture;

public class RdsAsyncClient {

    protected HcClient hcClient;

    public RdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsAsyncClient> newBuilder() {
        ClientBuilder<RdsAsyncClient> clientBuilder = new ClientBuilder<>(RdsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 在pg_hba.conf文件最后新增单个或多个配置
     *
     * 以传入配置全量覆盖当前pg_hba.conf文件内容，入参为空时用默认配置覆盖当前文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPostgresqlHbaConfRequest 请求对象
     * @return CompletableFuture<AddPostgresqlHbaConfResponse>
     */
    public CompletableFuture<AddPostgresqlHbaConfResponse> addPostgresqlHbaConfAsync(
        AddPostgresqlHbaConfRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.addPostgresqlHbaConf);
    }

    /**
     * 在pg_hba.conf文件最后新增单个或多个配置
     *
     * 以传入配置全量覆盖当前pg_hba.conf文件内容，入参为空时用默认配置覆盖当前文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddPostgresqlHbaConfRequest 请求对象
     * @return AsyncInvoker<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse>
     */
    public AsyncInvoker<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse> addPostgresqlHbaConfAsyncInvoker(
        AddPostgresqlHbaConfRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.addPostgresqlHbaConf, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationAsyncRequest 请求对象
     * @return CompletableFuture<ApplyConfigurationAsyncResponse>
     */
    public CompletableFuture<ApplyConfigurationAsyncResponse> applyConfigurationAsyncAsync(
        ApplyConfigurationAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.applyConfigurationAsync);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyConfigurationAsyncRequest 请求对象
     * @return AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>
     */
    public AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsyncAsyncInvoker(
        ApplyConfigurationAsyncRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.applyConfigurationAsync, hcClient);
    }

    /**
     * 绑定和解绑弹性公网IP
     *
     * 绑定和解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.attachEip);
    }

    /**
     * 绑定和解绑弹性公网IP
     *
     * 绑定和解绑弹性公网IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.attachEip, hcClient);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteManualBackupRequest 请求对象
     * @return CompletableFuture<BatchDeleteManualBackupResponse>
     */
    public CompletableFuture<BatchDeleteManualBackupResponse> batchDeleteManualBackupAsync(
        BatchDeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchDeleteManualBackup);
    }

    /**
     * 批量删除手动备份
     *
     * 批量删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse>
     */
    public AsyncInvoker<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> batchDeleteManualBackupAsyncInvoker(
        BatchDeleteManualBackupRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.batchDeleteManualBackup, hcClient);
    }

    /**
     * 库级时间点恢复
     *
     * 库级时间点恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreDatabaseRequest 请求对象
     * @return CompletableFuture<BatchRestoreDatabaseResponse>
     */
    public CompletableFuture<BatchRestoreDatabaseResponse> batchRestoreDatabaseAsync(
        BatchRestoreDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchRestoreDatabase);
    }

    /**
     * 库级时间点恢复
     *
     * 库级时间点恢复
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestoreDatabaseRequest 请求对象
     * @return AsyncInvoker<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse>
     */
    public AsyncInvoker<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> batchRestoreDatabaseAsyncInvoker(
        BatchRestoreDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.batchRestoreDatabase, hcClient);
    }

    /**
     * 表级时间点恢复（PostgreSQL）
     *
     * 表级时间点恢复（PostgreSQL）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestorePostgreSqlTablesRequest 请求对象
     * @return CompletableFuture<BatchRestorePostgreSqlTablesResponse>
     */
    public CompletableFuture<BatchRestorePostgreSqlTablesResponse> batchRestorePostgreSqlTablesAsync(
        BatchRestorePostgreSqlTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchRestorePostgreSqlTables);
    }

    /**
     * 表级时间点恢复（PostgreSQL）
     *
     * 表级时间点恢复（PostgreSQL）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRestorePostgreSqlTablesRequest 请求对象
     * @return AsyncInvoker<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse>
     */
    public AsyncInvoker<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> batchRestorePostgreSqlTablesAsyncInvoker(
        BatchRestorePostgreSqlTablesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.batchRestorePostgreSqlTables, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagAddActionRequest 请求对象
     * @return CompletableFuture<BatchTagAddActionResponse>
     */
    public CompletableFuture<BatchTagAddActionResponse> batchTagAddActionAsync(BatchTagAddActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagAddActionRequest 请求对象
     * @return AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>
     */
    public AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionAsyncInvoker(
        BatchTagAddActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.batchTagAddAction, hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagDelActionRequest 请求对象
     * @return CompletableFuture<BatchTagDelActionResponse>
     */
    public CompletableFuture<BatchTagDelActionResponse> batchTagDelActionAsync(BatchTagDelActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTagDelActionRequest 请求对象
     * @return AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>
     */
    public AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionAsyncInvoker(
        BatchTagDelActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.batchTagDelAction, hcClient);
    }

    /**
     * 更改主备实例的数据同步方式
     *
     * 更改主备实例的数据同步方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFailoverModeRequest 请求对象
     * @return CompletableFuture<ChangeFailoverModeResponse>
     */
    public CompletableFuture<ChangeFailoverModeResponse> changeFailoverModeAsync(ChangeFailoverModeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /**
     * 更改主备实例的数据同步方式
     *
     * 更改主备实例的数据同步方式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFailoverModeRequest 请求对象
     * @return AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>
     */
    public AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeAsyncInvoker(
        ChangeFailoverModeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.changeFailoverMode, hcClient);
    }

    /**
     * 切换主备实例的倒换策略
     *
     * 切换主备实例的倒换策略.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFailoverStrategyRequest 请求对象
     * @return CompletableFuture<ChangeFailoverStrategyResponse>
     */
    public CompletableFuture<ChangeFailoverStrategyResponse> changeFailoverStrategyAsync(
        ChangeFailoverStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /**
     * 切换主备实例的倒换策略
     *
     * 切换主备实例的倒换策略.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFailoverStrategyRequest 请求对象
     * @return AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>
     */
    public AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyAsyncInvoker(
        ChangeFailoverStrategyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.changeFailoverStrategy, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOpsWindowRequest 请求对象
     * @return CompletableFuture<ChangeOpsWindowResponse>
     */
    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeOpsWindowRequest 请求对象
     * @return AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowAsyncInvoker(
        ChangeOpsWindowRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.changeOpsWindow, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createConfiguration, hcClient);
    }

    /**
     * 申请域名
     *
     * 申请域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDnsNameRequest 请求对象
     * @return CompletableFuture<CreateDnsNameResponse>
     */
    public CompletableFuture<CreateDnsNameResponse> createDnsNameAsync(CreateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDnsName);
    }

    /**
     * 申请域名
     *
     * 申请域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDnsNameRequest 请求对象
     * @return AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>
     */
    public AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameAsyncInvoker(
        CreateDnsNameRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createDnsName, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createInstance, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.createManualBackup);
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
        return new AsyncInvoker<>(request, RdsMeta.createManualBackup, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRdSforMySqlProxyRequest 请求对象
     * @return CompletableFuture<CreateRdSforMySqlProxyResponse>
     */
    public CompletableFuture<CreateRdSforMySqlProxyResponse> createRdSforMySqlProxyAsync(
        CreateRdSforMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createRdSforMySqlProxy);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRdSforMySqlProxyRequest 请求对象
     * @return AsyncInvoker<CreateRdSforMySqlProxyRequest, CreateRdSforMySqlProxyResponse>
     */
    public AsyncInvoker<CreateRdSforMySqlProxyRequest, CreateRdSforMySqlProxyResponse> createRdSforMySqlProxyAsyncInvoker(
        CreateRdSforMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createRdSforMySqlProxy, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return CompletableFuture<CreateRestoreInstanceResponse>
     */
    public CompletableFuture<CreateRestoreInstanceResponse> createRestoreInstanceAsync(
        CreateRestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceAsyncInvoker(
        CreateRestoreInstanceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createRestoreInstance, hcClient);
    }

    /**
     * 新增SQL限流
     *
     * 新增SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitRequest 请求对象
     * @return CompletableFuture<CreateSqlLimitResponse>
     */
    public CompletableFuture<CreateSqlLimitResponse> createSqlLimitAsync(CreateSqlLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlLimit);
    }

    /**
     * 新增SQL限流
     *
     * 新增SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitRequest 请求对象
     * @return AsyncInvoker<CreateSqlLimitRequest, CreateSqlLimitResponse>
     */
    public AsyncInvoker<CreateSqlLimitRequest, CreateSqlLimitResponse> createSqlLimitAsyncInvoker(
        CreateSqlLimitRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createSqlLimit, hcClient);
    }

    /**
     * 获取扩展日志下载信息
     *
     * 获取扩展日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateXelLogDownloadRequest 请求对象
     * @return CompletableFuture<CreateXelLogDownloadResponse>
     */
    public CompletableFuture<CreateXelLogDownloadResponse> createXelLogDownloadAsync(
        CreateXelLogDownloadRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createXelLogDownload);
    }

    /**
     * 获取扩展日志下载信息
     *
     * 获取扩展日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateXelLogDownloadRequest 请求对象
     * @return AsyncInvoker<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse>
     */
    public AsyncInvoker<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> createXelLogDownloadAsyncInvoker(
        CreateXelLogDownloadRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createXelLogDownload, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteConfiguration);
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
        return new AsyncInvoker<>(request, RdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例
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
        return new AsyncInvoker<>(request, RdsMeta.deleteInstance, hcClient);
    }

    /**
     * 删除即时任务
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return CompletableFuture<DeleteJobResponse>
     */
    public CompletableFuture<DeleteJobResponse> deleteJobAsync(DeleteJobRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteJob);
    }

    /**
     * 删除即时任务
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return AsyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public AsyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobAsyncInvoker(DeleteJobRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteJob, hcClient);
    }

    /**
     * 
     *
     * 解除LTS配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogLtsConfigsRequest 请求对象
     * @return CompletableFuture<DeleteLogLtsConfigsResponse>
     */
    public CompletableFuture<DeleteLogLtsConfigsResponse> deleteLogLtsConfigsAsync(DeleteLogLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteLogLtsConfigs);
    }

    /**
     * 
     *
     * 解除LTS配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogLtsConfigsRequest 请求对象
     * @return AsyncInvoker<DeleteLogLtsConfigsRequest, DeleteLogLtsConfigsResponse>
     */
    public AsyncInvoker<DeleteLogLtsConfigsRequest, DeleteLogLtsConfigsResponse> deleteLogLtsConfigsAsyncInvoker(
        DeleteLogLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteLogLtsConfigs, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteManualBackup);
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
        return new AsyncInvoker<>(request, RdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 删除pg_hba.conf文件的单个或多个配置
     *
     * 删除pg_hba.conf文件的单个或多个配置，以priority做唯一标识
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlHbaConfRequest 请求对象
     * @return CompletableFuture<DeletePostgresqlHbaConfResponse>
     */
    public CompletableFuture<DeletePostgresqlHbaConfResponse> deletePostgresqlHbaConfAsync(
        DeletePostgresqlHbaConfRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deletePostgresqlHbaConf);
    }

    /**
     * 删除pg_hba.conf文件的单个或多个配置
     *
     * 删除pg_hba.conf文件的单个或多个配置，以priority做唯一标识
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlHbaConfRequest 请求对象
     * @return AsyncInvoker<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse>
     */
    public AsyncInvoker<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> deletePostgresqlHbaConfAsyncInvoker(
        DeletePostgresqlHbaConfRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deletePostgresqlHbaConf, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRdSforMySqlProxyRequest 请求对象
     * @return CompletableFuture<DeleteRdSforMySqlProxyResponse>
     */
    public CompletableFuture<DeleteRdSforMySqlProxyResponse> deleteRdSforMySqlProxyAsync(
        DeleteRdSforMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteRdSforMySqlProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRdSforMySqlProxyRequest 请求对象
     * @return AsyncInvoker<DeleteRdSforMySqlProxyRequest, DeleteRdSforMySqlProxyResponse>
     */
    public AsyncInvoker<DeleteRdSforMySqlProxyRequest, DeleteRdSforMySqlProxyResponse> deleteRdSforMySqlProxyAsyncInvoker(
        DeleteRdSforMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteRdSforMySqlProxy, hcClient);
    }

    /**
     * 删除SQL限流
     *
     * 删除SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRequest 请求对象
     * @return CompletableFuture<DeleteSqlLimitResponse>
     */
    public CompletableFuture<DeleteSqlLimitResponse> deleteSqlLimitAsync(DeleteSqlLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlLimit);
    }

    /**
     * 删除SQL限流
     *
     * 删除SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRequest 请求对象
     * @return AsyncInvoker<DeleteSqlLimitRequest, DeleteSqlLimitResponse>
     */
    public AsyncInvoker<DeleteSqlLimitRequest, DeleteSqlLimitResponse> deleteSqlLimitAsyncInvoker(
        DeleteSqlLimitRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteSqlLimit, hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadSlowlogRequest 请求对象
     * @return AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogAsyncInvoker(
        DownloadSlowlogRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.downloadSlowlog, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableConfigurationRequest 请求对象
     * @return CompletableFuture<EnableConfigurationResponse>
     */
    public CompletableFuture<EnableConfigurationResponse> enableConfigurationAsync(EnableConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableConfigurationRequest 请求对象
     * @return AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>
     */
    public AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationAsyncInvoker(
        EnableConfigurationRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.enableConfiguration, hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuditlogsRequest 请求对象
     * @return AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(
        ListAuditlogsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listBackups);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listBackups, hcClient);
    }

    /**
     * 查询SQLServer可用字符集
     *
     * 查询SQLServer可用字符集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollationsRequest 请求对象
     * @return CompletableFuture<ListCollationsResponse>
     */
    public CompletableFuture<ListCollationsResponse> listCollationsAsync(ListCollationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listCollations);
    }

    /**
     * 查询SQLServer可用字符集
     *
     * 查询SQLServer可用字符集
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCollationsRequest 请求对象
     * @return AsyncInvoker<ListCollationsRequest, ListCollationsResponse>
     */
    public AsyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsAsyncInvoker(
        ListCollationsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listCollations, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.listConfigurations);
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
        return new AsyncInvoker<>(request, RdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listDatastores, hcClient);
    }

    /**
     * 
     *
     * 批量查询容灾实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrRelationsRequest 请求对象
     * @return CompletableFuture<ListDrRelationsResponse>
     */
    public CompletableFuture<ListDrRelationsResponse> listDrRelationsAsync(ListDrRelationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDrRelations);
    }

    /**
     * 
     *
     * 批量查询容灾实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDrRelationsRequest 请求对象
     * @return AsyncInvoker<ListDrRelationsRequest, ListDrRelationsResponse>
     */
    public AsyncInvoker<ListDrRelationsRequest, ListDrRelationsResponse> listDrRelationsAsyncInvoker(
        ListDrRelationsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listDrRelations, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineFlavorsRequest 请求对象
     * @return CompletableFuture<ListEngineFlavorsResponse>
     */
    public CompletableFuture<ListEngineFlavorsResponse> listEngineFlavorsAsync(ListEngineFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listEngineFlavors);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEngineFlavorsRequest 请求对象
     * @return AsyncInvoker<ListEngineFlavorsRequest, ListEngineFlavorsResponse>
     */
    public AsyncInvoker<ListEngineFlavorsRequest, ListEngineFlavorsResponse> listEngineFlavorsAsyncInvoker(
        ListEngineFlavorsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listEngineFlavors, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(
        ListErrorLogsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsNewRequest 请求对象
     * @return CompletableFuture<ListErrorLogsNewResponse>
     */
    public CompletableFuture<ListErrorLogsNewResponse> listErrorLogsNewAsync(ListErrorLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogsNew);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorLogsNewRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>
     */
    public AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNewAsyncInvoker(
        ListErrorLogsNewRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listErrorLogsNew, hcClient);
    }

    /**
     * 
     *
     * 查询实例的错误日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorlogForLtsRequest 请求对象
     * @return CompletableFuture<ListErrorlogForLtsResponse>
     */
    public CompletableFuture<ListErrorlogForLtsResponse> listErrorlogForLtsAsync(ListErrorlogForLtsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorlogForLts);
    }

    /**
     * 
     *
     * 查询实例的错误日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListErrorlogForLtsRequest 请求对象
     * @return AsyncInvoker<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse>
     */
    public AsyncInvoker<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> listErrorlogForLtsAsyncInvoker(
        ListErrorlogForLtsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listErrorlogForLts, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询指定时间点可恢复的库
     *
     * 查询指定时间点可恢复的库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryDatabaseRequest 请求对象
     * @return CompletableFuture<ListHistoryDatabaseResponse>
     */
    public CompletableFuture<ListHistoryDatabaseResponse> listHistoryDatabaseAsync(ListHistoryDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listHistoryDatabase);
    }

    /**
     * 查询指定时间点可恢复的库
     *
     * 查询指定时间点可恢复的库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryDatabaseRequest 请求对象
     * @return AsyncInvoker<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse>
     */
    public AsyncInvoker<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> listHistoryDatabaseAsyncInvoker(
        ListHistoryDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listHistoryDatabase, hcClient);
    }

    /**
     * 
     *
     * 查询实例大版本升级检查历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionHistoriesRequest 请求对象
     * @return CompletableFuture<ListInspectionHistoriesResponse>
     */
    public CompletableFuture<ListInspectionHistoriesResponse> listInspectionHistoriesAsync(
        ListInspectionHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInspectionHistories);
    }

    /**
     * 
     *
     * 查询实例大版本升级检查历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionHistoriesRequest 请求对象
     * @return AsyncInvoker<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse>
     */
    public AsyncInvoker<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> listInspectionHistoriesAsyncInvoker(
        ListInspectionHistoriesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInspectionHistories, hcClient);
    }

    /**
     * 获取诊断后的实例数量
     *
     * 获取诊断后的实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDiagnosisRequest 请求对象
     * @return CompletableFuture<ListInstanceDiagnosisResponse>
     */
    public CompletableFuture<ListInstanceDiagnosisResponse> listInstanceDiagnosisAsync(
        ListInstanceDiagnosisRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstanceDiagnosis);
    }

    /**
     * 获取诊断后的实例数量
     *
     * 获取诊断后的实例数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDiagnosisRequest 请求对象
     * @return AsyncInvoker<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse>
     */
    public AsyncInvoker<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> listInstanceDiagnosisAsyncInvoker(
        ListInstanceDiagnosisRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInstanceDiagnosis, hcClient);
    }

    /**
     * 查询实例参数修改历史
     *
     * 实例参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceParamHistoriesRequest 请求对象
     * @return CompletableFuture<ListInstanceParamHistoriesResponse>
     */
    public CompletableFuture<ListInstanceParamHistoriesResponse> listInstanceParamHistoriesAsync(
        ListInstanceParamHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstanceParamHistories);
    }

    /**
     * 查询实例参数修改历史
     *
     * 实例参数修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceParamHistoriesRequest 请求对象
     * @return AsyncInvoker<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse>
     */
    public AsyncInvoker<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> listInstanceParamHistoriesAsyncInvoker(
        ListInstanceParamHistoriesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInstanceParamHistories, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstanceTags);
    }

    /**
     * 查询实例标签
     *
     * 查询实例标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询数据库实例列表
     *
     * 查询数据库实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstances);
    }

    /**
     * 查询数据库实例列表
     *
     * 查询数据库实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInstances, hcClient);
    }

    /**
     * 获取指定诊断项的诊断结果
     *
     * 获取指定诊断项的诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesInfoDiagnosisRequest 请求对象
     * @return CompletableFuture<ListInstancesInfoDiagnosisResponse>
     */
    public CompletableFuture<ListInstancesInfoDiagnosisResponse> listInstancesInfoDiagnosisAsync(
        ListInstancesInfoDiagnosisRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstancesInfoDiagnosis);
    }

    /**
     * 获取指定诊断项的诊断结果
     *
     * 获取指定诊断项的诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesInfoDiagnosisRequest 请求对象
     * @return AsyncInvoker<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse>
     */
    public AsyncInvoker<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> listInstancesInfoDiagnosisAsyncInvoker(
        ListInstancesInfoDiagnosisRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInstancesInfoDiagnosis, hcClient);
    }

    /**
     * 获取实例是否能使用极速恢复
     *
     * 批量获取实例是否能在库表恢复时使用极速恢复。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSupportFastRestoreRequest 请求对象
     * @return CompletableFuture<ListInstancesSupportFastRestoreResponse>
     */
    public CompletableFuture<ListInstancesSupportFastRestoreResponse> listInstancesSupportFastRestoreAsync(
        ListInstancesSupportFastRestoreRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstancesSupportFastRestore);
    }

    /**
     * 获取实例是否能使用极速恢复
     *
     * 批量获取实例是否能在库表恢复时使用极速恢复。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesSupportFastRestoreRequest 请求对象
     * @return AsyncInvoker<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse>
     */
    public AsyncInvoker<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> listInstancesSupportFastRestoreAsyncInvoker(
        ListInstancesSupportFastRestoreRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listInstancesSupportFastRestore, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInfoRequest 请求对象
     * @return CompletableFuture<ListJobInfoResponse>
     */
    public CompletableFuture<ListJobInfoResponse> listJobInfoAsync(ListJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInfoRequest 请求对象
     * @return AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse>
     */
    public AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoAsyncInvoker(ListJobInfoRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listJobInfo, hcClient);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     *
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInfoDetailRequest 请求对象
     * @return CompletableFuture<ListJobInfoDetailResponse>
     */
    public CompletableFuture<ListJobInfoDetailResponse> listJobInfoDetailAsync(ListJobInfoDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     *
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobInfoDetailRequest 请求对象
     * @return AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>
     */
    public AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailAsyncInvoker(
        ListJobInfoDetailRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listJobInfoDetail, hcClient);
    }

    /**
     * 
     *
     * 获取LTS配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogLtsConfigsRequest 请求对象
     * @return CompletableFuture<ListLogLtsConfigsResponse>
     */
    public CompletableFuture<ListLogLtsConfigsResponse> listLogLtsConfigsAsync(ListLogLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listLogLtsConfigs);
    }

    /**
     * 
     *
     * 获取LTS配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogLtsConfigsRequest 请求对象
     * @return AsyncInvoker<ListLogLtsConfigsRequest, ListLogLtsConfigsResponse>
     */
    public AsyncInvoker<ListLogLtsConfigsRequest, ListLogLtsConfigsResponse> listLogLtsConfigsAsyncInvoker(
        ListLogLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listLogLtsConfigs, hcClient);
    }

    /**
     * 查询跨区域备份列表
     *
     * 查询跨区域备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffSiteBackupsRequest 请求对象
     * @return CompletableFuture<ListOffSiteBackupsResponse>
     */
    public CompletableFuture<ListOffSiteBackupsResponse> listOffSiteBackupsAsync(ListOffSiteBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /**
     * 查询跨区域备份列表
     *
     * 查询跨区域备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffSiteBackupsRequest 请求对象
     * @return AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>
     */
    public AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsAsyncInvoker(
        ListOffSiteBackupsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listOffSiteBackups, hcClient);
    }

    /**
     * 查询跨区域备份实例列表
     *
     * 查询跨区域备份实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffSiteInstancesRequest 请求对象
     * @return CompletableFuture<ListOffSiteInstancesResponse>
     */
    public CompletableFuture<ListOffSiteInstancesResponse> listOffSiteInstancesAsync(
        ListOffSiteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /**
     * 查询跨区域备份实例列表
     *
     * 查询跨区域备份实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffSiteInstancesRequest 请求对象
     * @return AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>
     */
    public AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesAsyncInvoker(
        ListOffSiteInstancesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listOffSiteInstances, hcClient);
    }

    /**
     * 查询跨区域备份可恢复时间段
     *
     * 查询跨区域备份可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffSiteRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListOffSiteRestoreTimesResponse>
     */
    public CompletableFuture<ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsync(
        ListOffSiteRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /**
     * 查询跨区域备份可恢复时间段
     *
     * 查询跨区域备份可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffSiteRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>
     */
    public AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsyncInvoker(
        ListOffSiteRestoreTimesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    /**
     * 查询实例的pg_hba.conf文件配置
     *
     * 查询实例的pg_hba.conf文件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlHbaInfoRequest 请求对象
     * @return CompletableFuture<ListPostgresqlHbaInfoResponse>
     */
    public CompletableFuture<ListPostgresqlHbaInfoResponse> listPostgresqlHbaInfoAsync(
        ListPostgresqlHbaInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlHbaInfo);
    }

    /**
     * 查询实例的pg_hba.conf文件配置
     *
     * 查询实例的pg_hba.conf文件配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlHbaInfoRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse>
     */
    public AsyncInvoker<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> listPostgresqlHbaInfoAsyncInvoker(
        ListPostgresqlHbaInfoRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlHbaInfo, hcClient);
    }

    /**
     * 查询实例的pg_hba.conf文件修改历史
     *
     * 查询实例的pg_hba.conf文件修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlHbaInfoHistoryRequest 请求对象
     * @return CompletableFuture<ListPostgresqlHbaInfoHistoryResponse>
     */
    public CompletableFuture<ListPostgresqlHbaInfoHistoryResponse> listPostgresqlHbaInfoHistoryAsync(
        ListPostgresqlHbaInfoHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlHbaInfoHistory);
    }

    /**
     * 查询实例的pg_hba.conf文件修改历史
     *
     * 查询实例的pg_hba.conf文件修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlHbaInfoHistoryRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse>
     */
    public AsyncInvoker<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> listPostgresqlHbaInfoHistoryAsyncInvoker(
        ListPostgresqlHbaInfoHistoryRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlHbaInfoHistory, hcClient);
    }

    /**
     * 查询指定时间点可恢复的表(PostgreSQL)
     *
     * 查询指定时间点可恢复的表(PostgreSQL)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlListHistoryTablesRequest 请求对象
     * @return CompletableFuture<ListPostgresqlListHistoryTablesResponse>
     */
    public CompletableFuture<ListPostgresqlListHistoryTablesResponse> listPostgresqlListHistoryTablesAsync(
        ListPostgresqlListHistoryTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlListHistoryTables);
    }

    /**
     * 查询指定时间点可恢复的表(PostgreSQL)
     *
     * 查询指定时间点可恢复的表(PostgreSQL)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlListHistoryTablesRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse>
     */
    public AsyncInvoker<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> listPostgresqlListHistoryTablesAsyncInvoker(
        ListPostgresqlListHistoryTablesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlListHistoryTables, hcClient);
    }

    /**
     * 
     *
     * 查询预定义标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagRequest 请求对象
     * @return CompletableFuture<ListPredefinedTagResponse>
     */
    public CompletableFuture<ListPredefinedTagResponse> listPredefinedTagAsync(ListPredefinedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPredefinedTag);
    }

    /**
     * 
     *
     * 查询预定义标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagRequest 请求对象
     * @return AsyncInvoker<ListPredefinedTagRequest, ListPredefinedTagResponse>
     */
    public AsyncInvoker<ListPredefinedTagRequest, ListPredefinedTagResponse> listPredefinedTagAsyncInvoker(
        ListPredefinedTagRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPredefinedTag, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdSforMySqlProxyRequest 请求对象
     * @return CompletableFuture<ListRdSforMySqlProxyResponse>
     */
    public CompletableFuture<ListRdSforMySqlProxyResponse> listRdSforMySqlProxyAsync(
        ListRdSforMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRdSforMySqlProxy);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdSforMySqlProxyRequest 请求对象
     * @return AsyncInvoker<ListRdSforMySqlProxyRequest, ListRdSforMySqlProxyResponse>
     */
    public AsyncInvoker<ListRdSforMySqlProxyRequest, ListRdSforMySqlProxyResponse> listRdSforMySqlProxyAsyncInvoker(
        ListRdSforMySqlProxyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listRdSforMySqlProxy, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdSforMysqlProxyFlavorsRequest 请求对象
     * @return CompletableFuture<ListRdSforMysqlProxyFlavorsResponse>
     */
    public CompletableFuture<ListRdSforMysqlProxyFlavorsResponse> listRdSforMysqlProxyFlavorsAsync(
        ListRdSforMysqlProxyFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRdSforMysqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRdSforMysqlProxyFlavorsRequest 请求对象
     * @return AsyncInvoker<ListRdSforMysqlProxyFlavorsRequest, ListRdSforMysqlProxyFlavorsResponse>
     */
    public AsyncInvoker<ListRdSforMysqlProxyFlavorsRequest, ListRdSforMysqlProxyFlavorsResponse> listRdSforMysqlProxyFlavorsAsyncInvoker(
        ListRdSforMysqlProxyFlavorsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listRdSforMysqlProxyFlavors, hcClient);
    }

    /**
     * 查询回收站
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRecycleInstances);
    }

    /**
     * 查询回收站
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
        return new AsyncInvoker<>(request, RdsMeta.listRecycleInstances, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRestoreTimes);
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
        return new AsyncInvoker<>(request, RdsMeta.listRestoreTimes, hcClient);
    }

    /**
     * 
     *
     * 获取指定实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimplifiedInstancesRequest 请求对象
     * @return CompletableFuture<ListSimplifiedInstancesResponse>
     */
    public CompletableFuture<ListSimplifiedInstancesResponse> listSimplifiedInstancesAsync(
        ListSimplifiedInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSimplifiedInstances);
    }

    /**
     * 
     *
     * 获取指定实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSimplifiedInstancesRequest 请求对象
     * @return AsyncInvoker<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse>
     */
    public AsyncInvoker<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> listSimplifiedInstancesAsyncInvoker(
        ListSimplifiedInstancesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSimplifiedInstances, hcClient);
    }

    /**
     * 查询慢日志文件列表
     *
     * 查询慢日志文件列表。
     * 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogFileRequest 请求对象
     * @return CompletableFuture<ListSlowLogFileResponse>
     */
    public CompletableFuture<ListSlowLogFileResponse> listSlowLogFileAsync(ListSlowLogFileRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogFile);
    }

    /**
     * 查询慢日志文件列表
     *
     * 查询慢日志文件列表。
     * 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogFileRequest 请求对象
     * @return AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>
     */
    public AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFileAsyncInvoker(
        ListSlowLogFileRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSlowLogFile, hcClient);
    }

    /**
     * 
     *
     * 查询实例慢日志的统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogStatisticsForLtsRequest 请求对象
     * @return CompletableFuture<ListSlowLogStatisticsForLtsResponse>
     */
    public CompletableFuture<ListSlowLogStatisticsForLtsResponse> listSlowLogStatisticsForLtsAsync(
        ListSlowLogStatisticsForLtsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogStatisticsForLts);
    }

    /**
     * 
     *
     * 查询实例慢日志的统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogStatisticsForLtsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse>
     */
    public AsyncInvoker<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> listSlowLogStatisticsForLtsAsyncInvoker(
        ListSlowLogStatisticsForLtsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSlowLogStatisticsForLts, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsNewRequest 请求对象
     * @return CompletableFuture<ListSlowLogsNewResponse>
     */
    public CompletableFuture<ListSlowLogsNewResponse> listSlowLogsNewAsync(ListSlowLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogsNew);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowLogsNewRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>
     */
    public AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNewAsyncInvoker(
        ListSlowLogsNewRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSlowLogsNew, hcClient);
    }

    /**
     * 
     *
     * 查询实例的慢日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogForLtsRequest 请求对象
     * @return CompletableFuture<ListSlowlogForLtsResponse>
     */
    public CompletableFuture<ListSlowlogForLtsResponse> listSlowlogForLtsAsync(ListSlowlogForLtsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowlogForLts);
    }

    /**
     * 
     *
     * 查询实例的慢日志数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogForLtsRequest 请求对象
     * @return AsyncInvoker<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse>
     */
    public AsyncInvoker<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> listSlowlogForLtsAsyncInvoker(
        ListSlowlogForLtsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSlowlogForLts, hcClient);
    }

    /**
     * 获取慢日志统计信息
     *
     * 获取慢日志统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogStatisticsRequest 请求对象
     * @return CompletableFuture<ListSlowlogStatisticsResponse>
     */
    public CompletableFuture<ListSlowlogStatisticsResponse> listSlowlogStatisticsAsync(
        ListSlowlogStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /**
     * 获取慢日志统计信息
     *
     * 获取慢日志统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowlogStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>
     */
    public AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsAsyncInvoker(
        ListSlowlogStatisticsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSlowlogStatistics, hcClient);
    }

    /**
     * 查询SQL限流列表
     *
     * 查询SQL限流列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRequest 请求对象
     * @return CompletableFuture<ListSqlLimitResponse>
     */
    public CompletableFuture<ListSqlLimitResponse> listSqlLimitAsync(ListSqlLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlLimit);
    }

    /**
     * 查询SQL限流列表
     *
     * 查询SQL限流列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRequest 请求对象
     * @return AsyncInvoker<ListSqlLimitRequest, ListSqlLimitResponse>
     */
    public AsyncInvoker<ListSqlLimitRequest, ListSqlLimitResponse> listSqlLimitAsyncInvoker(
        ListSqlLimitRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSqlLimit, hcClient);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSslCertDownloadLinkRequest 请求对象
     * @return CompletableFuture<ListSslCertDownloadLinkResponse>
     */
    public CompletableFuture<ListSslCertDownloadLinkResponse> listSslCertDownloadLinkAsync(
        ListSslCertDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSslCertDownloadLink);
    }

    /**
     * 获取SSL证书下载地址
     *
     * 获取SSL证书下载地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSslCertDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse>
     */
    public AsyncInvoker<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> listSslCertDownloadLinkAsyncInvoker(
        ListSslCertDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSslCertDownloadLink, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询数据库磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(
        ListStorageTypesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listStorageTypes, hcClient);
    }

    /**
     * 
     *
     * 查询实例大版本升级历史信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpgradeHistoriesRequest 请求对象
     * @return CompletableFuture<ListUpgradeHistoriesResponse>
     */
    public CompletableFuture<ListUpgradeHistoriesResponse> listUpgradeHistoriesAsync(
        ListUpgradeHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listUpgradeHistories);
    }

    /**
     * 
     *
     * 查询实例大版本升级历史信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUpgradeHistoriesRequest 请求对象
     * @return AsyncInvoker<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse>
     */
    public AsyncInvoker<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> listUpgradeHistoriesAsyncInvoker(
        ListUpgradeHistoriesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listUpgradeHistories, hcClient);
    }

    /**
     * 查询扩展日志文件列表
     *
     * 查询扩展日志文件列表。
     * 查询扩展日志文件列表，可以调用接口/v3/{project_id}/instances/{instance_id}/xellog-download 获取扩展日志下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListXellogFilesRequest 请求对象
     * @return CompletableFuture<ListXellogFilesResponse>
     */
    public CompletableFuture<ListXellogFilesResponse> listXellogFilesAsync(ListXellogFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listXellogFiles);
    }

    /**
     * 查询扩展日志文件列表
     *
     * 查询扩展日志文件列表。
     * 查询扩展日志文件列表，可以调用接口/v3/{project_id}/instances/{instance_id}/xellog-download 获取扩展日志下载链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListXellogFilesRequest 请求对象
     * @return AsyncInvoker<ListXellogFilesRequest, ListXellogFilesResponse>
     */
    public AsyncInvoker<ListXellogFilesRequest, ListXellogFilesResponse> listXellogFilesAsyncInvoker(
        ListXellogFilesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listXellogFiles, hcClient);
    }

    /**
     * 迁移主备实例的备机
     *
     * 迁移主备实例的备机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateFollowerRequest 请求对象
     * @return CompletableFuture<MigrateFollowerResponse>
     */
    public CompletableFuture<MigrateFollowerResponse> migrateFollowerAsync(MigrateFollowerRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /**
     * 迁移主备实例的备机
     *
     * 迁移主备实例的备机
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MigrateFollowerRequest 请求对象
     * @return AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>
     */
    public AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerAsyncInvoker(
        MigrateFollowerRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.migrateFollower, hcClient);
    }

    /**
     * 修改pg_hba.conf文件的单个或多个配置
     *
     * 修改/新增pg_hba.conf文件的单个或多个配置，以priority做唯一标识，priority不存在的新增，存在的修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPostgresqlHbaConfRequest 请求对象
     * @return CompletableFuture<ModifyPostgresqlHbaConfResponse>
     */
    public CompletableFuture<ModifyPostgresqlHbaConfResponse> modifyPostgresqlHbaConfAsync(
        ModifyPostgresqlHbaConfRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.modifyPostgresqlHbaConf);
    }

    /**
     * 修改pg_hba.conf文件的单个或多个配置
     *
     * 修改/新增pg_hba.conf文件的单个或多个配置，以priority做唯一标识，priority不存在的新增，存在的修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyPostgresqlHbaConfRequest 请求对象
     * @return AsyncInvoker<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse>
     */
    public AsyncInvoker<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> modifyPostgresqlHbaConfAsyncInvoker(
        ModifyPostgresqlHbaConfRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.modifyPostgresqlHbaConf, hcClient);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRdSforMySqlProxyRouteModeRequest 请求对象
     * @return CompletableFuture<ModifyRdSforMySqlProxyRouteModeResponse>
     */
    public CompletableFuture<ModifyRdSforMySqlProxyRouteModeResponse> modifyRdSforMySqlProxyRouteModeAsync(
        ModifyRdSforMySqlProxyRouteModeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.modifyRdSforMySqlProxyRouteMode);
    }

    /**
     * 设置读写分离路由模式
     *
     * 设置读写分离路由模式。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyRdSforMySqlProxyRouteModeRequest 请求对象
     * @return AsyncInvoker<ModifyRdSforMySqlProxyRouteModeRequest, ModifyRdSforMySqlProxyRouteModeResponse>
     */
    public AsyncInvoker<ModifyRdSforMySqlProxyRouteModeRequest, ModifyRdSforMySqlProxyRouteModeResponse> modifyRdSforMySqlProxyRouteModeAsyncInvoker(
        ModifyRdSforMySqlProxyRouteModeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.modifyRdSforMySqlProxyRouteMode, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreExistInstanceRequest 请求对象
     * @return CompletableFuture<RestoreExistInstanceResponse>
     */
    public CompletableFuture<RestoreExistInstanceResponse> restoreExistInstanceAsync(
        RestoreExistInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreExistInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreExistInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>
     */
    public AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstanceAsyncInvoker(
        RestoreExistInstanceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.restoreExistInstance, hcClient);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTablesRequest 请求对象
     * @return CompletableFuture<RestoreTablesResponse>
     */
    public CompletableFuture<RestoreTablesResponse> restoreTablesAsync(RestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTablesRequest 请求对象
     * @return AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse>
     */
    public AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesAsyncInvoker(
        RestoreTablesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.restoreTables, hcClient);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTablesNewRequest 请求对象
     * @return CompletableFuture<RestoreTablesNewResponse>
     */
    public CompletableFuture<RestoreTablesNewResponse> restoreTablesNewAsync(RestoreTablesNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreTablesNew);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreTablesNewRequest 请求对象
     * @return AsyncInvoker<RestoreTablesNewRequest, RestoreTablesNewResponse>
     */
    public AsyncInvoker<RestoreTablesNewRequest, RestoreTablesNewResponse> restoreTablesNewAsyncInvoker(
        RestoreTablesNewRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.restoreTablesNew, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreToExistingInstanceRequest 请求对象
     * @return CompletableFuture<RestoreToExistingInstanceResponse>
     */
    public CompletableFuture<RestoreToExistingInstanceResponse> restoreToExistingInstanceAsync(
        RestoreToExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreToExistingInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>
     */
    public AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceAsyncInvoker(
        RestoreToExistingInstanceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.restoreToExistingInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(
        SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setAuditlogPolicy, hcClient);
    }

    /**
     * 设置自动扩容策略
     *
     * 设置实例存储空间自动扩容策略，按扩容量扣除存储费用。
     * 可用存储空间小于设置值或者10GB时，自动扩容当前存储空间的15%（非10倍数向上取整，账户余额不足，会导致自动扩容失败）。
     * 设置只读实例自动扩容与主实例自动扩容互不影响，对只读实例设置自动扩容时，可选择大于或等于主实例的存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<SetAutoEnlargePolicyResponse>
     */
    public CompletableFuture<SetAutoEnlargePolicyResponse> setAutoEnlargePolicyAsync(
        SetAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAutoEnlargePolicy);
    }

    /**
     * 设置自动扩容策略
     *
     * 设置实例存储空间自动扩容策略，按扩容量扣除存储费用。
     * 可用存储空间小于设置值或者10GB时，自动扩容当前存储空间的15%（非10倍数向上取整，账户余额不足，会导致自动扩容失败）。
     * 设置只读实例自动扩容与主实例自动扩容互不影响，对只读实例设置自动扩容时，可选择大于或等于主实例的存储空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicyAsyncInvoker(
        SetAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
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
        return new AsyncInvoker<>(request, RdsMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置binlog本地保留时长
     *
     * 修改指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBinlogClearPolicyRequest 请求对象
     * @return CompletableFuture<SetBinlogClearPolicyResponse>
     */
    public CompletableFuture<SetBinlogClearPolicyResponse> setBinlogClearPolicyAsync(
        SetBinlogClearPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBinlogClearPolicy);
    }

    /**
     * 设置binlog本地保留时长
     *
     * 修改指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBinlogClearPolicyRequest 请求对象
     * @return AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>
     */
    public AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicyAsyncInvoker(
        SetBinlogClearPolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setBinlogClearPolicy, hcClient);
    }

    /**
     * 重启数据库代理
     *
     * 重启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstancesProxyRestartRequest 请求对象
     * @return CompletableFuture<SetInstancesProxyRestartResponse>
     */
    public CompletableFuture<SetInstancesProxyRestartResponse> setInstancesProxyRestartAsync(
        SetInstancesProxyRestartRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setInstancesProxyRestart);
    }

    /**
     * 重启数据库代理
     *
     * 重启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstancesProxyRestartRequest 请求对象
     * @return AsyncInvoker<SetInstancesProxyRestartRequest, SetInstancesProxyRestartResponse>
     */
    public AsyncInvoker<SetInstancesProxyRestartRequest, SetInstancesProxyRestartResponse> setInstancesProxyRestartAsyncInvoker(
        SetInstancesProxyRestartRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setInstancesProxyRestart, hcClient);
    }

    /**
     * 
     *
     * 关联LTS配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetLogLtsConfigsRequest 请求对象
     * @return CompletableFuture<SetLogLtsConfigsResponse>
     */
    public CompletableFuture<SetLogLtsConfigsResponse> setLogLtsConfigsAsync(SetLogLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setLogLtsConfigs);
    }

    /**
     * 
     *
     * 关联LTS配置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetLogLtsConfigsRequest 请求对象
     * @return AsyncInvoker<SetLogLtsConfigsRequest, SetLogLtsConfigsResponse>
     */
    public AsyncInvoker<SetLogLtsConfigsRequest, SetLogLtsConfigsResponse> setLogLtsConfigsAsyncInvoker(
        SetLogLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setLogLtsConfigs, hcClient);
    }

    /**
     * 设置跨区域备份策略
     *
     * 设置跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsync(
        SetOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /**
     * 设置跨区域备份策略
     *
     * 设置跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetOffSiteBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>
     */
    public AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsyncInvoker(
        SetOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    /**
     * 设置秒级监控策略
     *
     * 设置实例秒级监控策略，约五分钟后生效，对于1秒监控和5秒监控，计费方式为按需付费（每小时扣费一次）。
     * 设置只读实例秒级监控与主实例互不影响。
     * 规格变更到4U以下的实例，秒级监控功能会自动关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSecondLevelMonitorRequest 请求对象
     * @return CompletableFuture<SetSecondLevelMonitorResponse>
     */
    public CompletableFuture<SetSecondLevelMonitorResponse> setSecondLevelMonitorAsync(
        SetSecondLevelMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSecondLevelMonitor);
    }

    /**
     * 设置秒级监控策略
     *
     * 设置实例秒级监控策略，约五分钟后生效，对于1秒监控和5秒监控，计费方式为按需付费（每小时扣费一次）。
     * 设置只读实例秒级监控与主实例互不影响。
     * 规格变更到4U以下的实例，秒级监控功能会自动关闭。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSecondLevelMonitorRequest 请求对象
     * @return AsyncInvoker<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse>
     */
    public AsyncInvoker<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> setSecondLevelMonitorAsyncInvoker(
        SetSecondLevelMonitorRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setSecondLevelMonitor, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSecurityGroupRequest 请求对象
     * @return CompletableFuture<SetSecurityGroupResponse>
     */
    public CompletableFuture<SetSecurityGroupResponse> setSecurityGroupAsync(SetSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSecurityGroupRequest 请求对象
     * @return AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>
     */
    public AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupAsyncInvoker(
        SetSecurityGroupRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setSecurityGroup, hcClient);
    }

    /**
     * 慢日志敏感信息的开关
     *
     * V3慢日志敏感信息的开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveSlowLogRequest 请求对象
     * @return CompletableFuture<SetSensitiveSlowLogResponse>
     */
    public CompletableFuture<SetSensitiveSlowLogResponse> setSensitiveSlowLogAsync(SetSensitiveSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSensitiveSlowLog);
    }

    /**
     * 慢日志敏感信息的开关
     *
     * V3慢日志敏感信息的开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSensitiveSlowLogRequest 请求对象
     * @return AsyncInvoker<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse>
     */
    public AsyncInvoker<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> setSensitiveSlowLogAsyncInvoker(
        SetSensitiveSlowLogRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setSensitiveSlowLog, hcClient);
    }

    /**
     * 生成审计日志下载链接
     *
     * 生成审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowAuditlogDownloadLinkResponse>
     */
    public CompletableFuture<ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsync(
        ShowAuditlogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /**
     * 生成审计日志下载链接
     *
     * 生成审计日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>
     */
    public AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsyncInvoker(
        ShowAuditlogDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(
        ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 查询自动扩容策略
     *
     * 查询实例存储空间自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoEnlargePolicyResponse>
     */
    public CompletableFuture<ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsync(
        ShowAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询自动扩容策略
     *
     * 查询实例存储空间自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsyncInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 
     *
     * 查询实例可升级的目标版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableVersionRequest 请求对象
     * @return CompletableFuture<ShowAvailableVersionResponse>
     */
    public CompletableFuture<ShowAvailableVersionResponse> showAvailableVersionAsync(
        ShowAvailableVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAvailableVersion);
    }

    /**
     * 
     *
     * 查询实例可升级的目标版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAvailableVersionRequest 请求对象
     * @return AsyncInvoker<ShowAvailableVersionRequest, ShowAvailableVersionResponse>
     */
    public AsyncInvoker<ShowAvailableVersionRequest, ShowAvailableVersionResponse> showAvailableVersionAsyncInvoker(
        ShowAvailableVersionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showAvailableVersion, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(
        ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBackupDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showBackupDownloadLink, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupPolicy);
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
        return new AsyncInvoker<>(request, RdsMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取binlog本地保留时长
     *
     * 查寻指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogClearPolicyRequest 请求对象
     * @return CompletableFuture<ShowBinlogClearPolicyResponse>
     */
    public CompletableFuture<ShowBinlogClearPolicyResponse> showBinlogClearPolicyAsync(
        ShowBinlogClearPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBinlogClearPolicy);
    }

    /**
     * 获取binlog本地保留时长
     *
     * 查寻指定实例的binlog本地保留时长。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogClearPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>
     */
    public AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicyAsyncInvoker(
        ShowBinlogClearPolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showBinlogClearPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return CompletableFuture<ShowConfigurationResponse>
     */
    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationAsyncInvoker(
        ShowConfigurationRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showConfiguration, hcClient);
    }

    /**
     * 查询实例ipv6域名。
     *
     * 查询实例ipv6域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDnsNameRequest 请求对象
     * @return CompletableFuture<ShowDnsNameResponse>
     */
    public CompletableFuture<ShowDnsNameResponse> showDnsNameAsync(ShowDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showDnsName);
    }

    /**
     * 查询实例ipv6域名。
     *
     * 查询实例ipv6域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDnsNameRequest 请求对象
     * @return AsyncInvoker<ShowDnsNameRequest, ShowDnsNameResponse>
     */
    public AsyncInvoker<ShowDnsNameRequest, ShowDnsNameResponse> showDnsNameAsyncInvoker(ShowDnsNameRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showDnsName, hcClient);
    }

    /**
     * 
     *
     * 查询实例ipv4域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainNameRequest 请求对象
     * @return CompletableFuture<ShowDomainNameResponse>
     */
    public CompletableFuture<ShowDomainNameResponse> showDomainNameAsync(ShowDomainNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showDomainName);
    }

    /**
     * 
     *
     * 查询实例ipv4域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainNameRequest 请求对象
     * @return AsyncInvoker<ShowDomainNameRequest, ShowDomainNameResponse>
     */
    public AsyncInvoker<ShowDomainNameRequest, ShowDomainNameResponse> showDomainNameAsyncInvoker(
        ShowDomainNameRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showDomainName, hcClient);
    }

    /**
     * 查询跨云容灾复制状态
     *
     * 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrReplicaStatusRequest 请求对象
     * @return CompletableFuture<ShowDrReplicaStatusResponse>
     */
    public CompletableFuture<ShowDrReplicaStatusResponse> showDrReplicaStatusAsync(ShowDrReplicaStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showDrReplicaStatus);
    }

    /**
     * 查询跨云容灾复制状态
     *
     * 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDrReplicaStatusRequest 请求对象
     * @return AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>
     */
    public AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatusAsyncInvoker(
        ShowDrReplicaStatusRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showDrReplicaStatus, hcClient);
    }

    /**
     * 获取增备策略
     *
     * 获取增备策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncreBackupPolicy1Request 请求对象
     * @return CompletableFuture<ShowIncreBackupPolicy1Response>
     */
    public CompletableFuture<ShowIncreBackupPolicy1Response> showIncreBackupPolicy1Async(
        ShowIncreBackupPolicy1Request request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showIncreBackupPolicy1);
    }

    /**
     * 获取增备策略
     *
     * 获取增备策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIncreBackupPolicy1Request 请求对象
     * @return AsyncInvoker<ShowIncreBackupPolicy1Request, ShowIncreBackupPolicy1Response>
     */
    public AsyncInvoker<ShowIncreBackupPolicy1Request, ShowIncreBackupPolicy1Response> showIncreBackupPolicy1AsyncInvoker(
        ShowIncreBackupPolicy1Request request) {
        return new AsyncInvoker<>(request, RdsMeta.showIncreBackupPolicy1, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
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
        return new AsyncInvoker<>(request, RdsMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询跨区域备份策略
     *
     * 查询跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsync(
        ShowOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /**
     * 查询跨区域备份策略
     *
     * 查询跨区域备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOffSiteBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>
     */
    public AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsyncInvoker(
        ShowOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下资源配额情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下资源配额情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showQuotas, hcClient);
    }

    /**
     * 查询回收站的回收策略。
     *
     * 查询回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showRecyclePolicy);
    }

    /**
     * 查询回收站的回收策略。
     *
     * 查询回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 获取实例的复制状态。
     *
     * 获取实例的复制状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationStatusRequest 请求对象
     * @return CompletableFuture<ShowReplicationStatusResponse>
     */
    public CompletableFuture<ShowReplicationStatusResponse> showReplicationStatusAsync(
        ShowReplicationStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showReplicationStatus);
    }

    /**
     * 获取实例的复制状态。
     *
     * 获取实例的复制状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReplicationStatusRequest 请求对象
     * @return AsyncInvoker<ShowReplicationStatusRequest, ShowReplicationStatusResponse>
     */
    public AsyncInvoker<ShowReplicationStatusRequest, ShowReplicationStatusResponse> showReplicationStatusAsyncInvoker(
        ShowReplicationStatusRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showReplicationStatus, hcClient);
    }

    /**
     * 查询秒级监控策略
     *
     * 查询实例秒级监控策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringRequest 请求对象
     * @return CompletableFuture<ShowSecondLevelMonitoringResponse>
     */
    public CompletableFuture<ShowSecondLevelMonitoringResponse> showSecondLevelMonitoringAsync(
        ShowSecondLevelMonitoringRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showSecondLevelMonitoring);
    }

    /**
     * 查询秒级监控策略
     *
     * 查询实例秒级监控策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSecondLevelMonitoringRequest 请求对象
     * @return AsyncInvoker<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse>
     */
    public AsyncInvoker<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> showSecondLevelMonitoringAsyncInvoker(
        ShowSecondLevelMonitoringRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showSecondLevelMonitoring, hcClient);
    }

    /**
     * 查询实例磁盘空间使用量
     *
     * 查询实例磁盘空间使用量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageUsedSpaceRequest 请求对象
     * @return CompletableFuture<ShowStorageUsedSpaceResponse>
     */
    public CompletableFuture<ShowStorageUsedSpaceResponse> showStorageUsedSpaceAsync(
        ShowStorageUsedSpaceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showStorageUsedSpace);
    }

    /**
     * 查询实例磁盘空间使用量
     *
     * 查询实例磁盘空间使用量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStorageUsedSpaceRequest 请求对象
     * @return AsyncInvoker<ShowStorageUsedSpaceRequest, ShowStorageUsedSpaceResponse>
     */
    public AsyncInvoker<ShowStorageUsedSpaceRequest, ShowStorageUsedSpaceResponse> showStorageUsedSpaceAsyncInvoker(
        ShowStorageUsedSpaceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showStorageUsedSpace, hcClient);
    }

    /**
     * 根据实例id查询sqlserver TDE状态
     *
     * 根据实例id查询sqlserver TDE状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTdeStatusRequest 请求对象
     * @return CompletableFuture<ShowTdeStatusResponse>
     */
    public CompletableFuture<ShowTdeStatusResponse> showTdeStatusAsync(ShowTdeStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showTdeStatus);
    }

    /**
     * 根据实例id查询sqlserver TDE状态
     *
     * 根据实例id查询sqlserver TDE状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTdeStatusRequest 请求对象
     * @return AsyncInvoker<ShowTdeStatusRequest, ShowTdeStatusResponse>
     */
    public AsyncInvoker<ShowTdeStatusRequest, ShowTdeStatusResponse> showTdeStatusAsyncInvoker(
        ShowTdeStatusRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showTdeStatus, hcClient);
    }

    /**
     * 
     *
     * 查询大版本检查状态或升级状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeDbMajorVersionStatusRequest 请求对象
     * @return CompletableFuture<ShowUpgradeDbMajorVersionStatusResponse>
     */
    public CompletableFuture<ShowUpgradeDbMajorVersionStatusResponse> showUpgradeDbMajorVersionStatusAsync(
        ShowUpgradeDbMajorVersionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showUpgradeDbMajorVersionStatus);
    }

    /**
     * 
     *
     * 查询大版本检查状态或升级状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeDbMajorVersionStatusRequest 请求对象
     * @return AsyncInvoker<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse>
     */
    public AsyncInvoker<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> showUpgradeDbMajorVersionStatusAsyncInvoker(
        ShowUpgradeDbMajorVersionStatusRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showUpgradeDbMajorVersionStatus, hcClient);
    }

    /**
     * 手动倒换主备
     *
     * 手动倒换主备.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFailoverRequest 请求对象
     * @return CompletableFuture<StartFailoverResponse>
     */
    public CompletableFuture<StartFailoverResponse> startFailoverAsync(StartFailoverRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startFailover);
    }

    /**
     * 手动倒换主备
     *
     * 手动倒换主备.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFailoverRequest 请求对象
     * @return AsyncInvoker<StartFailoverRequest, StartFailoverResponse>
     */
    public AsyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverAsyncInvoker(
        StartFailoverRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startFailover, hcClient);
    }

    /**
     * 扩容数据库实例的磁盘空间
     *
     * 扩容数据库实例的磁盘空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return CompletableFuture<StartInstanceEnlargeVolumeActionResponse>
     */
    public CompletableFuture<StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsync(
        StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    /**
     * 扩容数据库实例的磁盘空间
     *
     * 扩容数据库实例的磁盘空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>
     */
    public AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsyncInvoker(
        StartInstanceEnlargeVolumeActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    /**
     * 数据库实例的磁盘空间缩容
     *
     * 数据库实例的磁盘空间缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceReduceVolumeActionRequest 请求对象
     * @return CompletableFuture<StartInstanceReduceVolumeActionResponse>
     */
    public CompletableFuture<StartInstanceReduceVolumeActionResponse> startInstanceReduceVolumeActionAsync(
        StartInstanceReduceVolumeActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceReduceVolumeAction);
    }

    /**
     * 数据库实例的磁盘空间缩容
     *
     * 数据库实例的磁盘空间缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceReduceVolumeActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceReduceVolumeActionRequest, StartInstanceReduceVolumeActionResponse>
     */
    public AsyncInvoker<StartInstanceReduceVolumeActionRequest, StartInstanceReduceVolumeActionResponse> startInstanceReduceVolumeActionAsyncInvoker(
        StartInstanceReduceVolumeActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startInstanceReduceVolumeAction, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRestartActionRequest 请求对象
     * @return CompletableFuture<StartInstanceRestartActionResponse>
     */
    public CompletableFuture<StartInstanceRestartActionResponse> startInstanceRestartActionAsync(
        StartInstanceRestartActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRestartActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>
     */
    public AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionAsyncInvoker(
        StartInstanceRestartActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startInstanceRestartAction, hcClient);
    }

    /**
     * 单机转主备实例
     *
     * 单机转主备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceSingleToHaActionRequest 请求对象
     * @return CompletableFuture<StartInstanceSingleToHaActionResponse>
     */
    public CompletableFuture<StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsync(
        StartInstanceSingleToHaActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    /**
     * 单机转主备实例
     *
     * 单机转主备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceSingleToHaActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>
     */
    public AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsyncInvoker(
        StartInstanceSingleToHaActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRecyclePolicyRequest 请求对象
     * @return CompletableFuture<StartRecyclePolicyResponse>
     */
    public CompletableFuture<StartRecyclePolicyResponse> startRecyclePolicyAsync(StartRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>
     */
    public AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyAsyncInvoker(
        StartRecyclePolicyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startRecyclePolicy, hcClient);
    }

    /**
     * 变更数据库实例的规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartResizeFlavorActionRequest 请求对象
     * @return CompletableFuture<StartResizeFlavorActionResponse>
     */
    public CompletableFuture<StartResizeFlavorActionResponse> startResizeFlavorActionAsync(
        StartResizeFlavorActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    /**
     * 变更数据库实例的规格
     *
     * 变更数据库实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartResizeFlavorActionRequest 请求对象
     * @return AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>
     */
    public AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionAsyncInvoker(
        StartResizeFlavorActionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startResizeFlavorAction, hcClient);
    }

    /**
     * 开启实例
     *
     * 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartupInstanceRequest 请求对象
     * @return CompletableFuture<StartupInstanceResponse>
     */
    public CompletableFuture<StartupInstanceResponse> startupInstanceAsync(StartupInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startupInstance);
    }

    /**
     * 开启实例
     *
     * 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartupInstanceRequest 请求对象
     * @return AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse>
     */
    public AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse> startupInstanceAsyncInvoker(
        StartupInstanceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startupInstance, hcClient);
    }

    /**
     * 停止备份
     *
     * 停止创建备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return CompletableFuture<StopBackupResponse>
     */
    public CompletableFuture<StopBackupResponse> stopBackupAsync(StopBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 停止创建备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return AsyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public AsyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupAsyncInvoker(StopBackupRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.stopBackup, hcClient);
    }

    /**
     * 停止实例
     *
     * 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopInstance);
    }

    /**
     * 停止实例
     *
     * 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return AsyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.stopInstance, hcClient);
    }

    /**
     * 开启/关闭/禁用所有SQL限流
     *
     * 开启/关闭/禁用所有SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSqlLimitRequest 请求对象
     * @return CompletableFuture<SwitchSqlLimitResponse>
     */
    public CompletableFuture<SwitchSqlLimitResponse> switchSqlLimitAsync(SwitchSqlLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.switchSqlLimit);
    }

    /**
     * 开启/关闭/禁用所有SQL限流
     *
     * 开启/关闭/禁用所有SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSqlLimitRequest 请求对象
     * @return AsyncInvoker<SwitchSqlLimitRequest, SwitchSqlLimitResponse>
     */
    public AsyncInvoker<SwitchSqlLimitRequest, SwitchSqlLimitResponse> switchSqlLimitAsyncInvoker(
        SwitchSqlLimitRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.switchSqlLimit, hcClient);
    }

    /**
     * 设置SSL数据加密
     *
     * 设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /**
     * 设置SSL数据加密
     *
     * 设置SSL数据加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.switchSsl, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse>
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateConfiguration, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataIpRequest 请求对象
     * @return CompletableFuture<UpdateDataIpResponse>
     */
    public CompletableFuture<UpdateDataIpResponse> updateDataIpAsync(UpdateDataIpRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /**
     * 修改内网地址
     *
     * 修改内网地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDataIpRequest 请求对象
     * @return AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>
     */
    public AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpAsyncInvoker(
        UpdateDataIpRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateDataIp, hcClient);
    }

    /**
     * 修改域名
     *
     * 修改域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsNameRequest 请求对象
     * @return CompletableFuture<UpdateDnsNameResponse>
     */
    public CompletableFuture<UpdateDnsNameResponse> updateDnsNameAsync(UpdateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    /**
     * 修改域名
     *
     * 修改域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDnsNameRequest 请求对象
     * @return AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>
     */
    public AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameAsyncInvoker(
        UpdateDnsNameRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateDnsName, hcClient);
    }

    /**
     * 修改增备策略
     *
     * 修改增备策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIncreBackupPolicy1Request 请求对象
     * @return CompletableFuture<UpdateIncreBackupPolicy1Response>
     */
    public CompletableFuture<UpdateIncreBackupPolicy1Response> updateIncreBackupPolicy1Async(
        UpdateIncreBackupPolicy1Request request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateIncreBackupPolicy1);
    }

    /**
     * 修改增备策略
     *
     * 修改增备策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIncreBackupPolicy1Request 请求对象
     * @return AsyncInvoker<UpdateIncreBackupPolicy1Request, UpdateIncreBackupPolicy1Response>
     */
    public AsyncInvoker<UpdateIncreBackupPolicy1Request, UpdateIncreBackupPolicy1Response> updateIncreBackupPolicy1AsyncInvoker(
        UpdateIncreBackupPolicy1Request request) {
        return new AsyncInvoker<>(request, RdsMeta.updateIncreBackupPolicy1, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
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
        return new AsyncInvoker<>(request, RdsMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationAsyncResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncAsync(
        UpdateInstanceConfigurationAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfigurationAsync);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncAsyncInvoker(
        UpdateInstanceConfigurationAsyncRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateInstanceConfigurationAsync, hcClient);
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
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceName);
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
        return new AsyncInvoker<>(request, RdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库端口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updatePort, hcClient);
    }

    /**
     * 修改实例备注信息
     *
     * 修改指定数据库实例的备注信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlInstanceAliasResponse>
     */
    public CompletableFuture<UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsync(
        UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    /**
     * 修改实例备注信息
     *
     * 修改指定数据库实例的备注信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>
     */
    public AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsyncInvoker(
        UpdatePostgresqlInstanceAliasRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    /**
     * 修改SQL限流
     *
     * 修改SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRequest 请求对象
     * @return CompletableFuture<UpdateSqlLimitResponse>
     */
    public CompletableFuture<UpdateSqlLimitResponse> updateSqlLimitAsync(UpdateSqlLimitRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateSqlLimit);
    }

    /**
     * 修改SQL限流
     *
     * 修改SQL限流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRequest 请求对象
     * @return AsyncInvoker<UpdateSqlLimitRequest, UpdateSqlLimitResponse>
     */
    public AsyncInvoker<UpdateSqlLimitRequest, UpdateSqlLimitResponse> updateSqlLimitAsyncInvoker(
        UpdateSqlLimitRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateSqlLimit, hcClient);
    }

    /**
     * sqlserverTDE开关
     *
     * sqlserverTDE开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTdeStatusRequest 请求对象
     * @return CompletableFuture<UpdateTdeStatusResponse>
     */
    public CompletableFuture<UpdateTdeStatusResponse> updateTdeStatusAsync(UpdateTdeStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateTdeStatus);
    }

    /**
     * sqlserverTDE开关
     *
     * sqlserverTDE开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTdeStatusRequest 请求对象
     * @return AsyncInvoker<UpdateTdeStatusRequest, UpdateTdeStatusResponse>
     */
    public AsyncInvoker<UpdateTdeStatusRequest, UpdateTdeStatusResponse> updateTdeStatusAsyncInvoker(
        UpdateTdeStatusRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateTdeStatus, hcClient);
    }

    /**
     * 
     *
     * PostgreSQL数据库升级大版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbMajorVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDbMajorVersionResponse>
     */
    public CompletableFuture<UpgradeDbMajorVersionResponse> upgradeDbMajorVersionAsync(
        UpgradeDbMajorVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.upgradeDbMajorVersion);
    }

    /**
     * 
     *
     * PostgreSQL数据库升级大版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbMajorVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse>
     */
    public AsyncInvoker<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> upgradeDbMajorVersionAsyncInvoker(
        UpgradeDbMajorVersionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.upgradeDbMajorVersion, hcClient);
    }

    /**
     * 
     *
     * 大版本升级前进行升级检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbMajorVersionPreCheckRequest 请求对象
     * @return CompletableFuture<UpgradeDbMajorVersionPreCheckResponse>
     */
    public CompletableFuture<UpgradeDbMajorVersionPreCheckResponse> upgradeDbMajorVersionPreCheckAsync(
        UpgradeDbMajorVersionPreCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.upgradeDbMajorVersionPreCheck);
    }

    /**
     * 
     *
     * 大版本升级前进行升级检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbMajorVersionPreCheckRequest 请求对象
     * @return AsyncInvoker<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse>
     */
    public AsyncInvoker<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> upgradeDbMajorVersionPreCheckAsyncInvoker(
        UpgradeDbMajorVersionPreCheckRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.upgradeDbMajorVersionPreCheck, hcClient);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDbVersionResponse>
     */
    public CompletableFuture<UpgradeDbVersionResponse> upgradeDbVersionAsync(UpgradeDbVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.upgradeDbVersion);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionAsyncInvoker(
        UpgradeDbVersionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.upgradeDbVersion, hcClient);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionNewRequest 请求对象
     * @return CompletableFuture<UpgradeDbVersionNewResponse>
     */
    public CompletableFuture<UpgradeDbVersionNewResponse> upgradeDbVersionNewAsync(UpgradeDbVersionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.upgradeDbVersionNew);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpgradeDbVersionNewRequest 请求对象
     * @return AsyncInvoker<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse>
     */
    public AsyncInvoker<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> upgradeDbVersionNewAsyncInvoker(
        UpgradeDbVersionNewRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.upgradeDbVersionNew, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listApiVersion);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listApiVersion, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionNewRequest 请求对象
     * @return CompletableFuture<ListApiVersionNewResponse>
     */
    public CompletableFuture<ListApiVersionNewResponse> listApiVersionNewAsync(ListApiVersionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listApiVersionNew);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionNewRequest 请求对象
     * @return AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>
     */
    public AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNewAsyncInvoker(
        ListApiVersionNewRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listApiVersionNew, hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showApiVersion, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsync(
        AllowDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>
     */
    public AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsyncInvoker(
        AllowDbUserPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.allowDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createDbUser, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteDbUser, hcClient);
    }

    /**
     * 查询指定用户的已授权数据库
     *
     * 查询指定用户的已授权数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizedDatabasesRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDatabasesResponse>
     */
    public CompletableFuture<ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsync(
        ListAuthorizedDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /**
     * 查询指定用户的已授权数据库
     *
     * 查询指定用户的已授权数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizedDatabasesRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>
     */
    public AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsyncInvoker(
        ListAuthorizedDatabasesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listAuthorizedDatabases, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizedDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsync(
        ListAuthorizedDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizedDbUsersRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>
     */
    public AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsyncInvoker(
        ListAuthorizedDbUsersRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listDbUsers, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.resetPwd, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRequest 请求对象
     * @return CompletableFuture<RevokeResponse>
     */
    public CompletableFuture<RevokeResponse> revokeAsync(RevokeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revoke);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeRequest 请求对象
     * @return AsyncInvoker<RevokeRequest, RevokeResponse>
     */
    public AsyncInvoker<RevokeRequest, RevokeResponse> revokeAsyncInvoker(RevokeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.revoke, hcClient);
    }

    /**
     * 设置数据库账号密码
     *
     * 设置数据库账号密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetDbUserPwdResponse>
     */
    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    /**
     * 设置数据库账号密码
     *
     * 设置数据库账号密码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdAsyncInvoker(
        SetDbUserPwdRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    /**
     * 设置数据库用户只读参数
     *
     * 根据业务需求，设置数据库用户只读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetReadOnlySwitchRequest 请求对象
     * @return CompletableFuture<SetReadOnlySwitchResponse>
     */
    public CompletableFuture<SetReadOnlySwitchResponse> setReadOnlySwitchAsync(SetReadOnlySwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setReadOnlySwitch);
    }

    /**
     * 设置数据库用户只读参数
     *
     * 根据业务需求，设置数据库用户只读
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetReadOnlySwitchRequest 请求对象
     * @return AsyncInvoker<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse>
     */
    public AsyncInvoker<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> setReadOnlySwitchAsyncInvoker(
        SetReadOnlySwitchRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setReadOnlySwitch, hcClient);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseResponse>
     */
    public CompletableFuture<UpdateDatabaseResponse> updateDatabaseAsync(UpdateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDatabase);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseAsyncInvoker(
        UpdateDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateDatabase, hcClient);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserCommentRequest 请求对象
     * @return CompletableFuture<UpdateDbUserCommentResponse>
     */
    public CompletableFuture<UpdateDbUserCommentResponse> updateDbUserCommentAsync(UpdateDbUserCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDbUserComment);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserCommentRequest 请求对象
     * @return AsyncInvoker<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse>
     */
    public AsyncInvoker<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> updateDbUserCommentAsyncInvoker(
        UpdateDbUserCommentRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateDbUserComment, hcClient);
    }

    /**
     * 修改实例下用户host信息
     *
     * 修改实例下用户host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostPrivilegeRequest 请求对象
     * @return CompletableFuture<UpdateHostPrivilegeResponse>
     */
    public CompletableFuture<UpdateHostPrivilegeResponse> updateHostPrivilegeAsync(UpdateHostPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateHostPrivilege);
    }

    /**
     * 修改实例下用户host信息
     *
     * 修改实例下用户host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHostPrivilegeRequest 请求对象
     * @return AsyncInvoker<UpdateHostPrivilegeRequest, UpdateHostPrivilegeResponse>
     */
    public AsyncInvoker<UpdateHostPrivilegeRequest, UpdateHostPrivilegeResponse> updateHostPrivilegeAsyncInvoker(
        UpdateHostPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateHostPrivilege, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbPrivilegeResponse>
     */
    public CompletableFuture<AllowDbPrivilegeResponse> allowDbPrivilegeAsync(AllowDbPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>
     */
    public AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeAsyncInvoker(
        AllowDbPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.allowDbPrivilege, hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理实例进行规格变更。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeProxyScaleRequest 请求对象
     * @return CompletableFuture<ChangeProxyScaleResponse>
     */
    public CompletableFuture<ChangeProxyScaleResponse> changeProxyScaleAsync(ChangeProxyScaleRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeProxyScale);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理实例进行规格变更。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeProxyScaleRequest 请求对象
     * @return AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>
     */
    public AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScaleAsyncInvoker(
        ChangeProxyScaleRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.changeProxyScale, hcClient);
    }

    /**
     * 修改读写分离阈值
     *
     * 修改指定实例的读写分离延时阈值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTheDelayThresholdRequest 请求对象
     * @return CompletableFuture<ChangeTheDelayThresholdResponse>
     */
    public CompletableFuture<ChangeTheDelayThresholdResponse> changeTheDelayThresholdAsync(
        ChangeTheDelayThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeTheDelayThreshold);
    }

    /**
     * 修改读写分离阈值
     *
     * 修改指定实例的读写分离延时阈值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTheDelayThresholdRequest 请求对象
     * @return AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>
     */
    public AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThresholdAsyncInvoker(
        ChangeTheDelayThresholdRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.changeTheDelayThreshold, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlDatabaseRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDatabaseResponse>
     */
    public CompletableFuture<CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsync(
        CreatePostgresqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlDatabaseRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>
     */
    public AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsyncInvoker(
        CreatePostgresqlDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createPostgresqlDatabase, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDatabaseSchemaResponse>
     */
    public CompletableFuture<CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsync(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>
     */
    public AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsyncInvoker(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlDbUserRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDbUserResponse>
     */
    public CompletableFuture<CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsync(
        CreatePostgresqlDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlDbUserRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>
     */
    public AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsyncInvoker(
        CreatePostgresqlDbUserRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createPostgresqlDbUser, hcClient);
    }

    /**
     * 创建插件
     *
     * 在指定数据库上创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlExtensionRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlExtensionResponse>
     */
    public CompletableFuture<CreatePostgresqlExtensionResponse> createPostgresqlExtensionAsync(
        CreatePostgresqlExtensionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlExtension);
    }

    /**
     * 创建插件
     *
     * 在指定数据库上创建插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePostgresqlExtensionRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse>
     */
    public AsyncInvoker<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> createPostgresqlExtensionAsyncInvoker(
        CreatePostgresqlExtensionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createPostgresqlExtension, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlDatabaseRequest 请求对象
     * @return CompletableFuture<DeletePostgresqlDatabaseResponse>
     */
    public CompletableFuture<DeletePostgresqlDatabaseResponse> deletePostgresqlDatabaseAsync(
        DeletePostgresqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deletePostgresqlDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlDatabaseRequest 请求对象
     * @return AsyncInvoker<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse>
     */
    public AsyncInvoker<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> deletePostgresqlDatabaseAsyncInvoker(
        DeletePostgresqlDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deletePostgresqlDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlDbUserRequest 请求对象
     * @return CompletableFuture<DeletePostgresqlDbUserResponse>
     */
    public CompletableFuture<DeletePostgresqlDbUserResponse> deletePostgresqlDbUserAsync(
        DeletePostgresqlDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deletePostgresqlDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlDbUserRequest 请求对象
     * @return AsyncInvoker<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse>
     */
    public AsyncInvoker<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> deletePostgresqlDbUserAsyncInvoker(
        DeletePostgresqlDbUserRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deletePostgresqlDbUser, hcClient);
    }

    /**
     * 删除插件
     *
     * 在指定数据库上删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlExtensionRequest 请求对象
     * @return CompletableFuture<DeletePostgresqlExtensionResponse>
     */
    public CompletableFuture<DeletePostgresqlExtensionResponse> deletePostgresqlExtensionAsync(
        DeletePostgresqlExtensionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deletePostgresqlExtension);
    }

    /**
     * 删除插件
     *
     * 在指定数据库上删除插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePostgresqlExtensionRequest 请求对象
     * @return AsyncInvoker<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse>
     */
    public AsyncInvoker<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> deletePostgresqlExtensionAsyncInvoker(
        DeletePostgresqlExtensionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deletePostgresqlExtension, hcClient);
    }

    /**
     * 授予用户角色
     *
     * 授予用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePrivilegeDatabaseUserRoleRequest 请求对象
     * @return CompletableFuture<ExecutePrivilegeDatabaseUserRoleResponse>
     */
    public CompletableFuture<ExecutePrivilegeDatabaseUserRoleResponse> executePrivilegeDatabaseUserRoleAsync(
        ExecutePrivilegeDatabaseUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.executePrivilegeDatabaseUserRole);
    }

    /**
     * 授予用户角色
     *
     * 授予用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecutePrivilegeDatabaseUserRoleRequest 请求对象
     * @return AsyncInvoker<ExecutePrivilegeDatabaseUserRoleRequest, ExecutePrivilegeDatabaseUserRoleResponse>
     */
    public AsyncInvoker<ExecutePrivilegeDatabaseUserRoleRequest, ExecutePrivilegeDatabaseUserRoleResponse> executePrivilegeDatabaseUserRoleAsyncInvoker(
        ExecutePrivilegeDatabaseUserRoleRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.executePrivilegeDatabaseUserRole, hcClient);
    }

    /**
     * 撤回用户角色
     *
     * 撤回用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRevokeDatabaseUserRoleRequest 请求对象
     * @return CompletableFuture<ExecuteRevokeDatabaseUserRoleResponse>
     */
    public CompletableFuture<ExecuteRevokeDatabaseUserRoleResponse> executeRevokeDatabaseUserRoleAsync(
        ExecuteRevokeDatabaseUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.executeRevokeDatabaseUserRole);
    }

    /**
     * 撤回用户角色
     *
     * 撤回用户角色
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRevokeDatabaseUserRoleRequest 请求对象
     * @return AsyncInvoker<ExecuteRevokeDatabaseUserRoleRequest, ExecuteRevokeDatabaseUserRoleResponse>
     */
    public AsyncInvoker<ExecuteRevokeDatabaseUserRoleRequest, ExecuteRevokeDatabaseUserRoleResponse> executeRevokeDatabaseUserRoleAsyncInvoker(
        ExecuteRevokeDatabaseUserRoleRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.executeRevokeDatabaseUserRole, hcClient);
    }

    /**
     * 查询数据库角色信息
     *
     * 查询数据库角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUserRoleRequest 请求对象
     * @return CompletableFuture<ListDatabaseUserRoleResponse>
     */
    public CompletableFuture<ListDatabaseUserRoleResponse> listDatabaseUserRoleAsync(
        ListDatabaseUserRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatabaseUserRole);
    }

    /**
     * 查询数据库角色信息
     *
     * 查询数据库角色信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseUserRoleRequest 请求对象
     * @return AsyncInvoker<ListDatabaseUserRoleRequest, ListDatabaseUserRoleResponse>
     */
    public AsyncInvoker<ListDatabaseUserRoleRequest, ListDatabaseUserRoleResponse> listDatabaseUserRoleAsyncInvoker(
        ListDatabaseUserRoleRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listDatabaseUserRole, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDatabaseSchemasResponse>
     */
    public CompletableFuture<ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsync(
        ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>
     */
    public AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsyncInvoker(
        ListPostgresqlDatabaseSchemasRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlDatabasesRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDatabasesResponse>
     */
    public CompletableFuture<ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsync(
        ListPostgresqlDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlDatabasesRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>
     */
    public AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsyncInvoker(
        ListPostgresqlDatabasesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDbUserPaginatedResponse>
     */
    public CompletableFuture<ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsync(
        ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>
     */
    public AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsyncInvoker(
        ListPostgresqlDbUserPaginatedRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    /**
     * 查询插件
     *
     * 获取指定数据库的插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlExtensionRequest 请求对象
     * @return CompletableFuture<ListPostgresqlExtensionResponse>
     */
    public CompletableFuture<ListPostgresqlExtensionResponse> listPostgresqlExtensionAsync(
        ListPostgresqlExtensionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlExtension);
    }

    /**
     * 查询插件
     *
     * 获取指定数据库的插件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPostgresqlExtensionRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse>
     */
    public AsyncInvoker<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> listPostgresqlExtensionAsyncInvoker(
        ListPostgresqlExtensionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listPostgresqlExtension, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokePostgresqlDbPrivilegeRequest 请求对象
     * @return CompletableFuture<RevokePostgresqlDbPrivilegeResponse>
     */
    public CompletableFuture<RevokePostgresqlDbPrivilegeResponse> revokePostgresqlDbPrivilegeAsync(
        RevokePostgresqlDbPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revokePostgresqlDbPrivilege);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokePostgresqlDbPrivilegeRequest 请求对象
     * @return AsyncInvoker<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse>
     */
    public AsyncInvoker<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> revokePostgresqlDbPrivilegeAsyncInvoker(
        RevokePostgresqlDbPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.revokePostgresqlDbPrivilege, hcClient);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return CompletableFuture<SearchQueryScaleComputeFlavorsResponse>
     */
    public CompletableFuture<SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsAsync(
        SearchQueryScaleComputeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.searchQueryScaleComputeFlavors);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>
     */
    public AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsAsyncInvoker(
        SearchQueryScaleComputeFlavorsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.searchQueryScaleComputeFlavors, hcClient);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQueryScaleFlavorsRequest 请求对象
     * @return CompletableFuture<SearchQueryScaleFlavorsResponse>
     */
    public CompletableFuture<SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsAsync(
        SearchQueryScaleFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.searchQueryScaleFlavors);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchQueryScaleFlavorsRequest 请求对象
     * @return AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>
     */
    public AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsAsyncInvoker(
        SearchQueryScaleFlavorsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.searchQueryScaleFlavors, hcClient);
    }

    /**
     * 设置数据库用户权限
     *
     * 设置数据库用户权限：只读或可读写。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDatabaseUserPrivilegeRequest 请求对象
     * @return CompletableFuture<SetDatabaseUserPrivilegeResponse>
     */
    public CompletableFuture<SetDatabaseUserPrivilegeResponse> setDatabaseUserPrivilegeAsync(
        SetDatabaseUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDatabaseUserPrivilege);
    }

    /**
     * 设置数据库用户权限
     *
     * 设置数据库用户权限：只读或可读写。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDatabaseUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse>
     */
    public AsyncInvoker<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> setDatabaseUserPrivilegeAsyncInvoker(
        SetDatabaseUserPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setDatabaseUserPrivilege, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPostgresqlDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetPostgresqlDbUserPwdResponse>
     */
    public CompletableFuture<SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsync(
        SetPostgresqlDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPostgresqlDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>
     */
    public AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsyncInvoker(
        SetPostgresqlDbUserPwdRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询指定实例的数据库代理详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return CompletableFuture<ShowInformationAboutDatabaseProxyResponse>
     */
    public CompletableFuture<ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyAsync(
        ShowInformationAboutDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInformationAboutDatabaseProxy);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询指定实例的数据库代理详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>
     */
    public AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyAsyncInvoker(
        ShowInformationAboutDatabaseProxyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showInformationAboutDatabaseProxy, hcClient);
    }

    /**
     * 获取实例指定参数的值
     *
     * 获取实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPostgresqlParamValueRequest 请求对象
     * @return CompletableFuture<ShowPostgresqlParamValueResponse>
     */
    public CompletableFuture<ShowPostgresqlParamValueResponse> showPostgresqlParamValueAsync(
        ShowPostgresqlParamValueRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showPostgresqlParamValue);
    }

    /**
     * 获取实例指定参数的值
     *
     * 获取实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPostgresqlParamValueRequest 请求对象
     * @return AsyncInvoker<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse>
     */
    public AsyncInvoker<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> showPostgresqlParamValueAsyncInvoker(
        ShowPostgresqlParamValueRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.showPostgresqlParamValue, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 为指定实例开启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDatabaseProxyRequest 请求对象
     * @return CompletableFuture<StartDatabaseProxyResponse>
     */
    public CompletableFuture<StartDatabaseProxyResponse> startDatabaseProxyAsync(StartDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startDatabaseProxy);
    }

    /**
     * 开启数据库代理
     *
     * 为指定实例开启数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartDatabaseProxyRequest 请求对象
     * @return AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>
     */
    public AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxyAsyncInvoker(
        StartDatabaseProxyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.startDatabaseProxy, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 为指定实例关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDatabaseProxyRequest 请求对象
     * @return CompletableFuture<StopDatabaseProxyResponse>
     */
    public CompletableFuture<StopDatabaseProxyResponse> stopDatabaseProxyAsync(StopDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopDatabaseProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 为指定实例关闭数据库代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopDatabaseProxyRequest 请求对象
     * @return AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>
     */
    public AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxyAsyncInvoker(
        StopDatabaseProxyRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.stopDatabaseProxy, hcClient);
    }

    /**
     * 修改数据库owner
     *
     * 修改数据库owner
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseOwnerRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseOwnerResponse>
     */
    public CompletableFuture<UpdateDatabaseOwnerResponse> updateDatabaseOwnerAsync(UpdateDatabaseOwnerRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDatabaseOwner);
    }

    /**
     * 修改数据库owner
     *
     * 修改数据库owner
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDatabaseOwnerRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse>
     */
    public AsyncInvoker<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwnerAsyncInvoker(
        UpdateDatabaseOwnerRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateDatabaseOwner, hcClient);
    }

    /**
     * 
     *
     * 数据库帐号授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<UpdateDbUserPrivilegeResponse>
     */
    public CompletableFuture<UpdateDbUserPrivilegeResponse> updateDbUserPrivilegeAsync(
        UpdateDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDbUserPrivilege);
    }

    /**
     * 
     *
     * 数据库帐号授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse>
     */
    public AsyncInvoker<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> updateDbUserPrivilegeAsyncInvoker(
        UpdateDbUserPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateDbUserPrivilege, hcClient);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlDatabaseRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlDatabaseResponse>
     */
    public CompletableFuture<UpdatePostgresqlDatabaseResponse> updatePostgresqlDatabaseAsync(
        UpdatePostgresqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlDatabase);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlDatabaseRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse>
     */
    public AsyncInvoker<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> updatePostgresqlDatabaseAsyncInvoker(
        UpdatePostgresqlDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updatePostgresqlDatabase, hcClient);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlDbUserCommentRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlDbUserCommentResponse>
     */
    public CompletableFuture<UpdatePostgresqlDbUserCommentResponse> updatePostgresqlDbUserCommentAsync(
        UpdatePostgresqlDbUserCommentRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlDbUserComment);
    }

    /**
     * 修改数据库用户名备注
     *
     * 修改数据库用户名备注
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlDbUserCommentRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse>
     */
    public AsyncInvoker<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> updatePostgresqlDbUserCommentAsyncInvoker(
        UpdatePostgresqlDbUserCommentRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updatePostgresqlDbUserComment, hcClient);
    }

    /**
     * 更新插件
     *
     * 在指定数据库上更新插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlExtensionRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlExtensionResponse>
     */
    public CompletableFuture<UpdatePostgresqlExtensionResponse> updatePostgresqlExtensionAsync(
        UpdatePostgresqlExtensionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlExtension);
    }

    /**
     * 更新插件
     *
     * 在指定数据库上更新插件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlExtensionRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlExtensionRequest, UpdatePostgresqlExtensionResponse>
     */
    public AsyncInvoker<UpdatePostgresqlExtensionRequest, UpdatePostgresqlExtensionResponse> updatePostgresqlExtensionAsyncInvoker(
        UpdatePostgresqlExtensionRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updatePostgresqlExtension, hcClient);
    }

    /**
     * 修改实例指定参数的值
     *
     * 修改实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlParameterValueRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlParameterValueResponse>
     */
    public CompletableFuture<UpdatePostgresqlParameterValueResponse> updatePostgresqlParameterValueAsync(
        UpdatePostgresqlParameterValueRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlParameterValue);
    }

    /**
     * 修改实例指定参数的值
     *
     * 修改实例指定参数的值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePostgresqlParameterValueRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse>
     */
    public AsyncInvoker<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> updatePostgresqlParameterValueAsyncInvoker(
        UpdatePostgresqlParameterValueRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updatePostgresqlParameterValue, hcClient);
    }

    /**
     * 修改读写分离权重
     *
     * 修改指定实例的读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReadWeightRequest 请求对象
     * @return CompletableFuture<UpdateReadWeightResponse>
     */
    public CompletableFuture<UpdateReadWeightResponse> updateReadWeightAsync(UpdateReadWeightRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateReadWeight);
    }

    /**
     * 修改读写分离权重
     *
     * 修改指定实例的读写分离权重。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReadWeightRequest 请求对象
     * @return AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>
     */
    public AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeightAsyncInvoker(
        UpdateReadWeightRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.updateReadWeight, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowSqlserverDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsync(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>
     */
    public AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsyncInvoker(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    /**
     * 添加MSDTC
     *
     * 添加MSDTC相关主机host地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMsdtcsRequest 请求对象
     * @return CompletableFuture<BatchAddMsdtcsResponse>
     */
    public CompletableFuture<BatchAddMsdtcsResponse> batchAddMsdtcsAsync(BatchAddMsdtcsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchAddMsdtcs);
    }

    /**
     * 添加MSDTC
     *
     * 添加MSDTC相关主机host地址
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddMsdtcsRequest 请求对象
     * @return AsyncInvoker<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse>
     */
    public AsyncInvoker<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> batchAddMsdtcsAsyncInvoker(
        BatchAddMsdtcsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.batchAddMsdtcs, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlserverDatabaseRequest 请求对象
     * @return CompletableFuture<CreateSqlserverDatabaseResponse>
     */
    public CompletableFuture<CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsync(
        CreateSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlserverDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>
     */
    public AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsyncInvoker(
        CreateSqlserverDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createSqlserverDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlserverDbUserRequest 请求对象
     * @return CompletableFuture<CreateSqlserverDbUserResponse>
     */
    public CompletableFuture<CreateSqlserverDbUserResponse> createSqlserverDbUserAsync(
        CreateSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlserverDbUserRequest 请求对象
     * @return AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>
     */
    public AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserAsyncInvoker(
        CreateSqlserverDbUserRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.createSqlserverDbUser, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlserverDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDatabaseResponse>
     */
    public CompletableFuture<DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsync(
        DeleteSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlserverDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>
     */
    public AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsyncInvoker(
        DeleteSqlserverDatabaseRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlserverDatabaseExRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDatabaseExResponse>
     */
    public CompletableFuture<DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExAsync(
        DeleteSqlserverDatabaseExRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabaseEx);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlserverDatabaseExRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>
     */
    public AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExAsyncInvoker(
        DeleteSqlserverDatabaseExRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteSqlserverDatabaseEx, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlserverDbUserRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDbUserResponse>
     */
    public CompletableFuture<DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsync(
        DeleteSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlserverDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>
     */
    public AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsyncInvoker(
        DeleteSqlserverDbUserRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedSqlserverDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsync(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>
     */
    public AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsyncInvoker(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    /**
     * 查询MSDTC的hosts信息
     *
     * 查询MSDTC的hosts信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMsdtcHostsRequest 请求对象
     * @return CompletableFuture<ListMsdtcHostsResponse>
     */
    public CompletableFuture<ListMsdtcHostsResponse> listMsdtcHostsAsync(ListMsdtcHostsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listMsdtcHosts);
    }

    /**
     * 查询MSDTC的hosts信息
     *
     * 查询MSDTC的hosts信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMsdtcHostsRequest 请求对象
     * @return AsyncInvoker<ListMsdtcHostsRequest, ListMsdtcHostsResponse>
     */
    public AsyncInvoker<ListMsdtcHostsRequest, ListMsdtcHostsResponse> listMsdtcHostsAsyncInvoker(
        ListMsdtcHostsRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listMsdtcHosts, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlserverDatabasesRequest 请求对象
     * @return CompletableFuture<ListSqlserverDatabasesResponse>
     */
    public CompletableFuture<ListSqlserverDatabasesResponse> listSqlserverDatabasesAsync(
        ListSqlserverDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlserverDatabasesRequest 请求对象
     * @return AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>
     */
    public AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesAsyncInvoker(
        ListSqlserverDatabasesRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSqlserverDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlserverDbUsersRequest 请求对象
     * @return CompletableFuture<ListSqlserverDbUsersResponse>
     */
    public CompletableFuture<ListSqlserverDbUsersResponse> listSqlserverDbUsersAsync(
        ListSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlserverDbUsersRequest 请求对象
     * @return AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>
     */
    public AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersAsyncInvoker(
        ListSqlserverDbUsersRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.listSqlserverDbUsers, hcClient);
    }

    /**
     * 修改实例字符集
     *
     * 修改实例字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCollationRequest 请求对象
     * @return CompletableFuture<ModifyCollationResponse>
     */
    public CompletableFuture<ModifyCollationResponse> modifyCollationAsync(ModifyCollationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.modifyCollation);
    }

    /**
     * 修改实例字符集
     *
     * 修改实例字符集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyCollationRequest 请求对象
     * @return AsyncInvoker<ModifyCollationRequest, ModifyCollationResponse>
     */
    public AsyncInvoker<ModifyCollationRequest, ModifyCollationResponse> modifyCollationAsyncInvoker(
        ModifyCollationRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.modifyCollation, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse>
     */
    public CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsync(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>
     */
    public AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsyncInvoker(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

    /**
     * 收缩数据库日志
     *
     * 收缩数据库日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstancesDbShrinkRequest 请求对象
     * @return CompletableFuture<SetInstancesDbShrinkResponse>
     */
    public CompletableFuture<SetInstancesDbShrinkResponse> setInstancesDbShrinkAsync(
        SetInstancesDbShrinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setInstancesDbShrink);
    }

    /**
     * 收缩数据库日志
     *
     * 收缩数据库日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstancesDbShrinkRequest 请求对象
     * @return AsyncInvoker<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse>
     */
    public AsyncInvoker<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse> setInstancesDbShrinkAsyncInvoker(
        SetInstancesDbShrinkRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setInstancesDbShrink, hcClient);
    }

    /**
     * 收缩数据库日志
     *
     * 收缩数据库日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstancesNewDbShrinkRequest 请求对象
     * @return CompletableFuture<SetInstancesNewDbShrinkResponse>
     */
    public CompletableFuture<SetInstancesNewDbShrinkResponse> setInstancesNewDbShrinkAsync(
        SetInstancesNewDbShrinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setInstancesNewDbShrink);
    }

    /**
     * 收缩数据库日志
     *
     * 收缩数据库日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetInstancesNewDbShrinkRequest 请求对象
     * @return AsyncInvoker<SetInstancesNewDbShrinkRequest, SetInstancesNewDbShrinkResponse>
     */
    public AsyncInvoker<SetInstancesNewDbShrinkRequest, SetInstancesNewDbShrinkResponse> setInstancesNewDbShrinkAsyncInvoker(
        SetInstancesNewDbShrinkRequest request) {
        return new AsyncInvoker<>(request, RdsMeta.setInstancesNewDbShrink, hcClient);
    }

}

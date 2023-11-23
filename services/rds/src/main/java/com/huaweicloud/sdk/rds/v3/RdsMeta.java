package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rds.v3.model.AddMsdtcRequestBody;
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
import com.huaweicloud.sdk.rds.v3.model.ApplyConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.rds.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchAddMsdtcsRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchAddMsdtcsResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteBackupRequestBody;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchDeleteManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchRestoreDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchRestoreDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchRestorePostgreSqlTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchRestorePostgreSqlTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchTagActionAddRequestBody;
import com.huaweicloud.sdk.rds.v3.model.BatchTagActionDelRequestBody;
import com.huaweicloud.sdk.rds.v3.model.BatchTagAddActionRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchTagAddActionResponse;
import com.huaweicloud.sdk.rds.v3.model.BatchTagDelActionRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchTagDelActionResponse;
import com.huaweicloud.sdk.rds.v3.model.BindEipRequest;
import com.huaweicloud.sdk.rds.v3.model.BinlogClearPolicyRequestBody;
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
import com.huaweicloud.sdk.rds.v3.model.ChangingTheDelayThresholdRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ConfigurationCopyRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ConfigurationForCreation;
import com.huaweicloud.sdk.rds.v3.model.ConfigurationForUpdate;
import com.huaweicloud.sdk.rds.v3.model.CopyConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CopyConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDatabaseSchemaResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.CreatePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadResponse;
import com.huaweicloud.sdk.rds.v3.model.CustomerModifyAutoEnlargePolicyReq;
import com.huaweicloud.sdk.rds.v3.model.CustomerUpgradeDatabaseVersionReq;
import com.huaweicloud.sdk.rds.v3.model.CustomerUpgradeDatabaseVersionReqNew;
import com.huaweicloud.sdk.rds.v3.model.DataIpRequest;
import com.huaweicloud.sdk.rds.v3.model.DatabaseForCreation;
import com.huaweicloud.sdk.rds.v3.model.DbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.DbUserPwdRequest;
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
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogRequest;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogResponse;
import com.huaweicloud.sdk.rds.v3.model.DropDatabaseV3Req;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.EnlargeVolumeRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ErrorlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.FailoverModeRequest;
import com.huaweicloud.sdk.rds.v3.model.FailoverRequest;
import com.huaweicloud.sdk.rds.v3.model.FailoverStrategyRequest;
import com.huaweicloud.sdk.rds.v3.model.FollowerMigrateRequest;
import com.huaweicloud.sdk.rds.v3.model.GenerateAuditlogDownloadLinkRequest;
import com.huaweicloud.sdk.rds.v3.model.GrantRequest;
import com.huaweicloud.sdk.rds.v3.model.InstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.InstanceRestartRequsetBody;
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
import com.huaweicloud.sdk.rds.v3.model.ListInstancesSupportFastRestoreRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ListInstancesSupportFastRestoreResponse;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoDetailRequest;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoDetailResponse;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoRequest;
import com.huaweicloud.sdk.rds.v3.model.ListJobInfoResponse;
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
import com.huaweicloud.sdk.rds.v3.model.ModifiyInstanceNameRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyDnsNameRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ModifyParamRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyProxyWeightRequest;
import com.huaweicloud.sdk.rds.v3.model.MysqlReadOnlySwitch;
import com.huaweicloud.sdk.rds.v3.model.OpenProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.OpsWindowRequest;
import com.huaweicloud.sdk.rds.v3.model.PostgreSQLHistoryDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.PostgreSQLHistoryTableRequest;
import com.huaweicloud.sdk.rds.v3.model.PostgreSQLRestoreDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.PostgreSQLRestoreTableRequest;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlDatabaseForCreation;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlDatabaseSchemaReq;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlGrantRequest;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlHbaConf;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlHbaHistory;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlPreCheckUpgradeMajorVersionReq;
import com.huaweicloud.sdk.rds.v3.model.PostgresqlUserForCreation;
import com.huaweicloud.sdk.rds.v3.model.PwdResetRequest;
import com.huaweicloud.sdk.rds.v3.model.RecyclePolicyRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.ResizeFlavorRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreExistingInstanceRequestBody;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewRequestBody;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesNewResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesRequestBody;
import com.huaweicloud.sdk.rds.v3.model.RestoreTablesResponse;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceRequestBody;
import com.huaweicloud.sdk.rds.v3.model.RestoreToExistingInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeRequestBody;
import com.huaweicloud.sdk.rds.v3.model.RevokePostgresqlDbPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokeRequestBody;
import com.huaweicloud.sdk.rds.v3.model.RevokeResponse;
import com.huaweicloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.RevokeSqlserverDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.ScaleProxyRequestBody;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleComputeFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleFlavorsRequest;
import com.huaweicloud.sdk.rds.v3.model.SearchQueryScaleFlavorsResponse;
import com.huaweicloud.sdk.rds.v3.model.SecondMonitor;
import com.huaweicloud.sdk.rds.v3.model.SecurityGroupRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyRequestBody;
import com.huaweicloud.sdk.rds.v3.model.SetAuditlogPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyRequestBody;
import com.huaweicloud.sdk.rds.v3.model.SetBackupPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetBinlogClearPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetBinlogClearPolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeReqV3;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.SetDatabaseUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.SetDbUserPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.SetDbUserPwdResponse;
import com.huaweicloud.sdk.rds.v3.model.SetOffSiteBackupPolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.SetOffSiteBackupPolicyRequestBody;
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
import com.huaweicloud.sdk.rds.v3.model.ShowTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowUpgradeDbMajorVersionStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowUpgradeDbMajorVersionStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.SimplifiedInstancesRequest;
import com.huaweicloud.sdk.rds.v3.model.Single2Ha;
import com.huaweicloud.sdk.rds.v3.model.SlowLogStatisticsForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.SlowlogDownloadRequest;
import com.huaweicloud.sdk.rds.v3.model.SlowlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.SqlserverDatabaseForCreation;
import com.huaweicloud.sdk.rds.v3.model.SqlserverGrantRequest;
import com.huaweicloud.sdk.rds.v3.model.SqlserverRevokeRequest;
import com.huaweicloud.sdk.rds.v3.model.SqlserverUserForCreation;
import com.huaweicloud.sdk.rds.v3.model.SslOptionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.StartDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.StartFailoverRequest;
import com.huaweicloud.sdk.rds.v3.model.StartFailoverResponse;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionRequest;
import com.huaweicloud.sdk.rds.v3.model.StartInstanceEnlargeVolumeActionResponse;
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
import com.huaweicloud.sdk.rds.v3.model.StopDatabaseProxyRequest;
import com.huaweicloud.sdk.rds.v3.model.StopDatabaseProxyResponse;
import com.huaweicloud.sdk.rds.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseReq;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbPortRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserCommentRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserCommentResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDbUserReq;
import com.huaweicloud.sdk.rds.v3.model.UpdateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationAsyncResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationRequestBody;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePortRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePortResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDbUserCommentRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlDbUserCommentResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateRdsInstanceAliasRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusRequestBody;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionPreCheckRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionPreCheckResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbMajorVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionNewRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionNewResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpgradeDbVersionResponse;
import com.huaweicloud.sdk.rds.v3.model.UpgradePgMajorVersion;
import com.huaweicloud.sdk.rds.v3.model.UserForCreation;

import java.time.OffsetDateTime;
import java.util.List;

@SuppressWarnings("unchecked")
public class RdsMeta {

    public static final HttpRequestDef<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse> addPostgresqlHbaConf =
        genForaddPostgresqlHbaConf();

    private static HttpRequestDef<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse> genForaddPostgresqlHbaConf() {
        // basic
        HttpRequestDef.Builder<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddPostgresqlHbaConfRequest.class, AddPostgresqlHbaConfResponse.class)
            .withName("AddPostgresqlHbaConf")
            .withUri("/v3/{project_id}/instances/{instance_id}/hba-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddPostgresqlHbaConfRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<PostgresqlHbaConf>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddPostgresqlHbaConfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(PostgresqlHbaConf.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsync =
        genForapplyConfigurationAsync();

    private static HttpRequestDef<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> genForapplyConfigurationAsync() {
        // basic
        HttpRequestDef.Builder<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ApplyConfigurationAsyncRequest.class, ApplyConfigurationAsyncResponse.class)
            .withName("ApplyConfigurationAsync")
            .withUri("/v3.1/{project_id}/configurations/{config_id}/apply")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyConfigurationAsyncRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyConfigurationAsyncRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ApplyConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequest.class),
            f -> f.withMarshaller(ApplyConfigurationAsyncRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForattachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForattachEip() {
        // basic
        HttpRequestDef.Builder<AttachEipRequest, AttachEipResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AttachEipRequest.class, AttachEipResponse.class)
                .withName("AttachEip")
                .withUri("/v3/{project_id}/instances/{instance_id}/public-ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachEipRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AttachEipRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AttachEipRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AttachEipRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BindEipRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEipRequest.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> batchDeleteManualBackup =
        genForbatchDeleteManualBackup();

    private static HttpRequestDef<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> genForbatchDeleteManualBackup() {
        // basic
        HttpRequestDef.Builder<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteManualBackupRequest.class, BatchDeleteManualBackupResponse.class)
            .withName("BatchDeleteManualBackup")
            .withUri("/v3/{project_id}/backups/batch-delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteManualBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchDeleteBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBackupRequestBody.class),
            f -> f.withMarshaller(BatchDeleteManualBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> batchRestoreDatabase =
        genForbatchRestoreDatabase();

    private static HttpRequestDef<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> genForbatchRestoreDatabase() {
        // basic
        HttpRequestDef.Builder<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchRestoreDatabaseRequest.class, BatchRestoreDatabaseResponse.class)
            .withName("BatchRestoreDatabase")
            .withUri("/v3/{project_id}/instances/batch/restore/databases")
            .withContentType("application/json");

        // requests
        builder.<PostgreSQLRestoreDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PostgreSQLRestoreDatabaseRequest.class),
            f -> f.withMarshaller(BatchRestoreDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> batchRestorePostgreSqlTables =
        genForbatchRestorePostgreSqlTables();

    private static HttpRequestDef<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> genForbatchRestorePostgreSqlTables() {
        // basic
        HttpRequestDef.Builder<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchRestorePostgreSqlTablesRequest.class,
                    BatchRestorePostgreSqlTablesResponse.class)
                .withName("BatchRestorePostgreSqlTables")
                .withUri("/v3/{project_id}/instances/batch/restore/tables")
                .withContentType("application/json");

        // requests
        builder.<PostgreSQLRestoreTableRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PostgreSQLRestoreTableRequest.class),
            f -> f.withMarshaller(BatchRestorePostgreSqlTablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddAction =
        genForbatchTagAddAction();

    private static HttpRequestDef<BatchTagAddActionRequest, BatchTagAddActionResponse> genForbatchTagAddAction() {
        // basic
        HttpRequestDef.Builder<BatchTagAddActionRequest, BatchTagAddActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagAddActionRequest.class, BatchTagAddActionResponse.class)
                .withName("BatchTagAddAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagAddActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagAddActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchTagActionAddRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionAddRequestBody.class),
            f -> f.withMarshaller(BatchTagAddActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelAction =
        genForbatchTagDelAction();

    private static HttpRequestDef<BatchTagDelActionRequest, BatchTagDelActionResponse> genForbatchTagDelAction() {
        // basic
        HttpRequestDef.Builder<BatchTagDelActionRequest, BatchTagDelActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchTagDelActionRequest.class, BatchTagDelActionResponse.class)
                .withName("BatchTagDelAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagDelActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagDelActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BatchTagActionDelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionDelRequestBody.class),
            f -> f.withMarshaller(BatchTagDelActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverMode =
        genForchangeFailoverMode();

    private static HttpRequestDef<ChangeFailoverModeRequest, ChangeFailoverModeResponse> genForchangeFailoverMode() {
        // basic
        HttpRequestDef.Builder<ChangeFailoverModeRequest, ChangeFailoverModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeFailoverModeRequest.class, ChangeFailoverModeResponse.class)
                .withName("ChangeFailoverMode")
                .withUri("/v3/{project_id}/instances/{instance_id}/failover/mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeFailoverModeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeFailoverModeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeFailoverModeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeFailoverModeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<FailoverModeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FailoverModeRequest.class),
            f -> f.withMarshaller(ChangeFailoverModeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategy =
        genForchangeFailoverStrategy();

    private static HttpRequestDef<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> genForchangeFailoverStrategy() {
        // basic
        HttpRequestDef.Builder<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeFailoverStrategyRequest.class, ChangeFailoverStrategyResponse.class)
            .withName("ChangeFailoverStrategy")
            .withUri("/v3/{project_id}/instances/{instance_id}/failover/strategy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeFailoverStrategyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeFailoverStrategyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<FailoverStrategyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FailoverStrategyRequest.class),
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindow =
        genForchangeOpsWindow();

    private static HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> genForchangeOpsWindow() {
        // basic
        HttpRequestDef.Builder<ChangeOpsWindowRequest, ChangeOpsWindowResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeOpsWindowRequest.class, ChangeOpsWindowResponse.class)
                .withName("ChangeOpsWindow")
                .withUri("/v3/{project_id}/instances/{instance_id}/ops-window")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeOpsWindowRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeOpsWindowRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OpsWindowRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpsWindowRequest.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> copyConfiguration =
        genForcopyConfiguration();

    private static HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> genForcopyConfiguration() {
        // basic
        HttpRequestDef.Builder<CopyConfigurationRequest, CopyConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyConfigurationRequest.class, CopyConfigurationResponse.class)
                .withName("CopyConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/copy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<ConfigurationCopyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfigurationCopyRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration =
        genForcreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForcreateConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateConfigurationRequest, CreateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigurationRequest.class, CreateConfigurationResponse.class)
                .withName("CreateConfiguration")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<CreateConfigurationRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateConfigurationRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ConfigurationForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationForCreation.class),
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDnsNameRequest, CreateDnsNameResponse> createDnsName =
        genForcreateDnsName();

    private static HttpRequestDef<CreateDnsNameRequest, CreateDnsNameResponse> genForcreateDnsName() {
        // basic
        HttpRequestDef.Builder<CreateDnsNameRequest, CreateDnsNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDnsNameRequest.class, CreateDnsNameResponse.class)
                .withName("CreateDnsName")
                .withUri("/v3/{project_id}/instances/{instance_id}/create-dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDnsNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateDnsNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDnsNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateDnsNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateDnsNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDnsNameRequestBody.class),
            f -> f.withMarshaller(CreateDnsNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getXClientToken, (req, v) -> {
                req.setXClientToken(v);
            }));
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackup =
        genForcreateManualBackup();

    private static HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> genForcreateManualBackup() {
        // basic
        HttpRequestDef.Builder<CreateManualBackupRequest, CreateManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateManualBackupRequest.class, CreateManualBackupResponse.class)
                .withName("CreateManualBackup")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateManualBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualBackupRequestBody.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstance =
        genForcreateRestoreInstance();

    private static HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> genForcreateRestoreInstance() {
        // basic
        HttpRequestDef.Builder<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRestoreInstanceRequest.class, CreateRestoreInstanceResponse.class)
            .withName("CreateRestoreInstance")
            .withUri("/v3/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<CreateRestoreInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRestoreInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateRestoreInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRestoreInstanceRequestBody.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> createXelLogDownload =
        genForcreateXelLogDownload();

    private static HttpRequestDef<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> genForcreateXelLogDownload() {
        // basic
        HttpRequestDef.Builder<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateXelLogDownloadRequest.class, CreateXelLogDownloadResponse.class)
            .withName("CreateXelLogDownload")
            .withUri("/v3/{project_id}/instances/{instance_id}/xellog-download")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateXelLogDownloadRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateXelLogDownloadRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateXelLogDownloadRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateXelLogDownloadRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateXelLogDownloadRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateXelLogDownloadRequestBody.class),
            f -> f.withMarshaller(CreateXelLogDownloadRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration =
        genFordeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genFordeleteConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteConfigurationRequest, DeleteConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteConfigurationRequest.class, DeleteConfigurationResponse.class)
            .withName("DeleteConfiguration")
            .withUri("/v3/{project_id}/configurations/{config_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genFordeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genFordeleteJob() {
        // basic
        HttpRequestDef.Builder<DeleteJobRequest, DeleteJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteJobRequest.class, DeleteJobResponse.class)
                .withName("DeleteJob")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteJobRequest::getId, (req, v) -> {
                req.setId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteJobResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackup =
        genFordeleteManualBackup();

    private static HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> genFordeleteManualBackup() {
        // basic
        HttpRequestDef.Builder<DeleteManualBackupRequest, DeleteManualBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteManualBackupRequest.class, DeleteManualBackupResponse.class)
                .withName("DeleteManualBackup")
                .withUri("/v3/{project_id}/backups/{backup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> deletePostgresqlHbaConf =
        genFordeletePostgresqlHbaConf();

    private static HttpRequestDef<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> genFordeletePostgresqlHbaConf() {
        // basic
        HttpRequestDef.Builder<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePostgresqlHbaConfRequest.class, DeletePostgresqlHbaConfResponse.class)
            .withName("DeletePostgresqlHbaConf")
            .withUri("/v3/{project_id}/instances/{instance_id}/hba-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlHbaConfRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<PostgresqlHbaConf>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeletePostgresqlHbaConfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(PostgresqlHbaConf.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlog =
        genFordownloadSlowlog();

    private static HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> genFordownloadSlowlog() {
        // basic
        HttpRequestDef.Builder<DownloadSlowlogRequest, DownloadSlowlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadSlowlogRequest.class, DownloadSlowlogResponse.class)
                .withName("DownloadSlowlog")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DownloadSlowlogRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadSlowlogRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SlowlogDownloadRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlowlogDownloadRequest.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableConfigurationRequest, EnableConfigurationResponse> enableConfiguration =
        genForenableConfiguration();

    private static HttpRequestDef<EnableConfigurationRequest, EnableConfigurationResponse> genForenableConfiguration() {
        // basic
        HttpRequestDef.Builder<EnableConfigurationRequest, EnableConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, EnableConfigurationRequest.class, EnableConfigurationResponse.class)
                .withName("EnableConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}/apply")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ApplyConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequest.class),
            f -> f.withMarshaller(EnableConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogs =
        genForlistAuditlogs();

    private static HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> genForlistAuditlogs() {
        // basic
        HttpRequestDef.Builder<ListAuditlogsRequest, ListAuditlogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuditlogsRequest.class, ListAuditlogsResponse.class)
                .withName("ListAuditlogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForlistBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForlistBackups() {
        // basic
        HttpRequestDef.Builder<ListBackupsRequest, ListBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBackupsRequest.class, ListBackupsResponse.class)
                .withName("ListBackups")
                .withUri("/v3/{project_id}/backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<ListBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollationsRequest, ListCollationsResponse> listCollations =
        genForlistCollations();

    private static HttpRequestDef<ListCollationsRequest, ListCollationsResponse> genForlistCollations() {
        // basic
        HttpRequestDef.Builder<ListCollationsRequest, ListCollationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCollationsRequest.class, ListCollationsResponse.class)
                .withName("ListCollations")
                .withUri("/v3/{project_id}/collations")
                .withContentType("application/json");

        // requests
        builder.<ListCollationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCollationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListCollationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurations =
        genForlistConfigurations();

    private static HttpRequestDef<ListConfigurationsRequest, ListConfigurationsResponse> genForlistConfigurations() {
        // basic
        HttpRequestDef.Builder<ListConfigurationsRequest, ListConfigurationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigurationsRequest.class, ListConfigurationsResponse.class)
                .withName("ListConfigurations")
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<ListConfigurationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConfigurationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores =
        genForlistDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForlistDatastores() {
        // basic
        HttpRequestDef.Builder<ListDatastoresRequest, ListDatastoresResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatastoresRequest.class, ListDatastoresResponse.class)
                .withName("ListDatastores")
                .withUri("/v3/{project_id}/datastores/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<ListDatastoresRequest.DatabaseNameEnum>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListDatastoresRequest.DatabaseNameEnum.class),
            f -> f.withMarshaller(ListDatastoresRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatastoresRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDrRelationsRequest, ListDrRelationsResponse> listDrRelations =
        genForlistDrRelations();

    private static HttpRequestDef<ListDrRelationsRequest, ListDrRelationsResponse> genForlistDrRelations() {
        // basic
        HttpRequestDef.Builder<ListDrRelationsRequest, ListDrRelationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDrRelationsRequest.class, ListDrRelationsResponse.class)
                .withName("ListDrRelations")
                .withUri("/v3/{project_id}/instances/disaster-recovery-relation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDrRelationsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEngineFlavorsRequest, ListEngineFlavorsResponse> listEngineFlavors =
        genForlistEngineFlavors();

    private static HttpRequestDef<ListEngineFlavorsRequest, ListEngineFlavorsResponse> genForlistEngineFlavors() {
        // basic
        HttpRequestDef.Builder<ListEngineFlavorsRequest, ListEngineFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEngineFlavorsRequest.class, ListEngineFlavorsResponse.class)
                .withName("ListEngineFlavors")
                .withUri("/v3/{project_id}/instances/{instance_id}/available-flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("availability_zone_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getAvailabilityZoneIds, (req, v) -> {
                req.setAvailabilityZoneIds(v);
            }));
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getHaMode, (req, v) -> {
                req.setHaMode(v);
            }));
        builder.<String>withRequestField("spec_code_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getSpecCodeLike, (req, v) -> {
                req.setSpecCodeLike(v);
            }));
        builder.<String>withRequestField("flavor_category_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getFlavorCategoryType, (req, v) -> {
                req.setFlavorCategoryType(v);
            }));
        builder.<Boolean>withRequestField("is_rha_flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getIsRhaFlavor, (req, v) -> {
                req.setIsRhaFlavor(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogs =
        genForlistErrorLogs();

    private static HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> genForlistErrorLogs() {
        // basic
        HttpRequestDef.Builder<ListErrorLogsRequest, ListErrorLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorLogsRequest.class, ListErrorLogsResponse.class)
                .withName("ListErrorLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListErrorLogsRequest.LevelEnum>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorLogsRequest.LevelEnum.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNew =
        genForlistErrorLogsNew();

    private static HttpRequestDef<ListErrorLogsNewRequest, ListErrorLogsNewResponse> genForlistErrorLogsNew() {
        // basic
        HttpRequestDef.Builder<ListErrorLogsNewRequest, ListErrorLogsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListErrorLogsNewRequest.class, ListErrorLogsNewResponse.class)
                .withName("ListErrorLogsNew")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/errorlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListErrorLogsNewRequest.LevelEnum>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorLogsNewRequest.LevelEnum.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> listErrorlogForLts =
        genForlistErrorlogForLts();

    private static HttpRequestDef<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> genForlistErrorlogForLts() {
        // basic
        HttpRequestDef.Builder<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListErrorlogForLtsRequest.class, ListErrorlogForLtsResponse.class)
                .withName("ListErrorlogForLts")
                .withUri("/v3/{project_id}/instances/{instance_id}/error-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorlogForLtsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListErrorlogForLtsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorlogForLtsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListErrorlogForLtsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ErrorlogForLtsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ErrorlogForLtsRequest.class),
            f -> f.withMarshaller(ListErrorlogForLtsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v3/{project_id}/flavors/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<ListFlavorsRequest.DatabaseNameEnum>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListFlavorsRequest.DatabaseNameEnum.class),
            f -> f.withMarshaller(ListFlavorsRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            }));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, (req, v) -> {
                req.setSpecCode(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> listHistoryDatabase =
        genForlistHistoryDatabase();

    private static HttpRequestDef<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> genForlistHistoryDatabase() {
        // basic
        HttpRequestDef.Builder<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHistoryDatabaseRequest.class, ListHistoryDatabaseResponse.class)
                .withName("ListHistoryDatabase")
                .withUri("/v3/{project_id}/{database_name}/instances/history/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryDatabaseRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgreSQLHistoryDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgreSQLHistoryDatabaseRequest.class),
            f -> f.withMarshaller(ListHistoryDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> listInspectionHistories =
        genForlistInspectionHistories();

    private static HttpRequestDef<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> genForlistInspectionHistories() {
        // basic
        HttpRequestDef.Builder<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInspectionHistoriesRequest.class, ListInspectionHistoriesResponse.class)
            .withName("ListInspectionHistories")
            .withUri("/v3/{project_id}/instances/{instance_id}/major-version/inspection-histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getSortField, (req, v) -> {
                req.setSortField(v);
            }));
        builder.<String>withRequestField("target_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getTargetVersion, (req, v) -> {
                req.setTargetVersion(v);
            }));
        builder.<Boolean>withRequestField("is_available",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getIsAvailable, (req, v) -> {
                req.setIsAvailable(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> listInstanceDiagnosis =
        genForlistInstanceDiagnosis();

    private static HttpRequestDef<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> genForlistInstanceDiagnosis() {
        // basic
        HttpRequestDef.Builder<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceDiagnosisRequest.class, ListInstanceDiagnosisResponse.class)
            .withName("ListInstanceDiagnosis")
            .withUri("/v3/{project_id}/instances/diagnosis")
            .withContentType("application/json");

        // requests
        builder.<ListInstanceDiagnosisRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceDiagnosisRequest.EngineEnum.class),
            f -> f.withMarshaller(ListInstanceDiagnosisRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> listInstanceParamHistories =
        genForlistInstanceParamHistories();

    private static HttpRequestDef<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> genForlistInstanceParamHistories() {
        // basic
        HttpRequestDef.Builder<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceParamHistoriesRequest.class,
                    ListInstanceParamHistoriesResponse.class)
                .withName("ListInstanceParamHistories")
                .withUri("/v3/{project_id}/instances/{instance_id}/configuration-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("param_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getParamName, (req, v) -> {
                req.setParamName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTags =
        genForlistInstanceTags();

    private static HttpRequestDef<ListInstanceTagsRequest, ListInstanceTagsResponse> genForlistInstanceTags() {
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
            f -> f.withMarshaller(ListInstanceTagsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<ListInstancesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<ListInstancesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));
        builder.<ListInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> listInstancesInfoDiagnosis =
        genForlistInstancesInfoDiagnosis();

    private static HttpRequestDef<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> genForlistInstancesInfoDiagnosis() {
        // basic
        HttpRequestDef.Builder<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstancesInfoDiagnosisRequest.class,
                    ListInstancesInfoDiagnosisResponse.class)
                .withName("ListInstancesInfoDiagnosis")
                .withUri("/v3/{project_id}/instances/diagnosis/info")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesInfoDiagnosisRequest.EngineEnum>withRequestField("engine",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesInfoDiagnosisRequest.EngineEnum.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getEngine, (req, v) -> {
                req.setEngine(v);
            }));
        builder.<ListInstancesInfoDiagnosisRequest.DiagnosisEnum>withRequestField("diagnosis",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesInfoDiagnosisRequest.DiagnosisEnum.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getDiagnosis, (req, v) -> {
                req.setDiagnosis(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> listInstancesSupportFastRestore =
        genForlistInstancesSupportFastRestore();

    private static HttpRequestDef<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> genForlistInstancesSupportFastRestore() {
        // basic
        HttpRequestDef.Builder<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInstancesSupportFastRestoreRequest.class,
                    ListInstancesSupportFastRestoreResponse.class)
                .withName("ListInstancesSupportFastRestore")
                .withUri("/v3/{project_id}/instances/fast-restore")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesSupportFastRestoreRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ListInstancesSupportFastRestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesSupportFastRestoreRequestBody.class),
            f -> f.withMarshaller(ListInstancesSupportFastRestoreRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInfoRequest, ListJobInfoResponse> listJobInfo = genForlistJobInfo();

    private static HttpRequestDef<ListJobInfoRequest, ListJobInfoResponse> genForlistJobInfo() {
        // basic
        HttpRequestDef.Builder<ListJobInfoRequest, ListJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInfoRequest.class, ListJobInfoResponse.class)
                .withName("ListJobInfo")
                .withUri("/v3/{project_id}/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetail =
        genForlistJobInfoDetail();

    private static HttpRequestDef<ListJobInfoDetailRequest, ListJobInfoDetailResponse> genForlistJobInfoDetail() {
        // basic
        HttpRequestDef.Builder<ListJobInfoDetailRequest, ListJobInfoDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListJobInfoDetailRequest.class, ListJobInfoDetailResponse.class)
                .withName("ListJobInfoDetail")
                .withUri("/v3/{project_id}/instances/{instance_id}/tasklist/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackups =
        genForlistOffSiteBackups();

    private static HttpRequestDef<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> genForlistOffSiteBackups() {
        // basic
        HttpRequestDef.Builder<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOffSiteBackupsRequest.class, ListOffSiteBackupsResponse.class)
                .withName("ListOffSiteBackups")
                .withUri("/v3/{project_id}/offsite-backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<ListOffSiteBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOffSiteBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBackupType, (req, v) -> {
                req.setBackupType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstances =
        genForlistOffSiteInstances();

    private static HttpRequestDef<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> genForlistOffSiteInstances() {
        // basic
        HttpRequestDef.Builder<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOffSiteInstancesRequest.class, ListOffSiteInstancesResponse.class)
            .withName("ListOffSiteInstances")
            .withUri("/v3/backups/offsite-backup-instance")
            .withContentType("application/json");

        // requests
        builder.<Object>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Object>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListOffSiteInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOffSiteInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimes =
        genForlistOffSiteRestoreTimes();

    private static HttpRequestDef<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> genForlistOffSiteRestoreTimes() {
        // basic
        HttpRequestDef.Builder<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListOffSiteRestoreTimesRequest.class, ListOffSiteRestoreTimesResponse.class)
            .withName("ListOffSiteRestoreTimes")
            .withUri("/v3/{project_id}/instances/{instance_id}/offsite-restore-time")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> listPostgresqlHbaInfo =
        genForlistPostgresqlHbaInfo();

    private static HttpRequestDef<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> genForlistPostgresqlHbaInfo() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPostgresqlHbaInfoRequest.class, ListPostgresqlHbaInfoResponse.class)
            .withName("ListPostgresqlHbaInfo")
            .withUri("/v3/{project_id}/instances/{instance_id}/hba-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response
        builder.<List<PostgresqlHbaConf>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PostgresqlHbaConf.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> listPostgresqlHbaInfoHistory =
        genForlistPostgresqlHbaInfoHistory();

    private static HttpRequestDef<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> genForlistPostgresqlHbaInfoHistory() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPostgresqlHbaInfoHistoryRequest.class,
                    ListPostgresqlHbaInfoHistoryResponse.class)
                .withName("ListPostgresqlHbaInfoHistory")
                .withUri("/v3/{project_id}/instances/{instance_id}/hba-info/history")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response
        builder.<List<PostgresqlHbaHistory>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(PostgresqlHbaHistory.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> listPostgresqlListHistoryTables =
        genForlistPostgresqlListHistoryTables();

    private static HttpRequestDef<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> genForlistPostgresqlListHistoryTables() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListPostgresqlListHistoryTablesRequest.class,
                    ListPostgresqlListHistoryTablesResponse.class)
                .withName("ListPostgresqlListHistoryTables")
                .withUri("/v3/{project_id}/{database_name}/instances/history/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlListHistoryTablesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlListHistoryTablesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgreSQLHistoryTableRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgreSQLHistoryTableRequest.class),
            f -> f.withMarshaller(ListPostgresqlListHistoryTablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefinedTagRequest, ListPredefinedTagResponse> listPredefinedTag =
        genForlistPredefinedTag();

    private static HttpRequestDef<ListPredefinedTagRequest, ListPredefinedTagResponse> genForlistPredefinedTag() {
        // basic
        HttpRequestDef.Builder<ListPredefinedTagRequest, ListPredefinedTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPredefinedTagRequest.class, ListPredefinedTagResponse.class)
                .withName("ListPredefinedTag")
                .withUri("/v3/{project_id}/tags/predefined-tag")
                .withContentType("application/json");

        // requests
        builder.<ListPredefinedTagRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPredefinedTagRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListPredefinedTagRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTags =
        genForlistProjectTags();

    private static HttpRequestDef<ListProjectTagsRequest, ListProjectTagsResponse> genForlistProjectTags() {
        // basic
        HttpRequestDef.Builder<ListProjectTagsRequest, ListProjectTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectTagsRequest.class, ListProjectTagsResponse.class)
                .withName("ListProjectTags")
                .withUri("/v3/{project_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstances =
        genForlistRecycleInstances();

    private static HttpRequestDef<ListRecycleInstancesRequest, ListRecycleInstancesResponse> genForlistRecycleInstances() {
        // basic
        HttpRequestDef.Builder<ListRecycleInstancesRequest, ListRecycleInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecycleInstancesRequest.class, ListRecycleInstancesResponse.class)
            .withName("ListRecycleInstances")
            .withUri("/v3/{project_id}/recycle-instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimes =
        genForlistRestoreTimes();

    private static HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> genForlistRestoreTimes() {
        // basic
        HttpRequestDef.Builder<ListRestoreTimesRequest, ListRestoreTimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRestoreTimesRequest.class, ListRestoreTimesResponse.class)
                .withName("ListRestoreTimes")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore-time")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getDate, (req, v) -> {
                req.setDate(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> listSimplifiedInstances =
        genForlistSimplifiedInstances();

    private static HttpRequestDef<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> genForlistSimplifiedInstances() {
        // basic
        HttpRequestDef.Builder<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListSimplifiedInstancesRequest.class, ListSimplifiedInstancesResponse.class)
            .withName("ListSimplifiedInstances")
            .withUri("/v3/{project_id}/simplified-instances")
            .withContentType("application/json");

        // requests
        builder.<ListSimplifiedInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSimplifiedInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSimplifiedInstancesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SimplifiedInstancesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SimplifiedInstancesRequest.class),
            f -> f.withMarshaller(ListSimplifiedInstancesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFile =
        genForlistSlowLogFile();

    private static HttpRequestDef<ListSlowLogFileRequest, ListSlowLogFileResponse> genForlistSlowLogFile() {
        // basic
        HttpRequestDef.Builder<ListSlowLogFileRequest, ListSlowLogFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogFileRequest.class, ListSlowLogFileResponse.class)
                .withName("ListSlowLogFile")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> listSlowLogStatisticsForLts =
        genForlistSlowLogStatisticsForLts();

    private static HttpRequestDef<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> genForlistSlowLogStatisticsForLts() {
        // basic
        HttpRequestDef.Builder<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListSlowLogStatisticsForLtsRequest.class,
                    ListSlowLogStatisticsForLtsResponse.class)
                .withName("ListSlowLogStatisticsForLts")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/slow-logs/statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogStatisticsForLtsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListSlowLogStatisticsForLtsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogStatisticsForLtsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSlowLogStatisticsForLtsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SlowLogStatisticsForLtsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlowLogStatisticsForLtsRequest.class),
            f -> f.withMarshaller(ListSlowLogStatisticsForLtsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForlistSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForlistSlowLogs() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsRequest, ListSlowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsRequest.class, ListSlowLogsResponse.class)
                .withName("ListSlowLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListSlowLogsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNew =
        genForlistSlowLogsNew();

    private static HttpRequestDef<ListSlowLogsNewRequest, ListSlowLogsNewResponse> genForlistSlowLogsNew() {
        // basic
        HttpRequestDef.Builder<ListSlowLogsNewRequest, ListSlowLogsNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSlowLogsNewRequest.class, ListSlowLogsNewResponse.class)
                .withName("ListSlowLogsNew")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/slowlog")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListSlowLogsNewRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogsNewRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> listSlowlogForLts =
        genForlistSlowlogForLts();

    private static HttpRequestDef<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> genForlistSlowlogForLts() {
        // basic
        HttpRequestDef.Builder<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSlowlogForLtsRequest.class, ListSlowlogForLtsResponse.class)
                .withName("ListSlowlogForLts")
                .withUri("/v3/{project_id}/instances/{instance_id}/slow-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogForLtsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListSlowlogForLtsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogForLtsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSlowlogForLtsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SlowlogForLtsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlowlogForLtsRequest.class),
            f -> f.withMarshaller(ListSlowlogForLtsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatistics =
        genForlistSlowlogStatistics();

    private static HttpRequestDef<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> genForlistSlowlogStatistics() {
        // basic
        HttpRequestDef.Builder<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSlowlogStatisticsRequest.class, ListSlowlogStatisticsResponse.class)
            .withName("ListSlowlogStatistics")
            .withUri("/v3/{project_id}/instances/{instance_id}/slowlog/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getCurPage, (req, v) -> {
                req.setCurPage(v);
            }));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getPerPage, (req, v) -> {
                req.setPerPage(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<ListSlowlogStatisticsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSlowlogStatisticsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<ListSlowlogStatisticsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogStatisticsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> listSslCertDownloadLink =
        genForlistSslCertDownloadLink();

    private static HttpRequestDef<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> genForlistSslCertDownloadLink() {
        // basic
        HttpRequestDef.Builder<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSslCertDownloadLinkRequest.class, ListSslCertDownloadLinkResponse.class)
            .withName("ListSslCertDownloadLink")
            .withUri("/v3/{project_id}/instances/{instance_id}/ssl-cert/download-link")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSslCertDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSslCertDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypes =
        genForlistStorageTypes();

    private static HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> genForlistStorageTypes() {
        // basic
        HttpRequestDef.Builder<ListStorageTypesRequest, ListStorageTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStorageTypesRequest.class, ListStorageTypesResponse.class)
                .withName("ListStorageTypes")
                .withUri("/v3/{project_id}/storage-type/{database_name}")
                .withContentType("application/json");

        // requests
        builder.<ListStorageTypesRequest.DatabaseNameEnum>withRequestField("database_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListStorageTypesRequest.DatabaseNameEnum.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getVersionName, (req, v) -> {
                req.setVersionName(v);
            }));
        builder.<ListStorageTypesRequest.HaModeEnum>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStorageTypesRequest.HaModeEnum.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getHaMode, (req, v) -> {
                req.setHaMode(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> listUpgradeHistories =
        genForlistUpgradeHistories();

    private static HttpRequestDef<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> genForlistUpgradeHistories() {
        // basic
        HttpRequestDef.Builder<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListUpgradeHistoriesRequest.class, ListUpgradeHistoriesResponse.class)
            .withName("ListUpgradeHistories")
            .withUri("/v3/{project_id}/instances/{instance_id}/major-version/upgrade-histories")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getSortField, (req, v) -> {
                req.setSortField(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListXellogFilesRequest, ListXellogFilesResponse> listXellogFiles =
        genForlistXellogFiles();

    private static HttpRequestDef<ListXellogFilesRequest, ListXellogFilesResponse> genForlistXellogFiles() {
        // basic
        HttpRequestDef.Builder<ListXellogFilesRequest, ListXellogFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListXellogFilesRequest.class, ListXellogFilesResponse.class)
                .withName("ListXellogFiles")
                .withUri("/v3/{project_id}/instances/{instance_id}/xellog-files")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollower =
        genFormigrateFollower();

    private static HttpRequestDef<MigrateFollowerRequest, MigrateFollowerResponse> genFormigrateFollower() {
        // basic
        HttpRequestDef.Builder<MigrateFollowerRequest, MigrateFollowerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, MigrateFollowerRequest.class, MigrateFollowerResponse.class)
                .withName("MigrateFollower")
                .withUri("/v3/{project_id}/instances/{instance_id}/migrateslave")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(MigrateFollowerRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<MigrateFollowerRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateFollowerRequest.XLanguageEnum.class),
            f -> f.withMarshaller(MigrateFollowerRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<FollowerMigrateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FollowerMigrateRequest.class),
            f -> f.withMarshaller(MigrateFollowerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> modifyPostgresqlHbaConf =
        genFormodifyPostgresqlHbaConf();

    private static HttpRequestDef<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> genFormodifyPostgresqlHbaConf() {
        // basic
        HttpRequestDef.Builder<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ModifyPostgresqlHbaConfRequest.class, ModifyPostgresqlHbaConfResponse.class)
            .withName("ModifyPostgresqlHbaConf")
            .withUri("/v3/{project_id}/instances/{instance_id}/hba-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPostgresqlHbaConfRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<List<PostgresqlHbaConf>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ModifyPostgresqlHbaConfRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(PostgresqlHbaConf.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstance =
        genForrestoreExistInstance();

    private static HttpRequestDef<RestoreExistInstanceRequest, RestoreExistInstanceResponse> genForrestoreExistInstance() {
        // basic
        HttpRequestDef.Builder<RestoreExistInstanceRequest, RestoreExistInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestoreExistInstanceRequest.class, RestoreExistInstanceResponse.class)
            .withName("RestoreExistInstance")
            .withUri("/v3.1/{project_id}/instances/recovery")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreExistInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestoreExistingInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreExistingInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreExistInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreTablesRequest, RestoreTablesResponse> restoreTables =
        genForrestoreTables();

    private static HttpRequestDef<RestoreTablesRequest, RestoreTablesResponse> genForrestoreTables() {
        // basic
        HttpRequestDef.Builder<RestoreTablesRequest, RestoreTablesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreTablesRequest.class, RestoreTablesResponse.class)
                .withName("RestoreTables")
                .withUri("/v3/{project_id}/instances/{instance_id}/restore/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTablesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTablesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestoreTablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreTablesRequestBody.class),
            f -> f.withMarshaller(RestoreTablesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreTablesNewRequest, RestoreTablesNewResponse> restoreTablesNew =
        genForrestoreTablesNew();

    private static HttpRequestDef<RestoreTablesNewRequest, RestoreTablesNewResponse> genForrestoreTablesNew() {
        // basic
        HttpRequestDef.Builder<RestoreTablesNewRequest, RestoreTablesNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RestoreTablesNewRequest.class, RestoreTablesNewResponse.class)
                .withName("RestoreTablesNew")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/restore/tables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTablesNewRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTablesNewRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestoreTablesNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreTablesNewRequestBody.class),
            f -> f.withMarshaller(RestoreTablesNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstance =
        genForrestoreToExistingInstance();

    private static HttpRequestDef<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> genForrestoreToExistingInstance() {
        // basic
        HttpRequestDef.Builder<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RestoreToExistingInstanceRequest.class,
                    RestoreToExistingInstanceResponse.class)
                .withName("RestoreToExistingInstance")
                .withUri("/v3/{project_id}/instances/recovery")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreToExistingInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RestoreToExistingInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreToExistingInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreToExistingInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicy =
        genForsetAuditlogPolicy();

    private static HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> genForsetAuditlogPolicy() {
        // basic
        HttpRequestDef.Builder<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetAuditlogPolicyRequest.class, SetAuditlogPolicyResponse.class)
                .withName("SetAuditlogPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetAuditlogPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetAuditlogPolicyRequestBody.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicy =
        genForsetAutoEnlargePolicy();

    private static HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> genForsetAutoEnlargePolicy() {
        // basic
        HttpRequestDef.Builder<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetAutoEnlargePolicyRequest.class, SetAutoEnlargePolicyResponse.class)
            .withName("SetAutoEnlargePolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/disk-auto-expansion")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CustomerModifyAutoEnlargePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomerModifyAutoEnlargePolicyReq.class),
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetAutoEnlargePolicyResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy =
        genForsetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForsetBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetBackupPolicyRequest, SetBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetBackupPolicyRequest.class, SetBackupPolicyResponse.class)
                .withName("SetBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicy =
        genForsetBinlogClearPolicy();

    private static HttpRequestDef<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> genForsetBinlogClearPolicy() {
        // basic
        HttpRequestDef.Builder<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetBinlogClearPolicyRequest.class, SetBinlogClearPolicyResponse.class)
            .withName("SetBinlogClearPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/binlog/clear-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBinlogClearPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBinlogClearPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<BinlogClearPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BinlogClearPolicyRequestBody.class),
            f -> f.withMarshaller(SetBinlogClearPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicy =
        genForsetOffSiteBackupPolicy();

    private static HttpRequestDef<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> genForsetOffSiteBackupPolicy() {
        // basic
        HttpRequestDef.Builder<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetOffSiteBackupPolicyRequest.class, SetOffSiteBackupPolicyResponse.class)
            .withName("SetOffSiteBackupPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/backups/offsite-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetOffSiteBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetOffSiteBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> setSecondLevelMonitor =
        genForsetSecondLevelMonitor();

    private static HttpRequestDef<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> genForsetSecondLevelMonitor() {
        // basic
        HttpRequestDef.Builder<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, SetSecondLevelMonitorRequest.class, SetSecondLevelMonitorResponse.class)
            .withName("SetSecondLevelMonitor")
            .withUri("/v3/{project_id}/instances/{instance_id}/second-level-monitor")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSecondLevelMonitorRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSecondLevelMonitorRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SecondMonitor>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecondMonitor.class),
            f -> f.withMarshaller(SetSecondLevelMonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetSecondLevelMonitorResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroup =
        genForsetSecurityGroup();

    private static HttpRequestDef<SetSecurityGroupRequest, SetSecurityGroupResponse> genForsetSecurityGroup() {
        // basic
        HttpRequestDef.Builder<SetSecurityGroupRequest, SetSecurityGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetSecurityGroupRequest.class, SetSecurityGroupResponse.class)
                .withName("SetSecurityGroup")
                .withUri("/v3/{project_id}/instances/{instance_id}/security-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSecurityGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SetSecurityGroupRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetSecurityGroupRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetSecurityGroupRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecurityGroupRequest.class),
            f -> f.withMarshaller(SetSecurityGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> setSensitiveSlowLog =
        genForsetSensitiveSlowLog();

    private static HttpRequestDef<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> genForsetSensitiveSlowLog() {
        // basic
        HttpRequestDef.Builder<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetSensitiveSlowLogRequest.class, SetSensitiveSlowLogResponse.class)
                .withName("SetSensitiveSlowLog")
                .withUri("/v3/{project_id}/instances/{instance_id}/slowlog-sensitization/{status}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveSlowLogRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveSlowLogRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveSlowLogRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLink =
        genForshowAuditlogDownloadLink();

    private static HttpRequestDef<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> genForshowAuditlogDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ShowAuditlogDownloadLinkRequest.class, ShowAuditlogDownloadLinkResponse.class)
                .withName("ShowAuditlogDownloadLink")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-links")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<GenerateAuditlogDownloadLinkRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateAuditlogDownloadLinkRequest.class),
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicy =
        genForshowAuditlogPolicy();

    private static HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> genForshowAuditlogPolicy() {
        // basic
        HttpRequestDef.Builder<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuditlogPolicyRequest.class, ShowAuditlogPolicyResponse.class)
                .withName("ShowAuditlogPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/auditlog-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicy =
        genForshowAutoEnlargePolicy();

    private static HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> genForshowAutoEnlargePolicy() {
        // basic
        HttpRequestDef.Builder<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAutoEnlargePolicyRequest.class, ShowAutoEnlargePolicyResponse.class)
            .withName("ShowAutoEnlargePolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/disk-auto-expansion")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoEnlargePolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoEnlargePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableVersionRequest, ShowAvailableVersionResponse> showAvailableVersion =
        genForshowAvailableVersion();

    private static HttpRequestDef<ShowAvailableVersionRequest, ShowAvailableVersionResponse> genForshowAvailableVersion() {
        // basic
        HttpRequestDef.Builder<ShowAvailableVersionRequest, ShowAvailableVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailableVersionRequest.class, ShowAvailableVersionResponse.class)
            .withName("ShowAvailableVersion")
            .withUri("/v3/{project_id}/instances/{instance_id}/major-version/available-version")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLink =
        genForshowBackupDownloadLink();

    private static HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> genForshowBackupDownloadLink() {
        // basic
        HttpRequestDef.Builder<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBackupDownloadLinkRequest.class, ShowBackupDownloadLinkResponse.class)
            .withName("ShowBackupDownloadLink")
            .withUri("/v3/{project_id}/backup-files")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getBackupId, (req, v) -> {
                req.setBackupId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy =
        genForshowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForshowBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBackupPolicyRequest, ShowBackupPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBackupPolicyRequest.class, ShowBackupPolicyResponse.class)
                .withName("ShowBackupPolicy")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicy =
        genForshowBinlogClearPolicy();

    private static HttpRequestDef<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> genForshowBinlogClearPolicy() {
        // basic
        HttpRequestDef.Builder<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBinlogClearPolicyRequest.class, ShowBinlogClearPolicyResponse.class)
            .withName("ShowBinlogClearPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/binlog/clear-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBinlogClearPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBinlogClearPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> showConfiguration =
        genForshowConfiguration();

    private static HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> genForshowConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowConfigurationRequest, ShowConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigurationRequest.class, ShowConfigurationResponse.class)
                .withName("ShowConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDnsNameRequest, ShowDnsNameResponse> showDnsName = genForshowDnsName();

    private static HttpRequestDef<ShowDnsNameRequest, ShowDnsNameResponse> genForshowDnsName() {
        // basic
        HttpRequestDef.Builder<ShowDnsNameRequest, ShowDnsNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDnsNameRequest.class, ShowDnsNameResponse.class)
                .withName("ShowDnsName")
                .withUri("/v3/{project_id}/instances/{instance_id}/dns-ipv6")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDnsNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("dns_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDnsNameRequest::getDnsType, (req, v) -> {
                req.setDnsType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDnsNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainNameRequest, ShowDomainNameResponse> showDomainName =
        genForshowDomainName();

    private static HttpRequestDef<ShowDomainNameRequest, ShowDomainNameResponse> genForshowDomainName() {
        // basic
        HttpRequestDef.Builder<ShowDomainNameRequest, ShowDomainNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainNameRequest.class, ShowDomainNameResponse.class)
                .withName("ShowDomainName")
                .withUri("/v3/{project_id}/instances/{instance_id}/dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("dns_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainNameRequest::getDnsType, (req, v) -> {
                req.setDnsType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatus =
        genForshowDrReplicaStatus();

    private static HttpRequestDef<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> genForshowDrReplicaStatus() {
        // basic
        HttpRequestDef.Builder<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDrReplicaStatusRequest.class, ShowDrReplicaStatusResponse.class)
                .withName("ShowDrReplicaStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/disaster-recovery")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrReplicaStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrReplicaStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForshowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForshowInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceConfigurationRequest.class,
                    ShowInstanceConfigurationResponse.class)
                .withName("ShowInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicy =
        genForshowOffSiteBackupPolicy();

    private static HttpRequestDef<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> genForshowOffSiteBackupPolicy() {
        // basic
        HttpRequestDef.Builder<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowOffSiteBackupPolicyRequest.class, ShowOffSiteBackupPolicyResponse.class)
            .withName("ShowOffSiteBackupPolicy")
            .withUri("/v3/{project_id}/instances/{instance_id}/backups/offsite-policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOffSiteBackupPolicyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOffSiteBackupPolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/v3/{project_id}/quotas")
                .withContentType("application/json");

        // requests
        builder.<ShowQuotasRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowQuotasRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowQuotasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicy =
        genForshowRecyclePolicy();

    private static HttpRequestDef<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> genForshowRecyclePolicy() {
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
            f -> f.withMarshaller(ShowRecyclePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplicationStatusRequest, ShowReplicationStatusResponse> showReplicationStatus =
        genForshowReplicationStatus();

    private static HttpRequestDef<ShowReplicationStatusRequest, ShowReplicationStatusResponse> genForshowReplicationStatus() {
        // basic
        HttpRequestDef.Builder<ShowReplicationStatusRequest, ShowReplicationStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReplicationStatusRequest.class, ShowReplicationStatusResponse.class)
            .withName("ShowReplicationStatus")
            .withUri("/v3/{project_id}/instances/{instance_id}/replication/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> showSecondLevelMonitoring =
        genForshowSecondLevelMonitoring();

    private static HttpRequestDef<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> genForshowSecondLevelMonitoring() {
        // basic
        HttpRequestDef.Builder<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowSecondLevelMonitoringRequest.class,
                    ShowSecondLevelMonitoringResponse.class)
                .withName("ShowSecondLevelMonitoring")
                .withUri("/v3/{project_id}/instances/{instance_id}/second-level-monitor")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecondLevelMonitoringRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecondLevelMonitoringRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTdeStatusRequest, ShowTdeStatusResponse> showTdeStatus =
        genForshowTdeStatus();

    private static HttpRequestDef<ShowTdeStatusRequest, ShowTdeStatusResponse> genForshowTdeStatus() {
        // basic
        HttpRequestDef.Builder<ShowTdeStatusRequest, ShowTdeStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTdeStatusRequest.class, ShowTdeStatusResponse.class)
                .withName("ShowTdeStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/tde-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTdeStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> showUpgradeDbMajorVersionStatus =
        genForshowUpgradeDbMajorVersionStatus();

    private static HttpRequestDef<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> genForshowUpgradeDbMajorVersionStatus() {
        // basic
        HttpRequestDef.Builder<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowUpgradeDbMajorVersionStatusRequest.class,
                    ShowUpgradeDbMajorVersionStatusResponse.class)
                .withName("ShowUpgradeDbMajorVersionStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/major-version/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDbMajorVersionStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDbMajorVersionStatusRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDbMajorVersionStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartFailoverRequest, StartFailoverResponse> startFailover =
        genForstartFailover();

    private static HttpRequestDef<StartFailoverRequest, StartFailoverResponse> genForstartFailover() {
        // basic
        HttpRequestDef.Builder<StartFailoverRequest, StartFailoverResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartFailoverRequest.class, StartFailoverResponse.class)
                .withName("StartFailover")
                .withUri("/v3/{project_id}/instances/{instance_id}/failover")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartFailoverRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartFailoverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartFailoverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartFailoverRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<FailoverRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FailoverRequest.class),
            f -> f.withMarshaller(StartFailoverRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeAction =
        genForstartInstanceEnlargeVolumeAction();

    private static HttpRequestDef<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> genForstartInstanceEnlargeVolumeAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartInstanceEnlargeVolumeActionRequest.class,
                    StartInstanceEnlargeVolumeActionResponse.class)
                .withName("StartInstanceEnlargeVolumeAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartInstanceEnlargeVolumeActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceEnlargeVolumeActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<EnlargeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeVolumeRequestBody.class),
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartAction =
        genForstartInstanceRestartAction();

    private static HttpRequestDef<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> genForstartInstanceRestartAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartInstanceRestartActionRequest.class,
                    StartInstanceRestartActionResponse.class)
                .withName("StartInstanceRestartAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartInstanceRestartActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceRestartActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<InstanceRestartRequsetBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRestartRequsetBody.class),
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaAction =
        genForstartInstanceSingleToHaAction();

    private static HttpRequestDef<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> genForstartInstanceSingleToHaAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartInstanceSingleToHaActionRequest.class,
                    StartInstanceSingleToHaActionResponse.class)
                .withName("StartInstanceSingleToHaAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartInstanceSingleToHaActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceSingleToHaActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<Single2Ha>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Single2Ha.class),
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicy =
        genForstartRecyclePolicy();

    private static HttpRequestDef<StartRecyclePolicyRequest, StartRecyclePolicyResponse> genForstartRecyclePolicy() {
        // basic
        HttpRequestDef.Builder<StartRecyclePolicyRequest, StartRecyclePolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartRecyclePolicyRequest.class, StartRecyclePolicyResponse.class)
                .withName("StartRecyclePolicy")
                .withUri("/v3/{project_id}/instances/recycle-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartRecyclePolicyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RecyclePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecyclePolicyRequestBody.class),
            f -> f.withMarshaller(StartRecyclePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorAction =
        genForstartResizeFlavorAction();

    private static HttpRequestDef<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> genForstartResizeFlavorAction() {
        // basic
        HttpRequestDef.Builder<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartResizeFlavorActionRequest.class, StartResizeFlavorActionResponse.class)
            .withName("StartResizeFlavorAction")
            .withUri("/v3/{project_id}/instances/{instance_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartResizeFlavorActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartResizeFlavorActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ResizeFlavorRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeFlavorRequest.class),
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartupInstanceRequest, StartupInstanceResponse> startupInstance =
        genForstartupInstance();

    private static HttpRequestDef<StartupInstanceRequest, StartupInstanceResponse> genForstartupInstance() {
        // basic
        HttpRequestDef.Builder<StartupInstanceRequest, StartupInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartupInstanceRequest.class, StartupInstanceResponse.class)
                .withName("StartupInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/action/startup")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartupInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartupInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartupInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartupInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForstopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForstopInstance() {
        // basic
        HttpRequestDef.Builder<StopInstanceRequest, StopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopInstanceRequest.class, StopInstanceResponse.class)
                .withName("StopInstance")
                .withUri("/v3/{project_id}/instances/{instance_id}/action/shutdown")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StopInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopInstanceRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForswitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForswitchSsl() {
        // basic
        HttpRequestDef.Builder<SwitchSslRequest, SwitchSslResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchSslRequest.class, SwitchSslResponse.class)
                .withName("SwitchSsl")
                .withUri("/v3/{project_id}/instances/{instance_id}/ssl")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSslRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SwitchSslRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchSslRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SwitchSslRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SslOptionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SslOptionRequest.class),
            f -> f.withMarshaller(SwitchSslRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForupdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForupdateConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateConfigurationRequest, UpdateConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigurationRequest.class, UpdateConfigurationResponse.class)
                .withName("UpdateConfiguration")
                .withUri("/v3/{project_id}/configurations/{config_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("config_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, (req, v) -> {
                req.setConfigId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ConfigurationForUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationForUpdate.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIp = genForupdateDataIp();

    private static HttpRequestDef<UpdateDataIpRequest, UpdateDataIpResponse> genForupdateDataIp() {
        // basic
        HttpRequestDef.Builder<UpdateDataIpRequest, UpdateDataIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDataIpRequest.class, UpdateDataIpResponse.class)
                .withName("UpdateDataIp")
                .withUri("/v3/{project_id}/instances/{instance_id}/ip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDataIpRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateDataIpRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDataIpRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDataIpRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DataIpRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataIpRequest.class),
            f -> f.withMarshaller(UpdateDataIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsName =
        genForupdateDnsName();

    private static HttpRequestDef<UpdateDnsNameRequest, UpdateDnsNameResponse> genForupdateDnsName() {
        // basic
        HttpRequestDef.Builder<UpdateDnsNameRequest, UpdateDnsNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDnsNameRequest.class, UpdateDnsNameResponse.class)
                .withName("UpdateDnsName")
                .withUri("/v3/{project_id}/instances/{instance_id}/modify-dns")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDnsNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateDnsNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDnsNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDnsNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyDnsNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDnsNameRequestBody.class),
            f -> f.withMarshaller(UpdateDnsNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForupdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForupdateInstanceConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationRequest.class,
                    UpdateInstanceConfigurationResponse.class)
                .withName("UpdateInstanceConfiguration")
                .withUri("/v3/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsync =
        genForupdateInstanceConfigurationAsync();

    private static HttpRequestDef<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> genForupdateInstanceConfigurationAsync() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceConfigurationAsyncRequest.class,
                    UpdateInstanceConfigurationAsyncResponse.class)
                .withName("UpdateInstanceConfigurationAsync")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationAsyncRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationAsyncRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationAsyncRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName =
        genForupdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForupdateInstanceName() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceNameRequest, UpdateInstanceNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceNameRequest.class, UpdateInstanceNameResponse.class)
                .withName("UpdateInstanceName")
                .withUri("/v3/{project_id}/instances/{instance_id}/name")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateInstanceNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateInstanceNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifiyInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifiyInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForupdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForupdatePort() {
        // basic
        HttpRequestDef.Builder<UpdatePortRequest, UpdatePortResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePortRequest.class, UpdatePortResponse.class)
                .withName("UpdatePort")
                .withUri("/v3/{project_id}/instances/{instance_id}/port")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePortRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdatePortRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePortRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdatePortRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDbPortRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbPortRequest.class),
            f -> f.withMarshaller(UpdatePortRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAlias =
        genForupdatePostgresqlInstanceAlias();

    private static HttpRequestDef<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> genForupdatePostgresqlInstanceAlias() {
        // basic
        HttpRequestDef.Builder<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePostgresqlInstanceAliasRequest.class,
                    UpdatePostgresqlInstanceAliasResponse.class)
                .withName("UpdatePostgresqlInstanceAlias")
                .withUri("/v3/{project_id}/instances/{instance_id}/alias")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateRdsInstanceAliasRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRdsInstanceAliasRequest.class),
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTdeStatusRequest, UpdateTdeStatusResponse> updateTdeStatus =
        genForupdateTdeStatus();

    private static HttpRequestDef<UpdateTdeStatusRequest, UpdateTdeStatusResponse> genForupdateTdeStatus() {
        // basic
        HttpRequestDef.Builder<UpdateTdeStatusRequest, UpdateTdeStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTdeStatusRequest.class, UpdateTdeStatusResponse.class)
                .withName("UpdateTdeStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/tde")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTdeStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateTdeStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTdeStatusRequestBody.class),
            f -> f.withMarshaller(UpdateTdeStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> upgradeDbMajorVersion =
        genForupgradeDbMajorVersion();

    private static HttpRequestDef<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> genForupgradeDbMajorVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpgradeDbMajorVersionRequest.class, UpgradeDbMajorVersionResponse.class)
            .withName("UpgradeDbMajorVersion")
            .withUri("/v3/{project_id}/instances/{instance_id}/major-version/upgrade")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpgradePgMajorVersion>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradePgMajorVersion.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpgradeDbMajorVersionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> upgradeDbMajorVersionPreCheck =
        genForupgradeDbMajorVersionPreCheck();

    private static HttpRequestDef<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> genForupgradeDbMajorVersionPreCheck() {
        // basic
        HttpRequestDef.Builder<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpgradeDbMajorVersionPreCheckRequest.class,
                    UpgradeDbMajorVersionPreCheckResponse.class)
                .withName("UpgradeDbMajorVersionPreCheck")
                .withUri("/v3/{project_id}/instances/{instance_id}/major-version/inspection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionPreCheckRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionPreCheckRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgresqlPreCheckUpgradeMajorVersionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlPreCheckUpgradeMajorVersionReq.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionPreCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersion =
        genForupgradeDbVersion();

    private static HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> genForupgradeDbVersion() {
        // basic
        HttpRequestDef.Builder<UpgradeDbVersionRequest, UpgradeDbVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeDbVersionRequest.class, UpgradeDbVersionResponse.class)
                .withName("UpgradeDbVersion")
                .withUri("/v3/{project_id}/instances/{instance_id}/action/db-upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpgradeDbVersionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpgradeDbVersionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CustomerUpgradeDatabaseVersionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CustomerUpgradeDatabaseVersionReq.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> upgradeDbVersionNew =
        genForupgradeDbVersionNew();

    private static HttpRequestDef<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> genForupgradeDbVersionNew() {
        // basic
        HttpRequestDef.Builder<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeDbVersionNewRequest.class, UpgradeDbVersionNewResponse.class)
                .withName("UpgradeDbVersionNew")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbVersionNewRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpgradeDbVersionNewRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpgradeDbVersionNewRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpgradeDbVersionNewRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CustomerUpgradeDatabaseVersionReqNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CustomerUpgradeDatabaseVersionReqNew.class),
            f -> f.withMarshaller(UpgradeDbVersionNewRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForlistApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForlistApiVersion() {
        // basic
        HttpRequestDef.Builder<ListApiVersionRequest, ListApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionRequest.class, ListApiVersionResponse.class)
                .withName("ListApiVersion")
                .withUri("/rds")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNew =
        genForlistApiVersionNew();

    private static HttpRequestDef<ListApiVersionNewRequest, ListApiVersionNewResponse> genForlistApiVersionNew() {
        // basic
        HttpRequestDef.Builder<ListApiVersionNewRequest, ListApiVersionNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionNewRequest.class, ListApiVersionNewResponse.class)
                .withName("ListApiVersionNew")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersion =
        genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
        // basic
        HttpRequestDef.Builder<ShowApiVersionRequest, ShowApiVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiVersionRequest.class, ShowApiVersionResponse.class)
                .withName("ShowApiVersion")
                .withUri("/rds/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilege =
        genForallowDbUserPrivilege();

    private static HttpRequestDef<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> genForallowDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AllowDbUserPrivilegeRequest.class, AllowDbUserPrivilegeResponse.class)
            .withName("AllowDbUserPrivilege")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<GrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantRequest.class),
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForcreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForcreateDatabase() {
        // basic
        HttpRequestDef.Builder<CreateDatabaseRequest, CreateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDatabaseRequest.class, CreateDatabaseResponse.class)
                .withName("CreateDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseForCreation.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> createDbUser = genForcreateDbUser();

    private static HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> genForcreateDbUser() {
        // basic
        HttpRequestDef.Builder<CreateDbUserRequest, CreateDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbUserRequest.class, CreateDbUserResponse.class)
                .withName("CreateDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UserForCreation.class),
            f -> f.withMarshaller(CreateDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genFordeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genFordeleteDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteDatabaseRequest, DeleteDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDatabaseRequest.class, DeleteDatabaseResponse.class)
                .withName("DeleteDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/{db_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genFordeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genFordeleteDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteDbUserRequest, DeleteDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbUserRequest.class, DeleteDbUserResponse.class)
                .withName("DeleteDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/{user_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabases =
        genForlistAuthorizedDatabases();

    private static HttpRequestDef<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> genForlistAuthorizedDatabases() {
        // basic
        HttpRequestDef.Builder<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuthorizedDatabasesRequest.class, ListAuthorizedDatabasesResponse.class)
            .withName("ListAuthorizedDatabases")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user/database")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsers =
        genForlistAuthorizedDbUsers();

    private static HttpRequestDef<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> genForlistAuthorizedDbUsers() {
        // basic
        HttpRequestDef.Builder<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuthorizedDbUsersRequest.class, ListAuthorizedDbUsersResponse.class)
            .withName("ListAuthorizedDbUsers")
            .withUri("/v3/{project_id}/instances/{instance_id}/database/db_user")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForlistDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForlistDatabases() {
        // basic
        HttpRequestDef.Builder<ListDatabasesRequest, ListDatabasesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabasesRequest.class, ListDatabasesResponse.class)
                .withName("ListDatabases")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForlistDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForlistDbUsers() {
        // basic
        HttpRequestDef.Builder<ListDbUsersRequest, ListDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbUsersRequest.class, ListDbUsersResponse.class)
                .withName("ListDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForresetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForresetPwd() {
        // basic
        HttpRequestDef.Builder<ResetPwdRequest, ResetPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ResetPwdRequest.class, ResetPwdResponse.class)
                .withName("ResetPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/password")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResetPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ResetPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ResetPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PwdResetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PwdResetRequest.class),
            f -> f.withMarshaller(ResetPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRequest, RevokeResponse> revoke = genForrevoke();

    private static HttpRequestDef<RevokeRequest, RevokeResponse> genForrevoke() {
        // basic
        HttpRequestDef.Builder<RevokeRequest, RevokeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RevokeRequest.class, RevokeResponse.class)
                .withName("Revoke")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RevokeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeRequestBody.class),
            f -> f.withMarshaller(RevokeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwd = genForsetDbUserPwd();

    private static HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> genForsetDbUserPwd() {
        // basic
        HttpRequestDef.Builder<SetDbUserPwdRequest, SetDbUserPwdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetDbUserPwdRequest.class, SetDbUserPwdResponse.class)
                .withName("SetDbUserPwd")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/resetpwd")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SetDbUserPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetDbUserPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DbUserPwdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPwdRequest.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> setReadOnlySwitch =
        genForsetReadOnlySwitch();

    private static HttpRequestDef<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> genForsetReadOnlySwitch() {
        // basic
        HttpRequestDef.Builder<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetReadOnlySwitchRequest.class, SetReadOnlySwitchResponse.class)
                .withName("SetReadOnlySwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/readonly-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetReadOnlySwitchRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetReadOnlySwitchRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<MysqlReadOnlySwitch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlReadOnlySwitch.class),
            f -> f.withMarshaller(SetReadOnlySwitchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabase =
        genForupdateDatabase();

    private static HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> genForupdateDatabase() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseRequest, UpdateDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateDatabaseRequest.class, UpdateDatabaseResponse.class)
                .withName("UpdateDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateDatabaseRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDatabaseRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseReq.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> updateDbUserComment =
        genForupdateDbUserComment();

    private static HttpRequestDef<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> genForupdateDbUserComment() {
        // basic
        HttpRequestDef.Builder<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDbUserCommentRequest.class, UpdateDbUserCommentResponse.class)
                .withName("UpdateDbUserComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{user_name}/comment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserCommentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserCommentRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<UpdateDbUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbUserReq.class),
            f -> f.withMarshaller(UpdateDbUserCommentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilege =
        genForallowDbPrivilege();

    private static HttpRequestDef<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> genForallowDbPrivilege() {
        // basic
        HttpRequestDef.Builder<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AllowDbPrivilegeRequest.class, AllowDbPrivilegeResponse.class)
                .withName("AllowDbPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgresqlGrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlGrantRequest.class),
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScale =
        genForchangeProxyScale();

    private static HttpRequestDef<ChangeProxyScaleRequest, ChangeProxyScaleResponse> genForchangeProxyScale() {
        // basic
        HttpRequestDef.Builder<ChangeProxyScaleRequest, ChangeProxyScaleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeProxyScaleRequest.class, ChangeProxyScaleResponse.class)
                .withName("ChangeProxyScale")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/scale")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeProxyScaleRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeProxyScaleRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeProxyScaleRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeProxyScaleRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ScaleProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScaleProxyRequestBody.class),
            f -> f.withMarshaller(ChangeProxyScaleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThreshold =
        genForchangeTheDelayThreshold();

    private static HttpRequestDef<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> genForchangeTheDelayThreshold() {
        // basic
        HttpRequestDef.Builder<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeTheDelayThresholdRequest.class, ChangeTheDelayThresholdResponse.class)
            .withName("ChangeTheDelayThreshold")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/delay-threshold")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeTheDelayThresholdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeTheDelayThresholdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeTheDelayThresholdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeTheDelayThresholdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ChangingTheDelayThresholdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangingTheDelayThresholdRequestBody.class),
            f -> f.withMarshaller(ChangeTheDelayThresholdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabase =
        genForcreatePostgresqlDatabase();

    private static HttpRequestDef<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> genForcreatePostgresqlDatabase() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreatePostgresqlDatabaseRequest.class, CreatePostgresqlDatabaseResponse.class)
                .withName("CreatePostgresqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgresqlDatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlDatabaseForCreation.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchema =
        genForcreatePostgresqlDatabaseSchema();

    private static HttpRequestDef<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> genForcreatePostgresqlDatabaseSchema() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePostgresqlDatabaseSchemaRequest.class,
                    CreatePostgresqlDatabaseSchemaResponse.class)
                .withName("CreatePostgresqlDatabaseSchema")
                .withUri("/v3/{project_id}/instances/{instance_id}/schema")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgresqlDatabaseSchemaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlDatabaseSchemaReq.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUser =
        genForcreatePostgresqlDbUser();

    private static HttpRequestDef<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> genForcreatePostgresqlDbUser() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePostgresqlDbUserRequest.class, CreatePostgresqlDbUserResponse.class)
            .withName("CreatePostgresqlDbUser")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<PostgresqlUserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlUserForCreation.class),
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> createPostgresqlExtension =
        genForcreatePostgresqlExtension();

    private static HttpRequestDef<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> genForcreatePostgresqlExtension() {
        // basic
        HttpRequestDef.Builder<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreatePostgresqlExtensionRequest.class,
                    CreatePostgresqlExtensionResponse.class)
                .withName("CreatePostgresqlExtension")
                .withUri("/v3/{project_id}/instances/{instance_id}/extensions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlExtensionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlExtensionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ExtensionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionRequest.class),
            f -> f.withMarshaller(CreatePostgresqlExtensionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlExtensionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> deletePostgresqlDatabase =
        genFordeletePostgresqlDatabase();

    private static HttpRequestDef<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> genFordeletePostgresqlDatabase() {
        // basic
        HttpRequestDef.Builder<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePostgresqlDatabaseRequest.class,
                    DeletePostgresqlDatabaseResponse.class)
                .withName("DeletePostgresqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/{db_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDatabaseRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> deletePostgresqlDbUser =
        genFordeletePostgresqlDbUser();

    private static HttpRequestDef<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> genFordeletePostgresqlDbUser() {
        // basic
        HttpRequestDef.Builder<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePostgresqlDbUserRequest.class, DeletePostgresqlDbUserResponse.class)
            .withName("DeletePostgresqlDbUser")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user/{user_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDbUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> deletePostgresqlExtension =
        genFordeletePostgresqlExtension();

    private static HttpRequestDef<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> genFordeletePostgresqlExtension() {
        // basic
        HttpRequestDef.Builder<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeletePostgresqlExtensionRequest.class,
                    DeletePostgresqlExtensionResponse.class)
                .withName("DeletePostgresqlExtension")
                .withUri("/v3/{project_id}/instances/{instance_id}/extensions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlExtensionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlExtensionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ExtensionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionRequest.class),
            f -> f.withMarshaller(DeletePostgresqlExtensionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePostgresqlExtensionResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemas =
        genForlistPostgresqlDatabaseSchemas();

    private static HttpRequestDef<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> genForlistPostgresqlDatabaseSchemas() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPostgresqlDatabaseSchemasRequest.class,
                    ListPostgresqlDatabaseSchemasResponse.class)
                .withName("ListPostgresqlDatabaseSchemas")
                .withUri("/v3/{project_id}/instances/{instance_id}/schema/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabases =
        genForlistPostgresqlDatabases();

    private static HttpRequestDef<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> genForlistPostgresqlDatabases() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPostgresqlDatabasesRequest.class, ListPostgresqlDatabasesResponse.class)
            .withName("ListPostgresqlDatabases")
            .withUri("/v3/{project_id}/instances/{instance_id}/database/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginated =
        genForlistPostgresqlDbUserPaginated();

    private static HttpRequestDef<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> genForlistPostgresqlDbUserPaginated() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPostgresqlDbUserPaginatedRequest.class,
                    ListPostgresqlDbUserPaginatedResponse.class)
                .withName("ListPostgresqlDbUserPaginated")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_user/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> listPostgresqlExtension =
        genForlistPostgresqlExtension();

    private static HttpRequestDef<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> genForlistPostgresqlExtension() {
        // basic
        HttpRequestDef.Builder<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPostgresqlExtensionRequest.class, ListPostgresqlExtensionResponse.class)
            .withName("ListPostgresqlExtension")
            .withUri("/v3/{project_id}/instances/{instance_id}/extensions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getDatabaseName, (req, v) -> {
                req.setDatabaseName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> revokePostgresqlDbPrivilege =
        genForrevokePostgresqlDbPrivilege();

    private static HttpRequestDef<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> genForrevokePostgresqlDbPrivilege() {
        // basic
        HttpRequestDef.Builder<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RevokePostgresqlDbPrivilegeRequest.class,
                    RevokePostgresqlDbPrivilegeResponse.class)
                .withName("RevokePostgresqlDbPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokePostgresqlDbPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RevokePostgresqlDbPrivilegeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokePostgresqlDbPrivilegeRequestBody.class),
            f -> f.withMarshaller(RevokePostgresqlDbPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavors =
        genForsearchQueryScaleComputeFlavors();

    private static HttpRequestDef<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> genForsearchQueryScaleComputeFlavors() {
        // basic
        HttpRequestDef.Builder<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchQueryScaleComputeFlavorsRequest.class,
                    SearchQueryScaleComputeFlavorsResponse.class)
                .withName("SearchQueryScaleComputeFlavors")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/proxy/scale/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavors =
        genForsearchQueryScaleFlavors();

    private static HttpRequestDef<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> genForsearchQueryScaleFlavors() {
        // basic
        HttpRequestDef.Builder<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, SearchQueryScaleFlavorsRequest.class, SearchQueryScaleFlavorsResponse.class)
            .withName("SearchQueryScaleFlavors")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/scale/flavors")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQueryScaleFlavorsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQueryScaleFlavorsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> setDatabaseUserPrivilege =
        genForsetDatabaseUserPrivilege();

    private static HttpRequestDef<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> genForsetDatabaseUserPrivilege() {
        // basic
        HttpRequestDef.Builder<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetDatabaseUserPrivilegeRequest.class, SetDatabaseUserPrivilegeResponse.class)
                .withName("SetDatabaseUserPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/user-privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDatabaseUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDatabaseUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SetDatabaseUserPrivilegeReqV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetDatabaseUserPrivilegeReqV3.class),
            f -> f.withMarshaller(SetDatabaseUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwd =
        genForsetPostgresqlDbUserPwd();

    private static HttpRequestDef<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> genForsetPostgresqlDbUserPwd() {
        // basic
        HttpRequestDef.Builder<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetPostgresqlDbUserPwdRequest.class, SetPostgresqlDbUserPwdResponse.class)
            .withName("SetPostgresqlDbUserPwd")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user/resetpwd")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SetPostgresqlDbUserPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetPostgresqlDbUserPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DbUserPwdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPwdRequest.class),
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxy =
        genForshowInformationAboutDatabaseProxy();

    private static HttpRequestDef<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> genForshowInformationAboutDatabaseProxy() {
        // basic
        HttpRequestDef.Builder<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInformationAboutDatabaseProxyRequest.class,
                    ShowInformationAboutDatabaseProxyResponse.class)
                .withName("ShowInformationAboutDatabaseProxy")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInformationAboutDatabaseProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShowInformationAboutDatabaseProxyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInformationAboutDatabaseProxyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInformationAboutDatabaseProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> showPostgresqlParamValue =
        genForshowPostgresqlParamValue();

    private static HttpRequestDef<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> genForshowPostgresqlParamValue() {
        // basic
        HttpRequestDef.Builder<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowPostgresqlParamValueRequest.class, ShowPostgresqlParamValueResponse.class)
                .withName("ShowPostgresqlParamValue")
                .withUri("/v3/{project_id}/instances/{instance_id}/parameter/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPostgresqlParamValueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPostgresqlParamValueRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPostgresqlParamValueRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxy =
        genForstartDatabaseProxy();

    private static HttpRequestDef<StartDatabaseProxyRequest, StartDatabaseProxyResponse> genForstartDatabaseProxy() {
        // basic
        HttpRequestDef.Builder<StartDatabaseProxyRequest, StartDatabaseProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartDatabaseProxyRequest.class, StartDatabaseProxyResponse.class)
                .withName("StartDatabaseProxy")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartDatabaseProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartDatabaseProxyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartDatabaseProxyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartDatabaseProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<OpenProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenProxyRequest.class),
            f -> f.withMarshaller(StartDatabaseProxyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxy =
        genForstopDatabaseProxy();

    private static HttpRequestDef<StopDatabaseProxyRequest, StopDatabaseProxyResponse> genForstopDatabaseProxy() {
        // basic
        HttpRequestDef.Builder<StopDatabaseProxyRequest, StopDatabaseProxyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopDatabaseProxyRequest.class, StopDatabaseProxyResponse.class)
                .withName("StopDatabaseProxy")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopDatabaseProxyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StopDatabaseProxyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopDatabaseProxyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopDatabaseProxyRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> updateDbUserPrivilege =
        genForupdateDbUserPrivilege();

    private static HttpRequestDef<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> genForupdateDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateDbUserPrivilegeRequest.class, UpdateDbUserPrivilegeResponse.class)
            .withName("UpdateDbUserPrivilege")
            .withUri("/v3/{project_id}/instances/{instance_id}/db-user-privilege")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DbUserPrivilegeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPrivilegeRequest.class),
            f -> f.withMarshaller(UpdateDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> updatePostgresqlDatabase =
        genForupdatePostgresqlDatabase();

    private static HttpRequestDef<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> genForupdatePostgresqlDatabase() {
        // basic
        HttpRequestDef.Builder<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, UpdatePostgresqlDatabaseRequest.class, UpdatePostgresqlDatabaseResponse.class)
                .withName("UpdatePostgresqlDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdatePostgresqlDatabaseRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePostgresqlDatabaseRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdatePostgresqlDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseReq.class),
            f -> f.withMarshaller(UpdatePostgresqlDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> updatePostgresqlDbUserComment =
        genForupdatePostgresqlDbUserComment();

    private static HttpRequestDef<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> genForupdatePostgresqlDbUserComment() {
        // basic
        HttpRequestDef.Builder<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePostgresqlDbUserCommentRequest.class,
                    UpdatePostgresqlDbUserCommentResponse.class)
                .withName("UpdatePostgresqlDbUserComment")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{user_name}/comment")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlDbUserCommentRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlDbUserCommentRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<UpdateDbUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbUserReq.class),
            f -> f.withMarshaller(UpdatePostgresqlDbUserCommentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> updatePostgresqlParameterValue =
        genForupdatePostgresqlParameterValue();

    private static HttpRequestDef<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> genForupdatePostgresqlParameterValue() {
        // basic
        HttpRequestDef.Builder<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePostgresqlParameterValueRequest.class,
                    UpdatePostgresqlParameterValueResponse.class)
                .withName("UpdatePostgresqlParameterValue")
                .withUri("/v3/{project_id}/instances/{instance_id}/parameter/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyParamRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyParamRequest.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeight =
        genForupdateReadWeight();

    private static HttpRequestDef<UpdateReadWeightRequest, UpdateReadWeightResponse> genForupdateReadWeight() {
        // basic
        HttpRequestDef.Builder<UpdateReadWeightRequest, UpdateReadWeightResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReadWeightRequest.class, UpdateReadWeightResponse.class)
                .withName("UpdateReadWeight")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/weight")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReadWeightRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<UpdateReadWeightRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateReadWeightRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateReadWeightRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyProxyWeightRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyProxyWeightRequest.class),
            f -> f.withMarshaller(UpdateReadWeightRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilege =
        genForallowSqlserverDbUserPrivilege();

    private static HttpRequestDef<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> genForallowSqlserverDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AllowSqlserverDbUserPrivilegeRequest.class,
                    AllowSqlserverDbUserPrivilegeResponse.class)
                .withName("AllowSqlserverDbUserPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SqlserverGrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverGrantRequest.class),
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> batchAddMsdtcs =
        genForbatchAddMsdtcs();

    private static HttpRequestDef<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> genForbatchAddMsdtcs() {
        // basic
        HttpRequestDef.Builder<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchAddMsdtcsRequest.class, BatchAddMsdtcsResponse.class)
                .withName("BatchAddMsdtcs")
                .withUri("/v3/{project_id}/instances/{instance_id}/msdtc/host")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAddMsdtcsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AddMsdtcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMsdtcRequestBody.class),
            f -> f.withMarshaller(BatchAddMsdtcsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabase =
        genForcreateSqlserverDatabase();

    private static HttpRequestDef<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> genForcreateSqlserverDatabase() {
        // basic
        HttpRequestDef.Builder<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSqlserverDatabaseRequest.class, CreateSqlserverDatabaseResponse.class)
            .withName("CreateSqlserverDatabase")
            .withUri("/v3/{project_id}/instances/{instance_id}/database")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SqlserverDatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverDatabaseForCreation.class),
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUser =
        genForcreateSqlserverDbUser();

    private static HttpRequestDef<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> genForcreateSqlserverDbUser() {
        // basic
        HttpRequestDef.Builder<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSqlserverDbUserRequest.class, CreateSqlserverDbUserResponse.class)
            .withName("CreateSqlserverDbUser")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SqlserverUserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverUserForCreation.class),
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabase =
        genFordeleteSqlserverDatabase();

    private static HttpRequestDef<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> genFordeleteSqlserverDatabase() {
        // basic
        HttpRequestDef.Builder<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSqlserverDatabaseRequest.class, DeleteSqlserverDatabaseResponse.class)
            .withName("DeleteSqlserverDatabase")
            .withUri("/v3/{project_id}/instances/{instance_id}/database/{db_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DropDatabaseV3Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DropDatabaseV3Req.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseEx =
        genFordeleteSqlserverDatabaseEx();

    private static HttpRequestDef<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> genFordeleteSqlserverDatabaseEx() {
        // basic
        HttpRequestDef.Builder<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSqlserverDatabaseExRequest.class,
                    DeleteSqlserverDatabaseExResponse.class)
                .withName("DeleteSqlserverDatabaseEx")
                .withUri("/v3.1/{project_id}/instances/{instance_id}/database/{db_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DropDatabaseV3Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DropDatabaseV3Req.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUser =
        genFordeleteSqlserverDbUser();

    private static HttpRequestDef<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> genFordeleteSqlserverDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSqlserverDbUserRequest.class, DeleteSqlserverDbUserResponse.class)
            .withName("DeleteSqlserverDbUser")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user/{user_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getUserName, (req, v) -> {
                req.setUserName(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsers =
        genForlistAuthorizedSqlserverDbUsers();

    private static HttpRequestDef<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> genForlistAuthorizedSqlserverDbUsers() {
        // basic
        HttpRequestDef.Builder<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuthorizedSqlserverDbUsersRequest.class,
                    ListAuthorizedSqlserverDbUsersResponse.class)
                .withName("ListAuthorizedSqlserverDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/db_user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMsdtcHostsRequest, ListMsdtcHostsResponse> listMsdtcHosts =
        genForlistMsdtcHosts();

    private static HttpRequestDef<ListMsdtcHostsRequest, ListMsdtcHostsResponse> genForlistMsdtcHosts() {
        // basic
        HttpRequestDef.Builder<ListMsdtcHostsRequest, ListMsdtcHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMsdtcHostsRequest.class, ListMsdtcHostsResponse.class)
                .withName("ListMsdtcHosts")
                .withUri("/v3/{project_id}/instances/{instance_id}/msdtc/hosts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMsdtcHostsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMsdtcHostsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMsdtcHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabases =
        genForlistSqlserverDatabases();

    private static HttpRequestDef<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> genForlistSqlserverDatabases() {
        // basic
        HttpRequestDef.Builder<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSqlserverDatabasesRequest.class, ListSqlserverDatabasesResponse.class)
            .withName("ListSqlserverDatabases")
            .withUri("/v3/{project_id}/instances/{instance_id}/database/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<String>withRequestField("recover_model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getRecoverModel, (req, v) -> {
                req.setRecoverModel(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsers =
        genForlistSqlserverDbUsers();

    private static HttpRequestDef<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> genForlistSqlserverDbUsers() {
        // basic
        HttpRequestDef.Builder<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSqlserverDbUsersRequest.class, ListSqlserverDbUsersResponse.class)
            .withName("ListSqlserverDbUsers")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_user/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getPage, (req, v) -> {
                req.setPage(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyCollationRequest, ModifyCollationResponse> modifyCollation =
        genFormodifyCollation();

    private static HttpRequestDef<ModifyCollationRequest, ModifyCollationResponse> genFormodifyCollation() {
        // basic
        HttpRequestDef.Builder<ModifyCollationRequest, ModifyCollationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyCollationRequest.class, ModifyCollationResponse.class)
                .withName("ModifyCollation")
                .withUri("/v3/{project_id}/instances/{instance_id}/collations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyCollationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyCollationRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ModifyCollationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyCollationRequestBody.class),
            f -> f.withMarshaller(ModifyCollationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilege =
        genForrevokeSqlserverDbUserPrivilege();

    private static HttpRequestDef<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> genForrevokeSqlserverDbUserPrivilege() {
        // basic
        HttpRequestDef.Builder<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    RevokeSqlserverDbUserPrivilegeRequest.class,
                    RevokeSqlserverDbUserPrivilegeResponse.class)
                .withName("RevokeSqlserverDbUserPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/db_privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<SqlserverRevokeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverRevokeRequest.class),
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

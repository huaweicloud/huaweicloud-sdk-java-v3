package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rds.v3.model.AddCopyDatabaseRequestBody;
import com.huaweicloud.sdk.rds.v3.model.AddLogConfigResponseBody;
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
import com.huaweicloud.sdk.rds.v3.model.BatchShutdownInsReq;
import com.huaweicloud.sdk.rds.v3.model.BatchStopInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.BatchStopInstanceResponse;
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
import com.huaweicloud.sdk.rds.v3.model.CopyDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CopyDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateDnsNameResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceIam5Request;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceIam5Response;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateMysqlMultiProxyRequest;
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
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlLimitRuleReqV3;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadRequest;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadRequestBody;
import com.huaweicloud.sdk.rds.v3.model.CreateXelLogDownloadResponse;
import com.huaweicloud.sdk.rds.v3.model.CustomerCreateInstanceReq;
import com.huaweicloud.sdk.rds.v3.model.CustomerModifyAutoEnlargePolicyReq;
import com.huaweicloud.sdk.rds.v3.model.CustomerUpgradeDatabaseVersionReq;
import com.huaweicloud.sdk.rds.v3.model.CustomerUpgradeDatabaseVersionReqNew;
import com.huaweicloud.sdk.rds.v3.model.DataIpRequest;
import com.huaweicloud.sdk.rds.v3.model.DatabaseForCreation;
import com.huaweicloud.sdk.rds.v3.model.DatabaseUserRoleRequest;
import com.huaweicloud.sdk.rds.v3.model.DbUserPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.DbUserPwdRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteDisasterRecoveryRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteDisasterRecoveryRequestBody;
import com.huaweicloud.sdk.rds.v3.model.DeleteDisasterRecoveryResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteJobRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteJobResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteLogConfigResponseBody;
import com.huaweicloud.sdk.rds.v3.model.DeleteLogLtsConfigsRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteLogLtsConfigsResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteManualBackupRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteManualBackupResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteMsdtcLocalHostRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteMsdtcLocalHostRequestBody;
import com.huaweicloud.sdk.rds.v3.model.DeleteMsdtcLocalHostResponse;
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
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlLimitRuleReqV3;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseExResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDatabaseResponse;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserRequest;
import com.huaweicloud.sdk.rds.v3.model.DeleteSqlserverDbUserResponse;
import com.huaweicloud.sdk.rds.v3.model.DownloadErrorlogRequest;
import com.huaweicloud.sdk.rds.v3.model.DownloadErrorlogResponse;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogRequest;
import com.huaweicloud.sdk.rds.v3.model.DownloadSlowlogResponse;
import com.huaweicloud.sdk.rds.v3.model.DropDatabaseV3Req;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.EnableConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.EnlargeVolumeRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ErrorlogForLtsRequest;
import com.huaweicloud.sdk.rds.v3.model.ExecutePrivilegeDatabaseUserRoleRequest;
import com.huaweicloud.sdk.rds.v3.model.ExecutePrivilegeDatabaseUserRoleResponse;
import com.huaweicloud.sdk.rds.v3.model.ExecuteRevokeDatabaseUserRoleRequest;
import com.huaweicloud.sdk.rds.v3.model.ExecuteRevokeDatabaseUserRoleResponse;
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
import com.huaweicloud.sdk.rds.v3.model.ListFlavorsResizeRequest;
import com.huaweicloud.sdk.rds.v3.model.ListFlavorsResizeResponse;
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
import com.huaweicloud.sdk.rds.v3.model.ListShareBackupsRequest;
import com.huaweicloud.sdk.rds.v3.model.ListShareBackupsResponse;
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
import com.huaweicloud.sdk.rds.v3.model.ModifiyInstanceNameRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ModifyCollationResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyDnsNameRequestBody;
import com.huaweicloud.sdk.rds.v3.model.ModifyMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyParamRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyPostgresqlHbaConfResponse;
import com.huaweicloud.sdk.rds.v3.model.ModifyProxyWeightRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyRdSforMySqlProxyRouteModeRequest;
import com.huaweicloud.sdk.rds.v3.model.ModifyRdSforMySqlProxyRouteModeResponse;
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
import com.huaweicloud.sdk.rds.v3.model.ReduceVolumeRequestBody;
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
import com.huaweicloud.sdk.rds.v3.model.SetHostPrivilegeRequestV3;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesDbShrinkRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesDbShrinkResponse;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesNewDbShrinkRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesNewDbShrinkResponse;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesProxyRestartRequest;
import com.huaweicloud.sdk.rds.v3.model.SetInstancesProxyRestartResponse;
import com.huaweicloud.sdk.rds.v3.model.SetLogLtsConfigsRequest;
import com.huaweicloud.sdk.rds.v3.model.SetLogLtsConfigsResponse;
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
import com.huaweicloud.sdk.rds.v3.model.ShowRecoveryTimeWindowRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowRecoveryTimeWindowResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.rds.v3.model.ShowReplayDelayStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.ShowReplayDelayStatusResponse;
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
import com.huaweicloud.sdk.rds.v3.model.SwitchLogReplayRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchLogReplayRequestBody;
import com.huaweicloud.sdk.rds.v3.model.SwitchLogReplayResponse;
import com.huaweicloud.sdk.rds.v3.model.SwitchSqlLimitControlReqV3;
import com.huaweicloud.sdk.rds.v3.model.SwitchSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslRequest;
import com.huaweicloud.sdk.rds.v3.model.SwitchSslResponse;
import com.huaweicloud.sdk.rds.v3.model.ToPeriodReq;
import com.huaweicloud.sdk.rds.v3.model.UnlockNodeReadonlyStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.UnlockNodeReadonlyStatusRequestBody;
import com.huaweicloud.sdk.rds.v3.model.UnlockNodeReadonlyStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateConfigurationResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDBShrinkRequestBody;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDataIpResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseOwnerRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseOwnerRequestBody;
import com.huaweicloud.sdk.rds.v3.model.UpdateDatabaseOwnerResponse;
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
import com.huaweicloud.sdk.rds.v3.model.UpdateHostPrivilegeRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateHostPrivilegeResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateIncreBackupPolicy1Request;
import com.huaweicloud.sdk.rds.v3.model.UpdateIncreBackupPolicy1RequestBody;
import com.huaweicloud.sdk.rds.v3.model.UpdateIncreBackupPolicy1Response;
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
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlExtensionRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlExtensionResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlInstanceAliasResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdatePostgresqlParameterValueResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateRdsInstanceAliasRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateReadWeightResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateSqlLimitRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateSqlLimitResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateSqlLimitRuleReqV3;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusRequestBody;
import com.huaweicloud.sdk.rds.v3.model.UpdateTdeStatusResponse;
import com.huaweicloud.sdk.rds.v3.model.UpdateToPeriodRequest;
import com.huaweicloud.sdk.rds.v3.model.UpdateToPeriodResponse;
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
        genForAddPostgresqlHbaConf();

    private static HttpRequestDef<AddPostgresqlHbaConfRequest, AddPostgresqlHbaConfResponse> genForAddPostgresqlHbaConf() {
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
            f -> f.withMarshaller(AddPostgresqlHbaConfRequest::getInstanceId,
                AddPostgresqlHbaConfRequest::setInstanceId));
        builder.<List<PostgresqlHbaConf>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(AddPostgresqlHbaConfRequest::getBody, AddPostgresqlHbaConfRequest::setBody)
                .withInnerContainerType(PostgresqlHbaConf.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsync =
        genForApplyConfigurationAsync();

    private static HttpRequestDef<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> genForApplyConfigurationAsync() {
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
            f -> f.withMarshaller(ApplyConfigurationAsyncRequest::getConfigId,
                ApplyConfigurationAsyncRequest::setConfigId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ApplyConfigurationAsyncRequest::getXLanguage,
                ApplyConfigurationAsyncRequest::setXLanguage));
        builder.<ApplyConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequest.class),
            f -> f.withMarshaller(ApplyConfigurationAsyncRequest::getBody, ApplyConfigurationAsyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachEipRequest, AttachEipResponse> attachEip = genForAttachEip();

    private static HttpRequestDef<AttachEipRequest, AttachEipResponse> genForAttachEip() {
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
            f -> f.withMarshaller(AttachEipRequest::getInstanceId, AttachEipRequest::setInstanceId));
        builder.<AttachEipRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AttachEipRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AttachEipRequest::getXLanguage, AttachEipRequest::setXLanguage));
        builder.<BindEipRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BindEipRequest.class),
            f -> f.withMarshaller(AttachEipRequest::getBody, AttachEipRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> batchDeleteManualBackup =
        genForBatchDeleteManualBackup();

    private static HttpRequestDef<BatchDeleteManualBackupRequest, BatchDeleteManualBackupResponse> genForBatchDeleteManualBackup() {
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
            f -> f.withMarshaller(BatchDeleteManualBackupRequest::getXLanguage,
                BatchDeleteManualBackupRequest::setXLanguage));
        builder.<BatchDeleteBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteBackupRequestBody.class),
            f -> f.withMarshaller(BatchDeleteManualBackupRequest::getBody, BatchDeleteManualBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> batchRestoreDatabase =
        genForBatchRestoreDatabase();

    private static HttpRequestDef<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> genForBatchRestoreDatabase() {
        // basic
        HttpRequestDef.Builder<BatchRestoreDatabaseRequest, BatchRestoreDatabaseResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchRestoreDatabaseRequest.class, BatchRestoreDatabaseResponse.class)
            .withName("BatchRestoreDatabase")
            .withUri("/v3/{project_id}/instances/batch/restore/databases")
            .withContentType("application/json");

        // requests
        builder.<PostgreSQLRestoreDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgreSQLRestoreDatabaseRequest.class),
            f -> f.withMarshaller(BatchRestoreDatabaseRequest::getBody, BatchRestoreDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> batchRestorePostgreSqlTables =
        genForBatchRestorePostgreSqlTables();

    private static HttpRequestDef<BatchRestorePostgreSqlTablesRequest, BatchRestorePostgreSqlTablesResponse> genForBatchRestorePostgreSqlTables() {
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
            f -> f.withMarshaller(BatchRestorePostgreSqlTablesRequest::getBody,
                BatchRestorePostgreSqlTablesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchStopInstanceRequest, BatchStopInstanceResponse> batchStopInstance =
        genForBatchStopInstance();

    private static HttpRequestDef<BatchStopInstanceRequest, BatchStopInstanceResponse> genForBatchStopInstance() {
        // basic
        HttpRequestDef.Builder<BatchStopInstanceRequest, BatchStopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchStopInstanceRequest.class, BatchStopInstanceResponse.class)
                .withName("BatchStopInstance")
                .withUri("/v3/{project_id}/instances/batch/action/shutdown")
                .withContentType("application/json");

        // requests
        builder.<BatchShutdownInsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchShutdownInsReq.class),
            f -> f.withMarshaller(BatchStopInstanceRequest::getBody, BatchStopInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(BatchStopInstanceResponse::getXRequestId, BatchStopInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddAction =
        genForBatchTagAddAction();

    private static HttpRequestDef<BatchTagAddActionRequest, BatchTagAddActionResponse> genForBatchTagAddAction() {
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
            f -> f.withMarshaller(BatchTagAddActionRequest::getInstanceId, BatchTagAddActionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagAddActionRequest::getXLanguage, BatchTagAddActionRequest::setXLanguage));
        builder.<BatchTagActionAddRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionAddRequestBody.class),
            f -> f.withMarshaller(BatchTagAddActionRequest::getBody, BatchTagAddActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelAction =
        genForBatchTagDelAction();

    private static HttpRequestDef<BatchTagDelActionRequest, BatchTagDelActionResponse> genForBatchTagDelAction() {
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
            f -> f.withMarshaller(BatchTagDelActionRequest::getInstanceId, BatchTagDelActionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchTagDelActionRequest::getXLanguage, BatchTagDelActionRequest::setXLanguage));
        builder.<BatchTagActionDelRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTagActionDelRequestBody.class),
            f -> f.withMarshaller(BatchTagDelActionRequest::getBody, BatchTagDelActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverMode =
        genForChangeFailoverMode();

    private static HttpRequestDef<ChangeFailoverModeRequest, ChangeFailoverModeResponse> genForChangeFailoverMode() {
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
            f -> f.withMarshaller(ChangeFailoverModeRequest::getInstanceId, ChangeFailoverModeRequest::setInstanceId));
        builder.<ChangeFailoverModeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeFailoverModeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeFailoverModeRequest::getXLanguage, ChangeFailoverModeRequest::setXLanguage));
        builder.<FailoverModeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FailoverModeRequest.class),
            f -> f.withMarshaller(ChangeFailoverModeRequest::getBody, ChangeFailoverModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategy =
        genForChangeFailoverStrategy();

    private static HttpRequestDef<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> genForChangeFailoverStrategy() {
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
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getInstanceId,
                ChangeFailoverStrategyRequest::setInstanceId));
        builder.<ChangeFailoverStrategyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeFailoverStrategyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getXLanguage,
                ChangeFailoverStrategyRequest::setXLanguage));
        builder.<FailoverStrategyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FailoverStrategyRequest.class),
            f -> f.withMarshaller(ChangeFailoverStrategyRequest::getBody, ChangeFailoverStrategyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindow =
        genForChangeOpsWindow();

    private static HttpRequestDef<ChangeOpsWindowRequest, ChangeOpsWindowResponse> genForChangeOpsWindow() {
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
            f -> f.withMarshaller(ChangeOpsWindowRequest::getInstanceId, ChangeOpsWindowRequest::setInstanceId));
        builder.<ChangeOpsWindowRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeOpsWindowRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getXLanguage, ChangeOpsWindowRequest::setXLanguage));
        builder.<OpsWindowRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpsWindowRequest.class),
            f -> f.withMarshaller(ChangeOpsWindowRequest::getBody, ChangeOpsWindowRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> copyConfiguration =
        genForCopyConfiguration();

    private static HttpRequestDef<CopyConfigurationRequest, CopyConfigurationResponse> genForCopyConfiguration() {
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
            f -> f.withMarshaller(CopyConfigurationRequest::getConfigId, CopyConfigurationRequest::setConfigId));
        builder.<ConfigurationCopyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ConfigurationCopyRequestBody.class),
            f -> f.withMarshaller(CopyConfigurationRequest::getBody, CopyConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> createConfiguration =
        genForCreateConfiguration();

    private static HttpRequestDef<CreateConfigurationRequest, CreateConfigurationResponse> genForCreateConfiguration() {
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
            f -> f.withMarshaller(CreateConfigurationRequest::getXLanguage, CreateConfigurationRequest::setXLanguage));
        builder.<ConfigurationForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationForCreation.class),
            f -> f.withMarshaller(CreateConfigurationRequest::getBody, CreateConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDnsNameRequest, CreateDnsNameResponse> createDnsName =
        genForCreateDnsName();

    private static HttpRequestDef<CreateDnsNameRequest, CreateDnsNameResponse> genForCreateDnsName() {
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
            f -> f.withMarshaller(CreateDnsNameRequest::getInstanceId, CreateDnsNameRequest::setInstanceId));
        builder.<CreateDnsNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDnsNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateDnsNameRequest::getXLanguage, CreateDnsNameRequest::setXLanguage));
        builder.<CreateDnsNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDnsNameRequestBody.class),
            f -> f.withMarshaller(CreateDnsNameRequest::getBody, CreateDnsNameRequest::setBody));

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
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateInstanceRequest::getXLanguage, CreateInstanceRequest::setXLanguage));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getXClientToken, CreateInstanceRequest::setXClientToken));
        builder.<InstanceRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRequest.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, CreateInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceIam5Request, CreateInstanceIam5Response> createInstanceIam5 =
        genForCreateInstanceIam5();

    private static HttpRequestDef<CreateInstanceIam5Request, CreateInstanceIam5Response> genForCreateInstanceIam5() {
        // basic
        HttpRequestDef.Builder<CreateInstanceIam5Request, CreateInstanceIam5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceIam5Request.class, CreateInstanceIam5Response.class)
                .withName("CreateInstanceIam5")
                .withUri("/v5/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<CreateInstanceIam5Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateInstanceIam5Request.XLanguageEnum.class),
            f -> f.withMarshaller(CreateInstanceIam5Request::getXLanguage, CreateInstanceIam5Request::setXLanguage));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceIam5Request::getXClientToken,
                CreateInstanceIam5Request::setXClientToken));
        builder.<CustomerCreateInstanceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomerCreateInstanceReq.class),
            f -> f.withMarshaller(CreateInstanceIam5Request::getBody, CreateInstanceIam5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackup =
        genForCreateManualBackup();

    private static HttpRequestDef<CreateManualBackupRequest, CreateManualBackupResponse> genForCreateManualBackup() {
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
            f -> f.withMarshaller(CreateManualBackupRequest::getXLanguage, CreateManualBackupRequest::setXLanguage));
        builder.<CreateManualBackupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManualBackupRequestBody.class),
            f -> f.withMarshaller(CreateManualBackupRequest::getBody, CreateManualBackupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRdSforMySqlProxyRequest, CreateRdSforMySqlProxyResponse> createRdSforMySqlProxy =
        genForCreateRdSforMySqlProxy();

    private static HttpRequestDef<CreateRdSforMySqlProxyRequest, CreateRdSforMySqlProxyResponse> genForCreateRdSforMySqlProxy() {
        // basic
        HttpRequestDef.Builder<CreateRdSforMySqlProxyRequest, CreateRdSforMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRdSforMySqlProxyRequest.class, CreateRdSforMySqlProxyResponse.class)
            .withName("CreateRdSforMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/open")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRdSforMySqlProxyRequest::getInstanceId,
                CreateRdSforMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRdSforMySqlProxyRequest::getXLanguage,
                CreateRdSforMySqlProxyRequest::setXLanguage));
        builder.<CreateMysqlMultiProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMysqlMultiProxyRequest.class),
            f -> f.withMarshaller(CreateRdSforMySqlProxyRequest::getBody, CreateRdSforMySqlProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstance =
        genForCreateRestoreInstance();

    private static HttpRequestDef<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> genForCreateRestoreInstance() {
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
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getXLanguage,
                CreateRestoreInstanceRequest::setXLanguage));
        builder.<CreateRestoreInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRestoreInstanceRequestBody.class),
            f -> f.withMarshaller(CreateRestoreInstanceRequest::getBody, CreateRestoreInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlLimitRequest, CreateSqlLimitResponse> createSqlLimit =
        genForCreateSqlLimit();

    private static HttpRequestDef<CreateSqlLimitRequest, CreateSqlLimitResponse> genForCreateSqlLimit() {
        // basic
        HttpRequestDef.Builder<CreateSqlLimitRequest, CreateSqlLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlLimitRequest.class, CreateSqlLimitResponse.class)
                .withName("CreateSqlLimit")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlLimitRequest::getInstanceId, CreateSqlLimitRequest::setInstanceId));
        builder.<CreateSqlLimitRuleReqV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlLimitRuleReqV3.class),
            f -> f.withMarshaller(CreateSqlLimitRequest::getBody, CreateSqlLimitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> createXelLogDownload =
        genForCreateXelLogDownload();

    private static HttpRequestDef<CreateXelLogDownloadRequest, CreateXelLogDownloadResponse> genForCreateXelLogDownload() {
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
            f -> f.withMarshaller(CreateXelLogDownloadRequest::getInstanceId,
                CreateXelLogDownloadRequest::setInstanceId));
        builder.<CreateXelLogDownloadRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateXelLogDownloadRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateXelLogDownloadRequest::getXLanguage,
                CreateXelLogDownloadRequest::setXLanguage));
        builder.<CreateXelLogDownloadRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateXelLogDownloadRequestBody.class),
            f -> f.withMarshaller(CreateXelLogDownloadRequest::getBody, CreateXelLogDownloadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfiguration =
        genForDeleteConfiguration();

    private static HttpRequestDef<DeleteConfigurationRequest, DeleteConfigurationResponse> genForDeleteConfiguration() {
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
            f -> f.withMarshaller(DeleteConfigurationRequest::getConfigId, DeleteConfigurationRequest::setConfigId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigurationRequest::getXLanguage, DeleteConfigurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecovery =
        genForDeleteDisasterRecovery();

    private static HttpRequestDef<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> genForDeleteDisasterRecovery() {
        // basic
        HttpRequestDef.Builder<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteDisasterRecoveryRequest.class, DeleteDisasterRecoveryResponse.class)
            .withName("DeleteDisasterRecovery")
            .withUri("/v3/{project_id}/instances/{instance_id}/delete-disaster-recovery")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getInstanceId,
                DeleteDisasterRecoveryRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getXLanguage,
                DeleteDisasterRecoveryRequest::setXLanguage));
        builder.<DeleteDisasterRecoveryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteDisasterRecoveryRequestBody.class),
            f -> f.withMarshaller(DeleteDisasterRecoveryRequest::getBody, DeleteDisasterRecoveryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genForDeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genForDeleteInstance() {
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
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, DeleteInstanceRequest::setInstanceId));
        builder.<DeleteInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getXLanguage, DeleteInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteJobRequest, DeleteJobResponse> deleteJob = genForDeleteJob();

    private static HttpRequestDef<DeleteJobRequest, DeleteJobResponse> genForDeleteJob() {
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
            f -> f.withMarshaller(DeleteJobRequest::getId, DeleteJobRequest::setId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteJobResponse::getBody, DeleteJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLogLtsConfigsRequest, DeleteLogLtsConfigsResponse> deleteLogLtsConfigs =
        genForDeleteLogLtsConfigs();

    private static HttpRequestDef<DeleteLogLtsConfigsRequest, DeleteLogLtsConfigsResponse> genForDeleteLogLtsConfigs() {
        // basic
        HttpRequestDef.Builder<DeleteLogLtsConfigsRequest, DeleteLogLtsConfigsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLogLtsConfigsRequest.class, DeleteLogLtsConfigsResponse.class)
            .withName("DeleteLogLtsConfigs")
            .withUri("/v3/{project_id}/{engine}/instances/logs/lts-configs")
            .withContentType("application/json");

        // requests
        builder.<DeleteLogLtsConfigsRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLogLtsConfigsRequest.EngineEnum.class),
            f -> f.withMarshaller(DeleteLogLtsConfigsRequest::getEngine, DeleteLogLtsConfigsRequest::setEngine));
        builder.<DeleteLogLtsConfigsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteLogLtsConfigsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteLogLtsConfigsRequest::getXLanguage, DeleteLogLtsConfigsRequest::setXLanguage));
        builder.<DeleteLogConfigResponseBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteLogConfigResponseBody.class),
            f -> f.withMarshaller(DeleteLogLtsConfigsRequest::getBody, DeleteLogLtsConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackup =
        genForDeleteManualBackup();

    private static HttpRequestDef<DeleteManualBackupRequest, DeleteManualBackupResponse> genForDeleteManualBackup() {
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
            f -> f.withMarshaller(DeleteManualBackupRequest::getBackupId, DeleteManualBackupRequest::setBackupId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManualBackupRequest::getXLanguage, DeleteManualBackupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> deletePostgresqlHbaConf =
        genForDeletePostgresqlHbaConf();

    private static HttpRequestDef<DeletePostgresqlHbaConfRequest, DeletePostgresqlHbaConfResponse> genForDeletePostgresqlHbaConf() {
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
            f -> f.withMarshaller(DeletePostgresqlHbaConfRequest::getInstanceId,
                DeletePostgresqlHbaConfRequest::setInstanceId));
        builder.<List<PostgresqlHbaConf>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeletePostgresqlHbaConfRequest::getBody, DeletePostgresqlHbaConfRequest::setBody)
                .withInnerContainerType(PostgresqlHbaConf.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRdSforMySqlProxyRequest, DeleteRdSforMySqlProxyResponse> deleteRdSforMySqlProxy =
        genForDeleteRdSforMySqlProxy();

    private static HttpRequestDef<DeleteRdSforMySqlProxyRequest, DeleteRdSforMySqlProxyResponse> genForDeleteRdSforMySqlProxy() {
        // basic
        HttpRequestDef.Builder<DeleteRdSforMySqlProxyRequest, DeleteRdSforMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteRdSforMySqlProxyRequest.class, DeleteRdSforMySqlProxyResponse.class)
            .withName("DeleteRdSforMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRdSforMySqlProxyRequest::getInstanceId,
                DeleteRdSforMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRdSforMySqlProxyRequest::getProxyId,
                DeleteRdSforMySqlProxyRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRdSforMySqlProxyRequest::getXLanguage,
                DeleteRdSforMySqlProxyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlLimitRequest, DeleteSqlLimitResponse> deleteSqlLimit =
        genForDeleteSqlLimit();

    private static HttpRequestDef<DeleteSqlLimitRequest, DeleteSqlLimitResponse> genForDeleteSqlLimit() {
        // basic
        HttpRequestDef.Builder<DeleteSqlLimitRequest, DeleteSqlLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteSqlLimitRequest.class, DeleteSqlLimitResponse.class)
                .withName("DeleteSqlLimit")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlLimitRequest::getInstanceId, DeleteSqlLimitRequest::setInstanceId));
        builder.<DeleteSqlLimitRuleReqV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlLimitRuleReqV3.class),
            f -> f.withMarshaller(DeleteSqlLimitRequest::getBody, DeleteSqlLimitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadErrorlogRequest, DownloadErrorlogResponse> downloadErrorlog =
        genForDownloadErrorlog();

    private static HttpRequestDef<DownloadErrorlogRequest, DownloadErrorlogResponse> genForDownloadErrorlog() {
        // basic
        HttpRequestDef.Builder<DownloadErrorlogRequest, DownloadErrorlogResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadErrorlogRequest.class, DownloadErrorlogResponse.class)
                .withName("DownloadErrorlog")
                .withUri("/v3/{project_id}/instances/{instance_id}/errorlog-download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadErrorlogRequest::getInstanceId, DownloadErrorlogRequest::setInstanceId));
        builder.<DownloadErrorlogRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadErrorlogRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadErrorlogRequest::getXLanguage, DownloadErrorlogRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlog =
        genForDownloadSlowlog();

    private static HttpRequestDef<DownloadSlowlogRequest, DownloadSlowlogResponse> genForDownloadSlowlog() {
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
            f -> f.withMarshaller(DownloadSlowlogRequest::getInstanceId, DownloadSlowlogRequest::setInstanceId));
        builder.<DownloadSlowlogRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadSlowlogRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getXLanguage, DownloadSlowlogRequest::setXLanguage));
        builder.<SlowlogDownloadRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlowlogDownloadRequest.class),
            f -> f.withMarshaller(DownloadSlowlogRequest::getBody, DownloadSlowlogRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableConfigurationRequest, EnableConfigurationResponse> enableConfiguration =
        genForEnableConfiguration();

    private static HttpRequestDef<EnableConfigurationRequest, EnableConfigurationResponse> genForEnableConfiguration() {
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
            f -> f.withMarshaller(EnableConfigurationRequest::getConfigId, EnableConfigurationRequest::setConfigId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableConfigurationRequest::getXLanguage, EnableConfigurationRequest::setXLanguage));
        builder.<ApplyConfigurationRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApplyConfigurationRequest.class),
            f -> f.withMarshaller(EnableConfigurationRequest::getBody, EnableConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogs =
        genForListAuditlogs();

    private static HttpRequestDef<ListAuditlogsRequest, ListAuditlogsResponse> genForListAuditlogs() {
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
            f -> f.withMarshaller(ListAuditlogsRequest::getInstanceId, ListAuditlogsRequest::setInstanceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getStartTime, ListAuditlogsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getEndTime, ListAuditlogsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getOffset, ListAuditlogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getLimit, ListAuditlogsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuditlogsRequest::getXLanguage, ListAuditlogsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackupsRequest, ListBackupsResponse> listBackups = genForListBackups();

    private static HttpRequestDef<ListBackupsRequest, ListBackupsResponse> genForListBackups() {
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
            f -> f.withMarshaller(ListBackupsRequest::getInstanceId, ListBackupsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupId, ListBackupsRequest::setBackupId));
        builder.<ListBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getBackupType, ListBackupsRequest::setBackupType));
        builder.<ListBackupsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBackupsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListBackupsRequest::getStatus, ListBackupsRequest::setStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getOffset, ListBackupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackupsRequest::getLimit, ListBackupsRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getBeginTime, ListBackupsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getEndTime, ListBackupsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackupsRequest::getXLanguage, ListBackupsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCollationsRequest, ListCollationsResponse> listCollations =
        genForListCollations();

    private static HttpRequestDef<ListCollationsRequest, ListCollationsResponse> genForListCollations() {
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
            f -> f.withMarshaller(ListCollationsRequest::getXLanguage, ListCollationsRequest::setXLanguage));

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
                .withUri("/v3/{project_id}/configurations")
                .withContentType("application/json");

        // requests
        builder.<ListConfigurationsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConfigurationsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConfigurationsRequest::getXLanguage, ListConfigurationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> listDatastores =
        genForListDatastores();

    private static HttpRequestDef<ListDatastoresRequest, ListDatastoresResponse> genForListDatastores() {
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
            f -> f.withMarshaller(ListDatastoresRequest::getDatabaseName, ListDatastoresRequest::setDatabaseName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatastoresRequest::getXLanguage, ListDatastoresRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDrRelationsRequest, ListDrRelationsResponse> listDrRelations =
        genForListDrRelations();

    private static HttpRequestDef<ListDrRelationsRequest, ListDrRelationsResponse> genForListDrRelations() {
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
            f -> f.withMarshaller(ListDrRelationsRequest::getXLanguage, ListDrRelationsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEngineFlavorsRequest, ListEngineFlavorsResponse> listEngineFlavors =
        genForListEngineFlavors();

    private static HttpRequestDef<ListEngineFlavorsRequest, ListEngineFlavorsResponse> genForListEngineFlavors() {
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
            f -> f.withMarshaller(ListEngineFlavorsRequest::getInstanceId, ListEngineFlavorsRequest::setInstanceId));
        builder.<String>withRequestField("availability_zone_ids",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getAvailabilityZoneIds,
                ListEngineFlavorsRequest::setAvailabilityZoneIds));
        builder.<String>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getHaMode, ListEngineFlavorsRequest::setHaMode));
        builder.<String>withRequestField("spec_code_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getSpecCodeLike,
                ListEngineFlavorsRequest::setSpecCodeLike));
        builder.<String>withRequestField("flavor_category_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getFlavorCategoryType,
                ListEngineFlavorsRequest::setFlavorCategoryType));
        builder.<Boolean>withRequestField("is_rha_flavor",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getIsRhaFlavor, ListEngineFlavorsRequest::setIsRhaFlavor));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getOffset, ListEngineFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEngineFlavorsRequest::getLimit, ListEngineFlavorsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogs =
        genForListErrorLogs();

    private static HttpRequestDef<ListErrorLogsRequest, ListErrorLogsResponse> genForListErrorLogs() {
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
            f -> f.withMarshaller(ListErrorLogsRequest::getInstanceId, ListErrorLogsRequest::setInstanceId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getStartDate, ListErrorLogsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getEndDate, ListErrorLogsRequest::setEndDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getOffset, ListErrorLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getLimit, ListErrorLogsRequest::setLimit));
        builder.<ListErrorLogsRequest.LevelEnum>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorLogsRequest.LevelEnum.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getLevel, ListErrorLogsRequest::setLevel));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsRequest::getXLanguage, ListErrorLogsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNew =
        genForListErrorLogsNew();

    private static HttpRequestDef<ListErrorLogsNewRequest, ListErrorLogsNewResponse> genForListErrorLogsNew() {
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
            f -> f.withMarshaller(ListErrorLogsNewRequest::getInstanceId, ListErrorLogsNewRequest::setInstanceId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getStartDate, ListErrorLogsNewRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getEndDate, ListErrorLogsNewRequest::setEndDate));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getOffset, ListErrorLogsNewRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getLimit, ListErrorLogsNewRequest::setLimit));
        builder.<ListErrorLogsNewRequest.LevelEnum>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorLogsNewRequest.LevelEnum.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getLevel, ListErrorLogsNewRequest::setLevel));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListErrorLogsNewRequest::getXLanguage, ListErrorLogsNewRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> listErrorlogForLts =
        genForListErrorlogForLts();

    private static HttpRequestDef<ListErrorlogForLtsRequest, ListErrorlogForLtsResponse> genForListErrorlogForLts() {
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
            f -> f.withMarshaller(ListErrorlogForLtsRequest::getInstanceId, ListErrorlogForLtsRequest::setInstanceId));
        builder.<ListErrorlogForLtsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListErrorlogForLtsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListErrorlogForLtsRequest::getXLanguage, ListErrorlogForLtsRequest::setXLanguage));
        builder.<ErrorlogForLtsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ErrorlogForLtsRequest.class),
            f -> f.withMarshaller(ListErrorlogForLtsRequest::getBody, ListErrorlogForLtsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
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
            f -> f.withMarshaller(ListFlavorsRequest::getDatabaseName, ListFlavorsRequest::setDatabaseName));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getVersionName, ListFlavorsRequest::setVersionName));
        builder.<String>withRequestField("spec_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecCode, ListFlavorsRequest::setSpecCode));
        builder.<String>withRequestField("is_serverless",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getIsServerless, ListFlavorsRequest::setIsServerless));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getXLanguage, ListFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsResizeRequest, ListFlavorsResizeResponse> listFlavorsResize =
        genForListFlavorsResize();

    private static HttpRequestDef<ListFlavorsResizeRequest, ListFlavorsResizeResponse> genForListFlavorsResize() {
        // basic
        HttpRequestDef.Builder<ListFlavorsResizeRequest, ListFlavorsResizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsResizeRequest.class, ListFlavorsResizeResponse.class)
                .withName("ListFlavorsResize")
                .withUri("/v3/{project_id}/instances/{instance_id}/flavors-resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsResizeRequest::getInstanceId, ListFlavorsResizeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsResizeRequest::getXLanguage, ListFlavorsResizeRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> listHistoryDatabase =
        genForListHistoryDatabase();

    private static HttpRequestDef<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> genForListHistoryDatabase() {
        // basic
        HttpRequestDef.Builder<ListHistoryDatabaseRequest, ListHistoryDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListHistoryDatabaseRequest.class, ListHistoryDatabaseResponse.class)
                .withName("ListHistoryDatabase")
                .withUri("/v3/{project_id}/{engine}/instances/history/databases")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryDatabaseRequest::getEngine, ListHistoryDatabaseRequest::setEngine));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryDatabaseRequest::getXLanguage, ListHistoryDatabaseRequest::setXLanguage));
        builder.<PostgreSQLHistoryDatabaseRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgreSQLHistoryDatabaseRequest.class),
            f -> f.withMarshaller(ListHistoryDatabaseRequest::getBody, ListHistoryDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> listInspectionHistories =
        genForListInspectionHistories();

    private static HttpRequestDef<ListInspectionHistoriesRequest, ListInspectionHistoriesResponse> genForListInspectionHistories() {
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
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getInstanceId,
                ListInspectionHistoriesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getOffset,
                ListInspectionHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getLimit, ListInspectionHistoriesRequest::setLimit));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getOrder, ListInspectionHistoriesRequest::setOrder));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getSortField,
                ListInspectionHistoriesRequest::setSortField));
        builder.<String>withRequestField("target_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getTargetVersion,
                ListInspectionHistoriesRequest::setTargetVersion));
        builder.<Boolean>withRequestField("is_available",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getIsAvailable,
                ListInspectionHistoriesRequest::setIsAvailable));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionHistoriesRequest::getXLanguage,
                ListInspectionHistoriesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> listInstanceDiagnosis =
        genForListInstanceDiagnosis();

    private static HttpRequestDef<ListInstanceDiagnosisRequest, ListInstanceDiagnosisResponse> genForListInstanceDiagnosis() {
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
            f -> f.withMarshaller(ListInstanceDiagnosisRequest::getEngine, ListInstanceDiagnosisRequest::setEngine));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> listInstanceParamHistories =
        genForListInstanceParamHistories();

    private static HttpRequestDef<ListInstanceParamHistoriesRequest, ListInstanceParamHistoriesResponse> genForListInstanceParamHistories() {
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
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getInstanceId,
                ListInstanceParamHistoriesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getOffset,
                ListInstanceParamHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getLimit,
                ListInstanceParamHistoriesRequest::setLimit));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getStartTime,
                ListInstanceParamHistoriesRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getEndTime,
                ListInstanceParamHistoriesRequest::setEndTime));
        builder.<String>withRequestField("param_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceParamHistoriesRequest::getParamName,
                ListInstanceParamHistoriesRequest::setParamName));

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
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTagsRequest::getXLanguage, ListInstanceTagsRequest::setXLanguage));

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
                .withUri("/v3/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getId, ListInstancesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getName, ListInstancesRequest::setName));
        builder.<ListInstancesRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.TypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getType, ListInstancesRequest::setType));
        builder.<ListInstancesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getDatastoreType, ListInstancesRequest::setDatastoreType));
        builder.<String>withRequestField("eps_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getEpsId, ListInstancesRequest::setEpsId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getVpcId, ListInstancesRequest::setVpcId));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSubnetId, ListInstancesRequest::setSubnetId));
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
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getTags, ListInstancesRequest::setTags));
        builder.<ListInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getXLanguage, ListInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> listInstancesInfoDiagnosis =
        genForListInstancesInfoDiagnosis();

    private static HttpRequestDef<ListInstancesInfoDiagnosisRequest, ListInstancesInfoDiagnosisResponse> genForListInstancesInfoDiagnosis() {
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
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getEngine,
                ListInstancesInfoDiagnosisRequest::setEngine));
        builder.<ListInstancesInfoDiagnosisRequest.DiagnosisEnum>withRequestField("diagnosis",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesInfoDiagnosisRequest.DiagnosisEnum.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getDiagnosis,
                ListInstancesInfoDiagnosisRequest::setDiagnosis));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getOffset,
                ListInstancesInfoDiagnosisRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesInfoDiagnosisRequest::getLimit,
                ListInstancesInfoDiagnosisRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> listInstancesSupportFastRestore =
        genForListInstancesSupportFastRestore();

    private static HttpRequestDef<ListInstancesSupportFastRestoreRequest, ListInstancesSupportFastRestoreResponse> genForListInstancesSupportFastRestore() {
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
            f -> f.withMarshaller(ListInstancesSupportFastRestoreRequest::getXLanguage,
                ListInstancesSupportFastRestoreRequest::setXLanguage));
        builder.<ListInstancesSupportFastRestoreRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesSupportFastRestoreRequestBody.class),
            f -> f.withMarshaller(ListInstancesSupportFastRestoreRequest::getBody,
                ListInstancesSupportFastRestoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInfoRequest, ListJobInfoResponse> listJobInfo = genForListJobInfo();

    private static HttpRequestDef<ListJobInfoRequest, ListJobInfoResponse> genForListJobInfo() {
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
            f -> f.withMarshaller(ListJobInfoRequest::getId, ListJobInfoRequest::setId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoRequest::getXLanguage, ListJobInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetail =
        genForListJobInfoDetail();

    private static HttpRequestDef<ListJobInfoDetailRequest, ListJobInfoDetailResponse> genForListJobInfoDetail() {
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
            f -> f.withMarshaller(ListJobInfoDetailRequest::getInstanceId, ListJobInfoDetailRequest::setInstanceId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getStartTime, ListJobInfoDetailRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getEndTime, ListJobInfoDetailRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListJobInfoDetailRequest::getXLanguage, ListJobInfoDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLogLtsConfigsRequest, ListLogLtsConfigsResponse> listLogLtsConfigs =
        genForListLogLtsConfigs();

    private static HttpRequestDef<ListLogLtsConfigsRequest, ListLogLtsConfigsResponse> genForListLogLtsConfigs() {
        // basic
        HttpRequestDef.Builder<ListLogLtsConfigsRequest, ListLogLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLogLtsConfigsRequest.class, ListLogLtsConfigsResponse.class)
                .withName("ListLogLtsConfigs")
                .withUri("/v3/{project_id}/{engine}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<ListLogLtsConfigsRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLogLtsConfigsRequest.EngineEnum.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getEngine, ListLogLtsConfigsRequest::setEngine));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getEnterpriseProjectId,
                ListLogLtsConfigsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getInstanceId, ListLogLtsConfigsRequest::setInstanceId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getInstanceName,
                ListLogLtsConfigsRequest::setInstanceName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getLimit, ListLogLtsConfigsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getOffset, ListLogLtsConfigsRequest::setOffset));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getSort, ListLogLtsConfigsRequest::setSort));
        builder.<String>withRequestField("instance_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getInstanceStatus,
                ListLogLtsConfigsRequest::setInstanceStatus));
        builder.<ListLogLtsConfigsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLogLtsConfigsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListLogLtsConfigsRequest::getXLanguage, ListLogLtsConfigsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackups =
        genForListOffSiteBackups();

    private static HttpRequestDef<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> genForListOffSiteBackups() {
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
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getInstanceId, ListOffSiteBackupsRequest::setInstanceId));
        builder.<String>withRequestField("backup_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBackupId, ListOffSiteBackupsRequest::setBackupId));
        builder.<ListOffSiteBackupsRequest.BackupTypeEnum>withRequestField("backup_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOffSiteBackupsRequest.BackupTypeEnum.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBackupType, ListOffSiteBackupsRequest::setBackupType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getOffset, ListOffSiteBackupsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getLimit, ListOffSiteBackupsRequest::setLimit));
        builder.<String>withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getBeginTime, ListOffSiteBackupsRequest::setBeginTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getEndTime, ListOffSiteBackupsRequest::setEndTime));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteBackupsRequest::getXLanguage, ListOffSiteBackupsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstances =
        genForListOffSiteInstances();

    private static HttpRequestDef<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> genForListOffSiteInstances() {
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
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getOffset, ListOffSiteInstancesRequest::setOffset));
        builder.<Object>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Object.class),
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getLimit, ListOffSiteInstancesRequest::setLimit));
        builder.<ListOffSiteInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListOffSiteInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListOffSiteInstancesRequest::getXLanguage,
                ListOffSiteInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimes =
        genForListOffSiteRestoreTimes();

    private static HttpRequestDef<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> genForListOffSiteRestoreTimes() {
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
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getInstanceId,
                ListOffSiteRestoreTimesRequest::setInstanceId));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getDate, ListOffSiteRestoreTimesRequest::setDate));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOffSiteRestoreTimesRequest::getXLanguage,
                ListOffSiteRestoreTimesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> listPostgresqlHbaInfo =
        genForListPostgresqlHbaInfo();

    private static HttpRequestDef<ListPostgresqlHbaInfoRequest, ListPostgresqlHbaInfoResponse> genForListPostgresqlHbaInfo() {
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
            f -> f.withMarshaller(ListPostgresqlHbaInfoRequest::getInstanceId,
                ListPostgresqlHbaInfoRequest::setInstanceId));

        // response
        builder.<List<PostgresqlHbaConf>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoResponse::getBody, ListPostgresqlHbaInfoResponse::setBody)
                .withInnerContainerType(PostgresqlHbaConf.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> listPostgresqlHbaInfoHistory =
        genForListPostgresqlHbaInfoHistory();

    private static HttpRequestDef<ListPostgresqlHbaInfoHistoryRequest, ListPostgresqlHbaInfoHistoryResponse> genForListPostgresqlHbaInfoHistory() {
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
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryRequest::getInstanceId,
                ListPostgresqlHbaInfoHistoryRequest::setInstanceId));
        builder.<OffsetDateTime>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryRequest::getStartTime,
                ListPostgresqlHbaInfoHistoryRequest::setStartTime));
        builder.<OffsetDateTime>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
            f -> f.withMarshaller(ListPostgresqlHbaInfoHistoryRequest::getEndTime,
                ListPostgresqlHbaInfoHistoryRequest::setEndTime));

        // response
        builder.<List<PostgresqlHbaHistory>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ListPostgresqlHbaInfoHistoryResponse::getBody,
                    ListPostgresqlHbaInfoHistoryResponse::setBody)
                .withInnerContainerType(PostgresqlHbaHistory.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> listPostgresqlListHistoryTables =
        genForListPostgresqlListHistoryTables();

    private static HttpRequestDef<ListPostgresqlListHistoryTablesRequest, ListPostgresqlListHistoryTablesResponse> genForListPostgresqlListHistoryTables() {
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
            f -> f.withMarshaller(ListPostgresqlListHistoryTablesRequest::getDatabaseName,
                ListPostgresqlListHistoryTablesRequest::setDatabaseName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlListHistoryTablesRequest::getXLanguage,
                ListPostgresqlListHistoryTablesRequest::setXLanguage));
        builder.<PostgreSQLHistoryTableRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgreSQLHistoryTableRequest.class),
            f -> f.withMarshaller(ListPostgresqlListHistoryTablesRequest::getBody,
                ListPostgresqlListHistoryTablesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefinedTagRequest, ListPredefinedTagResponse> listPredefinedTag =
        genForListPredefinedTag();

    private static HttpRequestDef<ListPredefinedTagRequest, ListPredefinedTagResponse> genForListPredefinedTag() {
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
            f -> f.withMarshaller(ListPredefinedTagRequest::getXLanguage, ListPredefinedTagRequest::setXLanguage));

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
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTagsRequest::getXLanguage, ListProjectTagsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRdSforMySqlProxyRequest, ListRdSforMySqlProxyResponse> listRdSforMySqlProxy =
        genForListRdSforMySqlProxy();

    private static HttpRequestDef<ListRdSforMySqlProxyRequest, ListRdSforMySqlProxyResponse> genForListRdSforMySqlProxy() {
        // basic
        HttpRequestDef.Builder<ListRdSforMySqlProxyRequest, ListRdSforMySqlProxyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRdSforMySqlProxyRequest.class, ListRdSforMySqlProxyResponse.class)
            .withName("ListRdSforMySqlProxy")
            .withUri("/v3/{project_id}/instances/{instance_id}/proxy-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdSforMySqlProxyRequest::getInstanceId,
                ListRdSforMySqlProxyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdSforMySqlProxyRequest::getXLanguage,
                ListRdSforMySqlProxyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRdSforMysqlProxyFlavorsRequest, ListRdSforMysqlProxyFlavorsResponse> listRdSforMysqlProxyFlavors =
        genForListRdSforMysqlProxyFlavors();

    private static HttpRequestDef<ListRdSforMysqlProxyFlavorsRequest, ListRdSforMysqlProxyFlavorsResponse> genForListRdSforMysqlProxyFlavors() {
        // basic
        HttpRequestDef.Builder<ListRdSforMysqlProxyFlavorsRequest, ListRdSforMysqlProxyFlavorsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRdSforMysqlProxyFlavorsRequest.class,
                    ListRdSforMysqlProxyFlavorsResponse.class)
                .withName("ListRdSforMysqlProxyFlavors")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdSforMysqlProxyFlavorsRequest::getInstanceId,
                ListRdSforMysqlProxyFlavorsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRdSforMysqlProxyFlavorsRequest::getOffset,
                ListRdSforMysqlProxyFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRdSforMysqlProxyFlavorsRequest::getLimit,
                ListRdSforMysqlProxyFlavorsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRdSforMysqlProxyFlavorsRequest::getXLanguage,
                ListRdSforMysqlProxyFlavorsRequest::setXLanguage));

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
            .withUri("/v3/{project_id}/recycle-instances")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getOffset, ListRecycleInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getLimit, ListRecycleInstancesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecycleInstancesRequest::getXLanguage,
                ListRecycleInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimes =
        genForListRestoreTimes();

    private static HttpRequestDef<ListRestoreTimesRequest, ListRestoreTimesResponse> genForListRestoreTimes() {
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
            f -> f.withMarshaller(ListRestoreTimesRequest::getInstanceId, ListRestoreTimesRequest::setInstanceId));
        builder.<String>withRequestField("date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getDate, ListRestoreTimesRequest::setDate));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRestoreTimesRequest::getXLanguage, ListRestoreTimesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListShareBackupsRequest, ListShareBackupsResponse> listShareBackups =
        genForListShareBackups();

    private static HttpRequestDef<ListShareBackupsRequest, ListShareBackupsResponse> genForListShareBackups() {
        // basic
        HttpRequestDef.Builder<ListShareBackupsRequest, ListShareBackupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListShareBackupsRequest.class, ListShareBackupsResponse.class)
                .withName("ListShareBackups")
                .withUri("/v3/{project_id}/share-backups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBackupsRequest::getInstanceId, ListShareBackupsRequest::setInstanceId));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBackupsRequest::getInstanceName, ListShareBackupsRequest::setInstanceName));
        builder.<String>withRequestField("backup_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBackupsRequest::getBackupName, ListShareBackupsRequest::setBackupName));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBackupsRequest::getOffset, ListShareBackupsRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListShareBackupsRequest::getLimit, ListShareBackupsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> listSimplifiedInstances =
        genForListSimplifiedInstances();

    private static HttpRequestDef<ListSimplifiedInstancesRequest, ListSimplifiedInstancesResponse> genForListSimplifiedInstances() {
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
            f -> f.withMarshaller(ListSimplifiedInstancesRequest::getXLanguage,
                ListSimplifiedInstancesRequest::setXLanguage));
        builder.<SimplifiedInstancesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SimplifiedInstancesRequest.class),
            f -> f.withMarshaller(ListSimplifiedInstancesRequest::getBody, ListSimplifiedInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFile =
        genForListSlowLogFile();

    private static HttpRequestDef<ListSlowLogFileRequest, ListSlowLogFileResponse> genForListSlowLogFile() {
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
            f -> f.withMarshaller(ListSlowLogFileRequest::getInstanceId, ListSlowLogFileRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getOffset, ListSlowLogFileRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getLimit, ListSlowLogFileRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogFileRequest::getXLanguage, ListSlowLogFileRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> listSlowLogStatisticsForLts =
        genForListSlowLogStatisticsForLts();

    private static HttpRequestDef<ListSlowLogStatisticsForLtsRequest, ListSlowLogStatisticsForLtsResponse> genForListSlowLogStatisticsForLts() {
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
            f -> f.withMarshaller(ListSlowLogStatisticsForLtsRequest::getInstanceId,
                ListSlowLogStatisticsForLtsRequest::setInstanceId));
        builder.<ListSlowLogStatisticsForLtsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogStatisticsForLtsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSlowLogStatisticsForLtsRequest::getXLanguage,
                ListSlowLogStatisticsForLtsRequest::setXLanguage));
        builder.<SlowLogStatisticsForLtsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlowLogStatisticsForLtsRequest.class),
            f -> f.withMarshaller(ListSlowLogStatisticsForLtsRequest::getBody,
                ListSlowLogStatisticsForLtsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogs = genForListSlowLogs();

    private static HttpRequestDef<ListSlowLogsRequest, ListSlowLogsResponse> genForListSlowLogs() {
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
            f -> f.withMarshaller(ListSlowLogsRequest::getInstanceId, ListSlowLogsRequest::setInstanceId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getStartDate, ListSlowLogsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getEndDate, ListSlowLogsRequest::setEndDate));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getOffset, ListSlowLogsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getLimit, ListSlowLogsRequest::setLimit));
        builder.<ListSlowLogsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getType, ListSlowLogsRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsRequest::getXLanguage, ListSlowLogsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNew =
        genForListSlowLogsNew();

    private static HttpRequestDef<ListSlowLogsNewRequest, ListSlowLogsNewResponse> genForListSlowLogsNew() {
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
            f -> f.withMarshaller(ListSlowLogsNewRequest::getInstanceId, ListSlowLogsNewRequest::setInstanceId));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getStartDate, ListSlowLogsNewRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getEndDate, ListSlowLogsNewRequest::setEndDate));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getOffset, ListSlowLogsNewRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getLimit, ListSlowLogsNewRequest::setLimit));
        builder.<ListSlowLogsNewRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowLogsNewRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getType, ListSlowLogsNewRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowLogsNewRequest::getXLanguage, ListSlowLogsNewRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> listSlowlogForLts =
        genForListSlowlogForLts();

    private static HttpRequestDef<ListSlowlogForLtsRequest, ListSlowlogForLtsResponse> genForListSlowlogForLts() {
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
            f -> f.withMarshaller(ListSlowlogForLtsRequest::getInstanceId, ListSlowlogForLtsRequest::setInstanceId));
        builder.<ListSlowlogForLtsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogForLtsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSlowlogForLtsRequest::getXLanguage, ListSlowlogForLtsRequest::setXLanguage));
        builder.<SlowlogForLtsRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SlowlogForLtsRequest.class),
            f -> f.withMarshaller(ListSlowlogForLtsRequest::getBody, ListSlowlogForLtsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatistics =
        genForListSlowlogStatistics();

    private static HttpRequestDef<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> genForListSlowlogStatistics() {
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
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getInstanceId,
                ListSlowlogStatisticsRequest::setInstanceId));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getCurPage, ListSlowlogStatisticsRequest::setCurPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getPerPage, ListSlowlogStatisticsRequest::setPerPage));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getStartDate,
                ListSlowlogStatisticsRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getEndDate, ListSlowlogStatisticsRequest::setEndDate));
        builder.<ListSlowlogStatisticsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSlowlogStatisticsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getType, ListSlowlogStatisticsRequest::setType));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getSort, ListSlowlogStatisticsRequest::setSort));
        builder.<ListSlowlogStatisticsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSlowlogStatisticsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSlowlogStatisticsRequest::getXLanguage,
                ListSlowlogStatisticsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlLimitRequest, ListSqlLimitResponse> listSqlLimit = genForListSqlLimit();

    private static HttpRequestDef<ListSqlLimitRequest, ListSqlLimitResponse> genForListSqlLimit() {
        // basic
        HttpRequestDef.Builder<ListSqlLimitRequest, ListSqlLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlLimitRequest.class, ListSqlLimitResponse.class)
                .withName("ListSqlLimit")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlLimitRequest::getInstanceId, ListSqlLimitRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlLimitRequest::getDbName, ListSqlLimitRequest::setDbName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlLimitRequest::getOffset, ListSqlLimitRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlLimitRequest::getLimit, ListSqlLimitRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> listSslCertDownloadLink =
        genForListSslCertDownloadLink();

    private static HttpRequestDef<ListSslCertDownloadLinkRequest, ListSslCertDownloadLinkResponse> genForListSslCertDownloadLink() {
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
            f -> f.withMarshaller(ListSslCertDownloadLinkRequest::getInstanceId,
                ListSslCertDownloadLinkRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSslCertDownloadLinkRequest::getXLanguage,
                ListSslCertDownloadLinkRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypes =
        genForListStorageTypes();

    private static HttpRequestDef<ListStorageTypesRequest, ListStorageTypesResponse> genForListStorageTypes() {
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
            f -> f.withMarshaller(ListStorageTypesRequest::getDatabaseName, ListStorageTypesRequest::setDatabaseName));
        builder.<String>withRequestField("version_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getVersionName, ListStorageTypesRequest::setVersionName));
        builder.<ListStorageTypesRequest.HaModeEnum>withRequestField("ha_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListStorageTypesRequest.HaModeEnum.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getHaMode, ListStorageTypesRequest::setHaMode));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStorageTypesRequest::getXLanguage, ListStorageTypesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> listUpgradeHistories =
        genForListUpgradeHistories();

    private static HttpRequestDef<ListUpgradeHistoriesRequest, ListUpgradeHistoriesResponse> genForListUpgradeHistories() {
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
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getInstanceId,
                ListUpgradeHistoriesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getOffset, ListUpgradeHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getLimit, ListUpgradeHistoriesRequest::setLimit));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getOrder, ListUpgradeHistoriesRequest::setOrder));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getSortField,
                ListUpgradeHistoriesRequest::setSortField));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpgradeHistoriesRequest::getXLanguage,
                ListUpgradeHistoriesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListXellogFilesRequest, ListXellogFilesResponse> listXellogFiles =
        genForListXellogFiles();

    private static HttpRequestDef<ListXellogFilesRequest, ListXellogFilesResponse> genForListXellogFiles() {
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
            f -> f.withMarshaller(ListXellogFilesRequest::getInstanceId, ListXellogFilesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getOffset, ListXellogFilesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getLimit, ListXellogFilesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListXellogFilesRequest::getXLanguage, ListXellogFilesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollower =
        genForMigrateFollower();

    private static HttpRequestDef<MigrateFollowerRequest, MigrateFollowerResponse> genForMigrateFollower() {
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
            f -> f.withMarshaller(MigrateFollowerRequest::getInstanceId, MigrateFollowerRequest::setInstanceId));
        builder.<MigrateFollowerRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MigrateFollowerRequest.XLanguageEnum.class),
            f -> f.withMarshaller(MigrateFollowerRequest::getXLanguage, MigrateFollowerRequest::setXLanguage));
        builder.<FollowerMigrateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FollowerMigrateRequest.class),
            f -> f.withMarshaller(MigrateFollowerRequest::getBody, MigrateFollowerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> modifyPostgresqlHbaConf =
        genForModifyPostgresqlHbaConf();

    private static HttpRequestDef<ModifyPostgresqlHbaConfRequest, ModifyPostgresqlHbaConfResponse> genForModifyPostgresqlHbaConf() {
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
            f -> f.withMarshaller(ModifyPostgresqlHbaConfRequest::getInstanceId,
                ModifyPostgresqlHbaConfRequest::setInstanceId));
        builder.<List<PostgresqlHbaConf>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ModifyPostgresqlHbaConfRequest::getBody, ModifyPostgresqlHbaConfRequest::setBody)
                .withInnerContainerType(PostgresqlHbaConf.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyRdSforMySqlProxyRouteModeRequest, ModifyRdSforMySqlProxyRouteModeResponse> modifyRdSforMySqlProxyRouteMode =
        genForModifyRdSforMySqlProxyRouteMode();

    private static HttpRequestDef<ModifyRdSforMySqlProxyRouteModeRequest, ModifyRdSforMySqlProxyRouteModeResponse> genForModifyRdSforMySqlProxyRouteMode() {
        // basic
        HttpRequestDef.Builder<ModifyRdSforMySqlProxyRouteModeRequest, ModifyRdSforMySqlProxyRouteModeResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ModifyRdSforMySqlProxyRouteModeRequest.class,
                    ModifyRdSforMySqlProxyRouteModeResponse.class)
                .withName("ModifyRdSforMySqlProxyRouteMode")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/route-mode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyRdSforMySqlProxyRouteModeRequest::getInstanceId,
                ModifyRdSforMySqlProxyRouteModeRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyRdSforMySqlProxyRouteModeRequest::getProxyId,
                ModifyRdSforMySqlProxyRouteModeRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyRdSforMySqlProxyRouteModeRequest::getXLanguage,
                ModifyRdSforMySqlProxyRouteModeRequest::setXLanguage));
        builder.<ModifyMySqlProxyRouteModeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyMySqlProxyRouteModeRequest.class),
            f -> f.withMarshaller(ModifyRdSforMySqlProxyRouteModeRequest::getBody,
                ModifyRdSforMySqlProxyRouteModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstance =
        genForRestoreExistInstance();

    private static HttpRequestDef<RestoreExistInstanceRequest, RestoreExistInstanceResponse> genForRestoreExistInstance() {
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
            f -> f.withMarshaller(RestoreExistInstanceRequest::getXLanguage,
                RestoreExistInstanceRequest::setXLanguage));
        builder.<RestoreExistingInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreExistingInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreExistInstanceRequest::getBody, RestoreExistInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreTablesRequest, RestoreTablesResponse> restoreTables =
        genForRestoreTables();

    private static HttpRequestDef<RestoreTablesRequest, RestoreTablesResponse> genForRestoreTables() {
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
            f -> f.withMarshaller(RestoreTablesRequest::getInstanceId, RestoreTablesRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTablesRequest::getXLanguage, RestoreTablesRequest::setXLanguage));
        builder.<RestoreTablesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreTablesRequestBody.class),
            f -> f.withMarshaller(RestoreTablesRequest::getBody, RestoreTablesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreTablesNewRequest, RestoreTablesNewResponse> restoreTablesNew =
        genForRestoreTablesNew();

    private static HttpRequestDef<RestoreTablesNewRequest, RestoreTablesNewResponse> genForRestoreTablesNew() {
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
            f -> f.withMarshaller(RestoreTablesNewRequest::getInstanceId, RestoreTablesNewRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestoreTablesNewRequest::getXLanguage, RestoreTablesNewRequest::setXLanguage));
        builder.<RestoreTablesNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreTablesNewRequestBody.class),
            f -> f.withMarshaller(RestoreTablesNewRequest::getBody, RestoreTablesNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstance =
        genForRestoreToExistingInstance();

    private static HttpRequestDef<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> genForRestoreToExistingInstance() {
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
            f -> f.withMarshaller(RestoreToExistingInstanceRequest::getXLanguage,
                RestoreToExistingInstanceRequest::setXLanguage));
        builder.<RestoreToExistingInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestoreToExistingInstanceRequestBody.class),
            f -> f.withMarshaller(RestoreToExistingInstanceRequest::getBody,
                RestoreToExistingInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicy =
        genForSetAuditlogPolicy();

    private static HttpRequestDef<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> genForSetAuditlogPolicy() {
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
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getInstanceId, SetAuditlogPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getXLanguage, SetAuditlogPolicyRequest::setXLanguage));
        builder.<SetAuditlogPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetAuditlogPolicyRequestBody.class),
            f -> f.withMarshaller(SetAuditlogPolicyRequest::getBody, SetAuditlogPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicy =
        genForSetAutoEnlargePolicy();

    private static HttpRequestDef<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> genForSetAutoEnlargePolicy() {
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
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getInstanceId,
                SetAutoEnlargePolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getXLanguage,
                SetAutoEnlargePolicyRequest::setXLanguage));
        builder.<CustomerModifyAutoEnlargePolicyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CustomerModifyAutoEnlargePolicyReq.class),
            f -> f.withMarshaller(SetAutoEnlargePolicyRequest::getBody, SetAutoEnlargePolicyRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetAutoEnlargePolicyResponse::getBody, SetAutoEnlargePolicyResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicy =
        genForSetBackupPolicy();

    private static HttpRequestDef<SetBackupPolicyRequest, SetBackupPolicyResponse> genForSetBackupPolicy() {
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
            f -> f.withMarshaller(SetBackupPolicyRequest::getInstanceId, SetBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getXLanguage, SetBackupPolicyRequest::setXLanguage));
        builder.<SetBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetBackupPolicyRequest::getBody, SetBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicy =
        genForSetBinlogClearPolicy();

    private static HttpRequestDef<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> genForSetBinlogClearPolicy() {
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
            f -> f.withMarshaller(SetBinlogClearPolicyRequest::getInstanceId,
                SetBinlogClearPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetBinlogClearPolicyRequest::getXLanguage,
                SetBinlogClearPolicyRequest::setXLanguage));
        builder.<BinlogClearPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BinlogClearPolicyRequestBody.class),
            f -> f.withMarshaller(SetBinlogClearPolicyRequest::getBody, SetBinlogClearPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetInstancesProxyRestartRequest, SetInstancesProxyRestartResponse> setInstancesProxyRestart =
        genForSetInstancesProxyRestart();

    private static HttpRequestDef<SetInstancesProxyRestartRequest, SetInstancesProxyRestartResponse> genForSetInstancesProxyRestart() {
        // basic
        HttpRequestDef.Builder<SetInstancesProxyRestartRequest, SetInstancesProxyRestartResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, SetInstancesProxyRestartRequest.class, SetInstancesProxyRestartResponse.class)
                .withName("SetInstancesProxyRestart")
                .withUri("/v3/{project_id}/instances/{instance_id}/proxy/{proxy_id}/restart")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInstancesProxyRestartRequest::getInstanceId,
                SetInstancesProxyRestartRequest::setInstanceId));
        builder.<String>withRequestField("proxy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInstancesProxyRestartRequest::getProxyId,
                SetInstancesProxyRestartRequest::setProxyId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInstancesProxyRestartRequest::getXLanguage,
                SetInstancesProxyRestartRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetLogLtsConfigsRequest, SetLogLtsConfigsResponse> setLogLtsConfigs =
        genForSetLogLtsConfigs();

    private static HttpRequestDef<SetLogLtsConfigsRequest, SetLogLtsConfigsResponse> genForSetLogLtsConfigs() {
        // basic
        HttpRequestDef.Builder<SetLogLtsConfigsRequest, SetLogLtsConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetLogLtsConfigsRequest.class, SetLogLtsConfigsResponse.class)
                .withName("SetLogLtsConfigs")
                .withUri("/v3/{project_id}/{engine}/instances/logs/lts-configs")
                .withContentType("application/json");

        // requests
        builder.<SetLogLtsConfigsRequest.EngineEnum>withRequestField("engine",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetLogLtsConfigsRequest.EngineEnum.class),
            f -> f.withMarshaller(SetLogLtsConfigsRequest::getEngine, SetLogLtsConfigsRequest::setEngine));
        builder.<SetLogLtsConfigsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetLogLtsConfigsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetLogLtsConfigsRequest::getXLanguage, SetLogLtsConfigsRequest::setXLanguage));
        builder.<AddLogConfigResponseBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddLogConfigResponseBody.class),
            f -> f.withMarshaller(SetLogLtsConfigsRequest::getBody, SetLogLtsConfigsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicy =
        genForSetOffSiteBackupPolicy();

    private static HttpRequestDef<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> genForSetOffSiteBackupPolicy() {
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
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getInstanceId,
                SetOffSiteBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getXLanguage,
                SetOffSiteBackupPolicyRequest::setXLanguage));
        builder.<SetOffSiteBackupPolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetOffSiteBackupPolicyRequestBody.class),
            f -> f.withMarshaller(SetOffSiteBackupPolicyRequest::getBody, SetOffSiteBackupPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> setSecondLevelMonitor =
        genForSetSecondLevelMonitor();

    private static HttpRequestDef<SetSecondLevelMonitorRequest, SetSecondLevelMonitorResponse> genForSetSecondLevelMonitor() {
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
            f -> f.withMarshaller(SetSecondLevelMonitorRequest::getInstanceId,
                SetSecondLevelMonitorRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSecondLevelMonitorRequest::getXLanguage,
                SetSecondLevelMonitorRequest::setXLanguage));
        builder.<SecondMonitor>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecondMonitor.class),
            f -> f.withMarshaller(SetSecondLevelMonitorRequest::getBody, SetSecondLevelMonitorRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(SetSecondLevelMonitorResponse::getBody, SetSecondLevelMonitorResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroup =
        genForSetSecurityGroup();

    private static HttpRequestDef<SetSecurityGroupRequest, SetSecurityGroupResponse> genForSetSecurityGroup() {
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
            f -> f.withMarshaller(SetSecurityGroupRequest::getInstanceId, SetSecurityGroupRequest::setInstanceId));
        builder.<SetSecurityGroupRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetSecurityGroupRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetSecurityGroupRequest::getXLanguage, SetSecurityGroupRequest::setXLanguage));
        builder.<SecurityGroupRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SecurityGroupRequest.class),
            f -> f.withMarshaller(SetSecurityGroupRequest::getBody, SetSecurityGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> setSensitiveSlowLog =
        genForSetSensitiveSlowLog();

    private static HttpRequestDef<SetSensitiveSlowLogRequest, SetSensitiveSlowLogResponse> genForSetSensitiveSlowLog() {
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
            f -> f.withMarshaller(SetSensitiveSlowLogRequest::getInstanceId,
                SetSensitiveSlowLogRequest::setInstanceId));
        builder.<String>withRequestField("status",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveSlowLogRequest::getStatus, SetSensitiveSlowLogRequest::setStatus));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetSensitiveSlowLogRequest::getXLanguage, SetSensitiveSlowLogRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLink =
        genForShowAuditlogDownloadLink();

    private static HttpRequestDef<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> genForShowAuditlogDownloadLink() {
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
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getInstanceId,
                ShowAuditlogDownloadLinkRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getXLanguage,
                ShowAuditlogDownloadLinkRequest::setXLanguage));
        builder.<GenerateAuditlogDownloadLinkRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GenerateAuditlogDownloadLinkRequest.class),
            f -> f.withMarshaller(ShowAuditlogDownloadLinkRequest::getBody, ShowAuditlogDownloadLinkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicy =
        genForShowAuditlogPolicy();

    private static HttpRequestDef<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> genForShowAuditlogPolicy() {
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
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getInstanceId, ShowAuditlogPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuditlogPolicyRequest::getXLanguage, ShowAuditlogPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicy =
        genForShowAutoEnlargePolicy();

    private static HttpRequestDef<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> genForShowAutoEnlargePolicy() {
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
            f -> f.withMarshaller(ShowAutoEnlargePolicyRequest::getInstanceId,
                ShowAutoEnlargePolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAutoEnlargePolicyRequest::getXLanguage,
                ShowAutoEnlargePolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableVersionRequest, ShowAvailableVersionResponse> showAvailableVersion =
        genForShowAvailableVersion();

    private static HttpRequestDef<ShowAvailableVersionRequest, ShowAvailableVersionResponse> genForShowAvailableVersion() {
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
            f -> f.withMarshaller(ShowAvailableVersionRequest::getInstanceId,
                ShowAvailableVersionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAvailableVersionRequest::getXLanguage,
                ShowAvailableVersionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLink =
        genForShowBackupDownloadLink();

    private static HttpRequestDef<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> genForShowBackupDownloadLink() {
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
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getBackupId,
                ShowBackupDownloadLinkRequest::setBackupId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupDownloadLinkRequest::getXLanguage,
                ShowBackupDownloadLinkRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicy =
        genForShowBackupPolicy();

    private static HttpRequestDef<ShowBackupPolicyRequest, ShowBackupPolicyResponse> genForShowBackupPolicy() {
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
            f -> f.withMarshaller(ShowBackupPolicyRequest::getInstanceId, ShowBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBackupPolicyRequest::getXLanguage, ShowBackupPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicy =
        genForShowBinlogClearPolicy();

    private static HttpRequestDef<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> genForShowBinlogClearPolicy() {
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
            f -> f.withMarshaller(ShowBinlogClearPolicyRequest::getInstanceId,
                ShowBinlogClearPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBinlogClearPolicyRequest::getXLanguage,
                ShowBinlogClearPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> showConfiguration =
        genForShowConfiguration();

    private static HttpRequestDef<ShowConfigurationRequest, ShowConfigurationResponse> genForShowConfiguration() {
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
            f -> f.withMarshaller(ShowConfigurationRequest::getConfigId, ShowConfigurationRequest::setConfigId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigurationRequest::getXLanguage, ShowConfigurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDnsNameRequest, ShowDnsNameResponse> showDnsName = genForShowDnsName();

    private static HttpRequestDef<ShowDnsNameRequest, ShowDnsNameResponse> genForShowDnsName() {
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
            f -> f.withMarshaller(ShowDnsNameRequest::getInstanceId, ShowDnsNameRequest::setInstanceId));
        builder.<String>withRequestField("dns_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDnsNameRequest::getDnsType, ShowDnsNameRequest::setDnsType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDnsNameRequest::getXLanguage, ShowDnsNameRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainNameRequest, ShowDomainNameResponse> showDomainName =
        genForShowDomainName();

    private static HttpRequestDef<ShowDomainNameRequest, ShowDomainNameResponse> genForShowDomainName() {
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
            f -> f.withMarshaller(ShowDomainNameRequest::getInstanceId, ShowDomainNameRequest::setInstanceId));
        builder.<String>withRequestField("dns_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainNameRequest::getDnsType, ShowDomainNameRequest::setDnsType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainNameRequest::getXLanguage, ShowDomainNameRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatus =
        genForShowDrReplicaStatus();

    private static HttpRequestDef<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> genForShowDrReplicaStatus() {
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
            f -> f.withMarshaller(ShowDrReplicaStatusRequest::getInstanceId,
                ShowDrReplicaStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDrReplicaStatusRequest::getXLanguage, ShowDrReplicaStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIncreBackupPolicy1Request, ShowIncreBackupPolicy1Response> showIncreBackupPolicy1 =
        genForShowIncreBackupPolicy1();

    private static HttpRequestDef<ShowIncreBackupPolicy1Request, ShowIncreBackupPolicy1Response> genForShowIncreBackupPolicy1() {
        // basic
        HttpRequestDef.Builder<ShowIncreBackupPolicy1Request, ShowIncreBackupPolicy1Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIncreBackupPolicy1Request.class, ShowIncreBackupPolicy1Response.class)
            .withName("ShowIncreBackupPolicy1")
            .withUri("/v3/{project_id}/instances/{instance_id}/incre-backup/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncreBackupPolicy1Request::getInstanceId,
                ShowIncreBackupPolicy1Request::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfiguration =
        genForShowInstanceConfiguration();

    private static HttpRequestDef<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> genForShowInstanceConfiguration() {
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
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getInstanceId,
                ShowInstanceConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceConfigurationRequest::getXLanguage,
                ShowInstanceConfigurationRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicy =
        genForShowOffSiteBackupPolicy();

    private static HttpRequestDef<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> genForShowOffSiteBackupPolicy() {
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
            f -> f.withMarshaller(ShowOffSiteBackupPolicyRequest::getInstanceId,
                ShowOffSiteBackupPolicyRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOffSiteBackupPolicyRequest::getXLanguage,
                ShowOffSiteBackupPolicyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
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
            f -> f.withMarshaller(ShowQuotasRequest::getXLanguage, ShowQuotasRequest::setXLanguage));

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

    public static final HttpRequestDef<ShowReplicationStatusRequest, ShowReplicationStatusResponse> showReplicationStatus =
        genForShowReplicationStatus();

    private static HttpRequestDef<ShowReplicationStatusRequest, ShowReplicationStatusResponse> genForShowReplicationStatus() {
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
            f -> f.withMarshaller(ShowReplicationStatusRequest::getInstanceId,
                ShowReplicationStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplicationStatusRequest::getXLanguage,
                ShowReplicationStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> showSecondLevelMonitoring =
        genForShowSecondLevelMonitoring();

    private static HttpRequestDef<ShowSecondLevelMonitoringRequest, ShowSecondLevelMonitoringResponse> genForShowSecondLevelMonitoring() {
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
            f -> f.withMarshaller(ShowSecondLevelMonitoringRequest::getInstanceId,
                ShowSecondLevelMonitoringRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSecondLevelMonitoringRequest::getXLanguage,
                ShowSecondLevelMonitoringRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowStorageUsedSpaceRequest, ShowStorageUsedSpaceResponse> showStorageUsedSpace =
        genForShowStorageUsedSpace();

    private static HttpRequestDef<ShowStorageUsedSpaceRequest, ShowStorageUsedSpaceResponse> genForShowStorageUsedSpace() {
        // basic
        HttpRequestDef.Builder<ShowStorageUsedSpaceRequest, ShowStorageUsedSpaceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowStorageUsedSpaceRequest.class, ShowStorageUsedSpaceResponse.class)
            .withName("ShowStorageUsedSpace")
            .withUri("/v3/{project_id}/instances/{instance_id}/storage-used-space")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStorageUsedSpaceRequest::getInstanceId,
                ShowStorageUsedSpaceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTdeStatusRequest, ShowTdeStatusResponse> showTdeStatus =
        genForShowTdeStatus();

    private static HttpRequestDef<ShowTdeStatusRequest, ShowTdeStatusResponse> genForShowTdeStatus() {
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
            f -> f.withMarshaller(ShowTdeStatusRequest::getInstanceId, ShowTdeStatusRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> showUpgradeDbMajorVersionStatus =
        genForShowUpgradeDbMajorVersionStatus();

    private static HttpRequestDef<ShowUpgradeDbMajorVersionStatusRequest, ShowUpgradeDbMajorVersionStatusResponse> genForShowUpgradeDbMajorVersionStatus() {
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
            f -> f.withMarshaller(ShowUpgradeDbMajorVersionStatusRequest::getInstanceId,
                ShowUpgradeDbMajorVersionStatusRequest::setInstanceId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDbMajorVersionStatusRequest::getAction,
                ShowUpgradeDbMajorVersionStatusRequest::setAction));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpgradeDbMajorVersionStatusRequest::getXLanguage,
                ShowUpgradeDbMajorVersionStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartFailoverRequest, StartFailoverResponse> startFailover =
        genForStartFailover();

    private static HttpRequestDef<StartFailoverRequest, StartFailoverResponse> genForStartFailover() {
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
            f -> f.withMarshaller(StartFailoverRequest::getInstanceId, StartFailoverRequest::setInstanceId));
        builder.<StartFailoverRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartFailoverRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartFailoverRequest::getXLanguage, StartFailoverRequest::setXLanguage));
        builder.<FailoverRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FailoverRequest.class),
            f -> f.withMarshaller(StartFailoverRequest::getBody, StartFailoverRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeAction =
        genForStartInstanceEnlargeVolumeAction();

    private static HttpRequestDef<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> genForStartInstanceEnlargeVolumeAction() {
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
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getInstanceId,
                StartInstanceEnlargeVolumeActionRequest::setInstanceId));
        builder.<StartInstanceEnlargeVolumeActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceEnlargeVolumeActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getXLanguage,
                StartInstanceEnlargeVolumeActionRequest::setXLanguage));
        builder.<EnlargeVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnlargeVolumeRequestBody.class),
            f -> f.withMarshaller(StartInstanceEnlargeVolumeActionRequest::getBody,
                StartInstanceEnlargeVolumeActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceReduceVolumeActionRequest, StartInstanceReduceVolumeActionResponse> startInstanceReduceVolumeAction =
        genForStartInstanceReduceVolumeAction();

    private static HttpRequestDef<StartInstanceReduceVolumeActionRequest, StartInstanceReduceVolumeActionResponse> genForStartInstanceReduceVolumeAction() {
        // basic
        HttpRequestDef.Builder<StartInstanceReduceVolumeActionRequest, StartInstanceReduceVolumeActionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    StartInstanceReduceVolumeActionRequest.class,
                    StartInstanceReduceVolumeActionResponse.class)
                .withName("StartInstanceReduceVolumeAction")
                .withUri("/v3/{project_id}/instances/{instance_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceReduceVolumeActionRequest::getInstanceId,
                StartInstanceReduceVolumeActionRequest::setInstanceId));
        builder.<StartInstanceReduceVolumeActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceReduceVolumeActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceReduceVolumeActionRequest::getXLanguage,
                StartInstanceReduceVolumeActionRequest::setXLanguage));
        builder.<ReduceVolumeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReduceVolumeRequestBody.class),
            f -> f.withMarshaller(StartInstanceReduceVolumeActionRequest::getBody,
                StartInstanceReduceVolumeActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartAction =
        genForStartInstanceRestartAction();

    private static HttpRequestDef<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> genForStartInstanceRestartAction() {
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
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getInstanceId,
                StartInstanceRestartActionRequest::setInstanceId));
        builder.<StartInstanceRestartActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceRestartActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getXLanguage,
                StartInstanceRestartActionRequest::setXLanguage));
        builder.<InstanceRestartRequsetBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceRestartRequsetBody.class),
            f -> f.withMarshaller(StartInstanceRestartActionRequest::getBody,
                StartInstanceRestartActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaAction =
        genForStartInstanceSingleToHaAction();

    private static HttpRequestDef<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> genForStartInstanceSingleToHaAction() {
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
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getInstanceId,
                StartInstanceSingleToHaActionRequest::setInstanceId));
        builder.<StartInstanceSingleToHaActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceSingleToHaActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getXLanguage,
                StartInstanceSingleToHaActionRequest::setXLanguage));
        builder.<Single2Ha>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Single2Ha.class),
            f -> f.withMarshaller(StartInstanceSingleToHaActionRequest::getBody,
                StartInstanceSingleToHaActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicy =
        genForStartRecyclePolicy();

    private static HttpRequestDef<StartRecyclePolicyRequest, StartRecyclePolicyResponse> genForStartRecyclePolicy() {
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
            f -> f.withMarshaller(StartRecyclePolicyRequest::getXLanguage, StartRecyclePolicyRequest::setXLanguage));
        builder.<RecyclePolicyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RecyclePolicyRequestBody.class),
            f -> f.withMarshaller(StartRecyclePolicyRequest::getBody, StartRecyclePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorAction =
        genForStartResizeFlavorAction();

    private static HttpRequestDef<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> genForStartResizeFlavorAction() {
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
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getInstanceId,
                StartResizeFlavorActionRequest::setInstanceId));
        builder.<StartResizeFlavorActionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartResizeFlavorActionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getXLanguage,
                StartResizeFlavorActionRequest::setXLanguage));
        builder.<ResizeFlavorRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResizeFlavorRequest.class),
            f -> f.withMarshaller(StartResizeFlavorActionRequest::getBody, StartResizeFlavorActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartupInstanceRequest, StartupInstanceResponse> startupInstance =
        genForStartupInstance();

    private static HttpRequestDef<StartupInstanceRequest, StartupInstanceResponse> genForStartupInstance() {
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
            f -> f.withMarshaller(StartupInstanceRequest::getInstanceId, StartupInstanceRequest::setInstanceId));
        builder.<StartupInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartupInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartupInstanceRequest::getXLanguage, StartupInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBackupRequest, StopBackupResponse> stopBackup = genForStopBackup();

    private static HttpRequestDef<StopBackupRequest, StopBackupResponse> genForStopBackup() {
        // basic
        HttpRequestDef.Builder<StopBackupRequest, StopBackupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBackupRequest.class, StopBackupResponse.class)
                .withName("StopBackup")
                .withUri("/v3/{project_id}/instances/{instance_id}/backups/stop")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBackupRequest::getInstanceId, StopBackupRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBackupRequest::getXLanguage, StopBackupRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForStopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForStopInstance() {
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
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, StopInstanceRequest::setInstanceId));
        builder.<StopInstanceRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopInstanceRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopInstanceRequest::getXLanguage, StopInstanceRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSqlLimitRequest, SwitchSqlLimitResponse> switchSqlLimit =
        genForSwitchSqlLimit();

    private static HttpRequestDef<SwitchSqlLimitRequest, SwitchSqlLimitResponse> genForSwitchSqlLimit() {
        // basic
        HttpRequestDef.Builder<SwitchSqlLimitRequest, SwitchSqlLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchSqlLimitRequest.class, SwitchSqlLimitResponse.class)
                .withName("SwitchSqlLimit")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchSqlLimitRequest::getInstanceId, SwitchSqlLimitRequest::setInstanceId));
        builder.<SwitchSqlLimitControlReqV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchSqlLimitControlReqV3.class),
            f -> f.withMarshaller(SwitchSqlLimitRequest::getBody, SwitchSqlLimitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchSslRequest, SwitchSslResponse> switchSsl = genForSwitchSsl();

    private static HttpRequestDef<SwitchSslRequest, SwitchSslResponse> genForSwitchSsl() {
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
            f -> f.withMarshaller(SwitchSslRequest::getInstanceId, SwitchSslRequest::setInstanceId));
        builder.<SwitchSslRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SwitchSslRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SwitchSslRequest::getXLanguage, SwitchSslRequest::setXLanguage));
        builder.<SslOptionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SslOptionRequest.class),
            f -> f.withMarshaller(SwitchSslRequest::getBody, SwitchSslRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnlockNodeReadonlyStatusRequest, UnlockNodeReadonlyStatusResponse> unlockNodeReadonlyStatus =
        genForUnlockNodeReadonlyStatus();

    private static HttpRequestDef<UnlockNodeReadonlyStatusRequest, UnlockNodeReadonlyStatusResponse> genForUnlockNodeReadonlyStatus() {
        // basic
        HttpRequestDef.Builder<UnlockNodeReadonlyStatusRequest, UnlockNodeReadonlyStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UnlockNodeReadonlyStatusRequest.class, UnlockNodeReadonlyStatusResponse.class)
                .withName("UnlockNodeReadonlyStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/unlock-node-readonly-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnlockNodeReadonlyStatusRequest::getInstanceId,
                UnlockNodeReadonlyStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnlockNodeReadonlyStatusRequest::getXLanguage,
                UnlockNodeReadonlyStatusRequest::setXLanguage));
        builder.<UnlockNodeReadonlyStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnlockNodeReadonlyStatusRequestBody.class),
            f -> f.withMarshaller(UnlockNodeReadonlyStatusRequest::getBody, UnlockNodeReadonlyStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfiguration =
        genForUpdateConfiguration();

    private static HttpRequestDef<UpdateConfigurationRequest, UpdateConfigurationResponse> genForUpdateConfiguration() {
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
            f -> f.withMarshaller(UpdateConfigurationRequest::getConfigId, UpdateConfigurationRequest::setConfigId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getXLanguage, UpdateConfigurationRequest::setXLanguage));
        builder.<ConfigurationForUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ConfigurationForUpdate.class),
            f -> f.withMarshaller(UpdateConfigurationRequest::getBody, UpdateConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIp = genForUpdateDataIp();

    private static HttpRequestDef<UpdateDataIpRequest, UpdateDataIpResponse> genForUpdateDataIp() {
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
            f -> f.withMarshaller(UpdateDataIpRequest::getInstanceId, UpdateDataIpRequest::setInstanceId));
        builder.<UpdateDataIpRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDataIpRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDataIpRequest::getXLanguage, UpdateDataIpRequest::setXLanguage));
        builder.<DataIpRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DataIpRequest.class),
            f -> f.withMarshaller(UpdateDataIpRequest::getBody, UpdateDataIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsName =
        genForUpdateDnsName();

    private static HttpRequestDef<UpdateDnsNameRequest, UpdateDnsNameResponse> genForUpdateDnsName() {
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
            f -> f.withMarshaller(UpdateDnsNameRequest::getInstanceId, UpdateDnsNameRequest::setInstanceId));
        builder.<UpdateDnsNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDnsNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDnsNameRequest::getXLanguage, UpdateDnsNameRequest::setXLanguage));
        builder.<ModifyDnsNameRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyDnsNameRequestBody.class),
            f -> f.withMarshaller(UpdateDnsNameRequest::getBody, UpdateDnsNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateIncreBackupPolicy1Request, UpdateIncreBackupPolicy1Response> updateIncreBackupPolicy1 =
        genForUpdateIncreBackupPolicy1();

    private static HttpRequestDef<UpdateIncreBackupPolicy1Request, UpdateIncreBackupPolicy1Response> genForUpdateIncreBackupPolicy1() {
        // basic
        HttpRequestDef.Builder<UpdateIncreBackupPolicy1Request, UpdateIncreBackupPolicy1Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateIncreBackupPolicy1Request.class, UpdateIncreBackupPolicy1Response.class)
                .withName("UpdateIncreBackupPolicy1")
                .withUri("/v3/{project_id}/instances/{instance_id}/incre-backup/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIncreBackupPolicy1Request::getInstanceId,
                UpdateIncreBackupPolicy1Request::setInstanceId));
        builder.<UpdateIncreBackupPolicy1RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIncreBackupPolicy1RequestBody.class),
            f -> f.withMarshaller(UpdateIncreBackupPolicy1Request::getBody, UpdateIncreBackupPolicy1Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfiguration =
        genForUpdateInstanceConfiguration();

    private static HttpRequestDef<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> genForUpdateInstanceConfiguration() {
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
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getInstanceId,
                UpdateInstanceConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getXLanguage,
                UpdateInstanceConfigurationRequest::setXLanguage));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationRequest::getBody,
                UpdateInstanceConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsync =
        genForUpdateInstanceConfigurationAsync();

    private static HttpRequestDef<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> genForUpdateInstanceConfigurationAsync() {
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
            f -> f.withMarshaller(UpdateInstanceConfigurationAsyncRequest::getInstanceId,
                UpdateInstanceConfigurationAsyncRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationAsyncRequest::getXLanguage,
                UpdateInstanceConfigurationAsyncRequest::setXLanguage));
        builder.<UpdateInstanceConfigurationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigurationRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigurationAsyncRequest::getBody,
                UpdateInstanceConfigurationAsyncRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceName =
        genForUpdateInstanceName();

    private static HttpRequestDef<UpdateInstanceNameRequest, UpdateInstanceNameResponse> genForUpdateInstanceName() {
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
            f -> f.withMarshaller(UpdateInstanceNameRequest::getInstanceId, UpdateInstanceNameRequest::setInstanceId));
        builder.<UpdateInstanceNameRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateInstanceNameRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getXLanguage, UpdateInstanceNameRequest::setXLanguage));
        builder.<ModifiyInstanceNameRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifiyInstanceNameRequest.class),
            f -> f.withMarshaller(UpdateInstanceNameRequest::getBody, UpdateInstanceNameRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePortRequest, UpdatePortResponse> updatePort = genForUpdatePort();

    private static HttpRequestDef<UpdatePortRequest, UpdatePortResponse> genForUpdatePort() {
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
            f -> f.withMarshaller(UpdatePortRequest::getInstanceId, UpdatePortRequest::setInstanceId));
        builder.<UpdatePortRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePortRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdatePortRequest::getXLanguage, UpdatePortRequest::setXLanguage));
        builder.<UpdateDbPortRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbPortRequest.class),
            f -> f.withMarshaller(UpdatePortRequest::getBody, UpdatePortRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAlias =
        genForUpdatePostgresqlInstanceAlias();

    private static HttpRequestDef<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> genForUpdatePostgresqlInstanceAlias() {
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
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getInstanceId,
                UpdatePostgresqlInstanceAliasRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getXLanguage,
                UpdatePostgresqlInstanceAliasRequest::setXLanguage));
        builder.<UpdateRdsInstanceAliasRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRdsInstanceAliasRequest.class),
            f -> f.withMarshaller(UpdatePostgresqlInstanceAliasRequest::getBody,
                UpdatePostgresqlInstanceAliasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlLimitRequest, UpdateSqlLimitResponse> updateSqlLimit =
        genForUpdateSqlLimit();

    private static HttpRequestDef<UpdateSqlLimitRequest, UpdateSqlLimitResponse> genForUpdateSqlLimit() {
        // basic
        HttpRequestDef.Builder<UpdateSqlLimitRequest, UpdateSqlLimitResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSqlLimitRequest.class, UpdateSqlLimitResponse.class)
                .withName("UpdateSqlLimit")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlLimitRequest::getInstanceId, UpdateSqlLimitRequest::setInstanceId));
        builder.<UpdateSqlLimitRuleReqV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlLimitRuleReqV3.class),
            f -> f.withMarshaller(UpdateSqlLimitRequest::getBody, UpdateSqlLimitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTdeStatusRequest, UpdateTdeStatusResponse> updateTdeStatus =
        genForUpdateTdeStatus();

    private static HttpRequestDef<UpdateTdeStatusRequest, UpdateTdeStatusResponse> genForUpdateTdeStatus() {
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
            f -> f.withMarshaller(UpdateTdeStatusRequest::getInstanceId, UpdateTdeStatusRequest::setInstanceId));
        builder.<UpdateTdeStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTdeStatusRequestBody.class),
            f -> f.withMarshaller(UpdateTdeStatusRequest::getBody, UpdateTdeStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateToPeriodRequest, UpdateToPeriodResponse> updateToPeriod =
        genForUpdateToPeriod();

    private static HttpRequestDef<UpdateToPeriodRequest, UpdateToPeriodResponse> genForUpdateToPeriod() {
        // basic
        HttpRequestDef.Builder<UpdateToPeriodRequest, UpdateToPeriodResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateToPeriodRequest.class, UpdateToPeriodResponse.class)
                .withName("UpdateToPeriod")
                .withUri("/v3/{project_id}/instances/{instance_id}/to-period")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateToPeriodRequest::getInstanceId, UpdateToPeriodRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateToPeriodRequest::getXLanguage, UpdateToPeriodRequest::setXLanguage));
        builder.<ToPeriodReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ToPeriodReq.class),
            f -> f.withMarshaller(UpdateToPeriodRequest::getBody, UpdateToPeriodRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> upgradeDbMajorVersion =
        genForUpgradeDbMajorVersion();

    private static HttpRequestDef<UpgradeDbMajorVersionRequest, UpgradeDbMajorVersionResponse> genForUpgradeDbMajorVersion() {
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
            f -> f.withMarshaller(UpgradeDbMajorVersionRequest::getInstanceId,
                UpgradeDbMajorVersionRequest::setInstanceId));
        builder.<UpgradePgMajorVersion>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpgradePgMajorVersion.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionRequest::getBody, UpgradeDbMajorVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> upgradeDbMajorVersionPreCheck =
        genForUpgradeDbMajorVersionPreCheck();

    private static HttpRequestDef<UpgradeDbMajorVersionPreCheckRequest, UpgradeDbMajorVersionPreCheckResponse> genForUpgradeDbMajorVersionPreCheck() {
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
            f -> f.withMarshaller(UpgradeDbMajorVersionPreCheckRequest::getInstanceId,
                UpgradeDbMajorVersionPreCheckRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionPreCheckRequest::getXLanguage,
                UpgradeDbMajorVersionPreCheckRequest::setXLanguage));
        builder.<PostgresqlPreCheckUpgradeMajorVersionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlPreCheckUpgradeMajorVersionReq.class),
            f -> f.withMarshaller(UpgradeDbMajorVersionPreCheckRequest::getBody,
                UpgradeDbMajorVersionPreCheckRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersion =
        genForUpgradeDbVersion();

    private static HttpRequestDef<UpgradeDbVersionRequest, UpgradeDbVersionResponse> genForUpgradeDbVersion() {
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
            f -> f.withMarshaller(UpgradeDbVersionRequest::getInstanceId, UpgradeDbVersionRequest::setInstanceId));
        builder.<UpgradeDbVersionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpgradeDbVersionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getXLanguage, UpgradeDbVersionRequest::setXLanguage));
        builder.<CustomerUpgradeDatabaseVersionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CustomerUpgradeDatabaseVersionReq.class),
            f -> f.withMarshaller(UpgradeDbVersionRequest::getBody, UpgradeDbVersionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> upgradeDbVersionNew =
        genForUpgradeDbVersionNew();

    private static HttpRequestDef<UpgradeDbVersionNewRequest, UpgradeDbVersionNewResponse> genForUpgradeDbVersionNew() {
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
            f -> f.withMarshaller(UpgradeDbVersionNewRequest::getInstanceId,
                UpgradeDbVersionNewRequest::setInstanceId));
        builder.<UpgradeDbVersionNewRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpgradeDbVersionNewRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpgradeDbVersionNewRequest::getXLanguage, UpgradeDbVersionNewRequest::setXLanguage));
        builder.<CustomerUpgradeDatabaseVersionReqNew>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CustomerUpgradeDatabaseVersionReqNew.class),
            f -> f.withMarshaller(UpgradeDbVersionNewRequest::getBody, UpgradeDbVersionNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> listApiVersion =
        genForListApiVersion();

    private static HttpRequestDef<ListApiVersionRequest, ListApiVersionResponse> genForListApiVersion() {
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
        genForListApiVersionNew();

    private static HttpRequestDef<ListApiVersionNewRequest, ListApiVersionNewResponse> genForListApiVersionNew() {
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
        genForShowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForShowApiVersion() {
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
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, ShowApiVersionRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilege =
        genForAllowDbUserPrivilege();

    private static HttpRequestDef<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> genForAllowDbUserPrivilege() {
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
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getInstanceId,
                AllowDbUserPrivilegeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getXLanguage,
                AllowDbUserPrivilegeRequest::setXLanguage));
        builder.<GrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GrantRequest.class),
            f -> f.withMarshaller(AllowDbUserPrivilegeRequest::getBody, AllowDbUserPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> createDatabase =
        genForCreateDatabase();

    private static HttpRequestDef<CreateDatabaseRequest, CreateDatabaseResponse> genForCreateDatabase() {
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
            f -> f.withMarshaller(CreateDatabaseRequest::getInstanceId, CreateDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getXLanguage, CreateDatabaseRequest::setXLanguage));
        builder.<DatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DatabaseForCreation.class),
            f -> f.withMarshaller(CreateDatabaseRequest::getBody, CreateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> createDbUser = genForCreateDbUser();

    private static HttpRequestDef<CreateDbUserRequest, CreateDbUserResponse> genForCreateDbUser() {
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
            f -> f.withMarshaller(CreateDbUserRequest::getInstanceId, CreateDbUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDbUserRequest::getXLanguage, CreateDbUserRequest::setXLanguage));
        builder.<UserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UserForCreation.class),
            f -> f.withMarshaller(CreateDbUserRequest::getBody, CreateDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabase =
        genForDeleteDatabase();

    private static HttpRequestDef<DeleteDatabaseRequest, DeleteDatabaseResponse> genForDeleteDatabase() {
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
            f -> f.withMarshaller(DeleteDatabaseRequest::getInstanceId, DeleteDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getDbName, DeleteDatabaseRequest::setDbName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDatabaseRequest::getXLanguage, DeleteDatabaseRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genForDeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genForDeleteDbUser() {
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
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, DeleteDbUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getUserName, DeleteDbUserRequest::setUserName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getXLanguage, DeleteDbUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabases =
        genForListAuthorizedDatabases();

    private static HttpRequestDef<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> genForListAuthorizedDatabases() {
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
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getInstanceId,
                ListAuthorizedDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("user-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getUserName,
                ListAuthorizedDatabasesRequest::setUserName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getPage, ListAuthorizedDatabasesRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getLimit, ListAuthorizedDatabasesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDatabasesRequest::getXLanguage,
                ListAuthorizedDatabasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsers =
        genForListAuthorizedDbUsers();

    private static HttpRequestDef<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> genForListAuthorizedDbUsers() {
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
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getInstanceId,
                ListAuthorizedDbUsersRequest::setInstanceId));
        builder.<String>withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getDbName, ListAuthorizedDbUsersRequest::setDbName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getPage, ListAuthorizedDbUsersRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getLimit, ListAuthorizedDbUsersRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedDbUsersRequest::getXLanguage,
                ListAuthorizedDbUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> listDatabases =
        genForListDatabases();

    private static HttpRequestDef<ListDatabasesRequest, ListDatabasesResponse> genForListDatabases() {
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
            f -> f.withMarshaller(ListDatabasesRequest::getInstanceId, ListDatabasesRequest::setInstanceId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getPage, ListDatabasesRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabasesRequest::getLimit, ListDatabasesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabasesRequest::getXLanguage, ListDatabasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForListDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForListDbUsers() {
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
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, ListDbUsersRequest::setInstanceId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getPage, ListDbUsersRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, ListDbUsersRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, ListDbUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResetPwdRequest, ResetPwdResponse> resetPwd = genForResetPwd();

    private static HttpRequestDef<ResetPwdRequest, ResetPwdResponse> genForResetPwd() {
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
            f -> f.withMarshaller(ResetPwdRequest::getInstanceId, ResetPwdRequest::setInstanceId));
        builder.<ResetPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ResetPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ResetPwdRequest::getXLanguage, ResetPwdRequest::setXLanguage));
        builder.<PwdResetRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PwdResetRequest.class),
            f -> f.withMarshaller(ResetPwdRequest::getBody, ResetPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeRequest, RevokeResponse> revoke = genForRevoke();

    private static HttpRequestDef<RevokeRequest, RevokeResponse> genForRevoke() {
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
            f -> f.withMarshaller(RevokeRequest::getInstanceId, RevokeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeRequest::getXLanguage, RevokeRequest::setXLanguage));
        builder.<RevokeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokeRequestBody.class),
            f -> f.withMarshaller(RevokeRequest::getBody, RevokeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwd = genForSetDbUserPwd();

    private static HttpRequestDef<SetDbUserPwdRequest, SetDbUserPwdResponse> genForSetDbUserPwd() {
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
            f -> f.withMarshaller(SetDbUserPwdRequest::getInstanceId, SetDbUserPwdRequest::setInstanceId));
        builder.<SetDbUserPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetDbUserPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getXLanguage, SetDbUserPwdRequest::setXLanguage));
        builder.<DbUserPwdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPwdRequest.class),
            f -> f.withMarshaller(SetDbUserPwdRequest::getBody, SetDbUserPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> setReadOnlySwitch =
        genForSetReadOnlySwitch();

    private static HttpRequestDef<SetReadOnlySwitchRequest, SetReadOnlySwitchResponse> genForSetReadOnlySwitch() {
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
            f -> f.withMarshaller(SetReadOnlySwitchRequest::getInstanceId, SetReadOnlySwitchRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetReadOnlySwitchRequest::getXLanguage, SetReadOnlySwitchRequest::setXLanguage));
        builder.<MysqlReadOnlySwitch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MysqlReadOnlySwitch.class),
            f -> f.withMarshaller(SetReadOnlySwitchRequest::getBody, SetReadOnlySwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabase =
        genForUpdateDatabase();

    private static HttpRequestDef<UpdateDatabaseRequest, UpdateDatabaseResponse> genForUpdateDatabase() {
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
            f -> f.withMarshaller(UpdateDatabaseRequest::getInstanceId, UpdateDatabaseRequest::setInstanceId));
        builder.<UpdateDatabaseRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDatabaseRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getXLanguage, UpdateDatabaseRequest::setXLanguage));
        builder.<UpdateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseReq.class),
            f -> f.withMarshaller(UpdateDatabaseRequest::getBody, UpdateDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> updateDbUserComment =
        genForUpdateDbUserComment();

    private static HttpRequestDef<UpdateDbUserCommentRequest, UpdateDbUserCommentResponse> genForUpdateDbUserComment() {
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
            f -> f.withMarshaller(UpdateDbUserCommentRequest::getInstanceId,
                UpdateDbUserCommentRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserCommentRequest::getUserName, UpdateDbUserCommentRequest::setUserName));
        builder.<UpdateDbUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbUserReq.class),
            f -> f.withMarshaller(UpdateDbUserCommentRequest::getBody, UpdateDbUserCommentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHostPrivilegeRequest, UpdateHostPrivilegeResponse> updateHostPrivilege =
        genForUpdateHostPrivilege();

    private static HttpRequestDef<UpdateHostPrivilegeRequest, UpdateHostPrivilegeResponse> genForUpdateHostPrivilege() {
        // basic
        HttpRequestDef.Builder<UpdateHostPrivilegeRequest, UpdateHostPrivilegeResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHostPrivilegeRequest.class, UpdateHostPrivilegeResponse.class)
                .withName("UpdateHostPrivilege")
                .withUri("/v3/{project_id}/instances/{instance_id}/host-privilege")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHostPrivilegeRequest::getInstanceId,
                UpdateHostPrivilegeRequest::setInstanceId));
        builder.<SetHostPrivilegeRequestV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetHostPrivilegeRequestV3.class),
            f -> f.withMarshaller(UpdateHostPrivilegeRequest::getBody, UpdateHostPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilege =
        genForAllowDbPrivilege();

    private static HttpRequestDef<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> genForAllowDbPrivilege() {
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
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getInstanceId, AllowDbPrivilegeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getXLanguage, AllowDbPrivilegeRequest::setXLanguage));
        builder.<PostgresqlGrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlGrantRequest.class),
            f -> f.withMarshaller(AllowDbPrivilegeRequest::getBody, AllowDbPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScale =
        genForChangeProxyScale();

    private static HttpRequestDef<ChangeProxyScaleRequest, ChangeProxyScaleResponse> genForChangeProxyScale() {
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
            f -> f.withMarshaller(ChangeProxyScaleRequest::getInstanceId, ChangeProxyScaleRequest::setInstanceId));
        builder.<ChangeProxyScaleRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeProxyScaleRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeProxyScaleRequest::getXLanguage, ChangeProxyScaleRequest::setXLanguage));
        builder.<ScaleProxyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScaleProxyRequestBody.class),
            f -> f.withMarshaller(ChangeProxyScaleRequest::getBody, ChangeProxyScaleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThreshold =
        genForChangeTheDelayThreshold();

    private static HttpRequestDef<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> genForChangeTheDelayThreshold() {
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
            f -> f.withMarshaller(ChangeTheDelayThresholdRequest::getInstanceId,
                ChangeTheDelayThresholdRequest::setInstanceId));
        builder.<ChangeTheDelayThresholdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeTheDelayThresholdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeTheDelayThresholdRequest::getXLanguage,
                ChangeTheDelayThresholdRequest::setXLanguage));
        builder.<ChangingTheDelayThresholdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangingTheDelayThresholdRequestBody.class),
            f -> f.withMarshaller(ChangeTheDelayThresholdRequest::getBody, ChangeTheDelayThresholdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabase =
        genForCreatePostgresqlDatabase();

    private static HttpRequestDef<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> genForCreatePostgresqlDatabase() {
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
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getInstanceId,
                CreatePostgresqlDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getXLanguage,
                CreatePostgresqlDatabaseRequest::setXLanguage));
        builder.<PostgresqlDatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlDatabaseForCreation.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseRequest::getBody, CreatePostgresqlDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchema =
        genForCreatePostgresqlDatabaseSchema();

    private static HttpRequestDef<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> genForCreatePostgresqlDatabaseSchema() {
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
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getInstanceId,
                CreatePostgresqlDatabaseSchemaRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getXLanguage,
                CreatePostgresqlDatabaseSchemaRequest::setXLanguage));
        builder.<PostgresqlDatabaseSchemaReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlDatabaseSchemaReq.class),
            f -> f.withMarshaller(CreatePostgresqlDatabaseSchemaRequest::getBody,
                CreatePostgresqlDatabaseSchemaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUser =
        genForCreatePostgresqlDbUser();

    private static HttpRequestDef<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> genForCreatePostgresqlDbUser() {
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
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getInstanceId,
                CreatePostgresqlDbUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getXLanguage,
                CreatePostgresqlDbUserRequest::setXLanguage));
        builder.<PostgresqlUserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostgresqlUserForCreation.class),
            f -> f.withMarshaller(CreatePostgresqlDbUserRequest::getBody, CreatePostgresqlDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> createPostgresqlExtension =
        genForCreatePostgresqlExtension();

    private static HttpRequestDef<CreatePostgresqlExtensionRequest, CreatePostgresqlExtensionResponse> genForCreatePostgresqlExtension() {
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
            f -> f.withMarshaller(CreatePostgresqlExtensionRequest::getInstanceId,
                CreatePostgresqlExtensionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePostgresqlExtensionRequest::getXLanguage,
                CreatePostgresqlExtensionRequest::setXLanguage));
        builder.<ExtensionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionRequest.class),
            f -> f.withMarshaller(CreatePostgresqlExtensionRequest::getBody,
                CreatePostgresqlExtensionRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePostgresqlExtensionResponse::getBody,
                CreatePostgresqlExtensionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> deletePostgresqlDatabase =
        genForDeletePostgresqlDatabase();

    private static HttpRequestDef<DeletePostgresqlDatabaseRequest, DeletePostgresqlDatabaseResponse> genForDeletePostgresqlDatabase() {
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
            f -> f.withMarshaller(DeletePostgresqlDatabaseRequest::getInstanceId,
                DeletePostgresqlDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDatabaseRequest::getDbName,
                DeletePostgresqlDatabaseRequest::setDbName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDatabaseRequest::getXLanguage,
                DeletePostgresqlDatabaseRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> deletePostgresqlDbUser =
        genForDeletePostgresqlDbUser();

    private static HttpRequestDef<DeletePostgresqlDbUserRequest, DeletePostgresqlDbUserResponse> genForDeletePostgresqlDbUser() {
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
            f -> f.withMarshaller(DeletePostgresqlDbUserRequest::getInstanceId,
                DeletePostgresqlDbUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDbUserRequest::getUserName,
                DeletePostgresqlDbUserRequest::setUserName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlDbUserRequest::getXLanguage,
                DeletePostgresqlDbUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> deletePostgresqlExtension =
        genForDeletePostgresqlExtension();

    private static HttpRequestDef<DeletePostgresqlExtensionRequest, DeletePostgresqlExtensionResponse> genForDeletePostgresqlExtension() {
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
            f -> f.withMarshaller(DeletePostgresqlExtensionRequest::getInstanceId,
                DeletePostgresqlExtensionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePostgresqlExtensionRequest::getXLanguage,
                DeletePostgresqlExtensionRequest::setXLanguage));
        builder.<ExtensionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionRequest.class),
            f -> f.withMarshaller(DeletePostgresqlExtensionRequest::getBody,
                DeletePostgresqlExtensionRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePostgresqlExtensionResponse::getBody,
                DeletePostgresqlExtensionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ExecutePrivilegeDatabaseUserRoleRequest, ExecutePrivilegeDatabaseUserRoleResponse> executePrivilegeDatabaseUserRole =
        genForExecutePrivilegeDatabaseUserRole();

    private static HttpRequestDef<ExecutePrivilegeDatabaseUserRoleRequest, ExecutePrivilegeDatabaseUserRoleResponse> genForExecutePrivilegeDatabaseUserRole() {
        // basic
        HttpRequestDef.Builder<ExecutePrivilegeDatabaseUserRoleRequest, ExecutePrivilegeDatabaseUserRoleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecutePrivilegeDatabaseUserRoleRequest.class,
                    ExecutePrivilegeDatabaseUserRoleResponse.class)
                .withName("ExecutePrivilegeDatabaseUserRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePrivilegeDatabaseUserRoleRequest::getInstanceId,
                ExecutePrivilegeDatabaseUserRoleRequest::setInstanceId));
        builder.<DatabaseUserRoleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DatabaseUserRoleRequest.class),
            f -> f.withMarshaller(ExecutePrivilegeDatabaseUserRoleRequest::getBody,
                ExecutePrivilegeDatabaseUserRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteRevokeDatabaseUserRoleRequest, ExecuteRevokeDatabaseUserRoleResponse> executeRevokeDatabaseUserRole =
        genForExecuteRevokeDatabaseUserRole();

    private static HttpRequestDef<ExecuteRevokeDatabaseUserRoleRequest, ExecuteRevokeDatabaseUserRoleResponse> genForExecuteRevokeDatabaseUserRole() {
        // basic
        HttpRequestDef.Builder<ExecuteRevokeDatabaseUserRoleRequest, ExecuteRevokeDatabaseUserRoleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    ExecuteRevokeDatabaseUserRoleRequest.class,
                    ExecuteRevokeDatabaseUserRoleResponse.class)
                .withName("ExecuteRevokeDatabaseUserRole")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-user-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteRevokeDatabaseUserRoleRequest::getInstanceId,
                ExecuteRevokeDatabaseUserRoleRequest::setInstanceId));
        builder.<DatabaseUserRoleRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DatabaseUserRoleRequest.class),
            f -> f.withMarshaller(ExecuteRevokeDatabaseUserRoleRequest::getBody,
                ExecuteRevokeDatabaseUserRoleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseUserRoleRequest, ListDatabaseUserRoleResponse> listDatabaseUserRole =
        genForListDatabaseUserRole();

    private static HttpRequestDef<ListDatabaseUserRoleRequest, ListDatabaseUserRoleResponse> genForListDatabaseUserRole() {
        // basic
        HttpRequestDef.Builder<ListDatabaseUserRoleRequest, ListDatabaseUserRoleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDatabaseUserRoleRequest.class, ListDatabaseUserRoleResponse.class)
            .withName("ListDatabaseUserRole")
            .withUri("/v3/{project_id}/instances/{instance_id}/roles")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUserRoleRequest::getInstanceId,
                ListDatabaseUserRoleRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseUserRoleRequest::getUserName, ListDatabaseUserRoleRequest::setUserName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemas =
        genForListPostgresqlDatabaseSchemas();

    private static HttpRequestDef<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> genForListPostgresqlDatabaseSchemas() {
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
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getInstanceId,
                ListPostgresqlDatabaseSchemasRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getDbName,
                ListPostgresqlDatabaseSchemasRequest::setDbName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getPage,
                ListPostgresqlDatabaseSchemasRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getLimit,
                ListPostgresqlDatabaseSchemasRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabaseSchemasRequest::getXLanguage,
                ListPostgresqlDatabaseSchemasRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabases =
        genForListPostgresqlDatabases();

    private static HttpRequestDef<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> genForListPostgresqlDatabases() {
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
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getInstanceId,
                ListPostgresqlDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("db",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getDb, ListPostgresqlDatabasesRequest::setDb));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getPage, ListPostgresqlDatabasesRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getLimit, ListPostgresqlDatabasesRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDatabasesRequest::getXLanguage,
                ListPostgresqlDatabasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginated =
        genForListPostgresqlDbUserPaginated();

    private static HttpRequestDef<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> genForListPostgresqlDbUserPaginated() {
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
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getInstanceId,
                ListPostgresqlDbUserPaginatedRequest::setInstanceId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getPage,
                ListPostgresqlDbUserPaginatedRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getLimit,
                ListPostgresqlDbUserPaginatedRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlDbUserPaginatedRequest::getXLanguage,
                ListPostgresqlDbUserPaginatedRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> listPostgresqlExtension =
        genForListPostgresqlExtension();

    private static HttpRequestDef<ListPostgresqlExtensionRequest, ListPostgresqlExtensionResponse> genForListPostgresqlExtension() {
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
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getInstanceId,
                ListPostgresqlExtensionRequest::setInstanceId));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getDatabaseName,
                ListPostgresqlExtensionRequest::setDatabaseName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getOffset,
                ListPostgresqlExtensionRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getLimit, ListPostgresqlExtensionRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPostgresqlExtensionRequest::getXLanguage,
                ListPostgresqlExtensionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> revokePostgresqlDbPrivilege =
        genForRevokePostgresqlDbPrivilege();

    private static HttpRequestDef<RevokePostgresqlDbPrivilegeRequest, RevokePostgresqlDbPrivilegeResponse> genForRevokePostgresqlDbPrivilege() {
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
            f -> f.withMarshaller(RevokePostgresqlDbPrivilegeRequest::getInstanceId,
                RevokePostgresqlDbPrivilegeRequest::setInstanceId));
        builder.<RevokePostgresqlDbPrivilegeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RevokePostgresqlDbPrivilegeRequestBody.class),
            f -> f.withMarshaller(RevokePostgresqlDbPrivilegeRequest::getBody,
                RevokePostgresqlDbPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavors =
        genForSearchQueryScaleComputeFlavors();

    private static HttpRequestDef<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> genForSearchQueryScaleComputeFlavors() {
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
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getInstanceId,
                SearchQueryScaleComputeFlavorsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getOffset,
                SearchQueryScaleComputeFlavorsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getLimit,
                SearchQueryScaleComputeFlavorsRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQueryScaleComputeFlavorsRequest::getXLanguage,
                SearchQueryScaleComputeFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavors =
        genForSearchQueryScaleFlavors();

    private static HttpRequestDef<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> genForSearchQueryScaleFlavors() {
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
            f -> f.withMarshaller(SearchQueryScaleFlavorsRequest::getInstanceId,
                SearchQueryScaleFlavorsRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchQueryScaleFlavorsRequest::getXLanguage,
                SearchQueryScaleFlavorsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> setDatabaseUserPrivilege =
        genForSetDatabaseUserPrivilege();

    private static HttpRequestDef<SetDatabaseUserPrivilegeRequest, SetDatabaseUserPrivilegeResponse> genForSetDatabaseUserPrivilege() {
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
            f -> f.withMarshaller(SetDatabaseUserPrivilegeRequest::getInstanceId,
                SetDatabaseUserPrivilegeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDatabaseUserPrivilegeRequest::getXLanguage,
                SetDatabaseUserPrivilegeRequest::setXLanguage));
        builder.<SetDatabaseUserPrivilegeReqV3>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetDatabaseUserPrivilegeReqV3.class),
            f -> f.withMarshaller(SetDatabaseUserPrivilegeRequest::getBody, SetDatabaseUserPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwd =
        genForSetPostgresqlDbUserPwd();

    private static HttpRequestDef<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> genForSetPostgresqlDbUserPwd() {
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
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getInstanceId,
                SetPostgresqlDbUserPwdRequest::setInstanceId));
        builder.<SetPostgresqlDbUserPwdRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetPostgresqlDbUserPwdRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getXLanguage,
                SetPostgresqlDbUserPwdRequest::setXLanguage));
        builder.<DbUserPwdRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPwdRequest.class),
            f -> f.withMarshaller(SetPostgresqlDbUserPwdRequest::getBody, SetPostgresqlDbUserPwdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxy =
        genForShowInformationAboutDatabaseProxy();

    private static HttpRequestDef<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> genForShowInformationAboutDatabaseProxy() {
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
            f -> f.withMarshaller(ShowInformationAboutDatabaseProxyRequest::getInstanceId,
                ShowInformationAboutDatabaseProxyRequest::setInstanceId));
        builder.<ShowInformationAboutDatabaseProxyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInformationAboutDatabaseProxyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInformationAboutDatabaseProxyRequest::getXLanguage,
                ShowInformationAboutDatabaseProxyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> showPostgresqlParamValue =
        genForShowPostgresqlParamValue();

    private static HttpRequestDef<ShowPostgresqlParamValueRequest, ShowPostgresqlParamValueResponse> genForShowPostgresqlParamValue() {
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
            f -> f.withMarshaller(ShowPostgresqlParamValueRequest::getInstanceId,
                ShowPostgresqlParamValueRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPostgresqlParamValueRequest::getName, ShowPostgresqlParamValueRequest::setName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPostgresqlParamValueRequest::getXLanguage,
                ShowPostgresqlParamValueRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecoveryTimeWindowRequest, ShowRecoveryTimeWindowResponse> showRecoveryTimeWindow =
        genForShowRecoveryTimeWindow();

    private static HttpRequestDef<ShowRecoveryTimeWindowRequest, ShowRecoveryTimeWindowResponse> genForShowRecoveryTimeWindow() {
        // basic
        HttpRequestDef.Builder<ShowRecoveryTimeWindowRequest, ShowRecoveryTimeWindowResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRecoveryTimeWindowRequest.class, ShowRecoveryTimeWindowResponse.class)
            .withName("ShowRecoveryTimeWindow")
            .withUri("/v3/{project_id}/instances/{instance_id}/recovery-time")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecoveryTimeWindowRequest::getInstanceId,
                ShowRecoveryTimeWindowRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecoveryTimeWindowRequest::getXLanguage,
                ShowRecoveryTimeWindowRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReplayDelayStatusRequest, ShowReplayDelayStatusResponse> showReplayDelayStatus =
        genForShowReplayDelayStatus();

    private static HttpRequestDef<ShowReplayDelayStatusRequest, ShowReplayDelayStatusResponse> genForShowReplayDelayStatus() {
        // basic
        HttpRequestDef.Builder<ShowReplayDelayStatusRequest, ShowReplayDelayStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowReplayDelayStatusRequest.class, ShowReplayDelayStatusResponse.class)
            .withName("ShowReplayDelayStatus")
            .withUri("/v3/{project_id}/instances/{instance_id}/replay-delay/show")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayDelayStatusRequest::getInstanceId,
                ShowReplayDelayStatusRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReplayDelayStatusRequest::getXLanguage,
                ShowReplayDelayStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxy =
        genForStartDatabaseProxy();

    private static HttpRequestDef<StartDatabaseProxyRequest, StartDatabaseProxyResponse> genForStartDatabaseProxy() {
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
            f -> f.withMarshaller(StartDatabaseProxyRequest::getInstanceId, StartDatabaseProxyRequest::setInstanceId));
        builder.<StartDatabaseProxyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartDatabaseProxyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StartDatabaseProxyRequest::getXLanguage, StartDatabaseProxyRequest::setXLanguage));
        builder.<OpenProxyRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenProxyRequest.class),
            f -> f.withMarshaller(StartDatabaseProxyRequest::getBody, StartDatabaseProxyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxy =
        genForStopDatabaseProxy();

    private static HttpRequestDef<StopDatabaseProxyRequest, StopDatabaseProxyResponse> genForStopDatabaseProxy() {
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
            f -> f.withMarshaller(StopDatabaseProxyRequest::getInstanceId, StopDatabaseProxyRequest::setInstanceId));
        builder.<StopDatabaseProxyRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StopDatabaseProxyRequest.XLanguageEnum.class),
            f -> f.withMarshaller(StopDatabaseProxyRequest::getXLanguage, StopDatabaseProxyRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchLogReplayRequest, SwitchLogReplayResponse> switchLogReplay =
        genForSwitchLogReplay();

    private static HttpRequestDef<SwitchLogReplayRequest, SwitchLogReplayResponse> genForSwitchLogReplay() {
        // basic
        HttpRequestDef.Builder<SwitchLogReplayRequest, SwitchLogReplayResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SwitchLogReplayRequest.class, SwitchLogReplayResponse.class)
                .withName("SwitchLogReplay")
                .withUri("/v3/{project_id}/instances/{instance_id}/log-replay/update")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchLogReplayRequest::getInstanceId, SwitchLogReplayRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchLogReplayRequest::getXLanguage, SwitchLogReplayRequest::setXLanguage));
        builder.<SwitchLogReplayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SwitchLogReplayRequestBody.class),
            f -> f.withMarshaller(SwitchLogReplayRequest::getBody, SwitchLogReplayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> updateDatabaseOwner =
        genForUpdateDatabaseOwner();

    private static HttpRequestDef<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> genForUpdateDatabaseOwner() {
        // basic
        HttpRequestDef.Builder<UpdateDatabaseOwnerRequest, UpdateDatabaseOwnerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateDatabaseOwnerRequest.class, UpdateDatabaseOwnerResponse.class)
                .withName("UpdateDatabaseOwner")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/owner")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getInstanceId,
                UpdateDatabaseOwnerRequest::setInstanceId));
        builder.<UpdateDatabaseOwnerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDatabaseOwnerRequestBody.class),
            f -> f.withMarshaller(UpdateDatabaseOwnerRequest::getBody, UpdateDatabaseOwnerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> updateDbUserPrivilege =
        genForUpdateDbUserPrivilege();

    private static HttpRequestDef<UpdateDbUserPrivilegeRequest, UpdateDbUserPrivilegeResponse> genForUpdateDbUserPrivilege() {
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
            f -> f.withMarshaller(UpdateDbUserPrivilegeRequest::getInstanceId,
                UpdateDbUserPrivilegeRequest::setInstanceId));
        builder.<DbUserPrivilegeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DbUserPrivilegeRequest.class),
            f -> f.withMarshaller(UpdateDbUserPrivilegeRequest::getBody, UpdateDbUserPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> updatePostgresqlDatabase =
        genForUpdatePostgresqlDatabase();

    private static HttpRequestDef<UpdatePostgresqlDatabaseRequest, UpdatePostgresqlDatabaseResponse> genForUpdatePostgresqlDatabase() {
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
            f -> f.withMarshaller(UpdatePostgresqlDatabaseRequest::getInstanceId,
                UpdatePostgresqlDatabaseRequest::setInstanceId));
        builder.<UpdatePostgresqlDatabaseRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePostgresqlDatabaseRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdatePostgresqlDatabaseRequest::getXLanguage,
                UpdatePostgresqlDatabaseRequest::setXLanguage));
        builder.<UpdateDatabaseReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDatabaseReq.class),
            f -> f.withMarshaller(UpdatePostgresqlDatabaseRequest::getBody, UpdatePostgresqlDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> updatePostgresqlDbUserComment =
        genForUpdatePostgresqlDbUserComment();

    private static HttpRequestDef<UpdatePostgresqlDbUserCommentRequest, UpdatePostgresqlDbUserCommentResponse> genForUpdatePostgresqlDbUserComment() {
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
            f -> f.withMarshaller(UpdatePostgresqlDbUserCommentRequest::getInstanceId,
                UpdatePostgresqlDbUserCommentRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlDbUserCommentRequest::getUserName,
                UpdatePostgresqlDbUserCommentRequest::setUserName));
        builder.<UpdateDbUserReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbUserReq.class),
            f -> f.withMarshaller(UpdatePostgresqlDbUserCommentRequest::getBody,
                UpdatePostgresqlDbUserCommentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlExtensionRequest, UpdatePostgresqlExtensionResponse> updatePostgresqlExtension =
        genForUpdatePostgresqlExtension();

    private static HttpRequestDef<UpdatePostgresqlExtensionRequest, UpdatePostgresqlExtensionResponse> genForUpdatePostgresqlExtension() {
        // basic
        HttpRequestDef.Builder<UpdatePostgresqlExtensionRequest, UpdatePostgresqlExtensionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePostgresqlExtensionRequest.class,
                    UpdatePostgresqlExtensionResponse.class)
                .withName("UpdatePostgresqlExtension")
                .withUri("/v3/{project_id}/instances/{instance_id}/extensions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlExtensionRequest::getInstanceId,
                UpdatePostgresqlExtensionRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlExtensionRequest::getXLanguage,
                UpdatePostgresqlExtensionRequest::setXLanguage));
        builder.<ExtensionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionRequest.class),
            f -> f.withMarshaller(UpdatePostgresqlExtensionRequest::getBody,
                UpdatePostgresqlExtensionRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePostgresqlExtensionResponse::getBody,
                UpdatePostgresqlExtensionResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> updatePostgresqlParameterValue =
        genForUpdatePostgresqlParameterValue();

    private static HttpRequestDef<UpdatePostgresqlParameterValueRequest, UpdatePostgresqlParameterValueResponse> genForUpdatePostgresqlParameterValue() {
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
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getInstanceId,
                UpdatePostgresqlParameterValueRequest::setInstanceId));
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getName,
                UpdatePostgresqlParameterValueRequest::setName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getXLanguage,
                UpdatePostgresqlParameterValueRequest::setXLanguage));
        builder.<ModifyParamRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyParamRequest.class),
            f -> f.withMarshaller(UpdatePostgresqlParameterValueRequest::getBody,
                UpdatePostgresqlParameterValueRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeight =
        genForUpdateReadWeight();

    private static HttpRequestDef<UpdateReadWeightRequest, UpdateReadWeightResponse> genForUpdateReadWeight() {
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
            f -> f.withMarshaller(UpdateReadWeightRequest::getInstanceId, UpdateReadWeightRequest::setInstanceId));
        builder.<UpdateReadWeightRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateReadWeightRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateReadWeightRequest::getXLanguage, UpdateReadWeightRequest::setXLanguage));
        builder.<ModifyProxyWeightRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyProxyWeightRequest.class),
            f -> f.withMarshaller(UpdateReadWeightRequest::getBody, UpdateReadWeightRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilege =
        genForAllowSqlserverDbUserPrivilege();

    private static HttpRequestDef<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> genForAllowSqlserverDbUserPrivilege() {
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
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getInstanceId,
                AllowSqlserverDbUserPrivilegeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getXLanguage,
                AllowSqlserverDbUserPrivilegeRequest::setXLanguage));
        builder.<SqlserverGrantRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverGrantRequest.class),
            f -> f.withMarshaller(AllowSqlserverDbUserPrivilegeRequest::getBody,
                AllowSqlserverDbUserPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> batchAddMsdtcs =
        genForBatchAddMsdtcs();

    private static HttpRequestDef<BatchAddMsdtcsRequest, BatchAddMsdtcsResponse> genForBatchAddMsdtcs() {
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
            f -> f.withMarshaller(BatchAddMsdtcsRequest::getInstanceId, BatchAddMsdtcsRequest::setInstanceId));
        builder.<AddMsdtcRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddMsdtcRequestBody.class),
            f -> f.withMarshaller(BatchAddMsdtcsRequest::getBody, BatchAddMsdtcsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CopyDatabaseRequest, CopyDatabaseResponse> copyDatabase = genForCopyDatabase();

    private static HttpRequestDef<CopyDatabaseRequest, CopyDatabaseResponse> genForCopyDatabase() {
        // basic
        HttpRequestDef.Builder<CopyDatabaseRequest, CopyDatabaseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyDatabaseRequest.class, CopyDatabaseResponse.class)
                .withName("CopyDatabase")
                .withUri("/v3/{project_id}/instances/{instance_id}/database/procedure")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyDatabaseRequest::getInstanceId, CopyDatabaseRequest::setInstanceId));
        builder.<AddCopyDatabaseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddCopyDatabaseRequestBody.class),
            f -> f.withMarshaller(CopyDatabaseRequest::getBody, CopyDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabase =
        genForCreateSqlserverDatabase();

    private static HttpRequestDef<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> genForCreateSqlserverDatabase() {
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
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getInstanceId,
                CreateSqlserverDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getXLanguage,
                CreateSqlserverDatabaseRequest::setXLanguage));
        builder.<SqlserverDatabaseForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverDatabaseForCreation.class),
            f -> f.withMarshaller(CreateSqlserverDatabaseRequest::getBody, CreateSqlserverDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUser =
        genForCreateSqlserverDbUser();

    private static HttpRequestDef<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> genForCreateSqlserverDbUser() {
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
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getInstanceId,
                CreateSqlserverDbUserRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getXLanguage,
                CreateSqlserverDbUserRequest::setXLanguage));
        builder.<SqlserverUserForCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverUserForCreation.class),
            f -> f.withMarshaller(CreateSqlserverDbUserRequest::getBody, CreateSqlserverDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMsdtcLocalHostRequest, DeleteMsdtcLocalHostResponse> deleteMsdtcLocalHost =
        genForDeleteMsdtcLocalHost();

    private static HttpRequestDef<DeleteMsdtcLocalHostRequest, DeleteMsdtcLocalHostResponse> genForDeleteMsdtcLocalHost() {
        // basic
        HttpRequestDef.Builder<DeleteMsdtcLocalHostRequest, DeleteMsdtcLocalHostResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMsdtcLocalHostRequest.class, DeleteMsdtcLocalHostResponse.class)
            .withName("DeleteMsdtcLocalHost")
            .withUri("/v3/{project_id}/instances/{instance_id}/msdtc/host")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMsdtcLocalHostRequest::getInstanceId,
                DeleteMsdtcLocalHostRequest::setInstanceId));
        builder.<DeleteMsdtcLocalHostRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteMsdtcLocalHostRequestBody.class),
            f -> f.withMarshaller(DeleteMsdtcLocalHostRequest::getBody, DeleteMsdtcLocalHostRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabase =
        genForDeleteSqlserverDatabase();

    private static HttpRequestDef<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> genForDeleteSqlserverDatabase() {
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
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getInstanceId,
                DeleteSqlserverDatabaseRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getDbName,
                DeleteSqlserverDatabaseRequest::setDbName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getXLanguage,
                DeleteSqlserverDatabaseRequest::setXLanguage));
        builder.<DropDatabaseV3Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DropDatabaseV3Req.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseRequest::getBody, DeleteSqlserverDatabaseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseEx =
        genForDeleteSqlserverDatabaseEx();

    private static HttpRequestDef<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> genForDeleteSqlserverDatabaseEx() {
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
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getInstanceId,
                DeleteSqlserverDatabaseExRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getDbName,
                DeleteSqlserverDatabaseExRequest::setDbName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getXLanguage,
                DeleteSqlserverDatabaseExRequest::setXLanguage));
        builder.<DropDatabaseV3Req>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DropDatabaseV3Req.class),
            f -> f.withMarshaller(DeleteSqlserverDatabaseExRequest::getBody,
                DeleteSqlserverDatabaseExRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUser =
        genForDeleteSqlserverDbUser();

    private static HttpRequestDef<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> genForDeleteSqlserverDbUser() {
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
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getInstanceId,
                DeleteSqlserverDbUserRequest::setInstanceId));
        builder.<String>withRequestField("user_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getUserName,
                DeleteSqlserverDbUserRequest::setUserName));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlserverDbUserRequest::getXLanguage,
                DeleteSqlserverDbUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsers =
        genForListAuthorizedSqlserverDbUsers();

    private static HttpRequestDef<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> genForListAuthorizedSqlserverDbUsers() {
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
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getInstanceId,
                ListAuthorizedSqlserverDbUsersRequest::setInstanceId));
        builder.<String>withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getDbName,
                ListAuthorizedSqlserverDbUsersRequest::setDbName));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getPage,
                ListAuthorizedSqlserverDbUsersRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getLimit,
                ListAuthorizedSqlserverDbUsersRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuthorizedSqlserverDbUsersRequest::getXLanguage,
                ListAuthorizedSqlserverDbUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMsdtcHostsRequest, ListMsdtcHostsResponse> listMsdtcHosts =
        genForListMsdtcHosts();

    private static HttpRequestDef<ListMsdtcHostsRequest, ListMsdtcHostsResponse> genForListMsdtcHosts() {
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
            f -> f.withMarshaller(ListMsdtcHostsRequest::getInstanceId, ListMsdtcHostsRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMsdtcHostsRequest::getOffset, ListMsdtcHostsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMsdtcHostsRequest::getLimit, ListMsdtcHostsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabases =
        genForListSqlserverDatabases();

    private static HttpRequestDef<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> genForListSqlserverDatabases() {
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
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getInstanceId,
                ListSqlserverDatabasesRequest::setInstanceId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getPage, ListSqlserverDatabasesRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getLimit, ListSqlserverDatabasesRequest::setLimit));
        builder.<String>withRequestField("db-name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getDbName, ListSqlserverDatabasesRequest::setDbName));
        builder.<String>withRequestField("recover_model",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getRecoverModel,
                ListSqlserverDatabasesRequest::setRecoverModel));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDatabasesRequest::getXLanguage,
                ListSqlserverDatabasesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsers =
        genForListSqlserverDbUsers();

    private static HttpRequestDef<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> genForListSqlserverDbUsers() {
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
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getInstanceId,
                ListSqlserverDbUsersRequest::setInstanceId));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getPage, ListSqlserverDbUsersRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getLimit, ListSqlserverDbUsersRequest::setLimit));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlserverDbUsersRequest::getXLanguage,
                ListSqlserverDbUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyCollationRequest, ModifyCollationResponse> modifyCollation =
        genForModifyCollation();

    private static HttpRequestDef<ModifyCollationRequest, ModifyCollationResponse> genForModifyCollation() {
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
            f -> f.withMarshaller(ModifyCollationRequest::getInstanceId, ModifyCollationRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyCollationRequest::getXLanguage, ModifyCollationRequest::setXLanguage));
        builder.<ModifyCollationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyCollationRequestBody.class),
            f -> f.withMarshaller(ModifyCollationRequest::getBody, ModifyCollationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilege =
        genForRevokeSqlserverDbUserPrivilege();

    private static HttpRequestDef<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> genForRevokeSqlserverDbUserPrivilege() {
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
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getInstanceId,
                RevokeSqlserverDbUserPrivilegeRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getXLanguage,
                RevokeSqlserverDbUserPrivilegeRequest::setXLanguage));
        builder.<SqlserverRevokeRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SqlserverRevokeRequest.class),
            f -> f.withMarshaller(RevokeSqlserverDbUserPrivilegeRequest::getBody,
                RevokeSqlserverDbUserPrivilegeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse> setInstancesDbShrink =
        genForSetInstancesDbShrink();

    private static HttpRequestDef<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse> genForSetInstancesDbShrink() {
        // basic
        HttpRequestDef.Builder<SetInstancesDbShrinkRequest, SetInstancesDbShrinkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetInstancesDbShrinkRequest.class, SetInstancesDbShrinkResponse.class)
            .withName("SetInstancesDbShrink")
            .withUri("/v3/{project_id}/instances/{instance_id}/db_shrink")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInstancesDbShrinkRequest::getInstanceId,
                SetInstancesDbShrinkRequest::setInstanceId));
        builder.<UpdateDBShrinkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDBShrinkRequestBody.class),
            f -> f.withMarshaller(SetInstancesDbShrinkRequest::getBody, SetInstancesDbShrinkRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetInstancesNewDbShrinkRequest, SetInstancesNewDbShrinkResponse> setInstancesNewDbShrink =
        genForSetInstancesNewDbShrink();

    private static HttpRequestDef<SetInstancesNewDbShrinkRequest, SetInstancesNewDbShrinkResponse> genForSetInstancesNewDbShrink() {
        // basic
        HttpRequestDef.Builder<SetInstancesNewDbShrinkRequest, SetInstancesNewDbShrinkResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetInstancesNewDbShrinkRequest.class, SetInstancesNewDbShrinkResponse.class)
            .withName("SetInstancesNewDbShrink")
            .withUri("/v3.1/{project_id}/instances/{instance_id}/db-shrink")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetInstancesNewDbShrinkRequest::getInstanceId,
                SetInstancesNewDbShrinkRequest::setInstanceId));
        builder.<UpdateDBShrinkRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDBShrinkRequestBody.class),
            f -> f.withMarshaller(SetInstancesNewDbShrinkRequest::getBody, SetInstancesNewDbShrinkRequest::setBody));

        // response

        return builder.build();
    }

}

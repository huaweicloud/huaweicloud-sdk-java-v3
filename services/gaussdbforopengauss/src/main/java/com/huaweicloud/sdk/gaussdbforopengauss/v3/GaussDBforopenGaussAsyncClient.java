package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddHbaConfsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddHbaConfsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AddInstanceTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbPrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AllowDbRolePrivilegesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AttachEipResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AuthorizeBackupDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.AuthorizeBackupDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchDeleteInstanceTagRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchDeleteInstanceTagResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchSetBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchSetBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BatchShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BindLtsConfigRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.BindLtsConfigResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CancelScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CancelScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CollectAspRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CollectAspResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CollectWdrSnapshotRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CollectWdrSnapshotResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateReadonlyNodesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateReadonlyNodesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateRestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSqlLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateSqlLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateWdrSnapshotRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.CreateWdrSnapshotResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDatabaseSchemaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDisasterRecordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteDisasterRecordResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteHbaConfsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteHbaConfsResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteReadonlyNodesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteReadonlyNodesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteScheduleTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteScheduleTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteShardingRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteShardingResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteSqlLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.DeleteSqlLimitTaskResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportFullSqlListRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportFullSqlListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportFullSqlStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportFullSqlStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportInstanceInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportInstanceInfosResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportSlowSqlListRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportSlowSqlListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportSlowSqlRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportSlowSqlResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportTopSqlListRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportTopSqlListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAgencyInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAgencyInfosResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListApplicableInstancesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAppliedHistoriesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAspInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListAspInfosResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemaTablesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemaTablesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseSchemasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseVolumeSummaryRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseVolumeSummaryResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseVolumesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListDatabaseVolumesResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEnhanceFullSqlStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEnhanceFullSqlStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEnhanceFullSqlsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEnhanceFullSqlsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEnterpriseProjectsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEnterpriseProjectsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListEpsQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFeaturesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFullSqlSwitchesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListFullSqlSwitchesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListGaussDbDatastoresResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHbaInfoHistoryRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHbaInfoHistoryResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHbaInfosRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHbaInfosResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKeyViewExecuteNodeRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKeyViewExecuteNodeResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKmsTdeKeyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListKmsTdeKeyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLtsConfigsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListLtsConfigsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListMetricDatasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListMetricDatasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListNodeLimitSqlModelResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParamGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParameterGroupTemplatesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListParameterGroupTemplatesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginInfoListRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPluginInfoListResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListPredefinedTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListReadonlyNodesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListReadonlyNodesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRealTimeSessionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListRealTimeSessionsResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSchemaAndTableRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSchemaAndTableResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSchemaVolumesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSchemaVolumesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionMemoryContextRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionMemoryContextResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionTopSqlStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionTopSqlStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionWaitEventStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionWaitEventStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlExcuteNodesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlExcuteNodesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlPlanActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlPlanActionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlTraceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlTraceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSupportKernelPluginsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTableDefinitionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTableDefinitionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTableDefinitionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTableDefinitionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTableVolumesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTableVolumesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopSqlsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopSqlsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopTableVolumesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopTableVolumesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTransactionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTransactionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListWaitEventRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListWaitEventResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListWdrSnapshotsCollectResultsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListWdrSnapshotsCollectResultsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyHbaConfRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyHbaConfResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyInstancePortRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyInstancePortResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyParameterConfigTemplateRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyParameterConfigTemplateResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetDrConfigResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResetPwdResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstanceFlavorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstancesFlavorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResizeInstancesFlavorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreHbaInfoRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreHbaInfoResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ResumePluginExtensionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RunInstanceActionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SaveAsParameterConfigTemplateRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SaveAsParameterConfigTemplateResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAlarmHistoryRecordRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAlarmHistoryRecordResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAlarmStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAlarmStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAspStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAspStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAutoKillTransactionConfigRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowAutoKillTransactionConfigResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBackupPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBalanceStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowBatchUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterInstanceMonitorRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterInstanceMonitorResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterRelationsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowCrossCloudDisasterRelationsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowDeploymentFormResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowEpsRemainingQuotaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowEpsRemainingQuotaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowErrorLogSwitchStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowExpansionParametersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowExpansionParametersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowFullSqlRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowFullSqlResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowGlobalSlowSqlDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowGlobalSlowSqlDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceDiskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceMetricDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceMetricDataResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceParamGroupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstanceSnapshotResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstancesStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowInstancesStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowJobDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowKmsKeyDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowKmsKeyDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowMetricNamesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowMetricNamesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowParameterGroupDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowParameterGroupDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowProjectQuotasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRecyclePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRedistributionParametersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowRedistributionParametersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSessionOverviewRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSessionOverviewResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowShardDiskMessagesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowShardDiskMessagesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowLogDownloadResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowSqlPlanRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowSqlPlanResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowSqlStackRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSlowSqlStackResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSourceInstanceDetailRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSourceInstanceDetailResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSqlLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSqlLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSqlPatchRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSqlPatchResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowSslCertDownloadLinkResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowUpgradeCandidateVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowWdrSnapshotStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShowWdrSnapshotStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShrinkCnRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ShrinkCnResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartFullSqlRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartFullSqlResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StartMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopBackupResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopFreeSessionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopFreeSessionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopFullSqlRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopFullSqlResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopInstanceResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopSessionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopSessionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopTransactionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.StopTransactionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchAspStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchAspStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchKmsTdeRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchKmsTdeResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchLogCollectionStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchLogCollectionStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchReplicaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchReplicaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchShardResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchWdrSnapshotStatusRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SwitchWdrSnapshotStatusResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SyncLimitDataRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.SyncLimitDataResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UnbindLtsConfigRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UnbindLtsConfigResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateAgencyPolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateAgencyPolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateExpansionParametersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateExpansionParametersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceAliasRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceAliasResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceConfigurationResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceNameResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceVersionsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateInstanceVersionsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateLimitTaskResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateMysqlCompatibilityResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateRedistributionControlRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateRedistributionControlResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateSqlLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateSqlLimitTaskResponse;
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
     * 新增客户端接入认证配置
     *
     * 新增客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHbaConfsRequest 请求对象
     * @return CompletableFuture<AddHbaConfsResponse>
     */
    public CompletableFuture<AddHbaConfsResponse> addHbaConfsAsync(AddHbaConfsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.addHbaConfs);
    }

    /**
     * 新增客户端接入认证配置
     *
     * 新增客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHbaConfsRequest 请求对象
     * @return AsyncInvoker<AddHbaConfsRequest, AddHbaConfsResponse>
     */
    public AsyncInvoker<AddHbaConfsRequest, AddHbaConfsResponse> addHbaConfsAsyncInvoker(AddHbaConfsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.addHbaConfs, hcClient);
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
     * 授权备份文件下载
     *
     * 授权租户使用OBS Browser+方式下载备份文件，支持实例级、表级的全量备份及差量备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeBackupDownloadRequest 请求对象
     * @return CompletableFuture<AuthorizeBackupDownloadResponse>
     */
    public CompletableFuture<AuthorizeBackupDownloadResponse> authorizeBackupDownloadAsync(
        AuthorizeBackupDownloadRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.authorizeBackupDownload);
    }

    /**
     * 授权备份文件下载
     *
     * 授权租户使用OBS Browser+方式下载备份文件，支持实例级、表级的全量备份及差量备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AuthorizeBackupDownloadRequest 请求对象
     * @return AsyncInvoker<AuthorizeBackupDownloadRequest, AuthorizeBackupDownloadResponse>
     */
    public AsyncInvoker<AuthorizeBackupDownloadRequest, AuthorizeBackupDownloadResponse> authorizeBackupDownloadAsyncInvoker(
        AuthorizeBackupDownloadRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.authorizeBackupDownload, hcClient);
    }

    /**
     * 批量删除实例标签
     *
     * 批量删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceTagRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceTagResponse>
     */
    public CompletableFuture<BatchDeleteInstanceTagResponse> batchDeleteInstanceTagAsync(
        BatchDeleteInstanceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.batchDeleteInstanceTag);
    }

    /**
     * 批量删除实例标签
     *
     * 批量删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteInstanceTagRequest 请求对象
     * @return AsyncInvoker<BatchDeleteInstanceTagRequest, BatchDeleteInstanceTagResponse>
     */
    public AsyncInvoker<BatchDeleteInstanceTagRequest, BatchDeleteInstanceTagResponse> batchDeleteInstanceTagAsyncInvoker(
        BatchDeleteInstanceTagRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.batchDeleteInstanceTag, hcClient);
    }

    /**
     * 批量设置自动备份策略
     *
     * 批量设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetBackupPolicyRequest 请求对象
     * @return CompletableFuture<BatchSetBackupPolicyResponse>
     */
    public CompletableFuture<BatchSetBackupPolicyResponse> batchSetBackupPolicyAsync(
        BatchSetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.batchSetBackupPolicy);
    }

    /**
     * 批量设置自动备份策略
     *
     * 批量设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<BatchSetBackupPolicyRequest, BatchSetBackupPolicyResponse>
     */
    public AsyncInvoker<BatchSetBackupPolicyRequest, BatchSetBackupPolicyResponse> batchSetBackupPolicyAsyncInvoker(
        BatchSetBackupPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.batchSetBackupPolicy, hcClient);
    }

    /**
     * 查询批量实例可升级的版本和升级类型
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
     * 查询批量实例可升级的版本和升级类型
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
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReadonlyNodesRequest 请求对象
     * @return CompletableFuture<CreateReadonlyNodesResponse>
     */
    public CompletableFuture<CreateReadonlyNodesResponse> createReadonlyNodesAsync(CreateReadonlyNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createReadonlyNodes);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReadonlyNodesRequest 请求对象
     * @return AsyncInvoker<CreateReadonlyNodesRequest, CreateReadonlyNodesResponse>
     */
    public AsyncInvoker<CreateReadonlyNodesRequest, CreateReadonlyNodesResponse> createReadonlyNodesAsyncInvoker(
        CreateReadonlyNodesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createReadonlyNodes, hcClient);
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
     * 删除容灾记录
     *
     * 删除容灾记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecordRequest 请求对象
     * @return CompletableFuture<DeleteDisasterRecordResponse>
     */
    public CompletableFuture<DeleteDisasterRecordResponse> deleteDisasterRecordAsync(
        DeleteDisasterRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDisasterRecord);
    }

    /**
     * 删除容灾记录
     *
     * 删除容灾记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDisasterRecordRequest 请求对象
     * @return AsyncInvoker<DeleteDisasterRecordRequest, DeleteDisasterRecordResponse>
     */
    public AsyncInvoker<DeleteDisasterRecordRequest, DeleteDisasterRecordResponse> deleteDisasterRecordAsyncInvoker(
        DeleteDisasterRecordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDisasterRecord, hcClient);
    }

    /**
     * 删除客户端接入认证配置
     *
     * 删除客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHbaConfsRequest 请求对象
     * @return CompletableFuture<DeleteHbaConfsResponse>
     */
    public CompletableFuture<DeleteHbaConfsResponse> deleteHbaConfsAsync(DeleteHbaConfsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteHbaConfs);
    }

    /**
     * 删除客户端接入认证配置
     *
     * 删除客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHbaConfsRequest 请求对象
     * @return AsyncInvoker<DeleteHbaConfsRequest, DeleteHbaConfsResponse>
     */
    public AsyncInvoker<DeleteHbaConfsRequest, DeleteHbaConfsResponse> deleteHbaConfsAsyncInvoker(
        DeleteHbaConfsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteHbaConfs, hcClient);
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
     * 删除只读节点
     *
     * 删除只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodesRequest 请求对象
     * @return CompletableFuture<DeleteReadonlyNodesResponse>
     */
    public CompletableFuture<DeleteReadonlyNodesResponse> deleteReadonlyNodesAsync(DeleteReadonlyNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteReadonlyNodes);
    }

    /**
     * 删除只读节点
     *
     * 删除只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodesRequest 请求对象
     * @return AsyncInvoker<DeleteReadonlyNodesRequest, DeleteReadonlyNodesResponse>
     */
    public AsyncInvoker<DeleteReadonlyNodesRequest, DeleteReadonlyNodesResponse> deleteReadonlyNodesAsyncInvoker(
        DeleteReadonlyNodesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteReadonlyNodes, hcClient);
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
     * 分片缩容
     *
     * 数据库分片缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShardingRequest 请求对象
     * @return CompletableFuture<DeleteShardingResponse>
     */
    public CompletableFuture<DeleteShardingResponse> deleteShardingAsync(DeleteShardingRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteSharding);
    }

    /**
     * 分片缩容
     *
     * 数据库分片缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShardingRequest 请求对象
     * @return AsyncInvoker<DeleteShardingRequest, DeleteShardingResponse>
     */
    public AsyncInvoker<DeleteShardingRequest, DeleteShardingResponse> deleteShardingAsyncInvoker(
        DeleteShardingRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteSharding, hcClient);
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
     * 导出实例信息
     *
     * 导出实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstanceInfosRequest 请求对象
     * @return CompletableFuture<ExportInstanceInfosResponse>
     */
    public CompletableFuture<ExportInstanceInfosResponse> exportInstanceInfosAsync(ExportInstanceInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.exportInstanceInfos);
    }

    /**
     * 导出实例信息
     *
     * 导出实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstanceInfosRequest 请求对象
     * @return AsyncInvoker<ExportInstanceInfosRequest, ExportInstanceInfosResponse>
     */
    public AsyncInvoker<ExportInstanceInfosRequest, ExportInstanceInfosResponse> exportInstanceInfosAsyncInvoker(
        ExportInstanceInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.exportInstanceInfos, hcClient);
    }

    /**
     * 导出表信息
     *
     * 导出表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlResponse>
     */
    public CompletableFuture<ExportSlowSqlResponse> exportSlowSqlAsync(ExportSlowSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.exportSlowSql);
    }

    /**
     * 导出表信息
     *
     * 导出表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlRequest, ExportSlowSqlResponse>
     */
    public AsyncInvoker<ExportSlowSqlRequest, ExportSlowSqlResponse> exportSlowSqlAsyncInvoker(
        ExportSlowSqlRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.exportSlowSql, hcClient);
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
     * 查询委托权限详情
     *
     * 查询委托权限详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgencyInfosRequest 请求对象
     * @return CompletableFuture<ListAgencyInfosResponse>
     */
    public CompletableFuture<ListAgencyInfosResponse> listAgencyInfosAsync(ListAgencyInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listAgencyInfos);
    }

    /**
     * 查询委托权限详情
     *
     * 查询委托权限详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAgencyInfosRequest 请求对象
     * @return AsyncInvoker<ListAgencyInfosRequest, ListAgencyInfosResponse>
     */
    public AsyncInvoker<ListAgencyInfosRequest, ListAgencyInfosResponse> listAgencyInfosAsyncInvoker(
        ListAgencyInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listAgencyInfos, hcClient);
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
     * 查询协调节点列表。
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
     * 查询协调节点列表。
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
     * 查询数据库表列表
     *
     * 查询指定实例的数据库表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemaTablesRequest 请求对象
     * @return CompletableFuture<ListDatabaseSchemaTablesResponse>
     */
    public CompletableFuture<ListDatabaseSchemaTablesResponse> listDatabaseSchemaTablesAsync(
        ListDatabaseSchemaTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseSchemaTables);
    }

    /**
     * 查询数据库表列表
     *
     * 查询指定实例的数据库表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemaTablesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseSchemaTablesRequest, ListDatabaseSchemaTablesResponse>
     */
    public AsyncInvoker<ListDatabaseSchemaTablesRequest, ListDatabaseSchemaTablesResponse> listDatabaseSchemaTablesAsyncInvoker(
        ListDatabaseSchemaTablesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseSchemaTables, hcClient);
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
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVersionsRequest 请求对象
     * @return CompletableFuture<ListDatabaseVersionsResponse>
     */
    public CompletableFuture<ListDatabaseVersionsResponse> listDatabaseVersionsAsync(
        ListDatabaseVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseVersions);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVersionsRequest 请求对象
     * @return AsyncInvoker<ListDatabaseVersionsRequest, ListDatabaseVersionsResponse>
     */
    public AsyncInvoker<ListDatabaseVersionsRequest, ListDatabaseVersionsResponse> listDatabaseVersionsAsyncInvoker(
        ListDatabaseVersionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseVersions, hcClient);
    }

    /**
     * 查询数据盘空间概况
     *
     * 查询数据盘空间概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVolumeSummaryRequest 请求对象
     * @return CompletableFuture<ListDatabaseVolumeSummaryResponse>
     */
    public CompletableFuture<ListDatabaseVolumeSummaryResponse> listDatabaseVolumeSummaryAsync(
        ListDatabaseVolumeSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseVolumeSummary);
    }

    /**
     * 查询数据盘空间概况
     *
     * 查询数据盘空间概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVolumeSummaryRequest 请求对象
     * @return AsyncInvoker<ListDatabaseVolumeSummaryRequest, ListDatabaseVolumeSummaryResponse>
     */
    public AsyncInvoker<ListDatabaseVolumeSummaryRequest, ListDatabaseVolumeSummaryResponse> listDatabaseVolumeSummaryAsyncInvoker(
        ListDatabaseVolumeSummaryRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseVolumeSummary, hcClient);
    }

    /**
     * 查询数据库占用空间大小
     *
     * 查询数据库占用空间大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVolumesRequest 请求对象
     * @return CompletableFuture<ListDatabaseVolumesResponse>
     */
    public CompletableFuture<ListDatabaseVolumesResponse> listDatabaseVolumesAsync(ListDatabaseVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseVolumes);
    }

    /**
     * 查询数据库占用空间大小
     *
     * 查询数据库占用空间大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVolumesRequest 请求对象
     * @return AsyncInvoker<ListDatabaseVolumesRequest, ListDatabaseVolumesResponse>
     */
    public AsyncInvoker<ListDatabaseVolumesRequest, ListDatabaseVolumesResponse> listDatabaseVolumesAsyncInvoker(
        ListDatabaseVolumesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseVolumes, hcClient);
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
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return CompletableFuture<ListEnterpriseProjectsResponse>
     */
    public CompletableFuture<ListEnterpriseProjectsResponse> listEnterpriseProjectsAsync(
        ListEnterpriseProjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listEnterpriseProjects);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse>
     */
    public AsyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> listEnterpriseProjectsAsyncInvoker(
        ListEnterpriseProjectsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listEnterpriseProjects, hcClient);
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
     * 查询客户端接入认证配置修改历史
     *
     * 查询实例的客户端接入认证配置修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfoHistoryRequest 请求对象
     * @return CompletableFuture<ListHbaInfoHistoryResponse>
     */
    public CompletableFuture<ListHbaInfoHistoryResponse> listHbaInfoHistoryAsync(ListHbaInfoHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listHbaInfoHistory);
    }

    /**
     * 查询客户端接入认证配置修改历史
     *
     * 查询实例的客户端接入认证配置修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfoHistoryRequest 请求对象
     * @return AsyncInvoker<ListHbaInfoHistoryRequest, ListHbaInfoHistoryResponse>
     */
    public AsyncInvoker<ListHbaInfoHistoryRequest, ListHbaInfoHistoryResponse> listHbaInfoHistoryAsyncInvoker(
        ListHbaInfoHistoryRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listHbaInfoHistory, hcClient);
    }

    /**
     * 查询客户端接入认证配置
     *
     * 查询客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfosRequest 请求对象
     * @return CompletableFuture<ListHbaInfosResponse>
     */
    public CompletableFuture<ListHbaInfosResponse> listHbaInfosAsync(ListHbaInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listHbaInfos);
    }

    /**
     * 查询客户端接入认证配置
     *
     * 查询客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfosRequest 请求对象
     * @return AsyncInvoker<ListHbaInfosRequest, ListHbaInfosResponse>
     */
    public AsyncInvoker<ListHbaInfosRequest, ListHbaInfosResponse> listHbaInfosAsyncInvoker(
        ListHbaInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listHbaInfos, hcClient);
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
     * 查询关键视图下发节点信息
     *
     * 查询该实例下可用于执行会话查杀功能的节点 (非日志类型的CN或DN节点) 和其所包含的CN、DN组件信息。该接口是会话查杀功能的前提，其返回值中的每一对节点和组件ID是后续查杀会话接口的入参。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyViewExecuteNodeRequest 请求对象
     * @return CompletableFuture<ListKeyViewExecuteNodeResponse>
     */
    public CompletableFuture<ListKeyViewExecuteNodeResponse> listKeyViewExecuteNodeAsync(
        ListKeyViewExecuteNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listKeyViewExecuteNode);
    }

    /**
     * 查询关键视图下发节点信息
     *
     * 查询该实例下可用于执行会话查杀功能的节点 (非日志类型的CN或DN节点) 和其所包含的CN、DN组件信息。该接口是会话查杀功能的前提，其返回值中的每一对节点和组件ID是后续查杀会话接口的入参。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyViewExecuteNodeRequest 请求对象
     * @return AsyncInvoker<ListKeyViewExecuteNodeRequest, ListKeyViewExecuteNodeResponse>
     */
    public AsyncInvoker<ListKeyViewExecuteNodeRequest, ListKeyViewExecuteNodeResponse> listKeyViewExecuteNodeAsyncInvoker(
        ListKeyViewExecuteNodeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listKeyViewExecuteNode, hcClient);
    }

    /**
     * 查询KMS秘钥列表
     *
     * 查询当前可使用的kms秘钥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsTdeKeyRequest 请求对象
     * @return CompletableFuture<ListKmsTdeKeyResponse>
     */
    public CompletableFuture<ListKmsTdeKeyResponse> listKmsTdeKeyAsync(ListKmsTdeKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listKmsTdeKey);
    }

    /**
     * 查询KMS秘钥列表
     *
     * 查询当前可使用的kms秘钥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsTdeKeyRequest 请求对象
     * @return AsyncInvoker<ListKmsTdeKeyRequest, ListKmsTdeKeyResponse>
     */
    public AsyncInvoker<ListKmsTdeKeyRequest, ListKmsTdeKeyResponse> listKmsTdeKeyAsyncInvoker(
        ListKmsTdeKeyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listKmsTdeKey, hcClient);
    }

    /**
     * 查询实例列表指标
     *
     * 查询实例列表指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDatasRequest 请求对象
     * @return CompletableFuture<ListMetricDatasResponse>
     */
    public CompletableFuture<ListMetricDatasResponse> listMetricDatasAsync(ListMetricDatasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listMetricDatas);
    }

    /**
     * 查询实例列表指标
     *
     * 查询实例列表指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDatasRequest 请求对象
     * @return AsyncInvoker<ListMetricDatasRequest, ListMetricDatasResponse>
     */
    public AsyncInvoker<ListMetricDatasRequest, ListMetricDatasResponse> listMetricDatasAsyncInvoker(
        ListMetricDatasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listMetricDatas, hcClient);
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
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInfoListRequest 请求对象
     * @return CompletableFuture<ListPluginInfoListResponse>
     */
    public CompletableFuture<ListPluginInfoListResponse> listPluginInfoListAsync(ListPluginInfoListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listPluginInfoList);
    }

    /**
     * 查询插件列表
     *
     * 查询插件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginInfoListRequest 请求对象
     * @return AsyncInvoker<ListPluginInfoListRequest, ListPluginInfoListResponse>
     */
    public AsyncInvoker<ListPluginInfoListRequest, ListPluginInfoListResponse> listPluginInfoListAsyncInvoker(
        ListPluginInfoListRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listPluginInfoList, hcClient);
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
     * 查询只读节点信息
     *
     * 查询实例的只读节点列表，以及实例可支持的最大只读节点数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReadonlyNodesRequest 请求对象
     * @return CompletableFuture<ListReadonlyNodesResponse>
     */
    public CompletableFuture<ListReadonlyNodesResponse> listReadonlyNodesAsync(ListReadonlyNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listReadonlyNodes);
    }

    /**
     * 查询只读节点信息
     *
     * 查询实例的只读节点列表，以及实例可支持的最大只读节点数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReadonlyNodesRequest 请求对象
     * @return AsyncInvoker<ListReadonlyNodesRequest, ListReadonlyNodesResponse>
     */
    public AsyncInvoker<ListReadonlyNodesRequest, ListReadonlyNodesResponse> listReadonlyNodesAsyncInvoker(
        ListReadonlyNodesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listReadonlyNodes, hcClient);
    }

    /**
     * 查询实时会话
     *
     * 查询数据库实例节点的实时会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRealTimeSessionsRequest 请求对象
     * @return CompletableFuture<ListRealTimeSessionsResponse>
     */
    public CompletableFuture<ListRealTimeSessionsResponse> listRealTimeSessionsAsync(
        ListRealTimeSessionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listRealTimeSessions);
    }

    /**
     * 查询实时会话
     *
     * 查询数据库实例节点的实时会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRealTimeSessionsRequest 请求对象
     * @return AsyncInvoker<ListRealTimeSessionsRequest, ListRealTimeSessionsResponse>
     */
    public AsyncInvoker<ListRealTimeSessionsRequest, ListRealTimeSessionsResponse> listRealTimeSessionsAsyncInvoker(
        ListRealTimeSessionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listRealTimeSessions, hcClient);
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
     * 识别SQL文本中的表信息
     *
     * 识别SQL文本中的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaAndTableRequest 请求对象
     * @return CompletableFuture<ListSchemaAndTableResponse>
     */
    public CompletableFuture<ListSchemaAndTableResponse> listSchemaAndTableAsync(ListSchemaAndTableRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSchemaAndTable);
    }

    /**
     * 识别SQL文本中的表信息
     *
     * 识别SQL文本中的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaAndTableRequest 请求对象
     * @return AsyncInvoker<ListSchemaAndTableRequest, ListSchemaAndTableResponse>
     */
    public AsyncInvoker<ListSchemaAndTableRequest, ListSchemaAndTableResponse> listSchemaAndTableAsyncInvoker(
        ListSchemaAndTableRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSchemaAndTable, hcClient);
    }

    /**
     * 查询指定数据库中schema占用空间大小列表
     *
     * 查询指定数据库中schema占用空间大小列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaVolumesRequest 请求对象
     * @return CompletableFuture<ListSchemaVolumesResponse>
     */
    public CompletableFuture<ListSchemaVolumesResponse> listSchemaVolumesAsync(ListSchemaVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSchemaVolumes);
    }

    /**
     * 查询指定数据库中schema占用空间大小列表
     *
     * 查询指定数据库中schema占用空间大小列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaVolumesRequest 请求对象
     * @return AsyncInvoker<ListSchemaVolumesRequest, ListSchemaVolumesResponse>
     */
    public AsyncInvoker<ListSchemaVolumesRequest, ListSchemaVolumesResponse> listSchemaVolumesAsyncInvoker(
        ListSchemaVolumesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSchemaVolumes, hcClient);
    }

    /**
     * 查询会话内存上下文列表
     *
     * 查询数据库实例节点的会话内存上下文列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionMemoryContextRequest 请求对象
     * @return CompletableFuture<ListSessionMemoryContextResponse>
     */
    public CompletableFuture<ListSessionMemoryContextResponse> listSessionMemoryContextAsync(
        ListSessionMemoryContextRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSessionMemoryContext);
    }

    /**
     * 查询会话内存上下文列表
     *
     * 查询数据库实例节点的会话内存上下文列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionMemoryContextRequest 请求对象
     * @return AsyncInvoker<ListSessionMemoryContextRequest, ListSessionMemoryContextResponse>
     */
    public AsyncInvoker<ListSessionMemoryContextRequest, ListSessionMemoryContextResponse> listSessionMemoryContextAsyncInvoker(
        ListSessionMemoryContextRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSessionMemoryContext, hcClient);
    }

    /**
     * 查询实时会话统计
     *
     * 查询数据库实例节点的实时会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionStatisticsRequest 请求对象
     * @return CompletableFuture<ListSessionStatisticsResponse>
     */
    public CompletableFuture<ListSessionStatisticsResponse> listSessionStatisticsAsync(
        ListSessionStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSessionStatistics);
    }

    /**
     * 查询实时会话统计
     *
     * 查询数据库实例节点的实时会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSessionStatisticsRequest, ListSessionStatisticsResponse>
     */
    public AsyncInvoker<ListSessionStatisticsRequest, ListSessionStatisticsResponse> listSessionStatisticsAsyncInvoker(
        ListSessionStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSessionStatistics, hcClient);
    }

    /**
     * 查询实时会话Top SQL统计
     *
     * 查询实时会话Top SQL统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTopSqlStatisticsRequest 请求对象
     * @return CompletableFuture<ListSessionTopSqlStatisticsResponse>
     */
    public CompletableFuture<ListSessionTopSqlStatisticsResponse> listSessionTopSqlStatisticsAsync(
        ListSessionTopSqlStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSessionTopSqlStatistics);
    }

    /**
     * 查询实时会话Top SQL统计
     *
     * 查询实时会话Top SQL统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionTopSqlStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSessionTopSqlStatisticsRequest, ListSessionTopSqlStatisticsResponse>
     */
    public AsyncInvoker<ListSessionTopSqlStatisticsRequest, ListSessionTopSqlStatisticsResponse> listSessionTopSqlStatisticsAsyncInvoker(
        ListSessionTopSqlStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSessionTopSqlStatistics, hcClient);
    }

    /**
     * 查询实时会话Top等待事件统计
     *
     * 查询实时会话Top等待事件统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionWaitEventStatisticsRequest 请求对象
     * @return CompletableFuture<ListSessionWaitEventStatisticsResponse>
     */
    public CompletableFuture<ListSessionWaitEventStatisticsResponse> listSessionWaitEventStatisticsAsync(
        ListSessionWaitEventStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSessionWaitEventStatistics);
    }

    /**
     * 查询实时会话Top等待事件统计
     *
     * 查询实时会话Top等待事件统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionWaitEventStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSessionWaitEventStatisticsRequest, ListSessionWaitEventStatisticsResponse>
     */
    public AsyncInvoker<ListSessionWaitEventStatisticsRequest, ListSessionWaitEventStatisticsResponse> listSessionWaitEventStatisticsAsyncInvoker(
        ListSessionWaitEventStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSessionWaitEventStatistics, hcClient);
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
     * 查询表定义信息
     *
     * 查询表定义信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionRequest 请求对象
     * @return CompletableFuture<ListTableDefinitionResponse>
     */
    public CompletableFuture<ListTableDefinitionResponse> listTableDefinitionAsync(ListTableDefinitionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTableDefinition);
    }

    /**
     * 查询表定义信息
     *
     * 查询表定义信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionRequest 请求对象
     * @return AsyncInvoker<ListTableDefinitionRequest, ListTableDefinitionResponse>
     */
    public AsyncInvoker<ListTableDefinitionRequest, ListTableDefinitionResponse> listTableDefinitionAsyncInvoker(
        ListTableDefinitionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTableDefinition, hcClient);
    }

    /**
     * 查询指定表的表定义信息列表
     *
     * 查询指定表的表定义信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionsRequest 请求对象
     * @return CompletableFuture<ListTableDefinitionsResponse>
     */
    public CompletableFuture<ListTableDefinitionsResponse> listTableDefinitionsAsync(
        ListTableDefinitionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTableDefinitions);
    }

    /**
     * 查询指定表的表定义信息列表
     *
     * 查询指定表的表定义信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionsRequest 请求对象
     * @return AsyncInvoker<ListTableDefinitionsRequest, ListTableDefinitionsResponse>
     */
    public AsyncInvoker<ListTableDefinitionsRequest, ListTableDefinitionsResponse> listTableDefinitionsAsyncInvoker(
        ListTableDefinitionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTableDefinitions, hcClient);
    }

    /**
     * 查询指定schema中表占用空间大小列表
     *
     * 查询指定schema中表占用空间大小列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableVolumesRequest 请求对象
     * @return CompletableFuture<ListTableVolumesResponse>
     */
    public CompletableFuture<ListTableVolumesResponse> listTableVolumesAsync(ListTableVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTableVolumes);
    }

    /**
     * 查询指定schema中表占用空间大小列表
     *
     * 查询指定schema中表占用空间大小列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableVolumesRequest 请求对象
     * @return AsyncInvoker<ListTableVolumesRequest, ListTableVolumesResponse>
     */
    public AsyncInvoker<ListTableVolumesRequest, ListTableVolumesResponse> listTableVolumesAsyncInvoker(
        ListTableVolumesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTableVolumes, hcClient);
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
     * 查询实例中TOP20 表占用空间大小列表
     *
     * 查询实例中TOP20 表占用空间大小列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopTableVolumesRequest 请求对象
     * @return CompletableFuture<ListTopTableVolumesResponse>
     */
    public CompletableFuture<ListTopTableVolumesResponse> listTopTableVolumesAsync(ListTopTableVolumesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTopTableVolumes);
    }

    /**
     * 查询实例中TOP20 表占用空间大小列表
     *
     * 查询实例中TOP20 表占用空间大小列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopTableVolumesRequest 请求对象
     * @return AsyncInvoker<ListTopTableVolumesRequest, ListTopTableVolumesResponse>
     */
    public AsyncInvoker<ListTopTableVolumesRequest, ListTopTableVolumesResponse> listTopTableVolumesAsyncInvoker(
        ListTopTableVolumesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTopTableVolumes, hcClient);
    }

    /**
     * 查询事务列表
     *
     * 查询数据库实例节点的实时事务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionRequest 请求对象
     * @return CompletableFuture<ListTransactionResponse>
     */
    public CompletableFuture<ListTransactionResponse> listTransactionAsync(ListTransactionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTransaction);
    }

    /**
     * 查询事务列表
     *
     * 查询数据库实例节点的实时事务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionRequest 请求对象
     * @return AsyncInvoker<ListTransactionRequest, ListTransactionResponse>
     */
    public AsyncInvoker<ListTransactionRequest, ListTransactionResponse> listTransactionAsyncInvoker(
        ListTransactionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTransaction, hcClient);
    }

    /**
     * 查询等待事件列表
     *
     * 查询数据库实例节点的等待事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWaitEventRequest 请求对象
     * @return CompletableFuture<ListWaitEventResponse>
     */
    public CompletableFuture<ListWaitEventResponse> listWaitEventAsync(ListWaitEventRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listWaitEvent);
    }

    /**
     * 查询等待事件列表
     *
     * 查询数据库实例节点的等待事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWaitEventRequest 请求对象
     * @return AsyncInvoker<ListWaitEventRequest, ListWaitEventResponse>
     */
    public AsyncInvoker<ListWaitEventRequest, ListWaitEventResponse> listWaitEventAsyncInvoker(
        ListWaitEventRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listWaitEvent, hcClient);
    }

    /**
     * 修改磁盘自动扩容策略
     *
     * 修改磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<ModifyAutoEnlargePolicyResponse>
     */
    public CompletableFuture<ModifyAutoEnlargePolicyResponse> modifyAutoEnlargePolicyAsync(
        ModifyAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.modifyAutoEnlargePolicy);
    }

    /**
     * 修改磁盘自动扩容策略
     *
     * 修改磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<ModifyAutoEnlargePolicyRequest, ModifyAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<ModifyAutoEnlargePolicyRequest, ModifyAutoEnlargePolicyResponse> modifyAutoEnlargePolicyAsyncInvoker(
        ModifyAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.modifyAutoEnlargePolicy, hcClient);
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
     * 修改客户端接入认证配置
     *
     * 修改客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHbaConfRequest 请求对象
     * @return CompletableFuture<ModifyHbaConfResponse>
     */
    public CompletableFuture<ModifyHbaConfResponse> modifyHbaConfAsync(ModifyHbaConfRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.modifyHbaConf);
    }

    /**
     * 修改客户端接入认证配置
     *
     * 修改客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHbaConfRequest 请求对象
     * @return AsyncInvoker<ModifyHbaConfRequest, ModifyHbaConfResponse>
     */
    public AsyncInvoker<ModifyHbaConfRequest, ModifyHbaConfResponse> modifyHbaConfAsyncInvoker(
        ModifyHbaConfRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.modifyHbaConf, hcClient);
    }

    /**
     * 修改指定实例端口号
     *
     * 修改指定实例端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstancePortRequest 请求对象
     * @return CompletableFuture<ModifyInstancePortResponse>
     */
    public CompletableFuture<ModifyInstancePortResponse> modifyInstancePortAsync(ModifyInstancePortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.modifyInstancePort);
    }

    /**
     * 修改指定实例端口号
     *
     * 修改指定实例端口号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyInstancePortRequest 请求对象
     * @return AsyncInvoker<ModifyInstancePortRequest, ModifyInstancePortResponse>
     */
    public AsyncInvoker<ModifyInstancePortRequest, ModifyInstancePortResponse> modifyInstancePortAsyncInvoker(
        ModifyInstancePortRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.modifyInstancePort, hcClient);
    }

    /**
     * 修改参数模板
     *
     * 根据参数模板ID修改参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyParameterConfigTemplateRequest 请求对象
     * @return CompletableFuture<ModifyParameterConfigTemplateResponse>
     */
    public CompletableFuture<ModifyParameterConfigTemplateResponse> modifyParameterConfigTemplateAsync(
        ModifyParameterConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.modifyParameterConfigTemplate);
    }

    /**
     * 修改参数模板
     *
     * 根据参数模板ID修改参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyParameterConfigTemplateRequest 请求对象
     * @return AsyncInvoker<ModifyParameterConfigTemplateRequest, ModifyParameterConfigTemplateResponse>
     */
    public AsyncInvoker<ModifyParameterConfigTemplateRequest, ModifyParameterConfigTemplateResponse> modifyParameterConfigTemplateAsyncInvoker(
        ModifyParameterConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.modifyParameterConfigTemplate, hcClient);
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
     * 变更实例规格
     *
     * 变更实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstancesFlavorRequest 请求对象
     * @return CompletableFuture<ResizeInstancesFlavorResponse>
     */
    public CompletableFuture<ResizeInstancesFlavorResponse> resizeInstancesFlavorAsync(
        ResizeInstancesFlavorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.resizeInstancesFlavor);
    }

    /**
     * 变更实例规格
     *
     * 变更实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstancesFlavorRequest 请求对象
     * @return AsyncInvoker<ResizeInstancesFlavorRequest, ResizeInstancesFlavorResponse>
     */
    public AsyncInvoker<ResizeInstancesFlavorRequest, ResizeInstancesFlavorResponse> resizeInstancesFlavorAsyncInvoker(
        ResizeInstancesFlavorRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.resizeInstancesFlavor, hcClient);
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
     * 恢复客户端接入认证配置信息
     *
     * 恢复客户端接入认证配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreHbaInfoRequest 请求对象
     * @return CompletableFuture<RestoreHbaInfoResponse>
     */
    public CompletableFuture<RestoreHbaInfoResponse> restoreHbaInfoAsync(RestoreHbaInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.restoreHbaInfo);
    }

    /**
     * 恢复客户端接入认证配置信息
     *
     * 恢复客户端接入认证配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreHbaInfoRequest 请求对象
     * @return AsyncInvoker<RestoreHbaInfoRequest, RestoreHbaInfoResponse>
     */
    public AsyncInvoker<RestoreHbaInfoRequest, RestoreHbaInfoResponse> restoreHbaInfoAsyncInvoker(
        RestoreHbaInfoRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.restoreHbaInfo, hcClient);
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
     * 实例参数组保存为参数组模板
     *
     * 实例参数组保存为参数组模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAsParameterConfigTemplateRequest 请求对象
     * @return CompletableFuture<SaveAsParameterConfigTemplateResponse>
     */
    public CompletableFuture<SaveAsParameterConfigTemplateResponse> saveAsParameterConfigTemplateAsync(
        SaveAsParameterConfigTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.saveAsParameterConfigTemplate);
    }

    /**
     * 实例参数组保存为参数组模板
     *
     * 实例参数组保存为参数组模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAsParameterConfigTemplateRequest 请求对象
     * @return AsyncInvoker<SaveAsParameterConfigTemplateRequest, SaveAsParameterConfigTemplateResponse>
     */
    public AsyncInvoker<SaveAsParameterConfigTemplateRequest, SaveAsParameterConfigTemplateResponse> saveAsParameterConfigTemplateAsyncInvoker(
        SaveAsParameterConfigTemplateRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.saveAsParameterConfigTemplate, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略。
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
     * 查询磁盘自动扩容策略。
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
     * 获取告警记录历史
     *
     * 获取告警记录历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmHistoryRecordRequest 请求对象
     * @return CompletableFuture<ShowAlarmHistoryRecordResponse>
     */
    public CompletableFuture<ShowAlarmHistoryRecordResponse> showAlarmHistoryRecordAsync(
        ShowAlarmHistoryRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showAlarmHistoryRecord);
    }

    /**
     * 获取告警记录历史
     *
     * 获取告警记录历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmHistoryRecordRequest 请求对象
     * @return AsyncInvoker<ShowAlarmHistoryRecordRequest, ShowAlarmHistoryRecordResponse>
     */
    public AsyncInvoker<ShowAlarmHistoryRecordRequest, ShowAlarmHistoryRecordResponse> showAlarmHistoryRecordAsyncInvoker(
        ShowAlarmHistoryRecordRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showAlarmHistoryRecord, hcClient);
    }

    /**
     * 实例告警信息汇总统计
     *
     * 实例告警信息汇总统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmStatisticsRequest 请求对象
     * @return CompletableFuture<ShowAlarmStatisticsResponse>
     */
    public CompletableFuture<ShowAlarmStatisticsResponse> showAlarmStatisticsAsync(ShowAlarmStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showAlarmStatistics);
    }

    /**
     * 实例告警信息汇总统计
     *
     * 实例告警信息汇总统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowAlarmStatisticsRequest, ShowAlarmStatisticsResponse>
     */
    public AsyncInvoker<ShowAlarmStatisticsRequest, ShowAlarmStatisticsResponse> showAlarmStatisticsAsyncInvoker(
        ShowAlarmStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showAlarmStatistics, hcClient);
    }

    /**
     * 获取自动中止事务配置
     *
     * 获取实例自动中止事务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoKillTransactionConfigRequest 请求对象
     * @return CompletableFuture<ShowAutoKillTransactionConfigResponse>
     */
    public CompletableFuture<ShowAutoKillTransactionConfigResponse> showAutoKillTransactionConfigAsync(
        ShowAutoKillTransactionConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showAutoKillTransactionConfig);
    }

    /**
     * 获取自动中止事务配置
     *
     * 获取实例自动中止事务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoKillTransactionConfigRequest 请求对象
     * @return AsyncInvoker<ShowAutoKillTransactionConfigRequest, ShowAutoKillTransactionConfigResponse>
     */
    public AsyncInvoker<ShowAutoKillTransactionConfigRequest, ShowAutoKillTransactionConfigResponse> showAutoKillTransactionConfigAsyncInvoker(
        ShowAutoKillTransactionConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showAutoKillTransactionConfig, hcClient);
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
     * 查询备份配置
     *
     * 查询备份管理配置接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return CompletableFuture<ShowConfigurationResponse>
     */
    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showConfiguration);
    }

    /**
     * 查询备份配置
     *
     * 查询备份管理配置接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationAsyncInvoker(
        ShowConfigurationRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showConfiguration, hcClient);
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
     * 获取企业项目剩余配额
     *
     * 获取企业项目剩余配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpsRemainingQuotaRequest 请求对象
     * @return CompletableFuture<ShowEpsRemainingQuotaResponse>
     */
    public CompletableFuture<ShowEpsRemainingQuotaResponse> showEpsRemainingQuotaAsync(
        ShowEpsRemainingQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showEpsRemainingQuota);
    }

    /**
     * 获取企业项目剩余配额
     *
     * 获取企业项目剩余配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpsRemainingQuotaRequest 请求对象
     * @return AsyncInvoker<ShowEpsRemainingQuotaRequest, ShowEpsRemainingQuotaResponse>
     */
    public AsyncInvoker<ShowEpsRemainingQuotaRequest, ShowEpsRemainingQuotaResponse> showEpsRemainingQuotaAsyncInvoker(
        ShowEpsRemainingQuotaRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showEpsRemainingQuota, hcClient);
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
     * 查询扩容优化参数设置模板
     *
     * 查询扩容优化参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpansionParametersRequest 请求对象
     * @return CompletableFuture<ShowExpansionParametersResponse>
     */
    public CompletableFuture<ShowExpansionParametersResponse> showExpansionParametersAsync(
        ShowExpansionParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showExpansionParameters);
    }

    /**
     * 查询扩容优化参数设置模板
     *
     * 查询扩容优化参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpansionParametersRequest 请求对象
     * @return AsyncInvoker<ShowExpansionParametersRequest, ShowExpansionParametersResponse>
     */
    public AsyncInvoker<ShowExpansionParametersRequest, ShowExpansionParametersResponse> showExpansionParametersAsyncInvoker(
        ShowExpansionParametersRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showExpansionParameters, hcClient);
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
     * 查询实例指标数据
     *
     * 查询实例指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricDataRequest 请求对象
     * @return CompletableFuture<ShowInstanceMetricDataResponse>
     */
    public CompletableFuture<ShowInstanceMetricDataResponse> showInstanceMetricDataAsync(
        ShowInstanceMetricDataRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceMetricData);
    }

    /**
     * 查询实例指标数据
     *
     * 查询实例指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricDataRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMetricDataRequest, ShowInstanceMetricDataResponse>
     */
    public AsyncInvoker<ShowInstanceMetricDataRequest, ShowInstanceMetricDataResponse> showInstanceMetricDataAsyncInvoker(
        ShowInstanceMetricDataRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceMetricData, hcClient);
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
     * 实例状态统计
     *
     * 实例状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesStatisticsRequest 请求对象
     * @return CompletableFuture<ShowInstancesStatisticsResponse>
     */
    public CompletableFuture<ShowInstancesStatisticsResponse> showInstancesStatisticsAsync(
        ShowInstancesStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showInstancesStatistics);
    }

    /**
     * 实例状态统计
     *
     * 实例状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowInstancesStatisticsRequest, ShowInstancesStatisticsResponse>
     */
    public AsyncInvoker<ShowInstancesStatisticsRequest, ShowInstancesStatisticsResponse> showInstancesStatisticsAsyncInvoker(
        ShowInstancesStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showInstancesStatistics, hcClient);
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
     * 查询KMS秘钥详情
     *
     * 查询KMS秘钥详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKmsKeyDetailRequest 请求对象
     * @return CompletableFuture<ShowKmsKeyDetailResponse>
     */
    public CompletableFuture<ShowKmsKeyDetailResponse> showKmsKeyDetailAsync(ShowKmsKeyDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showKmsKeyDetail);
    }

    /**
     * 查询KMS秘钥详情
     *
     * 查询KMS秘钥详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKmsKeyDetailRequest 请求对象
     * @return AsyncInvoker<ShowKmsKeyDetailRequest, ShowKmsKeyDetailResponse>
     */
    public AsyncInvoker<ShowKmsKeyDetailRequest, ShowKmsKeyDetailResponse> showKmsKeyDetailAsyncInvoker(
        ShowKmsKeyDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showKmsKeyDetail, hcClient);
    }

    /**
     * 查询指标分组的指标名称
     *
     * 查询指标分组的指标名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesRequest 请求对象
     * @return CompletableFuture<ShowMetricNamesResponse>
     */
    public CompletableFuture<ShowMetricNamesResponse> showMetricNamesAsync(ShowMetricNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showMetricNames);
    }

    /**
     * 查询指标分组的指标名称
     *
     * 查询指标分组的指标名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesRequest 请求对象
     * @return AsyncInvoker<ShowMetricNamesRequest, ShowMetricNamesResponse>
     */
    public AsyncInvoker<ShowMetricNamesRequest, ShowMetricNamesResponse> showMetricNamesAsyncInvoker(
        ShowMetricNamesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showMetricNames, hcClient);
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
     * 查询重分布参数设置模板
     *
     * 查询重分布参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedistributionParametersRequest 请求对象
     * @return CompletableFuture<ShowRedistributionParametersResponse>
     */
    public CompletableFuture<ShowRedistributionParametersResponse> showRedistributionParametersAsync(
        ShowRedistributionParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showRedistributionParameters);
    }

    /**
     * 查询重分布参数设置模板
     *
     * 查询重分布参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedistributionParametersRequest 请求对象
     * @return AsyncInvoker<ShowRedistributionParametersRequest, ShowRedistributionParametersResponse>
     */
    public AsyncInvoker<ShowRedistributionParametersRequest, ShowRedistributionParametersResponse> showRedistributionParametersAsyncInvoker(
        ShowRedistributionParametersRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showRedistributionParameters, hcClient);
    }

    /**
     * 查询实时会话概览
     *
     * 查询数据库实例节点的实时会话概览信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionOverviewRequest 请求对象
     * @return CompletableFuture<ShowSessionOverviewResponse>
     */
    public CompletableFuture<ShowSessionOverviewResponse> showSessionOverviewAsync(ShowSessionOverviewRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSessionOverview);
    }

    /**
     * 查询实时会话概览
     *
     * 查询数据库实例节点的实时会话概览信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionOverviewRequest 请求对象
     * @return AsyncInvoker<ShowSessionOverviewRequest, ShowSessionOverviewResponse>
     */
    public AsyncInvoker<ShowSessionOverviewRequest, ShowSessionOverviewResponse> showSessionOverviewAsyncInvoker(
        ShowSessionOverviewRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSessionOverview, hcClient);
    }

    /**
     * 获取分片的磁盘使用信息
     *
     * 获取分片的磁盘使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardDiskMessagesRequest 请求对象
     * @return CompletableFuture<ShowShardDiskMessagesResponse>
     */
    public CompletableFuture<ShowShardDiskMessagesResponse> showShardDiskMessagesAsync(
        ShowShardDiskMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showShardDiskMessages);
    }

    /**
     * 获取分片的磁盘使用信息
     *
     * 获取分片的磁盘使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardDiskMessagesRequest 请求对象
     * @return AsyncInvoker<ShowShardDiskMessagesRequest, ShowShardDiskMessagesResponse>
     */
    public AsyncInvoker<ShowShardDiskMessagesRequest, ShowShardDiskMessagesResponse> showShardDiskMessagesAsyncInvoker(
        ShowShardDiskMessagesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showShardDiskMessages, hcClient);
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
     * 查询SQL执行计划信息
     *
     * 查询等待事件的SQL执行计划信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlPlanRequest 请求对象
     * @return CompletableFuture<ShowSlowSqlPlanResponse>
     */
    public CompletableFuture<ShowSlowSqlPlanResponse> showSlowSqlPlanAsync(ShowSlowSqlPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowSqlPlan);
    }

    /**
     * 查询SQL执行计划信息
     *
     * 查询等待事件的SQL执行计划信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlPlanRequest 请求对象
     * @return AsyncInvoker<ShowSlowSqlPlanRequest, ShowSlowSqlPlanResponse>
     */
    public AsyncInvoker<ShowSlowSqlPlanRequest, ShowSlowSqlPlanResponse> showSlowSqlPlanAsyncInvoker(
        ShowSlowSqlPlanRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowSqlPlan, hcClient);
    }

    /**
     * 查询SQL堆栈信息
     *
     * 查询等待事件的SQL堆栈信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlStackRequest 请求对象
     * @return CompletableFuture<ShowSlowSqlStackResponse>
     */
    public CompletableFuture<ShowSlowSqlStackResponse> showSlowSqlStackAsync(ShowSlowSqlStackRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowSqlStack);
    }

    /**
     * 查询SQL堆栈信息
     *
     * 查询等待事件的SQL堆栈信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlStackRequest 请求对象
     * @return AsyncInvoker<ShowSlowSqlStackRequest, ShowSlowSqlStackResponse>
     */
    public AsyncInvoker<ShowSlowSqlStackRequest, ShowSlowSqlStackResponse> showSlowSqlStackAsyncInvoker(
        ShowSlowSqlStackRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowSqlStack, hcClient);
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
     * 协调节点缩容
     *
     * 协调节点缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkCnRequest 请求对象
     * @return CompletableFuture<ShrinkCnResponse>
     */
    public CompletableFuture<ShrinkCnResponse> shrinkCnAsync(ShrinkCnRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.shrinkCn);
    }

    /**
     * 协调节点缩容
     *
     * 协调节点缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkCnRequest 请求对象
     * @return AsyncInvoker<ShrinkCnRequest, ShrinkCnResponse>
     */
    public AsyncInvoker<ShrinkCnRequest, ShrinkCnResponse> shrinkCnAsyncInvoker(ShrinkCnRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.shrinkCn, hcClient);
    }

    /**
     * 启动实例/节点
     *
     * 启动实例/节点。
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
     * 启动实例/节点
     *
     * 启动实例/节点。
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
     * 结束空闲会话
     *
     * 结束空闲会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFreeSessionRequest 请求对象
     * @return CompletableFuture<StopFreeSessionResponse>
     */
    public CompletableFuture<StopFreeSessionResponse> stopFreeSessionAsync(StopFreeSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopFreeSession);
    }

    /**
     * 结束空闲会话
     *
     * 结束空闲会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFreeSessionRequest 请求对象
     * @return AsyncInvoker<StopFreeSessionRequest, StopFreeSessionResponse>
     */
    public AsyncInvoker<StopFreeSessionRequest, StopFreeSessionResponse> stopFreeSessionAsyncInvoker(
        StopFreeSessionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopFreeSession, hcClient);
    }

    /**
     * 停止实例/节点
     *
     * 停止数据库，同时支持节点级别的停止操作。
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
     * 停止实例/节点
     *
     * 停止数据库，同时支持节点级别的停止操作。
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
     * 结束会话
     *
     * 查杀指定会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSessionRequest 请求对象
     * @return CompletableFuture<StopSessionResponse>
     */
    public CompletableFuture<StopSessionResponse> stopSessionAsync(StopSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopSession);
    }

    /**
     * 结束会话
     *
     * 查杀指定会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSessionRequest 请求对象
     * @return AsyncInvoker<StopSessionRequest, StopSessionResponse>
     */
    public AsyncInvoker<StopSessionRequest, StopSessionResponse> stopSessionAsyncInvoker(StopSessionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopSession, hcClient);
    }

    /**
     * 手动结束事务
     *
     * 手动结束事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTransactionRequest 请求对象
     * @return CompletableFuture<StopTransactionResponse>
     */
    public CompletableFuture<StopTransactionResponse> stopTransactionAsync(StopTransactionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopTransaction);
    }

    /**
     * 手动结束事务
     *
     * 手动结束事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTransactionRequest 请求对象
     * @return AsyncInvoker<StopTransactionRequest, StopTransactionResponse>
     */
    public AsyncInvoker<StopTransactionRequest, StopTransactionResponse> stopTransactionAsyncInvoker(
        StopTransactionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopTransaction, hcClient);
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
     * 开启透明加密
     *
     * 开启透明加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchKmsTdeRequest 请求对象
     * @return CompletableFuture<SwitchKmsTdeResponse>
     */
    public CompletableFuture<SwitchKmsTdeResponse> switchKmsTdeAsync(SwitchKmsTdeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchKmsTde);
    }

    /**
     * 开启透明加密
     *
     * 开启透明加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchKmsTdeRequest 请求对象
     * @return AsyncInvoker<SwitchKmsTdeRequest, SwitchKmsTdeResponse>
     */
    public AsyncInvoker<SwitchKmsTdeRequest, SwitchKmsTdeResponse> switchKmsTdeAsyncInvoker(
        SwitchKmsTdeRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchKmsTde, hcClient);
    }

    /**
     * 修改错误日志采集开关状态
     *
     * 打开或者关闭数据库错误日志采集的开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchLogCollectionStatusRequest 请求对象
     * @return CompletableFuture<SwitchLogCollectionStatusResponse>
     */
    public CompletableFuture<SwitchLogCollectionStatusResponse> switchLogCollectionStatusAsync(
        SwitchLogCollectionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchLogCollectionStatus);
    }

    /**
     * 修改错误日志采集开关状态
     *
     * 打开或者关闭数据库错误日志采集的开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchLogCollectionStatusRequest 请求对象
     * @return AsyncInvoker<SwitchLogCollectionStatusRequest, SwitchLogCollectionStatusResponse>
     */
    public AsyncInvoker<SwitchLogCollectionStatusRequest, SwitchLogCollectionStatusResponse> switchLogCollectionStatusAsyncInvoker(
        SwitchLogCollectionStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchLogCollectionStatus, hcClient);
    }

    /**
     * 分布式实例一主一备一日志形态切换到一主两备形态
     *
     * 当前只支持分布式独立部署一主一备一日志切换至一主两备形态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchReplicaRequest 请求对象
     * @return CompletableFuture<SwitchReplicaResponse>
     */
    public CompletableFuture<SwitchReplicaResponse> switchReplicaAsync(SwitchReplicaRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchReplica);
    }

    /**
     * 分布式实例一主一备一日志形态切换到一主两备形态
     *
     * 当前只支持分布式独立部署一主一备一日志切换至一主两备形态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchReplicaRequest 请求对象
     * @return AsyncInvoker<SwitchReplicaRequest, SwitchReplicaResponse>
     */
    public AsyncInvoker<SwitchReplicaRequest, SwitchReplicaResponse> switchReplicaAsyncInvoker(
        SwitchReplicaRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchReplica, hcClient);
    }

    /**
     * 分片节点主备切换
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
     * 分片节点主备切换
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
     * 更新委托权限策略
     *
     * 更新委托权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyPolicyRequest 请求对象
     * @return CompletableFuture<UpdateAgencyPolicyResponse>
     */
    public CompletableFuture<UpdateAgencyPolicyResponse> updateAgencyPolicyAsync(UpdateAgencyPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateAgencyPolicy);
    }

    /**
     * 更新委托权限策略
     *
     * 更新委托权限策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAgencyPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateAgencyPolicyRequest, UpdateAgencyPolicyResponse>
     */
    public AsyncInvoker<UpdateAgencyPolicyRequest, UpdateAgencyPolicyResponse> updateAgencyPolicyAsyncInvoker(
        UpdateAgencyPolicyRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateAgencyPolicy, hcClient);
    }

    /**
     * 修改扩容优化参数
     *
     * 修改扩容优化参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpansionParametersRequest 请求对象
     * @return CompletableFuture<UpdateExpansionParametersResponse>
     */
    public CompletableFuture<UpdateExpansionParametersResponse> updateExpansionParametersAsync(
        UpdateExpansionParametersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateExpansionParameters);
    }

    /**
     * 修改扩容优化参数
     *
     * 修改扩容优化参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpansionParametersRequest 请求对象
     * @return AsyncInvoker<UpdateExpansionParametersRequest, UpdateExpansionParametersResponse>
     */
    public AsyncInvoker<UpdateExpansionParametersRequest, UpdateExpansionParametersResponse> updateExpansionParametersAsyncInvoker(
        UpdateExpansionParametersRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateExpansionParameters, hcClient);
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
     * 修改实例别名
     *
     * 创建或修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAliasRequest 请求对象
     * @return CompletableFuture<UpdateInstanceAliasResponse>
     */
    public CompletableFuture<UpdateInstanceAliasResponse> updateInstanceAliasAsync(UpdateInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceAlias);
    }

    /**
     * 修改实例别名
     *
     * 创建或修改实例备注。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceAliasRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceAliasRequest, UpdateInstanceAliasResponse>
     */
    public AsyncInvoker<UpdateInstanceAliasRequest, UpdateInstanceAliasResponse> updateInstanceAliasAsyncInvoker(
        UpdateInstanceAliasRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceAlias, hcClient);
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
     * 实例内核版本升级
     *
     * GaussDB实例版本升级。包括灰度升级，就地升级，热补丁升级等三种升级方式。 
     * 
     * - 就地升级：
     * 
     *   就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 
     * - 灰度升级： 
     * 
     *   每个主DN或者CN组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。灰度升级支持升级自动提交和升级待观察两种操作方式。
     * 
     *   - 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 
     *   - 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。
     * 
     *     - 升级阶段可以根据部署方式细分为按分片或者按AZ的滚动升级。
     * 
     *       - 分布式实例：根据分片数滚动升级。
     *       - 集中式实例：根据AZ数进行滚动升级。 
     *     
     *     - 提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级或者升级回退。
     * 
     *       - 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 
     *       - 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 
     * - 热补丁升级
     * 
     *   - 升级自动提交：热补丁自动升级并提交，中间无业务中断。
     * 
     *   - 升级回退：热补丁回退，无业务中断时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceVersionsRequest 请求对象
     * @return CompletableFuture<UpdateInstanceVersionsResponse>
     */
    public CompletableFuture<UpdateInstanceVersionsResponse> updateInstanceVersionsAsync(
        UpdateInstanceVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceVersions);
    }

    /**
     * 实例内核版本升级
     *
     * GaussDB实例版本升级。包括灰度升级，就地升级，热补丁升级等三种升级方式。 
     * 
     * - 就地升级：
     * 
     *   就地升级需要停止业务进行，会一次性升级集群中所有节点。就地升级需要暂停业务30分钟来升级。 
     * 
     * - 灰度升级： 
     * 
     *   每个主DN或者CN组件升级就有一次10秒业务中断。升级过程均是先管理面，再数据面，由备到主的升级方式。灰度升级支持升级自动提交和升级待观察两种操作方式。
     * 
     *   - 升级自动提交：所有节点进程一起升级，在升级过程中有大概10秒的业务中断，不阻塞其他业务操作。 
     * 
     *   - 升级待观察：升级待观察，将数据库升级过程细分为升级，提交两个阶段。
     * 
     *     - 升级阶段可以根据部署方式细分为按分片或者按AZ的滚动升级。
     * 
     *       - 分布式实例：根据分片数滚动升级。
     *       - 集中式实例：根据AZ数进行滚动升级。 
     *     
     *     - 提交阶段可以对升级完成后的实例进行业务测试，根据需要可以选择提交升级或者升级回退。
     * 
     *       - 提交升级：提交升级。在升级完成，进入提交阶段时。业务测试正常后提交升级，完成本次升级流程。
     * 
     *       - 升级回退：升级回退，在升级完成，进入提交阶段时。可以根据需要回退本次升级，回退到升级前的版本。
     * 
     * - 热补丁升级
     * 
     *   - 升级自动提交：热补丁自动升级并提交，中间无业务中断。
     * 
     *   - 升级回退：热补丁回退，无业务中断时间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceVersionsRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceVersionsRequest, UpdateInstanceVersionsResponse>
     */
    public AsyncInvoker<UpdateInstanceVersionsRequest, UpdateInstanceVersionsResponse> updateInstanceVersionsAsyncInvoker(
        UpdateInstanceVersionsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceVersions, hcClient);
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
     * 修改重分布参数
     *
     * 修改重分布参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRedistributionControlRequest 请求对象
     * @return CompletableFuture<UpdateRedistributionControlResponse>
     */
    public CompletableFuture<UpdateRedistributionControlResponse> updateRedistributionControlAsync(
        UpdateRedistributionControlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateRedistributionControl);
    }

    /**
     * 修改重分布参数
     *
     * 修改重分布参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRedistributionControlRequest 请求对象
     * @return AsyncInvoker<UpdateRedistributionControlRequest, UpdateRedistributionControlResponse>
     */
    public AsyncInvoker<UpdateRedistributionControlRequest, UpdateRedistributionControlResponse> updateRedistributionControlAsyncInvoker(
        UpdateRedistributionControlRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateRedistributionControl, hcClient);
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
     * 变更实例规格
     *
     * 变更实例规格
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
     * 变更实例规格
     *
     * 变更实例规格
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
     * 采集ASP报告
     *
     * 采集ASP报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAspRequest 请求对象
     * @return CompletableFuture<CollectAspResponse>
     */
    public CompletableFuture<CollectAspResponse> collectAspAsync(CollectAspRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.collectAsp);
    }

    /**
     * 采集ASP报告
     *
     * 采集ASP报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAspRequest 请求对象
     * @return AsyncInvoker<CollectAspRequest, CollectAspResponse>
     */
    public AsyncInvoker<CollectAspRequest, CollectAspResponse> collectAspAsyncInvoker(CollectAspRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.collectAsp, hcClient);
    }

    /**
     * 查询asp采集结果
     *
     * 查询ASP采集结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAspInfosRequest 请求对象
     * @return CompletableFuture<ListAspInfosResponse>
     */
    public CompletableFuture<ListAspInfosResponse> listAspInfosAsync(ListAspInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listAspInfos);
    }

    /**
     * 查询asp采集结果
     *
     * 查询ASP采集结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAspInfosRequest 请求对象
     * @return AsyncInvoker<ListAspInfosRequest, ListAspInfosResponse>
     */
    public AsyncInvoker<ListAspInfosRequest, ListAspInfosResponse> listAspInfosAsyncInvoker(
        ListAspInfosRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listAspInfos, hcClient);
    }

    /**
     * 查询ASP开关状态
     *
     * 查询ASP开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAspStatusRequest 请求对象
     * @return CompletableFuture<ShowAspStatusResponse>
     */
    public CompletableFuture<ShowAspStatusResponse> showAspStatusAsync(ShowAspStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showAspStatus);
    }

    /**
     * 查询ASP开关状态
     *
     * 查询ASP开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAspStatusRequest 请求对象
     * @return AsyncInvoker<ShowAspStatusRequest, ShowAspStatusResponse>
     */
    public AsyncInvoker<ShowAspStatusRequest, ShowAspStatusResponse> showAspStatusAsyncInvoker(
        ShowAspStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showAspStatus, hcClient);
    }

    /**
     * 打开或者关闭ASP开关
     *
     * 打开或者关闭ASP开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAspStatusRequest 请求对象
     * @return CompletableFuture<SwitchAspStatusResponse>
     */
    public CompletableFuture<SwitchAspStatusResponse> switchAspStatusAsync(SwitchAspStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchAspStatus);
    }

    /**
     * 打开或者关闭ASP开关
     *
     * 打开或者关闭ASP开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAspStatusRequest 请求对象
     * @return AsyncInvoker<SwitchAspStatusRequest, SwitchAspStatusResponse>
     */
    public AsyncInvoker<SwitchAspStatusRequest, SwitchAspStatusResponse> switchAspStatusAsyncInvoker(
        SwitchAspStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchAspStatus, hcClient);
    }

    /**
     * 关联LTS日志流
     *
     * 关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindLtsConfigRequest 请求对象
     * @return CompletableFuture<BindLtsConfigResponse>
     */
    public CompletableFuture<BindLtsConfigResponse> bindLtsConfigAsync(BindLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.bindLtsConfig);
    }

    /**
     * 关联LTS日志流
     *
     * 关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindLtsConfigRequest 请求对象
     * @return AsyncInvoker<BindLtsConfigRequest, BindLtsConfigResponse>
     */
    public AsyncInvoker<BindLtsConfigRequest, BindLtsConfigResponse> bindLtsConfigAsyncInvoker(
        BindLtsConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.bindLtsConfig, hcClient);
    }

    /**
     * 查看LTS日志配置信息
     *
     * 查看LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return CompletableFuture<ListLtsConfigsResponse>
     */
    public CompletableFuture<ListLtsConfigsResponse> listLtsConfigsAsync(ListLtsConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listLtsConfigs);
    }

    /**
     * 查看LTS日志配置信息
     *
     * 查看LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return AsyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse>
     */
    public AsyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigsAsyncInvoker(
        ListLtsConfigsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listLtsConfigs, hcClient);
    }

    /**
     * 解除关联LTS日志流
     *
     * 解除关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindLtsConfigRequest 请求对象
     * @return CompletableFuture<UnbindLtsConfigResponse>
     */
    public CompletableFuture<UnbindLtsConfigResponse> unbindLtsConfigAsync(UnbindLtsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.unbindLtsConfig);
    }

    /**
     * 解除关联LTS日志流
     *
     * 解除关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindLtsConfigRequest 请求对象
     * @return AsyncInvoker<UnbindLtsConfigRequest, UnbindLtsConfigResponse>
     */
    public AsyncInvoker<UnbindLtsConfigRequest, UnbindLtsConfigResponse> unbindLtsConfigAsyncInvoker(
        UnbindLtsConfigRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.unbindLtsConfig, hcClient);
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
     * 创建SQL限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitTaskRequest 请求对象
     * @return CompletableFuture<CreateSqlLimitTaskResponse>
     */
    public CompletableFuture<CreateSqlLimitTaskResponse> createSqlLimitTaskAsync(CreateSqlLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createSqlLimitTask);
    }

    /**
     * 创建SQL限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitTaskRequest 请求对象
     * @return AsyncInvoker<CreateSqlLimitTaskRequest, CreateSqlLimitTaskResponse>
     */
    public AsyncInvoker<CreateSqlLimitTaskRequest, CreateSqlLimitTaskResponse> createSqlLimitTaskAsyncInvoker(
        CreateSqlLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createSqlLimitTask, hcClient);
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
     * 删除SQL限流任务
     *
     * 根据task_id进行SQL限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitTaskRequest 请求对象
     * @return CompletableFuture<DeleteSqlLimitTaskResponse>
     */
    public CompletableFuture<DeleteSqlLimitTaskResponse> deleteSqlLimitTaskAsync(DeleteSqlLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.deleteSqlLimitTask);
    }

    /**
     * 删除SQL限流任务
     *
     * 根据task_id进行SQL限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitTaskRequest 请求对象
     * @return AsyncInvoker<DeleteSqlLimitTaskRequest, DeleteSqlLimitTaskResponse>
     */
    public AsyncInvoker<DeleteSqlLimitTaskRequest, DeleteSqlLimitTaskResponse> deleteSqlLimitTaskAsyncInvoker(
        DeleteSqlLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.deleteSqlLimitTask, hcClient);
    }

    /**
     * 导出全量单条SQL记录列表
     *
     * 导出GaussDB数据库实例全量SQL日志记录列表，支持增强型条件过滤。 如可对SQL文本（query字段）进行多条件合并查询，可对db_time、cpu_time、data_io_time及execution_time字段进行大于、小于、区间范围等条件的过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlListRequest 请求对象
     * @return CompletableFuture<ExportFullSqlListResponse>
     */
    public CompletableFuture<ExportFullSqlListResponse> exportFullSqlListAsync(ExportFullSqlListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.exportFullSqlList);
    }

    /**
     * 导出全量单条SQL记录列表
     *
     * 导出GaussDB数据库实例全量SQL日志记录列表，支持增强型条件过滤。 如可对SQL文本（query字段）进行多条件合并查询，可对db_time、cpu_time、data_io_time及execution_time字段进行大于、小于、区间范围等条件的过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlListRequest 请求对象
     * @return AsyncInvoker<ExportFullSqlListRequest, ExportFullSqlListResponse>
     */
    public AsyncInvoker<ExportFullSqlListRequest, ExportFullSqlListResponse> exportFullSqlListAsyncInvoker(
        ExportFullSqlListRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.exportFullSqlList, hcClient);
    }

    /**
     * 导出实例全量SQL聚合统计列表
     *
     * 导出GaussDB数据库实例全量SQL聚合统计列表，主要统计各唯一SQL ID下的SQL记录总数量以及相关时间指标的平均值。支持增强型条件过滤， 如可以对SQL文本（query字段）进行多条件合并查询，对total_sql_time、sql_count字段进行大于、小于、区间范围等条件的过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlStatisticsRequest 请求对象
     * @return CompletableFuture<ExportFullSqlStatisticsResponse>
     */
    public CompletableFuture<ExportFullSqlStatisticsResponse> exportFullSqlStatisticsAsync(
        ExportFullSqlStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.exportFullSqlStatistics);
    }

    /**
     * 导出实例全量SQL聚合统计列表
     *
     * 导出GaussDB数据库实例全量SQL聚合统计列表，主要统计各唯一SQL ID下的SQL记录总数量以及相关时间指标的平均值。支持增强型条件过滤， 如可以对SQL文本（query字段）进行多条件合并查询，对total_sql_time、sql_count字段进行大于、小于、区间范围等条件的过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlStatisticsRequest 请求对象
     * @return AsyncInvoker<ExportFullSqlStatisticsRequest, ExportFullSqlStatisticsResponse>
     */
    public AsyncInvoker<ExportFullSqlStatisticsRequest, ExportFullSqlStatisticsResponse> exportFullSqlStatisticsAsyncInvoker(
        ExportFullSqlStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.exportFullSqlStatistics, hcClient);
    }

    /**
     * 导出慢SQL列表
     *
     * 导出慢SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlListRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlListResponse>
     */
    public CompletableFuture<ExportSlowSqlListResponse> exportSlowSqlListAsync(ExportSlowSqlListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.exportSlowSqlList);
    }

    /**
     * 导出慢SQL列表
     *
     * 导出慢SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlListRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlListRequest, ExportSlowSqlListResponse>
     */
    public AsyncInvoker<ExportSlowSqlListRequest, ExportSlowSqlListResponse> exportSlowSqlListAsyncInvoker(
        ExportSlowSqlListRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.exportSlowSqlList, hcClient);
    }

    /**
     * 查询实例全量SQL聚合统计列表
     *
     * 查询GaussDB数据库实例全量SQL聚合统计列表，主要统计各唯一SQL ID下的SQL记录总数量以及相关时间指标的平均值。支持增强型条件过滤， 如可以对SQL文本（query字段）进行多条件合并查询，对total_sql_time、sql_count字段进行大于、小于、区间范围等条件的过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlStatisticsRequest 请求对象
     * @return CompletableFuture<ListEnhanceFullSqlStatisticsResponse>
     */
    public CompletableFuture<ListEnhanceFullSqlStatisticsResponse> listEnhanceFullSqlStatisticsAsync(
        ListEnhanceFullSqlStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listEnhanceFullSqlStatistics);
    }

    /**
     * 查询实例全量SQL聚合统计列表
     *
     * 查询GaussDB数据库实例全量SQL聚合统计列表，主要统计各唯一SQL ID下的SQL记录总数量以及相关时间指标的平均值。支持增强型条件过滤， 如可以对SQL文本（query字段）进行多条件合并查询，对total_sql_time、sql_count字段进行大于、小于、区间范围等条件的过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlStatisticsRequest 请求对象
     * @return AsyncInvoker<ListEnhanceFullSqlStatisticsRequest, ListEnhanceFullSqlStatisticsResponse>
     */
    public AsyncInvoker<ListEnhanceFullSqlStatisticsRequest, ListEnhanceFullSqlStatisticsResponse> listEnhanceFullSqlStatisticsAsyncInvoker(
        ListEnhanceFullSqlStatisticsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listEnhanceFullSqlStatistics, hcClient);
    }

    /**
     * 查询全量单条SQL记录列表
     *
     * 查询GaussDB数据库实例全量SQL日志记录列表，支持增强型条件过滤。 如可对SQL文本（query字段）进行多条件合并查询，可对db_time、cpu_time、data_io_time及execution_time字段进行大于、小于、区间范围等条件的过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlsRequest 请求对象
     * @return CompletableFuture<ListEnhanceFullSqlsResponse>
     */
    public CompletableFuture<ListEnhanceFullSqlsResponse> listEnhanceFullSqlsAsync(ListEnhanceFullSqlsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listEnhanceFullSqls);
    }

    /**
     * 查询全量单条SQL记录列表
     *
     * 查询GaussDB数据库实例全量SQL日志记录列表，支持增强型条件过滤。 如可对SQL文本（query字段）进行多条件合并查询，可对db_time、cpu_time、data_io_time及execution_time字段进行大于、小于、区间范围等条件的过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlsRequest 请求对象
     * @return AsyncInvoker<ListEnhanceFullSqlsRequest, ListEnhanceFullSqlsResponse>
     */
    public AsyncInvoker<ListEnhanceFullSqlsRequest, ListEnhanceFullSqlsResponse> listEnhanceFullSqlsAsyncInvoker(
        ListEnhanceFullSqlsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listEnhanceFullSqls, hcClient);
    }

    /**
     * 查询全量SQL开关记录
     *
     * 查询全量SQL开关记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlSwitchesRequest 请求对象
     * @return CompletableFuture<ListFullSqlSwitchesResponse>
     */
    public CompletableFuture<ListFullSqlSwitchesResponse> listFullSqlSwitchesAsync(ListFullSqlSwitchesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listFullSqlSwitches);
    }

    /**
     * 查询全量SQL开关记录
     *
     * 查询全量SQL开关记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlSwitchesRequest 请求对象
     * @return AsyncInvoker<ListFullSqlSwitchesRequest, ListFullSqlSwitchesResponse>
     */
    public AsyncInvoker<ListFullSqlSwitchesRequest, ListFullSqlSwitchesResponse> listFullSqlSwitchesAsyncInvoker(
        ListFullSqlSwitchesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listFullSqlSwitches, hcClient);
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
     * 查询慢SQL详情
     *
     * 根据归一化SQLID，查询该SQL模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlDetailsRequest 请求对象
     * @return CompletableFuture<ListSlowSqlDetailsResponse>
     */
    public CompletableFuture<ListSlowSqlDetailsResponse> listSlowSqlDetailsAsync(ListSlowSqlDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSlowSqlDetails);
    }

    /**
     * 查询慢SQL详情
     *
     * 根据归一化SQLID，查询该SQL模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlDetailsRequest 请求对象
     * @return AsyncInvoker<ListSlowSqlDetailsRequest, ListSlowSqlDetailsResponse>
     */
    public AsyncInvoker<ListSlowSqlDetailsRequest, ListSlowSqlDetailsResponse> listSlowSqlDetailsAsyncInvoker(
        ListSlowSqlDetailsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSlowSqlDetails, hcClient);
    }

    /**
     * 查询慢SQL列表
     *
     * 查询慢SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlsRequest 请求对象
     * @return CompletableFuture<ListSlowSqlsResponse>
     */
    public CompletableFuture<ListSlowSqlsResponse> listSlowSqlsAsync(ListSlowSqlsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSlowSqls);
    }

    /**
     * 查询慢SQL列表
     *
     * 查询慢SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlsRequest 请求对象
     * @return AsyncInvoker<ListSlowSqlsRequest, ListSlowSqlsResponse>
     */
    public AsyncInvoker<ListSlowSqlsRequest, ListSlowSqlsResponse> listSlowSqlsAsyncInvoker(
        ListSlowSqlsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSlowSqls, hcClient);
    }

    /**
     * 查询慢SQL节点信息
     *
     * 根据实例ID查询慢SQL节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlExcuteNodesRequest 请求对象
     * @return CompletableFuture<ListSqlExcuteNodesResponse>
     */
    public CompletableFuture<ListSqlExcuteNodesResponse> listSqlExcuteNodesAsync(ListSqlExcuteNodesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlExcuteNodes);
    }

    /**
     * 查询慢SQL节点信息
     *
     * 根据实例ID查询慢SQL节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlExcuteNodesRequest 请求对象
     * @return AsyncInvoker<ListSqlExcuteNodesRequest, ListSqlExcuteNodesResponse>
     */
    public AsyncInvoker<ListSqlExcuteNodesRequest, ListSqlExcuteNodesResponse> listSqlExcuteNodesAsyncInvoker(
        ListSqlExcuteNodesRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlExcuteNodes, hcClient);
    }

    /**
     * 根据指定条件查询SQL限流任务列表
     *
     * 根据指定条件查询SQL限流任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitTaskRequest 请求对象
     * @return CompletableFuture<ListSqlLimitTaskResponse>
     */
    public CompletableFuture<ListSqlLimitTaskResponse> listSqlLimitTaskAsync(ListSqlLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlLimitTask);
    }

    /**
     * 根据指定条件查询SQL限流任务列表
     *
     * 根据指定条件查询SQL限流任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitTaskRequest 请求对象
     * @return AsyncInvoker<ListSqlLimitTaskRequest, ListSqlLimitTaskResponse>
     */
    public AsyncInvoker<ListSqlLimitTaskRequest, ListSqlLimitTaskResponse> listSqlLimitTaskAsyncInvoker(
        ListSqlLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlLimitTask, hcClient);
    }

    /**
     * 查询SQL执行计划绑定情况
     *
     * 查询SQL执行计划绑定情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlPlanActionRequest 请求对象
     * @return CompletableFuture<ListSqlPlanActionResponse>
     */
    public CompletableFuture<ListSqlPlanActionResponse> listSqlPlanActionAsync(ListSqlPlanActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlPlanAction);
    }

    /**
     * 查询SQL执行计划绑定情况
     *
     * 查询SQL执行计划绑定情况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlPlanActionRequest 请求对象
     * @return AsyncInvoker<ListSqlPlanActionRequest, ListSqlPlanActionResponse>
     */
    public AsyncInvoker<ListSqlPlanActionRequest, ListSqlPlanActionResponse> listSqlPlanActionAsyncInvoker(
        ListSqlPlanActionRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlPlanAction, hcClient);
    }

    /**
     * 查询SQL链路信息
     *
     * 要用于查询SQL某次执行（对应归一化SQL ID和唯一SQL ID传值）过程中的全部链路信息，包含各个阶段的多维度耗时统计。对于分布式版实例，可查询对应SQL的完整执行链路，包含CN和DN上SQL语句的耗时分析。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTraceRequest 请求对象
     * @return CompletableFuture<ListSqlTraceResponse>
     */
    public CompletableFuture<ListSqlTraceResponse> listSqlTraceAsync(ListSqlTraceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlTrace);
    }

    /**
     * 查询SQL链路信息
     *
     * 要用于查询SQL某次执行（对应归一化SQL ID和唯一SQL ID传值）过程中的全部链路信息，包含各个阶段的多维度耗时统计。对于分布式版实例，可查询对应SQL的完整执行链路，包含CN和DN上SQL语句的耗时分析。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTraceRequest 请求对象
     * @return AsyncInvoker<ListSqlTraceRequest, ListSqlTraceResponse>
     */
    public AsyncInvoker<ListSqlTraceRequest, ListSqlTraceResponse> listSqlTraceAsyncInvoker(
        ListSqlTraceRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlTrace, hcClient);
    }

    /**
     * 查询单条SQL详情
     *
     * 查询单条SQL详情。对于分布式版实例，可查询对应SQL的完整执行记录，包含CN和DN上SQL语句执行历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullSqlRequest 请求对象
     * @return CompletableFuture<ShowFullSqlResponse>
     */
    public CompletableFuture<ShowFullSqlResponse> showFullSqlAsync(ShowFullSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showFullSql);
    }

    /**
     * 查询单条SQL详情
     *
     * 查询单条SQL详情。对于分布式版实例，可查询对应SQL的完整执行记录，包含CN和DN上SQL语句执行历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullSqlRequest 请求对象
     * @return AsyncInvoker<ShowFullSqlRequest, ShowFullSqlResponse>
     */
    public AsyncInvoker<ShowFullSqlRequest, ShowFullSqlResponse> showFullSqlAsyncInvoker(ShowFullSqlRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showFullSql, hcClient);
    }

    /**
     * 查询全局慢SQL详情
     *
     * 根据唯一SQLID，查询指定组件的慢SQL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalSlowSqlDetailRequest 请求对象
     * @return CompletableFuture<ShowGlobalSlowSqlDetailResponse>
     */
    public CompletableFuture<ShowGlobalSlowSqlDetailResponse> showGlobalSlowSqlDetailAsync(
        ShowGlobalSlowSqlDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showGlobalSlowSqlDetail);
    }

    /**
     * 查询全局慢SQL详情
     *
     * 根据唯一SQLID，查询指定组件的慢SQL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalSlowSqlDetailRequest 请求对象
     * @return AsyncInvoker<ShowGlobalSlowSqlDetailRequest, ShowGlobalSlowSqlDetailResponse>
     */
    public AsyncInvoker<ShowGlobalSlowSqlDetailRequest, ShowGlobalSlowSqlDetailResponse> showGlobalSlowSqlDetailAsyncInvoker(
        ShowGlobalSlowSqlDetailRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showGlobalSlowSqlDetail, hcClient);
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
     * 查询SQL限流任务详情
     *
     * 查询SQL限流任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitTaskRequest 请求对象
     * @return CompletableFuture<ShowSqlLimitTaskResponse>
     */
    public CompletableFuture<ShowSqlLimitTaskResponse> showSqlLimitTaskAsync(ShowSqlLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSqlLimitTask);
    }

    /**
     * 查询SQL限流任务详情
     *
     * 查询SQL限流任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitTaskRequest 请求对象
     * @return AsyncInvoker<ShowSqlLimitTaskRequest, ShowSqlLimitTaskResponse>
     */
    public AsyncInvoker<ShowSqlLimitTaskRequest, ShowSqlLimitTaskResponse> showSqlLimitTaskAsyncInvoker(
        ShowSqlLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSqlLimitTask, hcClient);
    }

    /**
     * 开启全量SQL或修改默认配置
     *
     * 开启全量SQL功能。使实例Agent侧开启内核侧全量SQL能力，持续化采集GaussDB数据库实例上的执行SQL语句，定时批量持久化存储于LTS云服务对应日志流中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFullSqlRequest 请求对象
     * @return CompletableFuture<StartFullSqlResponse>
     */
    public CompletableFuture<StartFullSqlResponse> startFullSqlAsync(StartFullSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.startFullSql);
    }

    /**
     * 开启全量SQL或修改默认配置
     *
     * 开启全量SQL功能。使实例Agent侧开启内核侧全量SQL能力，持续化采集GaussDB数据库实例上的执行SQL语句，定时批量持久化存储于LTS云服务对应日志流中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFullSqlRequest 请求对象
     * @return AsyncInvoker<StartFullSqlRequest, StartFullSqlResponse>
     */
    public AsyncInvoker<StartFullSqlRequest, StartFullSqlResponse> startFullSqlAsyncInvoker(
        StartFullSqlRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.startFullSql, hcClient);
    }

    /**
     * 关闭全量SQL功能
     *
     * 关闭全量SQL功能。关闭后，实例Agent侧将停止内核侧全量SQL语句记录的实时采集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFullSqlRequest 请求对象
     * @return CompletableFuture<StopFullSqlResponse>
     */
    public CompletableFuture<StopFullSqlResponse> stopFullSqlAsync(StopFullSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.stopFullSql);
    }

    /**
     * 关闭全量SQL功能
     *
     * 关闭全量SQL功能。关闭后，实例Agent侧将停止内核侧全量SQL语句记录的实时采集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFullSqlRequest 请求对象
     * @return AsyncInvoker<StopFullSqlRequest, StopFullSqlResponse>
     */
    public AsyncInvoker<StopFullSqlRequest, StopFullSqlResponse> stopFullSqlAsyncInvoker(StopFullSqlRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.stopFullSql, hcClient);
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

    /**
     * 修改SQL限流任务
     *
     * 根据新的条件进行SQL限流任务的更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitTaskRequest 请求对象
     * @return CompletableFuture<UpdateSqlLimitTaskResponse>
     */
    public CompletableFuture<UpdateSqlLimitTaskResponse> updateSqlLimitTaskAsync(UpdateSqlLimitTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.updateSqlLimitTask);
    }

    /**
     * 修改SQL限流任务
     *
     * 根据新的条件进行SQL限流任务的更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitTaskRequest 请求对象
     * @return AsyncInvoker<UpdateSqlLimitTaskRequest, UpdateSqlLimitTaskResponse>
     */
    public AsyncInvoker<UpdateSqlLimitTaskRequest, UpdateSqlLimitTaskResponse> updateSqlLimitTaskAsyncInvoker(
        UpdateSqlLimitTaskRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.updateSqlLimitTask, hcClient);
    }

    /**
     * 查询SQL PATCH
     *
     * 查询SQL PATCH信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlPatchRequest 请求对象
     * @return CompletableFuture<ShowSqlPatchResponse>
     */
    public CompletableFuture<ShowSqlPatchResponse> showSqlPatchAsync(ShowSqlPatchRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showSqlPatch);
    }

    /**
     * 查询SQL PATCH
     *
     * 查询SQL PATCH信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlPatchRequest 请求对象
     * @return AsyncInvoker<ShowSqlPatchRequest, ShowSqlPatchResponse>
     */
    public AsyncInvoker<ShowSqlPatchRequest, ShowSqlPatchResponse> showSqlPatchAsyncInvoker(
        ShowSqlPatchRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showSqlPatch, hcClient);
    }

    /**
     * 导出TopSQL列表。
     *
     * 导出TopSQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlListRequest 请求对象
     * @return CompletableFuture<ExportTopSqlListResponse>
     */
    public CompletableFuture<ExportTopSqlListResponse> exportTopSqlListAsync(ExportTopSqlListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.exportTopSqlList);
    }

    /**
     * 导出TopSQL列表。
     *
     * 导出TopSQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlListRequest 请求对象
     * @return AsyncInvoker<ExportTopSqlListRequest, ExportTopSqlListResponse>
     */
    public AsyncInvoker<ExportTopSqlListRequest, ExportTopSqlListResponse> exportTopSqlListAsyncInvoker(
        ExportTopSqlListRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.exportTopSqlList, hcClient);
    }

    /**
     * 查询TopSQL列表
     *
     * 查询TopSQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSqlsRequest 请求对象
     * @return CompletableFuture<ListTopSqlsResponse>
     */
    public CompletableFuture<ListTopSqlsResponse> listTopSqlsAsync(ListTopSqlsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listTopSqls);
    }

    /**
     * 查询TopSQL列表
     *
     * 查询TopSQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSqlsRequest 请求对象
     * @return AsyncInvoker<ListTopSqlsRequest, ListTopSqlsResponse>
     */
    public AsyncInvoker<ListTopSqlsRequest, ListTopSqlsResponse> listTopSqlsAsyncInvoker(ListTopSqlsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listTopSqls, hcClient);
    }

    /**
     * 采集WDR快照报告
     *
     * 采集WDR快照报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectWdrSnapshotRequest 请求对象
     * @return CompletableFuture<CollectWdrSnapshotResponse>
     */
    public CompletableFuture<CollectWdrSnapshotResponse> collectWdrSnapshotAsync(CollectWdrSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.collectWdrSnapshot);
    }

    /**
     * 采集WDR快照报告
     *
     * 采集WDR快照报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectWdrSnapshotRequest 请求对象
     * @return AsyncInvoker<CollectWdrSnapshotRequest, CollectWdrSnapshotResponse>
     */
    public AsyncInvoker<CollectWdrSnapshotRequest, CollectWdrSnapshotResponse> collectWdrSnapshotAsyncInvoker(
        CollectWdrSnapshotRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.collectWdrSnapshot, hcClient);
    }

    /**
     * 生成WDR快照
     *
     * 生成WDR快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrSnapshotRequest 请求对象
     * @return CompletableFuture<CreateWdrSnapshotResponse>
     */
    public CompletableFuture<CreateWdrSnapshotResponse> createWdrSnapshotAsync(CreateWdrSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.createWdrSnapshot);
    }

    /**
     * 生成WDR快照
     *
     * 生成WDR快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrSnapshotRequest 请求对象
     * @return AsyncInvoker<CreateWdrSnapshotRequest, CreateWdrSnapshotResponse>
     */
    public AsyncInvoker<CreateWdrSnapshotRequest, CreateWdrSnapshotResponse> createWdrSnapshotAsyncInvoker(
        CreateWdrSnapshotRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.createWdrSnapshot, hcClient);
    }

    /**
     * 查询WDR快照报告采集结果
     *
     * 查询GaussDB实例的WDR快照采集结果。调用客户端侧要进行OBS和APIG的host配置，确保能正常访问OBS桶。
     * 注意，最多支持查询3天内的结果数据。结果中的报告下载链接，有效时间为30分钟，过期将无法下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWdrSnapshotsCollectResultsRequest 请求对象
     * @return CompletableFuture<ListWdrSnapshotsCollectResultsResponse>
     */
    public CompletableFuture<ListWdrSnapshotsCollectResultsResponse> listWdrSnapshotsCollectResultsAsync(
        ListWdrSnapshotsCollectResultsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.listWdrSnapshotsCollectResults);
    }

    /**
     * 查询WDR快照报告采集结果
     *
     * 查询GaussDB实例的WDR快照采集结果。调用客户端侧要进行OBS和APIG的host配置，确保能正常访问OBS桶。
     * 注意，最多支持查询3天内的结果数据。结果中的报告下载链接，有效时间为30分钟，过期将无法下载。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWdrSnapshotsCollectResultsRequest 请求对象
     * @return AsyncInvoker<ListWdrSnapshotsCollectResultsRequest, ListWdrSnapshotsCollectResultsResponse>
     */
    public AsyncInvoker<ListWdrSnapshotsCollectResultsRequest, ListWdrSnapshotsCollectResultsResponse> listWdrSnapshotsCollectResultsAsyncInvoker(
        ListWdrSnapshotsCollectResultsRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.listWdrSnapshotsCollectResults, hcClient);
    }

    /**
     * 查询WDR快照开关状态
     *
     * 查询WDR快照开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotStatusRequest 请求对象
     * @return CompletableFuture<ShowWdrSnapshotStatusResponse>
     */
    public CompletableFuture<ShowWdrSnapshotStatusResponse> showWdrSnapshotStatusAsync(
        ShowWdrSnapshotStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.showWdrSnapshotStatus);
    }

    /**
     * 查询WDR快照开关状态
     *
     * 查询WDR快照开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotStatusRequest 请求对象
     * @return AsyncInvoker<ShowWdrSnapshotStatusRequest, ShowWdrSnapshotStatusResponse>
     */
    public AsyncInvoker<ShowWdrSnapshotStatusRequest, ShowWdrSnapshotStatusResponse> showWdrSnapshotStatusAsyncInvoker(
        ShowWdrSnapshotStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.showWdrSnapshotStatus, hcClient);
    }

    /**
     * 打开或关闭WDR快照开关
     *
     * 打开或关闭WDR快照开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchWdrSnapshotStatusRequest 请求对象
     * @return CompletableFuture<SwitchWdrSnapshotStatusResponse>
     */
    public CompletableFuture<SwitchWdrSnapshotStatusResponse> switchWdrSnapshotStatusAsync(
        SwitchWdrSnapshotStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforopenGaussMeta.switchWdrSnapshotStatus);
    }

    /**
     * 打开或关闭WDR快照开关
     *
     * 打开或关闭WDR快照开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchWdrSnapshotStatusRequest 请求对象
     * @return AsyncInvoker<SwitchWdrSnapshotStatusRequest, SwitchWdrSnapshotStatusResponse>
     */
    public AsyncInvoker<SwitchWdrSnapshotStatusRequest, SwitchWdrSnapshotStatusResponse> switchWdrSnapshotStatusAsyncInvoker(
        SwitchWdrSnapshotStatusRequest request) {
        return new AsyncInvoker<>(request, GaussDBforopenGaussMeta.switchWdrSnapshotStatus, hcClient);
    }

}

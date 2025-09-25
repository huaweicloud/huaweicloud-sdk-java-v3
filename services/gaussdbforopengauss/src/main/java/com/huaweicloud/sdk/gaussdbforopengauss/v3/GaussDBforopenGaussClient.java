package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportSlowSqlRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ExportSlowSqlResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.InstallKernelPluginResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionStatisticsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSessionStatisticsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlDetailsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlDetailsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSlowSqlsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlExcuteNodesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlExcuteNodesResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlLimitTaskRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListSqlLimitTaskResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTasksResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopSqlsRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTopSqlsResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTransactionRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListTransactionResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListWaitEventRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListWaitEventResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyAutoEnlargePolicyRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyAutoEnlargePolicyResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyEpsQuotaResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyHbaConfRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyHbaConfResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyHotfixesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ModifyHotfixesResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreHbaInfoRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.RestoreHbaInfoResponse;
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
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateExpansionParametersRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateExpansionParametersResponse;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesRequest;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.UpdateFeaturesResponse;
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

public class GaussDBforopenGaussClient {

    protected HcClient hcClient;

    public GaussDBforopenGaussClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforopenGaussClient> newBuilder() {
        ClientBuilder<GaussDBforopenGaussClient> clientBuilder = new ClientBuilder<>(GaussDBforopenGaussClient::new);
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
     * @return AddHbaConfsResponse
     */
    public AddHbaConfsResponse addHbaConfs(AddHbaConfsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.addHbaConfs);
    }

    /**
     * 新增客户端接入认证配置
     *
     * 新增客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddHbaConfsRequest 请求对象
     * @return SyncInvoker<AddHbaConfsRequest, AddHbaConfsResponse>
     */
    public SyncInvoker<AddHbaConfsRequest, AddHbaConfsResponse> addHbaConfsInvoker(AddHbaConfsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.addHbaConfs, hcClient);
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return AddInstanceTagsResponse
     */
    public AddInstanceTagsResponse addInstanceTags(AddInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.addInstanceTags);
    }

    /**
     * 添加实例标签。
     *
     * 对指定实例添加用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceTagsRequest 请求对象
     * @return SyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse>
     */
    public SyncInvoker<AddInstanceTagsRequest, AddInstanceTagsResponse> addInstanceTagsInvoker(
        AddInstanceTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.addInstanceTags, hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return AllowDbPrivilegesResponse
     */
    public AllowDbPrivilegesResponse allowDbPrivileges(AllowDbPrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.allowDbPrivileges);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbPrivilegesRequest 请求对象
     * @return SyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse>
     */
    public SyncInvoker<AllowDbPrivilegesRequest, AllowDbPrivilegesResponse> allowDbPrivilegesInvoker(
        AllowDbPrivilegesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.allowDbPrivileges, hcClient);
    }

    /**
     * 授权数据库角色
     *
     * 在数据库中设置角色的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbRolePrivilegesRequest 请求对象
     * @return AllowDbRolePrivilegesResponse
     */
    public AllowDbRolePrivilegesResponse allowDbRolePrivileges(AllowDbRolePrivilegesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.allowDbRolePrivileges);
    }

    /**
     * 授权数据库角色
     *
     * 在数据库中设置角色的权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AllowDbRolePrivilegesRequest 请求对象
     * @return SyncInvoker<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse>
     */
    public SyncInvoker<AllowDbRolePrivilegesRequest, AllowDbRolePrivilegesResponse> allowDbRolePrivilegesInvoker(
        AllowDbRolePrivilegesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.allowDbRolePrivileges, hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return AttachEipResponse
     */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.attachEip);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.attachEip, hcClient);
    }

    /**
     * 批量设置自动备份策略
     *
     * 批量设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetBackupPolicyRequest 请求对象
     * @return BatchSetBackupPolicyResponse
     */
    public BatchSetBackupPolicyResponse batchSetBackupPolicy(BatchSetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.batchSetBackupPolicy);
    }

    /**
     * 批量设置自动备份策略
     *
     * 批量设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetBackupPolicyRequest 请求对象
     * @return SyncInvoker<BatchSetBackupPolicyRequest, BatchSetBackupPolicyResponse>
     */
    public SyncInvoker<BatchSetBackupPolicyRequest, BatchSetBackupPolicyResponse> batchSetBackupPolicyInvoker(
        BatchSetBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.batchSetBackupPolicy, hcClient);
    }

    /**
     * 查询批量实例可升级的版本和升级类型
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUpgradeCandidateVersionsRequest 请求对象
     * @return BatchShowUpgradeCandidateVersionsResponse
     */
    public BatchShowUpgradeCandidateVersionsResponse batchShowUpgradeCandidateVersions(
        BatchShowUpgradeCandidateVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.batchShowUpgradeCandidateVersions);
    }

    /**
     * 查询批量实例可升级的版本和升级类型
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowUpgradeCandidateVersionsRequest 请求对象
     * @return SyncInvoker<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse>
     */
    public SyncInvoker<BatchShowUpgradeCandidateVersionsRequest, BatchShowUpgradeCandidateVersionsResponse> batchShowUpgradeCandidateVersionsInvoker(
        BatchShowUpgradeCandidateVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.batchShowUpgradeCandidateVersions, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.cancelScheduleTask);
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
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.cancelScheduleTask, hcClient);
    }

    /**
     * 备份恢复到目标实例数据后执行数据确认
     *
     * 确认备份恢复到目标实例的数据正常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmRestoredDataRequest 请求对象
     * @return ConfirmRestoredDataResponse
     */
    public ConfirmRestoredDataResponse confirmRestoredData(ConfirmRestoredDataRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.confirmRestoredData);
    }

    /**
     * 备份恢复到目标实例数据后执行数据确认
     *
     * 确认备份恢复到目标实例的数据正常。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ConfirmRestoredDataRequest 请求对象
     * @return SyncInvoker<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse>
     */
    public SyncInvoker<ConfirmRestoredDataRequest, ConfirmRestoredDataResponse> confirmRestoredDataInvoker(
        ConfirmRestoredDataRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.confirmRestoredData, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return CopyConfigurationResponse
     */
    public CopyConfigurationResponse copyConfiguration(CopyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CopyConfigurationRequest 请求对象
     * @return SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public SyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationInvoker(
        CopyConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return CreateConfigurationTemplateResponse
     */
    public CreateConfigurationTemplateResponse createConfigurationTemplate(CreateConfigurationTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createConfigurationTemplate);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConfigurationTemplateRequest 请求对象
     * @return SyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse>
     */
    public SyncInvoker<CreateConfigurationTemplateRequest, CreateConfigurationTemplateResponse> createConfigurationTemplateInvoker(
        CreateConfigurationTemplateRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createConfigurationTemplate, hcClient);
    }

    /**
     * 搭建容灾关系
     *
     * 搭建容灾关系（从主实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCrossCloudConstructDisasterRequest 请求对象
     * @return CreateCrossCloudConstructDisasterResponse
     */
    public CreateCrossCloudConstructDisasterResponse createCrossCloudConstructDisaster(
        CreateCrossCloudConstructDisasterRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createCrossCloudConstructDisaster);
    }

    /**
     * 搭建容灾关系
     *
     * 搭建容灾关系（从主实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCrossCloudConstructDisasterRequest 请求对象
     * @return SyncInvoker<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse>
     */
    public SyncInvoker<CreateCrossCloudConstructDisasterRequest, CreateCrossCloudConstructDisasterResponse> createCrossCloudConstructDisasterInvoker(
        CreateCrossCloudConstructDisasterRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createCrossCloudConstructDisaster, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseInstanceRequest 请求对象
     * @return CreateDatabaseInstanceResponse
     */
    public CreateDatabaseInstanceResponse createDatabaseInstance(CreateDatabaseInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabaseInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseInstanceRequest 请求对象
     * @return SyncInvoker<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse>
     */
    public SyncInvoker<CreateDatabaseInstanceRequest, CreateDatabaseInstanceResponse> createDatabaseInstanceInvoker(
        CreateDatabaseInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabaseInstance, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return CreateDatabaseSchemasResponse
     */
    public CreateDatabaseSchemasResponse createDatabaseSchemas(CreateDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDatabaseSchemas);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDatabaseSchemasRequest 请求对象
     * @return SyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse>
     */
    public SyncInvoker<CreateDatabaseSchemasRequest, CreateDatabaseSchemasResponse> createDatabaseSchemasInvoker(
        CreateDatabaseSchemasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDatabaseSchemas, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return CreateDbInstanceResponse
     */
    public CreateDbInstanceResponse createDbInstance(CreateDbInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbInstanceRequest 请求对象
     * @return SyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse>
     */
    public SyncInvoker<CreateDbInstanceRequest, CreateDbInstanceResponse> createDbInstanceInvoker(
        CreateDbInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDbInstance, hcClient);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbRoleRequest 请求对象
     * @return CreateDbRoleResponse
     */
    public CreateDbRoleResponse createDbRole(CreateDbRoleRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDbRole);
    }

    /**
     * 创建数据库角色
     *
     * 创建数据库角色。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbRoleRequest 请求对象
     * @return SyncInvoker<CreateDbRoleRequest, CreateDbRoleResponse>
     */
    public SyncInvoker<CreateDbRoleRequest, CreateDbRoleResponse> createDbRoleInvoker(CreateDbRoleRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDbRole, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse
     */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createDbUser, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例，仅支持IAM5的新平面认证方式（AK/SK认证方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussDbInstanceRequest 请求对象
     * @return CreateGaussDbInstanceResponse
     */
    public CreateGaussDbInstanceResponse createGaussDbInstance(CreateGaussDbInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createGaussDbInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例，仅支持IAM5的新平面认证方式（AK/SK认证方式）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGaussDbInstanceRequest 请求对象
     * @return SyncInvoker<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse>
     */
    public SyncInvoker<CreateGaussDbInstanceRequest, CreateGaussDbInstanceResponse> createGaussDbInstanceInvoker(
        CreateGaussDbInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createGaussDbInstance, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库企业版和集中式实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createInstance, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateManualBackupRequest 请求对象
     * @return SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createManualBackup, hcClient);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReadonlyNodesRequest 请求对象
     * @return CreateReadonlyNodesResponse
     */
    public CreateReadonlyNodesResponse createReadonlyNodes(CreateReadonlyNodesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createReadonlyNodes);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReadonlyNodesRequest 请求对象
     * @return SyncInvoker<CreateReadonlyNodesRequest, CreateReadonlyNodesResponse>
     */
    public SyncInvoker<CreateReadonlyNodesRequest, CreateReadonlyNodesResponse> createReadonlyNodesInvoker(
        CreateReadonlyNodesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createReadonlyNodes, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return CreateRestoreInstanceResponse
     */
    public CreateRestoreInstanceResponse createRestoreInstance(CreateRestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 根据备份恢复新实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRestoreInstanceRequest 请求对象
     * @return SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceInvoker(
        CreateRestoreInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createRestoreInstance, hcClient);
    }

    /**
     * 批量实例内核版本定时升级
     *
     * 批量实例内核版本定时升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return CreateScheduleTaskResponse
     */
    public CreateScheduleTaskResponse createScheduleTask(CreateScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createScheduleTask);
    }

    /**
     * 批量实例内核版本定时升级
     *
     * 批量实例内核版本定时升级
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleTaskRequest 请求对象
     * @return SyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse>
     */
    public SyncInvoker<CreateScheduleTaskRequest, CreateScheduleTaskResponse> createScheduleTaskInvoker(
        CreateScheduleTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createScheduleTask, hcClient);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return CreateSlowLogDownloadResponse
     */
    public CreateSlowLogDownloadResponse createSlowLogDownload(CreateSlowLogDownloadRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createSlowLogDownload);
    }

    /**
     * 创建慢日志下载信息
     *
     * 创建慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSlowLogDownloadRequest 请求对象
     * @return SyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse>
     */
    public SyncInvoker<CreateSlowLogDownloadRequest, CreateSlowLogDownloadResponse> createSlowLogDownloadInvoker(
        CreateSlowLogDownloadRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createSlowLogDownload, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除指定实例的数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除数据库SCHEMA
     *
     * 删除数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseSchemaRequest 请求对象
     * @return DeleteDatabaseSchemaResponse
     */
    public DeleteDatabaseSchemaResponse deleteDatabaseSchema(DeleteDatabaseSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteDatabaseSchema);
    }

    /**
     * 删除数据库SCHEMA
     *
     * 删除数据库schema。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDatabaseSchemaRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse>
     */
    public SyncInvoker<DeleteDatabaseSchemaRequest, DeleteDatabaseSchemaResponse> deleteDatabaseSchemaInvoker(
        DeleteDatabaseSchemaRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteDatabaseSchema, hcClient);
    }

    /**
     * 删除客户端接入认证配置
     *
     * 删除客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHbaConfsRequest 请求对象
     * @return DeleteHbaConfsResponse
     */
    public DeleteHbaConfsResponse deleteHbaConfs(DeleteHbaConfsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteHbaConfs);
    }

    /**
     * 删除客户端接入认证配置
     *
     * 删除客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHbaConfsRequest 请求对象
     * @return SyncInvoker<DeleteHbaConfsRequest, DeleteHbaConfsResponse>
     */
    public SyncInvoker<DeleteHbaConfsRequest, DeleteHbaConfsResponse> deleteHbaConfsInvoker(
        DeleteHbaConfsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteHbaConfs, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstance);
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
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstance, hcClient);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return DeleteInstanceTagResponse
     */
    public DeleteInstanceTagResponse deleteInstanceTag(DeleteInstanceTagRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstanceTag);
    }

    /**
     * 删除实例标签
     *
     * 删除实例标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceTagRequest 请求对象
     * @return SyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse>
     */
    public SyncInvoker<DeleteInstanceTagRequest, DeleteInstanceTagResponse> deleteInstanceTagInvoker(
        DeleteInstanceTagRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteInstanceTag, hcClient);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return DeleteJobResponse
     */
    public DeleteJobResponse deleteJob(DeleteJobRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteJob);
    }

    /**
     * 删除任务记录
     *
     * 删除任务记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRequest 请求对象
     * @return SyncInvoker<DeleteJobRequest, DeleteJobResponse>
     */
    public SyncInvoker<DeleteJobRequest, DeleteJobResponse> deleteJobInvoker(DeleteJobRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteJob, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse
     */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteManualBackup, hcClient);
    }

    /**
     * 删除只读节点
     *
     * 删除只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodesRequest 请求对象
     * @return DeleteReadonlyNodesResponse
     */
    public DeleteReadonlyNodesResponse deleteReadonlyNodes(DeleteReadonlyNodesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteReadonlyNodes);
    }

    /**
     * 删除只读节点
     *
     * 删除只读节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteReadonlyNodesRequest 请求对象
     * @return SyncInvoker<DeleteReadonlyNodesRequest, DeleteReadonlyNodesResponse>
     */
    public SyncInvoker<DeleteReadonlyNodesRequest, DeleteReadonlyNodesResponse> deleteReadonlyNodesInvoker(
        DeleteReadonlyNodesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteReadonlyNodes, hcClient);
    }

    /**
     * 删除定时任务信息
     *
     * 删除定时任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return DeleteScheduleTaskResponse
     */
    public DeleteScheduleTaskResponse deleteScheduleTask(DeleteScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteScheduleTask);
    }

    /**
     * 删除定时任务信息
     *
     * 删除定时任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleTaskRequest 请求对象
     * @return SyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse>
     */
    public SyncInvoker<DeleteScheduleTaskRequest, DeleteScheduleTaskResponse> deleteScheduleTaskInvoker(
        DeleteScheduleTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteScheduleTask, hcClient);
    }

    /**
     * 分片缩容
     *
     * 数据库分片缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShardingRequest 请求对象
     * @return DeleteShardingResponse
     */
    public DeleteShardingResponse deleteSharding(DeleteShardingRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteSharding);
    }

    /**
     * 分片缩容
     *
     * 数据库分片缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShardingRequest 请求对象
     * @return SyncInvoker<DeleteShardingRequest, DeleteShardingResponse>
     */
    public SyncInvoker<DeleteShardingRequest, DeleteShardingResponse> deleteShardingInvoker(
        DeleteShardingRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteSharding, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return DownloadBackupResponse
     */
    public DownloadBackupResponse downloadBackup(DownloadBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.downloadBackup);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBackupRequest 请求对象
     * @return SyncInvoker<DownloadBackupRequest, DownloadBackupResponse>
     */
    public SyncInvoker<DownloadBackupRequest, DownloadBackupResponse> downloadBackupInvoker(
        DownloadBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.downloadBackup, hcClient);
    }

    /**
     * 主实例结束容灾日志保持
     *
     * 结束stream流式容灾的日志保持功能，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheEndRequest 请求对象
     * @return ExecuteCrossCloudDisasterDataCacheEndResponse
     */
    public ExecuteCrossCloudDisasterDataCacheEndResponse executeCrossCloudDisasterDataCacheEnd(
        ExecuteCrossCloudDisasterDataCacheEndRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheEnd);
    }

    /**
     * 主实例结束容灾日志保持
     *
     * 结束stream流式容灾的日志保持功能，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheEndRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterDataCacheEndRequest, ExecuteCrossCloudDisasterDataCacheEndResponse> executeCrossCloudDisasterDataCacheEndInvoker(
        ExecuteCrossCloudDisasterDataCacheEndRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheEnd, hcClient);
    }

    /**
     * 开始日志保持
     *
     * 主实例开始容灾日志保持，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheStartRequest 请求对象
     * @return ExecuteCrossCloudDisasterDataCacheStartResponse
     */
    public ExecuteCrossCloudDisasterDataCacheStartResponse executeCrossCloudDisasterDataCacheStart(
        ExecuteCrossCloudDisasterDataCacheStartRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheStart);
    }

    /**
     * 开始日志保持
     *
     * 主实例开始容灾日志保持，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterDataCacheStartRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterDataCacheStartRequest, ExecuteCrossCloudDisasterDataCacheStartResponse> executeCrossCloudDisasterDataCacheStartInvoker(
        ExecuteCrossCloudDisasterDataCacheStartRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterDataCacheStart, hcClient);
    }

    /**
     * 结束容灾演练
     *
     * 灾备实例结束容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterEndSimulationRequest 请求对象
     * @return ExecuteCrossCloudDisasterEndSimulationResponse
     */
    public ExecuteCrossCloudDisasterEndSimulationResponse executeCrossCloudDisasterEndSimulation(
        ExecuteCrossCloudDisasterEndSimulationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterEndSimulation);
    }

    /**
     * 结束容灾演练
     *
     * 灾备实例结束容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterEndSimulationRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterEndSimulationRequest, ExecuteCrossCloudDisasterEndSimulationResponse> executeCrossCloudDisasterEndSimulationInvoker(
        ExecuteCrossCloudDisasterEndSimulationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterEndSimulation, hcClient);
    }

    /**
     * 备实例容灾升主
     *
     * 容灾升主failover（灾备实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRecoveryFailoverRequest 请求对象
     * @return ExecuteCrossCloudDisasterRecoveryFailoverResponse
     */
    public ExecuteCrossCloudDisasterRecoveryFailoverResponse executeCrossCloudDisasterRecoveryFailover(
        ExecuteCrossCloudDisasterRecoveryFailoverRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRecoveryFailover);
    }

    /**
     * 备实例容灾升主
     *
     * 容灾升主failover（灾备实例端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRecoveryFailoverRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterRecoveryFailoverRequest, ExecuteCrossCloudDisasterRecoveryFailoverResponse> executeCrossCloudDisasterRecoveryFailoverInvoker(
        ExecuteCrossCloudDisasterRecoveryFailoverRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRecoveryFailover, hcClient);
    }

    /**
     * 重建容灾关系
     *
     * 流容灾备升主选择支持容灾回切，实现容灾关系的重建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRestoreRequest 请求对象
     * @return ExecuteCrossCloudDisasterRestoreResponse
     */
    public ExecuteCrossCloudDisasterRestoreResponse executeCrossCloudDisasterRestore(
        ExecuteCrossCloudDisasterRestoreRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRestore);
    }

    /**
     * 重建容灾关系
     *
     * 流容灾备升主选择支持容灾回切，实现容灾关系的重建任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterRestoreRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterRestoreRequest, ExecuteCrossCloudDisasterRestoreResponse> executeCrossCloudDisasterRestoreInvoker(
        ExecuteCrossCloudDisasterRestoreRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterRestore, hcClient);
    }

    /**
     * 开始容灾演练
     *
     * 开始容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterStartSimulationRequest 请求对象
     * @return ExecuteCrossCloudDisasterStartSimulationResponse
     */
    public ExecuteCrossCloudDisasterStartSimulationResponse executeCrossCloudDisasterStartSimulation(
        ExecuteCrossCloudDisasterStartSimulationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterStartSimulation);
    }

    /**
     * 开始容灾演练
     *
     * 开始容灾演练，目前只有stream流容灾支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterStartSimulationRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterStartSimulationRequest, ExecuteCrossCloudDisasterStartSimulationResponse> executeCrossCloudDisasterStartSimulationInvoker(
        ExecuteCrossCloudDisasterStartSimulationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterStartSimulation, hcClient);
    }

    /**
     * 灾备实例主从切换
     *
     * 容灾switchover（可在主备任一一端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterSwitchoverRequest 请求对象
     * @return ExecuteCrossCloudDisasterSwitchoverResponse
     */
    public ExecuteCrossCloudDisasterSwitchoverResponse executeCrossCloudDisasterSwitchover(
        ExecuteCrossCloudDisasterSwitchoverRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterSwitchover);
    }

    /**
     * 灾备实例主从切换
     *
     * 容灾switchover（可在主备任一一端下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudDisasterSwitchoverRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse>
     */
    public SyncInvoker<ExecuteCrossCloudDisasterSwitchoverRequest, ExecuteCrossCloudDisasterSwitchoverResponse> executeCrossCloudDisasterSwitchoverInvoker(
        ExecuteCrossCloudDisasterSwitchoverRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudDisasterSwitchover, hcClient);
    }

    /**
     * 解除容灾关系
     *
     * 解除容灾（从容灾主集群下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudReleaseDisasterRequest 请求对象
     * @return ExecuteCrossCloudReleaseDisasterResponse
     */
    public ExecuteCrossCloudReleaseDisasterResponse executeCrossCloudReleaseDisaster(
        ExecuteCrossCloudReleaseDisasterRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.executeCrossCloudReleaseDisaster);
    }

    /**
     * 解除容灾关系
     *
     * 解除容灾（从容灾主集群下发）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteCrossCloudReleaseDisasterRequest 请求对象
     * @return SyncInvoker<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse>
     */
    public SyncInvoker<ExecuteCrossCloudReleaseDisasterRequest, ExecuteCrossCloudReleaseDisasterResponse> executeCrossCloudReleaseDisasterInvoker(
        ExecuteCrossCloudReleaseDisasterRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.executeCrossCloudReleaseDisaster, hcClient);
    }

    /**
     * 导出表信息
     *
     * 导出表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlRequest 请求对象
     * @return ExportSlowSqlResponse
     */
    public ExportSlowSqlResponse exportSlowSql(ExportSlowSqlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.exportSlowSql);
    }

    /**
     * 导出表信息
     *
     * 导出表信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlRequest, ExportSlowSqlResponse>
     */
    public SyncInvoker<ExportSlowSqlRequest, ExportSlowSqlResponse> exportSlowSqlInvoker(ExportSlowSqlRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.exportSlowSql, hcClient);
    }

    /**
     * 安装插件
     *
     * 安装插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallKernelPluginRequest 请求对象
     * @return InstallKernelPluginResponse
     */
    public InstallKernelPluginResponse installKernelPlugin(InstallKernelPluginRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.installKernelPlugin);
    }

    /**
     * 安装插件
     *
     * 安装插件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InstallKernelPluginRequest 请求对象
     * @return SyncInvoker<InstallKernelPluginRequest, InstallKernelPluginResponse>
     */
    public SyncInvoker<InstallKernelPluginRequest, InstallKernelPluginResponse> installKernelPluginInvoker(
        InstallKernelPluginRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.installKernelPlugin, hcClient);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return ListApplicableInstancesResponse
     */
    public ListApplicableInstancesResponse listApplicableInstances(ListApplicableInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listApplicableInstances);
    }

    /**
     * 查询可应用实例列表
     *
     * 查询可应用当前参数组模板的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApplicableInstancesRequest 请求对象
     * @return SyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse>
     */
    public SyncInvoker<ListApplicableInstancesRequest, ListApplicableInstancesResponse> listApplicableInstancesInvoker(
        ListApplicableInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return ListAppliedHistoriesResponse
     */
    public ListAppliedHistoriesResponse listAppliedHistories(ListAppliedHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listAppliedHistories);
    }

    /**
     * 查询参数模板的应用记录
     *
     * 查询参数模板的应用记录，以实例级别为维度。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppliedHistoriesRequest 请求对象
     * @return SyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse>
     */
    public SyncInvoker<ListAppliedHistoriesRequest, ListAppliedHistoriesResponse> listAppliedHistoriesInvoker(
        ListAppliedHistoriesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listAppliedHistories, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return ListAvailableFlavorsResponse
     */
    public ListAvailableFlavorsResponse listAvailableFlavors(ListAvailableFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listAvailableFlavors);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailableFlavorsRequest 请求对象
     * @return SyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse>
     */
    public SyncInvoker<ListAvailableFlavorsRequest, ListAvailableFlavorsResponse> listAvailableFlavorsInvoker(
        ListAvailableFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listAvailableFlavors, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listBackups, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsDetailsRequest 请求对象
     * @return ListBackupsDetailsResponse
     */
    public ListBackupsDetailsResponse listBackupsDetails(ListBackupsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listBackupsDetails);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBackupsDetailsRequest 请求对象
     * @return SyncInvoker<ListBackupsDetailsRequest, ListBackupsDetailsResponse>
     */
    public SyncInvoker<ListBackupsDetailsRequest, ListBackupsDetailsResponse> listBackupsDetailsInvoker(
        ListBackupsDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listBackupsDetails, hcClient);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return ListBindedEipsResponse
     */
    public ListBindedEipsResponse listBindedEips(ListBindedEipsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listBindedEips);
    }

    /**
     * 查询实例已绑定EIP列表
     *
     * 查询实例已绑定EIP列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBindedEipsRequest 请求对象
     * @return SyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse>
     */
    public SyncInvoker<ListBindedEipsRequest, ListBindedEipsResponse> listBindedEipsInvoker(
        ListBindedEipsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listBindedEips, hcClient);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return ListCnInfosBeforeReduceResponse
     */
    public ListCnInfosBeforeReduceResponse listCnInfosBeforeReduce(ListCnInfosBeforeReduceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce);
    }

    /**
     * 查询协调节点列表
     *
     * 查询协调节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCnInfosBeforeReduceRequest 请求对象
     * @return SyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse>
     */
    public SyncInvoker<ListCnInfosBeforeReduceRequest, ListCnInfosBeforeReduceResponse> listCnInfosBeforeReduceInvoker(
        ListCnInfosBeforeReduceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listCnInfosBeforeReduce, hcClient);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return ListComponentInfosResponse
     */
    public ListComponentInfosResponse listComponentInfos(ListComponentInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listComponentInfos);
    }

    /**
     * 查询实例的组件列表
     *
     * 查询实例的组件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListComponentInfosRequest 请求对象
     * @return SyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse>
     */
    public SyncInvoker<ListComponentInfosRequest, ListComponentInfosResponse> listComponentInfosInvoker(
        ListComponentInfosRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listComponentInfos, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurations);
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
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurations, hcClient);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return ListConfigurationsDiffResponse
     */
    public ListConfigurationsDiffResponse listConfigurationsDiff(ListConfigurationsDiffRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listConfigurationsDiff);
    }

    /**
     * 比较两个参数组模板之间的差异
     *
     * 获取两个参数配置模板的差异列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConfigurationsDiffRequest 请求对象
     * @return SyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse>
     */
    public SyncInvoker<ListConfigurationsDiffRequest, ListConfigurationsDiffResponse> listConfigurationsDiffInvoker(
        ListConfigurationsDiffRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listConfigurationsDiff, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseInstancesRequest 请求对象
     * @return ListDatabaseInstancesResponse
     */
    public ListDatabaseInstancesResponse listDatabaseInstances(ListDatabaseInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseInstancesRequest 请求对象
     * @return SyncInvoker<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse>
     */
    public SyncInvoker<ListDatabaseInstancesRequest, ListDatabaseInstancesResponse> listDatabaseInstancesInvoker(
        ListDatabaseInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseInstances, hcClient);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return ListDatabaseRolesResponse
     */
    public ListDatabaseRolesResponse listDatabaseRoles(ListDatabaseRolesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseRoles);
    }

    /**
     * 查询数据库角色列表
     *
     * 查询数据库角色列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseRolesRequest 请求对象
     * @return SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse>
     */
    public SyncInvoker<ListDatabaseRolesRequest, ListDatabaseRolesResponse> listDatabaseRolesInvoker(
        ListDatabaseRolesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseRoles, hcClient);
    }

    /**
     * 查询数据库表列表
     *
     * 查询指定实例的数据库表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemaTablesRequest 请求对象
     * @return ListDatabaseSchemaTablesResponse
     */
    public ListDatabaseSchemaTablesResponse listDatabaseSchemaTables(ListDatabaseSchemaTablesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseSchemaTables);
    }

    /**
     * 查询数据库表列表
     *
     * 查询指定实例的数据库表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemaTablesRequest 请求对象
     * @return SyncInvoker<ListDatabaseSchemaTablesRequest, ListDatabaseSchemaTablesResponse>
     */
    public SyncInvoker<ListDatabaseSchemaTablesRequest, ListDatabaseSchemaTablesResponse> listDatabaseSchemaTablesInvoker(
        ListDatabaseSchemaTablesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseSchemaTables, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return ListDatabaseSchemasResponse
     */
    public ListDatabaseSchemasResponse listDatabaseSchemas(ListDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseSchemasRequest 请求对象
     * @return SyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse>
     */
    public SyncInvoker<ListDatabaseSchemasRequest, ListDatabaseSchemasResponse> listDatabaseSchemasInvoker(
        ListDatabaseSchemasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVersionsRequest 请求对象
     * @return ListDatabaseVersionsResponse
     */
    public ListDatabaseVersionsResponse listDatabaseVersions(ListDatabaseVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseVersions);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVersionsRequest 请求对象
     * @return SyncInvoker<ListDatabaseVersionsRequest, ListDatabaseVersionsResponse>
     */
    public SyncInvoker<ListDatabaseVersionsRequest, ListDatabaseVersionsResponse> listDatabaseVersionsInvoker(
        ListDatabaseVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseVersions, hcClient);
    }

    /**
     * 查询数据盘空间概况
     *
     * 查询数据盘空间概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVolumeSummaryRequest 请求对象
     * @return ListDatabaseVolumeSummaryResponse
     */
    public ListDatabaseVolumeSummaryResponse listDatabaseVolumeSummary(ListDatabaseVolumeSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabaseVolumeSummary);
    }

    /**
     * 查询数据盘空间概况
     *
     * 查询数据盘空间概况。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseVolumeSummaryRequest 请求对象
     * @return SyncInvoker<ListDatabaseVolumeSummaryRequest, ListDatabaseVolumeSummaryResponse>
     */
    public SyncInvoker<ListDatabaseVolumeSummaryRequest, ListDatabaseVolumeSummaryResponse> listDatabaseVolumeSummaryInvoker(
        ListDatabaseVolumeSummaryRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabaseVolumeSummary, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse
     */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询指定数据库引擎对应的版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatastores, hcClient);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresDetailsRequest 请求对象
     * @return ListDatastoresDetailsResponse
     */
    public ListDatastoresDetailsResponse listDatastoresDetails(ListDatastoresDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDatastoresDetails);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatastoresDetailsRequest 请求对象
     * @return SyncInvoker<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse>
     */
    public SyncInvoker<ListDatastoresDetailsRequest, ListDatastoresDetailsResponse> listDatastoresDetailsInvoker(
        ListDatastoresDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDatastoresDetails, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return ListDbBackupsResponse
     */
    public ListDbBackupsResponse listDbBackups(ListDbBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDbBackups);
    }

    /**
     * 查询备份列表
     *
     * 获取备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbBackupsRequest 请求对象
     * @return SyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse>
     */
    public SyncInvoker<ListDbBackupsRequest, ListDbBackupsResponse> listDbBackupsInvoker(ListDbBackupsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDbBackups, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return ListDbFlavorsResponse
     */
    public ListDbFlavorsResponse listDbFlavors(ListDbFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDbFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbFlavorsRequest 请求对象
     * @return SyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse>
     */
    public SyncInvoker<ListDbFlavorsRequest, ListDbFlavorsResponse> listDbFlavorsInvoker(ListDbFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDbFlavors, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDbUsers, hcClient);
    }

    /**
     * 查询操作记录
     *
     * 查询容灾操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoveryRecordRequest 请求对象
     * @return ListDisasterRecoveryRecordResponse
     */
    public ListDisasterRecoveryRecordResponse listDisasterRecoveryRecord(ListDisasterRecoveryRecordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listDisasterRecoveryRecord);
    }

    /**
     * 查询操作记录
     *
     * 查询容灾操作记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDisasterRecoveryRecordRequest 请求对象
     * @return SyncInvoker<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse>
     */
    public SyncInvoker<ListDisasterRecoveryRecordRequest, ListDisasterRecoveryRecordResponse> listDisasterRecoveryRecordInvoker(
        ListDisasterRecoveryRecordRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listDisasterRecoveryRecord, hcClient);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return ListEnterpriseProjectsResponse
     */
    public ListEnterpriseProjectsResponse listEnterpriseProjects(ListEnterpriseProjectsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listEnterpriseProjects);
    }

    /**
     * 查询企业项目列表
     *
     * 查询企业项目列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnterpriseProjectsRequest 请求对象
     * @return SyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse>
     */
    public SyncInvoker<ListEnterpriseProjectsRequest, ListEnterpriseProjectsResponse> listEnterpriseProjectsInvoker(
        ListEnterpriseProjectsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listEnterpriseProjects, hcClient);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return ListEpsQuotasResponse
     */
    public ListEpsQuotasResponse listEpsQuotas(ListEpsQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额组
     *
     * 查询企业项目配额组信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEpsQuotasRequest 请求对象
     * @return SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public SyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasInvoker(ListEpsQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listEpsQuotas, hcClient);
    }

    /**
     * 查询实例特性列表
     *
     * 查询当前实例高级特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return ListFeaturesResponse
     */
    public ListFeaturesResponse listFeatures(ListFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listFeatures);
    }

    /**
     * 查询实例特性列表
     *
     * 查询当前实例高级特性列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFeaturesRequest 请求对象
     * @return SyncInvoker<ListFeaturesRequest, ListFeaturesResponse>
     */
    public SyncInvoker<ListFeaturesRequest, ListFeaturesResponse> listFeaturesInvoker(ListFeaturesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listFeatures, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listFlavors, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsDetailsRequest 请求对象
     * @return ListFlavorsDetailsResponse
     */
    public ListFlavorsDetailsResponse listFlavorsDetails(ListFlavorsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listFlavorsDetails);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库的规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsDetailsRequest 请求对象
     * @return SyncInvoker<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse>
     */
    public SyncInvoker<ListFlavorsDetailsRequest, ListFlavorsDetailsResponse> listFlavorsDetailsInvoker(
        ListFlavorsDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listFlavorsDetails, hcClient);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return ListGaussDbDatastoresResponse
     */
    public ListGaussDbDatastoresResponse listGaussDbDatastores(ListGaussDbDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listGaussDbDatastores);
    }

    /**
     * 查询引擎列表
     *
     * 查询引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGaussDbDatastoresRequest 请求对象
     * @return SyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse>
     */
    public SyncInvoker<ListGaussDbDatastoresRequest, ListGaussDbDatastoresResponse> listGaussDbDatastoresInvoker(
        ListGaussDbDatastoresRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listGaussDbDatastores, hcClient);
    }

    /**
     * 查询客户端接入认证配置修改历史
     *
     * 查询实例的客户端接入认证配置修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfoHistoryRequest 请求对象
     * @return ListHbaInfoHistoryResponse
     */
    public ListHbaInfoHistoryResponse listHbaInfoHistory(ListHbaInfoHistoryRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listHbaInfoHistory);
    }

    /**
     * 查询客户端接入认证配置修改历史
     *
     * 查询实例的客户端接入认证配置修改历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfoHistoryRequest 请求对象
     * @return SyncInvoker<ListHbaInfoHistoryRequest, ListHbaInfoHistoryResponse>
     */
    public SyncInvoker<ListHbaInfoHistoryRequest, ListHbaInfoHistoryResponse> listHbaInfoHistoryInvoker(
        ListHbaInfoHistoryRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listHbaInfoHistory, hcClient);
    }

    /**
     * 查询客户端接入认证配置
     *
     * 查询客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfosRequest 请求对象
     * @return ListHbaInfosResponse
     */
    public ListHbaInfosResponse listHbaInfos(ListHbaInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listHbaInfos);
    }

    /**
     * 查询客户端接入认证配置
     *
     * 查询客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHbaInfosRequest 请求对象
     * @return SyncInvoker<ListHbaInfosRequest, ListHbaInfosResponse>
     */
    public SyncInvoker<ListHbaInfosRequest, ListHbaInfosResponse> listHbaInfosInvoker(ListHbaInfosRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listHbaInfos, hcClient);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return ListHistoryOperationsResponse
     */
    public ListHistoryOperationsResponse listHistoryOperations(ListHistoryOperationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listHistoryOperations);
    }

    /**
     * 查询参数模板的修改历史
     *
     * 查询参数模板的修改历史记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryOperationsRequest 请求对象
     * @return SyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse>
     */
    public SyncInvoker<ListHistoryOperationsRequest, ListHistoryOperationsResponse> listHistoryOperationsInvoker(
        ListHistoryOperationsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listHistoryOperations, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDetailsRequest 请求对象
     * @return ListInstanceDetailsResponse
     */
    public ListInstanceDetailsResponse listInstanceDetails(ListInstanceDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDetailsRequest 请求对象
     * @return SyncInvoker<ListInstanceDetailsRequest, ListInstanceDetailsResponse>
     */
    public SyncInvoker<ListInstanceDetailsRequest, ListInstanceDetailsResponse> listInstanceDetailsInvoker(
        ListInstanceDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceDetails, hcClient);
    }

    /**
     * 查看实例引擎版本分布
     *
     * 查看实例引擎版本分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceEngineDetailRequest 请求对象
     * @return ListInstanceEngineDetailResponse
     */
    public ListInstanceEngineDetailResponse listInstanceEngineDetail(ListInstanceEngineDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceEngineDetail);
    }

    /**
     * 查看实例引擎版本分布
     *
     * 查看实例引擎版本分布
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceEngineDetailRequest 请求对象
     * @return SyncInvoker<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse>
     */
    public SyncInvoker<ListInstanceEngineDetailRequest, ListInstanceEngineDetailResponse> listInstanceEngineDetailInvoker(
        ListInstanceEngineDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceEngineDetail, hcClient);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return ListInstanceErrorLogsResponse
     */
    public ListInstanceErrorLogsResponse listInstanceErrorLogs(ListInstanceErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceErrorLogs);
    }

    /**
     * 查询错误日志下载链接
     *
     * 查询数据库错误日志下载链接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceErrorLogsRequest 请求对象
     * @return SyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse>
     */
    public SyncInvoker<ListInstanceErrorLogsRequest, ListInstanceErrorLogsResponse> listInstanceErrorLogsInvoker(
        ListInstanceErrorLogsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceErrorLogs, hcClient);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstanceTags);
    }

    /**
     * 查询实例标签
     *
     * 查询指定实例的用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTagsRequest 请求对象
     * @return SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public SyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsInvoker(
        ListInstanceTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstances, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return ListInstancesDetailsResponse
     */
    public ListInstancesDetailsResponse listInstancesDetails(ListInstancesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstancesDetails);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     *
     * 查询数据库实例列表/查询实例详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesDetailsRequest 请求对象
     * @return SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse>
     */
    public SyncInvoker<ListInstancesDetailsRequest, ListInstancesDetailsResponse> listInstancesDetailsInvoker(
        ListInstancesDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listInstancesDetails, hcClient);
    }

    /**
     * 查询实例已安装的插件列表
     *
     * 查询实例已安装的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelPluginsRequest 请求对象
     * @return ListKernelPluginsResponse
     */
    public ListKernelPluginsResponse listKernelPlugins(ListKernelPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listKernelPlugins);
    }

    /**
     * 查询实例已安装的插件列表
     *
     * 查询实例已安装的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKernelPluginsRequest 请求对象
     * @return SyncInvoker<ListKernelPluginsRequest, ListKernelPluginsResponse>
     */
    public SyncInvoker<ListKernelPluginsRequest, ListKernelPluginsResponse> listKernelPluginsInvoker(
        ListKernelPluginsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listKernelPlugins, hcClient);
    }

    /**
     * 查询关键视图下发节点信息
     *
     * 查询该实例下可用于执行会话查杀功能的节点 (非日志类型的CN或DN节点) 和其所包含的CN、DN组件信息。该接口是会话查杀功能的前提，其返回值中的每一对节点和组件ID是后续查杀会话接口的入参。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyViewExecuteNodeRequest 请求对象
     * @return ListKeyViewExecuteNodeResponse
     */
    public ListKeyViewExecuteNodeResponse listKeyViewExecuteNode(ListKeyViewExecuteNodeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listKeyViewExecuteNode);
    }

    /**
     * 查询关键视图下发节点信息
     *
     * 查询该实例下可用于执行会话查杀功能的节点 (非日志类型的CN或DN节点) 和其所包含的CN、DN组件信息。该接口是会话查杀功能的前提，其返回值中的每一对节点和组件ID是后续查杀会话接口的入参。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKeyViewExecuteNodeRequest 请求对象
     * @return SyncInvoker<ListKeyViewExecuteNodeRequest, ListKeyViewExecuteNodeResponse>
     */
    public SyncInvoker<ListKeyViewExecuteNodeRequest, ListKeyViewExecuteNodeResponse> listKeyViewExecuteNodeInvoker(
        ListKeyViewExecuteNodeRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listKeyViewExecuteNode, hcClient);
    }

    /**
     * 查询KMS秘钥列表
     *
     * 查询当前可使用的kms秘钥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsTdeKeyRequest 请求对象
     * @return ListKmsTdeKeyResponse
     */
    public ListKmsTdeKeyResponse listKmsTdeKey(ListKmsTdeKeyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listKmsTdeKey);
    }

    /**
     * 查询KMS秘钥列表
     *
     * 查询当前可使用的kms秘钥列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListKmsTdeKeyRequest 请求对象
     * @return SyncInvoker<ListKmsTdeKeyRequest, ListKmsTdeKeyResponse>
     */
    public SyncInvoker<ListKmsTdeKeyRequest, ListKmsTdeKeyResponse> listKmsTdeKeyInvoker(ListKmsTdeKeyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listKmsTdeKey, hcClient);
    }

    /**
     * 查询实例列表指标
     *
     * 查询实例列表指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDatasRequest 请求对象
     * @return ListMetricDatasResponse
     */
    public ListMetricDatasResponse listMetricDatas(ListMetricDatasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listMetricDatas);
    }

    /**
     * 查询实例列表指标
     *
     * 查询实例列表指标。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetricDatasRequest 请求对象
     * @return SyncInvoker<ListMetricDatasRequest, ListMetricDatasResponse>
     */
    public SyncInvoker<ListMetricDatasRequest, ListMetricDatasResponse> listMetricDatasInvoker(
        ListMetricDatasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listMetricDatas, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return ListParamGroupTemplatesResponse
     */
    public ListParamGroupTemplatesResponse listParamGroupTemplates(ListParamGroupTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listParamGroupTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParamGroupTemplatesRequest 请求对象
     * @return SyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse>
     */
    public SyncInvoker<ListParamGroupTemplatesRequest, ListParamGroupTemplatesResponse> listParamGroupTemplatesInvoker(
        ListParamGroupTemplatesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listParamGroupTemplates, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParameterGroupTemplatesRequest 请求对象
     * @return ListParameterGroupTemplatesResponse
     */
    public ListParameterGroupTemplatesResponse listParameterGroupTemplates(ListParameterGroupTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listParameterGroupTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListParameterGroupTemplatesRequest 请求对象
     * @return SyncInvoker<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse>
     */
    public SyncInvoker<ListParameterGroupTemplatesRequest, ListParameterGroupTemplatesResponse> listParameterGroupTemplatesInvoker(
        ListParameterGroupTemplatesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listParameterGroupTemplates, hcClient);
    }

    /**
     * 查询实例插件拓展信息
     *
     * 查询实例插件拓展信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginExtensionsRequest 请求对象
     * @return ListPluginExtensionsResponse
     */
    public ListPluginExtensionsResponse listPluginExtensions(ListPluginExtensionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listPluginExtensions);
    }

    /**
     * 查询实例插件拓展信息
     *
     * 查询实例插件拓展信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPluginExtensionsRequest 请求对象
     * @return SyncInvoker<ListPluginExtensionsRequest, ListPluginExtensionsResponse>
     */
    public SyncInvoker<ListPluginExtensionsRequest, ListPluginExtensionsResponse> listPluginExtensionsInvoker(
        ListPluginExtensionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listPluginExtensions, hcClient);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return ListPredefinedTagsResponse
     */
    public ListPredefinedTagsResponse listPredefinedTags(ListPredefinedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listPredefinedTags);
    }

    /**
     * 查询预定义标签
     *
     * 查询预预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefinedTagsRequest 请求对象
     * @return SyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse>
     */
    public SyncInvoker<ListPredefinedTagsRequest, ListPredefinedTagsResponse> listPredefinedTagsInvoker(
        ListPredefinedTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listPredefinedTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目下所有用户标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listProjectTags, hcClient);
    }

    /**
     * 查询只读节点信息
     *
     * 查询实例的只读节点列表，以及实例可支持的最大只读节点数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReadonlyNodesRequest 请求对象
     * @return ListReadonlyNodesResponse
     */
    public ListReadonlyNodesResponse listReadonlyNodes(ListReadonlyNodesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listReadonlyNodes);
    }

    /**
     * 查询只读节点信息
     *
     * 查询实例的只读节点列表，以及实例可支持的最大只读节点数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListReadonlyNodesRequest 请求对象
     * @return SyncInvoker<ListReadonlyNodesRequest, ListReadonlyNodesResponse>
     */
    public SyncInvoker<ListReadonlyNodesRequest, ListReadonlyNodesResponse> listReadonlyNodesInvoker(
        ListReadonlyNodesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listReadonlyNodes, hcClient);
    }

    /**
     * 查询实时会话
     *
     * 查询数据库实例节点的实时会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRealTimeSessionsRequest 请求对象
     * @return ListRealTimeSessionsResponse
     */
    public ListRealTimeSessionsResponse listRealTimeSessions(ListRealTimeSessionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRealTimeSessions);
    }

    /**
     * 查询实时会话
     *
     * 查询数据库实例节点的实时会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRealTimeSessionsRequest 请求对象
     * @return SyncInvoker<ListRealTimeSessionsRequest, ListRealTimeSessionsResponse>
     */
    public SyncInvoker<ListRealTimeSessionsRequest, ListRealTimeSessionsResponse> listRealTimeSessionsInvoker(
        ListRealTimeSessionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRealTimeSessions, hcClient);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return ListRecycleInstancesResponse
     */
    public ListRecycleInstancesResponse listRecycleInstances(ListRecycleInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRecycleInstances);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public SyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesInvoker(
        ListRecycleInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesDetailsRequest 请求对象
     * @return ListRecycleInstancesDetailsResponse
     */
    public ListRecycleInstancesDetailsResponse listRecycleInstancesDetails(ListRecycleInstancesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRecycleInstancesDetails);
    }

    /**
     * 查询回收站所有引擎实例列表。
     *
     * 查询回收站所有引擎实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecycleInstancesDetailsRequest 请求对象
     * @return SyncInvoker<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse>
     */
    public SyncInvoker<ListRecycleInstancesDetailsRequest, ListRecycleInstancesDetailsResponse> listRecycleInstancesDetailsInvoker(
        ListRecycleInstancesDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRecycleInstancesDetails, hcClient);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return ListRestorableInstancesResponse
     */
    public ListRestorableInstancesResponse listRestorableInstances(ListRestorableInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRestorableInstances);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesRequest 请求对象
     * @return SyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse>
     */
    public SyncInvoker<ListRestorableInstancesRequest, ListRestorableInstancesResponse> listRestorableInstancesInvoker(
        ListRestorableInstancesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRestorableInstances, hcClient);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesDetailsRequest 请求对象
     * @return ListRestorableInstancesDetailsResponse
     */
    public ListRestorableInstancesDetailsResponse listRestorableInstancesDetails(
        ListRestorableInstancesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRestorableInstancesDetails);
    }

    /**
     * 查询可用于备份恢复的实例列表
     *
     * 查询可用于备份恢复的实例列表，实例信息要符合备份条件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRestorableInstancesDetailsRequest 请求对象
     * @return SyncInvoker<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse>
     */
    public SyncInvoker<ListRestorableInstancesDetailsRequest, ListRestorableInstancesDetailsResponse> listRestorableInstancesDetailsInvoker(
        ListRestorableInstancesDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRestorableInstancesDetails, hcClient);
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
     * @return ListRestoreTimesResponse
     */
    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listRestoreTimes);
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
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查看定时任务列表
     *
     * 查看定时任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTaskRequest 请求对象
     * @return ListScheduleTaskResponse
     */
    public ListScheduleTaskResponse listScheduleTask(ListScheduleTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listScheduleTask);
    }

    /**
     * 查看定时任务列表
     *
     * 查看定时任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleTaskRequest 请求对象
     * @return SyncInvoker<ListScheduleTaskRequest, ListScheduleTaskResponse>
     */
    public SyncInvoker<ListScheduleTaskRequest, ListScheduleTaskResponse> listScheduleTaskInvoker(
        ListScheduleTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listScheduleTask, hcClient);
    }

    /**
     * 识别SQL文本中的表信息
     *
     * 识别SQL文本中的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaAndTableRequest 请求对象
     * @return ListSchemaAndTableResponse
     */
    public ListSchemaAndTableResponse listSchemaAndTable(ListSchemaAndTableRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSchemaAndTable);
    }

    /**
     * 识别SQL文本中的表信息
     *
     * 识别SQL文本中的表信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaAndTableRequest 请求对象
     * @return SyncInvoker<ListSchemaAndTableRequest, ListSchemaAndTableResponse>
     */
    public SyncInvoker<ListSchemaAndTableRequest, ListSchemaAndTableResponse> listSchemaAndTableInvoker(
        ListSchemaAndTableRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSchemaAndTable, hcClient);
    }

    /**
     * 查询实时会话统计
     *
     * 查询数据库实例节点的实时会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionStatisticsRequest 请求对象
     * @return ListSessionStatisticsResponse
     */
    public ListSessionStatisticsResponse listSessionStatistics(ListSessionStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSessionStatistics);
    }

    /**
     * 查询实时会话统计
     *
     * 查询数据库实例节点的实时会话统计信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSessionStatisticsRequest 请求对象
     * @return SyncInvoker<ListSessionStatisticsRequest, ListSessionStatisticsResponse>
     */
    public SyncInvoker<ListSessionStatisticsRequest, ListSessionStatisticsResponse> listSessionStatisticsInvoker(
        ListSessionStatisticsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSessionStatistics, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return ListStorageTypesResponse
     */
    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询指定数据库引擎对应的磁盘类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(
        ListStorageTypesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listStorageTypes, hcClient);
    }

    /**
     * 查询支持的插件列表
     *
     * 查询支持的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportKernelPluginsRequest 请求对象
     * @return ListSupportKernelPluginsResponse
     */
    public ListSupportKernelPluginsResponse listSupportKernelPlugins(ListSupportKernelPluginsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSupportKernelPlugins);
    }

    /**
     * 查询支持的插件列表
     *
     * 查询支持的插件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSupportKernelPluginsRequest 请求对象
     * @return SyncInvoker<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse>
     */
    public SyncInvoker<ListSupportKernelPluginsRequest, ListSupportKernelPluginsResponse> listSupportKernelPluginsInvoker(
        ListSupportKernelPluginsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSupportKernelPlugins, hcClient);
    }

    /**
     * 查询表定义信息
     *
     * 查询表定义信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionRequest 请求对象
     * @return ListTableDefinitionResponse
     */
    public ListTableDefinitionResponse listTableDefinition(ListTableDefinitionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTableDefinition);
    }

    /**
     * 查询表定义信息
     *
     * 查询表定义信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionRequest 请求对象
     * @return SyncInvoker<ListTableDefinitionRequest, ListTableDefinitionResponse>
     */
    public SyncInvoker<ListTableDefinitionRequest, ListTableDefinitionResponse> listTableDefinitionInvoker(
        ListTableDefinitionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTableDefinition, hcClient);
    }

    /**
     * 查询指定表的表定义信息列表
     *
     * 查询指定表的表定义信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionsRequest 请求对象
     * @return ListTableDefinitionsResponse
     */
    public ListTableDefinitionsResponse listTableDefinitions(ListTableDefinitionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTableDefinitions);
    }

    /**
     * 查询指定表的表定义信息列表
     *
     * 查询指定表的表定义信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTableDefinitionsRequest 请求对象
     * @return SyncInvoker<ListTableDefinitionsRequest, ListTableDefinitionsResponse>
     */
    public SyncInvoker<ListTableDefinitionsRequest, ListTableDefinitionsResponse> listTableDefinitionsInvoker(
        ListTableDefinitionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTableDefinitions, hcClient);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTasks);
    }

    /**
     * 查询任务列表
     *
     * 获取任务中心的任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksRequest 请求对象
     * @return SyncInvoker<ListTasksRequest, ListTasksResponse>
     */
    public SyncInvoker<ListTasksRequest, ListTasksResponse> listTasksInvoker(ListTasksRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTasks, hcClient);
    }

    /**
     * 查询事务列表
     *
     * 查询数据库实例节点的实时事务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionRequest 请求对象
     * @return ListTransactionResponse
     */
    public ListTransactionResponse listTransaction(ListTransactionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTransaction);
    }

    /**
     * 查询事务列表
     *
     * 查询数据库实例节点的实时事务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionRequest 请求对象
     * @return SyncInvoker<ListTransactionRequest, ListTransactionResponse>
     */
    public SyncInvoker<ListTransactionRequest, ListTransactionResponse> listTransactionInvoker(
        ListTransactionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTransaction, hcClient);
    }

    /**
     * 查询等待事件列表
     *
     * 查询数据库实例节点的等待事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWaitEventRequest 请求对象
     * @return ListWaitEventResponse
     */
    public ListWaitEventResponse listWaitEvent(ListWaitEventRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listWaitEvent);
    }

    /**
     * 查询等待事件列表
     *
     * 查询数据库实例节点的等待事件列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListWaitEventRequest 请求对象
     * @return SyncInvoker<ListWaitEventRequest, ListWaitEventResponse>
     */
    public SyncInvoker<ListWaitEventRequest, ListWaitEventResponse> listWaitEventInvoker(ListWaitEventRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listWaitEvent, hcClient);
    }

    /**
     * 修改磁盘自动扩容策略
     *
     * 修改磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAutoEnlargePolicyRequest 请求对象
     * @return ModifyAutoEnlargePolicyResponse
     */
    public ModifyAutoEnlargePolicyResponse modifyAutoEnlargePolicy(ModifyAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.modifyAutoEnlargePolicy);
    }

    /**
     * 修改磁盘自动扩容策略
     *
     * 修改磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<ModifyAutoEnlargePolicyRequest, ModifyAutoEnlargePolicyResponse>
     */
    public SyncInvoker<ModifyAutoEnlargePolicyRequest, ModifyAutoEnlargePolicyResponse> modifyAutoEnlargePolicyInvoker(
        ModifyAutoEnlargePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.modifyAutoEnlargePolicy, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return ModifyEpsQuotaResponse
     */
    public ModifyEpsQuotaResponse modifyEpsQuota(ModifyEpsQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.modifyEpsQuota);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyEpsQuotaRequest 请求对象
     * @return SyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse>
     */
    public SyncInvoker<ModifyEpsQuotaRequest, ModifyEpsQuotaResponse> modifyEpsQuotaInvoker(
        ModifyEpsQuotaRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.modifyEpsQuota, hcClient);
    }

    /**
     * 修改客户端接入认证配置
     *
     * 修改客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHbaConfRequest 请求对象
     * @return ModifyHbaConfResponse
     */
    public ModifyHbaConfResponse modifyHbaConf(ModifyHbaConfRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.modifyHbaConf);
    }

    /**
     * 修改客户端接入认证配置
     *
     * 修改客户端接入认证配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHbaConfRequest 请求对象
     * @return SyncInvoker<ModifyHbaConfRequest, ModifyHbaConfResponse>
     */
    public SyncInvoker<ModifyHbaConfRequest, ModifyHbaConfResponse> modifyHbaConfInvoker(ModifyHbaConfRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.modifyHbaConf, hcClient);
    }

    /**
     * 修改热补丁属性
     *
     * 修改热补丁属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHotfixesRequest 请求对象
     * @return ModifyHotfixesResponse
     */
    public ModifyHotfixesResponse modifyHotfixes(ModifyHotfixesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.modifyHotfixes);
    }

    /**
     * 修改热补丁属性
     *
     * 修改热补丁属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHotfixesRequest 请求对象
     * @return SyncInvoker<ModifyHotfixesRequest, ModifyHotfixesResponse>
     */
    public SyncInvoker<ModifyHotfixesRequest, ModifyHotfixesResponse> modifyHotfixesInvoker(
        ModifyHotfixesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.modifyHotfixes, hcClient);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return ResetConfigurationResponse
     */
    public ResetConfigurationResponse resetConfiguration(ResetConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resetConfiguration);
    }

    /**
     * 重置参数模板
     *
     * 重置参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetConfigurationRequest 请求对象
     * @return SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse>
     */
    public SyncInvoker<ResetConfigurationRequest, ResetConfigurationResponse> resetConfigurationInvoker(
        ResetConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resetConfiguration, hcClient);
    }

    /**
     * 重置容灾配置
     *
     * 重置容灾网络等配置。1.将自动“创建委托”以授权DBS云服务访问VPC资源信息、查询IAAS接口。2.重置实例容灾网络等配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDrConfigRequest 请求对象
     * @return ResetDrConfigResponse
     */
    public ResetDrConfigResponse resetDrConfig(ResetDrConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resetDrConfig);
    }

    /**
     * 重置容灾配置
     *
     * 重置容灾网络等配置。1.将自动“创建委托”以授权DBS云服务访问VPC资源信息、查询IAAS接口。2.重置实例容灾网络等配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetDrConfigRequest 请求对象
     * @return SyncInvoker<ResetDrConfigRequest, ResetDrConfigResponse>
     */
    public SyncInvoker<ResetDrConfigRequest, ResetDrConfigResponse> resetDrConfigInvoker(ResetDrConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resetDrConfig, hcClient);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resetPwd);
    }

    /**
     * 重置数据库密码。
     *
     * 重置数据库密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resetPwd, hcClient);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return ResizeInstanceFlavorResponse
     */
    public ResizeInstanceFlavorResponse resizeInstanceFlavor(ResizeInstanceFlavorRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resizeInstanceFlavor);
    }

    /**
     * GaussDB数据库实例规格变更
     *
     * GaussDB数据库实例规格变更
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResizeInstanceFlavorRequest 请求对象
     * @return SyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse>
     */
    public SyncInvoker<ResizeInstanceFlavorRequest, ResizeInstanceFlavorResponse> resizeInstanceFlavorInvoker(
        ResizeInstanceFlavorRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resizeInstanceFlavor, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.restartInstance);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestartInstanceRequest 请求对象
     * @return SyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public SyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceInvoker(
        RestartInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.restartInstance, hcClient);
    }

    /**
     * 恢复客户端接入认证配置信息
     *
     * 恢复客户端接入认证配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreHbaInfoRequest 请求对象
     * @return RestoreHbaInfoResponse
     */
    public RestoreHbaInfoResponse restoreHbaInfo(RestoreHbaInfoRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.restoreHbaInfo);
    }

    /**
     * 恢复客户端接入认证配置信息
     *
     * 恢复客户端接入认证配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreHbaInfoRequest 请求对象
     * @return SyncInvoker<RestoreHbaInfoRequest, RestoreHbaInfoResponse>
     */
    public SyncInvoker<RestoreHbaInfoRequest, RestoreHbaInfoResponse> restoreHbaInfoInvoker(
        RestoreHbaInfoRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.restoreHbaInfo, hcClient);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return RestoreInstanceResponse
     */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.restoreInstance);
    }

    /**
     * 备份恢复到当前实例
     *
     * 备份恢复到当前实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestoreInstanceRequest 请求对象
     * @return SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse>
     */
    public SyncInvoker<RestoreInstanceRequest, RestoreInstanceResponse> restoreInstanceInvoker(
        RestoreInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.restoreInstance, hcClient);
    }

    /**
     * 配置插件拓展能力
     *
     * 配置插件拓展能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumePluginExtensionsRequest 请求对象
     * @return ResumePluginExtensionsResponse
     */
    public ResumePluginExtensionsResponse resumePluginExtensions(ResumePluginExtensionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resumePluginExtensions);
    }

    /**
     * 配置插件拓展能力
     *
     * 配置插件拓展能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResumePluginExtensionsRequest 请求对象
     * @return SyncInvoker<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse>
     */
    public SyncInvoker<ResumePluginExtensionsRequest, ResumePluginExtensionsResponse> resumePluginExtensionsInvoker(
        ResumePluginExtensionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.resumePluginExtensions, hcClient);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return RunInstanceActionResponse
     */
    public RunInstanceActionResponse runInstanceAction(RunInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.runInstanceAction);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * CN横向扩容/DN分片扩容/磁盘扩容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunInstanceActionRequest 请求对象
     * @return SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse>
     */
    public SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceActionInvoker(
        RunInstanceActionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.runInstanceAction, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return SearchAutoEnlargePolicyResponse
     */
    public SearchAutoEnlargePolicyResponse searchAutoEnlargePolicy(SearchAutoEnlargePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchAutoEnlargePolicyRequest 请求对象
     * @return SyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse>
     */
    public SyncInvoker<SearchAutoEnlargePolicyRequest, SearchAutoEnlargePolicyResponse> searchAutoEnlargePolicyInvoker(
        SearchAutoEnlargePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.searchAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略。
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略。
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
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setBackupPolicy, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return SetDbUserPwdResponse
     */
    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdInvoker(SetDbUserPwdRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setDbUserPwd, hcClient);
    }

    /**
     * 配置插件license
     *
     * 配置插件license
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKernelPluginLicenseRequest 请求对象
     * @return SetKernelPluginLicenseResponse
     */
    public SetKernelPluginLicenseResponse setKernelPluginLicense(SetKernelPluginLicenseRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setKernelPluginLicense);
    }

    /**
     * 配置插件license
     *
     * 配置插件license
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetKernelPluginLicenseRequest 请求对象
     * @return SyncInvoker<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse>
     */
    public SyncInvoker<SetKernelPluginLicenseRequest, SetKernelPluginLicenseResponse> setKernelPluginLicenseInvoker(
        SetKernelPluginLicenseRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setKernelPluginLicense, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNewBackupPolicyRequest 请求对象
     * @return SetNewBackupPolicyResponse
     */
    public SetNewBackupPolicyResponse setNewBackupPolicy(SetNewBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setNewBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetNewBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse>
     */
    public SyncInvoker<SetNewBackupPolicyRequest, SetNewBackupPolicyResponse> setNewBackupPolicyInvoker(
        SetNewBackupPolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setNewBackupPolicy, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SetRecyclePolicyResponse
     */
    public SetRecyclePolicyResponse setRecyclePolicy(SetRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecyclePolicyRequest 请求对象
     * @return SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public SyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyInvoker(
        SetRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 获取告警记录历史
     *
     * 获取告警记录历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmHistoryRecordRequest 请求对象
     * @return ShowAlarmHistoryRecordResponse
     */
    public ShowAlarmHistoryRecordResponse showAlarmHistoryRecord(ShowAlarmHistoryRecordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showAlarmHistoryRecord);
    }

    /**
     * 获取告警记录历史
     *
     * 获取告警记录历史。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmHistoryRecordRequest 请求对象
     * @return SyncInvoker<ShowAlarmHistoryRecordRequest, ShowAlarmHistoryRecordResponse>
     */
    public SyncInvoker<ShowAlarmHistoryRecordRequest, ShowAlarmHistoryRecordResponse> showAlarmHistoryRecordInvoker(
        ShowAlarmHistoryRecordRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showAlarmHistoryRecord, hcClient);
    }

    /**
     * 实例告警信息汇总统计
     *
     * 实例告警信息汇总统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmStatisticsRequest 请求对象
     * @return ShowAlarmStatisticsResponse
     */
    public ShowAlarmStatisticsResponse showAlarmStatistics(ShowAlarmStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showAlarmStatistics);
    }

    /**
     * 实例告警信息汇总统计
     *
     * 实例告警信息汇总统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAlarmStatisticsRequest 请求对象
     * @return SyncInvoker<ShowAlarmStatisticsRequest, ShowAlarmStatisticsResponse>
     */
    public SyncInvoker<ShowAlarmStatisticsRequest, ShowAlarmStatisticsResponse> showAlarmStatisticsInvoker(
        ShowAlarmStatisticsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showAlarmStatistics, hcClient);
    }

    /**
     * 获取自动中止事务配置
     *
     * 获取实例自动中止事务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoKillTransactionConfigRequest 请求对象
     * @return ShowAutoKillTransactionConfigResponse
     */
    public ShowAutoKillTransactionConfigResponse showAutoKillTransactionConfig(
        ShowAutoKillTransactionConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showAutoKillTransactionConfig);
    }

    /**
     * 获取自动中止事务配置
     *
     * 获取实例自动中止事务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAutoKillTransactionConfigRequest 请求对象
     * @return SyncInvoker<ShowAutoKillTransactionConfigRequest, ShowAutoKillTransactionConfigResponse>
     */
    public SyncInvoker<ShowAutoKillTransactionConfigRequest, ShowAutoKillTransactionConfigResponse> showAutoKillTransactionConfigInvoker(
        ShowAutoKillTransactionConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showAutoKillTransactionConfig, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showBackupPolicy);
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
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showBackupPolicy, hcClient);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return ShowBalanceStatusResponse
     */
    public ShowBalanceStatusResponse showBalanceStatus(ShowBalanceStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showBalanceStatus);
    }

    /**
     * 查询实例主备平衡状态
     *
     * 查询实例是否发生过主备切换而导致主机负载不均衡。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBalanceStatusRequest 请求对象
     * @return SyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse>
     */
    public SyncInvoker<ShowBalanceStatusRequest, ShowBalanceStatusResponse> showBalanceStatusInvoker(
        ShowBalanceStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showBalanceStatus, hcClient);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpgradeCandidateVersionsRequest 请求对象
     * @return ShowBatchUpgradeCandidateVersionsResponse
     */
    public ShowBatchUpgradeCandidateVersionsResponse showBatchUpgradeCandidateVersions(
        ShowBatchUpgradeCandidateVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showBatchUpgradeCandidateVersions);
    }

    /**
     * 查询批量实例可升级的版本和升级类型。
     *
     * 查询批量实例可升级的版本和升级类型。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpgradeCandidateVersionsRequest 请求对象
     * @return SyncInvoker<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse>
     */
    public SyncInvoker<ShowBatchUpgradeCandidateVersionsRequest, ShowBatchUpgradeCandidateVersionsResponse> showBatchUpgradeCandidateVersionsInvoker(
        ShowBatchUpgradeCandidateVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showBatchUpgradeCandidateVersions, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return ShowConfigurationDetailResponse
     */
    public ShowConfigurationDetailResponse showConfigurationDetail(ShowConfigurationDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showConfigurationDetail);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConfigurationDetailRequest 请求对象
     * @return SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public SyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailInvoker(
        ShowConfigurationDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询实例容灾监控实时状态
     *
     * 查询实例容灾监控实时状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterInstanceMonitorRequest 请求对象
     * @return ShowCrossCloudDisasterInstanceMonitorResponse
     */
    public ShowCrossCloudDisasterInstanceMonitorResponse showCrossCloudDisasterInstanceMonitor(
        ShowCrossCloudDisasterInstanceMonitorRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showCrossCloudDisasterInstanceMonitor);
    }

    /**
     * 查询实例容灾监控实时状态
     *
     * 查询实例容灾监控实时状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterInstanceMonitorRequest 请求对象
     * @return SyncInvoker<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse>
     */
    public SyncInvoker<ShowCrossCloudDisasterInstanceMonitorRequest, ShowCrossCloudDisasterInstanceMonitorResponse> showCrossCloudDisasterInstanceMonitorInvoker(
        ShowCrossCloudDisasterInstanceMonitorRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showCrossCloudDisasterInstanceMonitor, hcClient);
    }

    /**
     * 查询容灾关系列表
     *
     * 查询容灾关系列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterRelationsRequest 请求对象
     * @return ShowCrossCloudDisasterRelationsResponse
     */
    public ShowCrossCloudDisasterRelationsResponse showCrossCloudDisasterRelations(
        ShowCrossCloudDisasterRelationsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showCrossCloudDisasterRelations);
    }

    /**
     * 查询容灾关系列表
     *
     * 查询容灾关系列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCrossCloudDisasterRelationsRequest 请求对象
     * @return SyncInvoker<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse>
     */
    public SyncInvoker<ShowCrossCloudDisasterRelationsRequest, ShowCrossCloudDisasterRelationsResponse> showCrossCloudDisasterRelationsInvoker(
        ShowCrossCloudDisasterRelationsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showCrossCloudDisasterRelations, hcClient);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return ShowDeploymentFormResponse
     */
    public ShowDeploymentFormResponse showDeploymentForm(ShowDeploymentFormRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showDeploymentForm);
    }

    /**
     * 查询解决方案模板配置
     *
     * 根据解决方案模板名称或实例ID查询副本数、分片数、节点数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeploymentFormRequest 请求对象
     * @return SyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse>
     */
    public SyncInvoker<ShowDeploymentFormRequest, ShowDeploymentFormResponse> showDeploymentFormInvoker(
        ShowDeploymentFormRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showDeploymentForm, hcClient);
    }

    /**
     * 获取企业项目剩余配额
     *
     * 获取企业项目剩余配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpsRemainingQuotaRequest 请求对象
     * @return ShowEpsRemainingQuotaResponse
     */
    public ShowEpsRemainingQuotaResponse showEpsRemainingQuota(ShowEpsRemainingQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showEpsRemainingQuota);
    }

    /**
     * 获取企业项目剩余配额
     *
     * 获取企业项目剩余配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpsRemainingQuotaRequest 请求对象
     * @return SyncInvoker<ShowEpsRemainingQuotaRequest, ShowEpsRemainingQuotaResponse>
     */
    public SyncInvoker<ShowEpsRemainingQuotaRequest, ShowEpsRemainingQuotaResponse> showEpsRemainingQuotaInvoker(
        ShowEpsRemainingQuotaRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showEpsRemainingQuota, hcClient);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return ShowErrorLogSwitchStatusResponse
     */
    public ShowErrorLogSwitchStatusResponse showErrorLogSwitchStatus(ShowErrorLogSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus);
    }

    /**
     * 查询错误日志采集开关状态
     *
     * 查询数据库错误日志采集的开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowErrorLogSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse>
     */
    public SyncInvoker<ShowErrorLogSwitchStatusRequest, ShowErrorLogSwitchStatusResponse> showErrorLogSwitchStatusInvoker(
        ShowErrorLogSwitchStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showErrorLogSwitchStatus, hcClient);
    }

    /**
     * 查询扩容优化参数设置模板
     *
     * 查询扩容优化参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpansionParametersRequest 请求对象
     * @return ShowExpansionParametersResponse
     */
    public ShowExpansionParametersResponse showExpansionParameters(ShowExpansionParametersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showExpansionParameters);
    }

    /**
     * 查询扩容优化参数设置模板
     *
     * 查询扩容优化参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExpansionParametersRequest 请求对象
     * @return SyncInvoker<ShowExpansionParametersRequest, ShowExpansionParametersResponse>
     */
    public SyncInvoker<ShowExpansionParametersRequest, ShowExpansionParametersResponse> showExpansionParametersInvoker(
        ShowExpansionParametersRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showExpansionParameters, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return ShowInstanceDiskResponse
     */
    public ShowInstanceDiskResponse showInstanceDisk(ShowInstanceDiskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceDisk);
    }

    /**
     * 查询实例存储空间使用信息
     *
     * 查询指定实例的存储使用空间和最大空间。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceDiskRequest 请求对象
     * @return SyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse>
     */
    public SyncInvoker<ShowInstanceDiskRequest, ShowInstanceDiskResponse> showInstanceDiskInvoker(
        ShowInstanceDiskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceDisk, hcClient);
    }

    /**
     * 查询实例指标数据
     *
     * 查询实例指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricDataRequest 请求对象
     * @return ShowInstanceMetricDataResponse
     */
    public ShowInstanceMetricDataResponse showInstanceMetricData(ShowInstanceMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceMetricData);
    }

    /**
     * 查询实例指标数据
     *
     * 查询实例指标数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricDataRequest 请求对象
     * @return SyncInvoker<ShowInstanceMetricDataRequest, ShowInstanceMetricDataResponse>
     */
    public SyncInvoker<ShowInstanceMetricDataRequest, ShowInstanceMetricDataResponse> showInstanceMetricDataInvoker(
        ShowInstanceMetricDataRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceMetricData, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return ShowInstanceParamGroupResponse
     */
    public ShowInstanceParamGroupResponse showInstanceParamGroup(ShowInstanceParamGroupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceParamGroup);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupRequest 请求对象
     * @return SyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse>
     */
    public SyncInvoker<ShowInstanceParamGroupRequest, ShowInstanceParamGroupResponse> showInstanceParamGroupInvoker(
        ShowInstanceParamGroupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceParamGroup, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupDetailRequest 请求对象
     * @return ShowInstanceParamGroupDetailResponse
     */
    public ShowInstanceParamGroupDetailResponse showInstanceParamGroupDetail(
        ShowInstanceParamGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceParamGroupDetail);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceParamGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse>
     */
    public SyncInvoker<ShowInstanceParamGroupDetailRequest, ShowInstanceParamGroupDetailResponse> showInstanceParamGroupDetailInvoker(
        ShowInstanceParamGroupDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceParamGroupDetail, hcClient);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return ShowInstanceSnapshotResponse
     */
    public ShowInstanceSnapshotResponse showInstanceSnapshot(ShowInstanceSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstanceSnapshot);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceSnapshotRequest 请求对象
     * @return SyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse>
     */
    public SyncInvoker<ShowInstanceSnapshotRequest, ShowInstanceSnapshotResponse> showInstanceSnapshotInvoker(
        ShowInstanceSnapshotRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstanceSnapshot, hcClient);
    }

    /**
     * 实例状态统计
     *
     * 实例状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesStatisticsRequest 请求对象
     * @return ShowInstancesStatisticsResponse
     */
    public ShowInstancesStatisticsResponse showInstancesStatistics(ShowInstancesStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showInstancesStatistics);
    }

    /**
     * 实例状态统计
     *
     * 实例状态统计。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstancesStatisticsRequest 请求对象
     * @return SyncInvoker<ShowInstancesStatisticsRequest, ShowInstancesStatisticsResponse>
     */
    public SyncInvoker<ShowInstancesStatisticsRequest, ShowInstancesStatisticsResponse> showInstancesStatisticsInvoker(
        ShowInstancesStatisticsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showInstancesStatistics, hcClient);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return ShowJobDetailResponse
     */
    public ShowJobDetailResponse showJobDetail(ShowJobDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showJobDetail);
    }

    /**
     * 获取指定ID的任务信息。
     *
     * 获取指定ID的任务信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobDetailRequest 请求对象
     * @return SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse>
     */
    public SyncInvoker<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetailInvoker(ShowJobDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showJobDetail, hcClient);
    }

    /**
     * 查询KMS秘钥详情
     *
     * 查询KMS秘钥详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKmsKeyDetailRequest 请求对象
     * @return ShowKmsKeyDetailResponse
     */
    public ShowKmsKeyDetailResponse showKmsKeyDetail(ShowKmsKeyDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showKmsKeyDetail);
    }

    /**
     * 查询KMS秘钥详情
     *
     * 查询KMS秘钥详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKmsKeyDetailRequest 请求对象
     * @return SyncInvoker<ShowKmsKeyDetailRequest, ShowKmsKeyDetailResponse>
     */
    public SyncInvoker<ShowKmsKeyDetailRequest, ShowKmsKeyDetailResponse> showKmsKeyDetailInvoker(
        ShowKmsKeyDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showKmsKeyDetail, hcClient);
    }

    /**
     * 查询指标分组的指标名称
     *
     * 查询指标分组的指标名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesRequest 请求对象
     * @return ShowMetricNamesResponse
     */
    public ShowMetricNamesResponse showMetricNames(ShowMetricNamesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showMetricNames);
    }

    /**
     * 查询指标分组的指标名称
     *
     * 查询指标分组的指标名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesRequest 请求对象
     * @return SyncInvoker<ShowMetricNamesRequest, ShowMetricNamesResponse>
     */
    public SyncInvoker<ShowMetricNamesRequest, ShowMetricNamesResponse> showMetricNamesInvoker(
        ShowMetricNamesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showMetricNames, hcClient);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowParameterGroupDetailRequest 请求对象
     * @return ShowParameterGroupDetailResponse
     */
    public ShowParameterGroupDetailResponse showParameterGroupDetail(ShowParameterGroupDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showParameterGroupDetail);
    }

    /**
     * 查询参数模板详情
     *
     * 根据参数模板ID获取指定参数模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowParameterGroupDetailRequest 请求对象
     * @return SyncInvoker<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse>
     */
    public SyncInvoker<ShowParameterGroupDetailRequest, ShowParameterGroupDetailResponse> showParameterGroupDetailInvoker(
        ShowParameterGroupDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showParameterGroupDetail, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return ShowProjectQuotasResponse
     */
    public ShowProjectQuotasResponse showProjectQuotas(ShowProjectQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectQuotasRequest 请求对象
     * @return SyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse>
     */
    public SyncInvoker<ShowProjectQuotasRequest, ShowProjectQuotasResponse> showProjectQuotasInvoker(
        ShowProjectQuotasRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showProjectQuotas, hcClient);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return ShowRecyclePolicyResponse
     */
    public ShowRecyclePolicyResponse showRecyclePolicy(ShowRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showRecyclePolicy);
    }

    /**
     * 查看回收站策略
     *
     * 查看回收站的回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecyclePolicyRequest 请求对象
     * @return SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public SyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyInvoker(
        ShowRecyclePolicyRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询重分布参数设置模板
     *
     * 查询重分布参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedistributionParametersRequest 请求对象
     * @return ShowRedistributionParametersResponse
     */
    public ShowRedistributionParametersResponse showRedistributionParameters(
        ShowRedistributionParametersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showRedistributionParameters);
    }

    /**
     * 查询重分布参数设置模板
     *
     * 查询重分布参数设置模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRedistributionParametersRequest 请求对象
     * @return SyncInvoker<ShowRedistributionParametersRequest, ShowRedistributionParametersResponse>
     */
    public SyncInvoker<ShowRedistributionParametersRequest, ShowRedistributionParametersResponse> showRedistributionParametersInvoker(
        ShowRedistributionParametersRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showRedistributionParameters, hcClient);
    }

    /**
     * 查询实时会话概览
     *
     * 查询数据库实例节点的实时会话概览信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionOverviewRequest 请求对象
     * @return ShowSessionOverviewResponse
     */
    public ShowSessionOverviewResponse showSessionOverview(ShowSessionOverviewRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSessionOverview);
    }

    /**
     * 查询实时会话概览
     *
     * 查询数据库实例节点的实时会话概览信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSessionOverviewRequest 请求对象
     * @return SyncInvoker<ShowSessionOverviewRequest, ShowSessionOverviewResponse>
     */
    public SyncInvoker<ShowSessionOverviewRequest, ShowSessionOverviewResponse> showSessionOverviewInvoker(
        ShowSessionOverviewRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSessionOverview, hcClient);
    }

    /**
     * 获取分片的磁盘使用信息
     *
     * 获取分片的磁盘使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardDiskMessagesRequest 请求对象
     * @return ShowShardDiskMessagesResponse
     */
    public ShowShardDiskMessagesResponse showShardDiskMessages(ShowShardDiskMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showShardDiskMessages);
    }

    /**
     * 获取分片的磁盘使用信息
     *
     * 获取分片的磁盘使用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowShardDiskMessagesRequest 请求对象
     * @return SyncInvoker<ShowShardDiskMessagesRequest, ShowShardDiskMessagesResponse>
     */
    public SyncInvoker<ShowShardDiskMessagesRequest, ShowShardDiskMessagesResponse> showShardDiskMessagesInvoker(
        ShowShardDiskMessagesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showShardDiskMessages, hcClient);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return ShowSlowLogDownloadResponse
     */
    public ShowSlowLogDownloadResponse showSlowLogDownload(ShowSlowLogDownloadRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowLogDownload);
    }

    /**
     * 查询慢日志下载信息
     *
     * 查询慢日志下载信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogDownloadRequest 请求对象
     * @return SyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse>
     */
    public SyncInvoker<ShowSlowLogDownloadRequest, ShowSlowLogDownloadResponse> showSlowLogDownloadInvoker(
        ShowSlowLogDownloadRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowLogDownload, hcClient);
    }

    /**
     * 查询SQL执行计划信息
     *
     * 查询等待事件的SQL执行计划信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlPlanRequest 请求对象
     * @return ShowSlowSqlPlanResponse
     */
    public ShowSlowSqlPlanResponse showSlowSqlPlan(ShowSlowSqlPlanRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowSqlPlan);
    }

    /**
     * 查询SQL执行计划信息
     *
     * 查询等待事件的SQL执行计划信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlPlanRequest 请求对象
     * @return SyncInvoker<ShowSlowSqlPlanRequest, ShowSlowSqlPlanResponse>
     */
    public SyncInvoker<ShowSlowSqlPlanRequest, ShowSlowSqlPlanResponse> showSlowSqlPlanInvoker(
        ShowSlowSqlPlanRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowSqlPlan, hcClient);
    }

    /**
     * 查询SQL堆栈信息
     *
     * 查询等待事件的SQL堆栈信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlStackRequest 请求对象
     * @return ShowSlowSqlStackResponse
     */
    public ShowSlowSqlStackResponse showSlowSqlStack(ShowSlowSqlStackRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSlowSqlStack);
    }

    /**
     * 查询SQL堆栈信息
     *
     * 查询等待事件的SQL堆栈信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowSqlStackRequest 请求对象
     * @return SyncInvoker<ShowSlowSqlStackRequest, ShowSlowSqlStackResponse>
     */
    public SyncInvoker<ShowSlowSqlStackRequest, ShowSlowSqlStackResponse> showSlowSqlStackInvoker(
        ShowSlowSqlStackRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSlowSqlStack, hcClient);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceInstanceDetailRequest 请求对象
     * @return ShowSourceInstanceDetailResponse
     */
    public ShowSourceInstanceDetailResponse showSourceInstanceDetail(ShowSourceInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSourceInstanceDetail);
    }

    /**
     * 根据时间点或者备份文件查询原实例信息
     *
     * 根据时间点或者备份文件查询原实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSourceInstanceDetailRequest 请求对象
     * @return SyncInvoker<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse>
     */
    public SyncInvoker<ShowSourceInstanceDetailRequest, ShowSourceInstanceDetailResponse> showSourceInstanceDetailInvoker(
        ShowSourceInstanceDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSourceInstanceDetail, hcClient);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return ShowSslCertDownloadLinkResponse
     */
    public ShowSslCertDownloadLinkResponse showSslCertDownloadLink(ShowSslCertDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSslCertDownloadLink);
    }

    /**
     * 查询实例SSL证书下载地址
     *
     * 查询实例SSL证书下载地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSslCertDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse>
     */
    public SyncInvoker<ShowSslCertDownloadLinkRequest, ShowSslCertDownloadLinkResponse> showSslCertDownloadLinkInvoker(
        ShowSslCertDownloadLinkRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSslCertDownloadLink, hcClient);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return ShowUpgradeCandidateVersionsResponse
     */
    public ShowUpgradeCandidateVersionsResponse showUpgradeCandidateVersions(
        ShowUpgradeCandidateVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsRequest 请求对象
     * @return SyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse>
     */
    public SyncInvoker<ShowUpgradeCandidateVersionsRequest, ShowUpgradeCandidateVersionsResponse> showUpgradeCandidateVersionsInvoker(
        ShowUpgradeCandidateVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersions, hcClient);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsDetailsRequest 请求对象
     * @return ShowUpgradeCandidateVersionsDetailsResponse
     */
    public ShowUpgradeCandidateVersionsDetailsResponse showUpgradeCandidateVersionsDetails(
        ShowUpgradeCandidateVersionsDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersionsDetails);
    }

    /**
     * 查询实例可升级版本
     *
     * 查询实例可升级版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpgradeCandidateVersionsDetailsRequest 请求对象
     * @return SyncInvoker<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse>
     */
    public SyncInvoker<ShowUpgradeCandidateVersionsDetailsRequest, ShowUpgradeCandidateVersionsDetailsResponse> showUpgradeCandidateVersionsDetailsInvoker(
        ShowUpgradeCandidateVersionsDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showUpgradeCandidateVersionsDetails, hcClient);
    }

    /**
     * 协调节点缩容
     *
     * 协调节点缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkCnRequest 请求对象
     * @return ShrinkCnResponse
     */
    public ShrinkCnResponse shrinkCn(ShrinkCnRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.shrinkCn);
    }

    /**
     * 协调节点缩容
     *
     * 协调节点缩容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShrinkCnRequest 请求对象
     * @return SyncInvoker<ShrinkCnRequest, ShrinkCnResponse>
     */
    public SyncInvoker<ShrinkCnRequest, ShrinkCnResponse> shrinkCnInvoker(ShrinkCnRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.shrinkCn, hcClient);
    }

    /**
     * 启动实例/节点
     *
     * 启动实例/节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.startInstance);
    }

    /**
     * 启动实例/节点
     *
     * 启动实例/节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartInstanceRequest 请求对象
     * @return SyncInvoker<StartInstanceRequest, StartInstanceResponse>
     */
    public SyncInvoker<StartInstanceRequest, StartInstanceResponse> startInstanceInvoker(StartInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.startInstance, hcClient);
    }

    /**
     * 开启M兼容端口服务
     *
     * 开启指定实例的M兼容端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMysqlCompatibilityRequest 请求对象
     * @return StartMysqlCompatibilityResponse
     */
    public StartMysqlCompatibilityResponse startMysqlCompatibility(StartMysqlCompatibilityRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.startMysqlCompatibility);
    }

    /**
     * 开启M兼容端口服务
     *
     * 开启指定实例的M兼容端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartMysqlCompatibilityRequest 请求对象
     * @return SyncInvoker<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse>
     */
    public SyncInvoker<StartMysqlCompatibilityRequest, StartMysqlCompatibilityResponse> startMysqlCompatibilityInvoker(
        StartMysqlCompatibilityRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.startMysqlCompatibility, hcClient);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return StopBackupResponse
     */
    public StopBackupResponse stopBackup(StopBackupRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopBackup);
    }

    /**
     * 停止备份
     *
     * 停止进行中的备份，包括全备和差备。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBackupRequest 请求对象
     * @return SyncInvoker<StopBackupRequest, StopBackupResponse>
     */
    public SyncInvoker<StopBackupRequest, StopBackupResponse> stopBackupInvoker(StopBackupRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopBackup, hcClient);
    }

    /**
     * 结束空闲会话
     *
     * 结束空闲会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFreeSessionRequest 请求对象
     * @return StopFreeSessionResponse
     */
    public StopFreeSessionResponse stopFreeSession(StopFreeSessionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopFreeSession);
    }

    /**
     * 结束空闲会话
     *
     * 结束空闲会话。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFreeSessionRequest 请求对象
     * @return SyncInvoker<StopFreeSessionRequest, StopFreeSessionResponse>
     */
    public SyncInvoker<StopFreeSessionRequest, StopFreeSessionResponse> stopFreeSessionInvoker(
        StopFreeSessionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopFreeSession, hcClient);
    }

    /**
     * 停止实例/节点
     *
     * 停止数据库，同时支持节点级别的停止操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopInstance);
    }

    /**
     * 停止实例/节点
     *
     * 停止数据库，同时支持节点级别的停止操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopInstance, hcClient);
    }

    /**
     * 结束会话
     *
     * 查杀指定会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSessionRequest 请求对象
     * @return StopSessionResponse
     */
    public StopSessionResponse stopSession(StopSessionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopSession);
    }

    /**
     * 结束会话
     *
     * 查杀指定会话列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopSessionRequest 请求对象
     * @return SyncInvoker<StopSessionRequest, StopSessionResponse>
     */
    public SyncInvoker<StopSessionRequest, StopSessionResponse> stopSessionInvoker(StopSessionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopSession, hcClient);
    }

    /**
     * 手动结束事务
     *
     * 手动结束事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTransactionRequest 请求对象
     * @return StopTransactionResponse
     */
    public StopTransactionResponse stopTransaction(StopTransactionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopTransaction);
    }

    /**
     * 手动结束事务
     *
     * 手动结束事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopTransactionRequest 请求对象
     * @return SyncInvoker<StopTransactionRequest, StopTransactionResponse>
     */
    public SyncInvoker<StopTransactionRequest, StopTransactionResponse> stopTransactionInvoker(
        StopTransactionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopTransaction, hcClient);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return SwitchConfigurationResponse
     */
    public SwitchConfigurationResponse switchConfiguration(SwitchConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 指定实例变更参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchConfigurationRequest 请求对象
     * @return SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse>
     */
    public SyncInvoker<SwitchConfigurationRequest, SwitchConfigurationResponse> switchConfigurationInvoker(
        SwitchConfigurationRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchConfiguration, hcClient);
    }

    /**
     * 开启透明加密
     *
     * 开启透明加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchKmsTdeRequest 请求对象
     * @return SwitchKmsTdeResponse
     */
    public SwitchKmsTdeResponse switchKmsTde(SwitchKmsTdeRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchKmsTde);
    }

    /**
     * 开启透明加密
     *
     * 开启透明加密。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchKmsTdeRequest 请求对象
     * @return SyncInvoker<SwitchKmsTdeRequest, SwitchKmsTdeResponse>
     */
    public SyncInvoker<SwitchKmsTdeRequest, SwitchKmsTdeResponse> switchKmsTdeInvoker(SwitchKmsTdeRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchKmsTde, hcClient);
    }

    /**
     * 分布式实例一主一备一日志形态切换到一主两备形态
     *
     * 当前只支持分布式独立部署一主一备一日志切换至一主两备形态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchReplicaRequest 请求对象
     * @return SwitchReplicaResponse
     */
    public SwitchReplicaResponse switchReplica(SwitchReplicaRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchReplica);
    }

    /**
     * 分布式实例一主一备一日志形态切换到一主两备形态
     *
     * 当前只支持分布式独立部署一主一备一日志切换至一主两备形态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchReplicaRequest 请求对象
     * @return SyncInvoker<SwitchReplicaRequest, SwitchReplicaResponse>
     */
    public SyncInvoker<SwitchReplicaRequest, SwitchReplicaResponse> switchReplicaInvoker(SwitchReplicaRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchReplica, hcClient);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return SwitchShardResponse
     */
    public SwitchShardResponse switchShard(SwitchShardRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchShard);
    }

    /**
     * 分片节点主备切换。
     *
     * 支持用户对单个或多个DN分片做主备切换，同一分组内只能指定一个新的备节点进行升主操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchShardRequest 请求对象
     * @return SyncInvoker<SwitchShardRequest, SwitchShardResponse>
     */
    public SyncInvoker<SwitchShardRequest, SwitchShardResponse> switchShardInvoker(SwitchShardRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchShard, hcClient);
    }

    /**
     * 修改扩容优化参数
     *
     * 修改扩容优化参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpansionParametersRequest 请求对象
     * @return UpdateExpansionParametersResponse
     */
    public UpdateExpansionParametersResponse updateExpansionParameters(UpdateExpansionParametersRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateExpansionParameters);
    }

    /**
     * 修改扩容优化参数
     *
     * 修改扩容优化参数
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateExpansionParametersRequest 请求对象
     * @return SyncInvoker<UpdateExpansionParametersRequest, UpdateExpansionParametersResponse>
     */
    public SyncInvoker<UpdateExpansionParametersRequest, UpdateExpansionParametersResponse> updateExpansionParametersInvoker(
        UpdateExpansionParametersRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateExpansionParameters, hcClient);
    }

    /**
     * 开启特性
     *
     * 打开高级特性开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFeaturesRequest 请求对象
     * @return UpdateFeaturesResponse
     */
    public UpdateFeaturesResponse updateFeatures(UpdateFeaturesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateFeatures);
    }

    /**
     * 开启特性
     *
     * 打开高级特性开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFeaturesRequest 请求对象
     * @return SyncInvoker<UpdateFeaturesRequest, UpdateFeaturesResponse>
     */
    public SyncInvoker<UpdateFeaturesRequest, UpdateFeaturesResponse> updateFeaturesInvoker(
        UpdateFeaturesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateFeatures, hcClient);
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
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceConfiguration);
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
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceName, hcClient);
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
     * @return UpdateInstanceVersionsResponse
     */
    public UpdateInstanceVersionsResponse updateInstanceVersions(UpdateInstanceVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceVersions);
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
     * @return SyncInvoker<UpdateInstanceVersionsRequest, UpdateInstanceVersionsResponse>
     */
    public SyncInvoker<UpdateInstanceVersionsRequest, UpdateInstanceVersionsResponse> updateInstanceVersionsInvoker(
        UpdateInstanceVersionsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateInstanceVersions, hcClient);
    }

    /**
     * 更新/关闭M兼容端口服务
     *
     * 更新指定实例的M兼容端口服务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMysqlCompatibilityRequest 请求对象
     * @return UpdateMysqlCompatibilityResponse
     */
    public UpdateMysqlCompatibilityResponse updateMysqlCompatibility(UpdateMysqlCompatibilityRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateMysqlCompatibility);
    }

    /**
     * 更新/关闭M兼容端口服务
     *
     * 更新指定实例的M兼容端口服务配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMysqlCompatibilityRequest 请求对象
     * @return SyncInvoker<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse>
     */
    public SyncInvoker<UpdateMysqlCompatibilityRequest, UpdateMysqlCompatibilityResponse> updateMysqlCompatibilityInvoker(
        UpdateMysqlCompatibilityRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateMysqlCompatibility, hcClient);
    }

    /**
     * 修改重分布参数
     *
     * 修改重分布参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRedistributionControlRequest 请求对象
     * @return UpdateRedistributionControlResponse
     */
    public UpdateRedistributionControlResponse updateRedistributionControl(UpdateRedistributionControlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateRedistributionControl);
    }

    /**
     * 修改重分布参数
     *
     * 修改重分布参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRedistributionControlRequest 请求对象
     * @return SyncInvoker<UpdateRedistributionControlRequest, UpdateRedistributionControlResponse>
     */
    public SyncInvoker<UpdateRedistributionControlRequest, UpdateRedistributionControlResponse> updateRedistributionControlInvoker(
        UpdateRedistributionControlRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateRedistributionControl, hcClient);
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
     * @return UpgradeInstanceVersionResponse
     */
    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstanceVersion);
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
     * @return SyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse>
     */
    public SyncInvoker<UpgradeInstanceVersionRequest, UpgradeInstanceVersionResponse> upgradeInstanceVersionInvoker(
        UpgradeInstanceVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstanceVersion, hcClient);
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
     * @return UpgradeInstancesVersionResponse
     */
    public UpgradeInstancesVersionResponse upgradeInstancesVersion(UpgradeInstancesVersionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.upgradeInstancesVersion);
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
     * @return SyncInvoker<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse>
     */
    public SyncInvoker<UpgradeInstancesVersionRequest, UpgradeInstancesVersionResponse> upgradeInstancesVersionInvoker(
        UpgradeInstancesVersionRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.upgradeInstancesVersion, hcClient);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return ValidateParaGroupNameResponse
     */
    public ValidateParaGroupNameResponse validateParaGroupName(ValidateParaGroupNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.validateParaGroupName);
    }

    /**
     * 校验参数组名称是否存在
     *
     * 校验参数组名称是否存在。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateParaGroupNameRequest 请求对象
     * @return SyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse>
     */
    public SyncInvoker<ValidateParaGroupNameRequest, ValidateParaGroupNameResponse> validateParaGroupNameInvoker(
        ValidateParaGroupNameRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.validateParaGroupName, hcClient);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return ValidateWeakPasswordResponse
     */
    public ValidateWeakPasswordResponse validateWeakPassword(ValidateWeakPasswordRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.validateWeakPassword);
    }

    /**
     * 弱密码校验
     *
     * 校验数据库root用户密码的安全性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidateWeakPasswordRequest 请求对象
     * @return SyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse>
     */
    public SyncInvoker<ValidateWeakPasswordRequest, ValidateWeakPasswordResponse> validateWeakPasswordInvoker(
        ValidateWeakPasswordRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.validateWeakPassword, hcClient);
    }

    /**
     * 采集ASP报告
     *
     * 采集ASP报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAspRequest 请求对象
     * @return CollectAspResponse
     */
    public CollectAspResponse collectAsp(CollectAspRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.collectAsp);
    }

    /**
     * 采集ASP报告
     *
     * 采集ASP报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectAspRequest 请求对象
     * @return SyncInvoker<CollectAspRequest, CollectAspResponse>
     */
    public SyncInvoker<CollectAspRequest, CollectAspResponse> collectAspInvoker(CollectAspRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.collectAsp, hcClient);
    }

    /**
     * 查询asp采集结果
     *
     * 查询ASP采集结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAspInfosRequest 请求对象
     * @return ListAspInfosResponse
     */
    public ListAspInfosResponse listAspInfos(ListAspInfosRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listAspInfos);
    }

    /**
     * 查询asp采集结果
     *
     * 查询ASP采集结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAspInfosRequest 请求对象
     * @return SyncInvoker<ListAspInfosRequest, ListAspInfosResponse>
     */
    public SyncInvoker<ListAspInfosRequest, ListAspInfosResponse> listAspInfosInvoker(ListAspInfosRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listAspInfos, hcClient);
    }

    /**
     * 查询ASP开关状态
     *
     * 查询ASP开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAspStatusRequest 请求对象
     * @return ShowAspStatusResponse
     */
    public ShowAspStatusResponse showAspStatus(ShowAspStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showAspStatus);
    }

    /**
     * 查询ASP开关状态
     *
     * 查询ASP开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAspStatusRequest 请求对象
     * @return SyncInvoker<ShowAspStatusRequest, ShowAspStatusResponse>
     */
    public SyncInvoker<ShowAspStatusRequest, ShowAspStatusResponse> showAspStatusInvoker(ShowAspStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showAspStatus, hcClient);
    }

    /**
     * 打开或者关闭ASP开关
     *
     * 打开或者关闭ASP开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAspStatusRequest 请求对象
     * @return SwitchAspStatusResponse
     */
    public SwitchAspStatusResponse switchAspStatus(SwitchAspStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchAspStatus);
    }

    /**
     * 打开或者关闭ASP开关
     *
     * 打开或者关闭ASP开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchAspStatusRequest 请求对象
     * @return SyncInvoker<SwitchAspStatusRequest, SwitchAspStatusResponse>
     */
    public SyncInvoker<SwitchAspStatusRequest, SwitchAspStatusResponse> switchAspStatusInvoker(
        SwitchAspStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchAspStatus, hcClient);
    }

    /**
     * 关联LTS日志流
     *
     * 关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindLtsConfigRequest 请求对象
     * @return BindLtsConfigResponse
     */
    public BindLtsConfigResponse bindLtsConfig(BindLtsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.bindLtsConfig);
    }

    /**
     * 关联LTS日志流
     *
     * 关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindLtsConfigRequest 请求对象
     * @return SyncInvoker<BindLtsConfigRequest, BindLtsConfigResponse>
     */
    public SyncInvoker<BindLtsConfigRequest, BindLtsConfigResponse> bindLtsConfigInvoker(BindLtsConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.bindLtsConfig, hcClient);
    }

    /**
     * 查看LTS日志配置信息
     *
     * 查看LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return ListLtsConfigsResponse
     */
    public ListLtsConfigsResponse listLtsConfigs(ListLtsConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listLtsConfigs);
    }

    /**
     * 查看LTS日志配置信息
     *
     * 查看LTS日志配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLtsConfigsRequest 请求对象
     * @return SyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse>
     */
    public SyncInvoker<ListLtsConfigsRequest, ListLtsConfigsResponse> listLtsConfigsInvoker(
        ListLtsConfigsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listLtsConfigs, hcClient);
    }

    /**
     * 解除关联LTS日志流
     *
     * 解除关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindLtsConfigRequest 请求对象
     * @return UnbindLtsConfigResponse
     */
    public UnbindLtsConfigResponse unbindLtsConfig(UnbindLtsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.unbindLtsConfig);
    }

    /**
     * 解除关联LTS日志流
     *
     * 解除关联LTS日志流。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindLtsConfigRequest 请求对象
     * @return SyncInvoker<UnbindLtsConfigRequest, UnbindLtsConfigResponse>
     */
    public SyncInvoker<UnbindLtsConfigRequest, UnbindLtsConfigResponse> unbindLtsConfigInvoker(
        UnbindLtsConfigRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.unbindLtsConfig, hcClient);
    }

    /**
     * 创建限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLimitTaskRequest 请求对象
     * @return CreateLimitTaskResponse
     */
    public CreateLimitTaskResponse createLimitTask(CreateLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createLimitTask);
    }

    /**
     * 创建限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLimitTaskRequest 请求对象
     * @return SyncInvoker<CreateLimitTaskRequest, CreateLimitTaskResponse>
     */
    public SyncInvoker<CreateLimitTaskRequest, CreateLimitTaskResponse> createLimitTaskInvoker(
        CreateLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createLimitTask, hcClient);
    }

    /**
     * 创建SQL限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitTaskRequest 请求对象
     * @return CreateSqlLimitTaskResponse
     */
    public CreateSqlLimitTaskResponse createSqlLimitTask(CreateSqlLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createSqlLimitTask);
    }

    /**
     * 创建SQL限流任务
     *
     * 根据具体范围和类型，进行限流任务的创建。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitTaskRequest 请求对象
     * @return SyncInvoker<CreateSqlLimitTaskRequest, CreateSqlLimitTaskResponse>
     */
    public SyncInvoker<CreateSqlLimitTaskRequest, CreateSqlLimitTaskResponse> createSqlLimitTaskInvoker(
        CreateSqlLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createSqlLimitTask, hcClient);
    }

    /**
     * 删除限流任务
     *
     * 根据task_id进行限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLimitTaskRequest 请求对象
     * @return DeleteLimitTaskResponse
     */
    public DeleteLimitTaskResponse deleteLimitTask(DeleteLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteLimitTask);
    }

    /**
     * 删除限流任务
     *
     * 根据task_id进行限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLimitTaskRequest 请求对象
     * @return SyncInvoker<DeleteLimitTaskRequest, DeleteLimitTaskResponse>
     */
    public SyncInvoker<DeleteLimitTaskRequest, DeleteLimitTaskResponse> deleteLimitTaskInvoker(
        DeleteLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteLimitTask, hcClient);
    }

    /**
     * 删除SQL限流任务
     *
     * 根据task_id进行SQL限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitTaskRequest 请求对象
     * @return DeleteSqlLimitTaskResponse
     */
    public DeleteSqlLimitTaskResponse deleteSqlLimitTask(DeleteSqlLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteSqlLimitTask);
    }

    /**
     * 删除SQL限流任务
     *
     * 根据task_id进行SQL限流任务的删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitTaskRequest 请求对象
     * @return SyncInvoker<DeleteSqlLimitTaskRequest, DeleteSqlLimitTaskResponse>
     */
    public SyncInvoker<DeleteSqlLimitTaskRequest, DeleteSqlLimitTaskResponse> deleteSqlLimitTaskInvoker(
        DeleteSqlLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.deleteSqlLimitTask, hcClient);
    }

    /**
     * 查询实例全量SQL聚合统计列表
     *
     * 查询GaussDB数据库实例全量SQL聚合统计列表，主要统计各唯一SQL ID下的SQL记录总数量以及相关时间指标的平均值。支持增强型条件过滤， 如可以对SQL文本（query字段）进行多条件合并查询，对total_sql_time、sql_count字段进行大于、小于、区间范围等条件的过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlStatisticsRequest 请求对象
     * @return ListEnhanceFullSqlStatisticsResponse
     */
    public ListEnhanceFullSqlStatisticsResponse listEnhanceFullSqlStatistics(
        ListEnhanceFullSqlStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listEnhanceFullSqlStatistics);
    }

    /**
     * 查询实例全量SQL聚合统计列表
     *
     * 查询GaussDB数据库实例全量SQL聚合统计列表，主要统计各唯一SQL ID下的SQL记录总数量以及相关时间指标的平均值。支持增强型条件过滤， 如可以对SQL文本（query字段）进行多条件合并查询，对total_sql_time、sql_count字段进行大于、小于、区间范围等条件的过滤。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlStatisticsRequest 请求对象
     * @return SyncInvoker<ListEnhanceFullSqlStatisticsRequest, ListEnhanceFullSqlStatisticsResponse>
     */
    public SyncInvoker<ListEnhanceFullSqlStatisticsRequest, ListEnhanceFullSqlStatisticsResponse> listEnhanceFullSqlStatisticsInvoker(
        ListEnhanceFullSqlStatisticsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listEnhanceFullSqlStatistics, hcClient);
    }

    /**
     * 查询全量单条SQL记录列表
     *
     * 查询GaussDB数据库实例全量SQL日志记录列表，支持增强型条件过滤。 如可对SQL文本（query字段）进行多条件合并查询，可对db_time、cpu_time、data_io_time及execution_time字段进行大于、小于、区间范围等条件的过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlsRequest 请求对象
     * @return ListEnhanceFullSqlsResponse
     */
    public ListEnhanceFullSqlsResponse listEnhanceFullSqls(ListEnhanceFullSqlsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listEnhanceFullSqls);
    }

    /**
     * 查询全量单条SQL记录列表
     *
     * 查询GaussDB数据库实例全量SQL日志记录列表，支持增强型条件过滤。 如可对SQL文本（query字段）进行多条件合并查询，可对db_time、cpu_time、data_io_time及execution_time字段进行大于、小于、区间范围等条件的过滤
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnhanceFullSqlsRequest 请求对象
     * @return SyncInvoker<ListEnhanceFullSqlsRequest, ListEnhanceFullSqlsResponse>
     */
    public SyncInvoker<ListEnhanceFullSqlsRequest, ListEnhanceFullSqlsResponse> listEnhanceFullSqlsInvoker(
        ListEnhanceFullSqlsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listEnhanceFullSqls, hcClient);
    }

    /**
     * 查询GaussDB数据库实例全量SQL开关记录列表
     *
     * 查询GaussDB数据库实例全量SQL开关记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlSwitchesRequest 请求对象
     * @return ListFullSqlSwitchesResponse
     */
    public ListFullSqlSwitchesResponse listFullSqlSwitches(ListFullSqlSwitchesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listFullSqlSwitches);
    }

    /**
     * 查询GaussDB数据库实例全量SQL开关记录列表
     *
     * 查询GaussDB数据库实例全量SQL开关记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlSwitchesRequest 请求对象
     * @return SyncInvoker<ListFullSqlSwitchesRequest, ListFullSqlSwitchesResponse>
     */
    public SyncInvoker<ListFullSqlSwitchesRequest, ListFullSqlSwitchesResponse> listFullSqlSwitchesInvoker(
        ListFullSqlSwitchesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listFullSqlSwitches, hcClient);
    }

    /**
     * 根据指定条件查询限流任务列表
     *
     * 根据指定条件查询限流任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLimitTaskRequest 请求对象
     * @return ListLimitTaskResponse
     */
    public ListLimitTaskResponse listLimitTask(ListLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listLimitTask);
    }

    /**
     * 根据指定条件查询限流任务列表
     *
     * 根据指定条件查询限流任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLimitTaskRequest 请求对象
     * @return SyncInvoker<ListLimitTaskRequest, ListLimitTaskResponse>
     */
    public SyncInvoker<ListLimitTaskRequest, ListLimitTaskResponse> listLimitTaskInvoker(ListLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listLimitTask, hcClient);
    }

    /**
     * 查询节点的sql模板列表
     *
     * 查询节点的sql模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLimitSqlModelRequest 请求对象
     * @return ListNodeLimitSqlModelResponse
     */
    public ListNodeLimitSqlModelResponse listNodeLimitSqlModel(ListNodeLimitSqlModelRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listNodeLimitSqlModel);
    }

    /**
     * 查询节点的sql模板列表
     *
     * 查询节点的sql模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNodeLimitSqlModelRequest 请求对象
     * @return SyncInvoker<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse>
     */
    public SyncInvoker<ListNodeLimitSqlModelRequest, ListNodeLimitSqlModelResponse> listNodeLimitSqlModelInvoker(
        ListNodeLimitSqlModelRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listNodeLimitSqlModel, hcClient);
    }

    /**
     * 查询慢SQL详情
     *
     * 根据归一化SQLID，查询该SQL模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlDetailsRequest 请求对象
     * @return ListSlowSqlDetailsResponse
     */
    public ListSlowSqlDetailsResponse listSlowSqlDetails(ListSlowSqlDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSlowSqlDetails);
    }

    /**
     * 查询慢SQL详情
     *
     * 根据归一化SQLID，查询该SQL模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlDetailsRequest 请求对象
     * @return SyncInvoker<ListSlowSqlDetailsRequest, ListSlowSqlDetailsResponse>
     */
    public SyncInvoker<ListSlowSqlDetailsRequest, ListSlowSqlDetailsResponse> listSlowSqlDetailsInvoker(
        ListSlowSqlDetailsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSlowSqlDetails, hcClient);
    }

    /**
     * 查询慢SQL列表
     *
     * 查询慢SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlsRequest 请求对象
     * @return ListSlowSqlsResponse
     */
    public ListSlowSqlsResponse listSlowSqls(ListSlowSqlsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSlowSqls);
    }

    /**
     * 查询慢SQL列表
     *
     * 查询慢SQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSlowSqlsRequest 请求对象
     * @return SyncInvoker<ListSlowSqlsRequest, ListSlowSqlsResponse>
     */
    public SyncInvoker<ListSlowSqlsRequest, ListSlowSqlsResponse> listSlowSqlsInvoker(ListSlowSqlsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSlowSqls, hcClient);
    }

    /**
     * 查询慢SQL节点信息
     *
     * 根据实例ID查询慢SQL节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlExcuteNodesRequest 请求对象
     * @return ListSqlExcuteNodesResponse
     */
    public ListSqlExcuteNodesResponse listSqlExcuteNodes(ListSqlExcuteNodesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlExcuteNodes);
    }

    /**
     * 查询慢SQL节点信息
     *
     * 根据实例ID查询慢SQL节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlExcuteNodesRequest 请求对象
     * @return SyncInvoker<ListSqlExcuteNodesRequest, ListSqlExcuteNodesResponse>
     */
    public SyncInvoker<ListSqlExcuteNodesRequest, ListSqlExcuteNodesResponse> listSqlExcuteNodesInvoker(
        ListSqlExcuteNodesRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlExcuteNodes, hcClient);
    }

    /**
     * 根据指定条件查询SQL限流任务列表
     *
     * 根据指定条件查询SQL限流任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitTaskRequest 请求对象
     * @return ListSqlLimitTaskResponse
     */
    public ListSqlLimitTaskResponse listSqlLimitTask(ListSqlLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlLimitTask);
    }

    /**
     * 根据指定条件查询SQL限流任务列表
     *
     * 根据指定条件查询SQL限流任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitTaskRequest 请求对象
     * @return SyncInvoker<ListSqlLimitTaskRequest, ListSqlLimitTaskResponse>
     */
    public SyncInvoker<ListSqlLimitTaskRequest, ListSqlLimitTaskResponse> listSqlLimitTaskInvoker(
        ListSqlLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlLimitTask, hcClient);
    }

    /**
     * 查询GaussDB数据库实例SQL链路
     *
     * 查询GaussDB数据库实例SQL链路，包含实例上对应组件的链路列表，如dn_6001、dn_6002、cn_5001、cn_5002。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTraceRequest 请求对象
     * @return ListSqlTraceResponse
     */
    public ListSqlTraceResponse listSqlTrace(ListSqlTraceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listSqlTrace);
    }

    /**
     * 查询GaussDB数据库实例SQL链路
     *
     * 查询GaussDB数据库实例SQL链路，包含实例上对应组件的链路列表，如dn_6001、dn_6002、cn_5001、cn_5002。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTraceRequest 请求对象
     * @return SyncInvoker<ListSqlTraceRequest, ListSqlTraceResponse>
     */
    public SyncInvoker<ListSqlTraceRequest, ListSqlTraceResponse> listSqlTraceInvoker(ListSqlTraceRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listSqlTrace, hcClient);
    }

    /**
     * 查询全局慢SQL详情
     *
     * 根据唯一SQLID，查询指定组件的慢SQL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalSlowSqlDetailRequest 请求对象
     * @return ShowGlobalSlowSqlDetailResponse
     */
    public ShowGlobalSlowSqlDetailResponse showGlobalSlowSqlDetail(ShowGlobalSlowSqlDetailRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showGlobalSlowSqlDetail);
    }

    /**
     * 查询全局慢SQL详情
     *
     * 根据唯一SQLID，查询指定组件的慢SQL详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalSlowSqlDetailRequest 请求对象
     * @return SyncInvoker<ShowGlobalSlowSqlDetailRequest, ShowGlobalSlowSqlDetailResponse>
     */
    public SyncInvoker<ShowGlobalSlowSqlDetailRequest, ShowGlobalSlowSqlDetailResponse> showGlobalSlowSqlDetailInvoker(
        ShowGlobalSlowSqlDetailRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showGlobalSlowSqlDetail, hcClient);
    }

    /**
     * 查询限流任务详情
     *
     * 查询限流任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLimitTaskRequest 请求对象
     * @return ShowLimitTaskResponse
     */
    public ShowLimitTaskResponse showLimitTask(ShowLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showLimitTask);
    }

    /**
     * 查询限流任务详情
     *
     * 查询限流任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLimitTaskRequest 请求对象
     * @return SyncInvoker<ShowLimitTaskRequest, ShowLimitTaskResponse>
     */
    public SyncInvoker<ShowLimitTaskRequest, ShowLimitTaskResponse> showLimitTaskInvoker(ShowLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showLimitTask, hcClient);
    }

    /**
     * 查询SQL限流任务详情
     *
     * 查询SQL限流任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitTaskRequest 请求对象
     * @return ShowSqlLimitTaskResponse
     */
    public ShowSqlLimitTaskResponse showSqlLimitTask(ShowSqlLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSqlLimitTask);
    }

    /**
     * 查询SQL限流任务详情
     *
     * 查询SQL限流任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitTaskRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitTaskRequest, ShowSqlLimitTaskResponse>
     */
    public SyncInvoker<ShowSqlLimitTaskRequest, ShowSqlLimitTaskResponse> showSqlLimitTaskInvoker(
        ShowSqlLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSqlLimitTask, hcClient);
    }

    /**
     * 开启GaussDB数据库实例全量SQL功能
     *
     * 开启全量SQL功能。使实例Agent侧开启内核侧全量SQL能力，持续化采集GaussDB数据库实例上的执行SQL语句，定时批量持久化存储于LTS云服务对应日志流中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFullSqlRequest 请求对象
     * @return StartFullSqlResponse
     */
    public StartFullSqlResponse startFullSql(StartFullSqlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.startFullSql);
    }

    /**
     * 开启GaussDB数据库实例全量SQL功能
     *
     * 开启全量SQL功能。使实例Agent侧开启内核侧全量SQL能力，持续化采集GaussDB数据库实例上的执行SQL语句，定时批量持久化存储于LTS云服务对应日志流中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartFullSqlRequest 请求对象
     * @return SyncInvoker<StartFullSqlRequest, StartFullSqlResponse>
     */
    public SyncInvoker<StartFullSqlRequest, StartFullSqlResponse> startFullSqlInvoker(StartFullSqlRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.startFullSql, hcClient);
    }

    /**
     * 关闭全量SQL功能
     *
     * 关闭全量SQL功能。关闭后，实例Agent侧将停止内核侧全量SQL语句记录的实时采集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFullSqlRequest 请求对象
     * @return StopFullSqlResponse
     */
    public StopFullSqlResponse stopFullSql(StopFullSqlRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.stopFullSql);
    }

    /**
     * 关闭全量SQL功能
     *
     * 关闭全量SQL功能。关闭后，实例Agent侧将停止内核侧全量SQL语句记录的实时采集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopFullSqlRequest 请求对象
     * @return SyncInvoker<StopFullSqlRequest, StopFullSqlResponse>
     */
    public SyncInvoker<StopFullSqlRequest, StopFullSqlResponse> stopFullSqlInvoker(StopFullSqlRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.stopFullSql, hcClient);
    }

    /**
     * 同步内核侧sql限流数据至管控侧
     *
     * 同步内核侧sql限流数据至管控侧
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncLimitDataRequest 请求对象
     * @return SyncLimitDataResponse
     */
    public SyncLimitDataResponse syncLimitData(SyncLimitDataRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.syncLimitData);
    }

    /**
     * 同步内核侧sql限流数据至管控侧
     *
     * 同步内核侧sql限流数据至管控侧
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncLimitDataRequest 请求对象
     * @return SyncInvoker<SyncLimitDataRequest, SyncLimitDataResponse>
     */
    public SyncInvoker<SyncLimitDataRequest, SyncLimitDataResponse> syncLimitDataInvoker(SyncLimitDataRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.syncLimitData, hcClient);
    }

    /**
     * 修改限流任务
     *
     * 根据新的条件进行限流任务的更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLimitTaskRequest 请求对象
     * @return UpdateLimitTaskResponse
     */
    public UpdateLimitTaskResponse updateLimitTask(UpdateLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateLimitTask);
    }

    /**
     * 修改限流任务
     *
     * 根据新的条件进行限流任务的更新
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLimitTaskRequest 请求对象
     * @return SyncInvoker<UpdateLimitTaskRequest, UpdateLimitTaskResponse>
     */
    public SyncInvoker<UpdateLimitTaskRequest, UpdateLimitTaskResponse> updateLimitTaskInvoker(
        UpdateLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateLimitTask, hcClient);
    }

    /**
     * 修改SQL限流任务
     *
     * 根据新的条件进行SQL限流任务的更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitTaskRequest 请求对象
     * @return UpdateSqlLimitTaskResponse
     */
    public UpdateSqlLimitTaskResponse updateSqlLimitTask(UpdateSqlLimitTaskRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateSqlLimitTask);
    }

    /**
     * 修改SQL限流任务
     *
     * 根据新的条件进行SQL限流任务的更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitTaskRequest 请求对象
     * @return SyncInvoker<UpdateSqlLimitTaskRequest, UpdateSqlLimitTaskResponse>
     */
    public SyncInvoker<UpdateSqlLimitTaskRequest, UpdateSqlLimitTaskResponse> updateSqlLimitTaskInvoker(
        UpdateSqlLimitTaskRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.updateSqlLimitTask, hcClient);
    }

    /**
     * 查询SQL PATCH
     *
     * 查询SQL PATCH信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlPatchRequest 请求对象
     * @return ShowSqlPatchResponse
     */
    public ShowSqlPatchResponse showSqlPatch(ShowSqlPatchRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showSqlPatch);
    }

    /**
     * 查询SQL PATCH
     *
     * 查询SQL PATCH信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlPatchRequest 请求对象
     * @return SyncInvoker<ShowSqlPatchRequest, ShowSqlPatchResponse>
     */
    public SyncInvoker<ShowSqlPatchRequest, ShowSqlPatchResponse> showSqlPatchInvoker(ShowSqlPatchRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showSqlPatch, hcClient);
    }

    /**
     * 查询TopSQL列表
     *
     * 查询TopSQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSqlsRequest 请求对象
     * @return ListTopSqlsResponse
     */
    public ListTopSqlsResponse listTopSqls(ListTopSqlsRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listTopSqls);
    }

    /**
     * 查询TopSQL列表
     *
     * 查询TopSQL列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSqlsRequest 请求对象
     * @return SyncInvoker<ListTopSqlsRequest, ListTopSqlsResponse>
     */
    public SyncInvoker<ListTopSqlsRequest, ListTopSqlsResponse> listTopSqlsInvoker(ListTopSqlsRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.listTopSqls, hcClient);
    }

    /**
     * 采集WDR快照报告
     *
     * 采集WDR快照报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectWdrSnapshotRequest 请求对象
     * @return CollectWdrSnapshotResponse
     */
    public CollectWdrSnapshotResponse collectWdrSnapshot(CollectWdrSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.collectWdrSnapshot);
    }

    /**
     * 采集WDR快照报告
     *
     * 采集WDR快照报告。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectWdrSnapshotRequest 请求对象
     * @return SyncInvoker<CollectWdrSnapshotRequest, CollectWdrSnapshotResponse>
     */
    public SyncInvoker<CollectWdrSnapshotRequest, CollectWdrSnapshotResponse> collectWdrSnapshotInvoker(
        CollectWdrSnapshotRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.collectWdrSnapshot, hcClient);
    }

    /**
     * 生成WDR快照
     *
     * 生成WDR快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrSnapshotRequest 请求对象
     * @return CreateWdrSnapshotResponse
     */
    public CreateWdrSnapshotResponse createWdrSnapshot(CreateWdrSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createWdrSnapshot);
    }

    /**
     * 生成WDR快照
     *
     * 生成WDR快照。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrSnapshotRequest 请求对象
     * @return SyncInvoker<CreateWdrSnapshotRequest, CreateWdrSnapshotResponse>
     */
    public SyncInvoker<CreateWdrSnapshotRequest, CreateWdrSnapshotResponse> createWdrSnapshotInvoker(
        CreateWdrSnapshotRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.createWdrSnapshot, hcClient);
    }

    /**
     * 查询WDR快照开关状态
     *
     * 查询WDR快照开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotStatusRequest 请求对象
     * @return ShowWdrSnapshotStatusResponse
     */
    public ShowWdrSnapshotStatusResponse showWdrSnapshotStatus(ShowWdrSnapshotStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.showWdrSnapshotStatus);
    }

    /**
     * 查询WDR快照开关状态
     *
     * 查询WDR快照开关状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotStatusRequest 请求对象
     * @return SyncInvoker<ShowWdrSnapshotStatusRequest, ShowWdrSnapshotStatusResponse>
     */
    public SyncInvoker<ShowWdrSnapshotStatusRequest, ShowWdrSnapshotStatusResponse> showWdrSnapshotStatusInvoker(
        ShowWdrSnapshotStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.showWdrSnapshotStatus, hcClient);
    }

    /**
     * 打开或关闭WDR快照开关
     *
     * 打开或关闭WDR快照开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchWdrSnapshotStatusRequest 请求对象
     * @return SwitchWdrSnapshotStatusResponse
     */
    public SwitchWdrSnapshotStatusResponse switchWdrSnapshotStatus(SwitchWdrSnapshotStatusRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.switchWdrSnapshotStatus);
    }

    /**
     * 打开或关闭WDR快照开关
     *
     * 打开或关闭WDR快照开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchWdrSnapshotStatusRequest 请求对象
     * @return SyncInvoker<SwitchWdrSnapshotStatusRequest, SwitchWdrSnapshotStatusResponse>
     */
    public SyncInvoker<SwitchWdrSnapshotStatusRequest, SwitchWdrSnapshotStatusResponse> switchWdrSnapshotStatusInvoker(
        SwitchWdrSnapshotStatusRequest request) {
        return new SyncInvoker<>(request, GaussDBforopenGaussMeta.switchWdrSnapshotStatus, hcClient);
    }

}

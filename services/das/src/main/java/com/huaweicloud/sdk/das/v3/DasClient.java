package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskRequest;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskResponse;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupRequest;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupResponse;
import com.huaweicloud.sdk.das.v3.model.AddSqlLimitingRecordNewRequest;
import com.huaweicloud.sdk.das.v3.model.AddSqlLimitingRecordNewResponse;
import com.huaweicloud.sdk.das.v3.model.AddTasksNewRequest;
import com.huaweicloud.sdk.das.v3.model.AddTasksNewResponse;
import com.huaweicloud.sdk.das.v3.model.BatchAddFullSqlTasksRequest;
import com.huaweicloud.sdk.das.v3.model.BatchAddFullSqlTasksResponse;
import com.huaweicloud.sdk.das.v3.model.BatchDeleteConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.BatchDeleteConnectionNewResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSetSqlSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSetSqlSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportResponse;
import com.huaweicloud.sdk.das.v3.model.CancelConnectionProcessRequest;
import com.huaweicloud.sdk.das.v3.model.CancelConnectionProcessResponse;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.CancelShareNewRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeDeadLockSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeDeadLockSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangePaymentModeNewRequest;
import com.huaweicloud.sdk.das.v3.model.ChangePaymentModeNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeQuotaNewRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeQuotaNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialForBatchInspectionRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialForBatchInspectionResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.CheckHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CheckHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateDbsConnectionRequest;
import com.huaweicloud.sdk.das.v3.model.CreateDbsConnectionResponse;
import com.huaweicloud.sdk.das.v3.model.CreateFullSqlBucketRequest;
import com.huaweicloud.sdk.das.v3.model.CreateFullSqlBucketResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateIndexUsageExportTaskNewRequest;
import com.huaweicloud.sdk.das.v3.model.CreateIndexUsageExportTaskNewResponse;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionRequest;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionResponse;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceHealthReportTaskNewRequest;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceHealthReportTaskNewResponse;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.CreateTuningRequest;
import com.huaweicloud.sdk.das.v3.model.CreateTuningResponse;
import com.huaweicloud.sdk.das.v3.model.CreateWdrReportRequest;
import com.huaweicloud.sdk.das.v3.model.CreateWdrReportResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteDbObjNewRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbObjNewResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteExportTaskNewRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteExportTaskNewResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteFullSqlExportTaskObsFileRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteFullSqlExportTaskObsFileResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.EnableQuotaRequest;
import com.huaweicloud.sdk.das.v3.model.EnableQuotaResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteFormatSqlRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteFormatSqlResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteImportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteImportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteLoginConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteLoginConnectionNewResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteSplitSqlRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteSplitSqlResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteTestConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteTestConnectionNewResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteTuningRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteTuningResponse;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportInstanceListNewRequest;
import com.huaweicloud.sdk.das.v3.model.ExportInstanceListNewResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowQueryLogsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowQueryLogsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlStatisticsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlStatisticsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTemplatesDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTemplatesDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTrendDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlTrendDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSqlStatementsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSqlStatementsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopRiskInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopRiskInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTemplatesDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTemplatesDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTrendDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTrendDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ImportExportObsObjectsRequest;
import com.huaweicloud.sdk.das.v3.model.ImportExportObsObjectsResponse;
import com.huaweicloud.sdk.das.v3.model.InvokeWdrReportRequest;
import com.huaweicloud.sdk.das.v3.model.InvokeWdrReportResponse;
import com.huaweicloud.sdk.das.v3.model.ListAllTypeInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ListAllTypeInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageRequest;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageResponse;
import com.huaweicloud.sdk.das.v3.model.ListBinlogExportsRequest;
import com.huaweicloud.sdk.das.v3.model.ListBinlogExportsResponse;
import com.huaweicloud.sdk.das.v3.model.ListBinlogFilesRequest;
import com.huaweicloud.sdk.das.v3.model.ListBinlogFilesResponse;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ListConnectionProcessesRequest;
import com.huaweicloud.sdk.das.v3.model.ListConnectionProcessesResponse;
import com.huaweicloud.sdk.das.v3.model.ListConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListDatabaseObjectsRequest;
import com.huaweicloud.sdk.das.v3.model.ListDatabaseObjectsResponse;
import com.huaweicloud.sdk.das.v3.model.ListDbNamesRequest;
import com.huaweicloud.sdk.das.v3.model.ListDbNamesResponse;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.das.v3.model.ListDeadLockDatabasesRequest;
import com.huaweicloud.sdk.das.v3.model.ListDeadLockDatabasesResponse;
import com.huaweicloud.sdk.das.v3.model.ListDeadLockDetailRequest;
import com.huaweicloud.sdk.das.v3.model.ListDeadLockDetailResponse;
import com.huaweicloud.sdk.das.v3.model.ListEmailRecordRequest;
import com.huaweicloud.sdk.das.v3.model.ListEmailRecordResponse;
import com.huaweicloud.sdk.das.v3.model.ListEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.ListEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.ListFullDeadLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListFullDeadLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlExportTasksRequest;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlExportTasksResponse;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlTasksRequest;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlTasksResponse;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListInspectionReportRequest;
import com.huaweicloud.sdk.das.v3.model.ListInspectionReportResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceHealthReportTasksRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceHealthReportTasksResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetricRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceNodesInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceNodesInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListLockBlockingDbRequest;
import com.huaweicloud.sdk.das.v3.model.ListLockBlockingDbResponse;
import com.huaweicloud.sdk.das.v3.model.ListLockBlockingDetailRequest;
import com.huaweicloud.sdk.das.v3.model.ListLockBlockingDetailResponse;
import com.huaweicloud.sdk.das.v3.model.ListLockBlockingRelationshipRequest;
import com.huaweicloud.sdk.das.v3.model.ListLockBlockingRelationshipResponse;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListNotSetChargeModeInstanceRequest;
import com.huaweicloud.sdk.das.v3.model.ListNotSetChargeModeInstanceResponse;
import com.huaweicloud.sdk.das.v3.model.ListProcessesRequest;
import com.huaweicloud.sdk.das.v3.model.ListProcessesResponse;
import com.huaweicloud.sdk.das.v3.model.ListRiskItemsRequest;
import com.huaweicloud.sdk.das.v3.model.ListRiskItemsResponse;
import com.huaweicloud.sdk.das.v3.model.ListRiskTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ListRiskTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ListSchemaNamesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSchemaNamesResponse;
import com.huaweicloud.sdk.das.v3.model.ListSharedConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSharedConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSmnTopicsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSmnTopicsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSnapshots4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.ListSnapshots4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisRequest;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitUserInstanceRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitUserInstanceResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateComparisonsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateComparisonsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateDatabasesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateDatabasesResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplatesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplatesResponse;
import com.huaweicloud.sdk.das.v3.model.ListTasksByBatchIdRequest;
import com.huaweicloud.sdk.das.v3.model.ListTasksByBatchIdResponse;
import com.huaweicloud.sdk.das.v3.model.ListTasksBySqlTemplateIdRequest;
import com.huaweicloud.sdk.das.v3.model.ListTasksBySqlTemplateIdResponse;
import com.huaweicloud.sdk.das.v3.model.ListTasksByTaskIdRequest;
import com.huaweicloud.sdk.das.v3.model.ListTasksByTaskIdResponse;
import com.huaweicloud.sdk.das.v3.model.ListTemplateDatabaseComparisonsRequest;
import com.huaweicloud.sdk.das.v3.model.ListTemplateDatabaseComparisonsResponse;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListUserInstanceListRequest;
import com.huaweicloud.sdk.das.v3.model.ListUserInstanceListResponse;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.ParseDeadLockRequest;
import com.huaweicloud.sdk.das.v3.model.ParseDeadLockResponse;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.RetryBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.RetryBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialForBatchInspectionRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialForBatchInspectionResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.SearchBinlogParseRequest;
import com.huaweicloud.sdk.das.v3.model.SearchBinlogParseResponse;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfo4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfo4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfoSource4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfoSource4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.SearchNewRequest;
import com.huaweicloud.sdk.das.v3.model.SearchNewResponse;
import com.huaweicloud.sdk.das.v3.model.SetLockBlockingSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.SetLockBlockingSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.SetSqlSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.SetSqlSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricRequest;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionResultRequest;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionResultResponse;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogExportTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogExportTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogParseRequest;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogParseResponse;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowClouddbaGetSearchPathFlagNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowClouddbaGetSearchPathFlagNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.ShowCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDasCloudDbaPriceRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDasCloudDbaPriceResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDasRecommendSqlLimitRuleRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDasRecommendSqlLimitRuleResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDdsConnectionStatRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDdsConnectionStatResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockAnalysisResultRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockAnalysisResultResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockOriginDataRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockOriginDataResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockRelationshipRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockRelationshipResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockStatisticsRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockStatisticsResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockTopologyRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockTopologyResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDeadLockTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyNoRetryRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyNoRetryResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExecutionPlanRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExecutionPlanResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExecutionTimeTemplateTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExecutionTimeTemplateTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExportTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExportTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFragmentSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFragmentSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockListRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockListResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ShowGlobalPrivacyNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowGlobalPrivacyNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionExportTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionExportTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowIndexUsageSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowIndexUsageSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReport4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReport4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceLogUsageRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceLogUsageResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceMetricRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceNodesInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceNodesInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowIsSignedProtocolRequest;
import com.huaweicloud.sdk.das.v3.model.ShowIsSignedProtocolResponse;
import com.huaweicloud.sdk.das.v3.model.ShowKillProcessTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ShowKillProcessTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ShowKillProcessTaskSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ShowKillProcessTaskSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshot4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshot4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLatestInstanceHealthReportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLatestInstanceHealthReportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLockBlockingStatisticsRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLockBlockingStatisticsResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLockBlockingSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLockBlockingSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLockBlockingTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLockBlockingTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLongHistoryTransactionSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLongHistoryTransactionSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowMetaLockRequest;
import com.huaweicloud.sdk.das.v3.model.ShowMetaLockResponse;
import com.huaweicloud.sdk.das.v3.model.ShowMetaLockSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowMetaLockSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowMetricNamesSupportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowMetricNamesSupportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowNameListRequest;
import com.huaweicloud.sdk.das.v3.model.ShowNameListResponse;
import com.huaweicloud.sdk.das.v3.model.ShowOpeningInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowOpeningInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSingleTemplateTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSingleTemplateTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSlowLogSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSlowLogSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExecutionPlanRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExecutionPlanResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExplainRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExplainResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitJobInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitJobInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitingSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitingSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlTemplateTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlTemplateTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSupportKeyStringRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSupportKeyStringResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSupportedEnginesRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSupportedEnginesResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTuningRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResultRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResultResponse;
import com.huaweicloud.sdk.das.v3.model.ShowWaitingLocksSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowWaitingLocksSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowWdrSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowWdrSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowWhetherUseCloudDbaRequest;
import com.huaweicloud.sdk.das.v3.model.ShowWhetherUseCloudDbaResponse;
import com.huaweicloud.sdk.das.v3.model.SignProtocolNewRequest;
import com.huaweicloud.sdk.das.v3.model.SignProtocolNewResponse;
import com.huaweicloud.sdk.das.v3.model.StartAnalysisSessionRequest;
import com.huaweicloud.sdk.das.v3.model.StartAnalysisSessionResponse;
import com.huaweicloud.sdk.das.v3.model.StopBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.StopBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.SubscribeInstanceReportNewRequest;
import com.huaweicloud.sdk.das.v3.model.SubscribeInstanceReportNewResponse;
import com.huaweicloud.sdk.das.v3.model.SwitchFullsqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.SwitchFullsqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstanceListNewRequest;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstanceListNewResponse;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.UnsubscribeInstanceReportNewRequest;
import com.huaweicloud.sdk.das.v3.model.UnsubscribeInstanceReportNewResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateFullSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateFullSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceConfigRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceConfigResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSearchPathFlagRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSearchPathFlagResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSharedInfoNewRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSharedInfoNewResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.VerifyConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.VerifyConnectionNewResponse;

public class DasClient {

    protected HcClient hcClient;

    public DasClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasClient> newBuilder() {
        ClientBuilder<DasClient> clientBuilder = new ClientBuilder<>(DasClient::new);
        return clientBuilder;
    }

    /**
     * 删除共享链接
     *
     * 删除共享链接，
     * 用于用户删除共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareConnectionsRequest 请求对象
     * @return CancelShareConnectionsResponse
     */
    public CancelShareConnectionsResponse cancelShareConnections(CancelShareConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.cancelShareConnections);
    }

    /**
     * 删除共享链接
     *
     * 删除共享链接，
     * 用于用户删除共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareConnectionsRequest 请求对象
     * @return SyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse>
     */
    public SyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse> cancelShareConnectionsInvoker(
        CancelShareConnectionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.cancelShareConnections, hcClient);
    }

    /**
     * 创建实例连接
     *
     * 创建实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceConnectionRequest 请求对象
     * @return CreateInstanceConnectionResponse
     */
    public CreateInstanceConnectionResponse createInstanceConnection(CreateInstanceConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createInstanceConnection);
    }

    /**
     * 创建实例连接
     *
     * 创建实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceConnectionRequest 请求对象
     * @return SyncInvoker<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse>
     */
    public SyncInvoker<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse> createInstanceConnectionInvoker(
        CreateInstanceConnectionRequest request) {
        return new SyncInvoker<>(request, DasMeta.createInstanceConnection, hcClient);
    }

    /**
     * 设置共享链接
     *
     * 设置共享链接，
     * 用于用户添加共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareConnectionsRequest 请求对象
     * @return CreateShareConnectionsResponse
     */
    public CreateShareConnectionsResponse createShareConnections(CreateShareConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createShareConnections);
    }

    /**
     * 设置共享链接
     *
     * 设置共享链接，
     * 用于用户添加共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareConnectionsRequest 请求对象
     * @return SyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse>
     */
    public SyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse> createShareConnectionsInvoker(
        CreateShareConnectionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.createShareConnections, hcClient);
    }

    /**
     * 立即执行导出任务
     *
     * 立即执行导出任务，
     * 用于用户立即执行导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteExportTaskRequest 请求对象
     * @return ExecuteExportTaskResponse
     */
    public ExecuteExportTaskResponse executeExportTask(ExecuteExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeExportTask);
    }

    /**
     * 立即执行导出任务
     *
     * 立即执行导出任务，
     * 用于用户立即执行导出任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteExportTaskRequest 请求对象
     * @return SyncInvoker<ExecuteExportTaskRequest, ExecuteExportTaskResponse>
     */
    public SyncInvoker<ExecuteExportTaskRequest, ExecuteExportTaskResponse> executeExportTaskInvoker(
        ExecuteExportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeExportTask, hcClient);
    }

    /**
     * 立即执行导入任务
     *
     * 立即执行导入任务，
     * 用于用户立即执行导入任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteImportTaskRequest 请求对象
     * @return ExecuteImportTaskResponse
     */
    public ExecuteImportTaskResponse executeImportTask(ExecuteImportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeImportTask);
    }

    /**
     * 立即执行导入任务
     *
     * 立即执行导入任务，
     * 用于用户立即执行导入任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteImportTaskRequest 请求对象
     * @return SyncInvoker<ExecuteImportTaskRequest, ExecuteImportTaskResponse>
     */
    public SyncInvoker<ExecuteImportTaskRequest, ExecuteImportTaskResponse> executeImportTaskInvoker(
        ExecuteImportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeImportTask, hcClient);
    }

    /**
     * 查询实例连接列表
     *
     * 查询实例连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listConnections);
    }

    /**
     * 查询实例连接列表
     *
     * 查询实例连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(
        ListConnectionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listConnections, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTasksNewRequest 请求对象
     * @return AddTasksNewResponse
     */
    public AddTasksNewResponse addTasksNew(AddTasksNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.addTasksNew);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTasksNewRequest 请求对象
     * @return SyncInvoker<AddTasksNewRequest, AddTasksNewResponse>
     */
    public SyncInvoker<AddTasksNewRequest, AddTasksNewResponse> addTasksNewInvoker(AddTasksNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.addTasksNew, hcClient);
    }

    /**
     * 批量创建全量SQL明细解析任务
     *
     * 批量创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddFullSqlTasksRequest 请求对象
     * @return BatchAddFullSqlTasksResponse
     */
    public BatchAddFullSqlTasksResponse batchAddFullSqlTasks(BatchAddFullSqlTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.batchAddFullSqlTasks);
    }

    /**
     * 批量创建全量SQL明细解析任务
     *
     * 批量创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddFullSqlTasksRequest 请求对象
     * @return SyncInvoker<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse>
     */
    public SyncInvoker<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse> batchAddFullSqlTasksInvoker(
        BatchAddFullSqlTasksRequest request) {
        return new SyncInvoker<>(request, DasMeta.batchAddFullSqlTasks, hcClient);
    }

    /**
     * 批量设置SQL开关
     *
     * 批量设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSqlSwitchNewRequest 请求对象
     * @return BatchSetSqlSwitchNewResponse
     */
    public BatchSetSqlSwitchNewResponse batchSetSqlSwitchNew(BatchSetSqlSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.batchSetSqlSwitchNew);
    }

    /**
     * 批量设置SQL开关
     *
     * 批量设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSqlSwitchNewRequest 请求对象
     * @return SyncInvoker<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse>
     */
    public SyncInvoker<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse> batchSetSqlSwitchNewInvoker(
        BatchSetSqlSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.batchSetSqlSwitchNew, hcClient);
    }

    /**
     * Kill进程
     *
     * Kill进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelConnectionProcessRequest 请求对象
     * @return CancelConnectionProcessResponse
     */
    public CancelConnectionProcessResponse cancelConnectionProcess(CancelConnectionProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.cancelConnectionProcess);
    }

    /**
     * Kill进程
     *
     * Kill进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelConnectionProcessRequest 请求对象
     * @return SyncInvoker<CancelConnectionProcessRequest, CancelConnectionProcessResponse>
     */
    public SyncInvoker<CancelConnectionProcessRequest, CancelConnectionProcessResponse> cancelConnectionProcessInvoker(
        CancelConnectionProcessRequest request) {
        return new SyncInvoker<>(request, DasMeta.cancelConnectionProcess, hcClient);
    }

    /**
     * 修改配额
     *
     * 修改配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeQuotaNewRequest 请求对象
     * @return ChangeQuotaNewResponse
     */
    public ChangeQuotaNewResponse changeQuotaNew(ChangeQuotaNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeQuotaNew);
    }

    /**
     * 修改配额
     *
     * 修改配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeQuotaNewRequest 请求对象
     * @return SyncInvoker<ChangeQuotaNewRequest, ChangeQuotaNewResponse>
     */
    public SyncInvoker<ChangeQuotaNewRequest, ChangeQuotaNewResponse> changeQuotaNewInvoker(
        ChangeQuotaNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeQuotaNew, hcClient);
    }

    /**
     * 检查是否有健康报告任务
     *
     * 检查是否有健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHealthReportTaskRequest 请求对象
     * @return CheckHealthReportTaskResponse
     */
    public CheckHealthReportTaskResponse checkHealthReportTask(CheckHealthReportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.checkHealthReportTask);
    }

    /**
     * 检查是否有健康报告任务
     *
     * 检查是否有健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHealthReportTaskRequest 请求对象
     * @return SyncInvoker<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse>
     */
    public SyncInvoker<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse> checkHealthReportTaskInvoker(
        CheckHealthReportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.checkHealthReportTask, hcClient);
    }

    /**
     * 创建binlog解析任务
     *
     * 创建binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBinlogTaskRequest 请求对象
     * @return CreateBinlogTaskResponse
     */
    public CreateBinlogTaskResponse createBinlogTask(CreateBinlogTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createBinlogTask);
    }

    /**
     * 创建binlog解析任务
     *
     * 创建binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBinlogTaskRequest 请求对象
     * @return SyncInvoker<CreateBinlogTaskRequest, CreateBinlogTaskResponse>
     */
    public SyncInvoker<CreateBinlogTaskRequest, CreateBinlogTaskResponse> createBinlogTaskInvoker(
        CreateBinlogTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.createBinlogTask, hcClient);
    }

    /**
     * DBS连接
     *
     * DBS连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbsConnectionRequest 请求对象
     * @return CreateDbsConnectionResponse
     */
    public CreateDbsConnectionResponse createDbsConnection(CreateDbsConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createDbsConnection);
    }

    /**
     * DBS连接
     *
     * DBS连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbsConnectionRequest 请求对象
     * @return SyncInvoker<CreateDbsConnectionRequest, CreateDbsConnectionResponse>
     */
    public SyncInvoker<CreateDbsConnectionRequest, CreateDbsConnectionResponse> createDbsConnectionInvoker(
        CreateDbsConnectionRequest request) {
        return new SyncInvoker<>(request, DasMeta.createDbsConnection, hcClient);
    }

    /**
     * 创建全量SQL桶
     *
     * 创建全量SQL桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFullSqlBucketRequest 请求对象
     * @return CreateFullSqlBucketResponse
     */
    public CreateFullSqlBucketResponse createFullSqlBucket(CreateFullSqlBucketRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createFullSqlBucket);
    }

    /**
     * 创建全量SQL桶
     *
     * 创建全量SQL桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFullSqlBucketRequest 请求对象
     * @return SyncInvoker<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse>
     */
    public SyncInvoker<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse> createFullSqlBucketInvoker(
        CreateFullSqlBucketRequest request) {
        return new SyncInvoker<>(request, DasMeta.createFullSqlBucket, hcClient);
    }

    /**
     * 创建索引使用导出任务
     *
     * 创建索引使用导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexUsageExportTaskNewRequest 请求对象
     * @return CreateIndexUsageExportTaskNewResponse
     */
    public CreateIndexUsageExportTaskNewResponse createIndexUsageExportTaskNew(
        CreateIndexUsageExportTaskNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createIndexUsageExportTaskNew);
    }

    /**
     * 创建索引使用导出任务
     *
     * 创建索引使用导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexUsageExportTaskNewRequest 请求对象
     * @return SyncInvoker<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse>
     */
    public SyncInvoker<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse> createIndexUsageExportTaskNewInvoker(
        CreateIndexUsageExportTaskNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.createIndexUsageExportTaskNew, hcClient);
    }

    /**
     * 创建实例健康报告任务
     *
     * 创建实例健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceHealthReportTaskNewRequest 请求对象
     * @return CreateInstanceHealthReportTaskNewResponse
     */
    public CreateInstanceHealthReportTaskNewResponse createInstanceHealthReportTaskNew(
        CreateInstanceHealthReportTaskNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createInstanceHealthReportTaskNew);
    }

    /**
     * 创建实例健康报告任务
     *
     * 创建实例健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceHealthReportTaskNewRequest 请求对象
     * @return SyncInvoker<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse>
     */
    public SyncInvoker<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse> createInstanceHealthReportTaskNewInvoker(
        CreateInstanceHealthReportTaskNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.createInstanceHealthReportTaskNew, hcClient);
    }

    /**
     * 触发WDR
     *
     * 触发WDR
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrReportRequest 请求对象
     * @return CreateWdrReportResponse
     */
    public CreateWdrReportResponse createWdrReport(CreateWdrReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createWdrReport);
    }

    /**
     * 触发WDR
     *
     * 触发WDR
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrReportRequest 请求对象
     * @return SyncInvoker<CreateWdrReportRequest, CreateWdrReportResponse>
     */
    public SyncInvoker<CreateWdrReportRequest, CreateWdrReportResponse> createWdrReportInvoker(
        CreateWdrReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.createWdrReport, hcClient);
    }

    /**
     * 删除binlog任务
     *
     * 删除binlog任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBinlogTaskRequest 请求对象
     * @return DeleteBinlogTaskResponse
     */
    public DeleteBinlogTaskResponse deleteBinlogTask(DeleteBinlogTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteBinlogTask);
    }

    /**
     * 删除binlog任务
     *
     * 删除binlog任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBinlogTaskRequest 请求对象
     * @return SyncInvoker<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse>
     */
    public SyncInvoker<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse> deleteBinlogTaskInvoker(
        DeleteBinlogTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteBinlogTask, hcClient);
    }

    /**
     * 删除数据库对象
     *
     * 删除数据库对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbObjNewRequest 请求对象
     * @return DeleteDbObjNewResponse
     */
    public DeleteDbObjNewResponse deleteDbObjNew(DeleteDbObjNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteDbObjNew);
    }

    /**
     * 删除数据库对象
     *
     * 删除数据库对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbObjNewRequest 请求对象
     * @return SyncInvoker<DeleteDbObjNewRequest, DeleteDbObjNewResponse>
     */
    public SyncInvoker<DeleteDbObjNewRequest, DeleteDbObjNewResponse> deleteDbObjNewInvoker(
        DeleteDbObjNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteDbObjNew, hcClient);
    }

    /**
     * 删除binlog导出任务
     *
     * 删除binlog导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTaskNewRequest 请求对象
     * @return DeleteExportTaskNewResponse
     */
    public DeleteExportTaskNewResponse deleteExportTaskNew(DeleteExportTaskNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteExportTaskNew);
    }

    /**
     * 删除binlog导出任务
     *
     * 删除binlog导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTaskNewRequest 请求对象
     * @return SyncInvoker<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse>
     */
    public SyncInvoker<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse> deleteExportTaskNewInvoker(
        DeleteExportTaskNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteExportTaskNew, hcClient);
    }

    /**
     * 删除全量SQL导出任务OBS文件
     *
     * 删除全量SQL导出任务OBS文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFullSqlExportTaskObsFileRequest 请求对象
     * @return DeleteFullSqlExportTaskObsFileResponse
     */
    public DeleteFullSqlExportTaskObsFileResponse deleteFullSqlExportTaskObsFile(
        DeleteFullSqlExportTaskObsFileRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteFullSqlExportTaskObsFile);
    }

    /**
     * 删除全量SQL导出任务OBS文件
     *
     * 删除全量SQL导出任务OBS文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFullSqlExportTaskObsFileRequest 请求对象
     * @return SyncInvoker<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse>
     */
    public SyncInvoker<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse> deleteFullSqlExportTaskObsFileInvoker(
        DeleteFullSqlExportTaskObsFileRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteFullSqlExportTaskObsFile, hcClient);
    }

    /**
     * 开通配额
     *
     * 开通配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableQuotaRequest 请求对象
     * @return EnableQuotaResponse
     */
    public EnableQuotaResponse enableQuota(EnableQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.enableQuota);
    }

    /**
     * 开通配额
     *
     * 开通配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableQuotaRequest 请求对象
     * @return SyncInvoker<EnableQuotaRequest, EnableQuotaResponse>
     */
    public SyncInvoker<EnableQuotaRequest, EnableQuotaResponse> enableQuotaInvoker(EnableQuotaRequest request) {
        return new SyncInvoker<>(request, DasMeta.enableQuota, hcClient);
    }

    /**
     * 格式化SQL
     *
     * 格式化SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteFormatSqlRequest 请求对象
     * @return ExecuteFormatSqlResponse
     */
    public ExecuteFormatSqlResponse executeFormatSql(ExecuteFormatSqlRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeFormatSql);
    }

    /**
     * 格式化SQL
     *
     * 格式化SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteFormatSqlRequest 请求对象
     * @return SyncInvoker<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse>
     */
    public SyncInvoker<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse> executeFormatSqlInvoker(
        ExecuteFormatSqlRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeFormatSql, hcClient);
    }

    /**
     * 登录操作
     *
     * 登录操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLoginConnectionNewRequest 请求对象
     * @return ExecuteLoginConnectionNewResponse
     */
    public ExecuteLoginConnectionNewResponse executeLoginConnectionNew(ExecuteLoginConnectionNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeLoginConnectionNew);
    }

    /**
     * 登录操作
     *
     * 登录操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLoginConnectionNewRequest 请求对象
     * @return SyncInvoker<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse>
     */
    public SyncInvoker<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse> executeLoginConnectionNewInvoker(
        ExecuteLoginConnectionNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeLoginConnectionNew, hcClient);
    }

    /**
     * 拆分SQL
     *
     * 拆分SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSplitSqlRequest 请求对象
     * @return ExecuteSplitSqlResponse
     */
    public ExecuteSplitSqlResponse executeSplitSql(ExecuteSplitSqlRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeSplitSql);
    }

    /**
     * 拆分SQL
     *
     * 拆分SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSplitSqlRequest 请求对象
     * @return SyncInvoker<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse>
     */
    public SyncInvoker<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse> executeSplitSqlInvoker(
        ExecuteSplitSqlRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeSplitSql, hcClient);
    }

    /**
     * 测试数据库实例连接
     *
     * 测试数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTestConnectionNewRequest 请求对象
     * @return ExecuteTestConnectionNewResponse
     */
    public ExecuteTestConnectionNewResponse executeTestConnectionNew(ExecuteTestConnectionNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeTestConnectionNew);
    }

    /**
     * 测试数据库实例连接
     *
     * 测试数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTestConnectionNewRequest 请求对象
     * @return SyncInvoker<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse>
     */
    public SyncInvoker<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse> executeTestConnectionNewInvoker(
        ExecuteTestConnectionNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeTestConnectionNew, hcClient);
    }

    /**
     * 执行调优
     *
     * 执行调优
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTuningRequest 请求对象
     * @return ExecuteTuningResponse
     */
    public ExecuteTuningResponse executeTuning(ExecuteTuningRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.executeTuning);
    }

    /**
     * 执行调优
     *
     * 执行调优
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTuningRequest 请求对象
     * @return SyncInvoker<ExecuteTuningRequest, ExecuteTuningResponse>
     */
    public SyncInvoker<ExecuteTuningRequest, ExecuteTuningResponse> executeTuningInvoker(ExecuteTuningRequest request) {
        return new SyncInvoker<>(request, DasMeta.executeTuning, hcClient);
    }

    /**
     * 导出实例列表
     *
     * 导出实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstanceListNewRequest 请求对象
     * @return ExportInstanceListNewResponse
     */
    public ExportInstanceListNewResponse exportInstanceListNew(ExportInstanceListNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportInstanceListNew);
    }

    /**
     * 导出实例列表
     *
     * 导出实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstanceListNewRequest 请求对象
     * @return SyncInvoker<ExportInstanceListNewRequest, ExportInstanceListNewResponse>
     */
    public SyncInvoker<ExportInstanceListNewRequest, ExportInstanceListNewResponse> exportInstanceListNewInvoker(
        ExportInstanceListNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportInstanceListNew, hcClient);
    }

    /**
     * 获取OBS对象列表
     *
     * 获取OBS对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExportObsObjectsRequest 请求对象
     * @return ImportExportObsObjectsResponse
     */
    public ImportExportObsObjectsResponse importExportObsObjects(ImportExportObsObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.importExportObsObjects);
    }

    /**
     * 获取OBS对象列表
     *
     * 获取OBS对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExportObsObjectsRequest 请求对象
     * @return SyncInvoker<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse>
     */
    public SyncInvoker<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse> importExportObsObjectsInvoker(
        ImportExportObsObjectsRequest request) {
        return new SyncInvoker<>(request, DasMeta.importExportObsObjects, hcClient);
    }

    /**
     * 获取WDR数据
     *
     * 获取WDR数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeWdrReportRequest 请求对象
     * @return InvokeWdrReportResponse
     */
    public InvokeWdrReportResponse invokeWdrReport(InvokeWdrReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.invokeWdrReport);
    }

    /**
     * 获取WDR数据
     *
     * 获取WDR数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeWdrReportRequest 请求对象
     * @return SyncInvoker<InvokeWdrReportRequest, InvokeWdrReportResponse>
     */
    public SyncInvoker<InvokeWdrReportRequest, InvokeWdrReportResponse> invokeWdrReportInvoker(
        InvokeWdrReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.invokeWdrReport, hcClient);
    }

    /**
     * 查询所有类型实例列表
     *
     * 查询所有类型实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTypeInstancesRequest 请求对象
     * @return ListAllTypeInstancesResponse
     */
    public ListAllTypeInstancesResponse listAllTypeInstances(ListAllTypeInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listAllTypeInstances);
    }

    /**
     * 查询所有类型实例列表
     *
     * 查询所有类型实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTypeInstancesRequest 请求对象
     * @return SyncInvoker<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse>
     */
    public SyncInvoker<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse> listAllTypeInstancesInvoker(
        ListAllTypeInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listAllTypeInstances, hcClient);
    }

    /**
     * 导出binlog任务列表
     *
     * 导出binlog任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogExportsRequest 请求对象
     * @return ListBinlogExportsResponse
     */
    public ListBinlogExportsResponse listBinlogExports(ListBinlogExportsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listBinlogExports);
    }

    /**
     * 导出binlog任务列表
     *
     * 导出binlog任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogExportsRequest 请求对象
     * @return SyncInvoker<ListBinlogExportsRequest, ListBinlogExportsResponse>
     */
    public SyncInvoker<ListBinlogExportsRequest, ListBinlogExportsResponse> listBinlogExportsInvoker(
        ListBinlogExportsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listBinlogExports, hcClient);
    }

    /**
     * 查询binlog文件列表
     *
     * 查询binlog文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogFilesRequest 请求对象
     * @return ListBinlogFilesResponse
     */
    public ListBinlogFilesResponse listBinlogFiles(ListBinlogFilesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listBinlogFiles);
    }

    /**
     * 查询binlog文件列表
     *
     * 查询binlog文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogFilesRequest 请求对象
     * @return SyncInvoker<ListBinlogFilesRequest, ListBinlogFilesResponse>
     */
    public SyncInvoker<ListBinlogFilesRequest, ListBinlogFilesResponse> listBinlogFilesInvoker(
        ListBinlogFilesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listBinlogFiles, hcClient);
    }

    /**
     * 查询实例会话
     *
     * 查询实例会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionProcessesRequest 请求对象
     * @return ListConnectionProcessesResponse
     */
    public ListConnectionProcessesResponse listConnectionProcesses(ListConnectionProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listConnectionProcesses);
    }

    /**
     * 查询实例会话
     *
     * 查询实例会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionProcessesRequest 请求对象
     * @return SyncInvoker<ListConnectionProcessesRequest, ListConnectionProcessesResponse>
     */
    public SyncInvoker<ListConnectionProcessesRequest, ListConnectionProcessesResponse> listConnectionProcessesInvoker(
        ListConnectionProcessesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listConnectionProcesses, hcClient);
    }

    /**
     * 查询数据库对象列表
     *
     * 查询数据库对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseObjectsRequest 请求对象
     * @return ListDatabaseObjectsResponse
     */
    public ListDatabaseObjectsResponse listDatabaseObjects(ListDatabaseObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDatabaseObjects);
    }

    /**
     * 查询数据库对象列表
     *
     * 查询数据库对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseObjectsRequest 请求对象
     * @return SyncInvoker<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse>
     */
    public SyncInvoker<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> listDatabaseObjectsInvoker(
        ListDatabaseObjectsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listDatabaseObjects, hcClient);
    }

    /**
     * 获取死锁数据库列表
     *
     * 获取死锁数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDatabasesRequest 请求对象
     * @return ListDeadLockDatabasesResponse
     */
    public ListDeadLockDatabasesResponse listDeadLockDatabases(ListDeadLockDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDeadLockDatabases);
    }

    /**
     * 获取死锁数据库列表
     *
     * 获取死锁数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDatabasesRequest 请求对象
     * @return SyncInvoker<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse>
     */
    public SyncInvoker<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse> listDeadLockDatabasesInvoker(
        ListDeadLockDatabasesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listDeadLockDatabases, hcClient);
    }

    /**
     * 获取死锁详情列表
     *
     * 获取死锁详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDetailRequest 请求对象
     * @return ListDeadLockDetailResponse
     */
    public ListDeadLockDetailResponse listDeadLockDetail(ListDeadLockDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDeadLockDetail);
    }

    /**
     * 获取死锁详情列表
     *
     * 获取死锁详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDetailRequest 请求对象
     * @return SyncInvoker<ListDeadLockDetailRequest, ListDeadLockDetailResponse>
     */
    public SyncInvoker<ListDeadLockDetailRequest, ListDeadLockDetailResponse> listDeadLockDetailInvoker(
        ListDeadLockDetailRequest request) {
        return new SyncInvoker<>(request, DasMeta.listDeadLockDetail, hcClient);
    }

    /**
     * 获取完整死锁列表
     *
     * 获取完整死锁列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullDeadLocksRequest 请求对象
     * @return ListFullDeadLocksResponse
     */
    public ListFullDeadLocksResponse listFullDeadLocks(ListFullDeadLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listFullDeadLocks);
    }

    /**
     * 获取完整死锁列表
     *
     * 获取完整死锁列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullDeadLocksRequest 请求对象
     * @return SyncInvoker<ListFullDeadLocksRequest, ListFullDeadLocksResponse>
     */
    public SyncInvoker<ListFullDeadLocksRequest, ListFullDeadLocksResponse> listFullDeadLocksInvoker(
        ListFullDeadLocksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listFullDeadLocks, hcClient);
    }

    /**
     * 获取全量SQL导出任务列表
     *
     * 获取全量SQL导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlExportTasksRequest 请求对象
     * @return ListFullSqlExportTasksResponse
     */
    public ListFullSqlExportTasksResponse listFullSqlExportTasks(ListFullSqlExportTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listFullSqlExportTasks);
    }

    /**
     * 获取全量SQL导出任务列表
     *
     * 获取全量SQL导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlExportTasksRequest 请求对象
     * @return SyncInvoker<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse>
     */
    public SyncInvoker<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse> listFullSqlExportTasksInvoker(
        ListFullSqlExportTasksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listFullSqlExportTasks, hcClient);
    }

    /**
     * 获取实例健康报告任务列表
     *
     * 获取实例健康报告任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceHealthReportTasksRequest 请求对象
     * @return ListInstanceHealthReportTasksResponse
     */
    public ListInstanceHealthReportTasksResponse listInstanceHealthReportTasks(
        ListInstanceHealthReportTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceHealthReportTasks);
    }

    /**
     * 获取实例健康报告任务列表
     *
     * 获取实例健康报告任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceHealthReportTasksRequest 请求对象
     * @return SyncInvoker<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse>
     */
    public SyncInvoker<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse> listInstanceHealthReportTasksInvoker(
        ListInstanceHealthReportTasksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceHealthReportTasks, hcClient);
    }

    /**
     * 获取未设置付费的实例列表
     *
     * 获取未设置付费的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotSetChargeModeInstanceRequest 请求对象
     * @return ListNotSetChargeModeInstanceResponse
     */
    public ListNotSetChargeModeInstanceResponse listNotSetChargeModeInstance(
        ListNotSetChargeModeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listNotSetChargeModeInstance);
    }

    /**
     * 获取未设置付费的实例列表
     *
     * 获取未设置付费的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotSetChargeModeInstanceRequest 请求对象
     * @return SyncInvoker<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse>
     */
    public SyncInvoker<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse> listNotSetChargeModeInstanceInvoker(
        ListNotSetChargeModeInstanceRequest request) {
        return new SyncInvoker<>(request, DasMeta.listNotSetChargeModeInstance, hcClient);
    }

    /**
     * 获取schema名称列表
     *
     * 获取schema名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaNamesRequest 请求对象
     * @return ListSchemaNamesResponse
     */
    public ListSchemaNamesResponse listSchemaNames(ListSchemaNamesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSchemaNames);
    }

    /**
     * 获取schema名称列表
     *
     * 获取schema名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaNamesRequest 请求对象
     * @return SyncInvoker<ListSchemaNamesRequest, ListSchemaNamesResponse>
     */
    public SyncInvoker<ListSchemaNamesRequest, ListSchemaNamesResponse> listSchemaNamesInvoker(
        ListSchemaNamesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSchemaNames, hcClient);
    }

    /**
     * 查询共享列表
     *
     * 查询共享列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedConnectionsRequest 请求对象
     * @return ListSharedConnectionsResponse
     */
    public ListSharedConnectionsResponse listSharedConnections(ListSharedConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSharedConnections);
    }

    /**
     * 查询共享列表
     *
     * 查询共享列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedConnectionsRequest 请求对象
     * @return SyncInvoker<ListSharedConnectionsRequest, ListSharedConnectionsResponse>
     */
    public SyncInvoker<ListSharedConnectionsRequest, ListSharedConnectionsResponse> listSharedConnectionsInvoker(
        ListSharedConnectionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSharedConnections, hcClient);
    }

    /**
     * 获取SMN主题列表
     *
     * 获取SMN主题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return ListSmnTopicsResponse
     */
    public ListSmnTopicsResponse listSmnTopics(ListSmnTopicsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSmnTopics);
    }

    /**
     * 获取SMN主题列表
     *
     * 获取SMN主题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return SyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse>
     */
    public SyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse> listSmnTopicsInvoker(ListSmnTopicsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSmnTopics, hcClient);
    }

    /**
     * 查询快照
     *
     * 查询快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshots4ApiRequest 请求对象
     * @return ListSnapshots4ApiResponse
     */
    public ListSnapshots4ApiResponse listSnapshots4Api(ListSnapshots4ApiRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSnapshots4Api);
    }

    /**
     * 查询快照
     *
     * 查询快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshots4ApiRequest 请求对象
     * @return SyncInvoker<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse>
     */
    public SyncInvoker<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse> listSnapshots4ApiInvoker(
        ListSnapshots4ApiRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSnapshots4Api, hcClient);
    }

    /**
     * 获取用户实例
     *
     * 获取用户实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitUserInstanceRequest 请求对象
     * @return ListSqlLimitUserInstanceResponse
     */
    public ListSqlLimitUserInstanceResponse listSqlLimitUserInstance(ListSqlLimitUserInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlLimitUserInstance);
    }

    /**
     * 获取用户实例
     *
     * 获取用户实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitUserInstanceRequest 请求对象
     * @return SyncInvoker<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse>
     */
    public SyncInvoker<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse> listSqlLimitUserInstanceInvoker(
        ListSqlLimitUserInstanceRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSqlLimitUserInstance, hcClient);
    }

    /**
     * 查询SQL模板对比列表
     *
     * 查询SQL模板对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateComparisonsRequest 请求对象
     * @return ListSqlTemplateComparisonsResponse
     */
    public ListSqlTemplateComparisonsResponse listSqlTemplateComparisons(ListSqlTemplateComparisonsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlTemplateComparisons);
    }

    /**
     * 查询SQL模板对比列表
     *
     * 查询SQL模板对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateComparisonsRequest 请求对象
     * @return SyncInvoker<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse>
     */
    public SyncInvoker<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse> listSqlTemplateComparisonsInvoker(
        ListSqlTemplateComparisonsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSqlTemplateComparisons, hcClient);
    }

    /**
     * 查询SQL模板数据库列表
     *
     * 查询SQL模板数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateDatabasesRequest 请求对象
     * @return ListSqlTemplateDatabasesResponse
     */
    public ListSqlTemplateDatabasesResponse listSqlTemplateDatabases(ListSqlTemplateDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlTemplateDatabases);
    }

    /**
     * 查询SQL模板数据库列表
     *
     * 查询SQL模板数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateDatabasesRequest 请求对象
     * @return SyncInvoker<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse>
     */
    public SyncInvoker<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse> listSqlTemplateDatabasesInvoker(
        ListSqlTemplateDatabasesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSqlTemplateDatabases, hcClient);
    }

    /**
     * 查询SQL模板列表
     *
     * 查询SQL模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplatesRequest 请求对象
     * @return ListSqlTemplatesResponse
     */
    public ListSqlTemplatesResponse listSqlTemplates(ListSqlTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlTemplates);
    }

    /**
     * 查询SQL模板列表
     *
     * 查询SQL模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplatesRequest 请求对象
     * @return SyncInvoker<ListSqlTemplatesRequest, ListSqlTemplatesResponse>
     */
    public SyncInvoker<ListSqlTemplatesRequest, ListSqlTemplatesResponse> listSqlTemplatesInvoker(
        ListSqlTemplatesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSqlTemplates, hcClient);
    }

    /**
     * 按批次ID查询全量SQL任务
     *
     * 按批次ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByBatchIdRequest 请求对象
     * @return ListTasksByBatchIdResponse
     */
    public ListTasksByBatchIdResponse listTasksByBatchId(ListTasksByBatchIdRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTasksByBatchId);
    }

    /**
     * 按批次ID查询全量SQL任务
     *
     * 按批次ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByBatchIdRequest 请求对象
     * @return SyncInvoker<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse>
     */
    public SyncInvoker<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse> listTasksByBatchIdInvoker(
        ListTasksByBatchIdRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTasksByBatchId, hcClient);
    }

    /**
     * 按SQL模板ID查询全量SQL任务
     *
     * 按SQL模板ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksBySqlTemplateIdRequest 请求对象
     * @return ListTasksBySqlTemplateIdResponse
     */
    public ListTasksBySqlTemplateIdResponse listTasksBySqlTemplateId(ListTasksBySqlTemplateIdRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTasksBySqlTemplateId);
    }

    /**
     * 按SQL模板ID查询全量SQL任务
     *
     * 按SQL模板ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksBySqlTemplateIdRequest 请求对象
     * @return SyncInvoker<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse>
     */
    public SyncInvoker<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse> listTasksBySqlTemplateIdInvoker(
        ListTasksBySqlTemplateIdRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTasksBySqlTemplateId, hcClient);
    }

    /**
     * 按任务ID查询全量SQL任务
     *
     * 按任务ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByTaskIdRequest 请求对象
     * @return ListTasksByTaskIdResponse
     */
    public ListTasksByTaskIdResponse listTasksByTaskId(ListTasksByTaskIdRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTasksByTaskId);
    }

    /**
     * 按任务ID查询全量SQL任务
     *
     * 按任务ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByTaskIdRequest 请求对象
     * @return SyncInvoker<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse>
     */
    public SyncInvoker<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse> listTasksByTaskIdInvoker(
        ListTasksByTaskIdRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTasksByTaskId, hcClient);
    }

    /**
     * 查询模板数据库对比列表
     *
     * 查询模板数据库对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateDatabaseComparisonsRequest 请求对象
     * @return ListTemplateDatabaseComparisonsResponse
     */
    public ListTemplateDatabaseComparisonsResponse listTemplateDatabaseComparisons(
        ListTemplateDatabaseComparisonsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTemplateDatabaseComparisons);
    }

    /**
     * 查询模板数据库对比列表
     *
     * 查询模板数据库对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateDatabaseComparisonsRequest 请求对象
     * @return SyncInvoker<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse>
     */
    public SyncInvoker<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse> listTemplateDatabaseComparisonsInvoker(
        ListTemplateDatabaseComparisonsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTemplateDatabaseComparisons, hcClient);
    }

    /**
     * 获取用户实例列表
     *
     * 获取用户实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserInstanceListRequest 请求对象
     * @return ListUserInstanceListResponse
     */
    public ListUserInstanceListResponse listUserInstanceList(ListUserInstanceListRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listUserInstanceList);
    }

    /**
     * 获取用户实例列表
     *
     * 获取用户实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserInstanceListRequest 请求对象
     * @return SyncInvoker<ListUserInstanceListRequest, ListUserInstanceListResponse>
     */
    public SyncInvoker<ListUserInstanceListRequest, ListUserInstanceListResponse> listUserInstanceListInvoker(
        ListUserInstanceListRequest request) {
        return new SyncInvoker<>(request, DasMeta.listUserInstanceList, hcClient);
    }

    /**
     * 重试binlog解析任务
     *
     * 重试binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBinlogTaskRequest 请求对象
     * @return RetryBinlogTaskResponse
     */
    public RetryBinlogTaskResponse retryBinlogTask(RetryBinlogTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.retryBinlogTask);
    }

    /**
     * 重试binlog解析任务
     *
     * 重试binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBinlogTaskRequest 请求对象
     * @return SyncInvoker<RetryBinlogTaskRequest, RetryBinlogTaskResponse>
     */
    public SyncInvoker<RetryBinlogTaskRequest, RetryBinlogTaskResponse> retryBinlogTaskInvoker(
        RetryBinlogTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.retryBinlogTask, hcClient);
    }

    /**
     * 查看binlog解析详情
     *
     * 查看binlog解析详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBinlogParseRequest 请求对象
     * @return SearchBinlogParseResponse
     */
    public SearchBinlogParseResponse searchBinlogParse(SearchBinlogParseRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.searchBinlogParse);
    }

    /**
     * 查看binlog解析详情
     *
     * 查看binlog解析详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBinlogParseRequest 请求对象
     * @return SyncInvoker<SearchBinlogParseRequest, SearchBinlogParseResponse>
     */
    public SyncInvoker<SearchBinlogParseRequest, SearchBinlogParseResponse> searchBinlogParseInvoker(
        SearchBinlogParseRequest request) {
        return new SyncInvoker<>(request, DasMeta.searchBinlogParse, hcClient);
    }

    /**
     * 查看binlog解析错误信息
     *
     * 查看binlog解析错误信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfo4ApiRequest 请求对象
     * @return SearchErrorInfo4ApiResponse
     */
    public SearchErrorInfo4ApiResponse searchErrorInfo4Api(SearchErrorInfo4ApiRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.searchErrorInfo4Api);
    }

    /**
     * 查看binlog解析错误信息
     *
     * 查看binlog解析错误信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfo4ApiRequest 请求对象
     * @return SyncInvoker<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse>
     */
    public SyncInvoker<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse> searchErrorInfo4ApiInvoker(
        SearchErrorInfo4ApiRequest request) {
        return new SyncInvoker<>(request, DasMeta.searchErrorInfo4Api, hcClient);
    }

    /**
     * 查看binlog解析错误信息条件
     *
     * 查看binlog解析错误信息条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfoSource4ApiRequest 请求对象
     * @return SearchErrorInfoSource4ApiResponse
     */
    public SearchErrorInfoSource4ApiResponse searchErrorInfoSource4Api(SearchErrorInfoSource4ApiRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.searchErrorInfoSource4Api);
    }

    /**
     * 查看binlog解析错误信息条件
     *
     * 查看binlog解析错误信息条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfoSource4ApiRequest 请求对象
     * @return SyncInvoker<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse>
     */
    public SyncInvoker<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse> searchErrorInfoSource4ApiInvoker(
        SearchErrorInfoSource4ApiRequest request) {
        return new SyncInvoker<>(request, DasMeta.searchErrorInfoSource4Api, hcClient);
    }

    /**
     * 全量SQL搜索
     *
     * 全量SQL搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchNewRequest 请求对象
     * @return SearchNewResponse
     */
    public SearchNewResponse searchNew(SearchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.searchNew);
    }

    /**
     * 全量SQL搜索
     *
     * 全量SQL搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchNewRequest 请求对象
     * @return SyncInvoker<SearchNewRequest, SearchNewResponse>
     */
    public SyncInvoker<SearchNewRequest, SearchNewResponse> searchNewInvoker(SearchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.searchNew, hcClient);
    }

    /**
     * 设置SQL开关
     *
     * 设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlSwitchNewRequest 请求对象
     * @return SetSqlSwitchNewResponse
     */
    public SetSqlSwitchNewResponse setSqlSwitchNew(SetSqlSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.setSqlSwitchNew);
    }

    /**
     * 设置SQL开关
     *
     * 设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlSwitchNewRequest 请求对象
     * @return SyncInvoker<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse>
     */
    public SyncInvoker<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse> setSqlSwitchNewInvoker(
        SetSqlSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.setSqlSwitchNew, hcClient);
    }

    /**
     * 查询binlog导出任务信息
     *
     * 查询binlog导出任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogExportTaskInfoRequest 请求对象
     * @return ShowBinlogExportTaskInfoResponse
     */
    public ShowBinlogExportTaskInfoResponse showBinlogExportTaskInfo(ShowBinlogExportTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showBinlogExportTaskInfo);
    }

    /**
     * 查询binlog导出任务信息
     *
     * 查询binlog导出任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogExportTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse>
     */
    public SyncInvoker<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse> showBinlogExportTaskInfoInvoker(
        ShowBinlogExportTaskInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showBinlogExportTaskInfo, hcClient);
    }

    /**
     * 查看binlog概览
     *
     * 查看binlog概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogParseRequest 请求对象
     * @return ShowBinlogParseResponse
     */
    public ShowBinlogParseResponse showBinlogParse(ShowBinlogParseRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showBinlogParse);
    }

    /**
     * 查看binlog概览
     *
     * 查看binlog概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogParseRequest 请求对象
     * @return SyncInvoker<ShowBinlogParseRequest, ShowBinlogParseResponse>
     */
    public SyncInvoker<ShowBinlogParseRequest, ShowBinlogParseResponse> showBinlogParseInvoker(
        ShowBinlogParseRequest request) {
        return new SyncInvoker<>(request, DasMeta.showBinlogParse, hcClient);
    }

    /**
     * 查看binlog解析任务详情
     *
     * 查看binlog解析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogTaskInfoRequest 请求对象
     * @return ShowBinlogTaskInfoResponse
     */
    public ShowBinlogTaskInfoResponse showBinlogTaskInfo(ShowBinlogTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showBinlogTaskInfo);
    }

    /**
     * 查看binlog解析任务详情
     *
     * 查看binlog解析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse>
     */
    public SyncInvoker<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse> showBinlogTaskInfoInvoker(
        ShowBinlogTaskInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showBinlogTaskInfo, hcClient);
    }

    /**
     * DDS连接统计
     *
     * DDS连接统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdsConnectionStatRequest 请求对象
     * @return ShowDdsConnectionStatResponse
     */
    public ShowDdsConnectionStatResponse showDdsConnectionStat(ShowDdsConnectionStatRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDdsConnectionStat);
    }

    /**
     * DDS连接统计
     *
     * DDS连接统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdsConnectionStatRequest 请求对象
     * @return SyncInvoker<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse>
     */
    public SyncInvoker<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse> showDdsConnectionStatInvoker(
        ShowDdsConnectionStatRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDdsConnectionStat, hcClient);
    }

    /**
     * 获取死锁原始数据
     *
     * 获取死锁原始数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockOriginDataRequest 请求对象
     * @return ShowDeadLockOriginDataResponse
     */
    public ShowDeadLockOriginDataResponse showDeadLockOriginData(ShowDeadLockOriginDataRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockOriginData);
    }

    /**
     * 获取死锁原始数据
     *
     * 获取死锁原始数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockOriginDataRequest 请求对象
     * @return SyncInvoker<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse>
     */
    public SyncInvoker<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse> showDeadLockOriginDataInvoker(
        ShowDeadLockOriginDataRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockOriginData, hcClient);
    }

    /**
     * 获取死锁关系
     *
     * 获取死锁关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockRelationshipRequest 请求对象
     * @return ShowDeadLockRelationshipResponse
     */
    public ShowDeadLockRelationshipResponse showDeadLockRelationship(ShowDeadLockRelationshipRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockRelationship);
    }

    /**
     * 获取死锁关系
     *
     * 获取死锁关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockRelationshipRequest 请求对象
     * @return SyncInvoker<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse>
     */
    public SyncInvoker<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse> showDeadLockRelationshipInvoker(
        ShowDeadLockRelationshipRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockRelationship, hcClient);
    }

    /**
     * 获取死锁统计
     *
     * 获取死锁统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockStatisticsRequest 请求对象
     * @return ShowDeadLockStatisticsResponse
     */
    public ShowDeadLockStatisticsResponse showDeadLockStatistics(ShowDeadLockStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockStatistics);
    }

    /**
     * 获取死锁统计
     *
     * 获取死锁统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockStatisticsRequest 请求对象
     * @return SyncInvoker<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse>
     */
    public SyncInvoker<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse> showDeadLockStatisticsInvoker(
        ShowDeadLockStatisticsRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockStatistics, hcClient);
    }

    /**
     * 获取死锁趋势
     *
     * 获取死锁趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTrendRequest 请求对象
     * @return ShowDeadLockTrendResponse
     */
    public ShowDeadLockTrendResponse showDeadLockTrend(ShowDeadLockTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockTrend);
    }

    /**
     * 获取死锁趋势
     *
     * 获取死锁趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTrendRequest 请求对象
     * @return SyncInvoker<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse>
     */
    public SyncInvoker<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse> showDeadLockTrendInvoker(
        ShowDeadLockTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockTrend, hcClient);
    }

    /**
     * 查询SQL执行结果
     *
     * 查询SQL执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyRequest 请求对象
     * @return ShowExecuteResultWithoutKeyResponse
     */
    public ShowExecuteResultWithoutKeyResponse showExecuteResultWithoutKey(ShowExecuteResultWithoutKeyRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showExecuteResultWithoutKey);
    }

    /**
     * 查询SQL执行结果
     *
     * 查询SQL执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyRequest 请求对象
     * @return SyncInvoker<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse>
     */
    public SyncInvoker<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse> showExecuteResultWithoutKeyInvoker(
        ShowExecuteResultWithoutKeyRequest request) {
        return new SyncInvoker<>(request, DasMeta.showExecuteResultWithoutKey, hcClient);
    }

    /**
     * 查询SQL执行结果（POST）
     *
     * 查询SQL执行结果（POST）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyNoRetryRequest 请求对象
     * @return ShowExecuteResultWithoutKeyNoRetryResponse
     */
    public ShowExecuteResultWithoutKeyNoRetryResponse showExecuteResultWithoutKeyNoRetry(
        ShowExecuteResultWithoutKeyNoRetryRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showExecuteResultWithoutKeyNoRetry);
    }

    /**
     * 查询SQL执行结果（POST）
     *
     * 查询SQL执行结果（POST）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyNoRetryRequest 请求对象
     * @return SyncInvoker<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse>
     */
    public SyncInvoker<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse> showExecuteResultWithoutKeyNoRetryInvoker(
        ShowExecuteResultWithoutKeyNoRetryRequest request) {
        return new SyncInvoker<>(request, DasMeta.showExecuteResultWithoutKeyNoRetry, hcClient);
    }

    /**
     * 获取执行计划
     *
     * 获取执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionPlanRequest 请求对象
     * @return ShowExecutionPlanResponse
     */
    public ShowExecutionPlanResponse showExecutionPlan(ShowExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showExecutionPlan);
    }

    /**
     * 获取执行计划
     *
     * 获取执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionPlanRequest 请求对象
     * @return SyncInvoker<ShowExecutionPlanRequest, ShowExecutionPlanResponse>
     */
    public SyncInvoker<ShowExecutionPlanRequest, ShowExecutionPlanResponse> showExecutionPlanInvoker(
        ShowExecutionPlanRequest request) {
        return new SyncInvoker<>(request, DasMeta.showExecutionPlan, hcClient);
    }

    /**
     * 查询执行时间模板趋势
     *
     * 查询执行时间模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionTimeTemplateTrendRequest 请求对象
     * @return ShowExecutionTimeTemplateTrendResponse
     */
    public ShowExecutionTimeTemplateTrendResponse showExecutionTimeTemplateTrend(
        ShowExecutionTimeTemplateTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showExecutionTimeTemplateTrend);
    }

    /**
     * 查询执行时间模板趋势
     *
     * 查询执行时间模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionTimeTemplateTrendRequest 请求对象
     * @return SyncInvoker<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse>
     */
    public SyncInvoker<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse> showExecutionTimeTemplateTrendInvoker(
        ShowExecutionTimeTemplateTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.showExecutionTimeTemplateTrend, hcClient);
    }

    /**
     * 是否展示fragment任务
     *
     * 是否展示fragment任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFragmentSwitchRequest 请求对象
     * @return ShowFragmentSwitchResponse
     */
    public ShowFragmentSwitchResponse showFragmentSwitch(ShowFragmentSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showFragmentSwitch);
    }

    /**
     * 是否展示fragment任务
     *
     * 是否展示fragment任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFragmentSwitchRequest 请求对象
     * @return SyncInvoker<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse>
     */
    public SyncInvoker<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse> showFragmentSwitchInvoker(
        ShowFragmentSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.showFragmentSwitch, hcClient);
    }

    /**
     * 获取实例健康报告
     *
     * 获取实例健康报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReport4ApiRequest 请求对象
     * @return ShowInstanceHealthReport4ApiResponse
     */
    public ShowInstanceHealthReport4ApiResponse showInstanceHealthReport4Api(
        ShowInstanceHealthReport4ApiRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceHealthReport4Api);
    }

    /**
     * 获取实例健康报告
     *
     * 获取实例健康报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReport4ApiRequest 请求对象
     * @return SyncInvoker<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse>
     */
    public SyncInvoker<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse> showInstanceHealthReport4ApiInvoker(
        ShowInstanceHealthReport4ApiRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceHealthReport4Api, hcClient);
    }

    /**
     * 获取实例信息
     *
     * 获取实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfoRequest 请求对象
     * @return ShowInstanceInfoResponse
     */
    public ShowInstanceInfoResponse showInstanceInfo(ShowInstanceInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceInfo);
    }

    /**
     * 获取实例信息
     *
     * 获取实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceInfoRequest, ShowInstanceInfoResponse>
     */
    public SyncInvoker<ShowInstanceInfoRequest, ShowInstanceInfoResponse> showInstanceInfoInvoker(
        ShowInstanceInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceInfo, hcClient);
    }

    /**
     * 查看实例日志存储使用量
     *
     * 查看实例日志存储使用量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogUsageRequest 请求对象
     * @return ShowInstanceLogUsageResponse
     */
    public ShowInstanceLogUsageResponse showInstanceLogUsage(ShowInstanceLogUsageRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceLogUsage);
    }

    /**
     * 查看实例日志存储使用量
     *
     * 查看实例日志存储使用量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogUsageRequest 请求对象
     * @return SyncInvoker<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse>
     */
    public SyncInvoker<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse> showInstanceLogUsageInvoker(
        ShowInstanceLogUsageRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceLogUsage, hcClient);
    }

    /**
     * 查询实例指标
     *
     * 查询实例指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricRequest 请求对象
     * @return ShowInstanceMetricResponse
     */
    public ShowInstanceMetricResponse showInstanceMetric(ShowInstanceMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceMetric);
    }

    /**
     * 查询实例指标
     *
     * 查询实例指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricRequest 请求对象
     * @return SyncInvoker<ShowInstanceMetricRequest, ShowInstanceMetricResponse>
     */
    public SyncInvoker<ShowInstanceMetricRequest, ShowInstanceMetricResponse> showInstanceMetricInvoker(
        ShowInstanceMetricRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceMetric, hcClient);
    }

    /**
     * 获取实例节点信息
     *
     * 获取实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesInfoRequest 请求对象
     * @return ShowInstanceNodesInfoResponse
     */
    public ShowInstanceNodesInfoResponse showInstanceNodesInfo(ShowInstanceNodesInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceNodesInfo);
    }

    /**
     * 获取实例节点信息
     *
     * 获取实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesInfoRequest 请求对象
     * @return SyncInvoker<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse>
     */
    public SyncInvoker<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse> showInstanceNodesInfoInvoker(
        ShowInstanceNodesInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceNodesInfo, hcClient);
    }

    /**
     * 是否签署数据安全协议
     *
     * 是否签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsSignedProtocolRequest 请求对象
     * @return ShowIsSignedProtocolResponse
     */
    public ShowIsSignedProtocolResponse showIsSignedProtocol(ShowIsSignedProtocolRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showIsSignedProtocol);
    }

    /**
     * 是否签署数据安全协议
     *
     * 是否签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsSignedProtocolRequest 请求对象
     * @return SyncInvoker<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse>
     */
    public SyncInvoker<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse> showIsSignedProtocolInvoker(
        ShowIsSignedProtocolRequest request) {
        return new SyncInvoker<>(request, DasMeta.showIsSignedProtocol, hcClient);
    }

    /**
     * 查询Kill进程任务
     *
     * 查询Kill进程任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskRequest 请求对象
     * @return ShowKillProcessTaskResponse
     */
    public ShowKillProcessTaskResponse showKillProcessTask(ShowKillProcessTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showKillProcessTask);
    }

    /**
     * 查询Kill进程任务
     *
     * 查询Kill进程任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskRequest 请求对象
     * @return SyncInvoker<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse>
     */
    public SyncInvoker<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse> showKillProcessTaskInvoker(
        ShowKillProcessTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.showKillProcessTask, hcClient);
    }

    /**
     * 查询最新死锁快照
     *
     * 查询最新死锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshot4ApiRequest 请求对象
     * @return ShowLatestDeadLockSnapshot4ApiResponse
     */
    public ShowLatestDeadLockSnapshot4ApiResponse showLatestDeadLockSnapshot4Api(
        ShowLatestDeadLockSnapshot4ApiRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLatestDeadLockSnapshot4Api);
    }

    /**
     * 查询最新死锁快照
     *
     * 查询最新死锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshot4ApiRequest 请求对象
     * @return SyncInvoker<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse>
     */
    public SyncInvoker<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse> showLatestDeadLockSnapshot4ApiInvoker(
        ShowLatestDeadLockSnapshot4ApiRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLatestDeadLockSnapshot4Api, hcClient);
    }

    /**
     * 查询元数据锁
     *
     * 查询元数据锁
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockRequest 请求对象
     * @return ShowMetaLockResponse
     */
    public ShowMetaLockResponse showMetaLock(ShowMetaLockRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showMetaLock);
    }

    /**
     * 查询元数据锁
     *
     * 查询元数据锁
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockRequest 请求对象
     * @return SyncInvoker<ShowMetaLockRequest, ShowMetaLockResponse>
     */
    public SyncInvoker<ShowMetaLockRequest, ShowMetaLockResponse> showMetaLockInvoker(ShowMetaLockRequest request) {
        return new SyncInvoker<>(request, DasMeta.showMetaLock, hcClient);
    }

    /**
     * 查询元数据锁快照
     *
     * 查询元数据锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockSnapshotRequest 请求对象
     * @return ShowMetaLockSnapshotResponse
     */
    public ShowMetaLockSnapshotResponse showMetaLockSnapshot(ShowMetaLockSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showMetaLockSnapshot);
    }

    /**
     * 查询元数据锁快照
     *
     * 查询元数据锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockSnapshotRequest 请求对象
     * @return SyncInvoker<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse>
     */
    public SyncInvoker<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse> showMetaLockSnapshotInvoker(
        ShowMetaLockSnapshotRequest request) {
        return new SyncInvoker<>(request, DasMeta.showMetaLockSnapshot, hcClient);
    }

    /**
     * 获取开通信息
     *
     * 获取开通信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpeningInfoRequest 请求对象
     * @return ShowOpeningInfoResponse
     */
    public ShowOpeningInfoResponse showOpeningInfo(ShowOpeningInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showOpeningInfo);
    }

    /**
     * 获取开通信息
     *
     * 获取开通信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpeningInfoRequest 请求对象
     * @return SyncInvoker<ShowOpeningInfoRequest, ShowOpeningInfoResponse>
     */
    public SyncInvoker<ShowOpeningInfoRequest, ShowOpeningInfoResponse> showOpeningInfoInvoker(
        ShowOpeningInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showOpeningInfo, hcClient);
    }

    /**
     * 查询单个模板趋势
     *
     * 查询单个模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleTemplateTrendRequest 请求对象
     * @return ShowSingleTemplateTrendResponse
     */
    public ShowSingleTemplateTrendResponse showSingleTemplateTrend(ShowSingleTemplateTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSingleTemplateTrend);
    }

    /**
     * 查询单个模板趋势
     *
     * 查询单个模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleTemplateTrendRequest 请求对象
     * @return SyncInvoker<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse>
     */
    public SyncInvoker<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse> showSingleTemplateTrendInvoker(
        ShowSingleTemplateTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSingleTemplateTrend, hcClient);
    }

    /**
     * 查询SQL模板趋势
     *
     * 查询SQL模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlTemplateTrendRequest 请求对象
     * @return ShowSqlTemplateTrendResponse
     */
    public ShowSqlTemplateTrendResponse showSqlTemplateTrend(ShowSqlTemplateTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlTemplateTrend);
    }

    /**
     * 查询SQL模板趋势
     *
     * 查询SQL模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlTemplateTrendRequest 请求对象
     * @return SyncInvoker<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse>
     */
    public SyncInvoker<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse> showSqlTemplateTrendInvoker(
        ShowSqlTemplateTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlTemplateTrend, hcClient);
    }

    /**
     * 支持的关键字
     *
     * 支持的关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportKeyStringRequest 请求对象
     * @return ShowSupportKeyStringResponse
     */
    public ShowSupportKeyStringResponse showSupportKeyString(ShowSupportKeyStringRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSupportKeyString);
    }

    /**
     * 支持的关键字
     *
     * 支持的关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportKeyStringRequest 请求对象
     * @return SyncInvoker<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse>
     */
    public SyncInvoker<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse> showSupportKeyStringInvoker(
        ShowSupportKeyStringRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSupportKeyString, hcClient);
    }

    /**
     * 获取调优结果
     *
     * 获取调优结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningResultRequest 请求对象
     * @return ShowTuningResultResponse
     */
    public ShowTuningResultResponse showTuningResult(ShowTuningResultRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showTuningResult);
    }

    /**
     * 获取调优结果
     *
     * 获取调优结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningResultRequest 请求对象
     * @return SyncInvoker<ShowTuningResultRequest, ShowTuningResultResponse>
     */
    public SyncInvoker<ShowTuningResultRequest, ShowTuningResultResponse> showTuningResultInvoker(
        ShowTuningResultRequest request) {
        return new SyncInvoker<>(request, DasMeta.showTuningResult, hcClient);
    }

    /**
     * 查询InnoDB锁等待快照
     *
     * 查询InnoDB锁等待快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWaitingLocksSnapshotRequest 请求对象
     * @return ShowWaitingLocksSnapshotResponse
     */
    public ShowWaitingLocksSnapshotResponse showWaitingLocksSnapshot(ShowWaitingLocksSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showWaitingLocksSnapshot);
    }

    /**
     * 查询InnoDB锁等待快照
     *
     * 查询InnoDB锁等待快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWaitingLocksSnapshotRequest 请求对象
     * @return SyncInvoker<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse>
     */
    public SyncInvoker<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse> showWaitingLocksSnapshotInvoker(
        ShowWaitingLocksSnapshotRequest request) {
        return new SyncInvoker<>(request, DasMeta.showWaitingLocksSnapshot, hcClient);
    }

    /**
     * 获取WDR快照列表
     *
     * 获取WDR快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotRequest 请求对象
     * @return ShowWdrSnapshotResponse
     */
    public ShowWdrSnapshotResponse showWdrSnapshot(ShowWdrSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showWdrSnapshot);
    }

    /**
     * 获取WDR快照列表
     *
     * 获取WDR快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotRequest 请求对象
     * @return SyncInvoker<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse>
     */
    public SyncInvoker<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse> showWdrSnapshotInvoker(
        ShowWdrSnapshotRequest request) {
        return new SyncInvoker<>(request, DasMeta.showWdrSnapshot, hcClient);
    }

    /**
     * 签署数据安全协议
     *
     * 签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignProtocolNewRequest 请求对象
     * @return SignProtocolNewResponse
     */
    public SignProtocolNewResponse signProtocolNew(SignProtocolNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.signProtocolNew);
    }

    /**
     * 签署数据安全协议
     *
     * 签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignProtocolNewRequest 请求对象
     * @return SyncInvoker<SignProtocolNewRequest, SignProtocolNewResponse>
     */
    public SyncInvoker<SignProtocolNewRequest, SignProtocolNewResponse> signProtocolNewInvoker(
        SignProtocolNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.signProtocolNew, hcClient);
    }

    /**
     * 停止binlog解析任务
     *
     * 停止binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBinlogTaskRequest 请求对象
     * @return StopBinlogTaskResponse
     */
    public StopBinlogTaskResponse stopBinlogTask(StopBinlogTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.stopBinlogTask);
    }

    /**
     * 停止binlog解析任务
     *
     * 停止binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBinlogTaskRequest 请求对象
     * @return SyncInvoker<StopBinlogTaskRequest, StopBinlogTaskResponse>
     */
    public SyncInvoker<StopBinlogTaskRequest, StopBinlogTaskResponse> stopBinlogTaskInvoker(
        StopBinlogTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.stopBinlogTask, hcClient);
    }

    /**
     * 订阅实例报告
     *
     * 订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeInstanceReportNewRequest 请求对象
     * @return SubscribeInstanceReportNewResponse
     */
    public SubscribeInstanceReportNewResponse subscribeInstanceReportNew(SubscribeInstanceReportNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.subscribeInstanceReportNew);
    }

    /**
     * 订阅实例报告
     *
     * 订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeInstanceReportNewRequest 请求对象
     * @return SyncInvoker<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse>
     */
    public SyncInvoker<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse> subscribeInstanceReportNewInvoker(
        SubscribeInstanceReportNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.subscribeInstanceReportNew, hcClient);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstanceListNewRequest 请求对象
     * @return SynchronizeInstanceListNewResponse
     */
    public SynchronizeInstanceListNewResponse synchronizeInstanceListNew(SynchronizeInstanceListNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.synchronizeInstanceListNew);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstanceListNewRequest 请求对象
     * @return SyncInvoker<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse>
     */
    public SyncInvoker<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse> synchronizeInstanceListNewInvoker(
        SynchronizeInstanceListNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.synchronizeInstanceListNew, hcClient);
    }

    /**
     * 取消订阅实例报告
     *
     * 取消订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeInstanceReportNewRequest 请求对象
     * @return UnsubscribeInstanceReportNewResponse
     */
    public UnsubscribeInstanceReportNewResponse unsubscribeInstanceReportNew(
        UnsubscribeInstanceReportNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.unsubscribeInstanceReportNew);
    }

    /**
     * 取消订阅实例报告
     *
     * 取消订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeInstanceReportNewRequest 请求对象
     * @return SyncInvoker<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse>
     */
    public SyncInvoker<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse> unsubscribeInstanceReportNewInvoker(
        UnsubscribeInstanceReportNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.unsubscribeInstanceReportNew, hcClient);
    }

    /**
     * 设置实例配置
     *
     * Space Set Config New
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return UpdateInstanceConfigResponse
     */
    public UpdateInstanceConfigResponse updateInstanceConfig(UpdateInstanceConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateInstanceConfig);
    }

    /**
     * 设置实例配置
     *
     * Space Set Config New
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse>
     */
    public SyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> updateInstanceConfigInvoker(
        UpdateInstanceConfigRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateInstanceConfig, hcClient);
    }

    /**
     * 设置searchpath开关
     *
     * 设置searchpath开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchPathFlagRequest 请求对象
     * @return UpdateSearchPathFlagResponse
     */
    public UpdateSearchPathFlagResponse updateSearchPathFlag(UpdateSearchPathFlagRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateSearchPathFlag);
    }

    /**
     * 设置searchpath开关
     *
     * 设置searchpath开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchPathFlagRequest 请求对象
     * @return SyncInvoker<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse>
     */
    public SyncInvoker<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse> updateSearchPathFlagInvoker(
        UpdateSearchPathFlagRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateSearchPathFlag, hcClient);
    }

    /**
     * 更新共享信息
     *
     * 更新共享信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSharedInfoNewRequest 请求对象
     * @return UpdateSharedInfoNewResponse
     */
    public UpdateSharedInfoNewResponse updateSharedInfoNew(UpdateSharedInfoNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateSharedInfoNew);
    }

    /**
     * 更新共享信息
     *
     * 更新共享信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSharedInfoNewRequest 请求对象
     * @return SyncInvoker<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse>
     */
    public SyncInvoker<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse> updateSharedInfoNewInvoker(
        UpdateSharedInfoNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateSharedInfoNew, hcClient);
    }

    /**
     * 验证数据库实例连接
     *
     * 验证数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyConnectionNewRequest 请求对象
     * @return VerifyConnectionNewResponse
     */
    public VerifyConnectionNewResponse verifyConnectionNew(VerifyConnectionNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.verifyConnectionNew);
    }

    /**
     * 验证数据库实例连接
     *
     * 验证数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyConnectionNewRequest 请求对象
     * @return SyncInvoker<VerifyConnectionNewRequest, VerifyConnectionNewResponse>
     */
    public SyncInvoker<VerifyConnectionNewRequest, VerifyConnectionNewResponse> verifyConnectionNewInvoker(
        VerifyConnectionNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.verifyConnectionNew, hcClient);
    }

    /**
     * 新增邮件模板
     *
     * 新增邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEmailTemplateRequest 请求对象
     * @return AddEmailTemplateResponse
     */
    public AddEmailTemplateResponse addEmailTemplate(AddEmailTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.addEmailTemplate);
    }

    /**
     * 新增邮件模板
     *
     * 新增邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEmailTemplateRequest 请求对象
     * @return SyncInvoker<AddEmailTemplateRequest, AddEmailTemplateResponse>
     */
    public SyncInvoker<AddEmailTemplateRequest, AddEmailTemplateResponse> addEmailTemplateInvoker(
        AddEmailTemplateRequest request) {
        return new SyncInvoker<>(request, DasMeta.addEmailTemplate, hcClient);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFullSqlTaskRequest 请求对象
     * @return AddFullSqlTaskResponse
     */
    public AddFullSqlTaskResponse addFullSqlTask(AddFullSqlTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.addFullSqlTask);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFullSqlTaskRequest 请求对象
     * @return SyncInvoker<AddFullSqlTaskRequest, AddFullSqlTaskResponse>
     */
    public SyncInvoker<AddFullSqlTaskRequest, AddFullSqlTaskResponse> addFullSqlTaskInvoker(
        AddFullSqlTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.addFullSqlTask, hcClient);
    }

    /**
     * 新增实例组
     *
     * 新增实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceGroupRequest 请求对象
     * @return AddInstanceGroupResponse
     */
    public AddInstanceGroupResponse addInstanceGroup(AddInstanceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.addInstanceGroup);
    }

    /**
     * 新增实例组
     *
     * 新增实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceGroupRequest 请求对象
     * @return SyncInvoker<AddInstanceGroupRequest, AddInstanceGroupResponse>
     */
    public SyncInvoker<AddInstanceGroupRequest, AddInstanceGroupResponse> addInstanceGroupInvoker(
        AddInstanceGroupRequest request) {
        return new SyncInvoker<>(request, DasMeta.addInstanceGroup, hcClient);
    }

    /**
     * 将实例添加到实例组
     *
     * 将实例添加到实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceToGroupRequest 请求对象
     * @return AddInstanceToGroupResponse
     */
    public AddInstanceToGroupResponse addInstanceToGroup(AddInstanceToGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.addInstanceToGroup);
    }

    /**
     * 将实例添加到实例组
     *
     * 将实例添加到实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceToGroupRequest 请求对象
     * @return SyncInvoker<AddInstanceToGroupRequest, AddInstanceToGroupResponse>
     */
    public SyncInvoker<AddInstanceToGroupRequest, AddInstanceToGroupResponse> addInstanceToGroupInvoker(
        AddInstanceToGroupRequest request) {
        return new SyncInvoker<>(request, DasMeta.addInstanceToGroup, hcClient);
    }

    /**
     * 新增SQL限流规则
     *
     * 新增SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSqlLimitingRecordNewRequest 请求对象
     * @return AddSqlLimitingRecordNewResponse
     */
    public AddSqlLimitingRecordNewResponse addSqlLimitingRecordNew(AddSqlLimitingRecordNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.addSqlLimitingRecordNew);
    }

    /**
     * 新增SQL限流规则
     *
     * 新增SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSqlLimitingRecordNewRequest 请求对象
     * @return SyncInvoker<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse>
     */
    public SyncInvoker<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse> addSqlLimitingRecordNewInvoker(
        AddSqlLimitingRecordNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.addSqlLimitingRecordNew, hcClient);
    }

    /**
     * 批量删除连接
     *
     * 批量删除连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteConnectionNewRequest 请求对象
     * @return BatchDeleteConnectionNewResponse
     */
    public BatchDeleteConnectionNewResponse batchDeleteConnectionNew(BatchDeleteConnectionNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.batchDeleteConnectionNew);
    }

    /**
     * 批量删除连接
     *
     * 批量删除连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteConnectionNewRequest 请求对象
     * @return SyncInvoker<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse>
     */
    public SyncInvoker<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse> batchDeleteConnectionNewInvoker(
        BatchDeleteConnectionNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.batchDeleteConnectionNew, hcClient);
    }

    /**
     * 批量发送邮件
     *
     * 批量发送邮件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendEmailRequest 请求对象
     * @return BatchSendEmailResponse
     */
    public BatchSendEmailResponse batchSendEmail(BatchSendEmailRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.batchSendEmail);
    }

    /**
     * 批量发送邮件
     *
     * 批量发送邮件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendEmailRequest 请求对象
     * @return SyncInvoker<BatchSendEmailRequest, BatchSendEmailResponse>
     */
    public SyncInvoker<BatchSendEmailRequest, BatchSendEmailResponse> batchSendEmailInvoker(
        BatchSendEmailRequest request) {
        return new SyncInvoker<>(request, DasMeta.batchSendEmail, hcClient);
    }

    /**
     * 批量订阅/取消订阅
     *
     * 批量订阅/取消订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSubscribeReportRequest 请求对象
     * @return BatchSubscribeReportResponse
     */
    public BatchSubscribeReportResponse batchSubscribeReport(BatchSubscribeReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.batchSubscribeReport);
    }

    /**
     * 批量订阅/取消订阅
     *
     * 批量订阅/取消订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSubscribeReportRequest 请求对象
     * @return SyncInvoker<BatchSubscribeReportRequest, BatchSubscribeReportResponse>
     */
    public SyncInvoker<BatchSubscribeReportRequest, BatchSubscribeReportResponse> batchSubscribeReportInvoker(
        BatchSubscribeReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.batchSubscribeReport, hcClient);
    }

    /**
     * 取消共享链接
     *
     * 取消共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareNewRequest 请求对象
     * @return CancelShareNewResponse
     */
    public CancelShareNewResponse cancelShareNew(CancelShareNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.cancelShareNew);
    }

    /**
     * 取消共享链接
     *
     * 取消共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareNewRequest 请求对象
     * @return SyncInvoker<CancelShareNewRequest, CancelShareNewResponse>
     */
    public SyncInvoker<CancelShareNewRequest, CancelShareNewResponse> cancelShareNewInvoker(
        CancelShareNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.cancelShareNew, hcClient);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeChargeModeRequest 请求对象
     * @return ChangeChargeModeResponse
     */
    public ChangeChargeModeResponse changeChargeMode(ChangeChargeModeRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeChargeMode);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeChargeModeRequest 请求对象
     * @return SyncInvoker<ChangeChargeModeRequest, ChangeChargeModeResponse>
     */
    public SyncInvoker<ChangeChargeModeRequest, ChangeChargeModeResponse> changeChargeModeInvoker(
        ChangeChargeModeRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeChargeMode, hcClient);
    }

    /**
     * 修改死锁开关
     *
     * 修改死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDeadLockSwitchNewRequest 请求对象
     * @return ChangeDeadLockSwitchNewResponse
     */
    public ChangeDeadLockSwitchNewResponse changeDeadLockSwitchNew(ChangeDeadLockSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeDeadLockSwitchNew);
    }

    /**
     * 修改死锁开关
     *
     * 修改死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDeadLockSwitchNewRequest 请求对象
     * @return SyncInvoker<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse>
     */
    public SyncInvoker<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse> changeDeadLockSwitchNewInvoker(
        ChangeDeadLockSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeDeadLockSwitchNew, hcClient);
    }

    /**
     * 设置全量死锁开关
     *
     * 设置全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFullDeadLockSwitchRequest 请求对象
     * @return ChangeFullDeadLockSwitchResponse
     */
    public ChangeFullDeadLockSwitchResponse changeFullDeadLockSwitch(ChangeFullDeadLockSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeFullDeadLockSwitch);
    }

    /**
     * 设置全量死锁开关
     *
     * 设置全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFullDeadLockSwitchRequest 请求对象
     * @return SyncInvoker<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse>
     */
    public SyncInvoker<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse> changeFullDeadLockSwitchInvoker(
        ChangeFullDeadLockSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeFullDeadLockSwitch, hcClient);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePaymentModeNewRequest 请求对象
     * @return ChangePaymentModeNewResponse
     */
    public ChangePaymentModeNewResponse changePaymentModeNew(ChangePaymentModeNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changePaymentModeNew);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePaymentModeNewRequest 请求对象
     * @return SyncInvoker<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse>
     */
    public SyncInvoker<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse> changePaymentModeNewInvoker(
        ChangePaymentModeNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.changePaymentModeNew, hcClient);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return ChangeSqlLimitSwitchStatusResponse
     */
    public ChangeSqlLimitSwitchStatusResponse changeSqlLimitSwitchStatus(ChangeSqlLimitSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeSqlLimitSwitchStatus);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse>
     */
    public SyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusInvoker(
        ChangeSqlLimitSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     *
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。
     * 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlSwitchRequest 请求对象
     * @return ChangeSqlSwitchResponse
     */
    public ChangeSqlSwitchResponse changeSqlSwitch(ChangeSqlSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeSqlSwitch);
    }

    /**
     * 开启/关闭全量SQL、慢SQL开关
     *
     * 打开或者关闭DAS收集全量SQL开关，开启后，实例的性能损耗在5%以内。开启全量SQL后，本服务会对SQL的文本内容进行存储，以便进行分析。用户可自行设置全量SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。
     * 打开或者关闭DAS收集慢SQL开关。开启慢SQL后，本服务会对慢SQL的文本内容进行存储，以便进行分析。用户可自行设置慢SQL的保存时间范围，到期后会自动删除；如果未设置，数据默认保留7天。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlSwitchRequest 请求对象
     * @return SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public SyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchInvoker(
        ChangeSqlSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeSqlSwitch, hcClient);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return ChangeTransactionSwitchStatusResponse
     */
    public ChangeTransactionSwitchStatusResponse changeTransactionSwitchStatus(
        ChangeTransactionSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.changeTransactionSwitchStatus);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return SyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse>
     */
    public SyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatusInvoker(
        ChangeTransactionSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.changeTransactionSwitchStatus, hcClient);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialRequest 请求对象
     * @return CheckCredentialResponse
     */
    public CheckCredentialResponse checkCredential(CheckCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.checkCredential);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialRequest 请求对象
     * @return SyncInvoker<CheckCredentialRequest, CheckCredentialResponse>
     */
    public SyncInvoker<CheckCredentialRequest, CheckCredentialResponse> checkCredentialInvoker(
        CheckCredentialRequest request) {
        return new SyncInvoker<>(request, DasMeta.checkCredential, hcClient);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialForBatchInspectionRequest 请求对象
     * @return CheckCredentialForBatchInspectionResponse
     */
    public CheckCredentialForBatchInspectionResponse checkCredentialForBatchInspection(
        CheckCredentialForBatchInspectionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.checkCredentialForBatchInspection);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialForBatchInspectionRequest 请求对象
     * @return SyncInvoker<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse>
     */
    public SyncInvoker<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse> checkCredentialForBatchInspectionInvoker(
        CheckCredentialForBatchInspectionRequest request) {
        return new SyncInvoker<>(request, DasMeta.checkCredentialForBatchInspection, hcClient);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return CreateHealthReportTaskResponse
     */
    public CreateHealthReportTaskResponse createHealthReportTask(CreateHealthReportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createHealthReportTask);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return SyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse>
     */
    public SyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> createHealthReportTaskInvoker(
        CreateHealthReportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.createHealthReportTask, hcClient);
    }

    /**
     * 创建导出历史事务任务
     *
     * DAS收集历史事务开关打开后，支持创建一次性导出指定时间范围内的历史事务数据任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHistoryTransactionExportTaskRequest 请求对象
     * @return CreateHistoryTransactionExportTaskResponse
     */
    public CreateHistoryTransactionExportTaskResponse createHistoryTransactionExportTask(
        CreateHistoryTransactionExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createHistoryTransactionExportTask);
    }

    /**
     * 创建导出历史事务任务
     *
     * DAS收集历史事务开关打开后，支持创建一次性导出指定时间范围内的历史事务数据任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHistoryTransactionExportTaskRequest 请求对象
     * @return SyncInvoker<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse>
     */
    public SyncInvoker<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse> createHistoryTransactionExportTaskInvoker(
        CreateHistoryTransactionExportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.createHistoryTransactionExportTask, hcClient);
    }

    /**
     * 创建快照
     *
     * 创建快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotsRequest 请求对象
     * @return CreateSnapshotsResponse
     */
    public CreateSnapshotsResponse createSnapshots(CreateSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSnapshots);
    }

    /**
     * 创建快照
     *
     * 创建快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotsRequest 请求对象
     * @return SyncInvoker<CreateSnapshotsRequest, CreateSnapshotsResponse>
     */
    public SyncInvoker<CreateSnapshotsRequest, CreateSnapshotsResponse> createSnapshotsInvoker(
        CreateSnapshotsRequest request) {
        return new SyncInvoker<>(request, DasMeta.createSnapshots, hcClient);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return CreateSpaceAnalysisTaskResponse
     */
    public CreateSpaceAnalysisTaskResponse createSpaceAnalysisTask(CreateSpaceAnalysisTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSpaceAnalysisTask);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public SyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskInvoker(
        CreateSpaceAnalysisTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.createSpaceAnalysisTask, hcClient);
    }

    /**
     * 创建SQL限流规则
     *
     * 添加SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * MySQL使用限制如下：
     * 1.规则举例详细说明：例如关键字是\&quot;select~a\&quot;, 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * 2.当SQL语句匹配多条限流规则时，优先生效最新添加的规则，之前的规则不再生效。
     * 3.限流规则关键字有顺序要求，只会按顺序匹配。如：a~and~b 只会匹配 xxx a&gt;1 and b&gt;2，而不会匹配 xxx b&gt;2 and a&gt;1。
     * 4.关键字可能大小写敏感，请执行 \&quot;show variables like &#39;rds_sqlfilter_case_sensitive&#39;或者到实例参数设置页面进行确认。
     * 5.部分版本只读实例不允许设置限流规则，如果要设置限流规则，请到主实例上进行添加。
     * 6.系统表不限制、不涉及数据查询的不限制、root账号在特定版本下不限制。
     * PostgreSQL使用限制如下：
     * 1.无法添加相同QUERY_ID或SQL语句的规则。
     * 2.使用SQL语句添加规则时，需要确保存在数据库表，如：select * from test，需要确保数据库中有test表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitRulesRequest 请求对象
     * @return CreateSqlLimitRulesResponse
     */
    public CreateSqlLimitRulesResponse createSqlLimitRules(CreateSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createSqlLimitRules);
    }

    /**
     * 创建SQL限流规则
     *
     * 添加SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * MySQL使用限制如下：
     * 1.规则举例详细说明：例如关键字是\&quot;select~a\&quot;, 含义为：select以及a为该并发控制所包含的两个关键字，~为关键字间隔符，即若执行SQL命令包含select与a两个关键字视为命中此条并发控制规则。
     * 2.当SQL语句匹配多条限流规则时，优先生效最新添加的规则，之前的规则不再生效。
     * 3.限流规则关键字有顺序要求，只会按顺序匹配。如：a~and~b 只会匹配 xxx a&gt;1 and b&gt;2，而不会匹配 xxx b&gt;2 and a&gt;1。
     * 4.关键字可能大小写敏感，请执行 \&quot;show variables like &#39;rds_sqlfilter_case_sensitive&#39;或者到实例参数设置页面进行确认。
     * 5.部分版本只读实例不允许设置限流规则，如果要设置限流规则，请到主实例上进行添加。
     * 6.系统表不限制、不涉及数据查询的不限制、root账号在特定版本下不限制。
     * PostgreSQL使用限制如下：
     * 1.无法添加相同QUERY_ID或SQL语句的规则。
     * 2.使用SQL语句添加规则时，需要确保存在数据库表，如：select * from test，需要确保数据库中有test表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse>
     */
    public SyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRulesInvoker(
        CreateSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.createSqlLimitRules, hcClient);
    }

    /**
     * 执行SQL诊断
     *
     * 执行SQL诊断，
     * 用于用户执行SQL诊断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTuningRequest 请求对象
     * @return CreateTuningResponse
     */
    public CreateTuningResponse createTuning(CreateTuningRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.createTuning);
    }

    /**
     * 执行SQL诊断
     *
     * 执行SQL诊断，
     * 用于用户执行SQL诊断。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTuningRequest 请求对象
     * @return SyncInvoker<CreateTuningRequest, CreateTuningResponse>
     */
    public SyncInvoker<CreateTuningRequest, CreateTuningResponse> createTuningInvoker(CreateTuningRequest request) {
        return new SyncInvoker<>(request, DasMeta.createTuning, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除注册在DAS里的数据库用户。此接口只是将注册的数据库用户在DAS系统里删除，不会真正删除数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 删除邮件模板
     *
     * 删除邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEmailTemplateRequest 请求对象
     * @return DeleteEmailTemplateResponse
     */
    public DeleteEmailTemplateResponse deleteEmailTemplate(DeleteEmailTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteEmailTemplate);
    }

    /**
     * 删除邮件模板
     *
     * 删除邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEmailTemplateRequest 请求对象
     * @return SyncInvoker<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse>
     */
    public SyncInvoker<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse> deleteEmailTemplateInvoker(
        DeleteEmailTemplateRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteEmailTemplate, hcClient);
    }

    /**
     * 删除导出历史事务任务
     *
     * DAS收集历史事务开关打开后，删除历史事务导出任务记录对应的OBS文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHistoryTransactionExportTaskRequest 请求对象
     * @return DeleteHistoryTransactionExportTaskResponse
     */
    public DeleteHistoryTransactionExportTaskResponse deleteHistoryTransactionExportTask(
        DeleteHistoryTransactionExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteHistoryTransactionExportTask);
    }

    /**
     * 删除导出历史事务任务
     *
     * DAS收集历史事务开关打开后，删除历史事务导出任务记录对应的OBS文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHistoryTransactionExportTaskRequest 请求对象
     * @return SyncInvoker<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse>
     */
    public SyncInvoker<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse> deleteHistoryTransactionExportTaskInvoker(
        DeleteHistoryTransactionExportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteHistoryTransactionExportTask, hcClient);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceGroupRequest 请求对象
     * @return DeleteInstanceGroupResponse
     */
    public DeleteInstanceGroupResponse deleteInstanceGroup(DeleteInstanceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteInstanceGroup);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceGroupRequest 请求对象
     * @return SyncInvoker<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse>
     */
    public SyncInvoker<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse> deleteInstanceGroupInvoker(
        DeleteInstanceGroupRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteInstanceGroup, hcClient);
    }

    /**
     * 查杀会话
     *
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProcessRequest 请求对象
     * @return DeleteProcessResponse
     */
    public DeleteProcessResponse deleteProcess(DeleteProcessRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteProcess);
    }

    /**
     * 查杀会话
     *
     * 查杀会话。支持按照用户、数据库、会话列表查杀会话，三个条件至少指定一个。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProcessRequest 请求对象
     * @return SyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public SyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessInvoker(DeleteProcessRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return DeleteSqlLimitRulesResponse
     */
    public DeleteSqlLimitRulesResponse deleteSqlLimitRules(DeleteSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.deleteSqlLimitRules);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse>
     */
    public SyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRulesInvoker(
        DeleteSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.deleteSqlLimitRules, hcClient);
    }

    /**
     * 导出全量SQL明细
     *
     * 全量SQL开关打开后，创建SQL洞察任务，支持按节点、用户名、数据库、操作类型等导出全量SQL明细数据。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlDetailsRequest 请求对象
     * @return ExportFullSqlDetailsResponse
     */
    public ExportFullSqlDetailsResponse exportFullSqlDetails(ExportFullSqlDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportFullSqlDetails);
    }

    /**
     * 导出全量SQL明细
     *
     * 全量SQL开关打开后，创建SQL洞察任务，支持按节点、用户名、数据库、操作类型等导出全量SQL明细数据。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlDetailsRequest 请求对象
     * @return SyncInvoker<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse>
     */
    public SyncInvoker<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse> exportFullSqlDetailsInvoker(
        ExportFullSqlDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportFullSqlDetails, hcClient);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return ExportSlowQueryLogsResponse
     */
    public ExportSlowQueryLogsResponse exportSlowQueryLogs(ExportSlowQueryLogsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public SyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsInvoker(
        ExportSlowQueryLogsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return ExportSlowSqlStatisticsResponse
     */
    public ExportSlowSqlStatisticsResponse exportSlowSqlStatistics(ExportSlowSqlStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlStatistics);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse>
     */
    public SyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> exportSlowSqlStatisticsInvoker(
        ExportSlowSqlStatisticsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowSqlStatistics, hcClient);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return ExportSlowSqlTemplatesDetailsResponse
     */
    public ExportSlowSqlTemplatesDetailsResponse exportSlowSqlTemplatesDetails(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlTemplatesDetails);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse>
     */
    public SyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsInvoker(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return ExportSlowSqlTrendDetailsResponse
     */
    public ExportSlowSqlTrendDetailsResponse exportSlowSqlTrendDetails(ExportSlowSqlTrendDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSlowSqlTrendDetails);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return SyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse>
     */
    public SyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetailsInvoker(
        ExportSlowSqlTrendDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSlowSqlTrendDetails, hcClient);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return ExportSqlStatementsResponse
     */
    public ExportSqlStatementsResponse exportSqlStatements(ExportSqlStatementsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportSqlStatements);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public SyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsInvoker(
        ExportSqlStatementsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return ExportTopRiskInstancesResponse
     */
    public ExportTopRiskInstancesResponse exportTopRiskInstances(ExportTopRiskInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopRiskInstances);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return SyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse>
     */
    public SyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> exportTopRiskInstancesInvoker(
        ExportTopRiskInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportTopRiskInstances, hcClient);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return ExportTopSqlTemplatesDetailsResponse
     */
    public ExportTopSqlTemplatesDetailsResponse exportTopSqlTemplatesDetails(
        ExportTopSqlTemplatesDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopSqlTemplatesDetails);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse>
     */
    public SyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsInvoker(
        ExportTopSqlTemplatesDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportTopSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return ExportTopSqlTrendDetailsResponse
     */
    public ExportTopSqlTrendDetailsResponse exportTopSqlTrendDetails(ExportTopSqlTrendDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.exportTopSqlTrendDetails);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse>
     */
    public SyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsInvoker(
        ExportTopSqlTrendDetailsRequest request) {
        return new SyncInvoker<>(request, DasMeta.exportTopSqlTrendDetails, hcClient);
    }

    /**
     * 查询自增配额
     *
     * 查询自增配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoIncrementUsageRequest 请求对象
     * @return ListAutoIncrementUsageResponse
     */
    public ListAutoIncrementUsageResponse listAutoIncrementUsage(ListAutoIncrementUsageRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listAutoIncrementUsage);
    }

    /**
     * 查询自增配额
     *
     * 查询自增配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoIncrementUsageRequest 请求对象
     * @return SyncInvoker<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse>
     */
    public SyncInvoker<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse> listAutoIncrementUsageInvoker(
        ListAutoIncrementUsageRequest request) {
        return new SyncInvoker<>(request, DasMeta.listAutoIncrementUsage, hcClient);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return ListCloudDbaInstancesResponse
     */
    public ListCloudDbaInstancesResponse listCloudDbaInstances(ListCloudDbaInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listCloudDbaInstances);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return SyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse>
     */
    public SyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> listCloudDbaInstancesInvoker(
        ListCloudDbaInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listCloudDbaInstances, hcClient);
    }

    /**
     * 获取库名列表
     *
     * 获取库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbNamesRequest 请求对象
     * @return ListDbNamesResponse
     */
    public ListDbNamesResponse listDbNames(ListDbNamesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDbNames);
    }

    /**
     * 获取库名列表
     *
     * 获取库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbNamesRequest 请求对象
     * @return SyncInvoker<ListDbNamesRequest, ListDbNamesResponse>
     */
    public SyncInvoker<ListDbNamesRequest, ListDbNamesResponse> listDbNamesInvoker(ListDbNamesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listDbNames, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询注册在DAS里的数据库用户列表，后续调用其他接口时(如查询实例会话列表接口)需要用到此接口返回的db_user_id。此接口不会返回数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询邮件推送记录
     *
     * 查询邮件推送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailRecordRequest 请求对象
     * @return ListEmailRecordResponse
     */
    public ListEmailRecordResponse listEmailRecord(ListEmailRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listEmailRecord);
    }

    /**
     * 查询邮件推送记录
     *
     * 查询邮件推送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailRecordRequest 请求对象
     * @return SyncInvoker<ListEmailRecordRequest, ListEmailRecordResponse>
     */
    public SyncInvoker<ListEmailRecordRequest, ListEmailRecordResponse> listEmailRecordInvoker(
        ListEmailRecordRequest request) {
        return new SyncInvoker<>(request, DasMeta.listEmailRecord, hcClient);
    }

    /**
     * 查询邮件模板列表
     *
     * 查询邮件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailTemplateRequest 请求对象
     * @return ListEmailTemplateResponse
     */
    public ListEmailTemplateResponse listEmailTemplate(ListEmailTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listEmailTemplate);
    }

    /**
     * 查询邮件模板列表
     *
     * 查询邮件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailTemplateRequest 请求对象
     * @return SyncInvoker<ListEmailTemplateRequest, ListEmailTemplateResponse>
     */
    public SyncInvoker<ListEmailTemplateRequest, ListEmailTemplateResponse> listEmailTemplateInvoker(
        ListEmailTemplateRequest request) {
        return new SyncInvoker<>(request, DasMeta.listEmailTemplate, hcClient);
    }

    /**
     * 查询SQL洞察任务列表
     *
     * 全量SQL开关打开后，查询SQL洞察任务列表。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlTasksRequest 请求对象
     * @return ListFullSqlTasksResponse
     */
    public ListFullSqlTasksResponse listFullSqlTasks(ListFullSqlTasksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listFullSqlTasks);
    }

    /**
     * 查询SQL洞察任务列表
     *
     * 全量SQL开关打开后，查询SQL洞察任务列表。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlTasksRequest 请求对象
     * @return SyncInvoker<ListFullSqlTasksRequest, ListFullSqlTasksResponse>
     */
    public SyncInvoker<ListFullSqlTasksRequest, ListFullSqlTasksResponse> listFullSqlTasksInvoker(
        ListFullSqlTasksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listFullSqlTasks, hcClient);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return ListHealthReportTaskResponse
     */
    public ListHealthReportTaskResponse listHealthReportTask(ListHealthReportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listHealthReportTask);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return SyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse>
     */
    public SyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse> listHealthReportTaskInvoker(
        ListHealthReportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.listHealthReportTask, hcClient);
    }

    /**
     * 查询历史事务导出任务列表
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryTransactionExportTaskRequest 请求对象
     * @return ListHistoryTransactionExportTaskResponse
     */
    public ListHistoryTransactionExportTaskResponse listHistoryTransactionExportTask(
        ListHistoryTransactionExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listHistoryTransactionExportTask);
    }

    /**
     * 查询历史事务导出任务列表
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryTransactionExportTaskRequest 请求对象
     * @return SyncInvoker<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse>
     */
    public SyncInvoker<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse> listHistoryTransactionExportTaskInvoker(
        ListHistoryTransactionExportTaskRequest request) {
        return new SyncInvoker<>(request, DasMeta.listHistoryTransactionExportTask, hcClient);
    }

    /**
     * 查询InnoDB锁等待列表
     *
     * 查询InnoDB锁等待列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInnodbLocksRequest 请求对象
     * @return ListInnodbLocksResponse
     */
    public ListInnodbLocksResponse listInnodbLocks(ListInnodbLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInnodbLocks);
    }

    /**
     * 查询InnoDB锁等待列表
     *
     * 查询InnoDB锁等待列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInnodbLocksRequest 请求对象
     * @return SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public SyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksInvoker(
        ListInnodbLocksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询巡检报告列表
     *
     * 查询巡检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionReportRequest 请求对象
     * @return ListInspectionReportResponse
     */
    public ListInspectionReportResponse listInspectionReport(ListInspectionReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInspectionReport);
    }

    /**
     * 查询巡检报告列表
     *
     * 查询巡检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionReportRequest 请求对象
     * @return SyncInvoker<ListInspectionReportRequest, ListInspectionReportResponse>
     */
    public SyncInvoker<ListInspectionReportRequest, ListInspectionReportResponse> listInspectionReportInvoker(
        ListInspectionReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInspectionReport, hcClient);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return ListInstanceDistributionResponse
     */
    public ListInstanceDistributionResponse listInstanceDistribution(ListInstanceDistributionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceDistribution);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return SyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse>
     */
    public SyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse> listInstanceDistributionInvoker(
        ListInstanceDistributionRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceDistribution, hcClient);
    }

    /**
     * 查询实例组列表
     *
     * 查询实例组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceGroupRequest 请求对象
     * @return ListInstanceGroupResponse
     */
    public ListInstanceGroupResponse listInstanceGroup(ListInstanceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceGroup);
    }

    /**
     * 查询实例组列表
     *
     * 查询实例组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceGroupRequest 请求对象
     * @return SyncInvoker<ListInstanceGroupRequest, ListInstanceGroupResponse>
     */
    public SyncInvoker<ListInstanceGroupRequest, ListInstanceGroupResponse> listInstanceGroupInvoker(
        ListInstanceGroupRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceGroup, hcClient);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return ListInstanceMultiNodesSingleMetricResponse
     */
    public ListInstanceMultiNodesSingleMetricResponse listInstanceMultiNodesSingleMetric(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceMultiNodesSingleMetric);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return SyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse>
     */
    public SyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetricInvoker(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceMultiNodesSingleMetric, hcClient);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return ListInstanceNodesInfoResponse
     */
    public ListInstanceNodesInfoResponse listInstanceNodesInfo(ListInstanceNodesInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceNodesInfo);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return SyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse>
     */
    public SyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> listInstanceNodesInfoInvoker(
        ListInstanceNodesInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceNodesInfo, hcClient);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return ListInstanceTopSlowLogResponse
     */
    public ListInstanceTopSlowLogResponse listInstanceTopSlowLog(ListInstanceTopSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listInstanceTopSlowLog);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return SyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse>
     */
    public SyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> listInstanceTopSlowLogInvoker(
        ListInstanceTopSlowLogRequest request) {
        return new SyncInvoker<>(request, DasMeta.listInstanceTopSlowLog, hcClient);
    }

    /**
     * 查询锁阻塞数据库名列表
     *
     * 查询锁阻塞数据库名列表。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockBlockingDbRequest 请求对象
     * @return ListLockBlockingDbResponse
     */
    public ListLockBlockingDbResponse listLockBlockingDb(ListLockBlockingDbRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listLockBlockingDb);
    }

    /**
     * 查询锁阻塞数据库名列表
     *
     * 查询锁阻塞数据库名列表。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockBlockingDbRequest 请求对象
     * @return SyncInvoker<ListLockBlockingDbRequest, ListLockBlockingDbResponse>
     */
    public SyncInvoker<ListLockBlockingDbRequest, ListLockBlockingDbResponse> listLockBlockingDbInvoker(
        ListLockBlockingDbRequest request) {
        return new SyncInvoker<>(request, DasMeta.listLockBlockingDb, hcClient);
    }

    /**
     * 查询锁阻塞明细列表
     *
     * 查询锁阻塞明细列表。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockBlockingDetailRequest 请求对象
     * @return ListLockBlockingDetailResponse
     */
    public ListLockBlockingDetailResponse listLockBlockingDetail(ListLockBlockingDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listLockBlockingDetail);
    }

    /**
     * 查询锁阻塞明细列表
     *
     * 查询锁阻塞明细列表。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockBlockingDetailRequest 请求对象
     * @return SyncInvoker<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse>
     */
    public SyncInvoker<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse> listLockBlockingDetailInvoker(
        ListLockBlockingDetailRequest request) {
        return new SyncInvoker<>(request, DasMeta.listLockBlockingDetail, hcClient);
    }

    /**
     * 查询锁阻塞关系
     *
     * 查询锁阻塞关系。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockBlockingRelationshipRequest 请求对象
     * @return ListLockBlockingRelationshipResponse
     */
    public ListLockBlockingRelationshipResponse listLockBlockingRelationship(
        ListLockBlockingRelationshipRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listLockBlockingRelationship);
    }

    /**
     * 查询锁阻塞关系
     *
     * 查询锁阻塞关系。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLockBlockingRelationshipRequest 请求对象
     * @return SyncInvoker<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse>
     */
    public SyncInvoker<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse> listLockBlockingRelationshipInvoker(
        ListLockBlockingRelationshipRequest request) {
        return new SyncInvoker<>(request, DasMeta.listLockBlockingRelationship, hcClient);
    }

    /**
     * 查询元数据锁列表
     *
     * 查询元数据锁列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadataLocksRequest 请求对象
     * @return ListMetadataLocksResponse
     */
    public ListMetadataLocksResponse listMetadataLocks(ListMetadataLocksRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listMetadataLocks);
    }

    /**
     * 查询元数据锁列表
     *
     * 查询元数据锁列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMetadataLocksRequest 请求对象
     * @return SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public SyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksInvoker(
        ListMetadataLocksRequest request) {
        return new SyncInvoker<>(request, DasMeta.listMetadataLocks, hcClient);
    }

    /**
     * 查询实例会话列表
     *
     * 支持根据数据库、用户查询实例会话列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesRequest 请求对象
     * @return ListProcessesResponse
     */
    public ListProcessesResponse listProcesses(ListProcessesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listProcesses);
    }

    /**
     * 查询实例会话列表
     *
     * 支持根据数据库、用户查询实例会话列表。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProcessesRequest 请求对象
     * @return SyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public SyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesInvoker(ListProcessesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return ListRiskItemsResponse
     */
    public ListRiskItemsResponse listRiskItems(ListRiskItemsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listRiskItems);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return SyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse>
     */
    public SyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse> listRiskItemsInvoker(ListRiskItemsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listRiskItems, hcClient);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return ListRiskTrendResponse
     */
    public ListRiskTrendResponse listRiskTrend(ListRiskTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listRiskTrend);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return SyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse>
     */
    public SyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse> listRiskTrendInvoker(ListRiskTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.listRiskTrend, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return ListSnapshotsResponse
     */
    public ListSnapshotsResponse listSnapshots(ListSnapshotsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public SyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsInvoker(ListSnapshotsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSnapshots, hcClient);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return ListSpaceAnalysisResponse
     */
    public ListSpaceAnalysisResponse listSpaceAnalysis(ListSpaceAnalysisRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public SyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisInvoker(
        ListSpaceAnalysisRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSpaceAnalysis, hcClient);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return ListSqlLimitRulesResponse
     */
    public ListSqlLimitRulesResponse listSqlLimitRules(ListSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listSqlLimitRules);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse>
     */
    public SyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRulesInvoker(
        ListSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.listSqlLimitRules, hcClient);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return ListTopSlowLogResponse
     */
    public ListTopSlowLogResponse listTopSlowLog(ListTopSlowLogRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTopSlowLog);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return SyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse>
     */
    public SyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse> listTopSlowLogInvoker(
        ListTopSlowLogRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTopSlowLog, hcClient);
    }

    /**
     * 查询历史事务列表
     *
     * 查询历史事务列表。
     * 目前仅支持MySQL实例，仅支持查看最近7天的历史事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionsRequest 请求对象
     * @return ListTransactionsResponse
     */
    public ListTransactionsResponse listTransactions(ListTransactionsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.listTransactions);
    }

    /**
     * 查询历史事务列表
     *
     * 查询历史事务列表。
     * 目前仅支持MySQL实例，仅支持查看最近7天的历史事务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTransactionsRequest 请求对象
     * @return SyncInvoker<ListTransactionsRequest, ListTransactionsResponse>
     */
    public SyncInvoker<ListTransactionsRequest, ListTransactionsResponse> listTransactionsInvoker(
        ListTransactionsRequest request) {
        return new SyncInvoker<>(request, DasMeta.listTransactions, hcClient);
    }

    /**
     * 内置账号登录
     *
     * 内置账号登录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginBuiltInAccountRequest 请求对象
     * @return LoginBuiltInAccountResponse
     */
    public LoginBuiltInAccountResponse loginBuiltInAccount(LoginBuiltInAccountRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.loginBuiltInAccount);
    }

    /**
     * 内置账号登录
     *
     * 内置账号登录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginBuiltInAccountRequest 请求对象
     * @return SyncInvoker<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse>
     */
    public SyncInvoker<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse> loginBuiltInAccountInvoker(
        LoginBuiltInAccountRequest request) {
        return new SyncInvoker<>(request, DasMeta.loginBuiltInAccount, hcClient);
    }

    /**
     * 内置账号登出
     *
     * 内置账号登出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffBuiltInAccountRequest 请求对象
     * @return LogoffBuiltInAccountResponse
     */
    public LogoffBuiltInAccountResponse logoffBuiltInAccount(LogoffBuiltInAccountRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.logoffBuiltInAccount);
    }

    /**
     * 内置账号登出
     *
     * 内置账号登出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffBuiltInAccountRequest 请求对象
     * @return SyncInvoker<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse>
     */
    public SyncInvoker<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse> logoffBuiltInAccountInvoker(
        LogoffBuiltInAccountRequest request) {
        return new SyncInvoker<>(request, DasMeta.logoffBuiltInAccount, hcClient);
    }

    /**
     * 一键分析死锁日志
     *
     * 一键分析死锁日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDeadLockRequest 请求对象
     * @return ParseDeadLockResponse
     */
    public ParseDeadLockResponse parseDeadLock(ParseDeadLockRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.parseDeadLock);
    }

    /**
     * 一键分析死锁日志
     *
     * 一键分析死锁日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDeadLockRequest 请求对象
     * @return SyncInvoker<ParseDeadLockRequest, ParseDeadLockResponse>
     */
    public SyncInvoker<ParseDeadLockRequest, ParseDeadLockResponse> parseDeadLockInvoker(ParseDeadLockRequest request) {
        return new SyncInvoker<>(request, DasMeta.parseDeadLock, hcClient);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return ParseSqlLimitRulesResponse
     */
    public ParseSqlLimitRulesResponse parseSqlLimitRules(ParseSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.parseSqlLimitRules);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse>
     */
    public SyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> parseSqlLimitRulesInvoker(
        ParseSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.parseSqlLimitRules, hcClient);
    }

    /**
     * 注册数据库用户
     *
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDbUserRequest 请求对象
     * @return RegisterDbUserResponse
     */
    public RegisterDbUserResponse registerDbUser(RegisterDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.registerDbUser);
    }

    /**
     * 注册数据库用户
     *
     * 此接口是将数据库用户和密码注册进DAS系统，同时会返回一个数据库用户ID ，后续调用其他接口时（如查询实例会话列表接口）需要用到此数据库用户ID。密码为加密存储，且仅用于DAS API相关功能。此接口不会在数据库实例上创建数据库用户对象。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RegisterDbUserRequest 请求对象
     * @return SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public SyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserInvoker(
        RegisterDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialRequest 请求对象
     * @return SaveCredentialResponse
     */
    public SaveCredentialResponse saveCredential(SaveCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.saveCredential);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialRequest 请求对象
     * @return SyncInvoker<SaveCredentialRequest, SaveCredentialResponse>
     */
    public SyncInvoker<SaveCredentialRequest, SaveCredentialResponse> saveCredentialInvoker(
        SaveCredentialRequest request) {
        return new SyncInvoker<>(request, DasMeta.saveCredential, hcClient);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialForBatchInspectionRequest 请求对象
     * @return SaveCredentialForBatchInspectionResponse
     */
    public SaveCredentialForBatchInspectionResponse saveCredentialForBatchInspection(
        SaveCredentialForBatchInspectionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.saveCredentialForBatchInspection);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialForBatchInspectionRequest 请求对象
     * @return SyncInvoker<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse>
     */
    public SyncInvoker<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse> saveCredentialForBatchInspectionInvoker(
        SaveCredentialForBatchInspectionRequest request) {
        return new SyncInvoker<>(request, DasMeta.saveCredentialForBatchInspection, hcClient);
    }

    /**
     * 设置锁阻塞开关和保存时长
     *
     * 设置锁阻塞开关和保存时长，仅支持SQLServer引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetLockBlockingSwitchRequest 请求对象
     * @return SetLockBlockingSwitchResponse
     */
    public SetLockBlockingSwitchResponse setLockBlockingSwitch(SetLockBlockingSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.setLockBlockingSwitch);
    }

    /**
     * 设置锁阻塞开关和保存时长
     *
     * 设置锁阻塞开关和保存时长，仅支持SQLServer引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetLockBlockingSwitchRequest 请求对象
     * @return SyncInvoker<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse>
     */
    public SyncInvoker<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse> setLockBlockingSwitchInvoker(
        SetLockBlockingSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.setLockBlockingSwitch, hcClient);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return SetThresholdForMetricResponse
     */
    public SetThresholdForMetricResponse setThresholdForMetric(SetThresholdForMetricRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.setThresholdForMetric);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return SyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse>
     */
    public SyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse> setThresholdForMetricInvoker(
        SetThresholdForMetricRequest request) {
        return new SyncInvoker<>(request, DasMeta.setThresholdForMetric, hcClient);
    }

    /**
     * 查询会话分析结果
     *
     * 查询会话分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionResultRequest 请求对象
     * @return ShowAnalysisSessionResultResponse
     */
    public ShowAnalysisSessionResultResponse showAnalysisSessionResult(ShowAnalysisSessionResultRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showAnalysisSessionResult);
    }

    /**
     * 查询会话分析结果
     *
     * 查询会话分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionResultRequest 请求对象
     * @return SyncInvoker<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse>
     */
    public SyncInvoker<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse> showAnalysisSessionResultInvoker(
        ShowAnalysisSessionResultRequest request) {
        return new SyncInvoker<>(request, DasMeta.showAnalysisSessionResult, hcClient);
    }

    /**
     * 查询会话分析状态
     *
     * 查询会话分析状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionStatusRequest 请求对象
     * @return ShowAnalysisSessionStatusResponse
     */
    public ShowAnalysisSessionStatusResponse showAnalysisSessionStatus(ShowAnalysisSessionStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showAnalysisSessionStatus);
    }

    /**
     * 查询会话分析状态
     *
     * 查询会话分析状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionStatusRequest 请求对象
     * @return SyncInvoker<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse>
     */
    public SyncInvoker<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse> showAnalysisSessionStatusInvoker(
        ShowAnalysisSessionStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showAnalysisSessionStatus, hcClient);
    }

    /**
     * 查询searchpath开关状态
     *
     * 查询searchpath开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddbaGetSearchPathFlagNewRequest 请求对象
     * @return ShowClouddbaGetSearchPathFlagNewResponse
     */
    public ShowClouddbaGetSearchPathFlagNewResponse showClouddbaGetSearchPathFlagNew(
        ShowClouddbaGetSearchPathFlagNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showClouddbaGetSearchPathFlagNew);
    }

    /**
     * 查询searchpath开关状态
     *
     * 查询searchpath开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddbaGetSearchPathFlagNewRequest 请求对象
     * @return SyncInvoker<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse>
     */
    public SyncInvoker<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse> showClouddbaGetSearchPathFlagNewInvoker(
        ShowClouddbaGetSearchPathFlagNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showClouddbaGetSearchPathFlagNew, hcClient);
    }

    /**
     * 查询AK/SK
     *
     * 查询AK/SK。用于判断是否已保存AK/SK
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCredentialRequest 请求对象
     * @return ShowCredentialResponse
     */
    public ShowCredentialResponse showCredential(ShowCredentialRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showCredential);
    }

    /**
     * 查询AK/SK
     *
     * 查询AK/SK。用于判断是否已保存AK/SK
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCredentialRequest 请求对象
     * @return SyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public SyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialInvoker(
        ShowCredentialRequest request) {
        return new SyncInvoker<>(request, DasMeta.showCredential, hcClient);
    }

    /**
     * 开通配额询价
     *
     * 开通配额询价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasCloudDbaPriceRequest 请求对象
     * @return ShowDasCloudDbaPriceResponse
     */
    public ShowDasCloudDbaPriceResponse showDasCloudDbaPrice(ShowDasCloudDbaPriceRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDasCloudDbaPrice);
    }

    /**
     * 开通配额询价
     *
     * 开通配额询价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasCloudDbaPriceRequest 请求对象
     * @return SyncInvoker<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse>
     */
    public SyncInvoker<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse> showDasCloudDbaPriceInvoker(
        ShowDasCloudDbaPriceRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDasCloudDbaPrice, hcClient);
    }

    /**
     * 自动推荐SQL限流规则
     *
     * 根据条件（包括模板所代表的sql平均时长，条数，最大执行时长，前三者混合）自动推荐SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasRecommendSqlLimitRuleRequest 请求对象
     * @return ShowDasRecommendSqlLimitRuleResponse
     */
    public ShowDasRecommendSqlLimitRuleResponse showDasRecommendSqlLimitRule(
        ShowDasRecommendSqlLimitRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDasRecommendSqlLimitRule);
    }

    /**
     * 自动推荐SQL限流规则
     *
     * 根据条件（包括模板所代表的sql平均时长，条数，最大执行时长，前三者混合）自动推荐SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasRecommendSqlLimitRuleRequest 请求对象
     * @return SyncInvoker<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse>
     */
    public SyncInvoker<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse> showDasRecommendSqlLimitRuleInvoker(
        ShowDasRecommendSqlLimitRuleRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDasRecommendSqlLimitRule, hcClient);
    }

    /**
     * 查询数据库用户信息
     *
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbUserRequest 请求对象
     * @return ShowDbUserResponse
     */
    public ShowDbUserResponse showDbUser(ShowDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDbUser);
    }

    /**
     * 查询数据库用户信息
     *
     * 查询注册在DAS里的数据库用户信息。此接口不能查询数据库实例上的数据库用户对象。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDbUserRequest 请求对象
     * @return SyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public SyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserInvoker(ShowDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询死锁日志分析结果
     *
     * 查询死锁日志分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockAnalysisResultRequest 请求对象
     * @return ShowDeadLockAnalysisResultResponse
     */
    public ShowDeadLockAnalysisResultResponse showDeadLockAnalysisResult(ShowDeadLockAnalysisResultRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockAnalysisResult);
    }

    /**
     * 查询死锁日志分析结果
     *
     * 查询死锁日志分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockAnalysisResultRequest 请求对象
     * @return SyncInvoker<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse>
     */
    public SyncInvoker<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse> showDeadLockAnalysisResultInvoker(
        ShowDeadLockAnalysisResultRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockAnalysisResult, hcClient);
    }

    /**
     * 获取死锁拓扑图数据
     *
     * 获取死锁拓扑图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTopologyRequest 请求对象
     * @return ShowDeadLockTopologyResponse
     */
    public ShowDeadLockTopologyResponse showDeadLockTopology(ShowDeadLockTopologyRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockTopology);
    }

    /**
     * 获取死锁拓扑图数据
     *
     * 获取死锁拓扑图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTopologyRequest 请求对象
     * @return SyncInvoker<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse>
     */
    public SyncInvoker<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse> showDeadLockTopologyInvoker(
        ShowDeadLockTopologyRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockTopology, hcClient);
    }

    /**
     * 查看全量SQL导出任务详情
     *
     * 查看全量SQL导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportTaskInfoRequest 请求对象
     * @return ShowExportTaskInfoResponse
     */
    public ShowExportTaskInfoResponse showExportTaskInfo(ShowExportTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showExportTaskInfo);
    }

    /**
     * 查看全量SQL导出任务详情
     *
     * 查看全量SQL导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse>
     */
    public SyncInvoker<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse> showExportTaskInfoInvoker(
        ShowExportTaskInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showExportTaskInfo, hcClient);
    }

    /**
     * 获取全量死锁信息
     *
     * 获取全量死锁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockListRequest 请求对象
     * @return ShowFullDeadLockListResponse
     */
    public ShowFullDeadLockListResponse showFullDeadLockList(ShowFullDeadLockListRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showFullDeadLockList);
    }

    /**
     * 获取全量死锁信息
     *
     * 获取全量死锁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockListRequest 请求对象
     * @return SyncInvoker<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse>
     */
    public SyncInvoker<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse> showFullDeadLockListInvoker(
        ShowFullDeadLockListRequest request) {
        return new SyncInvoker<>(request, DasMeta.showFullDeadLockList, hcClient);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchRequest 请求对象
     * @return ShowFullDeadLockSwitchResponse
     */
    public ShowFullDeadLockSwitchResponse showFullDeadLockSwitch(ShowFullDeadLockSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showFullDeadLockSwitch);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchRequest 请求对象
     * @return SyncInvoker<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse>
     */
    public SyncInvoker<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse> showFullDeadLockSwitchInvoker(
        ShowFullDeadLockSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.showFullDeadLockSwitch, hcClient);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchNewRequest 请求对象
     * @return ShowFullDeadLockSwitchNewResponse
     */
    public ShowFullDeadLockSwitchNewResponse showFullDeadLockSwitchNew(ShowFullDeadLockSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showFullDeadLockSwitchNew);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse>
     */
    public SyncInvoker<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse> showFullDeadLockSwitchNewInvoker(
        ShowFullDeadLockSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showFullDeadLockSwitchNew, hcClient);
    }

    /**
     * 获取产品级别的安全协议
     *
     * 获取产品级别的安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalPrivacyNewRequest 请求对象
     * @return ShowGlobalPrivacyNewResponse
     */
    public ShowGlobalPrivacyNewResponse showGlobalPrivacyNew(ShowGlobalPrivacyNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showGlobalPrivacyNew);
    }

    /**
     * 获取产品级别的安全协议
     *
     * 获取产品级别的安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalPrivacyNewRequest 请求对象
     * @return SyncInvoker<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse>
     */
    public SyncInvoker<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse> showGlobalPrivacyNewInvoker(
        ShowGlobalPrivacyNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showGlobalPrivacyNew, hcClient);
    }

    /**
     * 查看实例诊断报告设置
     *
     * 查看实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthReportSettingsRequest 请求对象
     * @return ShowHealthReportSettingsResponse
     */
    public ShowHealthReportSettingsResponse showHealthReportSettings(ShowHealthReportSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showHealthReportSettings);
    }

    /**
     * 查看实例诊断报告设置
     *
     * 查看实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthReportSettingsRequest 请求对象
     * @return SyncInvoker<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse>
     */
    public SyncInvoker<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse> showHealthReportSettingsInvoker(
        ShowHealthReportSettingsRequest request) {
        return new SyncInvoker<>(request, DasMeta.showHealthReportSettings, hcClient);
    }

    /**
     * 查询历史事务导出任务详情
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionExportTaskInfoRequest 请求对象
     * @return ShowHistoryTransactionExportTaskInfoResponse
     */
    public ShowHistoryTransactionExportTaskInfoResponse showHistoryTransactionExportTaskInfo(
        ShowHistoryTransactionExportTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showHistoryTransactionExportTaskInfo);
    }

    /**
     * 查询历史事务导出任务详情
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionExportTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse>
     */
    public SyncInvoker<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse> showHistoryTransactionExportTaskInfoInvoker(
        ShowHistoryTransactionExportTaskInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showHistoryTransactionExportTaskInfo, hcClient);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionSwitchNewRequest 请求对象
     * @return ShowHistoryTransactionSwitchNewResponse
     */
    public ShowHistoryTransactionSwitchNewResponse showHistoryTransactionSwitchNew(
        ShowHistoryTransactionSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showHistoryTransactionSwitchNew);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse>
     */
    public SyncInvoker<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse> showHistoryTransactionSwitchNewInvoker(
        ShowHistoryTransactionSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showHistoryTransactionSwitchNew, hcClient);
    }

    /**
     * 查询索引使用开关
     *
     * 查询索引使用开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndexUsageSwitchNewRequest 请求对象
     * @return ShowIndexUsageSwitchNewResponse
     */
    public ShowIndexUsageSwitchNewResponse showIndexUsageSwitchNew(ShowIndexUsageSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showIndexUsageSwitchNew);
    }

    /**
     * 查询索引使用开关
     *
     * 查询索引使用开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndexUsageSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse>
     */
    public SyncInvoker<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse> showIndexUsageSwitchNewInvoker(
        ShowIndexUsageSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showIndexUsageSwitchNew, hcClient);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return ShowInstanceHealthReportResponse
     */
    public ShowInstanceHealthReportResponse showInstanceHealthReport(ShowInstanceHealthReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showInstanceHealthReport);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return SyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse>
     */
    public SyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> showInstanceHealthReportInvoker(
        ShowInstanceHealthReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.showInstanceHealthReport, hcClient);
    }

    /**
     * 查询自治限流开关
     *
     * 查询自治限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskSwitchRequest 请求对象
     * @return ShowKillProcessTaskSwitchResponse
     */
    public ShowKillProcessTaskSwitchResponse showKillProcessTaskSwitch(ShowKillProcessTaskSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showKillProcessTaskSwitch);
    }

    /**
     * 查询自治限流开关
     *
     * 查询自治限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskSwitchRequest 请求对象
     * @return SyncInvoker<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse>
     */
    public SyncInvoker<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse> showKillProcessTaskSwitchInvoker(
        ShowKillProcessTaskSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.showKillProcessTaskSwitch, hcClient);
    }

    /**
     * 获取死锁的快照信息
     *
     * 获取死锁的快照信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshotRequest 请求对象
     * @return ShowLatestDeadLockSnapshotResponse
     */
    public ShowLatestDeadLockSnapshotResponse showLatestDeadLockSnapshot(ShowLatestDeadLockSnapshotRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLatestDeadLockSnapshot);
    }

    /**
     * 获取死锁的快照信息
     *
     * 获取死锁的快照信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshotRequest 请求对象
     * @return SyncInvoker<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse>
     */
    public SyncInvoker<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse> showLatestDeadLockSnapshotInvoker(
        ShowLatestDeadLockSnapshotRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLatestDeadLockSnapshot, hcClient);
    }

    /**
     * 获取最新的数据库健康日报内容
     *
     * 获取最新的数据库健康日报内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestInstanceHealthReportRequest 请求对象
     * @return ShowLatestInstanceHealthReportResponse
     */
    public ShowLatestInstanceHealthReportResponse showLatestInstanceHealthReport(
        ShowLatestInstanceHealthReportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLatestInstanceHealthReport);
    }

    /**
     * 获取最新的数据库健康日报内容
     *
     * 获取最新的数据库健康日报内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestInstanceHealthReportRequest 请求对象
     * @return SyncInvoker<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse>
     */
    public SyncInvoker<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse> showLatestInstanceHealthReportInvoker(
        ShowLatestInstanceHealthReportRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLatestInstanceHealthReport, hcClient);
    }

    /**
     * 查询锁阻塞数量统计
     *
     * 查询锁阻塞数量统计。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLockBlockingStatisticsRequest 请求对象
     * @return ShowLockBlockingStatisticsResponse
     */
    public ShowLockBlockingStatisticsResponse showLockBlockingStatistics(ShowLockBlockingStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLockBlockingStatistics);
    }

    /**
     * 查询锁阻塞数量统计
     *
     * 查询锁阻塞数量统计。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLockBlockingStatisticsRequest 请求对象
     * @return SyncInvoker<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse>
     */
    public SyncInvoker<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse> showLockBlockingStatisticsInvoker(
        ShowLockBlockingStatisticsRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLockBlockingStatistics, hcClient);
    }

    /**
     * 查询锁阻塞开关和保存时长
     *
     * 查询锁阻塞开关和保存时长。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLockBlockingSwitchRequest 请求对象
     * @return ShowLockBlockingSwitchResponse
     */
    public ShowLockBlockingSwitchResponse showLockBlockingSwitch(ShowLockBlockingSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLockBlockingSwitch);
    }

    /**
     * 查询锁阻塞开关和保存时长
     *
     * 查询锁阻塞开关和保存时长。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLockBlockingSwitchRequest 请求对象
     * @return SyncInvoker<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse>
     */
    public SyncInvoker<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse> showLockBlockingSwitchInvoker(
        ShowLockBlockingSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLockBlockingSwitch, hcClient);
    }

    /**
     * 查询锁阻塞趋势列表
     *
     * 查询锁阻塞趋势列表。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLockBlockingTrendRequest 请求对象
     * @return ShowLockBlockingTrendResponse
     */
    public ShowLockBlockingTrendResponse showLockBlockingTrend(ShowLockBlockingTrendRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLockBlockingTrend);
    }

    /**
     * 查询锁阻塞趋势列表
     *
     * 查询锁阻塞趋势列表。
     * 仅支持SQLServer实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLockBlockingTrendRequest 请求对象
     * @return SyncInvoker<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse>
     */
    public SyncInvoker<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse> showLockBlockingTrendInvoker(
        ShowLockBlockingTrendRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLockBlockingTrend, hcClient);
    }

    /**
     * 查询长事务开关
     *
     * 查询长事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLongHistoryTransactionSwitchNewRequest 请求对象
     * @return ShowLongHistoryTransactionSwitchNewResponse
     */
    public ShowLongHistoryTransactionSwitchNewResponse showLongHistoryTransactionSwitchNew(
        ShowLongHistoryTransactionSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showLongHistoryTransactionSwitchNew);
    }

    /**
     * 查询长事务开关
     *
     * 查询长事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLongHistoryTransactionSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse>
     */
    public SyncInvoker<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse> showLongHistoryTransactionSwitchNewInvoker(
        ShowLongHistoryTransactionSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showLongHistoryTransactionSwitchNew, hcClient);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return ShowMetricNamesSupportResponse
     */
    public ShowMetricNamesSupportResponse showMetricNamesSupport(ShowMetricNamesSupportRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showMetricNamesSupport);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return SyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse>
     */
    public SyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> showMetricNamesSupportInvoker(
        ShowMetricNamesSupportRequest request) {
        return new SyncInvoker<>(request, DasMeta.showMetricNamesSupport, hcClient);
    }

    /**
     * 查看库名列表
     *
     * 查看库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameListRequest 请求对象
     * @return ShowNameListResponse
     */
    public ShowNameListResponse showNameList(ShowNameListRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showNameList);
    }

    /**
     * 查看库名列表
     *
     * 查看库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameListRequest 请求对象
     * @return SyncInvoker<ShowNameListRequest, ShowNameListResponse>
     */
    public SyncInvoker<ShowNameListRequest, ShowNameListResponse> showNameListInvoker(ShowNameListRequest request) {
        return new SyncInvoker<>(request, DasMeta.showNameList, hcClient);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse
     */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showQuotas);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<>(request, DasMeta.showQuotas, hcClient);
    }

    /**
     * 查询慢日志开关
     *
     * 查询慢日志开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogSwitchNewRequest 请求对象
     * @return ShowSlowLogSwitchNewResponse
     */
    public ShowSlowLogSwitchNewResponse showSlowLogSwitchNew(ShowSlowLogSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSlowLogSwitchNew);
    }

    /**
     * 查询慢日志开关
     *
     * 查询慢日志开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse>
     */
    public SyncInvoker<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse> showSlowLogSwitchNewInvoker(
        ShowSlowLogSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSlowLogSwitchNew, hcClient);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExecutionPlanRequest 请求对象
     * @return ShowSqlExecutionPlanResponse
     */
    public ShowSqlExecutionPlanResponse showSqlExecutionPlan(ShowSqlExecutionPlanRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExecutionPlanRequest 请求对象
     * @return SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public SyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanInvoker(
        ShowSqlExecutionPlanRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlExecutionPlan, hcClient);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 补充GET请求，处理超长SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExplainRequest 请求对象
     * @return ShowSqlExplainResponse
     */
    public ShowSqlExplainResponse showSqlExplain(ShowSqlExplainRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlExplain);
    }

    /**
     * 查询SQL执行计划
     *
     * 查询SQL执行计划。
     * 目前仅支持MySQL实例。
     * 补充GET请求，处理超长SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlExplainRequest 请求对象
     * @return SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse>
     */
    public SyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplainInvoker(
        ShowSqlExplainRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlExplain, hcClient);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return ShowSqlLimitJobInfoResponse
     */
    public ShowSqlLimitJobInfoResponse showSqlLimitJobInfo(ShowSqlLimitJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlLimitJobInfo);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse>
     */
    public SyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoInvoker(
        ShowSqlLimitJobInfoRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlLimitJobInfo, hcClient);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return ShowSqlLimitSwitchStatusResponse
     */
    public ShowSqlLimitSwitchStatusResponse showSqlLimitSwitchStatus(ShowSqlLimitSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlLimitSwitchStatus);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusInvoker(
        ShowSqlLimitSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 查询SQL限流开关
     *
     * 查询SQL限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitingSwitchNewRequest 请求对象
     * @return ShowSqlLimitingSwitchNewResponse
     */
    public ShowSqlLimitingSwitchNewResponse showSqlLimitingSwitchNew(ShowSqlLimitingSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlLimitingSwitchNew);
    }

    /**
     * 查询SQL限流开关
     *
     * 查询SQL限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitingSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse>
     */
    public SyncInvoker<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse> showSqlLimitingSwitchNewInvoker(
        ShowSqlLimitingSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlLimitingSwitchNew, hcClient);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return ShowSqlSwitchStatusResponse
     */
    public ShowSqlSwitchStatusResponse showSqlSwitchStatus(ShowSqlSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public SyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusInvoker(
        ShowSqlSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSqlSwitchStatus, hcClient);
    }

    /**
     * 查看支持的引擎类型
     *
     * 查看支持的引擎类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportedEnginesRequest 请求对象
     * @return ShowSupportedEnginesResponse
     */
    public ShowSupportedEnginesResponse showSupportedEngines(ShowSupportedEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showSupportedEngines);
    }

    /**
     * 查看支持的引擎类型
     *
     * 查看支持的引擎类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportedEnginesRequest 请求对象
     * @return SyncInvoker<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse>
     */
    public SyncInvoker<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse> showSupportedEnginesInvoker(
        ShowSupportedEnginesRequest request) {
        return new SyncInvoker<>(request, DasMeta.showSupportedEngines, hcClient);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionSwitchStatusRequest 请求对象
     * @return ShowTransactionSwitchStatusResponse
     */
    public ShowTransactionSwitchStatusResponse showTransactionSwitchStatus(ShowTransactionSwitchStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showTransactionSwitchStatus);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTransactionSwitchStatusRequest 请求对象
     * @return SyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse>
     */
    public SyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> showTransactionSwitchStatusInvoker(
        ShowTransactionSwitchStatusRequest request) {
        return new SyncInvoker<>(request, DasMeta.showTransactionSwitchStatus, hcClient);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return ShowTuningResponse
     */
    public ShowTuningResponse showTuning(ShowTuningRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showTuning);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return SyncInvoker<ShowTuningRequest, ShowTuningResponse>
     */
    public SyncInvoker<ShowTuningRequest, ShowTuningResponse> showTuningInvoker(ShowTuningRequest request) {
        return new SyncInvoker<>(request, DasMeta.showTuning, hcClient);
    }

    /**
     * 判断该实例能否使用云DBA功能
     *
     * 判断该实例能否使用云DBA功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhetherUseCloudDbaRequest 请求对象
     * @return ShowWhetherUseCloudDbaResponse
     */
    public ShowWhetherUseCloudDbaResponse showWhetherUseCloudDba(ShowWhetherUseCloudDbaRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showWhetherUseCloudDba);
    }

    /**
     * 判断该实例能否使用云DBA功能
     *
     * 判断该实例能否使用云DBA功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhetherUseCloudDbaRequest 请求对象
     * @return SyncInvoker<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse>
     */
    public SyncInvoker<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse> showWhetherUseCloudDbaInvoker(
        ShowWhetherUseCloudDbaRequest request) {
        return new SyncInvoker<>(request, DasMeta.showWhetherUseCloudDba, hcClient);
    }

    /**
     * 开始会话分析
     *
     * 开始会话分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAnalysisSessionRequest 请求对象
     * @return StartAnalysisSessionResponse
     */
    public StartAnalysisSessionResponse startAnalysisSession(StartAnalysisSessionRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.startAnalysisSession);
    }

    /**
     * 开始会话分析
     *
     * 开始会话分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAnalysisSessionRequest 请求对象
     * @return SyncInvoker<StartAnalysisSessionRequest, StartAnalysisSessionResponse>
     */
    public SyncInvoker<StartAnalysisSessionRequest, StartAnalysisSessionResponse> startAnalysisSessionInvoker(
        StartAnalysisSessionRequest request) {
        return new SyncInvoker<>(request, DasMeta.startAnalysisSession, hcClient);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return SynchronizeInstancesResponse
     */
    public SynchronizeInstancesResponse synchronizeInstances(SynchronizeInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.synchronizeInstances);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return SyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse>
     */
    public SyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse> synchronizeInstancesInvoker(
        SynchronizeInstancesRequest request) {
        return new SyncInvoker<>(request, DasMeta.synchronizeInstances, hcClient);
    }

    /**
     * 修改数据库用户
     *
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserRequest 请求对象
     * @return UpdateDbUserResponse
     */
    public UpdateDbUserResponse updateDbUser(UpdateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateDbUser);
    }

    /**
     * 修改数据库用户
     *
     * 修改注册在DAS里的数据库用户名和密码。此接口不会修改数据库实例上的数据库用户对象的用户名和密码。请确保输入的用户名和密码是已经存在并且是正确的。
     * 目前仅支持MySQL实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDbUserRequest 请求对象
     * @return SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public SyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserInvoker(UpdateDbUserRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateDbUser, hcClient);
    }

    /**
     * 修改邮件模板
     *
     * 修改邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEmailTemplateRequest 请求对象
     * @return UpdateEmailTemplateResponse
     */
    public UpdateEmailTemplateResponse updateEmailTemplate(UpdateEmailTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateEmailTemplate);
    }

    /**
     * 修改邮件模板
     *
     * 修改邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEmailTemplateRequest 请求对象
     * @return SyncInvoker<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse>
     */
    public SyncInvoker<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse> updateEmailTemplateInvoker(
        UpdateEmailTemplateRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateEmailTemplate, hcClient);
    }

    /**
     * 全量SQL开关
     *
     * 全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFullSqlSwitchRequest 请求对象
     * @return UpdateFullSqlSwitchResponse
     */
    public UpdateFullSqlSwitchResponse updateFullSqlSwitch(UpdateFullSqlSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateFullSqlSwitch);
    }

    /**
     * 全量SQL开关
     *
     * 全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFullSqlSwitchRequest 请求对象
     * @return SyncInvoker<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse>
     */
    public SyncInvoker<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse> updateFullSqlSwitchInvoker(
        UpdateFullSqlSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateFullSqlSwitch, hcClient);
    }

    /**
     * 更新实例诊断报告设置
     *
     * 更新实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthReportSettingsRequest 请求对象
     * @return UpdateHealthReportSettingsResponse
     */
    public UpdateHealthReportSettingsResponse updateHealthReportSettings(UpdateHealthReportSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateHealthReportSettings);
    }

    /**
     * 更新实例诊断报告设置
     *
     * 更新实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthReportSettingsRequest 请求对象
     * @return SyncInvoker<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse>
     */
    public SyncInvoker<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse> updateHealthReportSettingsInvoker(
        UpdateHealthReportSettingsRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateHealthReportSettings, hcClient);
    }

    /**
     * 修改实例组
     *
     * 修改实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return UpdateInstanceGroupResponse
     */
    public UpdateInstanceGroupResponse updateInstanceGroup(UpdateInstanceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateInstanceGroup);
    }

    /**
     * 修改实例组
     *
     * 修改实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return SyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse>
     */
    public SyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> updateInstanceGroupInvoker(
        UpdateInstanceGroupRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateInstanceGroup, hcClient);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return UpdateSqlLimitRulesResponse
     */
    public UpdateSqlLimitRulesResponse updateSqlLimitRules(UpdateSqlLimitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.updateSqlLimitRules);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return SyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse>
     */
    public SyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> updateSqlLimitRulesInvoker(
        UpdateSqlLimitRulesRequest request) {
        return new SyncInvoker<>(request, DasMeta.updateSqlLimitRules, hcClient);
    }

    /**
     * 查询死锁开关状态
     *
     * 查询死锁开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockSwitchNewRequest 请求对象
     * @return ShowDeadLockSwitchNewResponse
     */
    public ShowDeadLockSwitchNewResponse showDeadLockSwitchNew(ShowDeadLockSwitchNewRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.showDeadLockSwitchNew);
    }

    /**
     * 查询死锁开关状态
     *
     * 查询死锁开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockSwitchNewRequest 请求对象
     * @return SyncInvoker<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse>
     */
    public SyncInvoker<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse> showDeadLockSwitchNewInvoker(
        ShowDeadLockSwitchNewRequest request) {
        return new SyncInvoker<>(request, DasMeta.showDeadLockSwitchNew, hcClient);
    }

    /**
     * 开启/关闭全量SQL开关
     *
     * 开启/关闭全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFullsqlSwitchRequest 请求对象
     * @return SwitchFullsqlSwitchResponse
     */
    public SwitchFullsqlSwitchResponse switchFullsqlSwitch(SwitchFullsqlSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, DasMeta.switchFullsqlSwitch);
    }

    /**
     * 开启/关闭全量SQL开关
     *
     * 开启/关闭全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFullsqlSwitchRequest 请求对象
     * @return SyncInvoker<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse>
     */
    public SyncInvoker<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse> switchFullsqlSwitchInvoker(
        SwitchFullsqlSwitchRequest request) {
        return new SyncInvoker<>(request, DasMeta.switchFullsqlSwitch, hcClient);
    }

}

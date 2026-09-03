package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class DasAsyncClient {

    protected HcClient hcClient;

    public DasAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DasAsyncClient> newBuilder() {
        ClientBuilder<DasAsyncClient> clientBuilder = new ClientBuilder<>(DasAsyncClient::new);
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
     * @return CompletableFuture<CancelShareConnectionsResponse>
     */
    public CompletableFuture<CancelShareConnectionsResponse> cancelShareConnectionsAsync(
        CancelShareConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.cancelShareConnections);
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
     * @return AsyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse>
     */
    public AsyncInvoker<CancelShareConnectionsRequest, CancelShareConnectionsResponse> cancelShareConnectionsAsyncInvoker(
        CancelShareConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.cancelShareConnections, hcClient);
    }

    /**
     * 创建实例连接
     *
     * 创建实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceConnectionRequest 请求对象
     * @return CompletableFuture<CreateInstanceConnectionResponse>
     */
    public CompletableFuture<CreateInstanceConnectionResponse> createInstanceConnectionAsync(
        CreateInstanceConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createInstanceConnection);
    }

    /**
     * 创建实例连接
     *
     * 创建实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceConnectionRequest 请求对象
     * @return AsyncInvoker<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse>
     */
    public AsyncInvoker<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse> createInstanceConnectionAsyncInvoker(
        CreateInstanceConnectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createInstanceConnection, hcClient);
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
     * @return CompletableFuture<CreateShareConnectionsResponse>
     */
    public CompletableFuture<CreateShareConnectionsResponse> createShareConnectionsAsync(
        CreateShareConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createShareConnections);
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
     * @return AsyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse>
     */
    public AsyncInvoker<CreateShareConnectionsRequest, CreateShareConnectionsResponse> createShareConnectionsAsyncInvoker(
        CreateShareConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createShareConnections, hcClient);
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
     * @return CompletableFuture<ExecuteExportTaskResponse>
     */
    public CompletableFuture<ExecuteExportTaskResponse> executeExportTaskAsync(ExecuteExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeExportTask);
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
     * @return AsyncInvoker<ExecuteExportTaskRequest, ExecuteExportTaskResponse>
     */
    public AsyncInvoker<ExecuteExportTaskRequest, ExecuteExportTaskResponse> executeExportTaskAsyncInvoker(
        ExecuteExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeExportTask, hcClient);
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
     * @return CompletableFuture<ExecuteImportTaskResponse>
     */
    public CompletableFuture<ExecuteImportTaskResponse> executeImportTaskAsync(ExecuteImportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeImportTask);
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
     * @return AsyncInvoker<ExecuteImportTaskRequest, ExecuteImportTaskResponse>
     */
    public AsyncInvoker<ExecuteImportTaskRequest, ExecuteImportTaskResponse> executeImportTaskAsyncInvoker(
        ExecuteImportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeImportTask, hcClient);
    }

    /**
     * 查询实例连接列表
     *
     * 查询实例连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listConnections);
    }

    /**
     * 查询实例连接列表
     *
     * 查询实例连接列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listConnections, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listApiVersions, hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showApiVersion, hcClient);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTasksNewRequest 请求对象
     * @return CompletableFuture<AddTasksNewResponse>
     */
    public CompletableFuture<AddTasksNewResponse> addTasksNewAsync(AddTasksNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addTasksNew);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTasksNewRequest 请求对象
     * @return AsyncInvoker<AddTasksNewRequest, AddTasksNewResponse>
     */
    public AsyncInvoker<AddTasksNewRequest, AddTasksNewResponse> addTasksNewAsyncInvoker(AddTasksNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addTasksNew, hcClient);
    }

    /**
     * 批量创建全量SQL明细解析任务
     *
     * 批量创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddFullSqlTasksRequest 请求对象
     * @return CompletableFuture<BatchAddFullSqlTasksResponse>
     */
    public CompletableFuture<BatchAddFullSqlTasksResponse> batchAddFullSqlTasksAsync(
        BatchAddFullSqlTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchAddFullSqlTasks);
    }

    /**
     * 批量创建全量SQL明细解析任务
     *
     * 批量创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddFullSqlTasksRequest 请求对象
     * @return AsyncInvoker<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse>
     */
    public AsyncInvoker<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse> batchAddFullSqlTasksAsyncInvoker(
        BatchAddFullSqlTasksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchAddFullSqlTasks, hcClient);
    }

    /**
     * 批量设置SQL开关
     *
     * 批量设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSqlSwitchNewRequest 请求对象
     * @return CompletableFuture<BatchSetSqlSwitchNewResponse>
     */
    public CompletableFuture<BatchSetSqlSwitchNewResponse> batchSetSqlSwitchNewAsync(
        BatchSetSqlSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchSetSqlSwitchNew);
    }

    /**
     * 批量设置SQL开关
     *
     * 批量设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetSqlSwitchNewRequest 请求对象
     * @return AsyncInvoker<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse>
     */
    public AsyncInvoker<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse> batchSetSqlSwitchNewAsyncInvoker(
        BatchSetSqlSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchSetSqlSwitchNew, hcClient);
    }

    /**
     * Kill进程
     *
     * Kill进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelConnectionProcessRequest 请求对象
     * @return CompletableFuture<CancelConnectionProcessResponse>
     */
    public CompletableFuture<CancelConnectionProcessResponse> cancelConnectionProcessAsync(
        CancelConnectionProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.cancelConnectionProcess);
    }

    /**
     * Kill进程
     *
     * Kill进程
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelConnectionProcessRequest 请求对象
     * @return AsyncInvoker<CancelConnectionProcessRequest, CancelConnectionProcessResponse>
     */
    public AsyncInvoker<CancelConnectionProcessRequest, CancelConnectionProcessResponse> cancelConnectionProcessAsyncInvoker(
        CancelConnectionProcessRequest request) {
        return new AsyncInvoker<>(request, DasMeta.cancelConnectionProcess, hcClient);
    }

    /**
     * 修改配额
     *
     * 修改配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeQuotaNewRequest 请求对象
     * @return CompletableFuture<ChangeQuotaNewResponse>
     */
    public CompletableFuture<ChangeQuotaNewResponse> changeQuotaNewAsync(ChangeQuotaNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeQuotaNew);
    }

    /**
     * 修改配额
     *
     * 修改配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeQuotaNewRequest 请求对象
     * @return AsyncInvoker<ChangeQuotaNewRequest, ChangeQuotaNewResponse>
     */
    public AsyncInvoker<ChangeQuotaNewRequest, ChangeQuotaNewResponse> changeQuotaNewAsyncInvoker(
        ChangeQuotaNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeQuotaNew, hcClient);
    }

    /**
     * 检查是否有健康报告任务
     *
     * 检查是否有健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHealthReportTaskRequest 请求对象
     * @return CompletableFuture<CheckHealthReportTaskResponse>
     */
    public CompletableFuture<CheckHealthReportTaskResponse> checkHealthReportTaskAsync(
        CheckHealthReportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.checkHealthReportTask);
    }

    /**
     * 检查是否有健康报告任务
     *
     * 检查是否有健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckHealthReportTaskRequest 请求对象
     * @return AsyncInvoker<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse>
     */
    public AsyncInvoker<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse> checkHealthReportTaskAsyncInvoker(
        CheckHealthReportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.checkHealthReportTask, hcClient);
    }

    /**
     * 创建binlog解析任务
     *
     * 创建binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBinlogTaskRequest 请求对象
     * @return CompletableFuture<CreateBinlogTaskResponse>
     */
    public CompletableFuture<CreateBinlogTaskResponse> createBinlogTaskAsync(CreateBinlogTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createBinlogTask);
    }

    /**
     * 创建binlog解析任务
     *
     * 创建binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBinlogTaskRequest 请求对象
     * @return AsyncInvoker<CreateBinlogTaskRequest, CreateBinlogTaskResponse>
     */
    public AsyncInvoker<CreateBinlogTaskRequest, CreateBinlogTaskResponse> createBinlogTaskAsyncInvoker(
        CreateBinlogTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createBinlogTask, hcClient);
    }

    /**
     * DBS连接
     *
     * DBS连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbsConnectionRequest 请求对象
     * @return CompletableFuture<CreateDbsConnectionResponse>
     */
    public CompletableFuture<CreateDbsConnectionResponse> createDbsConnectionAsync(CreateDbsConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createDbsConnection);
    }

    /**
     * DBS连接
     *
     * DBS连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDbsConnectionRequest 请求对象
     * @return AsyncInvoker<CreateDbsConnectionRequest, CreateDbsConnectionResponse>
     */
    public AsyncInvoker<CreateDbsConnectionRequest, CreateDbsConnectionResponse> createDbsConnectionAsyncInvoker(
        CreateDbsConnectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createDbsConnection, hcClient);
    }

    /**
     * 创建全量SQL桶
     *
     * 创建全量SQL桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFullSqlBucketRequest 请求对象
     * @return CompletableFuture<CreateFullSqlBucketResponse>
     */
    public CompletableFuture<CreateFullSqlBucketResponse> createFullSqlBucketAsync(CreateFullSqlBucketRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createFullSqlBucket);
    }

    /**
     * 创建全量SQL桶
     *
     * 创建全量SQL桶
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFullSqlBucketRequest 请求对象
     * @return AsyncInvoker<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse>
     */
    public AsyncInvoker<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse> createFullSqlBucketAsyncInvoker(
        CreateFullSqlBucketRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createFullSqlBucket, hcClient);
    }

    /**
     * 创建索引使用导出任务
     *
     * 创建索引使用导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexUsageExportTaskNewRequest 请求对象
     * @return CompletableFuture<CreateIndexUsageExportTaskNewResponse>
     */
    public CompletableFuture<CreateIndexUsageExportTaskNewResponse> createIndexUsageExportTaskNewAsync(
        CreateIndexUsageExportTaskNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createIndexUsageExportTaskNew);
    }

    /**
     * 创建索引使用导出任务
     *
     * 创建索引使用导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateIndexUsageExportTaskNewRequest 请求对象
     * @return AsyncInvoker<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse>
     */
    public AsyncInvoker<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse> createIndexUsageExportTaskNewAsyncInvoker(
        CreateIndexUsageExportTaskNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createIndexUsageExportTaskNew, hcClient);
    }

    /**
     * 创建实例健康报告任务
     *
     * 创建实例健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceHealthReportTaskNewRequest 请求对象
     * @return CompletableFuture<CreateInstanceHealthReportTaskNewResponse>
     */
    public CompletableFuture<CreateInstanceHealthReportTaskNewResponse> createInstanceHealthReportTaskNewAsync(
        CreateInstanceHealthReportTaskNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createInstanceHealthReportTaskNew);
    }

    /**
     * 创建实例健康报告任务
     *
     * 创建实例健康报告任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceHealthReportTaskNewRequest 请求对象
     * @return AsyncInvoker<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse>
     */
    public AsyncInvoker<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse> createInstanceHealthReportTaskNewAsyncInvoker(
        CreateInstanceHealthReportTaskNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createInstanceHealthReportTaskNew, hcClient);
    }

    /**
     * 触发WDR
     *
     * 触发WDR
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrReportRequest 请求对象
     * @return CompletableFuture<CreateWdrReportResponse>
     */
    public CompletableFuture<CreateWdrReportResponse> createWdrReportAsync(CreateWdrReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createWdrReport);
    }

    /**
     * 触发WDR
     *
     * 触发WDR
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateWdrReportRequest 请求对象
     * @return AsyncInvoker<CreateWdrReportRequest, CreateWdrReportResponse>
     */
    public AsyncInvoker<CreateWdrReportRequest, CreateWdrReportResponse> createWdrReportAsyncInvoker(
        CreateWdrReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createWdrReport, hcClient);
    }

    /**
     * 删除binlog任务
     *
     * 删除binlog任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBinlogTaskRequest 请求对象
     * @return CompletableFuture<DeleteBinlogTaskResponse>
     */
    public CompletableFuture<DeleteBinlogTaskResponse> deleteBinlogTaskAsync(DeleteBinlogTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteBinlogTask);
    }

    /**
     * 删除binlog任务
     *
     * 删除binlog任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBinlogTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse>
     */
    public AsyncInvoker<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse> deleteBinlogTaskAsyncInvoker(
        DeleteBinlogTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteBinlogTask, hcClient);
    }

    /**
     * 删除数据库对象
     *
     * 删除数据库对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbObjNewRequest 请求对象
     * @return CompletableFuture<DeleteDbObjNewResponse>
     */
    public CompletableFuture<DeleteDbObjNewResponse> deleteDbObjNewAsync(DeleteDbObjNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteDbObjNew);
    }

    /**
     * 删除数据库对象
     *
     * 删除数据库对象
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDbObjNewRequest 请求对象
     * @return AsyncInvoker<DeleteDbObjNewRequest, DeleteDbObjNewResponse>
     */
    public AsyncInvoker<DeleteDbObjNewRequest, DeleteDbObjNewResponse> deleteDbObjNewAsyncInvoker(
        DeleteDbObjNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteDbObjNew, hcClient);
    }

    /**
     * 删除binlog导出任务
     *
     * 删除binlog导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTaskNewRequest 请求对象
     * @return CompletableFuture<DeleteExportTaskNewResponse>
     */
    public CompletableFuture<DeleteExportTaskNewResponse> deleteExportTaskNewAsync(DeleteExportTaskNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteExportTaskNew);
    }

    /**
     * 删除binlog导出任务
     *
     * 删除binlog导出任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteExportTaskNewRequest 请求对象
     * @return AsyncInvoker<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse>
     */
    public AsyncInvoker<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse> deleteExportTaskNewAsyncInvoker(
        DeleteExportTaskNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteExportTaskNew, hcClient);
    }

    /**
     * 删除全量SQL导出任务OBS文件
     *
     * 删除全量SQL导出任务OBS文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFullSqlExportTaskObsFileRequest 请求对象
     * @return CompletableFuture<DeleteFullSqlExportTaskObsFileResponse>
     */
    public CompletableFuture<DeleteFullSqlExportTaskObsFileResponse> deleteFullSqlExportTaskObsFileAsync(
        DeleteFullSqlExportTaskObsFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteFullSqlExportTaskObsFile);
    }

    /**
     * 删除全量SQL导出任务OBS文件
     *
     * 删除全量SQL导出任务OBS文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFullSqlExportTaskObsFileRequest 请求对象
     * @return AsyncInvoker<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse>
     */
    public AsyncInvoker<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse> deleteFullSqlExportTaskObsFileAsyncInvoker(
        DeleteFullSqlExportTaskObsFileRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteFullSqlExportTaskObsFile, hcClient);
    }

    /**
     * 开通配额
     *
     * 开通配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableQuotaRequest 请求对象
     * @return CompletableFuture<EnableQuotaResponse>
     */
    public CompletableFuture<EnableQuotaResponse> enableQuotaAsync(EnableQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.enableQuota);
    }

    /**
     * 开通配额
     *
     * 开通配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableQuotaRequest 请求对象
     * @return AsyncInvoker<EnableQuotaRequest, EnableQuotaResponse>
     */
    public AsyncInvoker<EnableQuotaRequest, EnableQuotaResponse> enableQuotaAsyncInvoker(EnableQuotaRequest request) {
        return new AsyncInvoker<>(request, DasMeta.enableQuota, hcClient);
    }

    /**
     * 格式化SQL
     *
     * 格式化SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteFormatSqlRequest 请求对象
     * @return CompletableFuture<ExecuteFormatSqlResponse>
     */
    public CompletableFuture<ExecuteFormatSqlResponse> executeFormatSqlAsync(ExecuteFormatSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeFormatSql);
    }

    /**
     * 格式化SQL
     *
     * 格式化SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteFormatSqlRequest 请求对象
     * @return AsyncInvoker<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse>
     */
    public AsyncInvoker<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse> executeFormatSqlAsyncInvoker(
        ExecuteFormatSqlRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeFormatSql, hcClient);
    }

    /**
     * 登录操作
     *
     * 登录操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLoginConnectionNewRequest 请求对象
     * @return CompletableFuture<ExecuteLoginConnectionNewResponse>
     */
    public CompletableFuture<ExecuteLoginConnectionNewResponse> executeLoginConnectionNewAsync(
        ExecuteLoginConnectionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeLoginConnectionNew);
    }

    /**
     * 登录操作
     *
     * 登录操作
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteLoginConnectionNewRequest 请求对象
     * @return AsyncInvoker<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse>
     */
    public AsyncInvoker<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse> executeLoginConnectionNewAsyncInvoker(
        ExecuteLoginConnectionNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeLoginConnectionNew, hcClient);
    }

    /**
     * 拆分SQL
     *
     * 拆分SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSplitSqlRequest 请求对象
     * @return CompletableFuture<ExecuteSplitSqlResponse>
     */
    public CompletableFuture<ExecuteSplitSqlResponse> executeSplitSqlAsync(ExecuteSplitSqlRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeSplitSql);
    }

    /**
     * 拆分SQL
     *
     * 拆分SQL
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteSplitSqlRequest 请求对象
     * @return AsyncInvoker<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse>
     */
    public AsyncInvoker<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse> executeSplitSqlAsyncInvoker(
        ExecuteSplitSqlRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeSplitSql, hcClient);
    }

    /**
     * 测试数据库实例连接
     *
     * 测试数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTestConnectionNewRequest 请求对象
     * @return CompletableFuture<ExecuteTestConnectionNewResponse>
     */
    public CompletableFuture<ExecuteTestConnectionNewResponse> executeTestConnectionNewAsync(
        ExecuteTestConnectionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeTestConnectionNew);
    }

    /**
     * 测试数据库实例连接
     *
     * 测试数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTestConnectionNewRequest 请求对象
     * @return AsyncInvoker<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse>
     */
    public AsyncInvoker<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse> executeTestConnectionNewAsyncInvoker(
        ExecuteTestConnectionNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeTestConnectionNew, hcClient);
    }

    /**
     * 执行调优
     *
     * 执行调优
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTuningRequest 请求对象
     * @return CompletableFuture<ExecuteTuningResponse>
     */
    public CompletableFuture<ExecuteTuningResponse> executeTuningAsync(ExecuteTuningRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.executeTuning);
    }

    /**
     * 执行调优
     *
     * 执行调优
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteTuningRequest 请求对象
     * @return AsyncInvoker<ExecuteTuningRequest, ExecuteTuningResponse>
     */
    public AsyncInvoker<ExecuteTuningRequest, ExecuteTuningResponse> executeTuningAsyncInvoker(
        ExecuteTuningRequest request) {
        return new AsyncInvoker<>(request, DasMeta.executeTuning, hcClient);
    }

    /**
     * 导出实例列表
     *
     * 导出实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstanceListNewRequest 请求对象
     * @return CompletableFuture<ExportInstanceListNewResponse>
     */
    public CompletableFuture<ExportInstanceListNewResponse> exportInstanceListNewAsync(
        ExportInstanceListNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportInstanceListNew);
    }

    /**
     * 导出实例列表
     *
     * 导出实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportInstanceListNewRequest 请求对象
     * @return AsyncInvoker<ExportInstanceListNewRequest, ExportInstanceListNewResponse>
     */
    public AsyncInvoker<ExportInstanceListNewRequest, ExportInstanceListNewResponse> exportInstanceListNewAsyncInvoker(
        ExportInstanceListNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportInstanceListNew, hcClient);
    }

    /**
     * 获取OBS对象列表
     *
     * 获取OBS对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExportObsObjectsRequest 请求对象
     * @return CompletableFuture<ImportExportObsObjectsResponse>
     */
    public CompletableFuture<ImportExportObsObjectsResponse> importExportObsObjectsAsync(
        ImportExportObsObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.importExportObsObjects);
    }

    /**
     * 获取OBS对象列表
     *
     * 获取OBS对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportExportObsObjectsRequest 请求对象
     * @return AsyncInvoker<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse>
     */
    public AsyncInvoker<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse> importExportObsObjectsAsyncInvoker(
        ImportExportObsObjectsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.importExportObsObjects, hcClient);
    }

    /**
     * 获取WDR数据
     *
     * 获取WDR数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeWdrReportRequest 请求对象
     * @return CompletableFuture<InvokeWdrReportResponse>
     */
    public CompletableFuture<InvokeWdrReportResponse> invokeWdrReportAsync(InvokeWdrReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.invokeWdrReport);
    }

    /**
     * 获取WDR数据
     *
     * 获取WDR数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeWdrReportRequest 请求对象
     * @return AsyncInvoker<InvokeWdrReportRequest, InvokeWdrReportResponse>
     */
    public AsyncInvoker<InvokeWdrReportRequest, InvokeWdrReportResponse> invokeWdrReportAsyncInvoker(
        InvokeWdrReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.invokeWdrReport, hcClient);
    }

    /**
     * 查询所有类型实例列表
     *
     * 查询所有类型实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTypeInstancesRequest 请求对象
     * @return CompletableFuture<ListAllTypeInstancesResponse>
     */
    public CompletableFuture<ListAllTypeInstancesResponse> listAllTypeInstancesAsync(
        ListAllTypeInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listAllTypeInstances);
    }

    /**
     * 查询所有类型实例列表
     *
     * 查询所有类型实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllTypeInstancesRequest 请求对象
     * @return AsyncInvoker<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse>
     */
    public AsyncInvoker<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse> listAllTypeInstancesAsyncInvoker(
        ListAllTypeInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listAllTypeInstances, hcClient);
    }

    /**
     * 导出binlog任务列表
     *
     * 导出binlog任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogExportsRequest 请求对象
     * @return CompletableFuture<ListBinlogExportsResponse>
     */
    public CompletableFuture<ListBinlogExportsResponse> listBinlogExportsAsync(ListBinlogExportsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listBinlogExports);
    }

    /**
     * 导出binlog任务列表
     *
     * 导出binlog任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogExportsRequest 请求对象
     * @return AsyncInvoker<ListBinlogExportsRequest, ListBinlogExportsResponse>
     */
    public AsyncInvoker<ListBinlogExportsRequest, ListBinlogExportsResponse> listBinlogExportsAsyncInvoker(
        ListBinlogExportsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listBinlogExports, hcClient);
    }

    /**
     * 查询binlog文件列表
     *
     * 查询binlog文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogFilesRequest 请求对象
     * @return CompletableFuture<ListBinlogFilesResponse>
     */
    public CompletableFuture<ListBinlogFilesResponse> listBinlogFilesAsync(ListBinlogFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listBinlogFiles);
    }

    /**
     * 查询binlog文件列表
     *
     * 查询binlog文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBinlogFilesRequest 请求对象
     * @return AsyncInvoker<ListBinlogFilesRequest, ListBinlogFilesResponse>
     */
    public AsyncInvoker<ListBinlogFilesRequest, ListBinlogFilesResponse> listBinlogFilesAsyncInvoker(
        ListBinlogFilesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listBinlogFiles, hcClient);
    }

    /**
     * 查询实例会话
     *
     * 查询实例会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionProcessesRequest 请求对象
     * @return CompletableFuture<ListConnectionProcessesResponse>
     */
    public CompletableFuture<ListConnectionProcessesResponse> listConnectionProcessesAsync(
        ListConnectionProcessesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listConnectionProcesses);
    }

    /**
     * 查询实例会话
     *
     * 查询实例会话
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionProcessesRequest 请求对象
     * @return AsyncInvoker<ListConnectionProcessesRequest, ListConnectionProcessesResponse>
     */
    public AsyncInvoker<ListConnectionProcessesRequest, ListConnectionProcessesResponse> listConnectionProcessesAsyncInvoker(
        ListConnectionProcessesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listConnectionProcesses, hcClient);
    }

    /**
     * 查询数据库对象列表
     *
     * 查询数据库对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseObjectsRequest 请求对象
     * @return CompletableFuture<ListDatabaseObjectsResponse>
     */
    public CompletableFuture<ListDatabaseObjectsResponse> listDatabaseObjectsAsync(ListDatabaseObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDatabaseObjects);
    }

    /**
     * 查询数据库对象列表
     *
     * 查询数据库对象列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDatabaseObjectsRequest 请求对象
     * @return AsyncInvoker<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse>
     */
    public AsyncInvoker<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> listDatabaseObjectsAsyncInvoker(
        ListDatabaseObjectsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listDatabaseObjects, hcClient);
    }

    /**
     * 获取死锁数据库列表
     *
     * 获取死锁数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDatabasesRequest 请求对象
     * @return CompletableFuture<ListDeadLockDatabasesResponse>
     */
    public CompletableFuture<ListDeadLockDatabasesResponse> listDeadLockDatabasesAsync(
        ListDeadLockDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDeadLockDatabases);
    }

    /**
     * 获取死锁数据库列表
     *
     * 获取死锁数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse>
     */
    public AsyncInvoker<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse> listDeadLockDatabasesAsyncInvoker(
        ListDeadLockDatabasesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listDeadLockDatabases, hcClient);
    }

    /**
     * 获取死锁详情列表
     *
     * 获取死锁详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDetailRequest 请求对象
     * @return CompletableFuture<ListDeadLockDetailResponse>
     */
    public CompletableFuture<ListDeadLockDetailResponse> listDeadLockDetailAsync(ListDeadLockDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDeadLockDetail);
    }

    /**
     * 获取死锁详情列表
     *
     * 获取死锁详情列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeadLockDetailRequest 请求对象
     * @return AsyncInvoker<ListDeadLockDetailRequest, ListDeadLockDetailResponse>
     */
    public AsyncInvoker<ListDeadLockDetailRequest, ListDeadLockDetailResponse> listDeadLockDetailAsyncInvoker(
        ListDeadLockDetailRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listDeadLockDetail, hcClient);
    }

    /**
     * 获取完整死锁列表
     *
     * 获取完整死锁列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullDeadLocksRequest 请求对象
     * @return CompletableFuture<ListFullDeadLocksResponse>
     */
    public CompletableFuture<ListFullDeadLocksResponse> listFullDeadLocksAsync(ListFullDeadLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listFullDeadLocks);
    }

    /**
     * 获取完整死锁列表
     *
     * 获取完整死锁列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullDeadLocksRequest 请求对象
     * @return AsyncInvoker<ListFullDeadLocksRequest, ListFullDeadLocksResponse>
     */
    public AsyncInvoker<ListFullDeadLocksRequest, ListFullDeadLocksResponse> listFullDeadLocksAsyncInvoker(
        ListFullDeadLocksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listFullDeadLocks, hcClient);
    }

    /**
     * 获取全量SQL导出任务列表
     *
     * 获取全量SQL导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlExportTasksRequest 请求对象
     * @return CompletableFuture<ListFullSqlExportTasksResponse>
     */
    public CompletableFuture<ListFullSqlExportTasksResponse> listFullSqlExportTasksAsync(
        ListFullSqlExportTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listFullSqlExportTasks);
    }

    /**
     * 获取全量SQL导出任务列表
     *
     * 获取全量SQL导出任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlExportTasksRequest 请求对象
     * @return AsyncInvoker<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse>
     */
    public AsyncInvoker<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse> listFullSqlExportTasksAsyncInvoker(
        ListFullSqlExportTasksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listFullSqlExportTasks, hcClient);
    }

    /**
     * 获取实例健康报告任务列表
     *
     * 获取实例健康报告任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceHealthReportTasksRequest 请求对象
     * @return CompletableFuture<ListInstanceHealthReportTasksResponse>
     */
    public CompletableFuture<ListInstanceHealthReportTasksResponse> listInstanceHealthReportTasksAsync(
        ListInstanceHealthReportTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceHealthReportTasks);
    }

    /**
     * 获取实例健康报告任务列表
     *
     * 获取实例健康报告任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceHealthReportTasksRequest 请求对象
     * @return AsyncInvoker<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse>
     */
    public AsyncInvoker<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse> listInstanceHealthReportTasksAsyncInvoker(
        ListInstanceHealthReportTasksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceHealthReportTasks, hcClient);
    }

    /**
     * 获取未设置付费的实例列表
     *
     * 获取未设置付费的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotSetChargeModeInstanceRequest 请求对象
     * @return CompletableFuture<ListNotSetChargeModeInstanceResponse>
     */
    public CompletableFuture<ListNotSetChargeModeInstanceResponse> listNotSetChargeModeInstanceAsync(
        ListNotSetChargeModeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listNotSetChargeModeInstance);
    }

    /**
     * 获取未设置付费的实例列表
     *
     * 获取未设置付费的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotSetChargeModeInstanceRequest 请求对象
     * @return AsyncInvoker<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse>
     */
    public AsyncInvoker<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse> listNotSetChargeModeInstanceAsyncInvoker(
        ListNotSetChargeModeInstanceRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listNotSetChargeModeInstance, hcClient);
    }

    /**
     * 获取schema名称列表
     *
     * 获取schema名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaNamesRequest 请求对象
     * @return CompletableFuture<ListSchemaNamesResponse>
     */
    public CompletableFuture<ListSchemaNamesResponse> listSchemaNamesAsync(ListSchemaNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSchemaNames);
    }

    /**
     * 获取schema名称列表
     *
     * 获取schema名称列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSchemaNamesRequest 请求对象
     * @return AsyncInvoker<ListSchemaNamesRequest, ListSchemaNamesResponse>
     */
    public AsyncInvoker<ListSchemaNamesRequest, ListSchemaNamesResponse> listSchemaNamesAsyncInvoker(
        ListSchemaNamesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSchemaNames, hcClient);
    }

    /**
     * 查询共享列表
     *
     * 查询共享列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedConnectionsRequest 请求对象
     * @return CompletableFuture<ListSharedConnectionsResponse>
     */
    public CompletableFuture<ListSharedConnectionsResponse> listSharedConnectionsAsync(
        ListSharedConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSharedConnections);
    }

    /**
     * 查询共享列表
     *
     * 查询共享列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSharedConnectionsRequest 请求对象
     * @return AsyncInvoker<ListSharedConnectionsRequest, ListSharedConnectionsResponse>
     */
    public AsyncInvoker<ListSharedConnectionsRequest, ListSharedConnectionsResponse> listSharedConnectionsAsyncInvoker(
        ListSharedConnectionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSharedConnections, hcClient);
    }

    /**
     * 获取SMN主题列表
     *
     * 获取SMN主题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return CompletableFuture<ListSmnTopicsResponse>
     */
    public CompletableFuture<ListSmnTopicsResponse> listSmnTopicsAsync(ListSmnTopicsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSmnTopics);
    }

    /**
     * 获取SMN主题列表
     *
     * 获取SMN主题列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSmnTopicsRequest 请求对象
     * @return AsyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse>
     */
    public AsyncInvoker<ListSmnTopicsRequest, ListSmnTopicsResponse> listSmnTopicsAsyncInvoker(
        ListSmnTopicsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSmnTopics, hcClient);
    }

    /**
     * 查询快照
     *
     * 查询快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshots4ApiRequest 请求对象
     * @return CompletableFuture<ListSnapshots4ApiResponse>
     */
    public CompletableFuture<ListSnapshots4ApiResponse> listSnapshots4ApiAsync(ListSnapshots4ApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSnapshots4Api);
    }

    /**
     * 查询快照
     *
     * 查询快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshots4ApiRequest 请求对象
     * @return AsyncInvoker<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse>
     */
    public AsyncInvoker<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse> listSnapshots4ApiAsyncInvoker(
        ListSnapshots4ApiRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSnapshots4Api, hcClient);
    }

    /**
     * 获取用户实例
     *
     * 获取用户实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitUserInstanceRequest 请求对象
     * @return CompletableFuture<ListSqlLimitUserInstanceResponse>
     */
    public CompletableFuture<ListSqlLimitUserInstanceResponse> listSqlLimitUserInstanceAsync(
        ListSqlLimitUserInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSqlLimitUserInstance);
    }

    /**
     * 获取用户实例
     *
     * 获取用户实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitUserInstanceRequest 请求对象
     * @return AsyncInvoker<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse>
     */
    public AsyncInvoker<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse> listSqlLimitUserInstanceAsyncInvoker(
        ListSqlLimitUserInstanceRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSqlLimitUserInstance, hcClient);
    }

    /**
     * 查询SQL模板对比列表
     *
     * 查询SQL模板对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateComparisonsRequest 请求对象
     * @return CompletableFuture<ListSqlTemplateComparisonsResponse>
     */
    public CompletableFuture<ListSqlTemplateComparisonsResponse> listSqlTemplateComparisonsAsync(
        ListSqlTemplateComparisonsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSqlTemplateComparisons);
    }

    /**
     * 查询SQL模板对比列表
     *
     * 查询SQL模板对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateComparisonsRequest 请求对象
     * @return AsyncInvoker<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse>
     */
    public AsyncInvoker<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse> listSqlTemplateComparisonsAsyncInvoker(
        ListSqlTemplateComparisonsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSqlTemplateComparisons, hcClient);
    }

    /**
     * 查询SQL模板数据库列表
     *
     * 查询SQL模板数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateDatabasesRequest 请求对象
     * @return CompletableFuture<ListSqlTemplateDatabasesResponse>
     */
    public CompletableFuture<ListSqlTemplateDatabasesResponse> listSqlTemplateDatabasesAsync(
        ListSqlTemplateDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSqlTemplateDatabases);
    }

    /**
     * 查询SQL模板数据库列表
     *
     * 查询SQL模板数据库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplateDatabasesRequest 请求对象
     * @return AsyncInvoker<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse>
     */
    public AsyncInvoker<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse> listSqlTemplateDatabasesAsyncInvoker(
        ListSqlTemplateDatabasesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSqlTemplateDatabases, hcClient);
    }

    /**
     * 查询SQL模板列表
     *
     * 查询SQL模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplatesRequest 请求对象
     * @return CompletableFuture<ListSqlTemplatesResponse>
     */
    public CompletableFuture<ListSqlTemplatesResponse> listSqlTemplatesAsync(ListSqlTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSqlTemplates);
    }

    /**
     * 查询SQL模板列表
     *
     * 查询SQL模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlTemplatesRequest 请求对象
     * @return AsyncInvoker<ListSqlTemplatesRequest, ListSqlTemplatesResponse>
     */
    public AsyncInvoker<ListSqlTemplatesRequest, ListSqlTemplatesResponse> listSqlTemplatesAsyncInvoker(
        ListSqlTemplatesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSqlTemplates, hcClient);
    }

    /**
     * 按批次ID查询全量SQL任务
     *
     * 按批次ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByBatchIdRequest 请求对象
     * @return CompletableFuture<ListTasksByBatchIdResponse>
     */
    public CompletableFuture<ListTasksByBatchIdResponse> listTasksByBatchIdAsync(ListTasksByBatchIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTasksByBatchId);
    }

    /**
     * 按批次ID查询全量SQL任务
     *
     * 按批次ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByBatchIdRequest 请求对象
     * @return AsyncInvoker<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse>
     */
    public AsyncInvoker<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse> listTasksByBatchIdAsyncInvoker(
        ListTasksByBatchIdRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTasksByBatchId, hcClient);
    }

    /**
     * 按SQL模板ID查询全量SQL任务
     *
     * 按SQL模板ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksBySqlTemplateIdRequest 请求对象
     * @return CompletableFuture<ListTasksBySqlTemplateIdResponse>
     */
    public CompletableFuture<ListTasksBySqlTemplateIdResponse> listTasksBySqlTemplateIdAsync(
        ListTasksBySqlTemplateIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTasksBySqlTemplateId);
    }

    /**
     * 按SQL模板ID查询全量SQL任务
     *
     * 按SQL模板ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksBySqlTemplateIdRequest 请求对象
     * @return AsyncInvoker<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse>
     */
    public AsyncInvoker<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse> listTasksBySqlTemplateIdAsyncInvoker(
        ListTasksBySqlTemplateIdRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTasksBySqlTemplateId, hcClient);
    }

    /**
     * 按任务ID查询全量SQL任务
     *
     * 按任务ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByTaskIdRequest 请求对象
     * @return CompletableFuture<ListTasksByTaskIdResponse>
     */
    public CompletableFuture<ListTasksByTaskIdResponse> listTasksByTaskIdAsync(ListTasksByTaskIdRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTasksByTaskId);
    }

    /**
     * 按任务ID查询全量SQL任务
     *
     * 按任务ID查询全量SQL任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTasksByTaskIdRequest 请求对象
     * @return AsyncInvoker<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse>
     */
    public AsyncInvoker<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse> listTasksByTaskIdAsyncInvoker(
        ListTasksByTaskIdRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTasksByTaskId, hcClient);
    }

    /**
     * 查询模板数据库对比列表
     *
     * 查询模板数据库对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateDatabaseComparisonsRequest 请求对象
     * @return CompletableFuture<ListTemplateDatabaseComparisonsResponse>
     */
    public CompletableFuture<ListTemplateDatabaseComparisonsResponse> listTemplateDatabaseComparisonsAsync(
        ListTemplateDatabaseComparisonsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTemplateDatabaseComparisons);
    }

    /**
     * 查询模板数据库对比列表
     *
     * 查询模板数据库对比列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTemplateDatabaseComparisonsRequest 请求对象
     * @return AsyncInvoker<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse>
     */
    public AsyncInvoker<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse> listTemplateDatabaseComparisonsAsyncInvoker(
        ListTemplateDatabaseComparisonsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTemplateDatabaseComparisons, hcClient);
    }

    /**
     * 获取用户实例列表
     *
     * 获取用户实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserInstanceListRequest 请求对象
     * @return CompletableFuture<ListUserInstanceListResponse>
     */
    public CompletableFuture<ListUserInstanceListResponse> listUserInstanceListAsync(
        ListUserInstanceListRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listUserInstanceList);
    }

    /**
     * 获取用户实例列表
     *
     * 获取用户实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserInstanceListRequest 请求对象
     * @return AsyncInvoker<ListUserInstanceListRequest, ListUserInstanceListResponse>
     */
    public AsyncInvoker<ListUserInstanceListRequest, ListUserInstanceListResponse> listUserInstanceListAsyncInvoker(
        ListUserInstanceListRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listUserInstanceList, hcClient);
    }

    /**
     * 重试binlog解析任务
     *
     * 重试binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBinlogTaskRequest 请求对象
     * @return CompletableFuture<RetryBinlogTaskResponse>
     */
    public CompletableFuture<RetryBinlogTaskResponse> retryBinlogTaskAsync(RetryBinlogTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.retryBinlogTask);
    }

    /**
     * 重试binlog解析任务
     *
     * 重试binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RetryBinlogTaskRequest 请求对象
     * @return AsyncInvoker<RetryBinlogTaskRequest, RetryBinlogTaskResponse>
     */
    public AsyncInvoker<RetryBinlogTaskRequest, RetryBinlogTaskResponse> retryBinlogTaskAsyncInvoker(
        RetryBinlogTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.retryBinlogTask, hcClient);
    }

    /**
     * 查看binlog解析详情
     *
     * 查看binlog解析详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBinlogParseRequest 请求对象
     * @return CompletableFuture<SearchBinlogParseResponse>
     */
    public CompletableFuture<SearchBinlogParseResponse> searchBinlogParseAsync(SearchBinlogParseRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.searchBinlogParse);
    }

    /**
     * 查看binlog解析详情
     *
     * 查看binlog解析详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchBinlogParseRequest 请求对象
     * @return AsyncInvoker<SearchBinlogParseRequest, SearchBinlogParseResponse>
     */
    public AsyncInvoker<SearchBinlogParseRequest, SearchBinlogParseResponse> searchBinlogParseAsyncInvoker(
        SearchBinlogParseRequest request) {
        return new AsyncInvoker<>(request, DasMeta.searchBinlogParse, hcClient);
    }

    /**
     * 查看binlog解析错误信息
     *
     * 查看binlog解析错误信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfo4ApiRequest 请求对象
     * @return CompletableFuture<SearchErrorInfo4ApiResponse>
     */
    public CompletableFuture<SearchErrorInfo4ApiResponse> searchErrorInfo4ApiAsync(SearchErrorInfo4ApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.searchErrorInfo4Api);
    }

    /**
     * 查看binlog解析错误信息
     *
     * 查看binlog解析错误信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfo4ApiRequest 请求对象
     * @return AsyncInvoker<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse>
     */
    public AsyncInvoker<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse> searchErrorInfo4ApiAsyncInvoker(
        SearchErrorInfo4ApiRequest request) {
        return new AsyncInvoker<>(request, DasMeta.searchErrorInfo4Api, hcClient);
    }

    /**
     * 查看binlog解析错误信息条件
     *
     * 查看binlog解析错误信息条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfoSource4ApiRequest 请求对象
     * @return CompletableFuture<SearchErrorInfoSource4ApiResponse>
     */
    public CompletableFuture<SearchErrorInfoSource4ApiResponse> searchErrorInfoSource4ApiAsync(
        SearchErrorInfoSource4ApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.searchErrorInfoSource4Api);
    }

    /**
     * 查看binlog解析错误信息条件
     *
     * 查看binlog解析错误信息条件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchErrorInfoSource4ApiRequest 请求对象
     * @return AsyncInvoker<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse>
     */
    public AsyncInvoker<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse> searchErrorInfoSource4ApiAsyncInvoker(
        SearchErrorInfoSource4ApiRequest request) {
        return new AsyncInvoker<>(request, DasMeta.searchErrorInfoSource4Api, hcClient);
    }

    /**
     * 全量SQL搜索
     *
     * 全量SQL搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchNewRequest 请求对象
     * @return CompletableFuture<SearchNewResponse>
     */
    public CompletableFuture<SearchNewResponse> searchNewAsync(SearchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.searchNew);
    }

    /**
     * 全量SQL搜索
     *
     * 全量SQL搜索
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SearchNewRequest 请求对象
     * @return AsyncInvoker<SearchNewRequest, SearchNewResponse>
     */
    public AsyncInvoker<SearchNewRequest, SearchNewResponse> searchNewAsyncInvoker(SearchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.searchNew, hcClient);
    }

    /**
     * 设置SQL开关
     *
     * 设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlSwitchNewRequest 请求对象
     * @return CompletableFuture<SetSqlSwitchNewResponse>
     */
    public CompletableFuture<SetSqlSwitchNewResponse> setSqlSwitchNewAsync(SetSqlSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.setSqlSwitchNew);
    }

    /**
     * 设置SQL开关
     *
     * 设置SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetSqlSwitchNewRequest 请求对象
     * @return AsyncInvoker<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse>
     */
    public AsyncInvoker<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse> setSqlSwitchNewAsyncInvoker(
        SetSqlSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.setSqlSwitchNew, hcClient);
    }

    /**
     * 查询binlog导出任务信息
     *
     * 查询binlog导出任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogExportTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowBinlogExportTaskInfoResponse>
     */
    public CompletableFuture<ShowBinlogExportTaskInfoResponse> showBinlogExportTaskInfoAsync(
        ShowBinlogExportTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showBinlogExportTaskInfo);
    }

    /**
     * 查询binlog导出任务信息
     *
     * 查询binlog导出任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogExportTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse>
     */
    public AsyncInvoker<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse> showBinlogExportTaskInfoAsyncInvoker(
        ShowBinlogExportTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showBinlogExportTaskInfo, hcClient);
    }

    /**
     * 查看binlog概览
     *
     * 查看binlog概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogParseRequest 请求对象
     * @return CompletableFuture<ShowBinlogParseResponse>
     */
    public CompletableFuture<ShowBinlogParseResponse> showBinlogParseAsync(ShowBinlogParseRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showBinlogParse);
    }

    /**
     * 查看binlog概览
     *
     * 查看binlog概览
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogParseRequest 请求对象
     * @return AsyncInvoker<ShowBinlogParseRequest, ShowBinlogParseResponse>
     */
    public AsyncInvoker<ShowBinlogParseRequest, ShowBinlogParseResponse> showBinlogParseAsyncInvoker(
        ShowBinlogParseRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showBinlogParse, hcClient);
    }

    /**
     * 查看binlog解析任务详情
     *
     * 查看binlog解析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowBinlogTaskInfoResponse>
     */
    public CompletableFuture<ShowBinlogTaskInfoResponse> showBinlogTaskInfoAsync(ShowBinlogTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showBinlogTaskInfo);
    }

    /**
     * 查看binlog解析任务详情
     *
     * 查看binlog解析任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBinlogTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse>
     */
    public AsyncInvoker<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse> showBinlogTaskInfoAsyncInvoker(
        ShowBinlogTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showBinlogTaskInfo, hcClient);
    }

    /**
     * DDS连接统计
     *
     * DDS连接统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdsConnectionStatRequest 请求对象
     * @return CompletableFuture<ShowDdsConnectionStatResponse>
     */
    public CompletableFuture<ShowDdsConnectionStatResponse> showDdsConnectionStatAsync(
        ShowDdsConnectionStatRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDdsConnectionStat);
    }

    /**
     * DDS连接统计
     *
     * DDS连接统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDdsConnectionStatRequest 请求对象
     * @return AsyncInvoker<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse>
     */
    public AsyncInvoker<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse> showDdsConnectionStatAsyncInvoker(
        ShowDdsConnectionStatRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDdsConnectionStat, hcClient);
    }

    /**
     * 获取死锁原始数据
     *
     * 获取死锁原始数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockOriginDataRequest 请求对象
     * @return CompletableFuture<ShowDeadLockOriginDataResponse>
     */
    public CompletableFuture<ShowDeadLockOriginDataResponse> showDeadLockOriginDataAsync(
        ShowDeadLockOriginDataRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockOriginData);
    }

    /**
     * 获取死锁原始数据
     *
     * 获取死锁原始数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockOriginDataRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse>
     */
    public AsyncInvoker<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse> showDeadLockOriginDataAsyncInvoker(
        ShowDeadLockOriginDataRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockOriginData, hcClient);
    }

    /**
     * 获取死锁关系
     *
     * 获取死锁关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockRelationshipRequest 请求对象
     * @return CompletableFuture<ShowDeadLockRelationshipResponse>
     */
    public CompletableFuture<ShowDeadLockRelationshipResponse> showDeadLockRelationshipAsync(
        ShowDeadLockRelationshipRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockRelationship);
    }

    /**
     * 获取死锁关系
     *
     * 获取死锁关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockRelationshipRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse>
     */
    public AsyncInvoker<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse> showDeadLockRelationshipAsyncInvoker(
        ShowDeadLockRelationshipRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockRelationship, hcClient);
    }

    /**
     * 获取死锁统计
     *
     * 获取死锁统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockStatisticsRequest 请求对象
     * @return CompletableFuture<ShowDeadLockStatisticsResponse>
     */
    public CompletableFuture<ShowDeadLockStatisticsResponse> showDeadLockStatisticsAsync(
        ShowDeadLockStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockStatistics);
    }

    /**
     * 获取死锁统计
     *
     * 获取死锁统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse>
     */
    public AsyncInvoker<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse> showDeadLockStatisticsAsyncInvoker(
        ShowDeadLockStatisticsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockStatistics, hcClient);
    }

    /**
     * 获取死锁趋势
     *
     * 获取死锁趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTrendRequest 请求对象
     * @return CompletableFuture<ShowDeadLockTrendResponse>
     */
    public CompletableFuture<ShowDeadLockTrendResponse> showDeadLockTrendAsync(ShowDeadLockTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockTrend);
    }

    /**
     * 获取死锁趋势
     *
     * 获取死锁趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTrendRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse>
     */
    public AsyncInvoker<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse> showDeadLockTrendAsyncInvoker(
        ShowDeadLockTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockTrend, hcClient);
    }

    /**
     * 查询SQL执行结果
     *
     * 查询SQL执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyRequest 请求对象
     * @return CompletableFuture<ShowExecuteResultWithoutKeyResponse>
     */
    public CompletableFuture<ShowExecuteResultWithoutKeyResponse> showExecuteResultWithoutKeyAsync(
        ShowExecuteResultWithoutKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showExecuteResultWithoutKey);
    }

    /**
     * 查询SQL执行结果
     *
     * 查询SQL执行结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyRequest 请求对象
     * @return AsyncInvoker<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse>
     */
    public AsyncInvoker<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse> showExecuteResultWithoutKeyAsyncInvoker(
        ShowExecuteResultWithoutKeyRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showExecuteResultWithoutKey, hcClient);
    }

    /**
     * 查询SQL执行结果（POST）
     *
     * 查询SQL执行结果（POST）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyNoRetryRequest 请求对象
     * @return CompletableFuture<ShowExecuteResultWithoutKeyNoRetryResponse>
     */
    public CompletableFuture<ShowExecuteResultWithoutKeyNoRetryResponse> showExecuteResultWithoutKeyNoRetryAsync(
        ShowExecuteResultWithoutKeyNoRetryRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showExecuteResultWithoutKeyNoRetry);
    }

    /**
     * 查询SQL执行结果（POST）
     *
     * 查询SQL执行结果（POST）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecuteResultWithoutKeyNoRetryRequest 请求对象
     * @return AsyncInvoker<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse>
     */
    public AsyncInvoker<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse> showExecuteResultWithoutKeyNoRetryAsyncInvoker(
        ShowExecuteResultWithoutKeyNoRetryRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showExecuteResultWithoutKeyNoRetry, hcClient);
    }

    /**
     * 获取执行计划
     *
     * 获取执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionPlanRequest 请求对象
     * @return CompletableFuture<ShowExecutionPlanResponse>
     */
    public CompletableFuture<ShowExecutionPlanResponse> showExecutionPlanAsync(ShowExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showExecutionPlan);
    }

    /**
     * 获取执行计划
     *
     * 获取执行计划
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionPlanRequest 请求对象
     * @return AsyncInvoker<ShowExecutionPlanRequest, ShowExecutionPlanResponse>
     */
    public AsyncInvoker<ShowExecutionPlanRequest, ShowExecutionPlanResponse> showExecutionPlanAsyncInvoker(
        ShowExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showExecutionPlan, hcClient);
    }

    /**
     * 查询执行时间模板趋势
     *
     * 查询执行时间模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionTimeTemplateTrendRequest 请求对象
     * @return CompletableFuture<ShowExecutionTimeTemplateTrendResponse>
     */
    public CompletableFuture<ShowExecutionTimeTemplateTrendResponse> showExecutionTimeTemplateTrendAsync(
        ShowExecutionTimeTemplateTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showExecutionTimeTemplateTrend);
    }

    /**
     * 查询执行时间模板趋势
     *
     * 查询执行时间模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExecutionTimeTemplateTrendRequest 请求对象
     * @return AsyncInvoker<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse>
     */
    public AsyncInvoker<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse> showExecutionTimeTemplateTrendAsyncInvoker(
        ShowExecutionTimeTemplateTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showExecutionTimeTemplateTrend, hcClient);
    }

    /**
     * 是否展示fragment任务
     *
     * 是否展示fragment任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFragmentSwitchRequest 请求对象
     * @return CompletableFuture<ShowFragmentSwitchResponse>
     */
    public CompletableFuture<ShowFragmentSwitchResponse> showFragmentSwitchAsync(ShowFragmentSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showFragmentSwitch);
    }

    /**
     * 是否展示fragment任务
     *
     * 是否展示fragment任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFragmentSwitchRequest 请求对象
     * @return AsyncInvoker<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse>
     */
    public AsyncInvoker<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse> showFragmentSwitchAsyncInvoker(
        ShowFragmentSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showFragmentSwitch, hcClient);
    }

    /**
     * 获取实例健康报告
     *
     * 获取实例健康报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReport4ApiRequest 请求对象
     * @return CompletableFuture<ShowInstanceHealthReport4ApiResponse>
     */
    public CompletableFuture<ShowInstanceHealthReport4ApiResponse> showInstanceHealthReport4ApiAsync(
        ShowInstanceHealthReport4ApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceHealthReport4Api);
    }

    /**
     * 获取实例健康报告
     *
     * 获取实例健康报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReport4ApiRequest 请求对象
     * @return AsyncInvoker<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse>
     */
    public AsyncInvoker<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse> showInstanceHealthReport4ApiAsyncInvoker(
        ShowInstanceHealthReport4ApiRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceHealthReport4Api, hcClient);
    }

    /**
     * 获取实例信息
     *
     * 获取实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceInfoResponse>
     */
    public CompletableFuture<ShowInstanceInfoResponse> showInstanceInfoAsync(ShowInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceInfo);
    }

    /**
     * 获取实例信息
     *
     * 获取实例信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceInfoRequest, ShowInstanceInfoResponse>
     */
    public AsyncInvoker<ShowInstanceInfoRequest, ShowInstanceInfoResponse> showInstanceInfoAsyncInvoker(
        ShowInstanceInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceInfo, hcClient);
    }

    /**
     * 查看实例日志存储使用量
     *
     * 查看实例日志存储使用量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogUsageRequest 请求对象
     * @return CompletableFuture<ShowInstanceLogUsageResponse>
     */
    public CompletableFuture<ShowInstanceLogUsageResponse> showInstanceLogUsageAsync(
        ShowInstanceLogUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceLogUsage);
    }

    /**
     * 查看实例日志存储使用量
     *
     * 查看实例日志存储使用量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceLogUsageRequest 请求对象
     * @return AsyncInvoker<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse>
     */
    public AsyncInvoker<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse> showInstanceLogUsageAsyncInvoker(
        ShowInstanceLogUsageRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceLogUsage, hcClient);
    }

    /**
     * 查询实例指标
     *
     * 查询实例指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricRequest 请求对象
     * @return CompletableFuture<ShowInstanceMetricResponse>
     */
    public CompletableFuture<ShowInstanceMetricResponse> showInstanceMetricAsync(ShowInstanceMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceMetric);
    }

    /**
     * 查询实例指标
     *
     * 查询实例指标
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceMetricRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMetricRequest, ShowInstanceMetricResponse>
     */
    public AsyncInvoker<ShowInstanceMetricRequest, ShowInstanceMetricResponse> showInstanceMetricAsyncInvoker(
        ShowInstanceMetricRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceMetric, hcClient);
    }

    /**
     * 获取实例节点信息
     *
     * 获取实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesInfoRequest 请求对象
     * @return CompletableFuture<ShowInstanceNodesInfoResponse>
     */
    public CompletableFuture<ShowInstanceNodesInfoResponse> showInstanceNodesInfoAsync(
        ShowInstanceNodesInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceNodesInfo);
    }

    /**
     * 获取实例节点信息
     *
     * 获取实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceNodesInfoRequest 请求对象
     * @return AsyncInvoker<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse>
     */
    public AsyncInvoker<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse> showInstanceNodesInfoAsyncInvoker(
        ShowInstanceNodesInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceNodesInfo, hcClient);
    }

    /**
     * 是否签署数据安全协议
     *
     * 是否签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsSignedProtocolRequest 请求对象
     * @return CompletableFuture<ShowIsSignedProtocolResponse>
     */
    public CompletableFuture<ShowIsSignedProtocolResponse> showIsSignedProtocolAsync(
        ShowIsSignedProtocolRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showIsSignedProtocol);
    }

    /**
     * 是否签署数据安全协议
     *
     * 是否签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIsSignedProtocolRequest 请求对象
     * @return AsyncInvoker<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse>
     */
    public AsyncInvoker<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse> showIsSignedProtocolAsyncInvoker(
        ShowIsSignedProtocolRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showIsSignedProtocol, hcClient);
    }

    /**
     * 查询Kill进程任务
     *
     * 查询Kill进程任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskRequest 请求对象
     * @return CompletableFuture<ShowKillProcessTaskResponse>
     */
    public CompletableFuture<ShowKillProcessTaskResponse> showKillProcessTaskAsync(ShowKillProcessTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showKillProcessTask);
    }

    /**
     * 查询Kill进程任务
     *
     * 查询Kill进程任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskRequest 请求对象
     * @return AsyncInvoker<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse>
     */
    public AsyncInvoker<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse> showKillProcessTaskAsyncInvoker(
        ShowKillProcessTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showKillProcessTask, hcClient);
    }

    /**
     * 查询最新死锁快照
     *
     * 查询最新死锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshot4ApiRequest 请求对象
     * @return CompletableFuture<ShowLatestDeadLockSnapshot4ApiResponse>
     */
    public CompletableFuture<ShowLatestDeadLockSnapshot4ApiResponse> showLatestDeadLockSnapshot4ApiAsync(
        ShowLatestDeadLockSnapshot4ApiRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLatestDeadLockSnapshot4Api);
    }

    /**
     * 查询最新死锁快照
     *
     * 查询最新死锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshot4ApiRequest 请求对象
     * @return AsyncInvoker<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse>
     */
    public AsyncInvoker<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse> showLatestDeadLockSnapshot4ApiAsyncInvoker(
        ShowLatestDeadLockSnapshot4ApiRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLatestDeadLockSnapshot4Api, hcClient);
    }

    /**
     * 查询元数据锁
     *
     * 查询元数据锁
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockRequest 请求对象
     * @return CompletableFuture<ShowMetaLockResponse>
     */
    public CompletableFuture<ShowMetaLockResponse> showMetaLockAsync(ShowMetaLockRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showMetaLock);
    }

    /**
     * 查询元数据锁
     *
     * 查询元数据锁
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockRequest 请求对象
     * @return AsyncInvoker<ShowMetaLockRequest, ShowMetaLockResponse>
     */
    public AsyncInvoker<ShowMetaLockRequest, ShowMetaLockResponse> showMetaLockAsyncInvoker(
        ShowMetaLockRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showMetaLock, hcClient);
    }

    /**
     * 查询元数据锁快照
     *
     * 查询元数据锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockSnapshotRequest 请求对象
     * @return CompletableFuture<ShowMetaLockSnapshotResponse>
     */
    public CompletableFuture<ShowMetaLockSnapshotResponse> showMetaLockSnapshotAsync(
        ShowMetaLockSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showMetaLockSnapshot);
    }

    /**
     * 查询元数据锁快照
     *
     * 查询元数据锁快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetaLockSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse>
     */
    public AsyncInvoker<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse> showMetaLockSnapshotAsyncInvoker(
        ShowMetaLockSnapshotRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showMetaLockSnapshot, hcClient);
    }

    /**
     * 获取开通信息
     *
     * 获取开通信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpeningInfoRequest 请求对象
     * @return CompletableFuture<ShowOpeningInfoResponse>
     */
    public CompletableFuture<ShowOpeningInfoResponse> showOpeningInfoAsync(ShowOpeningInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showOpeningInfo);
    }

    /**
     * 获取开通信息
     *
     * 获取开通信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOpeningInfoRequest 请求对象
     * @return AsyncInvoker<ShowOpeningInfoRequest, ShowOpeningInfoResponse>
     */
    public AsyncInvoker<ShowOpeningInfoRequest, ShowOpeningInfoResponse> showOpeningInfoAsyncInvoker(
        ShowOpeningInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showOpeningInfo, hcClient);
    }

    /**
     * 查询单个模板趋势
     *
     * 查询单个模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleTemplateTrendRequest 请求对象
     * @return CompletableFuture<ShowSingleTemplateTrendResponse>
     */
    public CompletableFuture<ShowSingleTemplateTrendResponse> showSingleTemplateTrendAsync(
        ShowSingleTemplateTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSingleTemplateTrend);
    }

    /**
     * 查询单个模板趋势
     *
     * 查询单个模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSingleTemplateTrendRequest 请求对象
     * @return AsyncInvoker<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse>
     */
    public AsyncInvoker<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse> showSingleTemplateTrendAsyncInvoker(
        ShowSingleTemplateTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSingleTemplateTrend, hcClient);
    }

    /**
     * 查询SQL模板趋势
     *
     * 查询SQL模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlTemplateTrendRequest 请求对象
     * @return CompletableFuture<ShowSqlTemplateTrendResponse>
     */
    public CompletableFuture<ShowSqlTemplateTrendResponse> showSqlTemplateTrendAsync(
        ShowSqlTemplateTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlTemplateTrend);
    }

    /**
     * 查询SQL模板趋势
     *
     * 查询SQL模板趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlTemplateTrendRequest 请求对象
     * @return AsyncInvoker<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse>
     */
    public AsyncInvoker<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse> showSqlTemplateTrendAsyncInvoker(
        ShowSqlTemplateTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlTemplateTrend, hcClient);
    }

    /**
     * 支持的关键字
     *
     * 支持的关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportKeyStringRequest 请求对象
     * @return CompletableFuture<ShowSupportKeyStringResponse>
     */
    public CompletableFuture<ShowSupportKeyStringResponse> showSupportKeyStringAsync(
        ShowSupportKeyStringRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSupportKeyString);
    }

    /**
     * 支持的关键字
     *
     * 支持的关键字
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportKeyStringRequest 请求对象
     * @return AsyncInvoker<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse>
     */
    public AsyncInvoker<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse> showSupportKeyStringAsyncInvoker(
        ShowSupportKeyStringRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSupportKeyString, hcClient);
    }

    /**
     * 获取调优结果
     *
     * 获取调优结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningResultRequest 请求对象
     * @return CompletableFuture<ShowTuningResultResponse>
     */
    public CompletableFuture<ShowTuningResultResponse> showTuningResultAsync(ShowTuningResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showTuningResult);
    }

    /**
     * 获取调优结果
     *
     * 获取调优结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningResultRequest 请求对象
     * @return AsyncInvoker<ShowTuningResultRequest, ShowTuningResultResponse>
     */
    public AsyncInvoker<ShowTuningResultRequest, ShowTuningResultResponse> showTuningResultAsyncInvoker(
        ShowTuningResultRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showTuningResult, hcClient);
    }

    /**
     * 查询InnoDB锁等待快照
     *
     * 查询InnoDB锁等待快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWaitingLocksSnapshotRequest 请求对象
     * @return CompletableFuture<ShowWaitingLocksSnapshotResponse>
     */
    public CompletableFuture<ShowWaitingLocksSnapshotResponse> showWaitingLocksSnapshotAsync(
        ShowWaitingLocksSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showWaitingLocksSnapshot);
    }

    /**
     * 查询InnoDB锁等待快照
     *
     * 查询InnoDB锁等待快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWaitingLocksSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse>
     */
    public AsyncInvoker<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse> showWaitingLocksSnapshotAsyncInvoker(
        ShowWaitingLocksSnapshotRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showWaitingLocksSnapshot, hcClient);
    }

    /**
     * 获取WDR快照列表
     *
     * 获取WDR快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotRequest 请求对象
     * @return CompletableFuture<ShowWdrSnapshotResponse>
     */
    public CompletableFuture<ShowWdrSnapshotResponse> showWdrSnapshotAsync(ShowWdrSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showWdrSnapshot);
    }

    /**
     * 获取WDR快照列表
     *
     * 获取WDR快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWdrSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse>
     */
    public AsyncInvoker<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse> showWdrSnapshotAsyncInvoker(
        ShowWdrSnapshotRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showWdrSnapshot, hcClient);
    }

    /**
     * 签署数据安全协议
     *
     * 签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignProtocolNewRequest 请求对象
     * @return CompletableFuture<SignProtocolNewResponse>
     */
    public CompletableFuture<SignProtocolNewResponse> signProtocolNewAsync(SignProtocolNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.signProtocolNew);
    }

    /**
     * 签署数据安全协议
     *
     * 签署数据安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SignProtocolNewRequest 请求对象
     * @return AsyncInvoker<SignProtocolNewRequest, SignProtocolNewResponse>
     */
    public AsyncInvoker<SignProtocolNewRequest, SignProtocolNewResponse> signProtocolNewAsyncInvoker(
        SignProtocolNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.signProtocolNew, hcClient);
    }

    /**
     * 停止binlog解析任务
     *
     * 停止binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBinlogTaskRequest 请求对象
     * @return CompletableFuture<StopBinlogTaskResponse>
     */
    public CompletableFuture<StopBinlogTaskResponse> stopBinlogTaskAsync(StopBinlogTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.stopBinlogTask);
    }

    /**
     * 停止binlog解析任务
     *
     * 停止binlog解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StopBinlogTaskRequest 请求对象
     * @return AsyncInvoker<StopBinlogTaskRequest, StopBinlogTaskResponse>
     */
    public AsyncInvoker<StopBinlogTaskRequest, StopBinlogTaskResponse> stopBinlogTaskAsyncInvoker(
        StopBinlogTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.stopBinlogTask, hcClient);
    }

    /**
     * 订阅实例报告
     *
     * 订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeInstanceReportNewRequest 请求对象
     * @return CompletableFuture<SubscribeInstanceReportNewResponse>
     */
    public CompletableFuture<SubscribeInstanceReportNewResponse> subscribeInstanceReportNewAsync(
        SubscribeInstanceReportNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.subscribeInstanceReportNew);
    }

    /**
     * 订阅实例报告
     *
     * 订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeInstanceReportNewRequest 请求对象
     * @return AsyncInvoker<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse>
     */
    public AsyncInvoker<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse> subscribeInstanceReportNewAsyncInvoker(
        SubscribeInstanceReportNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.subscribeInstanceReportNew, hcClient);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstanceListNewRequest 请求对象
     * @return CompletableFuture<SynchronizeInstanceListNewResponse>
     */
    public CompletableFuture<SynchronizeInstanceListNewResponse> synchronizeInstanceListNewAsync(
        SynchronizeInstanceListNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.synchronizeInstanceListNew);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstanceListNewRequest 请求对象
     * @return AsyncInvoker<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse>
     */
    public AsyncInvoker<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse> synchronizeInstanceListNewAsyncInvoker(
        SynchronizeInstanceListNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.synchronizeInstanceListNew, hcClient);
    }

    /**
     * 取消订阅实例报告
     *
     * 取消订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeInstanceReportNewRequest 请求对象
     * @return CompletableFuture<UnsubscribeInstanceReportNewResponse>
     */
    public CompletableFuture<UnsubscribeInstanceReportNewResponse> unsubscribeInstanceReportNewAsync(
        UnsubscribeInstanceReportNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.unsubscribeInstanceReportNew);
    }

    /**
     * 取消订阅实例报告
     *
     * 取消订阅实例报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnsubscribeInstanceReportNewRequest 请求对象
     * @return AsyncInvoker<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse>
     */
    public AsyncInvoker<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse> unsubscribeInstanceReportNewAsyncInvoker(
        UnsubscribeInstanceReportNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.unsubscribeInstanceReportNew, hcClient);
    }

    /**
     * 设置实例配置
     *
     * Space Set Config New
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigResponse>
     */
    public CompletableFuture<UpdateInstanceConfigResponse> updateInstanceConfigAsync(
        UpdateInstanceConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateInstanceConfig);
    }

    /**
     * 设置实例配置
     *
     * Space Set Config New
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceConfigRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> updateInstanceConfigAsyncInvoker(
        UpdateInstanceConfigRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateInstanceConfig, hcClient);
    }

    /**
     * 设置searchpath开关
     *
     * 设置searchpath开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchPathFlagRequest 请求对象
     * @return CompletableFuture<UpdateSearchPathFlagResponse>
     */
    public CompletableFuture<UpdateSearchPathFlagResponse> updateSearchPathFlagAsync(
        UpdateSearchPathFlagRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateSearchPathFlag);
    }

    /**
     * 设置searchpath开关
     *
     * 设置searchpath开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSearchPathFlagRequest 请求对象
     * @return AsyncInvoker<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse>
     */
    public AsyncInvoker<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse> updateSearchPathFlagAsyncInvoker(
        UpdateSearchPathFlagRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateSearchPathFlag, hcClient);
    }

    /**
     * 更新共享信息
     *
     * 更新共享信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSharedInfoNewRequest 请求对象
     * @return CompletableFuture<UpdateSharedInfoNewResponse>
     */
    public CompletableFuture<UpdateSharedInfoNewResponse> updateSharedInfoNewAsync(UpdateSharedInfoNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateSharedInfoNew);
    }

    /**
     * 更新共享信息
     *
     * 更新共享信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSharedInfoNewRequest 请求对象
     * @return AsyncInvoker<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse>
     */
    public AsyncInvoker<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse> updateSharedInfoNewAsyncInvoker(
        UpdateSharedInfoNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateSharedInfoNew, hcClient);
    }

    /**
     * 验证数据库实例连接
     *
     * 验证数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyConnectionNewRequest 请求对象
     * @return CompletableFuture<VerifyConnectionNewResponse>
     */
    public CompletableFuture<VerifyConnectionNewResponse> verifyConnectionNewAsync(VerifyConnectionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.verifyConnectionNew);
    }

    /**
     * 验证数据库实例连接
     *
     * 验证数据库实例连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyConnectionNewRequest 请求对象
     * @return AsyncInvoker<VerifyConnectionNewRequest, VerifyConnectionNewResponse>
     */
    public AsyncInvoker<VerifyConnectionNewRequest, VerifyConnectionNewResponse> verifyConnectionNewAsyncInvoker(
        VerifyConnectionNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.verifyConnectionNew, hcClient);
    }

    /**
     * 新增邮件模板
     *
     * 新增邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEmailTemplateRequest 请求对象
     * @return CompletableFuture<AddEmailTemplateResponse>
     */
    public CompletableFuture<AddEmailTemplateResponse> addEmailTemplateAsync(AddEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addEmailTemplate);
    }

    /**
     * 新增邮件模板
     *
     * 新增邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddEmailTemplateRequest 请求对象
     * @return AsyncInvoker<AddEmailTemplateRequest, AddEmailTemplateResponse>
     */
    public AsyncInvoker<AddEmailTemplateRequest, AddEmailTemplateResponse> addEmailTemplateAsyncInvoker(
        AddEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addEmailTemplate, hcClient);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFullSqlTaskRequest 请求对象
     * @return CompletableFuture<AddFullSqlTaskResponse>
     */
    public CompletableFuture<AddFullSqlTaskResponse> addFullSqlTaskAsync(AddFullSqlTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addFullSqlTask);
    }

    /**
     * 创建全量SQL明细解析任务
     *
     * 创建全量SQL明细解析任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddFullSqlTaskRequest 请求对象
     * @return AsyncInvoker<AddFullSqlTaskRequest, AddFullSqlTaskResponse>
     */
    public AsyncInvoker<AddFullSqlTaskRequest, AddFullSqlTaskResponse> addFullSqlTaskAsyncInvoker(
        AddFullSqlTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addFullSqlTask, hcClient);
    }

    /**
     * 新增实例组
     *
     * 新增实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceGroupRequest 请求对象
     * @return CompletableFuture<AddInstanceGroupResponse>
     */
    public CompletableFuture<AddInstanceGroupResponse> addInstanceGroupAsync(AddInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addInstanceGroup);
    }

    /**
     * 新增实例组
     *
     * 新增实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceGroupRequest 请求对象
     * @return AsyncInvoker<AddInstanceGroupRequest, AddInstanceGroupResponse>
     */
    public AsyncInvoker<AddInstanceGroupRequest, AddInstanceGroupResponse> addInstanceGroupAsyncInvoker(
        AddInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addInstanceGroup, hcClient);
    }

    /**
     * 将实例添加到实例组
     *
     * 将实例添加到实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceToGroupRequest 请求对象
     * @return CompletableFuture<AddInstanceToGroupResponse>
     */
    public CompletableFuture<AddInstanceToGroupResponse> addInstanceToGroupAsync(AddInstanceToGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addInstanceToGroup);
    }

    /**
     * 将实例添加到实例组
     *
     * 将实例添加到实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddInstanceToGroupRequest 请求对象
     * @return AsyncInvoker<AddInstanceToGroupRequest, AddInstanceToGroupResponse>
     */
    public AsyncInvoker<AddInstanceToGroupRequest, AddInstanceToGroupResponse> addInstanceToGroupAsyncInvoker(
        AddInstanceToGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addInstanceToGroup, hcClient);
    }

    /**
     * 新增SQL限流规则
     *
     * 新增SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSqlLimitingRecordNewRequest 请求对象
     * @return CompletableFuture<AddSqlLimitingRecordNewResponse>
     */
    public CompletableFuture<AddSqlLimitingRecordNewResponse> addSqlLimitingRecordNewAsync(
        AddSqlLimitingRecordNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.addSqlLimitingRecordNew);
    }

    /**
     * 新增SQL限流规则
     *
     * 新增SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSqlLimitingRecordNewRequest 请求对象
     * @return AsyncInvoker<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse>
     */
    public AsyncInvoker<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse> addSqlLimitingRecordNewAsyncInvoker(
        AddSqlLimitingRecordNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.addSqlLimitingRecordNew, hcClient);
    }

    /**
     * 批量删除连接
     *
     * 批量删除连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteConnectionNewRequest 请求对象
     * @return CompletableFuture<BatchDeleteConnectionNewResponse>
     */
    public CompletableFuture<BatchDeleteConnectionNewResponse> batchDeleteConnectionNewAsync(
        BatchDeleteConnectionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchDeleteConnectionNew);
    }

    /**
     * 批量删除连接
     *
     * 批量删除连接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteConnectionNewRequest 请求对象
     * @return AsyncInvoker<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse>
     */
    public AsyncInvoker<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse> batchDeleteConnectionNewAsyncInvoker(
        BatchDeleteConnectionNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchDeleteConnectionNew, hcClient);
    }

    /**
     * 批量发送邮件
     *
     * 批量发送邮件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendEmailRequest 请求对象
     * @return CompletableFuture<BatchSendEmailResponse>
     */
    public CompletableFuture<BatchSendEmailResponse> batchSendEmailAsync(BatchSendEmailRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchSendEmail);
    }

    /**
     * 批量发送邮件
     *
     * 批量发送邮件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSendEmailRequest 请求对象
     * @return AsyncInvoker<BatchSendEmailRequest, BatchSendEmailResponse>
     */
    public AsyncInvoker<BatchSendEmailRequest, BatchSendEmailResponse> batchSendEmailAsyncInvoker(
        BatchSendEmailRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchSendEmail, hcClient);
    }

    /**
     * 批量订阅/取消订阅
     *
     * 批量订阅/取消订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSubscribeReportRequest 请求对象
     * @return CompletableFuture<BatchSubscribeReportResponse>
     */
    public CompletableFuture<BatchSubscribeReportResponse> batchSubscribeReportAsync(
        BatchSubscribeReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.batchSubscribeReport);
    }

    /**
     * 批量订阅/取消订阅
     *
     * 批量订阅/取消订阅
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSubscribeReportRequest 请求对象
     * @return AsyncInvoker<BatchSubscribeReportRequest, BatchSubscribeReportResponse>
     */
    public AsyncInvoker<BatchSubscribeReportRequest, BatchSubscribeReportResponse> batchSubscribeReportAsyncInvoker(
        BatchSubscribeReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.batchSubscribeReport, hcClient);
    }

    /**
     * 取消共享链接
     *
     * 取消共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareNewRequest 请求对象
     * @return CompletableFuture<CancelShareNewResponse>
     */
    public CompletableFuture<CancelShareNewResponse> cancelShareNewAsync(CancelShareNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.cancelShareNew);
    }

    /**
     * 取消共享链接
     *
     * 取消共享链接
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelShareNewRequest 请求对象
     * @return AsyncInvoker<CancelShareNewRequest, CancelShareNewResponse>
     */
    public AsyncInvoker<CancelShareNewRequest, CancelShareNewResponse> cancelShareNewAsyncInvoker(
        CancelShareNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.cancelShareNew, hcClient);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeChargeModeRequest 请求对象
     * @return CompletableFuture<ChangeChargeModeResponse>
     */
    public CompletableFuture<ChangeChargeModeResponse> changeChargeModeAsync(ChangeChargeModeRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeChargeMode);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeChargeModeRequest 请求对象
     * @return AsyncInvoker<ChangeChargeModeRequest, ChangeChargeModeResponse>
     */
    public AsyncInvoker<ChangeChargeModeRequest, ChangeChargeModeResponse> changeChargeModeAsyncInvoker(
        ChangeChargeModeRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeChargeMode, hcClient);
    }

    /**
     * 修改死锁开关
     *
     * 修改死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDeadLockSwitchNewRequest 请求对象
     * @return CompletableFuture<ChangeDeadLockSwitchNewResponse>
     */
    public CompletableFuture<ChangeDeadLockSwitchNewResponse> changeDeadLockSwitchNewAsync(
        ChangeDeadLockSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeDeadLockSwitchNew);
    }

    /**
     * 修改死锁开关
     *
     * 修改死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeDeadLockSwitchNewRequest 请求对象
     * @return AsyncInvoker<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse>
     */
    public AsyncInvoker<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse> changeDeadLockSwitchNewAsyncInvoker(
        ChangeDeadLockSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeDeadLockSwitchNew, hcClient);
    }

    /**
     * 设置全量死锁开关
     *
     * 设置全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFullDeadLockSwitchRequest 请求对象
     * @return CompletableFuture<ChangeFullDeadLockSwitchResponse>
     */
    public CompletableFuture<ChangeFullDeadLockSwitchResponse> changeFullDeadLockSwitchAsync(
        ChangeFullDeadLockSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeFullDeadLockSwitch);
    }

    /**
     * 设置全量死锁开关
     *
     * 设置全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeFullDeadLockSwitchRequest 请求对象
     * @return AsyncInvoker<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse>
     */
    public AsyncInvoker<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse> changeFullDeadLockSwitchAsyncInvoker(
        ChangeFullDeadLockSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeFullDeadLockSwitch, hcClient);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePaymentModeNewRequest 请求对象
     * @return CompletableFuture<ChangePaymentModeNewResponse>
     */
    public CompletableFuture<ChangePaymentModeNewResponse> changePaymentModeNewAsync(
        ChangePaymentModeNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changePaymentModeNew);
    }

    /**
     * 设置实例付费/免费模式
     *
     * 设置实例付费/免费模式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangePaymentModeNewRequest 请求对象
     * @return AsyncInvoker<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse>
     */
    public AsyncInvoker<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse> changePaymentModeNewAsyncInvoker(
        ChangePaymentModeNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changePaymentModeNew, hcClient);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangeSqlLimitSwitchStatusResponse>
     */
    public CompletableFuture<ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusAsync(
        ChangeSqlLimitSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeSqlLimitSwitchStatus);
    }

    /**
     * 设置SQL限流开关状态
     *
     * 设置SQL限流开关状态。目前仅支持MySQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeSqlLimitSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatusAsyncInvoker(
        ChangeSqlLimitSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeSqlLimitSwitchStatus, hcClient);
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
     * @return CompletableFuture<ChangeSqlSwitchResponse>
     */
    public CompletableFuture<ChangeSqlSwitchResponse> changeSqlSwitchAsync(ChangeSqlSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeSqlSwitch);
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
     * @return AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse>
     */
    public AsyncInvoker<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitchAsyncInvoker(
        ChangeSqlSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeSqlSwitch, hcClient);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return CompletableFuture<ChangeTransactionSwitchStatusResponse>
     */
    public CompletableFuture<ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatusAsync(
        ChangeTransactionSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.changeTransactionSwitchStatus);
    }

    /**
     * 开启/关闭历史事务开关
     *
     * 开启/关闭历史事务开关，仅支持MySQL引擎，并且依赖开启全量SQL或者慢SQL功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeTransactionSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse>
     */
    public AsyncInvoker<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatusAsyncInvoker(
        ChangeTransactionSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.changeTransactionSwitchStatus, hcClient);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialRequest 请求对象
     * @return CompletableFuture<CheckCredentialResponse>
     */
    public CompletableFuture<CheckCredentialResponse> checkCredentialAsync(CheckCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.checkCredential);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialRequest 请求对象
     * @return AsyncInvoker<CheckCredentialRequest, CheckCredentialResponse>
     */
    public AsyncInvoker<CheckCredentialRequest, CheckCredentialResponse> checkCredentialAsyncInvoker(
        CheckCredentialRequest request) {
        return new AsyncInvoker<>(request, DasMeta.checkCredential, hcClient);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialForBatchInspectionRequest 请求对象
     * @return CompletableFuture<CheckCredentialForBatchInspectionResponse>
     */
    public CompletableFuture<CheckCredentialForBatchInspectionResponse> checkCredentialForBatchInspectionAsync(
        CheckCredentialForBatchInspectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.checkCredentialForBatchInspection);
    }

    /**
     * 测试AK/SK
     *
     * 测试AK/SK，测试用户AK/SK能否正常访问OBS桶。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckCredentialForBatchInspectionRequest 请求对象
     * @return AsyncInvoker<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse>
     */
    public AsyncInvoker<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse> checkCredentialForBatchInspectionAsyncInvoker(
        CheckCredentialForBatchInspectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.checkCredentialForBatchInspection, hcClient);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return CompletableFuture<CreateHealthReportTaskResponse>
     */
    public CompletableFuture<CreateHealthReportTaskResponse> createHealthReportTaskAsync(
        CreateHealthReportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createHealthReportTask);
    }

    /**
     * 创建实例健康诊断任务
     *
     * 创建实例健康诊断任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHealthReportTaskRequest 请求对象
     * @return AsyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse>
     */
    public AsyncInvoker<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> createHealthReportTaskAsyncInvoker(
        CreateHealthReportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createHealthReportTask, hcClient);
    }

    /**
     * 创建导出历史事务任务
     *
     * DAS收集历史事务开关打开后，支持创建一次性导出指定时间范围内的历史事务数据任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHistoryTransactionExportTaskRequest 请求对象
     * @return CompletableFuture<CreateHistoryTransactionExportTaskResponse>
     */
    public CompletableFuture<CreateHistoryTransactionExportTaskResponse> createHistoryTransactionExportTaskAsync(
        CreateHistoryTransactionExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createHistoryTransactionExportTask);
    }

    /**
     * 创建导出历史事务任务
     *
     * DAS收集历史事务开关打开后，支持创建一次性导出指定时间范围内的历史事务数据任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHistoryTransactionExportTaskRequest 请求对象
     * @return AsyncInvoker<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse>
     */
    public AsyncInvoker<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse> createHistoryTransactionExportTaskAsyncInvoker(
        CreateHistoryTransactionExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createHistoryTransactionExportTask, hcClient);
    }

    /**
     * 创建快照
     *
     * 创建快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotsRequest 请求对象
     * @return CompletableFuture<CreateSnapshotsResponse>
     */
    public CompletableFuture<CreateSnapshotsResponse> createSnapshotsAsync(CreateSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSnapshots);
    }

    /**
     * 创建快照
     *
     * 创建快照
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotsRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotsRequest, CreateSnapshotsResponse>
     */
    public AsyncInvoker<CreateSnapshotsRequest, CreateSnapshotsResponse> createSnapshotsAsyncInvoker(
        CreateSnapshotsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createSnapshots, hcClient);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return CompletableFuture<CreateSpaceAnalysisTaskResponse>
     */
    public CompletableFuture<CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskAsync(
        CreateSpaceAnalysisTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSpaceAnalysisTask);
    }

    /**
     * 创建空间分析任务
     *
     * 创建空间分析任务，如触发重新分析，支持MySQL和GaussDB(for MySQL)引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSpaceAnalysisTaskRequest 请求对象
     * @return AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse>
     */
    public AsyncInvoker<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTaskAsyncInvoker(
        CreateSpaceAnalysisTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createSpaceAnalysisTask, hcClient);
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
     * @return CompletableFuture<CreateSqlLimitRulesResponse>
     */
    public CompletableFuture<CreateSqlLimitRulesResponse> createSqlLimitRulesAsync(CreateSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createSqlLimitRules);
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
     * @return AsyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse>
     */
    public AsyncInvoker<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRulesAsyncInvoker(
        CreateSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createSqlLimitRules, hcClient);
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
     * @return CompletableFuture<CreateTuningResponse>
     */
    public CompletableFuture<CreateTuningResponse> createTuningAsync(CreateTuningRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.createTuning);
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
     * @return AsyncInvoker<CreateTuningRequest, CreateTuningResponse>
     */
    public AsyncInvoker<CreateTuningRequest, CreateTuningResponse> createTuningAsyncInvoker(
        CreateTuningRequest request) {
        return new AsyncInvoker<>(request, DasMeta.createTuning, hcClient);
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
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteDbUser);
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
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteDbUser, hcClient);
    }

    /**
     * 删除邮件模板
     *
     * 删除邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEmailTemplateRequest 请求对象
     * @return CompletableFuture<DeleteEmailTemplateResponse>
     */
    public CompletableFuture<DeleteEmailTemplateResponse> deleteEmailTemplateAsync(DeleteEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteEmailTemplate);
    }

    /**
     * 删除邮件模板
     *
     * 删除邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEmailTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse>
     */
    public AsyncInvoker<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse> deleteEmailTemplateAsyncInvoker(
        DeleteEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteEmailTemplate, hcClient);
    }

    /**
     * 删除导出历史事务任务
     *
     * DAS收集历史事务开关打开后，删除历史事务导出任务记录对应的OBS文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHistoryTransactionExportTaskRequest 请求对象
     * @return CompletableFuture<DeleteHistoryTransactionExportTaskResponse>
     */
    public CompletableFuture<DeleteHistoryTransactionExportTaskResponse> deleteHistoryTransactionExportTaskAsync(
        DeleteHistoryTransactionExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteHistoryTransactionExportTask);
    }

    /**
     * 删除导出历史事务任务
     *
     * DAS收集历史事务开关打开后，删除历史事务导出任务记录对应的OBS文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHistoryTransactionExportTaskRequest 请求对象
     * @return AsyncInvoker<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse>
     */
    public AsyncInvoker<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse> deleteHistoryTransactionExportTaskAsyncInvoker(
        DeleteHistoryTransactionExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteHistoryTransactionExportTask, hcClient);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceGroupRequest 请求对象
     * @return CompletableFuture<DeleteInstanceGroupResponse>
     */
    public CompletableFuture<DeleteInstanceGroupResponse> deleteInstanceGroupAsync(DeleteInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteInstanceGroup);
    }

    /**
     * 删除实例组
     *
     * 删除实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse>
     */
    public AsyncInvoker<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse> deleteInstanceGroupAsyncInvoker(
        DeleteInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteInstanceGroup, hcClient);
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
     * @return CompletableFuture<DeleteProcessResponse>
     */
    public CompletableFuture<DeleteProcessResponse> deleteProcessAsync(DeleteProcessRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteProcess);
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
     * @return AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse>
     */
    public AsyncInvoker<DeleteProcessRequest, DeleteProcessResponse> deleteProcessAsyncInvoker(
        DeleteProcessRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteProcess, hcClient);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<DeleteSqlLimitRulesResponse>
     */
    public CompletableFuture<DeleteSqlLimitRulesResponse> deleteSqlLimitRulesAsync(DeleteSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.deleteSqlLimitRules);
    }

    /**
     * 删除SQL限流规则
     *
     * 删除SQL限流规则。目前仅支持MySQL和PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse>
     */
    public AsyncInvoker<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRulesAsyncInvoker(
        DeleteSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.deleteSqlLimitRules, hcClient);
    }

    /**
     * 导出全量SQL明细
     *
     * 全量SQL开关打开后，创建SQL洞察任务，支持按节点、用户名、数据库、操作类型等导出全量SQL明细数据。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlDetailsRequest 请求对象
     * @return CompletableFuture<ExportFullSqlDetailsResponse>
     */
    public CompletableFuture<ExportFullSqlDetailsResponse> exportFullSqlDetailsAsync(
        ExportFullSqlDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportFullSqlDetails);
    }

    /**
     * 导出全量SQL明细
     *
     * 全量SQL开关打开后，创建SQL洞察任务，支持按节点、用户名、数据库、操作类型等导出全量SQL明细数据。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportFullSqlDetailsRequest 请求对象
     * @return AsyncInvoker<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse>
     */
    public AsyncInvoker<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse> exportFullSqlDetailsAsyncInvoker(
        ExportFullSqlDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportFullSqlDetails, hcClient);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return CompletableFuture<ExportSlowQueryLogsResponse>
     */
    public CompletableFuture<ExportSlowQueryLogsResponse> exportSlowQueryLogsAsync(ExportSlowQueryLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowQueryLogs);
    }

    /**
     * 导出慢SQL数据
     *
     * DAS收集慢SQL开关打开后，一次性导出指定时间范围内的慢SQL数据，支持分页滚动获取。免费实例仅支持查看最近一小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowQueryLogsRequest 请求对象
     * @return AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse>
     */
    public AsyncInvoker<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogsAsyncInvoker(
        ExportSlowQueryLogsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowQueryLogs, hcClient);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlStatisticsResponse>
     */
    public CompletableFuture<ExportSlowSqlStatisticsResponse> exportSlowSqlStatisticsAsync(
        ExportSlowSqlStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowSqlStatistics);
    }

    /**
     * 导出慢SQL统计数据
     *
     * 慢SQL开关打开后，导出慢SQL统计数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlStatisticsRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse>
     */
    public AsyncInvoker<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> exportSlowSqlStatisticsAsyncInvoker(
        ExportSlowSqlStatisticsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowSqlStatistics, hcClient);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlTemplatesDetailsResponse>
     */
    public CompletableFuture<ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsAsync(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowSqlTemplatesDetails);
    }

    /**
     * 导出慢SQL模板列表
     *
     * 慢SQL开关打开后，导出慢SQL模板列表。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTemplatesDetailsRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse>
     */
    public AsyncInvoker<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetailsAsyncInvoker(
        ExportSlowSqlTemplatesDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return CompletableFuture<ExportSlowSqlTrendDetailsResponse>
     */
    public CompletableFuture<ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetailsAsync(
        ExportSlowSqlTrendDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSlowSqlTrendDetails);
    }

    /**
     * 导出慢SQL数量趋势
     *
     * 慢SQL开关打开后，导出慢SQL数量趋势。免费实例仅支持查看最近一小时数据。查询时间间隔最长一天。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSlowSqlTrendDetailsRequest 请求对象
     * @return AsyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse>
     */
    public AsyncInvoker<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetailsAsyncInvoker(
        ExportSlowSqlTrendDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSlowSqlTrendDetails, hcClient);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return CompletableFuture<ExportSqlStatementsResponse>
     */
    public CompletableFuture<ExportSqlStatementsResponse> exportSqlStatementsAsync(ExportSqlStatementsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportSqlStatements);
    }

    /**
     * 导出全量SQL
     *
     * 全量SQL开关打开后，一次性导出指定时间范围内的全量SQL数据，支持分页滚动获取。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportSqlStatementsRequest 请求对象
     * @return AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse>
     */
    public AsyncInvoker<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatementsAsyncInvoker(
        ExportSqlStatementsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportSqlStatements, hcClient);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return CompletableFuture<ExportTopRiskInstancesResponse>
     */
    public CompletableFuture<ExportTopRiskInstancesResponse> exportTopRiskInstancesAsync(
        ExportTopRiskInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportTopRiskInstances);
    }

    /**
     * 导出TOP风险实例列表
     *
     * 导出TOP风险实例列表，支持查看最近24小时数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopRiskInstancesRequest 请求对象
     * @return AsyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse>
     */
    public AsyncInvoker<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> exportTopRiskInstancesAsyncInvoker(
        ExportTopRiskInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportTopRiskInstances, hcClient);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return CompletableFuture<ExportTopSqlTemplatesDetailsResponse>
     */
    public CompletableFuture<ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsAsync(
        ExportTopSqlTemplatesDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportTopSqlTemplatesDetails);
    }

    /**
     * 导出TopSQL模板列表
     *
     * TopSQL开关打开后，导出TopSQL模板列表。该功能仅支持付费实例。查询时间间隔最长一小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTemplatesDetailsRequest 请求对象
     * @return AsyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse>
     */
    public AsyncInvoker<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetailsAsyncInvoker(
        ExportTopSqlTemplatesDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportTopSqlTemplatesDetails, hcClient);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return CompletableFuture<ExportTopSqlTrendDetailsResponse>
     */
    public CompletableFuture<ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsAsync(
        ExportTopSqlTrendDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.exportTopSqlTrendDetails);
    }

    /**
     * 导出SQL执行耗时区间数据
     *
     * TopSQL开关打开后，导出SQL执行耗时区间数据。该功能仅支持付费实例。查询时间间隔最长六小时。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTopSqlTrendDetailsRequest 请求对象
     * @return AsyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse>
     */
    public AsyncInvoker<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetailsAsyncInvoker(
        ExportTopSqlTrendDetailsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.exportTopSqlTrendDetails, hcClient);
    }

    /**
     * 查询自增配额
     *
     * 查询自增配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoIncrementUsageRequest 请求对象
     * @return CompletableFuture<ListAutoIncrementUsageResponse>
     */
    public CompletableFuture<ListAutoIncrementUsageResponse> listAutoIncrementUsageAsync(
        ListAutoIncrementUsageRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listAutoIncrementUsage);
    }

    /**
     * 查询自增配额
     *
     * 查询自增配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAutoIncrementUsageRequest 请求对象
     * @return AsyncInvoker<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse>
     */
    public AsyncInvoker<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse> listAutoIncrementUsageAsyncInvoker(
        ListAutoIncrementUsageRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listAutoIncrementUsage, hcClient);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return CompletableFuture<ListCloudDbaInstancesResponse>
     */
    public CompletableFuture<ListCloudDbaInstancesResponse> listCloudDbaInstancesAsync(
        ListCloudDbaInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listCloudDbaInstances);
    }

    /**
     * 获取DAS云DBA实例列表
     *
     * 获取DAS云DBA实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCloudDbaInstancesRequest 请求对象
     * @return AsyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse>
     */
    public AsyncInvoker<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> listCloudDbaInstancesAsyncInvoker(
        ListCloudDbaInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listCloudDbaInstances, hcClient);
    }

    /**
     * 获取库名列表
     *
     * 获取库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbNamesRequest 请求对象
     * @return CompletableFuture<ListDbNamesResponse>
     */
    public CompletableFuture<ListDbNamesResponse> listDbNamesAsync(ListDbNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDbNames);
    }

    /**
     * 获取库名列表
     *
     * 获取库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDbNamesRequest 请求对象
     * @return AsyncInvoker<ListDbNamesRequest, ListDbNamesResponse>
     */
    public AsyncInvoker<ListDbNamesRequest, ListDbNamesResponse> listDbNamesAsyncInvoker(ListDbNamesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listDbNames, hcClient);
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
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listDbUsers);
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
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listDbUsers, hcClient);
    }

    /**
     * 查询邮件推送记录
     *
     * 查询邮件推送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailRecordRequest 请求对象
     * @return CompletableFuture<ListEmailRecordResponse>
     */
    public CompletableFuture<ListEmailRecordResponse> listEmailRecordAsync(ListEmailRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listEmailRecord);
    }

    /**
     * 查询邮件推送记录
     *
     * 查询邮件推送记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailRecordRequest 请求对象
     * @return AsyncInvoker<ListEmailRecordRequest, ListEmailRecordResponse>
     */
    public AsyncInvoker<ListEmailRecordRequest, ListEmailRecordResponse> listEmailRecordAsyncInvoker(
        ListEmailRecordRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listEmailRecord, hcClient);
    }

    /**
     * 查询邮件模板列表
     *
     * 查询邮件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailTemplateRequest 请求对象
     * @return CompletableFuture<ListEmailTemplateResponse>
     */
    public CompletableFuture<ListEmailTemplateResponse> listEmailTemplateAsync(ListEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listEmailTemplate);
    }

    /**
     * 查询邮件模板列表
     *
     * 查询邮件模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEmailTemplateRequest 请求对象
     * @return AsyncInvoker<ListEmailTemplateRequest, ListEmailTemplateResponse>
     */
    public AsyncInvoker<ListEmailTemplateRequest, ListEmailTemplateResponse> listEmailTemplateAsyncInvoker(
        ListEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listEmailTemplate, hcClient);
    }

    /**
     * 查询SQL洞察任务列表
     *
     * 全量SQL开关打开后，查询SQL洞察任务列表。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlTasksRequest 请求对象
     * @return CompletableFuture<ListFullSqlTasksResponse>
     */
    public CompletableFuture<ListFullSqlTasksResponse> listFullSqlTasksAsync(ListFullSqlTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listFullSqlTasks);
    }

    /**
     * 查询SQL洞察任务列表
     *
     * 全量SQL开关打开后，查询SQL洞察任务列表。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFullSqlTasksRequest 请求对象
     * @return AsyncInvoker<ListFullSqlTasksRequest, ListFullSqlTasksResponse>
     */
    public AsyncInvoker<ListFullSqlTasksRequest, ListFullSqlTasksResponse> listFullSqlTasksAsyncInvoker(
        ListFullSqlTasksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listFullSqlTasks, hcClient);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return CompletableFuture<ListHealthReportTaskResponse>
     */
    public CompletableFuture<ListHealthReportTaskResponse> listHealthReportTaskAsync(
        ListHealthReportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listHealthReportTask);
    }

    /**
     * 查询实例健康诊断报告列表
     *
     * 查询实例健康诊断报告列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHealthReportTaskRequest 请求对象
     * @return AsyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse>
     */
    public AsyncInvoker<ListHealthReportTaskRequest, ListHealthReportTaskResponse> listHealthReportTaskAsyncInvoker(
        ListHealthReportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listHealthReportTask, hcClient);
    }

    /**
     * 查询历史事务导出任务列表
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryTransactionExportTaskRequest 请求对象
     * @return CompletableFuture<ListHistoryTransactionExportTaskResponse>
     */
    public CompletableFuture<ListHistoryTransactionExportTaskResponse> listHistoryTransactionExportTaskAsync(
        ListHistoryTransactionExportTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listHistoryTransactionExportTask);
    }

    /**
     * 查询历史事务导出任务列表
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryTransactionExportTaskRequest 请求对象
     * @return AsyncInvoker<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse>
     */
    public AsyncInvoker<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse> listHistoryTransactionExportTaskAsyncInvoker(
        ListHistoryTransactionExportTaskRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listHistoryTransactionExportTask, hcClient);
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
     * @return CompletableFuture<ListInnodbLocksResponse>
     */
    public CompletableFuture<ListInnodbLocksResponse> listInnodbLocksAsync(ListInnodbLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInnodbLocks);
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
     * @return AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse>
     */
    public AsyncInvoker<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocksAsyncInvoker(
        ListInnodbLocksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInnodbLocks, hcClient);
    }

    /**
     * 查询巡检报告列表
     *
     * 查询巡检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionReportRequest 请求对象
     * @return CompletableFuture<ListInspectionReportResponse>
     */
    public CompletableFuture<ListInspectionReportResponse> listInspectionReportAsync(
        ListInspectionReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInspectionReport);
    }

    /**
     * 查询巡检报告列表
     *
     * 查询巡检报告列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInspectionReportRequest 请求对象
     * @return AsyncInvoker<ListInspectionReportRequest, ListInspectionReportResponse>
     */
    public AsyncInvoker<ListInspectionReportRequest, ListInspectionReportResponse> listInspectionReportAsyncInvoker(
        ListInspectionReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInspectionReport, hcClient);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return CompletableFuture<ListInstanceDistributionResponse>
     */
    public CompletableFuture<ListInstanceDistributionResponse> listInstanceDistributionAsync(
        ListInstanceDistributionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceDistribution);
    }

    /**
     * 查询实例分布情况
     *
     * 查询实例分布情况
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceDistributionRequest 请求对象
     * @return AsyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse>
     */
    public AsyncInvoker<ListInstanceDistributionRequest, ListInstanceDistributionResponse> listInstanceDistributionAsyncInvoker(
        ListInstanceDistributionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceDistribution, hcClient);
    }

    /**
     * 查询实例组列表
     *
     * 查询实例组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceGroupRequest 请求对象
     * @return CompletableFuture<ListInstanceGroupResponse>
     */
    public CompletableFuture<ListInstanceGroupResponse> listInstanceGroupAsync(ListInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceGroup);
    }

    /**
     * 查询实例组列表
     *
     * 查询实例组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceGroupRequest 请求对象
     * @return AsyncInvoker<ListInstanceGroupRequest, ListInstanceGroupResponse>
     */
    public AsyncInvoker<ListInstanceGroupRequest, ListInstanceGroupResponse> listInstanceGroupAsyncInvoker(
        ListInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceGroup, hcClient);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return CompletableFuture<ListInstanceMultiNodesSingleMetricResponse>
     */
    public CompletableFuture<ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetricAsync(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceMultiNodesSingleMetric);
    }

    /**
     * 获取多节点单指标数据
     *
     * 获取多节点单指标数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceMultiNodesSingleMetricRequest 请求对象
     * @return AsyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse>
     */
    public AsyncInvoker<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetricAsyncInvoker(
        ListInstanceMultiNodesSingleMetricRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceMultiNodesSingleMetric, hcClient);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return CompletableFuture<ListInstanceNodesInfoResponse>
     */
    public CompletableFuture<ListInstanceNodesInfoResponse> listInstanceNodesInfoAsync(
        ListInstanceNodesInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceNodesInfo);
    }

    /**
     * 获取单个实例节点信息
     *
     * 获取单个实例节点信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceNodesInfoRequest 请求对象
     * @return AsyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse>
     */
    public AsyncInvoker<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> listInstanceNodesInfoAsyncInvoker(
        ListInstanceNodesInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceNodesInfo, hcClient);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return CompletableFuture<ListInstanceTopSlowLogResponse>
     */
    public CompletableFuture<ListInstanceTopSlowLogResponse> listInstanceTopSlowLogAsync(
        ListInstanceTopSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listInstanceTopSlowLog);
    }

    /**
     * 查询实例的TOP慢SQL列表
     *
     * 查询实例的TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstanceTopSlowLogRequest 请求对象
     * @return AsyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse>
     */
    public AsyncInvoker<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> listInstanceTopSlowLogAsyncInvoker(
        ListInstanceTopSlowLogRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listInstanceTopSlowLog, hcClient);
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
     * @return CompletableFuture<ListLockBlockingDbResponse>
     */
    public CompletableFuture<ListLockBlockingDbResponse> listLockBlockingDbAsync(ListLockBlockingDbRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listLockBlockingDb);
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
     * @return AsyncInvoker<ListLockBlockingDbRequest, ListLockBlockingDbResponse>
     */
    public AsyncInvoker<ListLockBlockingDbRequest, ListLockBlockingDbResponse> listLockBlockingDbAsyncInvoker(
        ListLockBlockingDbRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listLockBlockingDb, hcClient);
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
     * @return CompletableFuture<ListLockBlockingDetailResponse>
     */
    public CompletableFuture<ListLockBlockingDetailResponse> listLockBlockingDetailAsync(
        ListLockBlockingDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listLockBlockingDetail);
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
     * @return AsyncInvoker<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse>
     */
    public AsyncInvoker<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse> listLockBlockingDetailAsyncInvoker(
        ListLockBlockingDetailRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listLockBlockingDetail, hcClient);
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
     * @return CompletableFuture<ListLockBlockingRelationshipResponse>
     */
    public CompletableFuture<ListLockBlockingRelationshipResponse> listLockBlockingRelationshipAsync(
        ListLockBlockingRelationshipRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listLockBlockingRelationship);
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
     * @return AsyncInvoker<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse>
     */
    public AsyncInvoker<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse> listLockBlockingRelationshipAsyncInvoker(
        ListLockBlockingRelationshipRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listLockBlockingRelationship, hcClient);
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
     * @return CompletableFuture<ListMetadataLocksResponse>
     */
    public CompletableFuture<ListMetadataLocksResponse> listMetadataLocksAsync(ListMetadataLocksRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listMetadataLocks);
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
     * @return AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse>
     */
    public AsyncInvoker<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocksAsyncInvoker(
        ListMetadataLocksRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listMetadataLocks, hcClient);
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
     * @return CompletableFuture<ListProcessesResponse>
     */
    public CompletableFuture<ListProcessesResponse> listProcessesAsync(ListProcessesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listProcesses);
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
     * @return AsyncInvoker<ListProcessesRequest, ListProcessesResponse>
     */
    public AsyncInvoker<ListProcessesRequest, ListProcessesResponse> listProcessesAsyncInvoker(
        ListProcessesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listProcesses, hcClient);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return CompletableFuture<ListRiskItemsResponse>
     */
    public CompletableFuture<ListRiskItemsResponse> listRiskItemsAsync(ListRiskItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listRiskItems);
    }

    /**
     * 查询资源风险实例风险项
     *
     * 查询资源风险实例风险项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskItemsRequest 请求对象
     * @return AsyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse>
     */
    public AsyncInvoker<ListRiskItemsRequest, ListRiskItemsResponse> listRiskItemsAsyncInvoker(
        ListRiskItemsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listRiskItems, hcClient);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return CompletableFuture<ListRiskTrendResponse>
     */
    public CompletableFuture<ListRiskTrendResponse> listRiskTrendAsync(ListRiskTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listRiskTrend);
    }

    /**
     * 查询资源风险实例风险趋势
     *
     * 查询资源风险实例风险趋势
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRiskTrendRequest 请求对象
     * @return AsyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse>
     */
    public AsyncInvoker<ListRiskTrendRequest, ListRiskTrendResponse> listRiskTrendAsyncInvoker(
        ListRiskTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listRiskTrend, hcClient);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return CompletableFuture<ListSnapshotsResponse>
     */
    public CompletableFuture<ListSnapshotsResponse> listSnapshotsAsync(ListSnapshotsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSnapshots);
    }

    /**
     * 查询快照列表
     *
     * 查询快照列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse>
     */
    public AsyncInvoker<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshotsAsyncInvoker(
        ListSnapshotsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSnapshots, hcClient);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return CompletableFuture<ListSpaceAnalysisResponse>
     */
    public CompletableFuture<ListSpaceAnalysisResponse> listSpaceAnalysisAsync(ListSpaceAnalysisRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSpaceAnalysis);
    }

    /**
     * 获取空间分析数据列表
     *
     * 获取空间分析数据列表。实例级别数据来源于文件系统，库级别和表级别数据来源于information_schema.tables表。空间&amp;元数据分析最多分析10000张表，若缺少库表空间数据，可能是因为数据库实例表个数过多或者账号未保存密码。如果为保存密码，请使用用户管理接口或页面录入数据库账号。 支持MySQL、GaussDB(for MySQL)和SQLServer引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpaceAnalysisRequest 请求对象
     * @return AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse>
     */
    public AsyncInvoker<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysisAsyncInvoker(
        ListSpaceAnalysisRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSpaceAnalysis, hcClient);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<ListSqlLimitRulesResponse>
     */
    public CompletableFuture<ListSqlLimitRulesResponse> listSqlLimitRulesAsync(ListSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listSqlLimitRules);
    }

    /**
     * 查询SQL限流规则列表
     *
     * 查询SQL限流规则。目前仅支持MySQL和PostgreSQL数据库。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse>
     */
    public AsyncInvoker<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRulesAsyncInvoker(
        ListSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listSqlLimitRules, hcClient);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return CompletableFuture<ListTopSlowLogResponse>
     */
    public CompletableFuture<ListTopSlowLogResponse> listTopSlowLogAsync(ListTopSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTopSlowLog);
    }

    /**
     * 查询TOP慢SQL列表
     *
     * 查询TOP慢SQL列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTopSlowLogRequest 请求对象
     * @return AsyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse>
     */
    public AsyncInvoker<ListTopSlowLogRequest, ListTopSlowLogResponse> listTopSlowLogAsyncInvoker(
        ListTopSlowLogRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTopSlowLog, hcClient);
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
     * @return CompletableFuture<ListTransactionsResponse>
     */
    public CompletableFuture<ListTransactionsResponse> listTransactionsAsync(ListTransactionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.listTransactions);
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
     * @return AsyncInvoker<ListTransactionsRequest, ListTransactionsResponse>
     */
    public AsyncInvoker<ListTransactionsRequest, ListTransactionsResponse> listTransactionsAsyncInvoker(
        ListTransactionsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.listTransactions, hcClient);
    }

    /**
     * 内置账号登录
     *
     * 内置账号登录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginBuiltInAccountRequest 请求对象
     * @return CompletableFuture<LoginBuiltInAccountResponse>
     */
    public CompletableFuture<LoginBuiltInAccountResponse> loginBuiltInAccountAsync(LoginBuiltInAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.loginBuiltInAccount);
    }

    /**
     * 内置账号登录
     *
     * 内置账号登录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LoginBuiltInAccountRequest 请求对象
     * @return AsyncInvoker<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse>
     */
    public AsyncInvoker<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse> loginBuiltInAccountAsyncInvoker(
        LoginBuiltInAccountRequest request) {
        return new AsyncInvoker<>(request, DasMeta.loginBuiltInAccount, hcClient);
    }

    /**
     * 内置账号登出
     *
     * 内置账号登出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffBuiltInAccountRequest 请求对象
     * @return CompletableFuture<LogoffBuiltInAccountResponse>
     */
    public CompletableFuture<LogoffBuiltInAccountResponse> logoffBuiltInAccountAsync(
        LogoffBuiltInAccountRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.logoffBuiltInAccount);
    }

    /**
     * 内置账号登出
     *
     * 内置账号登出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LogoffBuiltInAccountRequest 请求对象
     * @return AsyncInvoker<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse>
     */
    public AsyncInvoker<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse> logoffBuiltInAccountAsyncInvoker(
        LogoffBuiltInAccountRequest request) {
        return new AsyncInvoker<>(request, DasMeta.logoffBuiltInAccount, hcClient);
    }

    /**
     * 一键分析死锁日志
     *
     * 一键分析死锁日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDeadLockRequest 请求对象
     * @return CompletableFuture<ParseDeadLockResponse>
     */
    public CompletableFuture<ParseDeadLockResponse> parseDeadLockAsync(ParseDeadLockRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.parseDeadLock);
    }

    /**
     * 一键分析死锁日志
     *
     * 一键分析死锁日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseDeadLockRequest 请求对象
     * @return AsyncInvoker<ParseDeadLockRequest, ParseDeadLockResponse>
     */
    public AsyncInvoker<ParseDeadLockRequest, ParseDeadLockResponse> parseDeadLockAsyncInvoker(
        ParseDeadLockRequest request) {
        return new AsyncInvoker<>(request, DasMeta.parseDeadLock, hcClient);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<ParseSqlLimitRulesResponse>
     */
    public CompletableFuture<ParseSqlLimitRulesResponse> parseSqlLimitRulesAsync(ParseSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.parseSqlLimitRules);
    }

    /**
     * 根据原始SQL生成SQL限流关键字
     *
     * 根据原始SQL生成SQL限流关键字，目前支持MySQL、MariaDB、GaussDB(for MySQL)三种引擎。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ParseSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse>
     */
    public AsyncInvoker<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> parseSqlLimitRulesAsyncInvoker(
        ParseSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.parseSqlLimitRules, hcClient);
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
     * @return CompletableFuture<RegisterDbUserResponse>
     */
    public CompletableFuture<RegisterDbUserResponse> registerDbUserAsync(RegisterDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.registerDbUser);
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
     * @return AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse>
     */
    public AsyncInvoker<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUserAsyncInvoker(
        RegisterDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.registerDbUser, hcClient);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialRequest 请求对象
     * @return CompletableFuture<SaveCredentialResponse>
     */
    public CompletableFuture<SaveCredentialResponse> saveCredentialAsync(SaveCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.saveCredential);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialRequest 请求对象
     * @return AsyncInvoker<SaveCredentialRequest, SaveCredentialResponse>
     */
    public AsyncInvoker<SaveCredentialRequest, SaveCredentialResponse> saveCredentialAsyncInvoker(
        SaveCredentialRequest request) {
        return new AsyncInvoker<>(request, DasMeta.saveCredential, hcClient);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialForBatchInspectionRequest 请求对象
     * @return CompletableFuture<SaveCredentialForBatchInspectionResponse>
     */
    public CompletableFuture<SaveCredentialForBatchInspectionResponse> saveCredentialForBatchInspectionAsync(
        SaveCredentialForBatchInspectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.saveCredentialForBatchInspection);
    }

    /**
     * 保存AK/SK
     *
     * 保存AK/SK，用于后台任务访问OBS上传实例诊断报告
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveCredentialForBatchInspectionRequest 请求对象
     * @return AsyncInvoker<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse>
     */
    public AsyncInvoker<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse> saveCredentialForBatchInspectionAsyncInvoker(
        SaveCredentialForBatchInspectionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.saveCredentialForBatchInspection, hcClient);
    }

    /**
     * 设置锁阻塞开关和保存时长
     *
     * 设置锁阻塞开关和保存时长，仅支持SQLServer引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetLockBlockingSwitchRequest 请求对象
     * @return CompletableFuture<SetLockBlockingSwitchResponse>
     */
    public CompletableFuture<SetLockBlockingSwitchResponse> setLockBlockingSwitchAsync(
        SetLockBlockingSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.setLockBlockingSwitch);
    }

    /**
     * 设置锁阻塞开关和保存时长
     *
     * 设置锁阻塞开关和保存时长，仅支持SQLServer引擎
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetLockBlockingSwitchRequest 请求对象
     * @return AsyncInvoker<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse>
     */
    public AsyncInvoker<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse> setLockBlockingSwitchAsyncInvoker(
        SetLockBlockingSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.setLockBlockingSwitch, hcClient);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return CompletableFuture<SetThresholdForMetricResponse>
     */
    public CompletableFuture<SetThresholdForMetricResponse> setThresholdForMetricAsync(
        SetThresholdForMetricRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.setThresholdForMetric);
    }

    /**
     * 设置指标阈值
     *
     * 设置指标阈值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetThresholdForMetricRequest 请求对象
     * @return AsyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse>
     */
    public AsyncInvoker<SetThresholdForMetricRequest, SetThresholdForMetricResponse> setThresholdForMetricAsyncInvoker(
        SetThresholdForMetricRequest request) {
        return new AsyncInvoker<>(request, DasMeta.setThresholdForMetric, hcClient);
    }

    /**
     * 查询会话分析结果
     *
     * 查询会话分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionResultRequest 请求对象
     * @return CompletableFuture<ShowAnalysisSessionResultResponse>
     */
    public CompletableFuture<ShowAnalysisSessionResultResponse> showAnalysisSessionResultAsync(
        ShowAnalysisSessionResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showAnalysisSessionResult);
    }

    /**
     * 查询会话分析结果
     *
     * 查询会话分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionResultRequest 请求对象
     * @return AsyncInvoker<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse>
     */
    public AsyncInvoker<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse> showAnalysisSessionResultAsyncInvoker(
        ShowAnalysisSessionResultRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showAnalysisSessionResult, hcClient);
    }

    /**
     * 查询会话分析状态
     *
     * 查询会话分析状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionStatusRequest 请求对象
     * @return CompletableFuture<ShowAnalysisSessionStatusResponse>
     */
    public CompletableFuture<ShowAnalysisSessionStatusResponse> showAnalysisSessionStatusAsync(
        ShowAnalysisSessionStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showAnalysisSessionStatus);
    }

    /**
     * 查询会话分析状态
     *
     * 查询会话分析状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalysisSessionStatusRequest 请求对象
     * @return AsyncInvoker<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse>
     */
    public AsyncInvoker<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse> showAnalysisSessionStatusAsyncInvoker(
        ShowAnalysisSessionStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showAnalysisSessionStatus, hcClient);
    }

    /**
     * 查询searchpath开关状态
     *
     * 查询searchpath开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddbaGetSearchPathFlagNewRequest 请求对象
     * @return CompletableFuture<ShowClouddbaGetSearchPathFlagNewResponse>
     */
    public CompletableFuture<ShowClouddbaGetSearchPathFlagNewResponse> showClouddbaGetSearchPathFlagNewAsync(
        ShowClouddbaGetSearchPathFlagNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showClouddbaGetSearchPathFlagNew);
    }

    /**
     * 查询searchpath开关状态
     *
     * 查询searchpath开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowClouddbaGetSearchPathFlagNewRequest 请求对象
     * @return AsyncInvoker<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse>
     */
    public AsyncInvoker<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse> showClouddbaGetSearchPathFlagNewAsyncInvoker(
        ShowClouddbaGetSearchPathFlagNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showClouddbaGetSearchPathFlagNew, hcClient);
    }

    /**
     * 查询AK/SK
     *
     * 查询AK/SK。用于判断是否已保存AK/SK
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCredentialRequest 请求对象
     * @return CompletableFuture<ShowCredentialResponse>
     */
    public CompletableFuture<ShowCredentialResponse> showCredentialAsync(ShowCredentialRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showCredential);
    }

    /**
     * 查询AK/SK
     *
     * 查询AK/SK。用于判断是否已保存AK/SK
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCredentialRequest 请求对象
     * @return AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse>
     */
    public AsyncInvoker<ShowCredentialRequest, ShowCredentialResponse> showCredentialAsyncInvoker(
        ShowCredentialRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showCredential, hcClient);
    }

    /**
     * 开通配额询价
     *
     * 开通配额询价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasCloudDbaPriceRequest 请求对象
     * @return CompletableFuture<ShowDasCloudDbaPriceResponse>
     */
    public CompletableFuture<ShowDasCloudDbaPriceResponse> showDasCloudDbaPriceAsync(
        ShowDasCloudDbaPriceRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDasCloudDbaPrice);
    }

    /**
     * 开通配额询价
     *
     * 开通配额询价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasCloudDbaPriceRequest 请求对象
     * @return AsyncInvoker<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse>
     */
    public AsyncInvoker<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse> showDasCloudDbaPriceAsyncInvoker(
        ShowDasCloudDbaPriceRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDasCloudDbaPrice, hcClient);
    }

    /**
     * 自动推荐SQL限流规则
     *
     * 根据条件（包括模板所代表的sql平均时长，条数，最大执行时长，前三者混合）自动推荐SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasRecommendSqlLimitRuleRequest 请求对象
     * @return CompletableFuture<ShowDasRecommendSqlLimitRuleResponse>
     */
    public CompletableFuture<ShowDasRecommendSqlLimitRuleResponse> showDasRecommendSqlLimitRuleAsync(
        ShowDasRecommendSqlLimitRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDasRecommendSqlLimitRule);
    }

    /**
     * 自动推荐SQL限流规则
     *
     * 根据条件（包括模板所代表的sql平均时长，条数，最大执行时长，前三者混合）自动推荐SQL限流规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDasRecommendSqlLimitRuleRequest 请求对象
     * @return AsyncInvoker<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse>
     */
    public AsyncInvoker<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse> showDasRecommendSqlLimitRuleAsyncInvoker(
        ShowDasRecommendSqlLimitRuleRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDasRecommendSqlLimitRule, hcClient);
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
     * @return CompletableFuture<ShowDbUserResponse>
     */
    public CompletableFuture<ShowDbUserResponse> showDbUserAsync(ShowDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDbUser);
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
     * @return AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse>
     */
    public AsyncInvoker<ShowDbUserRequest, ShowDbUserResponse> showDbUserAsyncInvoker(ShowDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDbUser, hcClient);
    }

    /**
     * 查询死锁日志分析结果
     *
     * 查询死锁日志分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockAnalysisResultRequest 请求对象
     * @return CompletableFuture<ShowDeadLockAnalysisResultResponse>
     */
    public CompletableFuture<ShowDeadLockAnalysisResultResponse> showDeadLockAnalysisResultAsync(
        ShowDeadLockAnalysisResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockAnalysisResult);
    }

    /**
     * 查询死锁日志分析结果
     *
     * 查询死锁日志分析结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockAnalysisResultRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse>
     */
    public AsyncInvoker<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse> showDeadLockAnalysisResultAsyncInvoker(
        ShowDeadLockAnalysisResultRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockAnalysisResult, hcClient);
    }

    /**
     * 获取死锁拓扑图数据
     *
     * 获取死锁拓扑图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTopologyRequest 请求对象
     * @return CompletableFuture<ShowDeadLockTopologyResponse>
     */
    public CompletableFuture<ShowDeadLockTopologyResponse> showDeadLockTopologyAsync(
        ShowDeadLockTopologyRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockTopology);
    }

    /**
     * 获取死锁拓扑图数据
     *
     * 获取死锁拓扑图数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockTopologyRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse>
     */
    public AsyncInvoker<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse> showDeadLockTopologyAsyncInvoker(
        ShowDeadLockTopologyRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockTopology, hcClient);
    }

    /**
     * 查看全量SQL导出任务详情
     *
     * 查看全量SQL导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowExportTaskInfoResponse>
     */
    public CompletableFuture<ShowExportTaskInfoResponse> showExportTaskInfoAsync(ShowExportTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showExportTaskInfo);
    }

    /**
     * 查看全量SQL导出任务详情
     *
     * 查看全量SQL导出任务详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowExportTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse>
     */
    public AsyncInvoker<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse> showExportTaskInfoAsyncInvoker(
        ShowExportTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showExportTaskInfo, hcClient);
    }

    /**
     * 获取全量死锁信息
     *
     * 获取全量死锁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockListRequest 请求对象
     * @return CompletableFuture<ShowFullDeadLockListResponse>
     */
    public CompletableFuture<ShowFullDeadLockListResponse> showFullDeadLockListAsync(
        ShowFullDeadLockListRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showFullDeadLockList);
    }

    /**
     * 获取全量死锁信息
     *
     * 获取全量死锁信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockListRequest 请求对象
     * @return AsyncInvoker<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse>
     */
    public AsyncInvoker<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse> showFullDeadLockListAsyncInvoker(
        ShowFullDeadLockListRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showFullDeadLockList, hcClient);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchRequest 请求对象
     * @return CompletableFuture<ShowFullDeadLockSwitchResponse>
     */
    public CompletableFuture<ShowFullDeadLockSwitchResponse> showFullDeadLockSwitchAsync(
        ShowFullDeadLockSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showFullDeadLockSwitch);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchRequest 请求对象
     * @return AsyncInvoker<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse>
     */
    public AsyncInvoker<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse> showFullDeadLockSwitchAsyncInvoker(
        ShowFullDeadLockSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showFullDeadLockSwitch, hcClient);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowFullDeadLockSwitchNewResponse>
     */
    public CompletableFuture<ShowFullDeadLockSwitchNewResponse> showFullDeadLockSwitchNewAsync(
        ShowFullDeadLockSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showFullDeadLockSwitchNew);
    }

    /**
     * 获取全量死锁开关
     *
     * 获取全量死锁开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFullDeadLockSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse>
     */
    public AsyncInvoker<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse> showFullDeadLockSwitchNewAsyncInvoker(
        ShowFullDeadLockSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showFullDeadLockSwitchNew, hcClient);
    }

    /**
     * 获取产品级别的安全协议
     *
     * 获取产品级别的安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalPrivacyNewRequest 请求对象
     * @return CompletableFuture<ShowGlobalPrivacyNewResponse>
     */
    public CompletableFuture<ShowGlobalPrivacyNewResponse> showGlobalPrivacyNewAsync(
        ShowGlobalPrivacyNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showGlobalPrivacyNew);
    }

    /**
     * 获取产品级别的安全协议
     *
     * 获取产品级别的安全协议
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGlobalPrivacyNewRequest 请求对象
     * @return AsyncInvoker<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse>
     */
    public AsyncInvoker<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse> showGlobalPrivacyNewAsyncInvoker(
        ShowGlobalPrivacyNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showGlobalPrivacyNew, hcClient);
    }

    /**
     * 查看实例诊断报告设置
     *
     * 查看实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthReportSettingsRequest 请求对象
     * @return CompletableFuture<ShowHealthReportSettingsResponse>
     */
    public CompletableFuture<ShowHealthReportSettingsResponse> showHealthReportSettingsAsync(
        ShowHealthReportSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showHealthReportSettings);
    }

    /**
     * 查看实例诊断报告设置
     *
     * 查看实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHealthReportSettingsRequest 请求对象
     * @return AsyncInvoker<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse>
     */
    public AsyncInvoker<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse> showHealthReportSettingsAsyncInvoker(
        ShowHealthReportSettingsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showHealthReportSettings, hcClient);
    }

    /**
     * 查询历史事务导出任务详情
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionExportTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowHistoryTransactionExportTaskInfoResponse>
     */
    public CompletableFuture<ShowHistoryTransactionExportTaskInfoResponse> showHistoryTransactionExportTaskInfoAsync(
        ShowHistoryTransactionExportTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showHistoryTransactionExportTaskInfo);
    }

    /**
     * 查询历史事务导出任务详情
     *
     * DAS收集历史事务开关打开后，查询历史事务导出任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionExportTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse>
     */
    public AsyncInvoker<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse> showHistoryTransactionExportTaskInfoAsyncInvoker(
        ShowHistoryTransactionExportTaskInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showHistoryTransactionExportTaskInfo, hcClient);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowHistoryTransactionSwitchNewResponse>
     */
    public CompletableFuture<ShowHistoryTransactionSwitchNewResponse> showHistoryTransactionSwitchNewAsync(
        ShowHistoryTransactionSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showHistoryTransactionSwitchNew);
    }

    /**
     * 查询历史事务开关
     *
     * 查询历史事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTransactionSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse>
     */
    public AsyncInvoker<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse> showHistoryTransactionSwitchNewAsyncInvoker(
        ShowHistoryTransactionSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showHistoryTransactionSwitchNew, hcClient);
    }

    /**
     * 查询索引使用开关
     *
     * 查询索引使用开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndexUsageSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowIndexUsageSwitchNewResponse>
     */
    public CompletableFuture<ShowIndexUsageSwitchNewResponse> showIndexUsageSwitchNewAsync(
        ShowIndexUsageSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showIndexUsageSwitchNew);
    }

    /**
     * 查询索引使用开关
     *
     * 查询索引使用开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIndexUsageSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse>
     */
    public AsyncInvoker<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse> showIndexUsageSwitchNewAsyncInvoker(
        ShowIndexUsageSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showIndexUsageSwitchNew, hcClient);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return CompletableFuture<ShowInstanceHealthReportResponse>
     */
    public CompletableFuture<ShowInstanceHealthReportResponse> showInstanceHealthReportAsync(
        ShowInstanceHealthReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showInstanceHealthReport);
    }

    /**
     * 获取实例健康诊断报告内容
     *
     * 获取实例健康诊断报告内容。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceHealthReportRequest 请求对象
     * @return AsyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse>
     */
    public AsyncInvoker<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> showInstanceHealthReportAsyncInvoker(
        ShowInstanceHealthReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showInstanceHealthReport, hcClient);
    }

    /**
     * 查询自治限流开关
     *
     * 查询自治限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskSwitchRequest 请求对象
     * @return CompletableFuture<ShowKillProcessTaskSwitchResponse>
     */
    public CompletableFuture<ShowKillProcessTaskSwitchResponse> showKillProcessTaskSwitchAsync(
        ShowKillProcessTaskSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showKillProcessTaskSwitch);
    }

    /**
     * 查询自治限流开关
     *
     * 查询自治限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowKillProcessTaskSwitchRequest 请求对象
     * @return AsyncInvoker<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse>
     */
    public AsyncInvoker<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse> showKillProcessTaskSwitchAsyncInvoker(
        ShowKillProcessTaskSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showKillProcessTaskSwitch, hcClient);
    }

    /**
     * 获取死锁的快照信息
     *
     * 获取死锁的快照信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshotRequest 请求对象
     * @return CompletableFuture<ShowLatestDeadLockSnapshotResponse>
     */
    public CompletableFuture<ShowLatestDeadLockSnapshotResponse> showLatestDeadLockSnapshotAsync(
        ShowLatestDeadLockSnapshotRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLatestDeadLockSnapshot);
    }

    /**
     * 获取死锁的快照信息
     *
     * 获取死锁的快照信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestDeadLockSnapshotRequest 请求对象
     * @return AsyncInvoker<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse>
     */
    public AsyncInvoker<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse> showLatestDeadLockSnapshotAsyncInvoker(
        ShowLatestDeadLockSnapshotRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLatestDeadLockSnapshot, hcClient);
    }

    /**
     * 获取最新的数据库健康日报内容
     *
     * 获取最新的数据库健康日报内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestInstanceHealthReportRequest 请求对象
     * @return CompletableFuture<ShowLatestInstanceHealthReportResponse>
     */
    public CompletableFuture<ShowLatestInstanceHealthReportResponse> showLatestInstanceHealthReportAsync(
        ShowLatestInstanceHealthReportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLatestInstanceHealthReport);
    }

    /**
     * 获取最新的数据库健康日报内容
     *
     * 获取最新的数据库健康日报内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLatestInstanceHealthReportRequest 请求对象
     * @return AsyncInvoker<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse>
     */
    public AsyncInvoker<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse> showLatestInstanceHealthReportAsyncInvoker(
        ShowLatestInstanceHealthReportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLatestInstanceHealthReport, hcClient);
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
     * @return CompletableFuture<ShowLockBlockingStatisticsResponse>
     */
    public CompletableFuture<ShowLockBlockingStatisticsResponse> showLockBlockingStatisticsAsync(
        ShowLockBlockingStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLockBlockingStatistics);
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
     * @return AsyncInvoker<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse>
     */
    public AsyncInvoker<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse> showLockBlockingStatisticsAsyncInvoker(
        ShowLockBlockingStatisticsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLockBlockingStatistics, hcClient);
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
     * @return CompletableFuture<ShowLockBlockingSwitchResponse>
     */
    public CompletableFuture<ShowLockBlockingSwitchResponse> showLockBlockingSwitchAsync(
        ShowLockBlockingSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLockBlockingSwitch);
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
     * @return AsyncInvoker<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse>
     */
    public AsyncInvoker<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse> showLockBlockingSwitchAsyncInvoker(
        ShowLockBlockingSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLockBlockingSwitch, hcClient);
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
     * @return CompletableFuture<ShowLockBlockingTrendResponse>
     */
    public CompletableFuture<ShowLockBlockingTrendResponse> showLockBlockingTrendAsync(
        ShowLockBlockingTrendRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLockBlockingTrend);
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
     * @return AsyncInvoker<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse>
     */
    public AsyncInvoker<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse> showLockBlockingTrendAsyncInvoker(
        ShowLockBlockingTrendRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLockBlockingTrend, hcClient);
    }

    /**
     * 查询长事务开关
     *
     * 查询长事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLongHistoryTransactionSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowLongHistoryTransactionSwitchNewResponse>
     */
    public CompletableFuture<ShowLongHistoryTransactionSwitchNewResponse> showLongHistoryTransactionSwitchNewAsync(
        ShowLongHistoryTransactionSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showLongHistoryTransactionSwitchNew);
    }

    /**
     * 查询长事务开关
     *
     * 查询长事务开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLongHistoryTransactionSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse>
     */
    public AsyncInvoker<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse> showLongHistoryTransactionSwitchNewAsyncInvoker(
        ShowLongHistoryTransactionSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showLongHistoryTransactionSwitchNew, hcClient);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return CompletableFuture<ShowMetricNamesSupportResponse>
     */
    public CompletableFuture<ShowMetricNamesSupportResponse> showMetricNamesSupportAsync(
        ShowMetricNamesSupportRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showMetricNamesSupport);
    }

    /**
     * 多节点单指标支持指标信息
     *
     * 多节点单指标支持指标信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMetricNamesSupportRequest 请求对象
     * @return AsyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse>
     */
    public AsyncInvoker<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> showMetricNamesSupportAsyncInvoker(
        ShowMetricNamesSupportRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showMetricNamesSupport, hcClient);
    }

    /**
     * 查看库名列表
     *
     * 查看库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameListRequest 请求对象
     * @return CompletableFuture<ShowNameListResponse>
     */
    public CompletableFuture<ShowNameListResponse> showNameListAsync(ShowNameListRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showNameList);
    }

    /**
     * 查看库名列表
     *
     * 查看库名列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNameListRequest 请求对象
     * @return AsyncInvoker<ShowNameListRequest, ShowNameListResponse>
     */
    public AsyncInvoker<ShowNameListRequest, ShowNameListResponse> showNameListAsyncInvoker(
        ShowNameListRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showNameList, hcClient);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showQuotas);
    }

    /**
     * 查询云DBA配额
     *
     * 查询云DBA配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showQuotas, hcClient);
    }

    /**
     * 查询慢日志开关
     *
     * 查询慢日志开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowSlowLogSwitchNewResponse>
     */
    public CompletableFuture<ShowSlowLogSwitchNewResponse> showSlowLogSwitchNewAsync(
        ShowSlowLogSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSlowLogSwitchNew);
    }

    /**
     * 查询慢日志开关
     *
     * 查询慢日志开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSlowLogSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse>
     */
    public AsyncInvoker<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse> showSlowLogSwitchNewAsyncInvoker(
        ShowSlowLogSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSlowLogSwitchNew, hcClient);
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
     * @return CompletableFuture<ShowSqlExecutionPlanResponse>
     */
    public CompletableFuture<ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsync(
        ShowSqlExecutionPlanRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlExecutionPlan);
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
     * @return AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse>
     */
    public AsyncInvoker<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlanAsyncInvoker(
        ShowSqlExecutionPlanRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlExecutionPlan, hcClient);
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
     * @return CompletableFuture<ShowSqlExplainResponse>
     */
    public CompletableFuture<ShowSqlExplainResponse> showSqlExplainAsync(ShowSqlExplainRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlExplain);
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
     * @return AsyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse>
     */
    public AsyncInvoker<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplainAsyncInvoker(
        ShowSqlExplainRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlExplain, hcClient);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return CompletableFuture<ShowSqlLimitJobInfoResponse>
     */
    public CompletableFuture<ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoAsync(ShowSqlLimitJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlLimitJobInfo);
    }

    /**
     * 查询SQL限流任务
     *
     * 查询指定ID的SQL限流任务信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse>
     */
    public AsyncInvoker<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfoAsyncInvoker(
        ShowSqlLimitJobInfoRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlLimitJobInfo, hcClient);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowSqlLimitSwitchStatusResponse>
     */
    public CompletableFuture<ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusAsync(
        ShowSqlLimitSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlLimitSwitchStatus);
    }

    /**
     * 查看SQL限流开关状态
     *
     * 查询SQL限流的开关状态。目前仅支持MySQL实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse>
     */
    public AsyncInvoker<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatusAsyncInvoker(
        ShowSqlLimitSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlLimitSwitchStatus, hcClient);
    }

    /**
     * 查询SQL限流开关
     *
     * 查询SQL限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitingSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowSqlLimitingSwitchNewResponse>
     */
    public CompletableFuture<ShowSqlLimitingSwitchNewResponse> showSqlLimitingSwitchNewAsync(
        ShowSqlLimitingSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlLimitingSwitchNew);
    }

    /**
     * 查询SQL限流开关
     *
     * 查询SQL限流开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlLimitingSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse>
     */
    public AsyncInvoker<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse> showSqlLimitingSwitchNewAsyncInvoker(
        ShowSqlLimitingSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlLimitingSwitchNew, hcClient);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return CompletableFuture<ShowSqlSwitchStatusResponse>
     */
    public CompletableFuture<ShowSqlSwitchStatusResponse> showSqlSwitchStatusAsync(ShowSqlSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSqlSwitchStatus);
    }

    /**
     * 查询全量SQL和慢SQL的开关状态
     *
     * 查询DAS收集全量SQL和慢SQL的开关状态。该功能仅支持付费实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSqlSwitchStatusRequest 请求对象
     * @return AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse>
     */
    public AsyncInvoker<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatusAsyncInvoker(
        ShowSqlSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSqlSwitchStatus, hcClient);
    }

    /**
     * 查看支持的引擎类型
     *
     * 查看支持的引擎类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportedEnginesRequest 请求对象
     * @return CompletableFuture<ShowSupportedEnginesResponse>
     */
    public CompletableFuture<ShowSupportedEnginesResponse> showSupportedEnginesAsync(
        ShowSupportedEnginesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showSupportedEngines);
    }

    /**
     * 查看支持的引擎类型
     *
     * 查看支持的引擎类型
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSupportedEnginesRequest 请求对象
     * @return AsyncInvoker<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse>
     */
    public AsyncInvoker<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse> showSupportedEnginesAsyncInvoker(
        ShowSupportedEnginesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showSupportedEngines, hcClient);
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
     * @return CompletableFuture<ShowTransactionSwitchStatusResponse>
     */
    public CompletableFuture<ShowTransactionSwitchStatusResponse> showTransactionSwitchStatusAsync(
        ShowTransactionSwitchStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showTransactionSwitchStatus);
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
     * @return AsyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse>
     */
    public AsyncInvoker<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> showTransactionSwitchStatusAsyncInvoker(
        ShowTransactionSwitchStatusRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showTransactionSwitchStatus, hcClient);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return CompletableFuture<ShowTuningResponse>
     */
    public CompletableFuture<ShowTuningResponse> showTuningAsync(ShowTuningRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showTuning);
    }

    /**
     * 获取诊断结果
     *
     * 获取诊断结果
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTuningRequest 请求对象
     * @return AsyncInvoker<ShowTuningRequest, ShowTuningResponse>
     */
    public AsyncInvoker<ShowTuningRequest, ShowTuningResponse> showTuningAsyncInvoker(ShowTuningRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showTuning, hcClient);
    }

    /**
     * 判断该实例能否使用云DBA功能
     *
     * 判断该实例能否使用云DBA功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhetherUseCloudDbaRequest 请求对象
     * @return CompletableFuture<ShowWhetherUseCloudDbaResponse>
     */
    public CompletableFuture<ShowWhetherUseCloudDbaResponse> showWhetherUseCloudDbaAsync(
        ShowWhetherUseCloudDbaRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showWhetherUseCloudDba);
    }

    /**
     * 判断该实例能否使用云DBA功能
     *
     * 判断该实例能否使用云DBA功能
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWhetherUseCloudDbaRequest 请求对象
     * @return AsyncInvoker<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse>
     */
    public AsyncInvoker<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse> showWhetherUseCloudDbaAsyncInvoker(
        ShowWhetherUseCloudDbaRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showWhetherUseCloudDba, hcClient);
    }

    /**
     * 开始会话分析
     *
     * 开始会话分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAnalysisSessionRequest 请求对象
     * @return CompletableFuture<StartAnalysisSessionResponse>
     */
    public CompletableFuture<StartAnalysisSessionResponse> startAnalysisSessionAsync(
        StartAnalysisSessionRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.startAnalysisSession);
    }

    /**
     * 开始会话分析
     *
     * 开始会话分析
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartAnalysisSessionRequest 请求对象
     * @return AsyncInvoker<StartAnalysisSessionRequest, StartAnalysisSessionResponse>
     */
    public AsyncInvoker<StartAnalysisSessionRequest, StartAnalysisSessionResponse> startAnalysisSessionAsyncInvoker(
        StartAnalysisSessionRequest request) {
        return new AsyncInvoker<>(request, DasMeta.startAnalysisSession, hcClient);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return CompletableFuture<SynchronizeInstancesResponse>
     */
    public CompletableFuture<SynchronizeInstancesResponse> synchronizeInstancesAsync(
        SynchronizeInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.synchronizeInstances);
    }

    /**
     * 同步实例列表
     *
     * 同步实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SynchronizeInstancesRequest 请求对象
     * @return AsyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse>
     */
    public AsyncInvoker<SynchronizeInstancesRequest, SynchronizeInstancesResponse> synchronizeInstancesAsyncInvoker(
        SynchronizeInstancesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.synchronizeInstances, hcClient);
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
     * @return CompletableFuture<UpdateDbUserResponse>
     */
    public CompletableFuture<UpdateDbUserResponse> updateDbUserAsync(UpdateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateDbUser);
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
     * @return AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse>
     */
    public AsyncInvoker<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUserAsyncInvoker(
        UpdateDbUserRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateDbUser, hcClient);
    }

    /**
     * 修改邮件模板
     *
     * 修改邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEmailTemplateRequest 请求对象
     * @return CompletableFuture<UpdateEmailTemplateResponse>
     */
    public CompletableFuture<UpdateEmailTemplateResponse> updateEmailTemplateAsync(UpdateEmailTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateEmailTemplate);
    }

    /**
     * 修改邮件模板
     *
     * 修改邮件模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEmailTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse>
     */
    public AsyncInvoker<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse> updateEmailTemplateAsyncInvoker(
        UpdateEmailTemplateRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateEmailTemplate, hcClient);
    }

    /**
     * 全量SQL开关
     *
     * 全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFullSqlSwitchRequest 请求对象
     * @return CompletableFuture<UpdateFullSqlSwitchResponse>
     */
    public CompletableFuture<UpdateFullSqlSwitchResponse> updateFullSqlSwitchAsync(UpdateFullSqlSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateFullSqlSwitch);
    }

    /**
     * 全量SQL开关
     *
     * 全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFullSqlSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse>
     */
    public AsyncInvoker<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse> updateFullSqlSwitchAsyncInvoker(
        UpdateFullSqlSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateFullSqlSwitch, hcClient);
    }

    /**
     * 更新实例诊断报告设置
     *
     * 更新实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthReportSettingsRequest 请求对象
     * @return CompletableFuture<UpdateHealthReportSettingsResponse>
     */
    public CompletableFuture<UpdateHealthReportSettingsResponse> updateHealthReportSettingsAsync(
        UpdateHealthReportSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateHealthReportSettings);
    }

    /**
     * 更新实例诊断报告设置
     *
     * 更新实例诊断报告设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHealthReportSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse>
     */
    public AsyncInvoker<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse> updateHealthReportSettingsAsyncInvoker(
        UpdateHealthReportSettingsRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateHealthReportSettings, hcClient);
    }

    /**
     * 修改实例组
     *
     * 修改实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return CompletableFuture<UpdateInstanceGroupResponse>
     */
    public CompletableFuture<UpdateInstanceGroupResponse> updateInstanceGroupAsync(UpdateInstanceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateInstanceGroup);
    }

    /**
     * 修改实例组
     *
     * 修改实例组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse>
     */
    public AsyncInvoker<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> updateInstanceGroupAsyncInvoker(
        UpdateInstanceGroupRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateInstanceGroup, hcClient);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return CompletableFuture<UpdateSqlLimitRulesResponse>
     */
    public CompletableFuture<UpdateSqlLimitRulesResponse> updateSqlLimitRulesAsync(UpdateSqlLimitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.updateSqlLimitRules);
    }

    /**
     * 修改SQL限流规则
     *
     * 修改SQL限流规则。目前仅支持PostgreSQL数据库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSqlLimitRulesRequest 请求对象
     * @return AsyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse>
     */
    public AsyncInvoker<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> updateSqlLimitRulesAsyncInvoker(
        UpdateSqlLimitRulesRequest request) {
        return new AsyncInvoker<>(request, DasMeta.updateSqlLimitRules, hcClient);
    }

    /**
     * 查询死锁开关状态
     *
     * 查询死锁开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockSwitchNewRequest 请求对象
     * @return CompletableFuture<ShowDeadLockSwitchNewResponse>
     */
    public CompletableFuture<ShowDeadLockSwitchNewResponse> showDeadLockSwitchNewAsync(
        ShowDeadLockSwitchNewRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.showDeadLockSwitchNew);
    }

    /**
     * 查询死锁开关状态
     *
     * 查询死锁开关状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeadLockSwitchNewRequest 请求对象
     * @return AsyncInvoker<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse>
     */
    public AsyncInvoker<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse> showDeadLockSwitchNewAsyncInvoker(
        ShowDeadLockSwitchNewRequest request) {
        return new AsyncInvoker<>(request, DasMeta.showDeadLockSwitchNew, hcClient);
    }

    /**
     * 开启/关闭全量SQL开关
     *
     * 开启/关闭全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFullsqlSwitchRequest 请求对象
     * @return CompletableFuture<SwitchFullsqlSwitchResponse>
     */
    public CompletableFuture<SwitchFullsqlSwitchResponse> switchFullsqlSwitchAsync(SwitchFullsqlSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, DasMeta.switchFullsqlSwitch);
    }

    /**
     * 开启/关闭全量SQL开关
     *
     * 开启/关闭全量SQL开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchFullsqlSwitchRequest 请求对象
     * @return AsyncInvoker<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse>
     */
    public AsyncInvoker<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse> switchFullsqlSwitchAsyncInvoker(
        SwitchFullsqlSwitchRequest request) {
        return new AsyncInvoker<>(request, DasMeta.switchFullsqlSwitch, hcClient);
    }

}

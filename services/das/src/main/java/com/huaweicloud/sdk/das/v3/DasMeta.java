package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateRequestBody;
import com.huaweicloud.sdk.das.v3.model.AddEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskBody;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskRequest;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskResponse;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupRequestBody;
import com.huaweicloud.sdk.das.v3.model.AddInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupRequest;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupRequestBody;
import com.huaweicloud.sdk.das.v3.model.AddInstanceToGroupResponse;
import com.huaweicloud.sdk.das.v3.model.AddSqlLimitingRecordNewRequest;
import com.huaweicloud.sdk.das.v3.model.AddSqlLimitingRecordNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.AddSqlLimitingRecordNewResponse;
import com.huaweicloud.sdk.das.v3.model.AddTasksNewRequest;
import com.huaweicloud.sdk.das.v3.model.AddTasksNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.AddTasksNewResponse;
import com.huaweicloud.sdk.das.v3.model.ApiSetMetricCodeThresholdReq;
import com.huaweicloud.sdk.das.v3.model.BatchAddFullSqlTasksRequest;
import com.huaweicloud.sdk.das.v3.model.BatchAddFullSqlTasksRequestBody;
import com.huaweicloud.sdk.das.v3.model.BatchAddFullSqlTasksResponse;
import com.huaweicloud.sdk.das.v3.model.BatchDeleteConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.BatchDeleteConnectionNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.BatchDeleteConnectionNewResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailRequestBody;
import com.huaweicloud.sdk.das.v3.model.BatchSendEmailResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSetSqlSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSetSqlSwitchNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.BatchSetSqlSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportRequest;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportRequestBody;
import com.huaweicloud.sdk.das.v3.model.BatchSubscribeReportResponse;
import com.huaweicloud.sdk.das.v3.model.CancelConnectionProcessRequest;
import com.huaweicloud.sdk.das.v3.model.CancelConnectionProcessRequestBody;
import com.huaweicloud.sdk.das.v3.model.CancelConnectionProcessResponse;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequestBody;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.CancelShareNewRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.CancelShareNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeBody;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeDeadLockSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeDeadLockSwitchNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.ChangeDeadLockSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchRequestBody;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangePaymentModeForConsoleBody;
import com.huaweicloud.sdk.das.v3.model.ChangePaymentModeNewRequest;
import com.huaweicloud.sdk.das.v3.model.ChangePaymentModeNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeQuotaNewRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeQuotaNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.ChangeQuotaNewResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusBody;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchBody;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialForBatchInspectionRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialForBatchInspectionResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialRequestBody;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.CheckHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CheckHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateBinlogTaskRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateDbsConnectionRequest;
import com.huaweicloud.sdk.das.v3.model.CreateDbsConnectionRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateDbsConnectionResponse;
import com.huaweicloud.sdk.das.v3.model.CreateExportTaskReq;
import com.huaweicloud.sdk.das.v3.model.CreateExportTaskResp;
import com.huaweicloud.sdk.das.v3.model.CreateFullSqlBucketRequest;
import com.huaweicloud.sdk.das.v3.model.CreateFullSqlBucketRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateFullSqlBucketResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportReq;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateIndexUsageExportTaskNewRequest;
import com.huaweicloud.sdk.das.v3.model.CreateIndexUsageExportTaskNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateIndexUsageExportTaskNewResponse;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionReq;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionRequest;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionResponse;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceHealthReportTaskNewRequest;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceHealthReportTaskNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceHealthReportTaskNewResponse;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateSnapshotsResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskBody;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSpaceAnalysisTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.CreateSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.CreateTuningReq;
import com.huaweicloud.sdk.das.v3.model.CreateTuningRequest;
import com.huaweicloud.sdk.das.v3.model.CreateTuningResponse;
import com.huaweicloud.sdk.das.v3.model.CreateWdrReportRequest;
import com.huaweicloud.sdk.das.v3.model.CreateWdrReportRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateWdrReportResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteDbObjNewRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbObjNewResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateRequestBody;
import com.huaweicloud.sdk.das.v3.model.DeleteEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteExportTaskNewRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteExportTaskNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.DeleteExportTaskNewResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteFullSqlExportTaskObsFileRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteFullSqlExportTaskObsFileRequestBody;
import com.huaweicloud.sdk.das.v3.model.DeleteFullSqlExportTaskObsFileResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupRequestBody;
import com.huaweicloud.sdk.das.v3.model.DeleteInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessReqBody;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.EnableQuotaRequest;
import com.huaweicloud.sdk.das.v3.model.EnableQuotaRequestBody;
import com.huaweicloud.sdk.das.v3.model.EnableQuotaResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteFormatSqlRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteFormatSqlRequestBody;
import com.huaweicloud.sdk.das.v3.model.ExecuteFormatSqlResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteImportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteImportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteLoginConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteLoginConnectionNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.ExecuteLoginConnectionNewResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteSplitSqlRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteSplitSqlRequestBody;
import com.huaweicloud.sdk.das.v3.model.ExecuteSplitSqlResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteTestConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteTestConnectionNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.ExecuteTestConnectionNewResponse;
import com.huaweicloud.sdk.das.v3.model.ExecuteTuningRequest;
import com.huaweicloud.sdk.das.v3.model.ExecuteTuningRequestBody;
import com.huaweicloud.sdk.das.v3.model.ExecuteTuningResponse;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportInstanceListNewRequest;
import com.huaweicloud.sdk.das.v3.model.ExportInstanceListNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.ExportInstanceListNewResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowQueryLogsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowQueryLogsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlStatisticsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportSlowSqlStatisticsRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.InvokeWdrReportRequestBody;
import com.huaweicloud.sdk.das.v3.model.InvokeWdrReportResponse;
import com.huaweicloud.sdk.das.v3.model.ListAllTypeInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ListAllTypeInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageRequest;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageRequestBody;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageResponse;
import com.huaweicloud.sdk.das.v3.model.ListBinlogExportsRequest;
import com.huaweicloud.sdk.das.v3.model.ListBinlogExportsResponse;
import com.huaweicloud.sdk.das.v3.model.ListBinlogFilesRequest;
import com.huaweicloud.sdk.das.v3.model.ListBinlogFilesRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetric;
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
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitUserInstanceRequestBody;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitUserInstanceResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateComparisonsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateComparisonsRequestBody;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateComparisonsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateDatabasesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplateDatabasesResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplatesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplatesRequestBody;
import com.huaweicloud.sdk.das.v3.model.ListSqlTemplatesResponse;
import com.huaweicloud.sdk.das.v3.model.ListTasksByBatchIdRequest;
import com.huaweicloud.sdk.das.v3.model.ListTasksByBatchIdResponse;
import com.huaweicloud.sdk.das.v3.model.ListTasksBySqlTemplateIdRequest;
import com.huaweicloud.sdk.das.v3.model.ListTasksBySqlTemplateIdRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.ListUserInstanceListRequestBody;
import com.huaweicloud.sdk.das.v3.model.ListUserInstanceListResponse;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountRequestBody;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountRequestBody;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.ParseDeadLockRequest;
import com.huaweicloud.sdk.das.v3.model.ParseDeadLockRequestBody;
import com.huaweicloud.sdk.das.v3.model.ParseDeadLockResponse;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesReq;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.QuerySqlPlanBody;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequestBody;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.RetryBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.RetryBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialForBatchInspectionRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialForBatchInspectionResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialRequestBody;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.SearchBinlogParseRequest;
import com.huaweicloud.sdk.das.v3.model.SearchBinlogParseRequestBody;
import com.huaweicloud.sdk.das.v3.model.SearchBinlogParseResponse;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfo4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfo4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfoSource4ApiRequest;
import com.huaweicloud.sdk.das.v3.model.SearchErrorInfoSource4ApiResponse;
import com.huaweicloud.sdk.das.v3.model.SearchNewRequest;
import com.huaweicloud.sdk.das.v3.model.SearchNewResponse;
import com.huaweicloud.sdk.das.v3.model.SetLockBlockingSwitchReq;
import com.huaweicloud.sdk.das.v3.model.SetLockBlockingSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.SetLockBlockingSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.SetSqlSwitchNewRequest;
import com.huaweicloud.sdk.das.v3.model.SetSqlSwitchNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.SetSqlSwitchNewResponse;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricRequest;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionResultRequest;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionResultResp;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionResultResponse;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowAnalysisSessionStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogExportTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogExportTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogParseRequest;
import com.huaweicloud.sdk.das.v3.model.ShowBinlogParseRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyNoRetryRequestBody;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyNoRetryResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExecuteResultWithoutKeyResponse;
import com.huaweicloud.sdk.das.v3.model.ShowExecutionPlanRequest;
import com.huaweicloud.sdk.das.v3.model.ShowExecutionPlanRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.ShowInstanceMetricRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.ShowRecommendSqlLimitRuleRequestBody;
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
import com.huaweicloud.sdk.das.v3.model.ShowTuningResultRequestBody;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResultResponse;
import com.huaweicloud.sdk.das.v3.model.ShowWaitingLocksSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowWaitingLocksSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowWdrSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowWdrSnapshotRequestBody;
import com.huaweicloud.sdk.das.v3.model.ShowWdrSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowWhetherUseCloudDbaRequest;
import com.huaweicloud.sdk.das.v3.model.ShowWhetherUseCloudDbaResponse;
import com.huaweicloud.sdk.das.v3.model.SignProtocolNewRequest;
import com.huaweicloud.sdk.das.v3.model.SignProtocolNewResponse;
import com.huaweicloud.sdk.das.v3.model.StartAnalysisSessionRequest;
import com.huaweicloud.sdk.das.v3.model.StartAnalysisSessionRequestBody;
import com.huaweicloud.sdk.das.v3.model.StartAnalysisSessionResponse;
import com.huaweicloud.sdk.das.v3.model.StopBinlogTaskRequest;
import com.huaweicloud.sdk.das.v3.model.StopBinlogTaskRequestBody;
import com.huaweicloud.sdk.das.v3.model.StopBinlogTaskResponse;
import com.huaweicloud.sdk.das.v3.model.SubscribeInstanceReportNewRequest;
import com.huaweicloud.sdk.das.v3.model.SubscribeInstanceReportNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.SubscribeInstanceReportNewResponse;
import com.huaweicloud.sdk.das.v3.model.SwitchFullsqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.SwitchFullsqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstanceListNewRequest;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstanceListNewResponse;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesReq;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.TransactionSwitchReq;
import com.huaweicloud.sdk.das.v3.model.UnsubscribeInstanceReportNewRequest;
import com.huaweicloud.sdk.das.v3.model.UnsubscribeInstanceReportNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.UnsubscribeInstanceReportNewResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateEmailTemplateResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateFullSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateFullSqlSwitchRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateFullSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceConfigRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceConfigRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceConfigResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateInstanceGroupResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSearchPathFlagRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSearchPathFlagRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateSearchPathFlagResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSharedInfoNewRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSharedInfoNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateSharedInfoNewResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.VerifyConnectionNewRequest;
import com.huaweicloud.sdk.das.v3.model.VerifyConnectionNewRequestBody;
import com.huaweicloud.sdk.das.v3.model.VerifyConnectionNewResponse;

import java.math.BigDecimal;
import java.util.List;

@SuppressWarnings("unchecked")
public class DasMeta {

    public static final HttpRequestDef<CancelShareConnectionsRequest, CancelShareConnectionsResponse> cancelShareConnections =
        genForCancelShareConnections();

    private static HttpRequestDef<CancelShareConnectionsRequest, CancelShareConnectionsResponse> genForCancelShareConnections() {
        // basic
        HttpRequestDef.Builder<CancelShareConnectionsRequest, CancelShareConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CancelShareConnectionsRequest.class, CancelShareConnectionsResponse.class)
            .withName("CancelShareConnections")
            .withUri("/v3/{project_id}/connections/share")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelShareConnectionsRequest::getXLanguage,
                CancelShareConnectionsRequest::setXLanguage));
        builder.<CancelShareConnectionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelShareConnectionsRequestBody.class),
            f -> f.withMarshaller(CancelShareConnectionsRequest::getBody, CancelShareConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse> createInstanceConnection =
        genForCreateInstanceConnection();

    private static HttpRequestDef<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse> genForCreateInstanceConnection() {
        // basic
        HttpRequestDef.Builder<CreateInstanceConnectionRequest, CreateInstanceConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateInstanceConnectionRequest.class, CreateInstanceConnectionResponse.class)
                .withName("CreateInstanceConnection")
                .withUri("/v3/{project_id}/instances/{instance_id}/create-connection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceConnectionRequest::getInstanceId,
                CreateInstanceConnectionRequest::setInstanceId));
        builder.<CreateInstanceConnectionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateInstanceConnectionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateInstanceConnectionRequest::getXLanguage,
                CreateInstanceConnectionRequest::setXLanguage));
        builder.<CreateInstanceConnectionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceConnectionReq.class),
            f -> f.withMarshaller(CreateInstanceConnectionRequest::getBody, CreateInstanceConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateShareConnectionsRequest, CreateShareConnectionsResponse> createShareConnections =
        genForCreateShareConnections();

    private static HttpRequestDef<CreateShareConnectionsRequest, CreateShareConnectionsResponse> genForCreateShareConnections() {
        // basic
        HttpRequestDef.Builder<CreateShareConnectionsRequest, CreateShareConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateShareConnectionsRequest.class, CreateShareConnectionsResponse.class)
            .withName("CreateShareConnections")
            .withUri("/v3/{project_id}/connections/share")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateShareConnectionsRequest::getXLanguage,
                CreateShareConnectionsRequest::setXLanguage));
        builder.<CreateShareConnectionsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateShareConnectionsRequestBody.class),
            f -> f.withMarshaller(CreateShareConnectionsRequest::getBody, CreateShareConnectionsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteExportTaskRequest, ExecuteExportTaskResponse> executeExportTask =
        genForExecuteExportTask();

    private static HttpRequestDef<ExecuteExportTaskRequest, ExecuteExportTaskResponse> genForExecuteExportTask() {
        // basic
        HttpRequestDef.Builder<ExecuteExportTaskRequest, ExecuteExportTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteExportTaskRequest.class, ExecuteExportTaskResponse.class)
                .withName("ExecuteExportTask")
                .withUri("/v3/{project_id}/connections/{connection_id}/export-tasks/{job_id}/execute")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteExportTaskRequest::getConnectionId,
                ExecuteExportTaskRequest::setConnectionId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteExportTaskRequest::getJobId, ExecuteExportTaskRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteExportTaskRequest::getXLanguage, ExecuteExportTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteImportTaskRequest, ExecuteImportTaskResponse> executeImportTask =
        genForExecuteImportTask();

    private static HttpRequestDef<ExecuteImportTaskRequest, ExecuteImportTaskResponse> genForExecuteImportTask() {
        // basic
        HttpRequestDef.Builder<ExecuteImportTaskRequest, ExecuteImportTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteImportTaskRequest.class, ExecuteImportTaskResponse.class)
                .withName("ExecuteImportTask")
                .withUri("/v3/{project_id}/connections/{connection_id}/import-tasks/{job_id}/execute")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteImportTaskRequest::getConnectionId,
                ExecuteImportTaskRequest::setConnectionId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteImportTaskRequest::getJobId, ExecuteImportTaskRequest::setJobId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteImportTaskRequest::getXLanguage, ExecuteImportTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> listConnections =
        genForListConnections();

    private static HttpRequestDef<ListConnectionsRequest, ListConnectionsResponse> genForListConnections() {
        // basic
        HttpRequestDef.Builder<ListConnectionsRequest, ListConnectionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConnectionsRequest.class, ListConnectionsResponse.class)
                .withName("ListConnections")
                .withUri("/v3/{project_id}/list-connections")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("condition",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getCondition, ListConnectionsRequest::setCondition));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getOffset, ListConnectionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConnectionsRequest::getLimit, ListConnectionsRequest::setLimit));
        builder.<ListConnectionsRequest.NetworkTypeEnum>withRequestField("network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConnectionsRequest.NetworkTypeEnum.class),
            f -> f.withMarshaller(ListConnectionsRequest::getNetworkType, ListConnectionsRequest::setNetworkType));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getDatastoreType, ListConnectionsRequest::setDatastoreType));
        builder.<ListConnectionsRequest.ConnectionTypeEnum>withRequestField("connection_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConnectionsRequest.ConnectionTypeEnum.class),
            f -> f.withMarshaller(ListConnectionsRequest::getConnectionType,
                ListConnectionsRequest::setConnectionType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionsRequest::getInstanceId, ListConnectionsRequest::setInstanceId));
        builder.<ListConnectionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListConnectionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListConnectionsRequest::getXLanguage, ListConnectionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/das")
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
                .withUri("/das/{version}")
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

    public static final HttpRequestDef<AddTasksNewRequest, AddTasksNewResponse> addTasksNew = genForAddTasksNew();

    private static HttpRequestDef<AddTasksNewRequest, AddTasksNewResponse> genForAddTasksNew() {
        // basic
        HttpRequestDef.Builder<AddTasksNewRequest, AddTasksNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddTasksNewRequest.class, AddTasksNewResponse.class)
                .withName("AddTasksNew")
                .withUri("/v3/{project_id}/fullsql/task/add-tasks")
                .withContentType("application/json");

        // requests
        builder.<AddTasksNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddTasksNewRequestBody.class),
            f -> f.withMarshaller(AddTasksNewRequest::getBody, AddTasksNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse> batchAddFullSqlTasks =
        genForBatchAddFullSqlTasks();

    private static HttpRequestDef<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse> genForBatchAddFullSqlTasks() {
        // basic
        HttpRequestDef.Builder<BatchAddFullSqlTasksRequest, BatchAddFullSqlTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAddFullSqlTasksRequest.class, BatchAddFullSqlTasksResponse.class)
            .withName("BatchAddFullSqlTasks")
            .withUri("/v3/{project_id}/fullsql/task/batch-add")
            .withContentType("application/json");

        // requests
        builder.<BatchAddFullSqlTasksRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchAddFullSqlTasksRequestBody.class),
            f -> f.withMarshaller(BatchAddFullSqlTasksRequest::getBody, BatchAddFullSqlTasksRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse> batchSetSqlSwitchNew =
        genForBatchSetSqlSwitchNew();

    private static HttpRequestDef<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse> genForBatchSetSqlSwitchNew() {
        // basic
        HttpRequestDef.Builder<BatchSetSqlSwitchNewRequest, BatchSetSqlSwitchNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchSetSqlSwitchNewRequest.class, BatchSetSqlSwitchNewResponse.class)
            .withName("BatchSetSqlSwitchNew")
            .withUri("/v3/{project_id}/instance/batch-set-sql-switch")
            .withContentType("application/json");

        // requests
        builder.<BatchSetSqlSwitchNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSetSqlSwitchNewRequestBody.class),
            f -> f.withMarshaller(BatchSetSqlSwitchNewRequest::getBody, BatchSetSqlSwitchNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelConnectionProcessRequest, CancelConnectionProcessResponse> cancelConnectionProcess =
        genForCancelConnectionProcess();

    private static HttpRequestDef<CancelConnectionProcessRequest, CancelConnectionProcessResponse> genForCancelConnectionProcess() {
        // basic
        HttpRequestDef.Builder<CancelConnectionProcessRequest, CancelConnectionProcessResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelConnectionProcessRequest.class, CancelConnectionProcessResponse.class)
            .withName("CancelConnectionProcess")
            .withUri("/v3/{project_id}/connections/{connection_id}/instance/kill-process")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelConnectionProcessRequest::getConnectionId,
                CancelConnectionProcessRequest::setConnectionId));
        builder.<CancelConnectionProcessRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelConnectionProcessRequestBody.class),
            f -> f.withMarshaller(CancelConnectionProcessRequest::getBody, CancelConnectionProcessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeQuotaNewRequest, ChangeQuotaNewResponse> changeQuotaNew =
        genForChangeQuotaNew();

    private static HttpRequestDef<ChangeQuotaNewRequest, ChangeQuotaNewResponse> genForChangeQuotaNew() {
        // basic
        HttpRequestDef.Builder<ChangeQuotaNewRequest, ChangeQuotaNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeQuotaNewRequest.class, ChangeQuotaNewResponse.class)
                .withName("ChangeQuotaNew")
                .withUri("/v3/{project_id}/clouddba/change-quota")
                .withContentType("application/json");

        // requests
        builder.<ChangeQuotaNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeQuotaNewRequestBody.class),
            f -> f.withMarshaller(ChangeQuotaNewRequest::getBody, ChangeQuotaNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse> checkHealthReportTask =
        genForCheckHealthReportTask();

    private static HttpRequestDef<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse> genForCheckHealthReportTask() {
        // basic
        HttpRequestDef.Builder<CheckHealthReportTaskRequest, CheckHealthReportTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, CheckHealthReportTaskRequest.class, CheckHealthReportTaskResponse.class)
            .withName("CheckHealthReportTask")
            .withUri("/v3/{project_id}/health-report/{instance_id}/has-health-report-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckHealthReportTaskRequest::getInstanceId,
                CheckHealthReportTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateBinlogTaskRequest, CreateBinlogTaskResponse> createBinlogTask =
        genForCreateBinlogTask();

    private static HttpRequestDef<CreateBinlogTaskRequest, CreateBinlogTaskResponse> genForCreateBinlogTask() {
        // basic
        HttpRequestDef.Builder<CreateBinlogTaskRequest, CreateBinlogTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateBinlogTaskRequest.class, CreateBinlogTaskResponse.class)
                .withName("CreateBinlogTask")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/create-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBinlogTaskRequest::getConnectionId, CreateBinlogTaskRequest::setConnectionId));
        builder.<CreateBinlogTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateBinlogTaskRequestBody.class),
            f -> f.withMarshaller(CreateBinlogTaskRequest::getBody, CreateBinlogTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateDbsConnectionRequest, CreateDbsConnectionResponse> createDbsConnection =
        genForCreateDbsConnection();

    private static HttpRequestDef<CreateDbsConnectionRequest, CreateDbsConnectionResponse> genForCreateDbsConnection() {
        // basic
        HttpRequestDef.Builder<CreateDbsConnectionRequest, CreateDbsConnectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDbsConnectionRequest.class, CreateDbsConnectionResponse.class)
                .withName("CreateDbsConnection")
                .withUri("/v3/{project_id}/dbs-connection")
                .withContentType("application/json");

        // requests
        builder.<CreateDbsConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDbsConnectionRequestBody.class),
            f -> f.withMarshaller(CreateDbsConnectionRequest::getBody, CreateDbsConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse> createFullSqlBucket =
        genForCreateFullSqlBucket();

    private static HttpRequestDef<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse> genForCreateFullSqlBucket() {
        // basic
        HttpRequestDef.Builder<CreateFullSqlBucketRequest, CreateFullSqlBucketResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFullSqlBucketRequest.class, CreateFullSqlBucketResponse.class)
                .withName("CreateFullSqlBucket")
                .withUri("/v3/{project_id}/fullsql/create-bucket")
                .withContentType("application/json");

        // requests
        builder.<CreateFullSqlBucketRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFullSqlBucketRequestBody.class),
            f -> f.withMarshaller(CreateFullSqlBucketRequest::getBody, CreateFullSqlBucketRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse> createIndexUsageExportTaskNew =
        genForCreateIndexUsageExportTaskNew();

    private static HttpRequestDef<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse> genForCreateIndexUsageExportTaskNew() {
        // basic
        HttpRequestDef.Builder<CreateIndexUsageExportTaskNewRequest, CreateIndexUsageExportTaskNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateIndexUsageExportTaskNewRequest.class,
                    CreateIndexUsageExportTaskNewResponse.class)
                .withName("CreateIndexUsageExportTaskNew")
                .withUri("/v3/{project_id}/instances/{instance_id}/index-usage/create-index-usage-export-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndexUsageExportTaskNewRequest::getInstanceId,
                CreateIndexUsageExportTaskNewRequest::setInstanceId));
        builder.<CreateIndexUsageExportTaskNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIndexUsageExportTaskNewRequestBody.class),
            f -> f.withMarshaller(CreateIndexUsageExportTaskNewRequest::getBody,
                CreateIndexUsageExportTaskNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse> createInstanceHealthReportTaskNew =
        genForCreateInstanceHealthReportTaskNew();

    private static HttpRequestDef<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse> genForCreateInstanceHealthReportTaskNew() {
        // basic
        HttpRequestDef.Builder<CreateInstanceHealthReportTaskNewRequest, CreateInstanceHealthReportTaskNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceHealthReportTaskNewRequest.class,
                    CreateInstanceHealthReportTaskNewResponse.class)
                .withName("CreateInstanceHealthReportTaskNew")
                .withUri("/v3/{project_id}/health-report/{instance_id}/create-instance-health-report-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceHealthReportTaskNewRequest::getInstanceId,
                CreateInstanceHealthReportTaskNewRequest::setInstanceId));
        builder.<CreateInstanceHealthReportTaskNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceHealthReportTaskNewRequestBody.class),
            f -> f.withMarshaller(CreateInstanceHealthReportTaskNewRequest::getBody,
                CreateInstanceHealthReportTaskNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWdrReportRequest, CreateWdrReportResponse> createWdrReport =
        genForCreateWdrReport();

    private static HttpRequestDef<CreateWdrReportRequest, CreateWdrReportResponse> genForCreateWdrReport() {
        // basic
        HttpRequestDef.Builder<CreateWdrReportRequest, CreateWdrReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWdrReportRequest.class, CreateWdrReportResponse.class)
                .withName("CreateWdrReport")
                .withUri("/v3/{project_id}/connections/{connection_id}/wdr/trigger-wdr")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateWdrReportRequest::getConnectionId, CreateWdrReportRequest::setConnectionId));
        builder.<CreateWdrReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWdrReportRequestBody.class),
            f -> f.withMarshaller(CreateWdrReportRequest::getBody, CreateWdrReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse> deleteBinlogTask =
        genForDeleteBinlogTask();

    private static HttpRequestDef<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse> genForDeleteBinlogTask() {
        // basic
        HttpRequestDef.Builder<DeleteBinlogTaskRequest, DeleteBinlogTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DeleteBinlogTaskRequest.class, DeleteBinlogTaskResponse.class)
                .withName("DeleteBinlogTask")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/delete-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBinlogTaskRequest::getConnectionId, DeleteBinlogTaskRequest::setConnectionId));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBinlogTaskRequest::getTaskId, DeleteBinlogTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbObjNewRequest, DeleteDbObjNewResponse> deleteDbObjNew =
        genForDeleteDbObjNew();

    private static HttpRequestDef<DeleteDbObjNewRequest, DeleteDbObjNewResponse> genForDeleteDbObjNew() {
        // basic
        HttpRequestDef.Builder<DeleteDbObjNewRequest, DeleteDbObjNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbObjNewRequest.class, DeleteDbObjNewResponse.class)
                .withName("DeleteDbObjNew")
                .withUri("/v3/{project_id}/connections/{connection_id}/delete-db-obj")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getConnectionId, DeleteDbObjNewRequest::setConnectionId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getDbName, DeleteDbObjNewRequest::setDbName));
        builder.<String>withRequestField("schema_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getSchemaName, DeleteDbObjNewRequest::setSchemaName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getTableName, DeleteDbObjNewRequest::setTableName));
        builder.<String>withRequestField("obj_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getObjName, DeleteDbObjNewRequest::setObjName));
        builder.<String>withRequestField("obj_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getObjId, DeleteDbObjNewRequest::setObjId));
        builder.<String>withRequestField("object_sub_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getObjectSubType, DeleteDbObjNewRequest::setObjectSubType));
        builder.<String>withRequestField("obj_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbObjNewRequest::getObjType, DeleteDbObjNewRequest::setObjType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse> deleteExportTaskNew =
        genForDeleteExportTaskNew();

    private static HttpRequestDef<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse> genForDeleteExportTaskNew() {
        // basic
        HttpRequestDef.Builder<DeleteExportTaskNewRequest, DeleteExportTaskNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteExportTaskNewRequest.class, DeleteExportTaskNewResponse.class)
            .withName("DeleteExportTaskNew")
            .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/delete-export-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteExportTaskNewRequest::getConnectionId,
                DeleteExportTaskNewRequest::setConnectionId));
        builder.<DeleteExportTaskNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteExportTaskNewRequestBody.class),
            f -> f.withMarshaller(DeleteExportTaskNewRequest::getBody, DeleteExportTaskNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse> deleteFullSqlExportTaskObsFile =
        genForDeleteFullSqlExportTaskObsFile();

    private static HttpRequestDef<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse> genForDeleteFullSqlExportTaskObsFile() {
        // basic
        HttpRequestDef.Builder<DeleteFullSqlExportTaskObsFileRequest, DeleteFullSqlExportTaskObsFileResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteFullSqlExportTaskObsFileRequest.class,
                    DeleteFullSqlExportTaskObsFileResponse.class)
                .withName("DeleteFullSqlExportTaskObsFile")
                .withUri("/v3/{project_id}/fullsql/delete-export-task-obs-file")
                .withContentType("application/json");

        // requests
        builder.<DeleteFullSqlExportTaskObsFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteFullSqlExportTaskObsFileRequestBody.class),
            f -> f.withMarshaller(DeleteFullSqlExportTaskObsFileRequest::getBody,
                DeleteFullSqlExportTaskObsFileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableQuotaRequest, EnableQuotaResponse> enableQuota = genForEnableQuota();

    private static HttpRequestDef<EnableQuotaRequest, EnableQuotaResponse> genForEnableQuota() {
        // basic
        HttpRequestDef.Builder<EnableQuotaRequest, EnableQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableQuotaRequest.class, EnableQuotaResponse.class)
                .withName("EnableQuota")
                .withUri("/v3/{project_id}/clouddba/open-quota")
                .withContentType("application/json");

        // requests
        builder.<EnableQuotaRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableQuotaRequestBody.class),
            f -> f.withMarshaller(EnableQuotaRequest::getBody, EnableQuotaRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse> executeFormatSql =
        genForExecuteFormatSql();

    private static HttpRequestDef<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse> genForExecuteFormatSql() {
        // basic
        HttpRequestDef.Builder<ExecuteFormatSqlRequest, ExecuteFormatSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteFormatSqlRequest.class, ExecuteFormatSqlResponse.class)
                .withName("ExecuteFormatSql")
                .withUri("/v3/{project_id}/connections/{connection_id}/format-sql")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteFormatSqlRequest::getConnectionId, ExecuteFormatSqlRequest::setConnectionId));
        builder.<ExecuteFormatSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteFormatSqlRequestBody.class),
            f -> f.withMarshaller(ExecuteFormatSqlRequest::getBody, ExecuteFormatSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse> executeLoginConnectionNew =
        genForExecuteLoginConnectionNew();

    private static HttpRequestDef<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse> genForExecuteLoginConnectionNew() {
        // basic
        HttpRequestDef.Builder<ExecuteLoginConnectionNewRequest, ExecuteLoginConnectionNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ExecuteLoginConnectionNewRequest.class,
                    ExecuteLoginConnectionNewResponse.class)
                .withName("ExecuteLoginConnectionNew")
                .withUri("/v3/{project_id}/connections/{connection_id}/login-actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteLoginConnectionNewRequest::getConnectionId,
                ExecuteLoginConnectionNewRequest::setConnectionId));
        builder.<ExecuteLoginConnectionNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteLoginConnectionNewRequestBody.class),
            f -> f.withMarshaller(ExecuteLoginConnectionNewRequest::getBody,
                ExecuteLoginConnectionNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse> executeSplitSql =
        genForExecuteSplitSql();

    private static HttpRequestDef<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse> genForExecuteSplitSql() {
        // basic
        HttpRequestDef.Builder<ExecuteSplitSqlRequest, ExecuteSplitSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteSplitSqlRequest.class, ExecuteSplitSqlResponse.class)
                .withName("ExecuteSplitSql")
                .withUri("/v3/{project_id}/connections/{connection_id}/split-sql")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteSplitSqlRequest::getConnectionId, ExecuteSplitSqlRequest::setConnectionId));
        builder.<ExecuteSplitSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteSplitSqlRequestBody.class),
            f -> f.withMarshaller(ExecuteSplitSqlRequest::getBody, ExecuteSplitSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse> executeTestConnectionNew =
        genForExecuteTestConnectionNew();

    private static HttpRequestDef<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse> genForExecuteTestConnectionNew() {
        // basic
        HttpRequestDef.Builder<ExecuteTestConnectionNewRequest, ExecuteTestConnectionNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ExecuteTestConnectionNewRequest.class, ExecuteTestConnectionNewResponse.class)
                .withName("ExecuteTestConnectionNew")
                .withUri("/v3/{project_id}/connections/test-connection")
                .withContentType("application/json");

        // requests
        builder.<ExecuteTestConnectionNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteTestConnectionNewRequestBody.class),
            f -> f.withMarshaller(ExecuteTestConnectionNewRequest::getBody, ExecuteTestConnectionNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteTuningRequest, ExecuteTuningResponse> executeTuning =
        genForExecuteTuning();

    private static HttpRequestDef<ExecuteTuningRequest, ExecuteTuningResponse> genForExecuteTuning() {
        // basic
        HttpRequestDef.Builder<ExecuteTuningRequest, ExecuteTuningResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteTuningRequest.class, ExecuteTuningResponse.class)
                .withName("ExecuteTuning")
                .withUri("/v3/{project_id}/connections/{connection_id}/tuning/exe-tuning")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteTuningRequest::getConnectionId, ExecuteTuningRequest::setConnectionId));
        builder.<ExecuteTuningRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExecuteTuningRequestBody.class),
            f -> f.withMarshaller(ExecuteTuningRequest::getBody, ExecuteTuningRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportInstanceListNewRequest, ExportInstanceListNewResponse> exportInstanceListNew =
        genForExportInstanceListNew();

    private static HttpRequestDef<ExportInstanceListNewRequest, ExportInstanceListNewResponse> genForExportInstanceListNew() {
        // basic
        HttpRequestDef.Builder<ExportInstanceListNewRequest, ExportInstanceListNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportInstanceListNewRequest.class, ExportInstanceListNewResponse.class)
            .withName("ExportInstanceListNew")
            .withUri("/v3/{project_id}/instance/export-instance-list")
            .withContentType("application/json");

        // requests
        builder.<ExportInstanceListNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportInstanceListNewRequestBody.class),
            f -> f.withMarshaller(ExportInstanceListNewRequest::getBody, ExportInstanceListNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse> importExportObsObjects =
        genForImportExportObsObjects();

    private static HttpRequestDef<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse> genForImportExportObsObjects() {
        // basic
        HttpRequestDef.Builder<ImportExportObsObjectsRequest, ImportExportObsObjectsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ImportExportObsObjectsRequest.class, ImportExportObsObjectsResponse.class)
            .withName("ImportExportObsObjects")
            .withUri("/v3/{project_id}/connections/{connection_id}/obs/objects")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExportObsObjectsRequest::getConnectionId,
                ImportExportObsObjectsRequest::setConnectionId));
        builder.<String>withRequestField("bucket_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExportObsObjectsRequest::getBucketName,
                ImportExportObsObjectsRequest::setBucketName));
        builder.<Integer>withRequestField("max_keys",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ImportExportObsObjectsRequest::getMaxKeys,
                ImportExportObsObjectsRequest::setMaxKeys));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExportObsObjectsRequest::getMarker, ImportExportObsObjectsRequest::setMarker));
        builder.<String>withRequestField("prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportExportObsObjectsRequest::getPrefix, ImportExportObsObjectsRequest::setPrefix));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<InvokeWdrReportRequest, InvokeWdrReportResponse> invokeWdrReport =
        genForInvokeWdrReport();

    private static HttpRequestDef<InvokeWdrReportRequest, InvokeWdrReportResponse> genForInvokeWdrReport() {
        // basic
        HttpRequestDef.Builder<InvokeWdrReportRequest, InvokeWdrReportResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, InvokeWdrReportRequest.class, InvokeWdrReportResponse.class)
                .withName("InvokeWdrReport")
                .withUri("/v3/{project_id}/connections/{connection_id}/wdr/fetch-wdr")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(InvokeWdrReportRequest::getConnectionId, InvokeWdrReportRequest::setConnectionId));
        builder.<InvokeWdrReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InvokeWdrReportRequestBody.class),
            f -> f.withMarshaller(InvokeWdrReportRequest::getBody, InvokeWdrReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse> listAllTypeInstances =
        genForListAllTypeInstances();

    private static HttpRequestDef<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse> genForListAllTypeInstances() {
        // basic
        HttpRequestDef.Builder<ListAllTypeInstancesRequest, ListAllTypeInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAllTypeInstancesRequest.class, ListAllTypeInstancesResponse.class)
            .withName("ListAllTypeInstances")
            .withUri("/v3/{project_id}/all-type-instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTypeInstancesRequest::getName, ListAllTypeInstancesRequest::setName));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTypeInstancesRequest::getCurPage, ListAllTypeInstancesRequest::setCurPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAllTypeInstancesRequest::getPerPage, ListAllTypeInstancesRequest::setPerPage));
        builder.<String>withRequestField("network_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTypeInstancesRequest::getNetworkType,
                ListAllTypeInstancesRequest::setNetworkType));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTypeInstancesRequest::getEngineType,
                ListAllTypeInstancesRequest::setEngineType));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAllTypeInstancesRequest::getId, ListAllTypeInstancesRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBinlogExportsRequest, ListBinlogExportsResponse> listBinlogExports =
        genForListBinlogExports();

    private static HttpRequestDef<ListBinlogExportsRequest, ListBinlogExportsResponse> genForListBinlogExports() {
        // basic
        HttpRequestDef.Builder<ListBinlogExportsRequest, ListBinlogExportsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBinlogExportsRequest.class, ListBinlogExportsResponse.class)
                .withName("ListBinlogExports")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/export-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBinlogExportsRequest::getConnectionId,
                ListBinlogExportsRequest::setConnectionId));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBinlogExportsRequest::getCurPage, ListBinlogExportsRequest::setCurPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBinlogExportsRequest::getPerPage, ListBinlogExportsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBinlogFilesRequest, ListBinlogFilesResponse> listBinlogFiles =
        genForListBinlogFiles();

    private static HttpRequestDef<ListBinlogFilesRequest, ListBinlogFilesResponse> genForListBinlogFiles() {
        // basic
        HttpRequestDef.Builder<ListBinlogFilesRequest, ListBinlogFilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListBinlogFilesRequest.class, ListBinlogFilesResponse.class)
                .withName("ListBinlogFiles")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/list-file")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBinlogFilesRequest::getConnectionId, ListBinlogFilesRequest::setConnectionId));
        builder.<ListBinlogFilesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListBinlogFilesRequestBody.class),
            f -> f.withMarshaller(ListBinlogFilesRequest::getBody, ListBinlogFilesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConnectionProcessesRequest, ListConnectionProcessesResponse> listConnectionProcesses =
        genForListConnectionProcesses();

    private static HttpRequestDef<ListConnectionProcessesRequest, ListConnectionProcessesResponse> genForListConnectionProcesses() {
        // basic
        HttpRequestDef.Builder<ListConnectionProcessesRequest, ListConnectionProcessesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListConnectionProcessesRequest.class, ListConnectionProcessesResponse.class)
            .withName("ListConnectionProcesses")
            .withUri("/v3/{project_id}/connections/{connection_id}/instance/query-process-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getConnectionId,
                ListConnectionProcessesRequest::setConnectionId));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getUser, ListConnectionProcessesRequest::setUser));
        builder.<String>withRequestField("host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getHost, ListConnectionProcessesRequest::setHost));
        builder.<String>withRequestField("db",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getDb, ListConnectionProcessesRequest::setDb));
        builder.<String>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getState, ListConnectionProcessesRequest::setState));
        builder.<String>withRequestField("command",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getCommand,
                ListConnectionProcessesRequest::setCommand));
        builder.<String>withRequestField("keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getKeywords,
                ListConnectionProcessesRequest::setKeywords));
        builder.<Boolean>withRequestField("show_all",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getShowAll,
                ListConnectionProcessesRequest::setShowAll));
        builder.<Boolean>withRequestField("show_no_pid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getShowNoPid,
                ListConnectionProcessesRequest::setShowNoPid));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getTime, ListConnectionProcessesRequest::setTime));
        builder.<String>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getPerPage,
                ListConnectionProcessesRequest::setPerPage));
        builder.<String>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getCurPage,
                ListConnectionProcessesRequest::setCurPage));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getOrderBy,
                ListConnectionProcessesRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getOrder, ListConnectionProcessesRequest::setOrder));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getNodeId,
                ListConnectionProcessesRequest::setNodeId));
        builder.<String>withRequestField("node_role",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getNodeRole,
                ListConnectionProcessesRequest::setNodeRole));
        builder.<Boolean>withRequestField("hide_sys",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListConnectionProcessesRequest::getHideSys,
                ListConnectionProcessesRequest::setHideSys));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> listDatabaseObjects =
        genForListDatabaseObjects();

    private static HttpRequestDef<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> genForListDatabaseObjects() {
        // basic
        HttpRequestDef.Builder<ListDatabaseObjectsRequest, ListDatabaseObjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDatabaseObjectsRequest.class, ListDatabaseObjectsResponse.class)
                .withName("ListDatabaseObjects")
                .withUri("/v3/{project_id}/connections/{connection_id}/get-db-obj-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getConnectionId,
                ListDatabaseObjectsRequest::setConnectionId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getDbName, ListDatabaseObjectsRequest::setDbName));
        builder.<String>withRequestField("db_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getDbId, ListDatabaseObjectsRequest::setDbId));
        builder.<String>withRequestField("schema_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getSchemaName,
                ListDatabaseObjectsRequest::setSchemaName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getTableName, ListDatabaseObjectsRequest::setTableName));
        builder.<String>withRequestField("table_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getTableId, ListDatabaseObjectsRequest::setTableId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getStartAt, ListDatabaseObjectsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getEndAt, ListDatabaseObjectsRequest::setEndAt));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getPageNum, ListDatabaseObjectsRequest::setPageNum));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getPageSize, ListDatabaseObjectsRequest::setPageSize));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getOrderBy, ListDatabaseObjectsRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getOrder, ListDatabaseObjectsRequest::setOrder));
        builder.<String>withRequestField("extra_order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getExtraOrderBy,
                ListDatabaseObjectsRequest::setExtraOrderBy));
        builder.<String>withRequestField("extra_order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getExtraOrder,
                ListDatabaseObjectsRequest::setExtraOrder));
        builder.<String>withRequestField("obj_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getObjType, ListDatabaseObjectsRequest::setObjType));
        builder.<String>withRequestField("ret_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getRetType, ListDatabaseObjectsRequest::setRetType));
        builder.<String>withRequestField("is_sys",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getIsSys, ListDatabaseObjectsRequest::setIsSys));
        builder.<String>withRequestField("obj_sub_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getObjSubType,
                ListDatabaseObjectsRequest::setObjSubType));
        builder.<String>withRequestField("node_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getNodeType, ListDatabaseObjectsRequest::setNodeType));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getNodeId, ListDatabaseObjectsRequest::setNodeId));
        builder.<String>withRequestField("obj_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getObjName, ListDatabaseObjectsRequest::setObjName));
        builder.<String>withRequestField("keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getKeywords, ListDatabaseObjectsRequest::setKeywords));
        builder.<String>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getCurPage, ListDatabaseObjectsRequest::setCurPage));
        builder.<String>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDatabaseObjectsRequest::getPerPage, ListDatabaseObjectsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse> listDeadLockDatabases =
        genForListDeadLockDatabases();

    private static HttpRequestDef<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse> genForListDeadLockDatabases() {
        // basic
        HttpRequestDef.Builder<ListDeadLockDatabasesRequest, ListDeadLockDatabasesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDeadLockDatabasesRequest.class, ListDeadLockDatabasesResponse.class)
            .withName("ListDeadLockDatabases")
            .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock/get-dead-lock-db-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeadLockDatabasesRequest::getInstanceId,
                ListDeadLockDatabasesRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeadLockDatabasesRequest::getStartTime,
                ListDeadLockDatabasesRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeadLockDatabasesRequest::getEndTime, ListDeadLockDatabasesRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDeadLockDetailRequest, ListDeadLockDetailResponse> listDeadLockDetail =
        genForListDeadLockDetail();

    private static HttpRequestDef<ListDeadLockDetailRequest, ListDeadLockDetailResponse> genForListDeadLockDetail() {
        // basic
        HttpRequestDef.Builder<ListDeadLockDetailRequest, ListDeadLockDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeadLockDetailRequest.class, ListDeadLockDetailResponse.class)
                .withName("ListDeadLockDetail")
                .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock/get-dead-lock-detail-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeadLockDetailRequest::getInstanceId, ListDeadLockDetailRequest::setInstanceId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeadLockDetailRequest::getDbName, ListDeadLockDetailRequest::setDbName));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeadLockDetailRequest::getStartTime, ListDeadLockDetailRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListDeadLockDetailRequest::getEndTime, ListDeadLockDetailRequest::setEndTime));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeadLockDetailRequest::getCurPage, ListDeadLockDetailRequest::setCurPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeadLockDetailRequest::getPerPage, ListDeadLockDetailRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFullDeadLocksRequest, ListFullDeadLocksResponse> listFullDeadLocks =
        genForListFullDeadLocks();

    private static HttpRequestDef<ListFullDeadLocksRequest, ListFullDeadLocksResponse> genForListFullDeadLocks() {
        // basic
        HttpRequestDef.Builder<ListFullDeadLocksRequest, ListFullDeadLocksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFullDeadLocksRequest.class, ListFullDeadLocksResponse.class)
                .withName("ListFullDeadLocks")
                .withUri("/v3/{project_id}/instances/{instance_id}/get-full-dead-lock-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullDeadLocksRequest::getInstanceId, ListFullDeadLocksRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullDeadLocksRequest::getStartAt, ListFullDeadLocksRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullDeadLocksRequest::getEndAt, ListFullDeadLocksRequest::setEndAt));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFullDeadLocksRequest::getPageNum, ListFullDeadLocksRequest::setPageNum));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFullDeadLocksRequest::getPageSize, ListFullDeadLocksRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse> listFullSqlExportTasks =
        genForListFullSqlExportTasks();

    private static HttpRequestDef<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse> genForListFullSqlExportTasks() {
        // basic
        HttpRequestDef.Builder<ListFullSqlExportTasksRequest, ListFullSqlExportTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListFullSqlExportTasksRequest.class, ListFullSqlExportTasksResponse.class)
            .withName("ListFullSqlExportTasks")
            .withUri("/v3/{project_id}/fullsql/get-export-task-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlExportTasksRequest::getInstanceId,
                ListFullSqlExportTasksRequest::setInstanceId));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullSqlExportTasksRequest::getTaskId, ListFullSqlExportTasksRequest::setTaskId));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFullSqlExportTasksRequest::getPageSize,
                ListFullSqlExportTasksRequest::setPageSize));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFullSqlExportTasksRequest::getPageNo, ListFullSqlExportTasksRequest::setPageNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse> listInstanceHealthReportTasks =
        genForListInstanceHealthReportTasks();

    private static HttpRequestDef<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse> genForListInstanceHealthReportTasks() {
        // basic
        HttpRequestDef.Builder<ListInstanceHealthReportTasksRequest, ListInstanceHealthReportTasksResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListInstanceHealthReportTasksRequest.class,
                    ListInstanceHealthReportTasksResponse.class)
                .withName("ListInstanceHealthReportTasks")
                .withUri("/v3/{project_id}/health-report/{instance_id}/get-instance-health-report-task-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHealthReportTasksRequest::getInstanceId,
                ListInstanceHealthReportTasksRequest::setInstanceId));
        builder.<String>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHealthReportTasksRequest::getStartAt,
                ListInstanceHealthReportTasksRequest::setStartAt));
        builder.<String>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHealthReportTasksRequest::getEndAt,
                ListInstanceHealthReportTasksRequest::setEndAt));
        builder.<String>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHealthReportTasksRequest::getPageNum,
                ListInstanceHealthReportTasksRequest::setPageNum));
        builder.<String>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceHealthReportTasksRequest::getPageSize,
                ListInstanceHealthReportTasksRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse> listNotSetChargeModeInstance =
        genForListNotSetChargeModeInstance();

    private static HttpRequestDef<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse> genForListNotSetChargeModeInstance() {
        // basic
        HttpRequestDef.Builder<ListNotSetChargeModeInstanceRequest, ListNotSetChargeModeInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListNotSetChargeModeInstanceRequest.class,
                    ListNotSetChargeModeInstanceResponse.class)
                .withName("ListNotSetChargeModeInstance")
                .withUri("/v3/{project_id}/clouddba/get-not-set-charge-mode-instance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotSetChargeModeInstanceRequest::getInstanceId,
                ListNotSetChargeModeInstanceRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNotSetChargeModeInstanceRequest::getEngineType,
                ListNotSetChargeModeInstanceRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSchemaNamesRequest, ListSchemaNamesResponse> listSchemaNames =
        genForListSchemaNames();

    private static HttpRequestDef<ListSchemaNamesRequest, ListSchemaNamesResponse> genForListSchemaNames() {
        // basic
        HttpRequestDef.Builder<ListSchemaNamesRequest, ListSchemaNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSchemaNamesRequest.class, ListSchemaNamesResponse.class)
                .withName("ListSchemaNames")
                .withUri("/v3/{project_id}/connections/{connection_id}/schema/clouddba-get-schema-name-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemaNamesRequest::getConnectionId, ListSchemaNamesRequest::setConnectionId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemaNamesRequest::getDbName, ListSchemaNamesRequest::setDbName));
        builder.<String>withRequestField("obj_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemaNamesRequest::getObjType, ListSchemaNamesRequest::setObjType));
        builder.<String>withRequestField("is_with_all_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemaNamesRequest::getIsWithAllUser, ListSchemaNamesRequest::setIsWithAllUser));
        builder.<String>withRequestField("node_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemaNamesRequest::getNodeType, ListSchemaNamesRequest::setNodeType));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSchemaNamesRequest::getNodeId, ListSchemaNamesRequest::setNodeId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSharedConnectionsRequest, ListSharedConnectionsResponse> listSharedConnections =
        genForListSharedConnections();

    private static HttpRequestDef<ListSharedConnectionsRequest, ListSharedConnectionsResponse> genForListSharedConnections() {
        // basic
        HttpRequestDef.Builder<ListSharedConnectionsRequest, ListSharedConnectionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSharedConnectionsRequest.class, ListSharedConnectionsResponse.class)
            .withName("ListSharedConnections")
            .withUri("/v3/{project_id}/connections/{connection_id}/get-shared-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedConnectionsRequest::getConnectionId,
                ListSharedConnectionsRequest::setConnectionId));
        builder.<String>withRequestField("keywords",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedConnectionsRequest::getKeywords,
                ListSharedConnectionsRequest::setKeywords));
        builder.<String>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedConnectionsRequest::getCurPage, ListSharedConnectionsRequest::setCurPage));
        builder.<String>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSharedConnectionsRequest::getPerPage, ListSharedConnectionsRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSmnTopicsRequest, ListSmnTopicsResponse> listSmnTopics =
        genForListSmnTopics();

    private static HttpRequestDef<ListSmnTopicsRequest, ListSmnTopicsResponse> genForListSmnTopics() {
        // basic
        HttpRequestDef.Builder<ListSmnTopicsRequest, ListSmnTopicsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSmnTopicsRequest.class, ListSmnTopicsResponse.class)
                .withName("ListSmnTopics")
                .withUri("/v3/{project_id}/health-report/get-smn-topic-list")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmnTopicsRequest::getOffset, ListSmnTopicsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSmnTopicsRequest::getLimit, ListSmnTopicsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse> listSnapshots4Api =
        genForListSnapshots4Api();

    private static HttpRequestDef<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse> genForListSnapshots4Api() {
        // basic
        HttpRequestDef.Builder<ListSnapshots4ApiRequest, ListSnapshots4ApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshots4ApiRequest.class, ListSnapshots4ApiResponse.class)
                .withName("ListSnapshots4Api")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/query-snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshots4ApiRequest::getConnectionId,
                ListSnapshots4ApiRequest::setConnectionId));
        builder.<Integer>withRequestField("module",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshots4ApiRequest::getModule, ListSnapshots4ApiRequest::setModule));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSnapshots4ApiRequest::getStartAt, ListSnapshots4ApiRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSnapshots4ApiRequest::getEndAt, ListSnapshots4ApiRequest::setEndAt));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshots4ApiRequest::getPerPage, ListSnapshots4ApiRequest::setPerPage));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshots4ApiRequest::getCurPage, ListSnapshots4ApiRequest::setCurPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse> listSqlLimitUserInstance =
        genForListSqlLimitUserInstance();

    private static HttpRequestDef<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse> genForListSqlLimitUserInstance() {
        // basic
        HttpRequestDef.Builder<ListSqlLimitUserInstanceRequest, ListSqlLimitUserInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListSqlLimitUserInstanceRequest.class, ListSqlLimitUserInstanceResponse.class)
                .withName("ListSqlLimitUserInstance")
                .withUri("/v3/{project_id}/instance/sql-limiting/get-user-instance-list")
                .withContentType("application/json");

        // requests
        builder.<ListSqlLimitUserInstanceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSqlLimitUserInstanceRequestBody.class),
            f -> f.withMarshaller(ListSqlLimitUserInstanceRequest::getBody, ListSqlLimitUserInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse> listSqlTemplateComparisons =
        genForListSqlTemplateComparisons();

    private static HttpRequestDef<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse> genForListSqlTemplateComparisons() {
        // basic
        HttpRequestDef.Builder<ListSqlTemplateComparisonsRequest, ListSqlTemplateComparisonsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListSqlTemplateComparisonsRequest.class,
                    ListSqlTemplateComparisonsResponse.class)
                .withName("ListSqlTemplateComparisons")
                .withUri("/v3/{project_id}/fullsql/query-sql-tpl-cmp-list")
                .withContentType("application/json");

        // requests
        builder.<ListSqlTemplateComparisonsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSqlTemplateComparisonsRequestBody.class),
            f -> f.withMarshaller(ListSqlTemplateComparisonsRequest::getBody,
                ListSqlTemplateComparisonsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse> listSqlTemplateDatabases =
        genForListSqlTemplateDatabases();

    private static HttpRequestDef<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse> genForListSqlTemplateDatabases() {
        // basic
        HttpRequestDef.Builder<ListSqlTemplateDatabasesRequest, ListSqlTemplateDatabasesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListSqlTemplateDatabasesRequest.class, ListSqlTemplateDatabasesResponse.class)
                .withName("ListSqlTemplateDatabases")
                .withUri("/v3/{project_id}/fullsql/query-sql-tpl-db-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getInstanceId,
                ListSqlTemplateDatabasesRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getNodeId,
                ListSqlTemplateDatabasesRequest::setNodeId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getStartAt,
                ListSqlTemplateDatabasesRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getEndAt,
                ListSqlTemplateDatabasesRequest::setEndAt));
        builder.<String>withRequestField("operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getOperation,
                ListSqlTemplateDatabasesRequest::setOperation));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getKeyword,
                ListSqlTemplateDatabasesRequest::setKeyword));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getSort, ListSqlTemplateDatabasesRequest::setSort));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getAsc, ListSqlTemplateDatabasesRequest::setAsc));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlTemplateDatabasesRequest::getSize, ListSqlTemplateDatabasesRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlTemplatesRequest, ListSqlTemplatesResponse> listSqlTemplates =
        genForListSqlTemplates();

    private static HttpRequestDef<ListSqlTemplatesRequest, ListSqlTemplatesResponse> genForListSqlTemplates() {
        // basic
        HttpRequestDef.Builder<ListSqlTemplatesRequest, ListSqlTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListSqlTemplatesRequest.class, ListSqlTemplatesResponse.class)
                .withName("ListSqlTemplates")
                .withUri("/v3/{project_id}/fullsql/query-sql-tpl-list")
                .withContentType("application/json");

        // requests
        builder.<ListSqlTemplatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSqlTemplatesRequestBody.class),
            f -> f.withMarshaller(ListSqlTemplatesRequest::getBody, ListSqlTemplatesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse> listTasksByBatchId =
        genForListTasksByBatchId();

    private static HttpRequestDef<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse> genForListTasksByBatchId() {
        // basic
        HttpRequestDef.Builder<ListTasksByBatchIdRequest, ListTasksByBatchIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksByBatchIdRequest.class, ListTasksByBatchIdResponse.class)
                .withName("ListTasksByBatchId")
                .withUri("/v3/{project_id}/fullsql/task/query-by-batch-id")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("batch_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksByBatchIdRequest::getBatchId, ListTasksByBatchIdRequest::setBatchId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse> listTasksBySqlTemplateId =
        genForListTasksBySqlTemplateId();

    private static HttpRequestDef<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse> genForListTasksBySqlTemplateId() {
        // basic
        HttpRequestDef.Builder<ListTasksBySqlTemplateIdRequest, ListTasksBySqlTemplateIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ListTasksBySqlTemplateIdRequest.class, ListTasksBySqlTemplateIdResponse.class)
                .withName("ListTasksBySqlTemplateId")
                .withUri("/v3/{project_id}/fullsql/tasks/query-by-sql-template-id")
                .withContentType("application/json");

        // requests
        builder.<ListTasksBySqlTemplateIdRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTasksBySqlTemplateIdRequestBody.class),
            f -> f.withMarshaller(ListTasksBySqlTemplateIdRequest::getBody, ListTasksBySqlTemplateIdRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse> listTasksByTaskId =
        genForListTasksByTaskId();

    private static HttpRequestDef<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse> genForListTasksByTaskId() {
        // basic
        HttpRequestDef.Builder<ListTasksByTaskIdRequest, ListTasksByTaskIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTasksByTaskIdRequest.class, ListTasksByTaskIdResponse.class)
                .withName("ListTasksByTaskId")
                .withUri("/v3/{project_id}/fullsql/task/query-by-task-id")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTasksByTaskIdRequest::getTaskId, ListTasksByTaskIdRequest::setTaskId));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksByTaskIdRequest::getCurPage, ListTasksByTaskIdRequest::setCurPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTasksByTaskIdRequest::getPerPage, ListTasksByTaskIdRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse> listTemplateDatabaseComparisons =
        genForListTemplateDatabaseComparisons();

    private static HttpRequestDef<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse> genForListTemplateDatabaseComparisons() {
        // basic
        HttpRequestDef.Builder<ListTemplateDatabaseComparisonsRequest, ListTemplateDatabaseComparisonsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListTemplateDatabaseComparisonsRequest.class,
                    ListTemplateDatabaseComparisonsResponse.class)
                .withName("ListTemplateDatabaseComparisons")
                .withUri("/v3/{project_id}/fullsql/query-tpl-db-cmp-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getInstanceId,
                ListTemplateDatabaseComparisonsRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getNodeId,
                ListTemplateDatabaseComparisonsRequest::setNodeId));
        builder.<Long>withRequestField("start_at1",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getStartAt1,
                ListTemplateDatabaseComparisonsRequest::setStartAt1));
        builder.<Long>withRequestField("end_at1",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getEndAt1,
                ListTemplateDatabaseComparisonsRequest::setEndAt1));
        builder.<Long>withRequestField("start_at2",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getStartAt2,
                ListTemplateDatabaseComparisonsRequest::setStartAt2));
        builder.<Long>withRequestField("end_at2",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getEndAt2,
                ListTemplateDatabaseComparisonsRequest::setEndAt2));
        builder.<String>withRequestField("operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getOperation,
                ListTemplateDatabaseComparisonsRequest::setOperation));
        builder.<List<String>>withRequestField("db_name_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getDbNameList,
                ListTemplateDatabaseComparisonsRequest::setDbNameList));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getKeyword,
                ListTemplateDatabaseComparisonsRequest::setKeyword));
        builder.<String>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getSort,
                ListTemplateDatabaseComparisonsRequest::setSort));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getAsc,
                ListTemplateDatabaseComparisonsRequest::setAsc));
        builder.<Integer>withRequestField("size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTemplateDatabaseComparisonsRequest::getSize,
                ListTemplateDatabaseComparisonsRequest::setSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUserInstanceListRequest, ListUserInstanceListResponse> listUserInstanceList =
        genForListUserInstanceList();

    private static HttpRequestDef<ListUserInstanceListRequest, ListUserInstanceListResponse> genForListUserInstanceList() {
        // basic
        HttpRequestDef.Builder<ListUserInstanceListRequest, ListUserInstanceListResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListUserInstanceListRequest.class, ListUserInstanceListResponse.class)
            .withName("ListUserInstanceList")
            .withUri("/v3/{project_id}/instance/get-user-instance-list")
            .withContentType("application/json");

        // requests
        builder.<ListUserInstanceListRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListUserInstanceListRequestBody.class),
            f -> f.withMarshaller(ListUserInstanceListRequest::getBody, ListUserInstanceListRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryBinlogTaskRequest, RetryBinlogTaskResponse> retryBinlogTask =
        genForRetryBinlogTask();

    private static HttpRequestDef<RetryBinlogTaskRequest, RetryBinlogTaskResponse> genForRetryBinlogTask() {
        // basic
        HttpRequestDef.Builder<RetryBinlogTaskRequest, RetryBinlogTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, RetryBinlogTaskRequest.class, RetryBinlogTaskResponse.class)
                .withName("RetryBinlogTask")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/retry-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryBinlogTaskRequest::getConnectionId, RetryBinlogTaskRequest::setConnectionId));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(RetryBinlogTaskRequest::getTaskId, RetryBinlogTaskRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchBinlogParseRequest, SearchBinlogParseResponse> searchBinlogParse =
        genForSearchBinlogParse();

    private static HttpRequestDef<SearchBinlogParseRequest, SearchBinlogParseResponse> genForSearchBinlogParse() {
        // basic
        HttpRequestDef.Builder<SearchBinlogParseRequest, SearchBinlogParseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchBinlogParseRequest.class, SearchBinlogParseResponse.class)
                .withName("SearchBinlogParse")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBinlogParseRequest::getConnectionId,
                SearchBinlogParseRequest::setConnectionId));
        builder.<SearchBinlogParseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SearchBinlogParseRequestBody.class),
            f -> f.withMarshaller(SearchBinlogParseRequest::getBody, SearchBinlogParseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse> searchErrorInfo4Api =
        genForSearchErrorInfo4Api();

    private static HttpRequestDef<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse> genForSearchErrorInfo4Api() {
        // basic
        HttpRequestDef.Builder<SearchErrorInfo4ApiRequest, SearchErrorInfo4ApiResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchErrorInfo4ApiRequest.class, SearchErrorInfo4ApiResponse.class)
                .withName("SearchErrorInfo4Api")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/search-error-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfo4ApiRequest::getConnectionId,
                SearchErrorInfo4ApiRequest::setConnectionId));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchErrorInfo4ApiRequest::getTaskId, SearchErrorInfo4ApiRequest::setTaskId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfo4ApiRequest::getFileName, SearchErrorInfo4ApiRequest::setFileName));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfo4ApiRequest::getDbName, SearchErrorInfo4ApiRequest::setDbName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfo4ApiRequest::getTableName, SearchErrorInfo4ApiRequest::setTableName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse> searchErrorInfoSource4Api =
        genForSearchErrorInfoSource4Api();

    private static HttpRequestDef<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse> genForSearchErrorInfoSource4Api() {
        // basic
        HttpRequestDef.Builder<SearchErrorInfoSource4ApiRequest, SearchErrorInfoSource4ApiResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    SearchErrorInfoSource4ApiRequest.class,
                    SearchErrorInfoSource4ApiResponse.class)
                .withName("SearchErrorInfoSource4Api")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/search-error-info-source")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfoSource4ApiRequest::getConnectionId,
                SearchErrorInfoSource4ApiRequest::setConnectionId));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchErrorInfoSource4ApiRequest::getTaskId,
                SearchErrorInfoSource4ApiRequest::setTaskId));
        builder.<String>withRequestField("file_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfoSource4ApiRequest::getFileName,
                SearchErrorInfoSource4ApiRequest::setFileName));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchErrorInfoSource4ApiRequest::getDbName,
                SearchErrorInfoSource4ApiRequest::setDbName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchNewRequest, SearchNewResponse> searchNew = genForSearchNew();

    private static HttpRequestDef<SearchNewRequest, SearchNewResponse> genForSearchNew() {
        // basic
        HttpRequestDef.Builder<SearchNewRequest, SearchNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SearchNewRequest.class, SearchNewResponse.class)
                .withName("SearchNew")
                .withUri("/v3/{project_id}/fullsql/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getInstanceId, SearchNewRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getStartAt, SearchNewRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getEndAt, SearchNewRequest::setEndAt));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getTaskId, SearchNewRequest::setTaskId));
        builder.<List<Long>>withRequestField("task_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(SearchNewRequest::getTaskIds, SearchNewRequest::setTaskIds));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getNodeId, SearchNewRequest::setNodeId));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getKeyword, SearchNewRequest::setKeyword));
        builder.<String>withRequestField("fuzzy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getFuzzy, SearchNewRequest::setFuzzy));
        builder.<String>withRequestField("user_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getUserList, SearchNewRequest::setUserList));
        builder.<String>withRequestField("db_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getDbList, SearchNewRequest::setDbList));
        builder.<String>withRequestField("operation_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getOperationList, SearchNewRequest::setOperationList));
        builder.<String>withRequestField("client_ip_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getClientIpList, SearchNewRequest::setClientIpList));
        builder.<String>withRequestField("thread_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getThreadIdList, SearchNewRequest::setThreadIdList));
        builder.<String>withRequestField("trx_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getTrxIdList, SearchNewRequest::setTrxIdList));
        builder.<String>withRequestField("session_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getSessionIdList, SearchNewRequest::setSessionIdList));
        builder.<String>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getStatusList, SearchNewRequest::setStatusList));
        builder.<String>withRequestField("sql_template_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getSqlTemplateIds, SearchNewRequest::setSqlTemplateIds));
        builder.<Double>withRequestField("cost_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Double.class),
            f -> f.withMarshaller(SearchNewRequest::getCostMin, SearchNewRequest::setCostMin));
        builder.<Double>withRequestField("cost_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Double.class),
            f -> f.withMarshaller(SearchNewRequest::getCostMax, SearchNewRequest::setCostMax));
        builder.<Long>withRequestField("scan_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getScanMin, SearchNewRequest::setScanMin));
        builder.<Long>withRequestField("scan_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getScanMax, SearchNewRequest::setScanMax));
        builder.<Long>withRequestField("affect_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getAffectMin, SearchNewRequest::setAffectMin));
        builder.<Long>withRequestField("affect_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getAffectMax, SearchNewRequest::setAffectMax));
        builder.<Long>withRequestField("return_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getReturnMin, SearchNewRequest::setReturnMin));
        builder.<Long>withRequestField("return_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(SearchNewRequest::getReturnMax, SearchNewRequest::setReturnMax));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchNewRequest::getSortField, SearchNewRequest::setSortField));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(SearchNewRequest::getAsc, SearchNewRequest::setAsc));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchNewRequest::getPageNo, SearchNewRequest::setPageNo));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(SearchNewRequest::getPageSize, SearchNewRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse> setSqlSwitchNew =
        genForSetSqlSwitchNew();

    private static HttpRequestDef<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse> genForSetSqlSwitchNew() {
        // basic
        HttpRequestDef.Builder<SetSqlSwitchNewRequest, SetSqlSwitchNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetSqlSwitchNewRequest.class, SetSqlSwitchNewResponse.class)
                .withName("SetSqlSwitchNew")
                .withUri("/v3/{project_id}/instance/set-sql-switch")
                .withContentType("application/json");

        // requests
        builder.<SetSqlSwitchNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetSqlSwitchNewRequestBody.class),
            f -> f.withMarshaller(SetSqlSwitchNewRequest::getBody, SetSqlSwitchNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse> showBinlogExportTaskInfo =
        genForShowBinlogExportTaskInfo();

    private static HttpRequestDef<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse> genForShowBinlogExportTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowBinlogExportTaskInfoRequest, ShowBinlogExportTaskInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowBinlogExportTaskInfoRequest.class, ShowBinlogExportTaskInfoResponse.class)
                .withName("ShowBinlogExportTaskInfo")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/get-export-task-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBinlogExportTaskInfoRequest::getConnectionId,
                ShowBinlogExportTaskInfoRequest::setConnectionId));
        builder.<Long>withRequestField("export_task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBinlogExportTaskInfoRequest::getExportTaskId,
                ShowBinlogExportTaskInfoRequest::setExportTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBinlogParseRequest, ShowBinlogParseResponse> showBinlogParse =
        genForShowBinlogParse();

    private static HttpRequestDef<ShowBinlogParseRequest, ShowBinlogParseResponse> genForShowBinlogParse() {
        // basic
        HttpRequestDef.Builder<ShowBinlogParseRequest, ShowBinlogParseResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowBinlogParseRequest.class, ShowBinlogParseResponse.class)
                .withName("ShowBinlogParse")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/show")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBinlogParseRequest::getConnectionId, ShowBinlogParseRequest::setConnectionId));
        builder.<ShowBinlogParseRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowBinlogParseRequestBody.class),
            f -> f.withMarshaller(ShowBinlogParseRequest::getBody, ShowBinlogParseRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse> showBinlogTaskInfo =
        genForShowBinlogTaskInfo();

    private static HttpRequestDef<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse> genForShowBinlogTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowBinlogTaskInfoRequest, ShowBinlogTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBinlogTaskInfoRequest.class, ShowBinlogTaskInfoResponse.class)
                .withName("ShowBinlogTaskInfo")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/get-task-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBinlogTaskInfoRequest::getConnectionId,
                ShowBinlogTaskInfoRequest::setConnectionId));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBinlogTaskInfoRequest::getTaskId, ShowBinlogTaskInfoRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse> showDdsConnectionStat =
        genForShowDdsConnectionStat();

    private static HttpRequestDef<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse> genForShowDdsConnectionStat() {
        // basic
        HttpRequestDef.Builder<ShowDdsConnectionStatRequest, ShowDdsConnectionStatResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDdsConnectionStatRequest.class, ShowDdsConnectionStatResponse.class)
            .withName("ShowDdsConnectionStat")
            .withUri("/v3/{project_id}/instances/{instance_id}/dds-connection-stat")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDdsConnectionStatRequest::getInstanceId,
                ShowDdsConnectionStatRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDdsConnectionStatRequest::getNodeId, ShowDdsConnectionStatRequest::setNodeId));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDdsConnectionStatRequest::getCurPage, ShowDdsConnectionStatRequest::setCurPage));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDdsConnectionStatRequest::getPerPage, ShowDdsConnectionStatRequest::setPerPage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse> showDeadLockOriginData =
        genForShowDeadLockOriginData();

    private static HttpRequestDef<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse> genForShowDeadLockOriginData() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockOriginDataRequest, ShowDeadLockOriginDataResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeadLockOriginDataRequest.class, ShowDeadLockOriginDataResponse.class)
            .withName("ShowDeadLockOriginData")
            .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock/get-dead-lock-origin-data")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockOriginDataRequest::getInstanceId,
                ShowDeadLockOriginDataRequest::setInstanceId));
        builder.<String>withRequestField("dead_lock_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockOriginDataRequest::getDeadLockId,
                ShowDeadLockOriginDataRequest::setDeadLockId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockOriginDataRequest::getStartTime,
                ShowDeadLockOriginDataRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockOriginDataRequest::getEndTime,
                ShowDeadLockOriginDataRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse> showDeadLockRelationship =
        genForShowDeadLockRelationship();

    private static HttpRequestDef<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse> genForShowDeadLockRelationship() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockRelationshipRequest, ShowDeadLockRelationshipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDeadLockRelationshipRequest.class, ShowDeadLockRelationshipResponse.class)
                .withName("ShowDeadLockRelationship")
                .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock/get-dead-lock-relationship")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockRelationshipRequest::getInstanceId,
                ShowDeadLockRelationshipRequest::setInstanceId));
        builder.<String>withRequestField("dead_lock_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockRelationshipRequest::getDeadLockId,
                ShowDeadLockRelationshipRequest::setDeadLockId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockRelationshipRequest::getStartTime,
                ShowDeadLockRelationshipRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockRelationshipRequest::getEndTime,
                ShowDeadLockRelationshipRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse> showDeadLockStatistics =
        genForShowDeadLockStatistics();

    private static HttpRequestDef<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse> genForShowDeadLockStatistics() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockStatisticsRequest, ShowDeadLockStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeadLockStatisticsRequest.class, ShowDeadLockStatisticsResponse.class)
            .withName("ShowDeadLockStatistics")
            .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock/get-dead-lock-statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockStatisticsRequest::getInstanceId,
                ShowDeadLockStatisticsRequest::setInstanceId));
        builder.<Long>withRequestField("current_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockStatisticsRequest::getCurrentTime,
                ShowDeadLockStatisticsRequest::setCurrentTime));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockStatisticsRequest::getStartTime,
                ShowDeadLockStatisticsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockStatisticsRequest::getEndTime,
                ShowDeadLockStatisticsRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse> showDeadLockTrend =
        genForShowDeadLockTrend();

    private static HttpRequestDef<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse> genForShowDeadLockTrend() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockTrendRequest, ShowDeadLockTrendResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDeadLockTrendRequest.class, ShowDeadLockTrendResponse.class)
                .withName("ShowDeadLockTrend")
                .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock/get-dead-lock-trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockTrendRequest::getInstanceId, ShowDeadLockTrendRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockTrendRequest::getStartTime, ShowDeadLockTrendRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDeadLockTrendRequest::getEndTime, ShowDeadLockTrendRequest::setEndTime));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse> showExecuteResultWithoutKey =
        genForShowExecuteResultWithoutKey();

    private static HttpRequestDef<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse> genForShowExecuteResultWithoutKey() {
        // basic
        HttpRequestDef.Builder<ShowExecuteResultWithoutKeyRequest, ShowExecuteResultWithoutKeyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowExecuteResultWithoutKeyRequest.class,
                    ShowExecuteResultWithoutKeyResponse.class)
                .withName("ShowExecuteResultWithoutKey")
                .withUri("/v3/{project_id}/connections/{connection_id}/get-execute-result-without-key")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecuteResultWithoutKeyRequest::getConnectionId,
                ShowExecuteResultWithoutKeyRequest::setConnectionId));
        builder.<String>withRequestField("execute_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecuteResultWithoutKeyRequest::getExecuteId,
                ShowExecuteResultWithoutKeyRequest::setExecuteId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse> showExecuteResultWithoutKeyNoRetry =
        genForShowExecuteResultWithoutKeyNoRetry();

    private static HttpRequestDef<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse> genForShowExecuteResultWithoutKeyNoRetry() {
        // basic
        HttpRequestDef.Builder<ShowExecuteResultWithoutKeyNoRetryRequest, ShowExecuteResultWithoutKeyNoRetryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowExecuteResultWithoutKeyNoRetryRequest.class,
                    ShowExecuteResultWithoutKeyNoRetryResponse.class)
                .withName("ShowExecuteResultWithoutKeyNoRetry")
                .withUri("/v3/{project_id}/connections/{connection_id}/get-execute-result-without-key")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecuteResultWithoutKeyNoRetryRequest::getConnectionId,
                ShowExecuteResultWithoutKeyNoRetryRequest::setConnectionId));
        builder.<ShowExecuteResultWithoutKeyNoRetryRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowExecuteResultWithoutKeyNoRetryRequestBody.class),
            f -> f.withMarshaller(ShowExecuteResultWithoutKeyNoRetryRequest::getBody,
                ShowExecuteResultWithoutKeyNoRetryRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecutionPlanRequest, ShowExecutionPlanResponse> showExecutionPlan =
        genForShowExecutionPlan();

    private static HttpRequestDef<ShowExecutionPlanRequest, ShowExecutionPlanResponse> genForShowExecutionPlan() {
        // basic
        HttpRequestDef.Builder<ShowExecutionPlanRequest, ShowExecutionPlanResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowExecutionPlanRequest.class, ShowExecutionPlanResponse.class)
                .withName("ShowExecutionPlan")
                .withUri("/v3/{project_id}/connections/{connection_id}/get-plan")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionPlanRequest::getConnectionId,
                ShowExecutionPlanRequest::setConnectionId));
        builder.<ShowExecutionPlanRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowExecutionPlanRequestBody.class),
            f -> f.withMarshaller(ShowExecutionPlanRequest::getBody, ShowExecutionPlanRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse> showExecutionTimeTemplateTrend =
        genForShowExecutionTimeTemplateTrend();

    private static HttpRequestDef<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse> genForShowExecutionTimeTemplateTrend() {
        // basic
        HttpRequestDef.Builder<ShowExecutionTimeTemplateTrendRequest, ShowExecutionTimeTemplateTrendResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowExecutionTimeTemplateTrendRequest.class,
                    ShowExecutionTimeTemplateTrendResponse.class)
                .withName("ShowExecutionTimeTemplateTrend")
                .withUri("/v3/{project_id}/fullsql/query-ex-time-tpl-trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionTimeTemplateTrendRequest::getInstanceId,
                ShowExecutionTimeTemplateTrendRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExecutionTimeTemplateTrendRequest::getNodeId,
                ShowExecutionTimeTemplateTrendRequest::setNodeId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExecutionTimeTemplateTrendRequest::getStartAt,
                ShowExecutionTimeTemplateTrendRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExecutionTimeTemplateTrendRequest::getEndAt,
                ShowExecutionTimeTemplateTrendRequest::setEndAt));
        builder.<Long>withRequestField("interval_millis",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowExecutionTimeTemplateTrendRequest::getIntervalMillis,
                ShowExecutionTimeTemplateTrendRequest::setIntervalMillis));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse> showFragmentSwitch =
        genForShowFragmentSwitch();

    private static HttpRequestDef<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse> genForShowFragmentSwitch() {
        // basic
        HttpRequestDef.Builder<ShowFragmentSwitchRequest, ShowFragmentSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFragmentSwitchRequest.class, ShowFragmentSwitchResponse.class)
                .withName("ShowFragmentSwitch")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/fragment-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFragmentSwitchRequest::getConnectionId,
                ShowFragmentSwitchRequest::setConnectionId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFragmentSwitchRequest::getEngineType, ShowFragmentSwitchRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse> showInstanceHealthReport4Api =
        genForShowInstanceHealthReport4Api();

    private static HttpRequestDef<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse> genForShowInstanceHealthReport4Api() {
        // basic
        HttpRequestDef.Builder<ShowInstanceHealthReport4ApiRequest, ShowInstanceHealthReport4ApiResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowInstanceHealthReport4ApiRequest.class,
                    ShowInstanceHealthReport4ApiResponse.class)
                .withName("ShowInstanceHealthReport4Api")
                .withUri("/v3/{project_id}/health-report/{instance_id}/get-instance-health-report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceHealthReport4ApiRequest::getInstanceId,
                ShowInstanceHealthReport4ApiRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceHealthReport4ApiRequest::getTaskId,
                ShowInstanceHealthReport4ApiRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceInfoRequest, ShowInstanceInfoResponse> showInstanceInfo =
        genForShowInstanceInfo();

    private static HttpRequestDef<ShowInstanceInfoRequest, ShowInstanceInfoResponse> genForShowInstanceInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceInfoRequest, ShowInstanceInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceInfoRequest.class, ShowInstanceInfoResponse.class)
                .withName("ShowInstanceInfo")
                .withUri("/v3/{project_id}/instance/get-instance-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInfoRequest::getInstanceId, ShowInstanceInfoRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceInfoRequest::getEngineType, ShowInstanceInfoRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse> showInstanceLogUsage =
        genForShowInstanceLogUsage();

    private static HttpRequestDef<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse> genForShowInstanceLogUsage() {
        // basic
        HttpRequestDef.Builder<ShowInstanceLogUsageRequest, ShowInstanceLogUsageResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceLogUsageRequest.class, ShowInstanceLogUsageResponse.class)
            .withName("ShowInstanceLogUsage")
            .withUri("/v3/{project_id}/clouddba/get-instance-log-usage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceLogUsageRequest::getInstanceId,
                ShowInstanceLogUsageRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceMetricRequest, ShowInstanceMetricResponse> showInstanceMetric =
        genForShowInstanceMetric();

    private static HttpRequestDef<ShowInstanceMetricRequest, ShowInstanceMetricResponse> genForShowInstanceMetric() {
        // basic
        HttpRequestDef.Builder<ShowInstanceMetricRequest, ShowInstanceMetricResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowInstanceMetricRequest.class, ShowInstanceMetricResponse.class)
                .withName("ShowInstanceMetric")
                .withUri("/v3/{project_id}/instance/query-instance-metric")
                .withContentType("application/json");

        // requests
        builder.<ShowInstanceMetricRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowInstanceMetricRequestBody.class),
            f -> f.withMarshaller(ShowInstanceMetricRequest::getBody, ShowInstanceMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse> showInstanceNodesInfo =
        genForShowInstanceNodesInfo();

    private static HttpRequestDef<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse> genForShowInstanceNodesInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceNodesInfoRequest, ShowInstanceNodesInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceNodesInfoRequest.class, ShowInstanceNodesInfoResponse.class)
            .withName("ShowInstanceNodesInfo")
            .withUri("/v3/{project_id}/instance/get-instance-nodes-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNodesInfoRequest::getInstanceId,
                ShowInstanceNodesInfoRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNodesInfoRequest::getEngineType,
                ShowInstanceNodesInfoRequest::setEngineType));
        builder.<String>withRequestField("all_nodes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNodesInfoRequest::getAllNodes,
                ShowInstanceNodesInfoRequest::setAllNodes));
        builder.<String>withRequestField("show_hidden_nodes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceNodesInfoRequest::getShowHiddenNodes,
                ShowInstanceNodesInfoRequest::setShowHiddenNodes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse> showIsSignedProtocol =
        genForShowIsSignedProtocol();

    private static HttpRequestDef<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse> genForShowIsSignedProtocol() {
        // basic
        HttpRequestDef.Builder<ShowIsSignedProtocolRequest, ShowIsSignedProtocolResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIsSignedProtocolRequest.class, ShowIsSignedProtocolResponse.class)
            .withName("ShowIsSignedProtocol")
            .withUri("/v3/{project_id}/binlog-parse/is-signed-protocol")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse> showKillProcessTask =
        genForShowKillProcessTask();

    private static HttpRequestDef<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse> genForShowKillProcessTask() {
        // basic
        HttpRequestDef.Builder<ShowKillProcessTaskRequest, ShowKillProcessTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowKillProcessTaskRequest.class, ShowKillProcessTaskResponse.class)
                .withName("ShowKillProcessTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/auto-flow/query-kill-process-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillProcessTaskRequest::getInstanceId,
                ShowKillProcessTaskRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse> showLatestDeadLockSnapshot4Api =
        genForShowLatestDeadLockSnapshot4Api();

    private static HttpRequestDef<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse> genForShowLatestDeadLockSnapshot4Api() {
        // basic
        HttpRequestDef.Builder<ShowLatestDeadLockSnapshot4ApiRequest, ShowLatestDeadLockSnapshot4ApiResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestDeadLockSnapshot4ApiRequest.class,
                    ShowLatestDeadLockSnapshot4ApiResponse.class)
                .withName("ShowLatestDeadLockSnapshot4Api")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/query-latest-dead-lock-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestDeadLockSnapshot4ApiRequest::getConnectionId,
                ShowLatestDeadLockSnapshot4ApiRequest::setConnectionId));
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLatestDeadLockSnapshot4ApiRequest::getId,
                ShowLatestDeadLockSnapshot4ApiRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetaLockRequest, ShowMetaLockResponse> showMetaLock = genForShowMetaLock();

    private static HttpRequestDef<ShowMetaLockRequest, ShowMetaLockResponse> genForShowMetaLock() {
        // basic
        HttpRequestDef.Builder<ShowMetaLockRequest, ShowMetaLockResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetaLockRequest.class, ShowMetaLockResponse.class)
                .withName("ShowMetaLock")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/query-meta-lock")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockRequest::getConnectionId, ShowMetaLockRequest::setConnectionId));
        builder.<String>withRequestField("thread_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockRequest::getThreadId, ShowMetaLockRequest::setThreadId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockRequest::getDbName, ShowMetaLockRequest::setDbName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockRequest::getTableName, ShowMetaLockRequest::setTableName));
        builder.<String>withRequestField("lock_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockRequest::getLockStatus, ShowMetaLockRequest::setLockStatus));
        builder.<String>withRequestField("lock_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockRequest::getLockType, ShowMetaLockRequest::setLockType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse> showMetaLockSnapshot =
        genForShowMetaLockSnapshot();

    private static HttpRequestDef<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse> genForShowMetaLockSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowMetaLockSnapshotRequest, ShowMetaLockSnapshotResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMetaLockSnapshotRequest.class, ShowMetaLockSnapshotResponse.class)
            .withName("ShowMetaLockSnapshot")
            .withUri("/v3/{project_id}/connections/{connection_id}/instance/query-meta-lock-snapshot")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getConnectionId,
                ShowMetaLockSnapshotRequest::setConnectionId));
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getId, ShowMetaLockSnapshotRequest::setId));
        builder.<String>withRequestField("thread_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getThreadId, ShowMetaLockSnapshotRequest::setThreadId));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getDbName, ShowMetaLockSnapshotRequest::setDbName));
        builder.<String>withRequestField("table_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getTableName,
                ShowMetaLockSnapshotRequest::setTableName));
        builder.<String>withRequestField("lock_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getLockStatus,
                ShowMetaLockSnapshotRequest::setLockStatus));
        builder.<String>withRequestField("lock_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetaLockSnapshotRequest::getLockType, ShowMetaLockSnapshotRequest::setLockType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOpeningInfoRequest, ShowOpeningInfoResponse> showOpeningInfo =
        genForShowOpeningInfo();

    private static HttpRequestDef<ShowOpeningInfoRequest, ShowOpeningInfoResponse> genForShowOpeningInfo() {
        // basic
        HttpRequestDef.Builder<ShowOpeningInfoRequest, ShowOpeningInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOpeningInfoRequest.class, ShowOpeningInfoResponse.class)
                .withName("ShowOpeningInfo")
                .withUri("/v3/{project_id}/clouddba/get-opening-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOpeningInfoRequest::getInstanceId, ShowOpeningInfoRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse> showSingleTemplateTrend =
        genForShowSingleTemplateTrend();

    private static HttpRequestDef<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse> genForShowSingleTemplateTrend() {
        // basic
        HttpRequestDef.Builder<ShowSingleTemplateTrendRequest, ShowSingleTemplateTrendResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSingleTemplateTrendRequest.class, ShowSingleTemplateTrendResponse.class)
            .withName("ShowSingleTemplateTrend")
            .withUri("/v3/{project_id}/fullsql/query-single-tpl-trend")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleTemplateTrendRequest::getInstanceId,
                ShowSingleTemplateTrendRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleTemplateTrendRequest::getNodeId,
                ShowSingleTemplateTrendRequest::setNodeId));
        builder.<String>withRequestField("template_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSingleTemplateTrendRequest::getTemplateId,
                ShowSingleTemplateTrendRequest::setTemplateId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSingleTemplateTrendRequest::getStartAt,
                ShowSingleTemplateTrendRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSingleTemplateTrendRequest::getEndAt, ShowSingleTemplateTrendRequest::setEndAt));
        builder.<Long>withRequestField("interval_millis",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSingleTemplateTrendRequest::getIntervalMillis,
                ShowSingleTemplateTrendRequest::setIntervalMillis));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse> showSqlTemplateTrend =
        genForShowSqlTemplateTrend();

    private static HttpRequestDef<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse> genForShowSqlTemplateTrend() {
        // basic
        HttpRequestDef.Builder<ShowSqlTemplateTrendRequest, ShowSqlTemplateTrendResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlTemplateTrendRequest.class, ShowSqlTemplateTrendResponse.class)
            .withName("ShowSqlTemplateTrend")
            .withUri("/v3/{project_id}/fullsql/query-sql-tpl-trend")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlTemplateTrendRequest::getInstanceId,
                ShowSqlTemplateTrendRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlTemplateTrendRequest::getNodeId, ShowSqlTemplateTrendRequest::setNodeId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSqlTemplateTrendRequest::getStartAt, ShowSqlTemplateTrendRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSqlTemplateTrendRequest::getEndAt, ShowSqlTemplateTrendRequest::setEndAt));
        builder.<Long>withRequestField("interval_millis",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowSqlTemplateTrendRequest::getIntervalMillis,
                ShowSqlTemplateTrendRequest::setIntervalMillis));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse> showSupportKeyString =
        genForShowSupportKeyString();

    private static HttpRequestDef<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse> genForShowSupportKeyString() {
        // basic
        HttpRequestDef.Builder<ShowSupportKeyStringRequest, ShowSupportKeyStringResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSupportKeyStringRequest.class, ShowSupportKeyStringResponse.class)
            .withName("ShowSupportKeyString")
            .withUri("/v3/{project_id}/instances/{instance_id}/auto-sql-limiting/support-key-string")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSupportKeyStringRequest::getInstanceId,
                ShowSupportKeyStringRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSupportKeyStringRequest::getEngineType,
                ShowSupportKeyStringRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTuningResultRequest, ShowTuningResultResponse> showTuningResult =
        genForShowTuningResult();

    private static HttpRequestDef<ShowTuningResultRequest, ShowTuningResultResponse> genForShowTuningResult() {
        // basic
        HttpRequestDef.Builder<ShowTuningResultRequest, ShowTuningResultResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowTuningResultRequest.class, ShowTuningResultResponse.class)
                .withName("ShowTuningResult")
                .withUri("/v3/{project_id}/connections/{connection_id}/tuning/get-tuning-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTuningResultRequest::getConnectionId, ShowTuningResultRequest::setConnectionId));
        builder.<ShowTuningResultRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTuningResultRequestBody.class),
            f -> f.withMarshaller(ShowTuningResultRequest::getBody, ShowTuningResultRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse> showWaitingLocksSnapshot =
        genForShowWaitingLocksSnapshot();

    private static HttpRequestDef<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse> genForShowWaitingLocksSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowWaitingLocksSnapshotRequest, ShowWaitingLocksSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowWaitingLocksSnapshotRequest.class, ShowWaitingLocksSnapshotResponse.class)
                .withName("ShowWaitingLocksSnapshot")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/query-waiting-locks-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWaitingLocksSnapshotRequest::getConnectionId,
                ShowWaitingLocksSnapshotRequest::setConnectionId));
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWaitingLocksSnapshotRequest::getId, ShowWaitingLocksSnapshotRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse> showWdrSnapshot =
        genForShowWdrSnapshot();

    private static HttpRequestDef<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse> genForShowWdrSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowWdrSnapshotRequest, ShowWdrSnapshotResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowWdrSnapshotRequest.class, ShowWdrSnapshotResponse.class)
                .withName("ShowWdrSnapshot")
                .withUri("/v3/{project_id}/connections/{connection_id}/wdr/get-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWdrSnapshotRequest::getConnectionId, ShowWdrSnapshotRequest::setConnectionId));
        builder.<ShowWdrSnapshotRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowWdrSnapshotRequestBody.class),
            f -> f.withMarshaller(ShowWdrSnapshotRequest::getBody, ShowWdrSnapshotRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SignProtocolNewRequest, SignProtocolNewResponse> signProtocolNew =
        genForSignProtocolNew();

    private static HttpRequestDef<SignProtocolNewRequest, SignProtocolNewResponse> genForSignProtocolNew() {
        // basic
        HttpRequestDef.Builder<SignProtocolNewRequest, SignProtocolNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SignProtocolNewRequest.class, SignProtocolNewResponse.class)
                .withName("SignProtocolNew")
                .withUri("/v3/{project_id}/binlog-parse/sign-protocol")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopBinlogTaskRequest, StopBinlogTaskResponse> stopBinlogTask =
        genForStopBinlogTask();

    private static HttpRequestDef<StopBinlogTaskRequest, StopBinlogTaskResponse> genForStopBinlogTask() {
        // basic
        HttpRequestDef.Builder<StopBinlogTaskRequest, StopBinlogTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StopBinlogTaskRequest.class, StopBinlogTaskResponse.class)
                .withName("StopBinlogTask")
                .withUri("/v3/{project_id}/connections/{connection_id}/binlog-parse/stop-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopBinlogTaskRequest::getConnectionId, StopBinlogTaskRequest::setConnectionId));
        builder.<StopBinlogTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StopBinlogTaskRequestBody.class),
            f -> f.withMarshaller(StopBinlogTaskRequest::getBody, StopBinlogTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse> subscribeInstanceReportNew =
        genForSubscribeInstanceReportNew();

    private static HttpRequestDef<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse> genForSubscribeInstanceReportNew() {
        // basic
        HttpRequestDef.Builder<SubscribeInstanceReportNewRequest, SubscribeInstanceReportNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SubscribeInstanceReportNewRequest.class,
                    SubscribeInstanceReportNewResponse.class)
                .withName("SubscribeInstanceReportNew")
                .withUri("/v3/{project_id}/health-report/{instance_id}/subscribe-instance-report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeInstanceReportNewRequest::getInstanceId,
                SubscribeInstanceReportNewRequest::setInstanceId));
        builder.<SubscribeInstanceReportNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SubscribeInstanceReportNewRequestBody.class),
            f -> f.withMarshaller(SubscribeInstanceReportNewRequest::getBody,
                SubscribeInstanceReportNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse> synchronizeInstanceListNew =
        genForSynchronizeInstanceListNew();

    private static HttpRequestDef<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse> genForSynchronizeInstanceListNew() {
        // basic
        HttpRequestDef.Builder<SynchronizeInstanceListNewRequest, SynchronizeInstanceListNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SynchronizeInstanceListNewRequest.class,
                    SynchronizeInstanceListNewResponse.class)
                .withName("SynchronizeInstanceListNew")
                .withUri("/v3/{project_id}/instance/synchronize-instance-list")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse> unsubscribeInstanceReportNew =
        genForUnsubscribeInstanceReportNew();

    private static HttpRequestDef<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse> genForUnsubscribeInstanceReportNew() {
        // basic
        HttpRequestDef.Builder<UnsubscribeInstanceReportNewRequest, UnsubscribeInstanceReportNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UnsubscribeInstanceReportNewRequest.class,
                    UnsubscribeInstanceReportNewResponse.class)
                .withName("UnsubscribeInstanceReportNew")
                .withUri("/v3/{project_id}/health-report/{instance_id}/unsubscribe-instance-report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnsubscribeInstanceReportNewRequest::getInstanceId,
                UnsubscribeInstanceReportNewRequest::setInstanceId));
        builder.<UnsubscribeInstanceReportNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UnsubscribeInstanceReportNewRequestBody.class),
            f -> f.withMarshaller(UnsubscribeInstanceReportNewRequest::getBody,
                UnsubscribeInstanceReportNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> updateInstanceConfig =
        genForUpdateInstanceConfig();

    private static HttpRequestDef<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> genForUpdateInstanceConfig() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceConfigRequest, UpdateInstanceConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceConfigRequest.class, UpdateInstanceConfigResponse.class)
            .withName("UpdateInstanceConfig")
            .withUri("/v3/{project_id}/instances/{instance_id}/config/set-config")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceConfigRequest::getInstanceId,
                UpdateInstanceConfigRequest::setInstanceId));
        builder.<UpdateInstanceConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceConfigRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceConfigRequest::getBody, UpdateInstanceConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse> updateSearchPathFlag =
        genForUpdateSearchPathFlag();

    private static HttpRequestDef<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse> genForUpdateSearchPathFlag() {
        // basic
        HttpRequestDef.Builder<UpdateSearchPathFlagRequest, UpdateSearchPathFlagResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSearchPathFlagRequest.class, UpdateSearchPathFlagResponse.class)
            .withName("UpdateSearchPathFlag")
            .withUri("/v3/{project_id}/connections/{connection_id}/clouddba-edit-search-path-flag")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSearchPathFlagRequest::getConnectionId,
                UpdateSearchPathFlagRequest::setConnectionId));
        builder.<UpdateSearchPathFlagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSearchPathFlagRequestBody.class),
            f -> f.withMarshaller(UpdateSearchPathFlagRequest::getBody, UpdateSearchPathFlagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse> updateSharedInfoNew =
        genForUpdateSharedInfoNew();

    private static HttpRequestDef<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse> genForUpdateSharedInfoNew() {
        // basic
        HttpRequestDef.Builder<UpdateSharedInfoNewRequest, UpdateSharedInfoNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateSharedInfoNewRequest.class, UpdateSharedInfoNewResponse.class)
                .withName("UpdateSharedInfoNew")
                .withUri("/v3/{project_id}/connections/{connection_id}/update-shared-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSharedInfoNewRequest::getConnectionId,
                UpdateSharedInfoNewRequest::setConnectionId));
        builder.<UpdateSharedInfoNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSharedInfoNewRequestBody.class),
            f -> f.withMarshaller(UpdateSharedInfoNewRequest::getBody, UpdateSharedInfoNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<VerifyConnectionNewRequest, VerifyConnectionNewResponse> verifyConnectionNew =
        genForVerifyConnectionNew();

    private static HttpRequestDef<VerifyConnectionNewRequest, VerifyConnectionNewResponse> genForVerifyConnectionNew() {
        // basic
        HttpRequestDef.Builder<VerifyConnectionNewRequest, VerifyConnectionNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, VerifyConnectionNewRequest.class, VerifyConnectionNewResponse.class)
                .withName("VerifyConnectionNew")
                .withUri("/v3/{project_id}/connections/verify-connection")
                .withContentType("application/json");

        // requests
        builder.<VerifyConnectionNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VerifyConnectionNewRequestBody.class),
            f -> f.withMarshaller(VerifyConnectionNewRequest::getBody, VerifyConnectionNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEmailTemplateRequest, AddEmailTemplateResponse> addEmailTemplate =
        genForAddEmailTemplate();

    private static HttpRequestDef<AddEmailTemplateRequest, AddEmailTemplateResponse> genForAddEmailTemplate() {
        // basic
        HttpRequestDef.Builder<AddEmailTemplateRequest, AddEmailTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddEmailTemplateRequest.class, AddEmailTemplateResponse.class)
                .withName("AddEmailTemplate")
                .withUri("/v3/{project_id}/batch-inspection/email-template")
                .withContentType("application/json");

        // requests
        builder.<AddEmailTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddEmailTemplateRequestBody.class),
            f -> f.withMarshaller(AddEmailTemplateRequest::getBody, AddEmailTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddFullSqlTaskRequest, AddFullSqlTaskResponse> addFullSqlTask =
        genForAddFullSqlTask();

    private static HttpRequestDef<AddFullSqlTaskRequest, AddFullSqlTaskResponse> genForAddFullSqlTask() {
        // basic
        HttpRequestDef.Builder<AddFullSqlTaskRequest, AddFullSqlTaskResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddFullSqlTaskRequest.class, AddFullSqlTaskResponse.class)
                .withName("AddFullSqlTask")
                .withUri("/v3/{project_id}/instances/{instance_id}/full-sql/add-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddFullSqlTaskRequest::getInstanceId, AddFullSqlTaskRequest::setInstanceId));
        builder.<AddFullSqlTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddFullSqlTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(AddFullSqlTaskRequest::getXLanguage, AddFullSqlTaskRequest::setXLanguage));
        builder.<AddFullSqlTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddFullSqlTaskBody.class),
            f -> f.withMarshaller(AddFullSqlTaskRequest::getBody, AddFullSqlTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddInstanceGroupRequest, AddInstanceGroupResponse> addInstanceGroup =
        genForAddInstanceGroup();

    private static HttpRequestDef<AddInstanceGroupRequest, AddInstanceGroupResponse> genForAddInstanceGroup() {
        // basic
        HttpRequestDef.Builder<AddInstanceGroupRequest, AddInstanceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddInstanceGroupRequest.class, AddInstanceGroupResponse.class)
                .withName("AddInstanceGroup")
                .withUri("/v3/{project_id}/batch-inspection/instance-group")
                .withContentType("application/json");

        // requests
        builder.<AddInstanceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddInstanceGroupRequestBody.class),
            f -> f.withMarshaller(AddInstanceGroupRequest::getBody, AddInstanceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddInstanceToGroupRequest, AddInstanceToGroupResponse> addInstanceToGroup =
        genForAddInstanceToGroup();

    private static HttpRequestDef<AddInstanceToGroupRequest, AddInstanceToGroupResponse> genForAddInstanceToGroup() {
        // basic
        HttpRequestDef.Builder<AddInstanceToGroupRequest, AddInstanceToGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddInstanceToGroupRequest.class, AddInstanceToGroupResponse.class)
                .withName("AddInstanceToGroup")
                .withUri("/v3/{project_id}/batch-inspection/add-instance-to-group")
                .withContentType("application/json");

        // requests
        builder.<AddInstanceToGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddInstanceToGroupRequestBody.class),
            f -> f.withMarshaller(AddInstanceToGroupRequest::getBody, AddInstanceToGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse> addSqlLimitingRecordNew =
        genForAddSqlLimitingRecordNew();

    private static HttpRequestDef<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse> genForAddSqlLimitingRecordNew() {
        // basic
        HttpRequestDef.Builder<AddSqlLimitingRecordNewRequest, AddSqlLimitingRecordNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, AddSqlLimitingRecordNewRequest.class, AddSqlLimitingRecordNewResponse.class)
            .withName("AddSqlLimitingRecordNew")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-limiting/add-sql-limiting-record")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddSqlLimitingRecordNewRequest::getInstanceId,
                AddSqlLimitingRecordNewRequest::setInstanceId));
        builder.<AddSqlLimitingRecordNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddSqlLimitingRecordNewRequestBody.class),
            f -> f.withMarshaller(AddSqlLimitingRecordNewRequest::getBody, AddSqlLimitingRecordNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse> batchDeleteConnectionNew =
        genForBatchDeleteConnectionNew();

    private static HttpRequestDef<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse> genForBatchDeleteConnectionNew() {
        // basic
        HttpRequestDef.Builder<BatchDeleteConnectionNewRequest, BatchDeleteConnectionNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteConnectionNewRequest.class,
                    BatchDeleteConnectionNewResponse.class)
                .withName("BatchDeleteConnectionNew")
                .withUri("/v3/{project_id}/batch-delete-connections")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteConnectionNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteConnectionNewRequestBody.class),
            f -> f.withMarshaller(BatchDeleteConnectionNewRequest::getBody, BatchDeleteConnectionNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSendEmailRequest, BatchSendEmailResponse> batchSendEmail =
        genForBatchSendEmail();

    private static HttpRequestDef<BatchSendEmailRequest, BatchSendEmailResponse> genForBatchSendEmail() {
        // basic
        HttpRequestDef.Builder<BatchSendEmailRequest, BatchSendEmailResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchSendEmailRequest.class, BatchSendEmailResponse.class)
                .withName("BatchSendEmail")
                .withUri("/v3/{project_id}/batch-inspection/batch-send-email")
                .withContentType("application/json");

        // requests
        builder.<BatchSendEmailRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSendEmailRequestBody.class),
            f -> f.withMarshaller(BatchSendEmailRequest::getBody, BatchSendEmailRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSubscribeReportRequest, BatchSubscribeReportResponse> batchSubscribeReport =
        genForBatchSubscribeReport();

    private static HttpRequestDef<BatchSubscribeReportRequest, BatchSubscribeReportResponse> genForBatchSubscribeReport() {
        // basic
        HttpRequestDef.Builder<BatchSubscribeReportRequest, BatchSubscribeReportResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchSubscribeReportRequest.class, BatchSubscribeReportResponse.class)
            .withName("BatchSubscribeReport")
            .withUri("/v3/{project_id}/batch-inspection/batch-subscribe")
            .withContentType("application/json");

        // requests
        builder.<BatchSubscribeReportRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSubscribeReportRequestBody.class),
            f -> f.withMarshaller(BatchSubscribeReportRequest::getBody, BatchSubscribeReportRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelShareNewRequest, CancelShareNewResponse> cancelShareNew =
        genForCancelShareNew();

    private static HttpRequestDef<CancelShareNewRequest, CancelShareNewResponse> genForCancelShareNew() {
        // basic
        HttpRequestDef.Builder<CancelShareNewRequest, CancelShareNewResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelShareNewRequest.class, CancelShareNewResponse.class)
                .withName("CancelShareNew")
                .withUri("/v3.1/{project_id}/connections/cancel-share")
                .withContentType("application/json");

        // requests
        builder.<CancelShareNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelShareNewRequestBody.class),
            f -> f.withMarshaller(CancelShareNewRequest::getBody, CancelShareNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeChargeModeRequest, ChangeChargeModeResponse> changeChargeMode =
        genForChangeChargeMode();

    private static HttpRequestDef<ChangeChargeModeRequest, ChangeChargeModeResponse> genForChangeChargeMode() {
        // basic
        HttpRequestDef.Builder<ChangeChargeModeRequest, ChangeChargeModeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeChargeModeRequest.class, ChangeChargeModeResponse.class)
                .withName("ChangeChargeMode")
                .withUri("/v3/{project_id}/cloud-dba/change-payment-mode")
                .withContentType("application/json");

        // requests
        builder.<ChangeChargeModeRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeChargeModeRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeChargeModeRequest::getXLanguage, ChangeChargeModeRequest::setXLanguage));
        builder.<ChangeChargeModeBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeChargeModeBody.class),
            f -> f.withMarshaller(ChangeChargeModeRequest::getBody, ChangeChargeModeRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse> changeDeadLockSwitchNew =
        genForChangeDeadLockSwitchNew();

    private static HttpRequestDef<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse> genForChangeDeadLockSwitchNew() {
        // basic
        HttpRequestDef.Builder<ChangeDeadLockSwitchNewRequest, ChangeDeadLockSwitchNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangeDeadLockSwitchNewRequest.class, ChangeDeadLockSwitchNewResponse.class)
            .withName("ChangeDeadLockSwitchNew")
            .withUri("/v3/{project_id}/dead-lock/switch")
            .withContentType("application/json");

        // requests
        builder.<ChangeDeadLockSwitchNewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeDeadLockSwitchNewRequestBody.class),
            f -> f.withMarshaller(ChangeDeadLockSwitchNewRequest::getBody, ChangeDeadLockSwitchNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse> changeFullDeadLockSwitch =
        genForChangeFullDeadLockSwitch();

    private static HttpRequestDef<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse> genForChangeFullDeadLockSwitch() {
        // basic
        HttpRequestDef.Builder<ChangeFullDeadLockSwitchRequest, ChangeFullDeadLockSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, ChangeFullDeadLockSwitchRequest.class, ChangeFullDeadLockSwitchResponse.class)
                .withName("ChangeFullDeadLockSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/set-fulldeadlock-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeFullDeadLockSwitchRequest::getInstanceId,
                ChangeFullDeadLockSwitchRequest::setInstanceId));
        builder.<ChangeFullDeadLockSwitchRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeFullDeadLockSwitchRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeFullDeadLockSwitchRequest::getXLanguage,
                ChangeFullDeadLockSwitchRequest::setXLanguage));
        builder.<ChangeFullDeadLockSwitchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeFullDeadLockSwitchRequestBody.class),
            f -> f.withMarshaller(ChangeFullDeadLockSwitchRequest::getBody, ChangeFullDeadLockSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse> changePaymentModeNew =
        genForChangePaymentModeNew();

    private static HttpRequestDef<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse> genForChangePaymentModeNew() {
        // basic
        HttpRequestDef.Builder<ChangePaymentModeNewRequest, ChangePaymentModeNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePaymentModeNewRequest.class, ChangePaymentModeNewResponse.class)
            .withName("ChangePaymentModeNew")
            .withUri("/v3/{project_id}/clouddba/change-payment-mode")
            .withContentType("application/json");

        // requests
        builder.<ChangePaymentModeForConsoleBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePaymentModeForConsoleBody.class),
            f -> f.withMarshaller(ChangePaymentModeNewRequest::getBody, ChangePaymentModeNewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatus =
        genForChangeSqlLimitSwitchStatus();

    private static HttpRequestDef<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> genForChangeSqlLimitSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeSqlLimitSwitchStatusRequest.class,
                    ChangeSqlLimitSwitchStatusResponse.class)
                .withName("ChangeSqlLimitSwitchStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeSqlLimitSwitchStatusRequest::getInstanceId,
                ChangeSqlLimitSwitchStatusRequest::setInstanceId));
        builder.<ChangeSqlLimitSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeSqlLimitSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeSqlLimitSwitchStatusRequest::getXLanguage,
                ChangeSqlLimitSwitchStatusRequest::setXLanguage));
        builder.<ChangeSqlLimitSwitchStatusBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSqlLimitSwitchStatusBody.class),
            f -> f.withMarshaller(ChangeSqlLimitSwitchStatusRequest::getBody,
                ChangeSqlLimitSwitchStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitch =
        genForChangeSqlSwitch();

    private static HttpRequestDef<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> genForChangeSqlSwitch() {
        // basic
        HttpRequestDef.Builder<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangeSqlSwitchRequest.class, ChangeSqlSwitchResponse.class)
                .withName("ChangeSqlSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeSqlSwitchRequest::getInstanceId, ChangeSqlSwitchRequest::setInstanceId));
        builder.<ChangeSqlSwitchRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeSqlSwitchRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeSqlSwitchRequest::getXLanguage, ChangeSqlSwitchRequest::setXLanguage));
        builder.<ChangeSqlSwitchBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSqlSwitchBody.class),
            f -> f.withMarshaller(ChangeSqlSwitchRequest::getBody, ChangeSqlSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> changeTransactionSwitchStatus =
        genForChangeTransactionSwitchStatus();

    private static HttpRequestDef<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> genForChangeTransactionSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ChangeTransactionSwitchStatusRequest, ChangeTransactionSwitchStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ChangeTransactionSwitchStatusRequest.class,
                    ChangeTransactionSwitchStatusResponse.class)
                .withName("ChangeTransactionSwitchStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/transaction/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeTransactionSwitchStatusRequest::getInstanceId,
                ChangeTransactionSwitchStatusRequest::setInstanceId));
        builder.<ChangeTransactionSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeTransactionSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeTransactionSwitchStatusRequest::getXLanguage,
                ChangeTransactionSwitchStatusRequest::setXLanguage));
        builder.<TransactionSwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TransactionSwitchReq.class),
            f -> f.withMarshaller(ChangeTransactionSwitchStatusRequest::getBody,
                ChangeTransactionSwitchStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCredentialRequest, CheckCredentialResponse> checkCredential =
        genForCheckCredential();

    private static HttpRequestDef<CheckCredentialRequest, CheckCredentialResponse> genForCheckCredential() {
        // basic
        HttpRequestDef.Builder<CheckCredentialRequest, CheckCredentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckCredentialRequest.class, CheckCredentialResponse.class)
                .withName("CheckCredential")
                .withUri("/v3/{project_id}/instances/{instance_id}/health-report/check-credential")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckCredentialRequest::getInstanceId, CheckCredentialRequest::setInstanceId));
        builder.<CheckCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckCredentialRequestBody.class),
            f -> f.withMarshaller(CheckCredentialRequest::getBody, CheckCredentialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse> checkCredentialForBatchInspection =
        genForCheckCredentialForBatchInspection();

    private static HttpRequestDef<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse> genForCheckCredentialForBatchInspection() {
        // basic
        HttpRequestDef.Builder<CheckCredentialForBatchInspectionRequest, CheckCredentialForBatchInspectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CheckCredentialForBatchInspectionRequest.class,
                    CheckCredentialForBatchInspectionResponse.class)
                .withName("CheckCredentialForBatchInspection")
                .withUri("/v3/{project_id}/batch-inspection/check-credential")
                .withContentType("application/json");

        // requests
        builder.<CheckCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CheckCredentialRequestBody.class),
            f -> f.withMarshaller(CheckCredentialForBatchInspectionRequest::getBody,
                CheckCredentialForBatchInspectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> createHealthReportTask =
        genForCreateHealthReportTask();

    private static HttpRequestDef<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> genForCreateHealthReportTask() {
        // basic
        HttpRequestDef.Builder<CreateHealthReportTaskRequest, CreateHealthReportTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateHealthReportTaskRequest.class, CreateHealthReportTaskResponse.class)
            .withName("CreateHealthReportTask")
            .withUri("/v3/{project_id}/instances/{instance_id}/create-instance-health-report-task")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHealthReportTaskRequest::getInstanceId,
                CreateHealthReportTaskRequest::setInstanceId));
        builder.<CreateHealthReportTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHealthReportTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateHealthReportTaskRequest::getXLanguage,
                CreateHealthReportTaskRequest::setXLanguage));
        builder.<CreateHealthReportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHealthReportReq.class),
            f -> f.withMarshaller(CreateHealthReportTaskRequest::getBody, CreateHealthReportTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse> createHistoryTransactionExportTask =
        genForCreateHistoryTransactionExportTask();

    private static HttpRequestDef<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse> genForCreateHistoryTransactionExportTask() {
        // basic
        HttpRequestDef.Builder<CreateHistoryTransactionExportTaskRequest, CreateHistoryTransactionExportTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateHistoryTransactionExportTaskRequest.class,
                    CreateHistoryTransactionExportTaskResponse.class)
                .withName("CreateHistoryTransactionExportTask")
                .withUri("/v3/{project_id}/transaction/{instance_id}/create-export-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHistoryTransactionExportTaskRequest::getInstanceId,
                CreateHistoryTransactionExportTaskRequest::setInstanceId));
        builder.<CreateHistoryTransactionExportTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateHistoryTransactionExportTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateHistoryTransactionExportTaskRequest::getXLanguage,
                CreateHistoryTransactionExportTaskRequest::setXLanguage));
        builder.<CreateExportTaskReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExportTaskReq.class),
            f -> f.withMarshaller(CreateHistoryTransactionExportTaskRequest::getBody,
                CreateHistoryTransactionExportTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSnapshotsRequest, CreateSnapshotsResponse> createSnapshots =
        genForCreateSnapshots();

    private static HttpRequestDef<CreateSnapshotsRequest, CreateSnapshotsResponse> genForCreateSnapshots() {
        // basic
        HttpRequestDef.Builder<CreateSnapshotsRequest, CreateSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSnapshotsRequest.class, CreateSnapshotsResponse.class)
                .withName("CreateSnapshots")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/create-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSnapshotsRequest::getConnectionId, CreateSnapshotsRequest::setConnectionId));
        builder.<CreateSnapshotsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSnapshotsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateSnapshotsRequest::getXLanguage, CreateSnapshotsRequest::setXLanguage));
        builder.<CreateSnapshotsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSnapshotsRequestBody.class),
            f -> f.withMarshaller(CreateSnapshotsRequest::getBody, CreateSnapshotsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTask =
        genForCreateSpaceAnalysisTask();

    private static HttpRequestDef<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> genForCreateSpaceAnalysisTask() {
        // basic
        HttpRequestDef.Builder<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSpaceAnalysisTaskRequest.class, CreateSpaceAnalysisTaskResponse.class)
            .withName("CreateSpaceAnalysisTask")
            .withUri("/v3/{project_id}/instances/{instance_id}/space-analysis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpaceAnalysisTaskRequest::getInstanceId,
                CreateSpaceAnalysisTaskRequest::setInstanceId));
        builder.<CreateSpaceAnalysisTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSpaceAnalysisTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateSpaceAnalysisTaskRequest::getXLanguage,
                CreateSpaceAnalysisTaskRequest::setXLanguage));
        builder.<CreateSpaceAnalysisTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSpaceAnalysisTaskBody.class),
            f -> f.withMarshaller(CreateSpaceAnalysisTaskRequest::getBody, CreateSpaceAnalysisTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRules =
        genForCreateSqlLimitRules();

    private static HttpRequestDef<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> genForCreateSqlLimitRules() {
        // basic
        HttpRequestDef.Builder<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateSqlLimitRulesRequest.class, CreateSqlLimitRulesResponse.class)
                .withName("CreateSqlLimitRules")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSqlLimitRulesRequest::getInstanceId,
                CreateSqlLimitRulesRequest::setInstanceId));
        builder.<CreateSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateSqlLimitRulesRequest::getXLanguage, CreateSqlLimitRulesRequest::setXLanguage));
        builder.<CreateSqlLimitRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlLimitRulesBody.class),
            f -> f.withMarshaller(CreateSqlLimitRulesRequest::getBody, CreateSqlLimitRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTuningRequest, CreateTuningResponse> createTuning = genForCreateTuning();

    private static HttpRequestDef<CreateTuningRequest, CreateTuningResponse> genForCreateTuning() {
        // basic
        HttpRequestDef.Builder<CreateTuningRequest, CreateTuningResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTuningRequest.class, CreateTuningResponse.class)
                .withName("CreateTuning")
                .withUri("/v3/{project_id}/connections/{connection_id}/tuning/create-tuning")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTuningRequest::getConnectionId, CreateTuningRequest::setConnectionId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTuningRequest::getXLanguage, CreateTuningRequest::setXLanguage));
        builder.<CreateTuningReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTuningReq.class),
            f -> f.withMarshaller(CreateTuningRequest::getBody, CreateTuningRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUser = genForDeleteDbUser();

    private static HttpRequestDef<DeleteDbUserRequest, DeleteDbUserResponse> genForDeleteDbUser() {
        // basic
        HttpRequestDef.Builder<DeleteDbUserRequest, DeleteDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDbUserRequest.class, DeleteDbUserResponse.class)
                .withName("DeleteDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, DeleteDbUserRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getDbUserId, DeleteDbUserRequest::setDbUserId));
        builder.<DeleteDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getXLanguage, DeleteDbUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse> deleteEmailTemplate =
        genForDeleteEmailTemplate();

    private static HttpRequestDef<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse> genForDeleteEmailTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteEmailTemplateRequest, DeleteEmailTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEmailTemplateRequest.class, DeleteEmailTemplateResponse.class)
            .withName("DeleteEmailTemplate")
            .withUri("/v3/{project_id}/batch-inspection/email-template")
            .withContentType("application/json");

        // requests
        builder.<DeleteEmailTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteEmailTemplateRequestBody.class),
            f -> f.withMarshaller(DeleteEmailTemplateRequest::getBody, DeleteEmailTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse> deleteHistoryTransactionExportTask =
        genForDeleteHistoryTransactionExportTask();

    private static HttpRequestDef<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse> genForDeleteHistoryTransactionExportTask() {
        // basic
        HttpRequestDef.Builder<DeleteHistoryTransactionExportTaskRequest, DeleteHistoryTransactionExportTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteHistoryTransactionExportTaskRequest.class,
                    DeleteHistoryTransactionExportTaskResponse.class)
                .withName("DeleteHistoryTransactionExportTask")
                .withUri("/v3/{project_id}/transaction/{instance_id}/delete-export-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHistoryTransactionExportTaskRequest::getInstanceId,
                DeleteHistoryTransactionExportTaskRequest::setInstanceId));
        builder.<DeleteHistoryTransactionExportTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteHistoryTransactionExportTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteHistoryTransactionExportTaskRequest::getXLanguage,
                DeleteHistoryTransactionExportTaskRequest::setXLanguage));
        builder.<CreateExportTaskResp>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExportTaskResp.class),
            f -> f.withMarshaller(DeleteHistoryTransactionExportTaskRequest::getBody,
                DeleteHistoryTransactionExportTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse> deleteInstanceGroup =
        genForDeleteInstanceGroup();

    private static HttpRequestDef<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse> genForDeleteInstanceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceGroupRequest, DeleteInstanceGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceGroupRequest.class, DeleteInstanceGroupResponse.class)
            .withName("DeleteInstanceGroup")
            .withUri("/v3/{project_id}/batch-inspection/instance-group")
            .withContentType("application/json");

        // requests
        builder.<DeleteInstanceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteInstanceGroupRequestBody.class),
            f -> f.withMarshaller(DeleteInstanceGroupRequest::getBody, DeleteInstanceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProcessRequest, DeleteProcessResponse> deleteProcess =
        genForDeleteProcess();

    private static HttpRequestDef<DeleteProcessRequest, DeleteProcessResponse> genForDeleteProcess() {
        // basic
        HttpRequestDef.Builder<DeleteProcessRequest, DeleteProcessResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProcessRequest.class, DeleteProcessResponse.class)
                .withName("DeleteProcess")
                .withUri("/v3/{project_id}/instances/{instance_id}/process")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProcessRequest::getInstanceId, DeleteProcessRequest::setInstanceId));
        builder.<DeleteProcessRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteProcessRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteProcessRequest::getXLanguage, DeleteProcessRequest::setXLanguage));
        builder.<DeleteProcessReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteProcessReqBody.class),
            f -> f.withMarshaller(DeleteProcessRequest::getBody, DeleteProcessRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRules =
        genForDeleteSqlLimitRules();

    private static HttpRequestDef<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> genForDeleteSqlLimitRules() {
        // basic
        HttpRequestDef.Builder<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSqlLimitRulesRequest.class, DeleteSqlLimitRulesResponse.class)
            .withName("DeleteSqlLimitRules")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/rules")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSqlLimitRulesRequest::getInstanceId,
                DeleteSqlLimitRulesRequest::setInstanceId));
        builder.<DeleteSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteSqlLimitRulesRequest::getXLanguage, DeleteSqlLimitRulesRequest::setXLanguage));
        builder.<DeleteSqlLimitRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlLimitRulesBody.class),
            f -> f.withMarshaller(DeleteSqlLimitRulesRequest::getBody, DeleteSqlLimitRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse> exportFullSqlDetails =
        genForExportFullSqlDetails();

    private static HttpRequestDef<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse> genForExportFullSqlDetails() {
        // basic
        HttpRequestDef.Builder<ExportFullSqlDetailsRequest, ExportFullSqlDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportFullSqlDetailsRequest.class, ExportFullSqlDetailsResponse.class)
            .withName("ExportFullSqlDetails")
            .withUri("/v3/{project_id}/instances/{instance_id}/full-sql-search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getInstanceId,
                ExportFullSqlDetailsRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getStartAt, ExportFullSqlDetailsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getEndAt, ExportFullSqlDetailsRequest::setEndAt));
        builder.<List<Long>>withRequestField("task_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getTaskIds, ExportFullSqlDetailsRequest::setTaskIds));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getNodeId, ExportFullSqlDetailsRequest::setNodeId));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getKeyword, ExportFullSqlDetailsRequest::setKeyword));
        builder.<String>withRequestField("fuzzy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getFuzzy, ExportFullSqlDetailsRequest::setFuzzy));
        builder.<String>withRequestField("user_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getUserList, ExportFullSqlDetailsRequest::setUserList));
        builder.<String>withRequestField("db_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getDbList, ExportFullSqlDetailsRequest::setDbList));
        builder.<String>withRequestField("operation_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getOperationList,
                ExportFullSqlDetailsRequest::setOperationList));
        builder.<String>withRequestField("client_ip_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getClientIpList,
                ExportFullSqlDetailsRequest::setClientIpList));
        builder.<String>withRequestField("thread_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getThreadIdList,
                ExportFullSqlDetailsRequest::setThreadIdList));
        builder.<String>withRequestField("trx_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getTrxIdList,
                ExportFullSqlDetailsRequest::setTrxIdList));
        builder.<String>withRequestField("session_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getSessionIdList,
                ExportFullSqlDetailsRequest::setSessionIdList));
        builder.<String>withRequestField("status_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getStatusList,
                ExportFullSqlDetailsRequest::setStatusList));
        builder.<String>withRequestField("sql_template_ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getSqlTemplateIds,
                ExportFullSqlDetailsRequest::setSqlTemplateIds));
        builder.<Double>withRequestField("cost_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Double.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getCostMin, ExportFullSqlDetailsRequest::setCostMin));
        builder.<Double>withRequestField("cost_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Double.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getCostMax, ExportFullSqlDetailsRequest::setCostMax));
        builder.<Long>withRequestField("scan_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getScanMin, ExportFullSqlDetailsRequest::setScanMin));
        builder.<Long>withRequestField("scan_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getScanMax, ExportFullSqlDetailsRequest::setScanMax));
        builder.<Long>withRequestField("affect_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getAffectMin,
                ExportFullSqlDetailsRequest::setAffectMin));
        builder.<Long>withRequestField("affect_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getAffectMax,
                ExportFullSqlDetailsRequest::setAffectMax));
        builder.<Long>withRequestField("return_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getReturnMin,
                ExportFullSqlDetailsRequest::setReturnMin));
        builder.<Long>withRequestField("return_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getReturnMax,
                ExportFullSqlDetailsRequest::setReturnMax));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getSortField,
                ExportFullSqlDetailsRequest::setSortField));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getAsc, ExportFullSqlDetailsRequest::setAsc));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getPage, ExportFullSqlDetailsRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getLimit, ExportFullSqlDetailsRequest::setLimit));
        builder.<ExportFullSqlDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportFullSqlDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportFullSqlDetailsRequest::getXLanguage,
                ExportFullSqlDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogs =
        genForExportSlowQueryLogs();

    private static HttpRequestDef<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> genForExportSlowQueryLogs() {
        // basic
        HttpRequestDef.Builder<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportSlowQueryLogsRequest.class, ExportSlowQueryLogsResponse.class)
                .withName("ExportSlowQueryLogs")
                .withUri("/v3/{project_id}/instances/{instance_id}/slow-query-logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getInstanceId,
                ExportSlowQueryLogsRequest::setInstanceId));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getDatastoreType,
                ExportSlowQueryLogsRequest::setDatastoreType));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getStartAt, ExportSlowQueryLogsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getEndAt, ExportSlowQueryLogsRequest::setEndAt));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getLimit, ExportSlowQueryLogsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getMarker, ExportSlowQueryLogsRequest::setMarker));
        builder.<ExportSlowQueryLogsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSlowQueryLogsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getXLanguage, ExportSlowQueryLogsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> exportSlowSqlStatistics =
        genForExportSlowSqlStatistics();

    private static HttpRequestDef<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> genForExportSlowSqlStatistics() {
        // basic
        HttpRequestDef.Builder<ExportSlowSqlStatisticsRequest, ExportSlowSqlStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportSlowSqlStatisticsRequest.class, ExportSlowSqlStatisticsResponse.class)
            .withName("ExportSlowSqlStatistics")
            .withUri("/v3/{project_id}/instances/{instance_id}/slow-sql-statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlStatisticsRequest::getInstanceId,
                ExportSlowSqlStatisticsRequest::setInstanceId));
        builder.<ExportSlowSqlStatisticsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSlowSqlStatisticsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSlowSqlStatisticsRequest::getXLanguage,
                ExportSlowSqlStatisticsRequest::setXLanguage));
        builder.<ExportSlowSqlStatisticsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportSlowSqlStatisticsRequestBody.class),
            f -> f.withMarshaller(ExportSlowSqlStatisticsRequest::getBody, ExportSlowSqlStatisticsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetails =
        genForExportSlowSqlTemplatesDetails();

    private static HttpRequestDef<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> genForExportSlowSqlTemplatesDetails() {
        // basic
        HttpRequestDef.Builder<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportSlowSqlTemplatesDetailsRequest.class,
                    ExportSlowSqlTemplatesDetailsResponse.class)
                .withName("ExportSlowSqlTemplatesDetails")
                .withUri("/v3/{project_id}/instances/{instance_id}/slow-sql-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getInstanceId,
                ExportSlowSqlTemplatesDetailsRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getStartAt,
                ExportSlowSqlTemplatesDetailsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getEndAt,
                ExportSlowSqlTemplatesDetailsRequest::setEndAt));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getDatastoreType,
                ExportSlowSqlTemplatesDetailsRequest::setDatastoreType));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getDbName,
                ExportSlowSqlTemplatesDetailsRequest::setDbName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getOffset,
                ExportSlowSqlTemplatesDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getLimit,
                ExportSlowSqlTemplatesDetailsRequest::setLimit));
        builder.<ExportSlowSqlTemplatesDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSlowSqlTemplatesDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getXLanguage,
                ExportSlowSqlTemplatesDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> exportSlowSqlTrendDetails =
        genForExportSlowSqlTrendDetails();

    private static HttpRequestDef<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> genForExportSlowSqlTrendDetails() {
        // basic
        HttpRequestDef.Builder<ExportSlowSqlTrendDetailsRequest, ExportSlowSqlTrendDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportSlowSqlTrendDetailsRequest.class,
                    ExportSlowSqlTrendDetailsResponse.class)
                .withName("ExportSlowSqlTrendDetails")
                .withUri("/v3/{project_id}/instances/{instance_id}/slow-sql-trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getInstanceId,
                ExportSlowSqlTrendDetailsRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getStartAt,
                ExportSlowSqlTrendDetailsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getEndAt,
                ExportSlowSqlTrendDetailsRequest::setEndAt));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getDatastoreType,
                ExportSlowSqlTrendDetailsRequest::setDatastoreType));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getNodeId,
                ExportSlowSqlTrendDetailsRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getOffset,
                ExportSlowSqlTrendDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getLimit,
                ExportSlowSqlTrendDetailsRequest::setLimit));
        builder.<ExportSlowSqlTrendDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSlowSqlTrendDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSlowSqlTrendDetailsRequest::getXLanguage,
                ExportSlowSqlTrendDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatements =
        genForExportSqlStatements();

    private static HttpRequestDef<ExportSqlStatementsRequest, ExportSqlStatementsResponse> genForExportSqlStatements() {
        // basic
        HttpRequestDef.Builder<ExportSqlStatementsRequest, ExportSqlStatementsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ExportSqlStatementsRequest.class, ExportSqlStatementsResponse.class)
                .withName("ExportSqlStatements")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-statements")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getInstanceId,
                ExportSqlStatementsRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getStartAt, ExportSqlStatementsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getEndAt, ExportSqlStatementsRequest::setEndAt));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getLimit, ExportSqlStatementsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getMarker, ExportSqlStatementsRequest::setMarker));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getDatastoreType,
                ExportSqlStatementsRequest::setDatastoreType));
        builder.<ExportSqlStatementsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSqlStatementsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getXLanguage, ExportSqlStatementsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> exportTopRiskInstances =
        genForExportTopRiskInstances();

    private static HttpRequestDef<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> genForExportTopRiskInstances() {
        // basic
        HttpRequestDef.Builder<ExportTopRiskInstancesRequest, ExportTopRiskInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ExportTopRiskInstancesRequest.class, ExportTopRiskInstancesResponse.class)
            .withName("ExportTopRiskInstances")
            .withUri("/v3/{project_id}/instances/top-risk")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopRiskInstancesRequest::getStartAt,
                ExportTopRiskInstancesRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopRiskInstancesRequest::getEndAt, ExportTopRiskInstancesRequest::setEndAt));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopRiskInstancesRequest::getDatastoreType,
                ExportTopRiskInstancesRequest::setDatastoreType));
        builder.<ExportTopRiskInstancesRequest.NumEnum>withRequestField("num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopRiskInstancesRequest.NumEnum.class),
            f -> f.withMarshaller(ExportTopRiskInstancesRequest::getNum, ExportTopRiskInstancesRequest::setNum));
        builder.<String>withRequestField("metric_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopRiskInstancesRequest::getMetricCode,
                ExportTopRiskInstancesRequest::setMetricCode));
        builder.<ExportTopRiskInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopRiskInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportTopRiskInstancesRequest::getXLanguage,
                ExportTopRiskInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetails =
        genForExportTopSqlTemplatesDetails();

    private static HttpRequestDef<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> genForExportTopSqlTemplatesDetails() {
        // basic
        HttpRequestDef.Builder<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ExportTopSqlTemplatesDetailsRequest.class,
                    ExportTopSqlTemplatesDetailsResponse.class)
                .withName("ExportTopSqlTemplatesDetails")
                .withUri("/v3/{project_id}/instances/{instance_id}/top-sql-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getInstanceId,
                ExportTopSqlTemplatesDetailsRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getStartAt,
                ExportTopSqlTemplatesDetailsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getEndAt,
                ExportTopSqlTemplatesDetailsRequest::setEndAt));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getDatastoreType,
                ExportTopSqlTemplatesDetailsRequest::setDatastoreType));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getNodeId,
                ExportTopSqlTemplatesDetailsRequest::setNodeId));
        builder.<ExportTopSqlTemplatesDetailsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopSqlTemplatesDetailsRequest.SortEnum.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getSort,
                ExportTopSqlTemplatesDetailsRequest::setSort));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getAsc,
                ExportTopSqlTemplatesDetailsRequest::setAsc));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getOffset,
                ExportTopSqlTemplatesDetailsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getLimit,
                ExportTopSqlTemplatesDetailsRequest::setLimit));
        builder.<ExportTopSqlTemplatesDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopSqlTemplatesDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getXLanguage,
                ExportTopSqlTemplatesDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetails =
        genForExportTopSqlTrendDetails();

    private static HttpRequestDef<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> genForExportTopSqlTrendDetails() {
        // basic
        HttpRequestDef.Builder<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ExportTopSqlTrendDetailsRequest.class, ExportTopSqlTrendDetailsResponse.class)
                .withName("ExportTopSqlTrendDetails")
                .withUri("/v3/{project_id}/instances/{instance_id}/top-sql-trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getInstanceId,
                ExportTopSqlTrendDetailsRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getStartAt,
                ExportTopSqlTrendDetailsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getEndAt,
                ExportTopSqlTrendDetailsRequest::setEndAt));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getDatastoreType,
                ExportTopSqlTrendDetailsRequest::setDatastoreType));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getNodeId,
                ExportTopSqlTrendDetailsRequest::setNodeId));
        builder.<ExportTopSqlTrendDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopSqlTrendDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getXLanguage,
                ExportTopSqlTrendDetailsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse> listAutoIncrementUsage =
        genForListAutoIncrementUsage();

    private static HttpRequestDef<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse> genForListAutoIncrementUsage() {
        // basic
        HttpRequestDef.Builder<ListAutoIncrementUsageRequest, ListAutoIncrementUsageResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListAutoIncrementUsageRequest.class, ListAutoIncrementUsageResponse.class)
            .withName("ListAutoIncrementUsage")
            .withUri("/v3/{project_id}/instances/{instance_id}/list-auto-increment-usage")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoIncrementUsageRequest::getInstanceId,
                ListAutoIncrementUsageRequest::setInstanceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAutoIncrementUsageRequest::getXLanguage,
                ListAutoIncrementUsageRequest::setXLanguage));
        builder.<ListAutoIncrementUsageRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAutoIncrementUsageRequestBody.class),
            f -> f.withMarshaller(ListAutoIncrementUsageRequest::getBody, ListAutoIncrementUsageRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> listCloudDbaInstances =
        genForListCloudDbaInstances();

    private static HttpRequestDef<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> genForListCloudDbaInstances() {
        // basic
        HttpRequestDef.Builder<ListCloudDbaInstancesRequest, ListCloudDbaInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCloudDbaInstancesRequest.class, ListCloudDbaInstancesResponse.class)
            .withName("ListCloudDbaInstances")
            .withUri("/v3/{project_id}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCloudDbaInstancesRequest::getDatastoreType,
                ListCloudDbaInstancesRequest::setDatastoreType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudDbaInstancesRequest::getOffset, ListCloudDbaInstancesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCloudDbaInstancesRequest::getLimit, ListCloudDbaInstancesRequest::setLimit));
        builder.<ListCloudDbaInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCloudDbaInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListCloudDbaInstancesRequest::getXLanguage,
                ListCloudDbaInstancesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbNamesRequest, ListDbNamesResponse> listDbNames = genForListDbNames();

    private static HttpRequestDef<ListDbNamesRequest, ListDbNamesResponse> genForListDbNames() {
        // basic
        HttpRequestDef.Builder<ListDbNamesRequest, ListDbNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbNamesRequest.class, ListDbNamesResponse.class)
                .withName("ListDbNames")
                .withUri("/v3/{project_id}/instances/{instance_id}/databases/get-name-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbNamesRequest::getInstanceId, ListDbNamesRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbNamesRequest::getEngineType, ListDbNamesRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> listDbUsers = genForListDbUsers();

    private static HttpRequestDef<ListDbUsersRequest, ListDbUsersResponse> genForListDbUsers() {
        // basic
        HttpRequestDef.Builder<ListDbUsersRequest, ListDbUsersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDbUsersRequest.class, ListDbUsersResponse.class)
                .withName("ListDbUsers")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, ListDbUsersRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, ListDbUsersRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, ListDbUsersRequest::setLimit));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getDbUserId, ListDbUsersRequest::setDbUserId));
        builder.<String>withRequestField("db_username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getDbUsername, ListDbUsersRequest::setDbUsername));
        builder.<ListDbUsersRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDbUsersRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, ListDbUsersRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEmailRecordRequest, ListEmailRecordResponse> listEmailRecord =
        genForListEmailRecord();

    private static HttpRequestDef<ListEmailRecordRequest, ListEmailRecordResponse> genForListEmailRecord() {
        // basic
        HttpRequestDef.Builder<ListEmailRecordRequest, ListEmailRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEmailRecordRequest.class, ListEmailRecordResponse.class)
                .withName("ListEmailRecord")
                .withUri("/v3/{project_id}/batch-inspection/email-record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEmailRecordRequest::getDatastoreType, ListEmailRecordRequest::setDatastoreType));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEmailRecordRequest::getStartAt, ListEmailRecordRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEmailRecordRequest::getEndAt, ListEmailRecordRequest::setEndAt));
        builder.<Integer>withRequestField("send_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEmailRecordRequest::getSendStatus, ListEmailRecordRequest::setSendStatus));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEmailRecordRequest::getOffset, ListEmailRecordRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEmailRecordRequest::getLimit, ListEmailRecordRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEmailTemplateRequest, ListEmailTemplateResponse> listEmailTemplate =
        genForListEmailTemplate();

    private static HttpRequestDef<ListEmailTemplateRequest, ListEmailTemplateResponse> genForListEmailTemplate() {
        // basic
        HttpRequestDef.Builder<ListEmailTemplateRequest, ListEmailTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEmailTemplateRequest.class, ListEmailTemplateResponse.class)
                .withName("ListEmailTemplate")
                .withUri("/v3/{project_id}/batch-inspection/email-template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEmailTemplateRequest::getDatastoreType,
                ListEmailTemplateRequest::setDatastoreType));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEmailTemplateRequest::getOffset, ListEmailTemplateRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEmailTemplateRequest::getLimit, ListEmailTemplateRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFullSqlTasksRequest, ListFullSqlTasksResponse> listFullSqlTasks =
        genForListFullSqlTasks();

    private static HttpRequestDef<ListFullSqlTasksRequest, ListFullSqlTasksResponse> genForListFullSqlTasks() {
        // basic
        HttpRequestDef.Builder<ListFullSqlTasksRequest, ListFullSqlTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFullSqlTasksRequest.class, ListFullSqlTasksResponse.class)
                .withName("ListFullSqlTasks")
                .withUri("/v3/{project_id}/instances/{instance_id}/full-sql-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getInstanceId, ListFullSqlTasksRequest::setInstanceId));
        builder.<Long>withRequestField("range_left",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getRangeLeft, ListFullSqlTasksRequest::setRangeLeft));
        builder.<Long>withRequestField("range_right",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getRangeRight, ListFullSqlTasksRequest::setRangeRight));
        builder.<Long>withRequestField("create_at_left",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getCreateAtLeft, ListFullSqlTasksRequest::setCreateAtLeft));
        builder.<Long>withRequestField("create_at_right",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getCreateAtRight,
                ListFullSqlTasksRequest::setCreateAtRight));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getUser, ListFullSqlTasksRequest::setUser));
        builder.<String>withRequestField("keyword",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getKeyword, ListFullSqlTasksRequest::setKeyword));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getDbName, ListFullSqlTasksRequest::setDbName));
        builder.<String>withRequestField("operation",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getOperation, ListFullSqlTasksRequest::setOperation));
        builder.<String>withRequestField("thread_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getThreadId, ListFullSqlTasksRequest::setThreadId));
        builder.<String>withRequestField("trx_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getTrxId, ListFullSqlTasksRequest::setTrxId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getStatus, ListFullSqlTasksRequest::setStatus));
        builder.<String>withRequestField("sql_template_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getSqlTemplateId,
                ListFullSqlTasksRequest::setSqlTemplateId));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getSortField, ListFullSqlTasksRequest::setSortField));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getAsc, ListFullSqlTasksRequest::setAsc));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getPage, ListFullSqlTasksRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getLimit, ListFullSqlTasksRequest::setLimit));
        builder.<ListFullSqlTasksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFullSqlTasksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListFullSqlTasksRequest::getXLanguage, ListFullSqlTasksRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthReportTaskRequest, ListHealthReportTaskResponse> listHealthReportTask =
        genForListHealthReportTask();

    private static HttpRequestDef<ListHealthReportTaskRequest, ListHealthReportTaskResponse> genForListHealthReportTask() {
        // basic
        HttpRequestDef.Builder<ListHealthReportTaskRequest, ListHealthReportTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListHealthReportTaskRequest.class, ListHealthReportTaskResponse.class)
            .withName("ListHealthReportTask")
            .withUri("/v3/{project_id}/instances/{instance_id}/get-instance-health-report-task-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthReportTaskRequest::getInstanceId,
                ListHealthReportTaskRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHealthReportTaskRequest::getStartAt, ListHealthReportTaskRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListHealthReportTaskRequest::getEndAt, ListHealthReportTaskRequest::setEndAt));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthReportTaskRequest::getOffset, ListHealthReportTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthReportTaskRequest::getLimit, ListHealthReportTaskRequest::setLimit));
        builder.<ListHealthReportTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHealthReportTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListHealthReportTaskRequest::getXLanguage,
                ListHealthReportTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse> listHistoryTransactionExportTask =
        genForListHistoryTransactionExportTask();

    private static HttpRequestDef<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse> genForListHistoryTransactionExportTask() {
        // basic
        HttpRequestDef.Builder<ListHistoryTransactionExportTaskRequest, ListHistoryTransactionExportTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListHistoryTransactionExportTaskRequest.class,
                    ListHistoryTransactionExportTaskResponse.class)
                .withName("ListHistoryTransactionExportTask")
                .withUri("/v3/{project_id}/transaction/{instance_id}/get-export-task-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryTransactionExportTaskRequest::getInstanceId,
                ListHistoryTransactionExportTaskRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryTransactionExportTaskRequest::getOffset,
                ListHistoryTransactionExportTaskRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryTransactionExportTaskRequest::getLimit,
                ListHistoryTransactionExportTaskRequest::setLimit));
        builder.<ListHistoryTransactionExportTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListHistoryTransactionExportTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListHistoryTransactionExportTaskRequest::getXLanguage,
                ListHistoryTransactionExportTaskRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocks =
        genForListInnodbLocks();

    private static HttpRequestDef<ListInnodbLocksRequest, ListInnodbLocksResponse> genForListInnodbLocks() {
        // basic
        HttpRequestDef.Builder<ListInnodbLocksRequest, ListInnodbLocksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInnodbLocksRequest.class, ListInnodbLocksResponse.class)
                .withName("ListInnodbLocks")
                .withUri("/v3/{project_id}/instances/{instance_id}/innodb-locks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInnodbLocksRequest::getInstanceId, ListInnodbLocksRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInnodbLocksRequest::getDbUserId, ListInnodbLocksRequest::setDbUserId));
        builder.<ListInnodbLocksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInnodbLocksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInnodbLocksRequest::getXLanguage, ListInnodbLocksRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInspectionReportRequest, ListInspectionReportResponse> listInspectionReport =
        genForListInspectionReport();

    private static HttpRequestDef<ListInspectionReportRequest, ListInspectionReportResponse> genForListInspectionReport() {
        // basic
        HttpRequestDef.Builder<ListInspectionReportRequest, ListInspectionReportResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInspectionReportRequest.class, ListInspectionReportResponse.class)
            .withName("ListInspectionReport")
            .withUri("/v3/{project_id}/batch-inspection/health-report-list")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getStartAt, ListInspectionReportRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getEndAt, ListInspectionReportRequest::setEndAt));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getDatastoreType,
                ListInspectionReportRequest::setDatastoreType));
        builder.<String>withRequestField("health_rank",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getHealthRank,
                ListInspectionReportRequest::setHealthRank));
        builder.<String>withRequestField("sort_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getSortField,
                ListInspectionReportRequest::setSortField));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getAsc, ListInspectionReportRequest::setAsc));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getOffset, ListInspectionReportRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInspectionReportRequest::getLimit, ListInspectionReportRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceDistributionRequest, ListInstanceDistributionResponse> listInstanceDistribution =
        genForListInstanceDistribution();

    private static HttpRequestDef<ListInstanceDistributionRequest, ListInstanceDistributionResponse> genForListInstanceDistribution() {
        // basic
        HttpRequestDef.Builder<ListInstanceDistributionRequest, ListInstanceDistributionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListInstanceDistributionRequest.class, ListInstanceDistributionResponse.class)
                .withName("ListInstanceDistribution")
                .withUri("/v3/{project_id}/instances/distribution")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceDistributionRequest::getDatastoreType,
                ListInstanceDistributionRequest::setDatastoreType));
        builder.<ListInstanceDistributionRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceDistributionRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceDistributionRequest::getXLanguage,
                ListInstanceDistributionRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceGroupRequest, ListInstanceGroupResponse> listInstanceGroup =
        genForListInstanceGroup();

    private static HttpRequestDef<ListInstanceGroupRequest, ListInstanceGroupResponse> genForListInstanceGroup() {
        // basic
        HttpRequestDef.Builder<ListInstanceGroupRequest, ListInstanceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstanceGroupRequest.class, ListInstanceGroupResponse.class)
                .withName("ListInstanceGroup")
                .withUri("/v3/{project_id}/batch-inspection/instance-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceGroupRequest::getDatastoreType,
                ListInstanceGroupRequest::setDatastoreType));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceGroupRequest::getGroupName, ListInstanceGroupRequest::setGroupName));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceGroupRequest::getOffset, ListInstanceGroupRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceGroupRequest::getLimit, ListInstanceGroupRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> listInstanceMultiNodesSingleMetric =
        genForListInstanceMultiNodesSingleMetric();

    private static HttpRequestDef<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> genForListInstanceMultiNodesSingleMetric() {
        // basic
        HttpRequestDef.Builder<ListInstanceMultiNodesSingleMetricRequest, ListInstanceMultiNodesSingleMetricResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListInstanceMultiNodesSingleMetricRequest.class,
                    ListInstanceMultiNodesSingleMetricResponse.class)
                .withName("ListInstanceMultiNodesSingleMetric")
                .withUri("/v3/{project_id}/multi-nodes/single-metric")
                .withContentType("application/json");

        // requests
        builder.<ListInstanceMultiNodesSingleMetricRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceMultiNodesSingleMetricRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceMultiNodesSingleMetricRequest::getXLanguage,
                ListInstanceMultiNodesSingleMetricRequest::setXLanguage));
        builder.<ListInstanceMultiNodesSingleMetric>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstanceMultiNodesSingleMetric.class),
            f -> f.withMarshaller(ListInstanceMultiNodesSingleMetricRequest::getBody,
                ListInstanceMultiNodesSingleMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> listInstanceNodesInfo =
        genForListInstanceNodesInfo();

    private static HttpRequestDef<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> genForListInstanceNodesInfo() {
        // basic
        HttpRequestDef.Builder<ListInstanceNodesInfoRequest, ListInstanceNodesInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceNodesInfoRequest.class, ListInstanceNodesInfoResponse.class)
            .withName("ListInstanceNodesInfo")
            .withUri("/v3/{project_id}/instance/nodes-info")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceNodesInfoRequest::getInstanceId,
                ListInstanceNodesInfoRequest::setInstanceId));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceNodesInfoRequest::getDatastoreType,
                ListInstanceNodesInfoRequest::setDatastoreType));
        builder.<ListInstanceNodesInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceNodesInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceNodesInfoRequest::getXLanguage,
                ListInstanceNodesInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> listInstanceTopSlowLog =
        genForListInstanceTopSlowLog();

    private static HttpRequestDef<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> genForListInstanceTopSlowLog() {
        // basic
        HttpRequestDef.Builder<ListInstanceTopSlowLogRequest, ListInstanceTopSlowLogResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceTopSlowLogRequest.class, ListInstanceTopSlowLogResponse.class)
            .withName("ListInstanceTopSlowLog")
            .withUri("/v3/{project_id}/instances/{instance_id}/top-slow-log")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceTopSlowLogRequest::getInstanceId,
                ListInstanceTopSlowLogRequest::setInstanceId));
        builder.<Integer>withRequestField("num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceTopSlowLogRequest::getNum, ListInstanceTopSlowLogRequest::setNum));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstanceTopSlowLogRequest::getStartAt,
                ListInstanceTopSlowLogRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstanceTopSlowLogRequest::getEndAt, ListInstanceTopSlowLogRequest::setEndAt));
        builder.<ListInstanceTopSlowLogRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceTopSlowLogRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInstanceTopSlowLogRequest::getXLanguage,
                ListInstanceTopSlowLogRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLockBlockingDbRequest, ListLockBlockingDbResponse> listLockBlockingDb =
        genForListLockBlockingDb();

    private static HttpRequestDef<ListLockBlockingDbRequest, ListLockBlockingDbResponse> genForListLockBlockingDb() {
        // basic
        HttpRequestDef.Builder<ListLockBlockingDbRequest, ListLockBlockingDbResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLockBlockingDbRequest.class, ListLockBlockingDbResponse.class)
                .withName("ListLockBlockingDb")
                .withUri("/v3/{project_id}/instances/{instance_id}/lock-blocking/get-lock-blocking-db-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLockBlockingDbRequest::getInstanceId, ListLockBlockingDbRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLockBlockingDbRequest::getStartTime, ListLockBlockingDbRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLockBlockingDbRequest::getEndTime, ListLockBlockingDbRequest::setEndTime));
        builder.<ListLockBlockingDbRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLockBlockingDbRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListLockBlockingDbRequest::getXLanguage, ListLockBlockingDbRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse> listLockBlockingDetail =
        genForListLockBlockingDetail();

    private static HttpRequestDef<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse> genForListLockBlockingDetail() {
        // basic
        HttpRequestDef.Builder<ListLockBlockingDetailRequest, ListLockBlockingDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLockBlockingDetailRequest.class, ListLockBlockingDetailResponse.class)
            .withName("ListLockBlockingDetail")
            .withUri("/v3/{project_id}/instances/{instance_id}/lock-blocking/get-lock-blocking-detail-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getInstanceId,
                ListLockBlockingDetailRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getStartTime,
                ListLockBlockingDetailRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getEndTime,
                ListLockBlockingDetailRequest::setEndTime));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getPerPage,
                ListLockBlockingDetailRequest::setPerPage));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getCurPage,
                ListLockBlockingDetailRequest::setCurPage));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getDbName, ListLockBlockingDetailRequest::setDbName));
        builder.<ListLockBlockingDetailRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLockBlockingDetailRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListLockBlockingDetailRequest::getXLanguage,
                ListLockBlockingDetailRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse> listLockBlockingRelationship =
        genForListLockBlockingRelationship();

    private static HttpRequestDef<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse> genForListLockBlockingRelationship() {
        // basic
        HttpRequestDef.Builder<ListLockBlockingRelationshipRequest, ListLockBlockingRelationshipResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLockBlockingRelationshipRequest.class,
                    ListLockBlockingRelationshipResponse.class)
                .withName("ListLockBlockingRelationship")
                .withUri("/v3/{project_id}/instances/{instance_id}/lock-blocking/get-lock-blocking-relationship")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLockBlockingRelationshipRequest::getInstanceId,
                ListLockBlockingRelationshipRequest::setInstanceId));
        builder.<String>withRequestField("unique_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLockBlockingRelationshipRequest::getUniqueId,
                ListLockBlockingRelationshipRequest::setUniqueId));
        builder.<Long>withRequestField("spid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListLockBlockingRelationshipRequest::getSpid,
                ListLockBlockingRelationshipRequest::setSpid));
        builder.<ListLockBlockingRelationshipRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListLockBlockingRelationshipRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListLockBlockingRelationshipRequest::getXLanguage,
                ListLockBlockingRelationshipRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocks =
        genForListMetadataLocks();

    private static HttpRequestDef<ListMetadataLocksRequest, ListMetadataLocksResponse> genForListMetadataLocks() {
        // basic
        HttpRequestDef.Builder<ListMetadataLocksRequest, ListMetadataLocksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetadataLocksRequest.class, ListMetadataLocksResponse.class)
                .withName("ListMetadataLocks")
                .withUri("/v3/{project_id}/instances/{instance_id}/metadata-locks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getInstanceId, ListMetadataLocksRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getDbUserId, ListMetadataLocksRequest::setDbUserId));
        builder.<String>withRequestField("thread_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getThreadId, ListMetadataLocksRequest::setThreadId));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getDatabase, ListMetadataLocksRequest::setDatabase));
        builder.<String>withRequestField("table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getTable, ListMetadataLocksRequest::setTable));
        builder.<ListMetadataLocksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMetadataLocksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getXLanguage, ListMetadataLocksRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessesRequest, ListProcessesResponse> listProcesses =
        genForListProcesses();

    private static HttpRequestDef<ListProcessesRequest, ListProcessesResponse> genForListProcesses() {
        // basic
        HttpRequestDef.Builder<ListProcessesRequest, ListProcessesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProcessesRequest.class, ListProcessesResponse.class)
                .withName("ListProcesses")
                .withUri("/v3/{project_id}/instances/{instance_id}/processes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getInstanceId, ListProcessesRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getDbUserId, ListProcessesRequest::setDbUserId));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getUser, ListProcessesRequest::setUser));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getDatabase, ListProcessesRequest::setDatabase));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getNodeId, ListProcessesRequest::setNodeId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesRequest::getOffset, ListProcessesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesRequest::getLimit, ListProcessesRequest::setLimit));
        builder.<ListProcessesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProcessesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListProcessesRequest::getXLanguage, ListProcessesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskItemsRequest, ListRiskItemsResponse> listRiskItems =
        genForListRiskItems();

    private static HttpRequestDef<ListRiskItemsRequest, ListRiskItemsResponse> genForListRiskItems() {
        // basic
        HttpRequestDef.Builder<ListRiskItemsRequest, ListRiskItemsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRiskItemsRequest.class, ListRiskItemsResponse.class)
                .withName("ListRiskItems")
                .withUri("/v3/{project_id}/get-risk-items")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskItemsRequest::getDatastoreType, ListRiskItemsRequest::setDatastoreType));
        builder.<Integer>withRequestField("page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskItemsRequest::getPage, ListRiskItemsRequest::setPage));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskItemsRequest::getLimit, ListRiskItemsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRiskItemsRequest::getOffset, ListRiskItemsRequest::setOffset));
        builder.<ListRiskItemsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRiskItemsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListRiskItemsRequest::getXLanguage, ListRiskItemsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRiskTrendRequest, ListRiskTrendResponse> listRiskTrend =
        genForListRiskTrend();

    private static HttpRequestDef<ListRiskTrendRequest, ListRiskTrendResponse> genForListRiskTrend() {
        // basic
        HttpRequestDef.Builder<ListRiskTrendRequest, ListRiskTrendResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRiskTrendRequest.class, ListRiskTrendResponse.class)
                .withName("ListRiskTrend")
                .withUri("/v3/{project_id}/instances/risk-trend")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskTrendRequest::getDatastoreType, ListRiskTrendRequest::setDatastoreType));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRiskTrendRequest::getStartAt, ListRiskTrendRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRiskTrendRequest::getEndAt, ListRiskTrendRequest::setEndAt));
        builder.<String>withRequestField("metric_code",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRiskTrendRequest::getMetricCode, ListRiskTrendRequest::setMetricCode));
        builder.<ListRiskTrendRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRiskTrendRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListRiskTrendRequest::getXLanguage, ListRiskTrendRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> listSnapshots =
        genForListSnapshots();

    private static HttpRequestDef<ListSnapshotsRequest, ListSnapshotsResponse> genForListSnapshots() {
        // basic
        HttpRequestDef.Builder<ListSnapshotsRequest, ListSnapshotsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotsRequest.class, ListSnapshotsResponse.class)
                .withName("ListSnapshots")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/list-snapshots")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getConnectionId, ListSnapshotsRequest::setConnectionId));
        builder.<Long>withRequestField("module",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getModule, ListSnapshotsRequest::setModule));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getStartAt, ListSnapshotsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getEndAt, ListSnapshotsRequest::setEndAt));
        builder.<Integer>withRequestField("per_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getPerPage, ListSnapshotsRequest::setPerPage));
        builder.<Integer>withRequestField("cur_page",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getCurPage, ListSnapshotsRequest::setCurPage));
        builder.<ListSnapshotsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSnapshotsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSnapshotsRequest::getXLanguage, ListSnapshotsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysis =
        genForListSpaceAnalysis();

    private static HttpRequestDef<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> genForListSpaceAnalysis() {
        // basic
        HttpRequestDef.Builder<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSpaceAnalysisRequest.class, ListSpaceAnalysisResponse.class)
                .withName("ListSpaceAnalysis")
                .withUri("/v3/{project_id}/instances/{instance_id}/space-analysis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getInstanceId, ListSpaceAnalysisRequest::setInstanceId));
        builder.<ListSpaceAnalysisRequest.ObjectTypeEnum>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSpaceAnalysisRequest.ObjectTypeEnum.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getObjectType, ListSpaceAnalysisRequest::setObjectType));
        builder.<String>withRequestField("database_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getDatabaseId, ListSpaceAnalysisRequest::setDatabaseId));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getOffset, ListSpaceAnalysisRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getLimit, ListSpaceAnalysisRequest::setLimit));
        builder.<String>withRequestField("show_instance_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getShowInstanceInfo,
                ListSpaceAnalysisRequest::setShowInstanceInfo));
        builder.<ListSpaceAnalysisRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSpaceAnalysisRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getDatastoreType,
                ListSpaceAnalysisRequest::setDatastoreType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getXLanguage, ListSpaceAnalysisRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRules =
        genForListSqlLimitRules();

    private static HttpRequestDef<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> genForListSqlLimitRules() {
        // basic
        HttpRequestDef.Builder<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSqlLimitRulesRequest.class, ListSqlLimitRulesResponse.class)
                .withName("ListSqlLimitRules")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getInstanceId, ListSqlLimitRulesRequest::setInstanceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getOffset, ListSqlLimitRulesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getLimit, ListSqlLimitRulesRequest::setLimit));
        builder.<ListSqlLimitRulesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSqlLimitRulesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getDatastoreType,
                ListSqlLimitRulesRequest::setDatastoreType));
        builder.<String>withRequestField("database_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getDatabaseName,
                ListSqlLimitRulesRequest::setDatabaseName));
        builder.<ListSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getXLanguage, ListSqlLimitRulesRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTopSlowLogRequest, ListTopSlowLogResponse> listTopSlowLog =
        genForListTopSlowLog();

    private static HttpRequestDef<ListTopSlowLogRequest, ListTopSlowLogResponse> genForListTopSlowLog() {
        // basic
        HttpRequestDef.Builder<ListTopSlowLogRequest, ListTopSlowLogResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTopSlowLogRequest.class, ListTopSlowLogResponse.class)
                .withName("ListTopSlowLog")
                .withUri("/v3/{project_id}/instances/top-slow-log")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("num",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTopSlowLogRequest::getNum, ListTopSlowLogRequest::setNum));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopSlowLogRequest::getStartAt, ListTopSlowLogRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTopSlowLogRequest::getEndAt, ListTopSlowLogRequest::setEndAt));
        builder.<ListTopSlowLogRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTopSlowLogRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTopSlowLogRequest::getXLanguage, ListTopSlowLogRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransactionsRequest, ListTransactionsResponse> listTransactions =
        genForListTransactions();

    private static HttpRequestDef<ListTransactionsRequest, ListTransactionsResponse> genForListTransactions() {
        // basic
        HttpRequestDef.Builder<ListTransactionsRequest, ListTransactionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransactionsRequest.class, ListTransactionsResponse.class)
                .withName("ListTransactions")
                .withUri("/v3/{project_id}/instances/{instance_id}/transaction")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransactionsRequest::getInstanceId, ListTransactionsRequest::setInstanceId));
        builder.<ListTransactionsRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTransactionsRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListTransactionsRequest::getDatastoreType,
                ListTransactionsRequest::setDatastoreType));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransactionsRequest::getStartAt, ListTransactionsRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransactionsRequest::getEndAt, ListTransactionsRequest::setEndAt));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransactionsRequest::getPageNum, ListTransactionsRequest::setPageNum));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransactionsRequest::getPageSize, ListTransactionsRequest::setPageSize));
        builder.<ListTransactionsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTransactionsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListTransactionsRequest::getOrder, ListTransactionsRequest::setOrder));
        builder.<ListTransactionsRequest.OrderByEnum>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTransactionsRequest.OrderByEnum.class),
            f -> f.withMarshaller(ListTransactionsRequest::getOrderBy, ListTransactionsRequest::setOrderBy));
        builder.<Long>withRequestField("last_sec_min",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransactionsRequest::getLastSecMin, ListTransactionsRequest::setLastSecMin));
        builder.<Long>withRequestField("last_sec_max",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTransactionsRequest::getLastSecMax, ListTransactionsRequest::setLastSecMax));
        builder.<ListTransactionsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTransactionsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListTransactionsRequest::getXLanguage, ListTransactionsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse> loginBuiltInAccount =
        genForLoginBuiltInAccount();

    private static HttpRequestDef<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse> genForLoginBuiltInAccount() {
        // basic
        HttpRequestDef.Builder<LoginBuiltInAccountRequest, LoginBuiltInAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LoginBuiltInAccountRequest.class, LoginBuiltInAccountResponse.class)
                .withName("LoginBuiltInAccount")
                .withUri("/v3/{project_id}/instances/{instance_id}/login-built-in-account")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LoginBuiltInAccountRequest::getInstanceId,
                LoginBuiltInAccountRequest::setInstanceId));
        builder.<LoginBuiltInAccountRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LoginBuiltInAccountRequest.XLanguageEnum.class),
            f -> f.withMarshaller(LoginBuiltInAccountRequest::getXLanguage, LoginBuiltInAccountRequest::setXLanguage));
        builder.<LoginBuiltInAccountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LoginBuiltInAccountRequestBody.class),
            f -> f.withMarshaller(LoginBuiltInAccountRequest::getBody, LoginBuiltInAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse> logoffBuiltInAccount =
        genForLogoffBuiltInAccount();

    private static HttpRequestDef<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse> genForLogoffBuiltInAccount() {
        // basic
        HttpRequestDef.Builder<LogoffBuiltInAccountRequest, LogoffBuiltInAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, LogoffBuiltInAccountRequest.class, LogoffBuiltInAccountResponse.class)
            .withName("LogoffBuiltInAccount")
            .withUri("/v3/{project_id}/instances/{instance_id}/logoff-built-in-account")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LogoffBuiltInAccountRequest::getInstanceId,
                LogoffBuiltInAccountRequest::setInstanceId));
        builder.<LogoffBuiltInAccountRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(LogoffBuiltInAccountRequest.XLanguageEnum.class),
            f -> f.withMarshaller(LogoffBuiltInAccountRequest::getXLanguage,
                LogoffBuiltInAccountRequest::setXLanguage));
        builder.<LogoffBuiltInAccountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(LogoffBuiltInAccountRequestBody.class),
            f -> f.withMarshaller(LogoffBuiltInAccountRequest::getBody, LogoffBuiltInAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseDeadLockRequest, ParseDeadLockResponse> parseDeadLock =
        genForParseDeadLock();

    private static HttpRequestDef<ParseDeadLockRequest, ParseDeadLockResponse> genForParseDeadLock() {
        // basic
        HttpRequestDef.Builder<ParseDeadLockRequest, ParseDeadLockResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ParseDeadLockRequest.class, ParseDeadLockResponse.class)
                .withName("ParseDeadLock")
                .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock-analysis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseDeadLockRequest::getInstanceId, ParseDeadLockRequest::setInstanceId));
        builder.<ParseDeadLockRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ParseDeadLockRequestBody.class),
            f -> f.withMarshaller(ParseDeadLockRequest::getBody, ParseDeadLockRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> parseSqlLimitRules =
        genForParseSqlLimitRules();

    private static HttpRequestDef<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> genForParseSqlLimitRules() {
        // basic
        HttpRequestDef.Builder<ParseSqlLimitRulesRequest, ParseSqlLimitRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ParseSqlLimitRulesRequest.class, ParseSqlLimitRulesResponse.class)
                .withName("ParseSqlLimitRules")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/parse")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ParseSqlLimitRulesRequest::getInstanceId, ParseSqlLimitRulesRequest::setInstanceId));
        builder.<ParseSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ParseSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ParseSqlLimitRulesRequest::getXLanguage, ParseSqlLimitRulesRequest::setXLanguage));
        builder.<ParseSqlLimitRulesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ParseSqlLimitRulesReq.class),
            f -> f.withMarshaller(ParseSqlLimitRulesRequest::getBody, ParseSqlLimitRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUser =
        genForRegisterDbUser();

    private static HttpRequestDef<RegisterDbUserRequest, RegisterDbUserResponse> genForRegisterDbUser() {
        // basic
        HttpRequestDef.Builder<RegisterDbUserRequest, RegisterDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterDbUserRequest.class, RegisterDbUserResponse.class)
                .withName("RegisterDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterDbUserRequest::getInstanceId, RegisterDbUserRequest::setInstanceId));
        builder.<RegisterDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(RegisterDbUserRequest::getXLanguage, RegisterDbUserRequest::setXLanguage));
        builder.<RegisterDbUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterDbUserRequestBody.class),
            f -> f.withMarshaller(RegisterDbUserRequest::getBody, RegisterDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveCredentialRequest, SaveCredentialResponse> saveCredential =
        genForSaveCredential();

    private static HttpRequestDef<SaveCredentialRequest, SaveCredentialResponse> genForSaveCredential() {
        // basic
        HttpRequestDef.Builder<SaveCredentialRequest, SaveCredentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SaveCredentialRequest.class, SaveCredentialResponse.class)
                .withName("SaveCredential")
                .withUri("/v3/{project_id}/instances/{instance_id}/health-report/save-credential")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SaveCredentialRequest::getInstanceId, SaveCredentialRequest::setInstanceId));
        builder.<SaveCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveCredentialRequestBody.class),
            f -> f.withMarshaller(SaveCredentialRequest::getBody, SaveCredentialRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse> saveCredentialForBatchInspection =
        genForSaveCredentialForBatchInspection();

    private static HttpRequestDef<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse> genForSaveCredentialForBatchInspection() {
        // basic
        HttpRequestDef.Builder<SaveCredentialForBatchInspectionRequest, SaveCredentialForBatchInspectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SaveCredentialForBatchInspectionRequest.class,
                    SaveCredentialForBatchInspectionResponse.class)
                .withName("SaveCredentialForBatchInspection")
                .withUri("/v3/{project_id}/batch-inspection/save-credential")
                .withContentType("application/json");

        // requests
        builder.<SaveCredentialRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SaveCredentialRequestBody.class),
            f -> f.withMarshaller(SaveCredentialForBatchInspectionRequest::getBody,
                SaveCredentialForBatchInspectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse> setLockBlockingSwitch =
        genForSetLockBlockingSwitch();

    private static HttpRequestDef<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse> genForSetLockBlockingSwitch() {
        // basic
        HttpRequestDef.Builder<SetLockBlockingSwitchRequest, SetLockBlockingSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetLockBlockingSwitchRequest.class, SetLockBlockingSwitchResponse.class)
            .withName("SetLockBlockingSwitch")
            .withUri("/v3/{project_id}/lock-blocking/switch")
            .withContentType("application/json");

        // requests
        builder.<SetLockBlockingSwitchRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetLockBlockingSwitchRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetLockBlockingSwitchRequest::getXLanguage,
                SetLockBlockingSwitchRequest::setXLanguage));
        builder.<SetLockBlockingSwitchReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetLockBlockingSwitchReq.class),
            f -> f.withMarshaller(SetLockBlockingSwitchRequest::getBody, SetLockBlockingSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetThresholdForMetricRequest, SetThresholdForMetricResponse> setThresholdForMetric =
        genForSetThresholdForMetric();

    private static HttpRequestDef<SetThresholdForMetricRequest, SetThresholdForMetricResponse> genForSetThresholdForMetric() {
        // basic
        HttpRequestDef.Builder<SetThresholdForMetricRequest, SetThresholdForMetricResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SetThresholdForMetricRequest.class, SetThresholdForMetricResponse.class)
            .withName("SetThresholdForMetric")
            .withUri("/v3/{project_id}/set-metric-threshold")
            .withContentType("application/json");

        // requests
        builder.<SetThresholdForMetricRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetThresholdForMetricRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SetThresholdForMetricRequest::getXLanguage,
                SetThresholdForMetricRequest::setXLanguage));
        builder.<ApiSetMetricCodeThresholdReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiSetMetricCodeThresholdReq.class),
            f -> f.withMarshaller(SetThresholdForMetricRequest::getBody, SetThresholdForMetricRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse> showAnalysisSessionResult =
        genForShowAnalysisSessionResult();

    private static HttpRequestDef<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse> genForShowAnalysisSessionResult() {
        // basic
        HttpRequestDef.Builder<ShowAnalysisSessionResultRequest, ShowAnalysisSessionResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAnalysisSessionResultRequest.class,
                    ShowAnalysisSessionResultResponse.class)
                .withName("ShowAnalysisSessionResult")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/session-analysis-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisSessionResultRequest::getInstanceId,
                ShowAnalysisSessionResultRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisSessionResultRequest::getNodeId,
                ShowAnalysisSessionResultRequest::setNodeId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisSessionResultRequest::getJobId,
                ShowAnalysisSessionResultRequest::setJobId));

        // response
        builder.<List<ShowAnalysisSessionResultResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowAnalysisSessionResultResponse::getBody, ShowAnalysisSessionResultResponse::setBody)
                .withInnerContainerType(ShowAnalysisSessionResultResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse> showAnalysisSessionStatus =
        genForShowAnalysisSessionStatus();

    private static HttpRequestDef<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse> genForShowAnalysisSessionStatus() {
        // basic
        HttpRequestDef.Builder<ShowAnalysisSessionStatusRequest, ShowAnalysisSessionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAnalysisSessionStatusRequest.class,
                    ShowAnalysisSessionStatusResponse.class)
                .withName("ShowAnalysisSessionStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/session-analysis-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisSessionStatusRequest::getInstanceId,
                ShowAnalysisSessionStatusRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisSessionStatusRequest::getNodeId,
                ShowAnalysisSessionStatusRequest::setNodeId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAnalysisSessionStatusRequest::getJobId,
                ShowAnalysisSessionStatusRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse> showClouddbaGetSearchPathFlagNew =
        genForShowClouddbaGetSearchPathFlagNew();

    private static HttpRequestDef<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse> genForShowClouddbaGetSearchPathFlagNew() {
        // basic
        HttpRequestDef.Builder<ShowClouddbaGetSearchPathFlagNewRequest, ShowClouddbaGetSearchPathFlagNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowClouddbaGetSearchPathFlagNewRequest.class,
                    ShowClouddbaGetSearchPathFlagNewResponse.class)
                .withName("ShowClouddbaGetSearchPathFlagNew")
                .withUri("/v3/{project_id}/connections/{connection_id}/clouddba-get-search-path-flag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClouddbaGetSearchPathFlagNewRequest::getConnectionId,
                ShowClouddbaGetSearchPathFlagNewRequest::setConnectionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCredentialRequest, ShowCredentialResponse> showCredential =
        genForShowCredential();

    private static HttpRequestDef<ShowCredentialRequest, ShowCredentialResponse> genForShowCredential() {
        // basic
        HttpRequestDef.Builder<ShowCredentialRequest, ShowCredentialResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCredentialRequest.class, ShowCredentialResponse.class)
                .withName("ShowCredential")
                .withUri("/v3/{project_id}/batch-inspection/get-credential")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse> showDasCloudDbaPrice =
        genForShowDasCloudDbaPrice();

    private static HttpRequestDef<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse> genForShowDasCloudDbaPrice() {
        // basic
        HttpRequestDef.Builder<ShowDasCloudDbaPriceRequest, ShowDasCloudDbaPriceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDasCloudDbaPriceRequest.class, ShowDasCloudDbaPriceResponse.class)
            .withName("ShowDasCloudDbaPrice")
            .withUri("/v3/{project_id}/clouddba/inquiry-price")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse> showDasRecommendSqlLimitRule =
        genForShowDasRecommendSqlLimitRule();

    private static HttpRequestDef<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse> genForShowDasRecommendSqlLimitRule() {
        // basic
        HttpRequestDef.Builder<ShowDasRecommendSqlLimitRuleRequest, ShowDasRecommendSqlLimitRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ShowDasRecommendSqlLimitRuleRequest.class,
                    ShowDasRecommendSqlLimitRuleResponse.class)
                .withName("ShowDasRecommendSqlLimitRule")
                .withUri("/v3/{project_id}/instances/{instance_id}/das-recommend-sql-limit-rule")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDasRecommendSqlLimitRuleRequest::getInstanceId,
                ShowDasRecommendSqlLimitRuleRequest::setInstanceId));
        builder.<ShowDasRecommendSqlLimitRuleRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDasRecommendSqlLimitRuleRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDasRecommendSqlLimitRuleRequest::getXLanguage,
                ShowDasRecommendSqlLimitRuleRequest::setXLanguage));
        builder.<ShowRecommendSqlLimitRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowRecommendSqlLimitRuleRequestBody.class),
            f -> f.withMarshaller(ShowDasRecommendSqlLimitRuleRequest::getBody,
                ShowDasRecommendSqlLimitRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbUserRequest, ShowDbUserResponse> showDbUser = genForShowDbUser();

    private static HttpRequestDef<ShowDbUserRequest, ShowDbUserResponse> genForShowDbUser() {
        // basic
        HttpRequestDef.Builder<ShowDbUserRequest, ShowDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDbUserRequest.class, ShowDbUserResponse.class)
                .withName("ShowDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbUserRequest::getInstanceId, ShowDbUserRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbUserRequest::getDbUserId, ShowDbUserRequest::setDbUserId));
        builder.<ShowDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbUserRequest::getXLanguage, ShowDbUserRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse> showDeadLockAnalysisResult =
        genForShowDeadLockAnalysisResult();

    private static HttpRequestDef<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse> genForShowDeadLockAnalysisResult() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockAnalysisResultRequest, ShowDeadLockAnalysisResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDeadLockAnalysisResultRequest.class,
                    ShowDeadLockAnalysisResultResponse.class)
                .withName("ShowDeadLockAnalysisResult")
                .withUri("/v3/{project_id}/instances/{instance_id}/dead-lock-analysis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockAnalysisResultRequest::getInstanceId,
                ShowDeadLockAnalysisResultRequest::setInstanceId));
        builder.<String>withRequestField("dead_lock_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockAnalysisResultRequest::getDeadLockId,
                ShowDeadLockAnalysisResultRequest::setDeadLockId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockAnalysisResultRequest::getJobId,
                ShowDeadLockAnalysisResultRequest::setJobId));
        builder.<String>withRequestField("transaction_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockAnalysisResultRequest::getTransactionId,
                ShowDeadLockAnalysisResultRequest::setTransactionId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeadLockAnalysisResultRequest::getOffset,
                ShowDeadLockAnalysisResultRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowDeadLockAnalysisResultRequest::getLimit,
                ShowDeadLockAnalysisResultRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse> showDeadLockTopology =
        genForShowDeadLockTopology();

    private static HttpRequestDef<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse> genForShowDeadLockTopology() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockTopologyRequest, ShowDeadLockTopologyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeadLockTopologyRequest.class, ShowDeadLockTopologyResponse.class)
            .withName("ShowDeadLockTopology")
            .withUri("/v3/{project_id}/connections/{connection_id}/dead-lock-topology")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockTopologyRequest::getConnectionId,
                ShowDeadLockTopologyRequest::setConnectionId));
        builder.<String>withRequestField("dead_lock_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockTopologyRequest::getDeadLockId,
                ShowDeadLockTopologyRequest::setDeadLockId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse> showExportTaskInfo =
        genForShowExportTaskInfo();

    private static HttpRequestDef<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse> genForShowExportTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowExportTaskInfoRequest, ShowExportTaskInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowExportTaskInfoRequest.class, ShowExportTaskInfoResponse.class)
                .withName("ShowExportTaskInfo")
                .withUri("/v3/{project_id}/fullsql/get-export-task-info")
                .withContentType("application/json");

        // requests
        builder.<BigDecimal>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ShowExportTaskInfoRequest::getTaskId, ShowExportTaskInfoRequest::setTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse> showFullDeadLockList =
        genForShowFullDeadLockList();

    private static HttpRequestDef<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse> genForShowFullDeadLockList() {
        // basic
        HttpRequestDef.Builder<ShowFullDeadLockListRequest, ShowFullDeadLockListResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFullDeadLockListRequest.class, ShowFullDeadLockListResponse.class)
            .withName("ShowFullDeadLockList")
            .withUri("/v3/{project_id}/instances/{instance_id}/show-fulldeadlock-list")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFullDeadLockListRequest::getInstanceId,
                ShowFullDeadLockListRequest::setInstanceId));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFullDeadLockListRequest::getStartAt, ShowFullDeadLockListRequest::setStartAt));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowFullDeadLockListRequest::getEndAt, ShowFullDeadLockListRequest::setEndAt));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFullDeadLockListRequest::getPageNum, ShowFullDeadLockListRequest::setPageNum));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowFullDeadLockListRequest::getPageSize, ShowFullDeadLockListRequest::setPageSize));
        builder.<ShowFullDeadLockListRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowFullDeadLockListRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowFullDeadLockListRequest::getXLanguage,
                ShowFullDeadLockListRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse> showFullDeadLockSwitch =
        genForShowFullDeadLockSwitch();

    private static HttpRequestDef<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse> genForShowFullDeadLockSwitch() {
        // basic
        HttpRequestDef.Builder<ShowFullDeadLockSwitchRequest, ShowFullDeadLockSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFullDeadLockSwitchRequest.class, ShowFullDeadLockSwitchResponse.class)
            .withName("ShowFullDeadLockSwitch")
            .withUri("/v3/{project_id}/instances/{instance_id}/show-fulldeadlock-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFullDeadLockSwitchRequest::getInstanceId,
                ShowFullDeadLockSwitchRequest::setInstanceId));
        builder.<ShowFullDeadLockSwitchRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowFullDeadLockSwitchRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowFullDeadLockSwitchRequest::getXLanguage,
                ShowFullDeadLockSwitchRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse> showFullDeadLockSwitchNew =
        genForShowFullDeadLockSwitchNew();

    private static HttpRequestDef<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse> genForShowFullDeadLockSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowFullDeadLockSwitchNewRequest, ShowFullDeadLockSwitchNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFullDeadLockSwitchNewRequest.class,
                    ShowFullDeadLockSwitchNewResponse.class)
                .withName("ShowFullDeadLockSwitchNew")
                .withUri("/v3/{project_id}/instances/{instance_id}/get-full-dead-lock-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFullDeadLockSwitchNewRequest::getInstanceId,
                ShowFullDeadLockSwitchNewRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse> showGlobalPrivacyNew =
        genForShowGlobalPrivacyNew();

    private static HttpRequestDef<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse> genForShowGlobalPrivacyNew() {
        // basic
        HttpRequestDef.Builder<ShowGlobalPrivacyNewRequest, ShowGlobalPrivacyNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGlobalPrivacyNewRequest.class, ShowGlobalPrivacyNewResponse.class)
            .withName("ShowGlobalPrivacyNew")
            .withUri("/v3/{project_id}/policy/get-global-privacy")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse> showHealthReportSettings =
        genForShowHealthReportSettings();

    private static HttpRequestDef<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse> genForShowHealthReportSettings() {
        // basic
        HttpRequestDef.Builder<ShowHealthReportSettingsRequest, ShowHealthReportSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowHealthReportSettingsRequest.class, ShowHealthReportSettingsResponse.class)
                .withName("ShowHealthReportSettings")
                .withUri("/v3/{project_id}/instances/{instance_id}/health-report/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthReportSettingsRequest::getInstanceId,
                ShowHealthReportSettingsRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse> showHistoryTransactionExportTaskInfo =
        genForShowHistoryTransactionExportTaskInfo();

    private static HttpRequestDef<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse> genForShowHistoryTransactionExportTaskInfo() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTransactionExportTaskInfoRequest, ShowHistoryTransactionExportTaskInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHistoryTransactionExportTaskInfoRequest.class,
                    ShowHistoryTransactionExportTaskInfoResponse.class)
                .withName("ShowHistoryTransactionExportTaskInfo")
                .withUri("/v3/{project_id}/transaction/{instance_id}/get-export-task-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTransactionExportTaskInfoRequest::getInstanceId,
                ShowHistoryTransactionExportTaskInfoRequest::setInstanceId));
        builder.<Long>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTransactionExportTaskInfoRequest::getTaskId,
                ShowHistoryTransactionExportTaskInfoRequest::setTaskId));
        builder.<ShowHistoryTransactionExportTaskInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTransactionExportTaskInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowHistoryTransactionExportTaskInfoRequest::getXLanguage,
                ShowHistoryTransactionExportTaskInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse> showHistoryTransactionSwitchNew =
        genForShowHistoryTransactionSwitchNew();

    private static HttpRequestDef<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse> genForShowHistoryTransactionSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTransactionSwitchNewRequest, ShowHistoryTransactionSwitchNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowHistoryTransactionSwitchNewRequest.class,
                    ShowHistoryTransactionSwitchNewResponse.class)
                .withName("ShowHistoryTransactionSwitchNew")
                .withUri("/v3/{project_id}/transaction/{instance_id}/get-history-transaction-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTransactionSwitchNewRequest::getInstanceId,
                ShowHistoryTransactionSwitchNewRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse> showIndexUsageSwitchNew =
        genForShowIndexUsageSwitchNew();

    private static HttpRequestDef<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse> genForShowIndexUsageSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowIndexUsageSwitchNewRequest, ShowIndexUsageSwitchNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowIndexUsageSwitchNewRequest.class, ShowIndexUsageSwitchNewResponse.class)
            .withName("ShowIndexUsageSwitchNew")
            .withUri("/v3/{project_id}/instances/{instance_id}/index-usage/get-index-usage-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndexUsageSwitchNewRequest::getInstanceId,
                ShowIndexUsageSwitchNewRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> showInstanceHealthReport =
        genForShowInstanceHealthReport();

    private static HttpRequestDef<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> genForShowInstanceHealthReport() {
        // basic
        HttpRequestDef.Builder<ShowInstanceHealthReportRequest, ShowInstanceHealthReportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowInstanceHealthReportRequest.class, ShowInstanceHealthReportResponse.class)
                .withName("ShowInstanceHealthReport")
                .withUri("/v3/{project_id}/instances/{instance_id}/get-instance-health-report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceHealthReportRequest::getInstanceId,
                ShowInstanceHealthReportRequest::setInstanceId));
        builder.<String>withRequestField("task_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceHealthReportRequest::getTaskId,
                ShowInstanceHealthReportRequest::setTaskId));
        builder.<ShowInstanceHealthReportRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowInstanceHealthReportRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowInstanceHealthReportRequest::getXLanguage,
                ShowInstanceHealthReportRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse> showKillProcessTaskSwitch =
        genForShowKillProcessTaskSwitch();

    private static HttpRequestDef<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse> genForShowKillProcessTaskSwitch() {
        // basic
        HttpRequestDef.Builder<ShowKillProcessTaskSwitchRequest, ShowKillProcessTaskSwitchResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowKillProcessTaskSwitchRequest.class,
                    ShowKillProcessTaskSwitchResponse.class)
                .withName("ShowKillProcessTaskSwitch")
                .withUri("/v3/{project_id}/instances/{instance_id}/auto-flow/get-kill-process-task-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowKillProcessTaskSwitchRequest::getInstanceId,
                ShowKillProcessTaskSwitchRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse> showLatestDeadLockSnapshot =
        genForShowLatestDeadLockSnapshot();

    private static HttpRequestDef<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse> genForShowLatestDeadLockSnapshot() {
        // basic
        HttpRequestDef.Builder<ShowLatestDeadLockSnapshotRequest, ShowLatestDeadLockSnapshotResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestDeadLockSnapshotRequest.class,
                    ShowLatestDeadLockSnapshotResponse.class)
                .withName("ShowLatestDeadLockSnapshot")
                .withUri("/v3/{project_id}/connections/{connection_id}/instance/show-latestdeadlock-snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestDeadLockSnapshotRequest::getConnectionId,
                ShowLatestDeadLockSnapshotRequest::setConnectionId));
        builder.<Integer>withRequestField("id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLatestDeadLockSnapshotRequest::getId, ShowLatestDeadLockSnapshotRequest::setId));
        builder.<ShowLatestDeadLockSnapshotRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowLatestDeadLockSnapshotRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowLatestDeadLockSnapshotRequest::getXLanguage,
                ShowLatestDeadLockSnapshotRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse> showLatestInstanceHealthReport =
        genForShowLatestInstanceHealthReport();

    private static HttpRequestDef<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse> genForShowLatestInstanceHealthReport() {
        // basic
        HttpRequestDef.Builder<ShowLatestInstanceHealthReportRequest, ShowLatestInstanceHealthReportResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLatestInstanceHealthReportRequest.class,
                    ShowLatestInstanceHealthReportResponse.class)
                .withName("ShowLatestInstanceHealthReport")
                .withUri("/v3/{project_id}/health-report/{instance_id}/get-latest-instance-health-report")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLatestInstanceHealthReportRequest::getInstanceId,
                ShowLatestInstanceHealthReportRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse> showLockBlockingStatistics =
        genForShowLockBlockingStatistics();

    private static HttpRequestDef<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse> genForShowLockBlockingStatistics() {
        // basic
        HttpRequestDef.Builder<ShowLockBlockingStatisticsRequest, ShowLockBlockingStatisticsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLockBlockingStatisticsRequest.class,
                    ShowLockBlockingStatisticsResponse.class)
                .withName("ShowLockBlockingStatistics")
                .withUri("/v3/{project_id}/instances/{instance_id}/lock-blocking/get-lock-blocking-statistics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLockBlockingStatisticsRequest::getInstanceId,
                ShowLockBlockingStatisticsRequest::setInstanceId));
        builder.<Long>withRequestField("current_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLockBlockingStatisticsRequest::getCurrentTime,
                ShowLockBlockingStatisticsRequest::setCurrentTime));
        builder.<ShowLockBlockingStatisticsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowLockBlockingStatisticsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowLockBlockingStatisticsRequest::getXLanguage,
                ShowLockBlockingStatisticsRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse> showLockBlockingSwitch =
        genForShowLockBlockingSwitch();

    private static HttpRequestDef<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse> genForShowLockBlockingSwitch() {
        // basic
        HttpRequestDef.Builder<ShowLockBlockingSwitchRequest, ShowLockBlockingSwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLockBlockingSwitchRequest.class, ShowLockBlockingSwitchResponse.class)
            .withName("ShowLockBlockingSwitch")
            .withUri("/v3/{project_id}/lock-blocking/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLockBlockingSwitchRequest::getInstanceId,
                ShowLockBlockingSwitchRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLockBlockingSwitchRequest::getEngineType,
                ShowLockBlockingSwitchRequest::setEngineType));
        builder.<ShowLockBlockingSwitchRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowLockBlockingSwitchRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowLockBlockingSwitchRequest::getXLanguage,
                ShowLockBlockingSwitchRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse> showLockBlockingTrend =
        genForShowLockBlockingTrend();

    private static HttpRequestDef<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse> genForShowLockBlockingTrend() {
        // basic
        HttpRequestDef.Builder<ShowLockBlockingTrendRequest, ShowLockBlockingTrendResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLockBlockingTrendRequest.class, ShowLockBlockingTrendResponse.class)
            .withName("ShowLockBlockingTrend")
            .withUri("/v3/{project_id}/instances/{instance_id}/lock-blocking/get-lock-blocking-trend")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLockBlockingTrendRequest::getInstanceId,
                ShowLockBlockingTrendRequest::setInstanceId));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLockBlockingTrendRequest::getStartTime,
                ShowLockBlockingTrendRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLockBlockingTrendRequest::getEndTime, ShowLockBlockingTrendRequest::setEndTime));
        builder.<ShowLockBlockingTrendRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowLockBlockingTrendRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowLockBlockingTrendRequest::getXLanguage,
                ShowLockBlockingTrendRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse> showLongHistoryTransactionSwitchNew =
        genForShowLongHistoryTransactionSwitchNew();

    private static HttpRequestDef<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse> genForShowLongHistoryTransactionSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowLongHistoryTransactionSwitchNewRequest, ShowLongHistoryTransactionSwitchNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLongHistoryTransactionSwitchNewRequest.class,
                    ShowLongHistoryTransactionSwitchNewResponse.class)
                .withName("ShowLongHistoryTransactionSwitchNew")
                .withUri("/v3/{project_id}/transaction/{instance_id}/get-long-history-transaction-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLongHistoryTransactionSwitchNewRequest::getInstanceId,
                ShowLongHistoryTransactionSwitchNewRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> showMetricNamesSupport =
        genForShowMetricNamesSupport();

    private static HttpRequestDef<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> genForShowMetricNamesSupport() {
        // basic
        HttpRequestDef.Builder<ShowMetricNamesSupportRequest, ShowMetricNamesSupportResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowMetricNamesSupportRequest.class, ShowMetricNamesSupportResponse.class)
            .withName("ShowMetricNamesSupport")
            .withUri("/v3/{project_id}/metric-names/support")
            .withContentType("application/json");

        // requests
        builder.<ShowMetricNamesSupportRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowMetricNamesSupportRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowMetricNamesSupportRequest::getXLanguage,
                ShowMetricNamesSupportRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNameListRequest, ShowNameListResponse> showNameList = genForShowNameList();

    private static HttpRequestDef<ShowNameListRequest, ShowNameListResponse> genForShowNameList() {
        // basic
        HttpRequestDef.Builder<ShowNameListRequest, ShowNameListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNameListRequest.class, ShowNameListResponse.class)
                .withName("ShowNameList")
                .withUri("/v3/{project_id}/connections/{connection_id}/databases/get-name-list")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameListRequest::getConnectionId, ShowNameListRequest::setConnectionId));
        builder.<String>withRequestField("node_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameListRequest::getNodeType, ShowNameListRequest::setNodeType));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNameListRequest::getNodeId, ShowNameListRequest::setNodeId));

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

    public static final HttpRequestDef<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse> showSlowLogSwitchNew =
        genForShowSlowLogSwitchNew();

    private static HttpRequestDef<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse> genForShowSlowLogSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowSlowLogSwitchNewRequest, ShowSlowLogSwitchNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSlowLogSwitchNewRequest.class, ShowSlowLogSwitchNewResponse.class)
            .withName("ShowSlowLogSwitchNew")
            .withUri("/v3/{project_id}/instances/{instance_id}/slow-log/get-slow-log-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowLogSwitchNewRequest::getInstanceId,
                ShowSlowLogSwitchNewRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSlowLogSwitchNewRequest::getEngineType,
                ShowSlowLogSwitchNewRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlan =
        genForShowSqlExecutionPlan();

    private static HttpRequestDef<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> genForShowSqlExecutionPlan() {
        // basic
        HttpRequestDef.Builder<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSqlExecutionPlanRequest.class, ShowSqlExecutionPlanResponse.class)
            .withName("ShowSqlExecutionPlan")
            .withUri("/v3/{project_id}/instances/{instance_id}/sql/explain")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getInstanceId,
                ShowSqlExecutionPlanRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getDbUserId, ShowSqlExecutionPlanRequest::setDbUserId));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getDatabase, ShowSqlExecutionPlanRequest::setDatabase));
        builder.<String>withRequestField("sql",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getSql, ShowSqlExecutionPlanRequest::setSql));
        builder.<ShowSqlExecutionPlanRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlExecutionPlanRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getXLanguage,
                ShowSqlExecutionPlanRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplain =
        genForShowSqlExplain();

    private static HttpRequestDef<ShowSqlExplainRequest, ShowSqlExplainResponse> genForShowSqlExplain() {
        // basic
        HttpRequestDef.Builder<ShowSqlExplainRequest, ShowSqlExplainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ShowSqlExplainRequest.class, ShowSqlExplainResponse.class)
                .withName("ShowSqlExplain")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql/explain")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExplainRequest::getInstanceId, ShowSqlExplainRequest::setInstanceId));
        builder.<ShowSqlExplainRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlExplainRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlExplainRequest::getXLanguage, ShowSqlExplainRequest::setXLanguage));
        builder.<QuerySqlPlanBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySqlPlanBody.class),
            f -> f.withMarshaller(ShowSqlExplainRequest::getBody, ShowSqlExplainRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfo =
        genForShowSqlLimitJobInfo();

    private static HttpRequestDef<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> genForShowSqlLimitJobInfo() {
        // basic
        HttpRequestDef.Builder<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlLimitJobInfoRequest.class, ShowSqlLimitJobInfoResponse.class)
                .withName("ShowSqlLimitJobInfo")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/job")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlLimitJobInfoRequest::getInstanceId,
                ShowSqlLimitJobInfoRequest::setInstanceId));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlLimitJobInfoRequest::getJobId, ShowSqlLimitJobInfoRequest::setJobId));
        builder.<ShowSqlLimitJobInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlLimitJobInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlLimitJobInfoRequest::getXLanguage, ShowSqlLimitJobInfoRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatus =
        genForShowSqlLimitSwitchStatus();

    private static HttpRequestDef<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> genForShowSqlLimitSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowSqlLimitSwitchStatusRequest.class, ShowSqlLimitSwitchStatusResponse.class)
                .withName("ShowSqlLimitSwitchStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlLimitSwitchStatusRequest::getInstanceId,
                ShowSqlLimitSwitchStatusRequest::setInstanceId));
        builder.<ShowSqlLimitSwitchStatusRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSqlLimitSwitchStatusRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ShowSqlLimitSwitchStatusRequest::getDatastoreType,
                ShowSqlLimitSwitchStatusRequest::setDatastoreType));
        builder.<ShowSqlLimitSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlLimitSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlLimitSwitchStatusRequest::getXLanguage,
                ShowSqlLimitSwitchStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse> showSqlLimitingSwitchNew =
        genForShowSqlLimitingSwitchNew();

    private static HttpRequestDef<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse> genForShowSqlLimitingSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowSqlLimitingSwitchNewRequest, ShowSqlLimitingSwitchNewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowSqlLimitingSwitchNewRequest.class, ShowSqlLimitingSwitchNewResponse.class)
                .withName("ShowSqlLimitingSwitchNew")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limiting/get-sql-limiting-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlLimitingSwitchNewRequest::getInstanceId,
                ShowSqlLimitingSwitchNewRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlLimitingSwitchNewRequest::getEngineType,
                ShowSqlLimitingSwitchNewRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatus =
        genForShowSqlSwitchStatus();

    private static HttpRequestDef<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> genForShowSqlSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSqlSwitchStatusRequest.class, ShowSqlSwitchStatusResponse.class)
                .withName("ShowSqlSwitchStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getInstanceId,
                ShowSqlSwitchStatusRequest::setInstanceId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getType, ShowSqlSwitchStatusRequest::setType));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getDatastoreType,
                ShowSqlSwitchStatusRequest::setDatastoreType));
        builder.<ShowSqlSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getXLanguage, ShowSqlSwitchStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse> showSupportedEngines =
        genForShowSupportedEngines();

    private static HttpRequestDef<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse> genForShowSupportedEngines() {
        // basic
        HttpRequestDef.Builder<ShowSupportedEnginesRequest, ShowSupportedEnginesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowSupportedEnginesRequest.class, ShowSupportedEnginesResponse.class)
            .withName("ShowSupportedEngines")
            .withUri("/v3/{project_id}/engine/supported")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> showTransactionSwitchStatus =
        genForShowTransactionSwitchStatus();

    private static HttpRequestDef<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> genForShowTransactionSwitchStatus() {
        // basic
        HttpRequestDef.Builder<ShowTransactionSwitchStatusRequest, ShowTransactionSwitchStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowTransactionSwitchStatusRequest.class,
                    ShowTransactionSwitchStatusResponse.class)
                .withName("ShowTransactionSwitchStatus")
                .withUri("/v3/{project_id}/instances/{instance_id}/transaction/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTransactionSwitchStatusRequest::getInstanceId,
                ShowTransactionSwitchStatusRequest::setInstanceId));
        builder.<ShowTransactionSwitchStatusRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTransactionSwitchStatusRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ShowTransactionSwitchStatusRequest::getDatastoreType,
                ShowTransactionSwitchStatusRequest::setDatastoreType));
        builder.<ShowTransactionSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTransactionSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowTransactionSwitchStatusRequest::getXLanguage,
                ShowTransactionSwitchStatusRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTuningRequest, ShowTuningResponse> showTuning = genForShowTuning();

    private static HttpRequestDef<ShowTuningRequest, ShowTuningResponse> genForShowTuning() {
        // basic
        HttpRequestDef.Builder<ShowTuningRequest, ShowTuningResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTuningRequest.class, ShowTuningResponse.class)
                .withName("ShowTuning")
                .withUri("/v3/{project_id}/connections/{connection_id}/tuning/{message_id}/show-tuning-result")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("message_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTuningRequest::getMessageId, ShowTuningRequest::setMessageId));
        builder.<String>withRequestField("connection_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTuningRequest::getConnectionId, ShowTuningRequest::setConnectionId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTuningRequest::getXLanguage, ShowTuningRequest::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse> showWhetherUseCloudDba =
        genForShowWhetherUseCloudDba();

    private static HttpRequestDef<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse> genForShowWhetherUseCloudDba() {
        // basic
        HttpRequestDef.Builder<ShowWhetherUseCloudDbaRequest, ShowWhetherUseCloudDbaResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWhetherUseCloudDbaRequest.class, ShowWhetherUseCloudDbaResponse.class)
            .withName("ShowWhetherUseCloudDba")
            .withUri("/v3/{project_id}/can-use-cloud-dba")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhetherUseCloudDbaRequest::getInstanceId,
                ShowWhetherUseCloudDbaRequest::setInstanceId));
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhetherUseCloudDbaRequest::getEngineType,
                ShowWhetherUseCloudDbaRequest::setEngineType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartAnalysisSessionRequest, StartAnalysisSessionResponse> startAnalysisSession =
        genForStartAnalysisSession();

    private static HttpRequestDef<StartAnalysisSessionRequest, StartAnalysisSessionResponse> genForStartAnalysisSession() {
        // basic
        HttpRequestDef.Builder<StartAnalysisSessionRequest, StartAnalysisSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, StartAnalysisSessionRequest.class, StartAnalysisSessionResponse.class)
            .withName("StartAnalysisSession")
            .withUri("/v3/{project_id}/instances/{instance_id}/nodes/{node_id}/session-analysis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAnalysisSessionRequest::getInstanceId,
                StartAnalysisSessionRequest::setInstanceId));
        builder.<String>withRequestField("node_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartAnalysisSessionRequest::getNodeId, StartAnalysisSessionRequest::setNodeId));
        builder.<StartAnalysisSessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(StartAnalysisSessionRequestBody.class),
            f -> f.withMarshaller(StartAnalysisSessionRequest::getBody, StartAnalysisSessionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SynchronizeInstancesRequest, SynchronizeInstancesResponse> synchronizeInstances =
        genForSynchronizeInstances();

    private static HttpRequestDef<SynchronizeInstancesRequest, SynchronizeInstancesResponse> genForSynchronizeInstances() {
        // basic
        HttpRequestDef.Builder<SynchronizeInstancesRequest, SynchronizeInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SynchronizeInstancesRequest.class, SynchronizeInstancesResponse.class)
            .withName("SynchronizeInstances")
            .withUri("/v3/{project_id}/instances/synchronize-instance-list")
            .withContentType("application/json");

        // requests
        builder.<SynchronizeInstancesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SynchronizeInstancesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(SynchronizeInstancesRequest::getXLanguage,
                SynchronizeInstancesRequest::setXLanguage));
        builder.<SynchronizeInstancesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SynchronizeInstancesReq.class),
            f -> f.withMarshaller(SynchronizeInstancesRequest::getBody, SynchronizeInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUser = genForUpdateDbUser();

    private static HttpRequestDef<UpdateDbUserRequest, UpdateDbUserResponse> genForUpdateDbUser() {
        // basic
        HttpRequestDef.Builder<UpdateDbUserRequest, UpdateDbUserResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDbUserRequest.class, UpdateDbUserResponse.class)
                .withName("UpdateDbUser")
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getInstanceId, UpdateDbUserRequest::setInstanceId));
        builder.<String>withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getDbUserId, UpdateDbUserRequest::setDbUserId));
        builder.<UpdateDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getXLanguage, UpdateDbUserRequest::setXLanguage));
        builder.<UpdateDbUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbUserRequestBody.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getBody, UpdateDbUserRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse> updateEmailTemplate =
        genForUpdateEmailTemplate();

    private static HttpRequestDef<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse> genForUpdateEmailTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateEmailTemplateRequest, UpdateEmailTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEmailTemplateRequest.class, UpdateEmailTemplateResponse.class)
                .withName("UpdateEmailTemplate")
                .withUri("/v3/{project_id}/batch-inspection/email-template")
                .withContentType("application/json");

        // requests
        builder.<UpdateEmailTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEmailTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateEmailTemplateRequest::getBody, UpdateEmailTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse> updateFullSqlSwitch =
        genForUpdateFullSqlSwitch();

    private static HttpRequestDef<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse> genForUpdateFullSqlSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateFullSqlSwitchRequest, UpdateFullSqlSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpdateFullSqlSwitchRequest.class, UpdateFullSqlSwitchResponse.class)
                .withName("UpdateFullSqlSwitch")
                .withUri("/v3/{project_id}/fullsql/switch")
                .withContentType("application/json");

        // requests
        builder.<UpdateFullSqlSwitchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFullSqlSwitchRequestBody.class),
            f -> f.withMarshaller(UpdateFullSqlSwitchRequest::getBody, UpdateFullSqlSwitchRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse> updateHealthReportSettings =
        genForUpdateHealthReportSettings();

    private static HttpRequestDef<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse> genForUpdateHealthReportSettings() {
        // basic
        HttpRequestDef.Builder<UpdateHealthReportSettingsRequest, UpdateHealthReportSettingsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    UpdateHealthReportSettingsRequest.class,
                    UpdateHealthReportSettingsResponse.class)
                .withName("UpdateHealthReportSettings")
                .withUri("/v3/{project_id}/instances/{instance_id}/health-report/settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthReportSettingsRequest::getInstanceId,
                UpdateHealthReportSettingsRequest::setInstanceId));
        builder.<UpdateHealthReportSettingsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthReportSettingsRequestBody.class),
            f -> f.withMarshaller(UpdateHealthReportSettingsRequest::getBody,
                UpdateHealthReportSettingsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> updateInstanceGroup =
        genForUpdateInstanceGroup();

    private static HttpRequestDef<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> genForUpdateInstanceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceGroupRequest, UpdateInstanceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceGroupRequest.class, UpdateInstanceGroupResponse.class)
                .withName("UpdateInstanceGroup")
                .withUri("/v3/{project_id}/batch-inspection/instance-group")
                .withContentType("application/json");

        // requests
        builder.<UpdateInstanceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceGroupRequestBody.class),
            f -> f.withMarshaller(UpdateInstanceGroupRequest::getBody, UpdateInstanceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> updateSqlLimitRules =
        genForUpdateSqlLimitRules();

    private static HttpRequestDef<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> genForUpdateSqlLimitRules() {
        // basic
        HttpRequestDef.Builder<UpdateSqlLimitRulesRequest, UpdateSqlLimitRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateSqlLimitRulesRequest.class, UpdateSqlLimitRulesResponse.class)
                .withName("UpdateSqlLimitRules")
                .withUri("/v3/{project_id}/instances/{instance_id}/sql-limit/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSqlLimitRulesRequest::getInstanceId,
                UpdateSqlLimitRulesRequest::setInstanceId));
        builder.<UpdateSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateSqlLimitRulesRequest::getXLanguage, UpdateSqlLimitRulesRequest::setXLanguage));
        builder.<UpdateSqlLimitRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSqlLimitRulesBody.class),
            f -> f.withMarshaller(UpdateSqlLimitRulesRequest::getBody, UpdateSqlLimitRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse> showDeadLockSwitchNew =
        genForShowDeadLockSwitchNew();

    private static HttpRequestDef<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse> genForShowDeadLockSwitchNew() {
        // basic
        HttpRequestDef.Builder<ShowDeadLockSwitchNewRequest, ShowDeadLockSwitchNewResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDeadLockSwitchNewRequest.class, ShowDeadLockSwitchNewResponse.class)
            .withName("ShowDeadLockSwitchNew")
            .withUri("/v3/{project_id}/dead-lock/switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockSwitchNewRequest::getEngineType,
                ShowDeadLockSwitchNewRequest::setEngineType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDeadLockSwitchNewRequest::getInstanceId,
                ShowDeadLockSwitchNewRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse> switchFullsqlSwitch =
        genForSwitchFullsqlSwitch();

    private static HttpRequestDef<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse> genForSwitchFullsqlSwitch() {
        // basic
        HttpRequestDef.Builder<SwitchFullsqlSwitchRequest, SwitchFullsqlSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, SwitchFullsqlSwitchRequest.class, SwitchFullsqlSwitchResponse.class)
                .withName("SwitchFullsqlSwitch")
                .withUri("/v3/{project_id}/fullsql/switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchFullsqlSwitchRequest::getEngineType,
                SwitchFullsqlSwitchRequest::setEngineType));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SwitchFullsqlSwitchRequest::getInstanceId,
                SwitchFullsqlSwitchRequest::setInstanceId));

        // response

        return builder.build();
    }

}

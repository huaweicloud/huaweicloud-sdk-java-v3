package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskBody;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskRequest;
import com.huaweicloud.sdk.das.v3.model.AddFullSqlTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ApiSetMetricCodeThresholdReq;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequestBody;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeBody;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeChargeModeResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchRequestBody;
import com.huaweicloud.sdk.das.v3.model.ChangeFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusBody;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchBody;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialRequestBody;
import com.huaweicloud.sdk.das.v3.model.CheckCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.CreateExportTaskReq;
import com.huaweicloud.sdk.das.v3.model.CreateExportTaskResp;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportReq;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.CreateHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionReq;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionRequest;
import com.huaweicloud.sdk.das.v3.model.CreateInstanceConnectionResponse;
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
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessReqBody;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportFullSqlDetailsResponse;
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
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageRequest;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageRequestBody;
import com.huaweicloud.sdk.das.v3.model.ListAutoIncrementUsageResponse;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.ListCloudDbaInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.ListConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlTasksRequest;
import com.huaweicloud.sdk.das.v3.model.ListFullSqlTasksResponse;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHealthReportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListHistoryTransactionExportTaskRequest;
import com.huaweicloud.sdk.das.v3.model.ListHistoryTransactionExportTaskResponse;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceDistributionResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetric;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetricRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceMultiNodesSingleMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceNodesInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceNodesInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ListInstanceTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListInstanceTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListProcessesRequest;
import com.huaweicloud.sdk.das.v3.model.ListProcessesResponse;
import com.huaweicloud.sdk.das.v3.model.ListRiskItemsRequest;
import com.huaweicloud.sdk.das.v3.model.ListRiskItemsResponse;
import com.huaweicloud.sdk.das.v3.model.ListRiskTrendRequest;
import com.huaweicloud.sdk.das.v3.model.ListRiskTrendResponse;
import com.huaweicloud.sdk.das.v3.model.ListSnapshotsRequest;
import com.huaweicloud.sdk.das.v3.model.ListSnapshotsResponse;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisRequest;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogRequest;
import com.huaweicloud.sdk.das.v3.model.ListTopSlowLogResponse;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListTransactionsResponse;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountRequestBody;
import com.huaweicloud.sdk.das.v3.model.LoginBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountRequest;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountRequestBody;
import com.huaweicloud.sdk.das.v3.model.LogoffBuiltInAccountResponse;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesReq;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.QuerySqlPlanBody;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequestBody;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialRequest;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialRequestBody;
import com.huaweicloud.sdk.das.v3.model.SaveCredentialResponse;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricRequest;
import com.huaweicloud.sdk.das.v3.model.SetThresholdForMetricResponse;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDasRecommendSqlLimitRuleRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDasRecommendSqlLimitRuleResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockListRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockListResponse;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ShowFullDeadLockSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionExportTaskInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowHistoryTransactionExportTaskInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowInstanceHealthReportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshotRequest;
import com.huaweicloud.sdk.das.v3.model.ShowLatestDeadLockSnapshotResponse;
import com.huaweicloud.sdk.das.v3.model.ShowMetricNamesSupportRequest;
import com.huaweicloud.sdk.das.v3.model.ShowMetricNamesSupportResponse;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.das.v3.model.ShowRecommendSqlLimitRuleRequestBody;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExecutionPlanRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExecutionPlanResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExplainRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlExplainResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitJobInfoRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitJobInfoResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowSqlSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowSqlSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTransactionSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTransactionSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ShowTuningRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResponse;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesReq;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesRequest;
import com.huaweicloud.sdk.das.v3.model.SynchronizeInstancesResponse;
import com.huaweicloud.sdk.das.v3.model.TransactionSwitchReq;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateHealthReportSettingsResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesResponse;

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

}

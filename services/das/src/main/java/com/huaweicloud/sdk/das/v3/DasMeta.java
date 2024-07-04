package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsRequestBody;
import com.huaweicloud.sdk.das.v3.model.CancelShareConnectionsResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusBody;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlLimitSwitchStatusResponse;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchBody;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchRequest;
import com.huaweicloud.sdk.das.v3.model.ChangeSqlSwitchResponse;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequest;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsRequestBody;
import com.huaweicloud.sdk.das.v3.model.CreateShareConnectionsResponse;
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
import com.huaweicloud.sdk.das.v3.model.DeleteProcessReqBody;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteProcessResponse;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.DeleteSqlLimitRulesResponse;
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
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTemplatesDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTemplatesDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTrendDetailsRequest;
import com.huaweicloud.sdk.das.v3.model.ExportTopSqlTrendDetailsResponse;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.das.v3.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersRequest;
import com.huaweicloud.sdk.das.v3.model.ListDbUsersResponse;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListInnodbLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksRequest;
import com.huaweicloud.sdk.das.v3.model.ListMetadataLocksResponse;
import com.huaweicloud.sdk.das.v3.model.ListProcessesRequest;
import com.huaweicloud.sdk.das.v3.model.ListProcessesResponse;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisRequest;
import com.huaweicloud.sdk.das.v3.model.ListSpaceAnalysisResponse;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ListSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesReq;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.ParseSqlLimitRulesResponse;
import com.huaweicloud.sdk.das.v3.model.QuerySqlPlanBody;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserRequestBody;
import com.huaweicloud.sdk.das.v3.model.RegisterDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.das.v3.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.ShowDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.das.v3.model.ShowQuotasResponse;
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
import com.huaweicloud.sdk.das.v3.model.ShowTuningRequest;
import com.huaweicloud.sdk.das.v3.model.ShowTuningResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserRequestBody;
import com.huaweicloud.sdk.das.v3.model.UpdateDbUserResponse;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesBody;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesRequest;
import com.huaweicloud.sdk.das.v3.model.UpdateSqlLimitRulesResponse;

@SuppressWarnings("unchecked")
public class DasMeta {

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

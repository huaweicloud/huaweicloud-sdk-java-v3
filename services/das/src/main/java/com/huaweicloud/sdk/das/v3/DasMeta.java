package com.huaweicloud.sdk.das.v3;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.das.v3.model.*;

@SuppressWarnings("unchecked")
public class DasMeta {

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForlistApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForlistApiVersions() {
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
        genForshowApiVersion();

    private static HttpRequestDef<ShowApiVersionRequest, ShowApiVersionResponse> genForshowApiVersion() {
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
            f -> f.withMarshaller(ShowApiVersionRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> changeSqlLimitSwitchStatus =
        genForchangeSqlLimitSwitchStatus();

    private static HttpRequestDef<ChangeSqlLimitSwitchStatusRequest, ChangeSqlLimitSwitchStatusResponse> genForchangeSqlLimitSwitchStatus() {
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
            f -> f.withMarshaller(ChangeSqlLimitSwitchStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeSqlLimitSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeSqlLimitSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeSqlLimitSwitchStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ChangeSqlLimitSwitchStatusBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSqlLimitSwitchStatusBody.class),
            f -> f.withMarshaller(ChangeSqlLimitSwitchStatusRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> changeSqlSwitch =
        genForchangeSqlSwitch();

    private static HttpRequestDef<ChangeSqlSwitchRequest, ChangeSqlSwitchResponse> genForchangeSqlSwitch() {
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
            f -> f.withMarshaller(ChangeSqlSwitchRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ChangeSqlSwitchRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ChangeSqlSwitchRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ChangeSqlSwitchRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<ChangeSqlSwitchBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeSqlSwitchBody.class),
            f -> f.withMarshaller(ChangeSqlSwitchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> createSpaceAnalysisTask =
        genForcreateSpaceAnalysisTask();

    private static HttpRequestDef<CreateSpaceAnalysisTaskRequest, CreateSpaceAnalysisTaskResponse> genForcreateSpaceAnalysisTask() {
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
            f -> f.withMarshaller(CreateSpaceAnalysisTaskRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateSpaceAnalysisTaskRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSpaceAnalysisTaskRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateSpaceAnalysisTaskRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateSpaceAnalysisTaskBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSpaceAnalysisTaskBody.class),
            f -> f.withMarshaller(CreateSpaceAnalysisTaskRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> createSqlLimitRules =
        genForcreateSqlLimitRules();

    private static HttpRequestDef<CreateSqlLimitRulesRequest, CreateSqlLimitRulesResponse> genForcreateSqlLimitRules() {
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
            f -> f.withMarshaller(CreateSqlLimitRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<CreateSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreateSqlLimitRulesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<CreateSqlLimitRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateSqlLimitRulesBody.class),
            f -> f.withMarshaller(CreateSqlLimitRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users/{db_user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<DeleteDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProcessRequest, DeleteProcessResponse> deleteProcess =
        genFordeleteProcess();

    private static HttpRequestDef<DeleteProcessRequest, DeleteProcessResponse> genFordeleteProcess() {
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
            f -> f.withMarshaller(DeleteProcessRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteProcessRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteProcessRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteProcessRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteProcessReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteProcessReqBody.class),
            f -> f.withMarshaller(DeleteProcessRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> deleteSqlLimitRules =
        genFordeleteSqlLimitRules();

    private static HttpRequestDef<DeleteSqlLimitRulesRequest, DeleteSqlLimitRulesResponse> genFordeleteSqlLimitRules() {
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
            f -> f.withMarshaller(DeleteSqlLimitRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<DeleteSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DeleteSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(DeleteSqlLimitRulesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<DeleteSqlLimitRulesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteSqlLimitRulesBody.class),
            f -> f.withMarshaller(DeleteSqlLimitRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> exportSlowQueryLogs =
        genForexportSlowQueryLogs();

    private static HttpRequestDef<ExportSlowQueryLogsRequest, ExportSlowQueryLogsResponse> genForexportSlowQueryLogs() {
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
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getStartAt, (req, v) -> {
                req.setStartAt(v);
            }));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getEndAt, (req, v) -> {
                req.setEndAt(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<ExportSlowQueryLogsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSlowQueryLogsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSlowQueryLogsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> exportSlowSqlTemplatesDetails =
        genForexportSlowSqlTemplatesDetails();

    private static HttpRequestDef<ExportSlowSqlTemplatesDetailsRequest, ExportSlowSqlTemplatesDetailsResponse> genForexportSlowSqlTemplatesDetails() {
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
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getStartAt, (req, v) -> {
                req.setStartAt(v);
            }));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getEndAt, (req, v) -> {
                req.setEndAt(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("db_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getDbName, (req, v) -> {
                req.setDbName(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ExportSlowSqlTemplatesDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSlowSqlTemplatesDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSlowSqlTemplatesDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportSqlStatementsRequest, ExportSqlStatementsResponse> exportSqlStatements =
        genForexportSqlStatements();

    private static HttpRequestDef<ExportSqlStatementsRequest, ExportSqlStatementsResponse> genForexportSqlStatements() {
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
            f -> f.withMarshaller(ExportSqlStatementsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getStartAt, (req, v) -> {
                req.setStartAt(v);
            }));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getEndAt, (req, v) -> {
                req.setEndAt(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<ExportSqlStatementsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportSqlStatementsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportSqlStatementsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> exportTopSqlTemplatesDetails =
        genForexportTopSqlTemplatesDetails();

    private static HttpRequestDef<ExportTopSqlTemplatesDetailsRequest, ExportTopSqlTemplatesDetailsResponse> genForexportTopSqlTemplatesDetails() {
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
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getStartAt, (req, v) -> {
                req.setStartAt(v);
            }));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getEndAt, (req, v) -> {
                req.setEndAt(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<ExportTopSqlTemplatesDetailsRequest.SortEnum>withRequestField("sort",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopSqlTemplatesDetailsRequest.SortEnum.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getSort, (req, v) -> {
                req.setSort(v);
            }));
        builder.<Boolean>withRequestField("asc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getAsc, (req, v) -> {
                req.setAsc(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ExportTopSqlTemplatesDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopSqlTemplatesDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportTopSqlTemplatesDetailsRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> exportTopSqlTrendDetails =
        genForexportTopSqlTrendDetails();

    private static HttpRequestDef<ExportTopSqlTrendDetailsRequest, ExportTopSqlTrendDetailsResponse> genForexportTopSqlTrendDetails() {
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
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("start_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getStartAt, (req, v) -> {
                req.setStartAt(v);
            }));
        builder.<Long>withRequestField("end_at",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getEndAt, (req, v) -> {
                req.setEndAt(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("node_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getNodeId, (req, v) -> {
                req.setNodeId(v);
            }));
        builder.<ExportTopSqlTrendDetailsRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ExportTopSqlTrendDetailsRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ExportTopSqlTrendDetailsRequest::getXLanguage, (req, v) -> {
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
                .withUri("/v3/{project_id}/instances/{instance_id}/db-users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDbUsersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<String>withRequestField("db_username",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDbUsersRequest::getDbUsername, (req, v) -> {
                req.setDbUsername(v);
            }));
        builder.<ListDbUsersRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDbUsersRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListDbUsersRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInnodbLocksRequest, ListInnodbLocksResponse> listInnodbLocks =
        genForlistInnodbLocks();

    private static HttpRequestDef<ListInnodbLocksRequest, ListInnodbLocksResponse> genForlistInnodbLocks() {
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
            f -> f.withMarshaller(ListInnodbLocksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInnodbLocksRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<ListInnodbLocksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInnodbLocksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListInnodbLocksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetadataLocksRequest, ListMetadataLocksResponse> listMetadataLocks =
        genForlistMetadataLocks();

    private static HttpRequestDef<ListMetadataLocksRequest, ListMetadataLocksResponse> genForlistMetadataLocks() {
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
            f -> f.withMarshaller(ListMetadataLocksRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<String>withRequestField("thread_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getThreadId, (req, v) -> {
                req.setThreadId(v);
            }));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            }));
        builder.<String>withRequestField("table",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getTable, (req, v) -> {
                req.setTable(v);
            }));
        builder.<ListMetadataLocksRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMetadataLocksRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListMetadataLocksRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProcessesRequest, ListProcessesResponse> listProcesses =
        genForlistProcesses();

    private static HttpRequestDef<ListProcessesRequest, ListProcessesResponse> genForlistProcesses() {
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
            f -> f.withMarshaller(ListProcessesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getUser, (req, v) -> {
                req.setUser(v);
            }));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProcessesRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProcessesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListProcessesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListProcessesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListProcessesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> listSpaceAnalysis =
        genForlistSpaceAnalysis();

    private static HttpRequestDef<ListSpaceAnalysisRequest, ListSpaceAnalysisResponse> genForlistSpaceAnalysis() {
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
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListSpaceAnalysisRequest.ObjectTypeEnum>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSpaceAnalysisRequest.ObjectTypeEnum.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getObjectType, (req, v) -> {
                req.setObjectType(v);
            }));
        builder.<String>withRequestField("database_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getDatabaseId, (req, v) -> {
                req.setDatabaseId(v);
            }));
        builder.<String>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("show_instance_info",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getShowInstanceInfo, (req, v) -> {
                req.setShowInstanceInfo(v);
            }));
        builder.<ListSpaceAnalysisRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSpaceAnalysisRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpaceAnalysisRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> listSqlLimitRules =
        genForlistSqlLimitRules();

    private static HttpRequestDef<ListSqlLimitRulesRequest, ListSqlLimitRulesResponse> genForlistSqlLimitRules() {
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
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListSqlLimitRulesRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListSqlLimitRulesRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<ListSqlLimitRulesRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSqlLimitRulesRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ListSqlLimitRulesRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterDbUserRequest, RegisterDbUserResponse> registerDbUser =
        genForregisterDbUser();

    private static HttpRequestDef<RegisterDbUserRequest, RegisterDbUserResponse> genForregisterDbUser() {
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
            f -> f.withMarshaller(RegisterDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<RegisterDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RegisterDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(RegisterDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<RegisterDbUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterDbUserRequestBody.class),
            f -> f.withMarshaller(RegisterDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDbUserRequest, ShowDbUserResponse> showDbUser = genForshowDbUser();

    private static HttpRequestDef<ShowDbUserRequest, ShowDbUserResponse> genForshowDbUser() {
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
            f -> f.withMarshaller(ShowDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDbUserRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<ShowDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowDbUserRequest::getXLanguage, (req, v) -> {
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

    public static final HttpRequestDef<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> showSqlExecutionPlan =
        genForshowSqlExecutionPlan();

    private static HttpRequestDef<ShowSqlExecutionPlanRequest, ShowSqlExecutionPlanResponse> genForshowSqlExecutionPlan() {
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
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<String>withRequestField("database",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getDatabase, (req, v) -> {
                req.setDatabase(v);
            }));
        builder.<String>withRequestField("sql",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getSql, (req, v) -> {
                req.setSql(v);
            }));
        builder.<ShowSqlExecutionPlanRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlExecutionPlanRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlExecutionPlanRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlExplainRequest, ShowSqlExplainResponse> showSqlExplain =
        genForshowSqlExplain();

    private static HttpRequestDef<ShowSqlExplainRequest, ShowSqlExplainResponse> genForshowSqlExplain() {
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
            f -> f.withMarshaller(ShowSqlExplainRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShowSqlExplainRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlExplainRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlExplainRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<QuerySqlPlanBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(QuerySqlPlanBody.class),
            f -> f.withMarshaller(ShowSqlExplainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> showSqlLimitJobInfo =
        genForshowSqlLimitJobInfo();

    private static HttpRequestDef<ShowSqlLimitJobInfoRequest, ShowSqlLimitJobInfoResponse> genForshowSqlLimitJobInfo() {
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
            f -> f.withMarshaller(ShowSqlLimitJobInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlLimitJobInfoRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<ShowSqlLimitJobInfoRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlLimitJobInfoRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlLimitJobInfoRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> showSqlLimitSwitchStatus =
        genForshowSqlLimitSwitchStatus();

    private static HttpRequestDef<ShowSqlLimitSwitchStatusRequest, ShowSqlLimitSwitchStatusResponse> genForshowSqlLimitSwitchStatus() {
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
            f -> f.withMarshaller(ShowSqlLimitSwitchStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ShowSqlLimitSwitchStatusRequest.DatastoreTypeEnum>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowSqlLimitSwitchStatusRequest.DatastoreTypeEnum.class),
            f -> f.withMarshaller(ShowSqlLimitSwitchStatusRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<ShowSqlLimitSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlLimitSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlLimitSwitchStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> showSqlSwitchStatus =
        genForshowSqlSwitchStatus();

    private static HttpRequestDef<ShowSqlSwitchStatusRequest, ShowSqlSwitchStatusResponse> genForshowSqlSwitchStatus() {
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
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("datastore_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getDatastoreType, (req, v) -> {
                req.setDatastoreType(v);
            }));
        builder.<ShowSqlSwitchStatusRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowSqlSwitchStatusRequest.XLanguageEnum.class),
            f -> f.withMarshaller(ShowSqlSwitchStatusRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDbUserRequest, UpdateDbUserResponse> updateDbUser = genForupdateDbUser();

    private static HttpRequestDef<UpdateDbUserRequest, UpdateDbUserResponse> genForupdateDbUser() {
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
            f -> f.withMarshaller(UpdateDbUserRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("db_user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getDbUserId, (req, v) -> {
                req.setDbUserId(v);
            }));
        builder.<UpdateDbUserRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDbUserRequest.XLanguageEnum.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getXLanguage, (req, v) -> {
                req.setXLanguage(v);
            }));
        builder.<UpdateDbUserRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateDbUserRequestBody.class),
            f -> f.withMarshaller(UpdateDbUserRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

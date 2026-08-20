package com.huaweicloud.sdk.aidatalakejobserver.v2;

import com.huaweicloud.sdk.aidatalakejobserver.v2.model.AuraStatementOperatorMetrics;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkSqlRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelSparkSqlResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CloseAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CloseAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CreateAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CreateAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CreateSessionRequestBodyV2;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ExecuteAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ExecuteAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSessionStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSessionStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSqlSessionsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraSqlSessionsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListAuraStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkSqlsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ListSparkSqlsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.PreviewSparkSqlResultRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.PreviewSparkSqlResultResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RestartSparkSqlClusterRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RestartSparkSqlClusterRequestBody;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RestartSparkSqlClusterResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkJobRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkJobRequestBody;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkJobResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkSqlRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkSqlRequestBody;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.RunSparkSqlResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobStateRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkJobStateResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkOperatorStateRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkOperatorStateResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlStateRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowSparkSqlStateResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.StatementExecuteRequestBody;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.StatementQueryMetrics;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class AIDataLakeJobServerMeta {

    public static final HttpRequestDef<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> cancelAuraSqlStatement =
        genForCancelAuraSqlStatement();

    private static HttpRequestDef<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> genForCancelAuraSqlStatement() {
        // basic
        HttpRequestDef.Builder<CancelAuraSqlStatementRequest, CancelAuraSqlStatementResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelAuraSqlStatementRequest.class, CancelAuraSqlStatementResponse.class)
            .withName("CancelAuraSqlStatement")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}/cancel")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraSqlStatementRequest::getWorkspaceId,
                CancelAuraSqlStatementRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraSqlStatementRequest::getSessionId,
                CancelAuraSqlStatementRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraSqlStatementRequest::getStatementId,
                CancelAuraSqlStatementRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> closeAuraSqlSession =
        genForCloseAuraSqlSession();

    private static HttpRequestDef<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> genForCloseAuraSqlSession() {
        // basic
        HttpRequestDef.Builder<CloseAuraSqlSessionRequest, CloseAuraSqlSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, CloseAuraSqlSessionRequest.class, CloseAuraSqlSessionResponse.class)
            .withName("CloseAuraSqlSession")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseAuraSqlSessionRequest::getWorkspaceId,
                CloseAuraSqlSessionRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseAuraSqlSessionRequest::getSessionId, CloseAuraSqlSessionRequest::setSessionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> createAuraSqlSession =
        genForCreateAuraSqlSession();

    private static HttpRequestDef<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> genForCreateAuraSqlSession() {
        // basic
        HttpRequestDef.Builder<CreateAuraSqlSessionRequest, CreateAuraSqlSessionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuraSqlSessionRequest.class, CreateAuraSqlSessionResponse.class)
            .withName("CreateAuraSqlSession")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuraSqlSessionRequest::getWorkspaceId,
                CreateAuraSqlSessionRequest::setWorkspaceId));
        builder.<CreateSessionRequestBodyV2>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateSessionRequestBodyV2.class),
            f -> f.withMarshaller(CreateAuraSqlSessionRequest::getBody, CreateAuraSqlSessionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuraSqlSessionResponse::getXRequestId,
                CreateAuraSqlSessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> executeAuraSqlStatement =
        genForExecuteAuraSqlStatement();

    private static HttpRequestDef<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> genForExecuteAuraSqlStatement() {
        // basic
        HttpRequestDef.Builder<ExecuteAuraSqlStatementRequest, ExecuteAuraSqlStatementResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExecuteAuraSqlStatementRequest.class, ExecuteAuraSqlStatementResponse.class)
            .withName("ExecuteAuraSqlStatement")
            .withUri("/v2/workspaces/{workspace_id}/aura-sessions/statements")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteAuraSqlStatementRequest::getWorkspaceId,
                ExecuteAuraSqlStatementRequest::setWorkspaceId));
        builder.<StatementExecuteRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StatementExecuteRequestBody.class),
            f -> f.withMarshaller(ExecuteAuraSqlStatementRequest::getBody, ExecuteAuraSqlStatementRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ExecuteAuraSqlStatementResponse::getBody, ExecuteAuraSqlStatementResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> listAuraSessionStatementRecords =
        genForListAuraSessionStatementRecords();

    private static HttpRequestDef<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> genForListAuraSessionStatementRecords() {
        // basic
        HttpRequestDef.Builder<ListAuraSessionStatementRecordsRequest, ListAuraSessionStatementRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAuraSessionStatementRecordsRequest.class,
                    ListAuraSessionStatementRecordsResponse.class)
                .withName("ListAuraSessionStatementRecords")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getWorkspaceId,
                ListAuraSessionStatementRecordsRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getSessionId,
                ListAuraSessionStatementRecordsRequest::setSessionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getLimit,
                ListAuraSessionStatementRecordsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getMarker,
                ListAuraSessionStatementRecordsRequest::setMarker));
        builder.<String>withRequestField("statement_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getStatementId,
                ListAuraSessionStatementRecordsRequest::setStatementId));
        builder.<ListAuraSessionStatementRecordsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuraSessionStatementRecordsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAuraSessionStatementRecordsRequest::getStatus,
                ListAuraSessionStatementRecordsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> listAuraSqlSessions =
        genForListAuraSqlSessions();

    private static HttpRequestDef<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> genForListAuraSqlSessions() {
        // basic
        HttpRequestDef.Builder<ListAuraSqlSessionsRequest, ListAuraSqlSessionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuraSqlSessionsRequest.class, ListAuraSqlSessionsResponse.class)
                .withName("ListAuraSqlSessions")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getWorkspaceId,
                ListAuraSqlSessionsRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getEndpointId,
                ListAuraSqlSessionsRequest::setEndpointId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getEndpointName,
                ListAuraSqlSessionsRequest::setEndpointName));
        builder.<String>withRequestField("session_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getSessionId, ListAuraSqlSessionsRequest::setSessionId));
        builder.<ListAuraSqlSessionsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuraSqlSessionsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getStatus, ListAuraSqlSessionsRequest::setStatus));
        builder.<Integer>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getStartTime, ListAuraSqlSessionsRequest::setStartTime));
        builder.<Integer>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getEndTime, ListAuraSqlSessionsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getMarker, ListAuraSqlSessionsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraSqlSessionsRequest::getLimit, ListAuraSqlSessionsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> listAuraStatementRecords =
        genForListAuraStatementRecords();

    private static HttpRequestDef<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> genForListAuraStatementRecords() {
        // basic
        HttpRequestDef.Builder<ListAuraStatementRecordsRequest, ListAuraStatementRecordsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListAuraStatementRecordsRequest.class, ListAuraStatementRecordsResponse.class)
                .withName("ListAuraStatementRecords")
                .withUri("/v2/workspaces/{workspace_id}/aura-statement-records")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getWorkspaceId,
                ListAuraStatementRecordsRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getEndpointId,
                ListAuraStatementRecordsRequest::setEndpointId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getEndpointName,
                ListAuraStatementRecordsRequest::setEndpointName));
        builder.<String>withRequestField("session_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getSessionId,
                ListAuraStatementRecordsRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getStatementId,
                ListAuraStatementRecordsRequest::setStatementId));
        builder.<Integer>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getSource,
                ListAuraStatementRecordsRequest::setSource));
        builder.<ListAuraStatementRecordsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAuraStatementRecordsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getStatus,
                ListAuraStatementRecordsRequest::setStatus));
        builder.<Integer>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getStartTime,
                ListAuraStatementRecordsRequest::setStartTime));
        builder.<Integer>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getEndTime,
                ListAuraStatementRecordsRequest::setEndTime));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getMarker,
                ListAuraStatementRecordsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraStatementRecordsRequest::getLimit,
                ListAuraStatementRecordsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> showAuraSqlSession =
        genForShowAuraSqlSession();

    private static HttpRequestDef<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> genForShowAuraSqlSession() {
        // basic
        HttpRequestDef.Builder<ShowAuraSqlSessionRequest, ShowAuraSqlSessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAuraSqlSessionRequest.class, ShowAuraSqlSessionResponse.class)
                .withName("ShowAuraSqlSession")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlSessionRequest::getWorkspaceId,
                ShowAuraSqlSessionRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlSessionRequest::getSessionId, ShowAuraSqlSessionRequest::setSessionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuraSqlSessionResponse::getXRequestId,
                ShowAuraSqlSessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> showAuraSqlStatementResult =
        genForShowAuraSqlStatementResult();

    private static HttpRequestDef<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> genForShowAuraSqlStatementResult() {
        // basic
        HttpRequestDef.Builder<ShowAuraSqlStatementResultRequest, ShowAuraSqlStatementResultResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuraSqlStatementResultRequest.class,
                    ShowAuraSqlStatementResultResponse.class)
                .withName("ShowAuraSqlStatementResult")
                .withUri("/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getWorkspaceId,
                ShowAuraSqlStatementResultRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getSessionId,
                ShowAuraSqlStatementResultRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getStatementId,
                ShowAuraSqlStatementResultRequest::setStatementId));
        builder.<Integer>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getPageNum,
                ShowAuraSqlStatementResultRequest::setPageNum));
        builder.<Boolean>withRequestField("is_enable_obs_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowAuraSqlStatementResultRequest::getIsEnableObsPath,
                ShowAuraSqlStatementResultRequest::setIsEnableObsPath));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAuraSqlStatementResultResponse::getBody,
                ShowAuraSqlStatementResultResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> showAuraStatementOperatorMetrics =
        genForShowAuraStatementOperatorMetrics();

    private static HttpRequestDef<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> genForShowAuraStatementOperatorMetrics() {
        // basic
        HttpRequestDef.Builder<ShowAuraStatementOperatorMetricsRequest, ShowAuraStatementOperatorMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuraStatementOperatorMetricsRequest.class,
                    ShowAuraStatementOperatorMetricsResponse.class)
                .withName("ShowAuraStatementOperatorMetrics")
                .withUri(
                    "/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}/operator-metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementOperatorMetricsRequest::getWorkspaceId,
                ShowAuraStatementOperatorMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementOperatorMetricsRequest::getSessionId,
                ShowAuraStatementOperatorMetricsRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementOperatorMetricsRequest::getStatementId,
                ShowAuraStatementOperatorMetricsRequest::setStatementId));

        // response
        builder.<List<AuraStatementOperatorMetrics>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowAuraStatementOperatorMetricsResponse::getBody,
                    ShowAuraStatementOperatorMetricsResponse::setBody)
                .withInnerContainerType(AuraStatementOperatorMetrics.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> showAuraStatementQueryMetrics =
        genForShowAuraStatementQueryMetrics();

    private static HttpRequestDef<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> genForShowAuraStatementQueryMetrics() {
        // basic
        HttpRequestDef.Builder<ShowAuraStatementQueryMetricsRequest, ShowAuraStatementQueryMetricsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowAuraStatementQueryMetricsRequest.class,
                    ShowAuraStatementQueryMetricsResponse.class)
                .withName("ShowAuraStatementQueryMetrics")
                .withUri(
                    "/v2/workspaces/{workspace_id}/aura-sessions/{session_id}/statements/{statement_id}/query-metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementQueryMetricsRequest::getWorkspaceId,
                ShowAuraStatementQueryMetricsRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementQueryMetricsRequest::getSessionId,
                ShowAuraStatementQueryMetricsRequest::setSessionId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraStatementQueryMetricsRequest::getStatementId,
                ShowAuraStatementQueryMetricsRequest::setStatementId));

        // response
        builder.<List<StatementQueryMetrics>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(ShowAuraStatementQueryMetricsResponse::getBody,
                    ShowAuraStatementQueryMetricsResponse::setBody)
                .withInnerContainerType(StatementQueryMetrics.class));

        return builder.build();
    }

    public static final HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> cancelSparkJob =
        genForCancelSparkJob();

    private static HttpRequestDef<CancelSparkJobRequest, CancelSparkJobResponse> genForCancelSparkJob() {
        // basic
        HttpRequestDef.Builder<CancelSparkJobRequest, CancelSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSparkJobRequest.class, CancelSparkJobResponse.class)
                .withName("CancelSparkJob")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkJobRequest::getWorkspaceId, CancelSparkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkJobRequest::getJobId, CancelSparkJobRequest::setJobId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelSparkJobResponse::getBody, CancelSparkJobResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> listSparkJobs =
        genForListSparkJobs();

    private static HttpRequestDef<ListSparkJobsRequest, ListSparkJobsResponse> genForListSparkJobs() {
        // basic
        HttpRequestDef.Builder<ListSparkJobsRequest, ListSparkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSparkJobsRequest.class, ListSparkJobsResponse.class)
                .withName("ListSparkJobs")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getWorkspaceId, ListSparkJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getMarker, ListSparkJobsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getLimit, ListSparkJobsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getPageReverse, ListSparkJobsRequest::setPageReverse));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getName, ListSparkJobsRequest::setName));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateTimeAfter, ListSparkJobsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateTimeBefore,
                ListSparkJobsRequest::setCreateTimeBefore));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getEndpointName, ListSparkJobsRequest::setEndpointName));
        builder.<List<String>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getStates, ListSparkJobsRequest::setStates));
        builder.<ListSparkJobsRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListSparkJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobType, ListSparkJobsRequest::setJobType));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getJobId, ListSparkJobsRequest::setJobId));
        builder.<String>withRequestField("create_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateUserId, ListSparkJobsRequest::setCreateUserId));
        builder.<String>withRequestField("create_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getCreateUserName, ListSparkJobsRequest::setCreateUserName));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkJobsRequest::getLabels, ListSparkJobsRequest::setLabels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSparkJobRequest, RunSparkJobResponse> runSparkJob = genForRunSparkJob();

    private static HttpRequestDef<RunSparkJobRequest, RunSparkJobResponse> genForRunSparkJob() {
        // basic
        HttpRequestDef.Builder<RunSparkJobRequest, RunSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSparkJobRequest.class, RunSparkJobResponse.class)
                .withName("RunSparkJob")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkJobRequest::getWorkspaceId, RunSparkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkJobRequest::getXClientToken, RunSparkJobRequest::setXClientToken));
        builder.<RunSparkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunSparkJobRequestBody.class),
            f -> f.withMarshaller(RunSparkJobRequest::getBody, RunSparkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> showSparkJob = genForShowSparkJob();

    private static HttpRequestDef<ShowSparkJobRequest, ShowSparkJobResponse> genForShowSparkJob() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobRequest, ShowSparkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobRequest.class, ShowSparkJobResponse.class)
                .withName("ShowSparkJob")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobRequest::getWorkspaceId, ShowSparkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobRequest::getJobId, ShowSparkJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkJobStateRequest, ShowSparkJobStateResponse> showSparkJobState =
        genForShowSparkJobState();

    private static HttpRequestDef<ShowSparkJobStateRequest, ShowSparkJobStateResponse> genForShowSparkJobState() {
        // basic
        HttpRequestDef.Builder<ShowSparkJobStateRequest, ShowSparkJobStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkJobStateRequest.class, ShowSparkJobStateResponse.class)
                .withName("ShowSparkJobState")
                .withUri("/v2/workspaces/{workspace_id}/spark-jobs/{job_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobStateRequest::getWorkspaceId, ShowSparkJobStateRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkJobStateRequest::getJobId, ShowSparkJobStateRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> showSparkOperatorState =
        genForShowSparkOperatorState();

    private static HttpRequestDef<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> genForShowSparkOperatorState() {
        // basic
        HttpRequestDef.Builder<ShowSparkOperatorStateRequest, ShowSparkOperatorStateResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ShowSparkOperatorStateRequest.class, ShowSparkOperatorStateResponse.class)
            .withName("ShowSparkOperatorState")
            .withUri("/v2/workspaces/{workspace_id}/spark-operators/{operation_id}/show-state")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkOperatorStateRequest::getWorkspaceId,
                ShowSparkOperatorStateRequest::setWorkspaceId));
        builder.<String>withRequestField("operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkOperatorStateRequest::getOperationId,
                ShowSparkOperatorStateRequest::setOperationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelSparkSqlRequest, CancelSparkSqlResponse> cancelSparkSql =
        genForCancelSparkSql();

    private static HttpRequestDef<CancelSparkSqlRequest, CancelSparkSqlResponse> genForCancelSparkSql() {
        // basic
        HttpRequestDef.Builder<CancelSparkSqlRequest, CancelSparkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelSparkSqlRequest.class, CancelSparkSqlResponse.class)
                .withName("CancelSparkSql")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkSqlRequest::getWorkspaceId, CancelSparkSqlRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelSparkSqlRequest::getStatementId, CancelSparkSqlRequest::setStatementId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelSparkSqlResponse::getBody, CancelSparkSqlResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListSparkSqlsRequest, ListSparkSqlsResponse> listSparkSqls =
        genForListSparkSqls();

    private static HttpRequestDef<ListSparkSqlsRequest, ListSparkSqlsResponse> genForListSparkSqls() {
        // basic
        HttpRequestDef.Builder<ListSparkSqlsRequest, ListSparkSqlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSparkSqlsRequest.class, ListSparkSqlsResponse.class)
                .withName("ListSparkSqls")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getWorkspaceId, ListSparkSqlsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getMarker, ListSparkSqlsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getLimit, ListSparkSqlsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getPageReverse, ListSparkSqlsRequest::setPageReverse));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getEndpointName, ListSparkSqlsRequest::setEndpointName));
        builder.<String>withRequestField("statement",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStatement, ListSparkSqlsRequest::setStatement));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateTimeAfter, ListSparkSqlsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateTimeBefore,
                ListSparkSqlsRequest::setCreateTimeBefore));
        builder.<List<String>>withRequestField("states",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStates, ListSparkSqlsRequest::setStates));
        builder.<List<String>>withRequestField("statement_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStatementTypes, ListSparkSqlsRequest::setStatementTypes));
        builder.<String>withRequestField("statement_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getStatementId, ListSparkSqlsRequest::setStatementId));
        builder.<String>withRequestField("create_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateUserId, ListSparkSqlsRequest::setCreateUserId));
        builder.<String>withRequestField("create_user_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getCreateUserName, ListSparkSqlsRequest::setCreateUserName));
        builder.<String>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSparkSqlsRequest::getLabels, ListSparkSqlsRequest::setLabels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> previewSparkSqlResult =
        genForPreviewSparkSqlResult();

    private static HttpRequestDef<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> genForPreviewSparkSqlResult() {
        // basic
        HttpRequestDef.Builder<PreviewSparkSqlResultRequest, PreviewSparkSqlResultResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, PreviewSparkSqlResultRequest.class, PreviewSparkSqlResultResponse.class)
            .withName("PreviewSparkSqlResult")
            .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}/preview")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSparkSqlResultRequest::getWorkspaceId,
                PreviewSparkSqlResultRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PreviewSparkSqlResultRequest::getStatementId,
                PreviewSparkSqlResultRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> restartSparkSqlCluster =
        genForRestartSparkSqlCluster();

    private static HttpRequestDef<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> genForRestartSparkSqlCluster() {
        // basic
        HttpRequestDef.Builder<RestartSparkSqlClusterRequest, RestartSparkSqlClusterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RestartSparkSqlClusterRequest.class, RestartSparkSqlClusterResponse.class)
            .withName("RestartSparkSqlCluster")
            .withUri("/v2/workspaces/{workspace_id}/endpoints/{endpoint_name}/spark-sqls/restart-cluster")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartSparkSqlClusterRequest::getWorkspaceId,
                RestartSparkSqlClusterRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestartSparkSqlClusterRequest::getEndpointName,
                RestartSparkSqlClusterRequest::setEndpointName));
        builder.<RestartSparkSqlClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RestartSparkSqlClusterRequestBody.class),
            f -> f.withMarshaller(RestartSparkSqlClusterRequest::getBody, RestartSparkSqlClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunSparkSqlRequest, RunSparkSqlResponse> runSparkSql = genForRunSparkSql();

    private static HttpRequestDef<RunSparkSqlRequest, RunSparkSqlResponse> genForRunSparkSql() {
        // basic
        HttpRequestDef.Builder<RunSparkSqlRequest, RunSparkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunSparkSqlRequest.class, RunSparkSqlResponse.class)
                .withName("RunSparkSql")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkSqlRequest::getWorkspaceId, RunSparkSqlRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunSparkSqlRequest::getXClientToken, RunSparkSqlRequest::setXClientToken));
        builder.<RunSparkSqlRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunSparkSqlRequestBody.class),
            f -> f.withMarshaller(RunSparkSqlRequest::getBody, RunSparkSqlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkSqlRequest, ShowSparkSqlResponse> showSparkSql = genForShowSparkSql();

    private static HttpRequestDef<ShowSparkSqlRequest, ShowSparkSqlResponse> genForShowSparkSql() {
        // basic
        HttpRequestDef.Builder<ShowSparkSqlRequest, ShowSparkSqlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkSqlRequest.class, ShowSparkSqlResponse.class)
                .withName("ShowSparkSql")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlRequest::getWorkspaceId, ShowSparkSqlRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlRequest::getStatementId, ShowSparkSqlRequest::setStatementId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> showSparkSqlState =
        genForShowSparkSqlState();

    private static HttpRequestDef<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> genForShowSparkSqlState() {
        // basic
        HttpRequestDef.Builder<ShowSparkSqlStateRequest, ShowSparkSqlStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSparkSqlStateRequest.class, ShowSparkSqlStateResponse.class)
                .withName("ShowSparkSqlState")
                .withUri("/v2/workspaces/{workspace_id}/spark-sqls/{statement_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlStateRequest::getWorkspaceId, ShowSparkSqlStateRequest::setWorkspaceId));
        builder.<String>withRequestField("statement_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSparkSqlStateRequest::getStatementId, ShowSparkSqlStateRequest::setStatementId));

        // response

        return builder.build();
    }

}

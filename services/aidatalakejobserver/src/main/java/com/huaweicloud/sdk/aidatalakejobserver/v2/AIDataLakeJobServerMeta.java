package com.huaweicloud.sdk.aidatalakejobserver.v2;

import com.huaweicloud.sdk.aidatalakejobserver.v2.model.AuraStatementOperatorMetrics;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.CancelAuraSqlStatementResponse;
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
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalakejobserver.v2.model.ShowAuraStatementQueryMetricsResponse;
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

}

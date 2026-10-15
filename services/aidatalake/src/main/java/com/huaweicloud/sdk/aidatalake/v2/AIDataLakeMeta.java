package com.huaweicloud.sdk.aidatalake.v2;

import com.huaweicloud.sdk.aidatalake.v2.model.AuraStatementOperatorMetrics;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CancelSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseRaySessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CloseRaySessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateDataframeJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRayFederationRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateRaySessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.CreateSessionRequestBodyV2;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.DeleteFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ExecuteAuraSqlStatementRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ExecuteAuraSqlStatementResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.FlinkJobState;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSessionStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSessionStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSqlSessionsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraSqlSessionsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraStatementRecordsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListAuraStatementRecordsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFederationsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFederationsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobAutoscalingHistoriesRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobAutoscalingHistoriesResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobEventsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobEventsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListRayJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListRayJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkJobsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkJobsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkSqlsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ListSparkSqlsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.PreviewSparkSqlResultRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.PreviewSparkSqlResultResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RestartSparkSqlClusterResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.RunSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraDataframeJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraDataframeJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlSessionRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlSessionResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlStatementResultRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraSqlStatementResultResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementOperatorMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementOperatorMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementQueryMetricsRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowAuraStatementQueryMetricsResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobAutoscalingPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobAutoscalingPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkJobStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkSavepointRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowFlinkSavepointResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowRayJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowRayJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkJobStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkOperatorStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkOperatorStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlStateRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.ShowSparkSqlStateResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.StatementExecuteRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.StatementQueryMetrics;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFederationRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFederationResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingPolicyRequest;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingPolicyResponse;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateFlinkJobAutoscalingRequestBody;
import com.huaweicloud.sdk.aidatalake.v2.model.UpdateRayFederationRequestBody;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class AIDataLakeMeta {

    public static final HttpRequestDef<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> cancelAuraDataframeJob =
        genForCancelAuraDataframeJob();

    private static HttpRequestDef<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> genForCancelAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<CancelAuraDataframeJobRequest, CancelAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CancelAuraDataframeJobRequest.class, CancelAuraDataframeJobResponse.class)
            .withName("CancelAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs/{job_id}/cancel")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraDataframeJobRequest::getWorkspaceId,
                CancelAuraDataframeJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelAuraDataframeJobRequest::getJobId, CancelAuraDataframeJobRequest::setJobId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CancelAuraDataframeJobResponse::getXRequestId,
                CancelAuraDataframeJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> createAuraDataframeJob =
        genForCreateAuraDataframeJob();

    private static HttpRequestDef<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> genForCreateAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<CreateAuraDataframeJobRequest, CreateAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuraDataframeJobRequest.class, CreateAuraDataframeJobResponse.class)
            .withName("CreateAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuraDataframeJobRequest::getWorkspaceId,
                CreateAuraDataframeJobRequest::setWorkspaceId));
        builder.<CreateDataframeJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataframeJobRequestBody.class),
            f -> f.withMarshaller(CreateAuraDataframeJobRequest::getBody, CreateAuraDataframeJobRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAuraDataframeJobResponse::getXRequestId,
                CreateAuraDataframeJobResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> listAuraDataframeJob =
        genForListAuraDataframeJob();

    private static HttpRequestDef<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> genForListAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<ListAuraDataframeJobRequest, ListAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAuraDataframeJobRequest.class, ListAuraDataframeJobResponse.class)
            .withName("ListAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getWorkspaceId,
                ListAuraDataframeJobRequest::setWorkspaceId));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getEndpointId,
                ListAuraDataframeJobRequest::setEndpointId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getId, ListAuraDataframeJobRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getLimit, ListAuraDataframeJobRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getOffset, ListAuraDataframeJobRequest::setOffset));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAuraDataframeJobRequest::getStatus, ListAuraDataframeJobRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> showAuraDataframeJob =
        genForShowAuraDataframeJob();

    private static HttpRequestDef<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> genForShowAuraDataframeJob() {
        // basic
        HttpRequestDef.Builder<ShowAuraDataframeJobRequest, ShowAuraDataframeJobResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuraDataframeJobRequest.class, ShowAuraDataframeJobResponse.class)
            .withName("ShowAuraDataframeJob")
            .withUri("/v2/workspaces/{workspace_id}/aura-dataframe-jobs/{job_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraDataframeJobRequest::getWorkspaceId,
                ShowAuraDataframeJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuraDataframeJobRequest::getJobId, ShowAuraDataframeJobRequest::setJobId));

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> listFlinkJobAutoscalingHistories =
        genForListFlinkJobAutoscalingHistories();

    private static HttpRequestDef<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> genForListFlinkJobAutoscalingHistories() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobAutoscalingHistoriesRequest, ListFlinkJobAutoscalingHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListFlinkJobAutoscalingHistoriesRequest.class,
                    ListFlinkJobAutoscalingHistoriesResponse.class)
                .withName("ListFlinkJobAutoscalingHistories")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/autoscaling-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getWorkspaceId,
                ListFlinkJobAutoscalingHistoriesRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getJobId,
                ListFlinkJobAutoscalingHistoriesRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getOffset,
                ListFlinkJobAutoscalingHistoriesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobAutoscalingHistoriesRequest::getLimit,
                ListFlinkJobAutoscalingHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> showFlinkJobAutoscalingPolicy =
        genForShowFlinkJobAutoscalingPolicy();

    private static HttpRequestDef<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> genForShowFlinkJobAutoscalingPolicy() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobAutoscalingPolicyRequest, ShowFlinkJobAutoscalingPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowFlinkJobAutoscalingPolicyRequest.class,
                    ShowFlinkJobAutoscalingPolicyResponse.class)
                .withName("ShowFlinkJobAutoscalingPolicy")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/autoscaling-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobAutoscalingPolicyRequest::getWorkspaceId,
                ShowFlinkJobAutoscalingPolicyRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobAutoscalingPolicyRequest::getJobId,
                ShowFlinkJobAutoscalingPolicyRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> updateFlinkJobAutoscalingPolicy =
        genForUpdateFlinkJobAutoscalingPolicy();

    private static HttpRequestDef<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> genForUpdateFlinkJobAutoscalingPolicy() {
        // basic
        HttpRequestDef.Builder<UpdateFlinkJobAutoscalingPolicyRequest, UpdateFlinkJobAutoscalingPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateFlinkJobAutoscalingPolicyRequest.class,
                    UpdateFlinkJobAutoscalingPolicyResponse.class)
                .withName("UpdateFlinkJobAutoscalingPolicy")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/autoscaling-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlinkJobAutoscalingPolicyRequest::getWorkspaceId,
                UpdateFlinkJobAutoscalingPolicyRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFlinkJobAutoscalingPolicyRequest::getJobId,
                UpdateFlinkJobAutoscalingPolicyRequest::setJobId));
        builder.<UpdateFlinkJobAutoscalingRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateFlinkJobAutoscalingRequestBody.class),
            f -> f.withMarshaller(UpdateFlinkJobAutoscalingPolicyRequest::getBody,
                UpdateFlinkJobAutoscalingPolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelFlinkJobRequest, CancelFlinkJobResponse> cancelFlinkJob =
        genForCancelFlinkJob();

    private static HttpRequestDef<CancelFlinkJobRequest, CancelFlinkJobResponse> genForCancelFlinkJob() {
        // basic
        HttpRequestDef.Builder<CancelFlinkJobRequest, CancelFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelFlinkJobRequest.class, CancelFlinkJobResponse.class)
                .withName("CancelFlinkJob")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelFlinkJobRequest::getWorkspaceId, CancelFlinkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelFlinkJobRequest::getJobId, CancelFlinkJobRequest::setJobId));
        builder.<CancelFlinkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CancelFlinkJobRequestBody.class),
            f -> f.withMarshaller(CancelFlinkJobRequest::getBody, CancelFlinkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> listFlinkJobEvents =
        genForListFlinkJobEvents();

    private static HttpRequestDef<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> genForListFlinkJobEvents() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobEventsRequest, ListFlinkJobEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkJobEventsRequest.class, ListFlinkJobEventsResponse.class)
                .withName("ListFlinkJobEvents")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/events")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getWorkspaceId,
                ListFlinkJobEventsRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getJobId, ListFlinkJobEventsRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getOffset, ListFlinkJobEventsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getLimit, ListFlinkJobEventsRequest::setLimit));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getCreateTimeAfter,
                ListFlinkJobEventsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobEventsRequest::getCreateTimeBefore,
                ListFlinkJobEventsRequest::setCreateTimeBefore));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> listFlinkJobs =
        genForListFlinkJobs();

    private static HttpRequestDef<ListFlinkJobsRequest, ListFlinkJobsResponse> genForListFlinkJobs() {
        // basic
        HttpRequestDef.Builder<ListFlinkJobsRequest, ListFlinkJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkJobsRequest.class, ListFlinkJobsResponse.class)
                .withName("ListFlinkJobs")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getWorkspaceId, ListFlinkJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getMarker, ListFlinkJobsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLimit, ListFlinkJobsRequest::setLimit));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getPageReverse, ListFlinkJobsRequest::setPageReverse));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getCreateTimeAfter, ListFlinkJobsRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getCreateTimeBefore,
                ListFlinkJobsRequest::setCreateTimeBefore));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getEndpointId, ListFlinkJobsRequest::setEndpointId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getEndpointName, ListFlinkJobsRequest::setEndpointName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getName, ListFlinkJobsRequest::setName));
        builder.<String>withRequestField("job_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobId, ListFlinkJobsRequest::setJobId));
        builder.<String>withRequestField("deployment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getDeploymentId, ListFlinkJobsRequest::setDeploymentId));
        builder.<List<FlinkJobState>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getState, ListFlinkJobsRequest::setState));
        builder.<ListFlinkJobsRequest.JobTypeEnum>withRequestField("job_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkJobsRequest.JobTypeEnum.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getJobType, ListFlinkJobsRequest::setJobType));
        builder.<ListFlinkJobsRequest.ExecutionModeEnum>withRequestField("execution_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkJobsRequest.ExecutionModeEnum.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getExecutionMode, ListFlinkJobsRequest::setExecutionMode));
        builder.<String>withRequestField("create_user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getCreateUserId, ListFlinkJobsRequest::setCreateUserId));
        builder.<List<String>>withRequestField("labels",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListFlinkJobsRequest::getLabels, ListFlinkJobsRequest::setLabels));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunFlinkJobRequest, RunFlinkJobResponse> runFlinkJob = genForRunFlinkJob();

    private static HttpRequestDef<RunFlinkJobRequest, RunFlinkJobResponse> genForRunFlinkJob() {
        // basic
        HttpRequestDef.Builder<RunFlinkJobRequest, RunFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunFlinkJobRequest.class, RunFlinkJobResponse.class)
                .withName("RunFlinkJob")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getWorkspaceId, RunFlinkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getXClientToken, RunFlinkJobRequest::setXClientToken));
        builder.<RunFlinkJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunFlinkJobRequestBody.class),
            f -> f.withMarshaller(RunFlinkJobRequest::getBody, RunFlinkJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> showFlinkJob = genForShowFlinkJob();

    private static HttpRequestDef<ShowFlinkJobRequest, ShowFlinkJobResponse> genForShowFlinkJob() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobRequest, ShowFlinkJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkJobRequest.class, ShowFlinkJobResponse.class)
                .withName("ShowFlinkJob")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobRequest::getWorkspaceId, ShowFlinkJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobRequest::getJobId, ShowFlinkJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> showFlinkJobState =
        genForShowFlinkJobState();

    private static HttpRequestDef<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> genForShowFlinkJobState() {
        // basic
        HttpRequestDef.Builder<ShowFlinkJobStateRequest, ShowFlinkJobStateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkJobStateRequest.class, ShowFlinkJobStateResponse.class)
                .withName("ShowFlinkJobState")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/state")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobStateRequest::getWorkspaceId, ShowFlinkJobStateRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkJobStateRequest::getJobId, ShowFlinkJobStateRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> createFlinkSavepoint =
        genForCreateFlinkSavepoint();

    private static HttpRequestDef<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> genForCreateFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<CreateFlinkSavepointRequest, CreateFlinkSavepointResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFlinkSavepointRequest.class, CreateFlinkSavepointResponse.class)
            .withName("CreateFlinkSavepoint")
            .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlinkSavepointRequest::getWorkspaceId,
                CreateFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFlinkSavepointRequest::getJobId, CreateFlinkSavepointRequest::setJobId));
        builder.<CreateFlinkSavepointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFlinkSavepointRequestBody.class),
            f -> f.withMarshaller(CreateFlinkSavepointRequest::getBody, CreateFlinkSavepointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> deleteFlinkSavepoint =
        genForDeleteFlinkSavepoint();

    private static HttpRequestDef<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> genForDeleteFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<DeleteFlinkSavepointRequest, DeleteFlinkSavepointResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteFlinkSavepointRequest.class, DeleteFlinkSavepointResponse.class)
            .withName("DeleteFlinkSavepoint")
            .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints/{savepoint_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlinkSavepointRequest::getWorkspaceId,
                DeleteFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlinkSavepointRequest::getJobId, DeleteFlinkSavepointRequest::setJobId));
        builder.<String>withRequestField("savepoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFlinkSavepointRequest::getSavepointId,
                DeleteFlinkSavepointRequest::setSavepointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlinkSavepointRequest, ListFlinkSavepointResponse> listFlinkSavepoint =
        genForListFlinkSavepoint();

    private static HttpRequestDef<ListFlinkSavepointRequest, ListFlinkSavepointResponse> genForListFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<ListFlinkSavepointRequest, ListFlinkSavepointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlinkSavepointRequest.class, ListFlinkSavepointResponse.class)
                .withName("ListFlinkSavepoint")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getWorkspaceId,
                ListFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getJobId, ListFlinkSavepointRequest::setJobId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getOffset, ListFlinkSavepointRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getLimit, ListFlinkSavepointRequest::setLimit));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getCreateTimeAfter,
                ListFlinkSavepointRequest::setCreateTimeAfter));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getCreateTimeBefore,
                ListFlinkSavepointRequest::setCreateTimeBefore));
        builder.<ListFlinkSavepointRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkSavepointRequest.StateEnum.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getState, ListFlinkSavepointRequest::setState));
        builder.<ListFlinkSavepointRequest.TriggerTypeEnum>withRequestField("trigger_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListFlinkSavepointRequest.TriggerTypeEnum.class),
            f -> f.withMarshaller(ListFlinkSavepointRequest::getTriggerType,
                ListFlinkSavepointRequest::setTriggerType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> showFlinkSavepoint =
        genForShowFlinkSavepoint();

    private static HttpRequestDef<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> genForShowFlinkSavepoint() {
        // basic
        HttpRequestDef.Builder<ShowFlinkSavepointRequest, ShowFlinkSavepointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFlinkSavepointRequest.class, ShowFlinkSavepointResponse.class)
                .withName("ShowFlinkSavepoint")
                .withUri("/v2/workspaces/{workspace_id}/flink-jobs/{job_id}/flink-savepoints/{savepoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkSavepointRequest::getWorkspaceId,
                ShowFlinkSavepointRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkSavepointRequest::getJobId, ShowFlinkSavepointRequest::setJobId));
        builder.<String>withRequestField("savepoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFlinkSavepointRequest::getSavepointId,
                ShowFlinkSavepointRequest::setSavepointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFederationRequest, CreateFederationResponse> createFederation =
        genForCreateFederation();

    private static HttpRequestDef<CreateFederationRequest, CreateFederationResponse> genForCreateFederation() {
        // basic
        HttpRequestDef.Builder<CreateFederationRequest, CreateFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFederationRequest.class, CreateFederationResponse.class)
                .withName("CreateFederation")
                .withUri("/v2/workspaces/{workspace_id}/ray-federations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFederationRequest::getWorkspaceId, CreateFederationRequest::setWorkspaceId));
        builder.<CreateRayFederationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRayFederationRequestBody.class),
            f -> f.withMarshaller(CreateFederationRequest::getBody, CreateFederationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFederationRequest, DeleteFederationResponse> deleteFederation =
        genForDeleteFederation();

    private static HttpRequestDef<DeleteFederationRequest, DeleteFederationResponse> genForDeleteFederation() {
        // basic
        HttpRequestDef.Builder<DeleteFederationRequest, DeleteFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFederationRequest.class, DeleteFederationResponse.class)
                .withName("DeleteFederation")
                .withUri("/v2/workspaces/{workspace_id}/ray-federations/{ray_federation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFederationRequest::getWorkspaceId, DeleteFederationRequest::setWorkspaceId));
        builder.<String>withRequestField("ray_federation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFederationRequest::getRayFederationId,
                DeleteFederationRequest::setRayFederationId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteFederationResponse::getXRequestId, DeleteFederationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListFederationsRequest, ListFederationsResponse> listFederations =
        genForListFederations();

    private static HttpRequestDef<ListFederationsRequest, ListFederationsResponse> genForListFederations() {
        // basic
        HttpRequestDef.Builder<ListFederationsRequest, ListFederationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFederationsRequest.class, ListFederationsResponse.class)
                .withName("ListFederations")
                .withUri("/v2/workspaces/{workspace_id}/ray-federations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFederationsRequest::getWorkspaceId, ListFederationsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFederationsRequest::getOffset, ListFederationsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFederationsRequest::getLimit, ListFederationsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFederationsRequest::getName, ListFederationsRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFederationRequest, ShowFederationResponse> showFederation =
        genForShowFederation();

    private static HttpRequestDef<ShowFederationRequest, ShowFederationResponse> genForShowFederation() {
        // basic
        HttpRequestDef.Builder<ShowFederationRequest, ShowFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowFederationRequest.class, ShowFederationResponse.class)
                .withName("ShowFederation")
                .withUri("/v2/workspaces/{workspace_id}/ray-federations/{ray_federation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFederationRequest::getWorkspaceId, ShowFederationRequest::setWorkspaceId));
        builder.<String>withRequestField("ray_federation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFederationRequest::getRayFederationId,
                ShowFederationRequest::setRayFederationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFederationRequest, UpdateFederationResponse> updateFederation =
        genForUpdateFederation();

    private static HttpRequestDef<UpdateFederationRequest, UpdateFederationResponse> genForUpdateFederation() {
        // basic
        HttpRequestDef.Builder<UpdateFederationRequest, UpdateFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFederationRequest.class, UpdateFederationResponse.class)
                .withName("UpdateFederation")
                .withUri("/v2/workspaces/{workspace_id}/ray-federations/{ray_federation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFederationRequest::getWorkspaceId, UpdateFederationRequest::setWorkspaceId));
        builder.<String>withRequestField("ray_federation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFederationRequest::getRayFederationId,
                UpdateFederationRequest::setRayFederationId));
        builder.<UpdateRayFederationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRayFederationRequestBody.class),
            f -> f.withMarshaller(UpdateFederationRequest::getBody, UpdateFederationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelRayJobRequest, CancelRayJobResponse> cancelRayJob = genForCancelRayJob();

    private static HttpRequestDef<CancelRayJobRequest, CancelRayJobResponse> genForCancelRayJob() {
        // basic
        HttpRequestDef.Builder<CancelRayJobRequest, CancelRayJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CancelRayJobRequest.class, CancelRayJobResponse.class)
                .withName("CancelRayJob")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs/{job_id}/cancel")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRayJobRequest::getWorkspaceId, CancelRayJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelRayJobRequest::getJobId, CancelRayJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRayJobsRequest, ListRayJobsResponse> listRayJobs = genForListRayJobs();

    private static HttpRequestDef<ListRayJobsRequest, ListRayJobsResponse> genForListRayJobs() {
        // basic
        HttpRequestDef.Builder<ListRayJobsRequest, ListRayJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRayJobsRequest.class, ListRayJobsResponse.class)
                .withName("ListRayJobs")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getWorkspaceId, ListRayJobsRequest::setWorkspaceId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getMarker, ListRayJobsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRayJobsRequest::getLimit, ListRayJobsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getName, ListRayJobsRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getId, ListRayJobsRequest::setId));
        builder.<String>withRequestField("endpoint_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getEndpointName, ListRayJobsRequest::setEndpointName));
        builder.<String>withRequestField("federation_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRayJobsRequest::getFederationName, ListRayJobsRequest::setFederationName));
        builder.<Long>withRequestField("create_time_before",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRayJobsRequest::getCreateTimeBefore, ListRayJobsRequest::setCreateTimeBefore));
        builder.<Long>withRequestField("create_time_after",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRayJobsRequest::getCreateTimeAfter, ListRayJobsRequest::setCreateTimeAfter));
        builder.<List<String>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRayJobsRequest::getStatus, ListRayJobsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RunRayJobRequest, RunRayJobResponse> runRayJob = genForRunRayJob();

    private static HttpRequestDef<RunRayJobRequest, RunRayJobResponse> genForRunRayJob() {
        // basic
        HttpRequestDef.Builder<RunRayJobRequest, RunRayJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RunRayJobRequest.class, RunRayJobResponse.class)
                .withName("RunRayJob")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunRayJobRequest::getWorkspaceId, RunRayJobRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Client-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RunRayJobRequest::getXClientToken, RunRayJobRequest::setXClientToken));
        builder.<RunRayJobRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RunRayJobRequestBody.class),
            f -> f.withMarshaller(RunRayJobRequest::getBody, RunRayJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRayJobRequest, ShowRayJobResponse> showRayJob = genForShowRayJob();

    private static HttpRequestDef<ShowRayJobRequest, ShowRayJobResponse> genForShowRayJob() {
        // basic
        HttpRequestDef.Builder<ShowRayJobRequest, ShowRayJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRayJobRequest.class, ShowRayJobResponse.class)
                .withName("ShowRayJob")
                .withUri("/v2/workspaces/{workspace_id}/ray-jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRayJobRequest::getWorkspaceId, ShowRayJobRequest::setWorkspaceId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRayJobRequest::getJobId, ShowRayJobRequest::setJobId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CloseRaySessionRequest, CloseRaySessionResponse> closeRaySession =
        genForCloseRaySession();

    private static HttpRequestDef<CloseRaySessionRequest, CloseRaySessionResponse> genForCloseRaySession() {
        // basic
        HttpRequestDef.Builder<CloseRaySessionRequest, CloseRaySessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, CloseRaySessionRequest.class, CloseRaySessionResponse.class)
                .withName("CloseRaySession")
                .withUri("/v2/workspaces/{workspace_id}/ray-sessions/{session_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseRaySessionRequest::getWorkspaceId, CloseRaySessionRequest::setWorkspaceId));
        builder.<String>withRequestField("session_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CloseRaySessionRequest::getSessionId, CloseRaySessionRequest::setSessionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CloseRaySessionResponse::getXRequestId, CloseRaySessionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateRaySessionRequest, CreateRaySessionResponse> createRaySession =
        genForCreateRaySession();

    private static HttpRequestDef<CreateRaySessionRequest, CreateRaySessionResponse> genForCreateRaySession() {
        // basic
        HttpRequestDef.Builder<CreateRaySessionRequest, CreateRaySessionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRaySessionRequest.class, CreateRaySessionResponse.class)
                .withName("CreateRaySession")
                .withUri("/v2/workspaces/{workspace_id}/ray-sessions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRaySessionRequest::getWorkspaceId, CreateRaySessionRequest::setWorkspaceId));
        builder.<CreateRaySessionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRaySessionRequestBody.class),
            f -> f.withMarshaller(CreateRaySessionRequest::getBody, CreateRaySessionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateRaySessionResponse::getXRequestId, CreateRaySessionResponse::setXRequestId));
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

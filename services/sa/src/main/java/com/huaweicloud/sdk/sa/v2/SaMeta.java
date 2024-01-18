package com.huaweicloud.sdk.sa.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.sa.v2.model.AlertRuleMetric;
import com.huaweicloud.sdk.sa.v2.model.ApprovePlaybookInfo;
import com.huaweicloud.sdk.sa.v2.model.AuditLogInfo;
import com.huaweicloud.sdk.sa.v2.model.ChangeAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.ChangeAlertRequestBody;
import com.huaweicloud.sdk.sa.v2.model.ChangeAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.ChangeIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.ChangeIncidentRequestBody;
import com.huaweicloud.sdk.sa.v2.model.ChangeIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.ChangePlaybookInstanceRequest;
import com.huaweicloud.sdk.sa.v2.model.ChangePlaybookInstanceResponse;
import com.huaweicloud.sdk.sa.v2.model.CopyPlaybookInfo;
import com.huaweicloud.sdk.sa.v2.model.CopyPlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.CopyPlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRequestBody;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleRequestBody;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleSimulationRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleSimulationRequestBody;
import com.huaweicloud.sdk.sa.v2.model.CreateAlertRuleSimulationResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateBatchOrderAlertsRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateBatchOrderAlertsResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateDataobjectRelationRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateDataobjectRelationResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateIncidentRequestBody;
import com.huaweicloud.sdk.sa.v2.model.CreateIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateIndicatorRequest;
import com.huaweicloud.sdk.sa.v2.model.CreateIndicatorResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookActionRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookActionResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookApproveRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookApproveResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookInfo;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookVersionInfo;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.CreatePlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.CreateRelation;
import com.huaweicloud.sdk.sa.v2.model.CreateRuleInfo;
import com.huaweicloud.sdk.sa.v2.model.DataobjectSearch;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlert;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteDataobjectRelationRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteDataobjectRelationResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteIncident;
import com.huaweicloud.sdk.sa.v2.model.DeleteIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.DeleteIndicatorRequest;
import com.huaweicloud.sdk.sa.v2.model.DeleteIndicatorRequestBody;
import com.huaweicloud.sdk.sa.v2.model.DeleteIndicatorResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookActionRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookActionResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.DeletePlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.IndicatorCreateRequest;
import com.huaweicloud.sdk.sa.v2.model.IndicatorListSearchRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListAlertsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListAlertsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListDataobjectRelationRequest;
import com.huaweicloud.sdk.sa.v2.model.ListDataobjectRelationResponse;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentTypesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentTypesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListIncidentsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListIndicatorsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListIndicatorsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookActionsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookActionsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookApprovesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookApprovesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookAuditLogsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookAuditLogsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookInstancesRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookInstancesResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookVersionsRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybookVersionsResponse;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybooksRequest;
import com.huaweicloud.sdk.sa.v2.model.ListPlaybooksResponse;
import com.huaweicloud.sdk.sa.v2.model.ModifyActionInfo;
import com.huaweicloud.sdk.sa.v2.model.ModifyPlaybookInfo;
import com.huaweicloud.sdk.sa.v2.model.ModifyPlaybookVersionInfo;
import com.huaweicloud.sdk.sa.v2.model.ModifyRuleInfo;
import com.huaweicloud.sdk.sa.v2.model.OperationPlaybookInfo;
import com.huaweicloud.sdk.sa.v2.model.OrderAlert;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowIncidentRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowIncidentResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowIndicatorDetailRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowIndicatorDetailResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookInstanceRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookInstanceResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookMonitorsRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookMonitorsResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookStatisticsRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookStatisticsResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookTopologyRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookTopologyResponse;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.ShowPlaybookVersionResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdateAlertRuleRequestBody;
import com.huaweicloud.sdk.sa.v2.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdateIndicatorRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdateIndicatorRequestBody;
import com.huaweicloud.sdk.sa.v2.model.UpdateIndicatorResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookActionRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookActionResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookRuleRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookRuleResponse;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookVersionRequest;
import com.huaweicloud.sdk.sa.v2.model.UpdatePlaybookVersionResponse;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class SaMeta {

    public static final HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRule =
        genForCreateAlertRule();

    private static HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> genForCreateAlertRule() {
        // basic
        HttpRequestDef.Builder<CreateAlertRuleRequest, CreateAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlertRuleRequest.class, CreateAlertRuleResponse.class)
                .withName("CreateAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getWorkspaceId, CreateAlertRuleRequest::setWorkspaceId));
        builder.<CreateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getBody, CreateAlertRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertRuleResponse::getXRequestId, CreateAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulation =
        genForCreateAlertRuleSimulation();

    private static HttpRequestDef<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> genForCreateAlertRuleSimulation() {
        // basic
        HttpRequestDef.Builder<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAlertRuleSimulationRequest.class,
                    CreateAlertRuleSimulationResponse.class)
                .withName("CreateAlertRuleSimulation")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/simulation")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRuleSimulationRequest::getWorkspaceId,
                CreateAlertRuleSimulationRequest::setWorkspaceId));
        builder.<CreateAlertRuleSimulationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleSimulationRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleSimulationRequest::getBody,
                CreateAlertRuleSimulationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertRuleSimulationResponse::getXRequestId,
                CreateAlertRuleSimulationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRule =
        genForDeleteAlertRule();

    private static HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> genForDeleteAlertRule() {
        // basic
        HttpRequestDef.Builder<DeleteAlertRuleRequest, DeleteAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlertRuleRequest.class, DeleteAlertRuleResponse.class)
                .withName("DeleteAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getWorkspaceId, DeleteAlertRuleRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getBody, DeleteAlertRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertRuleResponse::getXRequestId, DeleteAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> disableAlertRule =
        genForDisableAlertRule();

    private static HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> genForDisableAlertRule() {
        // basic
        HttpRequestDef.Builder<DisableAlertRuleRequest, DisableAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableAlertRuleRequest.class, DisableAlertRuleResponse.class)
                .withName("DisableAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getWorkspaceId, DisableAlertRuleRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getBody, DisableAlertRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableAlertRuleResponse::getXRequestId, DisableAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRule =
        genForEnableAlertRule();

    private static HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> genForEnableAlertRule() {
        // basic
        HttpRequestDef.Builder<EnableAlertRuleRequest, EnableAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableAlertRuleRequest.class, EnableAlertRuleResponse.class)
                .withName("EnableAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getWorkspaceId, EnableAlertRuleRequest::setWorkspaceId));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getBody, EnableAlertRuleRequest::setBody)
                .withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableAlertRuleResponse::getXRequestId, EnableAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetrics =
        genForListAlertRuleMetrics();

    private static HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> genForListAlertRuleMetrics() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlertRuleMetricsRequest.class, ListAlertRuleMetricsResponse.class)
            .withName("ListAlertRuleMetrics")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/metrics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleMetricsRequest::getWorkspaceId,
                ListAlertRuleMetricsRequest::setWorkspaceId));

        // response
        builder.<Map<String, AlertRuleMetric>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ListAlertRuleMetricsResponse::getBody, ListAlertRuleMetricsResponse::setBody)
                .withInnerContainerType(AlertRuleMetric.class));

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRuleMetricsResponse::getXRequestId,
                ListAlertRuleMetricsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> listAlertRuleTemplates =
        genForListAlertRuleTemplates();

    private static HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> genForListAlertRuleTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAlertRuleTemplatesRequest.class, ListAlertRuleTemplatesResponse.class)
            .withName("ListAlertRuleTemplates")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getWorkspaceId,
                ListAlertRuleTemplatesRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getOffset, ListAlertRuleTemplatesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getLimit, ListAlertRuleTemplatesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortKey,
                ListAlertRuleTemplatesRequest::setSortKey));
        builder.<ListAlertRuleTemplatesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRuleTemplatesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortDir,
                ListAlertRuleTemplatesRequest::setSortDir));
        builder.<List<ListAlertRuleTemplatesRequest.SeverityEnum>>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSeverity,
                ListAlertRuleTemplatesRequest::setSeverity));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRuleTemplatesResponse::getXRequestId,
                ListAlertRuleTemplatesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> listAlertRules =
        genForListAlertRules();

    private static HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> genForListAlertRules() {
        // basic
        HttpRequestDef.Builder<ListAlertRulesRequest, ListAlertRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlertRulesRequest.class, ListAlertRulesResponse.class)
                .withName("ListAlertRules")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getWorkspaceId, ListAlertRulesRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getOffset, ListAlertRulesRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getLimit, ListAlertRulesRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortKey, ListAlertRulesRequest::setSortKey));
        builder.<ListAlertRulesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRulesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortDir, ListAlertRulesRequest::setSortDir));
        builder.<String>withRequestField("pipe_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getPipeId, ListAlertRulesRequest::setPipeId));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getRuleName, ListAlertRulesRequest::setRuleName));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getRuleId, ListAlertRulesRequest::setRuleId));
        builder.<List<ListAlertRulesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getStatus, ListAlertRulesRequest::setStatus));
        builder.<List<ListAlertRulesRequest.SeverityEnum>>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSeverity, ListAlertRulesRequest::setSeverity));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRulesResponse::getXRequestId, ListAlertRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRule =
        genForShowAlertRule();

    private static HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> genForShowAlertRule() {
        // basic
        HttpRequestDef.Builder<ShowAlertRuleRequest, ShowAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertRuleRequest.class, ShowAlertRuleResponse.class)
                .withName("ShowAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getWorkspaceId, ShowAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getRuleId, ShowAlertRuleRequest::setRuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertRuleResponse::getXRequestId, ShowAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplate =
        genForShowAlertRuleTemplate();

    private static HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> genForShowAlertRuleTemplate() {
        // basic
        HttpRequestDef.Builder<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAlertRuleTemplateRequest.class, ShowAlertRuleTemplateResponse.class)
            .withName("ShowAlertRuleTemplate")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/templates/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getWorkspaceId,
                ShowAlertRuleTemplateRequest::setWorkspaceId));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getTemplateId,
                ShowAlertRuleTemplateRequest::setTemplateId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertRuleTemplateResponse::getXRequestId,
                ShowAlertRuleTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> updateAlertRule =
        genForUpdateAlertRule();

    private static HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> genForUpdateAlertRule() {
        // basic
        HttpRequestDef.Builder<UpdateAlertRuleRequest, UpdateAlertRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlertRuleRequest.class, UpdateAlertRuleResponse.class)
                .withName("UpdateAlertRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/alert-rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getWorkspaceId, UpdateAlertRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getRuleId, UpdateAlertRuleRequest::setRuleId));
        builder.<UpdateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getBody, UpdateAlertRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAlertRuleResponse::getXRequestId, UpdateAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeAlertRequest, ChangeAlertResponse> changeAlert = genForChangeAlert();

    private static HttpRequestDef<ChangeAlertRequest, ChangeAlertResponse> genForChangeAlert() {
        // basic
        HttpRequestDef.Builder<ChangeAlertRequest, ChangeAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeAlertRequest.class, ChangeAlertResponse.class)
                .withName("ChangeAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/{alert_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlertRequest::getWorkspaceId, ChangeAlertRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlertRequest::getAlertId, ChangeAlertRequest::setAlertId));
        builder.<ChangeAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAlertRequestBody.class),
            f -> f.withMarshaller(ChangeAlertRequest::getBody, ChangeAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeAlertResponse::getXRequestId, ChangeAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRequest, CreateAlertResponse> createAlert = genForCreateAlert();

    private static HttpRequestDef<CreateAlertRequest, CreateAlertResponse> genForCreateAlert() {
        // basic
        HttpRequestDef.Builder<CreateAlertRequest, CreateAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlertRequest.class, CreateAlertResponse.class)
                .withName("CreateAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAlertRequest::getWorkspaceId, CreateAlertRequest::setWorkspaceId));
        builder.<CreateAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRequestBody.class),
            f -> f.withMarshaller(CreateAlertRequest::getBody, CreateAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertResponse::getXRequestId, CreateAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> createBatchOrderAlerts =
        genForCreateBatchOrderAlerts();

    private static HttpRequestDef<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> genForCreateBatchOrderAlerts() {
        // basic
        HttpRequestDef.Builder<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateBatchOrderAlertsRequest.class, CreateBatchOrderAlertsResponse.class)
            .withName("CreateBatchOrderAlerts")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/batch-order")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateBatchOrderAlertsRequest::getWorkspaceId,
                CreateBatchOrderAlertsRequest::setWorkspaceId));
        builder.<OrderAlert>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderAlert.class),
            f -> f.withMarshaller(CreateBatchOrderAlertsRequest::getBody, CreateBatchOrderAlertsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateBatchOrderAlertsResponse::getXRequestId,
                CreateBatchOrderAlertsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRequest, DeleteAlertResponse> deleteAlert = genForDeleteAlert();

    private static HttpRequestDef<DeleteAlertRequest, DeleteAlertResponse> genForDeleteAlert() {
        // basic
        HttpRequestDef.Builder<DeleteAlertRequest, DeleteAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlertRequest.class, DeleteAlertResponse.class)
                .withName("DeleteAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlertRequest::getWorkspaceId, DeleteAlertRequest::setWorkspaceId));
        builder.<DeleteAlert>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAlert.class),
            f -> f.withMarshaller(DeleteAlertRequest::getBody, DeleteAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertResponse::getXRequestId, DeleteAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertsRequest, ListAlertsResponse> listAlerts = genForListAlerts();

    private static HttpRequestDef<ListAlertsRequest, ListAlertsResponse> genForListAlerts() {
        // basic
        HttpRequestDef.Builder<ListAlertsRequest, ListAlertsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListAlertsRequest.class, ListAlertsResponse.class)
                .withName("ListAlerts")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertsRequest::getWorkspaceId, ListAlertsRequest::setWorkspaceId));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListAlertsRequest::getBody, ListAlertsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertsResponse::getXRequestId, ListAlertsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRequest, ShowAlertResponse> showAlert = genForShowAlert();

    private static HttpRequestDef<ShowAlertRequest, ShowAlertResponse> genForShowAlert() {
        // basic
        HttpRequestDef.Builder<ShowAlertRequest, ShowAlertResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlertRequest.class, ShowAlertResponse.class)
                .withName("ShowAlert")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/alerts/{alert_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRequest::getWorkspaceId, ShowAlertRequest::setWorkspaceId));
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRequest::getAlertId, ShowAlertRequest::setAlertId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertResponse::getXRequestId, ShowAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeIncidentRequest, ChangeIncidentResponse> changeIncident =
        genForChangeIncident();

    private static HttpRequestDef<ChangeIncidentRequest, ChangeIncidentResponse> genForChangeIncident() {
        // basic
        HttpRequestDef.Builder<ChangeIncidentRequest, ChangeIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeIncidentRequest.class, ChangeIncidentResponse.class)
                .withName("ChangeIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/{incident_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getWorkspaceId, ChangeIncidentRequest::setWorkspaceId));
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getIncidentId, ChangeIncidentRequest::setIncidentId));
        builder.<ChangeIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIncidentRequestBody.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getBody, ChangeIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeIncidentResponse::getXRequestId, ChangeIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateIncidentRequest, CreateIncidentResponse> createIncident =
        genForCreateIncident();

    private static HttpRequestDef<CreateIncidentRequest, CreateIncidentResponse> genForCreateIncident() {
        // basic
        HttpRequestDef.Builder<CreateIncidentRequest, CreateIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIncidentRequest.class, CreateIncidentResponse.class)
                .withName("CreateIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIncidentRequest::getWorkspaceId, CreateIncidentRequest::setWorkspaceId));
        builder.<CreateIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIncidentRequestBody.class),
            f -> f.withMarshaller(CreateIncidentRequest::getBody, CreateIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIncidentResponse::getXRequestId, CreateIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteIncidentRequest, DeleteIncidentResponse> deleteIncident =
        genForDeleteIncident();

    private static HttpRequestDef<DeleteIncidentRequest, DeleteIncidentResponse> genForDeleteIncident() {
        // basic
        HttpRequestDef.Builder<DeleteIncidentRequest, DeleteIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIncidentRequest.class, DeleteIncidentResponse.class)
                .withName("DeleteIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIncidentRequest::getWorkspaceId, DeleteIncidentRequest::setWorkspaceId));
        builder.<DeleteIncident>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIncident.class),
            f -> f.withMarshaller(DeleteIncidentRequest::getBody, DeleteIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIncidentResponse::getXRequestId, DeleteIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListIncidentTypesRequest, ListIncidentTypesResponse> listIncidentTypes =
        genForListIncidentTypes();

    private static HttpRequestDef<ListIncidentTypesRequest, ListIncidentTypesResponse> genForListIncidentTypes() {
        // basic
        HttpRequestDef.Builder<ListIncidentTypesRequest, ListIncidentTypesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListIncidentTypesRequest.class, ListIncidentTypesResponse.class)
                .withName("ListIncidentTypes")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/types")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getWorkspaceId, ListIncidentTypesRequest::setWorkspaceId));
        builder.<String>withRequestField("parent_business_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getParentBusinessCode,
                ListIncidentTypesRequest::setParentBusinessCode));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getOffset, ListIncidentTypesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getLimit, ListIncidentTypesRequest::setLimit));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getOrder, ListIncidentTypesRequest::setOrder));
        builder.<String>withRequestField("sortby",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getSortby, ListIncidentTypesRequest::setSortby));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getName, ListIncidentTypesRequest::setName));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getEnabled, ListIncidentTypesRequest::setEnabled));
        builder.<String>withRequestField("layout_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getLayoutName, ListIncidentTypesRequest::setLayoutName));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListIncidentTypesRequest::getIsBuiltIn, ListIncidentTypesRequest::setIsBuiltIn));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIncidentTypesResponse::getXRequestId, ListIncidentTypesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> listIncidents =
        genForListIncidents();

    private static HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> genForListIncidents() {
        // basic
        HttpRequestDef.Builder<ListIncidentsRequest, ListIncidentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIncidentsRequest.class, ListIncidentsResponse.class)
                .withName("ListIncidents")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIncidentsRequest::getWorkspaceId, ListIncidentsRequest::setWorkspaceId));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListIncidentsRequest::getBody, ListIncidentsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIncidentsResponse::getXRequestId, ListIncidentsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIncidentRequest, ShowIncidentResponse> showIncident = genForShowIncident();

    private static HttpRequestDef<ShowIncidentRequest, ShowIncidentResponse> genForShowIncident() {
        // basic
        HttpRequestDef.Builder<ShowIncidentRequest, ShowIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIncidentRequest.class, ShowIncidentResponse.class)
                .withName("ShowIncident")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/incidents/{incident_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncidentRequest::getWorkspaceId, ShowIncidentRequest::setWorkspaceId));
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncidentRequest::getIncidentId, ShowIncidentRequest::setIncidentId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateIndicatorRequest, CreateIndicatorResponse> createIndicator =
        genForCreateIndicator();

    private static HttpRequestDef<CreateIndicatorRequest, CreateIndicatorResponse> genForCreateIndicator() {
        // basic
        HttpRequestDef.Builder<CreateIndicatorRequest, CreateIndicatorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateIndicatorRequest.class, CreateIndicatorResponse.class)
                .withName("CreateIndicator")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateIndicatorRequest::getWorkspaceId, CreateIndicatorRequest::setWorkspaceId));
        builder.<IndicatorCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndicatorCreateRequest.class),
            f -> f.withMarshaller(CreateIndicatorRequest::getBody, CreateIndicatorRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIndicatorResponse::getXRequestId, CreateIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicator =
        genForDeleteIndicator();

    private static HttpRequestDef<DeleteIndicatorRequest, DeleteIndicatorResponse> genForDeleteIndicator() {
        // basic
        HttpRequestDef.Builder<DeleteIndicatorRequest, DeleteIndicatorResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteIndicatorRequest.class, DeleteIndicatorResponse.class)
                .withName("DeleteIndicator")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIndicatorRequest::getWorkspaceId, DeleteIndicatorRequest::setWorkspaceId));
        builder.<DeleteIndicatorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIndicatorRequestBody.class),
            f -> f.withMarshaller(DeleteIndicatorRequest::getBody, DeleteIndicatorRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIndicatorResponse::getXRequestId, DeleteIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListIndicatorsRequest, ListIndicatorsResponse> listIndicators =
        genForListIndicators();

    private static HttpRequestDef<ListIndicatorsRequest, ListIndicatorsResponse> genForListIndicators() {
        // basic
        HttpRequestDef.Builder<ListIndicatorsRequest, ListIndicatorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListIndicatorsRequest.class, ListIndicatorsResponse.class)
                .withName("ListIndicators")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getWorkspaceId, ListIndicatorsRequest::setWorkspaceId));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getOrder, ListIndicatorsRequest::setOrder));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getFromDate, ListIndicatorsRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getToDate, ListIndicatorsRequest::setToDate));
        builder.<IndicatorListSearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndicatorListSearchRequest.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getBody, ListIndicatorsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIndicatorsResponse::getXRequestId, ListIndicatorsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetail =
        genForShowIndicatorDetail();

    private static HttpRequestDef<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> genForShowIndicatorDetail() {
        // basic
        HttpRequestDef.Builder<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIndicatorDetailRequest.class, ShowIndicatorDetailResponse.class)
                .withName("ShowIndicatorDetail")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/{indicator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndicatorDetailRequest::getWorkspaceId,
                ShowIndicatorDetailRequest::setWorkspaceId));
        builder.<String>withRequestField("indicator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndicatorDetailRequest::getIndicatorId,
                ShowIndicatorDetailRequest::setIndicatorId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIndicatorDetailResponse::getXRequestId,
                ShowIndicatorDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicator =
        genForUpdateIndicator();

    private static HttpRequestDef<UpdateIndicatorRequest, UpdateIndicatorResponse> genForUpdateIndicator() {
        // basic
        HttpRequestDef.Builder<UpdateIndicatorRequest, UpdateIndicatorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateIndicatorRequest.class, UpdateIndicatorResponse.class)
                .withName("UpdateIndicator")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/indicators/{indicator_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getWorkspaceId, UpdateIndicatorRequest::setWorkspaceId));
        builder.<String>withRequestField("indicator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getIndicatorId, UpdateIndicatorRequest::setIndicatorId));
        builder.<UpdateIndicatorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIndicatorRequestBody.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getBody, UpdateIndicatorRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIndicatorResponse::getXRequestId, UpdateIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybook =
        genForCreatePlaybook();

    private static HttpRequestDef<CreatePlaybookRequest, CreatePlaybookResponse> genForCreatePlaybook() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookRequest, CreatePlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePlaybookRequest.class, CreatePlaybookResponse.class)
                .withName("CreatePlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRequest::getWorkspaceId, CreatePlaybookRequest::setWorkspaceId));
        builder.<CreatePlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePlaybookInfo.class),
            f -> f.withMarshaller(CreatePlaybookRequest::getBody, CreatePlaybookRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookResponse::getXRequestId, CreatePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybook =
        genForDeletePlaybook();

    private static HttpRequestDef<DeletePlaybookRequest, DeletePlaybookResponse> genForDeletePlaybook() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookRequest, DeletePlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePlaybookRequest.class, DeletePlaybookResponse.class)
                .withName("DeletePlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRequest::getWorkspaceId, DeletePlaybookRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRequest::getPlaybookId, DeletePlaybookRequest::setPlaybookId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookResponse::getXRequestId, DeletePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybooksRequest, ListPlaybooksResponse> listPlaybooks =
        genForListPlaybooks();

    private static HttpRequestDef<ListPlaybooksRequest, ListPlaybooksResponse> genForListPlaybooks() {
        // basic
        HttpRequestDef.Builder<ListPlaybooksRequest, ListPlaybooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPlaybooksRequest.class, ListPlaybooksResponse.class)
                .withName("ListPlaybooks")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getWorkspaceId, ListPlaybooksRequest::setWorkspaceId));
        builder.<String>withRequestField("search_txt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getSearchTxt, ListPlaybooksRequest::setSearchTxt));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getComponentId, ListPlaybooksRequest::setComponentId));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getEnabled, ListPlaybooksRequest::setEnabled));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getOffset, ListPlaybooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getLimit, ListPlaybooksRequest::setLimit));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getDescription, ListPlaybooksRequest::setDescription));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getDataclassName, ListPlaybooksRequest::setDataclassName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getName, ListPlaybooksRequest::setName));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybooksResponse::getXRequestId, ListPlaybooksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybook = genForShowPlaybook();

    private static HttpRequestDef<ShowPlaybookRequest, ShowPlaybookResponse> genForShowPlaybook() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookRequest, ShowPlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlaybookRequest.class, ShowPlaybookResponse.class)
                .withName("ShowPlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRequest::getWorkspaceId, ShowPlaybookRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRequest::getPlaybookId, ShowPlaybookRequest::setPlaybookId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookResponse::getXRequestId, ShowPlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> showPlaybookMonitors =
        genForShowPlaybookMonitors();

    private static HttpRequestDef<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> genForShowPlaybookMonitors() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookMonitorsRequest.class, ShowPlaybookMonitorsResponse.class)
            .withName("ShowPlaybookMonitors")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}/monitor")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getWorkspaceId,
                ShowPlaybookMonitorsRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getPlaybookId,
                ShowPlaybookMonitorsRequest::setPlaybookId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getStartTime,
                ShowPlaybookMonitorsRequest::setStartTime));
        builder.<String>withRequestField("version_query_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getVersionQueryType,
                ShowPlaybookMonitorsRequest::setVersionQueryType));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getEndTime, ShowPlaybookMonitorsRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookMonitorsResponse::getXRequestId,
                ShowPlaybookMonitorsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatistics =
        genForShowPlaybookStatistics();

    private static HttpRequestDef<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> genForShowPlaybookStatistics() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookStatisticsRequest.class, ShowPlaybookStatisticsResponse.class)
            .withName("ShowPlaybookStatistics")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookStatisticsRequest::getWorkspaceId,
                ShowPlaybookStatisticsRequest::setWorkspaceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookStatisticsResponse::getXRequestId,
                ShowPlaybookStatisticsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybook =
        genForUpdatePlaybook();

    private static HttpRequestDef<UpdatePlaybookRequest, UpdatePlaybookResponse> genForUpdatePlaybook() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookRequest, UpdatePlaybookResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePlaybookRequest.class, UpdatePlaybookResponse.class)
                .withName("UpdatePlaybook")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getWorkspaceId, UpdatePlaybookRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getPlaybookId, UpdatePlaybookRequest::setPlaybookId));
        builder.<ModifyPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyPlaybookInfo.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getBody, UpdatePlaybookRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookResponse::getXRequestId, UpdatePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookAction =
        genForCreatePlaybookAction();

    private static HttpRequestDef<CreatePlaybookActionRequest, CreatePlaybookActionResponse> genForCreatePlaybookAction() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookActionRequest, CreatePlaybookActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePlaybookActionRequest.class, CreatePlaybookActionResponse.class)
            .withName("CreatePlaybookAction")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getWorkspaceId,
                CreatePlaybookActionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getVersionId,
                CreatePlaybookActionRequest::setVersionId));
        builder.<List<Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getBody, CreatePlaybookActionRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookActionResponse::getXRequestId,
                CreatePlaybookActionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookAction =
        genForDeletePlaybookAction();

    private static HttpRequestDef<DeletePlaybookActionRequest, DeletePlaybookActionResponse> genForDeletePlaybookAction() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookActionRequest, DeletePlaybookActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePlaybookActionRequest.class, DeletePlaybookActionResponse.class)
            .withName("DeletePlaybookAction")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions/{action_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getWorkspaceId,
                DeletePlaybookActionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getVersionId,
                DeletePlaybookActionRequest::setVersionId));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getActionId, DeletePlaybookActionRequest::setActionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookActionResponse::getXRequestId,
                DeletePlaybookActionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActions =
        genForListPlaybookActions();

    private static HttpRequestDef<ListPlaybookActionsRequest, ListPlaybookActionsResponse> genForListPlaybookActions() {
        // basic
        HttpRequestDef.Builder<ListPlaybookActionsRequest, ListPlaybookActionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPlaybookActionsRequest.class, ListPlaybookActionsResponse.class)
                .withName("ListPlaybookActions")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getWorkspaceId,
                ListPlaybookActionsRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getVersionId, ListPlaybookActionsRequest::setVersionId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getLimit, ListPlaybookActionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getOffset, ListPlaybookActionsRequest::setOffset));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookActionsResponse::getXRequestId,
                ListPlaybookActionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookAction =
        genForUpdatePlaybookAction();

    private static HttpRequestDef<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> genForUpdatePlaybookAction() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePlaybookActionRequest.class, UpdatePlaybookActionResponse.class)
            .withName("UpdatePlaybookAction")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/actions/{action_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getWorkspaceId,
                UpdatePlaybookActionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getVersionId,
                UpdatePlaybookActionRequest::setVersionId));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getActionId, UpdatePlaybookActionRequest::setActionId));
        builder.<ModifyActionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyActionInfo.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getBody, UpdatePlaybookActionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookActionResponse::getXRequestId,
                UpdatePlaybookActionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> createPlaybookApprove =
        genForCreatePlaybookApprove();

    private static HttpRequestDef<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> genForCreatePlaybookApprove() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePlaybookApproveRequest.class, CreatePlaybookApproveResponse.class)
            .withName("CreatePlaybookApprove")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/approval")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getWorkspaceId,
                CreatePlaybookApproveRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getVersionId,
                CreatePlaybookApproveRequest::setVersionId));
        builder.<ApprovePlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovePlaybookInfo.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getBody, CreatePlaybookApproveRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookApproveResponse::getXRequestId,
                CreatePlaybookApproveResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> listPlaybookApproves =
        genForListPlaybookApproves();

    private static HttpRequestDef<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> genForListPlaybookApproves() {
        // basic
        HttpRequestDef.Builder<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPlaybookApprovesRequest.class, ListPlaybookApprovesResponse.class)
            .withName("ListPlaybookApproves")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/approval")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getWorkspaceId,
                ListPlaybookApprovesRequest::setWorkspaceId));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getResourceId,
                ListPlaybookApprovesRequest::setResourceId));
        builder.<String>withRequestField("approve_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getApproveType,
                ListPlaybookApprovesRequest::setApproveType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookApprovesResponse::getXRequestId,
                ListPlaybookApprovesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstance =
        genForChangePlaybookInstance();

    private static HttpRequestDef<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> genForChangePlaybookInstance() {
        // basic
        HttpRequestDef.Builder<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ChangePlaybookInstanceRequest.class, ChangePlaybookInstanceResponse.class)
            .withName("ChangePlaybookInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/{instance_id}/operation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getWorkspaceId,
                ChangePlaybookInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getInstanceId,
                ChangePlaybookInstanceRequest::setInstanceId));
        builder.<OperationPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OperationPlaybookInfo.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getBody, ChangePlaybookInstanceRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangePlaybookInstanceResponse::getXRequestId,
                ChangePlaybookInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> listPlaybookAuditLogs =
        genForListPlaybookAuditLogs();

    private static HttpRequestDef<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> genForListPlaybookAuditLogs() {
        // basic
        HttpRequestDef.Builder<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListPlaybookAuditLogsRequest.class, ListPlaybookAuditLogsResponse.class)
            .withName("ListPlaybookAuditLogs")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/auditlogs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getWorkspaceId,
                ListPlaybookAuditLogsRequest::setWorkspaceId));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getOffset, ListPlaybookAuditLogsRequest::setOffset));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getLimit, ListPlaybookAuditLogsRequest::setLimit));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getSortKey, ListPlaybookAuditLogsRequest::setSortKey));
        builder.<ListPlaybookAuditLogsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPlaybookAuditLogsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getSortDir, ListPlaybookAuditLogsRequest::setSortDir));
        builder.<AuditLogInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AuditLogInfo.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getBody, ListPlaybookAuditLogsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookAuditLogsResponse::getXRequestId,
                ListPlaybookAuditLogsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> listPlaybookInstances =
        genForListPlaybookInstances();

    private static HttpRequestDef<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> genForListPlaybookInstances() {
        // basic
        HttpRequestDef.Builder<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPlaybookInstancesRequest.class, ListPlaybookInstancesResponse.class)
            .withName("ListPlaybookInstances")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getWorkspaceId,
                ListPlaybookInstancesRequest::setWorkspaceId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getStatus, ListPlaybookInstancesRequest::setStatus));
        builder.<String>withRequestField("date_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDateType,
                ListPlaybookInstancesRequest::setDateType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getName, ListPlaybookInstancesRequest::setName));
        builder.<String>withRequestField("playbook_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getPlaybookName,
                ListPlaybookInstancesRequest::setPlaybookName));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDataclassName,
                ListPlaybookInstancesRequest::setDataclassName));
        builder.<String>withRequestField("dataobject_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDataobjectName,
                ListPlaybookInstancesRequest::setDataobjectName));
        builder.<String>withRequestField("trigger_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getTriggerType,
                ListPlaybookInstancesRequest::setTriggerType));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getFromDate,
                ListPlaybookInstancesRequest::setFromDate));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getToDate, ListPlaybookInstancesRequest::setToDate));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getLimit, ListPlaybookInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getOffset, ListPlaybookInstancesRequest::setOffset));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookInstancesResponse::getXRequestId,
                ListPlaybookInstancesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstance =
        genForShowPlaybookInstance();

    private static HttpRequestDef<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> genForShowPlaybookInstance() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookInstanceRequest.class, ShowPlaybookInstanceResponse.class)
            .withName("ShowPlaybookInstance")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookInstanceRequest::getWorkspaceId,
                ShowPlaybookInstanceRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookInstanceRequest::getInstanceId,
                ShowPlaybookInstanceRequest::setInstanceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookInstanceResponse::getXRequestId,
                ShowPlaybookInstanceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> showPlaybookTopology =
        genForShowPlaybookTopology();

    private static HttpRequestDef<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> genForShowPlaybookTopology() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPlaybookTopologyRequest.class, ShowPlaybookTopologyResponse.class)
            .withName("ShowPlaybookTopology")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/instances/{instance_id}/topology")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookTopologyRequest::getWorkspaceId,
                ShowPlaybookTopologyRequest::setWorkspaceId));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookTopologyRequest::getInstanceId,
                ShowPlaybookTopologyRequest::setInstanceId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookTopologyResponse::getXRequestId,
                ShowPlaybookTopologyResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> createPlaybookRule =
        genForCreatePlaybookRule();

    private static HttpRequestDef<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> genForCreatePlaybookRule() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePlaybookRuleRequest.class, CreatePlaybookRuleResponse.class)
                .withName("CreatePlaybookRule")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getWorkspaceId,
                CreatePlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getVersionId, CreatePlaybookRuleRequest::setVersionId));
        builder.<CreateRuleInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRuleInfo.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getBody, CreatePlaybookRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookRuleResponse::getXRequestId,
                CreatePlaybookRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> deletePlaybookRule =
        genForDeletePlaybookRule();

    private static HttpRequestDef<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> genForDeletePlaybookRule() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePlaybookRuleRequest.class, DeletePlaybookRuleResponse.class)
                .withName("DeletePlaybookRule")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getWorkspaceId,
                DeletePlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getVersionId, DeletePlaybookRuleRequest::setVersionId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getRuleId, DeletePlaybookRuleRequest::setRuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookRuleResponse::getXRequestId,
                DeletePlaybookRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> showPlaybookRule =
        genForShowPlaybookRule();

    private static HttpRequestDef<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> genForShowPlaybookRule() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlaybookRuleRequest.class, ShowPlaybookRuleResponse.class)
                .withName("ShowPlaybookRule")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getWorkspaceId, ShowPlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getVersionId, ShowPlaybookRuleRequest::setVersionId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getRuleId, ShowPlaybookRuleRequest::setRuleId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookRuleResponse::getXRequestId, ShowPlaybookRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> updatePlaybookRule =
        genForUpdatePlaybookRule();

    private static HttpRequestDef<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> genForUpdatePlaybookRule() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePlaybookRuleRequest.class, UpdatePlaybookRuleResponse.class)
                .withName("UpdatePlaybookRule")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/rules/{rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getWorkspaceId,
                UpdatePlaybookRuleRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getVersionId, UpdatePlaybookRuleRequest::setVersionId));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getRuleId, UpdatePlaybookRuleRequest::setRuleId));
        builder.<ModifyRuleInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyRuleInfo.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getBody, UpdatePlaybookRuleRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookRuleResponse::getXRequestId,
                UpdatePlaybookRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> copyPlaybookVersion =
        genForCopyPlaybookVersion();

    private static HttpRequestDef<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> genForCopyPlaybookVersion() {
        // basic
        HttpRequestDef.Builder<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CopyPlaybookVersionRequest.class, CopyPlaybookVersionResponse.class)
                .withName("CopyPlaybookVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}/clone")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getWorkspaceId,
                CopyPlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getVersionId, CopyPlaybookVersionRequest::setVersionId));
        builder.<CopyPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CopyPlaybookInfo.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getBody, CopyPlaybookVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyPlaybookVersionResponse::getXRequestId,
                CopyPlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> createPlaybookVersion =
        genForCreatePlaybookVersion();

    private static HttpRequestDef<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> genForCreatePlaybookVersion() {
        // basic
        HttpRequestDef.Builder<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePlaybookVersionRequest.class, CreatePlaybookVersionResponse.class)
            .withName("CreatePlaybookVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getWorkspaceId,
                CreatePlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getPlaybookId,
                CreatePlaybookVersionRequest::setPlaybookId));
        builder.<CreatePlaybookVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePlaybookVersionInfo.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getBody, CreatePlaybookVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookVersionResponse::getXRequestId,
                CreatePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> deletePlaybookVersion =
        genForDeletePlaybookVersion();

    private static HttpRequestDef<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> genForDeletePlaybookVersion() {
        // basic
        HttpRequestDef.Builder<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePlaybookVersionRequest.class, DeletePlaybookVersionResponse.class)
            .withName("DeletePlaybookVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookVersionRequest::getWorkspaceId,
                DeletePlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookVersionRequest::getVersionId,
                DeletePlaybookVersionRequest::setVersionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookVersionResponse::getXRequestId,
                DeletePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> listPlaybookVersions =
        genForListPlaybookVersions();

    private static HttpRequestDef<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> genForListPlaybookVersions() {
        // basic
        HttpRequestDef.Builder<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPlaybookVersionsRequest.class, ListPlaybookVersionsResponse.class)
            .withName("ListPlaybookVersions")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/{playbook_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getWorkspaceId,
                ListPlaybookVersionsRequest::setWorkspaceId));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getPlaybookId,
                ListPlaybookVersionsRequest::setPlaybookId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getStatus, ListPlaybookVersionsRequest::setStatus));
        builder.<Integer>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getEnabled, ListPlaybookVersionsRequest::setEnabled));
        builder.<Integer>withRequestField("version_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getVersionType,
                ListPlaybookVersionsRequest::setVersionType));
        builder.<String>withRequestField("approve_role",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getApproveRole,
                ListPlaybookVersionsRequest::setApproveRole));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getOffset, ListPlaybookVersionsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getLimit, ListPlaybookVersionsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybookVersionsResponse::getXRequestId,
                ListPlaybookVersionsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> showPlaybookVersion =
        genForShowPlaybookVersion();

    private static HttpRequestDef<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> genForShowPlaybookVersion() {
        // basic
        HttpRequestDef.Builder<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPlaybookVersionRequest.class, ShowPlaybookVersionResponse.class)
                .withName("ShowPlaybookVersion")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookVersionRequest::getWorkspaceId,
                ShowPlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookVersionRequest::getVersionId, ShowPlaybookVersionRequest::setVersionId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookVersionResponse::getXRequestId,
                ShowPlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> updatePlaybookVersion =
        genForUpdatePlaybookVersion();

    private static HttpRequestDef<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> genForUpdatePlaybookVersion() {
        // basic
        HttpRequestDef.Builder<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePlaybookVersionRequest.class, UpdatePlaybookVersionResponse.class)
            .withName("UpdatePlaybookVersion")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/playbooks/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getWorkspaceId,
                UpdatePlaybookVersionRequest::setWorkspaceId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getVersionId,
                UpdatePlaybookVersionRequest::setVersionId));
        builder.<ModifyPlaybookVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyPlaybookVersionInfo.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getBody, UpdatePlaybookVersionRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookVersionResponse::getXRequestId,
                UpdatePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> createDataobjectRelation =
        genForCreateDataobjectRelation();

    private static HttpRequestDef<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> genForCreateDataobjectRelation() {
        // basic
        HttpRequestDef.Builder<CreateDataobjectRelationRequest, CreateDataobjectRelationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateDataobjectRelationRequest.class, CreateDataobjectRelationResponse.class)
                .withName("CreateDataobjectRelation")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getWorkspaceId,
                CreateDataobjectRelationRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getDataclassType,
                CreateDataobjectRelationRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getDataObjectId,
                CreateDataobjectRelationRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getRelatedDataclassType,
                CreateDataobjectRelationRequest::setRelatedDataclassType));
        builder.<CreateRelation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRelation.class),
            f -> f.withMarshaller(CreateDataobjectRelationRequest::getBody, CreateDataobjectRelationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDataobjectRelationResponse::getXRequestId,
                CreateDataobjectRelationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> deleteDataobjectRelation =
        genForDeleteDataobjectRelation();

    private static HttpRequestDef<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> genForDeleteDataobjectRelation() {
        // basic
        HttpRequestDef.Builder<DeleteDataobjectRelationRequest, DeleteDataobjectRelationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDataobjectRelationRequest.class,
                    DeleteDataobjectRelationResponse.class)
                .withName("DeleteDataobjectRelation")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getWorkspaceId,
                DeleteDataobjectRelationRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getDataclassType,
                DeleteDataobjectRelationRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getDataObjectId,
                DeleteDataobjectRelationRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getRelatedDataclassType,
                DeleteDataobjectRelationRequest::setRelatedDataclassType));
        builder.<CreateRelation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRelation.class),
            f -> f.withMarshaller(DeleteDataobjectRelationRequest::getBody, DeleteDataobjectRelationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDataobjectRelationResponse::getXRequestId,
                DeleteDataobjectRelationResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataobjectRelationRequest, ListDataobjectRelationResponse> listDataobjectRelation =
        genForListDataobjectRelation();

    private static HttpRequestDef<ListDataobjectRelationRequest, ListDataobjectRelationResponse> genForListDataobjectRelation() {
        // basic
        HttpRequestDef.Builder<ListDataobjectRelationRequest, ListDataobjectRelationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDataobjectRelationRequest.class, ListDataobjectRelationResponse.class)
            .withName("ListDataobjectRelation")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationRequest::getWorkspaceId,
                ListDataobjectRelationRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationRequest::getDataclassType,
                ListDataobjectRelationRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationRequest::getDataObjectId,
                ListDataobjectRelationRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationRequest::getRelatedDataclassType,
                ListDataobjectRelationRequest::setRelatedDataclassType));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListDataobjectRelationRequest::getBody, ListDataobjectRelationRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataobjectRelationResponse::getXRequestId,
                ListDataobjectRelationResponse::setXRequestId));
        return builder.build();
    }

}

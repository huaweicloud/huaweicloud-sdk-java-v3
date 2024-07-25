package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.secmaster.v2.model.ApprovePlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.AuditLogInfo;
import com.huaweicloud.sdk.secmaster.v2.model.BaselineSearchRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.BatchSearchMetricHitsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.BatchSearchMetricHitsRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.BatchSearchMetricHitsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeIncidentRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.ChangeIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ChangePlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ChangePlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CopyPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.CopyPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CopyPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAction;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleSimulationRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleSimulationRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateAlertRuleSimulationResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateBatchOrderAlertsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateBatchOrderAlertsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataobjectRelationsRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataspaceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataspaceRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateDataspaceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePipeResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookApproveRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookApproveResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookVersionInfo;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePostPaidOrderRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreatePostPaidOrderResponse;
import com.huaweicloud.sdk.secmaster.v2.model.CreateRuleInfo;
import com.huaweicloud.sdk.secmaster.v2.model.CreateWorkspaceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.CreateWorkspaceRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.CreateWorkspaceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DataobjectSearch;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIncidentRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIndicatorRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.DeleteIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DeletePlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.DisableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.EnableAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.IndicatorCreateRequest;
import com.huaweicloud.sdk.secmaster.v2.model.IndicatorListSearchRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleMetricsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRuleTemplatesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertRulesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListAlertsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassFieldsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassFieldsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataclassResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataobjectRelationsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListDataobjectRelationsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListIncidentsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListIncidentsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListIndicatorsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListIndicatorsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookActionsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookActionsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookApprovesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookApprovesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookAuditLogsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookAuditLogsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookInstancesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookInstancesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookVersionsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybookVersionsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybooksRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListPlaybooksResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListWorkflowsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListWorkflowsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ListWorkspacesRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ListWorkspacesResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyActionInfo;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyPlaybookVersionInfo;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyRuleInfo;
import com.huaweicloud.sdk.secmaster.v2.model.OperationPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.OrderAlert;
import com.huaweicloud.sdk.secmaster.v2.model.PostPaidParam;
import com.huaweicloud.sdk.secmaster.v2.model.SearchBaselineRequest;
import com.huaweicloud.sdk.secmaster.v2.model.SearchBaselineResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowAlertRuleTemplateResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIncidentRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIncidentResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIndicatorDetailRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowIndicatorDetailResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowMetricResultResponseBody;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookInstanceRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookInstanceResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookMonitorsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookMonitorsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookStatisticsRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookStatisticsResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookTopologyRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookTopologyResponse;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.ShowPlaybookVersionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateAlertRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateIndicatorRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateIndicatorRequestBody;
import com.huaweicloud.sdk.secmaster.v2.model.UpdateIndicatorResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookActionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookActionResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookRuleRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookRuleResponse;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookVersionRequest;
import com.huaweicloud.sdk.secmaster.v2.model.UpdatePlaybookVersionResponse;

import java.math.BigDecimal;
import java.util.List;

@SuppressWarnings("unchecked")
public class SecMasterMeta {

    public static final HttpRequestDef<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> batchSearchMetricHits =
        genForBatchSearchMetricHits();

    private static HttpRequestDef<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> genForBatchSearchMetricHits() {
        // basic
        HttpRequestDef.Builder<BatchSearchMetricHitsRequest, BatchSearchMetricHitsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchSearchMetricHitsRequest.class, BatchSearchMetricHitsResponse.class)
            .withName("BatchSearchMetricHits")
            .withUri("/v1/{project_id}/workspaces/{workspace_id}/sa/metrics/hits")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getWorkspaceId,
                BatchSearchMetricHitsRequest::setWorkspaceId));
        builder.<String>withRequestField("timespan",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getTimespan,
                BatchSearchMetricHitsRequest::setTimespan));
        builder.<Boolean>withRequestField("cache",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getCache, BatchSearchMetricHitsRequest::setCache));
        builder.<BatchSearchMetricHitsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSearchMetricHitsRequestBody.class),
            f -> f.withMarshaller(BatchSearchMetricHitsRequest::getBody, BatchSearchMetricHitsRequest::setBody));

        // response
        builder.<List<ShowMetricResultResponseBody>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(BatchSearchMetricHitsResponse::getBody, BatchSearchMetricHitsResponse::setBody)
                .withInnerContainerType(ShowMetricResultResponseBody.class));

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
            FieldExistence.NON_NULL_NON_EMPTY,
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
            FieldExistence.NON_NULL_NON_EMPTY,
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

    public static final HttpRequestDef<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse> createDataobjectRelations =
        genForCreateDataobjectRelations();

    private static HttpRequestDef<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse> genForCreateDataobjectRelations() {
        // basic
        HttpRequestDef.Builder<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateDataobjectRelationsRequest.class,
                    CreateDataobjectRelationsResponse.class)
                .withName("CreateDataobjectRelations")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getWorkspaceId,
                CreateDataobjectRelationsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getDataclassType,
                CreateDataobjectRelationsRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getDataObjectId,
                CreateDataobjectRelationsRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getRelatedDataclassType,
                CreateDataobjectRelationsRequest::setRelatedDataclassType));
        builder.<CreateDataobjectRelationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataobjectRelationsRequestBody.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getBody,
                CreateDataobjectRelationsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDataobjectRelationsResponse::getXRequestId,
                CreateDataobjectRelationsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateDataspaceRequest, CreateDataspaceResponse> createDataspace =
        genForCreateDataspace();

    private static HttpRequestDef<CreateDataspaceRequest, CreateDataspaceResponse> genForCreateDataspace() {
        // basic
        HttpRequestDef.Builder<CreateDataspaceRequest, CreateDataspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDataspaceRequest.class, CreateDataspaceResponse.class)
                .withName("CreateDataspace")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/dataspaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataspaceRequest::getWorkspaceId, CreateDataspaceRequest::setWorkspaceId));
        builder.<CreateDataspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataspaceRequestBody.class),
            f -> f.withMarshaller(CreateDataspaceRequest::getBody, CreateDataspaceRequest::setBody));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDataspaceResponse::getBody, CreateDataspaceResponse::setBody));

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

    public static final HttpRequestDef<CreatePipeRequest, CreatePipeResponse> createPipe = genForCreatePipe();

    private static HttpRequestDef<CreatePipeRequest, CreatePipeResponse> genForCreatePipe() {
        // basic
        HttpRequestDef.Builder<CreatePipeRequest, CreatePipeResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePipeRequest.class, CreatePipeResponse.class)
                .withName("CreatePipe")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/siem/pipes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePipeRequest::getWorkspaceId, CreatePipeRequest::setWorkspaceId));
        builder.<CreatePipeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePipeRequestBody.class),
            f -> f.withMarshaller(CreatePipeRequest::getBody, CreatePipeRequest::setBody));

        // response

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
            FieldExistence.NON_NULL_NON_EMPTY,
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
        builder.<List<CreateAction>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getBody, CreatePlaybookActionRequest::setBody)
                .withInnerContainerType(CreateAction.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookActionResponse::getXRequestId,
                CreatePlaybookActionResponse::setXRequestId));
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
            FieldExistence.NON_NULL_NON_EMPTY,
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

    public static final HttpRequestDef<CreatePostPaidOrderRequest, CreatePostPaidOrderResponse> createPostPaidOrder =
        genForCreatePostPaidOrder();

    private static HttpRequestDef<CreatePostPaidOrderRequest, CreatePostPaidOrderResponse> genForCreatePostPaidOrder() {
        // basic
        HttpRequestDef.Builder<CreatePostPaidOrderRequest, CreatePostPaidOrderResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePostPaidOrderRequest.class, CreatePostPaidOrderResponse.class)
                .withName("CreatePostPaidOrder")
                .withUri("/v1/{project_id}/subscriptions/orders")
                .withContentType("application/json");

        // requests
        builder.<CreatePostPaidOrderRequest.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePostPaidOrderRequest.XLanguageEnum.class),
            f -> f.withMarshaller(CreatePostPaidOrderRequest::getXLanguage, CreatePostPaidOrderRequest::setXLanguage));
        builder.<PostPaidParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PostPaidParam.class),
            f -> f.withMarshaller(CreatePostPaidOrderRequest::getBody, CreatePostPaidOrderRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> createWorkspace =
        genForCreateWorkspace();

    private static HttpRequestDef<CreateWorkspaceRequest, CreateWorkspaceResponse> genForCreateWorkspace() {
        // basic
        HttpRequestDef.Builder<CreateWorkspaceRequest, CreateWorkspaceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWorkspaceRequest.class, CreateWorkspaceResponse.class)
                .withName("CreateWorkspace")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<CreateWorkspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWorkspaceRequestBody.class),
            f -> f.withMarshaller(CreateWorkspaceRequest::getBody, CreateWorkspaceRequest::setBody));

        // response

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
        builder.<DeleteAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAlertRequestBody.class),
            f -> f.withMarshaller(DeleteAlertRequest::getBody, DeleteAlertRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertResponse::getXRequestId, DeleteAlertResponse::setXRequestId));
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

    public static final HttpRequestDef<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> deleteDataobjectRelations =
        genForDeleteDataobjectRelations();

    private static HttpRequestDef<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> genForDeleteDataobjectRelations() {
        // basic
        HttpRequestDef.Builder<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteDataobjectRelationsRequest.class,
                    DeleteDataobjectRelationsResponse.class)
                .withName("DeleteDataobjectRelations")
                .withUri(
                    "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getWorkspaceId,
                DeleteDataobjectRelationsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getDataclassType,
                DeleteDataobjectRelationsRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getDataObjectId,
                DeleteDataobjectRelationsRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getRelatedDataclassType,
                DeleteDataobjectRelationsRequest::setRelatedDataclassType));
        builder.<CreateDataobjectRelationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataobjectRelationsRequestBody.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getBody,
                DeleteDataobjectRelationsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteDataobjectRelationsResponse::getXRequestId,
                DeleteDataobjectRelationsResponse::setXRequestId));
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
        builder.<DeleteIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIncidentRequestBody.class),
            f -> f.withMarshaller(DeleteIncidentRequest::getBody, DeleteIncidentRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIncidentResponse::getXRequestId, DeleteIncidentResponse::setXRequestId));
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

    public static final HttpRequestDef<ListDataclassRequest, ListDataclassResponse> listDataclass =
        genForListDataclass();

    private static HttpRequestDef<ListDataclassRequest, ListDataclassResponse> genForListDataclass() {
        // basic
        HttpRequestDef.Builder<ListDataclassRequest, ListDataclassResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataclassRequest.class, ListDataclassResponse.class)
                .withName("ListDataclass")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getWorkspaceId, ListDataclassRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassRequest::getOffset, ListDataclassRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassRequest::getLimit, ListDataclassRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getName, ListDataclassRequest::setName));
        builder.<String>withRequestField("business_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getBusinessCode, ListDataclassRequest::setBusinessCode));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getDescription, ListDataclassRequest::setDescription));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassRequest::getIsBuiltIn, ListDataclassRequest::setIsBuiltIn));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataclassResponse::getXRequestId, ListDataclassResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataclassFieldsRequest, ListDataclassFieldsResponse> listDataclassFields =
        genForListDataclassFields();

    private static HttpRequestDef<ListDataclassFieldsRequest, ListDataclassFieldsResponse> genForListDataclassFields() {
        // basic
        HttpRequestDef.Builder<ListDataclassFieldsRequest, ListDataclassFieldsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDataclassFieldsRequest.class, ListDataclassFieldsResponse.class)
                .withName("ListDataclassFields")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/dataclasses/{dataclass_id}/fields")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getWorkspaceId,
                ListDataclassFieldsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getDataclassId,
                ListDataclassFieldsRequest::setDataclassId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getOffset, ListDataclassFieldsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getLimit, ListDataclassFieldsRequest::setLimit));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getName, ListDataclassFieldsRequest::setName));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getIsBuiltIn, ListDataclassFieldsRequest::setIsBuiltIn));
        builder.<String>withRequestField("field_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getFieldCategory,
                ListDataclassFieldsRequest::setFieldCategory));
        builder.<Boolean>withRequestField("mapping",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getMapping, ListDataclassFieldsRequest::setMapping));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataclassFieldsResponse::getXRequestId,
                ListDataclassFieldsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> listDataobjectRelations =
        genForListDataobjectRelations();

    private static HttpRequestDef<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> genForListDataobjectRelations() {
        // basic
        HttpRequestDef.Builder<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListDataobjectRelationsRequest.class, ListDataobjectRelationsResponse.class)
            .withName("ListDataobjectRelations")
            .withUri(
                "/v1/{project_id}/workspaces/{workspace_id}/soc/{dataclass_type}/{data_object_id}/{related_dataclass_type}/search")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getWorkspaceId,
                ListDataobjectRelationsRequest::setWorkspaceId));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getDataclassType,
                ListDataobjectRelationsRequest::setDataclassType));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getDataObjectId,
                ListDataobjectRelationsRequest::setDataObjectId));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getRelatedDataclassType,
                ListDataobjectRelationsRequest::setRelatedDataclassType));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getBody, ListDataobjectRelationsRequest::setBody));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataobjectRelationsResponse::getXRequestId,
                ListDataobjectRelationsResponse::setXRequestId));
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
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getLimit, ListPlaybookActionsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
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
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getLimit, ListPlaybookInstancesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
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
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getEnabled, ListPlaybooksRequest::setEnabled));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getOffset, ListPlaybooksRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
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

    public static final HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflows =
        genForListWorkflows();

    private static HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> genForListWorkflows() {
        // basic
        HttpRequestDef.Builder<ListWorkflowsRequest, ListWorkflowsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkflowsRequest.class, ListWorkflowsResponse.class)
                .withName("ListWorkflows")
                .withUri("/v1/{project_id}/workspaces/{workspace_id}/soc/workflows")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getWorkspaceId, ListWorkflowsRequest::setWorkspaceId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOffset, ListWorkflowsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLimit, ListWorkflowsRequest::setLimit));
        builder.<ListWorkflowsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOrder, ListWorkflowsRequest::setOrder));
        builder.<ListWorkflowsRequest.SortbyEnum>withRequestField("sortby",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.SortbyEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getSortby, ListWorkflowsRequest::setSortby));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getEnabled, ListWorkflowsRequest::setEnabled));
        builder.<Boolean>withRequestField("last_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLastVersion, ListWorkflowsRequest::setLastVersion));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getName, ListWorkflowsRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDescription, ListWorkflowsRequest::setDescription));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDataclassId, ListWorkflowsRequest::setDataclassId));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDataclassName, ListWorkflowsRequest::setDataclassName));
        builder.<String>withRequestField("aop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getAopType, ListWorkflowsRequest::setAopType));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getXRequestId, ListWorkflowsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> listWorkspaces =
        genForListWorkspaces();

    private static HttpRequestDef<ListWorkspacesRequest, ListWorkspacesResponse> genForListWorkspaces() {
        // basic
        HttpRequestDef.Builder<ListWorkspacesRequest, ListWorkspacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWorkspacesRequest.class, ListWorkspacesResponse.class)
                .withName("ListWorkspaces")
                .withUri("/v1/{project_id}/workspaces")
                .withContentType("application/json");

        // requests
        builder.<BigDecimal>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getOffset, ListWorkspacesRequest::setOffset));
        builder.<BigDecimal>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getLimit, ListWorkspacesRequest::setLimit));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getRegionId, ListWorkspacesRequest::setRegionId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getName, ListWorkspacesRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getDescription, ListWorkspacesRequest::setDescription));
        builder.<String>withRequestField("view_bind_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getViewBindId, ListWorkspacesRequest::setViewBindId));
        builder.<String>withRequestField("view_bind_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getViewBindName, ListWorkspacesRequest::setViewBindName));
        builder.<String>withRequestField("create_time_start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getCreateTimeStart,
                ListWorkspacesRequest::setCreateTimeStart));
        builder.<String>withRequestField("create_time_end",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getCreateTimeEnd, ListWorkspacesRequest::setCreateTimeEnd));
        builder.<Boolean>withRequestField("is_view",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getIsView, ListWorkspacesRequest::setIsView));
        builder.<String>withRequestField("ids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getIds, ListWorkspacesRequest::setIds));
        builder.<String>withRequestField("normal_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getNormalProjectId,
                ListWorkspacesRequest::setNormalProjectId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkspacesRequest::getEnterpriseProjectId,
                ListWorkspacesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SearchBaselineRequest, SearchBaselineResponse> searchBaseline =
        genForSearchBaseline();

    private static HttpRequestDef<SearchBaselineRequest, SearchBaselineResponse> genForSearchBaseline() {
        // basic
        HttpRequestDef.Builder<SearchBaselineRequest, SearchBaselineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SearchBaselineRequest.class, SearchBaselineResponse.class)
                .withName("SearchBaseline")
                .withUri("/v2/{project_id}/workspaces/{workspace_id}/sa/baseline/search")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("workspace_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBaselineRequest::getWorkspaceId, SearchBaselineRequest::setWorkspaceId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SearchBaselineRequest::getXLanguage, SearchBaselineRequest::setXLanguage));
        builder.<BaselineSearchRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BaselineSearchRequestBody.class),
            f -> f.withMarshaller(SearchBaselineRequest::getBody, SearchBaselineRequest::setBody));

        // response

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
        builder.<ShowPlaybookMonitorsRequest.VersionQueryTypeEnum>withRequestField("version_query_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowPlaybookMonitorsRequest.VersionQueryTypeEnum.class),
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
            FieldExistence.NON_NULL_NON_EMPTY,
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
            FieldExistence.NON_NULL_NON_EMPTY,
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

}

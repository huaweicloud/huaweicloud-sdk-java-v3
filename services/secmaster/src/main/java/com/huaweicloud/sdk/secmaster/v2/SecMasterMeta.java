package com.huaweicloud.sdk.secmaster.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.secmaster.v2.model.ApprovePlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.AuditLogInfo;
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
import com.huaweicloud.sdk.secmaster.v2.model.CreateRuleInfo;
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
import com.huaweicloud.sdk.secmaster.v2.model.ModifyActionInfo;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyPlaybookVersionInfo;
import com.huaweicloud.sdk.secmaster.v2.model.ModifyRuleInfo;
import com.huaweicloud.sdk.secmaster.v2.model.OperationPlaybookInfo;
import com.huaweicloud.sdk.secmaster.v2.model.OrderAlert;
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

    public static final HttpRequestDef<ChangeAlertRequest, ChangeAlertResponse> changeAlert = genForchangeAlert();

    private static HttpRequestDef<ChangeAlertRequest, ChangeAlertResponse> genForchangeAlert() {
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
            f -> f.withMarshaller(ChangeAlertRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeAlertRequest::getAlertId, (req, v) -> {
                req.setAlertId(v);
            }));
        builder.<ChangeAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeAlertRequestBody.class),
            f -> f.withMarshaller(ChangeAlertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeAlertResponse::getXRequestId, ChangeAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangeIncidentRequest, ChangeIncidentResponse> changeIncident =
        genForchangeIncident();

    private static HttpRequestDef<ChangeIncidentRequest, ChangeIncidentResponse> genForchangeIncident() {
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
            f -> f.withMarshaller(ChangeIncidentRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));
        builder.<ChangeIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangeIncidentRequestBody.class),
            f -> f.withMarshaller(ChangeIncidentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ChangeIncidentResponse::getXRequestId, ChangeIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> changePlaybookInstance =
        genForchangePlaybookInstance();

    private static HttpRequestDef<ChangePlaybookInstanceRequest, ChangePlaybookInstanceResponse> genForchangePlaybookInstance() {
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
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<OperationPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OperationPlaybookInfo.class),
            f -> f.withMarshaller(ChangePlaybookInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcopyPlaybookVersion();

    private static HttpRequestDef<CopyPlaybookVersionRequest, CopyPlaybookVersionResponse> genForcopyPlaybookVersion() {
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
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<CopyPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CopyPlaybookInfo.class),
            f -> f.withMarshaller(CopyPlaybookVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CopyPlaybookVersionResponse::getXRequestId,
                CopyPlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRequest, CreateAlertResponse> createAlert = genForcreateAlert();

    private static HttpRequestDef<CreateAlertRequest, CreateAlertResponse> genForcreateAlert() {
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
            f -> f.withMarshaller(CreateAlertRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRequestBody.class),
            f -> f.withMarshaller(CreateAlertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertResponse::getXRequestId, CreateAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> createAlertRule =
        genForcreateAlertRule();

    private static HttpRequestDef<CreateAlertRuleRequest, CreateAlertRuleResponse> genForcreateAlertRule() {
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
            f -> f.withMarshaller(CreateAlertRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateAlertRuleResponse::getXRequestId, CreateAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> createAlertRuleSimulation =
        genForcreateAlertRuleSimulation();

    private static HttpRequestDef<CreateAlertRuleSimulationRequest, CreateAlertRuleSimulationResponse> genForcreateAlertRuleSimulation() {
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
            f -> f.withMarshaller(CreateAlertRuleSimulationRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateAlertRuleSimulationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlertRuleSimulationRequestBody.class),
            f -> f.withMarshaller(CreateAlertRuleSimulationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreateBatchOrderAlerts();

    private static HttpRequestDef<CreateBatchOrderAlertsRequest, CreateBatchOrderAlertsResponse> genForcreateBatchOrderAlerts() {
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
            f -> f.withMarshaller(CreateBatchOrderAlertsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<OrderAlert>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OrderAlert.class),
            f -> f.withMarshaller(CreateBatchOrderAlertsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreateDataobjectRelations();

    private static HttpRequestDef<CreateDataobjectRelationsRequest, CreateDataobjectRelationsResponse> genForcreateDataobjectRelations() {
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
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getDataclassType, (req, v) -> {
                req.setDataclassType(v);
            }));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getDataObjectId, (req, v) -> {
                req.setDataObjectId(v);
            }));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getRelatedDataclassType, (req, v) -> {
                req.setRelatedDataclassType(v);
            }));
        builder.<CreateDataobjectRelationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataobjectRelationsRequestBody.class),
            f -> f.withMarshaller(CreateDataobjectRelationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreateDataspace();

    private static HttpRequestDef<CreateDataspaceRequest, CreateDataspaceResponse> genForcreateDataspace() {
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
            f -> f.withMarshaller(CreateDataspaceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateDataspaceRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDataspaceRequestBody.class),
            f -> f.withMarshaller(CreateDataspaceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateDataspaceResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<CreateIncidentRequest, CreateIncidentResponse> createIncident =
        genForcreateIncident();

    private static HttpRequestDef<CreateIncidentRequest, CreateIncidentResponse> genForcreateIncident() {
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
            f -> f.withMarshaller(CreateIncidentRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreateIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateIncidentRequestBody.class),
            f -> f.withMarshaller(CreateIncidentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIncidentResponse::getXRequestId, CreateIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreateIndicatorRequest, CreateIndicatorResponse> createIndicator =
        genForcreateIndicator();

    private static HttpRequestDef<CreateIndicatorRequest, CreateIndicatorResponse> genForcreateIndicator() {
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
            f -> f.withMarshaller(CreateIndicatorRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<IndicatorCreateRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndicatorCreateRequest.class),
            f -> f.withMarshaller(CreateIndicatorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreateIndicatorResponse::getXRequestId, CreateIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePipeRequest, CreatePipeResponse> createPipe = genForcreatePipe();

    private static HttpRequestDef<CreatePipeRequest, CreatePipeResponse> genForcreatePipe() {
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
            f -> f.withMarshaller(CreatePipeRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreatePipeRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePipeRequestBody.class),
            f -> f.withMarshaller(CreatePipeRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookRequest, CreatePlaybookResponse> createPlaybook =
        genForcreatePlaybook();

    private static HttpRequestDef<CreatePlaybookRequest, CreatePlaybookResponse> genForcreatePlaybook() {
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
            f -> f.withMarshaller(CreatePlaybookRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<CreatePlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlaybookInfo.class),
            f -> f.withMarshaller(CreatePlaybookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookResponse::getXRequestId, CreatePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<CreatePlaybookActionRequest, CreatePlaybookActionResponse> createPlaybookAction =
        genForcreatePlaybookAction();

    private static HttpRequestDef<CreatePlaybookActionRequest, CreatePlaybookActionResponse> genForcreatePlaybookAction() {
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
            f -> f.withMarshaller(CreatePlaybookActionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<List<CreateAction>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreatePlaybookActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(CreateAction.class));

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
        genForcreatePlaybookApprove();

    private static HttpRequestDef<CreatePlaybookApproveRequest, CreatePlaybookApproveResponse> genForcreatePlaybookApprove() {
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
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ApprovePlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApprovePlaybookInfo.class),
            f -> f.withMarshaller(CreatePlaybookApproveRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreatePlaybookRule();

    private static HttpRequestDef<CreatePlaybookRuleRequest, CreatePlaybookRuleResponse> genForcreatePlaybookRule() {
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
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<CreateRuleInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateRuleInfo.class),
            f -> f.withMarshaller(CreatePlaybookRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForcreatePlaybookVersion();

    private static HttpRequestDef<CreatePlaybookVersionRequest, CreatePlaybookVersionResponse> genForcreatePlaybookVersion() {
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
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getPlaybookId, (req, v) -> {
                req.setPlaybookId(v);
            }));
        builder.<CreatePlaybookVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePlaybookVersionInfo.class),
            f -> f.withMarshaller(CreatePlaybookVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(CreatePlaybookVersionResponse::getXRequestId,
                CreatePlaybookVersionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRequest, DeleteAlertResponse> deleteAlert = genFordeleteAlert();

    private static HttpRequestDef<DeleteAlertRequest, DeleteAlertResponse> genFordeleteAlert() {
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
            f -> f.withMarshaller(DeleteAlertRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<DeleteAlertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAlertRequestBody.class),
            f -> f.withMarshaller(DeleteAlertRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertResponse::getXRequestId, DeleteAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> deleteAlertRule =
        genFordeleteAlertRule();

    private static HttpRequestDef<DeleteAlertRuleRequest, DeleteAlertRuleResponse> genFordeleteAlertRule() {
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
            f -> f.withMarshaller(DeleteAlertRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteAlertRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAlertRuleResponse::getXRequestId, DeleteAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> deleteDataobjectRelations =
        genFordeleteDataobjectRelations();

    private static HttpRequestDef<DeleteDataobjectRelationsRequest, DeleteDataobjectRelationsResponse> genFordeleteDataobjectRelations() {
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
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getDataclassType, (req, v) -> {
                req.setDataclassType(v);
            }));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getDataObjectId, (req, v) -> {
                req.setDataObjectId(v);
            }));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getRelatedDataclassType, (req, v) -> {
                req.setRelatedDataclassType(v);
            }));
        builder.<CreateDataobjectRelationsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateDataobjectRelationsRequestBody.class),
            f -> f.withMarshaller(DeleteDataobjectRelationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genFordeleteIncident();

    private static HttpRequestDef<DeleteIncidentRequest, DeleteIncidentResponse> genFordeleteIncident() {
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
            f -> f.withMarshaller(DeleteIncidentRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<DeleteIncidentRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIncidentRequestBody.class),
            f -> f.withMarshaller(DeleteIncidentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIncidentResponse::getXRequestId, DeleteIncidentResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeleteIndicatorRequest, DeleteIndicatorResponse> deleteIndicator =
        genFordeleteIndicator();

    private static HttpRequestDef<DeleteIndicatorRequest, DeleteIndicatorResponse> genFordeleteIndicator() {
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
            f -> f.withMarshaller(DeleteIndicatorRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<DeleteIndicatorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteIndicatorRequestBody.class),
            f -> f.withMarshaller(DeleteIndicatorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteIndicatorResponse::getXRequestId, DeleteIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookRequest, DeletePlaybookResponse> deletePlaybook =
        genFordeletePlaybook();

    private static HttpRequestDef<DeletePlaybookRequest, DeletePlaybookResponse> genFordeletePlaybook() {
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
            f -> f.withMarshaller(DeletePlaybookRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRequest::getPlaybookId, (req, v) -> {
                req.setPlaybookId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePlaybookResponse::getXRequestId, DeletePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<DeletePlaybookActionRequest, DeletePlaybookActionResponse> deletePlaybookAction =
        genFordeletePlaybookAction();

    private static HttpRequestDef<DeletePlaybookActionRequest, DeletePlaybookActionResponse> genFordeletePlaybookAction() {
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
            f -> f.withMarshaller(DeletePlaybookActionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));

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
        genFordeletePlaybookRule();

    private static HttpRequestDef<DeletePlaybookRuleRequest, DeletePlaybookRuleResponse> genFordeletePlaybookRule() {
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
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

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
        genFordeletePlaybookVersion();

    private static HttpRequestDef<DeletePlaybookVersionRequest, DeletePlaybookVersionResponse> genFordeletePlaybookVersion() {
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
            f -> f.withMarshaller(DeletePlaybookVersionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePlaybookVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

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
        genFordisableAlertRule();

    private static HttpRequestDef<DisableAlertRuleRequest, DisableAlertRuleResponse> genFordisableAlertRule() {
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
            f -> f.withMarshaller(DisableAlertRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DisableAlertRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableAlertRuleResponse::getXRequestId, DisableAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> enableAlertRule =
        genForenableAlertRule();

    private static HttpRequestDef<EnableAlertRuleRequest, EnableAlertRuleResponse> genForenableAlertRule() {
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
            f -> f.withMarshaller(EnableAlertRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(EnableAlertRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(String.class));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(EnableAlertRuleResponse::getXRequestId, EnableAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> listAlertRuleMetrics =
        genForlistAlertRuleMetrics();

    private static HttpRequestDef<ListAlertRuleMetricsRequest, ListAlertRuleMetricsResponse> genForlistAlertRuleMetrics() {
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
            f -> f.withMarshaller(ListAlertRuleMetricsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

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
        genForlistAlertRuleTemplates();

    private static HttpRequestDef<ListAlertRuleTemplatesRequest, ListAlertRuleTemplatesResponse> genForlistAlertRuleTemplates() {
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
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListAlertRuleTemplatesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRuleTemplatesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<List<ListAlertRuleTemplatesRequest.SeverityEnum>>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRuleTemplatesRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));

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
        genForlistAlertRules();

    private static HttpRequestDef<ListAlertRulesRequest, ListAlertRulesResponse> genForlistAlertRules() {
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
            f -> f.withMarshaller(ListAlertRulesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListAlertRulesRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlertRulesRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("pipe_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getPipeId, (req, v) -> {
                req.setPipeId(v);
            }));
        builder.<String>withRequestField("rule_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getRuleName, (req, v) -> {
                req.setRuleName(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<List<ListAlertRulesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<ListAlertRulesRequest.SeverityEnum>>withRequestField("severity",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAlertRulesRequest::getSeverity, (req, v) -> {
                req.setSeverity(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertRulesResponse::getXRequestId, ListAlertRulesResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListAlertsRequest, ListAlertsResponse> listAlerts = genForlistAlerts();

    private static HttpRequestDef<ListAlertsRequest, ListAlertsResponse> genForlistAlerts() {
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
            f -> f.withMarshaller(ListAlertsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListAlertsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlertsResponse::getXRequestId, ListAlertsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataclassRequest, ListDataclassResponse> listDataclass =
        genForlistDataclass();

    private static HttpRequestDef<ListDataclassRequest, ListDataclassResponse> genForlistDataclass() {
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
            f -> f.withMarshaller(ListDataclassRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<BigDecimal>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListDataclassRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<BigDecimal>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListDataclassRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("business_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getBusinessCode, (req, v) -> {
                req.setBusinessCode(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassRequest::getIsBuiltIn, (req, v) -> {
                req.setIsBuiltIn(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDataclassResponse::getXRequestId, ListDataclassResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDataclassFieldsRequest, ListDataclassFieldsResponse> listDataclassFields =
        genForlistDataclassFields();

    private static HttpRequestDef<ListDataclassFieldsRequest, ListDataclassFieldsResponse> genForlistDataclassFields() {
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
            f -> f.withMarshaller(ListDataclassFieldsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getDataclassId, (req, v) -> {
                req.setDataclassId(v);
            }));
        builder.<BigDecimal>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<BigDecimal>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Boolean>withRequestField("is_built_in",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getIsBuiltIn, (req, v) -> {
                req.setIsBuiltIn(v);
            }));
        builder.<String>withRequestField("field_category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getFieldCategory, (req, v) -> {
                req.setFieldCategory(v);
            }));
        builder.<Boolean>withRequestField("mapping",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDataclassFieldsRequest::getMapping, (req, v) -> {
                req.setMapping(v);
            }));

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
        genForlistDataobjectRelations();

    private static HttpRequestDef<ListDataobjectRelationsRequest, ListDataobjectRelationsResponse> genForlistDataobjectRelations() {
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
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getDataclassType, (req, v) -> {
                req.setDataclassType(v);
            }));
        builder.<String>withRequestField("data_object_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getDataObjectId, (req, v) -> {
                req.setDataObjectId(v);
            }));
        builder.<String>withRequestField("related_dataclass_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getRelatedDataclassType, (req, v) -> {
                req.setRelatedDataclassType(v);
            }));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListDataobjectRelationsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistIncidents();

    private static HttpRequestDef<ListIncidentsRequest, ListIncidentsResponse> genForlistIncidents() {
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
            f -> f.withMarshaller(ListIncidentsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<DataobjectSearch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DataobjectSearch.class),
            f -> f.withMarshaller(ListIncidentsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIncidentsResponse::getXRequestId, ListIncidentsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListIndicatorsRequest, ListIndicatorsResponse> listIndicators =
        genForlistIndicators();

    private static HttpRequestDef<ListIndicatorsRequest, ListIndicatorsResponse> genForlistIndicators() {
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
            f -> f.withMarshaller(ListIndicatorsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<IndicatorListSearchRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(IndicatorListSearchRequest.class),
            f -> f.withMarshaller(ListIndicatorsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListIndicatorsResponse::getXRequestId, ListIndicatorsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListPlaybookActionsRequest, ListPlaybookActionsResponse> listPlaybookActions =
        genForlistPlaybookActions();

    private static HttpRequestDef<ListPlaybookActionsRequest, ListPlaybookActionsResponse> genForlistPlaybookActions() {
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
            f -> f.withMarshaller(ListPlaybookActionsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookActionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

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
        genForlistPlaybookApproves();

    private static HttpRequestDef<ListPlaybookApprovesRequest, ListPlaybookApprovesResponse> genForlistPlaybookApproves() {
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
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("approve_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookApprovesRequest::getApproveType, (req, v) -> {
                req.setApproveType(v);
            }));

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
        genForlistPlaybookAuditLogs();

    private static HttpRequestDef<ListPlaybookAuditLogsRequest, ListPlaybookAuditLogsResponse> genForlistPlaybookAuditLogs() {
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
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));
        builder.<ListPlaybookAuditLogsRequest.SortDirEnum>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPlaybookAuditLogsRequest.SortDirEnum.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<AuditLogInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AuditLogInfo.class),
            f -> f.withMarshaller(ListPlaybookAuditLogsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForlistPlaybookInstances();

    private static HttpRequestDef<ListPlaybookInstancesRequest, ListPlaybookInstancesResponse> genForlistPlaybookInstances() {
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
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("playbook_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getPlaybookName, (req, v) -> {
                req.setPlaybookName(v);
            }));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDataclassName, (req, v) -> {
                req.setDataclassName(v);
            }));
        builder.<String>withRequestField("dataobject_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getDataobjectName, (req, v) -> {
                req.setDataobjectName(v);
            }));
        builder.<String>withRequestField("trigger_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getTriggerType, (req, v) -> {
                req.setTriggerType(v);
            }));
        builder.<String>withRequestField("from_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getFromDate, (req, v) -> {
                req.setFromDate(v);
            }));
        builder.<String>withRequestField("to_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getToDate, (req, v) -> {
                req.setToDate(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

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
        genForlistPlaybookVersions();

    private static HttpRequestDef<ListPlaybookVersionsRequest, ListPlaybookVersionsResponse> genForlistPlaybookVersions() {
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
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getPlaybookId, (req, v) -> {
                req.setPlaybookId(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<Integer>withRequestField("version_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getVersionType, (req, v) -> {
                req.setVersionType(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybookVersionsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

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
        genForlistPlaybooks();

    private static HttpRequestDef<ListPlaybooksRequest, ListPlaybooksResponse> genForlistPlaybooks() {
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
            f -> f.withMarshaller(ListPlaybooksRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("search_txt",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getSearchTxt, (req, v) -> {
                req.setSearchTxt(v);
            }));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getDataclassName, (req, v) -> {
                req.setDataclassName(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPlaybooksRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPlaybooksResponse::getXRequestId, ListPlaybooksResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> listWorkflows =
        genForlistWorkflows();

    private static HttpRequestDef<ListWorkflowsRequest, ListWorkflowsResponse> genForlistWorkflows() {
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
            f -> f.withMarshaller(ListWorkflowsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<BigDecimal>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<BigDecimal>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BigDecimal.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<ListWorkflowsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));
        builder.<ListWorkflowsRequest.SortbyEnum>withRequestField("sortby",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListWorkflowsRequest.SortbyEnum.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getSortby, (req, v) -> {
                req.setSortby(v);
            }));
        builder.<Boolean>withRequestField("enabled",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getEnabled, (req, v) -> {
                req.setEnabled(v);
            }));
        builder.<Boolean>withRequestField("last_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getLastVersion, (req, v) -> {
                req.setLastVersion(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("dataclass_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDataclassId, (req, v) -> {
                req.setDataclassId(v);
            }));
        builder.<String>withRequestField("dataclass_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getDataclassName, (req, v) -> {
                req.setDataclassName(v);
            }));
        builder.<String>withRequestField("aop_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWorkflowsRequest::getAopType, (req, v) -> {
                req.setAopType(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWorkflowsResponse::getXRequestId, ListWorkflowsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRequest, ShowAlertResponse> showAlert = genForshowAlert();

    private static HttpRequestDef<ShowAlertRequest, ShowAlertResponse> genForshowAlert() {
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
            f -> f.withMarshaller(ShowAlertRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("alert_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRequest::getAlertId, (req, v) -> {
                req.setAlertId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertResponse::getXRequestId, ShowAlertResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> showAlertRule =
        genForshowAlertRule();

    private static HttpRequestDef<ShowAlertRuleRequest, ShowAlertRuleResponse> genForshowAlertRule() {
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
            f -> f.withMarshaller(ShowAlertRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertRuleResponse::getXRequestId, ShowAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> showAlertRuleTemplate =
        genForshowAlertRuleTemplate();

    private static HttpRequestDef<ShowAlertRuleTemplateRequest, ShowAlertRuleTemplateResponse> genForshowAlertRuleTemplate() {
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
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlertRuleTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowAlertRuleTemplateResponse::getXRequestId,
                ShowAlertRuleTemplateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowIncidentRequest, ShowIncidentResponse> showIncident = genForshowIncident();

    private static HttpRequestDef<ShowIncidentRequest, ShowIncidentResponse> genForshowIncident() {
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
            f -> f.withMarshaller(ShowIncidentRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("incident_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIncidentRequest::getIncidentId, (req, v) -> {
                req.setIncidentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> showIndicatorDetail =
        genForshowIndicatorDetail();

    private static HttpRequestDef<ShowIndicatorDetailRequest, ShowIndicatorDetailResponse> genForshowIndicatorDetail() {
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
            f -> f.withMarshaller(ShowIndicatorDetailRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("indicator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIndicatorDetailRequest::getIndicatorId, (req, v) -> {
                req.setIndicatorId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowIndicatorDetailResponse::getXRequestId,
                ShowIndicatorDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookRequest, ShowPlaybookResponse> showPlaybook = genForshowPlaybook();

    private static HttpRequestDef<ShowPlaybookRequest, ShowPlaybookResponse> genForshowPlaybook() {
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
            f -> f.withMarshaller(ShowPlaybookRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRequest::getPlaybookId, (req, v) -> {
                req.setPlaybookId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookResponse::getXRequestId, ShowPlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> showPlaybookInstance =
        genForshowPlaybookInstance();

    private static HttpRequestDef<ShowPlaybookInstanceRequest, ShowPlaybookInstanceResponse> genForshowPlaybookInstance() {
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
            f -> f.withMarshaller(ShowPlaybookInstanceRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

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
        genForshowPlaybookMonitors();

    private static HttpRequestDef<ShowPlaybookMonitorsRequest, ShowPlaybookMonitorsResponse> genForshowPlaybookMonitors() {
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
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getPlaybookId, (req, v) -> {
                req.setPlaybookId(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<ShowPlaybookMonitorsRequest.VersionQueryTypeEnum>withRequestField("version_query_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowPlaybookMonitorsRequest.VersionQueryTypeEnum.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getVersionQueryType, (req, v) -> {
                req.setVersionQueryType(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookMonitorsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

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
        genForshowPlaybookRule();

    private static HttpRequestDef<ShowPlaybookRuleRequest, ShowPlaybookRuleResponse> genForshowPlaybookRule() {
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
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowPlaybookRuleResponse::getXRequestId, ShowPlaybookRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> showPlaybookStatistics =
        genForshowPlaybookStatistics();

    private static HttpRequestDef<ShowPlaybookStatisticsRequest, ShowPlaybookStatisticsResponse> genForshowPlaybookStatistics() {
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
            f -> f.withMarshaller(ShowPlaybookStatisticsRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));

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
        genForshowPlaybookTopology();

    private static HttpRequestDef<ShowPlaybookTopologyRequest, ShowPlaybookTopologyResponse> genForshowPlaybookTopology() {
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
            f -> f.withMarshaller(ShowPlaybookTopologyRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookTopologyRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

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
        genForshowPlaybookVersion();

    private static HttpRequestDef<ShowPlaybookVersionRequest, ShowPlaybookVersionResponse> genForshowPlaybookVersion() {
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
            f -> f.withMarshaller(ShowPlaybookVersionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPlaybookVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

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
        genForupdateAlertRule();

    private static HttpRequestDef<UpdateAlertRuleRequest, UpdateAlertRuleResponse> genForupdateAlertRule() {
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
            f -> f.withMarshaller(UpdateAlertRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<UpdateAlertRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlertRuleRequestBody.class),
            f -> f.withMarshaller(UpdateAlertRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateAlertRuleResponse::getXRequestId, UpdateAlertRuleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdateIndicatorRequest, UpdateIndicatorResponse> updateIndicator =
        genForupdateIndicator();

    private static HttpRequestDef<UpdateIndicatorRequest, UpdateIndicatorResponse> genForupdateIndicator() {
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
            f -> f.withMarshaller(UpdateIndicatorRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("indicator_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getIndicatorId, (req, v) -> {
                req.setIndicatorId(v);
            }));
        builder.<UpdateIndicatorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateIndicatorRequestBody.class),
            f -> f.withMarshaller(UpdateIndicatorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdateIndicatorResponse::getXRequestId, UpdateIndicatorResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookRequest, UpdatePlaybookResponse> updatePlaybook =
        genForupdatePlaybook();

    private static HttpRequestDef<UpdatePlaybookRequest, UpdatePlaybookResponse> genForupdatePlaybook() {
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
            f -> f.withMarshaller(UpdatePlaybookRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("playbook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getPlaybookId, (req, v) -> {
                req.setPlaybookId(v);
            }));
        builder.<ModifyPlaybookInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyPlaybookInfo.class),
            f -> f.withMarshaller(UpdatePlaybookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UpdatePlaybookResponse::getXRequestId, UpdatePlaybookResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> updatePlaybookAction =
        genForupdatePlaybookAction();

    private static HttpRequestDef<UpdatePlaybookActionRequest, UpdatePlaybookActionResponse> genForupdatePlaybookAction() {
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
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("action_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getActionId, (req, v) -> {
                req.setActionId(v);
            }));
        builder.<ModifyActionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyActionInfo.class),
            f -> f.withMarshaller(UpdatePlaybookActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdatePlaybookRule();

    private static HttpRequestDef<UpdatePlaybookRuleRequest, UpdatePlaybookRuleResponse> genForupdatePlaybookRule() {
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
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<String>withRequestField("rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getRuleId, (req, v) -> {
                req.setRuleId(v);
            }));
        builder.<ModifyRuleInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyRuleInfo.class),
            f -> f.withMarshaller(UpdatePlaybookRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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
        genForupdatePlaybookVersion();

    private static HttpRequestDef<UpdatePlaybookVersionRequest, UpdatePlaybookVersionResponse> genForupdatePlaybookVersion() {
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
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getWorkspaceId, (req, v) -> {
                req.setWorkspaceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));
        builder.<ModifyPlaybookVersionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyPlaybookVersionInfo.class),
            f -> f.withMarshaller(UpdatePlaybookVersionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

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

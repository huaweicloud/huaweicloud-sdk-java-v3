package com.huaweicloud.sdk.coc.v1;

import com.huaweicloud.sdk.coc.v1.model.AddScriptModel;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequest;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewRequestBody;
import com.huaweicloud.sdk.coc.v1.model.BatchCreateApplicationViewResponse;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.CountMultiResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateCocIssuesResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateExternalIssuesRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportCustomEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateReportPrometheusEventResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequest;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomRequestBody;
import com.huaweicloud.sdk.coc.v1.model.CreateWarRoomResponse;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.DeleteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.EditScriptModel;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecutePublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.ExecuteScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.GetPublicScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.GetPublicScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobBatchRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobBatchResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobInfoRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobInfoResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobStatisticsRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptJobStatisticsResponse;
import com.huaweicloud.sdk.coc.v1.model.GetScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.GetScriptResponse;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.HandleCocIncidentResponse;
import com.huaweicloud.sdk.coc.v1.model.HandleExternalIncidentRequest;
import com.huaweicloud.sdk.coc.v1.model.JobScriptOrderOperationBody;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationModelRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationModelResponse;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalRequest;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsExternalResponse;
import com.huaweicloud.sdk.coc.v1.model.ListAuthorizableTicketsReq;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListCocTicketOperationHistoriesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantRequest;
import com.huaweicloud.sdk.coc.v1.model.ListInstanceCompliantResponse;
import com.huaweicloud.sdk.coc.v1.model.ListMultiCloudResourcesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListMultiCloudResourcesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListPublicScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.ListResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobBatchesRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobBatchesResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptJobsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListScriptsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListScriptsResponse;
import com.huaweicloud.sdk.coc.v1.model.ListTenantWarRoomRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ListTicketParams;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsRequest;
import com.huaweicloud.sdk.coc.v1.model.ListWarRoomsResponse;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobRequest;
import com.huaweicloud.sdk.coc.v1.model.OperateScriptJobResponse;
import com.huaweicloud.sdk.coc.v1.model.ReportCustomEventRequestBody;
import com.huaweicloud.sdk.coc.v1.model.ScriptExecuteModel;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIncidentDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowCocIssuesDetailResponse;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsRequest;
import com.huaweicloud.sdk.coc.v1.model.ShowInstancePatchItemsResponse;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceReq;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceRequest;
import com.huaweicloud.sdk.coc.v1.model.SyncResourceResponse;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptRequest;
import com.huaweicloud.sdk.coc.v1.model.UpdateScriptResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class CocMeta {

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForListApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForListApplications() {
        // basic
        HttpRequestDef.Builder<ListApplicationsRequest, ListApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsRequest.class, ListApplicationsResponse.class)
                .withName("ListApplications")
                .withUri("/v1/applications")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListApplicationsRequest::getIdList, ListApplicationsRequest::setIdList));
        builder.<String>withRequestField("parent_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getParentId, ListApplicationsRequest::setParentId));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getNameLike, ListApplicationsRequest::setNameLike));
        builder.<String>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getCode, ListApplicationsRequest::setCode));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getMarker, ListApplicationsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, ListApplicationsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationModelRequest, ListApplicationModelResponse> listApplicationModel =
        genForListApplicationModel();

    private static HttpRequestDef<ListApplicationModelRequest, ListApplicationModelResponse> genForListApplicationModel() {
        // basic
        HttpRequestDef.Builder<ListApplicationModelRequest, ListApplicationModelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApplicationModelRequest.class, ListApplicationModelResponse.class)
            .withName("ListApplicationModel")
            .withUri("/v1/application-model/next")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationModelRequest::getApplicationId,
                ListApplicationModelRequest::setApplicationId));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationModelRequest::getComponentId,
                ListApplicationModelRequest::setComponentId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationModelRequest::getLimit, ListApplicationModelRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationModelRequest::getMarker, ListApplicationModelRequest::setMarker));
        builder.<Integer>withRequestField("page_no",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationModelRequest::getPageNo, ListApplicationModelRequest::setPageNo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> batchCreateApplicationView =
        genForBatchCreateApplicationView();

    private static HttpRequestDef<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> genForBatchCreateApplicationView() {
        // basic
        HttpRequestDef.Builder<BatchCreateApplicationViewRequest, BatchCreateApplicationViewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateApplicationViewRequest.class,
                    BatchCreateApplicationViewResponse.class)
                .withName("BatchCreateApplicationView")
                .withUri("/v1/application-view/batch-create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<BatchCreateApplicationViewRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchCreateApplicationViewRequestBody.class),
            f -> f.withMarshaller(BatchCreateApplicationViewRequest::getBody,
                BatchCreateApplicationViewRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceCompliantRequest, ListInstanceCompliantResponse> listInstanceCompliant =
        genForListInstanceCompliant();

    private static HttpRequestDef<ListInstanceCompliantRequest, ListInstanceCompliantResponse> genForListInstanceCompliant() {
        // basic
        HttpRequestDef.Builder<ListInstanceCompliantRequest, ListInstanceCompliantResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceCompliantRequest.class, ListInstanceCompliantResponse.class)
            .withName("ListInstanceCompliant")
            .withUri("/v1/patch/instance/compliant")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getEnterpriseProjectId,
                ListInstanceCompliantRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getName, ListInstanceCompliantRequest::setName));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getInstanceId,
                ListInstanceCompliantRequest::setInstanceId));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getIp, ListInstanceCompliantRequest::setIp));
        builder.<String>withRequestField("eip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getEip, ListInstanceCompliantRequest::setEip));
        builder.<String>withRequestField("operating_system",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getOperatingSystem,
                ListInstanceCompliantRequest::setOperatingSystem));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getRegion, ListInstanceCompliantRequest::setRegion));
        builder.<String>withRequestField("group",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getGroup, ListInstanceCompliantRequest::setGroup));
        builder.<String>withRequestField("compliant_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getCompliantStatus,
                ListInstanceCompliantRequest::setCompliantStatus));
        builder.<String>withRequestField("order_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getOrderId, ListInstanceCompliantRequest::setOrderId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getOffset, ListInstanceCompliantRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getLimit, ListInstanceCompliantRequest::setLimit));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getSortDir, ListInstanceCompliantRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getSortKey, ListInstanceCompliantRequest::setSortKey));
        builder.<String>withRequestField("report_scene",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getReportScene,
                ListInstanceCompliantRequest::setReportScene));
        builder.<String>withRequestField("cce_info_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceCompliantRequest::getCceInfoId,
                ListInstanceCompliantRequest::setCceInfoId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> showInstancePatchItems =
        genForShowInstancePatchItems();

    private static HttpRequestDef<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> genForShowInstancePatchItems() {
        // basic
        HttpRequestDef.Builder<ShowInstancePatchItemsRequest, ShowInstancePatchItemsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstancePatchItemsRequest.class, ShowInstancePatchItemsResponse.class)
            .withName("ShowInstancePatchItems")
            .withUri("/v1/patch/instance/compliant/{instance_compliant_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_compliant_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getInstanceCompliantId,
                ShowInstancePatchItemsRequest::setInstanceCompliantId));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getOffset, ShowInstancePatchItemsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getLimit, ShowInstancePatchItemsRequest::setLimit));
        builder.<String>withRequestField("title",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getTitle, ShowInstancePatchItemsRequest::setTitle));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getSortDir,
                ShowInstancePatchItemsRequest::setSortDir));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getSortKey,
                ShowInstancePatchItemsRequest::setSortKey));
        builder.<String>withRequestField("patch_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getPatchStatus,
                ShowInstancePatchItemsRequest::setPatchStatus));
        builder.<String>withRequestField("classification",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getClassification,
                ShowInstancePatchItemsRequest::setClassification));
        builder.<String>withRequestField("severity_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getSeverityLevel,
                ShowInstancePatchItemsRequest::setSeverityLevel));
        builder.<String>withRequestField("compliance_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstancePatchItemsRequest::getComplianceLevel,
                ShowInstancePatchItemsRequest::setComplianceLevel));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportCustomEventRequest, CreateReportCustomEventResponse> createReportCustomEvent =
        genForCreateReportCustomEvent();

    private static HttpRequestDef<CreateReportCustomEventRequest, CreateReportCustomEventResponse> genForCreateReportCustomEvent() {
        // basic
        HttpRequestDef.Builder<CreateReportCustomEventRequest, CreateReportCustomEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateReportCustomEventRequest.class, CreateReportCustomEventResponse.class)
            .withName("CreateReportCustomEvent")
            .withUri("/event/huawei/custom/{integration_key}")
            .withContentType("application/json; charset=utf-8");

        // requests
        builder.<String>withRequestField("integration_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportCustomEventRequest::getIntegrationKey,
                CreateReportCustomEventRequest::setIntegrationKey));
        builder.<ReportCustomEventRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ReportCustomEventRequestBody.class),
            f -> f.withMarshaller(CreateReportCustomEventRequest::getBody, CreateReportCustomEventRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> createReportPrometheusEvent =
        genForCreateReportPrometheusEvent();

    private static HttpRequestDef<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> genForCreateReportPrometheusEvent() {
        // basic
        HttpRequestDef.Builder<CreateReportPrometheusEventRequest, CreateReportPrometheusEventResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateReportPrometheusEventRequest.class,
                    CreateReportPrometheusEventResponse.class)
                .withName("CreateReportPrometheusEvent")
                .withUri("/v1/event/prometheus/{integration_key}")
                .withContentType("application/json; charset=utf-8");

        // requests
        builder.<String>withRequestField("integration_key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateReportPrometheusEventRequest::getIntegrationKey,
                CreateReportPrometheusEventRequest::setIntegrationKey));
        builder.<Map<String, Object>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f
                .withMarshaller(CreateReportPrometheusEventRequest::getBody,
                    CreateReportPrometheusEventRequest::setBody)
                .withInnerContainerType(Object.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCocIncidentRequest, CreateCocIncidentResponse> createCocIncident =
        genForCreateCocIncident();

    private static HttpRequestDef<CreateCocIncidentRequest, CreateCocIncidentResponse> genForCreateCocIncident() {
        // basic
        HttpRequestDef.Builder<CreateCocIncidentRequest, CreateCocIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCocIncidentRequest.class, CreateCocIncidentResponse.class)
                .withName("CreateCocIncident")
                .withUri("/v1/external/incident/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateExternalIncidentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalIncidentRequest.class),
            f -> f.withMarshaller(CreateCocIncidentRequest::getBody, CreateCocIncidentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<HandleCocIncidentRequest, HandleCocIncidentResponse> handleCocIncident =
        genForHandleCocIncident();

    private static HttpRequestDef<HandleCocIncidentRequest, HandleCocIncidentResponse> genForHandleCocIncident() {
        // basic
        HttpRequestDef.Builder<HandleCocIncidentRequest, HandleCocIncidentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, HandleCocIncidentRequest.class, HandleCocIncidentResponse.class)
                .withName("HandleCocIncident")
                .withUri("/v1/external/incident/handle")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<HandleExternalIncidentRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HandleExternalIncidentRequest.class),
            f -> f.withMarshaller(HandleCocIncidentRequest::getBody, HandleCocIncidentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> listCocTicketOperationHistories =
        genForListCocTicketOperationHistories();

    private static HttpRequestDef<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> genForListCocTicketOperationHistories() {
        // basic
        HttpRequestDef.Builder<ListCocTicketOperationHistoriesRequest, ListCocTicketOperationHistoriesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListCocTicketOperationHistoriesRequest.class,
                    ListCocTicketOperationHistoriesResponse.class)
                .withName("ListCocTicketOperationHistories")
                .withUri("/v1/external/{ticket_type}/list-histories")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListCocTicketOperationHistoriesRequest.TicketTypeEnum>withRequestField("ticket_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListCocTicketOperationHistoriesRequest.TicketTypeEnum.class),
            f -> f.withMarshaller(ListCocTicketOperationHistoriesRequest::getTicketType,
                ListCocTicketOperationHistoriesRequest::setTicketType));
        builder.<ListTicketParams>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTicketParams.class),
            f -> f.withMarshaller(ListCocTicketOperationHistoriesRequest::getBody,
                ListCocTicketOperationHistoriesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> showCocIncidentDetail =
        genForShowCocIncidentDetail();

    private static HttpRequestDef<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> genForShowCocIncidentDetail() {
        // basic
        HttpRequestDef.Builder<ShowCocIncidentDetailRequest, ShowCocIncidentDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowCocIncidentDetailRequest.class, ShowCocIncidentDetailResponse.class)
            .withName("ShowCocIncidentDetail")
            .withUri("/v1/external/incident/{incident_num}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("incident_num",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCocIncidentDetailRequest::getIncidentNum,
                ShowCocIncidentDetailRequest::setIncidentNum));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCocIssuesRequest, CreateCocIssuesResponse> createCocIssues =
        genForCreateCocIssues();

    private static HttpRequestDef<CreateCocIssuesRequest, CreateCocIssuesResponse> genForCreateCocIssues() {
        // basic
        HttpRequestDef.Builder<CreateCocIssuesRequest, CreateCocIssuesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCocIssuesRequest.class, CreateCocIssuesResponse.class)
                .withName("CreateCocIssues")
                .withUri("/v1/external/issues/create")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateExternalIssuesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateExternalIssuesRequest.class),
            f -> f.withMarshaller(CreateCocIssuesRequest::getBody, CreateCocIssuesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> showCocIssuesDetail =
        genForShowCocIssuesDetail();

    private static HttpRequestDef<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> genForShowCocIssuesDetail() {
        // basic
        HttpRequestDef.Builder<ShowCocIssuesDetailRequest, ShowCocIssuesDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCocIssuesDetailRequest.class, ShowCocIssuesDetailResponse.class)
                .withName("ShowCocIssuesDetail")
                .withUri("/v1/external/issues/{ticket_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ticket_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCocIssuesDetailRequest::getTicketId, ShowCocIssuesDetailRequest::setTicketId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> listAuthorizableTicketsExternal =
        genForListAuthorizableTicketsExternal();

    private static HttpRequestDef<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> genForListAuthorizableTicketsExternal() {
        // basic
        HttpRequestDef.Builder<ListAuthorizableTicketsExternalRequest, ListAuthorizableTicketsExternalResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ListAuthorizableTicketsExternalRequest.class,
                    ListAuthorizableTicketsExternalResponse.class)
                .withName("ListAuthorizableTicketsExternal")
                .withUri("/v1/external/list/authorizable-tickets")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListAuthorizableTicketsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAuthorizableTicketsReq.class),
            f -> f.withMarshaller(ListAuthorizableTicketsExternalRequest::getBody,
                ListAuthorizableTicketsExternalRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse> listMultiCloudResources =
        genForListMultiCloudResources();

    private static HttpRequestDef<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse> genForListMultiCloudResources() {
        // basic
        HttpRequestDef.Builder<ListMultiCloudResourcesRequest, ListMultiCloudResourcesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListMultiCloudResourcesRequest.class, ListMultiCloudResourcesResponse.class)
            .withName("ListMultiCloudResources")
            .withUri("/v1/multicloud-resources")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getVendor,
                ListMultiCloudResourcesRequest::setVendor));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getType, ListMultiCloudResourcesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getLimit, ListMultiCloudResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getMarker,
                ListMultiCloudResourcesRequest::setMarker));
        builder.<List<String>>withRequestField("resource_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getResourceIdList,
                ListMultiCloudResourcesRequest::setResourceIdList));
        builder.<List<String>>withRequestField("name_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getNameList,
                ListMultiCloudResourcesRequest::setNameList));
        builder.<List<String>>withRequestField("region_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListMultiCloudResourcesRequest::getRegionIdList,
                ListMultiCloudResourcesRequest::setRegionIdList));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CountMultiResourcesRequest, CountMultiResourcesResponse> countMultiResources =
        genForCountMultiResources();

    private static HttpRequestDef<CountMultiResourcesRequest, CountMultiResourcesResponse> genForCountMultiResources() {
        // basic
        HttpRequestDef.Builder<CountMultiResourcesRequest, CountMultiResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CountMultiResourcesRequest.class, CountMultiResourcesResponse.class)
                .withName("CountMultiResources")
                .withUri("/v1/resources/multi-count")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("vendor",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getVendor, CountMultiResourcesRequest::setVendor));
        builder.<String>withRequestField("view_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getViewId, CountMultiResourcesRequest::setViewId));
        builder.<Boolean>withRequestField("is_resource",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getIsResource,
                CountMultiResourcesRequest::setIsResource));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CountMultiResourcesRequest::getRegionId, CountMultiResourcesRequest::setRegionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceRequest, ListResourceResponse> listResource = genForListResource();

    private static HttpRequestDef<ListResourceRequest, ListResourceResponse> genForListResource() {
        // basic
        HttpRequestDef.Builder<ListResourceRequest, ListResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceRequest.class, ListResourceResponse.class)
                .withName("ListResource")
                .withUri("/v1/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("provider",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getProvider, ListResourceRequest::setProvider));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getType, ListResourceRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceRequest::getLimit, ListResourceRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getMarker, ListResourceRequest::setMarker));
        builder.<List<String>>withRequestField("resource_id_list",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListResourceRequest::getResourceIdList, ListResourceRequest::setResourceIdList));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getName, ListResourceRequest::setName));
        builder.<String>withRequestField("region_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getRegionId, ListResourceRequest::setRegionId));
        builder.<String>withRequestField("az_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getAzId, ListResourceRequest::setAzId));
        builder.<String>withRequestField("ip_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getIpType, ListResourceRequest::setIpType));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getIp, ListResourceRequest::setIp));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getStatus, ListResourceRequest::setStatus));
        builder.<String>withRequestField("agent_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getAgentState, ListResourceRequest::setAgentState));
        builder.<String>withRequestField("image_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getImageName, ListResourceRequest::setImageName));
        builder.<String>withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getOsType, ListResourceRequest::setOsType));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getTag, ListResourceRequest::setTag));
        builder.<String>withRequestField("tag_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getTagKey, ListResourceRequest::setTagKey));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getGroupId, ListResourceRequest::setGroupId));
        builder.<String>withRequestField("component_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getComponentId, ListResourceRequest::setComponentId));
        builder.<String>withRequestField("application_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getApplicationId, ListResourceRequest::setApplicationId));
        builder.<String>withRequestField("cce_cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getCceClusterId, ListResourceRequest::setCceClusterId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getVpcId, ListResourceRequest::setVpcId));
        builder.<String>withRequestField("ep_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getEpId, ListResourceRequest::setEpId));
        builder.<Boolean>withRequestField("is_delegated",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListResourceRequest::getIsDelegated, ListResourceRequest::setIsDelegated));
        builder.<String>withRequestField("project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceRequest::getProjectId, ListResourceRequest::setProjectId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceResponse::getXRequestId, ListResourceResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<SyncResourceRequest, SyncResourceResponse> syncResource = genForSyncResource();

    private static HttpRequestDef<SyncResourceRequest, SyncResourceResponse> genForSyncResource() {
        // basic
        HttpRequestDef.Builder<SyncResourceRequest, SyncResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SyncResourceRequest.class, SyncResourceResponse.class)
                .withName("SyncResource")
                .withUri("/v1/resources/sync")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<SyncResourceReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SyncResourceReq.class),
            f -> f.withMarshaller(SyncResourceRequest::getBody, SyncResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptJobBatchRequest, GetScriptJobBatchResponse> getScriptJobBatch =
        genForGetScriptJobBatch();

    private static HttpRequestDef<GetScriptJobBatchRequest, GetScriptJobBatchResponse> genForGetScriptJobBatch() {
        // basic
        HttpRequestDef.Builder<GetScriptJobBatchRequest, GetScriptJobBatchResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetScriptJobBatchRequest.class, GetScriptJobBatchResponse.class)
                .withName("GetScriptJobBatch")
                .withUri("/v1/job/script/orders/{execute_uuid}/batches/{batch_index}")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("batch_index",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getBatchIndex, GetScriptJobBatchRequest::setBatchIndex));
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getExecuteUuid, GetScriptJobBatchRequest::setExecuteUuid));
        builder.<GetScriptJobBatchRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetScriptJobBatchRequest.StatusEnum.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getStatus, GetScriptJobBatchRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getLimit, GetScriptJobBatchRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getMarker, GetScriptJobBatchRequest::setMarker));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getXLanguage, GetScriptJobBatchRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getXProjectId, GetScriptJobBatchRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobBatchRequest::getXUserProfile,
                GetScriptJobBatchRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptJobInfoRequest, GetScriptJobInfoResponse> getScriptJobInfo =
        genForGetScriptJobInfo();

    private static HttpRequestDef<GetScriptJobInfoRequest, GetScriptJobInfoResponse> genForGetScriptJobInfo() {
        // basic
        HttpRequestDef.Builder<GetScriptJobInfoRequest, GetScriptJobInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetScriptJobInfoRequest.class, GetScriptJobInfoResponse.class)
                .withName("GetScriptJobInfo")
                .withUri("/v1/job/script/orders/{execute_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getExecuteUuid, GetScriptJobInfoRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getXLanguage, GetScriptJobInfoRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getXProjectId, GetScriptJobInfoRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobInfoRequest::getXUserProfile, GetScriptJobInfoRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> getScriptJobStatistics =
        genForGetScriptJobStatistics();

    private static HttpRequestDef<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> genForGetScriptJobStatistics() {
        // basic
        HttpRequestDef.Builder<GetScriptJobStatisticsRequest, GetScriptJobStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetScriptJobStatisticsRequest.class, GetScriptJobStatisticsResponse.class)
            .withName("GetScriptJobStatistics")
            .withUri("/v1/job/script/orders/{execute_uuid}/statistics")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getExecuteUuid,
                GetScriptJobStatisticsRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getXLanguage,
                GetScriptJobStatisticsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getXProjectId,
                GetScriptJobStatisticsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptJobStatisticsRequest::getXUserProfile,
                GetScriptJobStatisticsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> listScriptJobBatches =
        genForListScriptJobBatches();

    private static HttpRequestDef<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> genForListScriptJobBatches() {
        // basic
        HttpRequestDef.Builder<ListScriptJobBatchesRequest, ListScriptJobBatchesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListScriptJobBatchesRequest.class, ListScriptJobBatchesResponse.class)
            .withName("ListScriptJobBatches")
            .withUri("/v1/job/script/orders/{execute_uuid}/batches")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getExecuteUuid,
                ListScriptJobBatchesRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getXLanguage,
                ListScriptJobBatchesRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getXProjectId,
                ListScriptJobBatchesRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobBatchesRequest::getXUserProfile,
                ListScriptJobBatchesRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptJobsRequest, ListScriptJobsResponse> listScriptJobs =
        genForListScriptJobs();

    private static HttpRequestDef<ListScriptJobsRequest, ListScriptJobsResponse> genForListScriptJobs() {
        // basic
        HttpRequestDef.Builder<ListScriptJobsRequest, ListScriptJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptJobsRequest.class, ListScriptJobsResponse.class)
                .withName("ListScriptJobs")
                .withUri("/v1/job/script/orders")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getLimit, ListScriptJobsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getMarker, ListScriptJobsRequest::setMarker));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getStartTime, ListScriptJobsRequest::setStartTime));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getEndTime, ListScriptJobsRequest::setEndTime));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getCreator, ListScriptJobsRequest::setCreator));
        builder.<ListScriptJobsRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScriptJobsRequest.StatusEnum.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getStatus, ListScriptJobsRequest::setStatus));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getXLanguage, ListScriptJobsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getXProjectId, ListScriptJobsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptJobsRequest::getXUserProfile, ListScriptJobsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<OperateScriptJobRequest, OperateScriptJobResponse> operateScriptJob =
        genForOperateScriptJob();

    private static HttpRequestDef<OperateScriptJobRequest, OperateScriptJobResponse> genForOperateScriptJob() {
        // basic
        HttpRequestDef.Builder<OperateScriptJobRequest, OperateScriptJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, OperateScriptJobRequest.class, OperateScriptJobResponse.class)
                .withName("OperateScriptJob")
                .withUri("/v1/job/script/orders/{execute_uuid}/operation")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("execute_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getExecuteUuid, OperateScriptJobRequest::setExecuteUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getXLanguage, OperateScriptJobRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getXProjectId, OperateScriptJobRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getXUserProfile, OperateScriptJobRequest::setXUserProfile));
        builder.<JobScriptOrderOperationBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(JobScriptOrderOperationBody.class),
            f -> f.withMarshaller(OperateScriptJobRequest::getBody, OperateScriptJobRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateScriptRequest, CreateScriptResponse> createScript = genForCreateScript();

    private static HttpRequestDef<CreateScriptRequest, CreateScriptResponse> genForCreateScript() {
        // basic
        HttpRequestDef.Builder<CreateScriptRequest, CreateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateScriptRequest.class, CreateScriptResponse.class)
                .withName("CreateScript")
                .withUri("/v1/job/scripts")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getXProjectId, CreateScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getXUserProfile, CreateScriptRequest::setXUserProfile));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateScriptRequest::getXLanguage, CreateScriptRequest::setXLanguage));
        builder.<AddScriptModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddScriptModel.class),
            f -> f.withMarshaller(CreateScriptRequest::getBody, CreateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> deleteScript = genForDeleteScript();

    private static HttpRequestDef<DeleteScriptRequest, DeleteScriptResponse> genForDeleteScript() {
        // basic
        HttpRequestDef.Builder<DeleteScriptRequest, DeleteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteScriptRequest.class, DeleteScriptResponse.class)
                .withName("DeleteScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getScriptUuid, DeleteScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getXLanguage, DeleteScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getXProjectId, DeleteScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteScriptRequest::getXUserProfile, DeleteScriptRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> executeScript =
        genForExecuteScript();

    private static HttpRequestDef<ExecuteScriptRequest, ExecuteScriptResponse> genForExecuteScript() {
        // basic
        HttpRequestDef.Builder<ExecuteScriptRequest, ExecuteScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecuteScriptRequest.class, ExecuteScriptResponse.class)
                .withName("ExecuteScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getScriptUuid, ExecuteScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getXLanguage, ExecuteScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getXProjectId, ExecuteScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getXUserProfile, ExecuteScriptRequest::setXUserProfile));
        builder.<ScriptExecuteModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptExecuteModel.class),
            f -> f.withMarshaller(ExecuteScriptRequest::getBody, ExecuteScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetScriptRequest, GetScriptResponse> getScript = genForGetScript();

    private static HttpRequestDef<GetScriptRequest, GetScriptResponse> genForGetScript() {
        // basic
        HttpRequestDef.Builder<GetScriptRequest, GetScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetScriptRequest.class, GetScriptResponse.class)
                .withName("GetScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getScriptUuid, GetScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getXLanguage, GetScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getXProjectId, GetScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetScriptRequest::getXUserProfile, GetScriptRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListScriptsRequest, ListScriptsResponse> listScripts = genForListScripts();

    private static HttpRequestDef<ListScriptsRequest, ListScriptsResponse> genForListScripts() {
        // basic
        HttpRequestDef.Builder<ListScriptsRequest, ListScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListScriptsRequest.class, ListScriptsResponse.class)
                .withName("ListScripts")
                .withUri("/v1/job/scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListScriptsRequest::getLimit, ListScriptsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListScriptsRequest::getMarker, ListScriptsRequest::setMarker));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getNameLike, ListScriptsRequest::setNameLike));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getCreator, ListScriptsRequest::setCreator));
        builder.<ListScriptsRequest.RiskLevelEnum>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScriptsRequest.RiskLevelEnum.class),
            f -> f.withMarshaller(ListScriptsRequest::getRiskLevel, ListScriptsRequest::setRiskLevel));
        builder.<ListScriptsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListScriptsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListScriptsRequest::getType, ListScriptsRequest::setType));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getEnterpriseProjectId,
                ListScriptsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getXLanguage, ListScriptsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getXProjectId, ListScriptsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListScriptsRequest::getXUserProfile, ListScriptsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> updateScript = genForUpdateScript();

    private static HttpRequestDef<UpdateScriptRequest, UpdateScriptResponse> genForUpdateScript() {
        // basic
        HttpRequestDef.Builder<UpdateScriptRequest, UpdateScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateScriptRequest.class, UpdateScriptResponse.class)
                .withName("UpdateScript")
                .withUri("/v1/job/scripts/{script_uuid}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getScriptUuid, UpdateScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getXLanguage, UpdateScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getXProjectId, UpdateScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateScriptRequest::getXUserProfile, UpdateScriptRequest::setXUserProfile));
        builder.<EditScriptModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EditScriptModel.class),
            f -> f.withMarshaller(UpdateScriptRequest::getBody, UpdateScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExecutePublicScriptRequest, ExecutePublicScriptResponse> executePublicScript =
        genForExecutePublicScript();

    private static HttpRequestDef<ExecutePublicScriptRequest, ExecutePublicScriptResponse> genForExecutePublicScript() {
        // basic
        HttpRequestDef.Builder<ExecutePublicScriptRequest, ExecutePublicScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ExecutePublicScriptRequest.class, ExecutePublicScriptResponse.class)
                .withName("ExecutePublicScript")
                .withUri("/v1/job/public-scripts/{script_uuid}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getScriptUuid,
                ExecutePublicScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getXLanguage, ExecutePublicScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getXProjectId,
                ExecutePublicScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getXUserProfile,
                ExecutePublicScriptRequest::setXUserProfile));
        builder.<ScriptExecuteModel>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ScriptExecuteModel.class),
            f -> f.withMarshaller(ExecutePublicScriptRequest::getBody, ExecutePublicScriptRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPublicScriptRequest, GetPublicScriptResponse> getPublicScript =
        genForGetPublicScript();

    private static HttpRequestDef<GetPublicScriptRequest, GetPublicScriptResponse> genForGetPublicScript() {
        // basic
        HttpRequestDef.Builder<GetPublicScriptRequest, GetPublicScriptResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetPublicScriptRequest.class, GetPublicScriptResponse.class)
                .withName("GetPublicScript")
                .withUri("/v1/job/public-scripts/{script_uuid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("script_uuid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getScriptUuid, GetPublicScriptRequest::setScriptUuid));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getXLanguage, GetPublicScriptRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getXProjectId, GetPublicScriptRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPublicScriptRequest::getXUserProfile, GetPublicScriptRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicScriptsRequest, ListPublicScriptsResponse> listPublicScripts =
        genForListPublicScripts();

    private static HttpRequestDef<ListPublicScriptsRequest, ListPublicScriptsResponse> genForListPublicScripts() {
        // basic
        HttpRequestDef.Builder<ListPublicScriptsRequest, ListPublicScriptsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicScriptsRequest.class, ListPublicScriptsResponse.class)
                .withName("ListPublicScripts")
                .withUri("/v1/job/public-scripts")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getLimit, ListPublicScriptsRequest::setLimit));
        builder.<Long>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getMarker, ListPublicScriptsRequest::setMarker));
        builder.<String>withRequestField("name_like",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getNameLike, ListPublicScriptsRequest::setNameLike));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getName, ListPublicScriptsRequest::setName));
        builder.<ListPublicScriptsRequest.RiskLevelEnum>withRequestField("risk_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicScriptsRequest.RiskLevelEnum.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getRiskLevel, ListPublicScriptsRequest::setRiskLevel));
        builder.<ListPublicScriptsRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPublicScriptsRequest.TypeEnum.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getType, ListPublicScriptsRequest::setType));
        builder.<String>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getXLanguage, ListPublicScriptsRequest::setXLanguage));
        builder.<String>withRequestField("x-project-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getXProjectId, ListPublicScriptsRequest::setXProjectId));
        builder.<String>withRequestField("x-user-profile",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicScriptsRequest::getXUserProfile,
                ListPublicScriptsRequest::setXUserProfile));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWarRoomRequest, CreateWarRoomResponse> createWarRoom =
        genForCreateWarRoom();

    private static HttpRequestDef<CreateWarRoomRequest, CreateWarRoomResponse> genForCreateWarRoom() {
        // basic
        HttpRequestDef.Builder<CreateWarRoomRequest, CreateWarRoomResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWarRoomRequest.class, CreateWarRoomResponse.class)
                .withName("CreateWarRoom")
                .withUri("/v1/external/warrooms")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CreateWarRoomRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWarRoomRequestBody.class),
            f -> f.withMarshaller(CreateWarRoomRequest::getBody, CreateWarRoomRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWarRoomsRequest, ListWarRoomsResponse> listWarRooms = genForListWarRooms();

    private static HttpRequestDef<ListWarRoomsRequest, ListWarRoomsResponse> genForListWarRooms() {
        // basic
        HttpRequestDef.Builder<ListWarRoomsRequest, ListWarRoomsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListWarRoomsRequest.class, ListWarRoomsResponse.class)
                .withName("ListWarRooms")
                .withUri("/v1/external/warrooms/list")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<ListTenantWarRoomRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTenantWarRoomRequestBody.class),
            f -> f.withMarshaller(ListWarRoomsRequest::getBody, ListWarRoomsRequest::setBody));

        // response

        return builder.build();
    }

}

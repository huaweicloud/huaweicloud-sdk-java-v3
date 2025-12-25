package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.ces.v1.model.BatchListMetricDataRequest;
import com.huaweicloud.sdk.ces.v1.model.BatchListMetricDataRequestBody;
import com.huaweicloud.sdk.ces.v1.model.BatchListMetricDataResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmRequestBody;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmTemplateRequestBody;
import com.huaweicloud.sdk.ces.v1.model.CreateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateEventsRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateEventsRequestBody;
import com.huaweicloud.sdk.ces.v1.model.CreateEventsResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateMetricDataRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateMetricDataRequestBody;
import com.huaweicloud.sdk.ces.v1.model.CreateMetricDataResponse;
import com.huaweicloud.sdk.ces.v1.model.CreateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.CreateResourceGroupRequestBody;
import com.huaweicloud.sdk.ces.v1.model.CreateResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v1.model.DeleteAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v1.model.DeleteResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.DeleteResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.Event;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmHistoriesRequest;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmHistoriesResponse;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmTemplatesRequest;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmTemplatesResponse;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmsRequest;
import com.huaweicloud.sdk.ces.v1.model.ListAlarmsResponse;
import com.huaweicloud.sdk.ces.v1.model.ListEventDetailRequest;
import com.huaweicloud.sdk.ces.v1.model.ListEventDetailResponse;
import com.huaweicloud.sdk.ces.v1.model.ListEventsRequest;
import com.huaweicloud.sdk.ces.v1.model.ListEventsResponse;
import com.huaweicloud.sdk.ces.v1.model.ListMetricsRequest;
import com.huaweicloud.sdk.ces.v1.model.ListMetricsResponse;
import com.huaweicloud.sdk.ces.v1.model.ListResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.ListResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowEventDataRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowEventDataResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowMetricDataRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowMetricDataResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowQuotasRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowQuotasResponse;
import com.huaweicloud.sdk.ces.v1.model.ShowResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.ShowResourceGroupResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmActionRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmActionRequestBody;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmActionResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmRequestBody;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmTemplateRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmTemplateRequestBody;
import com.huaweicloud.sdk.ces.v1.model.UpdateAlarmTemplateResponse;
import com.huaweicloud.sdk.ces.v1.model.UpdateResourceGroupRequest;
import com.huaweicloud.sdk.ces.v1.model.UpdateResourceGroupRequestBody;
import com.huaweicloud.sdk.ces.v1.model.UpdateResourceGroupResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricData =
        genForBatchListMetricData();

    private static HttpRequestDef<BatchListMetricDataRequest, BatchListMetricDataResponse> genForBatchListMetricData() {
        // basic
        HttpRequestDef.Builder<BatchListMetricDataRequest, BatchListMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListMetricDataRequest.class, BatchListMetricDataResponse.class)
                .withName("BatchListMetricData")
                .withUri("/V1.0/{project_id}/batch-query-metric-data")
                .withContentType("application/json");

        // requests
        builder.<BatchListMetricDataRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchListMetricDataRequestBody.class),
            f -> f.withMarshaller(BatchListMetricDataRequest::getBody, BatchListMetricDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmRequest, CreateAlarmResponse> createAlarm = genForCreateAlarm();

    private static HttpRequestDef<CreateAlarmRequest, CreateAlarmResponse> genForCreateAlarm() {
        // basic
        HttpRequestDef.Builder<CreateAlarmRequest, CreateAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmRequest.class, CreateAlarmResponse.class)
                .withName("CreateAlarm")
                .withUri("/V1.0/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<CreateAlarmRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlarmRequestBody.class),
            f -> f.withMarshaller(CreateAlarmRequest::getBody, CreateAlarmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplate =
        genForCreateAlarmTemplate();

    private static HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> genForCreateAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmTemplateRequest.class, CreateAlarmTemplateResponse.class)
                .withName("CreateAlarmTemplate")
                .withUri("/V1.0/{project_id}/alarm-template")
                .withContentType("application/json");

        // requests
        builder.<CreateAlarmTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAlarmTemplateRequestBody.class),
            f -> f.withMarshaller(CreateAlarmTemplateRequest::getBody, CreateAlarmTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEventsRequest, CreateEventsResponse> createEvents = genForCreateEvents();

    private static HttpRequestDef<CreateEventsRequest, CreateEventsResponse> genForCreateEvents() {
        // basic
        HttpRequestDef.Builder<CreateEventsRequest, CreateEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventsRequest.class, CreateEventsResponse.class)
                .withName("CreateEvents")
                .withUri("/V1.0/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.<List<CreateEventsRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateEventsRequest::getBody, CreateEventsRequest::setBody)
                .withInnerContainerType(CreateEventsRequestBody.class));

        // response
        builder.<List<Event>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateEventsResponse::getBody, CreateEventsResponse::setBody)
                .withInnerContainerType(Event.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateMetricDataRequest, CreateMetricDataResponse> createMetricData =
        genForCreateMetricData();

    private static HttpRequestDef<CreateMetricDataRequest, CreateMetricDataResponse> genForCreateMetricData() {
        // basic
        HttpRequestDef.Builder<CreateMetricDataRequest, CreateMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetricDataRequest.class, CreateMetricDataResponse.class)
                .withName("CreateMetricData")
                .withUri("/V1.0/{project_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<List<CreateMetricDataRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateMetricDataRequest::getBody, CreateMetricDataRequest::setBody)
                .withInnerContainerType(CreateMetricDataRequestBody.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroup =
        genForCreateResourceGroup();

    private static HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> genForCreateResourceGroup() {
        // basic
        HttpRequestDef.Builder<CreateResourceGroupRequest, CreateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceGroupRequest.class, CreateResourceGroupResponse.class)
                .withName("CreateResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups")
                .withContentType("application/json");

        // requests
        builder.<CreateResourceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceGroupRequestBody.class),
            f -> f.withMarshaller(CreateResourceGroupRequest::getBody, CreateResourceGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarm = genForDeleteAlarm();

    private static HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> genForDeleteAlarm() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRequest, DeleteAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmRequest.class, DeleteAlarmResponse.class)
                .withName("DeleteAlarm")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmRequest::getAlarmId, DeleteAlarmRequest::setAlarmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> deleteAlarmTemplate =
        genForDeleteAlarmTemplate();

    private static HttpRequestDef<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> genForDeleteAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAlarmTemplateRequest.class, DeleteAlarmTemplateResponse.class)
            .withName("DeleteAlarmTemplate")
            .withUri("/V1.0/{project_id}/alarm-template/{template_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAlarmTemplateRequest::getTemplateId,
                DeleteAlarmTemplateRequest::setTemplateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroup =
        genForDeleteResourceGroup();

    private static HttpRequestDef<DeleteResourceGroupRequest, DeleteResourceGroupResponse> genForDeleteResourceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteResourceGroupRequest, DeleteResourceGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResourceGroupRequest.class, DeleteResourceGroupResponse.class)
            .withName("DeleteResourceGroup")
            .withUri("/V1.0/{project_id}/resource-groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceGroupRequest::getGroupId, DeleteResourceGroupRequest::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistories =
        genForListAlarmHistories();

    private static HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> genForListAlarmHistories() {
        // basic
        HttpRequestDef.Builder<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmHistoriesRequest.class, ListAlarmHistoriesResponse.class)
                .withName("ListAlarmHistories")
                .withUri("/V1.0/{project_id}/alarm-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getGroupId, ListAlarmHistoriesRequest::setGroupId));
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmId, ListAlarmHistoriesRequest::setAlarmId));
        builder.<String>withRequestField("alarm_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmName, ListAlarmHistoriesRequest::setAlarmName));
        builder.<ListAlarmHistoriesRequest.AlarmStatusEnum>withRequestField("alarm_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmHistoriesRequest.AlarmStatusEnum.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmStatus,
                ListAlarmHistoriesRequest::setAlarmStatus));
        builder.<ListAlarmHistoriesRequest.AlarmLevelEnum>withRequestField("alarm_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAlarmHistoriesRequest.AlarmLevelEnum.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmLevel, ListAlarmHistoriesRequest::setAlarmLevel));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getNamespace, ListAlarmHistoriesRequest::setNamespace));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getFrom, ListAlarmHistoriesRequest::setFrom));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getTo, ListAlarmHistoriesRequest::setTo));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getStart, ListAlarmHistoriesRequest::setStart));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLimit, ListAlarmHistoriesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplates =
        genForListAlarmTemplates();

    private static HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> genForListAlarmTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmTemplatesRequest.class, ListAlarmTemplatesResponse.class)
                .withName("ListAlarmTemplates")
                .withUri("/V1.0/{project_id}/alarm-template")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarmTemplateId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getAlarmTemplateId,
                ListAlarmTemplatesRequest::setAlarmTemplateId));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getNamespace, ListAlarmTemplatesRequest::setNamespace));
        builder.<String>withRequestField("dname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getDname, ListAlarmTemplatesRequest::setDname));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getStart, ListAlarmTemplatesRequest::setStart));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getLimit, ListAlarmTemplatesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForListAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForListAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/V1.0/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getStart, ListAlarmsRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, ListAlarmsRequest::setLimit));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getOrder, ListAlarmsRequest::setOrder));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getEnterpriseProjectId,
                ListAlarmsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventDetailRequest, ListEventDetailResponse> listEventDetail =
        genForListEventDetail();

    private static HttpRequestDef<ListEventDetailRequest, ListEventDetailResponse> genForListEventDetail() {
        // basic
        HttpRequestDef.Builder<ListEventDetailRequest, ListEventDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventDetailRequest.class, ListEventDetailResponse.class)
                .withName("ListEventDetail")
                .withUri("/V1.0/{project_id}/event/{event_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("event_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventDetailRequest::getEventName, ListEventDetailRequest::setEventName));
        builder.<ListEventDetailRequest.EventTypeEnum>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListEventDetailRequest.EventTypeEnum.class),
            f -> f.withMarshaller(ListEventDetailRequest::getEventType, ListEventDetailRequest::setEventType));
        builder.<ListEventDetailRequest.SubEventTypeEnum>withRequestField("sub_event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventDetailRequest.SubEventTypeEnum.class),
            f -> f.withMarshaller(ListEventDetailRequest::getSubEventType, ListEventDetailRequest::setSubEventType));
        builder.<String>withRequestField("event_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventDetailRequest::getEventSource, ListEventDetailRequest::setEventSource));
        builder.<ListEventDetailRequest.EventLevelEnum>withRequestField("event_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventDetailRequest.EventLevelEnum.class),
            f -> f.withMarshaller(ListEventDetailRequest::getEventLevel, ListEventDetailRequest::setEventLevel));
        builder.<String>withRequestField("event_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventDetailRequest::getEventUser, ListEventDetailRequest::setEventUser));
        builder.<ListEventDetailRequest.EventStateEnum>withRequestField("event_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventDetailRequest.EventStateEnum.class),
            f -> f.withMarshaller(ListEventDetailRequest::getEventState, ListEventDetailRequest::setEventState));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventDetailRequest::getFrom, ListEventDetailRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventDetailRequest::getTo, ListEventDetailRequest::setTo));
        builder.<Long>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventDetailRequest::getStart, ListEventDetailRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventDetailRequest::getLimit, ListEventDetailRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForListEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForListEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/V1.0/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.<ListEventsRequest.EventTypeEnum>withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventsRequest.EventTypeEnum.class),
            f -> f.withMarshaller(ListEventsRequest::getEventType, ListEventsRequest::setEventType));
        builder.<ListEventsRequest.SubEventTypeEnum>withRequestField("sub_event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEventsRequest.SubEventTypeEnum.class),
            f -> f.withMarshaller(ListEventsRequest::getSubEventType, ListEventsRequest::setSubEventType));
        builder.<String>withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getEventName, ListEventsRequest::setEventName));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventsRequest::getFrom, ListEventsRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEventsRequest::getTo, ListEventsRequest::setTo));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEventsRequest::getStart, ListEventsRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEventsRequest::getLimit, ListEventsRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForListMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForListMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/V1.0/{project_id}/metrics")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dim.0",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getDim0, ListMetricsRequest::setDim0));
        builder.<String>withRequestField("dim.1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getDim1, ListMetricsRequest::setDim1));
        builder.<String>withRequestField("dim.2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getDim2, ListMetricsRequest::setDim2));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMetricsRequest::getLimit, ListMetricsRequest::setLimit));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getMetricName, ListMetricsRequest::setMetricName));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getNamespace, ListMetricsRequest::setNamespace));
        builder.<ListMetricsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListMetricsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListMetricsRequest::getOrder, ListMetricsRequest::setOrder));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricsRequest::getStart, ListMetricsRequest::setStart));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceGroupRequest, ListResourceGroupResponse> listResourceGroup =
        genForListResourceGroup();

    private static HttpRequestDef<ListResourceGroupRequest, ListResourceGroupResponse> genForListResourceGroup() {
        // basic
        HttpRequestDef.Builder<ListResourceGroupRequest, ListResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceGroupRequest.class, ListResourceGroupResponse.class)
                .withName("ListResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupRequest::getGroupName, ListResourceGroupRequest::setGroupName));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceGroupRequest::getGroupId, ListResourceGroupRequest::setGroupId));
        builder.<ListResourceGroupRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListResourceGroupRequest.StatusEnum.class),
            f -> f.withMarshaller(ListResourceGroupRequest::getStatus, ListResourceGroupRequest::setStatus));
        builder.<Integer>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupRequest::getStart, ListResourceGroupRequest::setStart));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResourceGroupRequest::getLimit, ListResourceGroupRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> showAlarm = genForShowAlarm();

    private static HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> genForShowAlarm() {
        // basic
        HttpRequestDef.Builder<ShowAlarmRequest, ShowAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmRequest.class, ShowAlarmResponse.class)
                .withName("ShowAlarm")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAlarmRequest::getAlarmId, ShowAlarmRequest::setAlarmId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEventDataRequest, ShowEventDataResponse> showEventData =
        genForShowEventData();

    private static HttpRequestDef<ShowEventDataRequest, ShowEventDataResponse> genForShowEventData() {
        // basic
        HttpRequestDef.Builder<ShowEventDataRequest, ShowEventDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventDataRequest.class, ShowEventDataResponse.class)
                .withName("ShowEventData")
                .withUri("/V1.0/{project_id}/event-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDataRequest::getNamespace, ShowEventDataRequest::setNamespace));
        builder.<String>withRequestField("dim.0",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDataRequest::getDim0, ShowEventDataRequest::setDim0));
        builder.<String>withRequestField("dim.1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDataRequest::getDim1, ShowEventDataRequest::setDim1));
        builder.<String>withRequestField("dim.2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDataRequest::getDim2, ShowEventDataRequest::setDim2));
        builder.<String>withRequestField("dim.3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDataRequest::getDim3, ShowEventDataRequest::setDim3));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEventDataRequest::getType, ShowEventDataRequest::setType));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEventDataRequest::getFrom, ShowEventDataRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowEventDataRequest::getTo, ShowEventDataRequest::setTo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricDataRequest, ShowMetricDataResponse> showMetricData =
        genForShowMetricData();

    private static HttpRequestDef<ShowMetricDataRequest, ShowMetricDataResponse> genForShowMetricData() {
        // basic
        HttpRequestDef.Builder<ShowMetricDataRequest, ShowMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetricDataRequest.class, ShowMetricDataResponse.class)
                .withName("ShowMetricData")
                .withUri("/V1.0/{project_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getNamespace, ShowMetricDataRequest::setNamespace));
        builder.<String>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getMetricName, ShowMetricDataRequest::setMetricName));
        builder.<String>withRequestField("dim.0",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getDim0, ShowMetricDataRequest::setDim0));
        builder.<String>withRequestField("dim.1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getDim1, ShowMetricDataRequest::setDim1));
        builder.<String>withRequestField("dim.2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getDim2, ShowMetricDataRequest::setDim2));
        builder.<String>withRequestField("dim.3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getDim3, ShowMetricDataRequest::setDim3));
        builder.<ShowMetricDataRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowMetricDataRequest.FilterEnum.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getFilter, ShowMetricDataRequest::setFilter));
        builder.<ShowMetricDataRequest.PeriodEnum>withRequestField("period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowMetricDataRequest.PeriodEnum.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getPeriod, ShowMetricDataRequest::setPeriod));
        builder.<Long>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getFrom, ShowMetricDataRequest::setFrom));
        builder.<Long>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowMetricDataRequest::getTo, ShowMetricDataRequest::setTo));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForShowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForShowQuotas() {
        // basic
        HttpRequestDef.Builder<ShowQuotasRequest, ShowQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotasRequest.class, ShowQuotasResponse.class)
                .withName("ShowQuotas")
                .withUri("/V1.0/{project_id}/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroup =
        genForShowResourceGroup();

    private static HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> genForShowResourceGroup() {
        // basic
        HttpRequestDef.Builder<ShowResourceGroupRequest, ShowResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceGroupRequest.class, ShowResourceGroupResponse.class)
                .withName("ShowResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getGroupId, ShowResourceGroupRequest::setGroupId));
        builder.<ShowResourceGroupRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowResourceGroupRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getStatus, ShowResourceGroupRequest::setStatus));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getNamespace, ShowResourceGroupRequest::setNamespace));
        builder.<String>withRequestField("dname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getDname, ShowResourceGroupRequest::setDname));
        builder.<String>withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getStart, ShowResourceGroupRequest::setStart));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceGroupRequest::getLimit, ShowResourceGroupRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRequest, UpdateAlarmResponse> updateAlarm = genForUpdateAlarm();

    private static HttpRequestDef<UpdateAlarmRequest, UpdateAlarmResponse> genForUpdateAlarm() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRequest, UpdateAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmRequest.class, UpdateAlarmResponse.class)
                .withName("UpdateAlarm")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmRequest::getAlarmId, UpdateAlarmRequest::setAlarmId));
        builder.<UpdateAlarmRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlarmRequestBody.class),
            f -> f.withMarshaller(UpdateAlarmRequest::getBody, UpdateAlarmRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmAction =
        genForUpdateAlarmAction();

    private static HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> genForUpdateAlarmAction() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmActionRequest, UpdateAlarmActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmActionRequest.class, UpdateAlarmActionResponse.class)
                .withName("UpdateAlarmAction")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmActionRequest::getAlarmId, UpdateAlarmActionRequest::setAlarmId));
        builder.<UpdateAlarmActionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlarmActionRequestBody.class),
            f -> f.withMarshaller(UpdateAlarmActionRequest::getBody, UpdateAlarmActionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplate =
        genForUpdateAlarmTemplate();

    private static HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> genForUpdateAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmTemplateRequest.class, UpdateAlarmTemplateResponse.class)
                .withName("UpdateAlarmTemplate")
                .withUri("/V1.0/{project_id}/alarm-template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getTemplateId,
                UpdateAlarmTemplateRequest::setTemplateId));
        builder.<UpdateAlarmTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAlarmTemplateRequestBody.class),
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getBody, UpdateAlarmTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroup =
        genForUpdateResourceGroup();

    private static HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> genForUpdateResourceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateResourceGroupRequest, UpdateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceGroupRequest.class, UpdateResourceGroupResponse.class)
                .withName("UpdateResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getGroupId, UpdateResourceGroupRequest::setGroupId));
        builder.<UpdateResourceGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResourceGroupRequestBody.class),
            f -> f.withMarshaller(UpdateResourceGroupRequest::getBody, UpdateResourceGroupRequest::setBody));

        // response

        return builder.build();
    }

}

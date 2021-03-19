package com.huaweicloud.sdk.ces.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ces.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricData = genForbatchListMetricData();

    private static HttpRequestDef<BatchListMetricDataRequest, BatchListMetricDataResponse> genForbatchListMetricData() {
        // basic
        HttpRequestDef.Builder<BatchListMetricDataRequest, BatchListMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListMetricDataRequest.class, BatchListMetricDataResponse.class)
                .withName("BatchListMetricData")
                .withUri("/V1.0/{project_id}/batch-query-metric-data")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            BatchListMetricDataRequestBody.class,
            f -> f.withMarshaller(BatchListMetricDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmRequest, CreateAlarmResponse> createAlarm = genForcreateAlarm();

    private static HttpRequestDef<CreateAlarmRequest, CreateAlarmResponse> genForcreateAlarm() {
        // basic
        HttpRequestDef.Builder<CreateAlarmRequest, CreateAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmRequest.class, CreateAlarmResponse.class)
                .withName("CreateAlarm")
                .withUri("/V1.0/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAlarmRequestBody.class,
            f -> f.withMarshaller(CreateAlarmRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplate = genForcreateAlarmTemplate();

    private static HttpRequestDef<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> genForcreateAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAlarmTemplateRequest.class, CreateAlarmTemplateResponse.class)
                .withName("CreateAlarmTemplate")
                .withUri("/V1.0/{project_id}/alarm-template")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateAlarmTemplateRequestBody.class,
            f -> f.withMarshaller(CreateAlarmTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateEventsRequest, CreateEventsResponse> createEvents = genForcreateEvents();

    private static HttpRequestDef<CreateEventsRequest, CreateEventsResponse> genForcreateEvents() {
        // basic
        HttpRequestDef.Builder<CreateEventsRequest, CreateEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventsRequest.class, CreateEventsResponse.class)
                .withName("CreateEvents")
                .withUri("/V1.0/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(CreateEventsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(EventItem.class)
        );

        // response
        

        builder.withResponseField(
            "body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(CreateEventsResponse::getBody, (response, data)->{
                response.setBody(data);
            }).withInnerContainerType(CreateEventsResponseBody.class)
        );


        return builder.build();
    }

    public static final HttpRequestDef<CreateMetricDataRequest, CreateMetricDataResponse> createMetricData = genForcreateMetricData();

    private static HttpRequestDef<CreateMetricDataRequest, CreateMetricDataResponse> genForcreateMetricData() {
        // basic
        HttpRequestDef.Builder<CreateMetricDataRequest, CreateMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMetricDataRequest.class, CreateMetricDataResponse.class)
                .withName("CreateMetricData")
                .withUri("/V1.0/{project_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(CreateMetricDataRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(MetricDataItem.class)
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroup = genForcreateResourceGroup();

    private static HttpRequestDef<CreateResourceGroupRequest, CreateResourceGroupResponse> genForcreateResourceGroup() {
        // basic
        HttpRequestDef.Builder<CreateResourceGroupRequest, CreateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResourceGroupRequest.class, CreateResourceGroupResponse.class)
                .withName("CreateResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateResourceGroupRequestBody.class,
            f -> f.withMarshaller(CreateResourceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarm = genFordeleteAlarm();

    private static HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> genFordeleteAlarm() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRequest, DeleteAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmRequest.class, DeleteAlarmResponse.class)
                .withName("DeleteAlarm")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAlarmRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> deleteAlarmTemplate = genFordeleteAlarmTemplate();

    private static HttpRequestDef<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> genFordeleteAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmTemplateRequest.class, DeleteAlarmTemplateResponse.class)
                .withName("DeleteAlarmTemplate")
                .withUri("/V1.0/{project_id}/alarm-template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteAlarmTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroup = genFordeleteResourceGroup();

    private static HttpRequestDef<DeleteResourceGroupRequest, DeleteResourceGroupResponse> genFordeleteResourceGroup() {
        // basic
        HttpRequestDef.Builder<DeleteResourceGroupRequest, DeleteResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResourceGroupRequest.class, DeleteResourceGroupResponse.class)
                .withName("DeleteResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteResourceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistories = genForlistAlarmHistories();

    private static HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> genForlistAlarmHistories() {
        // basic
        HttpRequestDef.Builder<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmHistoriesRequest.class, ListAlarmHistoriesResponse.class)
                .withName("ListAlarmHistories")
                .withUri("/V1.0/{project_id}/alarm-histories")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            })
        );
        builder.withRequestField("alarm_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmName, (req, v) -> {
                req.setAlarmName(v);
            })
        );
        builder.withRequestField("alarm_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmStatus, (req, v) -> {
                req.setAlarmStatus(v);
            })
        );
        builder.withRequestField("alarm_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmLevel, (req, v) -> {
                req.setAlarmLevel(v);
            })
        );
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplates = genForlistAlarmTemplates();

    private static HttpRequestDef<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> genForlistAlarmTemplates() {
        // basic
        HttpRequestDef.Builder<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmTemplatesRequest.class, ListAlarmTemplatesResponse.class)
                .withName("ListAlarmTemplates")
                .withUri("/V1.0/{project_id}/alarm-template")
                .withContentType("application/json");

        // requests
        builder.withRequestField("alarmTemplateId",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getAlarmTemplateId, (req, v) -> {
                req.setAlarmTemplateId(v);
            })
        );
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("dname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getDname, (req, v) -> {
                req.setDname(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmTemplatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForlistAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForlistAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/V1.0/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAlarmsRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListEventDetailRequest, ListEventDetailResponse> listEventDetail = genForlistEventDetail();

    private static HttpRequestDef<ListEventDetailRequest, ListEventDetailResponse> genForlistEventDetail() {
        // basic
        HttpRequestDef.Builder<ListEventDetailRequest, ListEventDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventDetailRequest.class, ListEventDetailResponse.class)
                .withName("ListEventDetail")
                .withUri("/V1.0/{project_id}/event/{event_name}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("event_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEventDetailRequest::getEventName, (req, v) -> {
                req.setEventName(v);
            })
        );
        builder.withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ListEventDetailRequest.EventTypeEnum.class,
            f -> f.withMarshaller(ListEventDetailRequest::getEventType, (req, v) -> {
                req.setEventType(v);
            })
        );
        builder.withRequestField("event_source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventDetailRequest::getEventSource, (req, v) -> {
                req.setEventSource(v);
            })
        );
        builder.withRequestField("event_level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventDetailRequest::getEventLevel, (req, v) -> {
                req.setEventLevel(v);
            })
        );
        builder.withRequestField("event_user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventDetailRequest::getEventUser, (req, v) -> {
                req.setEventUser(v);
            })
        );
        builder.withRequestField("event_state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventDetailRequest::getEventState, (req, v) -> {
                req.setEventState(v);
            })
        );
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEventDetailRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEventDetailRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventDetailRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/V1.0/{project_id}/events")
                .withContentType("application/json");

        // requests
        builder.withRequestField("event_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListEventsRequest.EventTypeEnum.class,
            f -> f.withMarshaller(ListEventsRequest::getEventType, (req, v) -> {
                req.setEventType(v);
            })
        );
        builder.withRequestField("event_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventsRequest::getEventName, (req, v) -> {
                req.setEventName(v);
            })
        );
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEventsRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Long.class,
            f -> f.withMarshaller(ListEventsRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventsRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForlistMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForlistMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withName("ListMetrics")
                .withUri("/V1.0/{project_id}/metrics")
                .withContentType("application/json");

        // requests
        builder.withRequestField("dim.0",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsRequest::getDim0, (req, v) -> {
                req.setDim0(v);
            })
        );
        builder.withRequestField("dim.1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsRequest::getDim1, (req, v) -> {
                req.setDim1(v);
            })
        );
        builder.withRequestField("dim.2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsRequest::getDim2, (req, v) -> {
                req.setDim2(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMetricsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            })
        );
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListMetricsRequest.OrderEnum.class,
            f -> f.withMarshaller(ListMetricsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMetricsRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ListResourceGroupRequest, ListResourceGroupResponse> listResourceGroup = genForlistResourceGroup();

    private static HttpRequestDef<ListResourceGroupRequest, ListResourceGroupResponse> genForlistResourceGroup() {
        // basic
        HttpRequestDef.Builder<ListResourceGroupRequest, ListResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceGroupRequest.class, ListResourceGroupResponse.class)
                .withName("ListResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceGroupRequest::getGroupName, (req, v) -> {
                req.setGroupName(v);
            })
        );
        builder.withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListResourceGroupRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResourceGroupRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListResourceGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> showAlarm = genForshowAlarm();

    private static HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> genForshowAlarm() {
        // basic
        HttpRequestDef.Builder<ShowAlarmRequest, ShowAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmRequest.class, ShowAlarmResponse.class)
                .withName("ShowAlarm")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowAlarmRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowEventDataRequest, ShowEventDataResponse> showEventData = genForshowEventData();

    private static HttpRequestDef<ShowEventDataRequest, ShowEventDataResponse> genForshowEventData() {
        // basic
        HttpRequestDef.Builder<ShowEventDataRequest, ShowEventDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEventDataRequest.class, ShowEventDataResponse.class)
                .withName("ShowEventData")
                .withUri("/V1.0/{project_id}/event-data")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowEventDataRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("dim.0",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowEventDataRequest::getDim0, (req, v) -> {
                req.setDim0(v);
            })
        );
        builder.withRequestField("dim.1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEventDataRequest::getDim1, (req, v) -> {
                req.setDim1(v);
            })
        );
        builder.withRequestField("dim.2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEventDataRequest::getDim2, (req, v) -> {
                req.setDim2(v);
            })
        );
        builder.withRequestField("dim.3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowEventDataRequest::getDim3, (req, v) -> {
                req.setDim3(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowEventDataRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ShowEventDataRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ShowEventDataRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowMetricDataRequest, ShowMetricDataResponse> showMetricData = genForshowMetricData();

    private static HttpRequestDef<ShowMetricDataRequest, ShowMetricDataResponse> genForshowMetricData() {
        // basic
        HttpRequestDef.Builder<ShowMetricDataRequest, ShowMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMetricDataRequest.class, ShowMetricDataResponse.class)
                .withName("ShowMetricData")
                .withUri("/V1.0/{project_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            })
        );
        builder.withRequestField("dim.0",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getDim0, (req, v) -> {
                req.setDim0(v);
            })
        );
        builder.withRequestField("dim.1",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getDim1, (req, v) -> {
                req.setDim1(v);
            })
        );
        builder.withRequestField("dim.2",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getDim2, (req, v) -> {
                req.setDim2(v);
            })
        );
        builder.withRequestField("dim.3",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getDim3, (req, v) -> {
                req.setDim3(v);
            })
        );
        builder.withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            ShowMetricDataRequest.FilterEnum.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            })
        );
        builder.withRequestField("period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Integer.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            })
        );
        builder.withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            })
        );
        builder.withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            Long.class,
            f -> f.withMarshaller(ShowMetricDataRequest::getTo, (req, v) -> {
                req.setTo(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> showQuotas = genForshowQuotas();

    private static HttpRequestDef<ShowQuotasRequest, ShowQuotasResponse> genForshowQuotas() {
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

    public static final HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroup = genForshowResourceGroup();

    private static HttpRequestDef<ShowResourceGroupRequest, ShowResourceGroupResponse> genForshowResourceGroup() {
        // basic
        HttpRequestDef.Builder<ShowResourceGroupRequest, ShowResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceGroupRequest.class, ShowResourceGroupResponse.class)
                .withName("ShowResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowResourceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResourceGroupRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            })
        );
        builder.withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResourceGroupRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            })
        );
        builder.withRequestField("dname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResourceGroupRequest::getDname, (req, v) -> {
                req.setDname(v);
            })
        );
        builder.withRequestField("start",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResourceGroupRequest::getStart, (req, v) -> {
                req.setStart(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowResourceGroupRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmRequest, UpdateAlarmResponse> updateAlarm = genForupdateAlarm();

    private static HttpRequestDef<UpdateAlarmRequest, UpdateAlarmResponse> genForupdateAlarm() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmRequest, UpdateAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmRequest.class, UpdateAlarmResponse.class)
                .withName("UpdateAlarm")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAlarmRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAlarmRequestBody.class,
            f -> f.withMarshaller(UpdateAlarmRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmAction = genForupdateAlarmAction();

    private static HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> genForupdateAlarmAction() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmActionRequest, UpdateAlarmActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmActionRequest.class, UpdateAlarmActionResponse.class)
                .withName("UpdateAlarmAction")
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}/action")
                .withContentType("application/json");

        // requests
        builder.withRequestField("alarm_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAlarmActionRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            ModifyAlarmActionReq.class,
            f -> f.withMarshaller(UpdateAlarmActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplate = genForupdateAlarmTemplate();

    private static HttpRequestDef<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> genForupdateAlarmTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmTemplateRequest.class, UpdateAlarmTemplateResponse.class)
                .withName("UpdateAlarmTemplate")
                .withUri("/V1.0/{project_id}/alarm-template/{template_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateAlarmTemplateRequestBody.class,
            f -> f.withMarshaller(UpdateAlarmTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

    public static final HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroup = genForupdateResourceGroup();

    private static HttpRequestDef<UpdateResourceGroupRequest, UpdateResourceGroupResponse> genForupdateResourceGroup() {
        // basic
        HttpRequestDef.Builder<UpdateResourceGroupRequest, UpdateResourceGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResourceGroupRequest.class, UpdateResourceGroupResponse.class)
                .withName("UpdateResourceGroup")
                .withUri("/V1.0/{project_id}/resource-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateResourceGroupRequest::getGroupId, (req, v) -> {
                req.setGroupId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateResourceGroupRequestBody.class,
            f -> f.withMarshaller(UpdateResourceGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response
        



        return builder.build();
    }

}

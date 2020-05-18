package com.huaweicloud.sdk.ces.v1;

import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.core.http.HttpMethod;

import com.huaweicloud.sdk.ces.v1.model.*;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricData = genForbatchListMetricData();

    private static HttpRequestDef<BatchListMetricDataRequest, BatchListMetricDataResponse> genForbatchListMetricData() {
        // basic
        HttpRequestDef.Builder<BatchListMetricDataRequest, BatchListMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchListMetricDataRequest.class, BatchListMetricDataResponse.class)
                .withUri("/V1.0/{project_id}/batch-query-metric-data")
                .withContentType("application/json;charset=UTF-8");

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
                .withUri("/V1.0/{project_id}/alarms")
                .withContentType("application/json;charset=UTF-8");

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

    public static final HttpRequestDef<CreateEventsRequest, CreateEventsResponse> createEvents = genForcreateEvents();

    private static HttpRequestDef<CreateEventsRequest, CreateEventsResponse> genForcreateEvents() {
        // basic
        HttpRequestDef.Builder<CreateEventsRequest, CreateEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEventsRequest.class, CreateEventsResponse.class)
                .withUri("/V1.0/{project_id}/events")
                .withContentType("application/json;charset=UTF-8");

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
                .withUri("/V1.0/{project_id}/metric-data")
                .withContentType("application/json;charset=UTF-8");

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

    public static final HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarm = genFordeleteAlarm();

    private static HttpRequestDef<DeleteAlarmRequest, DeleteAlarmResponse> genFordeleteAlarm() {
        // basic
        HttpRequestDef.Builder<DeleteAlarmRequest, DeleteAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAlarmRequest.class, DeleteAlarmResponse.class)
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}");

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

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForlistAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForlistAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withUri("/V1.0/{project_id}/alarms");

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

    public static final HttpRequestDef<ListMetricsRequest, ListMetricsResponse> listMetrics = genForlistMetrics();

    private static HttpRequestDef<ListMetricsRequest, ListMetricsResponse> genForlistMetrics() {
        // basic
        HttpRequestDef.Builder<ListMetricsRequest, ListMetricsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricsRequest.class, ListMetricsResponse.class)
                .withUri("/V1.0/{project_id}/metrics");

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

    public static final HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> showAlarm = genForshowAlarm();

    private static HttpRequestDef<ShowAlarmRequest, ShowAlarmResponse> genForshowAlarm() {
        // basic
        HttpRequestDef.Builder<ShowAlarmRequest, ShowAlarmResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAlarmRequest.class, ShowAlarmResponse.class)
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}");

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
                .withUri("/V1.0/{project_id}/event-data");

        // requests
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
        builder.withRequestField("from",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                Long.class,
                f -> f.withMarshaller(ShowEventDataRequest::getFrom, (req, v) -> {
                    req.setFrom(v);
                })
        );
        builder.withRequestField("namespace",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowEventDataRequest::getNamespace, (req, v) -> {
                    req.setNamespace(v);
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
        builder.withRequestField("type",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowEventDataRequest::getType, (req, v) -> {
                    req.setType(v);
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
                .withUri("/V1.0/{project_id}/metric-data");

        // requests
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
        builder.withRequestField("filter",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                ShowMetricDataRequest.FilterEnum.class,
                f -> f.withMarshaller(ShowMetricDataRequest::getFilter, (req, v) -> {
                    req.setFilter(v);
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
        builder.withRequestField("metric_name",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowMetricDataRequest::getMetricName, (req, v) -> {
                    req.setMetricName(v);
                })
        );
        builder.withRequestField("namespace",
                LocationType.Query,
                FieldExistence.NON_NULL_NON_EMPTY,
                String.class,
                f -> f.withMarshaller(ShowMetricDataRequest::getNamespace, (req, v) -> {
                    req.setNamespace(v);
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
                .withUri("/V1.0/{project_id}/quotas");

        // requests

        // response

        return builder.build();

    }

    public static final HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmAction = genForupdateAlarmAction();

    private static HttpRequestDef<UpdateAlarmActionRequest, UpdateAlarmActionResponse> genForupdateAlarmAction() {
        // basic
        HttpRequestDef.Builder<UpdateAlarmActionRequest, UpdateAlarmActionResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAlarmActionRequest.class, UpdateAlarmActionResponse.class)
                .withUri("/V1.0/{project_id}/alarms/{alarm_id}/action")
                .withContentType("application/json;charset=UTF-8");

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

}


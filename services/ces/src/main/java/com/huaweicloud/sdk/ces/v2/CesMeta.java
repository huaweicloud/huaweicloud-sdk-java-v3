package com.huaweicloud.sdk.ces.v2;

import com.huaweicloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CesMeta {

    public static final HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistories =
        genForlistAlarmHistories();

    private static HttpRequestDef<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> genForlistAlarmHistories() {
        // basic
        HttpRequestDef.Builder<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmHistoriesRequest.class, ListAlarmHistoriesResponse.class)
                .withName("ListAlarmHistories")
                .withUri("/v2/{project_id}/alarm-histories")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Integer>withRequestField("level",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLevel, (req, v) -> {
                req.setLevel(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmHistoriesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> listAlarms = genForlistAlarms();

    private static HttpRequestDef<ListAlarmsRequest, ListAlarmsResponse> genForlistAlarms() {
        // basic
        HttpRequestDef.Builder<ListAlarmsRequest, ListAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAlarmsRequest.class, ListAlarmsResponse.class)
                .withName("ListAlarms")
                .withUri("/v2/{project_id}/alarms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("alarm_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getAlarmId, (req, v) -> {
                req.setAlarmId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAlarmsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

}

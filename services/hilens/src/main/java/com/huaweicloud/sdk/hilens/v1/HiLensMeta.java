package com.huaweicloud.sdk.hilens.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hilens.v1.model.ListDeviceAlarmsRequest;
import com.huaweicloud.sdk.hilens.v1.model.ListDeviceAlarmsResponse;
import com.huaweicloud.sdk.hilens.v1.model.ListDevicesRequest;
import com.huaweicloud.sdk.hilens.v1.model.ListDevicesResponse;

@SuppressWarnings("unchecked")
public class HiLensMeta {

    public static final HttpRequestDef<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> listDeviceAlarms =
        genForlistDeviceAlarms();

    private static HttpRequestDef<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> genForlistDeviceAlarms() {
        // basic
        HttpRequestDef.Builder<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDeviceAlarmsRequest.class, ListDeviceAlarmsResponse.class)
                .withName("ListDeviceAlarms")
                .withUri("/v1/{project_id}/alarm-manager/alarms")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceAlarmsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDeviceAlarmsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDeviceAlarmsRequest::getDeviceId, (req, v) -> {
                req.setDeviceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDevicesRequest, ListDevicesResponse> listDevices = genForlistDevices();

    private static HttpRequestDef<ListDevicesRequest, ListDevicesResponse> genForlistDevices() {
        // basic
        HttpRequestDef.Builder<ListDevicesRequest, ListDevicesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDevicesRequest.class, ListDevicesResponse.class)
                .withName("ListDevices")
                .withUri("/v2/{project_id}/device-manager/devices")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDevicesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDevicesRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

}

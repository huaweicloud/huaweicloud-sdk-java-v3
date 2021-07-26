package com.huaweicloud.sdk.hss.v1;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.hss.v1.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class HssMeta {

    public static final HttpRequestDef<ListEventsRequest, ListEventsResponse> listEvents = genForlistEvents();

    private static HttpRequestDef<ListEventsRequest, ListEventsResponse> genForlistEvents() {
        // basic
        HttpRequestDef.Builder<ListEventsRequest, ListEventsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEventsRequest.class, ListEventsResponse.class)
                .withName("ListEvents")
                .withUri("/hss/v1/{project_id}/api/event-management/events")
                .withContentType("application/json");

        // requests
        builder.withRequestField("begin_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEventsRequest::getBeginTime, (req, v) -> {
                req.setBeginTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListEventsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );
        builder.withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            })
        );
        builder.withRequestField("event_types",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListEventsRequest::getEventTypes, (req, v) -> {
                req.setEventTypes(v);
            })
        );
        builder.withRequestField("handle_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListEventsRequest::getHandleStatus, (req, v) -> {
                req.setHandleStatus(v);
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
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

    public static final HttpRequestDef<ListHostsRequest, ListHostsResponse> listHosts = genForlistHosts();

    private static HttpRequestDef<ListHostsRequest, ListHostsResponse> genForlistHosts() {
        // basic
        HttpRequestDef.Builder<ListHostsRequest, ListHostsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHostsRequest.class, ListHostsResponse.class)
                .withName("ListHosts")
                .withUri("/hss/v1/{project_id}/api/host-management/hosts")
                .withContentType("application/json");

        // requests
        builder.withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getVersion, (req, v) -> {
                req.setVersion(v);
            })
        );
        builder.withRequestField("agent_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getAgentStatus, (req, v) -> {
                req.setAgentStatus(v);
            })
        );
        builder.withRequestField("host_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getHostStatus, (req, v) -> {
                req.setHostStatus(v);
            })
        );
        builder.withRequestField("protect_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getProtectStatus, (req, v) -> {
                req.setProtectStatus(v);
            })
        );
        builder.withRequestField("detect_result",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getDetectResult, (req, v) -> {
                req.setDetectResult(v);
            })
        );
        builder.withRequestField("host_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getHostName, (req, v) -> {
                req.setHostName(v);
            })
        );
        builder.withRequestField("host_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getHostIp, (req, v) -> {
                req.setHostIp(v);
            })
        );
        builder.withRequestField("public_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getPublicIp, (req, v) -> {
                req.setPublicIp(v);
            })
        );
        builder.withRequestField("os_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getOsType, (req, v) -> {
                req.setOsType(v);
            })
        );
        builder.withRequestField("charging_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHostsRequest::getChargingMode, (req, v) -> {
                req.setChargingMode(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHostsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHostsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );

        // response
        


        return builder.build();
    }

}

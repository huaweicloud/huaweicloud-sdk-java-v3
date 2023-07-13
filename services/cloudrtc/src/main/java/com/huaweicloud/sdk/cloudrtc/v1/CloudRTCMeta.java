package com.huaweicloud.sdk.cloudrtc.v1;

import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventDimensionRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventDimensionResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventsRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventsResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcClientQosDetailsRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcClientQosDetailsResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryQualityRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryQualityResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryScaleRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryScaleResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryUsageRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcHistoryUsageResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeNetworkRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeNetworkResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeQualityRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeQualityResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleDimensionRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleDimensionResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRealtimeScaleResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRoomListRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcRoomListResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcUserListRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcUserListResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.List;

@SuppressWarnings("unchecked")
public class CloudRTCMeta {

    public static final HttpRequestDef<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> listRtcAbnormalEventDimension =
        genForlistRtcAbnormalEventDimension();

    private static HttpRequestDef<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> genForlistRtcAbnormalEventDimension() {
        // basic
        HttpRequestDef.Builder<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRtcAbnormalEventDimensionRequest.class,
                    ListRtcAbnormalEventDimensionResponse.class)
                .withName("ListRtcAbnormalEventDimension")
                .withUri("/v1/rtc/data/abnormal-event/dimension")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<ListRtcAbnormalEventDimensionRequest.DimensionEnum>withRequestField("dimension",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRtcAbnormalEventDimensionRequest.DimensionEnum.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getDimension, (req, v) -> {
                req.setDimension(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionResponse::getXRequestId,
                ListRtcAbnormalEventDimensionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse> listRtcAbnormalEvents =
        genForlistRtcAbnormalEvents();

    private static HttpRequestDef<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse> genForlistRtcAbnormalEvents() {
        // basic
        HttpRequestDef.Builder<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcAbnormalEventsRequest.class, ListRtcAbnormalEventsResponse.class)
            .withName("ListRtcAbnormalEvents")
            .withUri("/v1/rtc/data/abnormal-events")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("uid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getUid, (req, v) -> {
                req.setUid(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcAbnormalEventsResponse::getXRequestId,
                ListRtcAbnormalEventsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse> listRtcClientQosDetails =
        genForlistRtcClientQosDetails();

    private static HttpRequestDef<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse> genForlistRtcClientQosDetails() {
        // basic
        HttpRequestDef.Builder<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcClientQosDetailsRequest.class, ListRtcClientQosDetailsResponse.class)
            .withName("ListRtcClientQosDetails")
            .withUri("/v1/{project_id}/rtc/client/qos/details")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getUserId, (req, v) -> {
                req.setUserId(v);
            }));
        builder.<String>withRequestField("peer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getPeerId, (req, v) -> {
                req.setPeerId(v);
            }));
        builder.<String>withRequestField("stream_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getStreamId, (req, v) -> {
                req.setStreamId(v);
            }));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getDirection, (req, v) -> {
                req.setDirection(v);
            }));
        builder.<ListRtcClientQosDetailsRequest.MidEnum>withRequestField("mid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRtcClientQosDetailsRequest.MidEnum.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getMid, (req, v) -> {
                req.setMid(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("time_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getTimeType, (req, v) -> {
                req.setTimeType(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcClientQosDetailsResponse::getXRequestId,
                ListRtcClientQosDetailsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse> listRtcHistoryQuality =
        genForlistRtcHistoryQuality();

    private static HttpRequestDef<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse> genForlistRtcHistoryQuality() {
        // basic
        HttpRequestDef.Builder<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcHistoryQualityRequest.class, ListRtcHistoryQualityResponse.class)
            .withName("ListRtcHistoryQuality")
            .withUri("/v1/{project_id}/rtc/history/quality")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<List<String>>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcHistoryQualityResponse::getXRequestId,
                ListRtcHistoryQualityResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse> listRtcHistoryScale =
        genForlistRtcHistoryScale();

    private static HttpRequestDef<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse> genForlistRtcHistoryScale() {
        // basic
        HttpRequestDef.Builder<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRtcHistoryScaleRequest.class, ListRtcHistoryScaleResponse.class)
                .withName("ListRtcHistoryScale")
                .withUri("/v1/{project_id}/rtc/history/scale")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<List<String>>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcHistoryScaleResponse::getXRequestId,
                ListRtcHistoryScaleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse> listRtcHistoryUsage =
        genForlistRtcHistoryUsage();

    private static HttpRequestDef<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse> genForlistRtcHistoryUsage() {
        // basic
        HttpRequestDef.Builder<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRtcHistoryUsageRequest.class, ListRtcHistoryUsageResponse.class)
                .withName("ListRtcHistoryUsage")
                .withUri("/v1/{project_id}/rtc/history/usage")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcHistoryUsageResponse::getXRequestId,
                ListRtcHistoryUsageResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse> listRtcRealtimeNetwork =
        genForlistRtcRealtimeNetwork();

    private static HttpRequestDef<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse> genForlistRtcRealtimeNetwork() {
        // basic
        HttpRequestDef.Builder<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcRealtimeNetworkRequest.class, ListRtcRealtimeNetworkResponse.class)
            .withName("ListRtcRealtimeNetwork")
            .withUri("/v1/{project_id}/rtc/realtime/network")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("sdk_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getSdkType, (req, v) -> {
                req.setSdkType(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcRealtimeNetworkResponse::getXRequestId,
                ListRtcRealtimeNetworkResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse> listRtcRealtimeQuality =
        genForlistRtcRealtimeQuality();

    private static HttpRequestDef<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse> genForlistRtcRealtimeQuality() {
        // basic
        HttpRequestDef.Builder<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcRealtimeQualityRequest.class, ListRtcRealtimeQualityResponse.class)
            .withName("ListRtcRealtimeQuality")
            .withUri("/v1/{project_id}/rtc/realtime/quality")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("sdk_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getSdkType, (req, v) -> {
                req.setSdkType(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcRealtimeQualityResponse::getXRequestId,
                ListRtcRealtimeQualityResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse> listRtcRealtimeScale =
        genForlistRtcRealtimeScale();

    private static HttpRequestDef<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse> genForlistRtcRealtimeScale() {
        // basic
        HttpRequestDef.Builder<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcRealtimeScaleRequest.class, ListRtcRealtimeScaleResponse.class)
            .withName("ListRtcRealtimeScale")
            .withUri("/v1/{project_id}/rtc/realtime/scale")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcRealtimeScaleResponse::getXRequestId,
                ListRtcRealtimeScaleResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse> listRtcRealtimeScaleDimension =
        genForlistRtcRealtimeScaleDimension();

    private static HttpRequestDef<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse> genForlistRtcRealtimeScaleDimension() {
        // basic
        HttpRequestDef.Builder<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRtcRealtimeScaleDimensionRequest.class,
                    ListRtcRealtimeScaleDimensionResponse.class)
                .withName("ListRtcRealtimeScaleDimension")
                .withUri("/v1/{project_id}/rtc/realtime/scale/dimension")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getMetric, (req, v) -> {
                req.setMetric(v);
            }));
        builder.<String>withRequestField("dimension",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getDimension, (req, v) -> {
                req.setDimension(v);
            }));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getTime, (req, v) -> {
                req.setTime(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionResponse::getXRequestId,
                ListRtcRealtimeScaleDimensionResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcRoomListRequest, ListRtcRoomListResponse> listRtcRoomList =
        genForlistRtcRoomList();

    private static HttpRequestDef<ListRtcRoomListRequest, ListRtcRoomListResponse> genForlistRtcRoomList() {
        // basic
        HttpRequestDef.Builder<ListRtcRoomListRequest, ListRtcRoomListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRtcRoomListRequest.class, ListRtcRoomListResponse.class)
                .withName("ListRtcRoomList")
                .withUri("/v1/{project_id}/rtc/rooms")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<ListRtcRoomListRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRtcRoomListRequest.StateEnum.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcRoomListResponse::getXRequestId, ListRtcRoomListResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcUserListRequest, ListRtcUserListResponse> listRtcUserList =
        genForlistRtcUserList();

    private static HttpRequestDef<ListRtcUserListRequest, ListRtcUserListResponse> genForlistRtcUserList() {
        // basic
        HttpRequestDef.Builder<ListRtcUserListRequest, ListRtcUserListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRtcUserListRequest.class, ListRtcUserListResponse.class)
                .withName("ListRtcUserList")
                .withUri("/v1/{project_id}/rtc/users")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getRoomId, (req, v) -> {
                req.setRoomId(v);
            }));
        builder.<String>withRequestField("uid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getUid, (req, v) -> {
                req.setUid(v);
            }));
        builder.<String>withRequestField("nickname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getNickname, (req, v) -> {
                req.setNickname(v);
            }));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            }));
        builder.<List<String>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getState, (req, v) -> {
                req.setState(v);
            }));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<ListRtcUserListRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRtcUserListRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getAuthorization, (req, v) -> {
                req.setAuthorization(v);
            }));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getXSdkDate, (req, v) -> {
                req.setXSdkDate(v);
            }));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getXProjectId, (req, v) -> {
                req.setXProjectId(v);
            }));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcUserListResponse::getXRequestId, ListRtcUserListResponse::setXRequestId));
        return builder.build();
    }

}

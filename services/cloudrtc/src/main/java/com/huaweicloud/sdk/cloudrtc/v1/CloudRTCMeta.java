package com.huaweicloud.sdk.cloudrtc.v1;

import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventDimensionRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventDimensionResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventsRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcAbnormalEventsResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcClientQosDetailsRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcClientQosDetailsResponse;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcEventRequest;
import com.huaweicloud.sdk.cloudrtc.v1.model.ListRtcEventResponse;
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

    public static final HttpRequestDef<ListRtcAbnormalEventRequest, ListRtcAbnormalEventResponse> listRtcAbnormalEvent =
        genForListRtcAbnormalEvent();

    private static HttpRequestDef<ListRtcAbnormalEventRequest, ListRtcAbnormalEventResponse> genForListRtcAbnormalEvent() {
        // basic
        HttpRequestDef.Builder<ListRtcAbnormalEventRequest, ListRtcAbnormalEventResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRtcAbnormalEventRequest.class, ListRtcAbnormalEventResponse.class)
            .withName("ListRtcAbnormalEvent")
            .withUri("/v1/{project_id}/rtc/client/abnormalevent")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventRequest::getAppId, ListRtcAbnormalEventRequest::setAppId));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventRequest::getRoomId, ListRtcAbnormalEventRequest::setRoomId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventRequest::getStartTime,
                ListRtcAbnormalEventRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventRequest::getEndTime, ListRtcAbnormalEventRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcAbnormalEventResponse::getXRequestId,
                ListRtcAbnormalEventResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcEventRequest, ListRtcEventResponse> listRtcEvent = genForListRtcEvent();

    private static HttpRequestDef<ListRtcEventRequest, ListRtcEventResponse> genForListRtcEvent() {
        // basic
        HttpRequestDef.Builder<ListRtcEventRequest, ListRtcEventResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRtcEventRequest.class, ListRtcEventResponse.class)
                .withName("ListRtcEvent")
                .withUri("/v1/{project_id}/rtc/client/event")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcEventRequest::getAppId, ListRtcEventRequest::setAppId));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcEventRequest::getRoomId, ListRtcEventRequest::setRoomId));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcEventRequest::getStartTime, ListRtcEventRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcEventRequest::getEndTime, ListRtcEventRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcEventResponse::getXRequestId, ListRtcEventResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> listRtcAbnormalEventDimension =
        genForListRtcAbnormalEventDimension();

    private static HttpRequestDef<ListRtcAbnormalEventDimensionRequest, ListRtcAbnormalEventDimensionResponse> genForListRtcAbnormalEventDimension() {
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
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getApp,
                ListRtcAbnormalEventDimensionRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getRoomId,
                ListRtcAbnormalEventDimensionRequest::setRoomId));
        builder.<ListRtcAbnormalEventDimensionRequest.DimensionEnum>withRequestField("dimension",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRtcAbnormalEventDimensionRequest.DimensionEnum.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getDimension,
                ListRtcAbnormalEventDimensionRequest::setDimension));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getStartTime,
                ListRtcAbnormalEventDimensionRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventDimensionRequest::getEndTime,
                ListRtcAbnormalEventDimensionRequest::setEndTime));

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
        genForListRtcAbnormalEvents();

    private static HttpRequestDef<ListRtcAbnormalEventsRequest, ListRtcAbnormalEventsResponse> genForListRtcAbnormalEvents() {
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
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getApp, ListRtcAbnormalEventsRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getRoomId, ListRtcAbnormalEventsRequest::setRoomId));
        builder.<String>withRequestField("uid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getUid, ListRtcAbnormalEventsRequest::setUid));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getStartTime,
                ListRtcAbnormalEventsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getEndTime, ListRtcAbnormalEventsRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getLimit, ListRtcAbnormalEventsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcAbnormalEventsRequest::getOffset, ListRtcAbnormalEventsRequest::setOffset));

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
        genForListRtcClientQosDetails();

    private static HttpRequestDef<ListRtcClientQosDetailsRequest, ListRtcClientQosDetailsResponse> genForListRtcClientQosDetails() {
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
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getDomain,
                ListRtcClientQosDetailsRequest::setDomain));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getAppId, ListRtcClientQosDetailsRequest::setAppId));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getRoomId,
                ListRtcClientQosDetailsRequest::setRoomId));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getUserId,
                ListRtcClientQosDetailsRequest::setUserId));
        builder.<String>withRequestField("peer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getPeerId,
                ListRtcClientQosDetailsRequest::setPeerId));
        builder.<String>withRequestField("stream_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getStreamId,
                ListRtcClientQosDetailsRequest::setStreamId));
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getDirection,
                ListRtcClientQosDetailsRequest::setDirection));
        builder.<ListRtcClientQosDetailsRequest.MidEnum>withRequestField("mid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListRtcClientQosDetailsRequest.MidEnum.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getMid, ListRtcClientQosDetailsRequest::setMid));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getStartTime,
                ListRtcClientQosDetailsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getEndTime,
                ListRtcClientQosDetailsRequest::setEndTime));
        builder.<String>withRequestField("time_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getTimeType,
                ListRtcClientQosDetailsRequest::setTimeType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getLimit, ListRtcClientQosDetailsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getOffset,
                ListRtcClientQosDetailsRequest::setOffset));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getAuthorization,
                ListRtcClientQosDetailsRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getXSdkDate,
                ListRtcClientQosDetailsRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcClientQosDetailsRequest::getXProjectId,
                ListRtcClientQosDetailsRequest::setXProjectId));

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
        genForListRtcHistoryQuality();

    private static HttpRequestDef<ListRtcHistoryQualityRequest, ListRtcHistoryQualityResponse> genForListRtcHistoryQuality() {
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
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getApp, ListRtcHistoryQualityRequest::setApp));
        builder.<List<String>>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getMetric, ListRtcHistoryQualityRequest::setMetric));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getStartDate,
                ListRtcHistoryQualityRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getEndDate, ListRtcHistoryQualityRequest::setEndDate));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getAuthorization,
                ListRtcHistoryQualityRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getXSdkDate,
                ListRtcHistoryQualityRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryQualityRequest::getXProjectId,
                ListRtcHistoryQualityRequest::setXProjectId));

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
        genForListRtcHistoryScale();

    private static HttpRequestDef<ListRtcHistoryScaleRequest, ListRtcHistoryScaleResponse> genForListRtcHistoryScale() {
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
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getApp, ListRtcHistoryScaleRequest::setApp));
        builder.<List<String>>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getMetric, ListRtcHistoryScaleRequest::setMetric));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getStartDate, ListRtcHistoryScaleRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getEndDate, ListRtcHistoryScaleRequest::setEndDate));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getAuthorization,
                ListRtcHistoryScaleRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getXSdkDate, ListRtcHistoryScaleRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryScaleRequest::getXProjectId,
                ListRtcHistoryScaleRequest::setXProjectId));

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
        genForListRtcHistoryUsage();

    private static HttpRequestDef<ListRtcHistoryUsageRequest, ListRtcHistoryUsageResponse> genForListRtcHistoryUsage() {
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
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getApp, ListRtcHistoryUsageRequest::setApp));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getMetric, ListRtcHistoryUsageRequest::setMetric));
        builder.<String>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getStartDate, ListRtcHistoryUsageRequest::setStartDate));
        builder.<String>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getEndDate, ListRtcHistoryUsageRequest::setEndDate));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getAuthorization,
                ListRtcHistoryUsageRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getXSdkDate, ListRtcHistoryUsageRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcHistoryUsageRequest::getXProjectId,
                ListRtcHistoryUsageRequest::setXProjectId));

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
        genForListRtcRealtimeNetwork();

    private static HttpRequestDef<ListRtcRealtimeNetworkRequest, ListRtcRealtimeNetworkResponse> genForListRtcRealtimeNetwork() {
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
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getApp, ListRtcRealtimeNetworkRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getRoomId, ListRtcRealtimeNetworkRequest::setRoomId));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getMetric, ListRtcRealtimeNetworkRequest::setMetric));
        builder.<String>withRequestField("sdk_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getSdkType,
                ListRtcRealtimeNetworkRequest::setSdkType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getStartTime,
                ListRtcRealtimeNetworkRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getEndTime,
                ListRtcRealtimeNetworkRequest::setEndTime));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getAuthorization,
                ListRtcRealtimeNetworkRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getXSdkDate,
                ListRtcRealtimeNetworkRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeNetworkRequest::getXProjectId,
                ListRtcRealtimeNetworkRequest::setXProjectId));

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
        genForListRtcRealtimeQuality();

    private static HttpRequestDef<ListRtcRealtimeQualityRequest, ListRtcRealtimeQualityResponse> genForListRtcRealtimeQuality() {
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
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getApp, ListRtcRealtimeQualityRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getRoomId, ListRtcRealtimeQualityRequest::setRoomId));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getMetric, ListRtcRealtimeQualityRequest::setMetric));
        builder.<String>withRequestField("sdk_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getSdkType,
                ListRtcRealtimeQualityRequest::setSdkType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getStartTime,
                ListRtcRealtimeQualityRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getEndTime,
                ListRtcRealtimeQualityRequest::setEndTime));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getAuthorization,
                ListRtcRealtimeQualityRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getXSdkDate,
                ListRtcRealtimeQualityRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeQualityRequest::getXProjectId,
                ListRtcRealtimeQualityRequest::setXProjectId));

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
        genForListRtcRealtimeScale();

    private static HttpRequestDef<ListRtcRealtimeScaleRequest, ListRtcRealtimeScaleResponse> genForListRtcRealtimeScale() {
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
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getApp, ListRtcRealtimeScaleRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getRoomId, ListRtcRealtimeScaleRequest::setRoomId));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getMetric, ListRtcRealtimeScaleRequest::setMetric));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getStartTime,
                ListRtcRealtimeScaleRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getEndTime, ListRtcRealtimeScaleRequest::setEndTime));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getAuthorization,
                ListRtcRealtimeScaleRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getXSdkDate, ListRtcRealtimeScaleRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleRequest::getXProjectId,
                ListRtcRealtimeScaleRequest::setXProjectId));

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
        genForListRtcRealtimeScaleDimension();

    private static HttpRequestDef<ListRtcRealtimeScaleDimensionRequest, ListRtcRealtimeScaleDimensionResponse> genForListRtcRealtimeScaleDimension() {
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
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getApp,
                ListRtcRealtimeScaleDimensionRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getRoomId,
                ListRtcRealtimeScaleDimensionRequest::setRoomId));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getMetric,
                ListRtcRealtimeScaleDimensionRequest::setMetric));
        builder.<String>withRequestField("dimension",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getDimension,
                ListRtcRealtimeScaleDimensionRequest::setDimension));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getTime,
                ListRtcRealtimeScaleDimensionRequest::setTime));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getAuthorization,
                ListRtcRealtimeScaleDimensionRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getXSdkDate,
                ListRtcRealtimeScaleDimensionRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRealtimeScaleDimensionRequest::getXProjectId,
                ListRtcRealtimeScaleDimensionRequest::setXProjectId));

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
        genForListRtcRoomList();

    private static HttpRequestDef<ListRtcRoomListRequest, ListRtcRoomListResponse> genForListRtcRoomList() {
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
            f -> f.withMarshaller(ListRtcRoomListRequest::getApp, ListRtcRoomListRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getRoomId, ListRtcRoomListRequest::setRoomId));
        builder.<ListRtcRoomListRequest.StateEnum>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRtcRoomListRequest.StateEnum.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getState, ListRtcRoomListRequest::setState));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getStartTime, ListRtcRoomListRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getEndTime, ListRtcRoomListRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getLimit, ListRtcRoomListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getOffset, ListRtcRoomListRequest::setOffset));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getAuthorization, ListRtcRoomListRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getXSdkDate, ListRtcRoomListRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcRoomListRequest::getXProjectId, ListRtcRoomListRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcRoomListResponse::getXRequestId, ListRtcRoomListResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRtcUserListRequest, ListRtcUserListResponse> listRtcUserList =
        genForListRtcUserList();

    private static HttpRequestDef<ListRtcUserListRequest, ListRtcUserListResponse> genForListRtcUserList() {
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
            f -> f.withMarshaller(ListRtcUserListRequest::getApp, ListRtcUserListRequest::setApp));
        builder.<String>withRequestField("room_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getRoomId, ListRtcUserListRequest::setRoomId));
        builder.<String>withRequestField("uid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getUid, ListRtcUserListRequest::setUid));
        builder.<String>withRequestField("nickname",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getNickname, ListRtcUserListRequest::setNickname));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getRegion, ListRtcUserListRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getIsp, ListRtcUserListRequest::setIsp));
        builder.<List<String>>withRequestField("state",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getState, ListRtcUserListRequest::setState));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getStartTime, ListRtcUserListRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getEndTime, ListRtcUserListRequest::setEndTime));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getLimit, ListRtcUserListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getOffset, ListRtcUserListRequest::setOffset));
        builder.<ListRtcUserListRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListRtcUserListRequest.TypeEnum.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getType, ListRtcUserListRequest::setType));
        builder.<String>withRequestField("Authorization",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getAuthorization, ListRtcUserListRequest::setAuthorization));
        builder.<String>withRequestField("X-Sdk-Date",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getXSdkDate, ListRtcUserListRequest::setXSdkDate));
        builder.<String>withRequestField("X-Project-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRtcUserListRequest::getXProjectId, ListRtcUserListRequest::setXProjectId));

        // response

        builder.<String>withResponseField("X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRtcUserListResponse::getXRequestId, ListRtcUserListResponse::setXRequestId));
        return builder.build();
    }

}

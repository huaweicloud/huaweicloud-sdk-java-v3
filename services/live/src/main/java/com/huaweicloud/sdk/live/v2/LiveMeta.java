package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v2.model.ListAreaDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListAreaDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListBandwidthDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListBandwidthDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListDomainBandwidthPeakRequest;
import com.huaweicloud.sdk.live.v2.model.ListDomainBandwidthPeakResponse;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficSummaryRequest;
import com.huaweicloud.sdk.live.v2.model.ListDomainTrafficSummaryResponse;
import com.huaweicloud.sdk.live.v2.model.ListHistoryStreamsRequest;
import com.huaweicloud.sdk.live.v2.model.ListHistoryStreamsResponse;
import com.huaweicloud.sdk.live.v2.model.ListQueryHttpCodeRequest;
import com.huaweicloud.sdk.live.v2.model.ListQueryHttpCodeResponse;
import com.huaweicloud.sdk.live.v2.model.ListRecordDataRequest;
import com.huaweicloud.sdk.live.v2.model.ListRecordDataResponse;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamBitrateRequest;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamBitrateResponse;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamFramerateRequest;
import com.huaweicloud.sdk.live.v2.model.ListSingleStreamFramerateResponse;
import com.huaweicloud.sdk.live.v2.model.ListSnapshotDataRequest;
import com.huaweicloud.sdk.live.v2.model.ListSnapshotDataResponse;
import com.huaweicloud.sdk.live.v2.model.ListTranscodeDataRequest;
import com.huaweicloud.sdk.live.v2.model.ListTranscodeDataResponse;
import com.huaweicloud.sdk.live.v2.model.ListUpStreamDetailRequest;
import com.huaweicloud.sdk.live.v2.model.ListUpStreamDetailResponse;
import com.huaweicloud.sdk.live.v2.model.ListUsersOfStreamRequest;
import com.huaweicloud.sdk.live.v2.model.ListUsersOfStreamResponse;
import com.huaweicloud.sdk.live.v2.model.ShowStreamCountRequest;
import com.huaweicloud.sdk.live.v2.model.ShowStreamCountResponse;
import com.huaweicloud.sdk.live.v2.model.ShowStreamPortraitRequest;
import com.huaweicloud.sdk.live.v2.model.ShowStreamPortraitResponse;
import com.huaweicloud.sdk.live.v2.model.ShowUpBandwidthRequest;
import com.huaweicloud.sdk.live.v2.model.ShowUpBandwidthResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class LiveMeta {

    public static final HttpRequestDef<ListAreaDetailRequest, ListAreaDetailResponse> listAreaDetail =
        genForListAreaDetail();

    private static HttpRequestDef<ListAreaDetailRequest, ListAreaDetailResponse> genForListAreaDetail() {
        // basic
        HttpRequestDef.Builder<ListAreaDetailRequest, ListAreaDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAreaDetailRequest.class, ListAreaDetailResponse.class)
                .withName("ListAreaDetail")
                .withUri("/v2/{project_id}/stats/area/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getStartTime, ListAreaDetailRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getEndTime, ListAreaDetailRequest::setEndTime));
        builder.<List<String>>withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getPlayDomains, ListAreaDetailRequest::setPlayDomains));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getApp, ListAreaDetailRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getStream, ListAreaDetailRequest::setStream));
        builder.<ListAreaDetailRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAreaDetailRequest.IntervalEnum.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getInterval, ListAreaDetailRequest::setInterval));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getIsp, ListAreaDetailRequest::setIsp));
        builder.<List<String>>withRequestField("area",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getArea, ListAreaDetailRequest::setArea));
        builder.<String>withRequestField("metric",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getMetric, ListAreaDetailRequest::setMetric));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAreaDetailRequest::getProtocol, ListAreaDetailRequest::setProtocol));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListAreaDetailResponse::getXRequestId, ListAreaDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListBandwidthDetailRequest, ListBandwidthDetailResponse> listBandwidthDetail =
        genForListBandwidthDetail();

    private static HttpRequestDef<ListBandwidthDetailRequest, ListBandwidthDetailResponse> genForListBandwidthDetail() {
        // basic
        HttpRequestDef.Builder<ListBandwidthDetailRequest, ListBandwidthDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthDetailRequest.class, ListBandwidthDetailResponse.class)
                .withName("ListBandwidthDetail")
                .withUri("/v2/{project_id}/stats/bandwidth/detail")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getPlayDomains,
                ListBandwidthDetailRequest::setPlayDomains));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getApp, ListBandwidthDetailRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getStream, ListBandwidthDetailRequest::setStream));
        builder.<List<String>>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getCountry, ListBandwidthDetailRequest::setCountry));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getRegion, ListBandwidthDetailRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getIsp, ListBandwidthDetailRequest::setIsp));
        builder.<ListBandwidthDetailRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBandwidthDetailRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getProtocol, ListBandwidthDetailRequest::setProtocol));
        builder.<ListBandwidthDetailRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBandwidthDetailRequest.IntervalEnum.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getInterval, ListBandwidthDetailRequest::setInterval));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getStartTime, ListBandwidthDetailRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getEndTime, ListBandwidthDetailRequest::setEndTime));
        builder.<ListBandwidthDetailRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListBandwidthDetailRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListBandwidthDetailRequest::getServiceType,
                ListBandwidthDetailRequest::setServiceType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailResponse::getXRequestId,
                ListBandwidthDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> listDomainBandwidthPeak =
        genForListDomainBandwidthPeak();

    private static HttpRequestDef<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> genForListDomainBandwidthPeak() {
        // basic
        HttpRequestDef.Builder<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDomainBandwidthPeakRequest.class, ListDomainBandwidthPeakResponse.class)
            .withName("ListDomainBandwidthPeak")
            .withUri("/v2/{project_id}/stats/bandwidth/peak")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getPlayDomains,
                ListDomainBandwidthPeakRequest::setPlayDomains));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getApp, ListDomainBandwidthPeakRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getStream,
                ListDomainBandwidthPeakRequest::setStream));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getRegion,
                ListDomainBandwidthPeakRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getIsp, ListDomainBandwidthPeakRequest::setIsp));
        builder.<ListDomainBandwidthPeakRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainBandwidthPeakRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getProtocol,
                ListDomainBandwidthPeakRequest::setProtocol));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getStartTime,
                ListDomainBandwidthPeakRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getEndTime,
                ListDomainBandwidthPeakRequest::setEndTime));
        builder.<ListDomainBandwidthPeakRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainBandwidthPeakRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getServiceType,
                ListDomainBandwidthPeakRequest::setServiceType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakResponse::getXRequestId,
                ListDomainBandwidthPeakResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> listDomainTrafficDetail =
        genForListDomainTrafficDetail();

    private static HttpRequestDef<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> genForListDomainTrafficDetail() {
        // basic
        HttpRequestDef.Builder<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListDomainTrafficDetailRequest.class, ListDomainTrafficDetailResponse.class)
            .withName("ListDomainTrafficDetail")
            .withUri("/v2/{project_id}/stats/traffic/detail")
            .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getPlayDomains,
                ListDomainTrafficDetailRequest::setPlayDomains));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getApp, ListDomainTrafficDetailRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getStream,
                ListDomainTrafficDetailRequest::setStream));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getRegion,
                ListDomainTrafficDetailRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getIsp, ListDomainTrafficDetailRequest::setIsp));
        builder.<ListDomainTrafficDetailRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainTrafficDetailRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getProtocol,
                ListDomainTrafficDetailRequest::setProtocol));
        builder.<Integer>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getInterval,
                ListDomainTrafficDetailRequest::setInterval));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getStartTime,
                ListDomainTrafficDetailRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getEndTime,
                ListDomainTrafficDetailRequest::setEndTime));
        builder.<ListDomainTrafficDetailRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainTrafficDetailRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getServiceType,
                ListDomainTrafficDetailRequest::setServiceType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailResponse::getXRequestId,
                ListDomainTrafficDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> listDomainTrafficSummary =
        genForListDomainTrafficSummary();

    private static HttpRequestDef<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> genForListDomainTrafficSummary() {
        // basic
        HttpRequestDef.Builder<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListDomainTrafficSummaryRequest.class, ListDomainTrafficSummaryResponse.class)
                .withName("ListDomainTrafficSummary")
                .withUri("/v2/{project_id}/stats/traffic/summary")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getPlayDomains,
                ListDomainTrafficSummaryRequest::setPlayDomains));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getApp, ListDomainTrafficSummaryRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getStream,
                ListDomainTrafficSummaryRequest::setStream));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getRegion,
                ListDomainTrafficSummaryRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getIsp, ListDomainTrafficSummaryRequest::setIsp));
        builder.<ListDomainTrafficSummaryRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainTrafficSummaryRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getProtocol,
                ListDomainTrafficSummaryRequest::setProtocol));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getStartTime,
                ListDomainTrafficSummaryRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getEndTime,
                ListDomainTrafficSummaryRequest::setEndTime));
        builder.<ListDomainTrafficSummaryRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainTrafficSummaryRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getServiceType,
                ListDomainTrafficSummaryRequest::setServiceType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryResponse::getXRequestId,
                ListDomainTrafficSummaryResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryStreamsRequest, ListHistoryStreamsResponse> listHistoryStreams =
        genForListHistoryStreams();

    private static HttpRequestDef<ListHistoryStreamsRequest, ListHistoryStreamsResponse> genForListHistoryStreams() {
        // basic
        HttpRequestDef.Builder<ListHistoryStreamsRequest, ListHistoryStreamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistoryStreamsRequest.class, ListHistoryStreamsResponse.class)
                .withName("ListHistoryStreams")
                .withUri("/v2/{project_id}/stats/history/streams")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getDomain, ListHistoryStreamsRequest::setDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getApp, ListHistoryStreamsRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getStream, ListHistoryStreamsRequest::setStream));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getStartTime, ListHistoryStreamsRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getEndTime, ListHistoryStreamsRequest::setEndTime));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getOffset, ListHistoryStreamsRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHistoryStreamsRequest::getLimit, ListHistoryStreamsRequest::setLimit));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistoryStreamsResponse::getXRequestId,
                ListHistoryStreamsResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> listQueryHttpCode =
        genForListQueryHttpCode();

    private static HttpRequestDef<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> genForListQueryHttpCode() {
        // basic
        HttpRequestDef.Builder<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueryHttpCodeRequest.class, ListQueryHttpCodeResponse.class)
                .withName("ListQueryHttpCode")
                .withUri("/v2/{project_id}/stats/httpcodes")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getPlayDomains, ListQueryHttpCodeRequest::setPlayDomains));
        builder.<List<String>>withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getCode, ListQueryHttpCodeRequest::setCode));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getRegion, ListQueryHttpCodeRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getIsp, ListQueryHttpCodeRequest::setIsp));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getStartTime, ListQueryHttpCodeRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getEndTime, ListQueryHttpCodeRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQueryHttpCodeResponse::getXRequestId, ListQueryHttpCodeResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListRecordDataRequest, ListRecordDataResponse> listRecordData =
        genForListRecordData();

    private static HttpRequestDef<ListRecordDataRequest, ListRecordDataResponse> genForListRecordData() {
        // basic
        HttpRequestDef.Builder<ListRecordDataRequest, ListRecordDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordDataRequest.class, ListRecordDataResponse.class)
                .withName("ListRecordData")
                .withUri("/v2/{project_id}/stats/record")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordDataRequest::getPublishDomain, ListRecordDataRequest::setPublishDomain));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordDataRequest::getStartTime, ListRecordDataRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordDataRequest::getEndTime, ListRecordDataRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordDataResponse::getXRequestId, ListRecordDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotDataRequest, ListSnapshotDataResponse> listSnapshotData =
        genForListSnapshotData();

    private static HttpRequestDef<ListSnapshotDataRequest, ListSnapshotDataResponse> genForListSnapshotData() {
        // basic
        HttpRequestDef.Builder<ListSnapshotDataRequest, ListSnapshotDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotDataRequest.class, ListSnapshotDataResponse.class)
                .withName("ListSnapshotData")
                .withUri("/v2/{project_id}/stats/snapshot")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotDataRequest::getPublishDomain,
                ListSnapshotDataRequest::setPublishDomain));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotDataRequest::getStartTime, ListSnapshotDataRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSnapshotDataRequest::getEndTime, ListSnapshotDataRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataResponse::getXRequestId, ListSnapshotDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeDataRequest, ListTranscodeDataResponse> listTranscodeData =
        genForListTranscodeData();

    private static HttpRequestDef<ListTranscodeDataRequest, ListTranscodeDataResponse> genForListTranscodeData() {
        // basic
        HttpRequestDef.Builder<ListTranscodeDataRequest, ListTranscodeDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodeDataRequest.class, ListTranscodeDataResponse.class)
                .withName("ListTranscodeData")
                .withUri("/v2/{project_id}/stats/transcode")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeDataRequest::getPublishDomain,
                ListTranscodeDataRequest::setPublishDomain));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeDataRequest::getStream, ListTranscodeDataRequest::setStream));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeDataRequest::getStartTime, ListTranscodeDataRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTranscodeDataRequest::getEndTime, ListTranscodeDataRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataResponse::getXRequestId, ListTranscodeDataResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListUsersOfStreamRequest, ListUsersOfStreamResponse> listUsersOfStream =
        genForListUsersOfStream();

    private static HttpRequestDef<ListUsersOfStreamRequest, ListUsersOfStreamResponse> genForListUsersOfStream() {
        // basic
        HttpRequestDef.Builder<ListUsersOfStreamRequest, ListUsersOfStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersOfStreamRequest.class, ListUsersOfStreamResponse.class)
                .withName("ListUsersOfStream")
                .withUri("/v2/{project_id}/stats/user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getPlayDomain, ListUsersOfStreamRequest::setPlayDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getApp, ListUsersOfStreamRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getStream, ListUsersOfStreamRequest::setStream));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getIsp, ListUsersOfStreamRequest::setIsp));
        builder.<List<String>>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getCountry, ListUsersOfStreamRequest::setCountry));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getRegion, ListUsersOfStreamRequest::setRegion));
        builder.<ListUsersOfStreamRequest.ProtocolEnum>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersOfStreamRequest.ProtocolEnum.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getProtocol, ListUsersOfStreamRequest::setProtocol));
        builder.<ListUsersOfStreamRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersOfStreamRequest.IntervalEnum.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getInterval, ListUsersOfStreamRequest::setInterval));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getStartTime, ListUsersOfStreamRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getEndTime, ListUsersOfStreamRequest::setEndTime));
        builder.<ListUsersOfStreamRequest.ServiceTypeEnum>withRequestField("service_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListUsersOfStreamRequest.ServiceTypeEnum.class),
            f -> f.withMarshaller(ListUsersOfStreamRequest::getServiceType, ListUsersOfStreamRequest::setServiceType));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamResponse::getXRequestId, ListUsersOfStreamResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamCountRequest, ShowStreamCountResponse> showStreamCount =
        genForShowStreamCount();

    private static HttpRequestDef<ShowStreamCountRequest, ShowStreamCountResponse> genForShowStreamCount() {
        // basic
        HttpRequestDef.Builder<ShowStreamCountRequest, ShowStreamCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamCountRequest.class, ShowStreamCountResponse.class)
                .withName("ShowStreamCount")
                .withUri("/v2/{project_id}/stats/stream-count")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("publish_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowStreamCountRequest::getPublishDomains,
                ShowStreamCountRequest::setPublishDomains));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamCountRequest::getStartTime, ShowStreamCountRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamCountRequest::getEndTime, ShowStreamCountRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamCountResponse::getXRequestId, ShowStreamCountResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamPortraitRequest, ShowStreamPortraitResponse> showStreamPortrait =
        genForShowStreamPortrait();

    private static HttpRequestDef<ShowStreamPortraitRequest, ShowStreamPortraitResponse> genForShowStreamPortrait() {
        // basic
        HttpRequestDef.Builder<ShowStreamPortraitRequest, ShowStreamPortraitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamPortraitRequest.class, ShowStreamPortraitResponse.class)
                .withName("ShowStreamPortrait")
                .withUri("/v2/{project_id}/stats/stream-portraits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamPortraitRequest::getPlayDomain, ShowStreamPortraitRequest::setPlayDomain));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamPortraitRequest::getStream, ShowStreamPortraitRequest::setStream));
        builder.<String>withRequestField("time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowStreamPortraitRequest::getTime, ShowStreamPortraitRequest::setTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamPortraitResponse::getXRequestId,
                ShowStreamPortraitResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ShowUpBandwidthRequest, ShowUpBandwidthResponse> showUpBandwidth =
        genForShowUpBandwidth();

    private static HttpRequestDef<ShowUpBandwidthRequest, ShowUpBandwidthResponse> genForShowUpBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowUpBandwidthRequest, ShowUpBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUpBandwidthRequest.class, ShowUpBandwidthResponse.class)
                .withName("ShowUpBandwidth")
                .withUri("/v2/{project_id}/stats/up-bandwidth/detail")
                .withContentType("application/json");

        // requests
        builder.<List<String>>withRequestField("publish_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getPublishDomains,
                ShowUpBandwidthRequest::setPublishDomains));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getApp, ShowUpBandwidthRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getStream, ShowUpBandwidthRequest::setStream));
        builder.<List<String>>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getRegion, ShowUpBandwidthRequest::setRegion));
        builder.<List<String>>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getIsp, ShowUpBandwidthRequest::setIsp));
        builder.<ShowUpBandwidthRequest.IntervalEnum>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUpBandwidthRequest.IntervalEnum.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getInterval, ShowUpBandwidthRequest::setInterval));
        builder.<ShowUpBandwidthRequest.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowUpBandwidthRequest.TypeEnum.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getType, ShowUpBandwidthRequest::setType));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getStartTime, ShowUpBandwidthRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUpBandwidthRequest::getEndTime, ShowUpBandwidthRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthResponse::getXRequestId, ShowUpBandwidthResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> listSingleStreamBitrate =
        genForListSingleStreamBitrate();

    private static HttpRequestDef<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> genForListSingleStreamBitrate() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSingleStreamBitrateRequest.class, ListSingleStreamBitrateResponse.class)
            .withName("ListSingleStreamBitrate")
            .withUri("/v2/{project_id}/stats/stream/bitrate")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getDomain,
                ListSingleStreamBitrateRequest::setDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getApp, ListSingleStreamBitrateRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getStream,
                ListSingleStreamBitrateRequest::setStream));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getStartTime,
                ListSingleStreamBitrateRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getEndTime,
                ListSingleStreamBitrateRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateResponse::getXRequestId,
                ListSingleStreamBitrateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamDetailRequest, ListSingleStreamDetailResponse> listSingleStreamDetail =
        genForListSingleStreamDetail();

    private static HttpRequestDef<ListSingleStreamDetailRequest, ListSingleStreamDetailResponse> genForListSingleStreamDetail() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamDetailRequest, ListSingleStreamDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListSingleStreamDetailRequest.class, ListSingleStreamDetailResponse.class)
            .withName("ListSingleStreamDetail")
            .withUri("/v2/{project_id}/stats/stream-detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamDetailRequest::getPublishDomain,
                ListSingleStreamDetailRequest::setPublishDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamDetailRequest::getApp, ListSingleStreamDetailRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamDetailRequest::getStream, ListSingleStreamDetailRequest::setStream));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamDetailRequest::getStartTime,
                ListSingleStreamDetailRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamDetailRequest::getEndTime,
                ListSingleStreamDetailRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamDetailResponse::getXRequestId,
                ListSingleStreamDetailResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> listSingleStreamFramerate =
        genForListSingleStreamFramerate();

    private static HttpRequestDef<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> genForListSingleStreamFramerate() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSingleStreamFramerateRequest.class,
                    ListSingleStreamFramerateResponse.class)
                .withName("ListSingleStreamFramerate")
                .withUri("/v2/{project_id}/stats/stream/framerate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getDomain,
                ListSingleStreamFramerateRequest::setDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getApp, ListSingleStreamFramerateRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getStream,
                ListSingleStreamFramerateRequest::setStream));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getStartTime,
                ListSingleStreamFramerateRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getEndTime,
                ListSingleStreamFramerateRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateResponse::getXRequestId,
                ListSingleStreamFramerateResponse::setXRequestId));
        return builder.build();
    }

    public static final HttpRequestDef<ListUpStreamDetailRequest, ListUpStreamDetailResponse> listUpStreamDetail =
        genForListUpStreamDetail();

    private static HttpRequestDef<ListUpStreamDetailRequest, ListUpStreamDetailResponse> genForListUpStreamDetail() {
        // basic
        HttpRequestDef.Builder<ListUpStreamDetailRequest, ListUpStreamDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUpStreamDetailRequest.class, ListUpStreamDetailResponse.class)
                .withName("ListUpStreamDetail")
                .withUri("/v2/{project_id}/stats/up-stream/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpStreamDetailRequest::getPublishDomain,
                ListUpStreamDetailRequest::setPublishDomain));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpStreamDetailRequest::getApp, ListUpStreamDetailRequest::setApp));
        builder.<String>withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpStreamDetailRequest::getStream, ListUpStreamDetailRequest::setStream));
        builder.<String>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpStreamDetailRequest::getStartTime, ListUpStreamDetailRequest::setStartTime));
        builder.<String>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUpStreamDetailRequest::getEndTime, ListUpStreamDetailRequest::setEndTime));

        // response

        builder.<String>withResponseField("X-Request-Id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUpStreamDetailResponse::getXRequestId,
                ListUpStreamDetailResponse::setXRequestId));
        return builder.build();
    }

}

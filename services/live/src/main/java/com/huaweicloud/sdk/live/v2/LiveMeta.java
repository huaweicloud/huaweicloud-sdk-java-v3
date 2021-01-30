package com.huaweicloud.sdk.live.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.live.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class LiveMeta {

    public static final HttpRequestDef<ListBandwidthDetailRequest, ListBandwidthDetailResponse> listBandwidthDetail = genForlistBandwidthDetail();

    private static HttpRequestDef<ListBandwidthDetailRequest, ListBandwidthDetailResponse> genForlistBandwidthDetail() {
        // basic
        HttpRequestDef.Builder<ListBandwidthDetailRequest, ListBandwidthDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthDetailRequest.class, ListBandwidthDetailResponse.class)
                .withName("ListBandwidthDetail")
                .withUri("/v2/{project_id}/stats/bandwidth/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBandwidthDetailRequest.IntervalEnum.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListBandwidthDetailResponse::getXRequestId,
                ListBandwidthDetailResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> listDomainBandwidthPeak = genForlistDomainBandwidthPeak();

    private static HttpRequestDef<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> genForlistDomainBandwidthPeak() {
        // basic
        HttpRequestDef.Builder<ListDomainBandwidthPeakRequest, ListDomainBandwidthPeakResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainBandwidthPeakRequest.class, ListDomainBandwidthPeakResponse.class)
                .withName("ListDomainBandwidthPeak")
                .withUri("/v2/{project_id}/stats/bandwidth/peak")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthPeakRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListDomainBandwidthPeakResponse::getXRequestId,
                ListDomainBandwidthPeakResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> listDomainTrafficDetail = genForlistDomainTrafficDetail();

    private static HttpRequestDef<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> genForlistDomainTrafficDetail() {
        // basic
        HttpRequestDef.Builder<ListDomainTrafficDetailRequest, ListDomainTrafficDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainTrafficDetailRequest.class, ListDomainTrafficDetailResponse.class)
                .withName("ListDomainTrafficDetail")
                .withUri("/v2/{project_id}/stats/traffic/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListDomainTrafficDetailResponse::getXRequestId,
                ListDomainTrafficDetailResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> listDomainTrafficSummary = genForlistDomainTrafficSummary();

    private static HttpRequestDef<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> genForlistDomainTrafficSummary() {
        // basic
        HttpRequestDef.Builder<ListDomainTrafficSummaryRequest, ListDomainTrafficSummaryResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainTrafficSummaryRequest.class, ListDomainTrafficSummaryResponse.class)
                .withName("ListDomainTrafficSummary")
                .withUri("/v2/{project_id}/stats/traffic/summary")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListDomainTrafficSummaryResponse::getXRequestId,
                ListDomainTrafficSummaryResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryStreamsRequest, ListHistoryStreamsResponse> listHistoryStreams = genForlistHistoryStreams();

    private static HttpRequestDef<ListHistoryStreamsRequest, ListHistoryStreamsResponse> genForlistHistoryStreams() {
        // basic
        HttpRequestDef.Builder<ListHistoryStreamsRequest, ListHistoryStreamsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistoryStreamsRequest.class, ListHistoryStreamsResponse.class)
                .withName("ListHistoryStreams")
                .withUri("/v2/{project_id}/stats/history/streams")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHistoryStreamsRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistoryStreamsRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryStreamsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryStreamsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListHistoryStreamsResponse::getXRequestId,
                ListHistoryStreamsResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> listQueryHttpCode = genForlistQueryHttpCode();

    private static HttpRequestDef<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> genForlistQueryHttpCode() {
        // basic
        HttpRequestDef.Builder<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueryHttpCodeRequest.class, ListQueryHttpCodeResponse.class)
                .withName("ListQueryHttpCode")
                .withUri("/v2/{project_id}/stats/httpcodes")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getCode, (req, v) -> {
                req.setCode(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListQueryHttpCodeRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListQueryHttpCodeResponse::getXRequestId,
                ListQueryHttpCodeResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListRecordDataRequest, ListRecordDataResponse> listRecordData = genForlistRecordData();

    private static HttpRequestDef<ListRecordDataRequest, ListRecordDataResponse> genForlistRecordData() {
        // basic
        HttpRequestDef.Builder<ListRecordDataRequest, ListRecordDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordDataRequest.class, ListRecordDataResponse.class)
                .withName("ListRecordData")
                .withUri("/v2/{project_id}/stats/record")
                .withContentType("application/json");

        // requests
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordDataRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordDataRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListRecordDataResponse::getXRequestId,
                ListRecordDataResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotDataRequest, ListSnapshotDataResponse> listSnapshotData = genForlistSnapshotData();

    private static HttpRequestDef<ListSnapshotDataRequest, ListSnapshotDataResponse> genForlistSnapshotData() {
        // basic
        HttpRequestDef.Builder<ListSnapshotDataRequest, ListSnapshotDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotDataRequest.class, ListSnapshotDataResponse.class)
                .withName("ListSnapshotData")
                .withUri("/v2/{project_id}/stats/snapshot")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListSnapshotDataResponse::getXRequestId,
                ListSnapshotDataResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeDataRequest, ListTranscodeDataResponse> listTranscodeData = genForlistTranscodeData();

    private static HttpRequestDef<ListTranscodeDataRequest, ListTranscodeDataResponse> genForlistTranscodeData() {
        // basic
        HttpRequestDef.Builder<ListTranscodeDataRequest, ListTranscodeDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodeDataRequest.class, ListTranscodeDataResponse.class)
                .withName("ListTranscodeData")
                .withUri("/v2/{project_id}/stats/transcode")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataRequest::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListTranscodeDataResponse::getXRequestId,
                ListTranscodeDataResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListUsersOfStreamRequest, ListUsersOfStreamResponse> listUsersOfStream = genForlistUsersOfStream();

    private static HttpRequestDef<ListUsersOfStreamRequest, ListUsersOfStreamResponse> genForlistUsersOfStream() {
        // basic
        HttpRequestDef.Builder<ListUsersOfStreamRequest, ListUsersOfStreamResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersOfStreamRequest.class, ListUsersOfStreamResponse.class)
                .withName("ListUsersOfStream")
                .withUri("/v2/{project_id}/stats/user")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getPlayDomain, (req, v) -> {
                req.setPlayDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListUsersOfStreamRequest.IntervalEnum.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListUsersOfStreamResponse::getXRequestId,
                ListUsersOfStreamResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamCountRequest, ShowStreamCountResponse> showStreamCount = genForshowStreamCount();

    private static HttpRequestDef<ShowStreamCountRequest, ShowStreamCountResponse> genForshowStreamCount() {
        // basic
        HttpRequestDef.Builder<ShowStreamCountRequest, ShowStreamCountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamCountRequest.class, ShowStreamCountResponse.class)
                .withName("ShowStreamCount")
                .withUri("/v2/{project_id}/stats/stream-count")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ShowStreamCountRequest::getPublishDomains, (req, v) -> {
                req.setPublishDomains(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamCountRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamCountRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ShowStreamCountResponse::getXRequestId,
                ShowStreamCountResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamPortraitRequest, ShowStreamPortraitResponse> showStreamPortrait = genForshowStreamPortrait();

    private static HttpRequestDef<ShowStreamPortraitRequest, ShowStreamPortraitResponse> genForshowStreamPortrait() {
        // basic
        HttpRequestDef.Builder<ShowStreamPortraitRequest, ShowStreamPortraitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamPortraitRequest.class, ShowStreamPortraitResponse.class)
                .withName("ShowStreamPortrait")
                .withUri("/v2/{project_id}/stats/stream-portraits")
                .withContentType("application/json");

        // requests
        builder.withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowStreamPortraitRequest::getPlayDomain, (req, v) -> {
                req.setPlayDomain(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamPortraitRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowStreamPortraitRequest::getTime, (req, v) -> {
                req.setTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ShowStreamPortraitResponse::getXRequestId,
                ShowStreamPortraitResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ShowUpBandwidthRequest, ShowUpBandwidthResponse> showUpBandwidth = genForshowUpBandwidth();

    private static HttpRequestDef<ShowUpBandwidthRequest, ShowUpBandwidthResponse> genForshowUpBandwidth() {
        // basic
        HttpRequestDef.Builder<ShowUpBandwidthRequest, ShowUpBandwidthResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUpBandwidthRequest.class, ShowUpBandwidthResponse.class)
                .withName("ShowUpBandwidth")
                .withUri("/v2/{project_id}/stats/up-bandwidth/detail")
                .withContentType("application/json");

        // requests
        builder.withRequestField("publish_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getPublishDomains, (req, v) -> {
                req.setPublishDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ShowUpBandwidthRequest.IntervalEnum.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ShowUpBandwidthResponse::getXRequestId,
                ShowUpBandwidthResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> listSingleStreamBitrate = genForlistSingleStreamBitrate();

    private static HttpRequestDef<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> genForlistSingleStreamBitrate() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamBitrateRequest, ListSingleStreamBitrateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSingleStreamBitrateRequest.class, ListSingleStreamBitrateResponse.class)
                .withName("ListSingleStreamBitrate")
                .withUri("/v2/{project_id}/stats/stream/bitrate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListSingleStreamBitrateResponse::getXRequestId,
                ListSingleStreamBitrateResponse::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> listSingleStreamFramerate = genForlistSingleStreamFramerate();

    private static HttpRequestDef<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> genForlistSingleStreamFramerate() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamFramerateRequest, ListSingleStreamFramerateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSingleStreamFramerateRequest.class, ListSingleStreamFramerateResponse.class)
                .withName("ListSingleStreamFramerate")
                .withUri("/v2/{project_id}/stats/stream/framerate")
                .withContentType("application/json");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            })
        );

        // response

        builder.withResponseField(
            "X-request-id",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(
                ListSingleStreamFramerateResponse::getXRequestId,
                ListSingleStreamFramerateResponse::setXRequestId)
        );
        return builder.build();
    }

}

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
public class LiveAPIMeta {

    public static final HttpRequestDef<ListBandwidthDetailV2Request, ListBandwidthDetailV2Response> listBandwidthDetailV2 = genForlistBandwidthDetailV2();

    private static HttpRequestDef<ListBandwidthDetailV2Request, ListBandwidthDetailV2Response> genForlistBandwidthDetailV2() {
        // basic
        HttpRequestDef.Builder<ListBandwidthDetailV2Request, ListBandwidthDetailV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBandwidthDetailV2Request.class, ListBandwidthDetailV2Response.class)
                .withUri("/v2/{project_id}/stats/bandwidth/detail");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListBandwidthDetailV2Request.IntervalEnum.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListBandwidthDetailV2Request::getEndTime, (req, v) -> {
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
                ListBandwidthDetailV2Response::getXRequestId,
                ListBandwidthDetailV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainBandwidthSummaryV2Request, ListDomainBandwidthSummaryV2Response> listDomainBandwidthSummaryV2 = genForlistDomainBandwidthSummaryV2();

    private static HttpRequestDef<ListDomainBandwidthSummaryV2Request, ListDomainBandwidthSummaryV2Response> genForlistDomainBandwidthSummaryV2() {
        // basic
        HttpRequestDef.Builder<ListDomainBandwidthSummaryV2Request, ListDomainBandwidthSummaryV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainBandwidthSummaryV2Request.class, ListDomainBandwidthSummaryV2Response.class)
                .withUri("/v2/{project_id}/stats/bandwidth/peak");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainBandwidthSummaryV2Request::getEndTime, (req, v) -> {
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
                ListDomainBandwidthSummaryV2Response::getXRequestId,
                ListDomainBandwidthSummaryV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTrafficDetailV2Request, ListDomainTrafficDetailV2Response> listDomainTrafficDetailV2 = genForlistDomainTrafficDetailV2();

    private static HttpRequestDef<ListDomainTrafficDetailV2Request, ListDomainTrafficDetailV2Response> genForlistDomainTrafficDetailV2() {
        // basic
        HttpRequestDef.Builder<ListDomainTrafficDetailV2Request, ListDomainTrafficDetailV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainTrafficDetailV2Request.class, ListDomainTrafficDetailV2Response.class)
                .withUri("/v2/{project_id}/stats/traffic/detail");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficDetailV2Request::getEndTime, (req, v) -> {
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
                ListDomainTrafficDetailV2Response::getXRequestId,
                ListDomainTrafficDetailV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListDomainTrafficSummaryV2Request, ListDomainTrafficSummaryV2Response> listDomainTrafficSummaryV2 = genForlistDomainTrafficSummaryV2();

    private static HttpRequestDef<ListDomainTrafficSummaryV2Request, ListDomainTrafficSummaryV2Response> genForlistDomainTrafficSummaryV2() {
        // basic
        HttpRequestDef.Builder<ListDomainTrafficSummaryV2Request, ListDomainTrafficSummaryV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainTrafficSummaryV2Request.class, ListDomainTrafficSummaryV2Response.class)
                .withUri("/v2/{project_id}/stats/traffic/summary");

        // requests
        builder.withRequestField("play_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getPlayDomains, (req, v) -> {
                req.setPlayDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListDomainTrafficSummaryV2Request::getEndTime, (req, v) -> {
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
                ListDomainTrafficSummaryV2Response::getXRequestId,
                ListDomainTrafficSummaryV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListHistoryStreamsV2Request, ListHistoryStreamsV2Response> listHistoryStreamsV2 = genForlistHistoryStreamsV2();

    private static HttpRequestDef<ListHistoryStreamsV2Request, ListHistoryStreamsV2Response> genForlistHistoryStreamsV2() {
        // basic
        HttpRequestDef.Builder<ListHistoryStreamsV2Request, ListHistoryStreamsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHistoryStreamsV2Request.class, ListHistoryStreamsV2Response.class)
                .withUri("/v2/{project_id}/stats/history/streams");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListHistoryStreamsV2Request::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHistoryStreamsV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryStreamsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHistoryStreamsV2Request::getLimit, (req, v) -> {
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
                ListHistoryStreamsV2Response::getXRequestId,
                ListHistoryStreamsV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> listQueryHttpCode = genForlistQueryHttpCode();

    private static HttpRequestDef<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> genForlistQueryHttpCode() {
        // basic
        HttpRequestDef.Builder<ListQueryHttpCodeRequest, ListQueryHttpCodeResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListQueryHttpCodeRequest.class, ListQueryHttpCodeResponse.class)
                .withUri("/v2/{project_id}/stats/httpcodes");

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

    public static final HttpRequestDef<ListRecordDataV2Request, ListRecordDataV2Response> listRecordDataV2 = genForlistRecordDataV2();

    private static HttpRequestDef<ListRecordDataV2Request, ListRecordDataV2Response> genForlistRecordDataV2() {
        // basic
        HttpRequestDef.Builder<ListRecordDataV2Request, ListRecordDataV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordDataV2Request.class, ListRecordDataV2Response.class)
                .withUri("/v2/{project_id}/stats/record");

        // requests
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordDataV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListRecordDataV2Request::getEndTime, (req, v) -> {
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
                ListRecordDataV2Response::getXRequestId,
                ListRecordDataV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamBitrateV2Request, ListSingleStreamBitrateV2Response> listSingleStreamBitrateV2 = genForlistSingleStreamBitrateV2();

    private static HttpRequestDef<ListSingleStreamBitrateV2Request, ListSingleStreamBitrateV2Response> genForlistSingleStreamBitrateV2() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamBitrateV2Request, ListSingleStreamBitrateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSingleStreamBitrateV2Request.class, ListSingleStreamBitrateV2Response.class)
                .withUri("/v2/{project_id}/stats/stream/bitrate");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateV2Request::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamBitrateV2Request::getEndTime, (req, v) -> {
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
                ListSingleStreamBitrateV2Response::getXRequestId,
                ListSingleStreamBitrateV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListSingleStreamFramerateV2Request, ListSingleStreamFramerateV2Response> listSingleStreamFramerateV2 = genForlistSingleStreamFramerateV2();

    private static HttpRequestDef<ListSingleStreamFramerateV2Request, ListSingleStreamFramerateV2Response> genForlistSingleStreamFramerateV2() {
        // basic
        HttpRequestDef.Builder<ListSingleStreamFramerateV2Request, ListSingleStreamFramerateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSingleStreamFramerateV2Request.class, ListSingleStreamFramerateV2Response.class)
                .withUri("/v2/{project_id}/stats/stream/framerate");

        // requests
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateV2Request::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSingleStreamFramerateV2Request::getEndTime, (req, v) -> {
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
                ListSingleStreamFramerateV2Response::getXRequestId,
                ListSingleStreamFramerateV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListSnapshotDataV2Request, ListSnapshotDataV2Response> listSnapshotDataV2 = genForlistSnapshotDataV2();

    private static HttpRequestDef<ListSnapshotDataV2Request, ListSnapshotDataV2Response> genForlistSnapshotDataV2() {
        // basic
        HttpRequestDef.Builder<ListSnapshotDataV2Request, ListSnapshotDataV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSnapshotDataV2Request.class, ListSnapshotDataV2Response.class)
                .withUri("/v2/{project_id}/stats/snapshot");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataV2Request::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListSnapshotDataV2Request::getEndTime, (req, v) -> {
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
                ListSnapshotDataV2Response::getXRequestId,
                ListSnapshotDataV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListTranscodeDataV2Request, ListTranscodeDataV2Response> listTranscodeDataV2 = genForlistTranscodeDataV2();

    private static HttpRequestDef<ListTranscodeDataV2Request, ListTranscodeDataV2Response> genForlistTranscodeDataV2() {
        // basic
        HttpRequestDef.Builder<ListTranscodeDataV2Request, ListTranscodeDataV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTranscodeDataV2Request.class, ListTranscodeDataV2Response.class)
                .withUri("/v2/{project_id}/stats/transcode");

        // requests
        builder.withRequestField("publish_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataV2Request::getPublishDomain, (req, v) -> {
                req.setPublishDomain(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListTranscodeDataV2Request::getEndTime, (req, v) -> {
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
                ListTranscodeDataV2Response::getXRequestId,
                ListTranscodeDataV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ListUsersOfStreamV2Request, ListUsersOfStreamV2Response> listUsersOfStreamV2 = genForlistUsersOfStreamV2();

    private static HttpRequestDef<ListUsersOfStreamV2Request, ListUsersOfStreamV2Response> genForlistUsersOfStreamV2() {
        // basic
        HttpRequestDef.Builder<ListUsersOfStreamV2Request, ListUsersOfStreamV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersOfStreamV2Request.class, ListUsersOfStreamV2Response.class)
                .withUri("/v2/{project_id}/stats/user");

        // requests
        builder.withRequestField("play_domain",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getPlayDomain, (req, v) -> {
                req.setPlayDomain(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ListUsersOfStreamV2Request.IntervalEnum.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListUsersOfStreamV2Request::getEndTime, (req, v) -> {
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
                ListUsersOfStreamV2Response::getXRequestId,
                ListUsersOfStreamV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamCountV2Request, ShowStreamCountV2Response> showStreamCountV2 = genForshowStreamCountV2();

    private static HttpRequestDef<ShowStreamCountV2Request, ShowStreamCountV2Response> genForshowStreamCountV2() {
        // basic
        HttpRequestDef.Builder<ShowStreamCountV2Request, ShowStreamCountV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamCountV2Request.class, ShowStreamCountV2Response.class)
                .withUri("/v2/{project_id}/stats/stream-count");

        // requests
        builder.withRequestField("publish_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ShowStreamCountV2Request::getPublishDomains, (req, v) -> {
                req.setPublishDomains(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamCountV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowStreamCountV2Request::getEndTime, (req, v) -> {
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
                ShowStreamCountV2Response::getXRequestId,
                ShowStreamCountV2Response::setXRequestId)
        );
        return builder.build();
    }

    public static final HttpRequestDef<ShowStreamPortraitRequest, ShowStreamPortraitResponse> showStreamPortrait = genForshowStreamPortrait();

    private static HttpRequestDef<ShowStreamPortraitRequest, ShowStreamPortraitResponse> genForshowStreamPortrait() {
        // basic
        HttpRequestDef.Builder<ShowStreamPortraitRequest, ShowStreamPortraitResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowStreamPortraitRequest.class, ShowStreamPortraitResponse.class)
                .withUri("/v2/{project_id}/stats/stream-portraits");

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

    public static final HttpRequestDef<ShowUpBandwidthV2Request, ShowUpBandwidthV2Response> showUpBandwidthV2 = genForshowUpBandwidthV2();

    private static HttpRequestDef<ShowUpBandwidthV2Request, ShowUpBandwidthV2Response> genForshowUpBandwidthV2() {
        // basic
        HttpRequestDef.Builder<ShowUpBandwidthV2Request, ShowUpBandwidthV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUpBandwidthV2Request.class, ShowUpBandwidthV2Response.class)
                .withUri("/v2/{project_id}/stats/up-bandwidth/detail");

        // requests
        builder.withRequestField("publish_domains",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            List.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getPublishDomains, (req, v) -> {
                req.setPublishDomains(v);
            })
        );
        builder.withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getApp, (req, v) -> {
                req.setApp(v);
            })
        );
        builder.withRequestField("stream",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getStream, (req, v) -> {
                req.setStream(v);
            })
        );
        builder.withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getRegion, (req, v) -> {
                req.setRegion(v);
            })
        );
        builder.withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            List.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getIsp, (req, v) -> {
                req.setIsp(v);
            })
        );
        builder.withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            ShowUpBandwidthV2Request.IntervalEnum.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getInterval, (req, v) -> {
                req.setInterval(v);
            })
        );
        builder.withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getStartTime, (req, v) -> {
                req.setStartTime(v);
            })
        );
        builder.withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ShowUpBandwidthV2Request::getEndTime, (req, v) -> {
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
                ShowUpBandwidthV2Response::getXRequestId,
                ShowUpBandwidthV2Response::setXRequestId)
        );
        return builder.build();
    }

}

package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CdnMeta {

    public static final HttpRequestDef<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStats =
        genForshowDomainLocationStats();

    private static HttpRequestDef<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> genForshowDomainLocationStats() {
        // basic
        HttpRequestDef.Builder<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainLocationStatsRequest.class, ShowDomainLocationStatsResponse.class)
            .withName("ShowDomainLocationStats")
            .withUri("/v1.0/cdn/statistics/domain-location-stats")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getCountry, (req, v) -> {
                req.setCountry(v);
            }));
        builder.<String>withRequestField("province",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getProvince, (req, v) -> {
                req.setProvince(v);
            }));
        builder.<String>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            }));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainLocationStatsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStats =
        genForshowDomainStats();

    private static HttpRequestDef<ShowDomainStatsRequest, ShowDomainStatsResponse> genForshowDomainStats() {
        // basic
        HttpRequestDef.Builder<ShowDomainStatsRequest, ShowDomainStatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainStatsRequest.class, ShowDomainStatsResponse.class)
                .withName("ShowDomainStats")
                .withUri("/v1.0/cdn/statistics/domain-stats")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("group_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getGroupBy, (req, v) -> {
                req.setGroupBy(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainStatsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrl = genForshowTopUrl();

    private static HttpRequestDef<ShowTopUrlRequest, ShowTopUrlResponse> genForshowTopUrl() {
        // basic
        HttpRequestDef.Builder<ShowTopUrlRequest, ShowTopUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopUrlRequest.class, ShowTopUrlResponse.class)
                .withName("ShowTopUrl")
                .withUri("/v1.0/cdn/statistics/top-url")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

}

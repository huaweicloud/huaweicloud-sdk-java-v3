package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ModifyDomainConfigRequestBody;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesBody;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigResponse;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CdnMeta {

    public static final HttpRequestDef<BatchCopyDomainRequest, BatchCopyDomainResponse> batchCopyDomain =
        genForbatchCopyDomain();

    private static HttpRequestDef<BatchCopyDomainRequest, BatchCopyDomainResponse> genForbatchCopyDomain() {
        // basic
        HttpRequestDef.Builder<BatchCopyDomainRequest, BatchCopyDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCopyDomainRequest.class, BatchCopyDomainResponse.class)
                .withName("BatchCopyDomain")
                .withUri("/v1.0/cdn/configuration/domains/batch-copy")
                .withContentType("application/json");

        // requests
        builder.<BatchCopyDRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCopyDRequestBody.class),
            f -> f.withMarshaller(BatchCopyDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcel =
        genFordownloadRegionCarrierExcel();

    private static HttpRequestDef<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> genFordownloadRegionCarrierExcel() {
        // basic
        HttpRequestDef.Builder<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DownloadRegionCarrierExcelRequest.class,
                    DownloadRegionCarrierExcelResponse.class)
                .withName("DownloadRegionCarrierExcel")
                .withUri("/v1.0/cdn/statistics/region-carrier-excel")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("country",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getCountry, (req, v) -> {
                req.setCountry(v);
            }));
        builder.<String>withRequestField("excel_language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getExcelLanguage, (req, v) -> {
                req.setExcelLanguage(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("excel_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getExcelType, (req, v) -> {
                req.setExcelType(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("carrier",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadRegionCarrierExcelRequest::getCarrier, (req, v) -> {
                req.setCarrier(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> downloadStatisticsExcel =
        genFordownloadStatisticsExcel();

    private static HttpRequestDef<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> genFordownloadStatisticsExcel() {
        // basic
        HttpRequestDef.Builder<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DownloadStatisticsExcelRequest.class, DownloadStatisticsExcelResponse.class)
            .withName("DownloadStatisticsExcel")
            .withUri("/v1.0/cdn/statistics/statistics-excel")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("excel_language",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getExcelLanguage, (req, v) -> {
                req.setExcelLanguage(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<Long>withRequestField("interval",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getInterval, (req, v) -> {
                req.setInterval(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("excel_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadStatisticsExcelRequest::getExcelType, (req, v) -> {
                req.setExcelType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDomainsRequest, ListDomainsResponse> listDomains = genForlistDomains();

    private static HttpRequestDef<ListDomainsRequest, ListDomainsResponse> genForlistDomains() {
        // basic
        HttpRequestDef.Builder<ListDomainsRequest, ListDomainsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDomainsRequest.class, ListDomainsResponse.class)
                .withName("ListDomains")
                .withUri("/v1.0/cdn/domains")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getBusinessType, (req, v) -> {
                req.setBusinessType(v);
            }));
        builder.<String>withRequestField("domain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainStatus, (req, v) -> {
                req.setDomainStatus(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListDomainsRequest::getPageNumber, (req, v) -> {
                req.setPageNumber(v);
            }));
        builder.<Boolean>withRequestField("show_tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDomainsRequest::getShowTags, (req, v) -> {
                req.setShowTags(v);
            }));
        builder.<Boolean>withRequestField("exact_match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListDomainsRequest::getExactMatch, (req, v) -> {
                req.setExactMatch(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListDomainsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetChargeModesRequest, SetChargeModesResponse> setChargeModes =
        genForsetChargeModes();

    private static HttpRequestDef<SetChargeModesRequest, SetChargeModesResponse> genForsetChargeModes() {
        // basic
        HttpRequestDef.Builder<SetChargeModesRequest, SetChargeModesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetChargeModesRequest.class, SetChargeModesResponse.class)
                .withName("SetChargeModes")
                .withUri("/v1.0/cdn/charge/charge-modes")
                .withContentType("application/json");

        // requests
        builder.<SetChargeModesBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetChargeModesBody.class),
            f -> f.withMarshaller(SetChargeModesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> showBandwidthCalc =
        genForshowBandwidthCalc();

    private static HttpRequestDef<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> genForshowBandwidthCalc() {
        // basic
        HttpRequestDef.Builder<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBandwidthCalcRequest.class, ShowBandwidthCalcResponse.class)
                .withName("ShowBandwidthCalc")
                .withUri("/v1.0/cdn/statistics/bandwidth-calc")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("calc_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBandwidthCalcRequest::getCalcType, (req, v) -> {
                req.setCalcType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowChargeModesRequest, ShowChargeModesResponse> showChargeModes =
        genForshowChargeModes();

    private static HttpRequestDef<ShowChargeModesRequest, ShowChargeModesResponse> genForshowChargeModes() {
        // basic
        HttpRequestDef.Builder<ShowChargeModesRequest, ShowChargeModesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowChargeModesRequest.class, ShowChargeModesResponse.class)
                .withName("ShowChargeModes")
                .withUri("/v1.0/cdn/charge/charge-modes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("product_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChargeModesRequest::getProductType, (req, v) -> {
                req.setProductType(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChargeModesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowChargeModesRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> showDomainDetailByName =
        genForshowDomainDetailByName();

    private static HttpRequestDef<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> genForshowDomainDetailByName() {
        // basic
        HttpRequestDef.Builder<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainDetailByNameRequest.class, ShowDomainDetailByNameResponse.class)
            .withName("ShowDomainDetailByName")
            .withUri("/v1.0/cdn/configuration/domains/{domain_name}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailByNameRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailByNameRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfig =
        genForshowDomainFullConfig();

    private static HttpRequestDef<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> genForshowDomainFullConfig() {
        // basic
        HttpRequestDef.Builder<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainFullConfigRequest.class, ShowDomainFullConfigResponse.class)
            .withName("ShowDomainFullConfig")
            .withUri("/v1.1/cdn/configuration/domains/{domain_name}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("show_special_configs",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainFullConfigRequest::getShowSpecialConfigs, (req, v) -> {
                req.setShowSpecialConfigs(v);
            }));

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> showTopDomainNames =
        genForshowTopDomainNames();

    private static HttpRequestDef<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> genForshowTopDomainNames() {
        // basic
        HttpRequestDef.Builder<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTopDomainNamesRequest.class, ShowTopDomainNamesResponse.class)
                .withName("ShowTopDomainNames")
                .withUri("/v1/cdn/statistics/top-domain-names")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopDomainNamesRequest::getEnterpriseProjectId, (req, v) -> {
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

    public static final HttpRequestDef<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfig =
        genForupdateDomainFullConfig();

    private static HttpRequestDef<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> genForupdateDomainFullConfig() {
        // basic
        HttpRequestDef.Builder<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateDomainFullConfigRequest.class, UpdateDomainFullConfigResponse.class)
            .withName("UpdateDomainFullConfig")
            .withUri("/v1.1/cdn/configuration/domains/{domain_name}/configs")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<ModifyDomainConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ModifyDomainConfigRequestBody.class),
            f -> f.withMarshaller(UpdateDomainFullConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}

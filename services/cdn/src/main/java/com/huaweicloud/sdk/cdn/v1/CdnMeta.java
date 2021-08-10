package com.huaweicloud.sdk.cdn.v1;

import com.huaweicloud.sdk.cdn.v1.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CdnMeta {

    public static final HttpRequestDef<CreateDomainRequest, CreateDomainResponse> createDomain = genForcreateDomain();

    private static HttpRequestDef<CreateDomainRequest, CreateDomainResponse> genForcreateDomain() {
        // basic
        HttpRequestDef.Builder<CreateDomainRequest, CreateDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateDomainRequest.class, CreateDomainResponse.class)
                .withName("CreateDomain")
                .withUri("/v1.0/cdn/domains")
                .withContentType("application/json");

        // requests
        builder.<CreateDomainRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateDomainRequestBody.class),
            f -> f.withMarshaller(CreateDomainRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasks =
        genForcreatePreheatingTasks();

    private static HttpRequestDef<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> genForcreatePreheatingTasks() {
        // basic
        HttpRequestDef.Builder<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePreheatingTasksRequest.class, CreatePreheatingTasksResponse.class)
            .withName("CreatePreheatingTasks")
            .withUri("/v1.0/cdn/content/preheating-tasks")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePreheatingTasksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<PreheatingTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PreheatingTaskRequest.class),
            f -> f.withMarshaller(CreatePreheatingTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasks =
        genForcreateRefreshTasks();

    private static HttpRequestDef<CreateRefreshTasksRequest, CreateRefreshTasksResponse> genForcreateRefreshTasks() {
        // basic
        HttpRequestDef.Builder<CreateRefreshTasksRequest, CreateRefreshTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRefreshTasksRequest.class, CreateRefreshTasksResponse.class)
                .withName("CreateRefreshTasks")
                .withUri("/v1.0/cdn/content/refresh-tasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRefreshTasksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<RefreshTaskRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RefreshTaskRequest.class),
            f -> f.withMarshaller(CreateRefreshTasksRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> deleteDomain = genFordeleteDomain();

    private static HttpRequestDef<DeleteDomainRequest, DeleteDomainResponse> genFordeleteDomain() {
        // basic
        HttpRequestDef.Builder<DeleteDomainRequest, DeleteDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteDomainRequest.class, DeleteDomainResponse.class)
                .withName("DeleteDomain")
                .withUri("/v1.0/cdn/domains/{domain_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteDomainRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableDomainRequest, DisableDomainResponse> disableDomain =
        genFordisableDomain();

    private static HttpRequestDef<DisableDomainRequest, DisableDomainResponse> genFordisableDomain() {
        // basic
        HttpRequestDef.Builder<DisableDomainRequest, DisableDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, DisableDomainRequest.class, DisableDomainResponse.class)
                .withName("DisableDomain")
                .withUri("/v1.0/cdn/domains/{domain_id}/disable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDomainRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDomainRequest, EnableDomainResponse> enableDomain = genForenableDomain();

    private static HttpRequestDef<EnableDomainRequest, EnableDomainResponse> genForenableDomain() {
        // basic
        HttpRequestDef.Builder<EnableDomainRequest, EnableDomainResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, EnableDomainRequest.class, EnableDomainResponse.class)
                .withName("EnableDomain")
                .withUri("/v1.0/cdn/domains/{domain_id}/enable")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDomainRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDomainRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
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
        builder.<ListDomainsRequest.BusinessTypeEnum>withRequestField("business_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.BusinessTypeEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getBusinessType, (req, v) -> {
                req.setBusinessType(v);
            }));
        builder.<ListDomainsRequest.DomainStatusEnum>withRequestField("domain_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.DomainStatusEnum.class),
            f -> f.withMarshaller(ListDomainsRequest::getDomainStatus, (req, v) -> {
                req.setDomainStatus(v);
            }));
        builder.<ListDomainsRequest.ServiceAreaEnum>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListDomainsRequest.ServiceAreaEnum.class),
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

    public static final HttpRequestDef<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteList =
        genForshowBlackWhiteList();

    private static HttpRequestDef<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> genForshowBlackWhiteList() {
        // basic
        HttpRequestDef.Builder<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowBlackWhiteListRequest.class, ShowBlackWhiteListResponse.class)
                .withName("ShowBlackWhiteList")
                .withUri("/v1.0/cdn/domains/{domain_id}/ip-acl")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBlackWhiteListRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRules =
        genForshowCacheRules();

    private static HttpRequestDef<ShowCacheRulesRequest, ShowCacheRulesResponse> genForshowCacheRules() {
        // basic
        HttpRequestDef.Builder<ShowCacheRulesRequest, ShowCacheRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCacheRulesRequest.class, ShowCacheRulesResponse.class)
                .withName("ShowCacheRules")
                .withUri("/v1.0/cdn/domains/{domain_id}/cache")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCacheRulesRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCacheRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfo =
        genForshowCertificatesHttpsInfo();

    private static HttpRequestDef<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> genForshowCertificatesHttpsInfo() {
        // basic
        HttpRequestDef.Builder<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowCertificatesHttpsInfoRequest.class,
                    ShowCertificatesHttpsInfoResponse.class)
                .withName("ShowCertificatesHttpsInfo")
                .withUri("/v1.0/cdn/domains/https-certificate-info")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getPageNumber, (req, v) -> {
                req.setPageNumber(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("user_domain_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getUserDomainId, (req, v) -> {
                req.setUserDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificatesHttpsInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetail =
        genForshowDomainDetail();

    private static HttpRequestDef<ShowDomainDetailRequest, ShowDomainDetailResponse> genForshowDomainDetail() {
        // basic
        HttpRequestDef.Builder<ShowDomainDetailRequest, ShowDomainDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainDetailRequest.class, ShowDomainDetailResponse.class)
                .withName("ShowDomainDetail")
                .withUri("/v1.0/cdn/domains/{domain_id}/detail")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetailRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetails =
        genForshowDomainItemDetails();

    private static HttpRequestDef<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> genForshowDomainItemDetails() {
        // basic
        HttpRequestDef.Builder<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDomainItemDetailsRequest.class, ShowDomainItemDetailsResponse.class)
            .withName("ShowDomainItemDetails")
            .withUri("/v1.0/cdn/statistics/domain-item-details")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<ShowDomainItemDetailsRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDomainItemDetailsRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowDomainItemDetailsRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetails =
        genForshowDomainItemLocationDetails();

    private static HttpRequestDef<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> genForshowDomainItemLocationDetails() {
        // basic
        HttpRequestDef.Builder<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDomainItemLocationDetailsRequest.class,
                    ShowDomainItemLocationDetailsResponse.class)
                .withName("ShowDomainItemLocationDetails")
                .withUri("/v1.0/cdn/statistics/domain-item-location-details")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Long>withRequestField("start_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getStartTime, (req, v) -> {
                req.setStartTime(v);
            }));
        builder.<Long>withRequestField("end_time",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getEndTime, (req, v) -> {
                req.setEndTime(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<ShowDomainItemLocationDetailsRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDomainItemLocationDetailsRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getRegion, (req, v) -> {
                req.setRegion(v);
            }));
        builder.<String>withRequestField("isp",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainItemLocationDetailsRequest::getIsp, (req, v) -> {
                req.setIsp(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetails =
        genForshowHistoryTaskDetails();

    private static HttpRequestDef<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> genForshowHistoryTaskDetails() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowHistoryTaskDetailsRequest.class, ShowHistoryTaskDetailsResponse.class)
            .withName("ShowHistoryTaskDetails")
            .withUri("/v1.0/cdn/historytasks/{history_tasks_id}/detail")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("history_tasks_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getHistoryTasksId, (req, v) -> {
                req.setHistoryTasksId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getPageNumber, (req, v) -> {
                req.setPageNumber(v);
            }));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTaskDetailsRequest::getUrl, (req, v) -> {
                req.setUrl(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasks =
        genForshowHistoryTasks();

    private static HttpRequestDef<ShowHistoryTasksRequest, ShowHistoryTasksResponse> genForshowHistoryTasks() {
        // basic
        HttpRequestDef.Builder<ShowHistoryTasksRequest, ShowHistoryTasksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHistoryTasksRequest.class, ShowHistoryTasksResponse.class)
                .withName("ShowHistoryTasks")
                .withUri("/v1.0/cdn/historytasks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getPageNumber, (req, v) -> {
                req.setPageNumber(v);
            }));
        builder.<ShowHistoryTasksRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.StatusEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<Long>withRequestField("start_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getStartDate, (req, v) -> {
                req.setStartDate(v);
            }));
        builder.<Long>withRequestField("end_date",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getEndDate, (req, v) -> {
                req.setEndDate(v);
            }));
        builder.<String>withRequestField("order_field",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getOrderField, (req, v) -> {
                req.setOrderField(v);
            }));
        builder.<String>withRequestField("order_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getOrderType, (req, v) -> {
                req.setOrderType(v);
            }));
        builder.<ShowHistoryTasksRequest.FileTypeEnum>withRequestField("file_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowHistoryTasksRequest.FileTypeEnum.class),
            f -> f.withMarshaller(ShowHistoryTasksRequest::getFileType, (req, v) -> {
                req.setFileType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfo = genForshowHttpInfo();

    private static HttpRequestDef<ShowHttpInfoRequest, ShowHttpInfoResponse> genForshowHttpInfo() {
        // basic
        HttpRequestDef.Builder<ShowHttpInfoRequest, ShowHttpInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttpInfoRequest.class, ShowHttpInfoResponse.class)
                .withName("ShowHttpInfo")
                .withUri("/v1.0/cdn/domains/{domain_id}/https-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpInfoRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttpInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfo = genForshowIpInfo();

    private static HttpRequestDef<ShowIpInfoRequest, ShowIpInfoResponse> genForshowIpInfo() {
        // basic
        HttpRequestDef.Builder<ShowIpInfoRequest, ShowIpInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowIpInfoRequest.class, ShowIpInfoResponse.class)
                .withName("ShowIpInfo")
                .withUri("/v1.0/cdn/ip-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("ips",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowIpInfoRequest::getIps, (req, v) -> {
                req.setIps(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLogsRequest, ShowLogsResponse> showLogs = genForshowLogs();

    private static HttpRequestDef<ShowLogsRequest, ShowLogsResponse> genForshowLogs() {
        // basic
        HttpRequestDef.Builder<ShowLogsRequest, ShowLogsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLogsRequest.class, ShowLogsResponse.class)
                .withName("ShowLogs")
                .withUri("/v1.0/cdn/logs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<Long>withRequestField("query_date",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ShowLogsRequest::getQueryDate, (req, v) -> {
                req.setQueryDate(v);
            }));
        builder.<Integer>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogsRequest::getPageSize, (req, v) -> {
                req.setPageSize(v);
            }));
        builder.<Integer>withRequestField("page_number",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowLogsRequest::getPageNumber, (req, v) -> {
                req.setPageNumber(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLogsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHost =
        genForshowOriginHost();

    private static HttpRequestDef<ShowOriginHostRequest, ShowOriginHostResponse> genForshowOriginHost() {
        // basic
        HttpRequestDef.Builder<ShowOriginHostRequest, ShowOriginHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOriginHostRequest.class, ShowOriginHostResponse.class)
                .withName("ShowOriginHost")
                .withUri("/v1.0/cdn/domains/{domain_id}/originhost")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOriginHostRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOriginHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForshowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForshowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v1.0/cdn/quota")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowReferRequest, ShowReferResponse> showRefer = genForshowRefer();

    private static HttpRequestDef<ShowReferRequest, ShowReferResponse> genForshowRefer() {
        // basic
        HttpRequestDef.Builder<ShowReferRequest, ShowReferResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowReferRequest.class, ShowReferResponse.class)
                .withName("ShowRefer")
                .withUri("/v1.0/cdn/domains/{domain_id}/referer")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReferRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowReferRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeader =
        genForshowResponseHeader();

    private static HttpRequestDef<ShowResponseHeaderRequest, ShowResponseHeaderResponse> genForshowResponseHeader() {
        // basic
        HttpRequestDef.Builder<ShowResponseHeaderRequest, ShowResponseHeaderResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResponseHeaderRequest.class, ShowResponseHeaderResponse.class)
                .withName("ShowResponseHeader")
                .withUri("/v1.0/cdn/domains/{domain_id}/response-header")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResponseHeaderRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResponseHeaderRequest::getEnterpriseProjectId, (req, v) -> {
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
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
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
        builder.<ShowTopUrlRequest.ServiceAreaEnum>withRequestField("service_area",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ShowTopUrlRequest.ServiceAreaEnum.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getServiceArea, (req, v) -> {
                req.setServiceArea(v);
            }));
        builder.<ShowTopUrlRequest.StatTypeEnum>withRequestField("stat_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowTopUrlRequest.StatTypeEnum.class),
            f -> f.withMarshaller(ShowTopUrlRequest::getStatType, (req, v) -> {
                req.setStatType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteList =
        genForupdateBlackWhiteList();

    private static HttpRequestDef<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> genForupdateBlackWhiteList() {
        // basic
        HttpRequestDef.Builder<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateBlackWhiteListRequest.class, UpdateBlackWhiteListResponse.class)
            .withName("UpdateBlackWhiteList")
            .withUri("/v1.0/cdn/domains/{domain_id}/ip-acl")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<BlackWhiteListBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BlackWhiteListBody.class),
            f -> f.withMarshaller(UpdateBlackWhiteListRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRules =
        genForupdateCacheRules();

    private static HttpRequestDef<UpdateCacheRulesRequest, UpdateCacheRulesResponse> genForupdateCacheRules() {
        // basic
        HttpRequestDef.Builder<UpdateCacheRulesRequest, UpdateCacheRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCacheRulesRequest.class, UpdateCacheRulesResponse.class)
                .withName("UpdateCacheRules")
                .withUri("/v1.0/cdn/domains/{domain_id}/cache")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCacheRulesRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCacheRulesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<CacheConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CacheConfigRequestBody.class),
            f -> f.withMarshaller(UpdateCacheRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificates =
        genForupdateDomainMultiCertificates();

    private static HttpRequestDef<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> genForupdateDomainMultiCertificates() {
        // basic
        HttpRequestDef.Builder<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateDomainMultiCertificatesRequest.class,
                    UpdateDomainMultiCertificatesResponse.class)
                .withName("UpdateDomainMultiCertificates")
                .withUri("/v1.0/cdn/domains/config-https-info")
                .withContentType("application/json");

        // requests
        builder.<UpdateDomainMultiCertificatesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateDomainMultiCertificatesRequestBody.class),
            f -> f.withMarshaller(UpdateDomainMultiCertificatesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOrigin =
        genForupdateDomainOrigin();

    private static HttpRequestDef<UpdateDomainOriginRequest, UpdateDomainOriginResponse> genForupdateDomainOrigin() {
        // basic
        HttpRequestDef.Builder<UpdateDomainOriginRequest, UpdateDomainOriginResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainOriginRequest.class, UpdateDomainOriginResponse.class)
                .withName("UpdateDomainOrigin")
                .withUri("/v1.0/cdn/domains/{domain_id}/origin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainOriginRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainOriginRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<OriginRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OriginRequest.class),
            f -> f.withMarshaller(UpdateDomainOriginRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302Switch =
        genForupdateFollow302Switch();

    private static HttpRequestDef<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> genForupdateFollow302Switch() {
        // basic
        HttpRequestDef.Builder<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateFollow302SwitchRequest.class, UpdateFollow302SwitchResponse.class)
            .withName("UpdateFollow302Switch")
            .withUri("/v1.0/cdn/domains/{domain_id}/follow302-switch")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFollow302SwitchRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<Follow302StatusRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Follow302StatusRequest.class),
            f -> f.withMarshaller(UpdateFollow302SwitchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfo =
        genForupdateHttpsInfo();

    private static HttpRequestDef<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> genForupdateHttpsInfo() {
        // basic
        HttpRequestDef.Builder<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHttpsInfoRequest.class, UpdateHttpsInfoResponse.class)
                .withName("UpdateHttpsInfo")
                .withUri("/v1.0/cdn/domains/{domain_id}/https-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpsInfoRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHttpsInfoRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<HttpInfoRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HttpInfoRequest.class),
            f -> f.withMarshaller(UpdateHttpsInfoRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHost =
        genForupdateOriginHost();

    private static HttpRequestDef<UpdateOriginHostRequest, UpdateOriginHostResponse> genForupdateOriginHost() {
        // basic
        HttpRequestDef.Builder<UpdateOriginHostRequest, UpdateOriginHostResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateOriginHostRequest.class, UpdateOriginHostResponse.class)
                .withName("UpdateOriginHost")
                .withUri("/v1.0/cdn/domains/{domain_id}/originhost")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOriginHostRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateOriginHostRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<OriginHostRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OriginHostRequest.class),
            f -> f.withMarshaller(UpdateOriginHostRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccess =
        genForupdatePrivateBucketAccess();

    private static HttpRequestDef<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> genForupdatePrivateBucketAccess() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdatePrivateBucketAccessRequest.class,
                    UpdatePrivateBucketAccessResponse.class)
                .withName("UpdatePrivateBucketAccess")
                .withUri("/v1.0/cdn/domains/{domain_id}/private-bucket-access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UpdatePrivateBucketAccessBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePrivateBucketAccessBody.class),
            f -> f.withMarshaller(UpdatePrivateBucketAccessRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitch =
        genForupdateRangeSwitch();

    private static HttpRequestDef<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> genForupdateRangeSwitch() {
        // basic
        HttpRequestDef.Builder<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRangeSwitchRequest.class, UpdateRangeSwitchResponse.class)
                .withName("UpdateRangeSwitch")
                .withUri("/v1.0/cdn/domains/{domain_id}/range-switch")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRangeSwitchRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<RangeStatusRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RangeStatusRequest.class),
            f -> f.withMarshaller(UpdateRangeSwitchRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateReferRequest, UpdateReferResponse> updateRefer = genForupdateRefer();

    private static HttpRequestDef<UpdateReferRequest, UpdateReferResponse> genForupdateRefer() {
        // basic
        HttpRequestDef.Builder<UpdateReferRequest, UpdateReferResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateReferRequest.class, UpdateReferResponse.class)
                .withName("UpdateRefer")
                .withUri("/v1.0/cdn/domains/{domain_id}/referer")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReferRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateReferRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<RefererBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RefererBody.class),
            f -> f.withMarshaller(UpdateReferRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeader =
        genForupdateResponseHeader();

    private static HttpRequestDef<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> genForupdateResponseHeader() {
        // basic
        HttpRequestDef.Builder<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateResponseHeaderRequest.class, UpdateResponseHeaderResponse.class)
            .withName("UpdateResponseHeader")
            .withUri("/v1.0/cdn/domains/{domain_id}/response-header")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResponseHeaderRequest::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResponseHeaderRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<HeaderBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(HeaderBody.class),
            f -> f.withMarshaller(UpdateResponseHeaderRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
